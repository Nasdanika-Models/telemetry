/**
 */
package org.nasdanika.models.telemetry;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope Spans</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of Spans produced by an InstrumentationScope.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.telemetry.ScopeSpans#getScope <em>Scope</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.ScopeSpans#getSpans <em>Spans</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.ScopeSpans#getSchemaUrl <em>Schema Url</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.telemetry.TelemetryPackage#getScopeSpans()
 * @model
 * @generated
 */
public interface ScopeSpans extends EObject {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The instrumentation scope information for the spans in this message. Semantically when InstrumentationScope isn't set, it is equivalent with an empty instrumentation scope name (unknown).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference.
	 * @see #setScope(InstrumentationScope)
	 * @see org.nasdanika.models.telemetry.TelemetryPackage#getScopeSpans_Scope()
	 * @model containment="true"
	 * @generated
	 */
	InstrumentationScope getScope();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.ScopeSpans#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(InstrumentationScope value);

	/**
	 * Returns the value of the '<em><b>Spans</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.telemetry.Span}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of Spans that originate from an instrumentation scope.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spans</em>' containment reference list.
	 * @see org.nasdanika.models.telemetry.TelemetryPackage#getScopeSpans_Spans()
	 * @model containment="true"
	 * @generated
	 */
	EList<Span> getSpans();

	/**
	 * Returns the value of the '<em><b>Schema Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Url</em>' attribute.
	 * @see #setSchemaUrl(String)
	 * @see org.nasdanika.models.telemetry.TelemetryPackage#getScopeSpans_SchemaUrl()
	 * @model unique="false"
	 * @generated
	 */
	String getSchemaUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.ScopeSpans#getSchemaUrl <em>Schema Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Url</em>' attribute.
	 * @see #getSchemaUrl()
	 * @generated
	 */
	void setSchemaUrl(String value);

} // ScopeSpans
