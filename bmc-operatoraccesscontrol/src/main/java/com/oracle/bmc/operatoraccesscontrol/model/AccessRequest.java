/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AccessRequest.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AccessRequest extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "requestId",
        "accessReasonSummary",
        "operatorId",
        "resourceId",
        "resourceName",
        "compartmentId",
        "resourceType",
        "actionRequestsList",
        "reason",
        "severity",
        "duration",
        "extendDuration",
        "workflowId",
        "isAutoApproved",
        "lifecycleState",
        "lifecycleDetails",
        "timeOfCreation",
        "timeOfModification",
        "timeOfUserCreation",
        "userId",
        "approverComment",
        "closureComment",
        "opctlId",
        "opctlName",
        "systemMessage",
        "opctlAdditionalMessage",
        "auditType",
        "freeformTags",
        "definedTags"
    })
    public AccessRequest(
            String id,
            String requestId,
            String accessReasonSummary,
            String operatorId,
            String resourceId,
            String resourceName,
            String compartmentId,
            ResourceTypes resourceType,
            java.util.List<String> actionRequestsList,
            String reason,
            AccessRequestSeverities severity,
            Integer duration,
            Integer extendDuration,
            java.util.List<String> workflowId,
            Boolean isAutoApproved,
            AccessRequestLifecycleStates lifecycleState,
            String lifecycleDetails,
            java.util.Date timeOfCreation,
            java.util.Date timeOfModification,
            java.util.Date timeOfUserCreation,
            String userId,
            String approverComment,
            String closureComment,
            String opctlId,
            String opctlName,
            String systemMessage,
            String opctlAdditionalMessage,
            java.util.List<String> auditType,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.requestId = requestId;
        this.accessReasonSummary = accessReasonSummary;
        this.operatorId = operatorId;
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.compartmentId = compartmentId;
        this.resourceType = resourceType;
        this.actionRequestsList = actionRequestsList;
        this.reason = reason;
        this.severity = severity;
        this.duration = duration;
        this.extendDuration = extendDuration;
        this.workflowId = workflowId;
        this.isAutoApproved = isAutoApproved;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeOfCreation = timeOfCreation;
        this.timeOfModification = timeOfModification;
        this.timeOfUserCreation = timeOfUserCreation;
        this.userId = userId;
        this.approverComment = approverComment;
        this.closureComment = closureComment;
        this.opctlId = opctlId;
        this.opctlName = opctlName;
        this.systemMessage = systemMessage;
        this.opctlAdditionalMessage = opctlAdditionalMessage;
        this.auditType = auditType;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the access request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the access request.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * This is an automatic identifier generated by the system which is easier for human comprehension.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("requestId")
        private String requestId;

        /**
         * This is an automatic identifier generated by the system which is easier for human comprehension.
         * @param requestId the value to set
         * @return this builder
         **/
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            this.__explicitlySet__.add("requestId");
            return this;
        }
        /**
         * Summary comment by the operator creating the access request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("accessReasonSummary")
        private String accessReasonSummary;

        /**
         * Summary comment by the operator creating the access request.
         * @param accessReasonSummary the value to set
         * @return this builder
         **/
        public Builder accessReasonSummary(String accessReasonSummary) {
            this.accessReasonSummary = accessReasonSummary;
            this.__explicitlySet__.add("accessReasonSummary");
            return this;
        }
        /**
         * A unique identifier associated with the operator who raised the request. This identifier can not be used directly to identify the operator.
         * You need to provide this identifier if you would like Oracle to provide additional information about the operator action within Oracle tenancy.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operatorId")
        private String operatorId;

        /**
         * A unique identifier associated with the operator who raised the request. This identifier can not be used directly to identify the operator.
         * You need to provide this identifier if you would like Oracle to provide additional information about the operator action within Oracle tenancy.
         *
         * @param operatorId the value to set
         * @return this builder
         **/
        public Builder operatorId(String operatorId) {
            this.operatorId = operatorId;
            this.__explicitlySet__.add("operatorId");
            return this;
        }
        /**
         * The OCID of the target resource associated with the access request. The operator raises an access request to get approval to
         * access the target resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The OCID of the target resource associated with the access request. The operator raises an access request to get approval to
         * access the target resource.
         *
         * @param resourceId the value to set
         * @return this builder
         **/
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /**
         * The name of the target resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * The name of the target resource.
         * @param resourceName the value to set
         * @return this builder
         **/
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /**
         * The OCID of the compartment that contains the access request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the access request.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * resourceType for which the AccessRequest is applicable
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private ResourceTypes resourceType;

        /**
         * resourceType for which the AccessRequest is applicable
         * @param resourceType the value to set
         * @return this builder
         **/
        public Builder resourceType(ResourceTypes resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * List of operator actions for which approval is sought by the operator user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("actionRequestsList")
        private java.util.List<String> actionRequestsList;

        /**
         * List of operator actions for which approval is sought by the operator user.
         * @param actionRequestsList the value to set
         * @return this builder
         **/
        public Builder actionRequestsList(java.util.List<String> actionRequestsList) {
            this.actionRequestsList = actionRequestsList;
            this.__explicitlySet__.add("actionRequestsList");
            return this;
        }
        /**
         * Summary reason for which the operator is requesting access on the target resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reason")
        private String reason;

        /**
         * Summary reason for which the operator is requesting access on the target resource.
         * @param reason the value to set
         * @return this builder
         **/
        public Builder reason(String reason) {
            this.reason = reason;
            this.__explicitlySet__.add("reason");
            return this;
        }
        /**
         * Priority assigned to the access request by the operator
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private AccessRequestSeverities severity;

        /**
         * Priority assigned to the access request by the operator
         * @param severity the value to set
         * @return this builder
         **/
        public Builder severity(AccessRequestSeverities severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /**
         * Duration in hours for which access is sought on the target resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("duration")
        private Integer duration;

        /**
         * Duration in hours for which access is sought on the target resource.
         * @param duration the value to set
         * @return this builder
         **/
        public Builder duration(Integer duration) {
            this.duration = duration;
            this.__explicitlySet__.add("duration");
            return this;
        }
        /**
         * Duration in hours for which extension access is sought on the target resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("extendDuration")
        private Integer extendDuration;

        /**
         * Duration in hours for which extension access is sought on the target resource.
         * @param extendDuration the value to set
         * @return this builder
         **/
        public Builder extendDuration(Integer extendDuration) {
            this.extendDuration = extendDuration;
            this.__explicitlySet__.add("extendDuration");
            return this;
        }
        /**
         * The OCID of the workflow associated with the access request. This is needed if you want to contact Oracle Support for a stuck access request
         * or for an access request that encounters an internal error.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("workflowId")
        private java.util.List<String> workflowId;

        /**
         * The OCID of the workflow associated with the access request. This is needed if you want to contact Oracle Support for a stuck access request
         * or for an access request that encounters an internal error.
         *
         * @param workflowId the value to set
         * @return this builder
         **/
        public Builder workflowId(java.util.List<String> workflowId) {
            this.workflowId = workflowId;
            this.__explicitlySet__.add("workflowId");
            return this;
        }
        /**
         * Whether the access request was automatically approved.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproved")
        private Boolean isAutoApproved;

        /**
         * Whether the access request was automatically approved.
         * @param isAutoApproved the value to set
         * @return this builder
         **/
        public Builder isAutoApproved(Boolean isAutoApproved) {
            this.isAutoApproved = isAutoApproved;
            this.__explicitlySet__.add("isAutoApproved");
            return this;
        }
        /**
         * The current state of the AccessRequest.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AccessRequestLifecycleStates lifecycleState;

        /**
         * The current state of the AccessRequest.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(AccessRequestLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * more in detail about the lifeCycleState.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * more in detail about the lifeCycleState.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Time when the access request was created in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: '2020-05-22T21:10:29.600Z'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfCreation")
        private java.util.Date timeOfCreation;

        /**
         * Time when the access request was created in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: '2020-05-22T21:10:29.600Z'
         *
         * @param timeOfCreation the value to set
         * @return this builder
         **/
        public Builder timeOfCreation(java.util.Date timeOfCreation) {
            this.timeOfCreation = timeOfCreation;
            this.__explicitlySet__.add("timeOfCreation");
            return this;
        }
        /**
         * Time when the access request was last modified in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: '2020-05-22T21:10:29.600Z'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfModification")
        private java.util.Date timeOfModification;

        /**
         * Time when the access request was last modified in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: '2020-05-22T21:10:29.600Z'
         *
         * @param timeOfModification the value to set
         * @return this builder
         **/
        public Builder timeOfModification(java.util.Date timeOfModification) {
            this.timeOfModification = timeOfModification;
            this.__explicitlySet__.add("timeOfModification");
            return this;
        }
        /**
         * The time when access request is scheduled to be approved in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example: '2020-05-22T21:10:29.600Z'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfUserCreation")
        private java.util.Date timeOfUserCreation;

        /**
         * The time when access request is scheduled to be approved in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example: '2020-05-22T21:10:29.600Z'
         *
         * @param timeOfUserCreation the value to set
         * @return this builder
         **/
        public Builder timeOfUserCreation(java.util.Date timeOfUserCreation) {
            this.timeOfUserCreation = timeOfUserCreation;
            this.__explicitlySet__.add("timeOfUserCreation");
            return this;
        }
        /**
         * The OCID of the user that last modified the access request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        /**
         * The OCID of the user that last modified the access request.
         * @param userId the value to set
         * @return this builder
         **/
        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }
        /**
         * The last recent Comment entered by the approver of the request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("approverComment")
        private String approverComment;

        /**
         * The last recent Comment entered by the approver of the request.
         * @param approverComment the value to set
         * @return this builder
         **/
        public Builder approverComment(String approverComment) {
            this.approverComment = approverComment;
            this.__explicitlySet__.add("approverComment");
            return this;
        }
        /**
         * The comment entered by the operator while closing the request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("closureComment")
        private String closureComment;

        /**
         * The comment entered by the operator while closing the request.
         * @param closureComment the value to set
         * @return this builder
         **/
        public Builder closureComment(String closureComment) {
            this.closureComment = closureComment;
            this.__explicitlySet__.add("closureComment");
            return this;
        }
        /**
         * The OCID of the operator control governing the target resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("opctlId")
        private String opctlId;

        /**
         * The OCID of the operator control governing the target resource.
         * @param opctlId the value to set
         * @return this builder
         **/
        public Builder opctlId(String opctlId) {
            this.opctlId = opctlId;
            this.__explicitlySet__.add("opctlId");
            return this;
        }
        /**
         * Name of the Operator control governing the target resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("opctlName")
        private String opctlName;

        /**
         * Name of the Operator control governing the target resource.
         * @param opctlName the value to set
         * @return this builder
         **/
        public Builder opctlName(String opctlName) {
            this.opctlName = opctlName;
            this.__explicitlySet__.add("opctlName");
            return this;
        }
        /**
         * System message that will be displayed to the operator at login to the target resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemMessage")
        private String systemMessage;

        /**
         * System message that will be displayed to the operator at login to the target resource.
         * @param systemMessage the value to set
         * @return this builder
         **/
        public Builder systemMessage(String systemMessage) {
            this.systemMessage = systemMessage;
            this.__explicitlySet__.add("systemMessage");
            return this;
        }
        /**
         * Additional message specific to the access request that can be specified by the approver at the time of approval.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("opctlAdditionalMessage")
        private String opctlAdditionalMessage;

        /**
         * Additional message specific to the access request that can be specified by the approver at the time of approval.
         * @param opctlAdditionalMessage the value to set
         * @return this builder
         **/
        public Builder opctlAdditionalMessage(String opctlAdditionalMessage) {
            this.opctlAdditionalMessage = opctlAdditionalMessage;
            this.__explicitlySet__.add("opctlAdditionalMessage");
            return this;
        }
        /**
         * Specifies the type of auditing to be enabled. There are two levels of auditing: command-level and keystroke-level.
         * By default, auditing is enabled at the command level i.e., each command issued by the operator is audited. When keystroke-level is chosen,
         * in addition to command level logging, key strokes are also logged.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("auditType")
        private java.util.List<String> auditType;

        /**
         * Specifies the type of auditing to be enabled. There are two levels of auditing: command-level and keystroke-level.
         * By default, auditing is enabled at the command level i.e., each command issued by the operator is audited. When keystroke-level is chosen,
         * in addition to command level logging, key strokes are also logged.
         *
         * @param auditType the value to set
         * @return this builder
         **/
        public Builder auditType(java.util.List<String> auditType) {
            this.auditType = auditType;
            this.__explicitlySet__.add("auditType");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AccessRequest build() {
            AccessRequest model =
                    new AccessRequest(
                            this.id,
                            this.requestId,
                            this.accessReasonSummary,
                            this.operatorId,
                            this.resourceId,
                            this.resourceName,
                            this.compartmentId,
                            this.resourceType,
                            this.actionRequestsList,
                            this.reason,
                            this.severity,
                            this.duration,
                            this.extendDuration,
                            this.workflowId,
                            this.isAutoApproved,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeOfCreation,
                            this.timeOfModification,
                            this.timeOfUserCreation,
                            this.userId,
                            this.approverComment,
                            this.closureComment,
                            this.opctlId,
                            this.opctlName,
                            this.systemMessage,
                            this.opctlAdditionalMessage,
                            this.auditType,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessRequest model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("requestId")) {
                this.requestId(model.getRequestId());
            }
            if (model.wasPropertyExplicitlySet("accessReasonSummary")) {
                this.accessReasonSummary(model.getAccessReasonSummary());
            }
            if (model.wasPropertyExplicitlySet("operatorId")) {
                this.operatorId(model.getOperatorId());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("actionRequestsList")) {
                this.actionRequestsList(model.getActionRequestsList());
            }
            if (model.wasPropertyExplicitlySet("reason")) {
                this.reason(model.getReason());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("duration")) {
                this.duration(model.getDuration());
            }
            if (model.wasPropertyExplicitlySet("extendDuration")) {
                this.extendDuration(model.getExtendDuration());
            }
            if (model.wasPropertyExplicitlySet("workflowId")) {
                this.workflowId(model.getWorkflowId());
            }
            if (model.wasPropertyExplicitlySet("isAutoApproved")) {
                this.isAutoApproved(model.getIsAutoApproved());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeOfCreation")) {
                this.timeOfCreation(model.getTimeOfCreation());
            }
            if (model.wasPropertyExplicitlySet("timeOfModification")) {
                this.timeOfModification(model.getTimeOfModification());
            }
            if (model.wasPropertyExplicitlySet("timeOfUserCreation")) {
                this.timeOfUserCreation(model.getTimeOfUserCreation());
            }
            if (model.wasPropertyExplicitlySet("userId")) {
                this.userId(model.getUserId());
            }
            if (model.wasPropertyExplicitlySet("approverComment")) {
                this.approverComment(model.getApproverComment());
            }
            if (model.wasPropertyExplicitlySet("closureComment")) {
                this.closureComment(model.getClosureComment());
            }
            if (model.wasPropertyExplicitlySet("opctlId")) {
                this.opctlId(model.getOpctlId());
            }
            if (model.wasPropertyExplicitlySet("opctlName")) {
                this.opctlName(model.getOpctlName());
            }
            if (model.wasPropertyExplicitlySet("systemMessage")) {
                this.systemMessage(model.getSystemMessage());
            }
            if (model.wasPropertyExplicitlySet("opctlAdditionalMessage")) {
                this.opctlAdditionalMessage(model.getOpctlAdditionalMessage());
            }
            if (model.wasPropertyExplicitlySet("auditType")) {
                this.auditType(model.getAuditType());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The OCID of the access request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the access request.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * This is an automatic identifier generated by the system which is easier for human comprehension.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestId")
    private final String requestId;

    /**
     * This is an automatic identifier generated by the system which is easier for human comprehension.
     * @return the value
     **/
    public String getRequestId() {
        return requestId;
    }

    /**
     * Summary comment by the operator creating the access request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accessReasonSummary")
    private final String accessReasonSummary;

    /**
     * Summary comment by the operator creating the access request.
     * @return the value
     **/
    public String getAccessReasonSummary() {
        return accessReasonSummary;
    }

    /**
     * A unique identifier associated with the operator who raised the request. This identifier can not be used directly to identify the operator.
     * You need to provide this identifier if you would like Oracle to provide additional information about the operator action within Oracle tenancy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operatorId")
    private final String operatorId;

    /**
     * A unique identifier associated with the operator who raised the request. This identifier can not be used directly to identify the operator.
     * You need to provide this identifier if you would like Oracle to provide additional information about the operator action within Oracle tenancy.
     *
     * @return the value
     **/
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * The OCID of the target resource associated with the access request. The operator raises an access request to get approval to
     * access the target resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The OCID of the target resource associated with the access request. The operator raises an access request to get approval to
     * access the target resource.
     *
     * @return the value
     **/
    public String getResourceId() {
        return resourceId;
    }

    /**
     * The name of the target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * The name of the target resource.
     * @return the value
     **/
    public String getResourceName() {
        return resourceName;
    }

    /**
     * The OCID of the compartment that contains the access request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the access request.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * resourceType for which the AccessRequest is applicable
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final ResourceTypes resourceType;

    /**
     * resourceType for which the AccessRequest is applicable
     * @return the value
     **/
    public ResourceTypes getResourceType() {
        return resourceType;
    }

    /**
     * List of operator actions for which approval is sought by the operator user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionRequestsList")
    private final java.util.List<String> actionRequestsList;

    /**
     * List of operator actions for which approval is sought by the operator user.
     * @return the value
     **/
    public java.util.List<String> getActionRequestsList() {
        return actionRequestsList;
    }

    /**
     * Summary reason for which the operator is requesting access on the target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    private final String reason;

    /**
     * Summary reason for which the operator is requesting access on the target resource.
     * @return the value
     **/
    public String getReason() {
        return reason;
    }

    /**
     * Priority assigned to the access request by the operator
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final AccessRequestSeverities severity;

    /**
     * Priority assigned to the access request by the operator
     * @return the value
     **/
    public AccessRequestSeverities getSeverity() {
        return severity;
    }

    /**
     * Duration in hours for which access is sought on the target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    private final Integer duration;

    /**
     * Duration in hours for which access is sought on the target resource.
     * @return the value
     **/
    public Integer getDuration() {
        return duration;
    }

    /**
     * Duration in hours for which extension access is sought on the target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extendDuration")
    private final Integer extendDuration;

    /**
     * Duration in hours for which extension access is sought on the target resource.
     * @return the value
     **/
    public Integer getExtendDuration() {
        return extendDuration;
    }

    /**
     * The OCID of the workflow associated with the access request. This is needed if you want to contact Oracle Support for a stuck access request
     * or for an access request that encounters an internal error.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workflowId")
    private final java.util.List<String> workflowId;

    /**
     * The OCID of the workflow associated with the access request. This is needed if you want to contact Oracle Support for a stuck access request
     * or for an access request that encounters an internal error.
     *
     * @return the value
     **/
    public java.util.List<String> getWorkflowId() {
        return workflowId;
    }

    /**
     * Whether the access request was automatically approved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproved")
    private final Boolean isAutoApproved;

    /**
     * Whether the access request was automatically approved.
     * @return the value
     **/
    public Boolean getIsAutoApproved() {
        return isAutoApproved;
    }

    /**
     * The current state of the AccessRequest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final AccessRequestLifecycleStates lifecycleState;

    /**
     * The current state of the AccessRequest.
     * @return the value
     **/
    public AccessRequestLifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * more in detail about the lifeCycleState.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * more in detail about the lifeCycleState.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Time when the access request was created in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfCreation")
    private final java.util.Date timeOfCreation;

    /**
     * Time when the access request was created in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     **/
    public java.util.Date getTimeOfCreation() {
        return timeOfCreation;
    }

    /**
     * Time when the access request was last modified in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfModification")
    private final java.util.Date timeOfModification;

    /**
     * Time when the access request was last modified in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     **/
    public java.util.Date getTimeOfModification() {
        return timeOfModification;
    }

    /**
     * The time when access request is scheduled to be approved in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfUserCreation")
    private final java.util.Date timeOfUserCreation;

    /**
     * The time when access request is scheduled to be approved in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example: '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     **/
    public java.util.Date getTimeOfUserCreation() {
        return timeOfUserCreation;
    }

    /**
     * The OCID of the user that last modified the access request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    /**
     * The OCID of the user that last modified the access request.
     * @return the value
     **/
    public String getUserId() {
        return userId;
    }

    /**
     * The last recent Comment entered by the approver of the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approverComment")
    private final String approverComment;

    /**
     * The last recent Comment entered by the approver of the request.
     * @return the value
     **/
    public String getApproverComment() {
        return approverComment;
    }

    /**
     * The comment entered by the operator while closing the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("closureComment")
    private final String closureComment;

    /**
     * The comment entered by the operator while closing the request.
     * @return the value
     **/
    public String getClosureComment() {
        return closureComment;
    }

    /**
     * The OCID of the operator control governing the target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("opctlId")
    private final String opctlId;

    /**
     * The OCID of the operator control governing the target resource.
     * @return the value
     **/
    public String getOpctlId() {
        return opctlId;
    }

    /**
     * Name of the Operator control governing the target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("opctlName")
    private final String opctlName;

    /**
     * Name of the Operator control governing the target resource.
     * @return the value
     **/
    public String getOpctlName() {
        return opctlName;
    }

    /**
     * System message that will be displayed to the operator at login to the target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemMessage")
    private final String systemMessage;

    /**
     * System message that will be displayed to the operator at login to the target resource.
     * @return the value
     **/
    public String getSystemMessage() {
        return systemMessage;
    }

    /**
     * Additional message specific to the access request that can be specified by the approver at the time of approval.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("opctlAdditionalMessage")
    private final String opctlAdditionalMessage;

    /**
     * Additional message specific to the access request that can be specified by the approver at the time of approval.
     * @return the value
     **/
    public String getOpctlAdditionalMessage() {
        return opctlAdditionalMessage;
    }

    /**
     * Specifies the type of auditing to be enabled. There are two levels of auditing: command-level and keystroke-level.
     * By default, auditing is enabled at the command level i.e., each command issued by the operator is audited. When keystroke-level is chosen,
     * in addition to command level logging, key strokes are also logged.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditType")
    private final java.util.List<String> auditType;

    /**
     * Specifies the type of auditing to be enabled. There are two levels of auditing: command-level and keystroke-level.
     * By default, auditing is enabled at the command level i.e., each command issued by the operator is audited. When keystroke-level is chosen,
     * in addition to command level logging, key strokes are also logged.
     *
     * @return the value
     **/
    public java.util.List<String> getAuditType() {
        return auditType;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("AccessRequest(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", requestId=").append(String.valueOf(this.requestId));
        sb.append(", accessReasonSummary=").append(String.valueOf(this.accessReasonSummary));
        sb.append(", operatorId=").append(String.valueOf(this.operatorId));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", actionRequestsList=").append(String.valueOf(this.actionRequestsList));
        sb.append(", reason=").append(String.valueOf(this.reason));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", duration=").append(String.valueOf(this.duration));
        sb.append(", extendDuration=").append(String.valueOf(this.extendDuration));
        sb.append(", workflowId=").append(String.valueOf(this.workflowId));
        sb.append(", isAutoApproved=").append(String.valueOf(this.isAutoApproved));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeOfCreation=").append(String.valueOf(this.timeOfCreation));
        sb.append(", timeOfModification=").append(String.valueOf(this.timeOfModification));
        sb.append(", timeOfUserCreation=").append(String.valueOf(this.timeOfUserCreation));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", approverComment=").append(String.valueOf(this.approverComment));
        sb.append(", closureComment=").append(String.valueOf(this.closureComment));
        sb.append(", opctlId=").append(String.valueOf(this.opctlId));
        sb.append(", opctlName=").append(String.valueOf(this.opctlName));
        sb.append(", systemMessage=").append(String.valueOf(this.systemMessage));
        sb.append(", opctlAdditionalMessage=").append(String.valueOf(this.opctlAdditionalMessage));
        sb.append(", auditType=").append(String.valueOf(this.auditType));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessRequest)) {
            return false;
        }

        AccessRequest other = (AccessRequest) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.requestId, other.requestId)
                && java.util.Objects.equals(this.accessReasonSummary, other.accessReasonSummary)
                && java.util.Objects.equals(this.operatorId, other.operatorId)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.actionRequestsList, other.actionRequestsList)
                && java.util.Objects.equals(this.reason, other.reason)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.duration, other.duration)
                && java.util.Objects.equals(this.extendDuration, other.extendDuration)
                && java.util.Objects.equals(this.workflowId, other.workflowId)
                && java.util.Objects.equals(this.isAutoApproved, other.isAutoApproved)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeOfCreation, other.timeOfCreation)
                && java.util.Objects.equals(this.timeOfModification, other.timeOfModification)
                && java.util.Objects.equals(this.timeOfUserCreation, other.timeOfUserCreation)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.approverComment, other.approverComment)
                && java.util.Objects.equals(this.closureComment, other.closureComment)
                && java.util.Objects.equals(this.opctlId, other.opctlId)
                && java.util.Objects.equals(this.opctlName, other.opctlName)
                && java.util.Objects.equals(this.systemMessage, other.systemMessage)
                && java.util.Objects.equals(
                        this.opctlAdditionalMessage, other.opctlAdditionalMessage)
                && java.util.Objects.equals(this.auditType, other.auditType)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.requestId == null ? 43 : this.requestId.hashCode());
        result =
                (result * PRIME)
                        + (this.accessReasonSummary == null
                                ? 43
                                : this.accessReasonSummary.hashCode());
        result = (result * PRIME) + (this.operatorId == null ? 43 : this.operatorId.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.actionRequestsList == null
                                ? 43
                                : this.actionRequestsList.hashCode());
        result = (result * PRIME) + (this.reason == null ? 43 : this.reason.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.duration == null ? 43 : this.duration.hashCode());
        result =
                (result * PRIME)
                        + (this.extendDuration == null ? 43 : this.extendDuration.hashCode());
        result = (result * PRIME) + (this.workflowId == null ? 43 : this.workflowId.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoApproved == null ? 43 : this.isAutoApproved.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfCreation == null ? 43 : this.timeOfCreation.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfModification == null
                                ? 43
                                : this.timeOfModification.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfUserCreation == null
                                ? 43
                                : this.timeOfUserCreation.hashCode());
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result =
                (result * PRIME)
                        + (this.approverComment == null ? 43 : this.approverComment.hashCode());
        result =
                (result * PRIME)
                        + (this.closureComment == null ? 43 : this.closureComment.hashCode());
        result = (result * PRIME) + (this.opctlId == null ? 43 : this.opctlId.hashCode());
        result = (result * PRIME) + (this.opctlName == null ? 43 : this.opctlName.hashCode());
        result =
                (result * PRIME)
                        + (this.systemMessage == null ? 43 : this.systemMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.opctlAdditionalMessage == null
                                ? 43
                                : this.opctlAdditionalMessage.hashCode());
        result = (result * PRIME) + (this.auditType == null ? 43 : this.auditType.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
