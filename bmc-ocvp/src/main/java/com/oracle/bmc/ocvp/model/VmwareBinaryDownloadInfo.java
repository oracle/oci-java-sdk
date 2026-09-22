/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * The VMware binary download.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VmwareBinaryDownloadInfo.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VmwareBinaryDownloadInfo
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"fileName", "url", "timeExpires"})
    public VmwareBinaryDownloadInfo(String fileName, String url, java.util.Date timeExpires) {
        super();
        this.fileName = fileName;
        this.url = url;
        this.timeExpires = timeExpires;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the VMware binary file.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fileName")
        private String fileName;

        /**
         * The name of the VMware binary file.
         *
         * @param fileName the value to set
         * @return this builder
         **/
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            this.__explicitlySet__.add("fileName");
            return this;
        }
        /**
         * The URL to download the VMware binary.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * The URL to download the VMware binary.
         *
         * @param url the value to set
         * @return this builder
         **/
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }
        /**
         * The expiration date for the URL, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * After this date the URL will no longer be valid.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
        private java.util.Date timeExpires;

        /**
         * The expiration date for the URL, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * After this date the URL will no longer be valid.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeExpires the value to set
         * @return this builder
         **/
        public Builder timeExpires(java.util.Date timeExpires) {
            this.timeExpires = timeExpires;
            this.__explicitlySet__.add("timeExpires");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VmwareBinaryDownloadInfo build() {
            VmwareBinaryDownloadInfo model =
                    new VmwareBinaryDownloadInfo(this.fileName, this.url, this.timeExpires);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VmwareBinaryDownloadInfo model) {
            if (model.wasPropertyExplicitlySet("fileName")) {
                this.fileName(model.getFileName());
            }
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
            }
            if (model.wasPropertyExplicitlySet("timeExpires")) {
                this.timeExpires(model.getTimeExpires());
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
     * The name of the VMware binary file.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileName")
    private final String fileName;

    /**
     * The name of the VMware binary file.
     *
     * @return the value
     **/
    public String getFileName() {
        return fileName;
    }

    /**
     * The URL to download the VMware binary.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * The URL to download the VMware binary.
     *
     * @return the value
     **/
    public String getUrl() {
        return url;
    }

    /**
     * The expiration date for the URL, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * After this date the URL will no longer be valid.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
    private final java.util.Date timeExpires;

    /**
     * The expiration date for the URL, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * After this date the URL will no longer be valid.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeExpires() {
        return timeExpires;
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
        sb.append("VmwareBinaryDownloadInfo(");
        sb.append("super=").append(super.toString());
        sb.append("fileName=").append(String.valueOf(this.fileName));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", timeExpires=").append(String.valueOf(this.timeExpires));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VmwareBinaryDownloadInfo)) {
            return false;
        }

        VmwareBinaryDownloadInfo other = (VmwareBinaryDownloadInfo) o;
        return java.util.Objects.equals(this.fileName, other.fileName)
                && java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(this.timeExpires, other.timeExpires)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fileName == null ? 43 : this.fileName.hashCode());
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result = (result * PRIME) + (this.timeExpires == null ? 43 : this.timeExpires.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
