/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsjavadownloads.model;

/**
 * Download Url object for the Java artifact. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DownloadUrl.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DownloadUrl extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"downloadUrl", "downloadUrlType"})
    public DownloadUrl(String downloadUrl, DownloadUrlType downloadUrlType) {
        super();
        this.downloadUrl = downloadUrl;
        this.downloadUrlType = downloadUrlType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The URL for downloading the artifact. */
        @com.fasterxml.jackson.annotation.JsonProperty("downloadUrl")
        private String downloadUrl;

        /**
         * The URL for downloading the artifact.
         *
         * @param downloadUrl the value to set
         * @return this builder
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            this.__explicitlySet__.add("downloadUrl");
            return this;
        }
        /** The type of download URL. */
        @com.fasterxml.jackson.annotation.JsonProperty("downloadUrlType")
        private DownloadUrlType downloadUrlType;

        /**
         * The type of download URL.
         *
         * @param downloadUrlType the value to set
         * @return this builder
         */
        public Builder downloadUrlType(DownloadUrlType downloadUrlType) {
            this.downloadUrlType = downloadUrlType;
            this.__explicitlySet__.add("downloadUrlType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DownloadUrl build() {
            DownloadUrl model = new DownloadUrl(this.downloadUrl, this.downloadUrlType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DownloadUrl model) {
            if (model.wasPropertyExplicitlySet("downloadUrl")) {
                this.downloadUrl(model.getDownloadUrl());
            }
            if (model.wasPropertyExplicitlySet("downloadUrlType")) {
                this.downloadUrlType(model.getDownloadUrlType());
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

    /** The URL for downloading the artifact. */
    @com.fasterxml.jackson.annotation.JsonProperty("downloadUrl")
    private final String downloadUrl;

    /**
     * The URL for downloading the artifact.
     *
     * @return the value
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    /** The type of download URL. */
    @com.fasterxml.jackson.annotation.JsonProperty("downloadUrlType")
    private final DownloadUrlType downloadUrlType;

    /**
     * The type of download URL.
     *
     * @return the value
     */
    public DownloadUrlType getDownloadUrlType() {
        return downloadUrlType;
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
        sb.append("DownloadUrl(");
        sb.append("super=").append(super.toString());
        sb.append("downloadUrl=").append(String.valueOf(this.downloadUrl));
        sb.append(", downloadUrlType=").append(String.valueOf(this.downloadUrlType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DownloadUrl)) {
            return false;
        }

        DownloadUrl other = (DownloadUrl) o;
        return java.util.Objects.equals(this.downloadUrl, other.downloadUrl)
                && java.util.Objects.equals(this.downloadUrlType, other.downloadUrlType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.downloadUrl == null ? 43 : this.downloadUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.downloadUrlType == null ? 43 : this.downloadUrlType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
