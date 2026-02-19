/**
 */
package org.nasdanika.models.telemetry;

import org.eclipse.emf.ecore.EFactory;

/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @see org.nasdanika.models.telemetry.TelemetryPackage
 * @generated
 */
public interface TelemetryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * @generated
	 */
	TelemetryFactory eINSTANCE = org.nasdanika.models.telemetry.impl.TelemetryFactoryImpl.init();

	Resource createResource();
	InstrumentationScope createInstrumentationScope();
	KeyValue createKeyValue();
	AnyValue createAnyValue();
	TracesData createTracesData();
	ResourceSpans createResourceSpans();
	ScopeSpans createScopeSpans();
	Span createSpan();
	SpanEvent createSpanEvent();
	SpanLink createSpanLink();
	SpanStatus createSpanStatus();
	MetricsData createMetricsData();
	ResourceMetrics createResourceMetrics();
	ScopeMetrics createScopeMetrics();
	Gauge createGauge();
	Sum createSum();
	Histogram createHistogram();
	ExponentialHistogram createExponentialHistogram();
	Summary createSummary();
	NumberDataPoint createNumberDataPoint();
	HistogramDataPoint createHistogramDataPoint();
	ExponentialHistogramDataPoint createExponentialHistogramDataPoint();
	ExponentialHistogramDataPointBuckets createExponentialHistogramDataPointBuckets();
	SummaryDataPoint createSummaryDataPoint();
	SummaryDataPointValueAtQuantile createSummaryDataPointValueAtQuantile();
	Exemplar createExemplar();
	LogsData createLogsData();
	ResourceLogs createResourceLogs();
	ScopeLogs createScopeLogs();
	LogRecord createLogRecord();

	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	TelemetryPackage getTelemetryPackage();

} // TelemetryFactory
