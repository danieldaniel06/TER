/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.architecture.architecture;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.aelos.xtext.architecture.architecture.ArchitectureFactory
 * @model kind="package"
 * @generated
 */
public interface ArchitecturePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "architecture";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.aelos.com/xtext/architecture/Architecture";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "architecture";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ArchitecturePackage eINSTANCE = com.aelos.xtext.architecture.architecture.impl.ArchitecturePackageImpl.init();

  /**
   * The meta object id for the '{@link com.aelos.xtext.architecture.architecture.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.aelos.xtext.architecture.architecture.impl.ModelImpl
   * @see com.aelos.xtext.architecture.architecture.impl.ArchitecturePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Greetings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__GREETINGS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.aelos.xtext.architecture.architecture.impl.GreetingImpl <em>Greeting</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.aelos.xtext.architecture.architecture.impl.GreetingImpl
   * @see com.aelos.xtext.architecture.architecture.impl.ArchitecturePackageImpl#getGreeting()
   * @generated
   */
  int GREETING = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREETING__NAME = 0;

  /**
   * The number of structural features of the '<em>Greeting</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREETING_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link com.aelos.xtext.architecture.architecture.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.aelos.xtext.architecture.architecture.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.aelos.xtext.architecture.architecture.Model#getGreetings <em>Greetings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Greetings</em>'.
   * @see com.aelos.xtext.architecture.architecture.Model#getGreetings()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Greetings();

  /**
   * Returns the meta object for class '{@link com.aelos.xtext.architecture.architecture.Greeting <em>Greeting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greeting</em>'.
   * @see com.aelos.xtext.architecture.architecture.Greeting
   * @generated
   */
  EClass getGreeting();

  /**
   * Returns the meta object for the attribute '{@link com.aelos.xtext.architecture.architecture.Greeting#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.aelos.xtext.architecture.architecture.Greeting#getName()
   * @see #getGreeting()
   * @generated
   */
  EAttribute getGreeting_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ArchitectureFactory getArchitectureFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.aelos.xtext.architecture.architecture.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.aelos.xtext.architecture.architecture.impl.ModelImpl
     * @see com.aelos.xtext.architecture.architecture.impl.ArchitecturePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Greetings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__GREETINGS = eINSTANCE.getModel_Greetings();

    /**
     * The meta object literal for the '{@link com.aelos.xtext.architecture.architecture.impl.GreetingImpl <em>Greeting</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.aelos.xtext.architecture.architecture.impl.GreetingImpl
     * @see com.aelos.xtext.architecture.architecture.impl.ArchitecturePackageImpl#getGreeting()
     * @generated
     */
    EClass GREETING = eINSTANCE.getGreeting();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GREETING__NAME = eINSTANCE.getGreeting_Name();

  }

} //ArchitecturePackage
