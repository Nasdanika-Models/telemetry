/**
 */
package org.nasdanika.models.telemetry.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.change.ChangeDescription;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.telemetry.KeyValue;
import org.nasdanika.models.telemetry.LogRecord;
import org.nasdanika.models.telemetry.Span;
import org.nasdanika.models.telemetry.SpanEvent;
import org.nasdanika.models.telemetry.SpanKind;
import org.nasdanika.models.telemetry.SpanLink;
import org.nasdanika.models.telemetry.SpanStatus;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Span</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.telemetry.impl.SpanImpl#getTraceId <em>Trace Id</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.SpanImpl#getSpanId <em>Span Id</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.SpanImpl#getTraceState <em>Trace State</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.SpanImpl#getParentSpanId <em>Parent Span Id</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.SpanImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.SpanImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.SpanImpl#getStartTimeUnixNano <em>Start Time Unix Nano</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.SpanImpl#getEndTimeUnixNano <em>End Time Unix Nano</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.SpanImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.SpanImpl#getDroppedAttributesCount <em>Dropped Attributes Count</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.SpanImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.SpanImpl#getDroppedEventsCount <em>Dropped Events Count</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.SpanImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.SpanImpl#getDroppedLinksCount <em>Dropped Links Count</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.SpanImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.SpanImpl#getFlags <em>Flags</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.SpanImpl#getChangeDescription <em>Change Description</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.SpanImpl#getLogRecords <em>Log Records</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpanImpl extends MinimalEObjectImpl.Container implements Span {
	/**
	 * The default value of the '{@link #getTraceId() <em>Trace Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceId()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACE_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSpanId() <em>Span Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpanId()
	 * @generated
	 * @ordered
	 */
	protected static final String SPAN_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTraceState() <em>Trace State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceState()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACE_STATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getParentSpanId() <em>Parent Span Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentSpanId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_SPAN_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final SpanKind KIND_EDEFAULT = SpanKind.SPAN_KIND_UNSPECIFIED;

	/**
	 * The default value of the '{@link #getStartTimeUnixNano() <em>Start Time Unix Nano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTimeUnixNano()
	 * @generated
	 * @ordered
	 */
	protected static final long START_TIME_UNIX_NANO_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getEndTimeUnixNano() <em>End Time Unix Nano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTimeUnixNano()
	 * @generated
	 * @ordered
	 */
	protected static final long END_TIME_UNIX_NANO_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getDroppedAttributesCount() <em>Dropped Attributes Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDroppedAttributesCount()
	 * @generated
	 * @ordered
	 */
	protected static final int DROPPED_ATTRIBUTES_COUNT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getDroppedEventsCount() <em>Dropped Events Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDroppedEventsCount()
	 * @generated
	 * @ordered
	 */
	protected static final int DROPPED_EVENTS_COUNT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getDroppedLinksCount() <em>Dropped Links Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDroppedLinksCount()
	 * @generated
	 * @ordered
	 */
	protected static final int DROPPED_LINKS_COUNT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getFlags() <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected static final int FLAGS_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.SPAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTraceId() {
		return (String)eDynamicGet(TelemetryPackage.SPAN__TRACE_ID, TelemetryPackage.Literals.SPAN__TRACE_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTraceId(String newTraceId) {
		eDynamicSet(TelemetryPackage.SPAN__TRACE_ID, TelemetryPackage.Literals.SPAN__TRACE_ID, newTraceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpanId() {
		return (String)eDynamicGet(TelemetryPackage.SPAN__SPAN_ID, TelemetryPackage.Literals.SPAN__SPAN_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpanId(String newSpanId) {
		eDynamicSet(TelemetryPackage.SPAN__SPAN_ID, TelemetryPackage.Literals.SPAN__SPAN_ID, newSpanId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTraceState() {
		return (String)eDynamicGet(TelemetryPackage.SPAN__TRACE_STATE, TelemetryPackage.Literals.SPAN__TRACE_STATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTraceState(String newTraceState) {
		eDynamicSet(TelemetryPackage.SPAN__TRACE_STATE, TelemetryPackage.Literals.SPAN__TRACE_STATE, newTraceState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentSpanId() {
		return (String)eDynamicGet(TelemetryPackage.SPAN__PARENT_SPAN_ID, TelemetryPackage.Literals.SPAN__PARENT_SPAN_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentSpanId(String newParentSpanId) {
		eDynamicSet(TelemetryPackage.SPAN__PARENT_SPAN_ID, TelemetryPackage.Literals.SPAN__PARENT_SPAN_ID, newParentSpanId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(TelemetryPackage.SPAN__NAME, TelemetryPackage.Literals.SPAN__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(TelemetryPackage.SPAN__NAME, TelemetryPackage.Literals.SPAN__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpanKind getKind() {
		return (SpanKind)eDynamicGet(TelemetryPackage.SPAN__KIND, TelemetryPackage.Literals.SPAN__KIND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(SpanKind newKind) {
		eDynamicSet(TelemetryPackage.SPAN__KIND, TelemetryPackage.Literals.SPAN__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getStartTimeUnixNano() {
		return (Long)eDynamicGet(TelemetryPackage.SPAN__START_TIME_UNIX_NANO, TelemetryPackage.Literals.SPAN__START_TIME_UNIX_NANO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartTimeUnixNano(long newStartTimeUnixNano) {
		eDynamicSet(TelemetryPackage.SPAN__START_TIME_UNIX_NANO, TelemetryPackage.Literals.SPAN__START_TIME_UNIX_NANO, newStartTimeUnixNano);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getEndTimeUnixNano() {
		return (Long)eDynamicGet(TelemetryPackage.SPAN__END_TIME_UNIX_NANO, TelemetryPackage.Literals.SPAN__END_TIME_UNIX_NANO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndTimeUnixNano(long newEndTimeUnixNano) {
		eDynamicSet(TelemetryPackage.SPAN__END_TIME_UNIX_NANO, TelemetryPackage.Literals.SPAN__END_TIME_UNIX_NANO, newEndTimeUnixNano);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<KeyValue> getAttributes() {
		return (EList<KeyValue>)eDynamicGet(TelemetryPackage.SPAN__ATTRIBUTES, TelemetryPackage.Literals.SPAN__ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDroppedAttributesCount() {
		return (Integer)eDynamicGet(TelemetryPackage.SPAN__DROPPED_ATTRIBUTES_COUNT, TelemetryPackage.Literals.SPAN__DROPPED_ATTRIBUTES_COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDroppedAttributesCount(int newDroppedAttributesCount) {
		eDynamicSet(TelemetryPackage.SPAN__DROPPED_ATTRIBUTES_COUNT, TelemetryPackage.Literals.SPAN__DROPPED_ATTRIBUTES_COUNT, newDroppedAttributesCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SpanEvent> getEvents() {
		return (EList<SpanEvent>)eDynamicGet(TelemetryPackage.SPAN__EVENTS, TelemetryPackage.Literals.SPAN__EVENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDroppedEventsCount() {
		return (Integer)eDynamicGet(TelemetryPackage.SPAN__DROPPED_EVENTS_COUNT, TelemetryPackage.Literals.SPAN__DROPPED_EVENTS_COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDroppedEventsCount(int newDroppedEventsCount) {
		eDynamicSet(TelemetryPackage.SPAN__DROPPED_EVENTS_COUNT, TelemetryPackage.Literals.SPAN__DROPPED_EVENTS_COUNT, newDroppedEventsCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SpanLink> getLinks() {
		return (EList<SpanLink>)eDynamicGet(TelemetryPackage.SPAN__LINKS, TelemetryPackage.Literals.SPAN__LINKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDroppedLinksCount() {
		return (Integer)eDynamicGet(TelemetryPackage.SPAN__DROPPED_LINKS_COUNT, TelemetryPackage.Literals.SPAN__DROPPED_LINKS_COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDroppedLinksCount(int newDroppedLinksCount) {
		eDynamicSet(TelemetryPackage.SPAN__DROPPED_LINKS_COUNT, TelemetryPackage.Literals.SPAN__DROPPED_LINKS_COUNT, newDroppedLinksCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpanStatus getStatus() {
		return (SpanStatus)eDynamicGet(TelemetryPackage.SPAN__STATUS, TelemetryPackage.Literals.SPAN__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(SpanStatus newStatus, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStatus, TelemetryPackage.SPAN__STATUS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(SpanStatus newStatus) {
		eDynamicSet(TelemetryPackage.SPAN__STATUS, TelemetryPackage.Literals.SPAN__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFlags() {
		return (Integer)eDynamicGet(TelemetryPackage.SPAN__FLAGS, TelemetryPackage.Literals.SPAN__FLAGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlags(int newFlags) {
		eDynamicSet(TelemetryPackage.SPAN__FLAGS, TelemetryPackage.Literals.SPAN__FLAGS, newFlags);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeDescription getChangeDescription() {
		return (ChangeDescription)eDynamicGet(TelemetryPackage.SPAN__CHANGE_DESCRIPTION, TelemetryPackage.Literals.SPAN__CHANGE_DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeDescription(ChangeDescription newChangeDescription, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newChangeDescription, TelemetryPackage.SPAN__CHANGE_DESCRIPTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeDescription(ChangeDescription newChangeDescription) {
		eDynamicSet(TelemetryPackage.SPAN__CHANGE_DESCRIPTION, TelemetryPackage.Literals.SPAN__CHANGE_DESCRIPTION, newChangeDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<LogRecord> getLogRecords() {
		return (EList<LogRecord>)eDynamicGet(TelemetryPackage.SPAN__LOG_RECORDS, TelemetryPackage.Literals.SPAN__LOG_RECORDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
				return basicSetStatus(null, msgs);
			case TelemetryPackage.SPAN__CHANGE_DESCRIPTION:
				return basicSetChangeDescription(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.SPAN__TRACE_ID:
				return getTraceId();
			case TelemetryPackage.SPAN__SPAN_ID:
				return getSpanId();
			case TelemetryPackage.SPAN__TRACE_STATE:
				return getTraceState();
			case TelemetryPackage.SPAN__PARENT_SPAN_ID:
				return getParentSpanId();
			case TelemetryPackage.SPAN__NAME:
				return getName();
			case TelemetryPackage.SPAN__KIND:
				return getKind();
			case TelemetryPackage.SPAN__START_TIME_UNIX_NANO:
				return getStartTimeUnixNano();
			case TelemetryPackage.SPAN__END_TIME_UNIX_NANO:
				return getEndTimeUnixNano();
			case TelemetryPackage.SPAN__ATTRIBUTES:
				return getAttributes();
			case TelemetryPackage.SPAN__DROPPED_ATTRIBUTES_COUNT:
				return getDroppedAttributesCount();
			case TelemetryPackage.SPAN__EVENTS:
				return getEvents();
			case TelemetryPackage.SPAN__DROPPED_EVENTS_COUNT:
				return getDroppedEventsCount();
			case TelemetryPackage.SPAN__LINKS:
				return getLinks();
			case TelemetryPackage.SPAN__DROPPED_LINKS_COUNT:
				return getDroppedLinksCount();
			case TelemetryPackage.SPAN__STATUS:
				return getStatus();
			case TelemetryPackage.SPAN__FLAGS:
				return getFlags();
			case TelemetryPackage.SPAN__CHANGE_DESCRIPTION:
				return getChangeDescription();
			case TelemetryPackage.SPAN__LOG_RECORDS:
				return getLogRecords();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
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
			case TelemetryPackage.SPAN__CHANGE_DESCRIPTION:
				setChangeDescription((ChangeDescription)newValue);
				return;
			case TelemetryPackage.SPAN__LOG_RECORDS:
				getLogRecords().clear();
				getLogRecords().addAll((Collection<? extends LogRecord>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.SPAN__TRACE_ID:
				setTraceId(TRACE_ID_EDEFAULT);
				return;
			case TelemetryPackage.SPAN__SPAN_ID:
				setSpanId(SPAN_ID_EDEFAULT);
				return;
			case TelemetryPackage.SPAN__TRACE_STATE:
				setTraceState(TRACE_STATE_EDEFAULT);
				return;
			case TelemetryPackage.SPAN__PARENT_SPAN_ID:
				setParentSpanId(PARENT_SPAN_ID_EDEFAULT);
				return;
			case TelemetryPackage.SPAN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TelemetryPackage.SPAN__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case TelemetryPackage.SPAN__START_TIME_UNIX_NANO:
				setStartTimeUnixNano(START_TIME_UNIX_NANO_EDEFAULT);
				return;
			case TelemetryPackage.SPAN__END_TIME_UNIX_NANO:
				setEndTimeUnixNano(END_TIME_UNIX_NANO_EDEFAULT);
				return;
			case TelemetryPackage.SPAN__ATTRIBUTES:
				getAttributes().clear();
				return;
			case TelemetryPackage.SPAN__DROPPED_ATTRIBUTES_COUNT:
				setDroppedAttributesCount(DROPPED_ATTRIBUTES_COUNT_EDEFAULT);
				return;
			case TelemetryPackage.SPAN__EVENTS:
				getEvents().clear();
				return;
			case TelemetryPackage.SPAN__DROPPED_EVENTS_COUNT:
				setDroppedEventsCount(DROPPED_EVENTS_COUNT_EDEFAULT);
				return;
			case TelemetryPackage.SPAN__LINKS:
				getLinks().clear();
				return;
			case TelemetryPackage.SPAN__DROPPED_LINKS_COUNT:
				setDroppedLinksCount(DROPPED_LINKS_COUNT_EDEFAULT);
				return;
			case TelemetryPackage.SPAN__STATUS:
				setStatus((SpanStatus)null);
				return;
			case TelemetryPackage.SPAN__FLAGS:
				setFlags(FLAGS_EDEFAULT);
				return;
			case TelemetryPackage.SPAN__CHANGE_DESCRIPTION:
				setChangeDescription((ChangeDescription)null);
				return;
			case TelemetryPackage.SPAN__LOG_RECORDS:
				getLogRecords().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.SPAN__TRACE_ID:
				return TRACE_ID_EDEFAULT == null ? getTraceId() != null : !TRACE_ID_EDEFAULT.equals(getTraceId());
			case TelemetryPackage.SPAN__SPAN_ID:
				return SPAN_ID_EDEFAULT == null ? getSpanId() != null : !SPAN_ID_EDEFAULT.equals(getSpanId());
			case TelemetryPackage.SPAN__TRACE_STATE:
				return TRACE_STATE_EDEFAULT == null ? getTraceState() != null : !TRACE_STATE_EDEFAULT.equals(getTraceState());
			case TelemetryPackage.SPAN__PARENT_SPAN_ID:
				return PARENT_SPAN_ID_EDEFAULT == null ? getParentSpanId() != null : !PARENT_SPAN_ID_EDEFAULT.equals(getParentSpanId());
			case TelemetryPackage.SPAN__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case TelemetryPackage.SPAN__KIND:
				return getKind() != KIND_EDEFAULT;
			case TelemetryPackage.SPAN__START_TIME_UNIX_NANO:
				return getStartTimeUnixNano() != START_TIME_UNIX_NANO_EDEFAULT;
			case TelemetryPackage.SPAN__END_TIME_UNIX_NANO:
				return getEndTimeUnixNano() != END_TIME_UNIX_NANO_EDEFAULT;
			case TelemetryPackage.SPAN__ATTRIBUTES:
				return !getAttributes().isEmpty();
			case TelemetryPackage.SPAN__DROPPED_ATTRIBUTES_COUNT:
				return getDroppedAttributesCount() != DROPPED_ATTRIBUTES_COUNT_EDEFAULT;
			case TelemetryPackage.SPAN__EVENTS:
				return !getEvents().isEmpty();
			case TelemetryPackage.SPAN__DROPPED_EVENTS_COUNT:
				return getDroppedEventsCount() != DROPPED_EVENTS_COUNT_EDEFAULT;
			case TelemetryPackage.SPAN__LINKS:
				return !getLinks().isEmpty();
			case TelemetryPackage.SPAN__DROPPED_LINKS_COUNT:
				return getDroppedLinksCount() != DROPPED_LINKS_COUNT_EDEFAULT;
			case TelemetryPackage.SPAN__STATUS:
				return getStatus() != null;
			case TelemetryPackage.SPAN__FLAGS:
				return getFlags() != FLAGS_EDEFAULT;
			case TelemetryPackage.SPAN__CHANGE_DESCRIPTION:
				return getChangeDescription() != null;
			case TelemetryPackage.SPAN__LOG_RECORDS:
				return !getLogRecords().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpanImpl
