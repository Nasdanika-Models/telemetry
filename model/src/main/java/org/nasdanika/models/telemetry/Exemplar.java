/**
 */
package org.nasdanika.models.telemetry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the model object '<em><b>Exemplar</b></em>'.
 * @generated
 */
public interface Exemplar extends EObject {

	/**
	 * Returns the value of the '<em><b>Filtered Attributes</b></em>' containment reference list.
	 * @return the value of the '<em><b>Filtered Attributes</b></em>' containment reference list.
	 * @generated
	 */
	EList<KeyValue> getFilteredAttributes();

	/**
	 * Returns the value of the '<em><b>Time Unix Nano</b></em>' attribute.
	 * @return the value of the '<em><b>Time Unix Nano</b></em>' attribute.
	 * @see #setTimeUnixNano(long)
	 * @generated
	 */
	long getTimeUnixNano();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.Exemplar#getTimeUnixNano <em>Time Unix Nano</em>}' attribute.
	 * @param value the new value of the '<em>Time Unix Nano</em>' attribute.
	 * @see #getTimeUnixNano()
	 * @generated
	 */
	void setTimeUnixNano(long value);

	/**
	 * Returns the value of the '<em><b>As Double</b></em>' attribute.
	 * @return the value of the '<em><b>As Double</b></em>' attribute.
	 * @see #setAsDouble(Double)
	 * @generated
	 */
	Double getAsDouble();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.Exemplar#getAsDouble <em>As Double</em>}' attribute.
	 * @param value the new value of the '<em>As Double</em>' attribute.
	 * @see #getAsDouble()
	 * @generated
	 */
	void setAsDouble(Double value);

	/**
	 * Returns the value of the '<em><b>As Int</b></em>' attribute.
	 * @return the value of the '<em><b>As Int</b></em>' attribute.
	 * @see #setAsInt(Long)
	 * @generated
	 */
	Long getAsInt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.Exemplar#getAsInt <em>As Int</em>}' attribute.
	 * @param value the new value of the '<em>As Int</em>' attribute.
	 * @see #getAsInt()
	 * @generated
	 */
	void setAsInt(Long value);

	/**
	 * Returns the value of the '<em><b>Span Id</b></em>' attribute.
	 * @return the value of the '<em><b>Span Id</b></em>' attribute.
	 * @see #setSpanId(String)
	 * @generated
	 */
	String getSpanId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.Exemplar#getSpanId <em>Span Id</em>}' attribute.
	 * @param value the new value of the '<em>Span Id</em>' attribute.
	 * @see #getSpanId()
	 * @generated
	 */
	void setSpanId(String value);

	/**
	 * Returns the value of the '<em><b>Trace Id</b></em>' attribute.
	 * @return the value of the '<em><b>Trace Id</b></em>' attribute.
	 * @see #setTraceId(String)
	 * @generated
	 */
	String getTraceId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.Exemplar#getTraceId <em>Trace Id</em>}' attribute.
	 * @param value the new value of the '<em>Trace Id</em>' attribute.
	 * @see #getTraceId()
	 * @generated
	 */
	void setTraceId(String value);

} // Exemplar
