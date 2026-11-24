/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.batch.model;

/**
 * Compute capacity reservations used for initial fleet provisioning. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ComputeCapacityReservation.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComputeCapacityReservation extends Reservation {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Compute capacity reservation OCIDs used for initial fleet provisioning. */
        @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationIds")
        private java.util.List<String> capacityReservationIds;

        /**
         * Compute capacity reservation OCIDs used for initial fleet provisioning.
         *
         * @param capacityReservationIds the value to set
         * @return this builder
         */
        public Builder capacityReservationIds(java.util.List<String> capacityReservationIds) {
            this.capacityReservationIds = capacityReservationIds;
            this.__explicitlySet__.add("capacityReservationIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeCapacityReservation build() {
            ComputeCapacityReservation model =
                    new ComputeCapacityReservation(this.capacityReservationIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeCapacityReservation model) {
            if (model.wasPropertyExplicitlySet("capacityReservationIds")) {
                this.capacityReservationIds(model.getCapacityReservationIds());
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

    @Deprecated
    public ComputeCapacityReservation(java.util.List<String> capacityReservationIds) {
        super();
        this.capacityReservationIds = capacityReservationIds;
    }

    /** Compute capacity reservation OCIDs used for initial fleet provisioning. */
    @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationIds")
    private final java.util.List<String> capacityReservationIds;

    /**
     * Compute capacity reservation OCIDs used for initial fleet provisioning.
     *
     * @return the value
     */
    public java.util.List<String> getCapacityReservationIds() {
        return capacityReservationIds;
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
        sb.append("ComputeCapacityReservation(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", capacityReservationIds=").append(String.valueOf(this.capacityReservationIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeCapacityReservation)) {
            return false;
        }

        ComputeCapacityReservation other = (ComputeCapacityReservation) o;
        return java.util.Objects.equals(this.capacityReservationIds, other.capacityReservationIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.capacityReservationIds == null
                                ? 43
                                : this.capacityReservationIds.hashCode());
        return result;
    }
}
