/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.model;

/**
 * References an OCI-managed protection capability. Checks if HTTP requests/responses are malicious.
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
    builder = ProtectionCapability.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ProtectionCapability {
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

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private Integer version;

        public Builder version(Integer version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exclusions")
        private ProtectionCapabilityExclusions exclusions;

        public Builder exclusions(ProtectionCapabilityExclusions exclusions) {
            this.exclusions = exclusions;
            this.__explicitlySet__.add("exclusions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("actionName")
        private String actionName;

        public Builder actionName(String actionName) {
            this.actionName = actionName;
            this.__explicitlySet__.add("actionName");
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
        private java.util.List<CollaborativeCapabilityWeightOverride> collaborativeWeights;

        public Builder collaborativeWeights(
                java.util.List<CollaborativeCapabilityWeightOverride> collaborativeWeights) {
            this.collaborativeWeights = collaborativeWeights;
            this.__explicitlySet__.add("collaborativeWeights");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProtectionCapability build() {
            ProtectionCapability __instance__ =
                    new ProtectionCapability(
                            key,
                            version,
                            exclusions,
                            actionName,
                            collaborativeActionThreshold,
                            collaborativeWeights);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProtectionCapability o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .version(o.getVersion())
                            .exclusions(o.getExclusions())
                            .actionName(o.getActionName())
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
     * Unique key of referenced protection capability.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * Version of referenced protection capability.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    Integer version;

    @com.fasterxml.jackson.annotation.JsonProperty("exclusions")
    ProtectionCapabilityExclusions exclusions;

    /**
     * Override action to take if capability was triggered, defined in Protection Rule for this capability.
     * Only actions of type CHECK are allowed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionName")
    String actionName;

    /**
     * The minimum sum of weights of associated collaborative protection capabilities that have triggered which
     * must be reached in order for _this_ capability to trigger.
     * This field is ignored for non-collaborative capabilities.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("collaborativeActionThreshold")
    Integer collaborativeActionThreshold;

    /**
     * Explicit weight values to use for associated collaborative protection capabilities.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("collaborativeWeights")
    java.util.List<CollaborativeCapabilityWeightOverride> collaborativeWeights;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
