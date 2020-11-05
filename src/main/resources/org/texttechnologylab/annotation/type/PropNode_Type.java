
/* First created by JCasGen Thu Nov 05 17:33:11 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Thu Nov 05 17:33:11 CET 2020
 * @generated */
public class PropNode_Type extends Node_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = PropNode.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.PropNode");
 
  /** @generated */
  final Feature casFeat_graphId;
  /** @generated */
  final int     casFeatCode_graphId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGraphId(int addr) {
        if (featOkTst && casFeat_graphId == null)
      jcas.throwFeatMissing("graphId", "org.texttechnologylab.annotation.type.PropNode");
    return ll_cas.ll_getStringValue(addr, casFeatCode_graphId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGraphId(int addr, String v) {
        if (featOkTst && casFeat_graphId == null)
      jcas.throwFeatMissing("graphId", "org.texttechnologylab.annotation.type.PropNode");
    ll_cas.ll_setStringValue(addr, casFeatCode_graphId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_nodeId;
  /** @generated */
  final int     casFeatCode_nodeId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNodeId(int addr) {
        if (featOkTst && casFeat_nodeId == null)
      jcas.throwFeatMissing("nodeId", "org.texttechnologylab.annotation.type.PropNode");
    return ll_cas.ll_getStringValue(addr, casFeatCode_nodeId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNodeId(int addr, String v) {
        if (featOkTst && casFeat_nodeId == null)
      jcas.throwFeatMissing("nodeId", "org.texttechnologylab.annotation.type.PropNode");
    ll_cas.ll_setStringValue(addr, casFeatCode_nodeId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_lemma;
  /** @generated */
  final int     casFeatCode_lemma;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLemma(int addr) {
        if (featOkTst && casFeat_lemma == null)
      jcas.throwFeatMissing("lemma", "org.texttechnologylab.annotation.type.PropNode");
    return ll_cas.ll_getStringValue(addr, casFeatCode_lemma);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLemma(int addr, String v) {
        if (featOkTst && casFeat_lemma == null)
      jcas.throwFeatMissing("lemma", "org.texttechnologylab.annotation.type.PropNode");
    ll_cas.ll_setStringValue(addr, casFeatCode_lemma, v);}
    
  
 
  /** @generated */
  final Feature casFeat_pos;
  /** @generated */
  final int     casFeatCode_pos;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPos(int addr) {
        if (featOkTst && casFeat_pos == null)
      jcas.throwFeatMissing("pos", "org.texttechnologylab.annotation.type.PropNode");
    return ll_cas.ll_getStringValue(addr, casFeatCode_pos);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPos(int addr, String v) {
        if (featOkTst && casFeat_pos == null)
      jcas.throwFeatMissing("pos", "org.texttechnologylab.annotation.type.PropNode");
    ll_cas.ll_setStringValue(addr, casFeatCode_pos, v);}
    
  
 
  /** @generated */
  final Feature casFeat_text;
  /** @generated */
  final int     casFeatCode_text;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getText(int addr) {
        if (featOkTst && casFeat_text == null)
      jcas.throwFeatMissing("text", "org.texttechnologylab.annotation.type.PropNode");
    return ll_cas.ll_getStringValue(addr, casFeatCode_text);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setText(int addr, String v) {
        if (featOkTst && casFeat_text == null)
      jcas.throwFeatMissing("text", "org.texttechnologylab.annotation.type.PropNode");
    ll_cas.ll_setStringValue(addr, casFeatCode_text, v);}
    
  
 
  /** @generated */
  final Feature casFeat_x;
  /** @generated */
  final int     casFeatCode_x;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getX(int addr) {
        if (featOkTst && casFeat_x == null)
      jcas.throwFeatMissing("x", "org.texttechnologylab.annotation.type.PropNode");
    return ll_cas.ll_getStringValue(addr, casFeatCode_x);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setX(int addr, String v) {
        if (featOkTst && casFeat_x == null)
      jcas.throwFeatMissing("x", "org.texttechnologylab.annotation.type.PropNode");
    ll_cas.ll_setStringValue(addr, casFeatCode_x, v);}
    
  
 
  /** @generated */
  final Feature casFeat_y;
  /** @generated */
  final int     casFeatCode_y;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getY(int addr) {
        if (featOkTst && casFeat_y == null)
      jcas.throwFeatMissing("y", "org.texttechnologylab.annotation.type.PropNode");
    return ll_cas.ll_getStringValue(addr, casFeatCode_y);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setY(int addr, String v) {
        if (featOkTst && casFeat_y == null)
      jcas.throwFeatMissing("y", "org.texttechnologylab.annotation.type.PropNode");
    ll_cas.ll_setStringValue(addr, casFeatCode_y, v);}
    
  
 
  /** @generated */
  final Feature casFeat_reference;
  /** @generated */
  final int     casFeatCode_reference;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getReference(int addr) {
        if (featOkTst && casFeat_reference == null)
      jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.type.PropNode");
    return ll_cas.ll_getStringValue(addr, casFeatCode_reference);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReference(int addr, String v) {
        if (featOkTst && casFeat_reference == null)
      jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.type.PropNode");
    ll_cas.ll_setStringValue(addr, casFeatCode_reference, v);}
    
  
 
  /** @generated */
  final Feature casFeat_x2;
  /** @generated */
  final int     casFeatCode_x2;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getX2(int addr) {
        if (featOkTst && casFeat_x2 == null)
      jcas.throwFeatMissing("x2", "org.texttechnologylab.annotation.type.PropNode");
    return ll_cas.ll_getStringValue(addr, casFeatCode_x2);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setX2(int addr, String v) {
        if (featOkTst && casFeat_x2 == null)
      jcas.throwFeatMissing("x2", "org.texttechnologylab.annotation.type.PropNode");
    ll_cas.ll_setStringValue(addr, casFeatCode_x2, v);}
    
  
 
  /** @generated */
  final Feature casFeat_y2;
  /** @generated */
  final int     casFeatCode_y2;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getY2(int addr) {
        if (featOkTst && casFeat_y2 == null)
      jcas.throwFeatMissing("y2", "org.texttechnologylab.annotation.type.PropNode");
    return ll_cas.ll_getStringValue(addr, casFeatCode_y2);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setY2(int addr, String v) {
        if (featOkTst && casFeat_y2 == null)
      jcas.throwFeatMissing("y2", "org.texttechnologylab.annotation.type.PropNode");
    ll_cas.ll_setStringValue(addr, casFeatCode_y2, v);}
    
  
 
  /** @generated */
  final Feature casFeat_begin;
  /** @generated */
  final int     casFeatCode_begin;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getBegin(int addr) {
        if (featOkTst && casFeat_begin == null)
      jcas.throwFeatMissing("begin", "org.texttechnologylab.annotation.type.PropNode");
    return ll_cas.ll_getStringValue(addr, casFeatCode_begin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBegin(int addr, String v) {
        if (featOkTst && casFeat_begin == null)
      jcas.throwFeatMissing("begin", "org.texttechnologylab.annotation.type.PropNode");
    ll_cas.ll_setStringValue(addr, casFeatCode_begin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_end;
  /** @generated */
  final int     casFeatCode_end;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getEnd(int addr) {
        if (featOkTst && casFeat_end == null)
      jcas.throwFeatMissing("end", "org.texttechnologylab.annotation.type.PropNode");
    return ll_cas.ll_getStringValue(addr, casFeatCode_end);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEnd(int addr, String v) {
        if (featOkTst && casFeat_end == null)
      jcas.throwFeatMissing("end", "org.texttechnologylab.annotation.type.PropNode");
    ll_cas.ll_setStringValue(addr, casFeatCode_end, v);}
    
  
 
  /** @generated */
  final Feature casFeat_color;
  /** @generated */
  final int     casFeatCode_color;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getColor(int addr) {
        if (featOkTst && casFeat_color == null)
      jcas.throwFeatMissing("color", "org.texttechnologylab.annotation.type.PropNode");
    return ll_cas.ll_getStringValue(addr, casFeatCode_color);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setColor(int addr, String v) {
        if (featOkTst && casFeat_color == null)
      jcas.throwFeatMissing("color", "org.texttechnologylab.annotation.type.PropNode");
    ll_cas.ll_setStringValue(addr, casFeatCode_color, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public PropNode_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_graphId = jcas.getRequiredFeatureDE(casType, "graphId", "uima.cas.String", featOkTst);
    casFeatCode_graphId  = (null == casFeat_graphId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_graphId).getCode();

 
    casFeat_nodeId = jcas.getRequiredFeatureDE(casType, "nodeId", "uima.cas.String", featOkTst);
    casFeatCode_nodeId  = (null == casFeat_nodeId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_nodeId).getCode();

 
    casFeat_lemma = jcas.getRequiredFeatureDE(casType, "lemma", "uima.cas.String", featOkTst);
    casFeatCode_lemma  = (null == casFeat_lemma) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lemma).getCode();

 
    casFeat_pos = jcas.getRequiredFeatureDE(casType, "pos", "uima.cas.String", featOkTst);
    casFeatCode_pos  = (null == casFeat_pos) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pos).getCode();

 
    casFeat_text = jcas.getRequiredFeatureDE(casType, "text", "uima.cas.String", featOkTst);
    casFeatCode_text  = (null == casFeat_text) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_text).getCode();

 
    casFeat_x = jcas.getRequiredFeatureDE(casType, "x", "uima.cas.String", featOkTst);
    casFeatCode_x  = (null == casFeat_x) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_x).getCode();

 
    casFeat_y = jcas.getRequiredFeatureDE(casType, "y", "uima.cas.String", featOkTst);
    casFeatCode_y  = (null == casFeat_y) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_y).getCode();

 
    casFeat_reference = jcas.getRequiredFeatureDE(casType, "reference", "uima.cas.String", featOkTst);
    casFeatCode_reference  = (null == casFeat_reference) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_reference).getCode();

 
    casFeat_x2 = jcas.getRequiredFeatureDE(casType, "x2", "uima.cas.String", featOkTst);
    casFeatCode_x2  = (null == casFeat_x2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_x2).getCode();

 
    casFeat_y2 = jcas.getRequiredFeatureDE(casType, "y2", "uima.cas.String", featOkTst);
    casFeatCode_y2  = (null == casFeat_y2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_y2).getCode();

 
    casFeat_begin = jcas.getRequiredFeatureDE(casType, "begin", "uima.cas.String", featOkTst);
    casFeatCode_begin  = (null == casFeat_begin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_begin).getCode();

 
    casFeat_end = jcas.getRequiredFeatureDE(casType, "end", "uima.cas.String", featOkTst);
    casFeatCode_end  = (null == casFeat_end) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_end).getCode();

 
    casFeat_color = jcas.getRequiredFeatureDE(casType, "color", "uima.cas.String", featOkTst);
    casFeatCode_color  = (null == casFeat_color) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_color).getCode();

  }
}



    