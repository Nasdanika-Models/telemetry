/**
 */
package org.nasdanika.models.telemetry;

import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the model object '<em><b>Summary Data Point Value At Quantile</b></em>'.
 * @generated
 */
public interface SummaryDataPointValueAtQuantile extends EObject {

	/**
	 * Returns the value of the '<em><b>Quantile</b></em>' attribute.
	 * @return the value of the '<em><b>Quantile</b></em>' attribute.
	 * @see #setQuantile(double)
	 * @generated
	 */
	double getQuantile();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.SummaryDataPointValueAtQuantile#getQuantile <em>Quantile</em>}' attribute.
	 * @param value the new value of the '<em>Quantile</em>' attribute.
	 * @see #getQuantile()
	 * @generated
	 */
	void setQuantile(double value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * @return the value of the '<em><b>Value</b></em>' attribute.
	 * @see #setValue(double)
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.SummaryDataPointValueAtQuantile#getValue <em>Value</em>}' attribute.
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // SummaryDataPointValueAtQuantile
