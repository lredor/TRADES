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
package dsm.TRADES;

public class SemanticUtil {

	public static <T extends Control> T addControl(AbstractControlOwner cmp, T control, boolean internal) {

		ControlOwner owner = cmp.getControlOwner();
		if (owner == null) {
			owner = TRADESFactory.eINSTANCE.createControlOwner();
			cmp.setControlOwner(owner);
		}
		if (internal) {
			owner.getInternals().add(control);
		} else {
			owner.getExternals().add(control);
		}

		return control;
	}

	public static Analysis createInitialModel(String rootObjectName) {
		Analysis analysis = TRADESFactory.eINSTANCE.createAnalysis();
		analysis.setName(rootObjectName);

		ScoreSystem scoreSystem = TRADESFactory.eINSTANCE.createScoreSystem();
		analysis.setScoreSystem(scoreSystem);

		ThreatsOwner threatOwner = TRADESFactory.eINSTANCE.createThreatsOwner();
		analysis.setThreatOwner(threatOwner);

		createControlOwner(analysis);

		createDataOwner(analysis);

		createDifficulty("Low", 1, scoreSystem);
		createDifficulty("Medium", 2, scoreSystem);
		createDifficulty("High", 3, scoreSystem);

		createImpact("Low", 1, scoreSystem);
		createImpact("Medium", 2, scoreSystem);
		createImpact("High", 3, scoreSystem);

		return analysis;
	}

	public static void createDataOwner(Analysis analysis) {
		DataOwner dataOwner = TRADESFactory.eINSTANCE.createDataOwner();
		analysis.setDataOwner(dataOwner);
	}

	public static void createControlOwner(AbstractControlOwner analysis) {
		ControlOwner controlOwner = TRADESFactory.eINSTANCE.createControlOwner();
		analysis.setControlOwner(controlOwner);

	}

	private static void createDifficulty(String name, int score, ScoreSystem system) {
		DifficultyScore diff = TRADESFactory.eINSTANCE.createDifficultyScore();
		system.getDifficultyScores().add(diff);
		diff.setName(name);
		diff.setDifficulty(score);

	}

	private static void createImpact(String name, int score, ScoreSystem system) {
		ImpactScore impact = TRADESFactory.eINSTANCE.createImpactScore();
		system.getImpactScores().add(impact);
		impact.setName(name);
		impact.setImpact(score);
		for (DifficultyScore dif : system.getDifficultyScores()) {
			ImpactConfiguration conf = TRADESFactory.eINSTANCE.createImpactConfiguration();
			impact.getConfigurations().add(conf);
			conf.setDifficulty(dif);
		}
	}

}
