/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ProtectionCapability.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ProtectionCapability {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "version",
        "exclusions",
        "actionName",
        "collaborativeActionThreshold",
        "collaborativeWeights"
    })
    public ProtectionCapability(
            String key,
            Integer version,
            ProtectionCapabilityExclusions exclusions,
            String actionName,
            Integer collaborativeActionThreshold,
            java.util.List<CollaborativeCapabilityWeightOverride> collaborativeWeights) {
        super();
        this.key = key;
        this.version = version;
        this.exclusions = exclusions;
        this.actionName = actionName;
        this.collaborativeActionThreshold = collaborativeActionThreshold;
        this.collaborativeWeights = collaborativeWeights;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique key of referenced protection capability.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique key of referenced protection capability.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * Version of referenced protection capability.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private Integer version;

        /**
         * Version of referenced protection capability.
         * @param version the value to set
         * @return this builder
         **/
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
        /**
         * Override action to take if capability was triggered, defined in Protection Rule for this capability.
         * Only actions of type CHECK are allowed.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("actionName")
        private String actionName;

        /**
         * Override action to take if capability was triggered, defined in Protection Rule for this capability.
         * Only actions of type CHECK are allowed.
         *
         * @param actionName the value to set
         * @return this builder
         **/
        public Builder actionName(String actionName) {
            this.actionName = actionName;
            this.__explicitlySet__.add("actionName");
            return this;
        }
        /**
         * The minimum sum of weights of associated collaborative protection capabilities that have triggered which
         * must be reached in order for _this_ capability to trigger.
         * This field is ignored for non-collaborative capabilities.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("collaborativeActionThreshold")
        private Integer collaborativeActionThreshold;

        /**
         * The minimum sum of weights of associated collaborative protection capabilities that have triggered which
         * must be reached in order for _this_ capability to trigger.
         * This field is ignored for non-collaborative capabilities.
         *
         * @param collaborativeActionThreshold the value to set
         * @return this builder
         **/
        public Builder collaborativeActionThreshold(Integer collaborativeActionThreshold) {
            this.collaborativeActionThreshold = collaborativeActionThreshold;
            this.__explicitlySet__.add("collaborativeActionThreshold");
            return this;
        }
        /**
         * Explicit weight values to use for associated collaborative protection capabilities.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("collaborativeWeights")
        private java.util.List<CollaborativeCapabilityWeightOverride> collaborativeWeights;

        /**
         * Explicit weight values to use for associated collaborative protection capabilities.
         *
         * @param collaborativeWeights the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Unique key of referenced protection capability.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique key of referenced protection capability.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * Version of referenced protection capability.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final Integer version;

    /**
     * Version of referenced protection capability.
     * @return the value
     **/
    public Integer getVersion() {
        return version;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("exclusions")
    private final ProtectionCapabilityExclusions exclusions;

    public ProtectionCapabilityExclusions getExclusions() {
        return exclusions;
    }

    /**
     * Override action to take if capability was triggered, defined in Protection Rule for this capability.
     * Only actions of type CHECK are allowed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionName")
    private final String actionName;

    /**
     * Override action to take if capability was triggered, defined in Protection Rule for this capability.
     * Only actions of type CHECK are allowed.
     *
     * @return the value
     **/
    public String getActionName() {
        return actionName;
    }

    /**
     * The minimum sum of weights of associated collaborative protection capabilities that have triggered which
     * must be reached in order for _this_ capability to trigger.
     * This field is ignored for non-collaborative capabilities.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("collaborativeActionThreshold")
    private final Integer collaborativeActionThreshold;

    /**
     * The minimum sum of weights of associated collaborative protection capabilities that have triggered which
     * must be reached in order for _this_ capability to trigger.
     * This field is ignored for non-collaborative capabilities.
     *
     * @return the value
     **/
    public Integer getCollaborativeActionThreshold() {
        return collaborativeActionThreshold;
    }

    /**
     * Explicit weight values to use for associated collaborative protection capabilities.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("collaborativeWeights")
    private final java.util.List<CollaborativeCapabilityWeightOverride> collaborativeWeights;

    /**
     * Explicit weight values to use for associated collaborative protection capabilities.
     *
     * @return the value
     **/
    public java.util.List<CollaborativeCapabilityWeightOverride> getCollaborativeWeights() {
        return collaborativeWeights;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ProtectionCapability(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", exclusions=").append(String.valueOf(this.exclusions));
        sb.append(", actionName=").append(String.valueOf(this.actionName));
        sb.append(", collaborativeActionThreshold=")
                .append(String.valueOf(this.collaborativeActionThreshold));
        sb.append(", collaborativeWeights=").append(String.valueOf(this.collaborativeWeights));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProtectionCapability)) {
            return false;
        }

        ProtectionCapability other = (ProtectionCapability) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.exclusions, other.exclusions)
                && java.util.Objects.equals(this.actionName, other.actionName)
                && java.util.Objects.equals(
                        this.collaborativeActionThreshold, other.collaborativeActionThreshold)
                && java.util.Objects.equals(this.collaborativeWeights, other.collaborativeWeights)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.exclusions == null ? 43 : this.exclusions.hashCode());
        result = (result * PRIME) + (this.actionName == null ? 43 : this.actionName.hashCode());
        result =
                (result * PRIME)
                        + (this.collaborativeActionThreshold == null
                                ? 43
                                : this.collaborativeActionThreshold.hashCode());
        result =
                (result * PRIME)
                        + (this.collaborativeWeights == null
                                ? 43
                                : this.collaborativeWeights.hashCode());
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
