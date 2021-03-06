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

public class IfcServiceLifeFactor extends IfcPropertySetDefinition 
{
 // The property attributes
 String predefinedType;
 String upperValue;
 String mostUsedValue;
 String lowerValue;


 // Getters and setters of properties

 public String getPredefinedType() {
   return predefinedType;
 }
 public void setPredefinedType(String value){
   this.predefinedType=value;

 }

 public String getUpperValue() {
   return upperValue;
 }
 public void setUpperValue(String value){
   this.upperValue=value;

 }

 public String getMostUsedValue() {
   return mostUsedValue;
 }
 public void setMostUsedValue(String value){
   this.mostUsedValue=value;

 }

 public String getLowerValue() {
   return lowerValue;
 }
 public void setLowerValue(String value){
   this.lowerValue=value;

 }

}
