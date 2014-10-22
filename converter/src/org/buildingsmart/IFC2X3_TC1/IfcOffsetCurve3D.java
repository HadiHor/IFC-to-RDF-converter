package org.buildingsmart.IFC2X3_TC1;
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

public class IfcOffsetCurve3D extends IfcCurve 
{
	// The property attributes
	private IfcCurve BasisCurve_of_IfcOffsetCurve3D;
	private IfcLengthMeasure Distance_of_IfcOffsetCurve3D;
	private Boolean SelfIntersect_of_IfcOffsetCurve3D;
	private IfcDirection RefDirection_of_IfcOffsetCurve3D;


	// Getters and setters of properties
	public IfcCurve getBasisCurve_of_IfcOffsetCurve3D() {
		return BasisCurve_of_IfcOffsetCurve3D;
	}

	public void setBasisCurve_of_IfcOffsetCurve3D(IfcCurve value){
		this.BasisCurve_of_IfcOffsetCurve3D=value;
	}

	public IfcLengthMeasure getDistance_of_IfcOffsetCurve3D() {
		return Distance_of_IfcOffsetCurve3D;
	}

	public void setDistance_of_IfcOffsetCurve3D(IfcLengthMeasure value){
		this.Distance_of_IfcOffsetCurve3D=value;
	}

	public Boolean getSelfIntersect_of_IfcOffsetCurve3D() {
		return SelfIntersect_of_IfcOffsetCurve3D;
	}

	public void setSelfIntersect_of_IfcOffsetCurve3D(Boolean value){
		this.SelfIntersect_of_IfcOffsetCurve3D=value;
	}

	public IfcDirection getRefDirection_of_IfcOffsetCurve3D() {
		return RefDirection_of_IfcOffsetCurve3D;
	}

	public void setRefDirection_of_IfcOffsetCurve3D(IfcDirection value){
		this.RefDirection_of_IfcOffsetCurve3D=value;
	}

}