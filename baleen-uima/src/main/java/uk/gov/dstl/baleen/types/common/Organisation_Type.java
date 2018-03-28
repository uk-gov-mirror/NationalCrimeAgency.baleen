/* First created by JCasGen Wed Jan 21 11:21:05 GMT 2015 */
// Dstl (c) Crown Copyright 2017
package uk.gov.dstl.baleen.types.common;

import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;

import uk.gov.dstl.baleen.types.semantic.Entity_Type;

/**
 * An explicit refrence to a formal organisation, including governmental, political, religious,
 * charitable, economic/financial, business or criminal bodies. Updated by JCasGen Wed Apr 13
 * 13:23:16 BST 2016
 *
 * @generated
 */
public class Organisation_Type extends Entity_Type {
  /** @generated */
  @SuppressWarnings("hiding")
  public static final int typeIndexID = Organisation.typeIndexID;
  /**
   * @generated
   * @modifiable
   */
  @SuppressWarnings("hiding")
  public static final boolean featOkTst =
      JCasRegistry.getFeatOkTst("uk.gov.dstl.baleen.types.common.Organisation");

  /**
   * initialize variables to correspond with Cas Type and Features
   *
   * @generated
   * @param jcas JCas
   * @param casType Type
   */
  public Organisation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());
  }
}
