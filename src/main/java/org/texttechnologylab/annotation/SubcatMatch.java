

/* First created by JCasGen Tue Feb 16 16:52:01 CET 2021 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Tue Feb 16 16:52:01 CET 2021
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 * @generated */
public class SubcatMatch extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SubcatMatch.class);
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
  protected SubcatMatch() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SubcatMatch(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SubcatMatch(JCas jcas) {
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
  //* Feature: status

  /** getter for status - gets 
   * @generated
   * @return value of the feature 
   */
  public String getStatus() {
    if (SubcatMatch_Type.featOkTst && ((SubcatMatch_Type)jcasType).casFeat_status == null)
      jcasType.jcas.throwFeatMissing("status", "org.texttechnologylab.annotation.SubcatMatch");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SubcatMatch_Type)jcasType).casFeatCode_status);}
    
  /** setter for status - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStatus(String v) {
    if (SubcatMatch_Type.featOkTst && ((SubcatMatch_Type)jcasType).casFeat_status == null)
      jcasType.jcas.throwFeatMissing("status", "org.texttechnologylab.annotation.SubcatMatch");
    jcasType.ll_cas.ll_setStringValue(addr, ((SubcatMatch_Type)jcasType).casFeatCode_status, v);}    
   
    
  //*--------------*
  //* Feature: context

  /** getter for context - gets 
   * @generated
   * @return value of the feature 
   */
  public String getContext() {
    if (SubcatMatch_Type.featOkTst && ((SubcatMatch_Type)jcasType).casFeat_context == null)
      jcasType.jcas.throwFeatMissing("context", "org.texttechnologylab.annotation.SubcatMatch");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SubcatMatch_Type)jcasType).casFeatCode_context);}
    
  /** setter for context - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setContext(String v) {
    if (SubcatMatch_Type.featOkTst && ((SubcatMatch_Type)jcasType).casFeat_context == null)
      jcasType.jcas.throwFeatMissing("context", "org.texttechnologylab.annotation.SubcatMatch");
    jcasType.ll_cas.ll_setStringValue(addr, ((SubcatMatch_Type)jcasType).casFeatCode_context, v);}    
   
    
  //*--------------*
  //* Feature: elements

  /** getter for elements - gets 
   * @generated
   * @return value of the feature 
   */
  public FSList getElements() {
    if (SubcatMatch_Type.featOkTst && ((SubcatMatch_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "org.texttechnologylab.annotation.SubcatMatch");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SubcatMatch_Type)jcasType).casFeatCode_elements)));}
    
  /** setter for elements - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setElements(FSList v) {
    if (SubcatMatch_Type.featOkTst && ((SubcatMatch_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "org.texttechnologylab.annotation.SubcatMatch");
    jcasType.ll_cas.ll_setRefValue(addr, ((SubcatMatch_Type)jcasType).casFeatCode_elements, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    