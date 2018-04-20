/**
 * Copyright (c) 2011 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package org.yakindu.sct.ui.editor.editor.figures.utils;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;

public final class MapModeUtils {

	private MapModeUtils() {
	}
	
	private static final double DEFAULT_ASPECT_RATIO = Math.sqrt(2);
	private static final float DEFAULT_REGION = 1.2f;
	
	private static final int DEFAULT_NODE_HEIGHT = 71;
	private static final int DEFAULT_NODE_WIDTH = (int) (DEFAULT_NODE_HEIGHT * DEFAULT_ASPECT_RATIO);
	
	// Default size for choices, entry, or exit nodes
	public static final Dimension DEFAULT_SMALL_NODE_DIMENSION = new Dimension(25, 25);
	
	/**
	 * Returns the default size for all non-region objects
	 * 
	 * @param mode
	 * @return 
	 */
	public static Dimension getDefaultSizeDimension(IMapMode mode) {
		return new Dimension(mode.DPtoLP(DEFAULT_NODE_WIDTH), mode.DPtoLP(DEFAULT_NODE_HEIGHT));
	}
	
	/**
	 * Returns the default size for regions. Size depends on nodes' default
	 * size but increased.
	 * 
	 * @param mode
	 * @return
	 */
	public static Dimension getDefaultRegionSizeDimension(IMapMode mode) {
		int regionHeight = (int) (DEFAULT_NODE_HEIGHT * DEFAULT_REGION);
		int regionWidth = (int) (regionHeight * DEFAULT_ASPECT_RATIO);
		
		return new Dimension(mode.DPtoLP(regionWidth), mode.DPtoLP(regionHeight));
	}

	
	public static Dimension getMappedDimensions(IMapMode mode, Dimension d) {
		return new Dimension(mode.DPtoLP(d.width), mode.DPtoLP(d.height));
	}
	
}

