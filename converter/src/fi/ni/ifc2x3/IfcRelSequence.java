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

public class IfcRelSequence extends IfcRelConnects 
{
 // The property attributes
 IfcProcess   relatingProcess;
 IfcProcess   relatedProcess;
 Double timeLag;
 String sequenceType;


 // Getters and setters of properties

 public IfcProcess getRelatingProcess() {
   return relatingProcess;

 }
 public void setRelatingProcess(IfcProcess value){
   this.relatingProcess=value;

 }

 public IfcProcess getRelatedProcess() {
   return relatedProcess;

 }
 public void setRelatedProcess(IfcProcess value){
   this.relatedProcess=value;

 }

 public Double getTimeLag() {
   return timeLag;
 }
 public void setTimeLag(String txt){
   Double value = i.toDouble(txt);
   this.timeLag=value;

 }

 public String getSequenceType() {
   return sequenceType;
 }
 public void setSequenceType(String value){
   this.sequenceType=value;

 }

}
