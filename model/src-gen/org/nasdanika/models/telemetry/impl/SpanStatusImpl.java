/**
 */
package org.nasdanika.models.telemetry.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.telemetry.SpanStatus;
import org.nasdanika.models.telemetry.StatusCode;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Span Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.telemetry.impl.SpanStatusImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.nasdanika.models.telemetry.impl.SpanStatusImpl#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpanStatusImpl extends MinimalEObjectImpl.Container implements SpanStatus {
	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final StatusCode CODE_EDEFAULT = StatusCode.STATUS_CODE_UNSET;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpanStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.SPAN_STATUS;
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
	public String getMessage() {
		return (String)eDynamicGet(TelemetryPackage.SPAN_STATUS__MESSAGE, TelemetryPackage.Literals.SPAN_STATUS__MESSAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(String newMessage) {
		eDynamicSet(TelemetryPackage.SPAN_STATUS__MESSAGE, TelemetryPackage.Literals.SPAN_STATUS__MESSAGE, newMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusCode getCode() {
		return (StatusCode)eDynamicGet(TelemetryPackage.SPAN_STATUS__CODE, TelemetryPackage.Literals.SPAN_STATUS__CODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(StatusCode newCode) {
		eDynamicSet(TelemetryPackage.SPAN_STATUS__CODE, TelemetryPackage.Literals.SPAN_STATUS__CODE, newCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.SPAN_STATUS__MESSAGE:
				return getMessage();
			case TelemetryPackage.SPAN_STATUS__CODE:
				return getCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.SPAN_STATUS__MESSAGE:
				setMessage((String)newValue);
				return;
			case TelemetryPackage.SPAN_STATUS__CODE:
				setCode((StatusCode)newValue);
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
			case TelemetryPackage.SPAN_STATUS__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case TelemetryPackage.SPAN_STATUS__CODE:
				setCode(CODE_EDEFAULT);
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
			case TelemetryPackage.SPAN_STATUS__MESSAGE:
				return MESSAGE_EDEFAULT == null ? getMessage() != null : !MESSAGE_EDEFAULT.equals(getMessage());
			case TelemetryPackage.SPAN_STATUS__CODE:
				return getCode() != CODE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //SpanStatusImpl
