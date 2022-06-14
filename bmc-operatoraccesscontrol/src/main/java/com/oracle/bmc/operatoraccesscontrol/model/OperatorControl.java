/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/**
 * Operator Access Control enables you to grant, audit, or revoke the access Oracle has to your Exadata Cloud@Customer infrastructure, and obtain audit reports of all actions taken by a human operator, in a near real-time manner.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OperatorControl.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OperatorControl {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "operatorControlName",
        "description",
        "approversList",
        "approverGroupsList",
        "preApprovedOpActionList",
        "approvalRequiredOpActionList",
        "isFullyPreApproved",
        "emailIdList",
        "resourceType",
        "systemMessage",
        "compartmentId",
        "lifecycleState",
        "timeOfCreation",
        "timeOfModification",
        "timeOfDeletion",
        "lastModifiedInfo",
        "freeformTags",
        "definedTags"
    })
    public OperatorControl(
            String id,
            String operatorControlName,
            String description,
            java.util.List<String> approversList,
            java.util.List<String> approverGroupsList,
            java.util.List<String> preApprovedOpActionList,
            java.util.List<String> approvalRequiredOpActionList,
            Boolean isFullyPreApproved,
            java.util.List<String> emailIdList,
            ResourceTypes resourceType,
            String systemMessage,
            String compartmentId,
            OperatorControlLifecycleStates lifecycleState,
            java.util.Date timeOfCreation,
            java.util.Date timeOfModification,
            java.util.Date timeOfDeletion,
            String lastModifiedInfo,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.operatorControlName = operatorControlName;
        this.description = description;
        this.approversList = approversList;
        this.approverGroupsList = approverGroupsList;
        this.preApprovedOpActionList = preApprovedOpActionList;
        this.approvalRequiredOpActionList = approvalRequiredOpActionList;
        this.isFullyPreApproved = isFullyPreApproved;
        this.emailIdList = emailIdList;
        this.resourceType = resourceType;
        this.systemMessage = systemMessage;
        this.compartmentId = compartmentId;
        this.lifecycleState = lifecycleState;
        this.timeOfCreation = timeOfCreation;
        this.timeOfModification = timeOfModification;
        this.timeOfDeletion = timeOfDeletion;
        this.lastModifiedInfo = lastModifiedInfo;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the operator control.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the operator control.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Name of the operator control. The name must be unique.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operatorControlName")
        private String operatorControlName;

        /**
         * Name of the operator control. The name must be unique.
         * @param operatorControlName the value to set
         * @return this builder
         **/
        public Builder operatorControlName(String operatorControlName) {
            this.operatorControlName = operatorControlName;
            this.__explicitlySet__.add("operatorControlName");
            return this;
        }
        /**
         * Description of operator control.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of operator control.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * List of users who can approve an access request associated with a target resource under the governance of this operator control.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("approversList")
        private java.util.List<String> approversList;

        /**
         * List of users who can approve an access request associated with a target resource under the governance of this operator control.
         * @param approversList the value to set
         * @return this builder
         **/
        public Builder approversList(java.util.List<String> approversList) {
            this.approversList = approversList;
            this.__explicitlySet__.add("approversList");
            return this;
        }
        /**
         * List of user groups who can approve an access request associated with a target resource under the governance of this operator control.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("approverGroupsList")
        private java.util.List<String> approverGroupsList;

        /**
         * List of user groups who can approve an access request associated with a target resource under the governance of this operator control.
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
         * automatically approved if the access request only contain operator actions in the pre-approved list.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("preApprovedOpActionList")
        private java.util.List<String> preApprovedOpActionList;

        /**
         * List of pre-approved operator actions. Access requests associated with a resource governed by this operator control will be
         * automatically approved if the access request only contain operator actions in the pre-approved list.
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
         * List of operator actions that need explicit approval. Any operator action not in the pre-approved list will require explicit
         * approval. Access requests associated with a resource governed by this operator control will be
         * require explicit approval if the access request contains any operator action in this list.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("approvalRequiredOpActionList")
        private java.util.List<String> approvalRequiredOpActionList;

        /**
         * List of operator actions that need explicit approval. Any operator action not in the pre-approved list will require explicit
         * approval. Access requests associated with a resource governed by this operator control will be
         * require explicit approval if the access request contains any operator action in this list.
         *
         * @param approvalRequiredOpActionList the value to set
         * @return this builder
         **/
        public Builder approvalRequiredOpActionList(
                java.util.List<String> approvalRequiredOpActionList) {
            this.approvalRequiredOpActionList = approvalRequiredOpActionList;
            this.__explicitlySet__.add("approvalRequiredOpActionList");
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
         * System message that would be displayed to the operator users on accessing the target resource under the governance of this operator control.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemMessage")
        private String systemMessage;

        /**
         * System message that would be displayed to the operator users on accessing the target resource under the governance of this operator control.
         * @param systemMessage the value to set
         * @return this builder
         **/
        public Builder systemMessage(String systemMessage) {
            this.systemMessage = systemMessage;
            this.__explicitlySet__.add("systemMessage");
            return this;
        }
        /**
         * The OCID of the compartment that contains the operator control.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the operator control.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The current lifecycle state of the operator control.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private OperatorControlLifecycleStates lifecycleState;

        /**
         * The current lifecycle state of the operator control.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(OperatorControlLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Time when the operator control was created expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: '2020-05-22T21:10:29.600Z'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfCreation")
        private java.util.Date timeOfCreation;

        /**
         * Time when the operator control was created expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: '2020-05-22T21:10:29.600Z'
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
         * Time when the operator control was last modified expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: '2020-05-22T21:10:29.600Z'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfModification")
        private java.util.Date timeOfModification;

        /**
         * Time when the operator control was last modified expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: '2020-05-22T21:10:29.600Z'
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
         * Time when deleted expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: '2020-05-22T21:10:29.600Z'.
         * Note a deleted operator control still stays in the system, so that you can still audit operator actions associated with access requests
         * raised on target resources governed by the deleted operator control.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
        private java.util.Date timeOfDeletion;

        /**
         * Time when deleted expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: '2020-05-22T21:10:29.600Z'.
         * Note a deleted operator control still stays in the system, so that you can still audit operator actions associated with access requests
         * raised on target resources governed by the deleted operator control.
         *
         * @param timeOfDeletion the value to set
         * @return this builder
         **/
        public Builder timeOfDeletion(java.util.Date timeOfDeletion) {
            this.timeOfDeletion = timeOfDeletion;
            this.__explicitlySet__.add("timeOfDeletion");
            return this;
        }
        /**
         * Description associated with the latest modification of the operator control.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastModifiedInfo")
        private String lastModifiedInfo;

        /**
         * Description associated with the latest modification of the operator control.
         * @param lastModifiedInfo the value to set
         * @return this builder
         **/
        public Builder lastModifiedInfo(String lastModifiedInfo) {
            this.lastModifiedInfo = lastModifiedInfo;
            this.__explicitlySet__.add("lastModifiedInfo");
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

        public OperatorControl build() {
            OperatorControl __instance__ =
                    new OperatorControl(
                            id,
                            operatorControlName,
                            description,
                            approversList,
                            approverGroupsList,
                            preApprovedOpActionList,
                            approvalRequiredOpActionList,
                            isFullyPreApproved,
                            emailIdList,
                            resourceType,
                            systemMessage,
                            compartmentId,
                            lifecycleState,
                            timeOfCreation,
                            timeOfModification,
                            timeOfDeletion,
                            lastModifiedInfo,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OperatorControl o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .operatorControlName(o.getOperatorControlName())
                            .description(o.getDescription())
                            .approversList(o.getApproversList())
                            .approverGroupsList(o.getApproverGroupsList())
                            .preApprovedOpActionList(o.getPreApprovedOpActionList())
                            .approvalRequiredOpActionList(o.getApprovalRequiredOpActionList())
                            .isFullyPreApproved(o.getIsFullyPreApproved())
                            .emailIdList(o.getEmailIdList())
                            .resourceType(o.getResourceType())
                            .systemMessage(o.getSystemMessage())
                            .compartmentId(o.getCompartmentId())
                            .lifecycleState(o.getLifecycleState())
                            .timeOfCreation(o.getTimeOfCreation())
                            .timeOfModification(o.getTimeOfModification())
                            .timeOfDeletion(o.getTimeOfDeletion())
                            .lastModifiedInfo(o.getLastModifiedInfo())
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
     * The OCID of the operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the operator control.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Name of the operator control. The name must be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operatorControlName")
    private final String operatorControlName;

    /**
     * Name of the operator control. The name must be unique.
     * @return the value
     **/
    public String getOperatorControlName() {
        return operatorControlName;
    }

    /**
     * Description of operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of operator control.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * List of users who can approve an access request associated with a target resource under the governance of this operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approversList")
    private final java.util.List<String> approversList;

    /**
     * List of users who can approve an access request associated with a target resource under the governance of this operator control.
     * @return the value
     **/
    public java.util.List<String> getApproversList() {
        return approversList;
    }

    /**
     * List of user groups who can approve an access request associated with a target resource under the governance of this operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approverGroupsList")
    private final java.util.List<String> approverGroupsList;

    /**
     * List of user groups who can approve an access request associated with a target resource under the governance of this operator control.
     * @return the value
     **/
    public java.util.List<String> getApproverGroupsList() {
        return approverGroupsList;
    }

    /**
     * List of pre-approved operator actions. Access requests associated with a resource governed by this operator control will be
     * automatically approved if the access request only contain operator actions in the pre-approved list.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("preApprovedOpActionList")
    private final java.util.List<String> preApprovedOpActionList;

    /**
     * List of pre-approved operator actions. Access requests associated with a resource governed by this operator control will be
     * automatically approved if the access request only contain operator actions in the pre-approved list.
     *
     * @return the value
     **/
    public java.util.List<String> getPreApprovedOpActionList() {
        return preApprovedOpActionList;
    }

    /**
     * List of operator actions that need explicit approval. Any operator action not in the pre-approved list will require explicit
     * approval. Access requests associated with a resource governed by this operator control will be
     * require explicit approval if the access request contains any operator action in this list.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approvalRequiredOpActionList")
    private final java.util.List<String> approvalRequiredOpActionList;

    /**
     * List of operator actions that need explicit approval. Any operator action not in the pre-approved list will require explicit
     * approval. Access requests associated with a resource governed by this operator control will be
     * require explicit approval if the access request contains any operator action in this list.
     *
     * @return the value
     **/
    public java.util.List<String> getApprovalRequiredOpActionList() {
        return approvalRequiredOpActionList;
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
     * System message that would be displayed to the operator users on accessing the target resource under the governance of this operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemMessage")
    private final String systemMessage;

    /**
     * System message that would be displayed to the operator users on accessing the target resource under the governance of this operator control.
     * @return the value
     **/
    public String getSystemMessage() {
        return systemMessage;
    }

    /**
     * The OCID of the compartment that contains the operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the operator control.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The current lifecycle state of the operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final OperatorControlLifecycleStates lifecycleState;

    /**
     * The current lifecycle state of the operator control.
     * @return the value
     **/
    public OperatorControlLifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Time when the operator control was created expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfCreation")
    private final java.util.Date timeOfCreation;

    /**
     * Time when the operator control was created expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     **/
    public java.util.Date getTimeOfCreation() {
        return timeOfCreation;
    }

    /**
     * Time when the operator control was last modified expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfModification")
    private final java.util.Date timeOfModification;

    /**
     * Time when the operator control was last modified expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     **/
    public java.util.Date getTimeOfModification() {
        return timeOfModification;
    }

    /**
     * Time when deleted expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: '2020-05-22T21:10:29.600Z'.
     * Note a deleted operator control still stays in the system, so that you can still audit operator actions associated with access requests
     * raised on target resources governed by the deleted operator control.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
    private final java.util.Date timeOfDeletion;

    /**
     * Time when deleted expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: '2020-05-22T21:10:29.600Z'.
     * Note a deleted operator control still stays in the system, so that you can still audit operator actions associated with access requests
     * raised on target resources governed by the deleted operator control.
     *
     * @return the value
     **/
    public java.util.Date getTimeOfDeletion() {
        return timeOfDeletion;
    }

    /**
     * Description associated with the latest modification of the operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastModifiedInfo")
    private final String lastModifiedInfo;

    /**
     * Description associated with the latest modification of the operator control.
     * @return the value
     **/
    public String getLastModifiedInfo() {
        return lastModifiedInfo;
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
        sb.append("OperatorControl(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", operatorControlName=").append(String.valueOf(this.operatorControlName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", approversList=").append(String.valueOf(this.approversList));
        sb.append(", approverGroupsList=").append(String.valueOf(this.approverGroupsList));
        sb.append(", preApprovedOpActionList=")
                .append(String.valueOf(this.preApprovedOpActionList));
        sb.append(", approvalRequiredOpActionList=")
                .append(String.valueOf(this.approvalRequiredOpActionList));
        sb.append(", isFullyPreApproved=").append(String.valueOf(this.isFullyPreApproved));
        sb.append(", emailIdList=").append(String.valueOf(this.emailIdList));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", systemMessage=").append(String.valueOf(this.systemMessage));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeOfCreation=").append(String.valueOf(this.timeOfCreation));
        sb.append(", timeOfModification=").append(String.valueOf(this.timeOfModification));
        sb.append(", timeOfDeletion=").append(String.valueOf(this.timeOfDeletion));
        sb.append(", lastModifiedInfo=").append(String.valueOf(this.lastModifiedInfo));
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
        if (!(o instanceof OperatorControl)) {
            return false;
        }

        OperatorControl other = (OperatorControl) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.operatorControlName, other.operatorControlName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.approversList, other.approversList)
                && java.util.Objects.equals(this.approverGroupsList, other.approverGroupsList)
                && java.util.Objects.equals(
                        this.preApprovedOpActionList, other.preApprovedOpActionList)
                && java.util.Objects.equals(
                        this.approvalRequiredOpActionList, other.approvalRequiredOpActionList)
                && java.util.Objects.equals(this.isFullyPreApproved, other.isFullyPreApproved)
                && java.util.Objects.equals(this.emailIdList, other.emailIdList)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.systemMessage, other.systemMessage)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeOfCreation, other.timeOfCreation)
                && java.util.Objects.equals(this.timeOfModification, other.timeOfModification)
                && java.util.Objects.equals(this.timeOfDeletion, other.timeOfDeletion)
                && java.util.Objects.equals(this.lastModifiedInfo, other.lastModifiedInfo)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
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
                        + (this.approvalRequiredOpActionList == null
                                ? 43
                                : this.approvalRequiredOpActionList.hashCode());
        result =
                (result * PRIME)
                        + (this.isFullyPreApproved == null
                                ? 43
                                : this.isFullyPreApproved.hashCode());
        result = (result * PRIME) + (this.emailIdList == null ? 43 : this.emailIdList.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.systemMessage == null ? 43 : this.systemMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
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
                        + (this.timeOfDeletion == null ? 43 : this.timeOfDeletion.hashCode());
        result =
                (result * PRIME)
                        + (this.lastModifiedInfo == null ? 43 : this.lastModifiedInfo.hashCode());
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
