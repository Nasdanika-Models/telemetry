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
import org.nasdanika.models.telemetry.LogsData;
import org.nasdanika.models.telemetry.ResourceLogs;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Logs Data</b></em>'.
 * @generated
 */
public class LogsDataImpl extends MinimalEObjectImpl.Container implements LogsData {

	protected LogsDataImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.LOGS_DATA;
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<ResourceLogs> getResourceLogs() {
		return (EList<ResourceLogs>)eDynamicGet(TelemetryPackage.LOGS_DATA__RESOURCE_LOGS, TelemetryPackage.Literals.LOGS_DATA__RESOURCE_LOGS, true, true);
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.LOGS_DATA__RESOURCE_LOGS:
				return ((InternalEList<?>)getResourceLogs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.LOGS_DATA__RESOURCE_LOGS: return getResourceLogs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.LOGS_DATA__RESOURCE_LOGS:
				getResourceLogs().clear();
				getResourceLogs().addAll((Collection<? extends ResourceLogs>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.LOGS_DATA__RESOURCE_LOGS:
				getResourceLogs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.LOGS_DATA__RESOURCE_LOGS: return !getResourceLogs().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogsDataImpl
