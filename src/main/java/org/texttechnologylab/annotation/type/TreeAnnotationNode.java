

/* First created by JCasGen Wed Dec 02 18:39:03 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Fri May 12 16:52:40 CEST 2023
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 * @generated */
public class TreeAnnotationNode extends TreeNode {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TreeAnnotationNode.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected TreeAnnotationNode() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TreeAnnotationNode(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TreeAnnotationNode(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: begin

  /** getter for begin - gets 
   * @generated
   * @return value of the feature 
   */
  public int getBegin() {
    if (TreeAnnotationNode_Type.featOkTst && ((TreeAnnotationNode_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "org.texttechnologylab.annotation.type.TreeAnnotationNode");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TreeAnnotationNode_Type)jcasType).casFeatCode_begin);}
    
  /** setter for begin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBegin(int v) {
    if (TreeAnnotationNode_Type.featOkTst && ((TreeAnnotationNode_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "org.texttechnologylab.annotation.type.TreeAnnotationNode");
    jcasType.ll_cas.ll_setIntValue(addr, ((TreeAnnotationNode_Type)jcasType).casFeatCode_begin, v);}    
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets 
   * @generated
   * @return value of the feature 
   */
  public int getEnd() {
    if (TreeAnnotationNode_Type.featOkTst && ((TreeAnnotationNode_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "org.texttechnologylab.annotation.type.TreeAnnotationNode");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TreeAnnotationNode_Type)jcasType).casFeatCode_end);}
    
  /** setter for end - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEnd(int v) {
    if (TreeAnnotationNode_Type.featOkTst && ((TreeAnnotationNode_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "org.texttechnologylab.annotation.type.TreeAnnotationNode");
    jcasType.ll_cas.ll_setIntValue(addr, ((TreeAnnotationNode_Type)jcasType).casFeatCode_end, v);}    
  }

    