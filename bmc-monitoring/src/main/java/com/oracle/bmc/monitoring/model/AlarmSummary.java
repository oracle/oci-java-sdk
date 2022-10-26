/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.model;

/**
 * A summary of properties for the specified alarm. For information about alarms, see [Alarms
 * Overview](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#AlarmsOverview).
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
 *
 * <p>For information about endpoints and signing API requests, see [About the
 * API](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm). For information about
 * available SDKs and tools, see [SDKS and Other
 * Tools](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/sdks.htm). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AlarmSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class AlarmSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "metricCompartmentId",
        "namespace",
        "query",
        "severity",
        "destinations",
        "suppression",
        "isEnabled",
        "freeformTags",
        "definedTags",
        "lifecycleState"
    })
    public AlarmSummary(
            String id,
            String displayName,
            String compartmentId,
            String metricCompartmentId,
            String namespace,
            String query,
            Severity severity,
            java.util.List<String> destinations,
            Suppression suppression,
            Boolean isEnabled,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            Alarm.LifecycleState lifecycleState) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.metricCompartmentId = metricCompartmentId;
        this.namespace = namespace;
        this.query = query;
        this.severity = severity;
        this.destinations = destinations;
        this.suppression = suppression;
        this.isEnabled = isEnabled;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the alarm.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the alarm.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * A user-friendly name for the alarm. It does not have to be unique, and it's changeable.
         *
         * <p>This name is sent as the title for notifications related to this alarm.
         *
         * <p>Example: {@code High CPU Utilization}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the alarm. It does not have to be unique, and it's changeable.
         *
         * <p>This name is sent as the title for notifications related to this alarm.
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment containing the alarm.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment containing the alarm.
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment containing the metric being evaluated by the alarm.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("metricCompartmentId")
        private String metricCompartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment containing the metric being evaluated by the alarm.
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
         * The Monitoring Query Language (MQL) expression to evaluate for the alarm. The Alarms
         * feature of the Monitoring service interprets results for each returned time series as
         * Boolean values, where zero represents false and a non-zero value represents true. A true
         * value means that the trigger rule condition has been met. The query must specify a
         * metric, statistic, interval, and trigger rule (threshold or absence). Supported values
         * for interval depend on the specified time range. More interval values are supported for
         * smaller time ranges. Supported grouping functions: {@code grouping()}, {@code groupBy()}.
         * For details about Monitoring Query Language (MQL), see [Monitoring Query Language (MQL)
         * Reference](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Reference/mql.htm). For
         * available dimensions, review the metric definition for the supported service. See
         * [Supported
         * Services](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#SupportedServices).
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
         * smaller time ranges. Supported grouping functions: {@code grouping()}, {@code groupBy()}.
         * For details about Monitoring Query Language (MQL), see [Monitoring Query Language (MQL)
         * Reference](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Reference/mql.htm). For
         * available dimensions, review the metric definition for the supported service. See
         * [Supported
         * Services](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#SupportedServices).
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
         * The perceived severity of the alarm with regard to the affected system.
         *
         * <p>Example: {@code CRITICAL}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Severity severity;

        /**
         * The perceived severity of the alarm with regard to the affected system.
         *
         * <p>Example: {@code CRITICAL}
         *
         * @param severity the value to set
         * @return this builder
         */
        public Builder severity(Severity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /**
         * A list of destinations to which the notifications for this alarm will be delivered. Each
         * destination is represented by an
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * related to the supported destination service. For example, a destination using the
         * Notifications service is represented by a topic OCID. Supported destination services:
         * Notifications Service. Limit: One destination per supported destination service.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinations")
        private java.util.List<String> destinations;

        /**
         * A list of destinations to which the notifications for this alarm will be delivered. Each
         * destination is represented by an
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * related to the supported destination service. For example, a destination using the
         * Notifications service is represented by a topic OCID. Supported destination services:
         * Notifications Service. Limit: One destination per supported destination service.
         *
         * @param destinations the value to set
         * @return this builder
         */
        public Builder destinations(java.util.List<String> destinations) {
            this.destinations = destinations;
            this.__explicitlySet__.add("destinations");
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
         * The current lifecycle state of the alarm.
         *
         * <p>Example: {@code DELETED}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Alarm.LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the alarm.
         *
         * <p>Example: {@code DELETED}
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(Alarm.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AlarmSummary build() {
            AlarmSummary model =
                    new AlarmSummary(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.metricCompartmentId,
                            this.namespace,
                            this.query,
                            this.severity,
                            this.destinations,
                            this.suppression,
                            this.isEnabled,
                            this.freeformTags,
                            this.definedTags,
                            this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AlarmSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("metricCompartmentId")) {
                this.metricCompartmentId(model.getMetricCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("query")) {
                this.query(model.getQuery());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("destinations")) {
                this.destinations(model.getDestinations());
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
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the alarm.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the alarm.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * A user-friendly name for the alarm. It does not have to be unique, and it's changeable.
     *
     * <p>This name is sent as the title for notifications related to this alarm.
     *
     * <p>Example: {@code High CPU Utilization}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the alarm. It does not have to be unique, and it's changeable.
     *
     * <p>This name is sent as the title for notifications related to this alarm.
     *
     * <p>Example: {@code High CPU Utilization}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment containing the alarm.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment containing the alarm.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment containing the metric being evaluated by the alarm.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metricCompartmentId")
    private final String metricCompartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment containing the metric being evaluated by the alarm.
     *
     * @return the value
     */
    public String getMetricCompartmentId() {
        return metricCompartmentId;
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
     * The Monitoring Query Language (MQL) expression to evaluate for the alarm. The Alarms feature
     * of the Monitoring service interprets results for each returned time series as Boolean values,
     * where zero represents false and a non-zero value represents true. A true value means that the
     * trigger rule condition has been met. The query must specify a metric, statistic, interval,
     * and trigger rule (threshold or absence). Supported values for interval depend on the
     * specified time range. More interval values are supported for smaller time ranges. Supported
     * grouping functions: {@code grouping()}, {@code groupBy()}. For details about Monitoring Query
     * Language (MQL), see [Monitoring Query Language (MQL)
     * Reference](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Reference/mql.htm). For
     * available dimensions, review the metric definition for the supported service. See [Supported
     * Services](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#SupportedServices).
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
     * specified time range. More interval values are supported for smaller time ranges. Supported
     * grouping functions: {@code grouping()}, {@code groupBy()}. For details about Monitoring Query
     * Language (MQL), see [Monitoring Query Language (MQL)
     * Reference](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Reference/mql.htm). For
     * available dimensions, review the metric definition for the supported service. See [Supported
     * Services](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#SupportedServices).
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
     * <p>-----
     *
     * @return the value
     */
    public String getQuery() {
        return query;
    }

    /**
     * The perceived severity of the alarm with regard to the affected system.
     *
     * <p>Example: {@code CRITICAL}
     */
    public enum Severity implements com.oracle.bmc.http.internal.BmcEnum {
        Critical("CRITICAL"),
        Error("ERROR"),
        Warning("WARNING"),
        Info("INFO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
     * The perceived severity of the alarm with regard to the affected system.
     *
     * <p>Example: {@code CRITICAL}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final Severity severity;

    /**
     * The perceived severity of the alarm with regard to the affected system.
     *
     * <p>Example: {@code CRITICAL}
     *
     * @return the value
     */
    public Severity getSeverity() {
        return severity;
    }

    /**
     * A list of destinations to which the notifications for this alarm will be delivered. Each
     * destination is represented by an
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) related
     * to the supported destination service. For example, a destination using the Notifications
     * service is represented by a topic OCID. Supported destination services: Notifications
     * Service. Limit: One destination per supported destination service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinations")
    private final java.util.List<String> destinations;

    /**
     * A list of destinations to which the notifications for this alarm will be delivered. Each
     * destination is represented by an
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) related
     * to the supported destination service. For example, a destination using the Notifications
     * service is represented by a topic OCID. Supported destination services: Notifications
     * Service. Limit: One destination per supported destination service.
     *
     * @return the value
     */
    public java.util.List<String> getDestinations() {
        return destinations;
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
     * The current lifecycle state of the alarm.
     *
     * <p>Example: {@code DELETED}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final Alarm.LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the alarm.
     *
     * <p>Example: {@code DELETED}
     *
     * @return the value
     */
    public Alarm.LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("AlarmSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", metricCompartmentId=").append(String.valueOf(this.metricCompartmentId));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", query=").append(String.valueOf(this.query));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", destinations=").append(String.valueOf(this.destinations));
        sb.append(", suppression=").append(String.valueOf(this.suppression));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AlarmSummary)) {
            return false;
        }

        AlarmSummary other = (AlarmSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.metricCompartmentId, other.metricCompartmentId)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.query, other.query)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.destinations, other.destinations)
                && java.util.Objects.equals(this.suppression, other.suppression)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && super.equals(other);
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
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.destinations == null ? 43 : this.destinations.hashCode());
        result = (result * PRIME) + (this.suppression == null ? 43 : this.suppression.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
