/**
 */
package org.nasdanika.models.telemetry;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * The <b>Package</b> for the model.
 * @see org.nasdanika.models.telemetry.TelemetryFactory
 * @generated
 */
public interface TelemetryPackage extends EPackage {
	String eNAME = "telemetry";
	String eNS_URI = "ecore://nasdanika.org/models/telemetry";
	String eNS_PREFIX = "org.nasdanika.models.telemetry";
	TelemetryPackage eINSTANCE = org.nasdanika.models.telemetry.impl.TelemetryPackageImpl.init();

	// Classifier IDs
	int RESOURCE = 0;
	int INSTRUMENTATION_SCOPE = 1;
	int KEY_VALUE = 2;
	int ANY_VALUE = 3;
	int TRACES_DATA = 4;
	int RESOURCE_SPANS = 5;
	int SCOPE_SPANS = 6;
	int SPAN = 7;
	int SPAN_EVENT = 8;
	int SPAN_LINK = 9;
	int SPAN_STATUS = 10;
	int METRICS_DATA = 11;
	int RESOURCE_METRICS = 12;
	int SCOPE_METRICS = 13;
	int METRIC = 14;
	int GAUGE = 15;
	int SUM = 16;
	int HISTOGRAM = 17;
	int EXPONENTIAL_HISTOGRAM = 18;
	int SUMMARY = 19;
	int NUMBER_DATA_POINT = 20;
	int HISTOGRAM_DATA_POINT = 21;
	int EXPONENTIAL_HISTOGRAM_DATA_POINT = 22;
	int EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS = 23;
	int SUMMARY_DATA_POINT = 24;
	int SUMMARY_DATA_POINT_VALUE_AT_QUANTILE = 25;
	int EXEMPLAR = 26;
	int LOGS_DATA = 27;
	int RESOURCE_LOGS = 28;
	int SCOPE_LOGS = 29;
	int LOG_RECORD = 30;
	int SPAN_KIND = 31;
	int STATUS_CODE = 32;
	int AGGREGATION_TEMPORALITY = 33;
	int SEVERITY_NUMBER = 34;

	// RESOURCE features
	int RESOURCE__ATTRIBUTES = 0;
	int RESOURCE__DROPPED_ATTRIBUTES_COUNT = 1;
	int RESOURCE__SCHEMA_URL = 2;
	int RESOURCE_FEATURE_COUNT = 3;
	int RESOURCE_OPERATION_COUNT = 0;

	// INSTRUMENTATION_SCOPE features
	int INSTRUMENTATION_SCOPE__NAME = 0;
	int INSTRUMENTATION_SCOPE__VERSION = 1;
	int INSTRUMENTATION_SCOPE__ATTRIBUTES = 2;
	int INSTRUMENTATION_SCOPE__DROPPED_ATTRIBUTES_COUNT = 3;
	int INSTRUMENTATION_SCOPE__SCHEMA_URL = 4;
	int INSTRUMENTATION_SCOPE_FEATURE_COUNT = 5;
	int INSTRUMENTATION_SCOPE_OPERATION_COUNT = 0;

	// KEY_VALUE features
	int KEY_VALUE__KEY = 0;
	int KEY_VALUE__VALUE = 1;
	int KEY_VALUE_FEATURE_COUNT = 2;
	int KEY_VALUE_OPERATION_COUNT = 0;

	// ANY_VALUE features
	int ANY_VALUE__STRING_VALUE = 0;
	int ANY_VALUE__BOOL_VALUE = 1;
	int ANY_VALUE__INT_VALUE = 2;
	int ANY_VALUE__DOUBLE_VALUE = 3;
	int ANY_VALUE__ARRAY_VALUE = 4;
	int ANY_VALUE__KVLIST_VALUE = 5;
	int ANY_VALUE__BYTES_VALUE = 6;
	int ANY_VALUE_FEATURE_COUNT = 7;
	int ANY_VALUE_OPERATION_COUNT = 0;

	// TRACES_DATA features
	int TRACES_DATA__RESOURCE_SPANS = 0;
	int TRACES_DATA_FEATURE_COUNT = 1;
	int TRACES_DATA_OPERATION_COUNT = 0;

	// RESOURCE_SPANS features
	int RESOURCE_SPANS__RESOURCE = 0;
	int RESOURCE_SPANS__SCOPE_SPANS = 1;
	int RESOURCE_SPANS__SCHEMA_URL = 2;
	int RESOURCE_SPANS_FEATURE_COUNT = 3;
	int RESOURCE_SPANS_OPERATION_COUNT = 0;

	// SCOPE_SPANS features
	int SCOPE_SPANS__SCOPE = 0;
	int SCOPE_SPANS__SPANS = 1;
	int SCOPE_SPANS__SCHEMA_URL = 2;
	int SCOPE_SPANS_FEATURE_COUNT = 3;
	int SCOPE_SPANS_OPERATION_COUNT = 0;

	// SPAN features
	int SPAN__TRACE_ID = 0;
	int SPAN__SPAN_ID = 1;
	int SPAN__TRACE_STATE = 2;
	int SPAN__PARENT_SPAN_ID = 3;
	int SPAN__NAME = 4;
	int SPAN__KIND = 5;
	int SPAN__START_TIME_UNIX_NANO = 6;
	int SPAN__END_TIME_UNIX_NANO = 7;
	int SPAN__ATTRIBUTES = 8;
	int SPAN__DROPPED_ATTRIBUTES_COUNT = 9;
	int SPAN__EVENTS = 10;
	int SPAN__DROPPED_EVENTS_COUNT = 11;
	int SPAN__LINKS = 12;
	int SPAN__DROPPED_LINKS_COUNT = 13;
	int SPAN__STATUS = 14;
	int SPAN__FLAGS = 15;
	int SPAN_FEATURE_COUNT = 16;
	int SPAN_OPERATION_COUNT = 0;

	// SPAN_EVENT features
	int SPAN_EVENT__TIME_UNIX_NANO = 0;
	int SPAN_EVENT__NAME = 1;
	int SPAN_EVENT__ATTRIBUTES = 2;
	int SPAN_EVENT__DROPPED_ATTRIBUTES_COUNT = 3;
	int SPAN_EVENT_FEATURE_COUNT = 4;
	int SPAN_EVENT_OPERATION_COUNT = 0;

	// SPAN_LINK features
	int SPAN_LINK__TRACE_ID = 0;
	int SPAN_LINK__SPAN_ID = 1;
	int SPAN_LINK__TRACE_STATE = 2;
	int SPAN_LINK__ATTRIBUTES = 3;
	int SPAN_LINK__DROPPED_ATTRIBUTES_COUNT = 4;
	int SPAN_LINK__FLAGS = 5;
	int SPAN_LINK_FEATURE_COUNT = 6;
	int SPAN_LINK_OPERATION_COUNT = 0;

	// SPAN_STATUS features
	int SPAN_STATUS__MESSAGE = 0;
	int SPAN_STATUS__CODE = 1;
	int SPAN_STATUS_FEATURE_COUNT = 2;
	int SPAN_STATUS_OPERATION_COUNT = 0;

	// METRICS_DATA features
	int METRICS_DATA__RESOURCE_METRICS = 0;
	int METRICS_DATA_FEATURE_COUNT = 1;
	int METRICS_DATA_OPERATION_COUNT = 0;

	// RESOURCE_METRICS features
	int RESOURCE_METRICS__RESOURCE = 0;
	int RESOURCE_METRICS__SCOPE_METRICS = 1;
	int RESOURCE_METRICS__SCHEMA_URL = 2;
	int RESOURCE_METRICS_FEATURE_COUNT = 3;
	int RESOURCE_METRICS_OPERATION_COUNT = 0;

	// SCOPE_METRICS features
	int SCOPE_METRICS__SCOPE = 0;
	int SCOPE_METRICS__METRICS = 1;
	int SCOPE_METRICS__SCHEMA_URL = 2;
	int SCOPE_METRICS_FEATURE_COUNT = 3;
	int SCOPE_METRICS_OPERATION_COUNT = 0;

	// METRIC features
	int METRIC__NAME = 0;
	int METRIC__DESCRIPTION = 1;
	int METRIC__UNIT = 2;
	int METRIC__METADATA = 3;
	int METRIC_FEATURE_COUNT = 4;
	int METRIC_OPERATION_COUNT = 0;

	// GAUGE features (extends METRIC)
	int GAUGE__NAME = METRIC__NAME;
	int GAUGE__DESCRIPTION = METRIC__DESCRIPTION;
	int GAUGE__UNIT = METRIC__UNIT;
	int GAUGE__METADATA = METRIC__METADATA;
	int GAUGE__DATA_POINTS = METRIC_FEATURE_COUNT + 0;
	int GAUGE_FEATURE_COUNT = METRIC_FEATURE_COUNT + 1;
	int GAUGE_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	// SUM features (extends METRIC)
	int SUM__NAME = METRIC__NAME;
	int SUM__DESCRIPTION = METRIC__DESCRIPTION;
	int SUM__UNIT = METRIC__UNIT;
	int SUM__METADATA = METRIC__METADATA;
	int SUM__DATA_POINTS = METRIC_FEATURE_COUNT + 0;
	int SUM__AGGREGATION_TEMPORALITY = METRIC_FEATURE_COUNT + 1;
	int SUM__IS_MONOTONIC = METRIC_FEATURE_COUNT + 2;
	int SUM_FEATURE_COUNT = METRIC_FEATURE_COUNT + 3;
	int SUM_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	// HISTOGRAM features (extends METRIC)
	int HISTOGRAM__NAME = METRIC__NAME;
	int HISTOGRAM__DESCRIPTION = METRIC__DESCRIPTION;
	int HISTOGRAM__UNIT = METRIC__UNIT;
	int HISTOGRAM__METADATA = METRIC__METADATA;
	int HISTOGRAM__DATA_POINTS = METRIC_FEATURE_COUNT + 0;
	int HISTOGRAM__AGGREGATION_TEMPORALITY = METRIC_FEATURE_COUNT + 1;
	int HISTOGRAM_FEATURE_COUNT = METRIC_FEATURE_COUNT + 2;
	int HISTOGRAM_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	// EXPONENTIAL_HISTOGRAM features (extends METRIC)
	int EXPONENTIAL_HISTOGRAM__NAME = METRIC__NAME;
	int EXPONENTIAL_HISTOGRAM__DESCRIPTION = METRIC__DESCRIPTION;
	int EXPONENTIAL_HISTOGRAM__UNIT = METRIC__UNIT;
	int EXPONENTIAL_HISTOGRAM__METADATA = METRIC__METADATA;
	int EXPONENTIAL_HISTOGRAM__DATA_POINTS = METRIC_FEATURE_COUNT + 0;
	int EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY = METRIC_FEATURE_COUNT + 1;
	int EXPONENTIAL_HISTOGRAM_FEATURE_COUNT = METRIC_FEATURE_COUNT + 2;
	int EXPONENTIAL_HISTOGRAM_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	// SUMMARY features (extends METRIC)
	int SUMMARY__NAME = METRIC__NAME;
	int SUMMARY__DESCRIPTION = METRIC__DESCRIPTION;
	int SUMMARY__UNIT = METRIC__UNIT;
	int SUMMARY__METADATA = METRIC__METADATA;
	int SUMMARY__DATA_POINTS = METRIC_FEATURE_COUNT + 0;
	int SUMMARY_FEATURE_COUNT = METRIC_FEATURE_COUNT + 1;
	int SUMMARY_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	// NUMBER_DATA_POINT features
	int NUMBER_DATA_POINT__ATTRIBUTES = 0;
	int NUMBER_DATA_POINT__START_TIME_UNIX_NANO = 1;
	int NUMBER_DATA_POINT__TIME_UNIX_NANO = 2;
	int NUMBER_DATA_POINT__AS_DOUBLE = 3;
	int NUMBER_DATA_POINT__AS_INT = 4;
	int NUMBER_DATA_POINT__EXEMPLARS = 5;
	int NUMBER_DATA_POINT__FLAGS = 6;
	int NUMBER_DATA_POINT_FEATURE_COUNT = 7;
	int NUMBER_DATA_POINT_OPERATION_COUNT = 0;

	// HISTOGRAM_DATA_POINT features
	int HISTOGRAM_DATA_POINT__ATTRIBUTES = 0;
	int HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO = 1;
	int HISTOGRAM_DATA_POINT__TIME_UNIX_NANO = 2;
	int HISTOGRAM_DATA_POINT__COUNT = 3;
	int HISTOGRAM_DATA_POINT__SUM = 4;
	int HISTOGRAM_DATA_POINT__BUCKET_COUNTS = 5;
	int HISTOGRAM_DATA_POINT__EXPLICIT_BOUNDS = 6;
	int HISTOGRAM_DATA_POINT__EXEMPLARS = 7;
	int HISTOGRAM_DATA_POINT__FLAGS = 8;
	int HISTOGRAM_DATA_POINT__MIN = 9;
	int HISTOGRAM_DATA_POINT__MAX = 10;
	int HISTOGRAM_DATA_POINT_FEATURE_COUNT = 11;
	int HISTOGRAM_DATA_POINT_OPERATION_COUNT = 0;

	// EXPONENTIAL_HISTOGRAM_DATA_POINT features
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__ATTRIBUTES = 0;
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO = 1;
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__TIME_UNIX_NANO = 2;
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__COUNT = 3;
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__SUM = 4;
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__SCALE = 5;
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_COUNT = 6;
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__POSITIVE = 7;
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__NEGATIVE = 8;
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__FLAGS = 9;
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__EXEMPLARS = 10;
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__MIN = 11;
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__MAX = 12;
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_THRESHOLD = 13;
	int EXPONENTIAL_HISTOGRAM_DATA_POINT_FEATURE_COUNT = 14;
	int EXPONENTIAL_HISTOGRAM_DATA_POINT_OPERATION_COUNT = 0;

	// EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS features
	int EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__OFFSET = 0;
	int EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__BUCKET_COUNTS = 1;
	int EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS_FEATURE_COUNT = 2;
	int EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS_OPERATION_COUNT = 0;

	// SUMMARY_DATA_POINT features
	int SUMMARY_DATA_POINT__ATTRIBUTES = 0;
	int SUMMARY_DATA_POINT__START_TIME_UNIX_NANO = 1;
	int SUMMARY_DATA_POINT__TIME_UNIX_NANO = 2;
	int SUMMARY_DATA_POINT__COUNT = 3;
	int SUMMARY_DATA_POINT__SUM = 4;
	int SUMMARY_DATA_POINT__QUANTILE_VALUES = 5;
	int SUMMARY_DATA_POINT__FLAGS = 6;
	int SUMMARY_DATA_POINT_FEATURE_COUNT = 7;
	int SUMMARY_DATA_POINT_OPERATION_COUNT = 0;

	// SUMMARY_DATA_POINT_VALUE_AT_QUANTILE features
	int SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__QUANTILE = 0;
	int SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__VALUE = 1;
	int SUMMARY_DATA_POINT_VALUE_AT_QUANTILE_FEATURE_COUNT = 2;
	int SUMMARY_DATA_POINT_VALUE_AT_QUANTILE_OPERATION_COUNT = 0;

	// EXEMPLAR features
	int EXEMPLAR__FILTERED_ATTRIBUTES = 0;
	int EXEMPLAR__TIME_UNIX_NANO = 1;
	int EXEMPLAR__AS_DOUBLE = 2;
	int EXEMPLAR__AS_INT = 3;
	int EXEMPLAR__SPAN_ID = 4;
	int EXEMPLAR__TRACE_ID = 5;
	int EXEMPLAR_FEATURE_COUNT = 6;
	int EXEMPLAR_OPERATION_COUNT = 0;

	// LOGS_DATA features
	int LOGS_DATA__RESOURCE_LOGS = 0;
	int LOGS_DATA_FEATURE_COUNT = 1;
	int LOGS_DATA_OPERATION_COUNT = 0;

	// RESOURCE_LOGS features
	int RESOURCE_LOGS__RESOURCE = 0;
	int RESOURCE_LOGS__SCOPE_LOGS = 1;
	int RESOURCE_LOGS__SCHEMA_URL = 2;
	int RESOURCE_LOGS_FEATURE_COUNT = 3;
	int RESOURCE_LOGS_OPERATION_COUNT = 0;

	// SCOPE_LOGS features
	int SCOPE_LOGS__SCOPE = 0;
	int SCOPE_LOGS__LOG_RECORDS = 1;
	int SCOPE_LOGS__SCHEMA_URL = 2;
	int SCOPE_LOGS_FEATURE_COUNT = 3;
	int SCOPE_LOGS_OPERATION_COUNT = 0;

	// LOG_RECORD features
	int LOG_RECORD__TIME_UNIX_NANO = 0;
	int LOG_RECORD__OBSERVED_TIME_UNIX_NANO = 1;
	int LOG_RECORD__SEVERITY_NUMBER = 2;
	int LOG_RECORD__SEVERITY_TEXT = 3;
	int LOG_RECORD__BODY = 4;
	int LOG_RECORD__ATTRIBUTES = 5;
	int LOG_RECORD__DROPPED_ATTRIBUTES_COUNT = 6;
	int LOG_RECORD__FLAGS = 7;
	int LOG_RECORD__TRACE_ID = 8;
	int LOG_RECORD__SPAN_ID = 9;
	int LOG_RECORD_FEATURE_COUNT = 10;
	int LOG_RECORD_OPERATION_COUNT = 0;

	// EClass accessors
	EClass getResource();
	EReference getResource_Attributes();
	EAttribute getResource_DroppedAttributesCount();
	EAttribute getResource_SchemaUrl();

	EClass getInstrumentationScope();
	EAttribute getInstrumentationScope_Name();
	EAttribute getInstrumentationScope_Version();
	EReference getInstrumentationScope_Attributes();
	EAttribute getInstrumentationScope_DroppedAttributesCount();
	EAttribute getInstrumentationScope_SchemaUrl();

	EClass getKeyValue();
	EAttribute getKeyValue_Key();
	EReference getKeyValue_Value();

	EClass getAnyValue();
	EAttribute getAnyValue_StringValue();
	EAttribute getAnyValue_BoolValue();
	EAttribute getAnyValue_IntValue();
	EAttribute getAnyValue_DoubleValue();
	EReference getAnyValue_ArrayValue();
	EReference getAnyValue_KvlistValue();
	EAttribute getAnyValue_BytesValue();

	EClass getTracesData();
	EReference getTracesData_ResourceSpans();

	EClass getResourceSpans();
	EReference getResourceSpans_Resource();
	EReference getResourceSpans_ScopeSpans();
	EAttribute getResourceSpans_SchemaUrl();

	EClass getScopeSpans();
	EReference getScopeSpans_Scope();
	EReference getScopeSpans_Spans();
	EAttribute getScopeSpans_SchemaUrl();

	EClass getSpan();
	EAttribute getSpan_TraceId();
	EAttribute getSpan_SpanId();
	EAttribute getSpan_TraceState();
	EAttribute getSpan_ParentSpanId();
	EAttribute getSpan_Name();
	EAttribute getSpan_Kind();
	EAttribute getSpan_StartTimeUnixNano();
	EAttribute getSpan_EndTimeUnixNano();
	EReference getSpan_Attributes();
	EAttribute getSpan_DroppedAttributesCount();
	EReference getSpan_Events();
	EAttribute getSpan_DroppedEventsCount();
	EReference getSpan_Links();
	EAttribute getSpan_DroppedLinksCount();
	EReference getSpan_Status();
	EAttribute getSpan_Flags();

	EClass getSpanEvent();
	EAttribute getSpanEvent_TimeUnixNano();
	EAttribute getSpanEvent_Name();
	EReference getSpanEvent_Attributes();
	EAttribute getSpanEvent_DroppedAttributesCount();

	EClass getSpanLink();
	EAttribute getSpanLink_TraceId();
	EAttribute getSpanLink_SpanId();
	EAttribute getSpanLink_TraceState();
	EReference getSpanLink_Attributes();
	EAttribute getSpanLink_DroppedAttributesCount();
	EAttribute getSpanLink_Flags();

	EClass getSpanStatus();
	EAttribute getSpanStatus_Message();
	EAttribute getSpanStatus_Code();

	EClass getMetricsData();
	EReference getMetricsData_ResourceMetrics();

	EClass getResourceMetrics();
	EReference getResourceMetrics_Resource();
	EReference getResourceMetrics_ScopeMetrics();
	EAttribute getResourceMetrics_SchemaUrl();

	EClass getScopeMetrics();
	EReference getScopeMetrics_Scope();
	EReference getScopeMetrics_Metrics();
	EAttribute getScopeMetrics_SchemaUrl();

	EClass getMetric();
	EAttribute getMetric_Name();
	EAttribute getMetric_Description();
	EAttribute getMetric_Unit();
	EReference getMetric_Metadata();

	EClass getGauge();
	EReference getGauge_DataPoints();

	EClass getSum();
	EReference getSum_DataPoints();
	EAttribute getSum_AggregationTemporality();
	EAttribute getSum_IsMonotonic();

	EClass getHistogram();
	EReference getHistogram_DataPoints();
	EAttribute getHistogram_AggregationTemporality();

	EClass getExponentialHistogram();
	EReference getExponentialHistogram_DataPoints();
	EAttribute getExponentialHistogram_AggregationTemporality();

	EClass getSummary();
	EReference getSummary_DataPoints();

	EClass getNumberDataPoint();
	EReference getNumberDataPoint_Attributes();
	EAttribute getNumberDataPoint_StartTimeUnixNano();
	EAttribute getNumberDataPoint_TimeUnixNano();
	EAttribute getNumberDataPoint_AsDouble();
	EAttribute getNumberDataPoint_AsInt();
	EReference getNumberDataPoint_Exemplars();
	EAttribute getNumberDataPoint_Flags();

	EClass getHistogramDataPoint();
	EReference getHistogramDataPoint_Attributes();
	EAttribute getHistogramDataPoint_StartTimeUnixNano();
	EAttribute getHistogramDataPoint_TimeUnixNano();
	EAttribute getHistogramDataPoint_Count();
	EAttribute getHistogramDataPoint_Sum();
	EAttribute getHistogramDataPoint_BucketCounts();
	EAttribute getHistogramDataPoint_ExplicitBounds();
	EReference getHistogramDataPoint_Exemplars();
	EAttribute getHistogramDataPoint_Flags();
	EAttribute getHistogramDataPoint_Min();
	EAttribute getHistogramDataPoint_Max();

	EClass getExponentialHistogramDataPoint();
	EReference getExponentialHistogramDataPoint_Attributes();
	EAttribute getExponentialHistogramDataPoint_StartTimeUnixNano();
	EAttribute getExponentialHistogramDataPoint_TimeUnixNano();
	EAttribute getExponentialHistogramDataPoint_Count();
	EAttribute getExponentialHistogramDataPoint_Sum();
	EAttribute getExponentialHistogramDataPoint_Scale();
	EAttribute getExponentialHistogramDataPoint_ZeroCount();
	EReference getExponentialHistogramDataPoint_Positive();
	EReference getExponentialHistogramDataPoint_Negative();
	EAttribute getExponentialHistogramDataPoint_Flags();
	EReference getExponentialHistogramDataPoint_Exemplars();
	EAttribute getExponentialHistogramDataPoint_Min();
	EAttribute getExponentialHistogramDataPoint_Max();
	EAttribute getExponentialHistogramDataPoint_ZeroThreshold();

	EClass getExponentialHistogramDataPointBuckets();
	EAttribute getExponentialHistogramDataPointBuckets_Offset();
	EAttribute getExponentialHistogramDataPointBuckets_BucketCounts();

	EClass getSummaryDataPoint();
	EReference getSummaryDataPoint_Attributes();
	EAttribute getSummaryDataPoint_StartTimeUnixNano();
	EAttribute getSummaryDataPoint_TimeUnixNano();
	EAttribute getSummaryDataPoint_Count();
	EAttribute getSummaryDataPoint_Sum();
	EReference getSummaryDataPoint_QuantileValues();
	EAttribute getSummaryDataPoint_Flags();

	EClass getSummaryDataPointValueAtQuantile();
	EAttribute getSummaryDataPointValueAtQuantile_Quantile();
	EAttribute getSummaryDataPointValueAtQuantile_Value();

	EClass getExemplar();
	EReference getExemplar_FilteredAttributes();
	EAttribute getExemplar_TimeUnixNano();
	EAttribute getExemplar_AsDouble();
	EAttribute getExemplar_AsInt();
	EAttribute getExemplar_SpanId();
	EAttribute getExemplar_TraceId();

	EClass getLogsData();
	EReference getLogsData_ResourceLogs();

	EClass getResourceLogs();
	EReference getResourceLogs_Resource();
	EReference getResourceLogs_ScopeLogs();
	EAttribute getResourceLogs_SchemaUrl();

	EClass getScopeLogs();
	EReference getScopeLogs_Scope();
	EReference getScopeLogs_LogRecords();
	EAttribute getScopeLogs_SchemaUrl();

	EClass getLogRecord();
	EAttribute getLogRecord_TimeUnixNano();
	EAttribute getLogRecord_ObservedTimeUnixNano();
	EAttribute getLogRecord_SeverityNumber();
	EAttribute getLogRecord_SeverityText();
	EReference getLogRecord_Body();
	EReference getLogRecord_Attributes();
	EAttribute getLogRecord_DroppedAttributesCount();
	EAttribute getLogRecord_Flags();
	EAttribute getLogRecord_TraceId();
	EAttribute getLogRecord_SpanId();

	EEnum getSpanKind();
	EEnum getStatusCode();
	EEnum getAggregationTemporality();
	EEnum getSeverityNumber();

	TelemetryFactory getTelemetryFactory();

	/**
	 * Defines literals for the meta objects that represent each class, feature, operation, and enum.
	 * @generated
	 */
	interface Literals {
		EClass RESOURCE = eINSTANCE.getResource();
		EReference RESOURCE__ATTRIBUTES = (EReference)eINSTANCE.getResource().getEStructuralFeatures().get(0);
		EAttribute RESOURCE__DROPPED_ATTRIBUTES_COUNT = (EAttribute)eINSTANCE.getResource().getEStructuralFeatures().get(1);
		EAttribute RESOURCE__SCHEMA_URL = (EAttribute)eINSTANCE.getResource().getEStructuralFeatures().get(2);

		EClass INSTRUMENTATION_SCOPE = eINSTANCE.getInstrumentationScope();
		EAttribute INSTRUMENTATION_SCOPE__NAME = (EAttribute)eINSTANCE.getInstrumentationScope().getEStructuralFeatures().get(0);
		EAttribute INSTRUMENTATION_SCOPE__VERSION = (EAttribute)eINSTANCE.getInstrumentationScope().getEStructuralFeatures().get(1);
		EReference INSTRUMENTATION_SCOPE__ATTRIBUTES = (EReference)eINSTANCE.getInstrumentationScope().getEStructuralFeatures().get(2);
		EAttribute INSTRUMENTATION_SCOPE__DROPPED_ATTRIBUTES_COUNT = (EAttribute)eINSTANCE.getInstrumentationScope().getEStructuralFeatures().get(3);
		EAttribute INSTRUMENTATION_SCOPE__SCHEMA_URL = (EAttribute)eINSTANCE.getInstrumentationScope().getEStructuralFeatures().get(4);

		EClass KEY_VALUE = eINSTANCE.getKeyValue();
		EAttribute KEY_VALUE__KEY = (EAttribute)eINSTANCE.getKeyValue().getEStructuralFeatures().get(0);
		EReference KEY_VALUE__VALUE = (EReference)eINSTANCE.getKeyValue().getEStructuralFeatures().get(1);

		EClass ANY_VALUE = eINSTANCE.getAnyValue();
		EAttribute ANY_VALUE__STRING_VALUE = (EAttribute)eINSTANCE.getAnyValue().getEStructuralFeatures().get(0);
		EAttribute ANY_VALUE__BOOL_VALUE = (EAttribute)eINSTANCE.getAnyValue().getEStructuralFeatures().get(1);
		EAttribute ANY_VALUE__INT_VALUE = (EAttribute)eINSTANCE.getAnyValue().getEStructuralFeatures().get(2);
		EAttribute ANY_VALUE__DOUBLE_VALUE = (EAttribute)eINSTANCE.getAnyValue().getEStructuralFeatures().get(3);
		EReference ANY_VALUE__ARRAY_VALUE = (EReference)eINSTANCE.getAnyValue().getEStructuralFeatures().get(4);
		EReference ANY_VALUE__KVLIST_VALUE = (EReference)eINSTANCE.getAnyValue().getEStructuralFeatures().get(5);
		EAttribute ANY_VALUE__BYTES_VALUE = (EAttribute)eINSTANCE.getAnyValue().getEStructuralFeatures().get(6);

		EClass TRACES_DATA = eINSTANCE.getTracesData();
		EReference TRACES_DATA__RESOURCE_SPANS = (EReference)eINSTANCE.getTracesData().getEStructuralFeatures().get(0);

		EClass RESOURCE_SPANS = eINSTANCE.getResourceSpans();
		EReference RESOURCE_SPANS__RESOURCE = (EReference)eINSTANCE.getResourceSpans().getEStructuralFeatures().get(0);
		EReference RESOURCE_SPANS__SCOPE_SPANS = (EReference)eINSTANCE.getResourceSpans().getEStructuralFeatures().get(1);
		EAttribute RESOURCE_SPANS__SCHEMA_URL = (EAttribute)eINSTANCE.getResourceSpans().getEStructuralFeatures().get(2);

		EClass SCOPE_SPANS = eINSTANCE.getScopeSpans();
		EReference SCOPE_SPANS__SCOPE = (EReference)eINSTANCE.getScopeSpans().getEStructuralFeatures().get(0);
		EReference SCOPE_SPANS__SPANS = (EReference)eINSTANCE.getScopeSpans().getEStructuralFeatures().get(1);
		EAttribute SCOPE_SPANS__SCHEMA_URL = (EAttribute)eINSTANCE.getScopeSpans().getEStructuralFeatures().get(2);

		EClass SPAN = eINSTANCE.getSpan();
		EAttribute SPAN__TRACE_ID = (EAttribute)eINSTANCE.getSpan().getEStructuralFeatures().get(0);
		EAttribute SPAN__SPAN_ID = (EAttribute)eINSTANCE.getSpan().getEStructuralFeatures().get(1);
		EAttribute SPAN__TRACE_STATE = (EAttribute)eINSTANCE.getSpan().getEStructuralFeatures().get(2);
		EAttribute SPAN__PARENT_SPAN_ID = (EAttribute)eINSTANCE.getSpan().getEStructuralFeatures().get(3);
		EAttribute SPAN__NAME = (EAttribute)eINSTANCE.getSpan().getEStructuralFeatures().get(4);
		EAttribute SPAN__KIND = (EAttribute)eINSTANCE.getSpan().getEStructuralFeatures().get(5);
		EAttribute SPAN__START_TIME_UNIX_NANO = (EAttribute)eINSTANCE.getSpan().getEStructuralFeatures().get(6);
		EAttribute SPAN__END_TIME_UNIX_NANO = (EAttribute)eINSTANCE.getSpan().getEStructuralFeatures().get(7);
		EReference SPAN__ATTRIBUTES = (EReference)eINSTANCE.getSpan().getEStructuralFeatures().get(8);
		EAttribute SPAN__DROPPED_ATTRIBUTES_COUNT = (EAttribute)eINSTANCE.getSpan().getEStructuralFeatures().get(9);
		EReference SPAN__EVENTS = (EReference)eINSTANCE.getSpan().getEStructuralFeatures().get(10);
		EAttribute SPAN__DROPPED_EVENTS_COUNT = (EAttribute)eINSTANCE.getSpan().getEStructuralFeatures().get(11);
		EReference SPAN__LINKS = (EReference)eINSTANCE.getSpan().getEStructuralFeatures().get(12);
		EAttribute SPAN__DROPPED_LINKS_COUNT = (EAttribute)eINSTANCE.getSpan().getEStructuralFeatures().get(13);
		EReference SPAN__STATUS = (EReference)eINSTANCE.getSpan().getEStructuralFeatures().get(14);
		EAttribute SPAN__FLAGS = (EAttribute)eINSTANCE.getSpan().getEStructuralFeatures().get(15);

		EClass SPAN_EVENT = eINSTANCE.getSpanEvent();
		EAttribute SPAN_EVENT__TIME_UNIX_NANO = (EAttribute)eINSTANCE.getSpanEvent().getEStructuralFeatures().get(0);
		EAttribute SPAN_EVENT__NAME = (EAttribute)eINSTANCE.getSpanEvent().getEStructuralFeatures().get(1);
		EReference SPAN_EVENT__ATTRIBUTES = (EReference)eINSTANCE.getSpanEvent().getEStructuralFeatures().get(2);
		EAttribute SPAN_EVENT__DROPPED_ATTRIBUTES_COUNT = (EAttribute)eINSTANCE.getSpanEvent().getEStructuralFeatures().get(3);

		EClass SPAN_LINK = eINSTANCE.getSpanLink();
		EAttribute SPAN_LINK__TRACE_ID = (EAttribute)eINSTANCE.getSpanLink().getEStructuralFeatures().get(0);
		EAttribute SPAN_LINK__SPAN_ID = (EAttribute)eINSTANCE.getSpanLink().getEStructuralFeatures().get(1);
		EAttribute SPAN_LINK__TRACE_STATE = (EAttribute)eINSTANCE.getSpanLink().getEStructuralFeatures().get(2);
		EReference SPAN_LINK__ATTRIBUTES = (EReference)eINSTANCE.getSpanLink().getEStructuralFeatures().get(3);
		EAttribute SPAN_LINK__DROPPED_ATTRIBUTES_COUNT = (EAttribute)eINSTANCE.getSpanLink().getEStructuralFeatures().get(4);
		EAttribute SPAN_LINK__FLAGS = (EAttribute)eINSTANCE.getSpanLink().getEStructuralFeatures().get(5);

		EClass SPAN_STATUS = eINSTANCE.getSpanStatus();
		EAttribute SPAN_STATUS__MESSAGE = (EAttribute)eINSTANCE.getSpanStatus().getEStructuralFeatures().get(0);
		EAttribute SPAN_STATUS__CODE = (EAttribute)eINSTANCE.getSpanStatus().getEStructuralFeatures().get(1);

		EClass METRICS_DATA = eINSTANCE.getMetricsData();
		EReference METRICS_DATA__RESOURCE_METRICS = (EReference)eINSTANCE.getMetricsData().getEStructuralFeatures().get(0);

		EClass RESOURCE_METRICS = eINSTANCE.getResourceMetrics();
		EReference RESOURCE_METRICS__RESOURCE = (EReference)eINSTANCE.getResourceMetrics().getEStructuralFeatures().get(0);
		EReference RESOURCE_METRICS__SCOPE_METRICS = (EReference)eINSTANCE.getResourceMetrics().getEStructuralFeatures().get(1);
		EAttribute RESOURCE_METRICS__SCHEMA_URL = (EAttribute)eINSTANCE.getResourceMetrics().getEStructuralFeatures().get(2);

		EClass SCOPE_METRICS = eINSTANCE.getScopeMetrics();
		EReference SCOPE_METRICS__SCOPE = (EReference)eINSTANCE.getScopeMetrics().getEStructuralFeatures().get(0);
		EReference SCOPE_METRICS__METRICS = (EReference)eINSTANCE.getScopeMetrics().getEStructuralFeatures().get(1);
		EAttribute SCOPE_METRICS__SCHEMA_URL = (EAttribute)eINSTANCE.getScopeMetrics().getEStructuralFeatures().get(2);

		EClass METRIC = eINSTANCE.getMetric();
		EAttribute METRIC__NAME = (EAttribute)eINSTANCE.getMetric().getEStructuralFeatures().get(0);
		EAttribute METRIC__DESCRIPTION = (EAttribute)eINSTANCE.getMetric().getEStructuralFeatures().get(1);
		EAttribute METRIC__UNIT = (EAttribute)eINSTANCE.getMetric().getEStructuralFeatures().get(2);
		EReference METRIC__METADATA = (EReference)eINSTANCE.getMetric().getEStructuralFeatures().get(3);

		EClass GAUGE = eINSTANCE.getGauge();
		EReference GAUGE__DATA_POINTS = (EReference)eINSTANCE.getGauge().getEStructuralFeatures().get(0);

		EClass SUM = eINSTANCE.getSum();
		EReference SUM__DATA_POINTS = (EReference)eINSTANCE.getSum().getEStructuralFeatures().get(0);
		EAttribute SUM__AGGREGATION_TEMPORALITY = (EAttribute)eINSTANCE.getSum().getEStructuralFeatures().get(1);
		EAttribute SUM__IS_MONOTONIC = (EAttribute)eINSTANCE.getSum().getEStructuralFeatures().get(2);

		EClass HISTOGRAM = eINSTANCE.getHistogram();
		EReference HISTOGRAM__DATA_POINTS = (EReference)eINSTANCE.getHistogram().getEStructuralFeatures().get(0);
		EAttribute HISTOGRAM__AGGREGATION_TEMPORALITY = (EAttribute)eINSTANCE.getHistogram().getEStructuralFeatures().get(1);

		EClass EXPONENTIAL_HISTOGRAM = eINSTANCE.getExponentialHistogram();
		EReference EXPONENTIAL_HISTOGRAM__DATA_POINTS = (EReference)eINSTANCE.getExponentialHistogram().getEStructuralFeatures().get(0);
		EAttribute EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY = (EAttribute)eINSTANCE.getExponentialHistogram().getEStructuralFeatures().get(1);

		EClass SUMMARY = eINSTANCE.getSummary();
		EReference SUMMARY__DATA_POINTS = (EReference)eINSTANCE.getSummary().getEStructuralFeatures().get(0);

		EClass NUMBER_DATA_POINT = eINSTANCE.getNumberDataPoint();
		EReference NUMBER_DATA_POINT__ATTRIBUTES = (EReference)eINSTANCE.getNumberDataPoint().getEStructuralFeatures().get(0);
		EAttribute NUMBER_DATA_POINT__START_TIME_UNIX_NANO = (EAttribute)eINSTANCE.getNumberDataPoint().getEStructuralFeatures().get(1);
		EAttribute NUMBER_DATA_POINT__TIME_UNIX_NANO = (EAttribute)eINSTANCE.getNumberDataPoint().getEStructuralFeatures().get(2);
		EAttribute NUMBER_DATA_POINT__AS_DOUBLE = (EAttribute)eINSTANCE.getNumberDataPoint().getEStructuralFeatures().get(3);
		EAttribute NUMBER_DATA_POINT__AS_INT = (EAttribute)eINSTANCE.getNumberDataPoint().getEStructuralFeatures().get(4);
		EReference NUMBER_DATA_POINT__EXEMPLARS = (EReference)eINSTANCE.getNumberDataPoint().getEStructuralFeatures().get(5);
		EAttribute NUMBER_DATA_POINT__FLAGS = (EAttribute)eINSTANCE.getNumberDataPoint().getEStructuralFeatures().get(6);

		EClass HISTOGRAM_DATA_POINT = eINSTANCE.getHistogramDataPoint();
		EReference HISTOGRAM_DATA_POINT__ATTRIBUTES = (EReference)eINSTANCE.getHistogramDataPoint().getEStructuralFeatures().get(0);
		EAttribute HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO = (EAttribute)eINSTANCE.getHistogramDataPoint().getEStructuralFeatures().get(1);
		EAttribute HISTOGRAM_DATA_POINT__TIME_UNIX_NANO = (EAttribute)eINSTANCE.getHistogramDataPoint().getEStructuralFeatures().get(2);
		EAttribute HISTOGRAM_DATA_POINT__COUNT = (EAttribute)eINSTANCE.getHistogramDataPoint().getEStructuralFeatures().get(3);
		EAttribute HISTOGRAM_DATA_POINT__SUM = (EAttribute)eINSTANCE.getHistogramDataPoint().getEStructuralFeatures().get(4);
		EAttribute HISTOGRAM_DATA_POINT__BUCKET_COUNTS = (EAttribute)eINSTANCE.getHistogramDataPoint().getEStructuralFeatures().get(5);
		EAttribute HISTOGRAM_DATA_POINT__EXPLICIT_BOUNDS = (EAttribute)eINSTANCE.getHistogramDataPoint().getEStructuralFeatures().get(6);
		EReference HISTOGRAM_DATA_POINT__EXEMPLARS = (EReference)eINSTANCE.getHistogramDataPoint().getEStructuralFeatures().get(7);
		EAttribute HISTOGRAM_DATA_POINT__FLAGS = (EAttribute)eINSTANCE.getHistogramDataPoint().getEStructuralFeatures().get(8);
		EAttribute HISTOGRAM_DATA_POINT__MIN = (EAttribute)eINSTANCE.getHistogramDataPoint().getEStructuralFeatures().get(9);
		EAttribute HISTOGRAM_DATA_POINT__MAX = (EAttribute)eINSTANCE.getHistogramDataPoint().getEStructuralFeatures().get(10);

		EClass EXPONENTIAL_HISTOGRAM_DATA_POINT = eINSTANCE.getExponentialHistogramDataPoint();
		EReference EXPONENTIAL_HISTOGRAM_DATA_POINT__ATTRIBUTES = (EReference)eINSTANCE.getExponentialHistogramDataPoint().getEStructuralFeatures().get(0);
		EAttribute EXPONENTIAL_HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO = (EAttribute)eINSTANCE.getExponentialHistogramDataPoint().getEStructuralFeatures().get(1);
		EAttribute EXPONENTIAL_HISTOGRAM_DATA_POINT__TIME_UNIX_NANO = (EAttribute)eINSTANCE.getExponentialHistogramDataPoint().getEStructuralFeatures().get(2);
		EAttribute EXPONENTIAL_HISTOGRAM_DATA_POINT__COUNT = (EAttribute)eINSTANCE.getExponentialHistogramDataPoint().getEStructuralFeatures().get(3);
		EAttribute EXPONENTIAL_HISTOGRAM_DATA_POINT__SUM = (EAttribute)eINSTANCE.getExponentialHistogramDataPoint().getEStructuralFeatures().get(4);
		EAttribute EXPONENTIAL_HISTOGRAM_DATA_POINT__SCALE = (EAttribute)eINSTANCE.getExponentialHistogramDataPoint().getEStructuralFeatures().get(5);
		EAttribute EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_COUNT = (EAttribute)eINSTANCE.getExponentialHistogramDataPoint().getEStructuralFeatures().get(6);
		EReference EXPONENTIAL_HISTOGRAM_DATA_POINT__POSITIVE = (EReference)eINSTANCE.getExponentialHistogramDataPoint().getEStructuralFeatures().get(7);
		EReference EXPONENTIAL_HISTOGRAM_DATA_POINT__NEGATIVE = (EReference)eINSTANCE.getExponentialHistogramDataPoint().getEStructuralFeatures().get(8);
		EAttribute EXPONENTIAL_HISTOGRAM_DATA_POINT__FLAGS = (EAttribute)eINSTANCE.getExponentialHistogramDataPoint().getEStructuralFeatures().get(9);
		EReference EXPONENTIAL_HISTOGRAM_DATA_POINT__EXEMPLARS = (EReference)eINSTANCE.getExponentialHistogramDataPoint().getEStructuralFeatures().get(10);
		EAttribute EXPONENTIAL_HISTOGRAM_DATA_POINT__MIN = (EAttribute)eINSTANCE.getExponentialHistogramDataPoint().getEStructuralFeatures().get(11);
		EAttribute EXPONENTIAL_HISTOGRAM_DATA_POINT__MAX = (EAttribute)eINSTANCE.getExponentialHistogramDataPoint().getEStructuralFeatures().get(12);
		EAttribute EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_THRESHOLD = (EAttribute)eINSTANCE.getExponentialHistogramDataPoint().getEStructuralFeatures().get(13);

		EClass EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS = eINSTANCE.getExponentialHistogramDataPointBuckets();
		EAttribute EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__OFFSET = (EAttribute)eINSTANCE.getExponentialHistogramDataPointBuckets().getEStructuralFeatures().get(0);
		EAttribute EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__BUCKET_COUNTS = (EAttribute)eINSTANCE.getExponentialHistogramDataPointBuckets().getEStructuralFeatures().get(1);

		EClass SUMMARY_DATA_POINT = eINSTANCE.getSummaryDataPoint();
		EReference SUMMARY_DATA_POINT__ATTRIBUTES = (EReference)eINSTANCE.getSummaryDataPoint().getEStructuralFeatures().get(0);
		EAttribute SUMMARY_DATA_POINT__START_TIME_UNIX_NANO = (EAttribute)eINSTANCE.getSummaryDataPoint().getEStructuralFeatures().get(1);
		EAttribute SUMMARY_DATA_POINT__TIME_UNIX_NANO = (EAttribute)eINSTANCE.getSummaryDataPoint().getEStructuralFeatures().get(2);
		EAttribute SUMMARY_DATA_POINT__COUNT = (EAttribute)eINSTANCE.getSummaryDataPoint().getEStructuralFeatures().get(3);
		EAttribute SUMMARY_DATA_POINT__SUM = (EAttribute)eINSTANCE.getSummaryDataPoint().getEStructuralFeatures().get(4);
		EReference SUMMARY_DATA_POINT__QUANTILE_VALUES = (EReference)eINSTANCE.getSummaryDataPoint().getEStructuralFeatures().get(5);
		EAttribute SUMMARY_DATA_POINT__FLAGS = (EAttribute)eINSTANCE.getSummaryDataPoint().getEStructuralFeatures().get(6);

		EClass SUMMARY_DATA_POINT_VALUE_AT_QUANTILE = eINSTANCE.getSummaryDataPointValueAtQuantile();
		EAttribute SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__QUANTILE = (EAttribute)eINSTANCE.getSummaryDataPointValueAtQuantile().getEStructuralFeatures().get(0);
		EAttribute SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__VALUE = (EAttribute)eINSTANCE.getSummaryDataPointValueAtQuantile().getEStructuralFeatures().get(1);

		EClass EXEMPLAR = eINSTANCE.getExemplar();
		EReference EXEMPLAR__FILTERED_ATTRIBUTES = (EReference)eINSTANCE.getExemplar().getEStructuralFeatures().get(0);
		EAttribute EXEMPLAR__TIME_UNIX_NANO = (EAttribute)eINSTANCE.getExemplar().getEStructuralFeatures().get(1);
		EAttribute EXEMPLAR__AS_DOUBLE = (EAttribute)eINSTANCE.getExemplar().getEStructuralFeatures().get(2);
		EAttribute EXEMPLAR__AS_INT = (EAttribute)eINSTANCE.getExemplar().getEStructuralFeatures().get(3);
		EAttribute EXEMPLAR__SPAN_ID = (EAttribute)eINSTANCE.getExemplar().getEStructuralFeatures().get(4);
		EAttribute EXEMPLAR__TRACE_ID = (EAttribute)eINSTANCE.getExemplar().getEStructuralFeatures().get(5);

		EClass LOGS_DATA = eINSTANCE.getLogsData();
		EReference LOGS_DATA__RESOURCE_LOGS = (EReference)eINSTANCE.getLogsData().getEStructuralFeatures().get(0);

		EClass RESOURCE_LOGS = eINSTANCE.getResourceLogs();
		EReference RESOURCE_LOGS__RESOURCE = (EReference)eINSTANCE.getResourceLogs().getEStructuralFeatures().get(0);
		EReference RESOURCE_LOGS__SCOPE_LOGS = (EReference)eINSTANCE.getResourceLogs().getEStructuralFeatures().get(1);
		EAttribute RESOURCE_LOGS__SCHEMA_URL = (EAttribute)eINSTANCE.getResourceLogs().getEStructuralFeatures().get(2);

		EClass SCOPE_LOGS = eINSTANCE.getScopeLogs();
		EReference SCOPE_LOGS__SCOPE = (EReference)eINSTANCE.getScopeLogs().getEStructuralFeatures().get(0);
		EReference SCOPE_LOGS__LOG_RECORDS = (EReference)eINSTANCE.getScopeLogs().getEStructuralFeatures().get(1);
		EAttribute SCOPE_LOGS__SCHEMA_URL = (EAttribute)eINSTANCE.getScopeLogs().getEStructuralFeatures().get(2);

		EClass LOG_RECORD = eINSTANCE.getLogRecord();
		EAttribute LOG_RECORD__TIME_UNIX_NANO = (EAttribute)eINSTANCE.getLogRecord().getEStructuralFeatures().get(0);
		EAttribute LOG_RECORD__OBSERVED_TIME_UNIX_NANO = (EAttribute)eINSTANCE.getLogRecord().getEStructuralFeatures().get(1);
		EAttribute LOG_RECORD__SEVERITY_NUMBER = (EAttribute)eINSTANCE.getLogRecord().getEStructuralFeatures().get(2);
		EAttribute LOG_RECORD__SEVERITY_TEXT = (EAttribute)eINSTANCE.getLogRecord().getEStructuralFeatures().get(3);
		EReference LOG_RECORD__BODY = (EReference)eINSTANCE.getLogRecord().getEStructuralFeatures().get(4);
		EReference LOG_RECORD__ATTRIBUTES = (EReference)eINSTANCE.getLogRecord().getEStructuralFeatures().get(5);
		EAttribute LOG_RECORD__DROPPED_ATTRIBUTES_COUNT = (EAttribute)eINSTANCE.getLogRecord().getEStructuralFeatures().get(6);
		EAttribute LOG_RECORD__FLAGS = (EAttribute)eINSTANCE.getLogRecord().getEStructuralFeatures().get(7);
		EAttribute LOG_RECORD__TRACE_ID = (EAttribute)eINSTANCE.getLogRecord().getEStructuralFeatures().get(8);
		EAttribute LOG_RECORD__SPAN_ID = (EAttribute)eINSTANCE.getLogRecord().getEStructuralFeatures().get(9);

		EEnum SPAN_KIND = eINSTANCE.getSpanKind();
		EEnum STATUS_CODE = eINSTANCE.getStatusCode();
		EEnum AGGREGATION_TEMPORALITY = eINSTANCE.getAggregationTemporality();
		EEnum SEVERITY_NUMBER = eINSTANCE.getSeverityNumber();
	}

} // TelemetryPackage
