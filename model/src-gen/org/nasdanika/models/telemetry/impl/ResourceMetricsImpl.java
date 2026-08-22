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

import org.nasdanika.models.telemetry.Resource;
import org.nasdanika.models.telemetry.ResourceMetrics;
import org.nasdanika.models.telemetry.ScopeMetrics;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Metrics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.telemetry.impl.ResourceMetricsImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.ResourceMetricsImpl#getScopeMetrics <em>Scope Metrics</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.ResourceMetricsImpl#getSchemaUrl <em>Schema Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceMetricsImpl extends MinimalEObjectImpl.Container implements ResourceMetrics {
	/**
	 * The default value of the '{@link #getSchemaUrl() <em>Schema Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_URL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceMetricsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.RESOURCE_METRICS;
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
	public Resource getResource() {
		return (Resource)eDynamicGet(TelemetryPackage.RESOURCE_METRICS__RESOURCE, TelemetryPackage.Literals.RESOURCE_METRICS__RESOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Resource newResource, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newResource, TelemetryPackage.RESOURCE_METRICS__RESOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResource(Resource newResource) {
		eDynamicSet(TelemetryPackage.RESOURCE_METRICS__RESOURCE, TelemetryPackage.Literals.RESOURCE_METRICS__RESOURCE, newResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ScopeMetrics> getScopeMetrics() {
		return (EList<ScopeMetrics>)eDynamicGet(TelemetryPackage.RESOURCE_METRICS__SCOPE_METRICS, TelemetryPackage.Literals.RESOURCE_METRICS__SCOPE_METRICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchemaUrl() {
		return (String)eDynamicGet(TelemetryPackage.RESOURCE_METRICS__SCHEMA_URL, TelemetryPackage.Literals.RESOURCE_METRICS__SCHEMA_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchemaUrl(String newSchemaUrl) {
		eDynamicSet(TelemetryPackage.RESOURCE_METRICS__SCHEMA_URL, TelemetryPackage.Literals.RESOURCE_METRICS__SCHEMA_URL, newSchemaUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.RESOURCE_METRICS__RESOURCE:
				return basicSetResource(null, msgs);
			case TelemetryPackage.RESOURCE_METRICS__SCOPE_METRICS:
				return ((InternalEList<?>)getScopeMetrics()).basicRemove(otherEnd, msgs);
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
			case TelemetryPackage.RESOURCE_METRICS__RESOURCE:
				return getResource();
			case TelemetryPackage.RESOURCE_METRICS__SCOPE_METRICS:
				return getScopeMetrics();
			case TelemetryPackage.RESOURCE_METRICS__SCHEMA_URL:
				return getSchemaUrl();
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
			case TelemetryPackage.RESOURCE_METRICS__RESOURCE:
				setResource((Resource)newValue);
				return;
			case TelemetryPackage.RESOURCE_METRICS__SCOPE_METRICS:
				getScopeMetrics().clear();
				getScopeMetrics().addAll((Collection<? extends ScopeMetrics>)newValue);
				return;
			case TelemetryPackage.RESOURCE_METRICS__SCHEMA_URL:
				setSchemaUrl((String)newValue);
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
			case TelemetryPackage.RESOURCE_METRICS__RESOURCE:
				setResource((Resource)null);
				return;
			case TelemetryPackage.RESOURCE_METRICS__SCOPE_METRICS:
				getScopeMetrics().clear();
				return;
			case TelemetryPackage.RESOURCE_METRICS__SCHEMA_URL:
				setSchemaUrl(SCHEMA_URL_EDEFAULT);
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
			case TelemetryPackage.RESOURCE_METRICS__RESOURCE:
				return getResource() != null;
			case TelemetryPackage.RESOURCE_METRICS__SCOPE_METRICS:
				return !getScopeMetrics().isEmpty();
			case TelemetryPackage.RESOURCE_METRICS__SCHEMA_URL:
				return SCHEMA_URL_EDEFAULT == null ? getSchemaUrl() != null : !SCHEMA_URL_EDEFAULT.equals(getSchemaUrl());
		}
		return super.eIsSet(featureID);
	}

} //ResourceMetricsImpl
