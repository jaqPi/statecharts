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
package org.yakindu.sct.ui.editor.editor.figures;

import java.lang.reflect.Field;

import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseMotionListener;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;

/**
 * 
 * @author muelder
 * 
 */
public class TransitionFigure extends PolylineConnectionEx {

	private final IMapMode mapMode;
	private Boolean isSelected;
	
	public void setIsSelected(Boolean isSelected) {
		this.isSelected = isSelected;
	}

	protected static final int TOLERANCE = 4;

	public TransitionFigure(IMapMode mapMode) {
		this(mapMode, false);
		isSelected = false;
		this.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent me) {
			}

			@Override
			public void mouseEntered(MouseEvent me) {
				if (!isSelected) {
					setLineWidth(getMapMode().DPtoLP(2));
					me.consume();
				}
			}

			@Override
			public void mouseExited(MouseEvent me) {
				if (!isSelected) {
					setLineWidth(getMapMode().DPtoLP(1));
					me.consume();
				}
			}

			@Override
			public void mouseHover(MouseEvent me) {
					@SuppressWarnings("unused")
					String string = "String";
					string = "";
			}

			@Override
			public void mouseMoved(MouseEvent me) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}

	public TransitionFigure(IMapMode mapMode, boolean reversed) {
		this.mapMode = mapMode;
		setTolerance();
		setLineWidth(mapMode.DPtoLP(1));
		if (reversed)
			setSourceDecoration(createTargetDecoration());
		else
			setTargetDecoration(createTargetDecoration());
	}

	protected void setTolerance() {
		// Have to use reflection here, PolylineConnectionEx#calculateTolerance() is
		// private....
		try {
			Field declaredField = PolylineConnectionEx.class.getDeclaredField("TOLERANCE");
			declaredField.setAccessible(true);
			declaredField.set(null, TOLERANCE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected IMapMode getMapMode() {
		return mapMode;
	}

	private RotatableDecoration createTargetDecoration() {
		PolygonDecoration df = new PolygonDecoration();
		df.setFill(true);
		df.setLineWidth(getMapMode().DPtoLP(1));
		df.setTemplate(PolygonDecoration.TRIANGLE_TIP);
		return df;
	}
}
