/**
 */
package org.nasdanika.models.telemetry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the model object '<em><b>Resource Metrics</b></em>'.
 * @generated
 */
public interface ResourceMetrics extends EObject {

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * @return the value of the '<em><b>Resource</b></em>' containment reference.
	 * @see #setResource(Resource)
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.ResourceMetrics#getResource <em>Resource</em>}' containment reference.
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Scope Metrics</b></em>' containment reference list.
	 * @return the value of the '<em><b>Scope Metrics</b></em>' containment reference list.
	 * @generated
	 */
	EList<ScopeMetrics> getScopeMetrics();

	/**
	 * Returns the value of the '<em><b>Schema Url</b></em>' attribute.
	 * @return the value of the '<em><b>Schema Url</b></em>' attribute.
	 * @see #setSchemaUrl(String)
	 * @generated
	 */
	String getSchemaUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.ResourceMetrics#getSchemaUrl <em>Schema Url</em>}' attribute.
	 * @param value the new value of the '<em>Schema Url</em>' attribute.
	 * @see #getSchemaUrl()
	 * @generated
	 */
	void setSchemaUrl(String value);

} // ResourceMetrics
