/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apiaccesscontrol.model;

/**
 * An Oracle operator raises privilegedApi request when they need access to any infrastructure
 * resource governed by PrivilegedApi Access Control. The privilegedApi request identifies the
 * target resource and the set of operator actions. Access request handling depends upon the
 * Operator Control that governs the target resource, and the set of operator actions listed for
 * approval in the access request. If all of the operator actions listed in the privilegedApi
 * request are in the pre-approved list in the PrivilegedApi Control that governs the target
 * resource, then the privilegedApi request is automatically approved. If not, then the
 * privilegedApi request requires explicit approval from the approver group specified by the
 * PrivilegedApi Control governing the target resource.
 *
 * <p>You can approve or reject an privilegedApi request. You can also revoke the approval of an
 * already approved privilegedApi request. While creating an access request, the operator specifies
 * the duration of access. You have the option to approve the entire duration or reduce or even
 * increase the time duration. An operator can also request for an extension. The approval for such
 * an extension is processed the same way the original privilegedApi request was processed. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PrivilegedApiRequest.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PrivilegedApiRequest
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "requestId",
        "reasonSummary",
        "notificationTopicId",
        "requestedBy",
        "resourceName",
        "resourceId",
        "subResourceNameList",
        "compartmentId",
        "resourceType",
        "entityType",
        "privilegedOperationList",
        "reasonDetail",
        "severity",
        "durationInHrs",
        "ticketNumbers",
        "state",
        "stateDetails",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "timeUpdated",
        "closureComment",
        "privilegedApiControlId",
        "privilegedApiControlName",
        "numberOfApproversRequired",
        "approverDetails",
        "timeRequestedForFutureAccess",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public PrivilegedApiRequest(
            String id,
            String displayName,
            String requestId,
            String reasonSummary,
            String notificationTopicId,
            java.util.List<String> requestedBy,
            String resourceName,
            String resourceId,
            java.util.List<String> subResourceNameList,
            String compartmentId,
            String resourceType,
            String entityType,
            java.util.List<PrivilegedApiRequestOperationDetails> privilegedOperationList,
            String reasonDetail,
            PrivilegedApiRequestSeverity severity,
            Integer durationInHrs,
            java.util.List<String> ticketNumbers,
            State state,
            String stateDetails,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String closureComment,
            String privilegedApiControlId,
            String privilegedApiControlName,
            Integer numberOfApproversRequired,
            java.util.List<ApproverDetail> approverDetails,
            java.util.Date timeRequestedForFutureAccess,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.requestId = requestId;
        this.reasonSummary = reasonSummary;
        this.notificationTopicId = notificationTopicId;
        this.requestedBy = requestedBy;
        this.resourceName = resourceName;
        this.resourceId = resourceId;
        this.subResourceNameList = subResourceNameList;
        this.compartmentId = compartmentId;
        this.resourceType = resourceType;
        this.entityType = entityType;
        this.privilegedOperationList = privilegedOperationList;
        this.reasonDetail = reasonDetail;
        this.severity = severity;
        this.durationInHrs = durationInHrs;
        this.ticketNumbers = ticketNumbers;
        this.state = state;
        this.stateDetails = stateDetails;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.closureComment = closureComment;
        this.privilegedApiControlId = privilegedApiControlId;
        this.privilegedApiControlName = privilegedApiControlName;
        this.numberOfApproversRequired = numberOfApproversRequired;
        this.approverDetails = approverDetails;
        this.timeRequestedForFutureAccess = timeRequestedForFutureAccess;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the privilegedApi request. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the privilegedApi request.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Name of the privilegedApi control. The name must be unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Name of the privilegedApi control. The name must be unique.
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
         * This is an automatic identifier generated by the system which is easier for human
         * comprehension.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("requestId")
        private String requestId;

        /**
         * This is an automatic identifier generated by the system which is easier for human
         * comprehension.
         *
         * @param requestId the value to set
         * @return this builder
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            this.__explicitlySet__.add("requestId");
            return this;
        }
        /** Summary comment by the operator creating the access request. */
        @com.fasterxml.jackson.annotation.JsonProperty("reasonSummary")
        private String reasonSummary;

        /**
         * Summary comment by the operator creating the access request.
         *
         * @param reasonSummary the value to set
         * @return this builder
         */
        public Builder reasonSummary(String reasonSummary) {
            this.reasonSummary = reasonSummary;
            this.__explicitlySet__.add("reasonSummary");
            return this;
        }
        /**
         * The OCID of the OCI Notification topic to publish messages related to this privileged api
         * request.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("notificationTopicId")
        private String notificationTopicId;

        /**
         * The OCID of the OCI Notification topic to publish messages related to this privileged api
         * request.
         *
         * @param notificationTopicId the value to set
         * @return this builder
         */
        public Builder notificationTopicId(String notificationTopicId) {
            this.notificationTopicId = notificationTopicId;
            this.__explicitlySet__.add("notificationTopicId");
            return this;
        }
        /** List of Users who has created this privilegedApiRequest. */
        @com.fasterxml.jackson.annotation.JsonProperty("requestedBy")
        private java.util.List<String> requestedBy;

        /**
         * List of Users who has created this privilegedApiRequest.
         *
         * @param requestedBy the value to set
         * @return this builder
         */
        public Builder requestedBy(java.util.List<String> requestedBy) {
            this.requestedBy = requestedBy;
            this.__explicitlySet__.add("requestedBy");
            return this;
        }
        /** resourceName for which the PrivilegedApiRequest is applicable */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * resourceName for which the PrivilegedApiRequest is applicable
         *
         * @param resourceName the value to set
         * @return this builder
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /**
         * The OCID of the target resource associated with the access request. The operator raises
         * an access request to get approval to access the target resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The OCID of the target resource associated with the access request. The operator raises
         * an access request to get approval to access the target resource.
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /** The subresource names requested for approval. */
        @com.fasterxml.jackson.annotation.JsonProperty("subResourceNameList")
        private java.util.List<String> subResourceNameList;

        /**
         * The subresource names requested for approval.
         *
         * @param subResourceNameList the value to set
         * @return this builder
         */
        public Builder subResourceNameList(java.util.List<String> subResourceNameList) {
            this.subResourceNameList = subResourceNameList;
            this.__explicitlySet__.add("subResourceNameList");
            return this;
        }
        /** The OCID of the compartment that contains the access request. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the access request.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** resourceType for which the AccessRequest is applicable */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * resourceType for which the AccessRequest is applicable
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /** entityType of resource for which the AccessRequest is applicable */
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        /**
         * entityType of resource for which the AccessRequest is applicable
         *
         * @param entityType the value to set
         * @return this builder
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }
        /** List of api names, attributes for which approval is sought by the user. */
        @com.fasterxml.jackson.annotation.JsonProperty("privilegedOperationList")
        private java.util.List<PrivilegedApiRequestOperationDetails> privilegedOperationList;

        /**
         * List of api names, attributes for which approval is sought by the user.
         *
         * @param privilegedOperationList the value to set
         * @return this builder
         */
        public Builder privilegedOperationList(
                java.util.List<PrivilegedApiRequestOperationDetails> privilegedOperationList) {
            this.privilegedOperationList = privilegedOperationList;
            this.__explicitlySet__.add("privilegedOperationList");
            return this;
        }
        /** Reason in Detail for which the operator is requesting access on the target resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("reasonDetail")
        private String reasonDetail;

        /**
         * Reason in Detail for which the operator is requesting access on the target resource.
         *
         * @param reasonDetail the value to set
         * @return this builder
         */
        public Builder reasonDetail(String reasonDetail) {
            this.reasonDetail = reasonDetail;
            this.__explicitlySet__.add("reasonDetail");
            return this;
        }
        /** Priority assigned to the access request by the operator */
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private PrivilegedApiRequestSeverity severity;

        /**
         * Priority assigned to the access request by the operator
         *
         * @param severity the value to set
         * @return this builder
         */
        public Builder severity(PrivilegedApiRequestSeverity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /** Duration in hours for which access is sought on the target resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("durationInHrs")
        private Integer durationInHrs;

        /**
         * Duration in hours for which access is sought on the target resource.
         *
         * @param durationInHrs the value to set
         * @return this builder
         */
        public Builder durationInHrs(Integer durationInHrs) {
            this.durationInHrs = durationInHrs;
            this.__explicitlySet__.add("durationInHrs");
            return this;
        }
        /**
         * A list of ticket numbers related to this Privileged Api Access Request, e.g. Service
         * Request (SR) number and JIRA ticket number.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ticketNumbers")
        private java.util.List<String> ticketNumbers;

        /**
         * A list of ticket numbers related to this Privileged Api Access Request, e.g. Service
         * Request (SR) number and JIRA ticket number.
         *
         * @param ticketNumbers the value to set
         * @return this builder
         */
        public Builder ticketNumbers(java.util.List<String> ticketNumbers) {
            this.ticketNumbers = ticketNumbers;
            this.__explicitlySet__.add("ticketNumbers");
            return this;
        }
        /** The current state of the Access Request. */
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private State state;

        /**
         * The current state of the Access Request.
         *
         * @param state the value to set
         * @return this builder
         */
        public Builder state(State state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }
        /**
         * A message that describes the current state of the PrivilegedApiControl in more detail.
         * For example, can be used to provide actionable information for a resource in the Failed
         * state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("stateDetails")
        private String stateDetails;

        /**
         * A message that describes the current state of the PrivilegedApiControl in more detail.
         * For example, can be used to provide actionable information for a resource in the Failed
         * state.
         *
         * @param stateDetails the value to set
         * @return this builder
         */
        public Builder stateDetails(String stateDetails) {
            this.stateDetails = stateDetails;
            this.__explicitlySet__.add("stateDetails");
            return this;
        }
        /** The current state of the PrivilegedApiRequest. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the PrivilegedApiRequest.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** more in detail about the lifeCycleState. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * more in detail about the lifeCycleState.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Time when the privilegedApi request was created in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
         * '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Time when the privilegedApi request was created in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
         * '2020-05-22T21:10:29.600Z'
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Time when the privilegedApi request was last modified in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
         * '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Time when the privilegedApi request was last modified in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
         * '2020-05-22T21:10:29.600Z'
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The comment entered by the operator while closing the request. */
        @com.fasterxml.jackson.annotation.JsonProperty("closureComment")
        private String closureComment;

        /**
         * The comment entered by the operator while closing the request.
         *
         * @param closureComment the value to set
         * @return this builder
         */
        public Builder closureComment(String closureComment) {
            this.closureComment = closureComment;
            this.__explicitlySet__.add("closureComment");
            return this;
        }
        /** The OCID of the privilegedApi control governing the target resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("privilegedApiControlId")
        private String privilegedApiControlId;

        /**
         * The OCID of the privilegedApi control governing the target resource.
         *
         * @param privilegedApiControlId the value to set
         * @return this builder
         */
        public Builder privilegedApiControlId(String privilegedApiControlId) {
            this.privilegedApiControlId = privilegedApiControlId;
            this.__explicitlySet__.add("privilegedApiControlId");
            return this;
        }
        /** Name of the privilegedApi control governing the target resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("privilegedApiControlName")
        private String privilegedApiControlName;

        /**
         * Name of the privilegedApi control governing the target resource.
         *
         * @param privilegedApiControlName the value to set
         * @return this builder
         */
        public Builder privilegedApiControlName(String privilegedApiControlName) {
            this.privilegedApiControlName = privilegedApiControlName;
            this.__explicitlySet__.add("privilegedApiControlName");
            return this;
        }
        /** Number of approvers required to approve an privilegedApi request. */
        @com.fasterxml.jackson.annotation.JsonProperty("numberOfApproversRequired")
        private Integer numberOfApproversRequired;

        /**
         * Number of approvers required to approve an privilegedApi request.
         *
         * @param numberOfApproversRequired the value to set
         * @return this builder
         */
        public Builder numberOfApproversRequired(Integer numberOfApproversRequired) {
            this.numberOfApproversRequired = numberOfApproversRequired;
            this.__explicitlySet__.add("numberOfApproversRequired");
            return this;
        }
        /**
         * Contains the approver details who have approved the privilegedApi Request during the
         * initial request.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("approverDetails")
        private java.util.List<ApproverDetail> approverDetails;

        /**
         * Contains the approver details who have approved the privilegedApi Request during the
         * initial request.
         *
         * @param approverDetails the value to set
         * @return this builder
         */
        public Builder approverDetails(java.util.List<ApproverDetail> approverDetails) {
            this.approverDetails = approverDetails;
            this.__explicitlySet__.add("approverDetails");
            return this;
        }
        /**
         * Time in future when the user for the privilegedApi request needs to be created in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
         * '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeRequestedForFutureAccess")
        private java.util.Date timeRequestedForFutureAccess;

        /**
         * Time in future when the user for the privilegedApi request needs to be created in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
         * '2020-05-22T21:10:29.600Z'
         *
         * @param timeRequestedForFutureAccess the value to set
         * @return this builder
         */
        public Builder timeRequestedForFutureAccess(java.util.Date timeRequestedForFutureAccess) {
            this.timeRequestedForFutureAccess = timeRequestedForFutureAccess;
            this.__explicitlySet__.add("timeRequestedForFutureAccess");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PrivilegedApiRequest build() {
            PrivilegedApiRequest model =
                    new PrivilegedApiRequest(
                            this.id,
                            this.displayName,
                            this.requestId,
                            this.reasonSummary,
                            this.notificationTopicId,
                            this.requestedBy,
                            this.resourceName,
                            this.resourceId,
                            this.subResourceNameList,
                            this.compartmentId,
                            this.resourceType,
                            this.entityType,
                            this.privilegedOperationList,
                            this.reasonDetail,
                            this.severity,
                            this.durationInHrs,
                            this.ticketNumbers,
                            this.state,
                            this.stateDetails,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.closureComment,
                            this.privilegedApiControlId,
                            this.privilegedApiControlName,
                            this.numberOfApproversRequired,
                            this.approverDetails,
                            this.timeRequestedForFutureAccess,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PrivilegedApiRequest model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("requestId")) {
                this.requestId(model.getRequestId());
            }
            if (model.wasPropertyExplicitlySet("reasonSummary")) {
                this.reasonSummary(model.getReasonSummary());
            }
            if (model.wasPropertyExplicitlySet("notificationTopicId")) {
                this.notificationTopicId(model.getNotificationTopicId());
            }
            if (model.wasPropertyExplicitlySet("requestedBy")) {
                this.requestedBy(model.getRequestedBy());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("subResourceNameList")) {
                this.subResourceNameList(model.getSubResourceNameList());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("entityType")) {
                this.entityType(model.getEntityType());
            }
            if (model.wasPropertyExplicitlySet("privilegedOperationList")) {
                this.privilegedOperationList(model.getPrivilegedOperationList());
            }
            if (model.wasPropertyExplicitlySet("reasonDetail")) {
                this.reasonDetail(model.getReasonDetail());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("durationInHrs")) {
                this.durationInHrs(model.getDurationInHrs());
            }
            if (model.wasPropertyExplicitlySet("ticketNumbers")) {
                this.ticketNumbers(model.getTicketNumbers());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("stateDetails")) {
                this.stateDetails(model.getStateDetails());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("closureComment")) {
                this.closureComment(model.getClosureComment());
            }
            if (model.wasPropertyExplicitlySet("privilegedApiControlId")) {
                this.privilegedApiControlId(model.getPrivilegedApiControlId());
            }
            if (model.wasPropertyExplicitlySet("privilegedApiControlName")) {
                this.privilegedApiControlName(model.getPrivilegedApiControlName());
            }
            if (model.wasPropertyExplicitlySet("numberOfApproversRequired")) {
                this.numberOfApproversRequired(model.getNumberOfApproversRequired());
            }
            if (model.wasPropertyExplicitlySet("approverDetails")) {
                this.approverDetails(model.getApproverDetails());
            }
            if (model.wasPropertyExplicitlySet("timeRequestedForFutureAccess")) {
                this.timeRequestedForFutureAccess(model.getTimeRequestedForFutureAccess());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** The OCID of the privilegedApi request. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the privilegedApi request.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Name of the privilegedApi control. The name must be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Name of the privilegedApi control. The name must be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * This is an automatic identifier generated by the system which is easier for human
     * comprehension.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestId")
    private final String requestId;

    /**
     * This is an automatic identifier generated by the system which is easier for human
     * comprehension.
     *
     * @return the value
     */
    public String getRequestId() {
        return requestId;
    }

    /** Summary comment by the operator creating the access request. */
    @com.fasterxml.jackson.annotation.JsonProperty("reasonSummary")
    private final String reasonSummary;

    /**
     * Summary comment by the operator creating the access request.
     *
     * @return the value
     */
    public String getReasonSummary() {
        return reasonSummary;
    }

    /**
     * The OCID of the OCI Notification topic to publish messages related to this privileged api
     * request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("notificationTopicId")
    private final String notificationTopicId;

    /**
     * The OCID of the OCI Notification topic to publish messages related to this privileged api
     * request.
     *
     * @return the value
     */
    public String getNotificationTopicId() {
        return notificationTopicId;
    }

    /** List of Users who has created this privilegedApiRequest. */
    @com.fasterxml.jackson.annotation.JsonProperty("requestedBy")
    private final java.util.List<String> requestedBy;

    /**
     * List of Users who has created this privilegedApiRequest.
     *
     * @return the value
     */
    public java.util.List<String> getRequestedBy() {
        return requestedBy;
    }

    /** resourceName for which the PrivilegedApiRequest is applicable */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * resourceName for which the PrivilegedApiRequest is applicable
     *
     * @return the value
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * The OCID of the target resource associated with the access request. The operator raises an
     * access request to get approval to access the target resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The OCID of the target resource associated with the access request. The operator raises an
     * access request to get approval to access the target resource.
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /** The subresource names requested for approval. */
    @com.fasterxml.jackson.annotation.JsonProperty("subResourceNameList")
    private final java.util.List<String> subResourceNameList;

    /**
     * The subresource names requested for approval.
     *
     * @return the value
     */
    public java.util.List<String> getSubResourceNameList() {
        return subResourceNameList;
    }

    /** The OCID of the compartment that contains the access request. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the access request.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** resourceType for which the AccessRequest is applicable */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * resourceType for which the AccessRequest is applicable
     *
     * @return the value
     */
    public String getResourceType() {
        return resourceType;
    }

    /** entityType of resource for which the AccessRequest is applicable */
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final String entityType;

    /**
     * entityType of resource for which the AccessRequest is applicable
     *
     * @return the value
     */
    public String getEntityType() {
        return entityType;
    }

    /** List of api names, attributes for which approval is sought by the user. */
    @com.fasterxml.jackson.annotation.JsonProperty("privilegedOperationList")
    private final java.util.List<PrivilegedApiRequestOperationDetails> privilegedOperationList;

    /**
     * List of api names, attributes for which approval is sought by the user.
     *
     * @return the value
     */
    public java.util.List<PrivilegedApiRequestOperationDetails> getPrivilegedOperationList() {
        return privilegedOperationList;
    }

    /** Reason in Detail for which the operator is requesting access on the target resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("reasonDetail")
    private final String reasonDetail;

    /**
     * Reason in Detail for which the operator is requesting access on the target resource.
     *
     * @return the value
     */
    public String getReasonDetail() {
        return reasonDetail;
    }

    /** Priority assigned to the access request by the operator */
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final PrivilegedApiRequestSeverity severity;

    /**
     * Priority assigned to the access request by the operator
     *
     * @return the value
     */
    public PrivilegedApiRequestSeverity getSeverity() {
        return severity;
    }

    /** Duration in hours for which access is sought on the target resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("durationInHrs")
    private final Integer durationInHrs;

    /**
     * Duration in hours for which access is sought on the target resource.
     *
     * @return the value
     */
    public Integer getDurationInHrs() {
        return durationInHrs;
    }

    /**
     * A list of ticket numbers related to this Privileged Api Access Request, e.g. Service Request
     * (SR) number and JIRA ticket number.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ticketNumbers")
    private final java.util.List<String> ticketNumbers;

    /**
     * A list of ticket numbers related to this Privileged Api Access Request, e.g. Service Request
     * (SR) number and JIRA ticket number.
     *
     * @return the value
     */
    public java.util.List<String> getTicketNumbers() {
        return ticketNumbers;
    }

    /** The current state of the Access Request. */
    public enum State implements com.oracle.bmc.http.internal.BmcEnum {
        Created("CREATED"),
        ApprovalWaiting("APPROVAL_WAITING"),
        Approved("APPROVED"),
        ApprovedForFuture("APPROVED_FOR_FUTURE"),
        Rejected("REJECTED"),
        Deployed("DEPLOYED"),
        DeployFailed("DEPLOY_FAILED"),
        CloseFailed("CLOSE_FAILED"),
        RevokeFailed("REVOKE_FAILED"),
        ExpiryFailed("EXPIRY_FAILED"),
        Revoking("REVOKING"),
        Revoked("REVOKED"),
        Closing("CLOSING"),
        Closed("CLOSED"),
        Expired("EXPIRED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(State.class);

        private final String value;
        private static java.util.Map<String, State> map;

        static {
            map = new java.util.HashMap<>();
            for (State v : State.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        State(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static State create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'State', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the Access Request. */
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final State state;

    /**
     * The current state of the Access Request.
     *
     * @return the value
     */
    public State getState() {
        return state;
    }

    /**
     * A message that describes the current state of the PrivilegedApiControl in more detail. For
     * example, can be used to provide actionable information for a resource in the Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("stateDetails")
    private final String stateDetails;

    /**
     * A message that describes the current state of the PrivilegedApiControl in more detail. For
     * example, can be used to provide actionable information for a resource in the Failed state.
     *
     * @return the value
     */
    public String getStateDetails() {
        return stateDetails;
    }

    /** The current state of the PrivilegedApiRequest. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Accepted("ACCEPTED"),
        InProgress("IN_PROGRESS"),
        Waiting("WAITING"),
        Failed("FAILED"),
        Succeeded("SUCCEEDED"),
        Canceling("CANCELING"),
        Canceled("CANCELED"),
        NeedsAttention("NEEDS_ATTENTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** The current state of the PrivilegedApiRequest. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the PrivilegedApiRequest.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** more in detail about the lifeCycleState. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * more in detail about the lifeCycleState.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Time when the privilegedApi request was created in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
     * '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Time when the privilegedApi request was created in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
     * '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Time when the privilegedApi request was last modified in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
     * '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Time when the privilegedApi request was last modified in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
     * '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The comment entered by the operator while closing the request. */
    @com.fasterxml.jackson.annotation.JsonProperty("closureComment")
    private final String closureComment;

    /**
     * The comment entered by the operator while closing the request.
     *
     * @return the value
     */
    public String getClosureComment() {
        return closureComment;
    }

    /** The OCID of the privilegedApi control governing the target resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("privilegedApiControlId")
    private final String privilegedApiControlId;

    /**
     * The OCID of the privilegedApi control governing the target resource.
     *
     * @return the value
     */
    public String getPrivilegedApiControlId() {
        return privilegedApiControlId;
    }

    /** Name of the privilegedApi control governing the target resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("privilegedApiControlName")
    private final String privilegedApiControlName;

    /**
     * Name of the privilegedApi control governing the target resource.
     *
     * @return the value
     */
    public String getPrivilegedApiControlName() {
        return privilegedApiControlName;
    }

    /** Number of approvers required to approve an privilegedApi request. */
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfApproversRequired")
    private final Integer numberOfApproversRequired;

    /**
     * Number of approvers required to approve an privilegedApi request.
     *
     * @return the value
     */
    public Integer getNumberOfApproversRequired() {
        return numberOfApproversRequired;
    }

    /**
     * Contains the approver details who have approved the privilegedApi Request during the initial
     * request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("approverDetails")
    private final java.util.List<ApproverDetail> approverDetails;

    /**
     * Contains the approver details who have approved the privilegedApi Request during the initial
     * request.
     *
     * @return the value
     */
    public java.util.List<ApproverDetail> getApproverDetails() {
        return approverDetails;
    }

    /**
     * Time in future when the user for the privilegedApi request needs to be created in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
     * '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeRequestedForFutureAccess")
    private final java.util.Date timeRequestedForFutureAccess;

    /**
     * Time in future when the user for the privilegedApi request needs to be created in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
     * '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeRequestedForFutureAccess() {
        return timeRequestedForFutureAccess;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("PrivilegedApiRequest(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", requestId=").append(String.valueOf(this.requestId));
        sb.append(", reasonSummary=").append(String.valueOf(this.reasonSummary));
        sb.append(", notificationTopicId=").append(String.valueOf(this.notificationTopicId));
        sb.append(", requestedBy=").append(String.valueOf(this.requestedBy));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", subResourceNameList=").append(String.valueOf(this.subResourceNameList));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(", privilegedOperationList=")
                .append(String.valueOf(this.privilegedOperationList));
        sb.append(", reasonDetail=").append(String.valueOf(this.reasonDetail));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", durationInHrs=").append(String.valueOf(this.durationInHrs));
        sb.append(", ticketNumbers=").append(String.valueOf(this.ticketNumbers));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", stateDetails=").append(String.valueOf(this.stateDetails));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", closureComment=").append(String.valueOf(this.closureComment));
        sb.append(", privilegedApiControlId=").append(String.valueOf(this.privilegedApiControlId));
        sb.append(", privilegedApiControlName=")
                .append(String.valueOf(this.privilegedApiControlName));
        sb.append(", numberOfApproversRequired=")
                .append(String.valueOf(this.numberOfApproversRequired));
        sb.append(", approverDetails=").append(String.valueOf(this.approverDetails));
        sb.append(", timeRequestedForFutureAccess=")
                .append(String.valueOf(this.timeRequestedForFutureAccess));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PrivilegedApiRequest)) {
            return false;
        }

        PrivilegedApiRequest other = (PrivilegedApiRequest) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.requestId, other.requestId)
                && java.util.Objects.equals(this.reasonSummary, other.reasonSummary)
                && java.util.Objects.equals(this.notificationTopicId, other.notificationTopicId)
                && java.util.Objects.equals(this.requestedBy, other.requestedBy)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.subResourceNameList, other.subResourceNameList)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(
                        this.privilegedOperationList, other.privilegedOperationList)
                && java.util.Objects.equals(this.reasonDetail, other.reasonDetail)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.durationInHrs, other.durationInHrs)
                && java.util.Objects.equals(this.ticketNumbers, other.ticketNumbers)
                && java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.stateDetails, other.stateDetails)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.closureComment, other.closureComment)
                && java.util.Objects.equals(
                        this.privilegedApiControlId, other.privilegedApiControlId)
                && java.util.Objects.equals(
                        this.privilegedApiControlName, other.privilegedApiControlName)
                && java.util.Objects.equals(
                        this.numberOfApproversRequired, other.numberOfApproversRequired)
                && java.util.Objects.equals(this.approverDetails, other.approverDetails)
                && java.util.Objects.equals(
                        this.timeRequestedForFutureAccess, other.timeRequestedForFutureAccess)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.requestId == null ? 43 : this.requestId.hashCode());
        result =
                (result * PRIME)
                        + (this.reasonSummary == null ? 43 : this.reasonSummary.hashCode());
        result =
                (result * PRIME)
                        + (this.notificationTopicId == null
                                ? 43
                                : this.notificationTopicId.hashCode());
        result = (result * PRIME) + (this.requestedBy == null ? 43 : this.requestedBy.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.subResourceNameList == null
                                ? 43
                                : this.subResourceNameList.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result =
                (result * PRIME)
                        + (this.privilegedOperationList == null
                                ? 43
                                : this.privilegedOperationList.hashCode());
        result = (result * PRIME) + (this.reasonDetail == null ? 43 : this.reasonDetail.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result =
                (result * PRIME)
                        + (this.durationInHrs == null ? 43 : this.durationInHrs.hashCode());
        result =
                (result * PRIME)
                        + (this.ticketNumbers == null ? 43 : this.ticketNumbers.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.stateDetails == null ? 43 : this.stateDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.closureComment == null ? 43 : this.closureComment.hashCode());
        result =
                (result * PRIME)
                        + (this.privilegedApiControlId == null
                                ? 43
                                : this.privilegedApiControlId.hashCode());
        result =
                (result * PRIME)
                        + (this.privilegedApiControlName == null
                                ? 43
                                : this.privilegedApiControlName.hashCode());
        result =
                (result * PRIME)
                        + (this.numberOfApproversRequired == null
                                ? 43
                                : this.numberOfApproversRequired.hashCode());
        result =
                (result * PRIME)
                        + (this.approverDetails == null ? 43 : this.approverDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.timeRequestedForFutureAccess == null
                                ? 43
                                : this.timeRequestedForFutureAccess.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
