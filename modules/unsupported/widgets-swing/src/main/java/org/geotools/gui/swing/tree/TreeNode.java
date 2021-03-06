/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 * 
 *    (C) 2001-2008, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package org.geotools.gui.swing.tree;


/**
 * Defines the requirements for an object that can be used as a tree node in a
 * {@link javax.swing.JTree}. This interface add the {@code getUserObject()} to
 * Swing's interface, which seems to have been forgotten in J2SE.
 *
 * @since 2.0
 * @source $URL$
 * @version $Id$
 * @author Martin Desruisseaux (IRD)
 */
public interface TreeNode extends javax.swing.tree.TreeNode {
    /**
     * Returns this node's user object.
     *
     * @return the Object stored at this node by the user
     */
    public abstract Object getUserObject();
}
