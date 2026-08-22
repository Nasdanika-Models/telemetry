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
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Histogram Data Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.telemetry.impl.HistogramDataPointImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.HistogramDataPointImpl#getStartTimeUnixNano <em>Start Time Unix Nano</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.HistogramDataPointImpl#getTimeUnixNano <em>Time Unix Nano</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.HistogramDataPointImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.HistogramDataPointImpl#getSum <em>Sum</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.HistogramDataPointImpl#getBucketCounts <em>Bucket Counts</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.HistogramDataPointImpl#getExplicitBounds <em>Explicit Bounds</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.HistogramDataPointImpl#getExemplars <em>Exemplars</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.HistogramDataPointImpl#getFlags <em>Flags</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.HistogramDataPointImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.HistogramDataPointImpl#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistogramDataPointImpl extends MinimalEObjectImpl.Container implements HistogramDataPoint {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistogramDataPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.HISTOGRAM_DATA_POINT;
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
		return (EList<KeyValue>)eDynamicGet(TelemetryPackage.HISTOGRAM_DATA_POINT__ATTRIBUTES, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getStartTimeUnixNano() {
		return (Long)eDynamicGet(TelemetryPackage.HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartTimeUnixNano(long newStartTimeUnixNano) {
		eDynamicSet(TelemetryPackage.HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO, newStartTimeUnixNano);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTimeUnixNano() {
		return (Long)eDynamicGet(TelemetryPackage.HISTOGRAM_DATA_POINT__TIME_UNIX_NANO, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__TIME_UNIX_NANO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeUnixNano(long newTimeUnixNano) {
		eDynamicSet(TelemetryPackage.HISTOGRAM_DATA_POINT__TIME_UNIX_NANO, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__TIME_UNIX_NANO, newTimeUnixNano);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getCount() {
		return (Long)eDynamicGet(TelemetryPackage.HISTOGRAM_DATA_POINT__COUNT, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount(long newCount) {
		eDynamicSet(TelemetryPackage.HISTOGRAM_DATA_POINT__COUNT, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__COUNT, newCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getSum() {
		return (Double)eDynamicGet(TelemetryPackage.HISTOGRAM_DATA_POINT__SUM, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__SUM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSum(Double newSum) {
		eDynamicSet(TelemetryPackage.HISTOGRAM_DATA_POINT__SUM, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__SUM, newSum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Long> getBucketCounts() {
		return (EList<Long>)eDynamicGet(TelemetryPackage.HISTOGRAM_DATA_POINT__BUCKET_COUNTS, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__BUCKET_COUNTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Double> getExplicitBounds() {
		return (EList<Double>)eDynamicGet(TelemetryPackage.HISTOGRAM_DATA_POINT__EXPLICIT_BOUNDS, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__EXPLICIT_BOUNDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Exemplar> getExemplars() {
		return (EList<Exemplar>)eDynamicGet(TelemetryPackage.HISTOGRAM_DATA_POINT__EXEMPLARS, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__EXEMPLARS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFlags() {
		return (Integer)eDynamicGet(TelemetryPackage.HISTOGRAM_DATA_POINT__FLAGS, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__FLAGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlags(int newFlags) {
		eDynamicSet(TelemetryPackage.HISTOGRAM_DATA_POINT__FLAGS, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__FLAGS, newFlags);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getMin() {
		return (Double)eDynamicGet(TelemetryPackage.HISTOGRAM_DATA_POINT__MIN, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__MIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMin(Double newMin) {
		eDynamicSet(TelemetryPackage.HISTOGRAM_DATA_POINT__MIN, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__MIN, newMin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getMax() {
		return (Double)eDynamicGet(TelemetryPackage.HISTOGRAM_DATA_POINT__MAX, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__MAX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax(Double newMax) {
		eDynamicSet(TelemetryPackage.HISTOGRAM_DATA_POINT__MAX, TelemetryPackage.Literals.HISTOGRAM_DATA_POINT__MAX, newMax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.HISTOGRAM_DATA_POINT__ATTRIBUTES:
				return getAttributes();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO:
				return getStartTimeUnixNano();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__TIME_UNIX_NANO:
				return getTimeUnixNano();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__COUNT:
				return getCount();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__SUM:
				return getSum();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__BUCKET_COUNTS:
				return getBucketCounts();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__EXPLICIT_BOUNDS:
				return getExplicitBounds();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__EXEMPLARS:
				return getExemplars();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__FLAGS:
				return getFlags();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__MIN:
				return getMin();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__MAX:
				return getMax();
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.HISTOGRAM_DATA_POINT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO:
				setStartTimeUnixNano(START_TIME_UNIX_NANO_EDEFAULT);
				return;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__TIME_UNIX_NANO:
				setTimeUnixNano(TIME_UNIX_NANO_EDEFAULT);
				return;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__SUM:
				setSum(SUM_EDEFAULT);
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
				setFlags(FLAGS_EDEFAULT);
				return;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__MAX:
				setMax(MAX_EDEFAULT);
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
			case TelemetryPackage.HISTOGRAM_DATA_POINT__ATTRIBUTES:
				return !getAttributes().isEmpty();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO:
				return getStartTimeUnixNano() != START_TIME_UNIX_NANO_EDEFAULT;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__TIME_UNIX_NANO:
				return getTimeUnixNano() != TIME_UNIX_NANO_EDEFAULT;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__COUNT:
				return getCount() != COUNT_EDEFAULT;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__SUM:
				return SUM_EDEFAULT == null ? getSum() != null : !SUM_EDEFAULT.equals(getSum());
			case TelemetryPackage.HISTOGRAM_DATA_POINT__BUCKET_COUNTS:
				return !getBucketCounts().isEmpty();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__EXPLICIT_BOUNDS:
				return !getExplicitBounds().isEmpty();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__EXEMPLARS:
				return !getExemplars().isEmpty();
			case TelemetryPackage.HISTOGRAM_DATA_POINT__FLAGS:
				return getFlags() != FLAGS_EDEFAULT;
			case TelemetryPackage.HISTOGRAM_DATA_POINT__MIN:
				return MIN_EDEFAULT == null ? getMin() != null : !MIN_EDEFAULT.equals(getMin());
			case TelemetryPackage.HISTOGRAM_DATA_POINT__MAX:
				return MAX_EDEFAULT == null ? getMax() != null : !MAX_EDEFAULT.equals(getMax());
		}
		return super.eIsSet(featureID);
	}

} //HistogramDataPointImpl
