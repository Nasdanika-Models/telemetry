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
import org.nasdanika.models.telemetry.HistogramDataPoint;
import org.nasdanika.models.telemetry.KeyValue;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Histogram Data Point</b></em>'.
 * @generated
 */
public class HistogramDataPointImpl extends MinimalEObjectImpl.Container implements HistogramDataPoint {

	protected HistogramDataPointImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.HISTOGRAM_DATA_POINT;
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<KeyValue> getAttributes() {
		return (EList<KeyValue>)eDynamicGet(TelemetryPackage.HISTOGRAM_DATA_POINT__ATTRIBUTES, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__ATTRIBUTES, true, true);
	}

	@Override
	public long getStartTimeUnixNano() {
		return (Long)eDynamicGet(TelemetryPackage.HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO, true, true);
	}

	@Override
	public void setStartTimeUnixNano(long newStartTimeUnixNano) {
		eDynamicSet(TelemetryPackage.HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO, newStartTimeUnixNano);
	}

	@Override
	public long getTimeUnixNano() {
		return (Long)eDynamicGet(TelemetryPackage.HISTOGRAM_DATA_POINT__TIME_UNIX_NANO, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__TIME_UNIX_NANO, true, true);
	}

	@Override
	public void setTimeUnixNano(long newTimeUnixNano) {
		eDynamicSet(TelemetryPackage.HISTOGRAM_DATA_POINT__TIME_UNIX_NANO, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__TIME_UNIX_NANO, newTimeUnixNano);
	}

	@Override
	public long getCount() {
		return (Long)eDynamicGet(TelemetryPackage.HISTOGRAM_DATA_POINT__COUNT, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__COUNT, true, true);
	}

	@Override
	public void setCount(long newCount) {
		eDynamicSet(TelemetryPackage.HISTOGRAM_DATA_POINT__COUNT, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__COUNT, newCount);
	}

	@Override
	public Double getSum() {
		return (Double)eDynamicGet(TelemetryPackage.HISTOGRAM_DATA_POINT__SUM, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__SUM, true, true);
	}

	@Override
	public void setSum(Double newSum) {
		eDynamicSet(TelemetryPackage.HISTOGRAM_DATA_POINT__SUM, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__SUM, newSum);
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<Long> getBucketCounts() {
		return (EList<Long>)eDynamicGet(TelemetryPackage.HISTOGRAM_DATA_POINT__BUCKET_COUNTS, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__BUCKET_COUNTS, true, true);
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<Double> getExplicitBounds() {
		return (EList<Double>)eDynamicGet(TelemetryPackage.HISTOGRAM_DATA_POINT__EXPLICIT_BOUNDS, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__EXPLICIT_BOUNDS, true, true);
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<Exemplar> getExemplars() {
		return (EList<Exemplar>)eDynamicGet(TelemetryPackage.HISTOGRAM_DATA_POINT__EXEMPLARS, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__EXEMPLARS, true, true);
	}

	@Override
	public int getFlags() {
		return (Integer)eDynamicGet(TelemetryPackage.HISTOGRAM_DATA_POINT__FLAGS, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__FLAGS, true, true);
	}

	@Override
	public void setFlags(int newFlags) {
		eDynamicSet(TelemetryPackage.HISTOGRAM_DATA_POINT__FLAGS, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__FLAGS, newFlags);
	}

	@Override
	public Double getMin() {
		return (Double)eDynamicGet(TelemetryPackage.HISTOGRAM_DATA_POINT__MIN, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__MIN, true, true);
	}

	@Override
	public void setMin(Double newMin) {
		eDynamicSet(TelemetryPackage.HISTOGRAM_DATA_POINT__MIN, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__MIN, newMin);
	}

	@Override
	public Double getMax() {
		return (Double)eDynamicGet(TelemetryPackage.HISTOGRAM_DATA_POINT__MAX, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__MAX, true, true);
	}

	@Override
	public void setMax(Double newMax) {
		eDynamicSet(TelemetryPackage.HISTOGRAM_DATA_POINT__MAX, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__MAX, newMax);
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.HISTOGRAM_DATA_POINT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case TelemetryPackage.HISTOGRAM_DATA_POINT__EXEMPLARS:
				return ((InternalEList<?>)getExemplars()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.HISTOGRAM_DATA_POINT__ATTRIBUTES: return getAttributes();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO: return getStartTimeUnixNano();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__TIME_UNIX_NANO: return getTimeUnixNano();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__COUNT: return getCount();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__SUM: return getSum();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__BUCKET_COUNTS: return getBucketCounts();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__EXPLICIT_BOUNDS: return getExplicitBounds();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__EXEMPLARS: return getExemplars();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__FLAGS: return getFlags();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__MIN: return getMin();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__MAX: return getMax();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.HISTOGRAM_DATA_POINT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends KeyValue>)newValue);
				return;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO:
				setStartTimeUnixNano((Long)newValue);
				return;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__TIME_UNIX_NANO:
				setTimeUnixNano((Long)newValue);
				return;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__COUNT:
				setCount((Long)newValue);
				return;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__SUM:
				setSum((Double)newValue);
				return;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__BUCKET_COUNTS:
				getBucketCounts().clear();
				getBucketCounts().addAll((Collection<? extends Long>)newValue);
				return;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__EXPLICIT_BOUNDS:
				getExplicitBounds().clear();
				getExplicitBounds().addAll((Collection<? extends Double>)newValue);
				return;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__EXEMPLARS:
				getExemplars().clear();
				getExemplars().addAll((Collection<? extends Exemplar>)newValue);
				return;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__FLAGS:
				setFlags((Integer)newValue);
				return;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__MIN:
				setMin((Double)newValue);
				return;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__MAX:
				setMax((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.HISTOGRAM_DATA_POINT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO:
				setStartTimeUnixNano(0L);
				return;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__TIME_UNIX_NANO:
				setTimeUnixNano(0L);
				return;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__COUNT:
				setCount(0L);
				return;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__SUM:
				setSum(null);
				return;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__BUCKET_COUNTS:
				getBucketCounts().clear();
				return;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__EXPLICIT_BOUNDS:
				getExplicitBounds().clear();
				return;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__EXEMPLARS:
				getExemplars().clear();
				return;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__FLAGS:
				setFlags(0);
				return;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__MIN:
				setMin(null);
				return;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__MAX:
				setMax(null);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.HISTOGRAM_DATA_POINT__ATTRIBUTES: return !getAttributes().isEmpty();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO: return getStartTimeUnixNano() != 0L;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__TIME_UNIX_NANO: return getTimeUnixNano() != 0L;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__COUNT: return getCount() != 0L;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__SUM: return getSum() != null;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__BUCKET_COUNTS: return !getBucketCounts().isEmpty();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__EXPLICIT_BOUNDS: return !getExplicitBounds().isEmpty();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__EXEMPLARS: return !getExemplars().isEmpty();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__FLAGS: return getFlags() != 0;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__MIN: return getMin() != null;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__MAX: return getMax() != null;
		}
		return super.eIsSet(featureID);
	}

} //HistogramDataPointImpl
