/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/**
 * While creating the operator control, specify how operator actions are approved and the users who have the privilege of approving the operator actions associated with the Operator Control.
 * <p>
 * You must specify which operator actions must be pre-approved. The rest of the operator actions associated with the Operator Control will require an explicit approval from the users selected either through the approver groups or individually.
 * <p>
 * You must name your Operator Control appropriately so it reflects the resources that will be governed by the Operator Control. Neither the Operator Controls nor their assignments to resources are visible to the Oracle operators.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateOperatorControlDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateOperatorControlDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "operatorControlName",
        "description",
        "approversList",
        "approverGroupsList",
        "preApprovedOpActionList",
        "isFullyPreApproved",
        "resourceType",
        "emailIdList",
        "systemMessage",
        "compartmentId",
        "freeformTags",
        "definedTags"
    })
    public CreateOperatorControlDetails(
            String operatorControlName,
            String description,
            java.util.List<String> approversList,
            java.util.List<String> approverGroupsList,
            java.util.List<String> preApprovedOpActionList,
            Boolean isFullyPreApproved,
            ResourceTypes resourceType,
            java.util.List<String> emailIdList,
            String systemMessage,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.operatorControlName = operatorControlName;
        this.description = description;
        this.approversList = approversList;
        this.approverGroupsList = approverGroupsList;
        this.preApprovedOpActionList = preApprovedOpActionList;
        this.isFullyPreApproved = isFullyPreApproved;
        this.resourceType = resourceType;
        this.emailIdList = emailIdList;
        this.systemMessage = systemMessage;
        this.compartmentId = compartmentId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the operator control.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operatorControlName")
        private String operatorControlName;

        /**
         * Name of the operator control.
         * @param operatorControlName the value to set
         * @return this builder
         **/
        public Builder operatorControlName(String operatorControlName) {
            this.operatorControlName = operatorControlName;
            this.__explicitlySet__.add("operatorControlName");
            return this;
        }
        /**
         * Description of the operator control.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the operator control.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * List of users who can approve an access request associated with a resource governed by this operator control.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("approversList")
        private java.util.List<String> approversList;

        /**
         * List of users who can approve an access request associated with a resource governed by this operator control.
         * @param approversList the value to set
         * @return this builder
         **/
        public Builder approversList(java.util.List<String> approversList) {
            this.approversList = approversList;
            this.__explicitlySet__.add("approversList");
            return this;
        }
        /**
         * List of user groups who can approve an access request associated with a resource governed by this operator control.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("approverGroupsList")
        private java.util.List<String> approverGroupsList;

        /**
         * List of user groups who can approve an access request associated with a resource governed by this operator control.
         * @param approverGroupsList the value to set
         * @return this builder
         **/
        public Builder approverGroupsList(java.util.List<String> approverGroupsList) {
            this.approverGroupsList = approverGroupsList;
            this.__explicitlySet__.add("approverGroupsList");
            return this;
        }
        /**
         * List of pre-approved operator actions. Access requests associated with a resource governed by this operator control will be
         * auto-approved if the access request only contain operator actions in the pre-approved list.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("preApprovedOpActionList")
        private java.util.List<String> preApprovedOpActionList;

        /**
         * List of pre-approved operator actions. Access requests associated with a resource governed by this operator control will be
         * auto-approved if the access request only contain operator actions in the pre-approved list.
         *
         * @param preApprovedOpActionList the value to set
         * @return this builder
         **/
        public Builder preApprovedOpActionList(java.util.List<String> preApprovedOpActionList) {
            this.preApprovedOpActionList = preApprovedOpActionList;
            this.__explicitlySet__.add("preApprovedOpActionList");
            return this;
        }
        /**
         * Whether all the operator actions have been pre-approved. If yes, all access requests associated with a resource governed by this operator control
         * will be auto-approved.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isFullyPreApproved")
        private Boolean isFullyPreApproved;

        /**
         * Whether all the operator actions have been pre-approved. If yes, all access requests associated with a resource governed by this operator control
         * will be auto-approved.
         *
         * @param isFullyPreApproved the value to set
         * @return this builder
         **/
        public Builder isFullyPreApproved(Boolean isFullyPreApproved) {
            this.isFullyPreApproved = isFullyPreApproved;
            this.__explicitlySet__.add("isFullyPreApproved");
            return this;
        }
        /**
         * resourceType for which the OperatorControl is applicable
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private ResourceTypes resourceType;

        /**
         * resourceType for which the OperatorControl is applicable
         * @param resourceType the value to set
         * @return this builder
         **/
        public Builder resourceType(ResourceTypes resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * List of emailId.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("emailIdList")
        private java.util.List<String> emailIdList;

        /**
         * List of emailId.
         *
         * @param emailIdList the value to set
         * @return this builder
         **/
        public Builder emailIdList(java.util.List<String> emailIdList) {
            this.emailIdList = emailIdList;
            this.__explicitlySet__.add("emailIdList");
            return this;
        }
        /**
         * This is the message that will be displayed to the operator users while accessing the system.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemMessage")
        private String systemMessage;

        /**
         * This is the message that will be displayed to the operator users while accessing the system.
         * @param systemMessage the value to set
         * @return this builder
         **/
        public Builder systemMessage(String systemMessage) {
            this.systemMessage = systemMessage;
            this.__explicitlySet__.add("systemMessage");
            return this;
        }
        /**
         * The OCID of the compartment that contains this operator control.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains this operator control.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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

        public CreateOperatorControlDetails build() {
            CreateOperatorControlDetails __instance__ =
                    new CreateOperatorControlDetails(
                            operatorControlName,
                            description,
                            approversList,
                            approverGroupsList,
                            preApprovedOpActionList,
                            isFullyPreApproved,
                            resourceType,
                            emailIdList,
                            systemMessage,
                            compartmentId,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOperatorControlDetails o) {
            Builder copiedBuilder =
                    operatorControlName(o.getOperatorControlName())
                            .description(o.getDescription())
                            .approversList(o.getApproversList())
                            .approverGroupsList(o.getApproverGroupsList())
                            .preApprovedOpActionList(o.getPreApprovedOpActionList())
                            .isFullyPreApproved(o.getIsFullyPreApproved())
                            .resourceType(o.getResourceType())
                            .emailIdList(o.getEmailIdList())
                            .systemMessage(o.getSystemMessage())
                            .compartmentId(o.getCompartmentId())
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Name of the operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operatorControlName")
    private final String operatorControlName;

    /**
     * Name of the operator control.
     * @return the value
     **/
    public String getOperatorControlName() {
        return operatorControlName;
    }

    /**
     * Description of the operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the operator control.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * List of users who can approve an access request associated with a resource governed by this operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approversList")
    private final java.util.List<String> approversList;

    /**
     * List of users who can approve an access request associated with a resource governed by this operator control.
     * @return the value
     **/
    public java.util.List<String> getApproversList() {
        return approversList;
    }

    /**
     * List of user groups who can approve an access request associated with a resource governed by this operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approverGroupsList")
    private final java.util.List<String> approverGroupsList;

    /**
     * List of user groups who can approve an access request associated with a resource governed by this operator control.
     * @return the value
     **/
    public java.util.List<String> getApproverGroupsList() {
        return approverGroupsList;
    }

    /**
     * List of pre-approved operator actions. Access requests associated with a resource governed by this operator control will be
     * auto-approved if the access request only contain operator actions in the pre-approved list.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("preApprovedOpActionList")
    private final java.util.List<String> preApprovedOpActionList;

    /**
     * List of pre-approved operator actions. Access requests associated with a resource governed by this operator control will be
     * auto-approved if the access request only contain operator actions in the pre-approved list.
     *
     * @return the value
     **/
    public java.util.List<String> getPreApprovedOpActionList() {
        return preApprovedOpActionList;
    }

    /**
     * Whether all the operator actions have been pre-approved. If yes, all access requests associated with a resource governed by this operator control
     * will be auto-approved.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFullyPreApproved")
    private final Boolean isFullyPreApproved;

    /**
     * Whether all the operator actions have been pre-approved. If yes, all access requests associated with a resource governed by this operator control
     * will be auto-approved.
     *
     * @return the value
     **/
    public Boolean getIsFullyPreApproved() {
        return isFullyPreApproved;
    }

    /**
     * resourceType for which the OperatorControl is applicable
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final ResourceTypes resourceType;

    /**
     * resourceType for which the OperatorControl is applicable
     * @return the value
     **/
    public ResourceTypes getResourceType() {
        return resourceType;
    }

    /**
     * List of emailId.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emailIdList")
    private final java.util.List<String> emailIdList;

    /**
     * List of emailId.
     *
     * @return the value
     **/
    public java.util.List<String> getEmailIdList() {
        return emailIdList;
    }

    /**
     * This is the message that will be displayed to the operator users while accessing the system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemMessage")
    private final String systemMessage;

    /**
     * This is the message that will be displayed to the operator users while accessing the system.
     * @return the value
     **/
    public String getSystemMessage() {
        return systemMessage;
    }

    /**
     * The OCID of the compartment that contains this operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains this operator control.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateOperatorControlDetails(");
        sb.append("operatorControlName=").append(String.valueOf(this.operatorControlName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", approversList=").append(String.valueOf(this.approversList));
        sb.append(", approverGroupsList=").append(String.valueOf(this.approverGroupsList));
        sb.append(", preApprovedOpActionList=")
                .append(String.valueOf(this.preApprovedOpActionList));
        sb.append(", isFullyPreApproved=").append(String.valueOf(this.isFullyPreApproved));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", emailIdList=").append(String.valueOf(this.emailIdList));
        sb.append(", systemMessage=").append(String.valueOf(this.systemMessage));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOperatorControlDetails)) {
            return false;
        }

        CreateOperatorControlDetails other = (CreateOperatorControlDetails) o;
        return java.util.Objects.equals(this.operatorControlName, other.operatorControlName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.approversList, other.approversList)
                && java.util.Objects.equals(this.approverGroupsList, other.approverGroupsList)
                && java.util.Objects.equals(
                        this.preApprovedOpActionList, other.preApprovedOpActionList)
                && java.util.Objects.equals(this.isFullyPreApproved, other.isFullyPreApproved)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.emailIdList, other.emailIdList)
                && java.util.Objects.equals(this.systemMessage, other.systemMessage)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.operatorControlName == null
                                ? 43
                                : this.operatorControlName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.approversList == null ? 43 : this.approversList.hashCode());
        result =
                (result * PRIME)
                        + (this.approverGroupsList == null
                                ? 43
                                : this.approverGroupsList.hashCode());
        result =
                (result * PRIME)
                        + (this.preApprovedOpActionList == null
                                ? 43
                                : this.preApprovedOpActionList.hashCode());
        result =
                (result * PRIME)
                        + (this.isFullyPreApproved == null
                                ? 43
                                : this.isFullyPreApproved.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.emailIdList == null ? 43 : this.emailIdList.hashCode());
        result =
                (result * PRIME)
                        + (this.systemMessage == null ? 43 : this.systemMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
