/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * The information about new Data Mask Rule.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateDataMaskRuleDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateDataMaskRuleDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("iamGroupId")
        private String iamGroupId;

        public Builder iamGroupId(String iamGroupId) {
            this.iamGroupId = iamGroupId;
            this.__explicitlySet__.add("iamGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetSelected")
        private TargetSelected targetSelected;

        public Builder targetSelected(TargetSelected targetSelected) {
            this.targetSelected = targetSelected;
            this.__explicitlySet__.add("targetSelected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataMaskCategories")
        private java.util.List<DataMaskCategory> dataMaskCategories;

        public Builder dataMaskCategories(java.util.List<DataMaskCategory> dataMaskCategories) {
            this.dataMaskCategories = dataMaskCategories;
            this.__explicitlySet__.add("dataMaskCategories");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataMaskRuleStatus")
        private DataMaskRuleStatus dataMaskRuleStatus;

        public Builder dataMaskRuleStatus(DataMaskRuleStatus dataMaskRuleStatus) {
            this.dataMaskRuleStatus = dataMaskRuleStatus;
            this.__explicitlySet__.add("dataMaskRuleStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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

        public CreateDataMaskRuleDetails build() {
            CreateDataMaskRuleDetails __instance__ =
                    new CreateDataMaskRuleDetails(
                            displayName,
                            compartmentId,
                            description,
                            iamGroupId,
                            targetSelected,
                            dataMaskCategories,
                            dataMaskRuleStatus,
                            lifecycleState,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDataMaskRuleDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .description(o.getDescription())
                            .iamGroupId(o.getIamGroupId())
                            .targetSelected(o.getTargetSelected())
                            .dataMaskCategories(o.getDataMaskCategories())
                            .dataMaskRuleStatus(o.getDataMaskRuleStatus())
                            .lifecycleState(o.getLifecycleState())
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
     * Data Mask Rule name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Compartment Identifier where the resource is created
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The Data Mask Rule description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * IAM Group id associated with the data mask rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("iamGroupId")
    String iamGroupId;

    @com.fasterxml.jackson.annotation.JsonProperty("targetSelected")
    TargetSelected targetSelected;

    /**
     * Data Mask Categories
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataMaskCategories")
    java.util.List<DataMaskCategory> dataMaskCategories;

    /**
     * The status of the dataMaskRule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataMaskRuleStatus")
    DataMaskRuleStatus dataMaskRuleStatus;

    /**
     * The current state of the DataMaskRule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
