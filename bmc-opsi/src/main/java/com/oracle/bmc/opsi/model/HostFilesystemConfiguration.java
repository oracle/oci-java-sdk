/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Filesystem Configuration metric for the host.
 *
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
    builder = HostFilesystemConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "metricName"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HostFilesystemConfiguration extends HostConfigurationMetricGroup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /**
         * Name of filesystem
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fileSystemName")
        private String fileSystemName;

        /**
         * Name of filesystem
         * @param fileSystemName the value to set
         * @return this builder
         **/
        public Builder fileSystemName(String fileSystemName) {
            this.fileSystemName = fileSystemName;
            this.__explicitlySet__.add("fileSystemName");
            return this;
        }
        /**
         * Mount points are specialized NTFS filesystem objects
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mountPoint")
        private String mountPoint;

        /**
         * Mount points are specialized NTFS filesystem objects
         * @param mountPoint the value to set
         * @return this builder
         **/
        public Builder mountPoint(String mountPoint) {
            this.mountPoint = mountPoint;
            this.__explicitlySet__.add("mountPoint");
            return this;
        }
        /**
         * Size of filesystem
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fileSystemSizeInGB")
        private Double fileSystemSizeInGB;

        /**
         * Size of filesystem
         * @param fileSystemSizeInGB the value to set
         * @return this builder
         **/
        public Builder fileSystemSizeInGB(Double fileSystemSizeInGB) {
            this.fileSystemSizeInGB = fileSystemSizeInGB;
            this.__explicitlySet__.add("fileSystemSizeInGB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostFilesystemConfiguration build() {
            HostFilesystemConfiguration model =
                    new HostFilesystemConfiguration(
                            this.timeCollected,
                            this.fileSystemName,
                            this.mountPoint,
                            this.fileSystemSizeInGB);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostFilesystemConfiguration model) {
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("fileSystemName")) {
                this.fileSystemName(model.getFileSystemName());
            }
            if (model.wasPropertyExplicitlySet("mountPoint")) {
                this.mountPoint(model.getMountPoint());
            }
            if (model.wasPropertyExplicitlySet("fileSystemSizeInGB")) {
                this.fileSystemSizeInGB(model.getFileSystemSizeInGB());
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

    @Deprecated
    public HostFilesystemConfiguration(
            java.util.Date timeCollected,
            String fileSystemName,
            String mountPoint,
            Double fileSystemSizeInGB) {
        super(timeCollected);
        this.fileSystemName = fileSystemName;
        this.mountPoint = mountPoint;
        this.fileSystemSizeInGB = fileSystemSizeInGB;
    }

    /**
     * Name of filesystem
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileSystemName")
    private final String fileSystemName;

    /**
     * Name of filesystem
     * @return the value
     **/
    public String getFileSystemName() {
        return fileSystemName;
    }

    /**
     * Mount points are specialized NTFS filesystem objects
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mountPoint")
    private final String mountPoint;

    /**
     * Mount points are specialized NTFS filesystem objects
     * @return the value
     **/
    public String getMountPoint() {
        return mountPoint;
    }

    /**
     * Size of filesystem
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileSystemSizeInGB")
    private final Double fileSystemSizeInGB;

    /**
     * Size of filesystem
     * @return the value
     **/
    public Double getFileSystemSizeInGB() {
        return fileSystemSizeInGB;
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
        sb.append("HostFilesystemConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", fileSystemName=").append(String.valueOf(this.fileSystemName));
        sb.append(", mountPoint=").append(String.valueOf(this.mountPoint));
        sb.append(", fileSystemSizeInGB=").append(String.valueOf(this.fileSystemSizeInGB));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostFilesystemConfiguration)) {
            return false;
        }

        HostFilesystemConfiguration other = (HostFilesystemConfiguration) o;
        return java.util.Objects.equals(this.fileSystemName, other.fileSystemName)
                && java.util.Objects.equals(this.mountPoint, other.mountPoint)
                && java.util.Objects.equals(this.fileSystemSizeInGB, other.fileSystemSizeInGB)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.fileSystemName == null ? 43 : this.fileSystemName.hashCode());
        result = (result * PRIME) + (this.mountPoint == null ? 43 : this.mountPoint.hashCode());
        result =
                (result * PRIME)
                        + (this.fileSystemSizeInGB == null
                                ? 43
                                : this.fileSystemSizeInGB.hashCode());
        return result;
    }
}
