/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.domainmodel.domainmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.domainmodel.domainmodel.Entity#getExample <em>Example</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.domainmodel.domainmodel.DomainmodelPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Agent
{
  /**
   * Returns the value of the '<em><b>Example</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.domainmodel.domainmodel.EntityExample}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Example</em>' containment reference list.
   * @see org.xtext.example.domainmodel.domainmodel.DomainmodelPackage#getEntity_Example()
   * @model containment="true"
   * @generated
   */
  EList<EntityExample> getExample();

} // Entity
