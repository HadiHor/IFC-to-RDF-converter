
/*
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

package fi.ni.vo;

import java.util.LinkedList;
import java.util.List;

public class TypeVO {
  private String name;
  private String primarytype;
  private List<String>    selected_entities=new LinkedList<String>();
  private List<String>    enum_entities=new LinkedList<String>();
  
public TypeVO(String name) {
	super();
	this.name = name;
	this.primarytype = name;
}



public TypeVO(String name, String primarytype) {
    super();
    this.name = name;
    this.primarytype = primarytype;
}



public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public List<String> getSelected_entities() {
    return selected_entities;
}

public void setSelected_entities(List<String> selected_entities) {
    this.selected_entities = selected_entities;
}

public String getPrimarytype() {
    return primarytype;
}

public void setPrimarytype(String primarytype) {
    this.primarytype = primarytype;
}



public List<String> getEnum_entities() {
    return enum_entities;
}



public void setEnum_entities(List<String> enum_entities) {
    this.enum_entities = enum_entities;
}



}
