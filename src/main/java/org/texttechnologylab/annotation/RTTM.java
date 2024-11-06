

   
/* Apache UIMA v3 - First created by JCasGen Tue Nov 05 19:03:56 CET 2024 */

package org.texttechnologylab.annotation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** Rich Transcription Time Marked
 * Updated by JCasGen Tue Nov 05 19:03:56 CET 2024
 * XML source: H:/Repos/Uni/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class RTTM extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.RTTM";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(RTTM.class);
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
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_segmentType = "segmentType";
  public final static String _FeatName_channel = "channel";
  public final static String _FeatName_turnOnset = "turnOnset";
  public final static String _FeatName_turnDuration = "turnDuration";
  public final static String _FeatName_orthographyField = "orthographyField";
  public final static String _FeatName_speakerType = "speakerType";
  public final static String _FeatName_speakerName = "speakerName";
  public final static String _FeatName_confidenceScore = "confidenceScore";
  public final static String _FeatName_signalLookaheadTime = "signalLookaheadTime";
  public final static String _FeatName_model = "model";
  public final static String _FeatName_reference = "reference";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_segmentType = TypeSystemImpl.createCallSite(RTTM.class, "segmentType");
  private final static MethodHandle _FH_segmentType = _FC_segmentType.dynamicInvoker();
  private final static CallSite _FC_channel = TypeSystemImpl.createCallSite(RTTM.class, "channel");
  private final static MethodHandle _FH_channel = _FC_channel.dynamicInvoker();
  private final static CallSite _FC_turnOnset = TypeSystemImpl.createCallSite(RTTM.class, "turnOnset");
  private final static MethodHandle _FH_turnOnset = _FC_turnOnset.dynamicInvoker();
  private final static CallSite _FC_turnDuration = TypeSystemImpl.createCallSite(RTTM.class, "turnDuration");
  private final static MethodHandle _FH_turnDuration = _FC_turnDuration.dynamicInvoker();
  private final static CallSite _FC_orthographyField = TypeSystemImpl.createCallSite(RTTM.class, "orthographyField");
  private final static MethodHandle _FH_orthographyField = _FC_orthographyField.dynamicInvoker();
  private final static CallSite _FC_speakerType = TypeSystemImpl.createCallSite(RTTM.class, "speakerType");
  private final static MethodHandle _FH_speakerType = _FC_speakerType.dynamicInvoker();
  private final static CallSite _FC_speakerName = TypeSystemImpl.createCallSite(RTTM.class, "speakerName");
  private final static MethodHandle _FH_speakerName = _FC_speakerName.dynamicInvoker();
  private final static CallSite _FC_confidenceScore = TypeSystemImpl.createCallSite(RTTM.class, "confidenceScore");
  private final static MethodHandle _FH_confidenceScore = _FC_confidenceScore.dynamicInvoker();
  private final static CallSite _FC_signalLookaheadTime = TypeSystemImpl.createCallSite(RTTM.class, "signalLookaheadTime");
  private final static MethodHandle _FH_signalLookaheadTime = _FC_signalLookaheadTime.dynamicInvoker();
  private final static CallSite _FC_model = TypeSystemImpl.createCallSite(RTTM.class, "model");
  private final static MethodHandle _FH_model = _FC_model.dynamicInvoker();
  private final static CallSite _FC_reference = TypeSystemImpl.createCallSite(RTTM.class, "reference");
  private final static MethodHandle _FH_reference = _FC_reference.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected RTTM() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public RTTM(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public RTTM(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public RTTM(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
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
  //* Feature: segmentType

  /** getter for segmentType - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSegmentType() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_segmentType));
  }
    
  /** setter for segmentType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSegmentType(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_segmentType), v);
  }    
    
   
    
  //*--------------*
  //* Feature: channel

  /** getter for channel - gets 
   * @generated
   * @return value of the feature 
   */
  public int getChannel() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_channel));
  }
    
  /** setter for channel - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setChannel(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_channel), v);
  }    
    
   
    
  //*--------------*
  //* Feature: turnOnset

  /** getter for turnOnset - gets 
   * @generated
   * @return value of the feature 
   */
  public double getTurnOnset() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_turnOnset));
  }
    
  /** setter for turnOnset - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTurnOnset(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_turnOnset), v);
  }    
    
   
    
  //*--------------*
  //* Feature: turnDuration

  /** getter for turnDuration - gets 
   * @generated
   * @return value of the feature 
   */
  public double getTurnDuration() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_turnDuration));
  }
    
  /** setter for turnDuration - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTurnDuration(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_turnDuration), v);
  }    
    
   
    
  //*--------------*
  //* Feature: orthographyField

  /** getter for orthographyField - gets 
   * @generated
   * @return value of the feature 
   */
  public String getOrthographyField() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_orthographyField));
  }
    
  /** setter for orthographyField - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrthographyField(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_orthographyField), v);
  }    
    
   
    
  //*--------------*
  //* Feature: speakerType

  /** getter for speakerType - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSpeakerType() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_speakerType));
  }
    
  /** setter for speakerType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpeakerType(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_speakerType), v);
  }    
    
   
    
  //*--------------*
  //* Feature: speakerName

  /** getter for speakerName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSpeakerName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_speakerName));
  }
    
  /** setter for speakerName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpeakerName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_speakerName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: confidenceScore

  /** getter for confidenceScore - gets 
   * @generated
   * @return value of the feature 
   */
  public float getConfidenceScore() { 
    return _getFloatValueNc(wrapGetIntCatchException(_FH_confidenceScore));
  }
    
  /** setter for confidenceScore - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidenceScore(float v) {
    _setFloatValueNfc(wrapGetIntCatchException(_FH_confidenceScore), v);
  }    
    
   
    
  //*--------------*
  //* Feature: signalLookaheadTime

  /** getter for signalLookaheadTime - gets 
   * @generated
   * @return value of the feature 
   */
  public double getSignalLookaheadTime() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_signalLookaheadTime));
  }
    
  /** setter for signalLookaheadTime - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSignalLookaheadTime(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_signalLookaheadTime), v);
  }    
    
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets 
   * @generated
   * @return value of the feature 
   */
  public String getModel() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_model));
  }
    
  /** setter for model - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_model), v);
  }    
    
   
    
  //*--------------*
  //* Feature: reference

  /** getter for reference - gets 
   * @generated
   * @return value of the feature 
   */
  public AudioWav getReference() { 
    return (AudioWav)(_getFeatureValueNc(wrapGetIntCatchException(_FH_reference)));
  }
    
  /** setter for reference - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference(AudioWav v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_reference), v);
  }    
    
  }

    