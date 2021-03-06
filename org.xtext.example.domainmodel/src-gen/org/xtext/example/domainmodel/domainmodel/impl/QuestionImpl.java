/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.domainmodel.domainmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.domainmodel.domainmodel.DomainmodelPackage;
import org.xtext.example.domainmodel.domainmodel.Question;
import org.xtext.example.domainmodel.domainmodel.QuestionEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.domainmodel.domainmodel.impl.QuestionImpl#getQuestionEntity <em>Question Entity</em>}</li>
 *   <li>{@link org.xtext.example.domainmodel.domainmodel.impl.QuestionImpl#getPrompt <em>Prompt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionImpl extends MinimalEObjectImpl.Container implements Question
{
  /**
   * The cached value of the '{@link #getQuestionEntity() <em>Question Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuestionEntity()
   * @generated
   * @ordered
   */
  protected QuestionEntity questionEntity;

  /**
   * The default value of the '{@link #getPrompt() <em>Prompt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrompt()
   * @generated
   * @ordered
   */
  protected static final String PROMPT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrompt() <em>Prompt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrompt()
   * @generated
   * @ordered
   */
  protected String prompt = PROMPT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuestionImpl()
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
    return DomainmodelPackage.Literals.QUESTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public QuestionEntity getQuestionEntity()
  {
    return questionEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuestionEntity(QuestionEntity newQuestionEntity, NotificationChain msgs)
  {
    QuestionEntity oldQuestionEntity = questionEntity;
    questionEntity = newQuestionEntity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainmodelPackage.QUESTION__QUESTION_ENTITY, oldQuestionEntity, newQuestionEntity);
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
  public void setQuestionEntity(QuestionEntity newQuestionEntity)
  {
    if (newQuestionEntity != questionEntity)
    {
      NotificationChain msgs = null;
      if (questionEntity != null)
        msgs = ((InternalEObject)questionEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.QUESTION__QUESTION_ENTITY, null, msgs);
      if (newQuestionEntity != null)
        msgs = ((InternalEObject)newQuestionEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainmodelPackage.QUESTION__QUESTION_ENTITY, null, msgs);
      msgs = basicSetQuestionEntity(newQuestionEntity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.QUESTION__QUESTION_ENTITY, newQuestionEntity, newQuestionEntity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPrompt()
  {
    return prompt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPrompt(String newPrompt)
  {
    String oldPrompt = prompt;
    prompt = newPrompt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.QUESTION__PROMPT, oldPrompt, prompt));
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
      case DomainmodelPackage.QUESTION__QUESTION_ENTITY:
        return basicSetQuestionEntity(null, msgs);
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
      case DomainmodelPackage.QUESTION__QUESTION_ENTITY:
        return getQuestionEntity();
      case DomainmodelPackage.QUESTION__PROMPT:
        return getPrompt();
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
      case DomainmodelPackage.QUESTION__QUESTION_ENTITY:
        setQuestionEntity((QuestionEntity)newValue);
        return;
      case DomainmodelPackage.QUESTION__PROMPT:
        setPrompt((String)newValue);
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
      case DomainmodelPackage.QUESTION__QUESTION_ENTITY:
        setQuestionEntity((QuestionEntity)null);
        return;
      case DomainmodelPackage.QUESTION__PROMPT:
        setPrompt(PROMPT_EDEFAULT);
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
      case DomainmodelPackage.QUESTION__QUESTION_ENTITY:
        return questionEntity != null;
      case DomainmodelPackage.QUESTION__PROMPT:
        return PROMPT_EDEFAULT == null ? prompt != null : !PROMPT_EDEFAULT.equals(prompt);
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
    result.append(" (prompt: ");
    result.append(prompt);
    result.append(')');
    return result.toString();
  }

} //QuestionImpl
