package fi.ni.ifc2x3;
import fi.ni.Thing;

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

public class IfcDraughtingCalloutRelationship extends Thing 
{
 // The property attributes
 String name;
 String description;
 IfcDraughtingCallout   relatingDraughtingCallout;
 IfcDraughtingCallout   relatedDraughtingCallout;


 // Getters and setters of properties

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 public String getDescription() {
   return description;
 }
 public void setDescription(String value){
   this.description=value;

 }

 public IfcDraughtingCallout getRelatingDraughtingCallout() {
   return relatingDraughtingCallout;

 }
 public void setRelatingDraughtingCallout(IfcDraughtingCallout value){
   this.relatingDraughtingCallout=value;

 }

 public IfcDraughtingCallout getRelatedDraughtingCallout() {
   return relatedDraughtingCallout;

 }
 public void setRelatedDraughtingCallout(IfcDraughtingCallout value){
   this.relatedDraughtingCallout=value;

 }

}
