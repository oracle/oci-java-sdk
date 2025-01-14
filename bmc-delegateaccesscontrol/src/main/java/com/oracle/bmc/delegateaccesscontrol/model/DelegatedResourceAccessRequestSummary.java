/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.delegateaccesscontrol.model;

/**
 * Summary of Delegated Resource Access Request. <br>
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
        builder = DelegatedResourceAccessRequestSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DelegatedResourceAccessRequestSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "ticketNumbers",
        "reasonForRequest",
        "timeAccessRequested",
        "resourceId",
        "resourceName",
        "resourceType",
        "requestedActionNames",
        "requesterType",
        "delegationControlId",
        "severity",
        "durationInHours",
        "extendDurationInHours",
        "isAutoApproved",
        "lifecycleState",
        "lifecycleStateDetails",
        "requestStatus",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public DelegatedResourceAccessRequestSummary(
            String id,
            String compartmentId,
            String displayName,
            java.util.List<String> ticketNumbers,
            String reasonForRequest,
            java.util.Date timeAccessRequested,
            String resourceId,
            String resourceName,
            DelegationControlResourceType resourceType,
            java.util.List<String> requestedActionNames,
            DelegatedResourceAccessRequesterType requesterType,
            String delegationControlId,
            DelegatedResourceAccessRequestSeverity severity,
            Integer durationInHours,
            Integer extendDurationInHours,
            Boolean isAutoApproved,
            DelegatedResourceAccessRequest.LifecycleState lifecycleState,
            String lifecycleStateDetails,
            DelegatedResourceAccessRequestStatus requestStatus,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.ticketNumbers = ticketNumbers;
        this.reasonForRequest = reasonForRequest;
        this.timeAccessRequested = timeAccessRequested;
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.resourceType = resourceType;
        this.requestedActionNames = requestedActionNames;
        this.requesterType = requesterType;
        this.delegationControlId = delegationControlId;
        this.severity = severity;
        this.durationInHours = durationInHours;
        this.extendDurationInHours = extendDurationInHours;
        this.isAutoApproved = isAutoApproved;
        this.lifecycleState = lifecycleState;
        this.lifecycleStateDetails = lifecycleStateDetails;
        this.requestStatus = requestStatus;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
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
        private DelegatedResourceAccessRequest.LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the Delegated Resource Access Request.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(
                DelegatedResourceAccessRequest.LifecycleState lifecycleState) {
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
         * Time when the Delegated Resource Access Request was created by the support operator user
         * in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g.
         * '2020-05-22T21:10:29.600Z'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Time when the Delegated Resource Access Request was created by the support operator user
         * in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g.
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
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g.
         * '2020-05-22T21:10:29.600Z'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Time when the Delegated Resource Access Request was last modified in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g.
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

        public DelegatedResourceAccessRequestSummary build() {
            DelegatedResourceAccessRequestSummary model =
                    new DelegatedResourceAccessRequestSummary(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.ticketNumbers,
                            this.reasonForRequest,
                            this.timeAccessRequested,
                            this.resourceId,
                            this.resourceName,
                            this.resourceType,
                            this.requestedActionNames,
                            this.requesterType,
                            this.delegationControlId,
                            this.severity,
                            this.durationInHours,
                            this.extendDurationInHours,
                            this.isAutoApproved,
                            this.lifecycleState,
                            this.lifecycleStateDetails,
                            this.requestStatus,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DelegatedResourceAccessRequestSummary model) {
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
            if (model.wasPropertyExplicitlySet("requestedActionNames")) {
                this.requestedActionNames(model.getRequestedActionNames());
            }
            if (model.wasPropertyExplicitlySet("requesterType")) {
                this.requesterType(model.getRequesterType());
            }
            if (model.wasPropertyExplicitlySet("delegationControlId")) {
                this.delegationControlId(model.getDelegationControlId());
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
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final DelegatedResourceAccessRequest.LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the Delegated Resource Access Request.
     *
     * @return the value
     */
    public DelegatedResourceAccessRequest.LifecycleState getLifecycleState() {
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
     * Time when the Delegated Resource Access Request was created by the support operator user in
     * [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g.
     * '2020-05-22T21:10:29.600Z'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Time when the Delegated Resource Access Request was created by the support operator user in
     * [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g.
     * '2020-05-22T21:10:29.600Z'.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Time when the Delegated Resource Access Request was last modified in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g. '2020-05-22T21:10:29.600Z'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Time when the Delegated Resource Access Request was last modified in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g. '2020-05-22T21:10:29.600Z'.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("DelegatedResourceAccessRequestSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", ticketNumbers=").append(String.valueOf(this.ticketNumbers));
        sb.append(", reasonForRequest=").append(String.valueOf(this.reasonForRequest));
        sb.append(", timeAccessRequested=").append(String.valueOf(this.timeAccessRequested));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", requestedActionNames=").append(String.valueOf(this.requestedActionNames));
        sb.append(", requesterType=").append(String.valueOf(this.requesterType));
        sb.append(", delegationControlId=").append(String.valueOf(this.delegationControlId));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", durationInHours=").append(String.valueOf(this.durationInHours));
        sb.append(", extendDurationInHours=").append(String.valueOf(this.extendDurationInHours));
        sb.append(", isAutoApproved=").append(String.valueOf(this.isAutoApproved));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleStateDetails=").append(String.valueOf(this.lifecycleStateDetails));
        sb.append(", requestStatus=").append(String.valueOf(this.requestStatus));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
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
        if (!(o instanceof DelegatedResourceAccessRequestSummary)) {
            return false;
        }

        DelegatedResourceAccessRequestSummary other = (DelegatedResourceAccessRequestSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.ticketNumbers, other.ticketNumbers)
                && java.util.Objects.equals(this.reasonForRequest, other.reasonForRequest)
                && java.util.Objects.equals(this.timeAccessRequested, other.timeAccessRequested)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.requestedActionNames, other.requestedActionNames)
                && java.util.Objects.equals(this.requesterType, other.requesterType)
                && java.util.Objects.equals(this.delegationControlId, other.delegationControlId)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.durationInHours, other.durationInHours)
                && java.util.Objects.equals(this.extendDurationInHours, other.extendDurationInHours)
                && java.util.Objects.equals(this.isAutoApproved, other.isAutoApproved)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleStateDetails, other.lifecycleStateDetails)
                && java.util.Objects.equals(this.requestStatus, other.requestStatus)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
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
                        + (this.requestedActionNames == null
                                ? 43
                                : this.requestedActionNames.hashCode());
        result =
                (result * PRIME)
                        + (this.requesterType == null ? 43 : this.requesterType.hashCode());
        result =
                (result * PRIME)
                        + (this.delegationControlId == null
                                ? 43
                                : this.delegationControlId.hashCode());
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
