/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.model;

/**
 * The properties that define an alarm.
 * For information about alarms, see [Alarms Overview](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#AlarmsOverview).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
 * <p>
 * For information about endpoints and signing API requests, see
 * [About the API](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm). For information about available SDKs and tools, see
 * [SDKS and Other Tools](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/sdks.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Alarm.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Alarm {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "metricCompartmentId",
        "metricCompartmentIdInSubtree",
        "namespace",
        "resourceGroup",
        "query",
        "resolution",
        "pendingDuration",
        "severity",
        "body",
        "messageFormat",
        "destinations",
        "repeatNotificationDuration",
        "suppression",
        "isEnabled",
        "freeformTags",
        "definedTags",
        "lifecycleState",
        "timeCreated",
        "timeUpdated"
    })
    public Alarm(
            String id,
            String displayName,
            String compartmentId,
            String metricCompartmentId,
            Boolean metricCompartmentIdInSubtree,
            String namespace,
            String resourceGroup,
            String query,
            String resolution,
            String pendingDuration,
            Severity severity,
            String body,
            MessageFormat messageFormat,
            java.util.List<String> destinations,
            String repeatNotificationDuration,
            Suppression suppression,
            Boolean isEnabled,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.metricCompartmentId = metricCompartmentId;
        this.metricCompartmentIdInSubtree = metricCompartmentIdInSubtree;
        this.namespace = namespace;
        this.resourceGroup = resourceGroup;
        this.query = query;
        this.resolution = resolution;
        this.pendingDuration = pendingDuration;
        this.severity = severity;
        this.body = body;
        this.messageFormat = messageFormat;
        this.destinations = destinations;
        this.repeatNotificationDuration = repeatNotificationDuration;
        this.suppression = suppression;
        this.isEnabled = isEnabled;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

        @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
        private String resourceGroup;

        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            this.__explicitlySet__.add("resourceGroup");
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

        @com.fasterxml.jackson.annotation.JsonProperty("messageFormat")
        private MessageFormat messageFormat;

        public Builder messageFormat(MessageFormat messageFormat) {
            this.messageFormat = messageFormat;
            this.__explicitlySet__.add("messageFormat");
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
                            resourceGroup,
                            query,
                            resolution,
                            pendingDuration,
                            severity,
                            body,
                            messageFormat,
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
                            .resourceGroup(o.getResourceGroup())
                            .query(o.getQuery())
                            .resolution(o.getResolution())
                            .pendingDuration(o.getPendingDuration())
                            .severity(o.getSeverity())
                            .body(o.getBody())
                            .messageFormat(o.getMessageFormat())
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the alarm.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * A user-friendly name for the alarm. It does not have to be unique, and it's changeable.
     * <p>
     * This name is sent as the title for notifications related to this alarm.
     * <p>
     * Example: {@code High CPU Utilization}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the alarm.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the metric
     * being evaluated by the alarm.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricCompartmentId")
    private final String metricCompartmentId;

    public String getMetricCompartmentId() {
        return metricCompartmentId;
    }

    /**
     * When true, the alarm evaluates metrics from all compartments and subcompartments. The parameter can
     * only be set to true when metricCompartmentId is the tenancy OCID (the tenancy is the root compartment).
     * A true value requires the user to have tenancy-level permissions. If this requirement is not met,
     * then the call is rejected. When false, the alarm evaluates metrics from only the compartment specified
     * in metricCompartmentId. Default is false.
     * <p>
     * Example: {@code true}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricCompartmentIdInSubtree")
    private final Boolean metricCompartmentIdInSubtree;

    public Boolean getMetricCompartmentIdInSubtree() {
        return metricCompartmentIdInSubtree;
    }

    /**
     * The source service or application emitting the metric that is evaluated by the alarm.
     * <p>
     * Example: {@code oci_computeagent}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    public String getNamespace() {
        return namespace;
    }

    /**
     * Resource group to match for metric data retrieved by the alarm. A resource group is a custom string that you can match when retrieving custom metrics. Only one resource group can be applied per metric.
     * A valid resourceGroup value starts with an alphabetical character and includes only alphanumeric characters, periods (.), underscores (_), hyphens (-), and dollar signs ($).
     * <p>
     * Example: {@code frontend-fleet}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
    private final String resourceGroup;

    public String getResourceGroup() {
        return resourceGroup;
    }

    /**
     * The Monitoring Query Language (MQL) expression to evaluate for the alarm. The Alarms feature of
     * the Monitoring service interprets results for each returned time series as Boolean values,
     * where zero represents false and a non-zero value represents true. A true value means that the trigger
     * rule condition has been met. The query must specify a metric, statistic, interval, and trigger
     * rule (threshold or absence). Supported values for interval depend on the specified time range. More
     * interval values are supported for smaller time ranges. You can optionally
     * specify dimensions and grouping functions. Supported grouping functions: {@code grouping()}, {@code groupBy()}.
     * For details about Monitoring Query Language (MQL), see [Monitoring Query Language (MQL) Reference](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Reference/mql.htm).
     * For available dimensions, review the metric definition for the supported service.
     * See [Supported Services](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#SupportedServices).
     * <p>
     * Example of threshold alarm:
     * <p>
     * -----
     * <p>
     * CpuUtilization[1m]{availabilityDomain="cumS:PHX-AD-1"}.groupBy(availabilityDomain).percentile(0.9) > 85
     * <p>
     * -----
     * <p>
     * Example of absence alarm:
     * <p>
     * -----
     * <p>
     * CpuUtilization[1m]{availabilityDomain="cumS:PHX-AD-1"}.absent()
     * <p>
     * -----
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final String query;

    public String getQuery() {
        return query;
    }

    /**
     * The time between calculated aggregation windows for the alarm. Supported value: {@code 1m}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resolution")
    private final String resolution;

    public String getResolution() {
        return resolution;
    }

    /**
     * The period of time that the condition defined in the alarm must persist before the alarm state
     * changes from "OK" to "FIRING". For example, a value of 5 minutes means that the
     * alarm must persist in breaching the condition for five minutes before the alarm updates its
     * state to "FIRING".
     * <p>
     * The duration is specified as a string in ISO 8601 format ({@code PT10M} for ten minutes or {@code PT1H}
     * for one hour). Minimum: PT1M. Maximum: PT1H. Default: PT1M.
     * <p>
     * Under the default value of PT1M, the first evaluation that breaches the alarm updates the
     * state to "FIRING".
     * <p>
     * The alarm updates its status to "OK" when the breaching condition has been clear for
     * the most recent minute.
     * <p>
     * Example: {@code PT5M}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pendingDuration")
    private final String pendingDuration;

    public String getPendingDuration() {
        return pendingDuration;
    }

    /**
     * The perceived type of response required when the alarm is in the "FIRING" state.
     * <p>
     * Example: {@code CRITICAL}
     *
     **/
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

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Severity.class);

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
     * The perceived type of response required when the alarm is in the "FIRING" state.
     * <p>
     * Example: {@code CRITICAL}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final Severity severity;

    public Severity getSeverity() {
        return severity;
    }

    /**
     * The human-readable content of the notification delivered. Oracle recommends providing guidance
     * to operators for resolving the alarm condition. Consider adding links to standard runbook
     * practices.
     * <p>
     * Example: {@code High CPU usage alert. Follow runbook instructions for resolution.}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("body")
    private final String body;

    public String getBody() {
        return body;
    }

    /**
     * The format to use for notification messages sent from this alarm. The formats are:
     * * {@code RAW} - Raw JSON blob. Default value.
     * * {@code PRETTY_JSON}: JSON with new lines and indents.
     * * {@code ONS_OPTIMIZED}: Simplified, user-friendly layout. Applies only to messages sent through the Notifications service to the following subscription types: Email.
     *
     **/
    public enum MessageFormat {
        Raw("RAW"),
        PrettyJson("PRETTY_JSON"),
        OnsOptimized("ONS_OPTIMIZED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MessageFormat.class);

        private final String value;
        private static java.util.Map<String, MessageFormat> map;

        static {
            map = new java.util.HashMap<>();
            for (MessageFormat v : MessageFormat.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MessageFormat(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MessageFormat create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MessageFormat', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The format to use for notification messages sent from this alarm. The formats are:
     * * {@code RAW} - Raw JSON blob. Default value.
     * * {@code PRETTY_JSON}: JSON with new lines and indents.
     * * {@code ONS_OPTIMIZED}: Simplified, user-friendly layout. Applies only to messages sent through the Notifications service to the following subscription types: Email.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("messageFormat")
    private final MessageFormat messageFormat;

    public MessageFormat getMessageFormat() {
        return messageFormat;
    }

    /**
     * A list of destinations to which the notifications for this alarm will be delivered.
     * Each destination is represented by an [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) related to the supported destination service.
     * For example, a destination using the Notifications service is represented by a topic OCID.
     * Supported destination services: Notifications Service. Limit: One destination per supported destination service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinations")
    private final java.util.List<String> destinations;

    public java.util.List<String> getDestinations() {
        return destinations;
    }

    /**
     * The frequency at which notifications are re-submitted, if the alarm keeps firing without
     * interruption. Format defined by ISO 8601. For example, {@code PT4H} indicates four hours.
     * Minimum: PT1M. Maximum: P30D.
     * <p>
     * Default value: null (notifications are not re-submitted).
     * <p>
     * Example: {@code PT2H}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repeatNotificationDuration")
    private final String repeatNotificationDuration;

    public String getRepeatNotificationDuration() {
        return repeatNotificationDuration;
    }

    /**
     * The configuration details for suppressing an alarm.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("suppression")
    private final Suppression suppression;

    public Suppression getSuppression() {
        return suppression;
    }

    /**
     * Whether the alarm is enabled.
     * <p>
     * Example: {@code true}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The current lifecycle state of the alarm.
     * <p>
     * Example: {@code DELETED}
     *
     **/
    public enum LifecycleState {
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

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
     * Example: {@code DELETED}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the alarm was created. Format defined by RFC3339.
     * <p>
     * Example: {@code 2019-02-01T01:02:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the alarm was last updated. Format defined by RFC3339.
     * <p>
     * Example: {@code 2019-02-03T01:02:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Alarm(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", metricCompartmentId=").append(String.valueOf(this.metricCompartmentId));
        sb.append(", metricCompartmentIdInSubtree=")
                .append(String.valueOf(this.metricCompartmentIdInSubtree));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", resourceGroup=").append(String.valueOf(this.resourceGroup));
        sb.append(", query=").append(String.valueOf(this.query));
        sb.append(", resolution=").append(String.valueOf(this.resolution));
        sb.append(", pendingDuration=").append(String.valueOf(this.pendingDuration));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", body=").append(String.valueOf(this.body));
        sb.append(", messageFormat=").append(String.valueOf(this.messageFormat));
        sb.append(", destinations=").append(String.valueOf(this.destinations));
        sb.append(", repeatNotificationDuration=")
                .append(String.valueOf(this.repeatNotificationDuration));
        sb.append(", suppression=").append(String.valueOf(this.suppression));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Alarm)) {
            return false;
        }

        Alarm other = (Alarm) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.metricCompartmentId, other.metricCompartmentId)
                && java.util.Objects.equals(
                        this.metricCompartmentIdInSubtree, other.metricCompartmentIdInSubtree)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.resourceGroup, other.resourceGroup)
                && java.util.Objects.equals(this.query, other.query)
                && java.util.Objects.equals(this.resolution, other.resolution)
                && java.util.Objects.equals(this.pendingDuration, other.pendingDuration)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.body, other.body)
                && java.util.Objects.equals(this.messageFormat, other.messageFormat)
                && java.util.Objects.equals(this.destinations, other.destinations)
                && java.util.Objects.equals(
                        this.repeatNotificationDuration, other.repeatNotificationDuration)
                && java.util.Objects.equals(this.suppression, other.suppression)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.metricCompartmentId == null
                                ? 43
                                : this.metricCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.metricCompartmentIdInSubtree == null
                                ? 43
                                : this.metricCompartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceGroup == null ? 43 : this.resourceGroup.hashCode());
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        result = (result * PRIME) + (this.resolution == null ? 43 : this.resolution.hashCode());
        result =
                (result * PRIME)
                        + (this.pendingDuration == null ? 43 : this.pendingDuration.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.body == null ? 43 : this.body.hashCode());
        result =
                (result * PRIME)
                        + (this.messageFormat == null ? 43 : this.messageFormat.hashCode());
        result = (result * PRIME) + (this.destinations == null ? 43 : this.destinations.hashCode());
        result =
                (result * PRIME)
                        + (this.repeatNotificationDuration == null
                                ? 43
                                : this.repeatNotificationDuration.hashCode());
        result = (result * PRIME) + (this.suppression == null ? 43 : this.suppression.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
