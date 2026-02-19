/**
 */
package org.nasdanika.models.telemetry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the model object '<em><b>Span Link</b></em>'.
 * @generated
 */
public interface SpanLink extends EObject {

	/**
	 * Returns the value of the '<em><b>Trace Id</b></em>' attribute.
	 * @return the value of the '<em><b>Trace Id</b></em>' attribute.
	 * @see #setTraceId(String)
	 * @generated
	 */
	String getTraceId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.SpanLink#getTraceId <em>Trace Id</em>}' attribute.
	 * @param value the new value of the '<em>Trace Id</em>' attribute.
	 * @see #getTraceId()
	 * @generated
	 */
	void setTraceId(String value);

	/**
	 * Returns the value of the '<em><b>Span Id</b></em>' attribute.
	 * @return the value of the '<em><b>Span Id</b></em>' attribute.
	 * @see #setSpanId(String)
	 * @generated
	 */
	String getSpanId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.SpanLink#getSpanId <em>Span Id</em>}' attribute.
	 * @param value the new value of the '<em>Span Id</em>' attribute.
	 * @see #getSpanId()
	 * @generated
	 */
	void setSpanId(String value);

	/**
	 * Returns the value of the '<em><b>Trace State</b></em>' attribute.
	 * @return the value of the '<em><b>Trace State</b></em>' attribute.
	 * @see #setTraceState(String)
	 * @generated
	 */
	String getTraceState();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.SpanLink#getTraceState <em>Trace State</em>}' attribute.
	 * @param value the new value of the '<em>Trace State</em>' attribute.
	 * @see #getTraceState()
	 * @generated
	 */
	void setTraceState(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * @return the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * @generated
	 */
	EList<KeyValue> getAttributes();

	/**
	 * Returns the value of the '<em><b>Dropped Attributes Count</b></em>' attribute.
	 * @return the value of the '<em><b>Dropped Attributes Count</b></em>' attribute.
	 * @see #setDroppedAttributesCount(int)
	 * @generated
	 */
	int getDroppedAttributesCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.SpanLink#getDroppedAttributesCount <em>Dropped Attributes Count</em>}' attribute.
	 * @param value the new value of the '<em>Dropped Attributes Count</em>' attribute.
	 * @see #getDroppedAttributesCount()
	 * @generated
	 */
	void setDroppedAttributesCount(int value);

	/**
	 * Returns the value of the '<em><b>Flags</b></em>' attribute.
	 * @return the value of the '<em><b>Flags</b></em>' attribute.
	 * @see #setFlags(int)
	 * @generated
	 */
	int getFlags();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.SpanLink#getFlags <em>Flags</em>}' attribute.
	 * @param value the new value of the '<em>Flags</em>' attribute.
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(int value);

} // SpanLink
