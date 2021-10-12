/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.model;

/**
 * A summary of available OCI-managed protection capabilities in WebAppFirewallPolicy.
 * Protection capabilies checks HTTP requests/responses if they are malicious.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ProtectionCapabilitySummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ProtectionCapabilitySummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private Integer version;

        public Builder version(Integer version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isLatestVersion")
        private Boolean isLatestVersion;

        public Builder isLatestVersion(Boolean isLatestVersion) {
            this.isLatestVersion = isLatestVersion;
            this.__explicitlySet__.add("isLatestVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("groupTags")
        private java.util.List<String> groupTags;

        public Builder groupTags(java.util.List<String> groupTags) {
            this.groupTags = groupTags;
            this.__explicitlySet__.add("groupTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("collaborativeActionThreshold")
        private Integer collaborativeActionThreshold;

        public Builder collaborativeActionThreshold(Integer collaborativeActionThreshold) {
            this.collaborativeActionThreshold = collaborativeActionThreshold;
            this.__explicitlySet__.add("collaborativeActionThreshold");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("collaborativeWeights")
        private java.util.List<CollaborativeCapabilityWeight> collaborativeWeights;

        public Builder collaborativeWeights(
                java.util.List<CollaborativeCapabilityWeight> collaborativeWeights) {
            this.collaborativeWeights = collaborativeWeights;
            this.__explicitlySet__.add("collaborativeWeights");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProtectionCapabilitySummary build() {
            ProtectionCapabilitySummary __instance__ =
                    new ProtectionCapabilitySummary(
                            key,
                            displayName,
                            description,
                            version,
                            isLatestVersion,
                            groupTags,
                            type,
                            collaborativeActionThreshold,
                            collaborativeWeights);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProtectionCapabilitySummary o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .version(o.getVersion())
                            .isLatestVersion(o.getIsLatestVersion())
                            .groupTags(o.getGroupTags())
                            .type(o.getType())
                            .collaborativeActionThreshold(o.getCollaborativeActionThreshold())
                            .collaborativeWeights(o.getCollaborativeWeights());

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
     * Unique key of protection capability.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The display name of protection capability.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The description of protection capability.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The version of protection capability.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    Integer version;

    /**
     * The field that shows if this is the latest version of protection capability.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLatestVersion")
    Boolean isLatestVersion;

    /**
     * The list of unique names protection capability group tags that are associated with this capability.
     * Example: ["PCI", "Recommended"]
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupTags")
    java.util.List<String> groupTags;
    /**
     * The type of protection capability.
     * <p>
     * **REQUEST_PROTECTION_CAPABILITY** can only be used in {@code requestProtection} module of WebAppFirewallPolicy.
     * <p>
     * **RESPONSE_PROTECTION_CAPABILITY** can only be used in {@code responseProtection} module of WebAppFirewallPolicy.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Type {
        RequestProtectionCapability("REQUEST_PROTECTION_CAPABILITY"),
        ResponseProtectionCapability("RESPONSE_PROTECTION_CAPABILITY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of protection capability.
     * <p>
     * **REQUEST_PROTECTION_CAPABILITY** can only be used in {@code requestProtection} module of WebAppFirewallPolicy.
     * <p>
     * **RESPONSE_PROTECTION_CAPABILITY** can only be used in {@code responseProtection} module of WebAppFirewallPolicy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    Type type;

    /**
     * The default collaborative action threshold for OCI-managed collaborative protection capability.
     * Collaborative protection capabilities are made of several simple, non-collaborative protection capabilities
     * (referred to as {@code contributing capabilities} later on) which have weights assigned to them. These weights can
     * be found in the {@code collaborativeWeights} array.
     * For incoming/outgoing HTTP messages, all contributing capabilities are executed and the sum of all triggered
     * contributing capabilities weights is calculated. Only if this sum is greater than or equal to
     * {@code collaborativeActionThreshold} is the incoming/outgoing HTTP message marked as malicious.
     * <p>
     * This field is ignored for non-collaborative capabilities.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("collaborativeActionThreshold")
    Integer collaborativeActionThreshold;

    /**
     * The weights of contributing capabilities.
     * Defines how much each contributing capability contributes towards the action threshold of a collaborative protection capability.
     * <p>
     * This field is ignored for non-collaborative capabilities.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("collaborativeWeights")
    java.util.List<CollaborativeCapabilityWeight> collaborativeWeights;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
