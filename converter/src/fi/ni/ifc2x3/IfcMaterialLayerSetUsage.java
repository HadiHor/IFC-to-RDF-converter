package fi.ni.ifc2x3;
import fi.ni.Thing;
import fi.ni.ifc2x3.interfaces.IfcMaterialSelect;

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

public class IfcMaterialLayerSetUsage extends Thing implements IfcMaterialSelect
{
 // The property attributes
 IfcMaterialLayerSet   forLayerSet;
 String layerSetDirection;
 String directionSense;
 Double offsetFromReferenceLine;


 // Getters and setters of properties

 public IfcMaterialLayerSet getForLayerSet() {
   return forLayerSet;

 }
 public void setForLayerSet(IfcMaterialLayerSet value){
   this.forLayerSet=value;

 }

 public String getLayerSetDirection() {
   return layerSetDirection;
 }
 public void setLayerSetDirection(String value){
   this.layerSetDirection=value;

 }

 public String getDirectionSense() {
   return directionSense;
 }
 public void setDirectionSense(String value){
   this.directionSense=value;

 }

 public Double getOffsetFromReferenceLine() {
   return offsetFromReferenceLine;
 }
 public void setOffsetFromReferenceLine(String txt){
   Double value = i.toDouble(txt);
   this.offsetFromReferenceLine=value;

 }

}
