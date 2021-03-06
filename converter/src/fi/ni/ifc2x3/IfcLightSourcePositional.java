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

public class IfcLightSourcePositional extends IfcLightSource 
{
 // The property attributes
 IfcCartesianPoint   position;
 Double radius;
 Double constantAttenuation;
 Double distanceAttenuation;
 Double quadricAttenuation;


 // Getters and setters of properties

 public IfcCartesianPoint getPosition() {
   return position;

 }
 public void setPosition(IfcCartesianPoint value){
   this.position=value;

 }

 public Double getRadius() {
   return radius;
 }
 public void setRadius(String txt){
   Double value = i.toDouble(txt);
   this.radius=value;

 }

 public Double getConstantAttenuation() {
   return constantAttenuation;
 }
 public void setConstantAttenuation(String txt){
   Double value = i.toDouble(txt);
   this.constantAttenuation=value;

 }

 public Double getDistanceAttenuation() {
   return distanceAttenuation;
 }
 public void setDistanceAttenuation(String txt){
   Double value = i.toDouble(txt);
   this.distanceAttenuation=value;

 }

 public Double getQuadricAttenuation() {
   return quadricAttenuation;
 }
 public void setQuadricAttenuation(String txt){
   Double value = i.toDouble(txt);
   this.quadricAttenuation=value;

 }

}
