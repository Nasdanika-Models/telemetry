/**
 */
package org.nasdanika.models.telemetry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the model object '<em><b>Any Value</b></em>'.
 * @generated
 */
public interface AnyValue extends EObject {
	String getStringValue();
	void setStringValue(String value);
	Boolean getBoolValue();
	void setBoolValue(Boolean value);
	Long getIntValue();
	void setIntValue(Long value);
	Double getDoubleValue();
	void setDoubleValue(Double value);
	EList<AnyValue> getArrayValue();
	EList<KeyValue> getKvlistValue();
	byte[] getBytesValue();
	void setBytesValue(byte[] value);
} // AnyValue
