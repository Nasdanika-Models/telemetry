/**
 */
package org.nasdanika.models.telemetry.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.nasdanika.models.telemetry.*;

/**
 * An implementation of the model <b>Factory</b>.
 * @generated
 */
public class TelemetryFactoryImpl extends EFactoryImpl implements TelemetryFactory {

	public static TelemetryFactory init() {
		try {
			TelemetryFactory theTelemetryFactory = (TelemetryFactory)EPackage.Registry.INSTANCE.getEFactory(TelemetryPackage.eNS_URI);
			if (theTelemetryFactory != null) {
				return theTelemetryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TelemetryFactoryImpl();
	}

	public TelemetryFactoryImpl() {
		super();
	}

	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TelemetryPackage.RESOURCE: return createResource();
			case TelemetryPackage.INSTRUMENTATION_SCOPE: return createInstrumentationScope();
			case TelemetryPackage.KEY_VALUE: return createKeyValue();
			case TelemetryPackage.ANY_VALUE: return createAnyValue();
			case TelemetryPackage.TRACES_DATA: return createTracesData();
			case TelemetryPackage.RESOURCE_SPANS: return createResourceSpans();
			case TelemetryPackage.SCOPE_SPANS: return createScopeSpans();
			case TelemetryPackage.SPAN: return createSpan();
			case TelemetryPackage.SPAN_EVENT: return createSpanEvent();
			case TelemetryPackage.SPAN_LINK: return createSpanLink();
			case TelemetryPackage.SPAN_STATUS: return createSpanStatus();
			case TelemetryPackage.METRICS_DATA: return createMetricsData();
			case TelemetryPackage.RESOURCE_METRICS: return createResourceMetrics();
			case TelemetryPackage.SCOPE_METRICS: return createScopeMetrics();
			case TelemetryPackage.GAUGE: return createGauge();
			case TelemetryPackage.SUM: return createSum();
			case TelemetryPackage.HISTOGRAM: return createHistogram();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM: return createExponentialHistogram();
			case TelemetryPackage.SUMMARY: return createSummary();
			case TelemetryPackage.NUMBER_DATA_POINT: return createNumberDataPoint();
			case TelemetryPackage.HISTOGRAM_DATA_POINT: return createHistogramDataPoint();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT: return createExponentialHistogramDataPoint();
			case TelemetryPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS: return createExponentialHistogramDataPointBuckets();
			case TelemetryPackage.SUMMARY_DATA_POINT: return createSummaryDataPoint();
			case TelemetryPackage.SUMMARY_DATA_POINT_VALUE_AT_QUANTILE: return createSummaryDataPointValueAtQuantile();
			case TelemetryPackage.EXEMPLAR: return createExemplar();
			case TelemetryPackage.LOGS_DATA: return createLogsData();
			case TelemetryPackage.RESOURCE_LOGS: return createResourceLogs();
			case TelemetryPackage.SCOPE_LOGS: return createScopeLogs();
			case TelemetryPackage.LOG_RECORD: return createLogRecord();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	@Override public Resource createResource() { return new ResourceImpl(); }
	@Override public InstrumentationScope createInstrumentationScope() { return new InstrumentationScopeImpl(); }
	@Override public KeyValue createKeyValue() { return new KeyValueImpl(); }
	@Override public AnyValue createAnyValue() { return new AnyValueImpl(); }
	@Override public TracesData createTracesData() { return new TracesDataImpl(); }
	@Override public ResourceSpans createResourceSpans() { return new ResourceSpansImpl(); }
	@Override public ScopeSpans createScopeSpans() { return new ScopeSpansImpl(); }
	@Override public Span createSpan() { return new SpanImpl(); }
	@Override public SpanEvent createSpanEvent() { return new SpanEventImpl(); }
	@Override public SpanLink createSpanLink() { return new SpanLinkImpl(); }
	@Override public SpanStatus createSpanStatus() { return new SpanStatusImpl(); }
	@Override public MetricsData createMetricsData() { return new MetricsDataImpl(); }
	@Override public ResourceMetrics createResourceMetrics() { return new ResourceMetricsImpl(); }
	@Override public ScopeMetrics createScopeMetrics() { return new ScopeMetricsImpl(); }
	@Override public Gauge createGauge() { return new GaugeImpl(); }
	@Override public Sum createSum() { return new SumImpl(); }
	@Override public Histogram createHistogram() { return new HistogramImpl(); }
	@Override public ExponentialHistogram createExponentialHistogram() { return new ExponentialHistogramImpl(); }
	@Override public Summary createSummary() { return new SummaryImpl(); }
	@Override public NumberDataPoint createNumberDataPoint() { return new NumberDataPointImpl(); }
	@Override public HistogramDataPoint createHistogramDataPoint() { return new HistogramDataPointImpl(); }
	@Override public ExponentialHistogramDataPoint createExponentialHistogramDataPoint() { return new ExponentialHistogramDataPointImpl(); }
	@Override public ExponentialHistogramDataPointBuckets createExponentialHistogramDataPointBuckets() { return new ExponentialHistogramDataPointBucketsImpl(); }
	@Override public SummaryDataPoint createSummaryDataPoint() { return new SummaryDataPointImpl(); }
	@Override public SummaryDataPointValueAtQuantile createSummaryDataPointValueAtQuantile() { return new SummaryDataPointValueAtQuantileImpl(); }
	@Override public Exemplar createExemplar() { return new ExemplarImpl(); }
	@Override public LogsData createLogsData() { return new LogsDataImpl(); }
	@Override public ResourceLogs createResourceLogs() { return new ResourceLogsImpl(); }
	@Override public ScopeLogs createScopeLogs() { return new ScopeLogsImpl(); }
	@Override public LogRecord createLogRecord() { return new LogRecordImpl(); }

	@Override
	public TelemetryPackage getTelemetryPackage() {
		return (TelemetryPackage)getEPackage();
	}

	@Deprecated
	public static TelemetryPackage getPackage() {
		return TelemetryPackage.eINSTANCE;
	}

} //TelemetryFactoryImpl
