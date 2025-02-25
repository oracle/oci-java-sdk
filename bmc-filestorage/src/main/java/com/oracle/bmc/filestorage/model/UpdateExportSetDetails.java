/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Details for updating the export set.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateExportSetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateExportSetDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "maxFsStatBytes", "maxFsStatFiles"})
    public UpdateExportSetDetails(String displayName, Long maxFsStatBytes, Long maxFsStatFiles) {
        super();
        this.displayName = displayName;
        this.maxFsStatBytes = maxFsStatBytes;
        this.maxFsStatFiles = maxFsStatFiles;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name. It does not have to be unique, and it is changeable.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code My export set}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. It does not have to be unique, and it is changeable.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code My export set}
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Controls the maximum {@code tbytes}, {@code fbytes}, and {@code abytes}
         * values reported by {@code NFS FSSTAT} calls through any associated
         * mount targets. This is an advanced feature. For most
         * applications, use the default value. The
         * {@code tbytes} value reported by {@code FSSTAT} will be
         * {@code maxFsStatBytes}. The value of {@code fbytes} and {@code abytes} will be
         * {@code maxFsStatBytes} minus the metered size of the file
         * system. If the metered size is larger than {@code maxFsStatBytes},
         * then {@code fbytes} and {@code abytes} will both be '0'.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxFsStatBytes")
        private Long maxFsStatBytes;

        /**
         * Controls the maximum {@code tbytes}, {@code fbytes}, and {@code abytes}
         * values reported by {@code NFS FSSTAT} calls through any associated
         * mount targets. This is an advanced feature. For most
         * applications, use the default value. The
         * {@code tbytes} value reported by {@code FSSTAT} will be
         * {@code maxFsStatBytes}. The value of {@code fbytes} and {@code abytes} will be
         * {@code maxFsStatBytes} minus the metered size of the file
         * system. If the metered size is larger than {@code maxFsStatBytes},
         * then {@code fbytes} and {@code abytes} will both be '0'.
         *
         * @param maxFsStatBytes the value to set
         * @return this builder
         **/
        public Builder maxFsStatBytes(Long maxFsStatBytes) {
            this.maxFsStatBytes = maxFsStatBytes;
            this.__explicitlySet__.add("maxFsStatBytes");
            return this;
        }
        /**
         * Controls the maximum {@code ffiles}, {@code ffiles}, and {@code afiles}
         * values reported by {@code NFS FSSTAT} calls through any associated
         * mount targets. This is an advanced feature. For most
         * applications, use the default value. The
         * {@code tfiles} value reported by {@code FSSTAT} will be
         * {@code maxFsStatFiles}. The value of {@code ffiles} and {@code afiles} will be
         * {@code maxFsStatFiles} minus the metered size of the file
         * system. If the metered size is larger than {@code maxFsStatFiles},
         * then {@code ffiles} and {@code afiles} will both be '0'.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxFsStatFiles")
        private Long maxFsStatFiles;

        /**
         * Controls the maximum {@code ffiles}, {@code ffiles}, and {@code afiles}
         * values reported by {@code NFS FSSTAT} calls through any associated
         * mount targets. This is an advanced feature. For most
         * applications, use the default value. The
         * {@code tfiles} value reported by {@code FSSTAT} will be
         * {@code maxFsStatFiles}. The value of {@code ffiles} and {@code afiles} will be
         * {@code maxFsStatFiles} minus the metered size of the file
         * system. If the metered size is larger than {@code maxFsStatFiles},
         * then {@code ffiles} and {@code afiles} will both be '0'.
         *
         * @param maxFsStatFiles the value to set
         * @return this builder
         **/
        public Builder maxFsStatFiles(Long maxFsStatFiles) {
            this.maxFsStatFiles = maxFsStatFiles;
            this.__explicitlySet__.add("maxFsStatFiles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateExportSetDetails build() {
            UpdateExportSetDetails model =
                    new UpdateExportSetDetails(
                            this.displayName, this.maxFsStatBytes, this.maxFsStatFiles);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateExportSetDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("maxFsStatBytes")) {
                this.maxFsStatBytes(model.getMaxFsStatBytes());
            }
            if (model.wasPropertyExplicitlySet("maxFsStatFiles")) {
                this.maxFsStatFiles(model.getMaxFsStatFiles());
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
     * A user-friendly name. It does not have to be unique, and it is changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My export set}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My export set}
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Controls the maximum {@code tbytes}, {@code fbytes}, and {@code abytes}
     * values reported by {@code NFS FSSTAT} calls through any associated
     * mount targets. This is an advanced feature. For most
     * applications, use the default value. The
     * {@code tbytes} value reported by {@code FSSTAT} will be
     * {@code maxFsStatBytes}. The value of {@code fbytes} and {@code abytes} will be
     * {@code maxFsStatBytes} minus the metered size of the file
     * system. If the metered size is larger than {@code maxFsStatBytes},
     * then {@code fbytes} and {@code abytes} will both be '0'.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxFsStatBytes")
    private final Long maxFsStatBytes;

    /**
     * Controls the maximum {@code tbytes}, {@code fbytes}, and {@code abytes}
     * values reported by {@code NFS FSSTAT} calls through any associated
     * mount targets. This is an advanced feature. For most
     * applications, use the default value. The
     * {@code tbytes} value reported by {@code FSSTAT} will be
     * {@code maxFsStatBytes}. The value of {@code fbytes} and {@code abytes} will be
     * {@code maxFsStatBytes} minus the metered size of the file
     * system. If the metered size is larger than {@code maxFsStatBytes},
     * then {@code fbytes} and {@code abytes} will both be '0'.
     *
     * @return the value
     **/
    public Long getMaxFsStatBytes() {
        return maxFsStatBytes;
    }

    /**
     * Controls the maximum {@code ffiles}, {@code ffiles}, and {@code afiles}
     * values reported by {@code NFS FSSTAT} calls through any associated
     * mount targets. This is an advanced feature. For most
     * applications, use the default value. The
     * {@code tfiles} value reported by {@code FSSTAT} will be
     * {@code maxFsStatFiles}. The value of {@code ffiles} and {@code afiles} will be
     * {@code maxFsStatFiles} minus the metered size of the file
     * system. If the metered size is larger than {@code maxFsStatFiles},
     * then {@code ffiles} and {@code afiles} will both be '0'.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxFsStatFiles")
    private final Long maxFsStatFiles;

    /**
     * Controls the maximum {@code ffiles}, {@code ffiles}, and {@code afiles}
     * values reported by {@code NFS FSSTAT} calls through any associated
     * mount targets. This is an advanced feature. For most
     * applications, use the default value. The
     * {@code tfiles} value reported by {@code FSSTAT} will be
     * {@code maxFsStatFiles}. The value of {@code ffiles} and {@code afiles} will be
     * {@code maxFsStatFiles} minus the metered size of the file
     * system. If the metered size is larger than {@code maxFsStatFiles},
     * then {@code ffiles} and {@code afiles} will both be '0'.
     *
     * @return the value
     **/
    public Long getMaxFsStatFiles() {
        return maxFsStatFiles;
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
        sb.append("UpdateExportSetDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", maxFsStatBytes=").append(String.valueOf(this.maxFsStatBytes));
        sb.append(", maxFsStatFiles=").append(String.valueOf(this.maxFsStatFiles));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateExportSetDetails)) {
            return false;
        }

        UpdateExportSetDetails other = (UpdateExportSetDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.maxFsStatBytes, other.maxFsStatBytes)
                && java.util.Objects.equals(this.maxFsStatFiles, other.maxFsStatFiles)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.maxFsStatBytes == null ? 43 : this.maxFsStatBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.maxFsStatFiles == null ? 43 : this.maxFsStatFiles.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
