package org.yakindu.sct.ui.editor.policies;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.requests.DropRequest;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;
import org.yakindu.sct.ui.editor.preferences.StatechartColorConstants;

public class FeedbackTransitionCreateEditPolicy extends FeedbackGraphicalNodeEditPolicy {
	
	
	@Override
	public void showTargetConnectionFeedback(DropRequest request) {
		IFigure figure = getHostFigure();
		
		if(!(figure instanceof BorderedNodeFigure)) {
			figure.setBackgroundColor(ColorConstants.green);
		}
	}

	@Override
	protected void eraseTargetConnectionFeedback(DropRequest request) {
		IFigure figure = getHostFigure();
		if(!(figure instanceof BorderedNodeFigure)) {
			figure.setBackgroundColor(StatechartColorConstants.STATE_BG_COLOR);
		}
	}
}
