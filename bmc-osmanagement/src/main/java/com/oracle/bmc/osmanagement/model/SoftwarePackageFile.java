/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * A file associated with a package <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SoftwarePackageFile.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class SoftwarePackageFile
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "path",
        "type",
        "timeModified",
        "checksum",
        "checksumType",
        "sizeInBytes"
    })
    public SoftwarePackageFile(
            String path,
            String type,
            java.util.Date timeModified,
            String checksum,
            String checksumType,
            Long sizeInBytes) {
        super();
        this.path = path;
        this.type = type;
        this.timeModified = timeModified;
        this.checksum = checksum;
        this.checksumType = checksumType;
        this.sizeInBytes = sizeInBytes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** file path */
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * file path
         *
         * @param path the value to set
         * @return this builder
         */
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /** type of the file */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * type of the file
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The date and time of the last modification to this file, as described in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
        private java.util.Date timeModified;

        /**
         * The date and time of the last modification to this file, as described in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         *
         * @param timeModified the value to set
         * @return this builder
         */
        public Builder timeModified(java.util.Date timeModified) {
            this.timeModified = timeModified;
            this.__explicitlySet__.add("timeModified");
            return this;
        }
        /** checksum of the file */
        @com.fasterxml.jackson.annotation.JsonProperty("checksum")
        private String checksum;

        /**
         * checksum of the file
         *
         * @param checksum the value to set
         * @return this builder
         */
        public Builder checksum(String checksum) {
            this.checksum = checksum;
            this.__explicitlySet__.add("checksum");
            return this;
        }
        /** type of the checksum */
        @com.fasterxml.jackson.annotation.JsonProperty("checksumType")
        private String checksumType;

        /**
         * type of the checksum
         *
         * @param checksumType the value to set
         * @return this builder
         */
        public Builder checksumType(String checksumType) {
            this.checksumType = checksumType;
            this.__explicitlySet__.add("checksumType");
            return this;
        }
        /** size of the file in bytes */
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
        private Long sizeInBytes;

        /**
         * size of the file in bytes
         *
         * @param sizeInBytes the value to set
         * @return this builder
         */
        public Builder sizeInBytes(Long sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            this.__explicitlySet__.add("sizeInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SoftwarePackageFile build() {
            SoftwarePackageFile model =
                    new SoftwarePackageFile(
                            this.path,
                            this.type,
                            this.timeModified,
                            this.checksum,
                            this.checksumType,
                            this.sizeInBytes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SoftwarePackageFile model) {
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("timeModified")) {
                this.timeModified(model.getTimeModified());
            }
            if (model.wasPropertyExplicitlySet("checksum")) {
                this.checksum(model.getChecksum());
            }
            if (model.wasPropertyExplicitlySet("checksumType")) {
                this.checksumType(model.getChecksumType());
            }
            if (model.wasPropertyExplicitlySet("sizeInBytes")) {
                this.sizeInBytes(model.getSizeInBytes());
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

    /** file path */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * file path
     *
     * @return the value
     */
    public String getPath() {
        return path;
    }

    /** type of the file */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * type of the file
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /**
     * The date and time of the last modification to this file, as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
    private final java.util.Date timeModified;

    /**
     * The date and time of the last modification to this file, as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     * @return the value
     */
    public java.util.Date getTimeModified() {
        return timeModified;
    }

    /** checksum of the file */
    @com.fasterxml.jackson.annotation.JsonProperty("checksum")
    private final String checksum;

    /**
     * checksum of the file
     *
     * @return the value
     */
    public String getChecksum() {
        return checksum;
    }

    /** type of the checksum */
    @com.fasterxml.jackson.annotation.JsonProperty("checksumType")
    private final String checksumType;

    /**
     * type of the checksum
     *
     * @return the value
     */
    public String getChecksumType() {
        return checksumType;
    }

    /** size of the file in bytes */
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
    private final Long sizeInBytes;

    /**
     * size of the file in bytes
     *
     * @return the value
     */
    public Long getSizeInBytes() {
        return sizeInBytes;
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
        sb.append("SoftwarePackageFile(");
        sb.append("super=").append(super.toString());
        sb.append("path=").append(String.valueOf(this.path));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", timeModified=").append(String.valueOf(this.timeModified));
        sb.append(", checksum=").append(String.valueOf(this.checksum));
        sb.append(", checksumType=").append(String.valueOf(this.checksumType));
        sb.append(", sizeInBytes=").append(String.valueOf(this.sizeInBytes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SoftwarePackageFile)) {
            return false;
        }

        SoftwarePackageFile other = (SoftwarePackageFile) o;
        return java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.timeModified, other.timeModified)
                && java.util.Objects.equals(this.checksum, other.checksum)
                && java.util.Objects.equals(this.checksumType, other.checksumType)
                && java.util.Objects.equals(this.sizeInBytes, other.sizeInBytes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.timeModified == null ? 43 : this.timeModified.hashCode());
        result = (result * PRIME) + (this.checksum == null ? 43 : this.checksum.hashCode());
        result = (result * PRIME) + (this.checksumType == null ? 43 : this.checksumType.hashCode());
        result = (result * PRIME) + (this.sizeInBytes == null ? 43 : this.sizeInBytes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
