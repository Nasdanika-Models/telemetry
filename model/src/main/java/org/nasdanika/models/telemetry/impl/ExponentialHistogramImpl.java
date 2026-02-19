/**
 */
package org.nasdanika.models.telemetry.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.telemetry.AggregationTemporality;
import org.nasdanika.models.telemetry.ExponentialHistogram;
import org.nasdanika.models.telemetry.ExponentialHistogramDataPoint;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Exponential Histogram</b></em>'.
 * @generated
 */
public class ExponentialHistogramImpl extends MetricImpl implements ExponentialHistogram {

	protected ExponentialHistogramImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM;
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<ExponentialHistogramDataPoint> getDataPoints() {
		return (EList<ExponentialHistogramDataPoint>)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM__DATA_POINTS, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM__DATA_POINTS, true, true);
	}

	@Override
	public AggregationTemporality getAggregationTemporality() {
		return (AggregationTemporality)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY, true, true);
	}

	@Override
	public void setAggregationTemporality(AggregationTemporality newAggregationTemporality) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY, newAggregationTemporality);
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM__DATA_POINTS:
				return ((InternalEList<?>)getDataPoints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM__DATA_POINTS: return getDataPoints();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY: return getAggregationTemporality();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM__DATA_POINTS:
				getDataPoints().clear();
				getDataPoints().addAll((Collection<? extends ExponentialHistogramDataPoint>)newValue);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY:
				setAggregationTemporality((AggregationTemporality)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM__DATA_POINTS:
				getDataPoints().clear();
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY:
				setAggregationTemporality(AggregationTemporality.AGGREGATION_TEMPORALITY_UNSPECIFIED);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM__DATA_POINTS: return !getDataPoints().isEmpty();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY: return getAggregationTemporality() != AggregationTemporality.AGGREGATION_TEMPORALITY_UNSPECIFIED;
		}
		return super.eIsSet(featureID);
	}

} //ExponentialHistogramImpl
