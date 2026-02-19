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
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Any Value</b></em>'.
 * @generated
 */
public class AnyValueImpl extends MinimalEObjectImpl.Container implements AnyValue {

	protected AnyValueImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.ANY_VALUE;
	}

	@Override
	public String getStringValue() {
		return (String)eDynamicGet(TelemetryPackage.ANY_VALUE__STRING_VALUE, TelemetryPackage.Literals.ANY_VALUE__STRING_VALUE, true, true);
	}

	@Override
	public void setStringValue(String newStringValue) {
		eDynamicSet(TelemetryPackage.ANY_VALUE__STRING_VALUE, TelemetryPackage.Literals.ANY_VALUE__STRING_VALUE, newStringValue);
	}

	@Override
	public Boolean getBoolValue() {
		return (Boolean)eDynamicGet(TelemetryPackage.ANY_VALUE__BOOL_VALUE, TelemetryPackage.Literals.ANY_VALUE__BOOL_VALUE, true, true);
	}

	@Override
	public void setBoolValue(Boolean newBoolValue) {
		eDynamicSet(TelemetryPackage.ANY_VALUE__BOOL_VALUE, TelemetryPackage.Literals.ANY_VALUE__BOOL_VALUE, newBoolValue);
	}

	@Override
	public Long getIntValue() {
		return (Long)eDynamicGet(TelemetryPackage.ANY_VALUE__INT_VALUE, TelemetryPackage.Literals.ANY_VALUE__INT_VALUE, true, true);
	}

	@Override
	public void setIntValue(Long newIntValue) {
		eDynamicSet(TelemetryPackage.ANY_VALUE__INT_VALUE, TelemetryPackage.Literals.ANY_VALUE__INT_VALUE, newIntValue);
	}

	@Override
	public Double getDoubleValue() {
		return (Double)eDynamicGet(TelemetryPackage.ANY_VALUE__DOUBLE_VALUE, TelemetryPackage.Literals.ANY_VALUE__DOUBLE_VALUE, true, true);
	}

	@Override
	public void setDoubleValue(Double newDoubleValue) {
		eDynamicSet(TelemetryPackage.ANY_VALUE__DOUBLE_VALUE, TelemetryPackage.Literals.ANY_VALUE__DOUBLE_VALUE, newDoubleValue);
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<AnyValue> getArrayValue() {
		return (EList<AnyValue>)eDynamicGet(TelemetryPackage.ANY_VALUE__ARRAY_VALUE, TelemetryPackage.Literals.ANY_VALUE__ARRAY_VALUE, true, true);
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<KeyValue> getKvlistValue() {
		return (EList<KeyValue>)eDynamicGet(TelemetryPackage.ANY_VALUE__KVLIST_VALUE, TelemetryPackage.Literals.ANY_VALUE__KVLIST_VALUE, true, true);
	}

	@Override
	public byte[] getBytesValue() {
		return (byte[])eDynamicGet(TelemetryPackage.ANY_VALUE__BYTES_VALUE, TelemetryPackage.Literals.ANY_VALUE__BYTES_VALUE, true, true);
	}

	@Override
	public void setBytesValue(byte[] newBytesValue) {
		eDynamicSet(TelemetryPackage.ANY_VALUE__BYTES_VALUE, TelemetryPackage.Literals.ANY_VALUE__BYTES_VALUE, newBytesValue);
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.ANY_VALUE__ARRAY_VALUE:
				return ((InternalEList<?>)getArrayValue()).basicRemove(otherEnd, msgs);
			case TelemetryPackage.ANY_VALUE__KVLIST_VALUE:
				return ((InternalEList<?>)getKvlistValue()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.ANY_VALUE__STRING_VALUE: return getStringValue();
			case TelemetryPackage.ANY_VALUE__BOOL_VALUE: return getBoolValue();
			case TelemetryPackage.ANY_VALUE__INT_VALUE: return getIntValue();
			case TelemetryPackage.ANY_VALUE__DOUBLE_VALUE: return getDoubleValue();
			case TelemetryPackage.ANY_VALUE__ARRAY_VALUE: return getArrayValue();
			case TelemetryPackage.ANY_VALUE__KVLIST_VALUE: return getKvlistValue();
			case TelemetryPackage.ANY_VALUE__BYTES_VALUE: return getBytesValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.ANY_VALUE__STRING_VALUE:
				setStringValue((String)newValue);
				return;
			case TelemetryPackage.ANY_VALUE__BOOL_VALUE:
				setBoolValue((Boolean)newValue);
				return;
			case TelemetryPackage.ANY_VALUE__INT_VALUE:
				setIntValue((Long)newValue);
				return;
			case TelemetryPackage.ANY_VALUE__DOUBLE_VALUE:
				setDoubleValue((Double)newValue);
				return;
			case TelemetryPackage.ANY_VALUE__ARRAY_VALUE:
				getArrayValue().clear();
				getArrayValue().addAll((Collection<? extends AnyValue>)newValue);
				return;
			case TelemetryPackage.ANY_VALUE__KVLIST_VALUE:
				getKvlistValue().clear();
				getKvlistValue().addAll((Collection<? extends KeyValue>)newValue);
				return;
			case TelemetryPackage.ANY_VALUE__BYTES_VALUE:
				setBytesValue((byte[])newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.ANY_VALUE__STRING_VALUE:
				setStringValue(null);
				return;
			case TelemetryPackage.ANY_VALUE__BOOL_VALUE:
				setBoolValue(null);
				return;
			case TelemetryPackage.ANY_VALUE__INT_VALUE:
				setIntValue(null);
				return;
			case TelemetryPackage.ANY_VALUE__DOUBLE_VALUE:
				setDoubleValue(null);
				return;
			case TelemetryPackage.ANY_VALUE__ARRAY_VALUE:
				getArrayValue().clear();
				return;
			case TelemetryPackage.ANY_VALUE__KVLIST_VALUE:
				getKvlistValue().clear();
				return;
			case TelemetryPackage.ANY_VALUE__BYTES_VALUE:
				setBytesValue(null);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.ANY_VALUE__STRING_VALUE: return getStringValue() != null;
			case TelemetryPackage.ANY_VALUE__BOOL_VALUE: return getBoolValue() != null;
			case TelemetryPackage.ANY_VALUE__INT_VALUE: return getIntValue() != null;
			case TelemetryPackage.ANY_VALUE__DOUBLE_VALUE: return getDoubleValue() != null;
			case TelemetryPackage.ANY_VALUE__ARRAY_VALUE: return !getArrayValue().isEmpty();
			case TelemetryPackage.ANY_VALUE__KVLIST_VALUE: return !getKvlistValue().isEmpty();
			case TelemetryPackage.ANY_VALUE__BYTES_VALUE: return getBytesValue() != null;
		}
		return super.eIsSet(featureID);
	}

} //AnyValueImpl
