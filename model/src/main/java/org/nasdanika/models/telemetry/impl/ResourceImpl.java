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
import org.nasdanika.models.telemetry.Resource;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * @generated
 */
public class ResourceImpl extends MinimalEObjectImpl.Container implements Resource {

	protected ResourceImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.RESOURCE;
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<KeyValue> getAttributes() {
		return (EList<KeyValue>)eDynamicGet(TelemetryPackage.RESOURCE__ATTRIBUTES, TelemetryPackage.Literals.RESOURCE__ATTRIBUTES, true, true);
	}

	@Override
	public int getDroppedAttributesCount() {
		return (Integer)eDynamicGet(TelemetryPackage.RESOURCE__DROPPED_ATTRIBUTES_COUNT, TelemetryPackage.Literals.RESOURCE__DROPPED_ATTRIBUTES_COUNT, true, true);
	}

	@Override
	public void setDroppedAttributesCount(int newDroppedAttributesCount) {
		eDynamicSet(TelemetryPackage.RESOURCE__DROPPED_ATTRIBUTES_COUNT, TelemetryPackage.Literals.RESOURCE__DROPPED_ATTRIBUTES_COUNT, newDroppedAttributesCount);
	}

	@Override
	public String getSchemaUrl() {
		return (String)eDynamicGet(TelemetryPackage.RESOURCE__SCHEMA_URL, TelemetryPackage.Literals.RESOURCE__SCHEMA_URL, true, true);
	}

	@Override
	public void setSchemaUrl(String newSchemaUrl) {
		eDynamicSet(TelemetryPackage.RESOURCE__SCHEMA_URL, TelemetryPackage.Literals.RESOURCE__SCHEMA_URL, newSchemaUrl);
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.RESOURCE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.RESOURCE__ATTRIBUTES: return getAttributes();
			case TelemetryPackage.RESOURCE__DROPPED_ATTRIBUTES_COUNT: return getDroppedAttributesCount();
			case TelemetryPackage.RESOURCE__SCHEMA_URL: return getSchemaUrl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.RESOURCE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends KeyValue>)newValue);
				return;
			case TelemetryPackage.RESOURCE__DROPPED_ATTRIBUTES_COUNT:
				setDroppedAttributesCount((Integer)newValue);
				return;
			case TelemetryPackage.RESOURCE__SCHEMA_URL:
				setSchemaUrl((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.RESOURCE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case TelemetryPackage.RESOURCE__DROPPED_ATTRIBUTES_COUNT:
				setDroppedAttributesCount(0);
				return;
			case TelemetryPackage.RESOURCE__SCHEMA_URL:
				setSchemaUrl(null);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.RESOURCE__ATTRIBUTES: return !getAttributes().isEmpty();
			case TelemetryPackage.RESOURCE__DROPPED_ATTRIBUTES_COUNT: return getDroppedAttributesCount() != 0;
			case TelemetryPackage.RESOURCE__SCHEMA_URL: return getSchemaUrl() != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceImpl
