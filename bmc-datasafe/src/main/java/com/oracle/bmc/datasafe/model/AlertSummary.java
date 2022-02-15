/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of a Data Safe Alert.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AlertSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AlertSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private AlertStatus status;

        public Builder status(AlertStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private AlertSeverity severity;

        public Builder severity(AlertSeverity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operationTime")
        private java.util.Date operationTime;

        public Builder operationTime(java.util.Date operationTime) {
            this.operationTime = operationTime;
            this.__explicitlySet__.add("operationTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private String operation;

        public Builder operation(String operation) {
            this.operation = operation;
            this.__explicitlySet__.add("operation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
        private OperationStatus operationStatus;

        public Builder operationStatus(OperationStatus operationStatus) {
            this.operationStatus = operationStatus;
            this.__explicitlySet__.add("operationStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetIds")
        private java.util.List<String> targetIds;

        public Builder targetIds(java.util.List<String> targetIds) {
            this.targetIds = targetIds;
            this.__explicitlySet__.add("targetIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetNames")
        private java.util.List<String> targetNames;

        public Builder targetNames(java.util.List<String> targetNames) {
            this.targetNames = targetNames;
            this.__explicitlySet__.add("targetNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("policyId")
        private String policyId;

        public Builder policyId(String policyId) {
            this.policyId = policyId;
            this.__explicitlySet__.add("policyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("alertType")
        private AlertType alertType;

        public Builder alertType(AlertType alertType) {
            this.alertType = alertType;
            this.__explicitlySet__.add("alertType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AlertLifecycleState lifecycleState;

        public Builder lifecycleState(AlertLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("featureDetails")
        private java.util.Map<String, java.util.Map<String, Object>> featureDetails;

        public Builder featureDetails(
                java.util.Map<String, java.util.Map<String, Object>> featureDetails) {
            this.featureDetails = featureDetails;
            this.__explicitlySet__.add("featureDetails");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AlertSummary build() {
            AlertSummary __instance__ =
                    new AlertSummary(
                            id,
                            status,
                            displayName,
                            description,
                            severity,
                            operationTime,
                            operation,
                            operationStatus,
                            targetIds,
                            targetNames,
                            policyId,
                            alertType,
                            compartmentId,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            featureDetails,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AlertSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .status(o.getStatus())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .severity(o.getSeverity())
                            .operationTime(o.getOperationTime())
                            .operation(o.getOperation())
                            .operationStatus(o.getOperationStatus())
                            .targetIds(o.getTargetIds())
                            .targetNames(o.getTargetNames())
                            .policyId(o.getPolicyId())
                            .alertType(o.getAlertType())
                            .compartmentId(o.getCompartmentId())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .featureDetails(o.getFeatureDetails())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The OCID of the alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The status of the alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    AlertStatus status;

    /**
     * The display name of the alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The details of the alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Severity level of the alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    AlertSeverity severity;

    /**
     * Creation date and time of the operation that triggered alert, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationTime")
    java.util.Date operationTime;

    /**
     * The operation that triggered alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    String operation;
    /**
     * The result of the operation (event) that triggered alert.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum OperationStatus {
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, OperationStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (OperationStatus v : OperationStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OperationStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OperationStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OperationStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The result of the operation (event) that triggered alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
    OperationStatus operationStatus;

    /**
     * Array of OCIDs of the target database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetIds")
    java.util.List<String> targetIds;

    /**
     * Array of names of the target database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetNames")
    java.util.List<String> targetNames;

    /**
     * The OCID of the policy that triggered alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policyId")
    String policyId;

    /**
     * Type of the alert. Indicates the Data Safe feature triggering the alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alertType")
    AlertType alertType;

    /**
     * The OCID of the compartment that contains the alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Creation date and time of the alert, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * Last date and time the alert was updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The current state of the alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    AlertLifecycleState lifecycleState;

    /**
     * Map that contains maps of values.
     *  Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("featureDetails")
    java.util.Map<String, java.util.Map<String, Object>> featureDetails;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
