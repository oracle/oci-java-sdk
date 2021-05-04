/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OperatorControl.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class OperatorControl {
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

        @com.fasterxml.jackson.annotation.JsonProperty("approvalRequiredOpActionList")
        private java.util.List<String> approvalRequiredOpActionList;

        public Builder approvalRequiredOpActionList(
                java.util.List<String> approvalRequiredOpActionList) {
            this.approvalRequiredOpActionList = approvalRequiredOpActionList;
            this.__explicitlySet__.add("approvalRequiredOpActionList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isFullyPreApproved")
        private Boolean isFullyPreApproved;

        public Builder isFullyPreApproved(Boolean isFullyPreApproved) {
            this.isFullyPreApproved = isFullyPreApproved;
            this.__explicitlySet__.add("isFullyPreApproved");
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

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private OperatorControlLifecycleStates lifecycleState;

        public Builder lifecycleState(OperatorControlLifecycleStates lifecycleState) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
        private java.util.Date timeOfDeletion;

        public Builder timeOfDeletion(java.util.Date timeOfDeletion) {
            this.timeOfDeletion = timeOfDeletion;
            this.__explicitlySet__.add("timeOfDeletion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastModifiedInfo")
        private String lastModifiedInfo;

        public Builder lastModifiedInfo(String lastModifiedInfo) {
            this.lastModifiedInfo = lastModifiedInfo;
            this.__explicitlySet__.add("lastModifiedInfo");
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

    /**
     * The OCID of the operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Name of the operator control. The name must be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operatorControlName")
    String operatorControlName;

    /**
     * Description of operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * List of users who can approve an access request associated with a target resource under the governance of this operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approversList")
    java.util.List<String> approversList;

    /**
     * List of user groups who can approve an access request associated with a target resource under the governance of this operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approverGroupsList")
    java.util.List<String> approverGroupsList;

    /**
     * List of pre-approved operator actions. Access requests associated with a resource governed by this operator control will be
     * automatically approved if the access request only contain operator actions in the pre-approved list.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("preApprovedOpActionList")
    java.util.List<String> preApprovedOpActionList;

    /**
     * List of operator actions that need explicit approval. Any operator action not in the pre-approved list will require explicit
     * approval. Access requests associated with a resource governed by this operator control will be
     * require explicit approval if the access request contains any operator action in this list.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approvalRequiredOpActionList")
    java.util.List<String> approvalRequiredOpActionList;

    /**
     * Whether all the operator actions have been pre-approved. If yes, all access requests associated with a resource governed by this operator control
     * will be auto-approved.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFullyPreApproved")
    Boolean isFullyPreApproved;

    /**
     * System message that would be displayed to the operator users on accessing the target resource under the governance of this operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemMessage")
    String systemMessage;

    /**
     * The OCID of the compartment that contains the operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The current lifecycle state of the operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    OperatorControlLifecycleStates lifecycleState;

    /**
     * Time when the operator control was created expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfCreation")
    java.util.Date timeOfCreation;

    /**
     * Time when the operator control was last modified expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfModification")
    java.util.Date timeOfModification;

    /**
     * Time when deleted expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: '2020-05-22T21:10:29.600Z'.
     * Note a deleted operator control still stays in the system, so that you can still audit operator actions associated with access requests
     * raised on target resources governed by the deleted operator control.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
    java.util.Date timeOfDeletion;

    /**
     * Description associated with the latest modification of the operator control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastModifiedInfo")
    String lastModifiedInfo;

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
