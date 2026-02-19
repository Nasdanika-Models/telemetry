/**
 */
package org.nasdanika.models.telemetry.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.models.telemetry.*;

/**
 * The <b>Adapter Factory</b> for the model.
 * @see org.nasdanika.models.telemetry.TelemetryPackage
 * @generated
 */
public class TelemetryAdapterFactory extends AdapterFactoryImpl {

	protected static TelemetryPackage modelPackage;

	public TelemetryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TelemetryPackage.eINSTANCE;
		}
	}

	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	protected TelemetrySwitch<Adapter> modelSwitch =
		new TelemetrySwitch<Adapter>() {
			@Override public Adapter caseResource(Resource object) { return createResourceAdapter(); }
			@Override public Adapter caseInstrumentationScope(InstrumentationScope object) { return createInstrumentationScopeAdapter(); }
			@Override public Adapter caseKeyValue(KeyValue object) { return createKeyValueAdapter(); }
			@Override public Adapter caseAnyValue(AnyValue object) { return createAnyValueAdapter(); }
			@Override public Adapter caseTracesData(TracesData object) { return createTracesDataAdapter(); }
			@Override public Adapter caseResourceSpans(ResourceSpans object) { return createResourceSpansAdapter(); }
			@Override public Adapter caseScopeSpans(ScopeSpans object) { return createScopeSpansAdapter(); }
			@Override public Adapter caseSpan(Span object) { return createSpanAdapter(); }
			@Override public Adapter caseSpanEvent(SpanEvent object) { return createSpanEventAdapter(); }
			@Override public Adapter caseSpanLink(SpanLink object) { return createSpanLinkAdapter(); }
			@Override public Adapter caseSpanStatus(SpanStatus object) { return createSpanStatusAdapter(); }
			@Override public Adapter caseMetricsData(MetricsData object) { return createMetricsDataAdapter(); }
			@Override public Adapter caseResourceMetrics(ResourceMetrics object) { return createResourceMetricsAdapter(); }
			@Override public Adapter caseScopeMetrics(ScopeMetrics object) { return createScopeMetricsAdapter(); }
			@Override public Adapter caseMetric(Metric object) { return createMetricAdapter(); }
			@Override public Adapter caseGauge(Gauge object) { return createGaugeAdapter(); }
			@Override public Adapter caseSum(Sum object) { return createSumAdapter(); }
			@Override public Adapter caseHistogram(Histogram object) { return createHistogramAdapter(); }
			@Override public Adapter caseExponentialHistogram(ExponentialHistogram object) { return createExponentialHistogramAdapter(); }
			@Override public Adapter caseSummary(Summary object) { return createSummaryAdapter(); }
			@Override public Adapter caseNumberDataPoint(NumberDataPoint object) { return createNumberDataPointAdapter(); }
			@Override public Adapter caseHistogramDataPoint(HistogramDataPoint object) { return createHistogramDataPointAdapter(); }
			@Override public Adapter caseExponentialHistogramDataPoint(ExponentialHistogramDataPoint object) { return createExponentialHistogramDataPointAdapter(); }
			@Override public Adapter caseExponentialHistogramDataPointBuckets(ExponentialHistogramDataPointBuckets object) { return createExponentialHistogramDataPointBucketsAdapter(); }
			@Override public Adapter caseSummaryDataPoint(SummaryDataPoint object) { return createSummaryDataPointAdapter(); }
			@Override public Adapter caseSummaryDataPointValueAtQuantile(SummaryDataPointValueAtQuantile object) { return createSummaryDataPointValueAtQuantileAdapter(); }
			@Override public Adapter caseExemplar(Exemplar object) { return createExemplarAdapter(); }
			@Override public Adapter caseLogsData(LogsData object) { return createLogsDataAdapter(); }
			@Override public Adapter caseResourceLogs(ResourceLogs object) { return createResourceLogsAdapter(); }
			@Override public Adapter caseScopeLogs(ScopeLogs object) { return createScopeLogsAdapter(); }
			@Override public Adapter caseLogRecord(LogRecord object) { return createLogRecordAdapter(); }
			@Override public Adapter defaultCase(EObject object) { return createEObjectAdapter(); }
		};

	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}

	public Adapter createResourceAdapter() { return null; }
	public Adapter createInstrumentationScopeAdapter() { return null; }
	public Adapter createKeyValueAdapter() { return null; }
	public Adapter createAnyValueAdapter() { return null; }
	public Adapter createTracesDataAdapter() { return null; }
	public Adapter createResourceSpansAdapter() { return null; }
	public Adapter createScopeSpansAdapter() { return null; }
	public Adapter createSpanAdapter() { return null; }
	public Adapter createSpanEventAdapter() { return null; }
	public Adapter createSpanLinkAdapter() { return null; }
	public Adapter createSpanStatusAdapter() { return null; }
	public Adapter createMetricsDataAdapter() { return null; }
	public Adapter createResourceMetricsAdapter() { return null; }
	public Adapter createScopeMetricsAdapter() { return null; }
	public Adapter createMetricAdapter() { return null; }
	public Adapter createGaugeAdapter() { return null; }
	public Adapter createSumAdapter() { return null; }
	public Adapter createHistogramAdapter() { return null; }
	public Adapter createExponentialHistogramAdapter() { return null; }
	public Adapter createSummaryAdapter() { return null; }
	public Adapter createNumberDataPointAdapter() { return null; }
	public Adapter createHistogramDataPointAdapter() { return null; }
	public Adapter createExponentialHistogramDataPointAdapter() { return null; }
	public Adapter createExponentialHistogramDataPointBucketsAdapter() { return null; }
	public Adapter createSummaryDataPointAdapter() { return null; }
	public Adapter createSummaryDataPointValueAtQuantileAdapter() { return null; }
	public Adapter createExemplarAdapter() { return null; }
	public Adapter createLogsDataAdapter() { return null; }
	public Adapter createResourceLogsAdapter() { return null; }
	public Adapter createScopeLogsAdapter() { return null; }
	public Adapter createLogRecordAdapter() { return null; }
	public Adapter createEObjectAdapter() { return null; }

} //TelemetryAdapterFactory
