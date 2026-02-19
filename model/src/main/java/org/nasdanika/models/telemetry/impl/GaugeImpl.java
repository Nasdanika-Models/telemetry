/**
 */
package org.nasdanika.models.telemetry.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.telemetry.Gauge;
import org.nasdanika.models.telemetry.NumberDataPoint;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Gauge</b></em>'.
 * @generated
 */
public class GaugeImpl extends MetricImpl implements Gauge {

	protected GaugeImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.GAUGE;
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<NumberDataPoint> getDataPoints() {
		return (EList<NumberDataPoint>)eDynamicGet(TelemetryPackage.GAUGE__DATA_POINTS, TelemetryPackage.Literals.GAUGE__DATA_POINTS, true, true);
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.GAUGE__DATA_POINTS:
				return ((InternalEList<?>)getDataPoints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.GAUGE__DATA_POINTS: return getDataPoints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.GAUGE__DATA_POINTS:
				getDataPoints().clear();
				getDataPoints().addAll((Collection<? extends NumberDataPoint>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.GAUGE__DATA_POINTS:
				getDataPoints().clear();
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.GAUGE__DATA_POINTS: return !getDataPoints().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GaugeImpl
