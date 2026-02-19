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
import org.nasdanika.models.telemetry.InstrumentationScope;
import org.nasdanika.models.telemetry.LogRecord;
import org.nasdanika.models.telemetry.ScopeLogs;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Scope Logs</b></em>'.
 * @generated
 */
public class ScopeLogsImpl extends MinimalEObjectImpl.Container implements ScopeLogs {

	protected ScopeLogsImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.SCOPE_LOGS;
	}

	@Override
	public InstrumentationScope getScope() {
		return (InstrumentationScope)eDynamicGet(TelemetryPackage.SCOPE_LOGS__SCOPE, TelemetryPackage.Literals.SCOPE_LOGS__SCOPE, true, true);
	}

	@Override
	public void setScope(InstrumentationScope newScope) {
		eDynamicSet(TelemetryPackage.SCOPE_LOGS__SCOPE, TelemetryPackage.Literals.SCOPE_LOGS__SCOPE, newScope);
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<LogRecord> getLogRecords() {
		return (EList<LogRecord>)eDynamicGet(TelemetryPackage.SCOPE_LOGS__LOG_RECORDS, TelemetryPackage.Literals.SCOPE_LOGS__LOG_RECORDS, true, true);
	}

	@Override
	public String getSchemaUrl() {
		return (String)eDynamicGet(TelemetryPackage.SCOPE_LOGS__SCHEMA_URL, TelemetryPackage.Literals.SCOPE_LOGS__SCHEMA_URL, true, true);
	}

	@Override
	public void setSchemaUrl(String newSchemaUrl) {
		eDynamicSet(TelemetryPackage.SCOPE_LOGS__SCHEMA_URL, TelemetryPackage.Literals.SCOPE_LOGS__SCHEMA_URL, newSchemaUrl);
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.SCOPE_LOGS__SCOPE:
				return eDynamicInverseRemove(otherEnd, featureID, msgs);
			case TelemetryPackage.SCOPE_LOGS__LOG_RECORDS:
				return ((InternalEList<?>)getLogRecords()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.SCOPE_LOGS__SCOPE: return getScope();
			case TelemetryPackage.SCOPE_LOGS__LOG_RECORDS: return getLogRecords();
			case TelemetryPackage.SCOPE_LOGS__SCHEMA_URL: return getSchemaUrl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.SCOPE_LOGS__SCOPE:
				setScope((InstrumentationScope)newValue);
				return;
			case TelemetryPackage.SCOPE_LOGS__LOG_RECORDS:
				getLogRecords().clear();
				getLogRecords().addAll((Collection<? extends LogRecord>)newValue);
				return;
			case TelemetryPackage.SCOPE_LOGS__SCHEMA_URL:
				setSchemaUrl((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.SCOPE_LOGS__SCOPE:
				setScope(null);
				return;
			case TelemetryPackage.SCOPE_LOGS__LOG_RECORDS:
				getLogRecords().clear();
				return;
			case TelemetryPackage.SCOPE_LOGS__SCHEMA_URL:
				setSchemaUrl(null);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.SCOPE_LOGS__SCOPE: return getScope() != null;
			case TelemetryPackage.SCOPE_LOGS__LOG_RECORDS: return !getLogRecords().isEmpty();
			case TelemetryPackage.SCOPE_LOGS__SCHEMA_URL: return getSchemaUrl() != null;
		}
		return super.eIsSet(featureID);
	}

} //ScopeLogsImpl
