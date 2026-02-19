/**
 */
package org.nasdanika.models.telemetry.util;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.models.telemetry.*;

/**
 * The <b>Validator</b> for the model.
 * @see org.nasdanika.models.telemetry.TelemetryPackage
 * @generated
 */
public class TelemetryValidator extends EObjectValidator {

	public static final TelemetryValidator INSTANCE = new TelemetryValidator();

	public static final String DIAGNOSTIC_SOURCE = "org.nasdanika.models.telemetry";

	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	public TelemetryValidator() {
		super();
	}

	@Override
	protected EPackage getEPackage() {
		return TelemetryPackage.eINSTANCE;
	}

	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case TelemetryPackage.RESOURCE: return validateResource((Resource)value, diagnostics, context);
			case TelemetryPackage.INSTRUMENTATION_SCOPE: return validateInstrumentationScope((InstrumentationScope)value, diagnostics, context);
			case TelemetryPackage.KEY_VALUE: return validateKeyValue((KeyValue)value, diagnostics, context);
			case TelemetryPackage.ANY_VALUE: return validateAnyValue((AnyValue)value, diagnostics, context);
			case TelemetryPackage.TRACES_DATA: return validateTracesData((TracesData)value, diagnostics, context);
			case TelemetryPackage.RESOURCE_SPANS: return validateResourceSpans((ResourceSpans)value, diagnostics, context);
			case TelemetryPackage.SCOPE_SPANS: return validateScopeSpans((ScopeSpans)value, diagnostics, context);
			case TelemetryPackage.SPAN: return validateSpan((Span)value, diagnostics, context);
			case TelemetryPackage.SPAN_EVENT: return validateSpanEvent((SpanEvent)value, diagnostics, context);
			case TelemetryPackage.SPAN_LINK: return validateSpanLink((SpanLink)value, diagnostics, context);
			case TelemetryPackage.SPAN_STATUS: return validateSpanStatus((SpanStatus)value, diagnostics, context);
			case TelemetryPackage.METRICS_DATA: return validateMetricsData((MetricsData)value, diagnostics, context);
			case TelemetryPackage.RESOURCE_METRICS: return validateResourceMetrics((ResourceMetrics)value, diagnostics, context);
			case TelemetryPackage.SCOPE_METRICS: return validateScopeMetrics((ScopeMetrics)value, diagnostics, context);
			case TelemetryPackage.METRIC: return validateMetric((Metric)value, diagnostics, context);
			case TelemetryPackage.GAUGE: return validateGauge((Gauge)value, diagnostics, context);
			case TelemetryPackage.SUM: return validateSum((Sum)value, diagnostics, context);
			case TelemetryPackage.HISTOGRAM: return validateHistogram((Histogram)value, diagnostics, context);
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM: return validateExponentialHistogram((ExponentialHistogram)value, diagnostics, context);
			case TelemetryPackage.SUMMARY: return validateSummary((Summary)value, diagnostics, context);
			case TelemetryPackage.NUMBER_DATA_POINT: return validateNumberDataPoint((NumberDataPoint)value, diagnostics, context);
			case TelemetryPackage.HISTOGRAM_DATA_POINT: return validateHistogramDataPoint((HistogramDataPoint)value, diagnostics, context);
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT: return validateExponentialHistogramDataPoint((ExponentialHistogramDataPoint)value, diagnostics, context);
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS: return validateExponentialHistogramDataPointBuckets((ExponentialHistogramDataPointBuckets)value, diagnostics, context);
			case TelemetryPackage.SUMMARY_DATA_POINT: return validateSummaryDataPoint((SummaryDataPoint)value, diagnostics, context);
			case TelemetryPackage.SUMMARY_DATA_POINT_VALUE_AT_QUANTILE: return validateSummaryDataPointValueAtQuantile((SummaryDataPointValueAtQuantile)value, diagnostics, context);
			case TelemetryPackage.EXEMPLAR: return validateExemplar((Exemplar)value, diagnostics, context);
			case TelemetryPackage.LOGS_DATA: return validateLogsData((LogsData)value, diagnostics, context);
			case TelemetryPackage.RESOURCE_LOGS: return validateResourceLogs((ResourceLogs)value, diagnostics, context);
			case TelemetryPackage.SCOPE_LOGS: return validateScopeLogs((ScopeLogs)value, diagnostics, context);
			case TelemetryPackage.LOG_RECORD: return validateLogRecord((LogRecord)value, diagnostics, context);
			case TelemetryPackage.SPAN_KIND: return validateSpanKind((SpanKind)value, diagnostics, context);
			case TelemetryPackage.STATUS_CODE: return validateStatusCode((StatusCode)value, diagnostics, context);
			case TelemetryPackage.AGGREGATION_TEMPORALITY: return validateAggregationTemporality((AggregationTemporality)value, diagnostics, context);
			case TelemetryPackage.SEVERITY_NUMBER: return validateSeverityNumber((SeverityNumber)value, diagnostics, context);
			default: return true;
		}
	}

	public boolean validateResource(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resource, diagnostics, context);
	}
	public boolean validateInstrumentationScope(InstrumentationScope instrumentationScope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instrumentationScope, diagnostics, context);
	}
	public boolean validateKeyValue(KeyValue keyValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keyValue, diagnostics, context);
	}
	public boolean validateAnyValue(AnyValue anyValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anyValue, diagnostics, context);
	}
	public boolean validateTracesData(TracesData tracesData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tracesData, diagnostics, context);
	}
	public boolean validateResourceSpans(ResourceSpans resourceSpans, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceSpans, diagnostics, context);
	}
	public boolean validateScopeSpans(ScopeSpans scopeSpans, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scopeSpans, diagnostics, context);
	}
	public boolean validateSpan(Span span, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(span, diagnostics, context);
	}
	public boolean validateSpanEvent(SpanEvent spanEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spanEvent, diagnostics, context);
	}
	public boolean validateSpanLink(SpanLink spanLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spanLink, diagnostics, context);
	}
	public boolean validateSpanStatus(SpanStatus spanStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spanStatus, diagnostics, context);
	}
	public boolean validateMetricsData(MetricsData metricsData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metricsData, diagnostics, context);
	}
	public boolean validateResourceMetrics(ResourceMetrics resourceMetrics, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceMetrics, diagnostics, context);
	}
	public boolean validateScopeMetrics(ScopeMetrics scopeMetrics, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scopeMetrics, diagnostics, context);
	}
	public boolean validateMetric(Metric metric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metric, diagnostics, context);
	}
	public boolean validateGauge(Gauge gauge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gauge, diagnostics, context);
	}
	public boolean validateSum(Sum sum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sum, diagnostics, context);
	}
	public boolean validateHistogram(Histogram histogram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(histogram, diagnostics, context);
	}
	public boolean validateExponentialHistogram(ExponentialHistogram exponentialHistogram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exponentialHistogram, diagnostics, context);
	}
	public boolean validateSummary(Summary summary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(summary, diagnostics, context);
	}
	public boolean validateNumberDataPoint(NumberDataPoint numberDataPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numberDataPoint, diagnostics, context);
	}
	public boolean validateHistogramDataPoint(HistogramDataPoint histogramDataPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(histogramDataPoint, diagnostics, context);
	}
	public boolean validateExponentialHistogramDataPoint(ExponentialHistogramDataPoint exponentialHistogramDataPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exponentialHistogramDataPoint, diagnostics, context);
	}
	public boolean validateExponentialHistogramDataPointBuckets(ExponentialHistogramDataPointBuckets exponentialHistogramDataPointBuckets, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exponentialHistogramDataPointBuckets, diagnostics, context);
	}
	public boolean validateSummaryDataPoint(SummaryDataPoint summaryDataPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(summaryDataPoint, diagnostics, context);
	}
	public boolean validateSummaryDataPointValueAtQuantile(SummaryDataPointValueAtQuantile summaryDataPointValueAtQuantile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(summaryDataPointValueAtQuantile, diagnostics, context);
	}
	public boolean validateExemplar(Exemplar exemplar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exemplar, diagnostics, context);
	}
	public boolean validateLogsData(LogsData logsData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logsData, diagnostics, context);
	}
	public boolean validateResourceLogs(ResourceLogs resourceLogs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceLogs, diagnostics, context);
	}
	public boolean validateScopeLogs(ScopeLogs scopeLogs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scopeLogs, diagnostics, context);
	}
	public boolean validateLogRecord(LogRecord logRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logRecord, diagnostics, context);
	}
	public boolean validateSpanKind(SpanKind spanKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}
	public boolean validateStatusCode(StatusCode statusCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}
	public boolean validateAggregationTemporality(AggregationTemporality aggregationTemporality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}
	public boolean validateSeverityNumber(SeverityNumber severityNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

} //TelemetryValidator
