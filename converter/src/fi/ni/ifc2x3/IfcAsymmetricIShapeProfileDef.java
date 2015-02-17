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

public class IfcAsymmetricIShapeProfileDef extends IfcIShapeProfileDef 
{
 // The property attributes
 Double topFlangeWidth;
 Double topFlangeThickness;
 Double topFlangeFilletRadius;
 Double centreOfGravityInY;


 // Getters and setters of properties

 public Double getTopFlangeWidth() {
   return topFlangeWidth;
 }
 public void setTopFlangeWidth(String txt){
   Double value = i.toDouble(txt);
   this.topFlangeWidth=value;

 }

 public Double getTopFlangeThickness() {
   return topFlangeThickness;
 }
 public void setTopFlangeThickness(String txt){
   Double value = i.toDouble(txt);
   this.topFlangeThickness=value;

 }

 public Double getTopFlangeFilletRadius() {
   return topFlangeFilletRadius;
 }
 public void setTopFlangeFilletRadius(String txt){
   Double value = i.toDouble(txt);
   this.topFlangeFilletRadius=value;

 }

 public Double getCentreOfGravityInY() {
   return centreOfGravityInY;
 }
 public void setCentreOfGravityInY(String txt){
   Double value = i.toDouble(txt);
   this.centreOfGravityInY=value;

 }

}
