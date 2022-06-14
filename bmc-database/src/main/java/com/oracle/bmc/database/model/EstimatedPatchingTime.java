/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The estimated total time required in minutes for all patching operations (database server, storage server, and network switch patching).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = EstimatedPatchingTime.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EstimatedPatchingTime {
    @Deprecated
    @java.beans.ConstructorProperties({
        "totalEstimatedPatchingTime",
        "estimatedDbServerPatchingTime",
        "estimatedStorageServerPatchingTime",
        "estimatedNetworkSwitchesPatchingTime"
    })
    public EstimatedPatchingTime(
            Integer totalEstimatedPatchingTime,
            Integer estimatedDbServerPatchingTime,
            Integer estimatedStorageServerPatchingTime,
            Integer estimatedNetworkSwitchesPatchingTime) {
        super();
        this.totalEstimatedPatchingTime = totalEstimatedPatchingTime;
        this.estimatedDbServerPatchingTime = estimatedDbServerPatchingTime;
        this.estimatedStorageServerPatchingTime = estimatedStorageServerPatchingTime;
        this.estimatedNetworkSwitchesPatchingTime = estimatedNetworkSwitchesPatchingTime;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The estimated total time required in minutes for all patching operations.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalEstimatedPatchingTime")
        private Integer totalEstimatedPatchingTime;

        /**
         * The estimated total time required in minutes for all patching operations.
         * @param totalEstimatedPatchingTime the value to set
         * @return this builder
         **/
        public Builder totalEstimatedPatchingTime(Integer totalEstimatedPatchingTime) {
            this.totalEstimatedPatchingTime = totalEstimatedPatchingTime;
            this.__explicitlySet__.add("totalEstimatedPatchingTime");
            return this;
        }
        /**
         * The estimated time required in minutes for database server patching.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedDbServerPatchingTime")
        private Integer estimatedDbServerPatchingTime;

        /**
         * The estimated time required in minutes for database server patching.
         * @param estimatedDbServerPatchingTime the value to set
         * @return this builder
         **/
        public Builder estimatedDbServerPatchingTime(Integer estimatedDbServerPatchingTime) {
            this.estimatedDbServerPatchingTime = estimatedDbServerPatchingTime;
            this.__explicitlySet__.add("estimatedDbServerPatchingTime");
            return this;
        }
        /**
         * The estimated time required in minutes for storage server patching.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedStorageServerPatchingTime")
        private Integer estimatedStorageServerPatchingTime;

        /**
         * The estimated time required in minutes for storage server patching.
         * @param estimatedStorageServerPatchingTime the value to set
         * @return this builder
         **/
        public Builder estimatedStorageServerPatchingTime(
                Integer estimatedStorageServerPatchingTime) {
            this.estimatedStorageServerPatchingTime = estimatedStorageServerPatchingTime;
            this.__explicitlySet__.add("estimatedStorageServerPatchingTime");
            return this;
        }
        /**
         * The estimated time required in minutes for network switch patching.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedNetworkSwitchesPatchingTime")
        private Integer estimatedNetworkSwitchesPatchingTime;

        /**
         * The estimated time required in minutes for network switch patching.
         * @param estimatedNetworkSwitchesPatchingTime the value to set
         * @return this builder
         **/
        public Builder estimatedNetworkSwitchesPatchingTime(
                Integer estimatedNetworkSwitchesPatchingTime) {
            this.estimatedNetworkSwitchesPatchingTime = estimatedNetworkSwitchesPatchingTime;
            this.__explicitlySet__.add("estimatedNetworkSwitchesPatchingTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EstimatedPatchingTime build() {
            EstimatedPatchingTime __instance__ =
                    new EstimatedPatchingTime(
                            totalEstimatedPatchingTime,
                            estimatedDbServerPatchingTime,
                            estimatedStorageServerPatchingTime,
                            estimatedNetworkSwitchesPatchingTime);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EstimatedPatchingTime o) {
            Builder copiedBuilder =
                    totalEstimatedPatchingTime(o.getTotalEstimatedPatchingTime())
                            .estimatedDbServerPatchingTime(o.getEstimatedDbServerPatchingTime())
                            .estimatedStorageServerPatchingTime(
                                    o.getEstimatedStorageServerPatchingTime())
                            .estimatedNetworkSwitchesPatchingTime(
                                    o.getEstimatedNetworkSwitchesPatchingTime());

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
     * The estimated total time required in minutes for all patching operations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalEstimatedPatchingTime")
    private final Integer totalEstimatedPatchingTime;

    /**
     * The estimated total time required in minutes for all patching operations.
     * @return the value
     **/
    public Integer getTotalEstimatedPatchingTime() {
        return totalEstimatedPatchingTime;
    }

    /**
     * The estimated time required in minutes for database server patching.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedDbServerPatchingTime")
    private final Integer estimatedDbServerPatchingTime;

    /**
     * The estimated time required in minutes for database server patching.
     * @return the value
     **/
    public Integer getEstimatedDbServerPatchingTime() {
        return estimatedDbServerPatchingTime;
    }

    /**
     * The estimated time required in minutes for storage server patching.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedStorageServerPatchingTime")
    private final Integer estimatedStorageServerPatchingTime;

    /**
     * The estimated time required in minutes for storage server patching.
     * @return the value
     **/
    public Integer getEstimatedStorageServerPatchingTime() {
        return estimatedStorageServerPatchingTime;
    }

    /**
     * The estimated time required in minutes for network switch patching.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedNetworkSwitchesPatchingTime")
    private final Integer estimatedNetworkSwitchesPatchingTime;

    /**
     * The estimated time required in minutes for network switch patching.
     * @return the value
     **/
    public Integer getEstimatedNetworkSwitchesPatchingTime() {
        return estimatedNetworkSwitchesPatchingTime;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EstimatedPatchingTime(");
        sb.append("totalEstimatedPatchingTime=")
                .append(String.valueOf(this.totalEstimatedPatchingTime));
        sb.append(", estimatedDbServerPatchingTime=")
                .append(String.valueOf(this.estimatedDbServerPatchingTime));
        sb.append(", estimatedStorageServerPatchingTime=")
                .append(String.valueOf(this.estimatedStorageServerPatchingTime));
        sb.append(", estimatedNetworkSwitchesPatchingTime=")
                .append(String.valueOf(this.estimatedNetworkSwitchesPatchingTime));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EstimatedPatchingTime)) {
            return false;
        }

        EstimatedPatchingTime other = (EstimatedPatchingTime) o;
        return java.util.Objects.equals(
                        this.totalEstimatedPatchingTime, other.totalEstimatedPatchingTime)
                && java.util.Objects.equals(
                        this.estimatedDbServerPatchingTime, other.estimatedDbServerPatchingTime)
                && java.util.Objects.equals(
                        this.estimatedStorageServerPatchingTime,
                        other.estimatedStorageServerPatchingTime)
                && java.util.Objects.equals(
                        this.estimatedNetworkSwitchesPatchingTime,
                        other.estimatedNetworkSwitchesPatchingTime)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.totalEstimatedPatchingTime == null
                                ? 43
                                : this.totalEstimatedPatchingTime.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedDbServerPatchingTime == null
                                ? 43
                                : this.estimatedDbServerPatchingTime.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedStorageServerPatchingTime == null
                                ? 43
                                : this.estimatedStorageServerPatchingTime.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedNetworkSwitchesPatchingTime == null
                                ? 43
                                : this.estimatedNetworkSwitchesPatchingTime.hashCode());
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
