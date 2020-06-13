/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.domainmodel.domainmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.domainmodel.domainmodel.DomainmodelPackage;
import org.xtext.example.domainmodel.domainmodel.Intent;
import org.xtext.example.domainmodel.domainmodel.IsFollowUp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Is Follow Up</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.domainmodel.domainmodel.impl.IsFollowUpImpl#getIntent <em>Intent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IsFollowUpImpl extends MinimalEObjectImpl.Container implements IsFollowUp
{
  /**
   * The cached value of the '{@link #getIntent() <em>Intent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntent()
   * @generated
   * @ordered
   */
  protected Intent intent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IsFollowUpImpl()
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
    return DomainmodelPackage.Literals.IS_FOLLOW_UP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Intent getIntent()
  {
    if (intent != null && intent.eIsProxy())
    {
      InternalEObject oldIntent = (InternalEObject)intent;
      intent = (Intent)eResolveProxy(oldIntent);
      if (intent != oldIntent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainmodelPackage.IS_FOLLOW_UP__INTENT, oldIntent, intent));
      }
    }
    return intent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Intent basicGetIntent()
  {
    return intent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIntent(Intent newIntent)
  {
    Intent oldIntent = intent;
    intent = newIntent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.IS_FOLLOW_UP__INTENT, oldIntent, intent));
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
      case DomainmodelPackage.IS_FOLLOW_UP__INTENT:
        if (resolve) return getIntent();
        return basicGetIntent();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DomainmodelPackage.IS_FOLLOW_UP__INTENT:
        setIntent((Intent)newValue);
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
      case DomainmodelPackage.IS_FOLLOW_UP__INTENT:
        setIntent((Intent)null);
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
      case DomainmodelPackage.IS_FOLLOW_UP__INTENT:
        return intent != null;
    }
    return super.eIsSet(featureID);
  }

} //IsFollowUpImpl