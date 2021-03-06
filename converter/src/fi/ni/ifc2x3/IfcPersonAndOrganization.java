package fi.ni.ifc2x3;
import java.util.List;

import fi.ni.IfcList;
import fi.ni.Thing;
import fi.ni.ifc2x3.interfaces.IfcActorSelect;
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

public class IfcPersonAndOrganization extends Thing implements IfcActorSelect, IfcObjectReferenceSelect
{
 // The property attributes
 IfcPerson   thePerson;
 IfcOrganization   theOrganization;
 List<IfcActorRole> roles = new IfcList<IfcActorRole>();


 // Getters and setters of properties

 public IfcPerson getThePerson() {
   return thePerson;

 }
 public void setThePerson(IfcPerson value){
   this.thePerson=value;

 }

 public IfcOrganization getTheOrganization() {
   return theOrganization;

 }
 public void setTheOrganization(IfcOrganization value){
   this.theOrganization=value;

 }

 public List<IfcActorRole> getRoles() {
   return roles;

 }
 public void setRoles(IfcActorRole value){
   this.roles.add(value);

 }

}
