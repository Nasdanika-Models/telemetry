/**
 */
package org.nasdanika.models.telemetry.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.nasdanika.models.telemetry.*;

/**
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * @see org.nasdanika.models.telemetry.TelemetryPackage
 * @generated
 */
public class TelemetrySwitch<T1> extends Switch<T1> {

	protected static TelemetryPackage modelPackage;

	public TelemetrySwitch() {
		if (modelPackage == null) {
			modelPackage = TelemetryPackage.eINSTANCE;
		}
	}

	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TelemetryPackage.RESOURCE: {
				Resource obj = (Resource)theEObject;
				T1 result = caseResource(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.INSTRUMENTATION_SCOPE: {
				InstrumentationScope obj = (InstrumentationScope)theEObject;
				T1 result = caseInstrumentationScope(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.KEY_VALUE: {
				KeyValue obj = (KeyValue)theEObject;
				T1 result = caseKeyValue(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.ANY_VALUE: {
				AnyValue obj = (AnyValue)theEObject;
				T1 result = caseAnyValue(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.TRACES_DATA: {
				TracesData obj = (TracesData)theEObject;
				T1 result = caseTracesData(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.RESOURCE_SPANS: {
				ResourceSpans obj = (ResourceSpans)theEObject;
				T1 result = caseResourceSpans(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.SCOPE_SPANS: {
				ScopeSpans obj = (ScopeSpans)theEObject;
				T1 result = caseScopeSpans(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.SPAN: {
				Span obj = (Span)theEObject;
				T1 result = caseSpan(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.SPAN_EVENT: {
				SpanEvent obj = (SpanEvent)theEObject;
				T1 result = caseSpanEvent(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.SPAN_LINK: {
				SpanLink obj = (SpanLink)theEObject;
				T1 result = caseSpanLink(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.SPAN_STATUS: {
				SpanStatus obj = (SpanStatus)theEObject;
				T1 result = caseSpanStatus(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.METRICS_DATA: {
				MetricsData obj = (MetricsData)theEObject;
				T1 result = caseMetricsData(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.RESOURCE_METRICS: {
				ResourceMetrics obj = (ResourceMetrics)theEObject;
				T1 result = caseResourceMetrics(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.SCOPE_METRICS: {
				ScopeMetrics obj = (ScopeMetrics)theEObject;
				T1 result = caseScopeMetrics(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.METRIC: {
				Metric obj = (Metric)theEObject;
				T1 result = caseMetric(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.GAUGE: {
				Gauge obj = (Gauge)theEObject;
				T1 result = caseGauge(obj);
				if (result == null) result = caseMetric(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.SUM: {
				Sum obj = (Sum)theEObject;
				T1 result = caseSum(obj);
				if (result == null) result = caseMetric(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.HISTOGRAM: {
				Histogram obj = (Histogram)theEObject;
				T1 result = caseHistogram(obj);
				if (result == null) result = caseMetric(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM: {
				ExponentialHistogram obj = (ExponentialHistogram)theEObject;
				T1 result = caseExponentialHistogram(obj);
				if (result == null) result = caseMetric(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.SUMMARY: {
				Summary obj = (Summary)theEObject;
				T1 result = caseSummary(obj);
				if (result == null) result = caseMetric(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.NUMBER_DATA_POINT: {
				NumberDataPoint obj = (NumberDataPoint)theEObject;
				T1 result = caseNumberDataPoint(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.HISTOGRAM_DATA_POINT: {
				HistogramDataPoint obj = (HistogramDataPoint)theEObject;
				T1 result = caseHistogramDataPoint(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT: {
				ExponentialHistogramDataPoint obj = (ExponentialHistogramDataPoint)theEObject;
				T1 result = caseExponentialHistogramDataPoint(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS: {
				ExponentialHistogramDataPointBuckets obj = (ExponentialHistogramDataPointBuckets)theEObject;
				T1 result = caseExponentialHistogramDataPointBuckets(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.SUMMARY_DATA_POINT: {
				SummaryDataPoint obj = (SummaryDataPoint)theEObject;
				T1 result = caseSummaryDataPoint(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.SUMMARY_DATA_POINT_VALUE_AT_QUANTILE: {
				SummaryDataPointValueAtQuantile obj = (SummaryDataPointValueAtQuantile)theEObject;
				T1 result = caseSummaryDataPointValueAtQuantile(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.EXEMPLAR: {
				Exemplar obj = (Exemplar)theEObject;
				T1 result = caseExemplar(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.LOGS_DATA: {
				LogsData obj = (LogsData)theEObject;
				T1 result = caseLogsData(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.RESOURCE_LOGS: {
				ResourceLogs obj = (ResourceLogs)theEObject;
				T1 result = caseResourceLogs(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.SCOPE_LOGS: {
				ScopeLogs obj = (ScopeLogs)theEObject;
				T1 result = caseScopeLogs(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelemetryPackage.LOG_RECORD: {
				LogRecord obj = (LogRecord)theEObject;
				T1 result = caseLogRecord(obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	public T1 caseResource(Resource object) { return null; }
	public T1 caseInstrumentationScope(InstrumentationScope object) { return null; }
	public T1 caseKeyValue(KeyValue object) { return null; }
	public T1 caseAnyValue(AnyValue object) { return null; }
	public T1 caseTracesData(TracesData object) { return null; }
	public T1 caseResourceSpans(ResourceSpans object) { return null; }
	public T1 caseScopeSpans(ScopeSpans object) { return null; }
	public T1 caseSpan(Span object) { return null; }
	public T1 caseSpanEvent(SpanEvent object) { return null; }
	public T1 caseSpanLink(SpanLink object) { return null; }
	public T1 caseSpanStatus(SpanStatus object) { return null; }
	public T1 caseMetricsData(MetricsData object) { return null; }
	public T1 caseResourceMetrics(ResourceMetrics object) { return null; }
	public T1 caseScopeMetrics(ScopeMetrics object) { return null; }
	public T1 caseMetric(Metric object) { return null; }
	public T1 caseGauge(Gauge object) { return null; }
	public T1 caseSum(Sum object) { return null; }
	public T1 caseHistogram(Histogram object) { return null; }
	public T1 caseExponentialHistogram(ExponentialHistogram object) { return null; }
	public T1 caseSummary(Summary object) { return null; }
	public T1 caseNumberDataPoint(NumberDataPoint object) { return null; }
	public T1 caseHistogramDataPoint(HistogramDataPoint object) { return null; }
	public T1 caseExponentialHistogramDataPoint(ExponentialHistogramDataPoint object) { return null; }
	public T1 caseExponentialHistogramDataPointBuckets(ExponentialHistogramDataPointBuckets object) { return null; }
	public T1 caseSummaryDataPoint(SummaryDataPoint object) { return null; }
	public T1 caseSummaryDataPointValueAtQuantile(SummaryDataPointValueAtQuantile object) { return null; }
	public T1 caseExemplar(Exemplar object) { return null; }
	public T1 caseLogsData(LogsData object) { return null; }
	public T1 caseResourceLogs(ResourceLogs object) { return null; }
	public T1 caseScopeLogs(ScopeLogs object) { return null; }
	public T1 caseLogRecord(LogRecord object) { return null; }

	@Override
	public T1 defaultCase(EObject object) { return null; }

} //TelemetrySwitch
