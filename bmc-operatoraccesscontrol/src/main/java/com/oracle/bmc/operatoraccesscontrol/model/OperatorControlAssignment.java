/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/**
 * An Operator Control Assignment identifies the target resource that is placed under the governance of an Operator Control. Creating an Operator Control Assignment Assignment with a time duration ensures that
 * human accesses to the target resource will be governed by Operator Control for the duration specified.
 *
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
    builder = OperatorControlAssignment.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class OperatorControlAssignment {
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

        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceCompartmentId")
        private String resourceCompartmentId;

        public Builder resourceCompartmentId(String resourceCompartmentId) {
            this.resourceCompartmentId = resourceCompartmentId;
            this.__explicitlySet__.add("resourceCompartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private ResourceTypes resourceType;

        public Builder resourceType(ResourceTypes resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
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

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private OperatorControlAssignmentLifecycleStates lifecycleState;

        public Builder lifecycleState(OperatorControlAssignmentLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("assignerId")
        private String assignerId;

        public Builder assignerId(String assignerId) {
            this.assignerId = assignerId;
            this.__explicitlySet__.add("assignerId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfAssignment")
        private java.util.Date timeOfAssignment;

        public Builder timeOfAssignment(java.util.Date timeOfAssignment) {
            this.timeOfAssignment = timeOfAssignment;
            this.__explicitlySet__.add("timeOfAssignment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("comment")
        private String comment;

        public Builder comment(String comment) {
            this.comment = comment;
            this.__explicitlySet__.add("comment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("unassignerId")
        private String unassignerId;

        public Builder unassignerId(String unassignerId) {
            this.unassignerId = unassignerId;
            this.__explicitlySet__.add("unassignerId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
        private java.util.Date timeOfDeletion;

        public Builder timeOfDeletion(java.util.Date timeOfDeletion) {
            this.timeOfDeletion = timeOfDeletion;
            this.__explicitlySet__.add("timeOfDeletion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("detachmentDescription")
        private String detachmentDescription;

        public Builder detachmentDescription(String detachmentDescription) {
            this.detachmentDescription = detachmentDescription;
            this.__explicitlySet__.add("detachmentDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isLogForwarded")
        private Boolean isLogForwarded;

        public Builder isLogForwarded(Boolean isLogForwarded) {
            this.isLogForwarded = isLogForwarded;
            this.__explicitlySet__.add("isLogForwarded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerAddress")
        private String remoteSyslogServerAddress;

        public Builder remoteSyslogServerAddress(String remoteSyslogServerAddress) {
            this.remoteSyslogServerAddress = remoteSyslogServerAddress;
            this.__explicitlySet__.add("remoteSyslogServerAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerPort")
        private Integer remoteSyslogServerPort;

        public Builder remoteSyslogServerPort(Integer remoteSyslogServerPort) {
            this.remoteSyslogServerPort = remoteSyslogServerPort;
            this.__explicitlySet__.add("remoteSyslogServerPort");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerCACert")
        private String remoteSyslogServerCACert;

        public Builder remoteSyslogServerCACert(String remoteSyslogServerCACert) {
            this.remoteSyslogServerCACert = remoteSyslogServerCACert;
            this.__explicitlySet__.add("remoteSyslogServerCACert");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproveDuringMaintenance")
        private Boolean isAutoApproveDuringMaintenance;

        public Builder isAutoApproveDuringMaintenance(Boolean isAutoApproveDuringMaintenance) {
            this.isAutoApproveDuringMaintenance = isAutoApproveDuringMaintenance;
            this.__explicitlySet__.add("isAutoApproveDuringMaintenance");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
        private Integer errorCode;

        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            this.__explicitlySet__.add("errorCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
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

        public OperatorControlAssignment build() {
            OperatorControlAssignment __instance__ =
                    new OperatorControlAssignment(
                            id,
                            operatorControlId,
                            resourceId,
                            resourceName,
                            resourceCompartmentId,
                            compartmentId,
                            resourceType,
                            timeAssignmentFrom,
                            timeAssignmentTo,
                            isEnforcedAlways,
                            lifecycleState,
                            assignerId,
                            timeOfAssignment,
                            comment,
                            unassignerId,
                            timeOfDeletion,
                            detachmentDescription,
                            isLogForwarded,
                            remoteSyslogServerAddress,
                            remoteSyslogServerPort,
                            remoteSyslogServerCACert,
                            isAutoApproveDuringMaintenance,
                            errorCode,
                            errorMessage,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OperatorControlAssignment o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .operatorControlId(o.getOperatorControlId())
                            .resourceId(o.getResourceId())
                            .resourceName(o.getResourceName())
                            .resourceCompartmentId(o.getResourceCompartmentId())
                            .compartmentId(o.getCompartmentId())
                            .resourceType(o.getResourceType())
                            .timeAssignmentFrom(o.getTimeAssignmentFrom())
                            .timeAssignmentTo(o.getTimeAssignmentTo())
                            .isEnforcedAlways(o.getIsEnforcedAlways())
                            .lifecycleState(o.getLifecycleState())
                            .assignerId(o.getAssignerId())
                            .timeOfAssignment(o.getTimeOfAssignment())
                            .comment(o.getComment())
                            .unassignerId(o.getUnassignerId())
                            .timeOfDeletion(o.getTimeOfDeletion())
                            .detachmentDescription(o.getDetachmentDescription())
                            .isLogForwarded(o.getIsLogForwarded())
                            .remoteSyslogServerAddress(o.getRemoteSyslogServerAddress())
                            .remoteSyslogServerPort(o.getRemoteSyslogServerPort())
                            .remoteSyslogServerCACert(o.getRemoteSyslogServerCACert())
                            .isAutoApproveDuringMaintenance(o.getIsAutoApproveDuringMaintenance())
                            .errorCode(o.getErrorCode())
                            .errorMessage(o.getErrorMessage())
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
     * The OCID of the target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    String resourceId;

    /**
     * Name of the target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    String resourceName;

    /**
     * The OCID of the compartment that contains the target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceCompartmentId")
    String resourceCompartmentId;

    /**
     * The OCID of the comparment that contains the operator control assignment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * resourceType for which the OperatorControlAssignment is applicable
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    ResourceTypes resourceType;

    /**
     * The time at which the target resource will be brought under the governance of the operator control expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAssignmentFrom")
    java.util.Date timeAssignmentFrom;

    /**
     * The time at which the target resource will leave the governance of the operator control expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAssignmentTo")
    java.util.Date timeAssignmentTo;

    /**
     * If set, then the target resource is always governed by the operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnforcedAlways")
    Boolean isEnforcedAlways;

    /**
     * The current lifcycle state of the OperatorControl.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    OperatorControlAssignmentLifecycleStates lifecycleState;

    /**
     * The OCID of the user who created this operator control assignment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("assignerId")
    String assignerId;

    /**
     * Time when the operator control assignment is created in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfAssignment")
    java.util.Date timeOfAssignment;

    /**
     * Comment about the assignment of the operator control to this target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    String comment;

    /**
     * User id who released the operatorControl.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unassignerId")
    String unassignerId;

    /**
     * Time on which the operator control assignment was deleted in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format.Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
    java.util.Date timeOfDeletion;

    /**
     * description containing reason for releasing of OperatorControl.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detachmentDescription")
    String detachmentDescription;

    /**
     * If set indicates that the audit logs are being forwarded to the relevant remote logging server
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLogForwarded")
    Boolean isLogForwarded;

    /**
     * The address of the remote syslog server where the audit logs are being forwarded to. Address in host or IP format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerAddress")
    String remoteSyslogServerAddress;

    /**
     * The listening port of the remote syslog server. The port range is 0 - 65535. Only TCP supported.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerPort")
    Integer remoteSyslogServerPort;

    /**
     * The CA certificate of the remote syslog server.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remoteSyslogServerCACert")
    String remoteSyslogServerCACert;

    /**
     * The boolean if true would autoApprove during maintenance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproveDuringMaintenance")
    Boolean isAutoApproveDuringMaintenance;

    /**
     * The code identifying the error occurred during Assignment operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    Integer errorCode;

    /**
     * The message describing the error occurred during Assignment operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    String errorMessage;

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
