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
import org.nasdanika.models.telemetry.AnyValue;
import org.nasdanika.models.telemetry.KeyValue;
import org.nasdanika.models.telemetry.LogRecord;
import org.nasdanika.models.telemetry.SeverityNumber;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Log Record</b></em>'.
 * @generated
 */
public class LogRecordImpl extends MinimalEObjectImpl.Container implements LogRecord {

	protected LogRecordImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.LOG_RECORD;
	}

	@Override
	public long getTimeUnixNano() {
		return (Long)eDynamicGet(TelemetryPackage.LOG_RECORD__TIME_UNIX_NANO, TelemetryPackage.Literals.LOG_RECORD__TIME_UNIX_NANO, true, true);
	}

	@Override
	public void setTimeUnixNano(long newTimeUnixNano) {
		eDynamicSet(TelemetryPackage.LOG_RECORD__TIME_UNIX_NANO, TelemetryPackage.Literals.LOG_RECORD__TIME_UNIX_NANO, newTimeUnixNano);
	}

	@Override
	public long getObservedTimeUnixNano() {
		return (Long)eDynamicGet(TelemetryPackage.LOG_RECORD__OBSERVED_TIME_UNIX_NANO, TelemetryPackage.Literals.LOG_RECORD__OBSERVED_TIME_UNIX_NANO, true, true);
	}

	@Override
	public void setObservedTimeUnixNano(long newObservedTimeUnixNano) {
		eDynamicSet(TelemetryPackage.LOG_RECORD__OBSERVED_TIME_UNIX_NANO, TelemetryPackage.Literals.LOG_RECORD__OBSERVED_TIME_UNIX_NANO, newObservedTimeUnixNano);
	}

	@Override
	public SeverityNumber getSeverityNumber() {
		return (SeverityNumber)eDynamicGet(TelemetryPackage.LOG_RECORD__SEVERITY_NUMBER, TelemetryPackage.Literals.LOG_RECORD__SEVERITY_NUMBER, true, true);
	}

	@Override
	public void setSeverityNumber(SeverityNumber newSeverityNumber) {
		eDynamicSet(TelemetryPackage.LOG_RECORD__SEVERITY_NUMBER, TelemetryPackage.Literals.LOG_RECORD__SEVERITY_NUMBER, newSeverityNumber);
	}

	@Override
	public String getSeverityText() {
		return (String)eDynamicGet(TelemetryPackage.LOG_RECORD__SEVERITY_TEXT, TelemetryPackage.Literals.LOG_RECORD__SEVERITY_TEXT, true, true);
	}

	@Override
	public void setSeverityText(String newSeverityText) {
		eDynamicSet(TelemetryPackage.LOG_RECORD__SEVERITY_TEXT, TelemetryPackage.Literals.LOG_RECORD__SEVERITY_TEXT, newSeverityText);
	}

	@Override
	public AnyValue getBody() {
		return (AnyValue)eDynamicGet(TelemetryPackage.LOG_RECORD__BODY, TelemetryPackage.Literals.LOG_RECORD__BODY, true, true);
	}

	@Override
	public void setBody(AnyValue newBody) {
		eDynamicSet(TelemetryPackage.LOG_RECORD__BODY, TelemetryPackage.Literals.LOG_RECORD__BODY, newBody);
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<KeyValue> getAttributes() {
		return (EList<KeyValue>)eDynamicGet(TelemetryPackage.LOG_RECORD__ATTRIBUTES, TelemetryPackage.Literals.LOG_RECORD__ATTRIBUTES, true, true);
	}

	@Override
	public int getDroppedAttributesCount() {
		return (Integer)eDynamicGet(TelemetryPackage.LOG_RECORD__DROPPED_ATTRIBUTES_COUNT, TelemetryPackage.Literals.LOG_RECORD__DROPPED_ATTRIBUTES_COUNT, true, true);
	}

	@Override
	public void setDroppedAttributesCount(int newDroppedAttributesCount) {
		eDynamicSet(TelemetryPackage.LOG_RECORD__DROPPED_ATTRIBUTES_COUNT, TelemetryPackage.Literals.LOG_RECORD__DROPPED_ATTRIBUTES_COUNT, newDroppedAttributesCount);
	}

	@Override
	public int getFlags() {
		return (Integer)eDynamicGet(TelemetryPackage.LOG_RECORD__FLAGS, TelemetryPackage.Literals.LOG_RECORD__FLAGS, true, true);
	}

	@Override
	public void setFlags(int newFlags) {
		eDynamicSet(TelemetryPackage.LOG_RECORD__FLAGS, TelemetryPackage.Literals.LOG_RECORD__FLAGS, newFlags);
	}

	@Override
	public String getTraceId() {
		return (String)eDynamicGet(TelemetryPackage.LOG_RECORD__TRACE_ID, TelemetryPackage.Literals.LOG_RECORD__TRACE_ID, true, true);
	}

	@Override
	public void setTraceId(String newTraceId) {
		eDynamicSet(TelemetryPackage.LOG_RECORD__TRACE_ID, TelemetryPackage.Literals.LOG_RECORD__TRACE_ID, newTraceId);
	}

	@Override
	public String getSpanId() {
		return (String)eDynamicGet(TelemetryPackage.LOG_RECORD__SPAN_ID, TelemetryPackage.Literals.LOG_RECORD__SPAN_ID, true, true);
	}

	@Override
	public void setSpanId(String newSpanId) {
		eDynamicSet(TelemetryPackage.LOG_RECORD__SPAN_ID, TelemetryPackage.Literals.LOG_RECORD__SPAN_ID, newSpanId);
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.LOG_RECORD__BODY:
				return eDynamicInverseRemove(otherEnd, featureID, msgs);
			case TelemetryPackage.LOG_RECORD__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.LOG_RECORD__TIME_UNIX_NANO: return getTimeUnixNano();
			case TelemetryPackage.LOG_RECORD__OBSERVED_TIME_UNIX_NANO: return getObservedTimeUnixNano();
			case TelemetryPackage.LOG_RECORD__SEVERITY_NUMBER: return getSeverityNumber();
			case TelemetryPackage.LOG_RECORD__SEVERITY_TEXT: return getSeverityText();
			case TelemetryPackage.LOG_RECORD__BODY: return getBody();
			case TelemetryPackage.LOG_RECORD__ATTRIBUTES: return getAttributes();
			case TelemetryPackage.LOG_RECORD__DROPPED_ATTRIBUTES_COUNT: return getDroppedAttributesCount();
			case TelemetryPackage.LOG_RECORD__FLAGS: return getFlags();
			case TelemetryPackage.LOG_RECORD__TRACE_ID: return getTraceId();
			case TelemetryPackage.LOG_RECORD__SPAN_ID: return getSpanId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.LOG_RECORD__TIME_UNIX_NANO:
				setTimeUnixNano((Long)newValue);
				return;
			case TelemetryPackage.LOG_RECORD__OBSERVED_TIME_UNIX_NANO:
				setObservedTimeUnixNano((Long)newValue);
				return;
			case TelemetryPackage.LOG_RECORD__SEVERITY_NUMBER:
				setSeverityNumber((SeverityNumber)newValue);
				return;
			case TelemetryPackage.LOG_RECORD__SEVERITY_TEXT:
				setSeverityText((String)newValue);
				return;
			case TelemetryPackage.LOG_RECORD__BODY:
				setBody((AnyValue)newValue);
				return;
			case TelemetryPackage.LOG_RECORD__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends KeyValue>)newValue);
				return;
			case TelemetryPackage.LOG_RECORD__DROPPED_ATTRIBUTES_COUNT:
				setDroppedAttributesCount((Integer)newValue);
				return;
			case TelemetryPackage.LOG_RECORD__FLAGS:
				setFlags((Integer)newValue);
				return;
			case TelemetryPackage.LOG_RECORD__TRACE_ID:
				setTraceId((String)newValue);
				return;
			case TelemetryPackage.LOG_RECORD__SPAN_ID:
				setSpanId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.LOG_RECORD__TIME_UNIX_NANO:
				setTimeUnixNano(0L);
				return;
			case TelemetryPackage.LOG_RECORD__OBSERVED_TIME_UNIX_NANO:
				setObservedTimeUnixNano(0L);
				return;
			case TelemetryPackage.LOG_RECORD__SEVERITY_NUMBER:
				setSeverityNumber(SeverityNumber.SEVERITY_NUMBER_UNSPECIFIED);
				return;
			case TelemetryPackage.LOG_RECORD__SEVERITY_TEXT:
				setSeverityText(null);
				return;
			case TelemetryPackage.LOG_RECORD__BODY:
				setBody(null);
				return;
			case TelemetryPackage.LOG_RECORD__ATTRIBUTES:
				getAttributes().clear();
				return;
			case TelemetryPackage.LOG_RECORD__DROPPED_ATTRIBUTES_COUNT:
				setDroppedAttributesCount(0);
				return;
			case TelemetryPackage.LOG_RECORD__FLAGS:
				setFlags(0);
				return;
			case TelemetryPackage.LOG_RECORD__TRACE_ID:
				setTraceId(null);
				return;
			case TelemetryPackage.LOG_RECORD__SPAN_ID:
				setSpanId(null);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.LOG_RECORD__TIME_UNIX_NANO: return getTimeUnixNano() != 0L;
			case TelemetryPackage.LOG_RECORD__OBSERVED_TIME_UNIX_NANO: return getObservedTimeUnixNano() != 0L;
			case TelemetryPackage.LOG_RECORD__SEVERITY_NUMBER: return getSeverityNumber() != SeverityNumber.SEVERITY_NUMBER_UNSPECIFIED;
			case TelemetryPackage.LOG_RECORD__SEVERITY_TEXT: return getSeverityText() != null;
			case TelemetryPackage.LOG_RECORD__BODY: return getBody() != null;
			case TelemetryPackage.LOG_RECORD__ATTRIBUTES: return !getAttributes().isEmpty();
			case TelemetryPackage.LOG_RECORD__DROPPED_ATTRIBUTES_COUNT: return getDroppedAttributesCount() != 0;
			case TelemetryPackage.LOG_RECORD__FLAGS: return getFlags() != 0;
			case TelemetryPackage.LOG_RECORD__TRACE_ID: return getTraceId() != null;
			case TelemetryPackage.LOG_RECORD__SPAN_ID: return getSpanId() != null;
		}
		return super.eIsSet(featureID);
	}

} //LogRecordImpl
