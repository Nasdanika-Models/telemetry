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
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exponential Histogram Data Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.telemetry.impl.ExponentialHistogramDataPointImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.ExponentialHistogramDataPointImpl#getStartTimeUnixNano <em>Start Time Unix Nano</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.ExponentialHistogramDataPointImpl#getTimeUnixNano <em>Time Unix Nano</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.ExponentialHistogramDataPointImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.ExponentialHistogramDataPointImpl#getSum <em>Sum</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.ExponentialHistogramDataPointImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.ExponentialHistogramDataPointImpl#getZeroCount <em>Zero Count</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.ExponentialHistogramDataPointImpl#getPositive <em>Positive</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.ExponentialHistogramDataPointImpl#getNegative <em>Negative</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.ExponentialHistogramDataPointImpl#getFlags <em>Flags</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.ExponentialHistogramDataPointImpl#getExemplars <em>Exemplars</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.ExponentialHistogramDataPointImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.ExponentialHistogramDataPointImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.ExponentialHistogramDataPointImpl#getZeroThreshold <em>Zero Threshold</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExponentialHistogramDataPointImpl extends MinimalEObjectImpl.Container implements ExponentialHistogramDataPoint {
	/**
	 * The default value of the '{@link #getStartTimeUnixNano() <em>Start Time Unix Nano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTimeUnixNano()
	 * @generated
	 * @ordered
	 */
	protected static final long START_TIME_UNIX_NANO_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getTimeUnixNano() <em>Time Unix Nano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnixNano()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_UNIX_NANO_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final long COUNT_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getSum() <em>Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSum()
	 * @generated
	 * @ordered
	 */
	protected static final Double SUM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final int SCALE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getZeroCount() <em>Zero Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeroCount()
	 * @generated
	 * @ordered
	 */
	protected static final long ZERO_COUNT_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getFlags() <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected static final int FLAGS_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final Double MIN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final Double MAX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getZeroThreshold() <em>Zero Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeroThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final double ZERO_THRESHOLD_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExponentialHistogramDataPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<KeyValue> getAttributes() {
		return (EList<KeyValue>)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ATTRIBUTES, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getStartTimeUnixNano() {
		return (Long)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartTimeUnixNano(long newStartTimeUnixNano) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO, newStartTimeUnixNano);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTimeUnixNano() {
		return (Long)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__TIME_UNIX_NANO, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__TIME_UNIX_NANO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeUnixNano(long newTimeUnixNano) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__TIME_UNIX_NANO, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__TIME_UNIX_NANO, newTimeUnixNano);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getCount() {
		return (Long)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__COUNT, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount(long newCount) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__COUNT, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__COUNT, newCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getSum() {
		return (Double)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__SUM, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__SUM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSum(Double newSum) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__SUM, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__SUM, newSum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getScale() {
		return (Integer)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__SCALE, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__SCALE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScale(int newScale) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__SCALE, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__SCALE, newScale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getZeroCount() {
		return (Long)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_COUNT, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZeroCount(long newZeroCount) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_COUNT, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_COUNT, newZeroCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExponentialHistogramDataPointBuckets getPositive() {
		return (ExponentialHistogramDataPointBuckets)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__POSITIVE, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__POSITIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositive(ExponentialHistogramDataPointBuckets newPositive, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newPositive, TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__POSITIVE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositive(ExponentialHistogramDataPointBuckets newPositive) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__POSITIVE, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__POSITIVE, newPositive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExponentialHistogramDataPointBuckets getNegative() {
		return (ExponentialHistogramDataPointBuckets)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__NEGATIVE, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__NEGATIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNegative(ExponentialHistogramDataPointBuckets newNegative, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newNegative, TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__NEGATIVE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNegative(ExponentialHistogramDataPointBuckets newNegative) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__NEGATIVE, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__NEGATIVE, newNegative);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFlags() {
		return (Integer)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__FLAGS, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__FLAGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlags(int newFlags) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__FLAGS, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__FLAGS, newFlags);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Exemplar> getExemplars() {
		return (EList<Exemplar>)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__EXEMPLARS, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__EXEMPLARS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getMin() {
		return (Double)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__MIN, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__MIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMin(Double newMin) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__MIN, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__MIN, newMin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getMax() {
		return (Double)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__MAX, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__MAX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax(Double newMax) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__MAX, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__MAX, newMax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getZeroThreshold() {
		return (Double)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_THRESHOLD, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_THRESHOLD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZeroThreshold(double newZeroThreshold) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_THRESHOLD, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_THRESHOLD, newZeroThreshold);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__POSITIVE:
				return basicSetPositive(null, msgs);
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__NEGATIVE:
				return basicSetNegative(null, msgs);
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__EXEMPLARS:
				return ((InternalEList<?>)getExemplars()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ATTRIBUTES:
				return getAttributes();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO:
				return getStartTimeUnixNano();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__TIME_UNIX_NANO:
				return getTimeUnixNano();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__COUNT:
				return getCount();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__SUM:
				return getSum();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__SCALE:
				return getScale();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_COUNT:
				return getZeroCount();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__POSITIVE:
				return getPositive();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__NEGATIVE:
				return getNegative();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__FLAGS:
				return getFlags();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__EXEMPLARS:
				return getExemplars();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__MIN:
				return getMin();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__MAX:
				return getMax();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_THRESHOLD:
				return getZeroThreshold();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO:
				setStartTimeUnixNano(START_TIME_UNIX_NANO_EDEFAULT);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__TIME_UNIX_NANO:
				setTimeUnixNano(TIME_UNIX_NANO_EDEFAULT);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__SUM:
				setSum(SUM_EDEFAULT);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_COUNT:
				setZeroCount(ZERO_COUNT_EDEFAULT);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__POSITIVE:
				setPositive((ExponentialHistogramDataPointBuckets)null);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__NEGATIVE:
				setNegative((ExponentialHistogramDataPointBuckets)null);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__FLAGS:
				setFlags(FLAGS_EDEFAULT);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__EXEMPLARS:
				getExemplars().clear();
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_THRESHOLD:
				setZeroThreshold(ZERO_THRESHOLD_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ATTRIBUTES:
				return !getAttributes().isEmpty();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO:
				return getStartTimeUnixNano() != START_TIME_UNIX_NANO_EDEFAULT;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__TIME_UNIX_NANO:
				return getTimeUnixNano() != TIME_UNIX_NANO_EDEFAULT;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__COUNT:
				return getCount() != COUNT_EDEFAULT;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__SUM:
				return SUM_EDEFAULT == null ? getSum() != null : !SUM_EDEFAULT.equals(getSum());
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__SCALE:
				return getScale() != SCALE_EDEFAULT;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_COUNT:
				return getZeroCount() != ZERO_COUNT_EDEFAULT;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__POSITIVE:
				return getPositive() != null;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__NEGATIVE:
				return getNegative() != null;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__FLAGS:
				return getFlags() != FLAGS_EDEFAULT;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__EXEMPLARS:
				return !getExemplars().isEmpty();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__MIN:
				return MIN_EDEFAULT == null ? getMin() != null : !MIN_EDEFAULT.equals(getMin());
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__MAX:
				return MAX_EDEFAULT == null ? getMax() != null : !MAX_EDEFAULT.equals(getMax());
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_THRESHOLD:
				return getZeroThreshold() != ZERO_THRESHOLD_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ExponentialHistogramDataPointImpl
