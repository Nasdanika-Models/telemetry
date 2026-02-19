/**
 */
package org.nasdanika.models.telemetry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the model object '<em><b>Summary Data Point</b></em>'.
 * @generated
 */
public interface SummaryDataPoint extends EObject {

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
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.SummaryDataPoint#getStartTimeUnixNano <em>Start Time Unix Nano</em>}' attribute.
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
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.SummaryDataPoint#getTimeUnixNano <em>Time Unix Nano</em>}' attribute.
	 * @param value the new value of the '<em>Time Unix Nano</em>' attribute.
	 * @see #getTimeUnixNano()
	 * @generated
	 */
	void setTimeUnixNano(long value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * @return the value of the '<em><b>Count</b></em>' attribute.
	 * @see #setCount(long)
	 * @generated
	 */
	long getCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.SummaryDataPoint#getCount <em>Count</em>}' attribute.
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(long value);

	/**
	 * Returns the value of the '<em><b>Sum</b></em>' attribute.
	 * @return the value of the '<em><b>Sum</b></em>' attribute.
	 * @see #setSum(double)
	 * @generated
	 */
	double getSum();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.SummaryDataPoint#getSum <em>Sum</em>}' attribute.
	 * @param value the new value of the '<em>Sum</em>' attribute.
	 * @see #getSum()
	 * @generated
	 */
	void setSum(double value);

	/**
	 * Returns the value of the '<em><b>Quantile Values</b></em>' containment reference list.
	 * @return the value of the '<em><b>Quantile Values</b></em>' containment reference list.
	 * @generated
	 */
	EList<SummaryDataPointValueAtQuantile> getQuantileValues();

	/**
	 * Returns the value of the '<em><b>Flags</b></em>' attribute.
	 * @return the value of the '<em><b>Flags</b></em>' attribute.
	 * @see #setFlags(int)
	 * @generated
	 */
	int getFlags();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.SummaryDataPoint#getFlags <em>Flags</em>}' attribute.
	 * @param value the new value of the '<em>Flags</em>' attribute.
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(int value);

} // SummaryDataPoint
