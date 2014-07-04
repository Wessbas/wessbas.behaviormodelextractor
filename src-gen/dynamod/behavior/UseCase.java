/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dynamod.behavior;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dynamod.behavior.UseCase#getId <em>Id</em>}</li>
 *   <li>{@link dynamod.behavior.UseCase#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see dynamod.behavior.BehaviorPackage#getUseCase()
 * @model
 * @generated
 */
public interface UseCase extends EObject {
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see dynamod.behavior.BehaviorPackage#getUseCase_Id()
     * @model default="" required="true"
     *        extendedMetaData="namespace=''"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link dynamod.behavior.UseCase#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

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
     * @see dynamod.behavior.BehaviorPackage#getUseCase_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link dynamod.behavior.UseCase#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // UseCase