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
import org.nasdanika.models.telemetry.ResourceLogs;
import org.nasdanika.models.telemetry.ScopeLogs;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Resource Logs</b></em>'.
 * @generated
 */
public class ResourceLogsImpl extends MinimalEObjectImpl.Container implements ResourceLogs {

	protected ResourceLogsImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.RESOURCE_LOGS;
	}

	@Override
	public Resource getResource() {
		return (Resource)eDynamicGet(TelemetryPackage.RESOURCE_LOGS__RESOURCE, TelemetryPackage.Literals.RESOURCE_LOGS__RESOURCE, true, true);
	}

	@Override
	public void setResource(Resource newResource) {
		eDynamicSet(TelemetryPackage.RESOURCE_LOGS__RESOURCE, TelemetryPackage.Literals.RESOURCE_LOGS__RESOURCE, newResource);
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<ScopeLogs> getScopeLogs() {
		return (EList<ScopeLogs>)eDynamicGet(TelemetryPackage.RESOURCE_LOGS__SCOPE_LOGS, TelemetryPackage.Literals.RESOURCE_LOGS__SCOPE_LOGS, true, true);
	}

	@Override
	public String getSchemaUrl() {
		return (String)eDynamicGet(TelemetryPackage.RESOURCE_LOGS__SCHEMA_URL, TelemetryPackage.Literals.RESOURCE_LOGS__SCHEMA_URL, true, true);
	}

	@Override
	public void setSchemaUrl(String newSchemaUrl) {
		eDynamicSet(TelemetryPackage.RESOURCE_LOGS__SCHEMA_URL, TelemetryPackage.Literals.RESOURCE_LOGS__SCHEMA_URL, newSchemaUrl);
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.RESOURCE_LOGS__RESOURCE:
				return eDynamicInverseRemove(otherEnd, featureID, msgs);
			case TelemetryPackage.RESOURCE_LOGS__SCOPE_LOGS:
				return ((InternalEList<?>)getScopeLogs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.RESOURCE_LOGS__RESOURCE: return getResource();
			case TelemetryPackage.RESOURCE_LOGS__SCOPE_LOGS: return getScopeLogs();
			case TelemetryPackage.RESOURCE_LOGS__SCHEMA_URL: return getSchemaUrl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.RESOURCE_LOGS__RESOURCE:
				setResource((Resource)newValue);
				return;
			case TelemetryPackage.RESOURCE_LOGS__SCOPE_LOGS:
				getScopeLogs().clear();
				getScopeLogs().addAll((Collection<? extends ScopeLogs>)newValue);
				return;
			case TelemetryPackage.RESOURCE_LOGS__SCHEMA_URL:
				setSchemaUrl((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.RESOURCE_LOGS__RESOURCE:
				setResource(null);
				return;
			case TelemetryPackage.RESOURCE_LOGS__SCOPE_LOGS:
				getScopeLogs().clear();
				return;
			case TelemetryPackage.RESOURCE_LOGS__SCHEMA_URL:
				setSchemaUrl(null);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.RESOURCE_LOGS__RESOURCE: return getResource() != null;
			case TelemetryPackage.RESOURCE_LOGS__SCOPE_LOGS: return !getScopeLogs().isEmpty();
			case TelemetryPackage.RESOURCE_LOGS__SCHEMA_URL: return getSchemaUrl() != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceLogsImpl
