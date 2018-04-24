/**
 * Copyright (c) 2013 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package org.yakindu.sct.ui.editor.proposals;

import java.util.List;

import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.KeyHandler;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.parts.DirectEditKeyHandler;
import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
@SuppressWarnings("restriction")
public class ContentProposalViewerKeyHandler extends KeyHandler {
	private GraphicalViewer viewer;

	private ContentProposalHandler proposalHandler;

	private ContentProposalAdapter adapter;

	protected static final KeyStroke keyStroke = KeyStroke.getInstance(SWT.CTRL, SWT.SPACE);

	public ContentProposalViewerKeyHandler(GraphicalViewer viewer) {
		this.viewer = viewer;
		//super();
		createProposalHandler();
		createContentAdpater();
	}
	
	/**
	 * @return the <code>GraphicalViewer</code> that is the receiving viewer of the direct edit
     * request.
	 */
	protected GraphicalViewer getViewer() {
		return viewer;
	}

	protected void createProposalHandler() {
		proposalHandler = new ContentProposalHandler(getViewer());
	}
	
	/**
	 * Tests to see if the key pressed was an letter or number
	 * @param event KeyEvent to be tested
	 * @return true if the key pressed is Alpha Numeric, otherwise false.
	 */
	protected boolean isAlphaNum(KeyEvent event) {

		final String allowedStartingCharacters = "`~!@#$%^&*()-_=+{}[]|;:',.<>?\""; //$NON-NLS-1$

		// IF the character is a letter or number or is contained
		// in the list of allowed starting characters ...
		if (Character.isLetterOrDigit(event.character)
			|| !(allowedStartingCharacters.indexOf(event.character) == -1)) {

			// And the character hasn't been modified or is only modified
			// with SHIFT
			if (event.stateMask == 0 || event.stateMask == SWT.SHIFT)
				return true;
		}

		return false;
	}

	protected void createContentAdpater() {
//		SemanticContentControlAdapter controlAdapter = new SemanticContentControlAdapter(proposalProvider, getViewer());
		adapter = new ContentProposalAdapter((Composite) getViewer().getControl(), proposalHandler.getProposalControlAdapter(), proposalHandler,
				keyStroke, null);
		adapter.setLabelProvider(proposalHandler.getProposalLabelProvider());
		adapter.setPropagateKeys(true);
		// TODO: If not set, the adapter uses the full width of the
		// GraphicalViewer as initial bounds
		adapter.setPopupSize(new Point(400, 150));
	}

	
	@Override
	public boolean keyPressed(KeyEvent e) {
		if (getCurrentSelection() == null || isAlphaNum(e))
			return super.keyPressed(e);
		if ((e.character == ' ') && ((e.stateMask & SWT.CTRL) != 0)) {
			// Do not execute super - the default ctrl key binding is a
			// deselection of the current selected element for whatever
			// reason
			return true;
		}
		
		return super.keyPressed(e);
	}

	@SuppressWarnings("unchecked")
	protected IGraphicalEditPart getCurrentSelection() {
		List<IGraphicalEditPart> selectedEditParts = getViewer().getSelectedEditParts();
		if (selectedEditParts.size() == 1) {
			IGraphicalEditPart editPart = (IGraphicalEditPart) selectedEditParts.get(0);
			return editPart;
		}
		return null;

	}
}
