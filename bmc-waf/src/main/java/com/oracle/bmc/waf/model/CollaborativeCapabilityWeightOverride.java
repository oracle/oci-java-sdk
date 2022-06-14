/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.model;

/**
 * Collaborative capability key and overriding weight.
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
    builder = CollaborativeCapabilityWeightOverride.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CollaborativeCapabilityWeightOverride {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "weight"})
    public CollaborativeCapabilityWeightOverride(String key, Integer weight) {
        super();
        this.key = key;
        this.weight = weight;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique key of collaborative capability for which weight will be overridden.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique key of collaborative capability for which weight will be overridden.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The value of weight to set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("weight")
        private Integer weight;

        /**
         * The value of weight to set.
         * @param weight the value to set
         * @return this builder
         **/
        public Builder weight(Integer weight) {
            this.weight = weight;
            this.__explicitlySet__.add("weight");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CollaborativeCapabilityWeightOverride build() {
            CollaborativeCapabilityWeightOverride __instance__ =
                    new CollaborativeCapabilityWeightOverride(key, weight);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CollaborativeCapabilityWeightOverride o) {
            Builder copiedBuilder = key(o.getKey()).weight(o.getWeight());

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
     * Unique key of collaborative capability for which weight will be overridden.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique key of collaborative capability for which weight will be overridden.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The value of weight to set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("weight")
    private final Integer weight;

    /**
     * The value of weight to set.
     * @return the value
     **/
    public Integer getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CollaborativeCapabilityWeightOverride(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", weight=").append(String.valueOf(this.weight));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CollaborativeCapabilityWeightOverride)) {
            return false;
        }

        CollaborativeCapabilityWeightOverride other = (CollaborativeCapabilityWeightOverride) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.weight, other.weight)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.weight == null ? 43 : this.weight.hashCode());
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
