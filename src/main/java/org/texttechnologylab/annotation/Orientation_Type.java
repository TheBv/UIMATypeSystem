
/* First created by JCasGen Thu Apr 23 09:55:21 CEST 2020 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.texttechnologylab.annotation.type.AnnotationNode_Type;

/** 
 * Updated by JCasGen Thu Apr 23 09:55:21 CEST 2020
 * @generated */
public class Orientation_Type extends AnnotationNode_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Orientation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.Orientation");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Orientation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    