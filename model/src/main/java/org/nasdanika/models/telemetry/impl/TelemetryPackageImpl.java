/**
 */
package org.nasdanika.models.telemetry.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.nasdanika.models.telemetry.AggregationTemporality;
import org.nasdanika.models.telemetry.AnyValue;
import org.nasdanika.models.telemetry.Exemplar;
import org.nasdanika.models.telemetry.ExponentialHistogram;
import org.nasdanika.models.telemetry.ExponentialHistogramDataPoint;
import org.nasdanika.models.telemetry.ExponentialHistogramDataPointBuckets;
import org.nasdanika.models.telemetry.Gauge;
import org.nasdanika.models.telemetry.Histogram;
import org.nasdanika.models.telemetry.HistogramDataPoint;
import org.nasdanika.models.telemetry.InstrumentationScope;
import org.nasdanika.models.telemetry.KeyValue;
import org.nasdanika.models.telemetry.LogRecord;
import org.nasdanika.models.telemetry.LogsData;
import org.nasdanika.models.telemetry.Metric;
import org.nasdanika.models.telemetry.MetricsData;
import org.nasdanika.models.telemetry.NumberDataPoint;
import org.nasdanika.models.telemetry.Resource;
import org.nasdanika.models.telemetry.ResourceLogs;
import org.nasdanika.models.telemetry.ResourceMetrics;
import org.nasdanika.models.telemetry.ResourceSpans;
import org.nasdanika.models.telemetry.ScopeLogs;
import org.nasdanika.models.telemetry.ScopeMetrics;
import org.nasdanika.models.telemetry.ScopeSpans;
import org.nasdanika.models.telemetry.SeverityNumber;
import org.nasdanika.models.telemetry.Span;
import org.nasdanika.models.telemetry.SpanEvent;
import org.nasdanika.models.telemetry.SpanKind;
import org.nasdanika.models.telemetry.SpanLink;
import org.nasdanika.models.telemetry.SpanStatus;
import org.nasdanika.models.telemetry.StatusCode;
import org.nasdanika.models.telemetry.Sum;
import org.nasdanika.models.telemetry.Summary;
import org.nasdanika.models.telemetry.SummaryDataPoint;
import org.nasdanika.models.telemetry.SummaryDataPointValueAtQuantile;
import org.nasdanika.models.telemetry.TelemetryFactory;
import org.nasdanika.models.telemetry.TelemetryPackage;
import org.nasdanika.models.telemetry.TracesData;
import org.nasdanika.models.telemetry.util.TelemetryValidator;

/**
 * An implementation of the model <b>Package</b>.
 * @generated
 */
public class TelemetryPackageImpl extends EPackageImpl implements TelemetryPackage {

	private EClass resourceEClass = null;
	private EClass instrumentationScopeEClass = null;
	private EClass keyValueEClass = null;
	private EClass anyValueEClass = null;
	private EClass tracesDataEClass = null;
	private EClass resourceSpansEClass = null;
	private EClass scopeSpansEClass = null;
	private EClass spanEClass = null;
	private EClass spanEventEClass = null;
	private EClass spanLinkEClass = null;
	private EClass spanStatusEClass = null;
	private EClass metricsDataEClass = null;
	private EClass resourceMetricsEClass = null;
	private EClass scopeMetricsEClass = null;
	private EClass metricEClass = null;
	private EClass gaugeEClass = null;
	private EClass sumEClass = null;
	private EClass histogramEClass = null;
	private EClass exponentialHistogramEClass = null;
	private EClass summaryEClass = null;
	private EClass numberDataPointEClass = null;
	private EClass histogramDataPointEClass = null;
	private EClass exponentialHistogramDataPointEClass = null;
	private EClass exponentialHistogramDataPointBucketsEClass = null;
	private EClass summaryDataPointEClass = null;
	private EClass summaryDataPointValueAtQuantileEClass = null;
	private EClass exemplarEClass = null;
	private EClass logsDataEClass = null;
	private EClass resourceLogsEClass = null;
	private EClass scopeLogsEClass = null;
	private EClass logRecordEClass = null;
	private EEnum spanKindEEnum = null;
	private EEnum statusCodeEEnum = null;
	private EEnum aggregationTemporalityEEnum = null;
	private EEnum severityNumberEEnum = null;

	private TelemetryPackageImpl() {
		super(eNS_URI, TelemetryFactory.eINSTANCE);
	}

	private static boolean isInited = false;

	public static TelemetryPackage init() {
		if (isInited) return (TelemetryPackage)EPackage.Registry.INSTANCE.getEPackage(TelemetryPackage.eNS_URI);

		Object registeredTelemetryPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TelemetryPackageImpl theTelemetryPackage = registeredTelemetryPackage instanceof TelemetryPackageImpl ? (TelemetryPackageImpl)registeredTelemetryPackage : new TelemetryPackageImpl();

		isInited = true;

		theTelemetryPackage.createPackageContents();
		theTelemetryPackage.initializePackageContents();

		EValidator.Registry.INSTANCE.put(theTelemetryPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return TelemetryValidator.INSTANCE;
			}
		});

		theTelemetryPackage.freeze();
		EPackage.Registry.INSTANCE.put(TelemetryPackage.eNS_URI, theTelemetryPackage);
		return theTelemetryPackage;
	}

	// EClass getters
	@Override public EClass getResource() { return resourceEClass; }
	@Override public EReference getResource_Attributes() { return (EReference)resourceEClass.getEStructuralFeatures().get(0); }
	@Override public EAttribute getResource_DroppedAttributesCount() { return (EAttribute)resourceEClass.getEStructuralFeatures().get(1); }
	@Override public EAttribute getResource_SchemaUrl() { return (EAttribute)resourceEClass.getEStructuralFeatures().get(2); }

	@Override public EClass getInstrumentationScope() { return instrumentationScopeEClass; }
	@Override public EAttribute getInstrumentationScope_Name() { return (EAttribute)instrumentationScopeEClass.getEStructuralFeatures().get(0); }
	@Override public EAttribute getInstrumentationScope_Version() { return (EAttribute)instrumentationScopeEClass.getEStructuralFeatures().get(1); }
	@Override public EReference getInstrumentationScope_Attributes() { return (EReference)instrumentationScopeEClass.getEStructuralFeatures().get(2); }
	@Override public EAttribute getInstrumentationScope_DroppedAttributesCount() { return (EAttribute)instrumentationScopeEClass.getEStructuralFeatures().get(3); }
	@Override public EAttribute getInstrumentationScope_SchemaUrl() { return (EAttribute)instrumentationScopeEClass.getEStructuralFeatures().get(4); }

	@Override public EClass getKeyValue() { return keyValueEClass; }
	@Override public EAttribute getKeyValue_Key() { return (EAttribute)keyValueEClass.getEStructuralFeatures().get(0); }
	@Override public EReference getKeyValue_Value() { return (EReference)keyValueEClass.getEStructuralFeatures().get(1); }

	@Override public EClass getAnyValue() { return anyValueEClass; }
	@Override public EAttribute getAnyValue_StringValue() { return (EAttribute)anyValueEClass.getEStructuralFeatures().get(0); }
	@Override public EAttribute getAnyValue_BoolValue() { return (EAttribute)anyValueEClass.getEStructuralFeatures().get(1); }
	@Override public EAttribute getAnyValue_IntValue() { return (EAttribute)anyValueEClass.getEStructuralFeatures().get(2); }
	@Override public EAttribute getAnyValue_DoubleValue() { return (EAttribute)anyValueEClass.getEStructuralFeatures().get(3); }
	@Override public EReference getAnyValue_ArrayValue() { return (EReference)anyValueEClass.getEStructuralFeatures().get(4); }
	@Override public EReference getAnyValue_KvlistValue() { return (EReference)anyValueEClass.getEStructuralFeatures().get(5); }
	@Override public EAttribute getAnyValue_BytesValue() { return (EAttribute)anyValueEClass.getEStructuralFeatures().get(6); }

	@Override public EClass getTracesData() { return tracesDataEClass; }
	@Override public EReference getTracesData_ResourceSpans() { return (EReference)tracesDataEClass.getEStructuralFeatures().get(0); }

	@Override public EClass getResourceSpans() { return resourceSpansEClass; }
	@Override public EReference getResourceSpans_Resource() { return (EReference)resourceSpansEClass.getEStructuralFeatures().get(0); }
	@Override public EReference getResourceSpans_ScopeSpans() { return (EReference)resourceSpansEClass.getEStructuralFeatures().get(1); }
	@Override public EAttribute getResourceSpans_SchemaUrl() { return (EAttribute)resourceSpansEClass.getEStructuralFeatures().get(2); }

	@Override public EClass getScopeSpans() { return scopeSpansEClass; }
	@Override public EReference getScopeSpans_Scope() { return (EReference)scopeSpansEClass.getEStructuralFeatures().get(0); }
	@Override public EReference getScopeSpans_Spans() { return (EReference)scopeSpansEClass.getEStructuralFeatures().get(1); }
	@Override public EAttribute getScopeSpans_SchemaUrl() { return (EAttribute)scopeSpansEClass.getEStructuralFeatures().get(2); }

	@Override public EClass getSpan() { return spanEClass; }
	@Override public EAttribute getSpan_TraceId() { return (EAttribute)spanEClass.getEStructuralFeatures().get(0); }
	@Override public EAttribute getSpan_SpanId() { return (EAttribute)spanEClass.getEStructuralFeatures().get(1); }
	@Override public EAttribute getSpan_TraceState() { return (EAttribute)spanEClass.getEStructuralFeatures().get(2); }
	@Override public EAttribute getSpan_ParentSpanId() { return (EAttribute)spanEClass.getEStructuralFeatures().get(3); }
	@Override public EAttribute getSpan_Name() { return (EAttribute)spanEClass.getEStructuralFeatures().get(4); }
	@Override public EAttribute getSpan_Kind() { return (EAttribute)spanEClass.getEStructuralFeatures().get(5); }
	@Override public EAttribute getSpan_StartTimeUnixNano() { return (EAttribute)spanEClass.getEStructuralFeatures().get(6); }
	@Override public EAttribute getSpan_EndTimeUnixNano() { return (EAttribute)spanEClass.getEStructuralFeatures().get(7); }
	@Override public EReference getSpan_Attributes() { return (EReference)spanEClass.getEStructuralFeatures().get(8); }
	@Override public EAttribute getSpan_DroppedAttributesCount() { return (EAttribute)spanEClass.getEStructuralFeatures().get(9); }
	@Override public EReference getSpan_Events() { return (EReference)spanEClass.getEStructuralFeatures().get(10); }
	@Override public EAttribute getSpan_DroppedEventsCount() { return (EAttribute)spanEClass.getEStructuralFeatures().get(11); }
	@Override public EReference getSpan_Links() { return (EReference)spanEClass.getEStructuralFeatures().get(12); }
	@Override public EAttribute getSpan_DroppedLinksCount() { return (EAttribute)spanEClass.getEStructuralFeatures().get(13); }
	@Override public EReference getSpan_Status() { return (EReference)spanEClass.getEStructuralFeatures().get(14); }
	@Override public EAttribute getSpan_Flags() { return (EAttribute)spanEClass.getEStructuralFeatures().get(15); }

	@Override public EClass getSpanEvent() { return spanEventEClass; }
	@Override public EAttribute getSpanEvent_TimeUnixNano() { return (EAttribute)spanEventEClass.getEStructuralFeatures().get(0); }
	@Override public EAttribute getSpanEvent_Name() { return (EAttribute)spanEventEClass.getEStructuralFeatures().get(1); }
	@Override public EReference getSpanEvent_Attributes() { return (EReference)spanEventEClass.getEStructuralFeatures().get(2); }
	@Override public EAttribute getSpanEvent_DroppedAttributesCount() { return (EAttribute)spanEventEClass.getEStructuralFeatures().get(3); }

	@Override public EClass getSpanLink() { return spanLinkEClass; }
	@Override public EAttribute getSpanLink_TraceId() { return (EAttribute)spanLinkEClass.getEStructuralFeatures().get(0); }
	@Override public EAttribute getSpanLink_SpanId() { return (EAttribute)spanLinkEClass.getEStructuralFeatures().get(1); }
	@Override public EAttribute getSpanLink_TraceState() { return (EAttribute)spanLinkEClass.getEStructuralFeatures().get(2); }
	@Override public EReference getSpanLink_Attributes() { return (EReference)spanLinkEClass.getEStructuralFeatures().get(3); }
	@Override public EAttribute getSpanLink_DroppedAttributesCount() { return (EAttribute)spanLinkEClass.getEStructuralFeatures().get(4); }
	@Override public EAttribute getSpanLink_Flags() { return (EAttribute)spanLinkEClass.getEStructuralFeatures().get(5); }

	@Override public EClass getSpanStatus() { return spanStatusEClass; }
	@Override public EAttribute getSpanStatus_Message() { return (EAttribute)spanStatusEClass.getEStructuralFeatures().get(0); }
	@Override public EAttribute getSpanStatus_Code() { return (EAttribute)spanStatusEClass.getEStructuralFeatures().get(1); }

	@Override public EClass getMetricsData() { return metricsDataEClass; }
	@Override public EReference getMetricsData_ResourceMetrics() { return (EReference)metricsDataEClass.getEStructuralFeatures().get(0); }

	@Override public EClass getResourceMetrics() { return resourceMetricsEClass; }
	@Override public EReference getResourceMetrics_Resource() { return (EReference)resourceMetricsEClass.getEStructuralFeatures().get(0); }
	@Override public EReference getResourceMetrics_ScopeMetrics() { return (EReference)resourceMetricsEClass.getEStructuralFeatures().get(1); }
	@Override public EAttribute getResourceMetrics_SchemaUrl() { return (EAttribute)resourceMetricsEClass.getEStructuralFeatures().get(2); }

	@Override public EClass getScopeMetrics() { return scopeMetricsEClass; }
	@Override public EReference getScopeMetrics_Scope() { return (EReference)scopeMetricsEClass.getEStructuralFeatures().get(0); }
	@Override public EReference getScopeMetrics_Metrics() { return (EReference)scopeMetricsEClass.getEStructuralFeatures().get(1); }
	@Override public EAttribute getScopeMetrics_SchemaUrl() { return (EAttribute)scopeMetricsEClass.getEStructuralFeatures().get(2); }

	@Override public EClass getMetric() { return metricEClass; }
	@Override public EAttribute getMetric_Name() { return (EAttribute)metricEClass.getEStructuralFeatures().get(0); }
	@Override public EAttribute getMetric_Description() { return (EAttribute)metricEClass.getEStructuralFeatures().get(1); }
	@Override public EAttribute getMetric_Unit() { return (EAttribute)metricEClass.getEStructuralFeatures().get(2); }
	@Override public EReference getMetric_Metadata() { return (EReference)metricEClass.getEStructuralFeatures().get(3); }

	@Override public EClass getGauge() { return gaugeEClass; }
	@Override public EReference getGauge_DataPoints() { return (EReference)gaugeEClass.getEStructuralFeatures().get(0); }

	@Override public EClass getSum() { return sumEClass; }
	@Override public EReference getSum_DataPoints() { return (EReference)sumEClass.getEStructuralFeatures().get(0); }
	@Override public EAttribute getSum_AggregationTemporality() { return (EAttribute)sumEClass.getEStructuralFeatures().get(1); }
	@Override public EAttribute getSum_IsMonotonic() { return (EAttribute)sumEClass.getEStructuralFeatures().get(2); }

	@Override public EClass getHistogram() { return histogramEClass; }
	@Override public EReference getHistogram_DataPoints() { return (EReference)histogramEClass.getEStructuralFeatures().get(0); }
	@Override public EAttribute getHistogram_AggregationTemporality() { return (EAttribute)histogramEClass.getEStructuralFeatures().get(1); }

	@Override public EClass getExponentialHistogram() { return exponentialHistogramEClass; }
	@Override public EReference getExponentialHistogram_DataPoints() { return (EReference)exponentialHistogramEClass.getEStructuralFeatures().get(0); }
	@Override public EAttribute getExponentialHistogram_AggregationTemporality() { return (EAttribute)exponentialHistogramEClass.getEStructuralFeatures().get(1); }

	@Override public EClass getSummary() { return summaryEClass; }
	@Override public EReference getSummary_DataPoints() { return (EReference)summaryEClass.getEStructuralFeatures().get(0); }

	@Override public EClass getNumberDataPoint() { return numberDataPointEClass; }
	@Override public EReference getNumberDataPoint_Attributes() { return (EReference)numberDataPointEClass.getEStructuralFeatures().get(0); }
	@Override public EAttribute getNumberDataPoint_StartTimeUnixNano() { return (EAttribute)numberDataPointEClass.getEStructuralFeatures().get(1); }
	@Override public EAttribute getNumberDataPoint_TimeUnixNano() { return (EAttribute)numberDataPointEClass.getEStructuralFeatures().get(2); }
	@Override public EAttribute getNumberDataPoint_AsDouble() { return (EAttribute)numberDataPointEClass.getEStructuralFeatures().get(3); }
	@Override public EAttribute getNumberDataPoint_AsInt() { return (EAttribute)numberDataPointEClass.getEStructuralFeatures().get(4); }
	@Override public EReference getNumberDataPoint_Exemplars() { return (EReference)numberDataPointEClass.getEStructuralFeatures().get(5); }
	@Override public EAttribute getNumberDataPoint_Flags() { return (EAttribute)numberDataPointEClass.getEStructuralFeatures().get(6); }

	@Override public EClass getHistogramDataPoint() { return histogramDataPointEClass; }
	@Override public EReference getHistogramDataPoint_Attributes() { return (EReference)histogramDataPointEClass.getEStructuralFeatures().get(0); }
	@Override public EAttribute getHistogramDataPoint_StartTimeUnixNano() { return (EAttribute)histogramDataPointEClass.getEStructuralFeatures().get(1); }
	@Override public EAttribute getHistogramDataPoint_TimeUnixNano() { return (EAttribute)histogramDataPointEClass.getEStructuralFeatures().get(2); }
	@Override public EAttribute getHistogramDataPoint_Count() { return (EAttribute)histogramDataPointEClass.getEStructuralFeatures().get(3); }
	@Override public EAttribute getHistogramDataPoint_Sum() { return (EAttribute)histogramDataPointEClass.getEStructuralFeatures().get(4); }
	@Override public EAttribute getHistogramDataPoint_BucketCounts() { return (EAttribute)histogramDataPointEClass.getEStructuralFeatures().get(5); }
	@Override public EAttribute getHistogramDataPoint_ExplicitBounds() { return (EAttribute)histogramDataPointEClass.getEStructuralFeatures().get(6); }
	@Override public EReference getHistogramDataPoint_Exemplars() { return (EReference)histogramDataPointEClass.getEStructuralFeatures().get(7); }
	@Override public EAttribute getHistogramDataPoint_Flags() { return (EAttribute)histogramDataPointEClass.getEStructuralFeatures().get(8); }
	@Override public EAttribute getHistogramDataPoint_Min() { return (EAttribute)histogramDataPointEClass.getEStructuralFeatures().get(9); }
	@Override public EAttribute getHistogramDataPoint_Max() { return (EAttribute)histogramDataPointEClass.getEStructuralFeatures().get(10); }

	@Override public EClass getExponentialHistogramDataPoint() { return exponentialHistogramDataPointEClass; }
	@Override public EReference getExponentialHistogramDataPoint_Attributes() { return (EReference)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(0); }
	@Override public EAttribute getExponentialHistogramDataPoint_StartTimeUnixNano() { return (EAttribute)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(1); }
	@Override public EAttribute getExponentialHistogramDataPoint_TimeUnixNano() { return (EAttribute)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(2); }
	@Override public EAttribute getExponentialHistogramDataPoint_Count() { return (EAttribute)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(3); }
	@Override public EAttribute getExponentialHistogramDataPoint_Sum() { return (EAttribute)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(4); }
	@Override public EAttribute getExponentialHistogramDataPoint_Scale() { return (EAttribute)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(5); }
	@Override public EAttribute getExponentialHistogramDataPoint_ZeroCount() { return (EAttribute)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(6); }
	@Override public EReference getExponentialHistogramDataPoint_Positive() { return (EReference)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(7); }
	@Override public EReference getExponentialHistogramDataPoint_Negative() { return (EReference)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(8); }
	@Override public EAttribute getExponentialHistogramDataPoint_Flags() { return (EAttribute)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(9); }
	@Override public EReference getExponentialHistogramDataPoint_Exemplars() { return (EReference)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(10); }
	@Override public EAttribute getExponentialHistogramDataPoint_Min() { return (EAttribute)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(11); }
	@Override public EAttribute getExponentialHistogramDataPoint_Max() { return (EAttribute)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(12); }
	@Override public EAttribute getExponentialHistogramDataPoint_ZeroThreshold() { return (EAttribute)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(13); }

	@Override public EClass getExponentialHistogramDataPointBuckets() { return exponentialHistogramDataPointBucketsEClass; }
	@Override public EAttribute getExponentialHistogramDataPointBuckets_Offset() { return (EAttribute)exponentialHistogramDataPointBucketsEClass.getEStructuralFeatures().get(0); }
	@Override public EAttribute getExponentialHistogramDataPointBuckets_BucketCounts() { return (EAttribute)exponentialHistogramDataPointBucketsEClass.getEStructuralFeatures().get(1); }

	@Override public EClass getSummaryDataPoint() { return summaryDataPointEClass; }
	@Override public EReference getSummaryDataPoint_Attributes() { return (EReference)summaryDataPointEClass.getEStructuralFeatures().get(0); }
	@Override public EAttribute getSummaryDataPoint_StartTimeUnixNano() { return (EAttribute)summaryDataPointEClass.getEStructuralFeatures().get(1); }
	@Override public EAttribute getSummaryDataPoint_TimeUnixNano() { return (EAttribute)summaryDataPointEClass.getEStructuralFeatures().get(2); }
	@Override public EAttribute getSummaryDataPoint_Count() { return (EAttribute)summaryDataPointEClass.getEStructuralFeatures().get(3); }
	@Override public EAttribute getSummaryDataPoint_Sum() { return (EAttribute)summaryDataPointEClass.getEStructuralFeatures().get(4); }
	@Override public EReference getSummaryDataPoint_QuantileValues() { return (EReference)summaryDataPointEClass.getEStructuralFeatures().get(5); }
	@Override public EAttribute getSummaryDataPoint_Flags() { return (EAttribute)summaryDataPointEClass.getEStructuralFeatures().get(6); }

	@Override public EClass getSummaryDataPointValueAtQuantile() { return summaryDataPointValueAtQuantileEClass; }
	@Override public EAttribute getSummaryDataPointValueAtQuantile_Quantile() { return (EAttribute)summaryDataPointValueAtQuantileEClass.getEStructuralFeatures().get(0); }
	@Override public EAttribute getSummaryDataPointValueAtQuantile_Value() { return (EAttribute)summaryDataPointValueAtQuantileEClass.getEStructuralFeatures().get(1); }

	@Override public EClass getExemplar() { return exemplarEClass; }
	@Override public EReference getExemplar_FilteredAttributes() { return (EReference)exemplarEClass.getEStructuralFeatures().get(0); }
	@Override public EAttribute getExemplar_TimeUnixNano() { return (EAttribute)exemplarEClass.getEStructuralFeatures().get(1); }
	@Override public EAttribute getExemplar_AsDouble() { return (EAttribute)exemplarEClass.getEStructuralFeatures().get(2); }
	@Override public EAttribute getExemplar_AsInt() { return (EAttribute)exemplarEClass.getEStructuralFeatures().get(3); }
	@Override public EAttribute getExemplar_SpanId() { return (EAttribute)exemplarEClass.getEStructuralFeatures().get(4); }
	@Override public EAttribute getExemplar_TraceId() { return (EAttribute)exemplarEClass.getEStructuralFeatures().get(5); }

	@Override public EClass getLogsData() { return logsDataEClass; }
	@Override public EReference getLogsData_ResourceLogs() { return (EReference)logsDataEClass.getEStructuralFeatures().get(0); }

	@Override public EClass getResourceLogs() { return resourceLogsEClass; }
	@Override public EReference getResourceLogs_Resource() { return (EReference)resourceLogsEClass.getEStructuralFeatures().get(0); }
	@Override public EReference getResourceLogs_ScopeLogs() { return (EReference)resourceLogsEClass.getEStructuralFeatures().get(1); }
	@Override public EAttribute getResourceLogs_SchemaUrl() { return (EAttribute)resourceLogsEClass.getEStructuralFeatures().get(2); }

	@Override public EClass getScopeLogs() { return scopeLogsEClass; }
	@Override public EReference getScopeLogs_Scope() { return (EReference)scopeLogsEClass.getEStructuralFeatures().get(0); }
	@Override public EReference getScopeLogs_LogRecords() { return (EReference)scopeLogsEClass.getEStructuralFeatures().get(1); }
	@Override public EAttribute getScopeLogs_SchemaUrl() { return (EAttribute)scopeLogsEClass.getEStructuralFeatures().get(2); }

	@Override public EClass getLogRecord() { return logRecordEClass; }
	@Override public EAttribute getLogRecord_TimeUnixNano() { return (EAttribute)logRecordEClass.getEStructuralFeatures().get(0); }
	@Override public EAttribute getLogRecord_ObservedTimeUnixNano() { return (EAttribute)logRecordEClass.getEStructuralFeatures().get(1); }
	@Override public EAttribute getLogRecord_SeverityNumber() { return (EAttribute)logRecordEClass.getEStructuralFeatures().get(2); }
	@Override public EAttribute getLogRecord_SeverityText() { return (EAttribute)logRecordEClass.getEStructuralFeatures().get(3); }
	@Override public EReference getLogRecord_Body() { return (EReference)logRecordEClass.getEStructuralFeatures().get(4); }
	@Override public EReference getLogRecord_Attributes() { return (EReference)logRecordEClass.getEStructuralFeatures().get(5); }
	@Override public EAttribute getLogRecord_DroppedAttributesCount() { return (EAttribute)logRecordEClass.getEStructuralFeatures().get(6); }
	@Override public EAttribute getLogRecord_Flags() { return (EAttribute)logRecordEClass.getEStructuralFeatures().get(7); }
	@Override public EAttribute getLogRecord_TraceId() { return (EAttribute)logRecordEClass.getEStructuralFeatures().get(8); }
	@Override public EAttribute getLogRecord_SpanId() { return (EAttribute)logRecordEClass.getEStructuralFeatures().get(9); }

	@Override public EEnum getSpanKind() { return spanKindEEnum; }
	@Override public EEnum getStatusCode() { return statusCodeEEnum; }
	@Override public EEnum getAggregationTemporality() { return aggregationTemporalityEEnum; }
	@Override public EEnum getSeverityNumber() { return severityNumberEEnum; }

	@Override
	public TelemetryFactory getTelemetryFactory() {
		return (TelemetryFactory)getEFactoryInstance();
	}

	private boolean isCreated = false;

	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		resourceEClass = createEClass(RESOURCE);
		createEReference(resourceEClass, RESOURCE__ATTRIBUTES);
		createEAttribute(resourceEClass, RESOURCE__DROPPED_ATTRIBUTES_COUNT);
		createEAttribute(resourceEClass, RESOURCE__SCHEMA_URL);

		instrumentationScopeEClass = createEClass(INSTRUMENTATION_SCOPE);
		createEAttribute(instrumentationScopeEClass, INSTRUMENTATION_SCOPE__NAME);
		createEAttribute(instrumentationScopeEClass, INSTRUMENTATION_SCOPE__VERSION);
		createEReference(instrumentationScopeEClass, INSTRUMENTATION_SCOPE__ATTRIBUTES);
		createEAttribute(instrumentationScopeEClass, INSTRUMENTATION_SCOPE__DROPPED_ATTRIBUTES_COUNT);
		createEAttribute(instrumentationScopeEClass, INSTRUMENTATION_SCOPE__SCHEMA_URL);

		keyValueEClass = createEClass(KEY_VALUE);
		createEAttribute(keyValueEClass, KEY_VALUE__KEY);
		createEReference(keyValueEClass, KEY_VALUE__VALUE);

		anyValueEClass = createEClass(ANY_VALUE);
		createEAttribute(anyValueEClass, ANY_VALUE__STRING_VALUE);
		createEAttribute(anyValueEClass, ANY_VALUE__BOOL_VALUE);
		createEAttribute(anyValueEClass, ANY_VALUE__INT_VALUE);
		createEAttribute(anyValueEClass, ANY_VALUE__DOUBLE_VALUE);
		createEReference(anyValueEClass, ANY_VALUE__ARRAY_VALUE);
		createEReference(anyValueEClass, ANY_VALUE__KVLIST_VALUE);
		createEAttribute(anyValueEClass, ANY_VALUE__BYTES_VALUE);

		tracesDataEClass = createEClass(TRACES_DATA);
		createEReference(tracesDataEClass, TRACES_DATA__RESOURCE_SPANS);

		resourceSpansEClass = createEClass(RESOURCE_SPANS);
		createEReference(resourceSpansEClass, RESOURCE_SPANS__RESOURCE);
		createEReference(resourceSpansEClass, RESOURCE_SPANS__SCOPE_SPANS);
		createEAttribute(resourceSpansEClass, RESOURCE_SPANS__SCHEMA_URL);

		scopeSpansEClass = createEClass(SCOPE_SPANS);
		createEReference(scopeSpansEClass, SCOPE_SPANS__SCOPE);
		createEReference(scopeSpansEClass, SCOPE_SPANS__SPANS);
		createEAttribute(scopeSpansEClass, SCOPE_SPANS__SCHEMA_URL);

		spanEClass = createEClass(SPAN);
		createEAttribute(spanEClass, SPAN__TRACE_ID);
		createEAttribute(spanEClass, SPAN__SPAN_ID);
		createEAttribute(spanEClass, SPAN__TRACE_STATE);
		createEAttribute(spanEClass, SPAN__PARENT_SPAN_ID);
		createEAttribute(spanEClass, SPAN__NAME);
		createEAttribute(spanEClass, SPAN__KIND);
		createEAttribute(spanEClass, SPAN__START_TIME_UNIX_NANO);
		createEAttribute(spanEClass, SPAN__END_TIME_UNIX_NANO);
		createEReference(spanEClass, SPAN__ATTRIBUTES);
		createEAttribute(spanEClass, SPAN__DROPPED_ATTRIBUTES_COUNT);
		createEReference(spanEClass, SPAN__EVENTS);
		createEAttribute(spanEClass, SPAN__DROPPED_EVENTS_COUNT);
		createEReference(spanEClass, SPAN__LINKS);
		createEAttribute(spanEClass, SPAN__DROPPED_LINKS_COUNT);
		createEReference(spanEClass, SPAN__STATUS);
		createEAttribute(spanEClass, SPAN__FLAGS);

		spanEventEClass = createEClass(SPAN_EVENT);
		createEAttribute(spanEventEClass, SPAN_EVENT__TIME_UNIX_NANO);
		createEAttribute(spanEventEClass, SPAN_EVENT__NAME);
		createEReference(spanEventEClass, SPAN_EVENT__ATTRIBUTES);
		createEAttribute(spanEventEClass, SPAN_EVENT__DROPPED_ATTRIBUTES_COUNT);

		spanLinkEClass = createEClass(SPAN_LINK);
		createEAttribute(spanLinkEClass, SPAN_LINK__TRACE_ID);
		createEAttribute(spanLinkEClass, SPAN_LINK__SPAN_ID);
		createEAttribute(spanLinkEClass, SPAN_LINK__TRACE_STATE);
		createEReference(spanLinkEClass, SPAN_LINK__ATTRIBUTES);
		createEAttribute(spanLinkEClass, SPAN_LINK__DROPPED_ATTRIBUTES_COUNT);
		createEAttribute(spanLinkEClass, SPAN_LINK__FLAGS);

		spanStatusEClass = createEClass(SPAN_STATUS);
		createEAttribute(spanStatusEClass, SPAN_STATUS__MESSAGE);
		createEAttribute(spanStatusEClass, SPAN_STATUS__CODE);

		metricsDataEClass = createEClass(METRICS_DATA);
		createEReference(metricsDataEClass, METRICS_DATA__RESOURCE_METRICS);

		resourceMetricsEClass = createEClass(RESOURCE_METRICS);
		createEReference(resourceMetricsEClass, RESOURCE_METRICS__RESOURCE);
		createEReference(resourceMetricsEClass, RESOURCE_METRICS__SCOPE_METRICS);
		createEAttribute(resourceMetricsEClass, RESOURCE_METRICS__SCHEMA_URL);

		scopeMetricsEClass = createEClass(SCOPE_METRICS);
		createEReference(scopeMetricsEClass, SCOPE_METRICS__SCOPE);
		createEReference(scopeMetricsEClass, SCOPE_METRICS__METRICS);
		createEAttribute(scopeMetricsEClass, SCOPE_METRICS__SCHEMA_URL);

		metricEClass = createEClass(METRIC);
		createEAttribute(metricEClass, METRIC__NAME);
		createEAttribute(metricEClass, METRIC__DESCRIPTION);
		createEAttribute(metricEClass, METRIC__UNIT);
		createEReference(metricEClass, METRIC__METADATA);

		gaugeEClass = createEClass(GAUGE);
		createEReference(gaugeEClass, GAUGE__DATA_POINTS);

		sumEClass = createEClass(SUM);
		createEReference(sumEClass, SUM__DATA_POINTS);
		createEAttribute(sumEClass, SUM__AGGREGATION_TEMPORALITY);
		createEAttribute(sumEClass, SUM__IS_MONOTONIC);

		histogramEClass = createEClass(HISTOGRAM);
		createEReference(histogramEClass, HISTOGRAM__DATA_POINTS);
		createEAttribute(histogramEClass, HISTOGRAM__AGGREGATION_TEMPORALITY);

		exponentialHistogramEClass = createEClass(EXPONENTIAL_HISTOGRAM);
		createEReference(exponentialHistogramEClass, EXPONENTIAL_HISTOGRAM__DATA_POINTS);
		createEAttribute(exponentialHistogramEClass, EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY);

		summaryEClass = createEClass(SUMMARY);
		createEReference(summaryEClass, SUMMARY__DATA_POINTS);

		numberDataPointEClass = createEClass(NUMBER_DATA_POINT);
		createEReference(numberDataPointEClass, NUMBER_DATA_POINT__ATTRIBUTES);
		createEAttribute(numberDataPointEClass, NUMBER_DATA_POINT__START_TIME_UNIX_NANO);
		createEAttribute(numberDataPointEClass, NUMBER_DATA_POINT__TIME_UNIX_NANO);
		createEAttribute(numberDataPointEClass, NUMBER_DATA_POINT__AS_DOUBLE);
		createEAttribute(numberDataPointEClass, NUMBER_DATA_POINT__AS_INT);
		createEReference(numberDataPointEClass, NUMBER_DATA_POINT__EXEMPLARS);
		createEAttribute(numberDataPointEClass, NUMBER_DATA_POINT__FLAGS);

		histogramDataPointEClass = createEClass(HISTOGRAM_DATA_POINT);
		createEReference(histogramDataPointEClass, HISTOGRAM_DATA_POINT__ATTRIBUTES);
		createEAttribute(histogramDataPointEClass, HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO);
		createEAttribute(histogramDataPointEClass, HISTOGRAM_DATA_POINT__TIME_UNIX_NANO);
		createEAttribute(histogramDataPointEClass, HISTOGRAM_DATA_POINT__COUNT);
		createEAttribute(histogramDataPointEClass, HISTOGRAM_DATA_POINT__SUM);
		createEAttribute(histogramDataPointEClass, HISTOGRAM_DATA_POINT__BUCKET_COUNTS);
		createEAttribute(histogramDataPointEClass, HISTOGRAM_DATA_POINT__EXPLICIT_BOUNDS);
		createEReference(histogramDataPointEClass, HISTOGRAM_DATA_POINT__EXEMPLARS);
		createEAttribute(histogramDataPointEClass, HISTOGRAM_DATA_POINT__FLAGS);
		createEAttribute(histogramDataPointEClass, HISTOGRAM_DATA_POINT__MIN);
		createEAttribute(histogramDataPointEClass, HISTOGRAM_DATA_POINT__MAX);

		exponentialHistogramDataPointEClass = createEClass(EXPONENTIAL_HISTOGRAM_DATA_POINT);
		createEReference(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__ATTRIBUTES);
		createEAttribute(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO);
		createEAttribute(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__TIME_UNIX_NANO);
		createEAttribute(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__COUNT);
		createEAttribute(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__SUM);
		createEAttribute(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__SCALE);
		createEAttribute(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_COUNT);
		createEReference(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__POSITIVE);
		createEReference(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__NEGATIVE);
		createEAttribute(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__FLAGS);
		createEReference(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__EXEMPLARS);
		createEAttribute(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__MIN);
		createEAttribute(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__MAX);
		createEAttribute(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_THRESHOLD);

		exponentialHistogramDataPointBucketsEClass = createEClass(EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS);
		createEAttribute(exponentialHistogramDataPointBucketsEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__OFFSET);
		createEAttribute(exponentialHistogramDataPointBucketsEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__BUCKET_COUNTS);

		summaryDataPointEClass = createEClass(SUMMARY_DATA_POINT);
		createEReference(summaryDataPointEClass, SUMMARY_DATA_POINT__ATTRIBUTES);
		createEAttribute(summaryDataPointEClass, SUMMARY_DATA_POINT__START_TIME_UNIX_NANO);
		createEAttribute(summaryDataPointEClass, SUMMARY_DATA_POINT__TIME_UNIX_NANO);
		createEAttribute(summaryDataPointEClass, SUMMARY_DATA_POINT__COUNT);
		createEAttribute(summaryDataPointEClass, SUMMARY_DATA_POINT__SUM);
		createEReference(summaryDataPointEClass, SUMMARY_DATA_POINT__QUANTILE_VALUES);
		createEAttribute(summaryDataPointEClass, SUMMARY_DATA_POINT__FLAGS);

		summaryDataPointValueAtQuantileEClass = createEClass(SUMMARY_DATA_POINT_VALUE_AT_QUANTILE);
		createEAttribute(summaryDataPointValueAtQuantileEClass, SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__QUANTILE);
		createEAttribute(summaryDataPointValueAtQuantileEClass, SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__VALUE);

		exemplarEClass = createEClass(EXEMPLAR);
		createEReference(exemplarEClass, EXEMPLAR__FILTERED_ATTRIBUTES);
		createEAttribute(exemplarEClass, EXEMPLAR__TIME_UNIX_NANO);
		createEAttribute(exemplarEClass, EXEMPLAR__AS_DOUBLE);
		createEAttribute(exemplarEClass, EXEMPLAR__AS_INT);
		createEAttribute(exemplarEClass, EXEMPLAR__SPAN_ID);
		createEAttribute(exemplarEClass, EXEMPLAR__TRACE_ID);

		logsDataEClass = createEClass(LOGS_DATA);
		createEReference(logsDataEClass, LOGS_DATA__RESOURCE_LOGS);

		resourceLogsEClass = createEClass(RESOURCE_LOGS);
		createEReference(resourceLogsEClass, RESOURCE_LOGS__RESOURCE);
		createEReference(resourceLogsEClass, RESOURCE_LOGS__SCOPE_LOGS);
		createEAttribute(resourceLogsEClass, RESOURCE_LOGS__SCHEMA_URL);

		scopeLogsEClass = createEClass(SCOPE_LOGS);
		createEReference(scopeLogsEClass, SCOPE_LOGS__SCOPE);
		createEReference(scopeLogsEClass, SCOPE_LOGS__LOG_RECORDS);
		createEAttribute(scopeLogsEClass, SCOPE_LOGS__SCHEMA_URL);

		logRecordEClass = createEClass(LOG_RECORD);
		createEAttribute(logRecordEClass, LOG_RECORD__TIME_UNIX_NANO);
		createEAttribute(logRecordEClass, LOG_RECORD__OBSERVED_TIME_UNIX_NANO);
		createEAttribute(logRecordEClass, LOG_RECORD__SEVERITY_NUMBER);
		createEAttribute(logRecordEClass, LOG_RECORD__SEVERITY_TEXT);
		createEReference(logRecordEClass, LOG_RECORD__BODY);
		createEReference(logRecordEClass, LOG_RECORD__ATTRIBUTES);
		createEAttribute(logRecordEClass, LOG_RECORD__DROPPED_ATTRIBUTES_COUNT);
		createEAttribute(logRecordEClass, LOG_RECORD__FLAGS);
		createEAttribute(logRecordEClass, LOG_RECORD__TRACE_ID);
		createEAttribute(logRecordEClass, LOG_RECORD__SPAN_ID);

		// Create enums
		spanKindEEnum = createEEnum(SPAN_KIND);
		statusCodeEEnum = createEEnum(STATUS_CODE);
		aggregationTemporalityEEnum = createEEnum(AGGREGATION_TEMPORALITY);
		severityNumberEEnum = createEEnum(SEVERITY_NUMBER);
	}

	private boolean isInitialized = false;

	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes
		gaugeEClass.getESuperTypes().add(this.getMetric());
		sumEClass.getESuperTypes().add(this.getMetric());
		histogramEClass.getESuperTypes().add(this.getMetric());
		exponentialHistogramEClass.getESuperTypes().add(this.getMetric());
		summaryEClass.getESuperTypes().add(this.getMetric());

		// Initialize classes and features
		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResource_Attributes(), this.getKeyValue(), null, "attributes", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_DroppedAttributesCount(), ecorePackage.getEInt(), "droppedAttributesCount", "0", 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_SchemaUrl(), ecorePackage.getEString(), "schemaUrl", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instrumentationScopeEClass, InstrumentationScope.class, "InstrumentationScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstrumentationScope_Name(), ecorePackage.getEString(), "name", null, 0, 1, InstrumentationScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstrumentationScope_Version(), ecorePackage.getEString(), "version", null, 0, 1, InstrumentationScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstrumentationScope_Attributes(), this.getKeyValue(), null, "attributes", null, 0, -1, InstrumentationScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstrumentationScope_DroppedAttributesCount(), ecorePackage.getEInt(), "droppedAttributesCount", "0", 0, 1, InstrumentationScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstrumentationScope_SchemaUrl(), ecorePackage.getEString(), "schemaUrl", null, 0, 1, InstrumentationScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyValueEClass, KeyValue.class, "KeyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyValue_Key(), ecorePackage.getEString(), "key", null, 0, 1, KeyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKeyValue_Value(), this.getAnyValue(), null, "value", null, 0, 1, KeyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anyValueEClass, AnyValue.class, "AnyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnyValue_StringValue(), ecorePackage.getEString(), "stringValue", null, 0, 1, AnyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnyValue_BoolValue(), ecorePackage.getEBooleanObject(), "boolValue", null, 0, 1, AnyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnyValue_IntValue(), ecorePackage.getELongObject(), "intValue", null, 0, 1, AnyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnyValue_DoubleValue(), ecorePackage.getEDoubleObject(), "doubleValue", null, 0, 1, AnyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnyValue_ArrayValue(), this.getAnyValue(), null, "arrayValue", null, 0, -1, AnyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnyValue_KvlistValue(), this.getKeyValue(), null, "kvlistValue", null, 0, -1, AnyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnyValue_BytesValue(), ecorePackage.getEByteArray(), "bytesValue", null, 0, 1, AnyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracesDataEClass, TracesData.class, "TracesData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracesData_ResourceSpans(), this.getResourceSpans(), null, "resourceSpans", null, 0, -1, TracesData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceSpansEClass, ResourceSpans.class, "ResourceSpans", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceSpans_Resource(), this.getResource(), null, "resource", null, 0, 1, ResourceSpans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceSpans_ScopeSpans(), this.getScopeSpans(), null, "scopeSpans", null, 0, -1, ResourceSpans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceSpans_SchemaUrl(), ecorePackage.getEString(), "schemaUrl", null, 0, 1, ResourceSpans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scopeSpansEClass, ScopeSpans.class, "ScopeSpans", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScopeSpans_Scope(), this.getInstrumentationScope(), null, "scope", null, 0, 1, ScopeSpans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScopeSpans_Spans(), this.getSpan(), null, "spans", null, 0, -1, ScopeSpans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScopeSpans_SchemaUrl(), ecorePackage.getEString(), "schemaUrl", null, 0, 1, ScopeSpans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spanEClass, Span.class, "Span", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpan_TraceId(), ecorePackage.getEString(), "traceId", null, 0, 1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpan_SpanId(), ecorePackage.getEString(), "spanId", null, 0, 1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpan_TraceState(), ecorePackage.getEString(), "traceState", null, 0, 1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpan_ParentSpanId(), ecorePackage.getEString(), "parentSpanId", null, 0, 1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpan_Name(), ecorePackage.getEString(), "name", null, 0, 1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpan_Kind(), this.getSpanKind(), "kind", "SPAN_KIND_UNSPECIFIED", 0, 1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpan_StartTimeUnixNano(), ecorePackage.getELong(), "startTimeUnixNano", "0", 0, 1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpan_EndTimeUnixNano(), ecorePackage.getELong(), "endTimeUnixNano", "0", 0, 1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpan_Attributes(), this.getKeyValue(), null, "attributes", null, 0, -1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpan_DroppedAttributesCount(), ecorePackage.getEInt(), "droppedAttributesCount", "0", 0, 1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpan_Events(), this.getSpanEvent(), null, "events", null, 0, -1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpan_DroppedEventsCount(), ecorePackage.getEInt(), "droppedEventsCount", "0", 0, 1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpan_Links(), this.getSpanLink(), null, "links", null, 0, -1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpan_DroppedLinksCount(), ecorePackage.getEInt(), "droppedLinksCount", "0", 0, 1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpan_Status(), this.getSpanStatus(), null, "status", null, 0, 1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpan_Flags(), ecorePackage.getEInt(), "flags", "0", 0, 1, Span.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spanEventEClass, SpanEvent.class, "SpanEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpanEvent_TimeUnixNano(), ecorePackage.getELong(), "timeUnixNano", "0", 0, 1, SpanEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, SpanEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpanEvent_Attributes(), this.getKeyValue(), null, "attributes", null, 0, -1, SpanEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanEvent_DroppedAttributesCount(), ecorePackage.getEInt(), "droppedAttributesCount", "0", 0, 1, SpanEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spanLinkEClass, SpanLink.class, "SpanLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpanLink_TraceId(), ecorePackage.getEString(), "traceId", null, 0, 1, SpanLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanLink_SpanId(), ecorePackage.getEString(), "spanId", null, 0, 1, SpanLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanLink_TraceState(), ecorePackage.getEString(), "traceState", null, 0, 1, SpanLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpanLink_Attributes(), this.getKeyValue(), null, "attributes", null, 0, -1, SpanLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanLink_DroppedAttributesCount(), ecorePackage.getEInt(), "droppedAttributesCount", "0", 0, 1, SpanLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanLink_Flags(), ecorePackage.getEInt(), "flags", "0", 0, 1, SpanLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spanStatusEClass, SpanStatus.class, "SpanStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpanStatus_Message(), ecorePackage.getEString(), "message", null, 0, 1, SpanStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanStatus_Code(), this.getStatusCode(), "code", "STATUS_CODE_UNSET", 0, 1, SpanStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricsDataEClass, MetricsData.class, "MetricsData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetricsData_ResourceMetrics(), this.getResourceMetrics(), null, "resourceMetrics", null, 0, -1, MetricsData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceMetricsEClass, ResourceMetrics.class, "ResourceMetrics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceMetrics_Resource(), this.getResource(), null, "resource", null, 0, 1, ResourceMetrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceMetrics_ScopeMetrics(), this.getScopeMetrics(), null, "scopeMetrics", null, 0, -1, ResourceMetrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceMetrics_SchemaUrl(), ecorePackage.getEString(), "schemaUrl", null, 0, 1, ResourceMetrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scopeMetricsEClass, ScopeMetrics.class, "ScopeMetrics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScopeMetrics_Scope(), this.getInstrumentationScope(), null, "scope", null, 0, 1, ScopeMetrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScopeMetrics_Metrics(), this.getMetric(), null, "metrics", null, 0, -1, ScopeMetrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScopeMetrics_SchemaUrl(), ecorePackage.getEString(), "schemaUrl", null, 0, 1, ScopeMetrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricEClass, Metric.class, "Metric", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetric_Name(), ecorePackage.getEString(), "name", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_Description(), ecorePackage.getEString(), "description", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetric_Metadata(), this.getKeyValue(), null, "metadata", null, 0, -1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gaugeEClass, Gauge.class, "Gauge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGauge_DataPoints(), this.getNumberDataPoint(), null, "dataPoints", null, 0, -1, Gauge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sumEClass, Sum.class, "Sum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSum_DataPoints(), this.getNumberDataPoint(), null, "dataPoints", null, 0, -1, Sum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSum_AggregationTemporality(), this.getAggregationTemporality(), "aggregationTemporality", "AGGREGATION_TEMPORALITY_UNSPECIFIED", 0, 1, Sum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSum_IsMonotonic(), ecorePackage.getEBoolean(), "isMonotonic", "false", 0, 1, Sum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(histogramEClass, Histogram.class, "Histogram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHistogram_DataPoints(), this.getHistogramDataPoint(), null, "dataPoints", null, 0, -1, Histogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogram_AggregationTemporality(), this.getAggregationTemporality(), "aggregationTemporality", "AGGREGATION_TEMPORALITY_UNSPECIFIED", 0, 1, Histogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exponentialHistogramEClass, ExponentialHistogram.class, "ExponentialHistogram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExponentialHistogram_DataPoints(), this.getExponentialHistogramDataPoint(), null, "dataPoints", null, 0, -1, ExponentialHistogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExponentialHistogram_AggregationTemporality(), this.getAggregationTemporality(), "aggregationTemporality", "AGGREGATION_TEMPORALITY_UNSPECIFIED", 0, 1, ExponentialHistogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(summaryEClass, Summary.class, "Summary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSummary_DataPoints(), this.getSummaryDataPoint(), null, "dataPoints", null, 0, -1, Summary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberDataPointEClass, NumberDataPoint.class, "NumberDataPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumberDataPoint_Attributes(), this.getKeyValue(), null, "attributes", null, 0, -1, NumberDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberDataPoint_StartTimeUnixNano(), ecorePackage.getELong(), "startTimeUnixNano", "0", 0, 1, NumberDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberDataPoint_TimeUnixNano(), ecorePackage.getELong(), "timeUnixNano", "0", 0, 1, NumberDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberDataPoint_AsDouble(), ecorePackage.getEDoubleObject(), "asDouble", null, 0, 1, NumberDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberDataPoint_AsInt(), ecorePackage.getELongObject(), "asInt", null, 0, 1, NumberDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumberDataPoint_Exemplars(), this.getExemplar(), null, "exemplars", null, 0, -1, NumberDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberDataPoint_Flags(), ecorePackage.getEInt(), "flags", "0", 0, 1, NumberDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(histogramDataPointEClass, HistogramDataPoint.class, "HistogramDataPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHistogramDataPoint_Attributes(), this.getKeyValue(), null, "attributes", null, 0, -1, HistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogramDataPoint_StartTimeUnixNano(), ecorePackage.getELong(), "startTimeUnixNano", "0", 0, 1, HistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogramDataPoint_TimeUnixNano(), ecorePackage.getELong(), "timeUnixNano", "0", 0, 1, HistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogramDataPoint_Count(), ecorePackage.getELong(), "count", "0", 0, 1, HistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogramDataPoint_Sum(), ecorePackage.getEDoubleObject(), "sum", null, 0, 1, HistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogramDataPoint_BucketCounts(), ecorePackage.getELong(), "bucketCounts", null, 0, -1, HistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogramDataPoint_ExplicitBounds(), ecorePackage.getEDouble(), "explicitBounds", null, 0, -1, HistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistogramDataPoint_Exemplars(), this.getExemplar(), null, "exemplars", null, 0, -1, HistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogramDataPoint_Flags(), ecorePackage.getEInt(), "flags", "0", 0, 1, HistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogramDataPoint_Min(), ecorePackage.getEDoubleObject(), "min", null, 0, 1, HistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogramDataPoint_Max(), ecorePackage.getEDoubleObject(), "max", null, 0, 1, HistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exponentialHistogramDataPointEClass, ExponentialHistogramDataPoint.class, "ExponentialHistogramDataPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExponentialHistogramDataPoint_Attributes(), this.getKeyValue(), null, "attributes", null, 0, -1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExponentialHistogramDataPoint_StartTimeUnixNano(), ecorePackage.getELong(), "startTimeUnixNano", "0", 0, 1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExponentialHistogramDataPoint_TimeUnixNano(), ecorePackage.getELong(), "timeUnixNano", "0", 0, 1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExponentialHistogramDataPoint_Count(), ecorePackage.getELong(), "count", "0", 0, 1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExponentialHistogramDataPoint_Sum(), ecorePackage.getEDoubleObject(), "sum", null, 0, 1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExponentialHistogramDataPoint_Scale(), ecorePackage.getEInt(), "scale", "0", 0, 1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExponentialHistogramDataPoint_ZeroCount(), ecorePackage.getELong(), "zeroCount", "0", 0, 1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExponentialHistogramDataPoint_Positive(), this.getExponentialHistogramDataPointBuckets(), null, "positive", null, 0, 1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExponentialHistogramDataPoint_Negative(), this.getExponentialHistogramDataPointBuckets(), null, "negative", null, 0, 1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExponentialHistogramDataPoint_Flags(), ecorePackage.getEInt(), "flags", "0", 0, 1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExponentialHistogramDataPoint_Exemplars(), this.getExemplar(), null, "exemplars", null, 0, -1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExponentialHistogramDataPoint_Min(), ecorePackage.getEDoubleObject(), "min", null, 0, 1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExponentialHistogramDataPoint_Max(), ecorePackage.getEDoubleObject(), "max", null, 0, 1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExponentialHistogramDataPoint_ZeroThreshold(), ecorePackage.getEDouble(), "zeroThreshold", "0.0", 0, 1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exponentialHistogramDataPointBucketsEClass, ExponentialHistogramDataPointBuckets.class, "ExponentialHistogramDataPointBuckets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExponentialHistogramDataPointBuckets_Offset(), ecorePackage.getEInt(), "offset", "0", 0, 1, ExponentialHistogramDataPointBuckets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExponentialHistogramDataPointBuckets_BucketCounts(), ecorePackage.getELong(), "bucketCounts", null, 0, -1, ExponentialHistogramDataPointBuckets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(summaryDataPointEClass, SummaryDataPoint.class, "SummaryDataPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSummaryDataPoint_Attributes(), this.getKeyValue(), null, "attributes", null, 0, -1, SummaryDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSummaryDataPoint_StartTimeUnixNano(), ecorePackage.getELong(), "startTimeUnixNano", "0", 0, 1, SummaryDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSummaryDataPoint_TimeUnixNano(), ecorePackage.getELong(), "timeUnixNano", "0", 0, 1, SummaryDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSummaryDataPoint_Count(), ecorePackage.getELong(), "count", "0", 0, 1, SummaryDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSummaryDataPoint_Sum(), ecorePackage.getEDouble(), "sum", "0.0", 0, 1, SummaryDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSummaryDataPoint_QuantileValues(), this.getSummaryDataPointValueAtQuantile(), null, "quantileValues", null, 0, -1, SummaryDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSummaryDataPoint_Flags(), ecorePackage.getEInt(), "flags", "0", 0, 1, SummaryDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(summaryDataPointValueAtQuantileEClass, SummaryDataPointValueAtQuantile.class, "SummaryDataPointValueAtQuantile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSummaryDataPointValueAtQuantile_Quantile(), ecorePackage.getEDouble(), "quantile", "0.0", 0, 1, SummaryDataPointValueAtQuantile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSummaryDataPointValueAtQuantile_Value(), ecorePackage.getEDouble(), "value", "0.0", 0, 1, SummaryDataPointValueAtQuantile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exemplarEClass, Exemplar.class, "Exemplar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExemplar_FilteredAttributes(), this.getKeyValue(), null, "filteredAttributes", null, 0, -1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExemplar_TimeUnixNano(), ecorePackage.getELong(), "timeUnixNano", "0", 0, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExemplar_AsDouble(), ecorePackage.getEDoubleObject(), "asDouble", null, 0, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExemplar_AsInt(), ecorePackage.getELongObject(), "asInt", null, 0, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExemplar_SpanId(), ecorePackage.getEString(), "spanId", null, 0, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExemplar_TraceId(), ecorePackage.getEString(), "traceId", null, 0, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logsDataEClass, LogsData.class, "LogsData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogsData_ResourceLogs(), this.getResourceLogs(), null, "resourceLogs", null, 0, -1, LogsData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceLogsEClass, ResourceLogs.class, "ResourceLogs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceLogs_Resource(), this.getResource(), null, "resource", null, 0, 1, ResourceLogs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceLogs_ScopeLogs(), this.getScopeLogs(), null, "scopeLogs", null, 0, -1, ResourceLogs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceLogs_SchemaUrl(), ecorePackage.getEString(), "schemaUrl", null, 0, 1, ResourceLogs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scopeLogsEClass, ScopeLogs.class, "ScopeLogs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScopeLogs_Scope(), this.getInstrumentationScope(), null, "scope", null, 0, 1, ScopeLogs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScopeLogs_LogRecords(), this.getLogRecord(), null, "logRecords", null, 0, -1, ScopeLogs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScopeLogs_SchemaUrl(), ecorePackage.getEString(), "schemaUrl", null, 0, 1, ScopeLogs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logRecordEClass, LogRecord.class, "LogRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogRecord_TimeUnixNano(), ecorePackage.getELong(), "timeUnixNano", "0", 0, 1, LogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogRecord_ObservedTimeUnixNano(), ecorePackage.getELong(), "observedTimeUnixNano", "0", 0, 1, LogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogRecord_SeverityNumber(), this.getSeverityNumber(), "severityNumber", "SEVERITY_NUMBER_UNSPECIFIED", 0, 1, LogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogRecord_SeverityText(), ecorePackage.getEString(), "severityText", null, 0, 1, LogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogRecord_Body(), this.getAnyValue(), null, "body", null, 0, 1, LogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogRecord_Attributes(), this.getKeyValue(), null, "attributes", null, 0, -1, LogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogRecord_DroppedAttributesCount(), ecorePackage.getEInt(), "droppedAttributesCount", "0", 0, 1, LogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogRecord_Flags(), ecorePackage.getEInt(), "flags", "0", 0, 1, LogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogRecord_TraceId(), ecorePackage.getEString(), "traceId", null, 0, 1, LogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogRecord_SpanId(), ecorePackage.getEString(), "spanId", null, 0, 1, LogRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(spanKindEEnum, SpanKind.class, "SpanKind");
		addEEnumLiteral(spanKindEEnum, SpanKind.SPAN_KIND_UNSPECIFIED);
		addEEnumLiteral(spanKindEEnum, SpanKind.SPAN_KIND_INTERNAL);
		addEEnumLiteral(spanKindEEnum, SpanKind.SPAN_KIND_SERVER);
		addEEnumLiteral(spanKindEEnum, SpanKind.SPAN_KIND_CLIENT);
		addEEnumLiteral(spanKindEEnum, SpanKind.SPAN_KIND_PRODUCER);
		addEEnumLiteral(spanKindEEnum, SpanKind.SPAN_KIND_CONSUMER);

		initEEnum(statusCodeEEnum, StatusCode.class, "StatusCode");
		addEEnumLiteral(statusCodeEEnum, StatusCode.STATUS_CODE_UNSET);
		addEEnumLiteral(statusCodeEEnum, StatusCode.STATUS_CODE_OK);
		addEEnumLiteral(statusCodeEEnum, StatusCode.STATUS_CODE_ERROR);

		initEEnum(aggregationTemporalityEEnum, AggregationTemporality.class, "AggregationTemporality");
		addEEnumLiteral(aggregationTemporalityEEnum, AggregationTemporality.AGGREGATION_TEMPORALITY_UNSPECIFIED);
		addEEnumLiteral(aggregationTemporalityEEnum, AggregationTemporality.AGGREGATION_TEMPORALITY_DELTA);
		addEEnumLiteral(aggregationTemporalityEEnum, AggregationTemporality.AGGREGATION_TEMPORALITY_CUMULATIVE);

		initEEnum(severityNumberEEnum, SeverityNumber.class, "SeverityNumber");
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_UNSPECIFIED);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_TRACE);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_TRACE2);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_TRACE3);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_TRACE4);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_DEBUG);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_DEBUG2);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_DEBUG3);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_DEBUG4);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_INFO);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_INFO2);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_INFO3);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_INFO4);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_WARN);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_WARN2);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_WARN3);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_WARN4);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_ERROR);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_ERROR2);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_ERROR3);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_ERROR4);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_FATAL);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_FATAL2);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_FATAL3);
		addEEnumLiteral(severityNumberEEnum, SeverityNumber.SEVERITY_NUMBER_FATAL4);
	}

} //TelemetryPackageImpl
