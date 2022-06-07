/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming.model;

/**
 * Represents the state of a single partition reservation.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PartitionReservation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PartitionReservation {
    @Deprecated
    @java.beans.ConstructorProperties({
        "partition",
        "committedOffset",
        "reservedInstance",
        "timeReservedUntil"
    })
    public PartitionReservation(
            String partition,
            Long committedOffset,
            String reservedInstance,
            java.util.Date timeReservedUntil) {
        super();
        this.partition = partition;
        this.committedOffset = committedOffset;
        this.reservedInstance = reservedInstance;
        this.timeReservedUntil = timeReservedUntil;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("partition")
        private String partition;

        public Builder partition(String partition) {
            this.partition = partition;
            this.__explicitlySet__.add("partition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("committedOffset")
        private Long committedOffset;

        public Builder committedOffset(Long committedOffset) {
            this.committedOffset = committedOffset;
            this.__explicitlySet__.add("committedOffset");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("reservedInstance")
        private String reservedInstance;

        public Builder reservedInstance(String reservedInstance) {
            this.reservedInstance = reservedInstance;
            this.__explicitlySet__.add("reservedInstance");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeReservedUntil")
        private java.util.Date timeReservedUntil;

        public Builder timeReservedUntil(java.util.Date timeReservedUntil) {
            this.timeReservedUntil = timeReservedUntil;
            this.__explicitlySet__.add("timeReservedUntil");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PartitionReservation build() {
            PartitionReservation __instance__ =
                    new PartitionReservation(
                            partition, committedOffset, reservedInstance, timeReservedUntil);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PartitionReservation o) {
            Builder copiedBuilder =
                    partition(o.getPartition())
                            .committedOffset(o.getCommittedOffset())
                            .reservedInstance(o.getReservedInstance())
                            .timeReservedUntil(o.getTimeReservedUntil());

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
     * The partition for which the reservation applies.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partition")
    private final String partition;

    public String getPartition() {
        return partition;
    }

    /**
     * The latest offset which has been committed for this partition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("committedOffset")
    private final Long committedOffset;

    public Long getCommittedOffset() {
        return committedOffset;
    }

    /**
     * The consumer instance which currently has the partition reserved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reservedInstance")
    private final String reservedInstance;

    public String getReservedInstance() {
        return reservedInstance;
    }

    /**
     * A timestamp when the current reservation expires.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeReservedUntil")
    private final java.util.Date timeReservedUntil;

    public java.util.Date getTimeReservedUntil() {
        return timeReservedUntil;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PartitionReservation(");
        sb.append("partition=").append(String.valueOf(this.partition));
        sb.append(", committedOffset=").append(String.valueOf(this.committedOffset));
        sb.append(", reservedInstance=").append(String.valueOf(this.reservedInstance));
        sb.append(", timeReservedUntil=").append(String.valueOf(this.timeReservedUntil));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PartitionReservation)) {
            return false;
        }

        PartitionReservation other = (PartitionReservation) o;
        return java.util.Objects.equals(this.partition, other.partition)
                && java.util.Objects.equals(this.committedOffset, other.committedOffset)
                && java.util.Objects.equals(this.reservedInstance, other.reservedInstance)
                && java.util.Objects.equals(this.timeReservedUntil, other.timeReservedUntil)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.partition == null ? 43 : this.partition.hashCode());
        result =
                (result * PRIME)
                        + (this.committedOffset == null ? 43 : this.committedOffset.hashCode());
        result =
                (result * PRIME)
                        + (this.reservedInstance == null ? 43 : this.reservedInstance.hashCode());
        result =
                (result * PRIME)
                        + (this.timeReservedUntil == null ? 43 : this.timeReservedUntil.hashCode());
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
