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
import org.nasdanika.models.telemetry.NumberDataPoint;
import org.nasdanika.models.telemetry.TelemetryPackage;

/**
 * An implementation of the model object '<em><b>Number Data Point</b></em>'.
 * @generated
 */
public class NumberDataPointImpl extends MinimalEObjectImpl.Container implements NumberDataPoint {

	protected NumberDataPointImpl() { super(); }

	@Override
	protected EClass eStaticClass() {
		return TelemetryPackage.Literals.NUMBER_DATA_POINT;
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<KeyValue> getAttributes() {
		return (EList<KeyValue>)eDynamicGet(TelemetryPackage.NUMBER_DATA_POINT__ATTRIBUTES, TelemetryPackage.Literals.NUMBER_DATA_POINT__ATTRIBUTES, true, true);
	}

	@Override
	public long getStartTimeUnixNano() {
		return (Long)eDynamicGet(TelemetryPackage.NUMBER_DATA_POINT__START_TIME_UNIX_NANO, TelemetryPackage.Literals.NUMBER_DATA_POINT__START_TIME_UNIX_NANO, true, true);
	}

	@Override
	public void setStartTimeUnixNano(long newStartTimeUnixNano) {
		eDynamicSet(TelemetryPackage.NUMBER_DATA_POINT__START_TIME_UNIX_NANO, TelemetryPackage.Literals.NUMBER_DATA_POINT__START_TIME_UNIX_NANO, newStartTimeUnixNano);
	}

	@Override
	public long getTimeUnixNano() {
		return (Long)eDynamicGet(TelemetryPackage.NUMBER_DATA_POINT__TIME_UNIX_NANO, TelemetryPackage.Literals.NUMBER_DATA_POINT__TIME_UNIX_NANO, true, true);
	}

	@Override
	public void setTimeUnixNano(long newTimeUnixNano) {
		eDynamicSet(TelemetryPackage.NUMBER_DATA_POINT__TIME_UNIX_NANO, TelemetryPackage.Literals.NUMBER_DATA_POINT__TIME_UNIX_NANO, newTimeUnixNano);
	}

	@Override
	public Double getAsDouble() {
		return (Double)eDynamicGet(TelemetryPackage.NUMBER_DATA_POINT__AS_DOUBLE, TelemetryPackage.Literals.NUMBER_DATA_POINT__AS_DOUBLE, true, true);
	}

	@Override
	public void setAsDouble(Double newAsDouble) {
		eDynamicSet(TelemetryPackage.NUMBER_DATA_POINT__AS_DOUBLE, TelemetryPackage.Literals.NUMBER_DATA_POINT__AS_DOUBLE, newAsDouble);
	}

	@Override
	public Long getAsInt() {
		return (Long)eDynamicGet(TelemetryPackage.NUMBER_DATA_POINT__AS_INT, TelemetryPackage.Literals.NUMBER_DATA_POINT__AS_INT, true, true);
	}

	@Override
	public void setAsInt(Long newAsInt) {
		eDynamicSet(TelemetryPackage.NUMBER_DATA_POINT__AS_INT, TelemetryPackage.Literals.NUMBER_DATA_POINT__AS_INT, newAsInt);
	}

	@Override
	@SuppressWarnings("unchecked")
	public EList<Exemplar> getExemplars() {
		return (EList<Exemplar>)eDynamicGet(TelemetryPackage.NUMBER_DATA_POINT__EXEMPLARS, TelemetryPackage.Literals.NUMBER_DATA_POINT__EXEMPLARS, true, true);
	}

	@Override
	public int getFlags() {
		return (Integer)eDynamicGet(TelemetryPackage.NUMBER_DATA_POINT__FLAGS, TelemetryPackage.Literals.NUMBER_DATA_POINT__FLAGS, true, true);
	}

	@Override
	public void setFlags(int newFlags) {
		eDynamicSet(TelemetryPackage.NUMBER_DATA_POINT__FLAGS, TelemetryPackage.Literals.NUMBER_DATA_POINT__FLAGS, newFlags);
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelemetryPackage.NUMBER_DATA_POINT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case TelemetryPackage.NUMBER_DATA_POINT__EXEMPLARS:
				return ((InternalEList<?>)getExemplars()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelemetryPackage.NUMBER_DATA_POINT__ATTRIBUTES: return getAttributes();
			case TelemetryPackage.NUMBER_DATA_POINT__START_TIME_UNIX_NANO: return getStartTimeUnixNano();
			case TelemetryPackage.NUMBER_DATA_POINT__TIME_UNIX_NANO: return getTimeUnixNano();
			case TelemetryPackage.NUMBER_DATA_POINT__AS_DOUBLE: return getAsDouble();
			case TelemetryPackage.NUMBER_DATA_POINT__AS_INT: return getAsInt();
			case TelemetryPackage.NUMBER_DATA_POINT__EXEMPLARS: return getExemplars();
			case TelemetryPackage.NUMBER_DATA_POINT__FLAGS: return getFlags();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelemetryPackage.NUMBER_DATA_POINT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends KeyValue>)newValue);
				return;
			case TelemetryPackage.NUMBER_DATA_POINT__START_TIME_UNIX_NANO:
				setStartTimeUnixNano((Long)newValue);
				return;
			case TelemetryPackage.NUMBER_DATA_POINT__TIME_UNIX_NANO:
				setTimeUnixNano((Long)newValue);
				return;
			case TelemetryPackage.NUMBER_DATA_POINT__AS_DOUBLE:
				setAsDouble((Double)newValue);
				return;
			case TelemetryPackage.NUMBER_DATA_POINT__AS_INT:
				setAsInt((Long)newValue);
				return;
			case TelemetryPackage.NUMBER_DATA_POINT__EXEMPLARS:
				getExemplars().clear();
				getExemplars().addAll((Collection<? extends Exemplar>)newValue);
				return;
			case TelemetryPackage.NUMBER_DATA_POINT__FLAGS:
				setFlags((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelemetryPackage.NUMBER_DATA_POINT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case TelemetryPackage.NUMBER_DATA_POINT__START_TIME_UNIX_NANO:
				setStartTimeUnixNano(0L);
				return;
			case TelemetryPackage.NUMBER_DATA_POINT__TIME_UNIX_NANO:
				setTimeUnixNano(0L);
				return;
			case TelemetryPackage.NUMBER_DATA_POINT__AS_DOUBLE:
				setAsDouble(null);
				return;
			case TelemetryPackage.NUMBER_DATA_POINT__AS_INT:
				setAsInt(null);
				return;
			case TelemetryPackage.NUMBER_DATA_POINT__EXEMPLARS:
				getExemplars().clear();
				return;
			case TelemetryPackage.NUMBER_DATA_POINT__FLAGS:
				setFlags(0);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelemetryPackage.NUMBER_DATA_POINT__ATTRIBUTES: return !getAttributes().isEmpty();
			case TelemetryPackage.NUMBER_DATA_POINT__START_TIME_UNIX_NANO: return getStartTimeUnixNano() != 0L;
			case TelemetryPackage.NUMBER_DATA_POINT__TIME_UNIX_NANO: return getTimeUnixNano() != 0L;
			case TelemetryPackage.NUMBER_DATA_POINT__AS_DOUBLE: return getAsDouble() != null;
			case TelemetryPackage.NUMBER_DATA_POINT__AS_INT: return getAsInt() != null;
			case TelemetryPackage.NUMBER_DATA_POINT__EXEMPLARS: return !getExemplars().isEmpty();
			case TelemetryPackage.NUMBER_DATA_POINT__FLAGS: return getFlags() != 0;
		}
		return super.eIsSet(featureID);
	}

} //NumberDataPointImpl
