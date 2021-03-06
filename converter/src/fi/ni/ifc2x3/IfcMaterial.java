package fi.ni.ifc2x3;
import fi.ni.InverseLinksList;
import fi.ni.Thing;
import fi.ni.ifc2x3.interfaces.IfcMaterialSelect;
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

public class IfcMaterial extends Thing implements IfcObjectReferenceSelect, IfcMaterialSelect
{
 // The property attributes
 String name;
 // The inverse attributes

 InverseLinksList<IfcMaterialDefinitionRepresentation> hasRepresentation= new InverseLinksList<IfcMaterialDefinitionRepresentation>();
 InverseLinksList<IfcMaterialClassificationRelationship> classifiedAs= new InverseLinksList<IfcMaterialClassificationRelationship>();


 // Getters and setters of properties

 public String getName() {
   return name;
 }
 public void setName(String value){
   this.name=value;

 }

 // Getters and setters of inverse values

 public InverseLinksList<IfcMaterialDefinitionRepresentation> getHasRepresentation() {
   return hasRepresentation;

 }
 public void setHasRepresentation(IfcMaterialDefinitionRepresentation value){
   this.hasRepresentation.add(value);

 }

 public InverseLinksList<IfcMaterialClassificationRelationship> getClassifiedAs() {
   return classifiedAs;

 }
 public void setClassifiedAs(IfcMaterialClassificationRelationship value){
   this.classifiedAs.add(value);

 }

}
