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

public class IfcCartesianTransformationOperator3D extends IfcCartesianTransformationOperator 
{
 // The property attributes
 IfcDirection   axis3;


 // Getters and setters of properties

 public IfcDirection getAxis3() {
   return axis3;

 }
 public void setAxis3(IfcDirection value){
   this.axis3=value;

 }

}
