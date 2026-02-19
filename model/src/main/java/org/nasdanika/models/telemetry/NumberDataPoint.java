/**
 */
package org.nasdanika.models.telemetry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the model object '<em><b>Number Data Point</b></em>'.
 * @generated
 */
public interface NumberDataPoint extends EObject {

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * @return the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * @generated
	 */
	EList<KeyValue> getAttributes();

	/**
	 * Returns the value of the '<em><b>Start Time Unix Nano</b></em>' attribute.
	 * @return the value of the '<em><b>Start Time Unix Nano</b></em>' attribute.
	 * @see #setStartTimeUnixNano(long)
	 * @generated
	 */
	long getStartTimeUnixNano();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.NumberDataPoint#getStartTimeUnixNano <em>Start Time Unix Nano</em>}' attribute.
	 * @param value the new value of the '<em>Start Time Unix Nano</em>' attribute.
	 * @see #getStartTimeUnixNano()
	 * @generated
	 */
	void setStartTimeUnixNano(long value);

	/**
	 * Returns the value of the '<em><b>Time Unix Nano</b></em>' attribute.
	 * @return the value of the '<em><b>Time Unix Nano</b></em>' attribute.
	 * @see #setTimeUnixNano(long)
	 * @generated
	 */
	long getTimeUnixNano();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.NumberDataPoint#getTimeUnixNano <em>Time Unix Nano</em>}' attribute.
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
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.NumberDataPoint#getAsDouble <em>As Double</em>}' attribute.
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
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.NumberDataPoint#getAsInt <em>As Int</em>}' attribute.
	 * @param value the new value of the '<em>As Int</em>' attribute.
	 * @see #getAsInt()
	 * @generated
	 */
	void setAsInt(Long value);

	/**
	 * Returns the value of the '<em><b>Exemplars</b></em>' containment reference list.
	 * @return the value of the '<em><b>Exemplars</b></em>' containment reference list.
	 * @generated
	 */
	EList<Exemplar> getExemplars();

	/**
	 * Returns the value of the '<em><b>Flags</b></em>' attribute.
	 * @return the value of the '<em><b>Flags</b></em>' attribute.
	 * @see #setFlags(int)
	 * @generated
	 */
	int getFlags();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.NumberDataPoint#getFlags <em>Flags</em>}' attribute.
	 * @param value the new value of the '<em>Flags</em>' attribute.
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(int value);

} // NumberDataPoint
