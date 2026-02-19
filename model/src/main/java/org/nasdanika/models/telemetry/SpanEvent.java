/**
 */
package org.nasdanika.models.telemetry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the model object '<em><b>Span Event</b></em>'.
 * @generated
 */
public interface SpanEvent extends EObject {

	/**
	 * Returns the value of the '<em><b>Time Unix Nano</b></em>' attribute.
	 * @return the value of the '<em><b>Time Unix Nano</b></em>' attribute.
	 * @see #setTimeUnixNano(long)
	 * @generated
	 */
	long getTimeUnixNano();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.SpanEvent#getTimeUnixNano <em>Time Unix Nano</em>}' attribute.
	 * @param value the new value of the '<em>Time Unix Nano</em>' attribute.
	 * @see #getTimeUnixNano()
	 * @generated
	 */
	void setTimeUnixNano(long value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * @return the value of the '<em><b>Name</b></em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.SpanEvent#getName <em>Name</em>}' attribute.
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.SpanEvent#getDroppedAttributesCount <em>Dropped Attributes Count</em>}' attribute.
	 * @param value the new value of the '<em>Dropped Attributes Count</em>' attribute.
	 * @see #getDroppedAttributesCount()
	 * @generated
	 */
	void setDroppedAttributesCount(int value);

} // SpanEvent
