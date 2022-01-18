/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.visualbuilder.model;

/**
 * The information about new VbInstance.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateVbInstanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateVbInstanceDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("idcsOpenId")
        private String idcsOpenId;

        public Builder idcsOpenId(String idcsOpenId) {
            this.idcsOpenId = idcsOpenId;
            this.__explicitlySet__.add("idcsOpenId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
        private Integer nodeCount;

        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            this.__explicitlySet__.add("nodeCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isVisualBuilderEnabled")
        private Boolean isVisualBuilderEnabled;

        public Builder isVisualBuilderEnabled(Boolean isVisualBuilderEnabled) {
            this.isVisualBuilderEnabled = isVisualBuilderEnabled;
            this.__explicitlySet__.add("isVisualBuilderEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customEndpoint")
        private CreateCustomEndpointDetails customEndpoint;

        public Builder customEndpoint(CreateCustomEndpointDetails customEndpoint) {
            this.customEndpoint = customEndpoint;
            this.__explicitlySet__.add("customEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("alternateCustomEndpoints")
        private java.util.List<CreateCustomEndpointDetails> alternateCustomEndpoints;

        public Builder alternateCustomEndpoints(
                java.util.List<CreateCustomEndpointDetails> alternateCustomEndpoints) {
            this.alternateCustomEndpoints = alternateCustomEndpoints;
            this.__explicitlySet__.add("alternateCustomEndpoints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("consumptionModel")
        private ConsumptionModel consumptionModel;

        public Builder consumptionModel(ConsumptionModel consumptionModel) {
            this.consumptionModel = consumptionModel;
            this.__explicitlySet__.add("consumptionModel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateVbInstanceDetails build() {
            CreateVbInstanceDetails __instance__ =
                    new CreateVbInstanceDetails(
                            displayName,
                            compartmentId,
                            freeformTags,
                            definedTags,
                            idcsOpenId,
                            nodeCount,
                            isVisualBuilderEnabled,
                            customEndpoint,
                            alternateCustomEndpoints,
                            consumptionModel);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVbInstanceDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .idcsOpenId(o.getIdcsOpenId())
                            .nodeCount(o.getNodeCount())
                            .isVisualBuilderEnabled(o.getIsVisualBuilderEnabled())
                            .customEndpoint(o.getCustomEndpoint())
                            .alternateCustomEndpoints(o.getAlternateCustomEndpoints())
                            .consumptionModel(o.getConsumptionModel());

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
     * Vb Instance Identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Compartment Identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Simple key-value pair that is applied without any predefined name,
     * type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to
     * namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Encrypted IDCS Open ID token. This is required for pre-UCPIS cloud accounts, but not UCPIS, hence not a required parameter
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsOpenId")
    String idcsOpenId;

    /**
     * The number of Nodes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
    Integer nodeCount;

    /**
     * Visual Builder is enabled or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isVisualBuilderEnabled")
    Boolean isVisualBuilderEnabled;

    @com.fasterxml.jackson.annotation.JsonProperty("customEndpoint")
    CreateCustomEndpointDetails customEndpoint;

    /**
     * A list of alternate custom endpoints to be used for the vb instance URL
     * (contact Oracle for alternateCustomEndpoints availability for a specific instance).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alternateCustomEndpoints")
    java.util.List<CreateCustomEndpointDetails> alternateCustomEndpoints;
    /**
     * Optional parameter specifying which entitlement to use for billing purposes. Only required if the account possesses more than one entitlement.
     **/
    public enum ConsumptionModel {
        Ucm("UCM"),
        Gov("GOV"),
        Vb4Saas("VB4SAAS"),
        ;

        private final String value;
        private static java.util.Map<String, ConsumptionModel> map;

        static {
            map = new java.util.HashMap<>();
            for (ConsumptionModel v : ConsumptionModel.values()) {
                map.put(v.getValue(), v);
            }
        }

        ConsumptionModel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConsumptionModel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ConsumptionModel: " + key);
        }
    };
    /**
     * Optional parameter specifying which entitlement to use for billing purposes. Only required if the account possesses more than one entitlement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("consumptionModel")
    ConsumptionModel consumptionModel;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
