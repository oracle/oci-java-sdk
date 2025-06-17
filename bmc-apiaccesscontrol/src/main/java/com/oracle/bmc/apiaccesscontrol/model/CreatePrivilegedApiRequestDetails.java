/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
        builder = CreatePrivilegedApiRequestDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreatePrivilegedApiRequestDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "reasonSummary",
        "compartmentId",
        "resourceId",
        "subResourceNameList",
        "privilegedOperationList",
        "notificationTopicId",
        "reasonDetail",
        "severity",
        "durationInHrs",
        "ticketNumbers",
        "timeRequestedForFutureAccess",
        "freeformTags",
        "definedTags"
    })
    public CreatePrivilegedApiRequestDetails(
            String reasonSummary,
            String compartmentId,
            String resourceId,
            java.util.List<String> subResourceNameList,
            java.util.List<PrivilegedApiRequestOperationDetails> privilegedOperationList,
            String notificationTopicId,
            String reasonDetail,
            PrivilegedApiRequestSeverity severity,
            Integer durationInHrs,
            java.util.List<String> ticketNumbers,
            java.util.Date timeRequestedForFutureAccess,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.reasonSummary = reasonSummary;
        this.compartmentId = compartmentId;
        this.resourceId = resourceId;
        this.subResourceNameList = subResourceNameList;
        this.privilegedOperationList = privilegedOperationList;
        this.notificationTopicId = notificationTopicId;
        this.reasonDetail = reasonDetail;
        this.severity = severity;
        this.durationInHrs = durationInHrs;
        this.ticketNumbers = ticketNumbers;
        this.timeRequestedForFutureAccess = timeRequestedForFutureAccess;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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
        /**
         * The OCID of the OCI Notification topic to publish messages related to this Privileged Api
         * Request.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("notificationTopicId")
        private String notificationTopicId;

        /**
         * The OCID of the OCI Notification topic to publish messages related to this Privileged Api
         * Request.
         *
         * @param notificationTopicId the value to set
         * @return this builder
         */
        public Builder notificationTopicId(String notificationTopicId) {
            this.notificationTopicId = notificationTopicId;
            this.__explicitlySet__.add("notificationTopicId");
            return this;
        }
        /** Reason in detail for which the operator is requesting access on the target resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("reasonDetail")
        private String reasonDetail;

        /**
         * Reason in detail for which the operator is requesting access on the target resource.
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreatePrivilegedApiRequestDetails build() {
            CreatePrivilegedApiRequestDetails model =
                    new CreatePrivilegedApiRequestDetails(
                            this.reasonSummary,
                            this.compartmentId,
                            this.resourceId,
                            this.subResourceNameList,
                            this.privilegedOperationList,
                            this.notificationTopicId,
                            this.reasonDetail,
                            this.severity,
                            this.durationInHrs,
                            this.ticketNumbers,
                            this.timeRequestedForFutureAccess,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreatePrivilegedApiRequestDetails model) {
            if (model.wasPropertyExplicitlySet("reasonSummary")) {
                this.reasonSummary(model.getReasonSummary());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("subResourceNameList")) {
                this.subResourceNameList(model.getSubResourceNameList());
            }
            if (model.wasPropertyExplicitlySet("privilegedOperationList")) {
                this.privilegedOperationList(model.getPrivilegedOperationList());
            }
            if (model.wasPropertyExplicitlySet("notificationTopicId")) {
                this.notificationTopicId(model.getNotificationTopicId());
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
            if (model.wasPropertyExplicitlySet("timeRequestedForFutureAccess")) {
                this.timeRequestedForFutureAccess(model.getTimeRequestedForFutureAccess());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
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

    /**
     * The OCID of the OCI Notification topic to publish messages related to this Privileged Api
     * Request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("notificationTopicId")
    private final String notificationTopicId;

    /**
     * The OCID of the OCI Notification topic to publish messages related to this Privileged Api
     * Request.
     *
     * @return the value
     */
    public String getNotificationTopicId() {
        return notificationTopicId;
    }

    /** Reason in detail for which the operator is requesting access on the target resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("reasonDetail")
    private final String reasonDetail;

    /**
     * Reason in detail for which the operator is requesting access on the target resource.
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
        sb.append("CreatePrivilegedApiRequestDetails(");
        sb.append("super=").append(super.toString());
        sb.append("reasonSummary=").append(String.valueOf(this.reasonSummary));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", subResourceNameList=").append(String.valueOf(this.subResourceNameList));
        sb.append(", privilegedOperationList=")
                .append(String.valueOf(this.privilegedOperationList));
        sb.append(", notificationTopicId=").append(String.valueOf(this.notificationTopicId));
        sb.append(", reasonDetail=").append(String.valueOf(this.reasonDetail));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", durationInHrs=").append(String.valueOf(this.durationInHrs));
        sb.append(", ticketNumbers=").append(String.valueOf(this.ticketNumbers));
        sb.append(", timeRequestedForFutureAccess=")
                .append(String.valueOf(this.timeRequestedForFutureAccess));
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
        if (!(o instanceof CreatePrivilegedApiRequestDetails)) {
            return false;
        }

        CreatePrivilegedApiRequestDetails other = (CreatePrivilegedApiRequestDetails) o;
        return java.util.Objects.equals(this.reasonSummary, other.reasonSummary)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.subResourceNameList, other.subResourceNameList)
                && java.util.Objects.equals(
                        this.privilegedOperationList, other.privilegedOperationList)
                && java.util.Objects.equals(this.notificationTopicId, other.notificationTopicId)
                && java.util.Objects.equals(this.reasonDetail, other.reasonDetail)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.durationInHrs, other.durationInHrs)
                && java.util.Objects.equals(this.ticketNumbers, other.ticketNumbers)
                && java.util.Objects.equals(
                        this.timeRequestedForFutureAccess, other.timeRequestedForFutureAccess)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.reasonSummary == null ? 43 : this.reasonSummary.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.subResourceNameList == null
                                ? 43
                                : this.subResourceNameList.hashCode());
        result =
                (result * PRIME)
                        + (this.privilegedOperationList == null
                                ? 43
                                : this.privilegedOperationList.hashCode());
        result =
                (result * PRIME)
                        + (this.notificationTopicId == null
                                ? 43
                                : this.notificationTopicId.hashCode());
        result = (result * PRIME) + (this.reasonDetail == null ? 43 : this.reasonDetail.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result =
                (result * PRIME)
                        + (this.durationInHrs == null ? 43 : this.durationInHrs.hashCode());
        result =
                (result * PRIME)
                        + (this.ticketNumbers == null ? 43 : this.ticketNumbers.hashCode());
        result =
                (result * PRIME)
                        + (this.timeRequestedForFutureAccess == null
                                ? 43
                                : this.timeRequestedForFutureAccess.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
