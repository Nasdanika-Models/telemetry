/**
 */
package org.nasdanika.models.telemetry;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traces Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TracesData represents the traces export payload which can be serialized to different formats, e.g., OTLP/gRPC, JSON, and proto.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.telemetry.TracesData#getResourceSpans <em>Resource Spans</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.telemetry.TelemetryPackage#getTracesData()
 * @model
 * @generated
 */
public interface TracesData extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource Spans</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.telemetry.ResourceSpans}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of ResourceSpans. For data coming from a single resource this array will typically contain one element. Intermediary nodes that receive data from multiple origins typically batch the data before forwarding further.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Spans</em>' containment reference list.
	 * @see org.nasdanika.models.telemetry.TelemetryPackage#getTracesData_ResourceSpans()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceSpans> getResourceSpans();

} // TracesData
