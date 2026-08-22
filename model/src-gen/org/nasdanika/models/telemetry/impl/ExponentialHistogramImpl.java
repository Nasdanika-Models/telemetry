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
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exponential Histogram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.telemetry.impl.ExponentialHistogramImpl#getDataPoints <em>Data Points</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.ExponentialHistogramImpl#getAggregationTemporality <em>Aggregation Temporality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExponentialHistogramImpl extends MetricImpl implements ExponentialHistogram {
	/**
	 * The default value of the '{@link #getAggregationTemporality() <em>Aggregation Temporality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationTemporality()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationTemporality AGGREGATION_TEMPORALITY_EDEFAULT = AggregationTemporality.AGGREGATION_TEMPORALITY_UNSPECIFIED;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExponentialHistogramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ExponentialHistogramDataPoint> getDataPoints() {
		return (EList<ExponentialHistogramDataPoint>)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM__DATA_POINTS, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM__DATA_POINTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AggregationTemporality getAggregationTemporality() {
		return (AggregationTemporality)eDynamicGet(TelemetryPackage.EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregationTemporality(AggregationTemporality newAggregationTemporality) {
		eDynamicSet(TelemetryPackage.EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY, TelemetryPackage.Literals.EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY, newAggregationTemporality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM__DATA_POINTS:
				return ((InternalEList<?>)getDataPoints()).basicRemove(otherEnd, msgs);
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
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM__DATA_POINTS:
				return getDataPoints();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY:
				return getAggregationTemporality();
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM__DATA_POINTS:
				getDataPoints().clear();
				return;
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY:
				setAggregationTemporality(AGGREGATION_TEMPORALITY_EDEFAULT);
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
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM__DATA_POINTS:
				return !getDataPoints().isEmpty();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY:
				return getAggregationTemporality() != AGGREGATION_TEMPORALITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ExponentialHistogramImpl
