/*******************************************************************************
 * Copyright (c) 2013 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/

package org.fusesource.ide.deployment.tabs;

import org.fusesource.ide.deployment.handler.ProvisionMavenLaunchDelegate;
import org.fusesource.ide.launcher.ui.tabs.MavenLaunchMainTab;


public class DeployToMavenLaunchMainTab extends MavenLaunchMainTab {

	public DeployToMavenLaunchMainTab(boolean isBuilder) {
		super(isBuilder);
	}

	@Override
	protected String getDefaultGoals() {
		return ProvisionMavenLaunchDelegate.MAVEN_GOALS;
	}

}