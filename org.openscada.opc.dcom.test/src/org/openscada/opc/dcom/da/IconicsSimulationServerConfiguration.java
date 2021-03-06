/*
 * This file is part of the OpenSCADA project
 * Copyright (C) 2006-2009 TH4 SYSTEMS GmbH (http://th4-systems.com)
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package org.openscada.opc.dcom.da;


public class IconicsSimulationServerConfiguration implements TestConfiguration
{

    public String getCLSID ()
    {
        return "A879768A-7387-11D4-B0D8-009027242C59";
    }

    public String getProgId ()
    {
        return "ICONICS.SimulatorOPCDA.2";
    }

    public String[] getReadItems ()
    {
        return new String[] { "Logical._BOOL" };
    }

    public WriteTest[] getWriteItems ()
    {
        return new WriteTest[]{};
    }

}
