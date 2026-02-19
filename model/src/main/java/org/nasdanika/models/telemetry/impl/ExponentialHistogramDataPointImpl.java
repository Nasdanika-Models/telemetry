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
import org.nasdanika.models.telemetry.Exemplar;
import org.nasdanika.models.telemetry.ExponentialHistogramDataPoint;
import org.nasdanika.models.telemetry.ExponentialHistogramDataPointBuckets;
import org.nasdanika.models.telemetry.KeyValue;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Exponential Histogram Data Point</b></em>'.
 * @generated
 */
public class ExponentialHistogramDataPointImpl extends MinimalEObjectImpl.Container implements ExponentialHistogramDataPoint {

	protected ExponentialHistogramDataPointImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT;
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<KeyValue> getAttributes() {
		return (EList<KeyValue>)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ATTRIBUTES, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__ATTRIBUTES, true, true);
	}

	@Override
	public long getStartTimeUnixNano() {
		return (Long)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO, true, true);
	}

	@Override
	public void setStartTimeUnixNano(long newStartTimeUnixNano) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO, newStartTimeUnixNano);
	}

	@Override
	public long getTimeUnixNano() {
		return (Long)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__TIME_UNIX_NANO, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__TIME_UNIX_NANO, true, true);
	}

	@Override
	public void setTimeUnixNano(long newTimeUnixNano) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__TIME_UNIX_NANO, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__TIME_UNIX_NANO, newTimeUnixNano);
	}

	@Override
	public long getCount() {
		return (Long)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__COUNT, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__COUNT, true, true);
	}

	@Override
	public void setCount(long newCount) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__COUNT, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__COUNT, newCount);
	}

	@Override
	public Double getSum() {
		return (Double)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__SUM, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__SUM, true, true);
	}

	@Override
	public void setSum(Double newSum) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__SUM, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__SUM, newSum);
	}

	@Override
	public int getScale() {
		return (Integer)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__SCALE, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__SCALE, true, true);
	}

	@Override
	public void setScale(int newScale) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__SCALE, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__SCALE, newScale);
	}

	@Override
	public long getZeroCount() {
		return (Long)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_COUNT, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_COUNT, true, true);
	}

	@Override
	public void setZeroCount(long newZeroCount) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_COUNT, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_COUNT, newZeroCount);
	}

	@Override
	public ExponentialHistogramDataPointBuckets getPositive() {
		return (ExponentialHistogramDataPointBuckets)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__POSITIVE, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__POSITIVE, true, true);
	}

	@Override
	public void setPositive(ExponentialHistogramDataPointBuckets newPositive) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__POSITIVE, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__POSITIVE, newPositive);
	}

	@Override
	public ExponentialHistogramDataPointBuckets getNegative() {
		return (ExponentialHistogramDataPointBuckets)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__NEGATIVE, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__NEGATIVE, true, true);
	}

	@Override
	public void setNegative(ExponentialHistogramDataPointBuckets newNegative) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__NEGATIVE, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__NEGATIVE, newNegative);
	}

	@Override
	public int getFlags() {
		return (Integer)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__FLAGS, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__FLAGS, true, true);
	}

	@Override
	public void setFlags(int newFlags) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__FLAGS, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__FLAGS, newFlags);
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<Exemplar> getExemplars() {
		return (EList<Exemplar>)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__EXEMPLARS, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__EXEMPLARS, true, true);
	}

	@Override
	public Double getMin() {
		return (Double)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__MIN, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__MIN, true, true);
	}

	@Override
	public void setMin(Double newMin) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__MIN, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__MIN, newMin);
	}

	@Override
	public Double getMax() {
		return (Double)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__MAX, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__MAX, true, true);
	}

	@Override
	public void setMax(Double newMax) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__MAX, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__MAX, newMax);
	}

	@Override
	public double getZeroThreshold() {
		return (Double)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_THRESHOLD, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_THRESHOLD, true, true);
	}

	@Override
	public void setZeroThreshold(double newZeroThreshold) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_THRESHOLD, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_THRESHOLD, newZeroThreshold);
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__POSITIVE:
				return eDynamicInverseRemove(otherEnd, featureID, msgs);
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__NEGATIVE:
				return eDynamicInverseRemove(otherEnd, featureID, msgs);
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__EXEMPLARS:
				return ((InternalEList<?>)getExemplars()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ATTRIBUTES: return getAttributes();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO: return getStartTimeUnixNano();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__TIME_UNIX_NANO: return getTimeUnixNano();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__COUNT: return getCount();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__SUM: return getSum();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__SCALE: return getScale();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_COUNT: return getZeroCount();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__POSITIVE: return getPositive();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__NEGATIVE: return getNegative();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__FLAGS: return getFlags();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__EXEMPLARS: return getExemplars();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__MIN: return getMin();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__MAX: return getMax();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_THRESHOLD: return getZeroThreshold();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends KeyValue>)newValue);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO:
				setStartTimeUnixNano((Long)newValue);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__TIME_UNIX_NANO:
				setTimeUnixNano((Long)newValue);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__COUNT:
				setCount((Long)newValue);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__SUM:
				setSum((Double)newValue);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__SCALE:
				setScale((Integer)newValue);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_COUNT:
				setZeroCount((Long)newValue);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__POSITIVE:
				setPositive((ExponentialHistogramDataPointBuckets)newValue);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__NEGATIVE:
				setNegative((ExponentialHistogramDataPointBuckets)newValue);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__FLAGS:
				setFlags((Integer)newValue);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__EXEMPLARS:
				getExemplars().clear();
				getExemplars().addAll((Collection<? extends Exemplar>)newValue);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__MIN:
				setMin((Double)newValue);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__MAX:
				setMax((Double)newValue);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_THRESHOLD:
				setZeroThreshold((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO:
				setStartTimeUnixNano(0L);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__TIME_UNIX_NANO:
				setTimeUnixNano(0L);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__COUNT:
				setCount(0L);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__SUM:
				setSum(null);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__SCALE:
				setScale(0);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_COUNT:
				setZeroCount(0L);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__POSITIVE:
				setPositive(null);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__NEGATIVE:
				setNegative(null);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__FLAGS:
				setFlags(0);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__EXEMPLARS:
				getExemplars().clear();
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__MIN:
				setMin(null);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__MAX:
				setMax(null);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_THRESHOLD:
				setZeroThreshold(0.0);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ATTRIBUTES: return !getAttributes().isEmpty();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO: return getStartTimeUnixNano() != 0L;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__TIME_UNIX_NANO: return getTimeUnixNano() != 0L;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__COUNT: return getCount() != 0L;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__SUM: return getSum() != null;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__SCALE: return getScale() != 0;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_COUNT: return getZeroCount() != 0L;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__POSITIVE: return getPositive() != null;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__NEGATIVE: return getNegative() != null;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__FLAGS: return getFlags() != 0;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__EXEMPLARS: return !getExemplars().isEmpty();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__MIN: return getMin() != null;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__MAX: return getMax() != null;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_THRESHOLD: return getZeroThreshold() != 0.0;
		}
		return super.eIsSet(featureID);
	}

} //ExponentialHistogramDataPointImpl
