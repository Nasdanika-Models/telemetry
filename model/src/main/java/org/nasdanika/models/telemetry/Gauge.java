/**
 */
package org.nasdanika.models.telemetry;

import org.eclipse.emf.common.util.EList;

/**
 * A representation of the model object '<em><b>Gauge</b></em>'.
 * @generated
 */
public interface Gauge extends Metric {

	/**
	 * Returns the value of the '<em><b>Data Points</b></em>' containment reference list.
	 * @return the value of the '<em><b>Data Points</b></em>' containment reference list.
	 * @generated
	 */
	EList<NumberDataPoint> getDataPoints();

} // Gauge
