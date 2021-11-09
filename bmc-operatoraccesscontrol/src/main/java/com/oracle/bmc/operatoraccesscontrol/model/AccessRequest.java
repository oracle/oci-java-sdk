/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/**
 * An Oracle operator raises access request when they need access to any infrastructure resource governed by Operator Access Control.
 * The access request identifies the target resource and the set of operator actions. Access request handling depends upon the Operator Control
 * that governs the target resource, and the set of operator actions listed for approval in the access request. If all of the operator actions
 * listed in the access request are in the pre-approved list in the Operator Control that governs the target resource, then the access request is
 * automatically approved. If not, then the access request requires explicit approval from the approver group specified by the Operator Control governing the target resource.
 * <p>
 * You can approve or reject an access request. You can also revoke the approval of an already approved access request. While creating an access request,
 * the operator specifies the duration of access. You have the option to approve the entire duration or reduce or even increase the time duration.
 * An operator can also request for an extension. The approval for such an extension is processed the same way the original access request was processed.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AccessRequest.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AccessRequest {
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

        @com.fasterxml.jackson.annotation.JsonProperty("operatorId")
        private String operatorId;

        public Builder operatorId(String operatorId) {
            this.operatorId = operatorId;
            this.__explicitlySet__.add("operatorId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("actionRequestsList")
        private java.util.List<String> actionRequestsList;

        public Builder actionRequestsList(java.util.List<String> actionRequestsList) {
            this.actionRequestsList = actionRequestsList;
            this.__explicitlySet__.add("actionRequestsList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("reason")
        private String reason;

        public Builder reason(String reason) {
            this.reason = reason;
            this.__explicitlySet__.add("reason");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private AccessRequestSeverities severity;

        public Builder severity(AccessRequestSeverities severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
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

        @com.fasterxml.jackson.annotation.JsonProperty("workflowId")
        private java.util.List<String> workflowId;

        public Builder workflowId(java.util.List<String> workflowId) {
            this.workflowId = workflowId;
            this.__explicitlySet__.add("workflowId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproved")
        private Boolean isAutoApproved;

        public Builder isAutoApproved(Boolean isAutoApproved) {
            this.isAutoApproved = isAutoApproved;
            this.__explicitlySet__.add("isAutoApproved");
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfUserCreation")
        private java.util.Date timeOfUserCreation;

        public Builder timeOfUserCreation(java.util.Date timeOfUserCreation) {
            this.timeOfUserCreation = timeOfUserCreation;
            this.__explicitlySet__.add("timeOfUserCreation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("approverComment")
        private String approverComment;

        public Builder approverComment(String approverComment) {
            this.approverComment = approverComment;
            this.__explicitlySet__.add("approverComment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("closureComment")
        private String closureComment;

        public Builder closureComment(String closureComment) {
            this.closureComment = closureComment;
            this.__explicitlySet__.add("closureComment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("opctlId")
        private String opctlId;

        public Builder opctlId(String opctlId) {
            this.opctlId = opctlId;
            this.__explicitlySet__.add("opctlId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("opctlName")
        private String opctlName;

        public Builder opctlName(String opctlName) {
            this.opctlName = opctlName;
            this.__explicitlySet__.add("opctlName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemMessage")
        private String systemMessage;

        public Builder systemMessage(String systemMessage) {
            this.systemMessage = systemMessage;
            this.__explicitlySet__.add("systemMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("opctlAdditionalMessage")
        private String opctlAdditionalMessage;

        public Builder opctlAdditionalMessage(String opctlAdditionalMessage) {
            this.opctlAdditionalMessage = opctlAdditionalMessage;
            this.__explicitlySet__.add("opctlAdditionalMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("auditType")
        private java.util.List<String> auditType;

        public Builder auditType(java.util.List<String> auditType) {
            this.auditType = auditType;
            this.__explicitlySet__.add("auditType");
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

        public AccessRequest build() {
            AccessRequest __instance__ =
                    new AccessRequest(
                            id,
                            requestId,
                            accessReasonSummary,
                            operatorId,
                            resourceId,
                            resourceName,
                            compartmentId,
                            resourceType,
                            actionRequestsList,
                            reason,
                            severity,
                            duration,
                            extendDuration,
                            workflowId,
                            isAutoApproved,
                            lifecycleState,
                            timeOfCreation,
                            timeOfModification,
                            timeOfUserCreation,
                            userId,
                            approverComment,
                            closureComment,
                            opctlId,
                            opctlName,
                            systemMessage,
                            opctlAdditionalMessage,
                            auditType,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessRequest o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .requestId(o.getRequestId())
                            .accessReasonSummary(o.getAccessReasonSummary())
                            .operatorId(o.getOperatorId())
                            .resourceId(o.getResourceId())
                            .resourceName(o.getResourceName())
                            .compartmentId(o.getCompartmentId())
                            .resourceType(o.getResourceType())
                            .actionRequestsList(o.getActionRequestsList())
                            .reason(o.getReason())
                            .severity(o.getSeverity())
                            .duration(o.getDuration())
                            .extendDuration(o.getExtendDuration())
                            .workflowId(o.getWorkflowId())
                            .isAutoApproved(o.getIsAutoApproved())
                            .lifecycleState(o.getLifecycleState())
                            .timeOfCreation(o.getTimeOfCreation())
                            .timeOfModification(o.getTimeOfModification())
                            .timeOfUserCreation(o.getTimeOfUserCreation())
                            .userId(o.getUserId())
                            .approverComment(o.getApproverComment())
                            .closureComment(o.getClosureComment())
                            .opctlId(o.getOpctlId())
                            .opctlName(o.getOpctlName())
                            .systemMessage(o.getSystemMessage())
                            .opctlAdditionalMessage(o.getOpctlAdditionalMessage())
                            .auditType(o.getAuditType())
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
     * This is an automatic identifier generated by the system which is easier for human comprehension.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestId")
    String requestId;

    /**
     * Summary comment by the operator creating the access request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accessReasonSummary")
    String accessReasonSummary;

    /**
     * A unique identifier associated with the operator who raised the request. This identifier can not be used directly to identify the operator.
     * You need to provide this identifier if you would like Oracle to provide additional information about the operator action within Oracle tenancy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operatorId")
    String operatorId;

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
     * The OCID of the compartment that contains the access request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * resourceType for which the AccessRequest is applicable
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    ResourceTypes resourceType;

    /**
     * List of operator actions for which approval is sought by the operator user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionRequestsList")
    java.util.List<String> actionRequestsList;

    /**
     * Summary reason for which the operator is requesting access on the target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    String reason;

    /**
     * Priority assigned to the access request by the operator
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    AccessRequestSeverities severity;

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
     * The OCID of the workflow associated with the access request. This is needed if you want to contact Oracle Support for a stuck access request
     * or for an access request that encounters an internal error.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workflowId")
    java.util.List<String> workflowId;

    /**
     * Whether the access request was automatically approved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproved")
    Boolean isAutoApproved;

    /**
     * The current state of the AccessRequest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    AccessRequestLifecycleStates lifecycleState;

    /**
     * Time when the access request was created in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfCreation")
    java.util.Date timeOfCreation;

    /**
     * Time when the access request was last modified in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfModification")
    java.util.Date timeOfModification;

    /**
     * The time when access request is scheduled to be approved in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfUserCreation")
    java.util.Date timeOfUserCreation;

    /**
     * The OCID of the user that last modified the access request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    String userId;

    /**
     * The last recent Comment entered by the approver of the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approverComment")
    String approverComment;

    /**
     * The comment entered by the operator while closing the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("closureComment")
    String closureComment;

    /**
     * The OCID of the operator control governing the target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("opctlId")
    String opctlId;

    /**
     * Name of the Operator control governing the target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("opctlName")
    String opctlName;

    /**
     * System message that will be displayed to the operator at login to the target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemMessage")
    String systemMessage;

    /**
     * Additional message specific to the access request that can be specified by the approver at the time of approval.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("opctlAdditionalMessage")
    String opctlAdditionalMessage;

    /**
     * Specifies the type of auditing to be enabled. There are two levels of auditing: command-level and keystroke-level.
     * By default, auditing is enabled at the command level i.e., each command issued by the operator is audited. When keystroke-level is chosen,
     * in addition to command level logging, key strokes are also logged.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditType")
    java.util.List<String> auditType;

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
