/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.testintentionsassistance.testintentionsAssistance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inst</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Inst#getVariable <em>Variable</em>}</li>
 *   <li>{@link com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Inst#getValeur <em>Valeur</em>}</li>
 * </ul>
 *
 * @see com.aelos.xtext.testintentionsassistance.testintentionsAssistance.TestintentionsAssistancePackage#getInst()
 * @model
 * @generated
 */
public interface Inst extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
   * The list contents are of type {@link com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference list.
   * @see com.aelos.xtext.testintentionsassistance.testintentionsAssistance.TestintentionsAssistancePackage#getInst_Variable()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getVariable();

  /**
   * Returns the value of the '<em><b>Valeur</b></em>' containment reference list.
   * The list contents are of type {@link com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valeur</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valeur</em>' containment reference list.
   * @see com.aelos.xtext.testintentionsassistance.testintentionsAssistance.TestintentionsAssistancePackage#getInst_Valeur()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getValeur();

} // Inst