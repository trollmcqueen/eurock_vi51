/* 
 * $Id$
 * 
 * Copyright (c) 2011-15 Stephane GALLAND <stephane.galland@utbm.fr>.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 * This program is free software; you can redistribute it and/or modify
 */
package fr.utbm.info.vi51.framework.gui;

import fr.utbm.info.vi51.framework.environment.WorldModelState;
import fr.utbm.info.vi51.framework.math.Point2f;


/**
 * State provider for the world model.  
 * 
 * @author St&eacute;phane GALLAND &lt;stephane.galland@utbm.fr&gt;
 * @version $Name$ $Revision$ $Date$
 */
public interface WorldModelStateProvider {

	/** Set the mouse target.
	 * 
	 * @param target
	 */
	public void setMouseTarget(Point2f target);

	/** Replies the width of the environment.
	 * 
	 * @return the width of the environment.
	 */
	public float getWidth();
	
	/** Replies the height of the environment.
	 * 
	 * @return the height of the environment.
	 */
	public float getHeight();
	
	/** Replies the state of the world model.
	 * 
	 * @return the state of the world model.
	 */
	public WorldModelState getState();

}