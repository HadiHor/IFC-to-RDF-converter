package fi.ni.ifc2x3;
import fi.ni.Thing;
import fi.ni.ifc2x3.interfaces.IfcDateTimeSelect;
import fi.ni.ifc2x3.interfaces.IfcObjectReferenceSelect;

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

public class IfcDateAndTime extends Thing implements IfcDateTimeSelect, IfcObjectReferenceSelect
{
 // The property attributes
 IfcCalendarDate   dateComponent;
 IfcLocalTime   timeComponent;


 // Getters and setters of properties

 public IfcCalendarDate getDateComponent() {
   return dateComponent;

 }
 public void setDateComponent(IfcCalendarDate value){
   this.dateComponent=value;

 }

 public IfcLocalTime getTimeComponent() {
   return timeComponent;

 }
 public void setTimeComponent(IfcLocalTime value){
   this.timeComponent=value;

 }

}
