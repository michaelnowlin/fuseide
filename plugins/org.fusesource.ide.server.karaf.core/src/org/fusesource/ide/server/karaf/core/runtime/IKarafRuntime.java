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

package org.fusesource.ide.server.karaf.core.runtime;


/**
 * @author lhein
 */
public interface IKarafRuntime {
	
	static final String[] KARAF_RUNTIME_TYPES_SUPPORTED = new String[] {
		 "org.fusesource.ide.karaf.runtime.20",
		 "org.fusesource.ide.karaf.runtime.21",
		 "org.fusesource.ide.karaf.runtime.22",
		 "org.fusesource.ide.karaf.runtime.23"
	};

	static final String INSTALL_DIR = "install-dir";
	static final String VERSION = "karaf-version";
	static final String PROPERTIES_FILE_LOC = "properties-file-loc";
	static final String RUNTIME_CHANGED = "runtime-changed";
	
	/**
	 * returns the installation folder of the Karaf installation
	 * 
	 * @return
	 */
	String getKarafInstallDir();
	
	/**
	 * returns the karaf properties file location
	 * 
	 * @return
	 */
	String getKarafPropertiesFileLocation();
	
	/**
	 * returns the karaf version
	 * 
	 * @return
	 */
	String getKarafVersion();
}
