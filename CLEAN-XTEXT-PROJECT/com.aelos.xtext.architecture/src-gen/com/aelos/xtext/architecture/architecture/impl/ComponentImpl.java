/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.architecture.architecture.impl;

import com.aelos.xtext.architecture.architecture.ArchitecturePackage;
import com.aelos.xtext.architecture.architecture.Component;
import com.aelos.xtext.architecture.architecture.Operation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.aelos.xtext.architecture.architecture.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.aelos.xtext.architecture.architecture.impl.ComponentImpl#getOps <em>Ops</em>}</li>
 *   <li>{@link com.aelos.xtext.architecture.architecture.impl.ComponentImpl#getOpsReq <em>Ops Req</em>}</li>
 *   <li>{@link com.aelos.xtext.architecture.architecture.impl.ComponentImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getOps() <em>Ops</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOps()
   * @generated
   * @ordered
   */
  protected EList<Operation> ops;

  /**
   * The cached value of the '{@link #getOpsReq() <em>Ops Req</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpsReq()
   * @generated
   * @ordered
   */
  protected EList<Operation> opsReq;

  /**
   * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperations()
   * @generated
   * @ordered
   */
  protected EList<Operation> operations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ArchitecturePackage.Literals.COMPONENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.COMPONENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operation> getOps()
  {
    if (ops == null)
    {
      ops = new EObjectResolvingEList<Operation>(Operation.class, this, ArchitecturePackage.COMPONENT__OPS);
    }
    return ops;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operation> getOpsReq()
  {
    if (opsReq == null)
    {
      opsReq = new EObjectResolvingEList<Operation>(Operation.class, this, ArchitecturePackage.COMPONENT__OPS_REQ);
    }
    return opsReq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operation> getOperations()
  {
    if (operations == null)
    {
      operations = new EObjectContainmentEList<Operation>(Operation.class, this, ArchitecturePackage.COMPONENT__OPERATIONS);
    }
    return operations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ArchitecturePackage.COMPONENT__OPERATIONS:
        return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ArchitecturePackage.COMPONENT__NAME:
        return getName();
      case ArchitecturePackage.COMPONENT__OPS:
        return getOps();
      case ArchitecturePackage.COMPONENT__OPS_REQ:
        return getOpsReq();
      case ArchitecturePackage.COMPONENT__OPERATIONS:
        return getOperations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ArchitecturePackage.COMPONENT__NAME:
        setName((String)newValue);
        return;
      case ArchitecturePackage.COMPONENT__OPS:
        getOps().clear();
        getOps().addAll((Collection<? extends Operation>)newValue);
        return;
      case ArchitecturePackage.COMPONENT__OPS_REQ:
        getOpsReq().clear();
        getOpsReq().addAll((Collection<? extends Operation>)newValue);
        return;
      case ArchitecturePackage.COMPONENT__OPERATIONS:
        getOperations().clear();
        getOperations().addAll((Collection<? extends Operation>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ArchitecturePackage.COMPONENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ArchitecturePackage.COMPONENT__OPS:
        getOps().clear();
        return;
      case ArchitecturePackage.COMPONENT__OPS_REQ:
        getOpsReq().clear();
        return;
      case ArchitecturePackage.COMPONENT__OPERATIONS:
        getOperations().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ArchitecturePackage.COMPONENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ArchitecturePackage.COMPONENT__OPS:
        return ops != null && !ops.isEmpty();
      case ArchitecturePackage.COMPONENT__OPS_REQ:
        return opsReq != null && !opsReq.isEmpty();
      case ArchitecturePackage.COMPONENT__OPERATIONS:
        return operations != null && !operations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ComponentImpl
