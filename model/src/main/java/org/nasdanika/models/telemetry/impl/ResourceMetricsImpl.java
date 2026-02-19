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
import org.nasdanika.models.telemetry.Resource;
import org.nasdanika.models.telemetry.ResourceMetrics;
import org.nasdanika.models.telemetry.ScopeMetrics;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Resource Metrics</b></em>'.
 * @generated
 */
public class ResourceMetricsImpl extends MinimalEObjectImpl.Container implements ResourceMetrics {

	protected ResourceMetricsImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.RESOURCE_METRICS;
	}

	@Override
	public Resource getResource() {
		return (Resource)eDynamicGet(TelemetryPackage.RESOURCE_METRICS__RESOURCE, TelemetryPackage.Literals.RESOURCE_METRICS__RESOURCE, true, true);
	}

	@Override
	public void setResource(Resource newResource) {
		eDynamicSet(TelemetryPackage.RESOURCE_METRICS__RESOURCE, TelemetryPackage.Literals.RESOURCE_METRICS__RESOURCE, newResource);
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<ScopeMetrics> getScopeMetrics() {
		return (EList<ScopeMetrics>)eDynamicGet(TelemetryPackage.RESOURCE_METRICS__SCOPE_METRICS, TelemetryPackage.Literals.RESOURCE_METRICS__SCOPE_METRICS, true, true);
	}

	@Override
	public String getSchemaUrl() {
		return (String)eDynamicGet(TelemetryPackage.RESOURCE_METRICS__SCHEMA_URL, TelemetryPackage.Literals.RESOURCE_METRICS__SCHEMA_URL, true, true);
	}

	@Override
	public void setSchemaUrl(String newSchemaUrl) {
		eDynamicSet(TelemetryPackage.RESOURCE_METRICS__SCHEMA_URL, TelemetryPackage.Literals.RESOURCE_METRICS__SCHEMA_URL, newSchemaUrl);
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.RESOURCE_METRICS__RESOURCE:
				return eDynamicInverseRemove(otherEnd, featureID, msgs);
			case TelemetryPackage.RESOURCE_METRICS__SCOPE_METRICS:
				return ((InternalEList<?>)getScopeMetrics()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.RESOURCE_METRICS__RESOURCE: return getResource();
			case TelemetryPackage.RESOURCE_METRICS__SCOPE_METRICS: return getScopeMetrics();
			case TelemetryPackage.RESOURCE_METRICS__SCHEMA_URL: return getSchemaUrl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.RESOURCE_METRICS__RESOURCE:
				setResource((Resource)newValue);
				return;
			case TelemetryPackage.RESOURCE_METRICS__SCOPE_METRICS:
				getScopeMetrics().clear();
				getScopeMetrics().addAll((Collection<? extends ScopeMetrics>)newValue);
				return;
			case TelemetryPackage.RESOURCE_METRICS__SCHEMA_URL:
				setSchemaUrl((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.RESOURCE_METRICS__RESOURCE:
				setResource(null);
				return;
			case TelemetryPackage.RESOURCE_METRICS__SCOPE_METRICS:
				getScopeMetrics().clear();
				return;
			case TelemetryPackage.RESOURCE_METRICS__SCHEMA_URL:
				setSchemaUrl(null);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.RESOURCE_METRICS__RESOURCE: return getResource() != null;
			case TelemetryPackage.RESOURCE_METRICS__SCOPE_METRICS: return !getScopeMetrics().isEmpty();
			case TelemetryPackage.RESOURCE_METRICS__SCHEMA_URL: return getSchemaUrl() != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceMetricsImpl
