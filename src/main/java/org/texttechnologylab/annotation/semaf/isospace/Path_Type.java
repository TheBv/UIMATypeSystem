
/* First created by JCasGen Tue Mar 24 15:23:19 CET 2020 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Wed Apr 01 13:38:52 CEST 2020
 * @generated */
public class Path_Type extends Location_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Path.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.isospace.Path");
 
  /** @generated */
  final Feature casFeat_beginID;
  /** @generated */
  final int     casFeatCode_beginID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getBeginID(int addr) {
        if (featOkTst && casFeat_beginID == null)
      jcas.throwFeatMissing("beginID", "org.texttechnologylab.annotation.semaf.isospace.Path");
    return ll_cas.ll_getRefValue(addr, casFeatCode_beginID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBeginID(int addr, int v) {
        if (featOkTst && casFeat_beginID == null)
      jcas.throwFeatMissing("beginID", "org.texttechnologylab.annotation.semaf.isospace.Path");
    ll_cas.ll_setRefValue(addr, casFeatCode_beginID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_endID;
  /** @generated */
  final int     casFeatCode_endID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEndID(int addr) {
        if (featOkTst && casFeat_endID == null)
      jcas.throwFeatMissing("endID", "org.texttechnologylab.annotation.semaf.isospace.Path");
    return ll_cas.ll_getRefValue(addr, casFeatCode_endID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEndID(int addr, int v) {
        if (featOkTst && casFeat_endID == null)
      jcas.throwFeatMissing("endID", "org.texttechnologylab.annotation.semaf.isospace.Path");
    ll_cas.ll_setRefValue(addr, casFeatCode_endID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_midIDs;
  /** @generated */
  final int     casFeatCode_midIDs;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMidIDs(int addr) {
        if (featOkTst && casFeat_midIDs == null)
      jcas.throwFeatMissing("midIDs", "org.texttechnologylab.annotation.semaf.isospace.Path");
    return ll_cas.ll_getRefValue(addr, casFeatCode_midIDs);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMidIDs(int addr, int v) {
        if (featOkTst && casFeat_midIDs == null)
      jcas.throwFeatMissing("midIDs", "org.texttechnologylab.annotation.semaf.isospace.Path");
    ll_cas.ll_setRefValue(addr, casFeatCode_midIDs, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Path_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_beginID = jcas.getRequiredFeatureDE(casType, "beginID", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity", featOkTst);
    casFeatCode_beginID  = (null == casFeat_beginID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_beginID).getCode();

 
    casFeat_endID = jcas.getRequiredFeatureDE(casType, "endID", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity", featOkTst);
    casFeatCode_endID  = (null == casFeat_endID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_endID).getCode();

 
    casFeat_midIDs = jcas.getRequiredFeatureDE(casType, "midIDs", "uima.cas.FSList", featOkTst);
    casFeatCode_midIDs  = (null == casFeat_midIDs) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_midIDs).getCode();

  }
}



    