/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.delegateaccesscontrol.model;

/**
 * A support operator raises Delegated Resource Access Request when they need access to any
 * infrastructure resource governed by Delegation Control. The Delegated Resource Access Request
 * identifies the target resource and the set of Service Provider Actions. Delegated Resource Access
 * Request handling depends upon the Delegation Control that governs the target resource, and the
 * set of Service Provider Actions listed for approval in the Delegated Resource Access Request. If
 * all of the Service Provider Actions listed in the Delegated Resource Access Request are in the
 * pre-approved list in the Delegation Control that governs the target resource, then the Delegated
 * Resource Access Request is automatically approved. If not, then the Delegated Resource Access
 * Request requires explicit approval from the approver group specified by the Delegation Control
 * governing the target resource.
 *
 * <p>You can approve or reject a Delegated Resource Access Request. You can also revoke the
 * approval of an already approved Delegated Resource Access Request. While creating a Delegated
 * Resource Access Request, the support operator specifies the duration of access. You have the
 * option to approve the entire duration or reduce or even increase the time duration. A support
 * operator can also request for an extension. The approval for such an extension is processed the
 * same way the original Delegated Resource Access Request was processed. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DelegatedResourceAccessRequest.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DelegatedResourceAccessRequest
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "ticketNumbers",
        "reasonForRequest",
        "description",
        "timeAccessRequested",
        "resourceId",
        "resourceName",
        "resourceType",
        "requesterType",
        "requestedActionNames",
        "databaseNameList",
        "providedServiceTypes",
        "delegationSubscriptionIds",
        "severity",
        "durationInHours",
        "extendDurationInHours",
        "isAutoApproved",
        "lifecycleState",
        "lifecycleStateDetails",
        "requestStatus",
        "timeCreated",
        "timeUpdated",
        "numInitialApprovals",
        "numExtensionApprovals",
        "approvalInfo",
        "closureComment",
        "delegationControlId",
        "auditTypes",
        "isPendingMoreInfo",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public DelegatedResourceAccessRequest(
            String id,
            String compartmentId,
            String displayName,
            java.util.List<String> ticketNumbers,
            String reasonForRequest,
            String description,
            java.util.Date timeAccessRequested,
            String resourceId,
            String resourceName,
            DelegationControlResourceType resourceType,
            DelegatedResourceAccessRequesterType requesterType,
            java.util.List<String> requestedActionNames,
            java.util.List<String> databaseNameList,
            java.util.List<ServiceProviderServiceType> providedServiceTypes,
            java.util.List<String> delegationSubscriptionIds,
            DelegatedResourceAccessRequestSeverity severity,
            Integer durationInHours,
            Integer extendDurationInHours,
            Boolean isAutoApproved,
            LifecycleState lifecycleState,
            String lifecycleStateDetails,
            DelegatedResourceAccessRequestStatus requestStatus,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            Integer numInitialApprovals,
            Integer numExtensionApprovals,
            java.util.List<DelegatedResourceAccessRequestApprovalDetails> approvalInfo,
            String closureComment,
            String delegationControlId,
            java.util.List<DelegatedResourceAccessRequestAuditType> auditTypes,
            Boolean isPendingMoreInfo,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.ticketNumbers = ticketNumbers;
        this.reasonForRequest = reasonForRequest;
        this.description = description;
        this.timeAccessRequested = timeAccessRequested;
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.resourceType = resourceType;
        this.requesterType = requesterType;
        this.requestedActionNames = requestedActionNames;
        this.databaseNameList = databaseNameList;
        this.providedServiceTypes = providedServiceTypes;
        this.delegationSubscriptionIds = delegationSubscriptionIds;
        this.severity = severity;
        this.durationInHours = durationInHours;
        this.extendDurationInHours = extendDurationInHours;
        this.isAutoApproved = isAutoApproved;
        this.lifecycleState = lifecycleState;
        this.lifecycleStateDetails = lifecycleStateDetails;
        this.requestStatus = requestStatus;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.numInitialApprovals = numInitialApprovals;
        this.numExtensionApprovals = numExtensionApprovals;
        this.approvalInfo = approvalInfo;
        this.closureComment = closureComment;
        this.delegationControlId = delegationControlId;
        this.auditTypes = auditTypes;
        this.isPendingMoreInfo = isPendingMoreInfo;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the Delegated Resource Access Request. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the Delegated Resource Access Request.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the compartment that contains the Delegated Resource Access Request. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the Delegated Resource Access Request.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Display name. This is generated by the system automatically. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name. This is generated by the system automatically.
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
         * A list of ticket numbers related to this Delegated Resource Access Request, e.g. Service
         * Request (SR) number and JIRA ticket number.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ticketNumbers")
        private java.util.List<String> ticketNumbers;

        /**
         * A list of ticket numbers related to this Delegated Resource Access Request, e.g. Service
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
        /**
         * A short description explaining why this Delegated Resource Access Request is needed by
         * the support operator.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("reasonForRequest")
        private String reasonForRequest;

        /**
         * A short description explaining why this Delegated Resource Access Request is needed by
         * the support operator.
         *
         * @param reasonForRequest the value to set
         * @return this builder
         */
        public Builder reasonForRequest(String reasonForRequest) {
            this.reasonForRequest = reasonForRequest;
            this.__explicitlySet__.add("reasonForRequest");
            return this;
        }
        /** Detailed description of this Delegated Resource Access Request. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description of this Delegated Resource Access Request.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Requested access start time in UTC. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeAccessRequested")
        private java.util.Date timeAccessRequested;

        /**
         * Requested access start time in UTC.
         *
         * @param timeAccessRequested the value to set
         * @return this builder
         */
        public Builder timeAccessRequested(java.util.Date timeAccessRequested) {
            this.timeAccessRequested = timeAccessRequested;
            this.__explicitlySet__.add("timeAccessRequested");
            return this;
        }
        /**
         * The OCID of the target resource associated with the Delegated Resource Access Request.
         * The support operator raises a Delegated Resource Access Request to get approval to access
         * the target resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The OCID of the target resource associated with the Delegated Resource Access Request.
         * The support operator raises a Delegated Resource Access Request to get approval to access
         * the target resource.
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /**
         * The name of the target resource associated with the Delegated Resource Access Request.
         * The support operator raises a Delegated Resource Access Request to get approval to access
         * the target resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * The name of the target resource associated with the Delegated Resource Access Request.
         * The support operator raises a Delegated Resource Access Request to get approval to access
         * the target resource.
         *
         * @param resourceName the value to set
         * @return this builder
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /** Resource type for which the associated Delegation Control is applicable to. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private DelegationControlResourceType resourceType;

        /**
         * Resource type for which the associated Delegation Control is applicable to.
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(DelegationControlResourceType resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /** Requester type */
        @com.fasterxml.jackson.annotation.JsonProperty("requesterType")
        private DelegatedResourceAccessRequesterType requesterType;

        /**
         * Requester type
         *
         * @param requesterType the value to set
         * @return this builder
         */
        public Builder requesterType(DelegatedResourceAccessRequesterType requesterType) {
            this.requesterType = requesterType;
            this.__explicitlySet__.add("requesterType");
            return this;
        }
        /**
         * List of Service Provider Action names for which approval is sought by the support
         * operator user. The list of pre-defined Service Provider Actions can be obtained from the
         * ListServiceProviderActions API.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("requestedActionNames")
        private java.util.List<String> requestedActionNames;

        /**
         * List of Service Provider Action names for which approval is sought by the support
         * operator user. The list of pre-defined Service Provider Actions can be obtained from the
         * ListServiceProviderActions API.
         *
         * @param requestedActionNames the value to set
         * @return this builder
         */
        public Builder requestedActionNames(java.util.List<String> requestedActionNames) {
            this.requestedActionNames = requestedActionNames;
            this.__explicitlySet__.add("requestedActionNames");
            return this;
        }
        /**
         * List of Database unique names for which access is requested. This parameter is required
         * for DLGT_MGMT_SYS_MAINT_ACCESS cage when database access in needed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseNameList")
        private java.util.List<String> databaseNameList;

        /**
         * List of Database unique names for which access is requested. This parameter is required
         * for DLGT_MGMT_SYS_MAINT_ACCESS cage when database access in needed.
         *
         * @param databaseNameList the value to set
         * @return this builder
         */
        public Builder databaseNameList(java.util.List<String> databaseNameList) {
            this.databaseNameList = databaseNameList;
            this.__explicitlySet__.add("databaseNameList");
            return this;
        }
        /** List of Service Provider Service Types being provided by the support operator user. */
        @com.fasterxml.jackson.annotation.JsonProperty("providedServiceTypes")
        private java.util.List<ServiceProviderServiceType> providedServiceTypes;

        /**
         * List of Service Provider Service Types being provided by the support operator user.
         *
         * @param providedServiceTypes the value to set
         * @return this builder
         */
        public Builder providedServiceTypes(
                java.util.List<ServiceProviderServiceType> providedServiceTypes) {
            this.providedServiceTypes = providedServiceTypes;
            this.__explicitlySet__.add("providedServiceTypes");
            return this;
        }
        /**
         * List of Delegation Subscription OCID that are associated with this Delegated Resource
         * Access Request based on the service types being requested.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("delegationSubscriptionIds")
        private java.util.List<String> delegationSubscriptionIds;

        /**
         * List of Delegation Subscription OCID that are associated with this Delegated Resource
         * Access Request based on the service types being requested.
         *
         * @param delegationSubscriptionIds the value to set
         * @return this builder
         */
        public Builder delegationSubscriptionIds(java.util.List<String> delegationSubscriptionIds) {
            this.delegationSubscriptionIds = delegationSubscriptionIds;
            this.__explicitlySet__.add("delegationSubscriptionIds");
            return this;
        }
        /** Priority assigned to the Delegated Resource Access Request by the support operator */
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private DelegatedResourceAccessRequestSeverity severity;

        /**
         * Priority assigned to the Delegated Resource Access Request by the support operator
         *
         * @param severity the value to set
         * @return this builder
         */
        public Builder severity(DelegatedResourceAccessRequestSeverity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /** Duration in hours for which access is sought on the target resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("durationInHours")
        private Integer durationInHours;

        /**
         * Duration in hours for which access is sought on the target resource.
         *
         * @param durationInHours the value to set
         * @return this builder
         */
        public Builder durationInHours(Integer durationInHours) {
            this.durationInHours = durationInHours;
            this.__explicitlySet__.add("durationInHours");
            return this;
        }
        /** Duration in hours for which extension access is sought on the target resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("extendDurationInHours")
        private Integer extendDurationInHours;

        /**
         * Duration in hours for which extension access is sought on the target resource.
         *
         * @param extendDurationInHours the value to set
         * @return this builder
         */
        public Builder extendDurationInHours(Integer extendDurationInHours) {
            this.extendDurationInHours = extendDurationInHours;
            this.__explicitlySet__.add("extendDurationInHours");
            return this;
        }
        /**
         * Set to true if the request is approved automatically based on
         * preApprovedServiceProviderActionNames or isAutoApproveDuringMaintenance in the associated
         * Delegation Control.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproved")
        private Boolean isAutoApproved;

        /**
         * Set to true if the request is approved automatically based on
         * preApprovedServiceProviderActionNames or isAutoApproveDuringMaintenance in the associated
         * Delegation Control.
         *
         * @param isAutoApproved the value to set
         * @return this builder
         */
        public Builder isAutoApproved(Boolean isAutoApproved) {
            this.isAutoApproved = isAutoApproved;
            this.__explicitlySet__.add("isAutoApproved");
            return this;
        }
        /** The current lifecycle state of the Delegated Resource Access Request. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the Delegated Resource Access Request.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Description of the current lifecycle state in more detail. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
        private String lifecycleStateDetails;

        /**
         * Description of the current lifecycle state in more detail.
         *
         * @param lifecycleStateDetails the value to set
         * @return this builder
         */
        public Builder lifecycleStateDetails(String lifecycleStateDetails) {
            this.lifecycleStateDetails = lifecycleStateDetails;
            this.__explicitlySet__.add("lifecycleStateDetails");
            return this;
        }
        /** The current status of the Delegated Resource Access Request. */
        @com.fasterxml.jackson.annotation.JsonProperty("requestStatus")
        private DelegatedResourceAccessRequestStatus requestStatus;

        /**
         * The current status of the Delegated Resource Access Request.
         *
         * @param requestStatus the value to set
         * @return this builder
         */
        public Builder requestStatus(DelegatedResourceAccessRequestStatus requestStatus) {
            this.requestStatus = requestStatus;
            this.__explicitlySet__.add("requestStatus");
            return this;
        }
        /**
         * Time when the Delegated Resource Access Request was created in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)timestamp format, e.g.
         * '2020-05-22T21:10:29.600Z'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Time when the Delegated Resource Access Request was created in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)timestamp format, e.g.
         * '2020-05-22T21:10:29.600Z'.
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
         * Time when the Delegated Resource Access Request was last modified in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)timestamp format, e.g.
         * '2020-05-22T21:10:29.600Z'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Time when the Delegated Resource Access Request was last modified in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)timestamp format, e.g.
         * '2020-05-22T21:10:29.600Z'.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** Number of initial approvals that have been obtained so far. */
        @com.fasterxml.jackson.annotation.JsonProperty("numInitialApprovals")
        private Integer numInitialApprovals;

        /**
         * Number of initial approvals that have been obtained so far.
         *
         * @param numInitialApprovals the value to set
         * @return this builder
         */
        public Builder numInitialApprovals(Integer numInitialApprovals) {
            this.numInitialApprovals = numInitialApprovals;
            this.__explicitlySet__.add("numInitialApprovals");
            return this;
        }
        /** Number of extension approvals that have been obtained so far. */
        @com.fasterxml.jackson.annotation.JsonProperty("numExtensionApprovals")
        private Integer numExtensionApprovals;

        /**
         * Number of extension approvals that have been obtained so far.
         *
         * @param numExtensionApprovals the value to set
         * @return this builder
         */
        public Builder numExtensionApprovals(Integer numExtensionApprovals) {
            this.numExtensionApprovals = numExtensionApprovals;
            this.__explicitlySet__.add("numExtensionApprovals");
            return this;
        }
        /** In case of single approval, this will have only one item. Else, a list of approvals. */
        @com.fasterxml.jackson.annotation.JsonProperty("approvalInfo")
        private java.util.List<DelegatedResourceAccessRequestApprovalDetails> approvalInfo;

        /**
         * In case of single approval, this will have only one item. Else, a list of approvals.
         *
         * @param approvalInfo the value to set
         * @return this builder
         */
        public Builder approvalInfo(
                java.util.List<DelegatedResourceAccessRequestApprovalDetails> approvalInfo) {
            this.approvalInfo = approvalInfo;
            this.__explicitlySet__.add("approvalInfo");
            return this;
        }
        /** The comment entered by the support operator while closing the request. */
        @com.fasterxml.jackson.annotation.JsonProperty("closureComment")
        private String closureComment;

        /**
         * The comment entered by the support operator while closing the request.
         *
         * @param closureComment the value to set
         * @return this builder
         */
        public Builder closureComment(String closureComment) {
            this.closureComment = closureComment;
            this.__explicitlySet__.add("closureComment");
            return this;
        }
        /** The OCID of the Delegation Control governing the target resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("delegationControlId")
        private String delegationControlId;

        /**
         * The OCID of the Delegation Control governing the target resource.
         *
         * @param delegationControlId the value to set
         * @return this builder
         */
        public Builder delegationControlId(String delegationControlId) {
            this.delegationControlId = delegationControlId;
            this.__explicitlySet__.add("delegationControlId");
            return this;
        }
        /**
         * Specifies the type of auditing to be enabled. There are two levels of auditing:
         * command-level and keystroke-level. By default, both command-level and keystroke-level
         * auditing are enabled, i.e. commands and key strokes issued by the support operator are
         * logged.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("auditTypes")
        private java.util.List<DelegatedResourceAccessRequestAuditType> auditTypes;

        /**
         * Specifies the type of auditing to be enabled. There are two levels of auditing:
         * command-level and keystroke-level. By default, both command-level and keystroke-level
         * auditing are enabled, i.e. commands and key strokes issued by the support operator are
         * logged.
         *
         * @param auditTypes the value to set
         * @return this builder
         */
        public Builder auditTypes(
                java.util.List<DelegatedResourceAccessRequestAuditType> auditTypes) {
            this.auditTypes = auditTypes;
            this.__explicitlySet__.add("auditTypes");
            return this;
        }
        /**
         * Indicates if the delegated resource access request is waiting on more information from
         * the operator
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPendingMoreInfo")
        private Boolean isPendingMoreInfo;

        /**
         * Indicates if the delegated resource access request is waiting on more information from
         * the operator
         *
         * @param isPendingMoreInfo the value to set
         * @return this builder
         */
        public Builder isPendingMoreInfo(Boolean isPendingMoreInfo) {
            this.isPendingMoreInfo = isPendingMoreInfo;
            this.__explicitlySet__.add("isPendingMoreInfo");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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

        public DelegatedResourceAccessRequest build() {
            DelegatedResourceAccessRequest model =
                    new DelegatedResourceAccessRequest(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.ticketNumbers,
                            this.reasonForRequest,
                            this.description,
                            this.timeAccessRequested,
                            this.resourceId,
                            this.resourceName,
                            this.resourceType,
                            this.requesterType,
                            this.requestedActionNames,
                            this.databaseNameList,
                            this.providedServiceTypes,
                            this.delegationSubscriptionIds,
                            this.severity,
                            this.durationInHours,
                            this.extendDurationInHours,
                            this.isAutoApproved,
                            this.lifecycleState,
                            this.lifecycleStateDetails,
                            this.requestStatus,
                            this.timeCreated,
                            this.timeUpdated,
                            this.numInitialApprovals,
                            this.numExtensionApprovals,
                            this.approvalInfo,
                            this.closureComment,
                            this.delegationControlId,
                            this.auditTypes,
                            this.isPendingMoreInfo,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DelegatedResourceAccessRequest model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("ticketNumbers")) {
                this.ticketNumbers(model.getTicketNumbers());
            }
            if (model.wasPropertyExplicitlySet("reasonForRequest")) {
                this.reasonForRequest(model.getReasonForRequest());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("timeAccessRequested")) {
                this.timeAccessRequested(model.getTimeAccessRequested());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("requesterType")) {
                this.requesterType(model.getRequesterType());
            }
            if (model.wasPropertyExplicitlySet("requestedActionNames")) {
                this.requestedActionNames(model.getRequestedActionNames());
            }
            if (model.wasPropertyExplicitlySet("databaseNameList")) {
                this.databaseNameList(model.getDatabaseNameList());
            }
            if (model.wasPropertyExplicitlySet("providedServiceTypes")) {
                this.providedServiceTypes(model.getProvidedServiceTypes());
            }
            if (model.wasPropertyExplicitlySet("delegationSubscriptionIds")) {
                this.delegationSubscriptionIds(model.getDelegationSubscriptionIds());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("durationInHours")) {
                this.durationInHours(model.getDurationInHours());
            }
            if (model.wasPropertyExplicitlySet("extendDurationInHours")) {
                this.extendDurationInHours(model.getExtendDurationInHours());
            }
            if (model.wasPropertyExplicitlySet("isAutoApproved")) {
                this.isAutoApproved(model.getIsAutoApproved());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleStateDetails")) {
                this.lifecycleStateDetails(model.getLifecycleStateDetails());
            }
            if (model.wasPropertyExplicitlySet("requestStatus")) {
                this.requestStatus(model.getRequestStatus());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("numInitialApprovals")) {
                this.numInitialApprovals(model.getNumInitialApprovals());
            }
            if (model.wasPropertyExplicitlySet("numExtensionApprovals")) {
                this.numExtensionApprovals(model.getNumExtensionApprovals());
            }
            if (model.wasPropertyExplicitlySet("approvalInfo")) {
                this.approvalInfo(model.getApprovalInfo());
            }
            if (model.wasPropertyExplicitlySet("closureComment")) {
                this.closureComment(model.getClosureComment());
            }
            if (model.wasPropertyExplicitlySet("delegationControlId")) {
                this.delegationControlId(model.getDelegationControlId());
            }
            if (model.wasPropertyExplicitlySet("auditTypes")) {
                this.auditTypes(model.getAuditTypes());
            }
            if (model.wasPropertyExplicitlySet("isPendingMoreInfo")) {
                this.isPendingMoreInfo(model.getIsPendingMoreInfo());
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

    /** The OCID of the Delegated Resource Access Request. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the Delegated Resource Access Request.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the compartment that contains the Delegated Resource Access Request. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the Delegated Resource Access Request.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Display name. This is generated by the system automatically. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name. This is generated by the system automatically.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A list of ticket numbers related to this Delegated Resource Access Request, e.g. Service
     * Request (SR) number and JIRA ticket number.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ticketNumbers")
    private final java.util.List<String> ticketNumbers;

    /**
     * A list of ticket numbers related to this Delegated Resource Access Request, e.g. Service
     * Request (SR) number and JIRA ticket number.
     *
     * @return the value
     */
    public java.util.List<String> getTicketNumbers() {
        return ticketNumbers;
    }

    /**
     * A short description explaining why this Delegated Resource Access Request is needed by the
     * support operator.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reasonForRequest")
    private final String reasonForRequest;

    /**
     * A short description explaining why this Delegated Resource Access Request is needed by the
     * support operator.
     *
     * @return the value
     */
    public String getReasonForRequest() {
        return reasonForRequest;
    }

    /** Detailed description of this Delegated Resource Access Request. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description of this Delegated Resource Access Request.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Requested access start time in UTC. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccessRequested")
    private final java.util.Date timeAccessRequested;

    /**
     * Requested access start time in UTC.
     *
     * @return the value
     */
    public java.util.Date getTimeAccessRequested() {
        return timeAccessRequested;
    }

    /**
     * The OCID of the target resource associated with the Delegated Resource Access Request. The
     * support operator raises a Delegated Resource Access Request to get approval to access the
     * target resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The OCID of the target resource associated with the Delegated Resource Access Request. The
     * support operator raises a Delegated Resource Access Request to get approval to access the
     * target resource.
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * The name of the target resource associated with the Delegated Resource Access Request. The
     * support operator raises a Delegated Resource Access Request to get approval to access the
     * target resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * The name of the target resource associated with the Delegated Resource Access Request. The
     * support operator raises a Delegated Resource Access Request to get approval to access the
     * target resource.
     *
     * @return the value
     */
    public String getResourceName() {
        return resourceName;
    }

    /** Resource type for which the associated Delegation Control is applicable to. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final DelegationControlResourceType resourceType;

    /**
     * Resource type for which the associated Delegation Control is applicable to.
     *
     * @return the value
     */
    public DelegationControlResourceType getResourceType() {
        return resourceType;
    }

    /** Requester type */
    @com.fasterxml.jackson.annotation.JsonProperty("requesterType")
    private final DelegatedResourceAccessRequesterType requesterType;

    /**
     * Requester type
     *
     * @return the value
     */
    public DelegatedResourceAccessRequesterType getRequesterType() {
        return requesterType;
    }

    /**
     * List of Service Provider Action names for which approval is sought by the support operator
     * user. The list of pre-defined Service Provider Actions can be obtained from the
     * ListServiceProviderActions API.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestedActionNames")
    private final java.util.List<String> requestedActionNames;

    /**
     * List of Service Provider Action names for which approval is sought by the support operator
     * user. The list of pre-defined Service Provider Actions can be obtained from the
     * ListServiceProviderActions API.
     *
     * @return the value
     */
    public java.util.List<String> getRequestedActionNames() {
        return requestedActionNames;
    }

    /**
     * List of Database unique names for which access is requested. This parameter is required for
     * DLGT_MGMT_SYS_MAINT_ACCESS cage when database access in needed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseNameList")
    private final java.util.List<String> databaseNameList;

    /**
     * List of Database unique names for which access is requested. This parameter is required for
     * DLGT_MGMT_SYS_MAINT_ACCESS cage when database access in needed.
     *
     * @return the value
     */
    public java.util.List<String> getDatabaseNameList() {
        return databaseNameList;
    }

    /** List of Service Provider Service Types being provided by the support operator user. */
    @com.fasterxml.jackson.annotation.JsonProperty("providedServiceTypes")
    private final java.util.List<ServiceProviderServiceType> providedServiceTypes;

    /**
     * List of Service Provider Service Types being provided by the support operator user.
     *
     * @return the value
     */
    public java.util.List<ServiceProviderServiceType> getProvidedServiceTypes() {
        return providedServiceTypes;
    }

    /**
     * List of Delegation Subscription OCID that are associated with this Delegated Resource Access
     * Request based on the service types being requested.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("delegationSubscriptionIds")
    private final java.util.List<String> delegationSubscriptionIds;

    /**
     * List of Delegation Subscription OCID that are associated with this Delegated Resource Access
     * Request based on the service types being requested.
     *
     * @return the value
     */
    public java.util.List<String> getDelegationSubscriptionIds() {
        return delegationSubscriptionIds;
    }

    /** Priority assigned to the Delegated Resource Access Request by the support operator */
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final DelegatedResourceAccessRequestSeverity severity;

    /**
     * Priority assigned to the Delegated Resource Access Request by the support operator
     *
     * @return the value
     */
    public DelegatedResourceAccessRequestSeverity getSeverity() {
        return severity;
    }

    /** Duration in hours for which access is sought on the target resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("durationInHours")
    private final Integer durationInHours;

    /**
     * Duration in hours for which access is sought on the target resource.
     *
     * @return the value
     */
    public Integer getDurationInHours() {
        return durationInHours;
    }

    /** Duration in hours for which extension access is sought on the target resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("extendDurationInHours")
    private final Integer extendDurationInHours;

    /**
     * Duration in hours for which extension access is sought on the target resource.
     *
     * @return the value
     */
    public Integer getExtendDurationInHours() {
        return extendDurationInHours;
    }

    /**
     * Set to true if the request is approved automatically based on
     * preApprovedServiceProviderActionNames or isAutoApproveDuringMaintenance in the associated
     * Delegation Control.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproved")
    private final Boolean isAutoApproved;

    /**
     * Set to true if the request is approved automatically based on
     * preApprovedServiceProviderActionNames or isAutoApproveDuringMaintenance in the associated
     * Delegation Control.
     *
     * @return the value
     */
    public Boolean getIsAutoApproved() {
        return isAutoApproved;
    }

    /** The current lifecycle state of the Delegated Resource Access Request. */
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
    /** The current lifecycle state of the Delegated Resource Access Request. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the Delegated Resource Access Request.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Description of the current lifecycle state in more detail. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
    private final String lifecycleStateDetails;

    /**
     * Description of the current lifecycle state in more detail.
     *
     * @return the value
     */
    public String getLifecycleStateDetails() {
        return lifecycleStateDetails;
    }

    /** The current status of the Delegated Resource Access Request. */
    @com.fasterxml.jackson.annotation.JsonProperty("requestStatus")
    private final DelegatedResourceAccessRequestStatus requestStatus;

    /**
     * The current status of the Delegated Resource Access Request.
     *
     * @return the value
     */
    public DelegatedResourceAccessRequestStatus getRequestStatus() {
        return requestStatus;
    }

    /**
     * Time when the Delegated Resource Access Request was created in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)timestamp format, e.g. '2020-05-22T21:10:29.600Z'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Time when the Delegated Resource Access Request was created in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)timestamp format, e.g. '2020-05-22T21:10:29.600Z'.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Time when the Delegated Resource Access Request was last modified in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)timestamp format, e.g. '2020-05-22T21:10:29.600Z'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Time when the Delegated Resource Access Request was last modified in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)timestamp format, e.g. '2020-05-22T21:10:29.600Z'.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Number of initial approvals that have been obtained so far. */
    @com.fasterxml.jackson.annotation.JsonProperty("numInitialApprovals")
    private final Integer numInitialApprovals;

    /**
     * Number of initial approvals that have been obtained so far.
     *
     * @return the value
     */
    public Integer getNumInitialApprovals() {
        return numInitialApprovals;
    }

    /** Number of extension approvals that have been obtained so far. */
    @com.fasterxml.jackson.annotation.JsonProperty("numExtensionApprovals")
    private final Integer numExtensionApprovals;

    /**
     * Number of extension approvals that have been obtained so far.
     *
     * @return the value
     */
    public Integer getNumExtensionApprovals() {
        return numExtensionApprovals;
    }

    /** In case of single approval, this will have only one item. Else, a list of approvals. */
    @com.fasterxml.jackson.annotation.JsonProperty("approvalInfo")
    private final java.util.List<DelegatedResourceAccessRequestApprovalDetails> approvalInfo;

    /**
     * In case of single approval, this will have only one item. Else, a list of approvals.
     *
     * @return the value
     */
    public java.util.List<DelegatedResourceAccessRequestApprovalDetails> getApprovalInfo() {
        return approvalInfo;
    }

    /** The comment entered by the support operator while closing the request. */
    @com.fasterxml.jackson.annotation.JsonProperty("closureComment")
    private final String closureComment;

    /**
     * The comment entered by the support operator while closing the request.
     *
     * @return the value
     */
    public String getClosureComment() {
        return closureComment;
    }

    /** The OCID of the Delegation Control governing the target resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("delegationControlId")
    private final String delegationControlId;

    /**
     * The OCID of the Delegation Control governing the target resource.
     *
     * @return the value
     */
    public String getDelegationControlId() {
        return delegationControlId;
    }

    /**
     * Specifies the type of auditing to be enabled. There are two levels of auditing: command-level
     * and keystroke-level. By default, both command-level and keystroke-level auditing are enabled,
     * i.e. commands and key strokes issued by the support operator are logged.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("auditTypes")
    private final java.util.List<DelegatedResourceAccessRequestAuditType> auditTypes;

    /**
     * Specifies the type of auditing to be enabled. There are two levels of auditing: command-level
     * and keystroke-level. By default, both command-level and keystroke-level auditing are enabled,
     * i.e. commands and key strokes issued by the support operator are logged.
     *
     * @return the value
     */
    public java.util.List<DelegatedResourceAccessRequestAuditType> getAuditTypes() {
        return auditTypes;
    }

    /**
     * Indicates if the delegated resource access request is waiting on more information from the
     * operator
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPendingMoreInfo")
    private final Boolean isPendingMoreInfo;

    /**
     * Indicates if the delegated resource access request is waiting on more information from the
     * operator
     *
     * @return the value
     */
    public Boolean getIsPendingMoreInfo() {
        return isPendingMoreInfo;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
        sb.append("DelegatedResourceAccessRequest(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", ticketNumbers=").append(String.valueOf(this.ticketNumbers));
        sb.append(", reasonForRequest=").append(String.valueOf(this.reasonForRequest));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeAccessRequested=").append(String.valueOf(this.timeAccessRequested));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", requesterType=").append(String.valueOf(this.requesterType));
        sb.append(", requestedActionNames=").append(String.valueOf(this.requestedActionNames));
        sb.append(", databaseNameList=").append(String.valueOf(this.databaseNameList));
        sb.append(", providedServiceTypes=").append(String.valueOf(this.providedServiceTypes));
        sb.append(", delegationSubscriptionIds=")
                .append(String.valueOf(this.delegationSubscriptionIds));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", durationInHours=").append(String.valueOf(this.durationInHours));
        sb.append(", extendDurationInHours=").append(String.valueOf(this.extendDurationInHours));
        sb.append(", isAutoApproved=").append(String.valueOf(this.isAutoApproved));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleStateDetails=").append(String.valueOf(this.lifecycleStateDetails));
        sb.append(", requestStatus=").append(String.valueOf(this.requestStatus));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", numInitialApprovals=").append(String.valueOf(this.numInitialApprovals));
        sb.append(", numExtensionApprovals=").append(String.valueOf(this.numExtensionApprovals));
        sb.append(", approvalInfo=").append(String.valueOf(this.approvalInfo));
        sb.append(", closureComment=").append(String.valueOf(this.closureComment));
        sb.append(", delegationControlId=").append(String.valueOf(this.delegationControlId));
        sb.append(", auditTypes=").append(String.valueOf(this.auditTypes));
        sb.append(", isPendingMoreInfo=").append(String.valueOf(this.isPendingMoreInfo));
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
        if (!(o instanceof DelegatedResourceAccessRequest)) {
            return false;
        }

        DelegatedResourceAccessRequest other = (DelegatedResourceAccessRequest) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.ticketNumbers, other.ticketNumbers)
                && java.util.Objects.equals(this.reasonForRequest, other.reasonForRequest)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeAccessRequested, other.timeAccessRequested)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.requesterType, other.requesterType)
                && java.util.Objects.equals(this.requestedActionNames, other.requestedActionNames)
                && java.util.Objects.equals(this.databaseNameList, other.databaseNameList)
                && java.util.Objects.equals(this.providedServiceTypes, other.providedServiceTypes)
                && java.util.Objects.equals(
                        this.delegationSubscriptionIds, other.delegationSubscriptionIds)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.durationInHours, other.durationInHours)
                && java.util.Objects.equals(this.extendDurationInHours, other.extendDurationInHours)
                && java.util.Objects.equals(this.isAutoApproved, other.isAutoApproved)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleStateDetails, other.lifecycleStateDetails)
                && java.util.Objects.equals(this.requestStatus, other.requestStatus)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.numInitialApprovals, other.numInitialApprovals)
                && java.util.Objects.equals(this.numExtensionApprovals, other.numExtensionApprovals)
                && java.util.Objects.equals(this.approvalInfo, other.approvalInfo)
                && java.util.Objects.equals(this.closureComment, other.closureComment)
                && java.util.Objects.equals(this.delegationControlId, other.delegationControlId)
                && java.util.Objects.equals(this.auditTypes, other.auditTypes)
                && java.util.Objects.equals(this.isPendingMoreInfo, other.isPendingMoreInfo)
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
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.ticketNumbers == null ? 43 : this.ticketNumbers.hashCode());
        result =
                (result * PRIME)
                        + (this.reasonForRequest == null ? 43 : this.reasonForRequest.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.timeAccessRequested == null
                                ? 43
                                : this.timeAccessRequested.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.requesterType == null ? 43 : this.requesterType.hashCode());
        result =
                (result * PRIME)
                        + (this.requestedActionNames == null
                                ? 43
                                : this.requestedActionNames.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseNameList == null ? 43 : this.databaseNameList.hashCode());
        result =
                (result * PRIME)
                        + (this.providedServiceTypes == null
                                ? 43
                                : this.providedServiceTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.delegationSubscriptionIds == null
                                ? 43
                                : this.delegationSubscriptionIds.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result =
                (result * PRIME)
                        + (this.durationInHours == null ? 43 : this.durationInHours.hashCode());
        result =
                (result * PRIME)
                        + (this.extendDurationInHours == null
                                ? 43
                                : this.extendDurationInHours.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoApproved == null ? 43 : this.isAutoApproved.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleStateDetails == null
                                ? 43
                                : this.lifecycleStateDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.requestStatus == null ? 43 : this.requestStatus.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.numInitialApprovals == null
                                ? 43
                                : this.numInitialApprovals.hashCode());
        result =
                (result * PRIME)
                        + (this.numExtensionApprovals == null
                                ? 43
                                : this.numExtensionApprovals.hashCode());
        result = (result * PRIME) + (this.approvalInfo == null ? 43 : this.approvalInfo.hashCode());
        result =
                (result * PRIME)
                        + (this.closureComment == null ? 43 : this.closureComment.hashCode());
        result =
                (result * PRIME)
                        + (this.delegationControlId == null
                                ? 43
                                : this.delegationControlId.hashCode());
        result = (result * PRIME) + (this.auditTypes == null ? 43 : this.auditTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.isPendingMoreInfo == null ? 43 : this.isPendingMoreInfo.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
