package fi.ni.ifc2x3;
import java.util.List;

import fi.ni.IfcList;

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

public class IfcRelConnectsPathElements extends IfcRelConnectsElements 
{
 // The property attributes
 List<Long> relatingPriorities = new IfcList<Long>();
 List<Long> relatedPriorities = new IfcList<Long>();
 String relatedConnectionType;
 String relatingConnectionType;


 // Getters and setters of properties

 public List<Long> getRelatingPriorities() {
   return relatingPriorities;
 }
 public void setRelatingPriorities(String txt){
   List<Long> value = i.toLongList(txt);
   this.relatingPriorities=value;

 }

 public List<Long> getRelatedPriorities() {
   return relatedPriorities;
 }
 public void setRelatedPriorities(String txt){
   List<Long> value = i.toLongList(txt);
   this.relatedPriorities=value;

 }

 public String getRelatedConnectionType() {
   return relatedConnectionType;
 }
 public void setRelatedConnectionType(String value){
   this.relatedConnectionType=value;

 }

 public String getRelatingConnectionType() {
   return relatingConnectionType;
 }
 public void setRelatingConnectionType(String value){
   this.relatingConnectionType=value;

 }

}
