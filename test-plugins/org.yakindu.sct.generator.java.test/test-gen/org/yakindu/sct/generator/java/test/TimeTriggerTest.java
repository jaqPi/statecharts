/**
 * Copyright (c) 2013 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of YAKINDU - initial API and implementation
 */

package org.yakindu.sct.generator.java.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.yakindu.scr.timetrigger.TimeTriggerStatemachine;
import org.yakindu.scr.timetrigger.TimeTriggerStatemachine.State;
import org.yakindu.scr.TimerService;
/**
 *  Unit TestCase for TimeTrigger
 */
@SuppressWarnings("all")
public class TimeTriggerTest {

	private TimeTriggerStatemachine statemachine;

	@Before
	public void setUp() {
		statemachine = new TimeTriggerStatemachine();
		statemachine.setTimer(new TimerService());
		statemachine.init();
	}

	@After
	public void tearDown() {
		statemachine = null;
	}

	@Test
	public void testTestName() {
		assertTrue(true);
	}
}