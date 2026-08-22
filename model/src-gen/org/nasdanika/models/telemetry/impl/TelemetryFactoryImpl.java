/**
 */
package org.nasdanika.models.telemetry.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.telemetry.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TelemetryFactoryImpl extends EFactoryImpl implements TelemetryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelemetryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TelemetryPackage.SPAN_KIND:
				return createSpanKindFromString(eDataType, initialValue);
			case TelemetryPackage.STATUS_CODE:
				return createStatusCodeFromString(eDataType, initialValue);
			case TelemetryPackage.AGGREGATION_TEMPORALITY:
				return createAggregationTemporalityFromString(eDataType, initialValue);
			case TelemetryPackage.SEVERITY_NUMBER:
				return createSeverityNumberFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TelemetryPackage.SPAN_KIND:
				return convertSpanKindToString(eDataType, instanceValue);
			case TelemetryPackage.STATUS_CODE:
				return convertStatusCodeToString(eDataType, instanceValue);
			case TelemetryPackage.AGGREGATION_TEMPORALITY:
				return convertAggregationTemporalityToString(eDataType, instanceValue);
			case TelemetryPackage.SEVERITY_NUMBER:
				return convertSeverityNumberToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstrumentationScope createInstrumentationScope() {
		InstrumentationScopeImpl instrumentationScope = new InstrumentationScopeImpl();
		return instrumentationScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyValue createKeyValue() {
		KeyValueImpl keyValue = new KeyValueImpl();
		return keyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnyValue createAnyValue() {
		AnyValueImpl anyValue = new AnyValueImpl();
		return anyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TracesData createTracesData() {
		TracesDataImpl tracesData = new TracesDataImpl();
		return tracesData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceSpans createResourceSpans() {
		ResourceSpansImpl resourceSpans = new ResourceSpansImpl();
		return resourceSpans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScopeSpans createScopeSpans() {
		ScopeSpansImpl scopeSpans = new ScopeSpansImpl();
		return scopeSpans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Span createSpan() {
		SpanImpl span = new SpanImpl();
		return span;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpanEvent createSpanEvent() {
		SpanEventImpl spanEvent = new SpanEventImpl();
		return spanEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpanLink createSpanLink() {
		SpanLinkImpl spanLink = new SpanLinkImpl();
		return spanLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpanStatus createSpanStatus() {
		SpanStatusImpl spanStatus = new SpanStatusImpl();
		return spanStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetricsData createMetricsData() {
		MetricsDataImpl metricsData = new MetricsDataImpl();
		return metricsData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceMetrics createResourceMetrics() {
		ResourceMetricsImpl resourceMetrics = new ResourceMetricsImpl();
		return resourceMetrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScopeMetrics createScopeMetrics() {
		ScopeMetricsImpl scopeMetrics = new ScopeMetricsImpl();
		return scopeMetrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gauge createGauge() {
		GaugeImpl gauge = new GaugeImpl();
		return gauge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sum createSum() {
		SumImpl sum = new SumImpl();
		return sum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Histogram createHistogram() {
		HistogramImpl histogram = new HistogramImpl();
		return histogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExponentialHistogram createExponentialHistogram() {
		ExponentialHistogramImpl exponentialHistogram = new ExponentialHistogramImpl();
		return exponentialHistogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Summary createSummary() {
		SummaryImpl summary = new SummaryImpl();
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberDataPoint createNumberDataPoint() {
		NumberDataPointImpl numberDataPoint = new NumberDataPointImpl();
		return numberDataPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistogramDataPoint createHistogramDataPoint() {
		HistogramDataPointImpl histogramDataPoint = new HistogramDataPointImpl();
		return histogramDataPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExponentialHistogramDataPoint createExponentialHistogramDataPoint() {
		ExponentialHistogramDataPointImpl exponentialHistogramDataPoint = new ExponentialHistogramDataPointImpl();
		return exponentialHistogramDataPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExponentialHistogramDataPointBuckets createExponentialHistogramDataPointBuckets() {
		ExponentialHistogramDataPointBucketsImpl exponentialHistogramDataPointBuckets = new ExponentialHistogramDataPointBucketsImpl();
		return exponentialHistogramDataPointBuckets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SummaryDataPoint createSummaryDataPoint() {
		SummaryDataPointImpl summaryDataPoint = new SummaryDataPointImpl();
		return summaryDataPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SummaryDataPointValueAtQuantile createSummaryDataPointValueAtQuantile() {
		SummaryDataPointValueAtQuantileImpl summaryDataPointValueAtQuantile = new SummaryDataPointValueAtQuantileImpl();
		return summaryDataPointValueAtQuantile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Exemplar createExemplar() {
		ExemplarImpl exemplar = new ExemplarImpl();
		return exemplar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogsData createLogsData() {
		LogsDataImpl logsData = new LogsDataImpl();
		return logsData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLogs createResourceLogs() {
		ResourceLogsImpl resourceLogs = new ResourceLogsImpl();
		return resourceLogs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScopeLogs createScopeLogs() {
		ScopeLogsImpl scopeLogs = new ScopeLogsImpl();
		return scopeLogs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogRecord createLogRecord() {
		LogRecordImpl logRecord = new LogRecordImpl();
		return logRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpanKind createSpanKindFromString(EDataType eDataType, String initialValue) {
		SpanKind result = SpanKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpanKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusCode createStatusCodeFromString(EDataType eDataType, String initialValue) {
		StatusCode result = StatusCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationTemporality createAggregationTemporalityFromString(EDataType eDataType, String initialValue) {
		AggregationTemporality result = AggregationTemporality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationTemporalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityNumber createSeverityNumberFromString(EDataType eDataType, String initialValue) {
		SeverityNumber result = SeverityNumber.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeverityNumberToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TelemetryPackage getTelemetryPackage() {
		return (TelemetryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TelemetryPackage getPackage() {
		return TelemetryPackage.eINSTANCE;
	}

} //TelemetryFactoryImpl
