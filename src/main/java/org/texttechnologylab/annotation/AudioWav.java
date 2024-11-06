

   
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


/** Audio data
 * Updated by JCasGen Tue Nov 05 19:03:56 CET 2024
 * XML source: H:/Repos/Uni/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class AudioWav extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.AudioWav";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AudioWav.class);
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
   
  public final static String _FeatName_base64 = "base64";
  public final static String _FeatName_channels = "channels";
  public final static String _FeatName_frequence = "frequence";
  public final static String _FeatName_bitsPerSample = "bitsPerSample";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_base64 = TypeSystemImpl.createCallSite(AudioWav.class, "base64");
  private final static MethodHandle _FH_base64 = _FC_base64.dynamicInvoker();
  private final static CallSite _FC_channels = TypeSystemImpl.createCallSite(AudioWav.class, "channels");
  private final static MethodHandle _FH_channels = _FC_channels.dynamicInvoker();
  private final static CallSite _FC_frequence = TypeSystemImpl.createCallSite(AudioWav.class, "frequence");
  private final static MethodHandle _FH_frequence = _FC_frequence.dynamicInvoker();
  private final static CallSite _FC_bitsPerSample = TypeSystemImpl.createCallSite(AudioWav.class, "bitsPerSample");
  private final static MethodHandle _FH_bitsPerSample = _FC_bitsPerSample.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected AudioWav() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public AudioWav(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AudioWav(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AudioWav(JCas jcas, int begin, int end) {
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
  //* Feature: base64

  /** getter for base64 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getBase64() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_base64));
  }
    
  /** setter for base64 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBase64(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_base64), v);
  }    
    
   
    
  //*--------------*
  //* Feature: channels

  /** getter for channels - gets 
   * @generated
   * @return value of the feature 
   */
  public int getChannels() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_channels));
  }
    
  /** setter for channels - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setChannels(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_channels), v);
  }    
    
   
    
  //*--------------*
  //* Feature: frequence

  /** getter for frequence - gets 
   * @generated
   * @return value of the feature 
   */
  public int getFrequence() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_frequence));
  }
    
  /** setter for frequence - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFrequence(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_frequence), v);
  }    
    
   
    
  //*--------------*
  //* Feature: bitsPerSample

  /** getter for bitsPerSample - gets 
   * @generated
   * @return value of the feature 
   */
  public int getBitsPerSample() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_bitsPerSample));
  }
    
  /** setter for bitsPerSample - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBitsPerSample(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_bitsPerSample), v);
  }    
    
  }

    