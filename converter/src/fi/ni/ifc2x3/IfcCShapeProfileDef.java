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

public class IfcCShapeProfileDef extends IfcParameterizedProfileDef 
{
 // The property attributes
 Double depth;
 Double width;
 Double wallThickness;
 Double girth;
 Double internalFilletRadius;
 Double centreOfGravityInX;


 // Getters and setters of properties

 public Double getDepth() {
   return depth;
 }
 public void setDepth(String txt){
   Double value = i.toDouble(txt);
   this.depth=value;

 }

 public Double getWidth() {
   return width;
 }
 public void setWidth(String txt){
   Double value = i.toDouble(txt);
   this.width=value;

 }

 public Double getWallThickness() {
   return wallThickness;
 }
 public void setWallThickness(String txt){
   Double value = i.toDouble(txt);
   this.wallThickness=value;

 }

 public Double getGirth() {
   return girth;
 }
 public void setGirth(String txt){
   Double value = i.toDouble(txt);
   this.girth=value;

 }

 public Double getInternalFilletRadius() {
   return internalFilletRadius;
 }
 public void setInternalFilletRadius(String txt){
   Double value = i.toDouble(txt);
   this.internalFilletRadius=value;

 }

 public Double getCentreOfGravityInX() {
   return centreOfGravityInX;
 }
 public void setCentreOfGravityInX(String txt){
   Double value = i.toDouble(txt);
   this.centreOfGravityInX=value;

 }

}
