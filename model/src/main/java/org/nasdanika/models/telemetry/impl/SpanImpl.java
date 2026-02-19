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
import org.nasdanika.models.telemetry.Span;
import org.nasdanika.models.telemetry.SpanEvent;
import org.nasdanika.models.telemetry.SpanKind;
import org.nasdanika.models.telemetry.SpanLink;
import org.nasdanika.models.telemetry.SpanStatus;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Span</b></em>'.
 * @generated
 */
public class SpanImpl extends MinimalEObjectImpl.Container implements Span {

	protected SpanImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.SPAN;
	}

	@Override
	public String getTraceId() {
		return (String)eDynamicGet(TelemetryPackage.SPAN__TRACE_ID, TelemetryPackage.Literals.SPAN__TRACE_ID, true, true);
	}

	@Override
	public void setTraceId(String newTraceId) {
		eDynamicSet(TelemetryPackage.SPAN__TRACE_ID, TelemetryPackage.Literals.SPAN__TRACE_ID, newTraceId);
	}

	@Override
	public String getSpanId() {
		return (String)eDynamicGet(TelemetryPackage.SPAN__SPAN_ID, TelemetryPackage.Literals.SPAN__SPAN_ID, true, true);
	}

	@Override
	public void setSpanId(String newSpanId) {
		eDynamicSet(TelemetryPackage.SPAN__SPAN_ID, TelemetryPackage.Literals.SPAN__SPAN_ID, newSpanId);
	}

	@Override
	public String getTraceState() {
		return (String)eDynamicGet(TelemetryPackage.SPAN__TRACE_STATE, TelemetryPackage.Literals.SPAN__TRACE_STATE, true, true);
	}

	@Override
	public void setTraceState(String newTraceState) {
		eDynamicSet(TelemetryPackage.SPAN__TRACE_STATE, TelemetryPackage.Literals.SPAN__TRACE_STATE, newTraceState);
	}

	@Override
	public String getParentSpanId() {
		return (String)eDynamicGet(TelemetryPackage.SPAN__PARENT_SPAN_ID, TelemetryPackage.Literals.SPAN__PARENT_SPAN_ID, true, true);
	}

	@Override
	public void setParentSpanId(String newParentSpanId) {
		eDynamicSet(TelemetryPackage.SPAN__PARENT_SPAN_ID, TelemetryPackage.Literals.SPAN__PARENT_SPAN_ID, newParentSpanId);
	}

	@Override
	public String getName() {
		return (String)eDynamicGet(TelemetryPackage.SPAN__NAME, TelemetryPackage.Literals.SPAN__NAME, true, true);
	}

	@Override
	public void setName(String newName) {
		eDynamicSet(TelemetryPackage.SPAN__NAME, TelemetryPackage.Literals.SPAN__NAME, newName);
	}

	@Override
	public SpanKind getKind() {
		return (SpanKind)eDynamicGet(TelemetryPackage.SPAN__KIND, TelemetryPackage.Literals.SPAN__KIND, true, true);
	}

	@Override
	public void setKind(SpanKind newKind) {
		eDynamicSet(TelemetryPackage.SPAN__KIND, TelemetryPackage.Literals.SPAN__KIND, newKind);
	}

	@Override
	public long getStartTimeUnixNano() {
		return (Long)eDynamicGet(TelemetryPackage.SPAN__START_TIME_UNIX_NANO, TelemetryPackage.Literals.SPAN__START_TIME_UNIX_NANO, true, true);
	}

	@Override
	public void setStartTimeUnixNano(long newStartTimeUnixNano) {
		eDynamicSet(TelemetryPackage.SPAN__START_TIME_UNIX_NANO, TelemetryPackage.Literals.SPAN__START_TIME_UNIX_NANO, newStartTimeUnixNano);
	}

	@Override
	public long getEndTimeUnixNano() {
		return (Long)eDynamicGet(TelemetryPackage.SPAN__END_TIME_UNIX_NANO, TelemetryPackage.Literals.SPAN__END_TIME_UNIX_NANO, true, true);
	}

	@Override
	public void setEndTimeUnixNano(long newEndTimeUnixNano) {
		eDynamicSet(TelemetryPackage.SPAN__END_TIME_UNIX_NANO, TelemetryPackage.Literals.SPAN__END_TIME_UNIX_NANO, newEndTimeUnixNano);
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<KeyValue> getAttributes() {
		return (EList<KeyValue>)eDynamicGet(TelemetryPackage.SPAN__ATTRIBUTES, TelemetryPackage.Literals.SPAN__ATTRIBUTES, true, true);
	}

	@Override
	public int getDroppedAttributesCount() {
		return (Integer)eDynamicGet(TelemetryPackage.SPAN__DROPPED_ATTRIBUTES_COUNT, TelemetryPackage.Literals.SPAN__DROPPED_ATTRIBUTES_COUNT, true, true);
	}

	@Override
	public void setDroppedAttributesCount(int newDroppedAttributesCount) {
		eDynamicSet(TelemetryPackage.SPAN__DROPPED_ATTRIBUTES_COUNT, TelemetryPackage.Literals.SPAN__DROPPED_ATTRIBUTES_COUNT, newDroppedAttributesCount);
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<SpanEvent> getEvents() {
		return (EList<SpanEvent>)eDynamicGet(TelemetryPackage.SPAN__EVENTS, TelemetryPackage.Literals.SPAN__EVENTS, true, true);
	}

	@Override
	public int getDroppedEventsCount() {
		return (Integer)eDynamicGet(TelemetryPackage.SPAN__DROPPED_EVENTS_COUNT, TelemetryPackage.Literals.SPAN__DROPPED_EVENTS_COUNT, true, true);
	}

	@Override
	public void setDroppedEventsCount(int newDroppedEventsCount) {
		eDynamicSet(TelemetryPackage.SPAN__DROPPED_EVENTS_COUNT, TelemetryPackage.Literals.SPAN__DROPPED_EVENTS_COUNT, newDroppedEventsCount);
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<SpanLink> getLinks() {
		return (EList<SpanLink>)eDynamicGet(TelemetryPackage.SPAN__LINKS, TelemetryPackage.Literals.SPAN__LINKS, true, true);
	}

	@Override
	public int getDroppedLinksCount() {
		return (Integer)eDynamicGet(TelemetryPackage.SPAN__DROPPED_LINKS_COUNT, TelemetryPackage.Literals.SPAN__DROPPED_LINKS_COUNT, true, true);
	}

	@Override
	public void setDroppedLinksCount(int newDroppedLinksCount) {
		eDynamicSet(TelemetryPackage.SPAN__DROPPED_LINKS_COUNT, TelemetryPackage.Literals.SPAN__DROPPED_LINKS_COUNT, newDroppedLinksCount);
	}

	@Override
	public SpanStatus getStatus() {
		return (SpanStatus)eDynamicGet(TelemetryPackage.SPAN__STATUS, TelemetryPackage.Literals.SPAN__STATUS, true, true);
	}

	@Override
	public void setStatus(SpanStatus newStatus) {
		eDynamicSet(TelemetryPackage.SPAN__STATUS, TelemetryPackage.Literals.SPAN__STATUS, newStatus);
	}

	@Override
	public int getFlags() {
		return (Integer)eDynamicGet(TelemetryPackage.SPAN__FLAGS, TelemetryPackage.Literals.SPAN__FLAGS, true, true);
	}

	@Override
	public void setFlags(int newFlags) {
		eDynamicSet(TelemetryPackage.SPAN__FLAGS, TelemetryPackage.Literals.SPAN__FLAGS, newFlags);
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.SPAN__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case TelemetryPackage.SPAN__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case TelemetryPackage.SPAN__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case TelemetryPackage.SPAN__STATUS:
				return eDynamicInverseRemove(otherEnd, featureID, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.SPAN__TRACE_ID: return getTraceId();
			case TelemetryPackage.SPAN__SPAN_ID: return getSpanId();
			case TelemetryPackage.SPAN__TRACE_STATE: return getTraceState();
			case TelemetryPackage.SPAN__PARENT_SPAN_ID: return getParentSpanId();
			case TelemetryPackage.SPAN__NAME: return getName();
			case TelemetryPackage.SPAN__KIND: return getKind();
			case TelemetryPackage.SPAN__START_TIME_UNIX_NANO: return getStartTimeUnixNano();
			case TelemetryPackage.SPAN__END_TIME_UNIX_NANO: return getEndTimeUnixNano();
			case TelemetryPackage.SPAN__ATTRIBUTES: return getAttributes();
			case TelemetryPackage.SPAN__DROPPED_ATTRIBUTES_COUNT: return getDroppedAttributesCount();
			case TelemetryPackage.SPAN__EVENTS: return getEvents();
			case TelemetryPackage.SPAN__DROPPED_EVENTS_COUNT: return getDroppedEventsCount();
			case TelemetryPackage.SPAN__LINKS: return getLinks();
			case TelemetryPackage.SPAN__DROPPED_LINKS_COUNT: return getDroppedLinksCount();
			case TelemetryPackage.SPAN__STATUS: return getStatus();
			case TelemetryPackage.SPAN__FLAGS: return getFlags();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.SPAN__TRACE_ID:
				setTraceId((String)newValue);
				return;
			case TelemetryPackage.SPAN__SPAN_ID:
				setSpanId((String)newValue);
				return;
			case TelemetryPackage.SPAN__TRACE_STATE:
				setTraceState((String)newValue);
				return;
			case TelemetryPackage.SPAN__PARENT_SPAN_ID:
				setParentSpanId((String)newValue);
				return;
			case TelemetryPackage.SPAN__NAME:
				setName((String)newValue);
				return;
			case TelemetryPackage.SPAN__KIND:
				setKind((SpanKind)newValue);
				return;
			case TelemetryPackage.SPAN__START_TIME_UNIX_NANO:
				setStartTimeUnixNano((Long)newValue);
				return;
			case TelemetryPackage.SPAN__END_TIME_UNIX_NANO:
				setEndTimeUnixNano((Long)newValue);
				return;
			case TelemetryPackage.SPAN__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends KeyValue>)newValue);
				return;
			case TelemetryPackage.SPAN__DROPPED_ATTRIBUTES_COUNT:
				setDroppedAttributesCount((Integer)newValue);
				return;
			case TelemetryPackage.SPAN__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends SpanEvent>)newValue);
				return;
			case TelemetryPackage.SPAN__DROPPED_EVENTS_COUNT:
				setDroppedEventsCount((Integer)newValue);
				return;
			case TelemetryPackage.SPAN__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends SpanLink>)newValue);
				return;
			case TelemetryPackage.SPAN__DROPPED_LINKS_COUNT:
				setDroppedLinksCount((Integer)newValue);
				return;
			case TelemetryPackage.SPAN__STATUS:
				setStatus((SpanStatus)newValue);
				return;
			case TelemetryPackage.SPAN__FLAGS:
				setFlags((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.SPAN__TRACE_ID:
				setTraceId(null);
				return;
			case TelemetryPackage.SPAN__SPAN_ID:
				setSpanId(null);
				return;
			case TelemetryPackage.SPAN__TRACE_STATE:
				setTraceState(null);
				return;
			case TelemetryPackage.SPAN__PARENT_SPAN_ID:
				setParentSpanId(null);
				return;
			case TelemetryPackage.SPAN__NAME:
				setName(null);
				return;
			case TelemetryPackage.SPAN__KIND:
				setKind(SpanKind.SPAN_KIND_UNSPECIFIED);
				return;
			case TelemetryPackage.SPAN__START_TIME_UNIX_NANO:
				setStartTimeUnixNano(0L);
				return;
			case TelemetryPackage.SPAN__END_TIME_UNIX_NANO:
				setEndTimeUnixNano(0L);
				return;
			case TelemetryPackage.SPAN__ATTRIBUTES:
				getAttributes().clear();
				return;
			case TelemetryPackage.SPAN__DROPPED_ATTRIBUTES_COUNT:
				setDroppedAttributesCount(0);
				return;
			case TelemetryPackage.SPAN__EVENTS:
				getEvents().clear();
				return;
			case TelemetryPackage.SPAN__DROPPED_EVENTS_COUNT:
				setDroppedEventsCount(0);
				return;
			case TelemetryPackage.SPAN__LINKS:
				getLinks().clear();
				return;
			case TelemetryPackage.SPAN__DROPPED_LINKS_COUNT:
				setDroppedLinksCount(0);
				return;
			case TelemetryPackage.SPAN__STATUS:
				setStatus(null);
				return;
			case TelemetryPackage.SPAN__FLAGS:
				setFlags(0);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.SPAN__TRACE_ID: return getTraceId() != null;
			case TelemetryPackage.SPAN__SPAN_ID: return getSpanId() != null;
			case TelemetryPackage.SPAN__TRACE_STATE: return getTraceState() != null;
			case TelemetryPackage.SPAN__PARENT_SPAN_ID: return getParentSpanId() != null;
			case TelemetryPackage.SPAN__NAME: return getName() != null;
			case TelemetryPackage.SPAN__KIND: return getKind() != SpanKind.SPAN_KIND_UNSPECIFIED;
			case TelemetryPackage.SPAN__START_TIME_UNIX_NANO: return getStartTimeUnixNano() != 0L;
			case TelemetryPackage.SPAN__END_TIME_UNIX_NANO: return getEndTimeUnixNano() != 0L;
			case TelemetryPackage.SPAN__ATTRIBUTES: return !getAttributes().isEmpty();
			case TelemetryPackage.SPAN__DROPPED_ATTRIBUTES_COUNT: return getDroppedAttributesCount() != 0;
			case TelemetryPackage.SPAN__EVENTS: return !getEvents().isEmpty();
			case TelemetryPackage.SPAN__DROPPED_EVENTS_COUNT: return getDroppedEventsCount() != 0;
			case TelemetryPackage.SPAN__LINKS: return !getLinks().isEmpty();
			case TelemetryPackage.SPAN__DROPPED_LINKS_COUNT: return getDroppedLinksCount() != 0;
			case TelemetryPackage.SPAN__STATUS: return getStatus() != null;
			case TelemetryPackage.SPAN__FLAGS: return getFlags() != 0;
		}
		return super.eIsSet(featureID);
	}

} //SpanImpl
