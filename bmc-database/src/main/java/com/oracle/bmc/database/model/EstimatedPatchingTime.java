/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The estimated total time required in minutes for all patching operations (database server,
 * storage server, and network switch patching). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = EstimatedPatchingTime.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EstimatedPatchingTime
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** The estimated total time required in minutes for all patching operations. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalEstimatedPatchingTime")
        private Integer totalEstimatedPatchingTime;

        /**
         * The estimated total time required in minutes for all patching operations.
         *
         * @param totalEstimatedPatchingTime the value to set
         * @return this builder
         */
        public Builder totalEstimatedPatchingTime(Integer totalEstimatedPatchingTime) {
            this.totalEstimatedPatchingTime = totalEstimatedPatchingTime;
            this.__explicitlySet__.add("totalEstimatedPatchingTime");
            return this;
        }
        /** The estimated time required in minutes for database server patching. */
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedDbServerPatchingTime")
        private Integer estimatedDbServerPatchingTime;

        /**
         * The estimated time required in minutes for database server patching.
         *
         * @param estimatedDbServerPatchingTime the value to set
         * @return this builder
         */
        public Builder estimatedDbServerPatchingTime(Integer estimatedDbServerPatchingTime) {
            this.estimatedDbServerPatchingTime = estimatedDbServerPatchingTime;
            this.__explicitlySet__.add("estimatedDbServerPatchingTime");
            return this;
        }
        /** The estimated time required in minutes for storage server patching. */
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedStorageServerPatchingTime")
        private Integer estimatedStorageServerPatchingTime;

        /**
         * The estimated time required in minutes for storage server patching.
         *
         * @param estimatedStorageServerPatchingTime the value to set
         * @return this builder
         */
        public Builder estimatedStorageServerPatchingTime(
                Integer estimatedStorageServerPatchingTime) {
            this.estimatedStorageServerPatchingTime = estimatedStorageServerPatchingTime;
            this.__explicitlySet__.add("estimatedStorageServerPatchingTime");
            return this;
        }
        /** The estimated time required in minutes for network switch patching. */
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedNetworkSwitchesPatchingTime")
        private Integer estimatedNetworkSwitchesPatchingTime;

        /**
         * The estimated time required in minutes for network switch patching.
         *
         * @param estimatedNetworkSwitchesPatchingTime the value to set
         * @return this builder
         */
        public Builder estimatedNetworkSwitchesPatchingTime(
                Integer estimatedNetworkSwitchesPatchingTime) {
            this.estimatedNetworkSwitchesPatchingTime = estimatedNetworkSwitchesPatchingTime;
            this.__explicitlySet__.add("estimatedNetworkSwitchesPatchingTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EstimatedPatchingTime build() {
            EstimatedPatchingTime model =
                    new EstimatedPatchingTime(
                            this.totalEstimatedPatchingTime,
                            this.estimatedDbServerPatchingTime,
                            this.estimatedStorageServerPatchingTime,
                            this.estimatedNetworkSwitchesPatchingTime);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EstimatedPatchingTime model) {
            if (model.wasPropertyExplicitlySet("totalEstimatedPatchingTime")) {
                this.totalEstimatedPatchingTime(model.getTotalEstimatedPatchingTime());
            }
            if (model.wasPropertyExplicitlySet("estimatedDbServerPatchingTime")) {
                this.estimatedDbServerPatchingTime(model.getEstimatedDbServerPatchingTime());
            }
            if (model.wasPropertyExplicitlySet("estimatedStorageServerPatchingTime")) {
                this.estimatedStorageServerPatchingTime(
                        model.getEstimatedStorageServerPatchingTime());
            }
            if (model.wasPropertyExplicitlySet("estimatedNetworkSwitchesPatchingTime")) {
                this.estimatedNetworkSwitchesPatchingTime(
                        model.getEstimatedNetworkSwitchesPatchingTime());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The estimated total time required in minutes for all patching operations. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalEstimatedPatchingTime")
    private final Integer totalEstimatedPatchingTime;

    /**
     * The estimated total time required in minutes for all patching operations.
     *
     * @return the value
     */
    public Integer getTotalEstimatedPatchingTime() {
        return totalEstimatedPatchingTime;
    }

    /** The estimated time required in minutes for database server patching. */
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedDbServerPatchingTime")
    private final Integer estimatedDbServerPatchingTime;

    /**
     * The estimated time required in minutes for database server patching.
     *
     * @return the value
     */
    public Integer getEstimatedDbServerPatchingTime() {
        return estimatedDbServerPatchingTime;
    }

    /** The estimated time required in minutes for storage server patching. */
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedStorageServerPatchingTime")
    private final Integer estimatedStorageServerPatchingTime;

    /**
     * The estimated time required in minutes for storage server patching.
     *
     * @return the value
     */
    public Integer getEstimatedStorageServerPatchingTime() {
        return estimatedStorageServerPatchingTime;
    }

    /** The estimated time required in minutes for network switch patching. */
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedNetworkSwitchesPatchingTime")
    private final Integer estimatedNetworkSwitchesPatchingTime;

    /**
     * The estimated time required in minutes for network switch patching.
     *
     * @return the value
     */
    public Integer getEstimatedNetworkSwitchesPatchingTime() {
        return estimatedNetworkSwitchesPatchingTime;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EstimatedPatchingTime(");
        sb.append("super=").append(super.toString());
        sb.append("totalEstimatedPatchingTime=")
                .append(String.valueOf(this.totalEstimatedPatchingTime));
        sb.append(", estimatedDbServerPatchingTime=")
                .append(String.valueOf(this.estimatedDbServerPatchingTime));
        sb.append(", estimatedStorageServerPatchingTime=")
                .append(String.valueOf(this.estimatedStorageServerPatchingTime));
        sb.append(", estimatedNetworkSwitchesPatchingTime=")
                .append(String.valueOf(this.estimatedNetworkSwitchesPatchingTime));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
