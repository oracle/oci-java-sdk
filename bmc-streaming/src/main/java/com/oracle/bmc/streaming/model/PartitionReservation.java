/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming.model;

/**
 * Represents the state of a single partition reservation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PartitionReservation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PartitionReservation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** The partition for which the reservation applies. */
        @com.fasterxml.jackson.annotation.JsonProperty("partition")
        private String partition;

        /**
         * The partition for which the reservation applies.
         *
         * @param partition the value to set
         * @return this builder
         */
        public Builder partition(String partition) {
            this.partition = partition;
            this.__explicitlySet__.add("partition");
            return this;
        }
        /** The latest offset which has been committed for this partition. */
        @com.fasterxml.jackson.annotation.JsonProperty("committedOffset")
        private Long committedOffset;

        /**
         * The latest offset which has been committed for this partition.
         *
         * @param committedOffset the value to set
         * @return this builder
         */
        public Builder committedOffset(Long committedOffset) {
            this.committedOffset = committedOffset;
            this.__explicitlySet__.add("committedOffset");
            return this;
        }
        /** The consumer instance which currently has the partition reserved. */
        @com.fasterxml.jackson.annotation.JsonProperty("reservedInstance")
        private String reservedInstance;

        /**
         * The consumer instance which currently has the partition reserved.
         *
         * @param reservedInstance the value to set
         * @return this builder
         */
        public Builder reservedInstance(String reservedInstance) {
            this.reservedInstance = reservedInstance;
            this.__explicitlySet__.add("reservedInstance");
            return this;
        }
        /** A timestamp when the current reservation expires. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeReservedUntil")
        private java.util.Date timeReservedUntil;

        /**
         * A timestamp when the current reservation expires.
         *
         * @param timeReservedUntil the value to set
         * @return this builder
         */
        public Builder timeReservedUntil(java.util.Date timeReservedUntil) {
            this.timeReservedUntil = timeReservedUntil;
            this.__explicitlySet__.add("timeReservedUntil");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PartitionReservation build() {
            PartitionReservation model =
                    new PartitionReservation(
                            this.partition,
                            this.committedOffset,
                            this.reservedInstance,
                            this.timeReservedUntil);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PartitionReservation model) {
            if (model.wasPropertyExplicitlySet("partition")) {
                this.partition(model.getPartition());
            }
            if (model.wasPropertyExplicitlySet("committedOffset")) {
                this.committedOffset(model.getCommittedOffset());
            }
            if (model.wasPropertyExplicitlySet("reservedInstance")) {
                this.reservedInstance(model.getReservedInstance());
            }
            if (model.wasPropertyExplicitlySet("timeReservedUntil")) {
                this.timeReservedUntil(model.getTimeReservedUntil());
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

    /** The partition for which the reservation applies. */
    @com.fasterxml.jackson.annotation.JsonProperty("partition")
    private final String partition;

    /**
     * The partition for which the reservation applies.
     *
     * @return the value
     */
    public String getPartition() {
        return partition;
    }

    /** The latest offset which has been committed for this partition. */
    @com.fasterxml.jackson.annotation.JsonProperty("committedOffset")
    private final Long committedOffset;

    /**
     * The latest offset which has been committed for this partition.
     *
     * @return the value
     */
    public Long getCommittedOffset() {
        return committedOffset;
    }

    /** The consumer instance which currently has the partition reserved. */
    @com.fasterxml.jackson.annotation.JsonProperty("reservedInstance")
    private final String reservedInstance;

    /**
     * The consumer instance which currently has the partition reserved.
     *
     * @return the value
     */
    public String getReservedInstance() {
        return reservedInstance;
    }

    /** A timestamp when the current reservation expires. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeReservedUntil")
    private final java.util.Date timeReservedUntil;

    /**
     * A timestamp when the current reservation expires.
     *
     * @return the value
     */
    public java.util.Date getTimeReservedUntil() {
        return timeReservedUntil;
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
        sb.append("PartitionReservation(");
        sb.append("super=").append(super.toString());
        sb.append("partition=").append(String.valueOf(this.partition));
        sb.append(", committedOffset=").append(String.valueOf(this.committedOffset));
        sb.append(", reservedInstance=").append(String.valueOf(this.reservedInstance));
        sb.append(", timeReservedUntil=").append(String.valueOf(this.timeReservedUntil));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
