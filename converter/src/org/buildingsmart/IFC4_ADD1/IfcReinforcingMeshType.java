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

public class IfcReinforcingMeshType extends IfcReinforcingElementType 
{
 // The property attributes
 String predefinedType;
 Double meshLength;
 Double meshWidth;
 Double longitudinalBarNominalDiameter;
 Double transverseBarNominalDiameter;
 Double longitudinalBarCrossSectionArea;
 Double transverseBarCrossSectionArea;
 Double longitudinalBarSpacing;
 Double transverseBarSpacing;
 String bendingShapeCode;
 List<String> bendingParameters = new IfcList<String>();


 // Getters and setters of properties

 public String getPredefinedType() {
   return predefinedType;
 }
 public void setPredefinedType(String value){
   this.predefinedType=value;

 }

 public Double getMeshLength() {
   return meshLength;
 }
 public void setMeshLength(String txt){
   Double value = i.toDouble(txt);
   this.meshLength=value;

 }

 public Double getMeshWidth() {
   return meshWidth;
 }
 public void setMeshWidth(String txt){
   Double value = i.toDouble(txt);
   this.meshWidth=value;

 }

 public Double getLongitudinalBarNominalDiameter() {
   return longitudinalBarNominalDiameter;
 }
 public void setLongitudinalBarNominalDiameter(String txt){
   Double value = i.toDouble(txt);
   this.longitudinalBarNominalDiameter=value;

 }

 public Double getTransverseBarNominalDiameter() {
   return transverseBarNominalDiameter;
 }
 public void setTransverseBarNominalDiameter(String txt){
   Double value = i.toDouble(txt);
   this.transverseBarNominalDiameter=value;

 }

 public Double getLongitudinalBarCrossSectionArea() {
   return longitudinalBarCrossSectionArea;
 }
 public void setLongitudinalBarCrossSectionArea(String txt){
   Double value = i.toDouble(txt);
   this.longitudinalBarCrossSectionArea=value;

 }

 public Double getTransverseBarCrossSectionArea() {
   return transverseBarCrossSectionArea;
 }
 public void setTransverseBarCrossSectionArea(String txt){
   Double value = i.toDouble(txt);
   this.transverseBarCrossSectionArea=value;

 }

 public Double getLongitudinalBarSpacing() {
   return longitudinalBarSpacing;
 }
 public void setLongitudinalBarSpacing(String txt){
   Double value = i.toDouble(txt);
   this.longitudinalBarSpacing=value;

 }

 public Double getTransverseBarSpacing() {
   return transverseBarSpacing;
 }
 public void setTransverseBarSpacing(String txt){
   Double value = i.toDouble(txt);
   this.transverseBarSpacing=value;

 }

 public String getBendingShapeCode() {
   return bendingShapeCode;
 }
 public void setBendingShapeCode(String value){
   this.bendingShapeCode=value;

 }

 public List<String> getBendingParameters() {
   return bendingParameters;
 }
 public void setBendingParameters(String value){
   this.bendingParameters.add(value);

 }

}
