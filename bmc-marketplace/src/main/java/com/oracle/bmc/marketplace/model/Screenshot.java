/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * The model for a listing's screenshot.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Screenshot.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Screenshot {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "description",
        "contentUrl",
        "mimeType",
        "fileExtension"
    })
    public Screenshot(
            String name,
            String description,
            String contentUrl,
            String mimeType,
            String fileExtension) {
        super();
        this.name = name;
        this.description = description;
        this.contentUrl = contentUrl;
        this.mimeType = mimeType;
        this.fileExtension = fileExtension;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the screenshot.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the screenshot.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * A description of the screenshot.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description of the screenshot.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The content URL of the screenshot.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("contentUrl")
        private String contentUrl;

        /**
         * The content URL of the screenshot.
         * @param contentUrl the value to set
         * @return this builder
         **/
        public Builder contentUrl(String contentUrl) {
            this.contentUrl = contentUrl;
            this.__explicitlySet__.add("contentUrl");
            return this;
        }
        /**
         * The MIME type of the screenshot.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mimeType")
        private String mimeType;

        /**
         * The MIME type of the screenshot.
         * @param mimeType the value to set
         * @return this builder
         **/
        public Builder mimeType(String mimeType) {
            this.mimeType = mimeType;
            this.__explicitlySet__.add("mimeType");
            return this;
        }
        /**
         * The file extension of the screenshot.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fileExtension")
        private String fileExtension;

        /**
         * The file extension of the screenshot.
         * @param fileExtension the value to set
         * @return this builder
         **/
        public Builder fileExtension(String fileExtension) {
            this.fileExtension = fileExtension;
            this.__explicitlySet__.add("fileExtension");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Screenshot build() {
            Screenshot __instance__ =
                    new Screenshot(name, description, contentUrl, mimeType, fileExtension);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Screenshot o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .description(o.getDescription())
                            .contentUrl(o.getContentUrl())
                            .mimeType(o.getMimeType())
                            .fileExtension(o.getFileExtension());

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
     * The name of the screenshot.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the screenshot.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * A description of the screenshot.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description of the screenshot.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The content URL of the screenshot.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentUrl")
    private final String contentUrl;

    /**
     * The content URL of the screenshot.
     * @return the value
     **/
    public String getContentUrl() {
        return contentUrl;
    }

    /**
     * The MIME type of the screenshot.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mimeType")
    private final String mimeType;

    /**
     * The MIME type of the screenshot.
     * @return the value
     **/
    public String getMimeType() {
        return mimeType;
    }

    /**
     * The file extension of the screenshot.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileExtension")
    private final String fileExtension;

    /**
     * The file extension of the screenshot.
     * @return the value
     **/
    public String getFileExtension() {
        return fileExtension;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Screenshot(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", contentUrl=").append(String.valueOf(this.contentUrl));
        sb.append(", mimeType=").append(String.valueOf(this.mimeType));
        sb.append(", fileExtension=").append(String.valueOf(this.fileExtension));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Screenshot)) {
            return false;
        }

        Screenshot other = (Screenshot) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.contentUrl, other.contentUrl)
                && java.util.Objects.equals(this.mimeType, other.mimeType)
                && java.util.Objects.equals(this.fileExtension, other.fileExtension)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.contentUrl == null ? 43 : this.contentUrl.hashCode());
        result = (result * PRIME) + (this.mimeType == null ? 43 : this.mimeType.hashCode());
        result =
                (result * PRIME)
                        + (this.fileExtension == null ? 43 : this.fileExtension.hashCode());
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
