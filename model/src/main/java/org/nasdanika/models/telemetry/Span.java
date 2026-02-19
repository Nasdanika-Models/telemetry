/**
 */
package org.nasdanika.models.telemetry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the model object '<em><b>Span</b></em>'.
 * @generated
 */
public interface Span extends EObject {

	/**
	 * Returns the value of the '<em><b>Trace Id</b></em>' attribute.
	 * @return the value of the '<em><b>Trace Id</b></em>' attribute.
	 * @see #setTraceId(String)
	 * @generated
	 */
	String getTraceId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.Span#getTraceId <em>Trace Id</em>}' attribute.
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
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.Span#getSpanId <em>Span Id</em>}' attribute.
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
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.Span#getTraceState <em>Trace State</em>}' attribute.
	 * @param value the new value of the '<em>Trace State</em>' attribute.
	 * @see #getTraceState()
	 * @generated
	 */
	void setTraceState(String value);

	/**
	 * Returns the value of the '<em><b>Parent Span Id</b></em>' attribute.
	 * @return the value of the '<em><b>Parent Span Id</b></em>' attribute.
	 * @see #setParentSpanId(String)
	 * @generated
	 */
	String getParentSpanId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.Span#getParentSpanId <em>Parent Span Id</em>}' attribute.
	 * @param value the new value of the '<em>Parent Span Id</em>' attribute.
	 * @see #getParentSpanId()
	 * @generated
	 */
	void setParentSpanId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * @return the value of the '<em><b>Name</b></em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.Span#getName <em>Name</em>}' attribute.
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * @return the value of the '<em><b>Kind</b></em>' attribute.
	 * @see #setKind(SpanKind)
	 * @generated
	 */
	SpanKind getKind();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.Span#getKind <em>Kind</em>}' attribute.
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(SpanKind value);

	/**
	 * Returns the value of the '<em><b>Start Time Unix Nano</b></em>' attribute.
	 * @return the value of the '<em><b>Start Time Unix Nano</b></em>' attribute.
	 * @see #setStartTimeUnixNano(long)
	 * @generated
	 */
	long getStartTimeUnixNano();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.Span#getStartTimeUnixNano <em>Start Time Unix Nano</em>}' attribute.
	 * @param value the new value of the '<em>Start Time Unix Nano</em>' attribute.
	 * @see #getStartTimeUnixNano()
	 * @generated
	 */
	void setStartTimeUnixNano(long value);

	/**
	 * Returns the value of the '<em><b>End Time Unix Nano</b></em>' attribute.
	 * @return the value of the '<em><b>End Time Unix Nano</b></em>' attribute.
	 * @see #setEndTimeUnixNano(long)
	 * @generated
	 */
	long getEndTimeUnixNano();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.Span#getEndTimeUnixNano <em>End Time Unix Nano</em>}' attribute.
	 * @param value the new value of the '<em>End Time Unix Nano</em>' attribute.
	 * @see #getEndTimeUnixNano()
	 * @generated
	 */
	void setEndTimeUnixNano(long value);

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
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.Span#getDroppedAttributesCount <em>Dropped Attributes Count</em>}' attribute.
	 * @param value the new value of the '<em>Dropped Attributes Count</em>' attribute.
	 * @see #getDroppedAttributesCount()
	 * @generated
	 */
	void setDroppedAttributesCount(int value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * @return the value of the '<em><b>Events</b></em>' containment reference list.
	 * @generated
	 */
	EList<SpanEvent> getEvents();

	/**
	 * Returns the value of the '<em><b>Dropped Events Count</b></em>' attribute.
	 * @return the value of the '<em><b>Dropped Events Count</b></em>' attribute.
	 * @see #setDroppedEventsCount(int)
	 * @generated
	 */
	int getDroppedEventsCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.Span#getDroppedEventsCount <em>Dropped Events Count</em>}' attribute.
	 * @param value the new value of the '<em>Dropped Events Count</em>' attribute.
	 * @see #getDroppedEventsCount()
	 * @generated
	 */
	void setDroppedEventsCount(int value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * @return the value of the '<em><b>Links</b></em>' containment reference list.
	 * @generated
	 */
	EList<SpanLink> getLinks();

	/**
	 * Returns the value of the '<em><b>Dropped Links Count</b></em>' attribute.
	 * @return the value of the '<em><b>Dropped Links Count</b></em>' attribute.
	 * @see #setDroppedLinksCount(int)
	 * @generated
	 */
	int getDroppedLinksCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.Span#getDroppedLinksCount <em>Dropped Links Count</em>}' attribute.
	 * @param value the new value of the '<em>Dropped Links Count</em>' attribute.
	 * @see #getDroppedLinksCount()
	 * @generated
	 */
	void setDroppedLinksCount(int value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * @return the value of the '<em><b>Status</b></em>' containment reference.
	 * @see #setStatus(SpanStatus)
	 * @generated
	 */
	SpanStatus getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.Span#getStatus <em>Status</em>}' containment reference.
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(SpanStatus value);

	/**
	 * Returns the value of the '<em><b>Flags</b></em>' attribute.
	 * @return the value of the '<em><b>Flags</b></em>' attribute.
	 * @see #setFlags(int)
	 * @generated
	 */
	int getFlags();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.Span#getFlags <em>Flags</em>}' attribute.
	 * @param value the new value of the '<em>Flags</em>' attribute.
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(int value);

} // Span
