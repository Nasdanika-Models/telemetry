/**
 */
package org.nasdanika.models.telemetry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the model object '<em><b>Histogram Data Point</b></em>'.
 * @generated
 */
public interface HistogramDataPoint extends EObject {

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
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.HistogramDataPoint#getStartTimeUnixNano <em>Start Time Unix Nano</em>}' attribute.
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
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.HistogramDataPoint#getTimeUnixNano <em>Time Unix Nano</em>}' attribute.
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
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.HistogramDataPoint#getCount <em>Count</em>}' attribute.
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(long value);

	/**
	 * Returns the value of the '<em><b>Sum</b></em>' attribute.
	 * @return the value of the '<em><b>Sum</b></em>' attribute.
	 * @see #setSum(Double)
	 * @generated
	 */
	Double getSum();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.HistogramDataPoint#getSum <em>Sum</em>}' attribute.
	 * @param value the new value of the '<em>Sum</em>' attribute.
	 * @see #getSum()
	 * @generated
	 */
	void setSum(Double value);

	/**
	 * Returns the value of the '<em><b>Bucket Counts</b></em>' attribute list.
	 * @return the value of the '<em><b>Bucket Counts</b></em>' attribute list.
	 * @generated
	 */
	EList<Long> getBucketCounts();

	/**
	 * Returns the value of the '<em><b>Explicit Bounds</b></em>' attribute list.
	 * @return the value of the '<em><b>Explicit Bounds</b></em>' attribute list.
	 * @generated
	 */
	EList<Double> getExplicitBounds();

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
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.HistogramDataPoint#getFlags <em>Flags</em>}' attribute.
	 * @param value the new value of the '<em>Flags</em>' attribute.
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(int value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * @return the value of the '<em><b>Min</b></em>' attribute.
	 * @see #setMin(Double)
	 * @generated
	 */
	Double getMin();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.HistogramDataPoint#getMin <em>Min</em>}' attribute.
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(Double value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * @return the value of the '<em><b>Max</b></em>' attribute.
	 * @see #setMax(Double)
	 * @generated
	 */
	Double getMax();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.HistogramDataPoint#getMax <em>Max</em>}' attribute.
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(Double value);

} // HistogramDataPoint
