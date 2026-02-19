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
import org.nasdanika.models.telemetry.MetricsData;
import org.nasdanika.models.telemetry.ResourceMetrics;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Metrics Data</b></em>'.
 * @generated
 */
public class MetricsDataImpl extends MinimalEObjectImpl.Container implements MetricsData {

	protected MetricsDataImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.METRICS_DATA;
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<ResourceMetrics> getResourceMetrics() {
		return (EList<ResourceMetrics>)eDynamicGet(TelemetryPackage.METRICS_DATA__RESOURCE_METRICS, TelemetryPackage.Literals.METRICS_DATA__RESOURCE_METRICS, true, true);
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.METRICS_DATA__RESOURCE_METRICS:
				return ((InternalEList<?>)getResourceMetrics()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.METRICS_DATA__RESOURCE_METRICS: return getResourceMetrics();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.METRICS_DATA__RESOURCE_METRICS:
				getResourceMetrics().clear();
				getResourceMetrics().addAll((Collection<? extends ResourceMetrics>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.METRICS_DATA__RESOURCE_METRICS:
				getResourceMetrics().clear();
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.METRICS_DATA__RESOURCE_METRICS: return !getResourceMetrics().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MetricsDataImpl
