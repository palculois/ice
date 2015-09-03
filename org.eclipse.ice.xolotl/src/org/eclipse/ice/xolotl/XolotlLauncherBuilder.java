/*******************************************************************************
 * Copyright (c) 2011, 2014 UT-Battelle, LLC.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Initial API and implementation and/or initial documentation - Jay Jay Billings,
 *   Jordan H. Deyton, Dasha Gorin, Alexander J. McCaskey, Taylor Patterson,
 *   Claire Saunders, Matthew Wang, Anna Wojtowicz
 *******************************************************************************/
package org.eclipse.ice.xolotl;

import org.eclipse.core.resources.IProject;
import org.eclipse.ice.item.AbstractItemBuilder;
import org.eclipse.ice.item.Item;
import org.eclipse.ice.item.ItemType;

/**
 * The ItemBuilder that provides the XolotlLauncher to the framework.
 * @author Jay Jay Billings
 *
 */
public class XolotlLauncherBuilder extends AbstractItemBuilder {

	// The name
	public static final String name = "Xolotl Launcher";
	
	// The type
	public static final ItemType type = ItemType.Simulation;

	/**
	 * The Constructor
	 */
	public XolotlLauncherBuilder() {
		setName(name);
		setType(type);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ice.item.ItemBuilder#build(org.eclipse.core.resources.IProject)
	 */
	@Override
	public Item getInstance(IProject projectSpace) {

		XolotlLauncher launcher = new XolotlLauncher(projectSpace);
		return launcher;
	}

}