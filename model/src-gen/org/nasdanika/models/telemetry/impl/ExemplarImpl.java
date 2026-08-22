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
import org.nasdanika.models.telemetry.Span;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exemplar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.telemetry.impl.ExemplarImpl#getFilteredAttributes <em>Filtered Attributes</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.ExemplarImpl#getTimeUnixNano <em>Time Unix Nano</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.ExemplarImpl#getAsDouble <em>As Double</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.ExemplarImpl#getAsInt <em>As Int</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.ExemplarImpl#getSpanId <em>Span Id</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.ExemplarImpl#getTraceId <em>Trace Id</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.ExemplarImpl#getSpan <em>Span</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExemplarImpl extends MinimalEObjectImpl.Container implements Exemplar {
	/**
	 * The default value of the '{@link #getTimeUnixNano() <em>Time Unix Nano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnixNano()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_UNIX_NANO_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getAsDouble() <em>As Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsDouble()
	 * @generated
	 * @ordered
	 */
	protected static final Double AS_DOUBLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAsInt() <em>As Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsInt()
	 * @generated
	 * @ordered
	 */
	protected static final Long AS_INT_EDEFAULT = null;

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
	 * The default value of the '{@link #getTraceId() <em>Trace Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceId()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACE_ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExemplarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.EXEMPLAR;
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<KeyValue> getFilteredAttributes() {
		return (EList<KeyValue>)eDynamicGet(TelemetryPackage.EXEMPLAR__FILTERED_ATTRIBUTES, TelemetryPackage.Literals.EXEMPLAR__FILTERED_ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTimeUnixNano() {
		return (Long)eDynamicGet(TelemetryPackage.EXEMPLAR__TIME_UNIX_NANO, TelemetryPackage.Literals.EXEMPLAR__TIME_UNIX_NANO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeUnixNano(long newTimeUnixNano) {
		eDynamicSet(TelemetryPackage.EXEMPLAR__TIME_UNIX_NANO, TelemetryPackage.Literals.EXEMPLAR__TIME_UNIX_NANO, newTimeUnixNano);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getAsDouble() {
		return (Double)eDynamicGet(TelemetryPackage.EXEMPLAR__AS_DOUBLE, TelemetryPackage.Literals.EXEMPLAR__AS_DOUBLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAsDouble(Double newAsDouble) {
		eDynamicSet(TelemetryPackage.EXEMPLAR__AS_DOUBLE, TelemetryPackage.Literals.EXEMPLAR__AS_DOUBLE, newAsDouble);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAsInt() {
		return (Long)eDynamicGet(TelemetryPackage.EXEMPLAR__AS_INT, TelemetryPackage.Literals.EXEMPLAR__AS_INT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAsInt(Long newAsInt) {
		eDynamicSet(TelemetryPackage.EXEMPLAR__AS_INT, TelemetryPackage.Literals.EXEMPLAR__AS_INT, newAsInt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpanId() {
		return (String)eDynamicGet(TelemetryPackage.EXEMPLAR__SPAN_ID, TelemetryPackage.Literals.EXEMPLAR__SPAN_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpanId(String newSpanId) {
		eDynamicSet(TelemetryPackage.EXEMPLAR__SPAN_ID, TelemetryPackage.Literals.EXEMPLAR__SPAN_ID, newSpanId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTraceId() {
		return (String)eDynamicGet(TelemetryPackage.EXEMPLAR__TRACE_ID, TelemetryPackage.Literals.EXEMPLAR__TRACE_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTraceId(String newTraceId) {
		eDynamicSet(TelemetryPackage.EXEMPLAR__TRACE_ID, TelemetryPackage.Literals.EXEMPLAR__TRACE_ID, newTraceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Span getSpan() {
		return (Span)eDynamicGet(TelemetryPackage.EXEMPLAR__SPAN, TelemetryPackage.Literals.EXEMPLAR__SPAN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Span basicGetSpan() {
		return (Span)eDynamicGet(TelemetryPackage.EXEMPLAR__SPAN, TelemetryPackage.Literals.EXEMPLAR__SPAN, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpan(Span newSpan) {
		eDynamicSet(TelemetryPackage.EXEMPLAR__SPAN, TelemetryPackage.Literals.EXEMPLAR__SPAN, newSpan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.EXEMPLAR__FILTERED_ATTRIBUTES:
				return ((InternalEList<?>)getFilteredAttributes()).basicRemove(otherEnd, msgs);
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
			case TelemetryPackage.EXEMPLAR__FILTERED_ATTRIBUTES:
				return getFilteredAttributes();
			case TelemetryPackage.EXEMPLAR__TIME_UNIX_NANO:
				return getTimeUnixNano();
			case TelemetryPackage.EXEMPLAR__AS_DOUBLE:
				return getAsDouble();
			case TelemetryPackage.EXEMPLAR__AS_INT:
				return getAsInt();
			case TelemetryPackage.EXEMPLAR__SPAN_ID:
				return getSpanId();
			case TelemetryPackage.EXEMPLAR__TRACE_ID:
				return getTraceId();
			case TelemetryPackage.EXEMPLAR__SPAN:
				if (resolve) return getSpan();
				return basicGetSpan();
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
			case TelemetryPackage.EXEMPLAR__SPAN:
				setSpan((Span)newValue);
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
			case TelemetryPackage.EXEMPLAR__FILTERED_ATTRIBUTES:
				getFilteredAttributes().clear();
				return;
			case TelemetryPackage.EXEMPLAR__TIME_UNIX_NANO:
				setTimeUnixNano(TIME_UNIX_NANO_EDEFAULT);
				return;
			case TelemetryPackage.EXEMPLAR__AS_DOUBLE:
				setAsDouble(AS_DOUBLE_EDEFAULT);
				return;
			case TelemetryPackage.EXEMPLAR__AS_INT:
				setAsInt(AS_INT_EDEFAULT);
				return;
			case TelemetryPackage.EXEMPLAR__SPAN_ID:
				setSpanId(SPAN_ID_EDEFAULT);
				return;
			case TelemetryPackage.EXEMPLAR__TRACE_ID:
				setTraceId(TRACE_ID_EDEFAULT);
				return;
			case TelemetryPackage.EXEMPLAR__SPAN:
				setSpan((Span)null);
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
			case TelemetryPackage.EXEMPLAR__FILTERED_ATTRIBUTES:
				return !getFilteredAttributes().isEmpty();
			case TelemetryPackage.EXEMPLAR__TIME_UNIX_NANO:
				return getTimeUnixNano() != TIME_UNIX_NANO_EDEFAULT;
			case TelemetryPackage.EXEMPLAR__AS_DOUBLE:
				return AS_DOUBLE_EDEFAULT == null ? getAsDouble() != null : !AS_DOUBLE_EDEFAULT.equals(getAsDouble());
			case TelemetryPackage.EXEMPLAR__AS_INT:
				return AS_INT_EDEFAULT == null ? getAsInt() != null : !AS_INT_EDEFAULT.equals(getAsInt());
			case TelemetryPackage.EXEMPLAR__SPAN_ID:
				return SPAN_ID_EDEFAULT == null ? getSpanId() != null : !SPAN_ID_EDEFAULT.equals(getSpanId());
			case TelemetryPackage.EXEMPLAR__TRACE_ID:
				return TRACE_ID_EDEFAULT == null ? getTraceId() != null : !TRACE_ID_EDEFAULT.equals(getTraceId());
			case TelemetryPackage.EXEMPLAR__SPAN:
				return basicGetSpan() != null;
		}
		return super.eIsSet(featureID);
	}

} //ExemplarImpl
