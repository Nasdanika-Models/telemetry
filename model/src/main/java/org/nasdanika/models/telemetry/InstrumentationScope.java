/**
 */
package org.nasdanika.models.telemetry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the model object '<em><b>Instrumentation Scope</b></em>'.
 * @generated
 */
public interface InstrumentationScope extends EObject {
	EList<KeyValue> getAttributes();
	String getName();
	void setName(String value);
	String getVersion();
	void setVersion(String value);
	int getDroppedAttributesCount();
	void setDroppedAttributesCount(int value);
	String getSchemaUrl();
	void setSchemaUrl(String value);
} // InstrumentationScope
