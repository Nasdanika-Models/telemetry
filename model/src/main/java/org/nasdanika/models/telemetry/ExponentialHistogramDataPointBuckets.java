/**
 */
package org.nasdanika.models.telemetry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the model object '<em><b>Exponential Histogram Data Point Buckets</b></em>'.
 * @generated
 */
public interface ExponentialHistogramDataPointBuckets extends EObject {

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * @return the value of the '<em><b>Offset</b></em>' attribute.
	 * @see #setOffset(int)
	 * @generated
	 */
	int getOffset();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.ExponentialHistogramDataPointBuckets#getOffset <em>Offset</em>}' attribute.
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(int value);

	/**
	 * Returns the value of the '<em><b>Bucket Counts</b></em>' attribute list.
	 * @return the value of the '<em><b>Bucket Counts</b></em>' attribute list.
	 * @generated
	 */
	EList<Long> getBucketCounts();

} // ExponentialHistogramDataPointBuckets
