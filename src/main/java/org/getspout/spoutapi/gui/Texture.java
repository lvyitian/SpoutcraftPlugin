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

/**
 * This allow an image to be downloaded and shown to the user.
 * <p/>
 * Images must be in either png or jpg format. You may pre-cache images using
 * the FileManager, so only the filename is required afterwards.
 */
public interface Texture extends Widget {
	/**
	 * Gets the url of this texture to render
	 * @return url
	 */
	public String getUrl();

	/**
	 * Sets the url of this texture to render
	 * All textures must be of png or jpg type and a size that is a factor of
	 * 2 (e.g 64x128). Use the alpha channel for hiding empty space.
	 * @param url to set this texture to
	 * @return texture
	 */
	public Texture setUrl(String url);

	/**
	 * Gets if the texture draws the full alpha channel instead of just using a bit-mask.
	 * @return if it's drawing the alpha channel
	 */
	public boolean isDrawingAlphaChannel();

	/**
	 * Sets if the texture should draw the full alpha channel instead of just using a bit-mask.
	 * @param draw to set the drawing state
	 * @return texture
	 */
	public Texture setDrawAlphaChannel(boolean draw);

	/**
	 * Set the offset to the top of the image.
	 * Setting this to a anything other than -1 will draw a 1:1 slice of the
	 * texture rather than scaling it to fit the width and height.
	 * @param top the top offset
	 * @return texture
	 */
	public Texture setTop(int top);

	/**
	 * Get the offset to the top of the image.
	 * @return top offset
	 */
	public int getTop();

	/**
	 * Set the offset to the left of the image.
	 * Setting this to a anything other than -1 will draw a 1:1 slice of the
	 * texture rather than scaling it to fit the width and height.
	 * @param left the left offset
	 * @return texture
	 */
	public Texture setLeft(int left);

	/**
	 * Get the offset to the left of the image.
	 * @return left offset
	 */
	public int getLeft();
}
