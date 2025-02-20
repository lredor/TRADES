/******************************************************************************************************
* Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
* This program and the accompanying materials
* are made available under the terms of the Eclipse Public License 2.0
* which accompanies this distribution, and is available at
* https://www.eclipse.org/legal/epl-2.0/
* 
* SPDX-License-Identifier: EPL-2.0
* 
* Contributors:
*     ELTA Ltd - initial API and implementation
* 
*******************************************************************************************************/
package TRADES.design;

import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;

/**
 * Service that gather some debug services
 * 
 * @author Arthur Daussy
 *
 */
public class DebugService {

	/**
	 * Debug service use to print all variable available in the current context
	 * 
	 * @param context the context
	 * @return the context for chaining
	 */
	public EObject printAllVariable(EObject context) {

		Map<String, ?> variableMap = Session.of(context).get().getInterpreter().getVariables();
		for (Entry<String, ?> entry : variableMap.entrySet()) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
		System.out.println("-----");
		return context;
	}
}
