/**
 */
package org.nasdanika.models.telemetry.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.models.telemetry.ExponentialHistogramDataPointBuckets;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Exponential Histogram Data Point Buckets</b></em>'.
 * @generated
 */
public class ExponentialHistogramDataPointBucketsImpl extends MinimalEObjectImpl.Container implements ExponentialHistogramDataPointBuckets {

	protected ExponentialHistogramDataPointBucketsImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS;
	}

	@Override
	public int getOffset() {
		return (Integer)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__OFFSET, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__OFFSET, true, true);
	}

	@Override
	public void setOffset(int newOffset) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__OFFSET, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__OFFSET, newOffset);
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<Long> getBucketCounts() {
		return (EList<Long>)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__BUCKET_COUNTS, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__BUCKET_COUNTS, true, true);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__OFFSET: return getOffset();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__BUCKET_COUNTS: return getBucketCounts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__OFFSET:
				setOffset((Integer)newValue);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__BUCKET_COUNTS:
				getBucketCounts().clear();
				getBucketCounts().addAll((Collection<? extends Long>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__OFFSET:
				setOffset(0);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__BUCKET_COUNTS:
				getBucketCounts().clear();
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__OFFSET: return getOffset() != 0;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__BUCKET_COUNTS: return !getBucketCounts().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExponentialHistogramDataPointBucketsImpl
