/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.domainmodel.domainmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.domainmodel.domainmodel.DomainmodelPackage;
import org.xtext.example.domainmodel.domainmodel.Intent;
import org.xtext.example.domainmodel.domainmodel.IsFollowUp;
import org.xtext.example.domainmodel.domainmodel.Question;
import org.xtext.example.domainmodel.domainmodel.Training;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.domainmodel.domainmodel.impl.IntentImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.xtext.example.domainmodel.domainmodel.impl.IntentImpl#getIsFollowUp <em>Is Follow Up</em>}</li>
 *   <li>{@link org.xtext.example.domainmodel.domainmodel.impl.IntentImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.xtext.example.domainmodel.domainmodel.impl.IntentImpl#getTraining <em>Training</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntentImpl extends AgentImpl implements Intent
{
  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected Intent superType;

  /**
   * The cached value of the '{@link #getIsFollowUp() <em>Is Follow Up</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsFollowUp()
   * @generated
   * @ordered
   */
  protected IsFollowUp isFollowUp;

  /**
   * The cached value of the '{@link #getQuestion() <em>Question</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuestion()
   * @generated
   * @ordered
   */
  protected EList<Question> question;

  /**
   * The cached value of the '{@link #getTraining() <em>Training</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTraining()
   * @generated
   * @ordered
   */
  protected Training training;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntentImpl()
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
    return DomainmodelPackage.Literals.INTENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Intent getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (Intent)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainmodelPackage.INTENT__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Intent basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSuperType(Intent newSuperType)
  {
    Intent oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.INTENT__SUPER_TYPE, oldSuperType, superType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IsFollowUp getIsFollowUp()
  {
    return isFollowUp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIsFollowUp(IsFollowUp newIsFollowUp, NotificationChain msgs)
  {
    IsFollowUp oldIsFollowUp = isFollowUp;
    isFollowUp = newIsFollowUp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.INTENT__IS_FOLLOW_UP, oldIsFollowUp, newIsFollowUp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIsFollowUp(IsFollowUp newIsFollowUp)
  {
    if (newIsFollowUp != isFollowUp)
    {
      NotificationChain msgs = null;
      if (isFollowUp != null)
        msgs = ((InternalEObject)isFollowUp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.INTENT__IS_FOLLOW_UP, null, msgs);
      if (newIsFollowUp != null)
        msgs = ((InternalEObject)newIsFollowUp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.INTENT__IS_FOLLOW_UP, null, msgs);
      msgs = basicSetIsFollowUp(newIsFollowUp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.INTENT__IS_FOLLOW_UP, newIsFollowUp, newIsFollowUp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Question> getQuestion()
  {
    if (question == null)
    {
      question = new EObjectContainmentEList<Question>(Question.class, this, DomainmodelPackage.INTENT__QUESTION);
    }
    return question;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Training getTraining()
  {
    return training;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTraining(Training newTraining, NotificationChain msgs)
  {
    Training oldTraining = training;
    training = newTraining;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.INTENT__TRAINING, oldTraining, newTraining);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTraining(Training newTraining)
  {
    if (newTraining != training)
    {
      NotificationChain msgs = null;
      if (training != null)
        msgs = ((InternalEObject)training).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.INTENT__TRAINING, null, msgs);
      if (newTraining != null)
        msgs = ((InternalEObject)newTraining).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.INTENT__TRAINING, null, msgs);
      msgs = basicSetTraining(newTraining, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.INTENT__TRAINING, newTraining, newTraining));
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
      case DomainmodelPackage.INTENT__IS_FOLLOW_UP:
        return basicSetIsFollowUp(null, msgs);
      case DomainmodelPackage.INTENT__QUESTION:
        return ((InternalEList<?>)getQuestion()).basicRemove(otherEnd, msgs);
      case DomainmodelPackage.INTENT__TRAINING:
        return basicSetTraining(null, msgs);
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
      case DomainmodelPackage.INTENT__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case DomainmodelPackage.INTENT__IS_FOLLOW_UP:
        return getIsFollowUp();
      case DomainmodelPackage.INTENT__QUESTION:
        return getQuestion();
      case DomainmodelPackage.INTENT__TRAINING:
        return getTraining();
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
      case DomainmodelPackage.INTENT__SUPER_TYPE:
        setSuperType((Intent)newValue);
        return;
      case DomainmodelPackage.INTENT__IS_FOLLOW_UP:
        setIsFollowUp((IsFollowUp)newValue);
        return;
      case DomainmodelPackage.INTENT__QUESTION:
        getQuestion().clear();
        getQuestion().addAll((Collection<? extends Question>)newValue);
        return;
      case DomainmodelPackage.INTENT__TRAINING:
        setTraining((Training)newValue);
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
      case DomainmodelPackage.INTENT__SUPER_TYPE:
        setSuperType((Intent)null);
        return;
      case DomainmodelPackage.INTENT__IS_FOLLOW_UP:
        setIsFollowUp((IsFollowUp)null);
        return;
      case DomainmodelPackage.INTENT__QUESTION:
        getQuestion().clear();
        return;
      case DomainmodelPackage.INTENT__TRAINING:
        setTraining((Training)null);
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
      case DomainmodelPackage.INTENT__SUPER_TYPE:
        return superType != null;
      case DomainmodelPackage.INTENT__IS_FOLLOW_UP:
        return isFollowUp != null;
      case DomainmodelPackage.INTENT__QUESTION:
        return question != null && !question.isEmpty();
      case DomainmodelPackage.INTENT__TRAINING:
        return training != null;
    }
    return super.eIsSet(featureID);
  }

} //IntentImpl