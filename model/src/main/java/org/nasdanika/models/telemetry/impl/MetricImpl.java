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
import org.nasdanika.models.telemetry.Metric;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Metric</b></em>'.
 * @generated
 */
public abstract class MetricImpl extends MinimalEObjectImpl.Container implements Metric {

	protected MetricImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.METRIC;
	}

	@Override
	public String getName() {
		return (String)eDynamicGet(TelemetryPackage.METRIC__NAME, TelemetryPackage.Literals.METRIC__NAME, true, true);
	}

	@Override
	public void setName(String newName) {
		eDynamicSet(TelemetryPackage.METRIC__NAME, TelemetryPackage.Literals.METRIC__NAME, newName);
	}

	@Override
	public String getDescription() {
		return (String)eDynamicGet(TelemetryPackage.METRIC__DESCRIPTION, TelemetryPackage.Literals.METRIC__DESCRIPTION, true, true);
	}

	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(TelemetryPackage.METRIC__DESCRIPTION, TelemetryPackage.Literals.METRIC__DESCRIPTION, newDescription);
	}

	@Override
	public String getUnit() {
		return (String)eDynamicGet(TelemetryPackage.METRIC__UNIT, TelemetryPackage.Literals.METRIC__UNIT, true, true);
	}

	@Override
	public void setUnit(String newUnit) {
		eDynamicSet(TelemetryPackage.METRIC__UNIT, TelemetryPackage.Literals.METRIC__UNIT, newUnit);
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<KeyValue> getMetadata() {
		return (EList<KeyValue>)eDynamicGet(TelemetryPackage.METRIC__METADATA, TelemetryPackage.Literals.METRIC__METADATA, true, true);
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.METRIC__METADATA:
				return ((InternalEList<?>)getMetadata()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.METRIC__NAME: return getName();
			case TelemetryPackage.METRIC__DESCRIPTION: return getDescription();
			case TelemetryPackage.METRIC__UNIT: return getUnit();
			case TelemetryPackage.METRIC__METADATA: return getMetadata();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.METRIC__NAME:
				setName((String)newValue);
				return;
			case TelemetryPackage.METRIC__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TelemetryPackage.METRIC__UNIT:
				setUnit((String)newValue);
				return;
			case TelemetryPackage.METRIC__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends KeyValue>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.METRIC__NAME:
				setName(null);
				return;
			case TelemetryPackage.METRIC__DESCRIPTION:
				setDescription(null);
				return;
			case TelemetryPackage.METRIC__UNIT:
				setUnit(null);
				return;
			case TelemetryPackage.METRIC__METADATA:
				getMetadata().clear();
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.METRIC__NAME: return getName() != null;
			case TelemetryPackage.METRIC__DESCRIPTION: return getDescription() != null;
			case TelemetryPackage.METRIC__UNIT: return getUnit() != null;
			case TelemetryPackage.METRIC__METADATA: return !getMetadata().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MetricImpl
