/**
 */
package org.nasdanika.models.telemetry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the model object '<em><b>Metric</b></em>'.
 * @generated
 */
public interface Metric extends EObject {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * @return the value of the '<em><b>Name</b></em>' attribute.
	 * @see #setName(String)
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.Metric#getName <em>Name</em>}' attribute.
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * @return the value of the '<em><b>Description</b></em>' attribute.
	 * @see #setDescription(String)
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.Metric#getDescription <em>Description</em>}' attribute.
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * @return the value of the '<em><b>Unit</b></em>' attribute.
	 * @see #setUnit(String)
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.Metric#getUnit <em>Unit</em>}' attribute.
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference list.
	 * @return the value of the '<em><b>Metadata</b></em>' containment reference list.
	 * @generated
	 */
	EList<KeyValue> getMetadata();

} // Metric
