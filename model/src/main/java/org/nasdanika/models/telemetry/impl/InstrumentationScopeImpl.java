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
import org.nasdanika.models.telemetry.InstrumentationScope;
import org.nasdanika.models.telemetry.KeyValue;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Instrumentation Scope</b></em>'.
 * @generated
 */
public class InstrumentationScopeImpl extends MinimalEObjectImpl.Container implements InstrumentationScope {

	protected InstrumentationScopeImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.INSTRUMENTATION_SCOPE;
	}

	@Override
	public String getName() {
		return (String)eDynamicGet(TelemetryPackage.INSTRUMENTATION_SCOPE__NAME, TelemetryPackage.Literals.INSTRUMENTATION_SCOPE__NAME, true, true);
	}

	@Override
	public void setName(String newName) {
		eDynamicSet(TelemetryPackage.INSTRUMENTATION_SCOPE__NAME, TelemetryPackage.Literals.INSTRUMENTATION_SCOPE__NAME, newName);
	}

	@Override
	public String getVersion() {
		return (String)eDynamicGet(TelemetryPackage.INSTRUMENTATION_SCOPE__VERSION, TelemetryPackage.Literals.INSTRUMENTATION_SCOPE__VERSION, true, true);
	}

	@Override
	public void setVersion(String newVersion) {
		eDynamicSet(TelemetryPackage.INSTRUMENTATION_SCOPE__VERSION, TelemetryPackage.Literals.INSTRUMENTATION_SCOPE__VERSION, newVersion);
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<KeyValue> getAttributes() {
		return (EList<KeyValue>)eDynamicGet(TelemetryPackage.INSTRUMENTATION_SCOPE__ATTRIBUTES, TelemetryPackage.Literals.INSTRUMENTATION_SCOPE__ATTRIBUTES, true, true);
	}

	@Override
	public int getDroppedAttributesCount() {
		return (Integer)eDynamicGet(TelemetryPackage.INSTRUMENTATION_SCOPE__DROPPED_ATTRIBUTES_COUNT, TelemetryPackage.Literals.INSTRUMENTATION_SCOPE__DROPPED_ATTRIBUTES_COUNT, true, true);
	}

	@Override
	public void setDroppedAttributesCount(int newDroppedAttributesCount) {
		eDynamicSet(TelemetryPackage.INSTRUMENTATION_SCOPE__DROPPED_ATTRIBUTES_COUNT, TelemetryPackage.Literals.INSTRUMENTATION_SCOPE__DROPPED_ATTRIBUTES_COUNT, newDroppedAttributesCount);
	}

	@Override
	public String getSchemaUrl() {
		return (String)eDynamicGet(TelemetryPackage.INSTRUMENTATION_SCOPE__SCHEMA_URL, TelemetryPackage.Literals.INSTRUMENTATION_SCOPE__SCHEMA_URL, true, true);
	}

	@Override
	public void setSchemaUrl(String newSchemaUrl) {
		eDynamicSet(TelemetryPackage.INSTRUMENTATION_SCOPE__SCHEMA_URL, TelemetryPackage.Literals.INSTRUMENTATION_SCOPE__SCHEMA_URL, newSchemaUrl);
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.INSTRUMENTATION_SCOPE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.INSTRUMENTATION_SCOPE__NAME: return getName();
			case TelemetryPackage.INSTRUMENTATION_SCOPE__VERSION: return getVersion();
			case TelemetryPackage.INSTRUMENTATION_SCOPE__ATTRIBUTES: return getAttributes();
			case TelemetryPackage.INSTRUMENTATION_SCOPE__DROPPED_ATTRIBUTES_COUNT: return getDroppedAttributesCount();
			case TelemetryPackage.INSTRUMENTATION_SCOPE__SCHEMA_URL: return getSchemaUrl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.INSTRUMENTATION_SCOPE__NAME:
				setName((String)newValue);
				return;
			case TelemetryPackage.INSTRUMENTATION_SCOPE__VERSION:
				setVersion((String)newValue);
				return;
			case TelemetryPackage.INSTRUMENTATION_SCOPE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends KeyValue>)newValue);
				return;
			case TelemetryPackage.INSTRUMENTATION_SCOPE__DROPPED_ATTRIBUTES_COUNT:
				setDroppedAttributesCount((Integer)newValue);
				return;
			case TelemetryPackage.INSTRUMENTATION_SCOPE__SCHEMA_URL:
				setSchemaUrl((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.INSTRUMENTATION_SCOPE__NAME:
				setName(null);
				return;
			case TelemetryPackage.INSTRUMENTATION_SCOPE__VERSION:
				setVersion(null);
				return;
			case TelemetryPackage.INSTRUMENTATION_SCOPE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case TelemetryPackage.INSTRUMENTATION_SCOPE__DROPPED_ATTRIBUTES_COUNT:
				setDroppedAttributesCount(0);
				return;
			case TelemetryPackage.INSTRUMENTATION_SCOPE__SCHEMA_URL:
				setSchemaUrl(null);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.INSTRUMENTATION_SCOPE__NAME: return getName() != null;
			case TelemetryPackage.INSTRUMENTATION_SCOPE__VERSION: return getVersion() != null;
			case TelemetryPackage.INSTRUMENTATION_SCOPE__ATTRIBUTES: return !getAttributes().isEmpty();
			case TelemetryPackage.INSTRUMENTATION_SCOPE__DROPPED_ATTRIBUTES_COUNT: return getDroppedAttributesCount() != 0;
			case TelemetryPackage.INSTRUMENTATION_SCOPE__SCHEMA_URL: return getSchemaUrl() != null;
		}
		return super.eIsSet(featureID);
	}

} //InstrumentationScopeImpl
