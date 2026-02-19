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
import org.nasdanika.models.telemetry.ScopeSpans;
import org.nasdanika.models.telemetry.Span;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Scope Spans</b></em>'.
 * @generated
 */
public class ScopeSpansImpl extends MinimalEObjectImpl.Container implements ScopeSpans {

	protected ScopeSpansImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.SCOPE_SPANS;
	}

	@Override
	public InstrumentationScope getScope() {
		return (InstrumentationScope)eDynamicGet(TelemetryPackage.SCOPE_SPANS__SCOPE, TelemetryPackage.Literals.SCOPE_SPANS__SCOPE, true, true);
	}

	@Override
	public void setScope(InstrumentationScope newScope) {
		eDynamicSet(TelemetryPackage.SCOPE_SPANS__SCOPE, TelemetryPackage.Literals.SCOPE_SPANS__SCOPE, newScope);
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<Span> getSpans() {
		return (EList<Span>)eDynamicGet(TelemetryPackage.SCOPE_SPANS__SPANS, TelemetryPackage.Literals.SCOPE_SPANS__SPANS, true, true);
	}

	@Override
	public String getSchemaUrl() {
		return (String)eDynamicGet(TelemetryPackage.SCOPE_SPANS__SCHEMA_URL, TelemetryPackage.Literals.SCOPE_SPANS__SCHEMA_URL, true, true);
	}

	@Override
	public void setSchemaUrl(String newSchemaUrl) {
		eDynamicSet(TelemetryPackage.SCOPE_SPANS__SCHEMA_URL, TelemetryPackage.Literals.SCOPE_SPANS__SCHEMA_URL, newSchemaUrl);
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.SCOPE_SPANS__SCOPE:
				return eDynamicInverseRemove(otherEnd, featureID, msgs);
			case TelemetryPackage.SCOPE_SPANS__SPANS:
				return ((InternalEList<?>)getSpans()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.SCOPE_SPANS__SCOPE: return getScope();
			case TelemetryPackage.SCOPE_SPANS__SPANS: return getSpans();
			case TelemetryPackage.SCOPE_SPANS__SCHEMA_URL: return getSchemaUrl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.SCOPE_SPANS__SCOPE:
				setScope((InstrumentationScope)newValue);
				return;
			case TelemetryPackage.SCOPE_SPANS__SPANS:
				getSpans().clear();
				getSpans().addAll((Collection<? extends Span>)newValue);
				return;
			case TelemetryPackage.SCOPE_SPANS__SCHEMA_URL:
				setSchemaUrl((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.SCOPE_SPANS__SCOPE:
				setScope(null);
				return;
			case TelemetryPackage.SCOPE_SPANS__SPANS:
				getSpans().clear();
				return;
			case TelemetryPackage.SCOPE_SPANS__SCHEMA_URL:
				setSchemaUrl(null);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.SCOPE_SPANS__SCOPE: return getScope() != null;
			case TelemetryPackage.SCOPE_SPANS__SPANS: return !getSpans().isEmpty();
			case TelemetryPackage.SCOPE_SPANS__SCHEMA_URL: return getSchemaUrl() != null;
		}
		return super.eIsSet(featureID);
	}

} //ScopeSpansImpl
