/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.monitoring.model;

/**
 * The properties that define an alarm.
 * For information about alarms, see [Alarms Overview](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#AlarmsOverview).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
 * <p>
 * For information about endpoints and signing API requests, see
 * [About the API](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/API/Concepts/usingapi.htm). For information about available SDKs and tools, see
 * [SDKS and Other Tools](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/API/Concepts/sdks.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Alarm.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class Alarm {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metricCompartmentId")
        private String metricCompartmentId;

        public Builder metricCompartmentId(String metricCompartmentId) {
            this.metricCompartmentId = metricCompartmentId;
            this.__explicitlySet__.add("metricCompartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metricCompartmentIdInSubtree")
        private Boolean metricCompartmentIdInSubtree;

        public Builder metricCompartmentIdInSubtree(Boolean metricCompartmentIdInSubtree) {
            this.metricCompartmentIdInSubtree = metricCompartmentIdInSubtree;
            this.__explicitlySet__.add("metricCompartmentIdInSubtree");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("query")
        private String query;

        public Builder query(String query) {
            this.query = query;
            this.__explicitlySet__.add("query");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resolution")
        private String resolution;

        public Builder resolution(String resolution) {
            this.resolution = resolution;
            this.__explicitlySet__.add("resolution");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pendingDuration")
        private String pendingDuration;

        public Builder pendingDuration(String pendingDuration) {
            this.pendingDuration = pendingDuration;
            this.__explicitlySet__.add("pendingDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Severity severity;

        public Builder severity(Severity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("body")
        private String body;

        public Builder body(String body) {
            this.body = body;
            this.__explicitlySet__.add("body");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destinations")
        private java.util.List<String> destinations;

        public Builder destinations(java.util.List<String> destinations) {
            this.destinations = destinations;
            this.__explicitlySet__.add("destinations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("repeatNotificationDuration")
        private String repeatNotificationDuration;

        public Builder repeatNotificationDuration(String repeatNotificationDuration) {
            this.repeatNotificationDuration = repeatNotificationDuration;
            this.__explicitlySet__.add("repeatNotificationDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("suppression")
        private Suppression suppression;

        public Builder suppression(Suppression suppression) {
            this.suppression = suppression;
            this.__explicitlySet__.add("suppression");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Alarm build() {
            Alarm __instance__ =
                    new Alarm(
                            id,
                            displayName,
                            compartmentId,
                            metricCompartmentId,
                            metricCompartmentIdInSubtree,
                            namespace,
                            query,
                            resolution,
                            pendingDuration,
                            severity,
                            body,
                            destinations,
                            repeatNotificationDuration,
                            suppression,
                            isEnabled,
                            freeformTags,
                            definedTags,
                            lifecycleState,
                            timeCreated,
                            timeUpdated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Alarm o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .metricCompartmentId(o.getMetricCompartmentId())
                            .metricCompartmentIdInSubtree(o.getMetricCompartmentIdInSubtree())
                            .namespace(o.getNamespace())
                            .query(o.getQuery())
                            .resolution(o.getResolution())
                            .pendingDuration(o.getPendingDuration())
                            .severity(o.getSeverity())
                            .body(o.getBody())
                            .destinations(o.getDestinations())
                            .repeatNotificationDuration(o.getRepeatNotificationDuration())
                            .suppression(o.getSuppression())
                            .isEnabled(o.getIsEnabled())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The [OCID](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/General/Concepts/identifiers.htm) of the alarm.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * A user-friendly name for the alarm. It does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * This name is sent as the title for notifications related to this alarm.
     * <p>
     * Example: `High CPU Utilization`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The [OCID](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the alarm.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The [OCID](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the metric
     * being evaluated by the alarm.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricCompartmentId")
    String metricCompartmentId;

    /**
     * When true, the alarm evaluates metrics from all compartments and subcompartments. The parameter can
     * only be set to true when metricCompartmentId is the tenancy OCID (the tenancy is the root compartment).
     * A true value requires the user to have tenancy-level permissions. If this requirement is not met,
     * then the call is rejected. When false, the alarm evaluates metrics from only the compartment specified
     * in metricCompartmentId. Default is false.
     * <p>
     * Example: `true`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricCompartmentIdInSubtree")
    Boolean metricCompartmentIdInSubtree;

    /**
     * The source service or application emitting the metric that is evaluated by the alarm.
     * <p>
     * Example: `oci_computeagent`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    String namespace;

    /**
     * The Monitoring Query Language (MQL) expression to evaluate for the alarm. The Alarms feature of
     * the Monitoring service interprets results for each returned time series as Boolean values,
     * where zero represents false and a non-zero value represents true. A true value means that the trigger
     * rule condition has been met. The query must specify a metric, statistic, interval, and trigger
     * rule (threshold or absence). Supported values for interval: `1m`-`60m` (also `1h`). You can optionally
     * specify dimensions and grouping functions. Supported grouping functions: `grouping()`, `groupBy()`.
     * For details about Monitoring Query Language (MQL), see [Monitoring Query Language (MQL) Reference](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/Monitoring/Reference/mql.htm).
     * For available dimensions, review the metric definition for the supported service.
     * See [Supported Services](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#SupportedServices).
     * <p>
     * Example of threshold alarm:
     * <p>
     * -----
     * <p>
     * CpuUtilization[1m]{availabilityDomain=\"cumS:PHX-AD-1\"}.groupBy(availabilityDomain).percentile(0.9) > 85
     * <p>
     * -----
     * <p>
     * Example of absence alarm:
     * <p>
     * -----
     * <p>
     * CpuUtilization[1m]{availabilityDomain=\"cumS:PHX-AD-1\"}.absent()
     * <p>
     * -----
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    String query;

    /**
     * The time between calculated aggregation windows for the alarm. Supported value: `1m`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resolution")
    String resolution;

    /**
     * The period of time that the condition defined in the alarm must persist before the alarm state
     * changes from \"OK\" to \"FIRING\" or vice versa. For example, a value of 5 minutes means that the
     * alarm must persist in breaching the condition for five minutes before the alarm updates its
     * state to \"FIRING\"; likewise, the alarm must persist in not breaching the condition for five
     * minutes before the alarm updates its state to \"OK.\"
     * <p>
     * The duration is specified as a string in ISO 8601 format (`PT10M` for ten minutes or `PT1H`
     * for one hour). Minimum: PT1M. Maximum: PT1H. Default: PT1M.
     * <p>
     * Under the default value of PT1M, the first evaluation that breaches the alarm updates the
     * state to \"FIRING\" and the first evaluation that does not breach the alarm updates the state
     * to \"OK\".
     * <p>
     * Example: `PT5M`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pendingDuration")
    String pendingDuration;
    /**
     * The perceived type of response required when the alarm is in the \"FIRING\" state.
     * <p>
     * Example: `CRITICAL`
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Severity {
        Critical("CRITICAL"),
        Error("ERROR"),
        Warning("WARNING"),
        Info("INFO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Severity> map;

        static {
            map = new java.util.HashMap<>();
            for (Severity v : Severity.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Severity(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Severity create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Severity', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The perceived type of response required when the alarm is in the \"FIRING\" state.
     * <p>
     * Example: `CRITICAL`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    Severity severity;

    /**
     * The human-readable content of the notification delivered. Oracle recommends providing guidance
     * to operators for resolving the alarm condition. Consider adding links to standard runbook
     * practices. Avoid entering confidential information.
     * <p>
     * Example: `High CPU usage alert. Follow runbook instructions for resolution.`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("body")
    String body;

    /**
     * An array of [OCIDs](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/General/Concepts/identifiers.htm) to which the notifications for
     * this alarm will be delivered. An example destination is an OCID for a topic managed by the
     * Oracle Cloud Infrastructure Notification service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinations")
    java.util.List<String> destinations;

    /**
     * The frequency at which notifications are re-submitted, if the alarm keeps firing without
     * interruption. Format defined by ISO 8601. For example, `PT4H` indicates four hours.
     * Minimum: PT1M. Maximum: P30D.
     * <p>
     * Default value: null (notifications are not re-submitted).
     * <p>
     * Example: `PT2H`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repeatNotificationDuration")
    String repeatNotificationDuration;

    /**
     * The configuration details for suppressing an alarm.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("suppression")
    Suppression suppression;

    /**
     * Whether the alarm is enabled.
     * <p>
     * Example: `true`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    Boolean isEnabled;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;
    /**
     * The current lifecycle state of the alarm.
     * <p>
     * Example: `DELETED`
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current lifecycle state of the alarm.
     * <p>
     * Example: `DELETED`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The date and time the alarm was created. Format defined by RFC3339.
     * <p>
     * Example: `2019-02-01T01:02:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time the alarm was last updated. Format defined by RFC3339.
     * <p>
     * Example: `2019-02-03T01:02:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
