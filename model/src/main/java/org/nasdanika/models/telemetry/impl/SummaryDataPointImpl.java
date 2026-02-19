/**
 */
package org.nasdanika.models.telemetry.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.telemetry.KeyValue;
import org.nasdanika.models.telemetry.SummaryDataPoint;
import org.nasdanika.models.telemetry.SummaryDataPointValueAtQuantile;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Summary Data Point</b></em>'.
 * @generated
 */
public class SummaryDataPointImpl extends MinimalEObjectImpl.Container implements SummaryDataPoint {

	protected SummaryDataPointImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.SUMMARY_DATA_POINT;
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<KeyValue> getAttributes() {
		return (EList<KeyValue>)eDynamicGet(TelemetryPackage.SUMMARY_DATA_POINT__ATTRIBUTES, TelemetryPackage.Literals.SUMMARY_DATA_POINT__ATTRIBUTES, true, true);
	}

	@Override
	public long getStartTimeUnixNano() {
		return (Long)eDynamicGet(TelemetryPackage.SUMMARY_DATA_POINT__START_TIME_UNIX_NANO, TelemetryPackage.Literals.SUMMARY_DATA_POINT__START_TIME_UNIX_NANO, true, true);
	}

	@Override
	public void setStartTimeUnixNano(long newStartTimeUnixNano) {
		eDynamicSet(TelemetryPackage.SUMMARY_DATA_POINT__START_TIME_UNIX_NANO, TelemetryPackage.Literals.SUMMARY_DATA_POINT__START_TIME_UNIX_NANO, newStartTimeUnixNano);
	}

	@Override
	public long getTimeUnixNano() {
		return (Long)eDynamicGet(TelemetryPackage.SUMMARY_DATA_POINT__TIME_UNIX_NANO, TelemetryPackage.Literals.SUMMARY_DATA_POINT__TIME_UNIX_NANO, true, true);
	}

	@Override
	public void setTimeUnixNano(long newTimeUnixNano) {
		eDynamicSet(TelemetryPackage.SUMMARY_DATA_POINT__TIME_UNIX_NANO, TelemetryPackage.Literals.SUMMARY_DATA_POINT__TIME_UNIX_NANO, newTimeUnixNano);
	}

	@Override
	public long getCount() {
		return (Long)eDynamicGet(TelemetryPackage.SUMMARY_DATA_POINT__COUNT, TelemetryPackage.Literals.SUMMARY_DATA_POINT__COUNT, true, true);
	}

	@Override
	public void setCount(long newCount) {
		eDynamicSet(TelemetryPackage.SUMMARY_DATA_POINT__COUNT, TelemetryPackage.Literals.SUMMARY_DATA_POINT__COUNT, newCount);
	}

	@Override
	public double getSum() {
		return (Double)eDynamicGet(TelemetryPackage.SUMMARY_DATA_POINT__SUM, TelemetryPackage.Literals.SUMMARY_DATA_POINT__SUM, true, true);
	}

	@Override
	public void setSum(double newSum) {
		eDynamicSet(TelemetryPackage.SUMMARY_DATA_POINT__SUM, TelemetryPackage.Literals.SUMMARY_DATA_POINT__SUM, newSum);
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<SummaryDataPointValueAtQuantile> getQuantileValues() {
		return (EList<SummaryDataPointValueAtQuantile>)eDynamicGet(TelemetryPackage.SUMMARY_DATA_POINT__QUANTILE_VALUES, TelemetryPackage.Literals.SUMMARY_DATA_POINT__QUANTILE_VALUES, true, true);
	}

	@Override
	public int getFlags() {
		return (Integer)eDynamicGet(TelemetryPackage.SUMMARY_DATA_POINT__FLAGS, TelemetryPackage.Literals.SUMMARY_DATA_POINT__FLAGS, true, true);
	}

	@Override
	public void setFlags(int newFlags) {
		eDynamicSet(TelemetryPackage.SUMMARY_DATA_POINT__FLAGS, TelemetryPackage.Literals.SUMMARY_DATA_POINT__FLAGS, newFlags);
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.SUMMARY_DATA_POINT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case TelemetryPackage.SUMMARY_DATA_POINT__QUANTILE_VALUES:
				return ((InternalEList<?>)getQuantileValues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.SUMMARY_DATA_POINT__ATTRIBUTES: return getAttributes();
			case TelemetryPackage.SUMMARY_DATA_POINT__START_TIME_UNIX_NANO: return getStartTimeUnixNano();
			case TelemetryPackage.SUMMARY_DATA_POINT__TIME_UNIX_NANO: return getTimeUnixNano();
			case TelemetryPackage.SUMMARY_DATA_POINT__COUNT: return getCount();
			case TelemetryPackage.SUMMARY_DATA_POINT__SUM: return getSum();
			case TelemetryPackage.SUMMARY_DATA_POINT__QUANTILE_VALUES: return getQuantileValues();
			case TelemetryPackage.SUMMARY_DATA_POINT__FLAGS: return getFlags();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.SUMMARY_DATA_POINT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends KeyValue>)newValue);
				return;
			case TelemetryPackage.SUMMARY_DATA_POINT__START_TIME_UNIX_NANO:
				setStartTimeUnixNano((Long)newValue);
				return;
			case TelemetryPackage.SUMMARY_DATA_POINT__TIME_UNIX_NANO:
				setTimeUnixNano((Long)newValue);
				return;
			case TelemetryPackage.SUMMARY_DATA_POINT__COUNT:
				setCount((Long)newValue);
				return;
			case TelemetryPackage.SUMMARY_DATA_POINT__SUM:
				setSum((Double)newValue);
				return;
			case TelemetryPackage.SUMMARY_DATA_POINT__QUANTILE_VALUES:
				getQuantileValues().clear();
				getQuantileValues().addAll((Collection<? extends SummaryDataPointValueAtQuantile>)newValue);
				return;
			case TelemetryPackage.SUMMARY_DATA_POINT__FLAGS:
				setFlags((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.SUMMARY_DATA_POINT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case TelemetryPackage.SUMMARY_DATA_POINT__START_TIME_UNIX_NANO:
				setStartTimeUnixNano(0L);
				return;
			case TelemetryPackage.SUMMARY_DATA_POINT__TIME_UNIX_NANO:
				setTimeUnixNano(0L);
				return;
			case TelemetryPackage.SUMMARY_DATA_POINT__COUNT:
				setCount(0L);
				return;
			case TelemetryPackage.SUMMARY_DATA_POINT__SUM:
				setSum(0.0);
				return;
			case TelemetryPackage.SUMMARY_DATA_POINT__QUANTILE_VALUES:
				getQuantileValues().clear();
				return;
			case TelemetryPackage.SUMMARY_DATA_POINT__FLAGS:
				setFlags(0);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.SUMMARY_DATA_POINT__ATTRIBUTES: return !getAttributes().isEmpty();
			case TelemetryPackage.SUMMARY_DATA_POINT__START_TIME_UNIX_NANO: return getStartTimeUnixNano() != 0L;
			case TelemetryPackage.SUMMARY_DATA_POINT__TIME_UNIX_NANO: return getTimeUnixNano() != 0L;
			case TelemetryPackage.SUMMARY_DATA_POINT__COUNT: return getCount() != 0L;
			case TelemetryPackage.SUMMARY_DATA_POINT__SUM: return getSum() != 0.0;
			case TelemetryPackage.SUMMARY_DATA_POINT__QUANTILE_VALUES: return !getQuantileValues().isEmpty();
			case TelemetryPackage.SUMMARY_DATA_POINT__FLAGS: return getFlags() != 0;
		}
		return super.eIsSet(featureID);
	}

} //SummaryDataPointImpl
