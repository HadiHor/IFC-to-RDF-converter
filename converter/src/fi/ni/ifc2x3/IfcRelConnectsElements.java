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

public class IfcRelConnectsElements extends IfcRelConnects 
{
 // The property attributes
 IfcConnectionGeometry   connectionGeometry;
 IfcElement   relatingElement;
 IfcElement   relatedElement;


 // Getters and setters of properties

 public IfcConnectionGeometry getConnectionGeometry() {
   return connectionGeometry;

 }
 public void setConnectionGeometry(IfcConnectionGeometry value){
   this.connectionGeometry=value;

 }

 public IfcElement getRelatingElement() {
   return relatingElement;

 }
 public void setRelatingElement(IfcElement value){
   this.relatingElement=value;

 }

 public IfcElement getRelatedElement() {
   return relatedElement;

 }
 public void setRelatedElement(IfcElement value){
   this.relatedElement=value;

 }

}