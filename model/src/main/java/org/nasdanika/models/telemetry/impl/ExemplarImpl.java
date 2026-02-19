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
import org.nasdanika.models.telemetry.KeyValue;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Exemplar</b></em>'.
 * @generated
 */
public class ExemplarImpl extends MinimalEObjectImpl.Container implements Exemplar {

	protected ExemplarImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.EXEMPLAR;
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<KeyValue> getFilteredAttributes() {
		return (EList<KeyValue>)eDynamicGet(TelemetryPackage.EXEMPLAR__FILTERED_ATTRIBUTES, TelemetryPackage.Literals.EXEMPLAR__FILTERED_ATTRIBUTES, true, true);
	}

	@Override
	public long getTimeUnixNano() {
		return (Long)eDynamicGet(TelemetryPackage.EXEMPLAR__TIME_UNIX_NANO, TelemetryPackage.Literals.EXEMPLAR__TIME_UNIX_NANO, true, true);
	}

	@Override
	public void setTimeUnixNano(long newTimeUnixNano) {
		eDynamicSet(TelemetryPackage.EXEMPLAR__TIME_UNIX_NANO, TelemetryPackage.Literals.EXEMPLAR__TIME_UNIX_NANO, newTimeUnixNano);
	}

	@Override
	public Double getAsDouble() {
		return (Double)eDynamicGet(TelemetryPackage.EXEMPLAR__AS_DOUBLE, TelemetryPackage.Literals.EXEMPLAR__AS_DOUBLE, true, true);
	}

	@Override
	public void setAsDouble(Double newAsDouble) {
		eDynamicSet(TelemetryPackage.EXEMPLAR__AS_DOUBLE, TelemetryPackage.Literals.EXEMPLAR__AS_DOUBLE, newAsDouble);
	}

	@Override
	public Long getAsInt() {
		return (Long)eDynamicGet(TelemetryPackage.EXEMPLAR__AS_INT, TelemetryPackage.Literals.EXEMPLAR__AS_INT, true, true);
	}

	@Override
	public void setAsInt(Long newAsInt) {
		eDynamicSet(TelemetryPackage.EXEMPLAR__AS_INT, TelemetryPackage.Literals.EXEMPLAR__AS_INT, newAsInt);
	}

	@Override
	public String getSpanId() {
		return (String)eDynamicGet(TelemetryPackage.EXEMPLAR__SPAN_ID, TelemetryPackage.Literals.EXEMPLAR__SPAN_ID, true, true);
	}

	@Override
	public void setSpanId(String newSpanId) {
		eDynamicSet(TelemetryPackage.EXEMPLAR__SPAN_ID, TelemetryPackage.Literals.EXEMPLAR__SPAN_ID, newSpanId);
	}

	@Override
	public String getTraceId() {
		return (String)eDynamicGet(TelemetryPackage.EXEMPLAR__TRACE_ID, TelemetryPackage.Literals.EXEMPLAR__TRACE_ID, true, true);
	}

	@Override
	public void setTraceId(String newTraceId) {
		eDynamicSet(TelemetryPackage.EXEMPLAR__TRACE_ID, TelemetryPackage.Literals.EXEMPLAR__TRACE_ID, newTraceId);
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.EXEMPLAR__FILTERED_ATTRIBUTES:
				return ((InternalEList<?>)getFilteredAttributes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.EXEMPLAR__FILTERED_ATTRIBUTES: return getFilteredAttributes();
			case TelemetryPackage.EXEMPLAR__TIME_UNIX_NANO: return getTimeUnixNano();
			case TelemetryPackage.EXEMPLAR__AS_DOUBLE: return getAsDouble();
			case TelemetryPackage.EXEMPLAR__AS_INT: return getAsInt();
			case TelemetryPackage.EXEMPLAR__SPAN_ID: return getSpanId();
			case TelemetryPackage.EXEMPLAR__TRACE_ID: return getTraceId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.EXEMPLAR__FILTERED_ATTRIBUTES:
				getFilteredAttributes().clear();
				getFilteredAttributes().addAll((Collection<? extends KeyValue>)newValue);
				return;
			case TelemetryPackage.EXEMPLAR__TIME_UNIX_NANO:
				setTimeUnixNano((Long)newValue);
				return;
			case TelemetryPackage.EXEMPLAR__AS_DOUBLE:
				setAsDouble((Double)newValue);
				return;
			case TelemetryPackage.EXEMPLAR__AS_INT:
				setAsInt((Long)newValue);
				return;
			case TelemetryPackage.EXEMPLAR__SPAN_ID:
				setSpanId((String)newValue);
				return;
			case TelemetryPackage.EXEMPLAR__TRACE_ID:
				setTraceId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.EXEMPLAR__FILTERED_ATTRIBUTES:
				getFilteredAttributes().clear();
				return;
			case TelemetryPackage.EXEMPLAR__TIME_UNIX_NANO:
				setTimeUnixNano(0L);
				return;
			case TelemetryPackage.EXEMPLAR__AS_DOUBLE:
				setAsDouble(null);
				return;
			case TelemetryPackage.EXEMPLAR__AS_INT:
				setAsInt(null);
				return;
			case TelemetryPackage.EXEMPLAR__SPAN_ID:
				setSpanId(null);
				return;
			case TelemetryPackage.EXEMPLAR__TRACE_ID:
				setTraceId(null);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.EXEMPLAR__FILTERED_ATTRIBUTES: return !getFilteredAttributes().isEmpty();
			case TelemetryPackage.EXEMPLAR__TIME_UNIX_NANO: return getTimeUnixNano() != 0L;
			case TelemetryPackage.EXEMPLAR__AS_DOUBLE: return getAsDouble() != null;
			case TelemetryPackage.EXEMPLAR__AS_INT: return getAsInt() != null;
			case TelemetryPackage.EXEMPLAR__SPAN_ID: return getSpanId() != null;
			case TelemetryPackage.EXEMPLAR__TRACE_ID: return getTraceId() != null;
		}
		return super.eIsSet(featureID);
	}

} //ExemplarImpl
