

   
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


/** 
 * Updated by JCasGen Tue Nov 05 19:03:56 CET 2024
 * XML source: H:/Repos/Uni/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Transcription extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.Transcription";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Transcription.class);
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
   
  public final static String _FeatName_startTime = "startTime";
  public final static String _FeatName_endTime = "endTime";
  public final static String _FeatName_speaker = "speaker";
  public final static String _FeatName_utterance = "utterance";
  public final static String _FeatName_model = "model";
  public final static String _FeatName_reference = "reference";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_startTime = TypeSystemImpl.createCallSite(Transcription.class, "startTime");
  private final static MethodHandle _FH_startTime = _FC_startTime.dynamicInvoker();
  private final static CallSite _FC_endTime = TypeSystemImpl.createCallSite(Transcription.class, "endTime");
  private final static MethodHandle _FH_endTime = _FC_endTime.dynamicInvoker();
  private final static CallSite _FC_speaker = TypeSystemImpl.createCallSite(Transcription.class, "speaker");
  private final static MethodHandle _FH_speaker = _FC_speaker.dynamicInvoker();
  private final static CallSite _FC_utterance = TypeSystemImpl.createCallSite(Transcription.class, "utterance");
  private final static MethodHandle _FH_utterance = _FC_utterance.dynamicInvoker();
  private final static CallSite _FC_model = TypeSystemImpl.createCallSite(Transcription.class, "model");
  private final static MethodHandle _FH_model = _FC_model.dynamicInvoker();
  private final static CallSite _FC_reference = TypeSystemImpl.createCallSite(Transcription.class, "reference");
  private final static MethodHandle _FH_reference = _FC_reference.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Transcription() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Transcription(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Transcription(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Transcription(JCas jcas, int begin, int end) {
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
  //* Feature: startTime

  /** getter for startTime - gets 
   * @generated
   * @return value of the feature 
   */
  public float getStartTime() { 
    return _getFloatValueNc(wrapGetIntCatchException(_FH_startTime));
  }
    
  /** setter for startTime - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStartTime(float v) {
    _setFloatValueNfc(wrapGetIntCatchException(_FH_startTime), v);
  }    
    
   
    
  //*--------------*
  //* Feature: endTime

  /** getter for endTime - gets 
   * @generated
   * @return value of the feature 
   */
  public float getEndTime() { 
    return _getFloatValueNc(wrapGetIntCatchException(_FH_endTime));
  }
    
  /** setter for endTime - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndTime(float v) {
    _setFloatValueNfc(wrapGetIntCatchException(_FH_endTime), v);
  }    
    
   
    
  //*--------------*
  //* Feature: speaker

  /** getter for speaker - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSpeaker() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_speaker));
  }
    
  /** setter for speaker - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpeaker(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_speaker), v);
  }    
    
   
    
  //*--------------*
  //* Feature: utterance

  /** getter for utterance - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUtterance() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_utterance));
  }
    
  /** setter for utterance - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUtterance(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_utterance), v);
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

    