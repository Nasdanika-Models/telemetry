/**
 */
package org.nasdanika.models.telemetry;

import org.eclipse.emf.common.util.EList;

/**
 * A representation of the model object '<em><b>Exponential Histogram</b></em>'.
 * @generated
 */
public interface ExponentialHistogram extends Metric {

	/**
	 * Returns the value of the '<em><b>Data Points</b></em>' containment reference list.
	 * @return the value of the '<em><b>Data Points</b></em>' containment reference list.
	 * @generated
	 */
	EList<ExponentialHistogramDataPoint> getDataPoints();

	/**
	 * Returns the value of the '<em><b>Aggregation Temporality</b></em>' attribute.
	 * @return the value of the '<em><b>Aggregation Temporality</b></em>' attribute.
	 * @see #setAggregationTemporality(AggregationTemporality)
	 * @generated
	 */
	AggregationTemporality getAggregationTemporality();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.ExponentialHistogram#getAggregationTemporality <em>Aggregation Temporality</em>}' attribute.
	 * @param value the new value of the '<em>Aggregation Temporality</em>' attribute.
	 * @see #getAggregationTemporality()
	 * @generated
	 */
	void setAggregationTemporality(AggregationTemporality value);

} // ExponentialHistogram
