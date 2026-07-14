/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.model;

/**
 * Capacity details of the storage disk group. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DiskGroupCapacityDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DiskGroupCapacityDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "storageType",
        "totalSpaceInGbs",
        "reservedSpaceInGbs",
        "freeSpaceInGbs"
    })
    public DiskGroupCapacityDetails(
            String storageType,
            Double totalSpaceInGbs,
            Double reservedSpaceInGbs,
            Double freeSpaceInGbs) {
        super();
        this.storageType = storageType;
        this.totalSpaceInGbs = totalSpaceInGbs;
        this.reservedSpaceInGbs = reservedSpaceInGbs;
        this.freeSpaceInGbs = freeSpaceInGbs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The storage type for the Cloud Database Infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("storageType")
        private String storageType;

        /**
         * The storage type for the Cloud Database Infrastructure.
         *
         * @param storageType the value to set
         * @return this builder
         */
        public Builder storageType(String storageType) {
            this.storageType = storageType;
            this.__explicitlySet__.add("storageType");
            return this;
        }
        /** The total amount of logical disk space available, in gigabytes (GB). */
        @com.fasterxml.jackson.annotation.JsonProperty("totalSpaceInGbs")
        private Double totalSpaceInGbs;

        /**
         * The total amount of logical disk space available, in gigabytes (GB).
         *
         * @param totalSpaceInGbs the value to set
         * @return this builder
         */
        public Builder totalSpaceInGbs(Double totalSpaceInGbs) {
            this.totalSpaceInGbs = totalSpaceInGbs;
            this.__explicitlySet__.add("totalSpaceInGbs");
            return this;
        }
        /**
         * The total amount of logical disk space that is reserved for system use, in gigabytes
         * (GB).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("reservedSpaceInGbs")
        private Double reservedSpaceInGbs;

        /**
         * The total amount of logical disk space that is reserved for system use, in gigabytes
         * (GB).
         *
         * @param reservedSpaceInGbs the value to set
         * @return this builder
         */
        public Builder reservedSpaceInGbs(Double reservedSpaceInGbs) {
            this.reservedSpaceInGbs = reservedSpaceInGbs;
            this.__explicitlySet__.add("reservedSpaceInGbs");
            return this;
        }
        /**
         * The total amount of logical disk space that is currently available for use, in gigabytes
         * (GB).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeSpaceInGbs")
        private Double freeSpaceInGbs;

        /**
         * The total amount of logical disk space that is currently available for use, in gigabytes
         * (GB).
         *
         * @param freeSpaceInGbs the value to set
         * @return this builder
         */
        public Builder freeSpaceInGbs(Double freeSpaceInGbs) {
            this.freeSpaceInGbs = freeSpaceInGbs;
            this.__explicitlySet__.add("freeSpaceInGbs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiskGroupCapacityDetails build() {
            DiskGroupCapacityDetails model =
                    new DiskGroupCapacityDetails(
                            this.storageType,
                            this.totalSpaceInGbs,
                            this.reservedSpaceInGbs,
                            this.freeSpaceInGbs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiskGroupCapacityDetails model) {
            if (model.wasPropertyExplicitlySet("storageType")) {
                this.storageType(model.getStorageType());
            }
            if (model.wasPropertyExplicitlySet("totalSpaceInGbs")) {
                this.totalSpaceInGbs(model.getTotalSpaceInGbs());
            }
            if (model.wasPropertyExplicitlySet("reservedSpaceInGbs")) {
                this.reservedSpaceInGbs(model.getReservedSpaceInGbs());
            }
            if (model.wasPropertyExplicitlySet("freeSpaceInGbs")) {
                this.freeSpaceInGbs(model.getFreeSpaceInGbs());
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

    /** The storage type for the Cloud Database Infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("storageType")
    private final String storageType;

    /**
     * The storage type for the Cloud Database Infrastructure.
     *
     * @return the value
     */
    public String getStorageType() {
        return storageType;
    }

    /** The total amount of logical disk space available, in gigabytes (GB). */
    @com.fasterxml.jackson.annotation.JsonProperty("totalSpaceInGbs")
    private final Double totalSpaceInGbs;

    /**
     * The total amount of logical disk space available, in gigabytes (GB).
     *
     * @return the value
     */
    public Double getTotalSpaceInGbs() {
        return totalSpaceInGbs;
    }

    /**
     * The total amount of logical disk space that is reserved for system use, in gigabytes (GB).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reservedSpaceInGbs")
    private final Double reservedSpaceInGbs;

    /**
     * The total amount of logical disk space that is reserved for system use, in gigabytes (GB).
     *
     * @return the value
     */
    public Double getReservedSpaceInGbs() {
        return reservedSpaceInGbs;
    }

    /**
     * The total amount of logical disk space that is currently available for use, in gigabytes
     * (GB).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeSpaceInGbs")
    private final Double freeSpaceInGbs;

    /**
     * The total amount of logical disk space that is currently available for use, in gigabytes
     * (GB).
     *
     * @return the value
     */
    public Double getFreeSpaceInGbs() {
        return freeSpaceInGbs;
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
        sb.append("DiskGroupCapacityDetails(");
        sb.append("super=").append(super.toString());
        sb.append("storageType=").append(String.valueOf(this.storageType));
        sb.append(", totalSpaceInGbs=").append(String.valueOf(this.totalSpaceInGbs));
        sb.append(", reservedSpaceInGbs=").append(String.valueOf(this.reservedSpaceInGbs));
        sb.append(", freeSpaceInGbs=").append(String.valueOf(this.freeSpaceInGbs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiskGroupCapacityDetails)) {
            return false;
        }

        DiskGroupCapacityDetails other = (DiskGroupCapacityDetails) o;
        return java.util.Objects.equals(this.storageType, other.storageType)
                && java.util.Objects.equals(this.totalSpaceInGbs, other.totalSpaceInGbs)
                && java.util.Objects.equals(this.reservedSpaceInGbs, other.reservedSpaceInGbs)
                && java.util.Objects.equals(this.freeSpaceInGbs, other.freeSpaceInGbs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.storageType == null ? 43 : this.storageType.hashCode());
        result =
                (result * PRIME)
                        + (this.totalSpaceInGbs == null ? 43 : this.totalSpaceInGbs.hashCode());
        result =
                (result * PRIME)
                        + (this.reservedSpaceInGbs == null
                                ? 43
                                : this.reservedSpaceInGbs.hashCode());
        result =
                (result * PRIME)
                        + (this.freeSpaceInGbs == null ? 43 : this.freeSpaceInGbs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
