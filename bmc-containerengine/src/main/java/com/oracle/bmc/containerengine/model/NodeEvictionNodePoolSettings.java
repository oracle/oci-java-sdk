/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * Node Eviction Details configuration
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = NodeEvictionNodePoolSettings.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NodeEvictionNodePoolSettings {
    @Deprecated
    @java.beans.ConstructorProperties({"evictionGraceDuration", "isForceDeleteAfterGraceDuration"})
    public NodeEvictionNodePoolSettings(
            String evictionGraceDuration, Boolean isForceDeleteAfterGraceDuration) {
        super();
        this.evictionGraceDuration = evictionGraceDuration;
        this.isForceDeleteAfterGraceDuration = isForceDeleteAfterGraceDuration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Duration after which OKE will give up eviction of the pods on the node. PT0M will indicate you want to delete the node without cordon and drain.
         * Default PT60M, Min PT0M, Max: PT60M. Format ISO 8601 e.g PT30M
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("evictionGraceDuration")
        private String evictionGraceDuration;

        /**
         * Duration after which OKE will give up eviction of the pods on the node. PT0M will indicate you want to delete the node without cordon and drain.
         * Default PT60M, Min PT0M, Max: PT60M. Format ISO 8601 e.g PT30M
         *
         * @param evictionGraceDuration the value to set
         * @return this builder
         **/
        public Builder evictionGraceDuration(String evictionGraceDuration) {
            this.evictionGraceDuration = evictionGraceDuration;
            this.__explicitlySet__.add("evictionGraceDuration");
            return this;
        }
        /**
         * If the underlying compute instance should be deleted if you cannot evict all the pods in grace period
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isForceDeleteAfterGraceDuration")
        private Boolean isForceDeleteAfterGraceDuration;

        /**
         * If the underlying compute instance should be deleted if you cannot evict all the pods in grace period
         * @param isForceDeleteAfterGraceDuration the value to set
         * @return this builder
         **/
        public Builder isForceDeleteAfterGraceDuration(Boolean isForceDeleteAfterGraceDuration) {
            this.isForceDeleteAfterGraceDuration = isForceDeleteAfterGraceDuration;
            this.__explicitlySet__.add("isForceDeleteAfterGraceDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NodeEvictionNodePoolSettings build() {
            NodeEvictionNodePoolSettings __instance__ =
                    new NodeEvictionNodePoolSettings(
                            evictionGraceDuration, isForceDeleteAfterGraceDuration);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NodeEvictionNodePoolSettings o) {
            Builder copiedBuilder =
                    evictionGraceDuration(o.getEvictionGraceDuration())
                            .isForceDeleteAfterGraceDuration(
                                    o.getIsForceDeleteAfterGraceDuration());

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
     * Duration after which OKE will give up eviction of the pods on the node. PT0M will indicate you want to delete the node without cordon and drain.
     * Default PT60M, Min PT0M, Max: PT60M. Format ISO 8601 e.g PT30M
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("evictionGraceDuration")
    private final String evictionGraceDuration;

    /**
     * Duration after which OKE will give up eviction of the pods on the node. PT0M will indicate you want to delete the node without cordon and drain.
     * Default PT60M, Min PT0M, Max: PT60M. Format ISO 8601 e.g PT30M
     *
     * @return the value
     **/
    public String getEvictionGraceDuration() {
        return evictionGraceDuration;
    }

    /**
     * If the underlying compute instance should be deleted if you cannot evict all the pods in grace period
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isForceDeleteAfterGraceDuration")
    private final Boolean isForceDeleteAfterGraceDuration;

    /**
     * If the underlying compute instance should be deleted if you cannot evict all the pods in grace period
     * @return the value
     **/
    public Boolean getIsForceDeleteAfterGraceDuration() {
        return isForceDeleteAfterGraceDuration;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("NodeEvictionNodePoolSettings(");
        sb.append("evictionGraceDuration=").append(String.valueOf(this.evictionGraceDuration));
        sb.append(", isForceDeleteAfterGraceDuration=")
                .append(String.valueOf(this.isForceDeleteAfterGraceDuration));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NodeEvictionNodePoolSettings)) {
            return false;
        }

        NodeEvictionNodePoolSettings other = (NodeEvictionNodePoolSettings) o;
        return java.util.Objects.equals(this.evictionGraceDuration, other.evictionGraceDuration)
                && java.util.Objects.equals(
                        this.isForceDeleteAfterGraceDuration, other.isForceDeleteAfterGraceDuration)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.evictionGraceDuration == null
                                ? 43
                                : this.evictionGraceDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.isForceDeleteAfterGraceDuration == null
                                ? 43
                                : this.isForceDeleteAfterGraceDuration.hashCode());
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
