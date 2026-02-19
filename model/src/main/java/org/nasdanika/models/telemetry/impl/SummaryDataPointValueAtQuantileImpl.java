/**
 */
package org.nasdanika.models.telemetry.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.models.telemetry.SummaryDataPointValueAtQuantile;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Summary Data Point Value At Quantile</b></em>'.
 * @generated
 */
public class SummaryDataPointValueAtQuantileImpl extends MinimalEObjectImpl.Container implements SummaryDataPointValueAtQuantile {

	protected SummaryDataPointValueAtQuantileImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.SUMMARY_DATA_POINT_VALUE_AT_QUANTILE;
	}

	@Override
	public double getQuantile() {
		return (Double)eDynamicGet(TelemetryPackage.SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__QUANTILE, TelemetryPackage.Literals.SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__QUANTILE, true, true);
	}

	@Override
	public void setQuantile(double newQuantile) {
		eDynamicSet(TelemetryPackage.SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__QUANTILE, TelemetryPackage.Literals.SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__QUANTILE, newQuantile);
	}

	@Override
	public double getValue() {
		return (Double)eDynamicGet(TelemetryPackage.SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__VALUE, TelemetryPackage.Literals.SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__VALUE, true, true);
	}

	@Override
	public void setValue(double newValue) {
		eDynamicSet(TelemetryPackage.SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__VALUE, TelemetryPackage.Literals.SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__VALUE, newValue);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__QUANTILE: return getQuantile();
			case TelemetryPackage.SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__VALUE: return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__QUANTILE:
				setQuantile((Double)newValue);
				return;
			case TelemetryPackage.SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__VALUE:
				setValue((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__QUANTILE:
				setQuantile(0.0);
				return;
			case TelemetryPackage.SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__VALUE:
				setValue(0.0);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__QUANTILE: return getQuantile() != 0.0;
			case TelemetryPackage.SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__VALUE: return getValue() != 0.0;
		}
		return super.eIsSet(featureID);
	}

} //SummaryDataPointValueAtQuantileImpl
