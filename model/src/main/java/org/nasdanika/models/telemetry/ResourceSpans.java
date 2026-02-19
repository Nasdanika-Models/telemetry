/**
 */
package org.nasdanika.models.telemetry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the model object '<em><b>Resource Spans</b></em>'.
 * @generated
 */
public interface ResourceSpans extends EObject {

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * @return the value of the '<em><b>Resource</b></em>' containment reference.
	 * @see #setResource(Resource)
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.ResourceSpans#getResource <em>Resource</em>}' containment reference.
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Scope Spans</b></em>' containment reference list.
	 * @return the value of the '<em><b>Scope Spans</b></em>' containment reference list.
	 * @generated
	 */
	EList<ScopeSpans> getScopeSpans();

	/**
	 * Returns the value of the '<em><b>Schema Url</b></em>' attribute.
	 * @return the value of the '<em><b>Schema Url</b></em>' attribute.
	 * @see #setSchemaUrl(String)
	 * @generated
	 */
	String getSchemaUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.ResourceSpans#getSchemaUrl <em>Schema Url</em>}' attribute.
	 * @param value the new value of the '<em>Schema Url</em>' attribute.
	 * @see #getSchemaUrl()
	 * @generated
	 */
	void setSchemaUrl(String value);

} // ResourceSpans
