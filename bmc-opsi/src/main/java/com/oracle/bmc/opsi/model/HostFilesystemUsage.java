/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Filesystem Usage metric for the host. <br>
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
        builder = HostFilesystemUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "metricName")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HostFilesystemUsage extends HostPerformanceMetricGroup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /** Mount points are specialized NTFS filesystem objects */
        @com.fasterxml.jackson.annotation.JsonProperty("mountPoint")
        private String mountPoint;

        /**
         * Mount points are specialized NTFS filesystem objects
         *
         * @param mountPoint the value to set
         * @return this builder
         */
        public Builder mountPoint(String mountPoint) {
            this.mountPoint = mountPoint;
            this.__explicitlySet__.add("mountPoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fileSystemUsageInGB")
        private Double fileSystemUsageInGB;

        public Builder fileSystemUsageInGB(Double fileSystemUsageInGB) {
            this.fileSystemUsageInGB = fileSystemUsageInGB;
            this.__explicitlySet__.add("fileSystemUsageInGB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fileSystemAvailInPercent")
        private Double fileSystemAvailInPercent;

        public Builder fileSystemAvailInPercent(Double fileSystemAvailInPercent) {
            this.fileSystemAvailInPercent = fileSystemAvailInPercent;
            this.__explicitlySet__.add("fileSystemAvailInPercent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fileSystemAvailInGBs")
        private Double fileSystemAvailInGBs;

        public Builder fileSystemAvailInGBs(Double fileSystemAvailInGBs) {
            this.fileSystemAvailInGBs = fileSystemAvailInGBs;
            this.__explicitlySet__.add("fileSystemAvailInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostFilesystemUsage build() {
            HostFilesystemUsage model =
                    new HostFilesystemUsage(
                            this.timeCollected,
                            this.mountPoint,
                            this.fileSystemUsageInGB,
                            this.fileSystemAvailInPercent,
                            this.fileSystemAvailInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostFilesystemUsage model) {
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("mountPoint")) {
                this.mountPoint(model.getMountPoint());
            }
            if (model.wasPropertyExplicitlySet("fileSystemUsageInGB")) {
                this.fileSystemUsageInGB(model.getFileSystemUsageInGB());
            }
            if (model.wasPropertyExplicitlySet("fileSystemAvailInPercent")) {
                this.fileSystemAvailInPercent(model.getFileSystemAvailInPercent());
            }
            if (model.wasPropertyExplicitlySet("fileSystemAvailInGBs")) {
                this.fileSystemAvailInGBs(model.getFileSystemAvailInGBs());
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
    public HostFilesystemUsage(
            java.util.Date timeCollected,
            String mountPoint,
            Double fileSystemUsageInGB,
            Double fileSystemAvailInPercent,
            Double fileSystemAvailInGBs) {
        super(timeCollected);
        this.mountPoint = mountPoint;
        this.fileSystemUsageInGB = fileSystemUsageInGB;
        this.fileSystemAvailInPercent = fileSystemAvailInPercent;
        this.fileSystemAvailInGBs = fileSystemAvailInGBs;
    }

    /** Mount points are specialized NTFS filesystem objects */
    @com.fasterxml.jackson.annotation.JsonProperty("mountPoint")
    private final String mountPoint;

    /**
     * Mount points are specialized NTFS filesystem objects
     *
     * @return the value
     */
    public String getMountPoint() {
        return mountPoint;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fileSystemUsageInGB")
    private final Double fileSystemUsageInGB;

    public Double getFileSystemUsageInGB() {
        return fileSystemUsageInGB;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fileSystemAvailInPercent")
    private final Double fileSystemAvailInPercent;

    public Double getFileSystemAvailInPercent() {
        return fileSystemAvailInPercent;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fileSystemAvailInGBs")
    private final Double fileSystemAvailInGBs;

    public Double getFileSystemAvailInGBs() {
        return fileSystemAvailInGBs;
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
        sb.append("HostFilesystemUsage(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", mountPoint=").append(String.valueOf(this.mountPoint));
        sb.append(", fileSystemUsageInGB=").append(String.valueOf(this.fileSystemUsageInGB));
        sb.append(", fileSystemAvailInPercent=")
                .append(String.valueOf(this.fileSystemAvailInPercent));
        sb.append(", fileSystemAvailInGBs=").append(String.valueOf(this.fileSystemAvailInGBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostFilesystemUsage)) {
            return false;
        }

        HostFilesystemUsage other = (HostFilesystemUsage) o;
        return java.util.Objects.equals(this.mountPoint, other.mountPoint)
                && java.util.Objects.equals(this.fileSystemUsageInGB, other.fileSystemUsageInGB)
                && java.util.Objects.equals(
                        this.fileSystemAvailInPercent, other.fileSystemAvailInPercent)
                && java.util.Objects.equals(this.fileSystemAvailInGBs, other.fileSystemAvailInGBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.mountPoint == null ? 43 : this.mountPoint.hashCode());
        result =
                (result * PRIME)
                        + (this.fileSystemUsageInGB == null
                                ? 43
                                : this.fileSystemUsageInGB.hashCode());
        result =
                (result * PRIME)
                        + (this.fileSystemAvailInPercent == null
                                ? 43
                                : this.fileSystemAvailInPercent.hashCode());
        result =
                (result * PRIME)
                        + (this.fileSystemAvailInGBs == null
                                ? 43
                                : this.fileSystemAvailInGBs.hashCode());
        return result;
    }
}
