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
import org.nasdanika.models.telemetry.ResourceSpans;
import org.nasdanika.models.telemetry.TelemetryPackage;
import org.nasdanika.models.telemetry.TracesData;

/**
 * An implementation of the model object '<em><b>Traces Data</b></em>'.
 * @generated
 */
public class TracesDataImpl extends MinimalEObjectImpl.Container implements TracesData {

	protected TracesDataImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.TRACES_DATA;
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<ResourceSpans> getResourceSpans() {
		return (EList<ResourceSpans>)eDynamicGet(TelemetryPackage.TRACES_DATA__RESOURCE_SPANS, TelemetryPackage.Literals.TRACES_DATA__RESOURCE_SPANS, true, true);
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.TRACES_DATA__RESOURCE_SPANS:
				return ((InternalEList<?>)getResourceSpans()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.TRACES_DATA__RESOURCE_SPANS: return getResourceSpans();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.TRACES_DATA__RESOURCE_SPANS:
				getResourceSpans().clear();
				getResourceSpans().addAll((Collection<? extends ResourceSpans>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.TRACES_DATA__RESOURCE_SPANS:
				getResourceSpans().clear();
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.TRACES_DATA__RESOURCE_SPANS: return !getResourceSpans().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracesDataImpl
