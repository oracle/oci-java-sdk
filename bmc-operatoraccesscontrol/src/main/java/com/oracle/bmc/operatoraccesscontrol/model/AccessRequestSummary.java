/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/**
 * Summary of access request.
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
    builder = AccessRequestSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AccessRequestSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("requestId")
        private String requestId;

        public Builder requestId(String requestId) {
            this.requestId = requestId;
            this.__explicitlySet__.add("requestId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("accessReasonSummary")
        private String accessReasonSummary;

        public Builder accessReasonSummary(String accessReasonSummary) {
            this.accessReasonSummary = accessReasonSummary;
            this.__explicitlySet__.add("accessReasonSummary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AccessRequestLifecycleStates lifecycleState;

        public Builder lifecycleState(AccessRequestLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfCreation")
        private java.util.Date timeOfCreation;

        public Builder timeOfCreation(java.util.Date timeOfCreation) {
            this.timeOfCreation = timeOfCreation;
            this.__explicitlySet__.add("timeOfCreation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfModification")
        private java.util.Date timeOfModification;

        public Builder timeOfModification(java.util.Date timeOfModification) {
            this.timeOfModification = timeOfModification;
            this.__explicitlySet__.add("timeOfModification");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("duration")
        private Integer duration;

        public Builder duration(Integer duration) {
            this.duration = duration;
            this.__explicitlySet__.add("duration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("extendDuration")
        private Integer extendDuration;

        public Builder extendDuration(Integer extendDuration) {
            this.extendDuration = extendDuration;
            this.__explicitlySet__.add("extendDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private AccessRequestSeverities severity;

        public Builder severity(AccessRequestSeverities severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproved")
        private Boolean isAutoApproved;

        public Builder isAutoApproved(Boolean isAutoApproved) {
            this.isAutoApproved = isAutoApproved;
            this.__explicitlySet__.add("isAutoApproved");
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

        public AccessRequestSummary build() {
            AccessRequestSummary __instance__ =
                    new AccessRequestSummary(
                            id,
                            requestId,
                            accessReasonSummary,
                            compartmentId,
                            resourceId,
                            resourceName,
                            lifecycleState,
                            timeOfCreation,
                            timeOfModification,
                            duration,
                            extendDuration,
                            severity,
                            isAutoApproved,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessRequestSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .requestId(o.getRequestId())
                            .accessReasonSummary(o.getAccessReasonSummary())
                            .compartmentId(o.getCompartmentId())
                            .resourceId(o.getResourceId())
                            .resourceName(o.getResourceName())
                            .lifecycleState(o.getLifecycleState())
                            .timeOfCreation(o.getTimeOfCreation())
                            .timeOfModification(o.getTimeOfModification())
                            .duration(o.getDuration())
                            .extendDuration(o.getExtendDuration())
                            .severity(o.getSeverity())
                            .isAutoApproved(o.getIsAutoApproved())
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
     * The OCID of the access request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * This is a system-generated identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestId")
    String requestId;

    /**
     * Comment associated with the access request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accessReasonSummary")
    String accessReasonSummary;

    /**
     * The OCID of the compartment that contains the access request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The OCID of the target resource associated with the access request. The operator raises an access request to get approval to
     * access the target resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    String resourceId;

    /**
     * The name of the target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    String resourceName;

    /**
     * The current state of the AccessRequest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    AccessRequestLifecycleStates lifecycleState;

    /**
     * Time when the access request was created by the operator user in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfCreation")
    java.util.Date timeOfCreation;

    /**
     * Time when the access request was last modified in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfModification")
    java.util.Date timeOfModification;

    /**
     * Duration in hours for which access is sought on the target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    Integer duration;

    /**
     * Duration in hours for which extension access is sought on the target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extendDuration")
    Integer extendDuration;

    /**
     * Priority assigned to the access request by the operator
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    AccessRequestSeverities severity;

    /**
     * Whether the access request was automatically approved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproved")
    Boolean isAutoApproved;

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
