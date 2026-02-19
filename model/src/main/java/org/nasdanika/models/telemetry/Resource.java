/**
 */
package org.nasdanika.models.telemetry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the model object '<em><b>Resource</b></em>'.
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * @return the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * @see org.nasdanika.models.telemetry.TelemetryPackage#getResource_Attributes()
	 * @generated
	 */
	EList<KeyValue> getAttributes();

	/**
	 * Returns the value of the '<em><b>Dropped Attributes Count</b></em>' attribute.
	 * @return the value of the '<em><b>Dropped Attributes Count</b></em>' attribute.
	 * @see #setDroppedAttributesCount(int)
	 * @see org.nasdanika.models.telemetry.TelemetryPackage#getResource_DroppedAttributesCount()
	 * @generated
	 */
	int getDroppedAttributesCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.Resource#getDroppedAttributesCount <em>Dropped Attributes Count</em>}' attribute.
	 * @param value the new value of the '<em>Dropped Attributes Count</em>' attribute.
	 * @see #getDroppedAttributesCount()
	 * @generated
	 */
	void setDroppedAttributesCount(int value);

	/**
	 * Returns the value of the '<em><b>Schema Url</b></em>' attribute.
	 * @return the value of the '<em><b>Schema Url</b></em>' attribute.
	 * @see #setSchemaUrl(String)
	 * @see org.nasdanika.models.telemetry.TelemetryPackage#getResource_SchemaUrl()
	 * @generated
	 */
	String getSchemaUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.Resource#getSchemaUrl <em>Schema Url</em>}' attribute.
	 * @param value the new value of the '<em>Schema Url</em>' attribute.
	 * @see #getSchemaUrl()
	 * @generated
	 */
	void setSchemaUrl(String value);

} // Resource
