package fi.ni.ifc2x3;

/*
 * IFC Java class
The GNU Affero General Public License

Copyright (C) 2014  Jyrki Oraskari

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

public class IfcPolygonalBoundedHalfSpace extends IfcHalfSpaceSolid 
{
 // The property attributes
 IfcAxis2Placement3D   position;
 IfcBoundedCurve   polygonalBoundary;


 // Getters and setters of properties

 public IfcAxis2Placement3D getPosition() {
   return position;

 }
 public void setPosition(IfcAxis2Placement3D value){
   this.position=value;

 }

 public IfcBoundedCurve getPolygonalBoundary() {
   return polygonalBoundary;

 }
 public void setPolygonalBoundary(IfcBoundedCurve value){
   this.polygonalBoundary=value;

 }

}
