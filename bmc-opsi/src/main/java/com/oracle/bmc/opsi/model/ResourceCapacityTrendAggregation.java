/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Resource Capacity samples <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ResourceCapacityTrendAggregation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResourceCapacityTrendAggregation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "endTimestamp",
        "capacity",
        "baseCapacity",
        "totalHostCapacity"
    })
    public ResourceCapacityTrendAggregation(
            java.util.Date endTimestamp,
            Double capacity,
            Double baseCapacity,
            Double totalHostCapacity) {
        super();
        this.endTimestamp = endTimestamp;
        this.capacity = capacity;
        this.baseCapacity = baseCapacity;
        this.totalHostCapacity = totalHostCapacity;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The timestamp in which the current sampling period ends in RFC 3339 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("endTimestamp")
        private java.util.Date endTimestamp;

        /**
         * The timestamp in which the current sampling period ends in RFC 3339 format.
         *
         * @param endTimestamp the value to set
         * @return this builder
         */
        public Builder endTimestamp(java.util.Date endTimestamp) {
            this.endTimestamp = endTimestamp;
            this.__explicitlySet__.add("endTimestamp");
            return this;
        }
        /**
         * The maximum allocated amount of the resource metric type (CPU, STORAGE) for a set of
         * databases.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("capacity")
        private Double capacity;

        /**
         * The maximum allocated amount of the resource metric type (CPU, STORAGE) for a set of
         * databases.
         *
         * @param capacity the value to set
         * @return this builder
         */
        public Builder capacity(Double capacity) {
            this.capacity = capacity;
            this.__explicitlySet__.add("capacity");
            return this;
        }
        /**
         * The base allocated amount of the resource metric type (CPU, STORAGE) for a set of
         * databases.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("baseCapacity")
        private Double baseCapacity;

        /**
         * The base allocated amount of the resource metric type (CPU, STORAGE) for a set of
         * databases.
         *
         * @param baseCapacity the value to set
         * @return this builder
         */
        public Builder baseCapacity(Double baseCapacity) {
            this.baseCapacity = baseCapacity;
            this.__explicitlySet__.add("baseCapacity");
            return this;
        }
        /**
         * The maximum host CPUs (cores x threads/core) on the underlying infrastructure. This only
         * applies to CPU and does not not apply for Autonomous Databases.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("totalHostCapacity")
        private Double totalHostCapacity;

        /**
         * The maximum host CPUs (cores x threads/core) on the underlying infrastructure. This only
         * applies to CPU and does not not apply for Autonomous Databases.
         *
         * @param totalHostCapacity the value to set
         * @return this builder
         */
        public Builder totalHostCapacity(Double totalHostCapacity) {
            this.totalHostCapacity = totalHostCapacity;
            this.__explicitlySet__.add("totalHostCapacity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceCapacityTrendAggregation build() {
            ResourceCapacityTrendAggregation model =
                    new ResourceCapacityTrendAggregation(
                            this.endTimestamp,
                            this.capacity,
                            this.baseCapacity,
                            this.totalHostCapacity);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceCapacityTrendAggregation model) {
            if (model.wasPropertyExplicitlySet("endTimestamp")) {
                this.endTimestamp(model.getEndTimestamp());
            }
            if (model.wasPropertyExplicitlySet("capacity")) {
                this.capacity(model.getCapacity());
            }
            if (model.wasPropertyExplicitlySet("baseCapacity")) {
                this.baseCapacity(model.getBaseCapacity());
            }
            if (model.wasPropertyExplicitlySet("totalHostCapacity")) {
                this.totalHostCapacity(model.getTotalHostCapacity());
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

    /** The timestamp in which the current sampling period ends in RFC 3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("endTimestamp")
    private final java.util.Date endTimestamp;

    /**
     * The timestamp in which the current sampling period ends in RFC 3339 format.
     *
     * @return the value
     */
    public java.util.Date getEndTimestamp() {
        return endTimestamp;
    }

    /**
     * The maximum allocated amount of the resource metric type (CPU, STORAGE) for a set of
     * databases.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("capacity")
    private final Double capacity;

    /**
     * The maximum allocated amount of the resource metric type (CPU, STORAGE) for a set of
     * databases.
     *
     * @return the value
     */
    public Double getCapacity() {
        return capacity;
    }

    /**
     * The base allocated amount of the resource metric type (CPU, STORAGE) for a set of databases.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("baseCapacity")
    private final Double baseCapacity;

    /**
     * The base allocated amount of the resource metric type (CPU, STORAGE) for a set of databases.
     *
     * @return the value
     */
    public Double getBaseCapacity() {
        return baseCapacity;
    }

    /**
     * The maximum host CPUs (cores x threads/core) on the underlying infrastructure. This only
     * applies to CPU and does not not apply for Autonomous Databases.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("totalHostCapacity")
    private final Double totalHostCapacity;

    /**
     * The maximum host CPUs (cores x threads/core) on the underlying infrastructure. This only
     * applies to CPU and does not not apply for Autonomous Databases.
     *
     * @return the value
     */
    public Double getTotalHostCapacity() {
        return totalHostCapacity;
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
        sb.append("ResourceCapacityTrendAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("endTimestamp=").append(String.valueOf(this.endTimestamp));
        sb.append(", capacity=").append(String.valueOf(this.capacity));
        sb.append(", baseCapacity=").append(String.valueOf(this.baseCapacity));
        sb.append(", totalHostCapacity=").append(String.valueOf(this.totalHostCapacity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceCapacityTrendAggregation)) {
            return false;
        }

        ResourceCapacityTrendAggregation other = (ResourceCapacityTrendAggregation) o;
        return java.util.Objects.equals(this.endTimestamp, other.endTimestamp)
                && java.util.Objects.equals(this.capacity, other.capacity)
                && java.util.Objects.equals(this.baseCapacity, other.baseCapacity)
                && java.util.Objects.equals(this.totalHostCapacity, other.totalHostCapacity)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.endTimestamp == null ? 43 : this.endTimestamp.hashCode());
        result = (result * PRIME) + (this.capacity == null ? 43 : this.capacity.hashCode());
        result = (result * PRIME) + (this.baseCapacity == null ? 43 : this.baseCapacity.hashCode());
        result =
                (result * PRIME)
                        + (this.totalHostCapacity == null ? 43 : this.totalHostCapacity.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
