/**
 * Copyright (c) 2010 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package org.yakindu.sct.ui.editor.editparts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.editpolicies.TreeConnectionBendpointEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.internal.routers.ForestRouter;
import org.eclipse.gmf.runtime.draw2d.ui.internal.routers.OrthogonalRouter;
import org.eclipse.gmf.runtime.gef.ui.internal.editpolicies.LineMode;
import org.eclipse.gmf.runtime.gef.ui.internal.tools.SelectConnectionEditPartTracker;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.yakindu.sct.ui.editor.editor.figures.StateFigure;
import org.yakindu.sct.ui.editor.editor.figures.TransitionFigure;
import org.yakindu.sct.ui.editor.policies.InitialPointsConnectionBendpointEditPolicy;
import org.yakindu.sct.ui.editor.preferences.StatechartColorConstants;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
@SuppressWarnings("restriction")
public class TransitionEditPart extends ConnectionNodeEditPart {

	public TransitionEditPart(View view) {
		super(view);
	}

	@Override
	protected Connection createConnectionFigure() {
		return new TransitionFigure(getMapMode());
	}

	private TransitionFigure getPrimaryShape() {
		return (TransitionFigure) getFigure();
	}

	@Override
	public void installEditPolicy(Object key, EditPolicy editPolicy) {
		if (EditPolicy.CONNECTION_BENDPOINTS_ROLE.equals(key)) {
			if (getConnectionFigure().getConnectionRouter() instanceof ForestRouter) {
				super.installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE, new TreeConnectionBendpointEditPolicy());
			} else if (getConnectionFigure().getConnectionRouter() instanceof OrthogonalRouter) {
				super.installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE,
						new InitialPointsConnectionBendpointEditPolicy(LineMode.ORTHOGONAL_FREE));
			} else {
				super.installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE,
						new InitialPointsConnectionBendpointEditPolicy());
			}
		} else {
			super.installEditPolicy(key, editPolicy);
		}
	}

	@Override
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (childEditPart instanceof TransitionExpressionEditPart) {
			getPrimaryShape().add(((TransitionExpressionEditPart) childEditPart).getFigure());
		} else
			super.addChildVisual(childEditPart, index);
	}

	
	@Override
	protected void removeChildVisual(EditPart childEditPart) {
		if (childEditPart instanceof TransitionExpressionEditPart) {
			getPrimaryShape().remove(((TransitionExpressionEditPart) childEditPart).getFigure());
		}
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		if (NotationPackage.eINSTANCE.getFontStyle().getEAllAttributes().contains(notification.getFeature())) {
			refreshFont();
		} else {
			super.handleNotificationEvent(notification);
		}
	}
	
	@Override
	public TransitionFigure getFigure() {
		return (TransitionFigure) super.getFigure();
	}
	
	@Override
	public void setSelected(int value) {
		Connection figure = this.getConnectionFigure();

		switch (value) {
		case EditPart.SELECTED:
		case EditPart.SELECTED_PRIMARY:
			// highlight transition
			getFigure().setLineWidth(getMapMode().DPtoLP(2));
			getFigure().setForegroundColor(StatechartColorConstants.TRANSITION_SELECTED);
			
			addHighlightToConnectedState(figure.getSourceAnchor());
			addHighlightToConnectedState(figure.getTargetAnchor());
			break;
		default:
			// remove all highlights
			getFigure().setLineWidth(getMapMode().DPtoLP(1));
            getFigure().setForegroundColor(StatechartColorConstants.TRANSITION_DEFAULT);
			
			removeHighlightFromConnectedState(figure.getSourceAnchor());
			removeHighlightFromConnectedState(figure.getTargetAnchor());
			
		}

		super.setSelected(value);
	}
	
	

	@Override
	public DragTracker getDragTracker(Request req) {
		return new SelectConnectionEditPartTracker(this) {
			@Override
			protected boolean handleDoubleClick(int button) {
				DirectEditRequest req = new DirectEditRequest();
				req.setLocation(getCurrentInput().getMouseLocation());
				TransitionEditPart.this.performDirectEditRequest(req);
				return true;
			}
		};
	}
	
	/**
	 * Changes the foreground color of connected state to change its
	 * border color
	 * 
	 * @param anchor
	 */
	private void addHighlightToConnectedState(ConnectionAnchor anchor) {
		if(!anchor.getOwner().getChildren().isEmpty() &&
				anchor.getOwner().getChildren().get(0) instanceof StateFigure) {
			StateFigure state = (StateFigure) anchor.getOwner().getChildren().get(0);
			state.setForegroundColor(StatechartColorConstants.TRANSITION_SELECTED);
		}
	}
	
	/**
	 * Sets the foreground color of connected state to default value
	 * 
	 * @param anchor
	 */
	private void removeHighlightFromConnectedState(ConnectionAnchor anchor) {
		if(!anchor.getOwner().getChildren().isEmpty() &&
				anchor.getOwner().getChildren().get(0) instanceof StateFigure) {
			StateFigure state = (StateFigure) anchor.getOwner().getChildren().get(0);
			state.setForegroundColor(StatechartColorConstants.STATE_LINE_COLOR);
		}
	}

}
