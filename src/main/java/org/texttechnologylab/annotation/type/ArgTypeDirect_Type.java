
/* First created by JCasGen Thu Apr 23 09:54:33 CEST 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** 
 * Updated by JCasGen Thu Apr 23 09:54:34 CEST 2020
 * @generated */
public class ArgTypeDirect_Type extends ArgType_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ArgTypeDirect.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.ArgTypeDirect");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ArgTypeDirect_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    