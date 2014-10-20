package org.buildingsmart.IFC4_ADD1;
import org.buildingsmart.*;
import java.util.*;

/*
 * IFC Java class
/ *
 * The GNU Affero General Public License
 * 
 * Copyright (c) 2014 Jyrki Oraskari (original)
 * Copyright (c) 2014 Pieter Pauwels (modifications - pipauwel.pauwels@ugent.be / pipauwel@gmail.com)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

public class IfcRectangleHollowProfileDef extends IfcRectangleProfileDef 
{
	// The property attributes
	private IfcPositiveLengthMeasure WallThickness_of_IfcRectangleHollowProfileDef;
	private IfcNonNegativeLengthMeasure InnerFilletRadius;
	private IfcNonNegativeLengthMeasure OuterFilletRadius;


	// Getters and setters of properties
	public IfcPositiveLengthMeasure getWallThickness_of_IfcRectangleHollowProfileDef() {
		return WallThickness_of_IfcRectangleHollowProfileDef;
	}

	public void setWallThickness_of_IfcRectangleHollowProfileDef(IfcPositiveLengthMeasure value){
		this.WallThickness_of_IfcRectangleHollowProfileDef=value;
	}

	public IfcNonNegativeLengthMeasure getInnerFilletRadius() {
		return InnerFilletRadius;
	}

	public void setInnerFilletRadius(IfcNonNegativeLengthMeasure value){
		this.InnerFilletRadius=value;
	}

	public IfcNonNegativeLengthMeasure getOuterFilletRadius() {
		return OuterFilletRadius;
	}

	public void setOuterFilletRadius(IfcNonNegativeLengthMeasure value){
		this.OuterFilletRadius=value;
	}

}