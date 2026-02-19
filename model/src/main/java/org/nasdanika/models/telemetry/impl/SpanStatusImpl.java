/**
 */
package org.nasdanika.models.telemetry.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.models.telemetry.SpanStatus;
import org.nasdanika.models.telemetry.StatusCode;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Span Status</b></em>'.
 * @generated
 */
public class SpanStatusImpl extends MinimalEObjectImpl.Container implements SpanStatus {

	protected SpanStatusImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.SPAN_STATUS;
	}

	@Override
	public String getMessage() {
		return (String)eDynamicGet(TelemetryPackage.SPAN_STATUS__MESSAGE, TelemetryPackage.Literals.SPAN_STATUS__MESSAGE, true, true);
	}

	@Override
	public void setMessage(String newMessage) {
		eDynamicSet(TelemetryPackage.SPAN_STATUS__MESSAGE, TelemetryPackage.Literals.SPAN_STATUS__MESSAGE, newMessage);
	}

	@Override
	public StatusCode getCode() {
		return (StatusCode)eDynamicGet(TelemetryPackage.SPAN_STATUS__CODE, TelemetryPackage.Literals.SPAN_STATUS__CODE, true, true);
	}

	@Override
	public void setCode(StatusCode newCode) {
		eDynamicSet(TelemetryPackage.SPAN_STATUS__CODE, TelemetryPackage.Literals.SPAN_STATUS__CODE, newCode);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.SPAN_STATUS__MESSAGE: return getMessage();
			case TelemetryPackage.SPAN_STATUS__CODE: return getCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.SPAN_STATUS__MESSAGE:
				setMessage((String)newValue);
				return;
			case TelemetryPackage.SPAN_STATUS__CODE:
				setCode((StatusCode)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.SPAN_STATUS__MESSAGE:
				setMessage(null);
				return;
			case TelemetryPackage.SPAN_STATUS__CODE:
				setCode(StatusCode.STATUS_CODE_UNSET);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.SPAN_STATUS__MESSAGE: return getMessage() != null;
			case TelemetryPackage.SPAN_STATUS__CODE: return getCode() != StatusCode.STATUS_CODE_UNSET;
		}
		return super.eIsSet(featureID);
	}

} //SpanStatusImpl
