/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of the file system configuration of the Exadata infrastructure.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DefinedFileSystemConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DefinedFileSystemConfiguration
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "mountPoint",
        "minSizeGb",
        "isResizable",
        "isBackupPartition"
    })
    public DefinedFileSystemConfiguration(
            String mountPoint, Integer minSizeGb, Boolean isResizable, Boolean isBackupPartition) {
        super();
        this.mountPoint = mountPoint;
        this.minSizeGb = minSizeGb;
        this.isResizable = isResizable;
        this.isBackupPartition = isBackupPartition;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The mount point of file system.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mountPoint")
        private String mountPoint;

        /**
         * The mount point of file system.
         * @param mountPoint the value to set
         * @return this builder
         **/
        public Builder mountPoint(String mountPoint) {
            this.mountPoint = mountPoint;
            this.__explicitlySet__.add("mountPoint");
            return this;
        }
        /**
         * The minimum size of file system.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minSizeGb")
        private Integer minSizeGb;

        /**
         * The minimum size of file system.
         * @param minSizeGb the value to set
         * @return this builder
         **/
        public Builder minSizeGb(Integer minSizeGb) {
            this.minSizeGb = minSizeGb;
            this.__explicitlySet__.add("minSizeGb");
            return this;
        }
        /**
         * If true, the file system resize is allowed for the Exadata Infrastructure cluster. If false, the file system resize is not allowed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isResizable")
        private Boolean isResizable;

        /**
         * If true, the file system resize is allowed for the Exadata Infrastructure cluster. If false, the file system resize is not allowed.
         * @param isResizable the value to set
         * @return this builder
         **/
        public Builder isResizable(Boolean isResizable) {
            this.isResizable = isResizable;
            this.__explicitlySet__.add("isResizable");
            return this;
        }
        /**
         * If true, the file system is used to create a backup prior to Exadata VM OS update.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isBackupPartition")
        private Boolean isBackupPartition;

        /**
         * If true, the file system is used to create a backup prior to Exadata VM OS update.
         * @param isBackupPartition the value to set
         * @return this builder
         **/
        public Builder isBackupPartition(Boolean isBackupPartition) {
            this.isBackupPartition = isBackupPartition;
            this.__explicitlySet__.add("isBackupPartition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DefinedFileSystemConfiguration build() {
            DefinedFileSystemConfiguration model =
                    new DefinedFileSystemConfiguration(
                            this.mountPoint,
                            this.minSizeGb,
                            this.isResizable,
                            this.isBackupPartition);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DefinedFileSystemConfiguration model) {
            if (model.wasPropertyExplicitlySet("mountPoint")) {
                this.mountPoint(model.getMountPoint());
            }
            if (model.wasPropertyExplicitlySet("minSizeGb")) {
                this.minSizeGb(model.getMinSizeGb());
            }
            if (model.wasPropertyExplicitlySet("isResizable")) {
                this.isResizable(model.getIsResizable());
            }
            if (model.wasPropertyExplicitlySet("isBackupPartition")) {
                this.isBackupPartition(model.getIsBackupPartition());
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
     * The mount point of file system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mountPoint")
    private final String mountPoint;

    /**
     * The mount point of file system.
     * @return the value
     **/
    public String getMountPoint() {
        return mountPoint;
    }

    /**
     * The minimum size of file system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minSizeGb")
    private final Integer minSizeGb;

    /**
     * The minimum size of file system.
     * @return the value
     **/
    public Integer getMinSizeGb() {
        return minSizeGb;
    }

    /**
     * If true, the file system resize is allowed for the Exadata Infrastructure cluster. If false, the file system resize is not allowed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isResizable")
    private final Boolean isResizable;

    /**
     * If true, the file system resize is allowed for the Exadata Infrastructure cluster. If false, the file system resize is not allowed.
     * @return the value
     **/
    public Boolean getIsResizable() {
        return isResizable;
    }

    /**
     * If true, the file system is used to create a backup prior to Exadata VM OS update.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBackupPartition")
    private final Boolean isBackupPartition;

    /**
     * If true, the file system is used to create a backup prior to Exadata VM OS update.
     * @return the value
     **/
    public Boolean getIsBackupPartition() {
        return isBackupPartition;
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
        sb.append("DefinedFileSystemConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("mountPoint=").append(String.valueOf(this.mountPoint));
        sb.append(", minSizeGb=").append(String.valueOf(this.minSizeGb));
        sb.append(", isResizable=").append(String.valueOf(this.isResizable));
        sb.append(", isBackupPartition=").append(String.valueOf(this.isBackupPartition));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DefinedFileSystemConfiguration)) {
            return false;
        }

        DefinedFileSystemConfiguration other = (DefinedFileSystemConfiguration) o;
        return java.util.Objects.equals(this.mountPoint, other.mountPoint)
                && java.util.Objects.equals(this.minSizeGb, other.minSizeGb)
                && java.util.Objects.equals(this.isResizable, other.isResizable)
                && java.util.Objects.equals(this.isBackupPartition, other.isBackupPartition)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.mountPoint == null ? 43 : this.mountPoint.hashCode());
        result = (result * PRIME) + (this.minSizeGb == null ? 43 : this.minSizeGb.hashCode());
        result = (result * PRIME) + (this.isResizable == null ? 43 : this.isResizable.hashCode());
        result =
                (result * PRIME)
                        + (this.isBackupPartition == null ? 43 : this.isBackupPartition.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
