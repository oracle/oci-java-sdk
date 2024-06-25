/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.model;

/**
 * Values to use for an independent evaluation of the alarm.
 * You can specify values for query, severity, body, and pending duration.
 * When an alarm contains overrides, the Monitoring service evaluates each override in order,
 * beginning with the first override in the array (index position {@code 0}),
 * and then evaluates the alarm's base values ({@code ruleName} value of {@code BASE})
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AlarmOverride.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AlarmOverride extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"pendingDuration", "severity", "body", "ruleName", "query"})
    public AlarmOverride(
            String pendingDuration,
            Alarm.Severity severity,
            String body,
            String ruleName,
            String query) {
        super();
        this.pendingDuration = pendingDuration;
        this.severity = severity;
        this.body = body;
        this.ruleName = ruleName;
        this.query = query;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        private String pendingDuration;

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
         * @param pendingDuration the value to set
         * @return this builder
         **/
        public Builder pendingDuration(String pendingDuration) {
            this.pendingDuration = pendingDuration;
            this.__explicitlySet__.add("pendingDuration");
            return this;
        }
        /**
         * The perceived severity of the alarm with regard to the affected system.
         * <p>
         * Example: {@code CRITICAL}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Alarm.Severity severity;

        /**
         * The perceived severity of the alarm with regard to the affected system.
         * <p>
         * Example: {@code CRITICAL}
         *
         * @param severity the value to set
         * @return this builder
         **/
        public Builder severity(Alarm.Severity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /**
         * The human-readable content of the delivered alarm notification.
         * Optionally include [dynamic variables](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Tasks/update-alarm-dynamic-variables.htm).
         * Oracle recommends providing guidance
         * to operators for resolving the alarm condition. Consider adding links to standard runbook
         * practices. Avoid entering confidential information.
         * <p>
         * Example: {@code High CPU usage alert. Follow runbook instructions for resolution.}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("body")
        private String body;

        /**
         * The human-readable content of the delivered alarm notification.
         * Optionally include [dynamic variables](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Tasks/update-alarm-dynamic-variables.htm).
         * Oracle recommends providing guidance
         * to operators for resolving the alarm condition. Consider adding links to standard runbook
         * practices. Avoid entering confidential information.
         * <p>
         * Example: {@code High CPU usage alert. Follow runbook instructions for resolution.}
         *
         * @param body the value to set
         * @return this builder
         **/
        public Builder body(String body) {
            this.body = body;
            this.__explicitlySet__.add("body");
            return this;
        }
        /**
         * A user-friendly description for this alarm override. Must be unique across all {@code ruleName} values for the alarm.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ruleName")
        private String ruleName;

        /**
         * A user-friendly description for this alarm override. Must be unique across all {@code ruleName} values for the alarm.
         *
         * @param ruleName the value to set
         * @return this builder
         **/
        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            this.__explicitlySet__.add("ruleName");
            return this;
        }
        /**
         * The Monitoring Query Language (MQL) expression to evaluate for the alarm. The Alarms feature of
         * the Monitoring service interprets results for each returned time series as Boolean values,
         * where zero represents false and a non-zero value represents true. A true value means that the trigger
         * rule condition has been met. The query must specify a metric, statistic, interval, and trigger
         * rule (threshold or absence). Supported values for interval depend on the specified time range. More
         * interval values are supported for smaller time ranges. You can optionally
         * specify dimensions and grouping functions.
         * Also, you can customize the
         * [absence detection period](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Tasks/create-edit-alarm-query-absence-detection-period.htm).
         * Supported grouping functions: {@code grouping()}, {@code groupBy()}.
         * For information about writing MQL expressions, see
         * [Editing the MQL Expression for a Query](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Tasks/query-metric-mql.htm).
         * For details about MQL, see
         * [Monitoring Query Language (MQL) Reference](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Reference/mql.htm).
         * For available dimensions, review the metric definition for the supported service. See
         * [Supported Services](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#SupportedServices).
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
         * Example of absence alarm with custom absence detection period of 20 hours:
         * <p>
         * -----
         *
         *     CpuUtilization[1m]{availabilityDomain="cumS:PHX-AD-1"}.absent(20h)
         *
         *   -----
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("query")
        private String query;

        /**
         * The Monitoring Query Language (MQL) expression to evaluate for the alarm. The Alarms feature of
         * the Monitoring service interprets results for each returned time series as Boolean values,
         * where zero represents false and a non-zero value represents true. A true value means that the trigger
         * rule condition has been met. The query must specify a metric, statistic, interval, and trigger
         * rule (threshold or absence). Supported values for interval depend on the specified time range. More
         * interval values are supported for smaller time ranges. You can optionally
         * specify dimensions and grouping functions.
         * Also, you can customize the
         * [absence detection period](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Tasks/create-edit-alarm-query-absence-detection-period.htm).
         * Supported grouping functions: {@code grouping()}, {@code groupBy()}.
         * For information about writing MQL expressions, see
         * [Editing the MQL Expression for a Query](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Tasks/query-metric-mql.htm).
         * For details about MQL, see
         * [Monitoring Query Language (MQL) Reference](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Reference/mql.htm).
         * For available dimensions, review the metric definition for the supported service. See
         * [Supported Services](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#SupportedServices).
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
         * Example of absence alarm with custom absence detection period of 20 hours:
         * <p>
         * -----
         *
         *     CpuUtilization[1m]{availabilityDomain="cumS:PHX-AD-1"}.absent(20h)
         *
         *   -----
         *
         * @param query the value to set
         * @return this builder
         **/
        public Builder query(String query) {
            this.query = query;
            this.__explicitlySet__.add("query");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AlarmOverride build() {
            AlarmOverride model =
                    new AlarmOverride(
                            this.pendingDuration,
                            this.severity,
                            this.body,
                            this.ruleName,
                            this.query);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AlarmOverride model) {
            if (model.wasPropertyExplicitlySet("pendingDuration")) {
                this.pendingDuration(model.getPendingDuration());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("body")) {
                this.body(model.getBody());
            }
            if (model.wasPropertyExplicitlySet("ruleName")) {
                this.ruleName(model.getRuleName());
            }
            if (model.wasPropertyExplicitlySet("query")) {
                this.query(model.getQuery());
            }
            return this;
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
     * @return the value
     **/
    public String getPendingDuration() {
        return pendingDuration;
    }

    /**
     * The perceived severity of the alarm with regard to the affected system.
     * <p>
     * Example: {@code CRITICAL}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final Alarm.Severity severity;

    /**
     * The perceived severity of the alarm with regard to the affected system.
     * <p>
     * Example: {@code CRITICAL}
     *
     * @return the value
     **/
    public Alarm.Severity getSeverity() {
        return severity;
    }

    /**
     * The human-readable content of the delivered alarm notification.
     * Optionally include [dynamic variables](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Tasks/update-alarm-dynamic-variables.htm).
     * Oracle recommends providing guidance
     * to operators for resolving the alarm condition. Consider adding links to standard runbook
     * practices. Avoid entering confidential information.
     * <p>
     * Example: {@code High CPU usage alert. Follow runbook instructions for resolution.}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("body")
    private final String body;

    /**
     * The human-readable content of the delivered alarm notification.
     * Optionally include [dynamic variables](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Tasks/update-alarm-dynamic-variables.htm).
     * Oracle recommends providing guidance
     * to operators for resolving the alarm condition. Consider adding links to standard runbook
     * practices. Avoid entering confidential information.
     * <p>
     * Example: {@code High CPU usage alert. Follow runbook instructions for resolution.}
     *
     * @return the value
     **/
    public String getBody() {
        return body;
    }

    /**
     * A user-friendly description for this alarm override. Must be unique across all {@code ruleName} values for the alarm.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ruleName")
    private final String ruleName;

    /**
     * A user-friendly description for this alarm override. Must be unique across all {@code ruleName} values for the alarm.
     *
     * @return the value
     **/
    public String getRuleName() {
        return ruleName;
    }

    /**
     * The Monitoring Query Language (MQL) expression to evaluate for the alarm. The Alarms feature of
     * the Monitoring service interprets results for each returned time series as Boolean values,
     * where zero represents false and a non-zero value represents true. A true value means that the trigger
     * rule condition has been met. The query must specify a metric, statistic, interval, and trigger
     * rule (threshold or absence). Supported values for interval depend on the specified time range. More
     * interval values are supported for smaller time ranges. You can optionally
     * specify dimensions and grouping functions.
     * Also, you can customize the
     * [absence detection period](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Tasks/create-edit-alarm-query-absence-detection-period.htm).
     * Supported grouping functions: {@code grouping()}, {@code groupBy()}.
     * For information about writing MQL expressions, see
     * [Editing the MQL Expression for a Query](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Tasks/query-metric-mql.htm).
     * For details about MQL, see
     * [Monitoring Query Language (MQL) Reference](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Reference/mql.htm).
     * For available dimensions, review the metric definition for the supported service. See
     * [Supported Services](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#SupportedServices).
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
     * Example of absence alarm with custom absence detection period of 20 hours:
     * <p>
     * -----
     *
     *     CpuUtilization[1m]{availabilityDomain="cumS:PHX-AD-1"}.absent(20h)
     *
     *   -----
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final String query;

    /**
     * The Monitoring Query Language (MQL) expression to evaluate for the alarm. The Alarms feature of
     * the Monitoring service interprets results for each returned time series as Boolean values,
     * where zero represents false and a non-zero value represents true. A true value means that the trigger
     * rule condition has been met. The query must specify a metric, statistic, interval, and trigger
     * rule (threshold or absence). Supported values for interval depend on the specified time range. More
     * interval values are supported for smaller time ranges. You can optionally
     * specify dimensions and grouping functions.
     * Also, you can customize the
     * [absence detection period](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Tasks/create-edit-alarm-query-absence-detection-period.htm).
     * Supported grouping functions: {@code grouping()}, {@code groupBy()}.
     * For information about writing MQL expressions, see
     * [Editing the MQL Expression for a Query](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Tasks/query-metric-mql.htm).
     * For details about MQL, see
     * [Monitoring Query Language (MQL) Reference](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Reference/mql.htm).
     * For available dimensions, review the metric definition for the supported service. See
     * [Supported Services](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#SupportedServices).
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
     * Example of absence alarm with custom absence detection period of 20 hours:
     * <p>
     * -----
     *
     *     CpuUtilization[1m]{availabilityDomain="cumS:PHX-AD-1"}.absent(20h)
     *
     *   -----
     *
     * @return the value
     **/
    public String getQuery() {
        return query;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AlarmOverride(");
        sb.append("super=").append(super.toString());
        sb.append("pendingDuration=").append(String.valueOf(this.pendingDuration));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", body=").append(String.valueOf(this.body));
        sb.append(", ruleName=").append(String.valueOf(this.ruleName));
        sb.append(", query=").append(String.valueOf(this.query));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AlarmOverride)) {
            return false;
        }

        AlarmOverride other = (AlarmOverride) o;
        return java.util.Objects.equals(this.pendingDuration, other.pendingDuration)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.body, other.body)
                && java.util.Objects.equals(this.ruleName, other.ruleName)
                && java.util.Objects.equals(this.query, other.query)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.pendingDuration == null ? 43 : this.pendingDuration.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.body == null ? 43 : this.body.hashCode());
        result = (result * PRIME) + (this.ruleName == null ? 43 : this.ruleName.hashCode());
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
