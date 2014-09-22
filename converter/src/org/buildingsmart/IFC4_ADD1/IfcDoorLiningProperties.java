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

public class IfcDoorLiningProperties extends IfcPreDefinedPropertySet 
{
 // The property attributes
 Double liningDepth;
 Double liningThickness;
 Double thresholdDepth;
 Double thresholdThickness;
 Double transomThickness;
 Double transomOffset;
 Double liningOffset;
 Double thresholdOffset;
 Double casingThickness;
 Double casingDepth;
 IfcShapeAspect   shapeAspectStyle;
 Double liningToPanelOffsetX;
 Double liningToPanelOffsetY;


 // Getters and setters of properties

 public Double getLiningDepth() {
   return liningDepth;
 }
 public void setLiningDepth(String txt){
   Double value = i.toDouble(txt);
   this.liningDepth=value;

 }

 public Double getLiningThickness() {
   return liningThickness;
 }
 public void setLiningThickness(String txt){
   Double value = i.toDouble(txt);
   this.liningThickness=value;

 }

 public Double getThresholdDepth() {
   return thresholdDepth;
 }
 public void setThresholdDepth(String txt){
   Double value = i.toDouble(txt);
   this.thresholdDepth=value;

 }

 public Double getThresholdThickness() {
   return thresholdThickness;
 }
 public void setThresholdThickness(String txt){
   Double value = i.toDouble(txt);
   this.thresholdThickness=value;

 }

 public Double getTransomThickness() {
   return transomThickness;
 }
 public void setTransomThickness(String txt){
   Double value = i.toDouble(txt);
   this.transomThickness=value;

 }

 public Double getTransomOffset() {
   return transomOffset;
 }
 public void setTransomOffset(String txt){
   Double value = i.toDouble(txt);
   this.transomOffset=value;

 }

 public Double getLiningOffset() {
   return liningOffset;
 }
 public void setLiningOffset(String txt){
   Double value = i.toDouble(txt);
   this.liningOffset=value;

 }

 public Double getThresholdOffset() {
   return thresholdOffset;
 }
 public void setThresholdOffset(String txt){
   Double value = i.toDouble(txt);
   this.thresholdOffset=value;

 }

 public Double getCasingThickness() {
   return casingThickness;
 }
 public void setCasingThickness(String txt){
   Double value = i.toDouble(txt);
   this.casingThickness=value;

 }

 public Double getCasingDepth() {
   return casingDepth;
 }
 public void setCasingDepth(String txt){
   Double value = i.toDouble(txt);
   this.casingDepth=value;

 }

 public IfcShapeAspect getShapeAspectStyle() {
   return shapeAspectStyle;

 }
 public void setShapeAspectStyle(IfcShapeAspect value){
   this.shapeAspectStyle=value;

 }

 public Double getLiningToPanelOffsetX() {
   return liningToPanelOffsetX;
 }
 public void setLiningToPanelOffsetX(String txt){
   Double value = i.toDouble(txt);
   this.liningToPanelOffsetX=value;

 }

 public Double getLiningToPanelOffsetY() {
   return liningToPanelOffsetY;
 }
 public void setLiningToPanelOffsetY(String txt){
   Double value = i.toDouble(txt);
   this.liningToPanelOffsetY=value;

 }

}
