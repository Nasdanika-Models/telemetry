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
import org.nasdanika.models.telemetry.KeyValue;
import org.nasdanika.models.telemetry.SpanEvent;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Span Event</b></em>'.
 * @generated
 */
public class SpanEventImpl extends MinimalEObjectImpl.Container implements SpanEvent {

	protected SpanEventImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.SPAN_EVENT;
	}

	@Override
	public long getTimeUnixNano() {
		return (Long)eDynamicGet(TelemetryPackage.SPAN_EVENT__TIME_UNIX_NANO, TelemetryPackage.Literals.SPAN_EVENT__TIME_UNIX_NANO, true, true);
	}

	@Override
	public void setTimeUnixNano(long newTimeUnixNano) {
		eDynamicSet(TelemetryPackage.SPAN_EVENT__TIME_UNIX_NANO, TelemetryPackage.Literals.SPAN_EVENT__TIME_UNIX_NANO, newTimeUnixNano);
	}

	@Override
	public String getName() {
		return (String)eDynamicGet(TelemetryPackage.SPAN_EVENT__NAME, TelemetryPackage.Literals.SPAN_EVENT__NAME, true, true);
	}

	@Override
	public void setName(String newName) {
		eDynamicSet(TelemetryPackage.SPAN_EVENT__NAME, TelemetryPackage.Literals.SPAN_EVENT__NAME, newName);
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<KeyValue> getAttributes() {
		return (EList<KeyValue>)eDynamicGet(TelemetryPackage.SPAN_EVENT__ATTRIBUTES, TelemetryPackage.Literals.SPAN_EVENT__ATTRIBUTES, true, true);
	}

	@Override
	public int getDroppedAttributesCount() {
		return (Integer)eDynamicGet(TelemetryPackage.SPAN_EVENT__DROPPED_ATTRIBUTES_COUNT, TelemetryPackage.Literals.SPAN_EVENT__DROPPED_ATTRIBUTES_COUNT, true, true);
	}

	@Override
	public void setDroppedAttributesCount(int newDroppedAttributesCount) {
		eDynamicSet(TelemetryPackage.SPAN_EVENT__DROPPED_ATTRIBUTES_COUNT, TelemetryPackage.Literals.SPAN_EVENT__DROPPED_ATTRIBUTES_COUNT, newDroppedAttributesCount);
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.SPAN_EVENT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.SPAN_EVENT__TIME_UNIX_NANO: return getTimeUnixNano();
			case TelemetryPackage.SPAN_EVENT__NAME: return getName();
			case TelemetryPackage.SPAN_EVENT__ATTRIBUTES: return getAttributes();
			case TelemetryPackage.SPAN_EVENT__DROPPED_ATTRIBUTES_COUNT: return getDroppedAttributesCount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.SPAN_EVENT__TIME_UNIX_NANO:
				setTimeUnixNano((Long)newValue);
				return;
			case TelemetryPackage.SPAN_EVENT__NAME:
				setName((String)newValue);
				return;
			case TelemetryPackage.SPAN_EVENT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends KeyValue>)newValue);
				return;
			case TelemetryPackage.SPAN_EVENT__DROPPED_ATTRIBUTES_COUNT:
				setDroppedAttributesCount((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.SPAN_EVENT__TIME_UNIX_NANO:
				setTimeUnixNano(0L);
				return;
			case TelemetryPackage.SPAN_EVENT__NAME:
				setName(null);
				return;
			case TelemetryPackage.SPAN_EVENT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case TelemetryPackage.SPAN_EVENT__DROPPED_ATTRIBUTES_COUNT:
				setDroppedAttributesCount(0);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.SPAN_EVENT__TIME_UNIX_NANO: return getTimeUnixNano() != 0L;
			case TelemetryPackage.SPAN_EVENT__NAME: return getName() != null;
			case TelemetryPackage.SPAN_EVENT__ATTRIBUTES: return !getAttributes().isEmpty();
			case TelemetryPackage.SPAN_EVENT__DROPPED_ATTRIBUTES_COUNT: return getDroppedAttributesCount() != 0;
		}
		return super.eIsSet(featureID);
	}

} //SpanEventImpl
