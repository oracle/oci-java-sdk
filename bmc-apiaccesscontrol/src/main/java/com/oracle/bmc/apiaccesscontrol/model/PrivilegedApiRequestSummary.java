/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apiaccesscontrol.model;

/**
 * Summary of access request. <br>
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
        builder = PrivilegedApiRequestSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PrivilegedApiRequestSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "requestId",
        "reasonSummary",
        "compartmentId",
        "resourceName",
        "resourceId",
        "subResourceNameList",
        "resourceType",
        "privilegedOperationList",
        "state",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "timeUpdated",
        "durationInHrs",
        "severity",
        "timeRequestedForFutureAccess",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public PrivilegedApiRequestSummary(
            String id,
            String displayName,
            String requestId,
            String reasonSummary,
            String compartmentId,
            String resourceName,
            String resourceId,
            java.util.List<String> subResourceNameList,
            String resourceType,
            java.util.List<PrivilegedApiRequestOperationDetails> privilegedOperationList,
            PrivilegedApiRequest.State state,
            PrivilegedApiRequest.LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            Integer durationInHrs,
            PrivilegedApiRequestSeverity severity,
            java.util.Date timeRequestedForFutureAccess,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.requestId = requestId;
        this.reasonSummary = reasonSummary;
        this.compartmentId = compartmentId;
        this.resourceName = resourceName;
        this.resourceId = resourceId;
        this.subResourceNameList = subResourceNameList;
        this.resourceType = resourceType;
        this.privilegedOperationList = privilegedOperationList;
        this.state = state;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.durationInHrs = durationInHrs;
        this.severity = severity;
        this.timeRequestedForFutureAccess = timeRequestedForFutureAccess;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the access request. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the access request.
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
         * This is a system-generated identifier to identity a Request in human readable form in the
         * form of REQYYYYMMDD<number>.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("requestId")
        private String requestId;

        /**
         * This is a system-generated identifier to identity a Request in human readable form in the
         * form of REQYYYYMMDD<number>.
         *
         * @param requestId the value to set
         * @return this builder
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            this.__explicitlySet__.add("requestId");
            return this;
        }
        /** Comment associated with the privilegedApi request. */
        @com.fasterxml.jackson.annotation.JsonProperty("reasonSummary")
        private String reasonSummary;

        /**
         * Comment associated with the privilegedApi request.
         *
         * @param reasonSummary the value to set
         * @return this builder
         */
        public Builder reasonSummary(String reasonSummary) {
            this.reasonSummary = reasonSummary;
            this.__explicitlySet__.add("reasonSummary");
            return this;
        }
        /** The OCID of the compartment that contains the privilegedApi request. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the privilegedApi request.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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
         * The OCID of the target resource associated with the privilegedApi request. The operator
         * raises an privilegedApi request to get approval to access the target resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The OCID of the target resource associated with the privilegedApi request. The operator
         * raises an privilegedApi request to get approval to access the target resource.
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
        /** resourceType for which the PrivilegedApiRequest is applicable */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * resourceType for which the PrivilegedApiRequest is applicable
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
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
        /** The current state of the Access Request. */
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private PrivilegedApiRequest.State state;

        /**
         * The current state of the Access Request.
         *
         * @param state the value to set
         * @return this builder
         */
        public Builder state(PrivilegedApiRequest.State state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }
        /** The current state of the PrivilegedApiRequest. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private PrivilegedApiRequest.LifecycleState lifecycleState;

        /**
         * The current state of the PrivilegedApiRequest.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(PrivilegedApiRequest.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** More in detail about the lifeCycleState. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * More in detail about the lifeCycleState.
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
         * Time when the privilegedApi request was created by the operator user in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example:
         * '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Time when the privilegedApi request was created by the operator user in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example:
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
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example:
         * '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Time when the privilegedApi request was last modified in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example:
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
        /** Priority assigned to the privilegedApi request by the operator */
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private PrivilegedApiRequestSeverity severity;

        /**
         * Priority assigned to the privilegedApi request by the operator
         *
         * @param severity the value to set
         * @return this builder
         */
        public Builder severity(PrivilegedApiRequestSeverity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /**
         * Time in future when the user for the access request needs to be created in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
         * '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeRequestedForFutureAccess")
        private java.util.Date timeRequestedForFutureAccess;

        /**
         * Time in future when the user for the access request needs to be created in [RFC
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

        public PrivilegedApiRequestSummary build() {
            PrivilegedApiRequestSummary model =
                    new PrivilegedApiRequestSummary(
                            this.id,
                            this.displayName,
                            this.requestId,
                            this.reasonSummary,
                            this.compartmentId,
                            this.resourceName,
                            this.resourceId,
                            this.subResourceNameList,
                            this.resourceType,
                            this.privilegedOperationList,
                            this.state,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.durationInHrs,
                            this.severity,
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
        public Builder copy(PrivilegedApiRequestSummary model) {
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
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("privilegedOperationList")) {
                this.privilegedOperationList(model.getPrivilegedOperationList());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
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
            if (model.wasPropertyExplicitlySet("durationInHrs")) {
                this.durationInHrs(model.getDurationInHrs());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
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

    /** The OCID of the access request. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the access request.
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
     * This is a system-generated identifier to identity a Request in human readable form in the
     * form of REQYYYYMMDD<number>.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestId")
    private final String requestId;

    /**
     * This is a system-generated identifier to identity a Request in human readable form in the
     * form of REQYYYYMMDD<number>.
     *
     * @return the value
     */
    public String getRequestId() {
        return requestId;
    }

    /** Comment associated with the privilegedApi request. */
    @com.fasterxml.jackson.annotation.JsonProperty("reasonSummary")
    private final String reasonSummary;

    /**
     * Comment associated with the privilegedApi request.
     *
     * @return the value
     */
    public String getReasonSummary() {
        return reasonSummary;
    }

    /** The OCID of the compartment that contains the privilegedApi request. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the privilegedApi request.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
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
     * The OCID of the target resource associated with the privilegedApi request. The operator
     * raises an privilegedApi request to get approval to access the target resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The OCID of the target resource associated with the privilegedApi request. The operator
     * raises an privilegedApi request to get approval to access the target resource.
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

    /** resourceType for which the PrivilegedApiRequest is applicable */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * resourceType for which the PrivilegedApiRequest is applicable
     *
     * @return the value
     */
    public String getResourceType() {
        return resourceType;
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

    /** The current state of the Access Request. */
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final PrivilegedApiRequest.State state;

    /**
     * The current state of the Access Request.
     *
     * @return the value
     */
    public PrivilegedApiRequest.State getState() {
        return state;
    }

    /** The current state of the PrivilegedApiRequest. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final PrivilegedApiRequest.LifecycleState lifecycleState;

    /**
     * The current state of the PrivilegedApiRequest.
     *
     * @return the value
     */
    public PrivilegedApiRequest.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** More in detail about the lifeCycleState. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * More in detail about the lifeCycleState.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Time when the privilegedApi request was created by the operator user in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example:
     * '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Time when the privilegedApi request was created by the operator user in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example:
     * '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Time when the privilegedApi request was last modified in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example:
     * '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Time when the privilegedApi request was last modified in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example:
     * '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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

    /** Priority assigned to the privilegedApi request by the operator */
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final PrivilegedApiRequestSeverity severity;

    /**
     * Priority assigned to the privilegedApi request by the operator
     *
     * @return the value
     */
    public PrivilegedApiRequestSeverity getSeverity() {
        return severity;
    }

    /**
     * Time in future when the user for the access request needs to be created in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
     * '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeRequestedForFutureAccess")
    private final java.util.Date timeRequestedForFutureAccess;

    /**
     * Time in future when the user for the access request needs to be created in [RFC
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
        sb.append("PrivilegedApiRequestSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", requestId=").append(String.valueOf(this.requestId));
        sb.append(", reasonSummary=").append(String.valueOf(this.reasonSummary));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", subResourceNameList=").append(String.valueOf(this.subResourceNameList));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", privilegedOperationList=")
                .append(String.valueOf(this.privilegedOperationList));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", durationInHrs=").append(String.valueOf(this.durationInHrs));
        sb.append(", severity=").append(String.valueOf(this.severity));
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
        if (!(o instanceof PrivilegedApiRequestSummary)) {
            return false;
        }

        PrivilegedApiRequestSummary other = (PrivilegedApiRequestSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.requestId, other.requestId)
                && java.util.Objects.equals(this.reasonSummary, other.reasonSummary)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.subResourceNameList, other.subResourceNameList)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(
                        this.privilegedOperationList, other.privilegedOperationList)
                && java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.durationInHrs, other.durationInHrs)
                && java.util.Objects.equals(this.severity, other.severity)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.subResourceNameList == null
                                ? 43
                                : this.subResourceNameList.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.privilegedOperationList == null
                                ? 43
                                : this.privilegedOperationList.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
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
                        + (this.durationInHrs == null ? 43 : this.durationInHrs.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
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
