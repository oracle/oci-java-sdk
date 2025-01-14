/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Aggregated data per disk. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DiskStatistics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DiskStatistics
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "diskName",
        "diskUnallocatedInGBs",
        "diskUsageInGBs",
        "diskSizeInGBs"
    })
    public DiskStatistics(
            String diskName,
            Double diskUnallocatedInGBs,
            Double diskUsageInGBs,
            Double diskSizeInGBs) {
        super();
        this.diskName = diskName;
        this.diskUnallocatedInGBs = diskUnallocatedInGBs;
        this.diskUsageInGBs = diskUsageInGBs;
        this.diskSizeInGBs = diskSizeInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the disk. */
        @com.fasterxml.jackson.annotation.JsonProperty("diskName")
        private String diskName;

        /**
         * Name of the disk.
         *
         * @param diskName the value to set
         * @return this builder
         */
        public Builder diskName(String diskName) {
            this.diskName = diskName;
            this.__explicitlySet__.add("diskName");
            return this;
        }
        /** Value for unallocated space in a disk. */
        @com.fasterxml.jackson.annotation.JsonProperty("diskUnallocatedInGBs")
        private Double diskUnallocatedInGBs;

        /**
         * Value for unallocated space in a disk.
         *
         * @param diskUnallocatedInGBs the value to set
         * @return this builder
         */
        public Builder diskUnallocatedInGBs(Double diskUnallocatedInGBs) {
            this.diskUnallocatedInGBs = diskUnallocatedInGBs;
            this.__explicitlySet__.add("diskUnallocatedInGBs");
            return this;
        }
        /** Disk usage. */
        @com.fasterxml.jackson.annotation.JsonProperty("diskUsageInGBs")
        private Double diskUsageInGBs;

        /**
         * Disk usage.
         *
         * @param diskUsageInGBs the value to set
         * @return this builder
         */
        public Builder diskUsageInGBs(Double diskUsageInGBs) {
            this.diskUsageInGBs = diskUsageInGBs;
            this.__explicitlySet__.add("diskUsageInGBs");
            return this;
        }
        /** Size of the disk. */
        @com.fasterxml.jackson.annotation.JsonProperty("diskSizeInGBs")
        private Double diskSizeInGBs;

        /**
         * Size of the disk.
         *
         * @param diskSizeInGBs the value to set
         * @return this builder
         */
        public Builder diskSizeInGBs(Double diskSizeInGBs) {
            this.diskSizeInGBs = diskSizeInGBs;
            this.__explicitlySet__.add("diskSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiskStatistics build() {
            DiskStatistics model =
                    new DiskStatistics(
                            this.diskName,
                            this.diskUnallocatedInGBs,
                            this.diskUsageInGBs,
                            this.diskSizeInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiskStatistics model) {
            if (model.wasPropertyExplicitlySet("diskName")) {
                this.diskName(model.getDiskName());
            }
            if (model.wasPropertyExplicitlySet("diskUnallocatedInGBs")) {
                this.diskUnallocatedInGBs(model.getDiskUnallocatedInGBs());
            }
            if (model.wasPropertyExplicitlySet("diskUsageInGBs")) {
                this.diskUsageInGBs(model.getDiskUsageInGBs());
            }
            if (model.wasPropertyExplicitlySet("diskSizeInGBs")) {
                this.diskSizeInGBs(model.getDiskSizeInGBs());
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

    /** Name of the disk. */
    @com.fasterxml.jackson.annotation.JsonProperty("diskName")
    private final String diskName;

    /**
     * Name of the disk.
     *
     * @return the value
     */
    public String getDiskName() {
        return diskName;
    }

    /** Value for unallocated space in a disk. */
    @com.fasterxml.jackson.annotation.JsonProperty("diskUnallocatedInGBs")
    private final Double diskUnallocatedInGBs;

    /**
     * Value for unallocated space in a disk.
     *
     * @return the value
     */
    public Double getDiskUnallocatedInGBs() {
        return diskUnallocatedInGBs;
    }

    /** Disk usage. */
    @com.fasterxml.jackson.annotation.JsonProperty("diskUsageInGBs")
    private final Double diskUsageInGBs;

    /**
     * Disk usage.
     *
     * @return the value
     */
    public Double getDiskUsageInGBs() {
        return diskUsageInGBs;
    }

    /** Size of the disk. */
    @com.fasterxml.jackson.annotation.JsonProperty("diskSizeInGBs")
    private final Double diskSizeInGBs;

    /**
     * Size of the disk.
     *
     * @return the value
     */
    public Double getDiskSizeInGBs() {
        return diskSizeInGBs;
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
        sb.append("DiskStatistics(");
        sb.append("super=").append(super.toString());
        sb.append("diskName=").append(String.valueOf(this.diskName));
        sb.append(", diskUnallocatedInGBs=").append(String.valueOf(this.diskUnallocatedInGBs));
        sb.append(", diskUsageInGBs=").append(String.valueOf(this.diskUsageInGBs));
        sb.append(", diskSizeInGBs=").append(String.valueOf(this.diskSizeInGBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiskStatistics)) {
            return false;
        }

        DiskStatistics other = (DiskStatistics) o;
        return java.util.Objects.equals(this.diskName, other.diskName)
                && java.util.Objects.equals(this.diskUnallocatedInGBs, other.diskUnallocatedInGBs)
                && java.util.Objects.equals(this.diskUsageInGBs, other.diskUsageInGBs)
                && java.util.Objects.equals(this.diskSizeInGBs, other.diskSizeInGBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.diskName == null ? 43 : this.diskName.hashCode());
        result =
                (result * PRIME)
                        + (this.diskUnallocatedInGBs == null
                                ? 43
                                : this.diskUnallocatedInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.diskUsageInGBs == null ? 43 : this.diskUsageInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.diskSizeInGBs == null ? 43 : this.diskSizeInGBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
