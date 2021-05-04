/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/**
 * Details of the operator control assignment.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OperatorControlAssignmentSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class OperatorControlAssignmentSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("operatorControlId")
        private String operatorControlId;

        public Builder operatorControlId(String operatorControlId) {
            this.operatorControlId = operatorControlId;
            this.__explicitlySet__.add("operatorControlId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeAssignmentFrom")
        private java.util.Date timeAssignmentFrom;

        public Builder timeAssignmentFrom(java.util.Date timeAssignmentFrom) {
            this.timeAssignmentFrom = timeAssignmentFrom;
            this.__explicitlySet__.add("timeAssignmentFrom");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeAssignmentTo")
        private java.util.Date timeAssignmentTo;

        public Builder timeAssignmentTo(java.util.Date timeAssignmentTo) {
            this.timeAssignmentTo = timeAssignmentTo;
            this.__explicitlySet__.add("timeAssignmentTo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEnforcedAlways")
        private Boolean isEnforcedAlways;

        public Builder isEnforcedAlways(Boolean isEnforcedAlways) {
            this.isEnforcedAlways = isEnforcedAlways;
            this.__explicitlySet__.add("isEnforcedAlways");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfAssignment")
        private java.util.Date timeOfAssignment;

        public Builder timeOfAssignment(java.util.Date timeOfAssignment) {
            this.timeOfAssignment = timeOfAssignment;
            this.__explicitlySet__.add("timeOfAssignment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private OperatorControlAssignmentLifecycleStates lifecycleState;

        public Builder lifecycleState(OperatorControlAssignmentLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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

        public OperatorControlAssignmentSummary build() {
            OperatorControlAssignmentSummary __instance__ =
                    new OperatorControlAssignmentSummary(
                            id,
                            operatorControlId,
                            resourceId,
                            resourceType,
                            compartmentId,
                            timeAssignmentFrom,
                            timeAssignmentTo,
                            isEnforcedAlways,
                            timeOfAssignment,
                            lifecycleState,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OperatorControlAssignmentSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .operatorControlId(o.getOperatorControlId())
                            .resourceId(o.getResourceId())
                            .resourceType(o.getResourceType())
                            .compartmentId(o.getCompartmentId())
                            .timeAssignmentFrom(o.getTimeAssignmentFrom())
                            .timeAssignmentTo(o.getTimeAssignmentTo())
                            .isEnforcedAlways(o.getIsEnforcedAlways())
                            .timeOfAssignment(o.getTimeOfAssignment())
                            .lifecycleState(o.getLifecycleState())
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
     * The OCID of the operator control assignment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The OCID of the operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operatorControlId")
    String operatorControlId;

    /**
     * The OCID of the target resource being governed by the operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    String resourceId;

    /**
     * Type of the target resource being governed by the operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    String resourceType;

    /**
     * The OCID of the compartment that contains the operator control assignment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The time at which the target resource will be brought under the governance of the operator control in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAssignmentFrom")
    java.util.Date timeAssignmentFrom;

    /**
     * The time at which the target resource will leave the governance of the operator control in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format.Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAssignmentTo")
    java.util.Date timeAssignmentTo;

    /**
     * If true, then the target resource is always governed by the operator control. Otherwise governance is time-based as specified by timeAssignmentTo and timeAssignmentFrom.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnforcedAlways")
    Boolean isEnforcedAlways;

    /**
     * Time when the operator control assignment is created in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfAssignment")
    java.util.Date timeOfAssignment;

    /**
     * The current lifcycle state of the OperatorControl.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    OperatorControlAssignmentLifecycleStates lifecycleState;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
