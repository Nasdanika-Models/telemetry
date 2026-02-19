/**
 */
package org.nasdanika.models.telemetry.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.models.telemetry.AnyValue;
import org.nasdanika.models.telemetry.KeyValue;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Key Value</b></em>'.
 * @generated
 */
public class KeyValueImpl extends MinimalEObjectImpl.Container implements KeyValue {

	protected KeyValueImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.KEY_VALUE;
	}

	@Override
	public String getKey() {
		return (String)eDynamicGet(TelemetryPackage.KEY_VALUE__KEY, TelemetryPackage.Literals.KEY_VALUE__KEY, true, true);
	}

	@Override
	public void setKey(String newKey) {
		eDynamicSet(TelemetryPackage.KEY_VALUE__KEY, TelemetryPackage.Literals.KEY_VALUE__KEY, newKey);
	}

	@Override
	public AnyValue getValue() {
		return (AnyValue)eDynamicGet(TelemetryPackage.KEY_VALUE__VALUE, TelemetryPackage.Literals.KEY_VALUE__VALUE, true, true);
	}

	@Override
	public void setValue(AnyValue newValue) {
		eDynamicSet(TelemetryPackage.KEY_VALUE__VALUE, TelemetryPackage.Literals.KEY_VALUE__VALUE, newValue);
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.KEY_VALUE__VALUE:
				return eDynamicInverseRemove(otherEnd, featureID, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.KEY_VALUE__KEY: return getKey();
			case TelemetryPackage.KEY_VALUE__VALUE: return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.KEY_VALUE__KEY:
				setKey((String)newValue);
				return;
			case TelemetryPackage.KEY_VALUE__VALUE:
				setValue((AnyValue)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.KEY_VALUE__KEY:
				setKey(null);
				return;
			case TelemetryPackage.KEY_VALUE__VALUE:
				setValue(null);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.KEY_VALUE__KEY: return getKey() != null;
			case TelemetryPackage.KEY_VALUE__VALUE: return getValue() != null;
		}
		return super.eIsSet(featureID);
	}

} //KeyValueImpl
