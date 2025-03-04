/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.model;

/**
 * The configuration details for updating an alarm. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateAlarmDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateAlarmDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
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
        "isNotificationsPerMetricDimensionEnabled",
        "messageFormat",
        "destinations",
        "repeatNotificationDuration",
        "suppression",
        "isEnabled",
        "freeformTags",
        "definedTags",
        "overrides",
        "ruleName",
        "notificationVersion",
        "notificationTitle",
        "evaluationSlackDuration",
        "alarmSummary"
    })
    public UpdateAlarmDetails(
            String displayName,
            String compartmentId,
            String metricCompartmentId,
            Boolean metricCompartmentIdInSubtree,
            String namespace,
            String resourceGroup,
            String query,
            String resolution,
            String pendingDuration,
            Alarm.Severity severity,
            String body,
            Boolean isNotificationsPerMetricDimensionEnabled,
            MessageFormat messageFormat,
            java.util.List<String> destinations,
            String repeatNotificationDuration,
            Suppression suppression,
            Boolean isEnabled,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<AlarmOverride> overrides,
            String ruleName,
            String notificationVersion,
            String notificationTitle,
            String evaluationSlackDuration,
            String alarmSummary) {
        super();
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
        this.isNotificationsPerMetricDimensionEnabled = isNotificationsPerMetricDimensionEnabled;
        this.messageFormat = messageFormat;
        this.destinations = destinations;
        this.repeatNotificationDuration = repeatNotificationDuration;
        this.suppression = suppression;
        this.isEnabled = isEnabled;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.overrides = overrides;
        this.ruleName = ruleName;
        this.notificationVersion = notificationVersion;
        this.notificationTitle = notificationTitle;
        this.evaluationSlackDuration = evaluationSlackDuration;
        this.alarmSummary = alarmSummary;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name for the alarm. It does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * <p>This value determines the title of each alarm notification.
         *
         * <p>Example: {@code High CPU Utilization}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the alarm. It does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * <p>This value determines the title of each alarm notification.
         *
         * <p>Example: {@code High CPU Utilization}
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the alarm.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the alarm.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the metric being evaluated by the alarm.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("metricCompartmentId")
        private String metricCompartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the metric being evaluated by the alarm.
         *
         * @param metricCompartmentId the value to set
         * @return this builder
         */
        public Builder metricCompartmentId(String metricCompartmentId) {
            this.metricCompartmentId = metricCompartmentId;
            this.__explicitlySet__.add("metricCompartmentId");
            return this;
        }
        /**
         * When true, the alarm evaluates metrics from all compartments and subcompartments. The
         * parameter can only be set to true when metricCompartmentId is the tenancy OCID (the
         * tenancy is the root compartment). A true value requires the user to have tenancy-level
         * permissions. If this requirement is not met, then the call is rejected. When false, the
         * alarm evaluates metrics from only the compartment specified in metricCompartmentId.
         * Default is false.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("metricCompartmentIdInSubtree")
        private Boolean metricCompartmentIdInSubtree;

        /**
         * When true, the alarm evaluates metrics from all compartments and subcompartments. The
         * parameter can only be set to true when metricCompartmentId is the tenancy OCID (the
         * tenancy is the root compartment). A true value requires the user to have tenancy-level
         * permissions. If this requirement is not met, then the call is rejected. When false, the
         * alarm evaluates metrics from only the compartment specified in metricCompartmentId.
         * Default is false.
         *
         * <p>Example: {@code true}
         *
         * @param metricCompartmentIdInSubtree the value to set
         * @return this builder
         */
        public Builder metricCompartmentIdInSubtree(Boolean metricCompartmentIdInSubtree) {
            this.metricCompartmentIdInSubtree = metricCompartmentIdInSubtree;
            this.__explicitlySet__.add("metricCompartmentIdInSubtree");
            return this;
        }
        /**
         * The source service or application emitting the metric that is evaluated by the alarm.
         *
         * <p>Example: {@code oci_computeagent}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The source service or application emitting the metric that is evaluated by the alarm.
         *
         * <p>Example: {@code oci_computeagent}
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * Resource group that you want to match. A null value returns only metric data that has no
         * resource groups. The alarm retrieves metric data associated with the specified resource
         * group only. Only one resource group can be applied per metric. A valid resourceGroup
         * value starts with an alphabetical character and includes only alphanumeric characters,
         * periods (.), underscores (_), hyphens (-), and dollar signs ($). Avoid entering
         * confidential information.
         *
         * <p>Example: {@code frontend-fleet}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
        private String resourceGroup;

        /**
         * Resource group that you want to match. A null value returns only metric data that has no
         * resource groups. The alarm retrieves metric data associated with the specified resource
         * group only. Only one resource group can be applied per metric. A valid resourceGroup
         * value starts with an alphabetical character and includes only alphanumeric characters,
         * periods (.), underscores (_), hyphens (-), and dollar signs ($). Avoid entering
         * confidential information.
         *
         * <p>Example: {@code frontend-fleet}
         *
         * @param resourceGroup the value to set
         * @return this builder
         */
        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            this.__explicitlySet__.add("resourceGroup");
            return this;
        }
        /**
         * The Monitoring Query Language (MQL) expression to evaluate for the alarm. The Alarms
         * feature of the Monitoring service interprets results for each returned time series as
         * Boolean values, where zero represents false and a non-zero value represents true. A true
         * value means that the trigger rule condition has been met. The query must specify a
         * metric, statistic, interval, and trigger rule (threshold or absence). Supported values
         * for interval depend on the specified time range. More interval values are supported for
         * smaller time ranges. You can optionally specify dimensions and grouping functions. Also,
         * you can customize the [absence detection
         * period](https://docs.oracle.com/iaas/Content/Monitoring/Tasks/create-edit-alarm-query-absence-detection-period.htm).
         * Supported grouping functions: {@code grouping()}, {@code groupBy()}. For information
         * about writing MQL expressions, see [Editing the MQL Expression for a
         * Query](https://docs.oracle.com/iaas/Content/Monitoring/Tasks/query-metric-mql.htm). For
         * details about MQL, see [Monitoring Query Language (MQL)
         * Reference](https://docs.oracle.com/iaas/Content/Monitoring/Reference/mql.htm). For
         * available dimensions, review the metric definition for the supported service. See
         * [Supported
         * Services](https://docs.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#SupportedServices).
         *
         * <p>Example of threshold alarm:
         *
         * <p>-----
         *
         * <p>CpuUtilization[1m]{availabilityDomain="cumS:PHX-AD-1"}.groupBy(availabilityDomain).percentile(0.9)
         * > 85
         *
         * <p>-----
         *
         * <p>Example of absence alarm:
         *
         * <p>-----
         *
         * <p>CpuUtilization[1m]{availabilityDomain="cumS:PHX-AD-1"}.absent()
         *
         * <p>----- Example of absence alarm with custom absence detection period of 20 hours:
         *
         * <p>-----
         *
         * <p>CpuUtilization[1m]{availabilityDomain="cumS:PHX-AD-1"}.absent(20h)
         *
         * <p>-----
         */
        @com.fasterxml.jackson.annotation.JsonProperty("query")
        private String query;

        /**
         * The Monitoring Query Language (MQL) expression to evaluate for the alarm. The Alarms
         * feature of the Monitoring service interprets results for each returned time series as
         * Boolean values, where zero represents false and a non-zero value represents true. A true
         * value means that the trigger rule condition has been met. The query must specify a
         * metric, statistic, interval, and trigger rule (threshold or absence). Supported values
         * for interval depend on the specified time range. More interval values are supported for
         * smaller time ranges. You can optionally specify dimensions and grouping functions. Also,
         * you can customize the [absence detection
         * period](https://docs.oracle.com/iaas/Content/Monitoring/Tasks/create-edit-alarm-query-absence-detection-period.htm).
         * Supported grouping functions: {@code grouping()}, {@code groupBy()}. For information
         * about writing MQL expressions, see [Editing the MQL Expression for a
         * Query](https://docs.oracle.com/iaas/Content/Monitoring/Tasks/query-metric-mql.htm). For
         * details about MQL, see [Monitoring Query Language (MQL)
         * Reference](https://docs.oracle.com/iaas/Content/Monitoring/Reference/mql.htm). For
         * available dimensions, review the metric definition for the supported service. See
         * [Supported
         * Services](https://docs.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#SupportedServices).
         *
         * <p>Example of threshold alarm:
         *
         * <p>-----
         *
         * <p>CpuUtilization[1m]{availabilityDomain="cumS:PHX-AD-1"}.groupBy(availabilityDomain).percentile(0.9)
         * > 85
         *
         * <p>-----
         *
         * <p>Example of absence alarm:
         *
         * <p>-----
         *
         * <p>CpuUtilization[1m]{availabilityDomain="cumS:PHX-AD-1"}.absent()
         *
         * <p>----- Example of absence alarm with custom absence detection period of 20 hours:
         *
         * <p>-----
         *
         * <p>CpuUtilization[1m]{availabilityDomain="cumS:PHX-AD-1"}.absent(20h)
         *
         * <p>-----
         *
         * @param query the value to set
         * @return this builder
         */
        public Builder query(String query) {
            this.query = query;
            this.__explicitlySet__.add("query");
            return this;
        }
        /**
         * The time between calculated aggregation windows for the alarm. Supported value: {@code
         * 1m}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resolution")
        private String resolution;

        /**
         * The time between calculated aggregation windows for the alarm. Supported value: {@code
         * 1m}
         *
         * @param resolution the value to set
         * @return this builder
         */
        public Builder resolution(String resolution) {
            this.resolution = resolution;
            this.__explicitlySet__.add("resolution");
            return this;
        }
        /**
         * The period of time that the condition defined in the alarm must persist before the alarm
         * state changes from "OK" to "FIRING". For example, a value of 5 minutes means that the
         * alarm must persist in breaching the condition for five minutes before the alarm updates
         * its state to "FIRING".
         *
         * <p>The duration is specified as a string in ISO 8601 format ({@code PT10M} for ten
         * minutes or {@code PT1H} for one hour). Minimum: PT1M. Maximum: PT1H. Default: PT1M.
         *
         * <p>Under the default value of PT1M, the first evaluation that breaches the alarm updates
         * the state to "FIRING".
         *
         * <p>The alarm updates its status to "OK" when the breaching condition has been clear for
         * the most recent minute.
         *
         * <p>Example: {@code PT5M}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("pendingDuration")
        private String pendingDuration;

        /**
         * The period of time that the condition defined in the alarm must persist before the alarm
         * state changes from "OK" to "FIRING". For example, a value of 5 minutes means that the
         * alarm must persist in breaching the condition for five minutes before the alarm updates
         * its state to "FIRING".
         *
         * <p>The duration is specified as a string in ISO 8601 format ({@code PT10M} for ten
         * minutes or {@code PT1H} for one hour). Minimum: PT1M. Maximum: PT1H. Default: PT1M.
         *
         * <p>Under the default value of PT1M, the first evaluation that breaches the alarm updates
         * the state to "FIRING".
         *
         * <p>The alarm updates its status to "OK" when the breaching condition has been clear for
         * the most recent minute.
         *
         * <p>Example: {@code PT5M}
         *
         * @param pendingDuration the value to set
         * @return this builder
         */
        public Builder pendingDuration(String pendingDuration) {
            this.pendingDuration = pendingDuration;
            this.__explicitlySet__.add("pendingDuration");
            return this;
        }
        /**
         * The perceived severity of the alarm with regard to the affected system.
         *
         * <p>Example: {@code CRITICAL}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Alarm.Severity severity;

        /**
         * The perceived severity of the alarm with regard to the affected system.
         *
         * <p>Example: {@code CRITICAL}
         *
         * @param severity the value to set
         * @return this builder
         */
        public Builder severity(Alarm.Severity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /**
         * The human-readable content of the delivered alarm notification. Optionally include
         * [dynamic
         * variables](https://docs.oracle.com/iaas/Content/Monitoring/Tasks/update-alarm-dynamic-variables.htm).
         * Oracle recommends providing guidance to operators for resolving the alarm condition.
         * Consider adding links to standard runbook practices. Avoid entering confidential
         * information.
         *
         * <p>Example: {@code High CPU usage alert. Follow runbook instructions for resolution.}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("body")
        private String body;

        /**
         * The human-readable content of the delivered alarm notification. Optionally include
         * [dynamic
         * variables](https://docs.oracle.com/iaas/Content/Monitoring/Tasks/update-alarm-dynamic-variables.htm).
         * Oracle recommends providing guidance to operators for resolving the alarm condition.
         * Consider adding links to standard runbook practices. Avoid entering confidential
         * information.
         *
         * <p>Example: {@code High CPU usage alert. Follow runbook instructions for resolution.}
         *
         * @param body the value to set
         * @return this builder
         */
        public Builder body(String body) {
            this.body = body;
            this.__explicitlySet__.add("body");
            return this;
        }
        /**
         * When set to {@code true}, splits alarm notifications per metric stream. When set to
         * {@code false}, groups alarm notifications across metric streams.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isNotificationsPerMetricDimensionEnabled")
        private Boolean isNotificationsPerMetricDimensionEnabled;

        /**
         * When set to {@code true}, splits alarm notifications per metric stream. When set to
         * {@code false}, groups alarm notifications across metric streams.
         *
         * @param isNotificationsPerMetricDimensionEnabled the value to set
         * @return this builder
         */
        public Builder isNotificationsPerMetricDimensionEnabled(
                Boolean isNotificationsPerMetricDimensionEnabled) {
            this.isNotificationsPerMetricDimensionEnabled =
                    isNotificationsPerMetricDimensionEnabled;
            this.__explicitlySet__.add("isNotificationsPerMetricDimensionEnabled");
            return this;
        }
        /**
         * The format to use for alarm notifications. The formats are: * {@code RAW} - Raw JSON
         * blob. Default value. When the {@code destinations} attribute specifies {@code Streaming},
         * all alarm notifications use this format. * {@code PRETTY_JSON}: JSON with new lines and
         * indents. Available when the {@code destinations} attribute specifies {@code
         * Notifications} only. * {@code ONS_OPTIMIZED}: Simplified, user-friendly layout. Available
         * when the {@code destinations} attribute specifies {@code Notifications} only. Applies to
         * Email subscription types only.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("messageFormat")
        private MessageFormat messageFormat;

        /**
         * The format to use for alarm notifications. The formats are: * {@code RAW} - Raw JSON
         * blob. Default value. When the {@code destinations} attribute specifies {@code Streaming},
         * all alarm notifications use this format. * {@code PRETTY_JSON}: JSON with new lines and
         * indents. Available when the {@code destinations} attribute specifies {@code
         * Notifications} only. * {@code ONS_OPTIMIZED}: Simplified, user-friendly layout. Available
         * when the {@code destinations} attribute specifies {@code Notifications} only. Applies to
         * Email subscription types only.
         *
         * @param messageFormat the value to set
         * @return this builder
         */
        public Builder messageFormat(MessageFormat messageFormat) {
            this.messageFormat = messageFormat;
            this.__explicitlySet__.add("messageFormat");
            return this;
        }
        /**
         * A list of destinations for alarm notifications. Each destination is represented by the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
         * related resource, such as a {@link NotificationTopic}. Supported destination services:
         * Notifications, Streaming. Limit: One destination per supported destination service.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinations")
        private java.util.List<String> destinations;

        /**
         * A list of destinations for alarm notifications. Each destination is represented by the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
         * related resource, such as a {@link NotificationTopic}. Supported destination services:
         * Notifications, Streaming. Limit: One destination per supported destination service.
         *
         * @param destinations the value to set
         * @return this builder
         */
        public Builder destinations(java.util.List<String> destinations) {
            this.destinations = destinations;
            this.__explicitlySet__.add("destinations");
            return this;
        }
        /**
         * The frequency for re-submitting alarm notifications, if the alarm keeps firing without
         * interruption. Format defined by ISO 8601. For example, {@code PT4H} indicates four hours.
         * Minimum: PT1M. Maximum: P30D.
         *
         * <p>Default value: null (notifications are not re-submitted).
         *
         * <p>Example: {@code PT2H}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("repeatNotificationDuration")
        private String repeatNotificationDuration;

        /**
         * The frequency for re-submitting alarm notifications, if the alarm keeps firing without
         * interruption. Format defined by ISO 8601. For example, {@code PT4H} indicates four hours.
         * Minimum: PT1M. Maximum: P30D.
         *
         * <p>Default value: null (notifications are not re-submitted).
         *
         * <p>Example: {@code PT2H}
         *
         * @param repeatNotificationDuration the value to set
         * @return this builder
         */
        public Builder repeatNotificationDuration(String repeatNotificationDuration) {
            this.repeatNotificationDuration = repeatNotificationDuration;
            this.__explicitlySet__.add("repeatNotificationDuration");
            return this;
        }
        /** The configuration details for suppressing an alarm. */
        @com.fasterxml.jackson.annotation.JsonProperty("suppression")
        private Suppression suppression;

        /**
         * The configuration details for suppressing an alarm.
         *
         * @param suppression the value to set
         * @return this builder
         */
        public Builder suppression(Suppression suppression) {
            this.suppression = suppression;
            this.__explicitlySet__.add("suppression");
            return this;
        }
        /**
         * Whether the alarm is enabled.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Whether the alarm is enabled.
         *
         * <p>Example: {@code true}
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * A set of overrides that control evaluations of the alarm.
         *
         * <p>Each override can specify values for query, severity, body, and pending duration. When
         * an alarm contains overrides, the Monitoring service evaluates each override in order,
         * beginning with the first override in the array (index position {@code 0}), and then
         * evaluates the alarm's base values ({@code ruleName} value of {@code BASE}).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("overrides")
        private java.util.List<AlarmOverride> overrides;

        /**
         * A set of overrides that control evaluations of the alarm.
         *
         * <p>Each override can specify values for query, severity, body, and pending duration. When
         * an alarm contains overrides, the Monitoring service evaluates each override in order,
         * beginning with the first override in the array (index position {@code 0}), and then
         * evaluates the alarm's base values ({@code ruleName} value of {@code BASE}).
         *
         * @param overrides the value to set
         * @return this builder
         */
        public Builder overrides(java.util.List<AlarmOverride> overrides) {
            this.overrides = overrides;
            this.__explicitlySet__.add("overrides");
            return this;
        }
        /**
         * Identifier of the alarm's base values for alarm evaluation, for use when the alarm
         * contains overrides. Default value is {@code BASE}. For information about alarm overrides,
         * see {@link #alarmOverride(AlarmOverrideRequest) alarmOverride}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ruleName")
        private String ruleName;

        /**
         * Identifier of the alarm's base values for alarm evaluation, for use when the alarm
         * contains overrides. Default value is {@code BASE}. For information about alarm overrides,
         * see {@link #alarmOverride(AlarmOverrideRequest) alarmOverride}.
         *
         * @param ruleName the value to set
         * @return this builder
         */
        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            this.__explicitlySet__.add("ruleName");
            return this;
        }
        /**
         * The version of the alarm notification to be delivered. Allowed value: {@code 1.X} The
         * value must start with a number (up to four digits), followed by a period and an uppercase
         * X.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("notificationVersion")
        private String notificationVersion;

        /**
         * The version of the alarm notification to be delivered. Allowed value: {@code 1.X} The
         * value must start with a number (up to four digits), followed by a period and an uppercase
         * X.
         *
         * @param notificationVersion the value to set
         * @return this builder
         */
        public Builder notificationVersion(String notificationVersion) {
            this.notificationVersion = notificationVersion;
            this.__explicitlySet__.add("notificationVersion");
            return this;
        }
        /**
         * Customizable notification title ({@code title} [alarm message
         * parameter](https://docs.oracle.com/iaas/Content/Monitoring/alarm-message-format.htm)).
         * Optionally include [dynamic
         * variables](https://docs.oracle.com/iaas/Content/Monitoring/Tasks/update-alarm-dynamic-variables.htm).
         * The notification title appears as the subject line in a formatted email message and as
         * the title in a Slack message.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("notificationTitle")
        private String notificationTitle;

        /**
         * Customizable notification title ({@code title} [alarm message
         * parameter](https://docs.oracle.com/iaas/Content/Monitoring/alarm-message-format.htm)).
         * Optionally include [dynamic
         * variables](https://docs.oracle.com/iaas/Content/Monitoring/Tasks/update-alarm-dynamic-variables.htm).
         * The notification title appears as the subject line in a formatted email message and as
         * the title in a Slack message.
         *
         * @param notificationTitle the value to set
         * @return this builder
         */
        public Builder notificationTitle(String notificationTitle) {
            this.notificationTitle = notificationTitle;
            this.__explicitlySet__.add("notificationTitle");
            return this;
        }
        /**
         * Customizable slack period to wait for metric ingestion before evaluating the alarm.
         * Specify a string in ISO 8601 format ({@code PT10M} for ten minutes or {@code PT1H} for
         * one hour). Minimum: PT3M. Maximum: PT2H. Default: PT3M. For more information about the
         * slack period, see [About the Internal Reset
         * Period](https://docs.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#reset).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("evaluationSlackDuration")
        private String evaluationSlackDuration;

        /**
         * Customizable slack period to wait for metric ingestion before evaluating the alarm.
         * Specify a string in ISO 8601 format ({@code PT10M} for ten minutes or {@code PT1H} for
         * one hour). Minimum: PT3M. Maximum: PT2H. Default: PT3M. For more information about the
         * slack period, see [About the Internal Reset
         * Period](https://docs.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#reset).
         *
         * @param evaluationSlackDuration the value to set
         * @return this builder
         */
        public Builder evaluationSlackDuration(String evaluationSlackDuration) {
            this.evaluationSlackDuration = evaluationSlackDuration;
            this.__explicitlySet__.add("evaluationSlackDuration");
            return this;
        }
        /**
         * Customizable alarm summary ({@code alarmSummary} [alarm message
         * parameter](https://docs.oracle.com/iaas/Content/Monitoring/alarm-message-format.htm)).
         * Optionally include [dynamic
         * variables](https://docs.oracle.com/iaas/Content/Monitoring/Tasks/update-alarm-dynamic-variables.htm).
         * The alarm summary appears within the body of the alarm message and in responses to {@link
         * #listAlarmsStatus(ListAlarmsStatusRequest) listAlarmsStatus} {@link
         * #getAlarmHistory(GetAlarmHistoryRequest) getAlarmHistory} and {@link
         * #retrieveDimensionStates(RetrieveDimensionStatesRequest) retrieveDimensionStates}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("alarmSummary")
        private String alarmSummary;

        /**
         * Customizable alarm summary ({@code alarmSummary} [alarm message
         * parameter](https://docs.oracle.com/iaas/Content/Monitoring/alarm-message-format.htm)).
         * Optionally include [dynamic
         * variables](https://docs.oracle.com/iaas/Content/Monitoring/Tasks/update-alarm-dynamic-variables.htm).
         * The alarm summary appears within the body of the alarm message and in responses to {@link
         * #listAlarmsStatus(ListAlarmsStatusRequest) listAlarmsStatus} {@link
         * #getAlarmHistory(GetAlarmHistoryRequest) getAlarmHistory} and {@link
         * #retrieveDimensionStates(RetrieveDimensionStatesRequest) retrieveDimensionStates}.
         *
         * @param alarmSummary the value to set
         * @return this builder
         */
        public Builder alarmSummary(String alarmSummary) {
            this.alarmSummary = alarmSummary;
            this.__explicitlySet__.add("alarmSummary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateAlarmDetails build() {
            UpdateAlarmDetails model =
                    new UpdateAlarmDetails(
                            this.displayName,
                            this.compartmentId,
                            this.metricCompartmentId,
                            this.metricCompartmentIdInSubtree,
                            this.namespace,
                            this.resourceGroup,
                            this.query,
                            this.resolution,
                            this.pendingDuration,
                            this.severity,
                            this.body,
                            this.isNotificationsPerMetricDimensionEnabled,
                            this.messageFormat,
                            this.destinations,
                            this.repeatNotificationDuration,
                            this.suppression,
                            this.isEnabled,
                            this.freeformTags,
                            this.definedTags,
                            this.overrides,
                            this.ruleName,
                            this.notificationVersion,
                            this.notificationTitle,
                            this.evaluationSlackDuration,
                            this.alarmSummary);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAlarmDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("metricCompartmentId")) {
                this.metricCompartmentId(model.getMetricCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("metricCompartmentIdInSubtree")) {
                this.metricCompartmentIdInSubtree(model.getMetricCompartmentIdInSubtree());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("resourceGroup")) {
                this.resourceGroup(model.getResourceGroup());
            }
            if (model.wasPropertyExplicitlySet("query")) {
                this.query(model.getQuery());
            }
            if (model.wasPropertyExplicitlySet("resolution")) {
                this.resolution(model.getResolution());
            }
            if (model.wasPropertyExplicitlySet("pendingDuration")) {
                this.pendingDuration(model.getPendingDuration());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("body")) {
                this.body(model.getBody());
            }
            if (model.wasPropertyExplicitlySet("isNotificationsPerMetricDimensionEnabled")) {
                this.isNotificationsPerMetricDimensionEnabled(
                        model.getIsNotificationsPerMetricDimensionEnabled());
            }
            if (model.wasPropertyExplicitlySet("messageFormat")) {
                this.messageFormat(model.getMessageFormat());
            }
            if (model.wasPropertyExplicitlySet("destinations")) {
                this.destinations(model.getDestinations());
            }
            if (model.wasPropertyExplicitlySet("repeatNotificationDuration")) {
                this.repeatNotificationDuration(model.getRepeatNotificationDuration());
            }
            if (model.wasPropertyExplicitlySet("suppression")) {
                this.suppression(model.getSuppression());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("overrides")) {
                this.overrides(model.getOverrides());
            }
            if (model.wasPropertyExplicitlySet("ruleName")) {
                this.ruleName(model.getRuleName());
            }
            if (model.wasPropertyExplicitlySet("notificationVersion")) {
                this.notificationVersion(model.getNotificationVersion());
            }
            if (model.wasPropertyExplicitlySet("notificationTitle")) {
                this.notificationTitle(model.getNotificationTitle());
            }
            if (model.wasPropertyExplicitlySet("evaluationSlackDuration")) {
                this.evaluationSlackDuration(model.getEvaluationSlackDuration());
            }
            if (model.wasPropertyExplicitlySet("alarmSummary")) {
                this.alarmSummary(model.getAlarmSummary());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * A user-friendly name for the alarm. It does not have to be unique, and it's changeable. Avoid
     * entering confidential information.
     *
     * <p>This value determines the title of each alarm notification.
     *
     * <p>Example: {@code High CPU Utilization}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the alarm. It does not have to be unique, and it's changeable. Avoid
     * entering confidential information.
     *
     * <p>This value determines the title of each alarm notification.
     *
     * <p>Example: {@code High CPU Utilization}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the alarm.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the alarm.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the metric being evaluated by the alarm.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metricCompartmentId")
    private final String metricCompartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the metric being evaluated by the alarm.
     *
     * @return the value
     */
    public String getMetricCompartmentId() {
        return metricCompartmentId;
    }

    /**
     * When true, the alarm evaluates metrics from all compartments and subcompartments. The
     * parameter can only be set to true when metricCompartmentId is the tenancy OCID (the tenancy
     * is the root compartment). A true value requires the user to have tenancy-level permissions.
     * If this requirement is not met, then the call is rejected. When false, the alarm evaluates
     * metrics from only the compartment specified in metricCompartmentId. Default is false.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metricCompartmentIdInSubtree")
    private final Boolean metricCompartmentIdInSubtree;

    /**
     * When true, the alarm evaluates metrics from all compartments and subcompartments. The
     * parameter can only be set to true when metricCompartmentId is the tenancy OCID (the tenancy
     * is the root compartment). A true value requires the user to have tenancy-level permissions.
     * If this requirement is not met, then the call is rejected. When false, the alarm evaluates
     * metrics from only the compartment specified in metricCompartmentId. Default is false.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getMetricCompartmentIdInSubtree() {
        return metricCompartmentIdInSubtree;
    }

    /**
     * The source service or application emitting the metric that is evaluated by the alarm.
     *
     * <p>Example: {@code oci_computeagent}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The source service or application emitting the metric that is evaluated by the alarm.
     *
     * <p>Example: {@code oci_computeagent}
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Resource group that you want to match. A null value returns only metric data that has no
     * resource groups. The alarm retrieves metric data associated with the specified resource group
     * only. Only one resource group can be applied per metric. A valid resourceGroup value starts
     * with an alphabetical character and includes only alphanumeric characters, periods (.),
     * underscores (_), hyphens (-), and dollar signs ($). Avoid entering confidential information.
     *
     * <p>Example: {@code frontend-fleet}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
    private final String resourceGroup;

    /**
     * Resource group that you want to match. A null value returns only metric data that has no
     * resource groups. The alarm retrieves metric data associated with the specified resource group
     * only. Only one resource group can be applied per metric. A valid resourceGroup value starts
     * with an alphabetical character and includes only alphanumeric characters, periods (.),
     * underscores (_), hyphens (-), and dollar signs ($). Avoid entering confidential information.
     *
     * <p>Example: {@code frontend-fleet}
     *
     * @return the value
     */
    public String getResourceGroup() {
        return resourceGroup;
    }

    /**
     * The Monitoring Query Language (MQL) expression to evaluate for the alarm. The Alarms feature
     * of the Monitoring service interprets results for each returned time series as Boolean values,
     * where zero represents false and a non-zero value represents true. A true value means that the
     * trigger rule condition has been met. The query must specify a metric, statistic, interval,
     * and trigger rule (threshold or absence). Supported values for interval depend on the
     * specified time range. More interval values are supported for smaller time ranges. You can
     * optionally specify dimensions and grouping functions. Also, you can customize the [absence
     * detection
     * period](https://docs.oracle.com/iaas/Content/Monitoring/Tasks/create-edit-alarm-query-absence-detection-period.htm).
     * Supported grouping functions: {@code grouping()}, {@code groupBy()}. For information about
     * writing MQL expressions, see [Editing the MQL Expression for a
     * Query](https://docs.oracle.com/iaas/Content/Monitoring/Tasks/query-metric-mql.htm). For
     * details about MQL, see [Monitoring Query Language (MQL)
     * Reference](https://docs.oracle.com/iaas/Content/Monitoring/Reference/mql.htm). For available
     * dimensions, review the metric definition for the supported service. See [Supported
     * Services](https://docs.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#SupportedServices).
     *
     * <p>Example of threshold alarm:
     *
     * <p>-----
     *
     * <p>CpuUtilization[1m]{availabilityDomain="cumS:PHX-AD-1"}.groupBy(availabilityDomain).percentile(0.9)
     * > 85
     *
     * <p>-----
     *
     * <p>Example of absence alarm:
     *
     * <p>-----
     *
     * <p>CpuUtilization[1m]{availabilityDomain="cumS:PHX-AD-1"}.absent()
     *
     * <p>----- Example of absence alarm with custom absence detection period of 20 hours:
     *
     * <p>-----
     *
     * <p>CpuUtilization[1m]{availabilityDomain="cumS:PHX-AD-1"}.absent(20h)
     *
     * <p>-----
     */
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final String query;

    /**
     * The Monitoring Query Language (MQL) expression to evaluate for the alarm. The Alarms feature
     * of the Monitoring service interprets results for each returned time series as Boolean values,
     * where zero represents false and a non-zero value represents true. A true value means that the
     * trigger rule condition has been met. The query must specify a metric, statistic, interval,
     * and trigger rule (threshold or absence). Supported values for interval depend on the
     * specified time range. More interval values are supported for smaller time ranges. You can
     * optionally specify dimensions and grouping functions. Also, you can customize the [absence
     * detection
     * period](https://docs.oracle.com/iaas/Content/Monitoring/Tasks/create-edit-alarm-query-absence-detection-period.htm).
     * Supported grouping functions: {@code grouping()}, {@code groupBy()}. For information about
     * writing MQL expressions, see [Editing the MQL Expression for a
     * Query](https://docs.oracle.com/iaas/Content/Monitoring/Tasks/query-metric-mql.htm). For
     * details about MQL, see [Monitoring Query Language (MQL)
     * Reference](https://docs.oracle.com/iaas/Content/Monitoring/Reference/mql.htm). For available
     * dimensions, review the metric definition for the supported service. See [Supported
     * Services](https://docs.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#SupportedServices).
     *
     * <p>Example of threshold alarm:
     *
     * <p>-----
     *
     * <p>CpuUtilization[1m]{availabilityDomain="cumS:PHX-AD-1"}.groupBy(availabilityDomain).percentile(0.9)
     * > 85
     *
     * <p>-----
     *
     * <p>Example of absence alarm:
     *
     * <p>-----
     *
     * <p>CpuUtilization[1m]{availabilityDomain="cumS:PHX-AD-1"}.absent()
     *
     * <p>----- Example of absence alarm with custom absence detection period of 20 hours:
     *
     * <p>-----
     *
     * <p>CpuUtilization[1m]{availabilityDomain="cumS:PHX-AD-1"}.absent(20h)
     *
     * <p>-----
     *
     * @return the value
     */
    public String getQuery() {
        return query;
    }

    /**
     * The time between calculated aggregation windows for the alarm. Supported value: {@code 1m}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resolution")
    private final String resolution;

    /**
     * The time between calculated aggregation windows for the alarm. Supported value: {@code 1m}
     *
     * @return the value
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * The period of time that the condition defined in the alarm must persist before the alarm
     * state changes from "OK" to "FIRING". For example, a value of 5 minutes means that the alarm
     * must persist in breaching the condition for five minutes before the alarm updates its state
     * to "FIRING".
     *
     * <p>The duration is specified as a string in ISO 8601 format ({@code PT10M} for ten minutes or
     * {@code PT1H} for one hour). Minimum: PT1M. Maximum: PT1H. Default: PT1M.
     *
     * <p>Under the default value of PT1M, the first evaluation that breaches the alarm updates the
     * state to "FIRING".
     *
     * <p>The alarm updates its status to "OK" when the breaching condition has been clear for the
     * most recent minute.
     *
     * <p>Example: {@code PT5M}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pendingDuration")
    private final String pendingDuration;

    /**
     * The period of time that the condition defined in the alarm must persist before the alarm
     * state changes from "OK" to "FIRING". For example, a value of 5 minutes means that the alarm
     * must persist in breaching the condition for five minutes before the alarm updates its state
     * to "FIRING".
     *
     * <p>The duration is specified as a string in ISO 8601 format ({@code PT10M} for ten minutes or
     * {@code PT1H} for one hour). Minimum: PT1M. Maximum: PT1H. Default: PT1M.
     *
     * <p>Under the default value of PT1M, the first evaluation that breaches the alarm updates the
     * state to "FIRING".
     *
     * <p>The alarm updates its status to "OK" when the breaching condition has been clear for the
     * most recent minute.
     *
     * <p>Example: {@code PT5M}
     *
     * @return the value
     */
    public String getPendingDuration() {
        return pendingDuration;
    }

    /**
     * The perceived severity of the alarm with regard to the affected system.
     *
     * <p>Example: {@code CRITICAL}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final Alarm.Severity severity;

    /**
     * The perceived severity of the alarm with regard to the affected system.
     *
     * <p>Example: {@code CRITICAL}
     *
     * @return the value
     */
    public Alarm.Severity getSeverity() {
        return severity;
    }

    /**
     * The human-readable content of the delivered alarm notification. Optionally include [dynamic
     * variables](https://docs.oracle.com/iaas/Content/Monitoring/Tasks/update-alarm-dynamic-variables.htm).
     * Oracle recommends providing guidance to operators for resolving the alarm condition. Consider
     * adding links to standard runbook practices. Avoid entering confidential information.
     *
     * <p>Example: {@code High CPU usage alert. Follow runbook instructions for resolution.}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("body")
    private final String body;

    /**
     * The human-readable content of the delivered alarm notification. Optionally include [dynamic
     * variables](https://docs.oracle.com/iaas/Content/Monitoring/Tasks/update-alarm-dynamic-variables.htm).
     * Oracle recommends providing guidance to operators for resolving the alarm condition. Consider
     * adding links to standard runbook practices. Avoid entering confidential information.
     *
     * <p>Example: {@code High CPU usage alert. Follow runbook instructions for resolution.}
     *
     * @return the value
     */
    public String getBody() {
        return body;
    }

    /**
     * When set to {@code true}, splits alarm notifications per metric stream. When set to {@code
     * false}, groups alarm notifications across metric streams.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isNotificationsPerMetricDimensionEnabled")
    private final Boolean isNotificationsPerMetricDimensionEnabled;

    /**
     * When set to {@code true}, splits alarm notifications per metric stream. When set to {@code
     * false}, groups alarm notifications across metric streams.
     *
     * @return the value
     */
    public Boolean getIsNotificationsPerMetricDimensionEnabled() {
        return isNotificationsPerMetricDimensionEnabled;
    }

    /**
     * The format to use for alarm notifications. The formats are: * {@code RAW} - Raw JSON blob.
     * Default value. When the {@code destinations} attribute specifies {@code Streaming}, all alarm
     * notifications use this format. * {@code PRETTY_JSON}: JSON with new lines and indents.
     * Available when the {@code destinations} attribute specifies {@code Notifications} only. *
     * {@code ONS_OPTIMIZED}: Simplified, user-friendly layout. Available when the {@code
     * destinations} attribute specifies {@code Notifications} only. Applies to Email subscription
     * types only.
     */
    public enum MessageFormat implements com.oracle.bmc.http.internal.BmcEnum {
        Raw("RAW"),
        PrettyJson("PRETTY_JSON"),
        OnsOptimized("ONS_OPTIMIZED"),
        ;

        private final String value;
        private static java.util.Map<String, MessageFormat> map;

        static {
            map = new java.util.HashMap<>();
            for (MessageFormat v : MessageFormat.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid MessageFormat: " + key);
        }
    };
    /**
     * The format to use for alarm notifications. The formats are: * {@code RAW} - Raw JSON blob.
     * Default value. When the {@code destinations} attribute specifies {@code Streaming}, all alarm
     * notifications use this format. * {@code PRETTY_JSON}: JSON with new lines and indents.
     * Available when the {@code destinations} attribute specifies {@code Notifications} only. *
     * {@code ONS_OPTIMIZED}: Simplified, user-friendly layout. Available when the {@code
     * destinations} attribute specifies {@code Notifications} only. Applies to Email subscription
     * types only.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("messageFormat")
    private final MessageFormat messageFormat;

    /**
     * The format to use for alarm notifications. The formats are: * {@code RAW} - Raw JSON blob.
     * Default value. When the {@code destinations} attribute specifies {@code Streaming}, all alarm
     * notifications use this format. * {@code PRETTY_JSON}: JSON with new lines and indents.
     * Available when the {@code destinations} attribute specifies {@code Notifications} only. *
     * {@code ONS_OPTIMIZED}: Simplified, user-friendly layout. Available when the {@code
     * destinations} attribute specifies {@code Notifications} only. Applies to Email subscription
     * types only.
     *
     * @return the value
     */
    public MessageFormat getMessageFormat() {
        return messageFormat;
    }

    /**
     * A list of destinations for alarm notifications. Each destination is represented by the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a related
     * resource, such as a {@link NotificationTopic}. Supported destination services: Notifications,
     * Streaming. Limit: One destination per supported destination service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinations")
    private final java.util.List<String> destinations;

    /**
     * A list of destinations for alarm notifications. Each destination is represented by the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a related
     * resource, such as a {@link NotificationTopic}. Supported destination services: Notifications,
     * Streaming. Limit: One destination per supported destination service.
     *
     * @return the value
     */
    public java.util.List<String> getDestinations() {
        return destinations;
    }

    /**
     * The frequency for re-submitting alarm notifications, if the alarm keeps firing without
     * interruption. Format defined by ISO 8601. For example, {@code PT4H} indicates four hours.
     * Minimum: PT1M. Maximum: P30D.
     *
     * <p>Default value: null (notifications are not re-submitted).
     *
     * <p>Example: {@code PT2H}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repeatNotificationDuration")
    private final String repeatNotificationDuration;

    /**
     * The frequency for re-submitting alarm notifications, if the alarm keeps firing without
     * interruption. Format defined by ISO 8601. For example, {@code PT4H} indicates four hours.
     * Minimum: PT1M. Maximum: P30D.
     *
     * <p>Default value: null (notifications are not re-submitted).
     *
     * <p>Example: {@code PT2H}
     *
     * @return the value
     */
    public String getRepeatNotificationDuration() {
        return repeatNotificationDuration;
    }

    /** The configuration details for suppressing an alarm. */
    @com.fasterxml.jackson.annotation.JsonProperty("suppression")
    private final Suppression suppression;

    /**
     * The configuration details for suppressing an alarm.
     *
     * @return the value
     */
    public Suppression getSuppression() {
        return suppression;
    }

    /**
     * Whether the alarm is enabled.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Whether the alarm is enabled.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A set of overrides that control evaluations of the alarm.
     *
     * <p>Each override can specify values for query, severity, body, and pending duration. When an
     * alarm contains overrides, the Monitoring service evaluates each override in order, beginning
     * with the first override in the array (index position {@code 0}), and then evaluates the
     * alarm's base values ({@code ruleName} value of {@code BASE}).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("overrides")
    private final java.util.List<AlarmOverride> overrides;

    /**
     * A set of overrides that control evaluations of the alarm.
     *
     * <p>Each override can specify values for query, severity, body, and pending duration. When an
     * alarm contains overrides, the Monitoring service evaluates each override in order, beginning
     * with the first override in the array (index position {@code 0}), and then evaluates the
     * alarm's base values ({@code ruleName} value of {@code BASE}).
     *
     * @return the value
     */
    public java.util.List<AlarmOverride> getOverrides() {
        return overrides;
    }

    /**
     * Identifier of the alarm's base values for alarm evaluation, for use when the alarm contains
     * overrides. Default value is {@code BASE}. For information about alarm overrides, see {@link
     * #alarmOverride(AlarmOverrideRequest) alarmOverride}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ruleName")
    private final String ruleName;

    /**
     * Identifier of the alarm's base values for alarm evaluation, for use when the alarm contains
     * overrides. Default value is {@code BASE}. For information about alarm overrides, see {@link
     * #alarmOverride(AlarmOverrideRequest) alarmOverride}.
     *
     * @return the value
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * The version of the alarm notification to be delivered. Allowed value: {@code 1.X} The value
     * must start with a number (up to four digits), followed by a period and an uppercase X.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("notificationVersion")
    private final String notificationVersion;

    /**
     * The version of the alarm notification to be delivered. Allowed value: {@code 1.X} The value
     * must start with a number (up to four digits), followed by a period and an uppercase X.
     *
     * @return the value
     */
    public String getNotificationVersion() {
        return notificationVersion;
    }

    /**
     * Customizable notification title ({@code title} [alarm message
     * parameter](https://docs.oracle.com/iaas/Content/Monitoring/alarm-message-format.htm)).
     * Optionally include [dynamic
     * variables](https://docs.oracle.com/iaas/Content/Monitoring/Tasks/update-alarm-dynamic-variables.htm).
     * The notification title appears as the subject line in a formatted email message and as the
     * title in a Slack message.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("notificationTitle")
    private final String notificationTitle;

    /**
     * Customizable notification title ({@code title} [alarm message
     * parameter](https://docs.oracle.com/iaas/Content/Monitoring/alarm-message-format.htm)).
     * Optionally include [dynamic
     * variables](https://docs.oracle.com/iaas/Content/Monitoring/Tasks/update-alarm-dynamic-variables.htm).
     * The notification title appears as the subject line in a formatted email message and as the
     * title in a Slack message.
     *
     * @return the value
     */
    public String getNotificationTitle() {
        return notificationTitle;
    }

    /**
     * Customizable slack period to wait for metric ingestion before evaluating the alarm. Specify a
     * string in ISO 8601 format ({@code PT10M} for ten minutes or {@code PT1H} for one hour).
     * Minimum: PT3M. Maximum: PT2H. Default: PT3M. For more information about the slack period, see
     * [About the Internal Reset
     * Period](https://docs.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#reset).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("evaluationSlackDuration")
    private final String evaluationSlackDuration;

    /**
     * Customizable slack period to wait for metric ingestion before evaluating the alarm. Specify a
     * string in ISO 8601 format ({@code PT10M} for ten minutes or {@code PT1H} for one hour).
     * Minimum: PT3M. Maximum: PT2H. Default: PT3M. For more information about the slack period, see
     * [About the Internal Reset
     * Period](https://docs.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#reset).
     *
     * @return the value
     */
    public String getEvaluationSlackDuration() {
        return evaluationSlackDuration;
    }

    /**
     * Customizable alarm summary ({@code alarmSummary} [alarm message
     * parameter](https://docs.oracle.com/iaas/Content/Monitoring/alarm-message-format.htm)).
     * Optionally include [dynamic
     * variables](https://docs.oracle.com/iaas/Content/Monitoring/Tasks/update-alarm-dynamic-variables.htm).
     * The alarm summary appears within the body of the alarm message and in responses to {@link
     * #listAlarmsStatus(ListAlarmsStatusRequest) listAlarmsStatus} {@link
     * #getAlarmHistory(GetAlarmHistoryRequest) getAlarmHistory} and {@link
     * #retrieveDimensionStates(RetrieveDimensionStatesRequest) retrieveDimensionStates}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("alarmSummary")
    private final String alarmSummary;

    /**
     * Customizable alarm summary ({@code alarmSummary} [alarm message
     * parameter](https://docs.oracle.com/iaas/Content/Monitoring/alarm-message-format.htm)).
     * Optionally include [dynamic
     * variables](https://docs.oracle.com/iaas/Content/Monitoring/Tasks/update-alarm-dynamic-variables.htm).
     * The alarm summary appears within the body of the alarm message and in responses to {@link
     * #listAlarmsStatus(ListAlarmsStatusRequest) listAlarmsStatus} {@link
     * #getAlarmHistory(GetAlarmHistoryRequest) getAlarmHistory} and {@link
     * #retrieveDimensionStates(RetrieveDimensionStatesRequest) retrieveDimensionStates}.
     *
     * @return the value
     */
    public String getAlarmSummary() {
        return alarmSummary;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateAlarmDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
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
        sb.append(", isNotificationsPerMetricDimensionEnabled=")
                .append(String.valueOf(this.isNotificationsPerMetricDimensionEnabled));
        sb.append(", messageFormat=").append(String.valueOf(this.messageFormat));
        sb.append(", destinations=").append(String.valueOf(this.destinations));
        sb.append(", repeatNotificationDuration=")
                .append(String.valueOf(this.repeatNotificationDuration));
        sb.append(", suppression=").append(String.valueOf(this.suppression));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", overrides=").append(String.valueOf(this.overrides));
        sb.append(", ruleName=").append(String.valueOf(this.ruleName));
        sb.append(", notificationVersion=").append(String.valueOf(this.notificationVersion));
        sb.append(", notificationTitle=").append(String.valueOf(this.notificationTitle));
        sb.append(", evaluationSlackDuration=")
                .append(String.valueOf(this.evaluationSlackDuration));
        sb.append(", alarmSummary=").append(String.valueOf(this.alarmSummary));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAlarmDetails)) {
            return false;
        }

        UpdateAlarmDetails other = (UpdateAlarmDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
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
                && java.util.Objects.equals(
                        this.isNotificationsPerMetricDimensionEnabled,
                        other.isNotificationsPerMetricDimensionEnabled)
                && java.util.Objects.equals(this.messageFormat, other.messageFormat)
                && java.util.Objects.equals(this.destinations, other.destinations)
                && java.util.Objects.equals(
                        this.repeatNotificationDuration, other.repeatNotificationDuration)
                && java.util.Objects.equals(this.suppression, other.suppression)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.overrides, other.overrides)
                && java.util.Objects.equals(this.ruleName, other.ruleName)
                && java.util.Objects.equals(this.notificationVersion, other.notificationVersion)
                && java.util.Objects.equals(this.notificationTitle, other.notificationTitle)
                && java.util.Objects.equals(
                        this.evaluationSlackDuration, other.evaluationSlackDuration)
                && java.util.Objects.equals(this.alarmSummary, other.alarmSummary)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
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
                        + (this.isNotificationsPerMetricDimensionEnabled == null
                                ? 43
                                : this.isNotificationsPerMetricDimensionEnabled.hashCode());
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
        result = (result * PRIME) + (this.overrides == null ? 43 : this.overrides.hashCode());
        result = (result * PRIME) + (this.ruleName == null ? 43 : this.ruleName.hashCode());
        result =
                (result * PRIME)
                        + (this.notificationVersion == null
                                ? 43
                                : this.notificationVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.notificationTitle == null ? 43 : this.notificationTitle.hashCode());
        result =
                (result * PRIME)
                        + (this.evaluationSlackDuration == null
                                ? 43
                                : this.evaluationSlackDuration.hashCode());
        result = (result * PRIME) + (this.alarmSummary == null ? 43 : this.alarmSummary.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
