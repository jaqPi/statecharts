/**
 *   Copyright (c) 2012 committers of YAKINDU and others.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *   Contributors:
 *   	Markus Muehlbrandt - Initial contribution and API
 */
package org.yakindu.sct.generator.kotlin

import com.google.inject.Inject
import org.eclipse.xtext.generator.IFileSystemAccess
import org.yakindu.sct.generator.core.IExecutionFlowGenerator
import org.yakindu.sct.model.sexec.ExecutionFlow
import org.yakindu.sct.model.sexec.naming.INamingService
import org.yakindu.sct.model.sgen.GeneratorEntry

/**
 * This is the Java code generators main class.
 * 
 * @author Markus Mühlbrandt
 * @author Axel Terfloth - extensions
 */
class JavaGenerator implements IExecutionFlowGenerator {

	@Inject extension GenmodelEntries

	@Inject extension Navigation
	@Inject extension IStatemachine
	@Inject extension ITimerCallback
	@Inject extension ITimer
	@Inject extension TimerService
	@Inject extension RuntimeService
	@Inject extension StatemachineInterface
	@Inject extension Statemachine
	@Inject INamingService namingService

	override generate(ExecutionFlow flow, GeneratorEntry entry, IFileSystemAccess fsa) {

		namingService.initializeNamingService(flow);

		flow.generateIStatemachine(entry, fsa)

		if (flow.timed) {
			flow.generateITimerCallback(entry, fsa)
			flow.generateITimer(entry, fsa)
			if (entry.createTimerService) {
				flow.generateTimerService(entry, fsa);
			}
		}

		if (entry.createRuntimeService) {
			flow.generateRuntimeService(entry, fsa)
		}

		flow.generateStatemachineInterface(entry, fsa)
		flow.generateStatemachine(entry, fsa)
	}
}