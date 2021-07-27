/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.integration.model;

/**
 * The information to be updated.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190131")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateIntegrationInstanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateIntegrationInstanceDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("integrationInstanceType")
        private IntegrationInstanceType integrationInstanceType;

        public Builder integrationInstanceType(IntegrationInstanceType integrationInstanceType) {
            this.integrationInstanceType = integrationInstanceType;
            this.__explicitlySet__.add("integrationInstanceType");
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

        @com.fasterxml.jackson.annotation.JsonProperty("isByol")
        private Boolean isByol;

        public Builder isByol(Boolean isByol) {
            this.isByol = isByol;
            this.__explicitlySet__.add("isByol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("messagePacks")
        private Integer messagePacks;

        public Builder messagePacks(Integer messagePacks) {
            this.messagePacks = messagePacks;
            this.__explicitlySet__.add("messagePacks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isFileServerEnabled")
        private Boolean isFileServerEnabled;

        public Builder isFileServerEnabled(Boolean isFileServerEnabled) {
            this.isFileServerEnabled = isFileServerEnabled;
            this.__explicitlySet__.add("isFileServerEnabled");
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
        private UpdateCustomEndpointDetails customEndpoint;

        public Builder customEndpoint(UpdateCustomEndpointDetails customEndpoint) {
            this.customEndpoint = customEndpoint;
            this.__explicitlySet__.add("customEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("alternateCustomEndpoints")
        private java.util.List<UpdateCustomEndpointDetails> alternateCustomEndpoints;

        public Builder alternateCustomEndpoints(
                java.util.List<UpdateCustomEndpointDetails> alternateCustomEndpoints) {
            this.alternateCustomEndpoints = alternateCustomEndpoints;
            this.__explicitlySet__.add("alternateCustomEndpoints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateIntegrationInstanceDetails build() {
            UpdateIntegrationInstanceDetails __instance__ =
                    new UpdateIntegrationInstanceDetails(
                            displayName,
                            integrationInstanceType,
                            freeformTags,
                            definedTags,
                            isByol,
                            messagePacks,
                            isFileServerEnabled,
                            isVisualBuilderEnabled,
                            customEndpoint,
                            alternateCustomEndpoints);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateIntegrationInstanceDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .integrationInstanceType(o.getIntegrationInstanceType())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .isByol(o.getIsByol())
                            .messagePacks(o.getMessagePacks())
                            .isFileServerEnabled(o.getIsFileServerEnabled())
                            .isVisualBuilderEnabled(o.getIsVisualBuilderEnabled())
                            .customEndpoint(o.getCustomEndpoint())
                            .alternateCustomEndpoints(o.getAlternateCustomEndpoints());

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
     * Integration Instance Identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;
    /**
     * Standard or Enterprise type
     **/
    public enum IntegrationInstanceType {
        Standard("STANDARD"),
        Enterprise("ENTERPRISE"),
        ;

        private final String value;
        private static java.util.Map<String, IntegrationInstanceType> map;

        static {
            map = new java.util.HashMap<>();
            for (IntegrationInstanceType v : IntegrationInstanceType.values()) {
                map.put(v.getValue(), v);
            }
        }

        IntegrationInstanceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IntegrationInstanceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid IntegrationInstanceType: " + key);
        }
    };
    /**
     * Standard or Enterprise type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("integrationInstanceType")
    IntegrationInstanceType integrationInstanceType;

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
     * Bring your own license.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isByol")
    Boolean isByol;

    /**
     * The number of configured message packs
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("messagePacks")
    Integer messagePacks;

    /**
     * The file server is enabled or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFileServerEnabled")
    Boolean isFileServerEnabled;

    /**
     * Visual Builder is enabled or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isVisualBuilderEnabled")
    Boolean isVisualBuilderEnabled;

    @com.fasterxml.jackson.annotation.JsonProperty("customEndpoint")
    UpdateCustomEndpointDetails customEndpoint;

    /**
     * A list of alternate custom endpoints to be used for the integration instance URL
     * (contact Oracle for alternateCustomEndpoints availability for a specific instance).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alternateCustomEndpoints")
    java.util.List<UpdateCustomEndpointDetails> alternateCustomEndpoints;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
