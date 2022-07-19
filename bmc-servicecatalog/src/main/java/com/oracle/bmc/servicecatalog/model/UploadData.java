/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicecatalog.model;

/**
 * The model for uploaded binary data, like logos and images.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210527")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UploadData.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UploadData {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "contentUrl", "mimeType"})
    public UploadData(String displayName, String contentUrl, String mimeType) {
        super();
        this.displayName = displayName;
        this.contentUrl = contentUrl;
        this.mimeType = mimeType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name used to refer to the uploaded data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name used to refer to the uploaded data.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The content URL of the uploaded data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("contentUrl")
        private String contentUrl;

        /**
         * The content URL of the uploaded data.
         * @param contentUrl the value to set
         * @return this builder
         **/
        public Builder contentUrl(String contentUrl) {
            this.contentUrl = contentUrl;
            this.__explicitlySet__.add("contentUrl");
            return this;
        }
        /**
         * The MIME type of the uploaded data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mimeType")
        private String mimeType;

        /**
         * The MIME type of the uploaded data.
         * @param mimeType the value to set
         * @return this builder
         **/
        public Builder mimeType(String mimeType) {
            this.mimeType = mimeType;
            this.__explicitlySet__.add("mimeType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UploadData build() {
            UploadData __instance__ = new UploadData(displayName, contentUrl, mimeType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UploadData o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .contentUrl(o.getContentUrl())
                            .mimeType(o.getMimeType());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The name used to refer to the uploaded data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name used to refer to the uploaded data.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The content URL of the uploaded data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentUrl")
    private final String contentUrl;

    /**
     * The content URL of the uploaded data.
     * @return the value
     **/
    public String getContentUrl() {
        return contentUrl;
    }

    /**
     * The MIME type of the uploaded data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mimeType")
    private final String mimeType;

    /**
     * The MIME type of the uploaded data.
     * @return the value
     **/
    public String getMimeType() {
        return mimeType;
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
        sb.append("UploadData(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", contentUrl=").append(String.valueOf(this.contentUrl));
        sb.append(", mimeType=").append(String.valueOf(this.mimeType));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UploadData)) {
            return false;
        }

        UploadData other = (UploadData) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.contentUrl, other.contentUrl)
                && java.util.Objects.equals(this.mimeType, other.mimeType)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.contentUrl == null ? 43 : this.contentUrl.hashCode());
        result = (result * PRIME) + (this.mimeType == null ? 43 : this.mimeType.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
