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
import org.nasdanika.models.telemetry.NumberDataPoint;
import org.nasdanika.models.telemetry.Sum;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Sum</b></em>'.
 * @generated
 */
public class SumImpl extends MetricImpl implements Sum {

	protected SumImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.SUM;
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<NumberDataPoint> getDataPoints() {
		return (EList<NumberDataPoint>)eDynamicGet(TelemetryPackage.SUM__DATA_POINTS, TelemetryPackage.Literals.SUM__DATA_POINTS, true, true);
	}

	@Override
	public AggregationTemporality getAggregationTemporality() {
		return (AggregationTemporality)eDynamicGet(TelemetryPackage.SUM__AGGREGATION_TEMPORALITY, TelemetryPackage.Literals.SUM__AGGREGATION_TEMPORALITY, true, true);
	}

	@Override
	public void setAggregationTemporality(AggregationTemporality newAggregationTemporality) {
		eDynamicSet(TelemetryPackage.SUM__AGGREGATION_TEMPORALITY, TelemetryPackage.Literals.SUM__AGGREGATION_TEMPORALITY, newAggregationTemporality);
	}

	@Override
	public boolean isMonotonic() {
		return (Boolean)eDynamicGet(TelemetryPackage.SUM__IS_MONOTONIC, TelemetryPackage.Literals.SUM__IS_MONOTONIC, true, true);
	}

	@Override
	public void setMonotonic(boolean newIsMonotonic) {
		eDynamicSet(TelemetryPackage.SUM__IS_MONOTONIC, TelemetryPackage.Literals.SUM__IS_MONOTONIC, newIsMonotonic);
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.SUM__DATA_POINTS:
				return ((InternalEList<?>)getDataPoints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.SUM__DATA_POINTS: return getDataPoints();
			case TelemetryPackage.SUM__AGGREGATION_TEMPORALITY: return getAggregationTemporality();
			case TelemetryPackage.SUM__IS_MONOTONIC: return isMonotonic();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.SUM__DATA_POINTS:
				getDataPoints().clear();
				getDataPoints().addAll((Collection<? extends NumberDataPoint>)newValue);
				return;
			case TelemetryPackage.SUM__AGGREGATION_TEMPORALITY:
				setAggregationTemporality((AggregationTemporality)newValue);
				return;
			case TelemetryPackage.SUM__IS_MONOTONIC:
				setMonotonic((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.SUM__DATA_POINTS:
				getDataPoints().clear();
				return;
			case TelemetryPackage.SUM__AGGREGATION_TEMPORALITY:
				setAggregationTemporality(AggregationTemporality.AGGREGATION_TEMPORALITY_UNSPECIFIED);
				return;
			case TelemetryPackage.SUM__IS_MONOTONIC:
				setMonotonic(false);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.SUM__DATA_POINTS: return !getDataPoints().isEmpty();
			case TelemetryPackage.SUM__AGGREGATION_TEMPORALITY: return getAggregationTemporality() != AggregationTemporality.AGGREGATION_TEMPORALITY_UNSPECIFIED;
			case TelemetryPackage.SUM__IS_MONOTONIC: return isMonotonic() != false;
		}
		return super.eIsSet(featureID);
	}

} //SumImpl
