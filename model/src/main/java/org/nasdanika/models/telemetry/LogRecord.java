/**
 */
package org.nasdanika.models.telemetry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the model object '<em><b>Log Record</b></em>'.
 * @generated
 */
public interface LogRecord extends EObject {

	/**
	 * Returns the value of the '<em><b>Time Unix Nano</b></em>' attribute.
	 * @return the value of the '<em><b>Time Unix Nano</b></em>' attribute.
	 * @see #setTimeUnixNano(long)
	 * @generated
	 */
	long getTimeUnixNano();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.LogRecord#getTimeUnixNano <em>Time Unix Nano</em>}' attribute.
	 * @param value the new value of the '<em>Time Unix Nano</em>' attribute.
	 * @see #getTimeUnixNano()
	 * @generated
	 */
	void setTimeUnixNano(long value);

	/**
	 * Returns the value of the '<em><b>Observed Time Unix Nano</b></em>' attribute.
	 * @return the value of the '<em><b>Observed Time Unix Nano</b></em>' attribute.
	 * @see #setObservedTimeUnixNano(long)
	 * @generated
	 */
	long getObservedTimeUnixNano();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.LogRecord#getObservedTimeUnixNano <em>Observed Time Unix Nano</em>}' attribute.
	 * @param value the new value of the '<em>Observed Time Unix Nano</em>' attribute.
	 * @see #getObservedTimeUnixNano()
	 * @generated
	 */
	void setObservedTimeUnixNano(long value);

	/**
	 * Returns the value of the '<em><b>Severity Number</b></em>' attribute.
	 * @return the value of the '<em><b>Severity Number</b></em>' attribute.
	 * @see #setSeverityNumber(SeverityNumber)
	 * @generated
	 */
	SeverityNumber getSeverityNumber();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.LogRecord#getSeverityNumber <em>Severity Number</em>}' attribute.
	 * @param value the new value of the '<em>Severity Number</em>' attribute.
	 * @see #getSeverityNumber()
	 * @generated
	 */
	void setSeverityNumber(SeverityNumber value);

	/**
	 * Returns the value of the '<em><b>Severity Text</b></em>' attribute.
	 * @return the value of the '<em><b>Severity Text</b></em>' attribute.
	 * @see #setSeverityText(String)
	 * @generated
	 */
	String getSeverityText();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.LogRecord#getSeverityText <em>Severity Text</em>}' attribute.
	 * @param value the new value of the '<em>Severity Text</em>' attribute.
	 * @see #getSeverityText()
	 * @generated
	 */
	void setSeverityText(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * @return the value of the '<em><b>Body</b></em>' containment reference.
	 * @see #setBody(AnyValue)
	 * @generated
	 */
	AnyValue getBody();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.LogRecord#getBody <em>Body</em>}' containment reference.
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(AnyValue value);

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
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.LogRecord#getDroppedAttributesCount <em>Dropped Attributes Count</em>}' attribute.
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
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.LogRecord#getFlags <em>Flags</em>}' attribute.
	 * @param value the new value of the '<em>Flags</em>' attribute.
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(int value);

	/**
	 * Returns the value of the '<em><b>Trace Id</b></em>' attribute.
	 * @return the value of the '<em><b>Trace Id</b></em>' attribute.
	 * @see #setTraceId(String)
	 * @generated
	 */
	String getTraceId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.LogRecord#getTraceId <em>Trace Id</em>}' attribute.
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
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.LogRecord#getSpanId <em>Span Id</em>}' attribute.
	 * @param value the new value of the '<em>Span Id</em>' attribute.
	 * @see #getSpanId()
	 * @generated
	 */
	void setSpanId(String value);

} // LogRecord
