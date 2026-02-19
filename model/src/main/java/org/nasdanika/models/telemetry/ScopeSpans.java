/**
 */
package org.nasdanika.models.telemetry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the model object '<em><b>Scope Spans</b></em>'.
 * @generated
 */
public interface ScopeSpans extends EObject {

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * @return the value of the '<em><b>Scope</b></em>' containment reference.
	 * @see #setScope(InstrumentationScope)
	 * @generated
	 */
	InstrumentationScope getScope();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.ScopeSpans#getScope <em>Scope</em>}' containment reference.
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(InstrumentationScope value);

	/**
	 * Returns the value of the '<em><b>Spans</b></em>' containment reference list.
	 * @return the value of the '<em><b>Spans</b></em>' containment reference list.
	 * @generated
	 */
	EList<Span> getSpans();

	/**
	 * Returns the value of the '<em><b>Schema Url</b></em>' attribute.
	 * @return the value of the '<em><b>Schema Url</b></em>' attribute.
	 * @see #setSchemaUrl(String)
	 * @generated
	 */
	String getSchemaUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.ScopeSpans#getSchemaUrl <em>Schema Url</em>}' attribute.
	 * @param value the new value of the '<em>Schema Url</em>' attribute.
	 * @see #getSchemaUrl()
	 * @generated
	 */
	void setSchemaUrl(String value);

} // ScopeSpans
