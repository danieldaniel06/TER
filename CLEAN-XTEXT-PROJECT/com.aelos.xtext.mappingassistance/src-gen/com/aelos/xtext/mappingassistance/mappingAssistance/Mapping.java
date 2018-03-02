/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.mappingassistance.mappingAssistance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.aelos.xtext.mappingassistance.mappingAssistance.Mapping#getNameVarMode <em>Name Var Mode</em>}</li>
 *   <li>{@link com.aelos.xtext.mappingassistance.mappingAssistance.Mapping#getNameVarTest <em>Name Var Test</em>}</li>
 * </ul>
 *
 * @see com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistancePackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject
{
  /**
   * Returns the value of the '<em><b>Name Var Mode</b></em>' reference list.
   * The list contents are of type {@link com.aelos.xtext.mappingassistance.mappingAssistance.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Var Mode</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Var Mode</em>' reference list.
   * @see com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistancePackage#getMapping_NameVarMode()
   * @model
   * @generated
   */
  EList<Variable> getNameVarMode();

  /**
   * Returns the value of the '<em><b>Name Var Test</b></em>' reference list.
   * The list contents are of type {@link com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Var Test</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Var Test</em>' reference list.
   * @see com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistancePackage#getMapping_NameVarTest()
   * @model
   * @generated
   */
  EList<com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Variable> getNameVarTest();

} // Mapping
