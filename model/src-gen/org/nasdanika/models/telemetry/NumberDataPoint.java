/**
 */
package org.nasdanika.models.telemetry;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Data Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * NumberDataPoint is a single data point in a timeseries that describes the time-varying scalar value of a metric.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.telemetry.NumberDataPoint#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.NumberDataPoint#getStartTimeUnixNano <em>Start Time Unix Nano</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.NumberDataPoint#getTimeUnixNano <em>Time Unix Nano</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.NumberDataPoint#getAsDouble <em>As Double</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.NumberDataPoint#getAsInt <em>As Int</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.NumberDataPoint#getExemplars <em>Exemplars</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.NumberDataPoint#getFlags <em>Flags</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.telemetry.TelemetryPackage#getNumberDataPoint()
 * @model
 * @generated
 */
public interface NumberDataPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.telemetry.KeyValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.nasdanika.models.telemetry.TelemetryPackage#getNumberDataPoint_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValue> getAttributes();

	/**
	 * Returns the value of the '<em><b>Start Time Unix Nano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time Unix Nano</em>' attribute.
	 * @see #setStartTimeUnixNano(long)
	 * @see org.nasdanika.models.telemetry.TelemetryPackage#getNumberDataPoint_StartTimeUnixNano()
	 * @model unique="false"
	 * @generated
	 */
	long getStartTimeUnixNano();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.NumberDataPoint#getStartTimeUnixNano <em>Start Time Unix Nano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time Unix Nano</em>' attribute.
	 * @see #getStartTimeUnixNano()
	 * @generated
	 */
	void setStartTimeUnixNano(long value);

	/**
	 * Returns the value of the '<em><b>Time Unix Nano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unix Nano</em>' attribute.
	 * @see #setTimeUnixNano(long)
	 * @see org.nasdanika.models.telemetry.TelemetryPackage#getNumberDataPoint_TimeUnixNano()
	 * @model unique="false"
	 * @generated
	 */
	long getTimeUnixNano();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.NumberDataPoint#getTimeUnixNano <em>Time Unix Nano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unix Nano</em>' attribute.
	 * @see #getTimeUnixNano()
	 * @generated
	 */
	void setTimeUnixNano(long value);

	/**
	 * Returns the value of the '<em><b>As Double</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * value as a double. Either asDouble or asInt must be set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>As Double</em>' attribute.
	 * @see #setAsDouble(Double)
	 * @see org.nasdanika.models.telemetry.TelemetryPackage#getNumberDataPoint_AsDouble()
	 * @model unique="false"
	 * @generated
	 */
	Double getAsDouble();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.NumberDataPoint#getAsDouble <em>As Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Double</em>' attribute.
	 * @see #getAsDouble()
	 * @generated
	 */
	void setAsDouble(Double value);

	/**
	 * Returns the value of the '<em><b>As Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * value as an integer. Either asDouble or asInt must be set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>As Int</em>' attribute.
	 * @see #setAsInt(Long)
	 * @see org.nasdanika.models.telemetry.TelemetryPackage#getNumberDataPoint_AsInt()
	 * @model unique="false"
	 * @generated
	 */
	Long getAsInt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.NumberDataPoint#getAsInt <em>As Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Int</em>' attribute.
	 * @see #getAsInt()
	 * @generated
	 */
	void setAsInt(Long value);

	/**
	 * Returns the value of the '<em><b>Exemplars</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.telemetry.Exemplar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exemplars</em>' containment reference list.
	 * @see org.nasdanika.models.telemetry.TelemetryPackage#getNumberDataPoint_Exemplars()
	 * @model containment="true"
	 * @generated
	 */
	EList<Exemplar> getExemplars();

	/**
	 * Returns the value of the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flags is an optional bit field containing hints for the backends.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flags</em>' attribute.
	 * @see #setFlags(int)
	 * @see org.nasdanika.models.telemetry.TelemetryPackage#getNumberDataPoint_Flags()
	 * @model unique="false"
	 * @generated
	 */
	int getFlags();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.NumberDataPoint#getFlags <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flags</em>' attribute.
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(int value);

} // NumberDataPoint
