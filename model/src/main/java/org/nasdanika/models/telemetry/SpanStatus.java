/**
 */
package org.nasdanika.models.telemetry;

import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the model object '<em><b>Span Status</b></em>'.
 * @generated
 */
public interface SpanStatus extends EObject {

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * @return the value of the '<em><b>Message</b></em>' attribute.
	 * @see #setMessage(String)
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.SpanStatus#getMessage <em>Message</em>}' attribute.
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * @return the value of the '<em><b>Code</b></em>' attribute.
	 * @see #setCode(StatusCode)
	 * @generated
	 */
	StatusCode getCode();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.telemetry.SpanStatus#getCode <em>Code</em>}' attribute.
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(StatusCode value);

} // SpanStatus
