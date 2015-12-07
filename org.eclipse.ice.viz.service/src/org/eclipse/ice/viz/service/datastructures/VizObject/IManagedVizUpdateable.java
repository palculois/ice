/*******************************************************************************
 * Copyright (c) 2011, 2014, 2015 UT-Battelle, LLC.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Robert Smith
 *******************************************************************************/
package org.eclipse.ice.viz.service.datastructures.VizObject;

/**
 * An extension of IVizUpdateable which allows the listener to subscribe for
 * updates only for specified kinds of events.
 * 
 * @author Robert Smith
 *
 */
public interface IManagedVizUpdateable {

	/**
	 * Register a listener to receive managed updates.
	 * 
	 * @param listener
	 *            The object which will receive future updates
	 * @param types
	 *            The list of event types that the listener is subscribed to
	 *            listen to
	 */
	public void register(IManagedVizUpdateableListener listener);

	/**
	 * Remove a registered listener.
	 * 
	 * @param listener
	 *            The object which will no longer receive notifications from
	 *            this
	 */
	public void unregister(IManagedVizUpdateableListener listener);
}
