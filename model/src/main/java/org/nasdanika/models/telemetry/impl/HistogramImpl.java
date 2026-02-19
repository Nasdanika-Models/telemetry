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
import org.nasdanika.models.telemetry.Histogram;
import org.nasdanika.models.telemetry.HistogramDataPoint;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Histogram</b></em>'.
 * @generated
 */
public class HistogramImpl extends MetricImpl implements Histogram {

	protected HistogramImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.HISTOGRAM;
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<HistogramDataPoint> getDataPoints() {
		return (EList<HistogramDataPoint>)eDynamicGet(TelemetryPackage.HISTOGRAM__DATA_POINTS, TelemetryPackage.Literals.HISTOGRAM__DATA_POINTS, true, true);
	}

	@Override
	public AggregationTemporality getAggregationTemporality() {
		return (AggregationTemporality)eDynamicGet(TelemetryPackage.HISTOGRAM__AGGREGATION_TEMPORALITY, TelemetryPackage.Literals.HISTOGRAM__AGGREGATION_TEMPORALITY, true, true);
	}

	@Override
	public void setAggregationTemporality(AggregationTemporality newAggregationTemporality) {
		eDynamicSet(TelemetryPackage.HISTOGRAM__AGGREGATION_TEMPORALITY, TelemetryPackage.Literals.HISTOGRAM__AGGREGATION_TEMPORALITY, newAggregationTemporality);
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.HISTOGRAM__DATA_POINTS:
				return ((InternalEList<?>)getDataPoints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.HISTOGRAM__DATA_POINTS: return getDataPoints();
			case TelemetryPackage.HISTOGRAM__AGGREGATION_TEMPORALITY: return getAggregationTemporality();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.HISTOGRAM__DATA_POINTS:
				getDataPoints().clear();
				getDataPoints().addAll((Collection<? extends HistogramDataPoint>)newValue);
				return;
			case TelemetryPackage.HISTOGRAM__AGGREGATION_TEMPORALITY:
				setAggregationTemporality((AggregationTemporality)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.HISTOGRAM__DATA_POINTS:
				getDataPoints().clear();
				return;
			case TelemetryPackage.HISTOGRAM__AGGREGATION_TEMPORALITY:
				setAggregationTemporality(AggregationTemporality.AGGREGATION_TEMPORALITY_UNSPECIFIED);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.HISTOGRAM__DATA_POINTS: return !getDataPoints().isEmpty();
			case TelemetryPackage.HISTOGRAM__AGGREGATION_TEMPORALITY: return getAggregationTemporality() != AggregationTemporality.AGGREGATION_TEMPORALITY_UNSPECIFIED;
		}
		return super.eIsSet(featureID);
	}

} //HistogramImpl
