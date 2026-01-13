/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Aggregation of FleetErrors <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FleetErrorAggregation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FleetErrorAggregation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"reason", "count"})
    public FleetErrorAggregation(FleetErrorReason reason, Integer count) {
        super();
        this.reason = reason;
        this.count = count;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Enum that uniquely identifies the fleet error. */
        @com.fasterxml.jackson.annotation.JsonProperty("reason")
        private FleetErrorReason reason;

        /**
         * Enum that uniquely identifies the fleet error.
         *
         * @param reason the value to set
         * @return this builder
         */
        public Builder reason(FleetErrorReason reason) {
            this.reason = reason;
            this.__explicitlySet__.add("reason");
            return this;
        }
        /** Number of FleetErrors encountered for the specific reason. */
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Integer count;

        /**
         * Number of FleetErrors encountered for the specific reason.
         *
         * @param count the value to set
         * @return this builder
         */
        public Builder count(Integer count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FleetErrorAggregation build() {
            FleetErrorAggregation model = new FleetErrorAggregation(this.reason, this.count);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FleetErrorAggregation model) {
            if (model.wasPropertyExplicitlySet("reason")) {
                this.reason(model.getReason());
            }
            if (model.wasPropertyExplicitlySet("count")) {
                this.count(model.getCount());
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

    /** Enum that uniquely identifies the fleet error. */
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    private final FleetErrorReason reason;

    /**
     * Enum that uniquely identifies the fleet error.
     *
     * @return the value
     */
    public FleetErrorReason getReason() {
        return reason;
    }

    /** Number of FleetErrors encountered for the specific reason. */
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Integer count;

    /**
     * Number of FleetErrors encountered for the specific reason.
     *
     * @return the value
     */
    public Integer getCount() {
        return count;
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
        sb.append("FleetErrorAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("reason=").append(String.valueOf(this.reason));
        sb.append(", count=").append(String.valueOf(this.count));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FleetErrorAggregation)) {
            return false;
        }

        FleetErrorAggregation other = (FleetErrorAggregation) o;
        return java.util.Objects.equals(this.reason, other.reason)
                && java.util.Objects.equals(this.count, other.count)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.reason == null ? 43 : this.reason.hashCode());
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
