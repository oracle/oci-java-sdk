/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.model;

/**
 * Capacity details of the Storage disk group. <br>
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
        builder = StorageCapacityDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class StorageCapacityDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "storageDiskRedundancy",
        "diskGroup",
        "phyTotalSpaceInGBs",
        "phyReservedSpaceInGBs",
        "phyFreeSpaceInGBs",
        "logicalFreeSpaceInGBs"
    })
    public StorageCapacityDetails(
            StorageDiskRedundancy storageDiskRedundancy,
            String diskGroup,
            Long phyTotalSpaceInGBs,
            Long phyReservedSpaceInGBs,
            Long phyFreeSpaceInGBs,
            Long logicalFreeSpaceInGBs) {
        super();
        this.storageDiskRedundancy = storageDiskRedundancy;
        this.diskGroup = diskGroup;
        this.phyTotalSpaceInGBs = phyTotalSpaceInGBs;
        this.phyReservedSpaceInGBs = phyReservedSpaceInGBs;
        this.phyFreeSpaceInGBs = phyFreeSpaceInGBs;
        this.logicalFreeSpaceInGBs = logicalFreeSpaceInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Disk redundancy for Database Infrastructure storage. */
        @com.fasterxml.jackson.annotation.JsonProperty("storageDiskRedundancy")
        private StorageDiskRedundancy storageDiskRedundancy;

        /**
         * The Disk redundancy for Database Infrastructure storage.
         *
         * @param storageDiskRedundancy the value to set
         * @return this builder
         */
        public Builder storageDiskRedundancy(StorageDiskRedundancy storageDiskRedundancy) {
            this.storageDiskRedundancy = storageDiskRedundancy;
            this.__explicitlySet__.add("storageDiskRedundancy");
            return this;
        }
        /** Disk group name. */
        @com.fasterxml.jackson.annotation.JsonProperty("diskGroup")
        private String diskGroup;

        /**
         * Disk group name.
         *
         * @param diskGroup the value to set
         * @return this builder
         */
        public Builder diskGroup(String diskGroup) {
            this.diskGroup = diskGroup;
            this.__explicitlySet__.add("diskGroup");
            return this;
        }
        /** The total amount of physical disk space available in a disk group, in gigabytes (GB). */
        @com.fasterxml.jackson.annotation.JsonProperty("phyTotalSpaceInGBs")
        private Long phyTotalSpaceInGBs;

        /**
         * The total amount of physical disk space available in a disk group, in gigabytes (GB).
         *
         * @param phyTotalSpaceInGBs the value to set
         * @return this builder
         */
        public Builder phyTotalSpaceInGBs(Long phyTotalSpaceInGBs) {
            this.phyTotalSpaceInGBs = phyTotalSpaceInGBs;
            this.__explicitlySet__.add("phyTotalSpaceInGBs");
            return this;
        }
        /**
         * The total amount of physical disk space that is reserved for system use in a disk group,
         * in gigabytes (GB).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("phyReservedSpaceInGBs")
        private Long phyReservedSpaceInGBs;

        /**
         * The total amount of physical disk space that is reserved for system use in a disk group,
         * in gigabytes (GB).
         *
         * @param phyReservedSpaceInGBs the value to set
         * @return this builder
         */
        public Builder phyReservedSpaceInGBs(Long phyReservedSpaceInGBs) {
            this.phyReservedSpaceInGBs = phyReservedSpaceInGBs;
            this.__explicitlySet__.add("phyReservedSpaceInGBs");
            return this;
        }
        /**
         * The total amount of physical disk space that is currently available for use in a disk
         * group, in gigabytes (GB).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("phyFreeSpaceInGBs")
        private Long phyFreeSpaceInGBs;

        /**
         * The total amount of physical disk space that is currently available for use in a disk
         * group, in gigabytes (GB).
         *
         * @param phyFreeSpaceInGBs the value to set
         * @return this builder
         */
        public Builder phyFreeSpaceInGBs(Long phyFreeSpaceInGBs) {
            this.phyFreeSpaceInGBs = phyFreeSpaceInGBs;
            this.__explicitlySet__.add("phyFreeSpaceInGBs");
            return this;
        }
        /**
         * The total amount of logical disk space that is currently available for use in a disk
         * group, in gigabytes (GB).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logicalFreeSpaceInGBs")
        private Long logicalFreeSpaceInGBs;

        /**
         * The total amount of logical disk space that is currently available for use in a disk
         * group, in gigabytes (GB).
         *
         * @param logicalFreeSpaceInGBs the value to set
         * @return this builder
         */
        public Builder logicalFreeSpaceInGBs(Long logicalFreeSpaceInGBs) {
            this.logicalFreeSpaceInGBs = logicalFreeSpaceInGBs;
            this.__explicitlySet__.add("logicalFreeSpaceInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StorageCapacityDetails build() {
            StorageCapacityDetails model =
                    new StorageCapacityDetails(
                            this.storageDiskRedundancy,
                            this.diskGroup,
                            this.phyTotalSpaceInGBs,
                            this.phyReservedSpaceInGBs,
                            this.phyFreeSpaceInGBs,
                            this.logicalFreeSpaceInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StorageCapacityDetails model) {
            if (model.wasPropertyExplicitlySet("storageDiskRedundancy")) {
                this.storageDiskRedundancy(model.getStorageDiskRedundancy());
            }
            if (model.wasPropertyExplicitlySet("diskGroup")) {
                this.diskGroup(model.getDiskGroup());
            }
            if (model.wasPropertyExplicitlySet("phyTotalSpaceInGBs")) {
                this.phyTotalSpaceInGBs(model.getPhyTotalSpaceInGBs());
            }
            if (model.wasPropertyExplicitlySet("phyReservedSpaceInGBs")) {
                this.phyReservedSpaceInGBs(model.getPhyReservedSpaceInGBs());
            }
            if (model.wasPropertyExplicitlySet("phyFreeSpaceInGBs")) {
                this.phyFreeSpaceInGBs(model.getPhyFreeSpaceInGBs());
            }
            if (model.wasPropertyExplicitlySet("logicalFreeSpaceInGBs")) {
                this.logicalFreeSpaceInGBs(model.getLogicalFreeSpaceInGBs());
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

    /** The Disk redundancy for Database Infrastructure storage. */
    @com.fasterxml.jackson.annotation.JsonProperty("storageDiskRedundancy")
    private final StorageDiskRedundancy storageDiskRedundancy;

    /**
     * The Disk redundancy for Database Infrastructure storage.
     *
     * @return the value
     */
    public StorageDiskRedundancy getStorageDiskRedundancy() {
        return storageDiskRedundancy;
    }

    /** Disk group name. */
    @com.fasterxml.jackson.annotation.JsonProperty("diskGroup")
    private final String diskGroup;

    /**
     * Disk group name.
     *
     * @return the value
     */
    public String getDiskGroup() {
        return diskGroup;
    }

    /** The total amount of physical disk space available in a disk group, in gigabytes (GB). */
    @com.fasterxml.jackson.annotation.JsonProperty("phyTotalSpaceInGBs")
    private final Long phyTotalSpaceInGBs;

    /**
     * The total amount of physical disk space available in a disk group, in gigabytes (GB).
     *
     * @return the value
     */
    public Long getPhyTotalSpaceInGBs() {
        return phyTotalSpaceInGBs;
    }

    /**
     * The total amount of physical disk space that is reserved for system use in a disk group, in
     * gigabytes (GB).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phyReservedSpaceInGBs")
    private final Long phyReservedSpaceInGBs;

    /**
     * The total amount of physical disk space that is reserved for system use in a disk group, in
     * gigabytes (GB).
     *
     * @return the value
     */
    public Long getPhyReservedSpaceInGBs() {
        return phyReservedSpaceInGBs;
    }

    /**
     * The total amount of physical disk space that is currently available for use in a disk group,
     * in gigabytes (GB).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phyFreeSpaceInGBs")
    private final Long phyFreeSpaceInGBs;

    /**
     * The total amount of physical disk space that is currently available for use in a disk group,
     * in gigabytes (GB).
     *
     * @return the value
     */
    public Long getPhyFreeSpaceInGBs() {
        return phyFreeSpaceInGBs;
    }

    /**
     * The total amount of logical disk space that is currently available for use in a disk group,
     * in gigabytes (GB).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logicalFreeSpaceInGBs")
    private final Long logicalFreeSpaceInGBs;

    /**
     * The total amount of logical disk space that is currently available for use in a disk group,
     * in gigabytes (GB).
     *
     * @return the value
     */
    public Long getLogicalFreeSpaceInGBs() {
        return logicalFreeSpaceInGBs;
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
        sb.append("StorageCapacityDetails(");
        sb.append("super=").append(super.toString());
        sb.append("storageDiskRedundancy=").append(String.valueOf(this.storageDiskRedundancy));
        sb.append(", diskGroup=").append(String.valueOf(this.diskGroup));
        sb.append(", phyTotalSpaceInGBs=").append(String.valueOf(this.phyTotalSpaceInGBs));
        sb.append(", phyReservedSpaceInGBs=").append(String.valueOf(this.phyReservedSpaceInGBs));
        sb.append(", phyFreeSpaceInGBs=").append(String.valueOf(this.phyFreeSpaceInGBs));
        sb.append(", logicalFreeSpaceInGBs=").append(String.valueOf(this.logicalFreeSpaceInGBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StorageCapacityDetails)) {
            return false;
        }

        StorageCapacityDetails other = (StorageCapacityDetails) o;
        return java.util.Objects.equals(this.storageDiskRedundancy, other.storageDiskRedundancy)
                && java.util.Objects.equals(this.diskGroup, other.diskGroup)
                && java.util.Objects.equals(this.phyTotalSpaceInGBs, other.phyTotalSpaceInGBs)
                && java.util.Objects.equals(this.phyReservedSpaceInGBs, other.phyReservedSpaceInGBs)
                && java.util.Objects.equals(this.phyFreeSpaceInGBs, other.phyFreeSpaceInGBs)
                && java.util.Objects.equals(this.logicalFreeSpaceInGBs, other.logicalFreeSpaceInGBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.storageDiskRedundancy == null
                                ? 43
                                : this.storageDiskRedundancy.hashCode());
        result = (result * PRIME) + (this.diskGroup == null ? 43 : this.diskGroup.hashCode());
        result =
                (result * PRIME)
                        + (this.phyTotalSpaceInGBs == null
                                ? 43
                                : this.phyTotalSpaceInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.phyReservedSpaceInGBs == null
                                ? 43
                                : this.phyReservedSpaceInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.phyFreeSpaceInGBs == null ? 43 : this.phyFreeSpaceInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.logicalFreeSpaceInGBs == null
                                ? 43
                                : this.logicalFreeSpaceInGBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
