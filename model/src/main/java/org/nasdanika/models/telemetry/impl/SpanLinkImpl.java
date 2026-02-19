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
import org.nasdanika.models.telemetry.SpanLink;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Span Link</b></em>'.
 * @generated
 */
public class SpanLinkImpl extends MinimalEObjectImpl.Container implements SpanLink {

	protected SpanLinkImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.SPAN_LINK;
	}

	@Override
	public String getTraceId() {
		return (String)eDynamicGet(TelemetryPackage.SPAN_LINK__TRACE_ID, TelemetryPackage.Literals.SPAN_LINK__TRACE_ID, true, true);
	}

	@Override
	public void setTraceId(String newTraceId) {
		eDynamicSet(TelemetryPackage.SPAN_LINK__TRACE_ID, TelemetryPackage.Literals.SPAN_LINK__TRACE_ID, newTraceId);
	}

	@Override
	public String getSpanId() {
		return (String)eDynamicGet(TelemetryPackage.SPAN_LINK__SPAN_ID, TelemetryPackage.Literals.SPAN_LINK__SPAN_ID, true, true);
	}

	@Override
	public void setSpanId(String newSpanId) {
		eDynamicSet(TelemetryPackage.SPAN_LINK__SPAN_ID, TelemetryPackage.Literals.SPAN_LINK__SPAN_ID, newSpanId);
	}

	@Override
	public String getTraceState() {
		return (String)eDynamicGet(TelemetryPackage.SPAN_LINK__TRACE_STATE, TelemetryPackage.Literals.SPAN_LINK__TRACE_STATE, true, true);
	}

	@Override
	public void setTraceState(String newTraceState) {
		eDynamicSet(TelemetryPackage.SPAN_LINK__TRACE_STATE, TelemetryPackage.Literals.SPAN_LINK__TRACE_STATE, newTraceState);
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<KeyValue> getAttributes() {
		return (EList<KeyValue>)eDynamicGet(TelemetryPackage.SPAN_LINK__ATTRIBUTES, TelemetryPackage.Literals.SPAN_LINK__ATTRIBUTES, true, true);
	}

	@Override
	public int getDroppedAttributesCount() {
		return (Integer)eDynamicGet(TelemetryPackage.SPAN_LINK__DROPPED_ATTRIBUTES_COUNT, TelemetryPackage.Literals.SPAN_LINK__DROPPED_ATTRIBUTES_COUNT, true, true);
	}

	@Override
	public void setDroppedAttributesCount(int newDroppedAttributesCount) {
		eDynamicSet(TelemetryPackage.SPAN_LINK__DROPPED_ATTRIBUTES_COUNT, TelemetryPackage.Literals.SPAN_LINK__DROPPED_ATTRIBUTES_COUNT, newDroppedAttributesCount);
	}

	@Override
	public int getFlags() {
		return (Integer)eDynamicGet(TelemetryPackage.SPAN_LINK__FLAGS, TelemetryPackage.Literals.SPAN_LINK__FLAGS, true, true);
	}

	@Override
	public void setFlags(int newFlags) {
		eDynamicSet(TelemetryPackage.SPAN_LINK__FLAGS, TelemetryPackage.Literals.SPAN_LINK__FLAGS, newFlags);
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.SPAN_LINK__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.SPAN_LINK__TRACE_ID: return getTraceId();
			case TelemetryPackage.SPAN_LINK__SPAN_ID: return getSpanId();
			case TelemetryPackage.SPAN_LINK__TRACE_STATE: return getTraceState();
			case TelemetryPackage.SPAN_LINK__ATTRIBUTES: return getAttributes();
			case TelemetryPackage.SPAN_LINK__DROPPED_ATTRIBUTES_COUNT: return getDroppedAttributesCount();
			case TelemetryPackage.SPAN_LINK__FLAGS: return getFlags();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.SPAN_LINK__TRACE_ID:
				setTraceId((String)newValue);
				return;
			case TelemetryPackage.SPAN_LINK__SPAN_ID:
				setSpanId((String)newValue);
				return;
			case TelemetryPackage.SPAN_LINK__TRACE_STATE:
				setTraceState((String)newValue);
				return;
			case TelemetryPackage.SPAN_LINK__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends KeyValue>)newValue);
				return;
			case TelemetryPackage.SPAN_LINK__DROPPED_ATTRIBUTES_COUNT:
				setDroppedAttributesCount((Integer)newValue);
				return;
			case TelemetryPackage.SPAN_LINK__FLAGS:
				setFlags((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.SPAN_LINK__TRACE_ID:
				setTraceId(null);
				return;
			case TelemetryPackage.SPAN_LINK__SPAN_ID:
				setSpanId(null);
				return;
			case TelemetryPackage.SPAN_LINK__TRACE_STATE:
				setTraceState(null);
				return;
			case TelemetryPackage.SPAN_LINK__ATTRIBUTES:
				getAttributes().clear();
				return;
			case TelemetryPackage.SPAN_LINK__DROPPED_ATTRIBUTES_COUNT:
				setDroppedAttributesCount(0);
				return;
			case TelemetryPackage.SPAN_LINK__FLAGS:
				setFlags(0);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.SPAN_LINK__TRACE_ID: return getTraceId() != null;
			case TelemetryPackage.SPAN_LINK__SPAN_ID: return getSpanId() != null;
			case TelemetryPackage.SPAN_LINK__TRACE_STATE: return getTraceState() != null;
			case TelemetryPackage.SPAN_LINK__ATTRIBUTES: return !getAttributes().isEmpty();
			case TelemetryPackage.SPAN_LINK__DROPPED_ATTRIBUTES_COUNT: return getDroppedAttributesCount() != 0;
			case TelemetryPackage.SPAN_LINK__FLAGS: return getFlags() != 0;
		}
		return super.eIsSet(featureID);
	}

} //SpanLinkImpl
