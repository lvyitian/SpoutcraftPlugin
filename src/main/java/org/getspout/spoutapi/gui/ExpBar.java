/*
 * This file is part of SpoutcraftPlugin.
 *
 * Copyright (c) 2011 SpoutcraftDev <http://spoutcraft.org//>
 * SpoutcraftPlugin is licensed under the GNU Lesser General Public License.
 *
 * SpoutcraftPlugin is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SpoutcraftPlugin is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.getspout.spoutapi.gui;

import java.util.UUID;

public class ExpBar extends GenericWidget {
	public ExpBar() {
		super();
		setX(427 / 2 - 91); // 122
		setY(211);
		setWidth(getWidth()); // Don't know the default - ignored, but prevents warnings...
		setAnchor(WidgetAnchor.BOTTOM_CENTER);
	}

	@Override
	public UUID getId() {
		return new UUID(0, 6);
	}

	@Override
	public WidgetType getType() {
		return WidgetType.ExpBar;
	}

	@Override
	public int getVersion() {
		return super.getVersion() + 1;
	}
}
