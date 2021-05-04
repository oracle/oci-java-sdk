/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateOperatorControlDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateOperatorControlDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("operatorControlName")
        private String operatorControlName;

        public Builder operatorControlName(String operatorControlName) {
            this.operatorControlName = operatorControlName;
            this.__explicitlySet__.add("operatorControlName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("approversList")
        private java.util.List<String> approversList;

        public Builder approversList(java.util.List<String> approversList) {
            this.approversList = approversList;
            this.__explicitlySet__.add("approversList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("approverGroupsList")
        private java.util.List<String> approverGroupsList;

        public Builder approverGroupsList(java.util.List<String> approverGroupsList) {
            this.approverGroupsList = approverGroupsList;
            this.__explicitlySet__.add("approverGroupsList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("preApprovedOpActionList")
        private java.util.List<String> preApprovedOpActionList;

        public Builder preApprovedOpActionList(java.util.List<String> preApprovedOpActionList) {
            this.preApprovedOpActionList = preApprovedOpActionList;
            this.__explicitlySet__.add("preApprovedOpActionList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isFullyPreApproved")
        private Boolean isFullyPreApproved;

        public Builder isFullyPreApproved(Boolean isFullyPreApproved) {
            this.isFullyPreApproved = isFullyPreApproved;
            this.__explicitlySet__.add("isFullyPreApproved");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("emailIdList")
        private java.util.List<String> emailIdList;

        public Builder emailIdList(java.util.List<String> emailIdList) {
            this.emailIdList = emailIdList;
            this.__explicitlySet__.add("emailIdList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemMessage")
        private String systemMessage;

        public Builder systemMessage(String systemMessage) {
            this.systemMessage = systemMessage;
            this.__explicitlySet__.add("systemMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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

        public CreateOperatorControlDetails build() {
            CreateOperatorControlDetails __instance__ =
                    new CreateOperatorControlDetails(
                            operatorControlName,
                            description,
                            approversList,
                            approverGroupsList,
                            preApprovedOpActionList,
                            isFullyPreApproved,
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

    /**
     * Name of the operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operatorControlName")
    String operatorControlName;

    /**
     * Description of the operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * List of users who can approve an access request associated with a resource governed by this operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approversList")
    java.util.List<String> approversList;

    /**
     * List of user groups who can approve an access request associated with a resource governed by this operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approverGroupsList")
    java.util.List<String> approverGroupsList;

    /**
     * List of pre-approved operator actions. Access requests associated with a resource governed by this operator control will be
     * auto-approved if the access request only contain operator actions in the pre-approved list.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("preApprovedOpActionList")
    java.util.List<String> preApprovedOpActionList;

    /**
     * Whether all the operator actions have been pre-approved. If yes, all access requests associated with a resource governed by this operator control
     * will be auto-approved.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFullyPreApproved")
    Boolean isFullyPreApproved;

    /**
     * List of emailId.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emailIdList")
    java.util.List<String> emailIdList;

    /**
     * This is the message that will be displayed to the operator users while accessing the system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemMessage")
    String systemMessage;

    /**
     * The OCID of the compartment that contains this operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

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
