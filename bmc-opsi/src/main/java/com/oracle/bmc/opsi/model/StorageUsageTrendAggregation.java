/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Usage data per filesystem.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = StorageUsageTrendAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StorageUsageTrendAggregation
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "fileSystemName",
        "mountPoint",
        "fileSystemSizeInGBs",
        "usageData"
    })
    public StorageUsageTrendAggregation(
            String fileSystemName,
            String mountPoint,
            Double fileSystemSizeInGBs,
            java.util.List<StorageUsageTrend> usageData) {
        super();
        this.fileSystemName = fileSystemName;
        this.mountPoint = mountPoint;
        this.fileSystemSizeInGBs = fileSystemSizeInGBs;
        this.usageData = usageData;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of filesystem.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fileSystemName")
        private String fileSystemName;

        /**
         * Name of filesystem.
         * @param fileSystemName the value to set
         * @return this builder
         **/
        public Builder fileSystemName(String fileSystemName) {
            this.fileSystemName = fileSystemName;
            this.__explicitlySet__.add("fileSystemName");
            return this;
        }
        /**
         * Mount points are specialized NTFS filesystem objects.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mountPoint")
        private String mountPoint;

        /**
         * Mount points are specialized NTFS filesystem objects.
         * @param mountPoint the value to set
         * @return this builder
         **/
        public Builder mountPoint(String mountPoint) {
            this.mountPoint = mountPoint;
            this.__explicitlySet__.add("mountPoint");
            return this;
        }
        /**
         * Size of filesystem.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fileSystemSizeInGBs")
        private Double fileSystemSizeInGBs;

        /**
         * Size of filesystem.
         * @param fileSystemSizeInGBs the value to set
         * @return this builder
         **/
        public Builder fileSystemSizeInGBs(Double fileSystemSizeInGBs) {
            this.fileSystemSizeInGBs = fileSystemSizeInGBs;
            this.__explicitlySet__.add("fileSystemSizeInGBs");
            return this;
        }
        /**
         * List of usage data samples for a filesystem.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usageData")
        private java.util.List<StorageUsageTrend> usageData;

        /**
         * List of usage data samples for a filesystem.
         * @param usageData the value to set
         * @return this builder
         **/
        public Builder usageData(java.util.List<StorageUsageTrend> usageData) {
            this.usageData = usageData;
            this.__explicitlySet__.add("usageData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StorageUsageTrendAggregation build() {
            StorageUsageTrendAggregation model =
                    new StorageUsageTrendAggregation(
                            this.fileSystemName,
                            this.mountPoint,
                            this.fileSystemSizeInGBs,
                            this.usageData);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StorageUsageTrendAggregation model) {
            if (model.wasPropertyExplicitlySet("fileSystemName")) {
                this.fileSystemName(model.getFileSystemName());
            }
            if (model.wasPropertyExplicitlySet("mountPoint")) {
                this.mountPoint(model.getMountPoint());
            }
            if (model.wasPropertyExplicitlySet("fileSystemSizeInGBs")) {
                this.fileSystemSizeInGBs(model.getFileSystemSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("usageData")) {
                this.usageData(model.getUsageData());
            }
            return this;
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
     * Name of filesystem.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileSystemName")
    private final String fileSystemName;

    /**
     * Name of filesystem.
     * @return the value
     **/
    public String getFileSystemName() {
        return fileSystemName;
    }

    /**
     * Mount points are specialized NTFS filesystem objects.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mountPoint")
    private final String mountPoint;

    /**
     * Mount points are specialized NTFS filesystem objects.
     * @return the value
     **/
    public String getMountPoint() {
        return mountPoint;
    }

    /**
     * Size of filesystem.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileSystemSizeInGBs")
    private final Double fileSystemSizeInGBs;

    /**
     * Size of filesystem.
     * @return the value
     **/
    public Double getFileSystemSizeInGBs() {
        return fileSystemSizeInGBs;
    }

    /**
     * List of usage data samples for a filesystem.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageData")
    private final java.util.List<StorageUsageTrend> usageData;

    /**
     * List of usage data samples for a filesystem.
     * @return the value
     **/
    public java.util.List<StorageUsageTrend> getUsageData() {
        return usageData;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StorageUsageTrendAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("fileSystemName=").append(String.valueOf(this.fileSystemName));
        sb.append(", mountPoint=").append(String.valueOf(this.mountPoint));
        sb.append(", fileSystemSizeInGBs=").append(String.valueOf(this.fileSystemSizeInGBs));
        sb.append(", usageData=").append(String.valueOf(this.usageData));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StorageUsageTrendAggregation)) {
            return false;
        }

        StorageUsageTrendAggregation other = (StorageUsageTrendAggregation) o;
        return java.util.Objects.equals(this.fileSystemName, other.fileSystemName)
                && java.util.Objects.equals(this.mountPoint, other.mountPoint)
                && java.util.Objects.equals(this.fileSystemSizeInGBs, other.fileSystemSizeInGBs)
                && java.util.Objects.equals(this.usageData, other.usageData)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.fileSystemName == null ? 43 : this.fileSystemName.hashCode());
        result = (result * PRIME) + (this.mountPoint == null ? 43 : this.mountPoint.hashCode());
        result =
                (result * PRIME)
                        + (this.fileSystemSizeInGBs == null
                                ? 43
                                : this.fileSystemSizeInGBs.hashCode());
        result = (result * PRIME) + (this.usageData == null ? 43 : this.usageData.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
