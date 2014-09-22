package org.buildingsmart.IFC4_ADD1;
import org.buildingsmart.IFC4_ADD1.interfaces.*;
import org.buildingsmart.*;
import java.util.*;

/*
 * IFC Java class
The MIT License (MIT)

 * @author Jyrki Oraskari
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

public class IfcOffsetCurve3D extends IfcCurve 
{
 // The property attributes
 IfcCurve   basisCurve;
 Double distance;
 String selfIntersect;
 IfcDirection   refDirection;


 // Getters and setters of properties

 public IfcCurve getBasisCurve() {
   return basisCurve;

 }
 public void setBasisCurve(IfcCurve value){
   this.basisCurve=value;

 }

 public Double getDistance() {
   return distance;
 }
 public void setDistance(String txt){
   Double value = i.toDouble(txt);
   this.distance=value;

 }

 public String getSelfIntersect() {
   return selfIntersect;
 }
 public void setSelfIntersect(String value){
   this.selfIntersect=value;

 }

 public IfcDirection getRefDirection() {
   return refDirection;

 }
 public void setRefDirection(IfcDirection value){
   this.refDirection=value;

 }

}
