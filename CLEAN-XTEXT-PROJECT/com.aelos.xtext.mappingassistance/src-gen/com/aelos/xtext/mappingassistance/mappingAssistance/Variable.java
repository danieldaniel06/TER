/**
 * generated by Xtext 2.13.0
 */
package com.aelos.xtext.mappingassistance.mappingAssistance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.aelos.xtext.mappingassistance.mappingAssistance.Variable#getName <em>Name</em>}</li>
 *   <li>{@link com.aelos.xtext.mappingassistance.mappingAssistance.Variable#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistancePackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistancePackage#getVariable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.aelos.xtext.mappingassistance.mappingAssistance.Variable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link com.aelos.xtext.mappingassistance.mappingAssistance.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see com.aelos.xtext.mappingassistance.mappingAssistance.Type
   * @see #setType(Type)
   * @see com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistancePackage#getVariable_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link com.aelos.xtext.mappingassistance.mappingAssistance.Variable#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see com.aelos.xtext.mappingassistance.mappingAssistance.Type
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // Variable