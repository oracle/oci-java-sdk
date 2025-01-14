/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.model;

/**
 * The collection of image details for the product license. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ImageResponse.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ImageResponse extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "listingName",
        "publisher",
        "listingId",
        "packageVersion"
    })
    public ImageResponse(
            String id,
            String listingName,
            String publisher,
            String listingId,
            String packageVersion) {
        super();
        this.id = id;
        this.listingName = listingName;
        this.publisher = publisher;
        this.listingId = listingId;
        this.packageVersion = packageVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The image ID associated with the product license. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The image ID associated with the product license.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The listing name associated with the product license. */
        @com.fasterxml.jackson.annotation.JsonProperty("listingName")
        private String listingName;

        /**
         * The listing name associated with the product license.
         *
         * @param listingName the value to set
         * @return this builder
         */
        public Builder listingName(String listingName) {
            this.listingName = listingName;
            this.__explicitlySet__.add("listingName");
            return this;
        }
        /** The image publisher. */
        @com.fasterxml.jackson.annotation.JsonProperty("publisher")
        private String publisher;

        /**
         * The image publisher.
         *
         * @param publisher the value to set
         * @return this builder
         */
        public Builder publisher(String publisher) {
            this.publisher = publisher;
            this.__explicitlySet__.add("publisher");
            return this;
        }
        /** The image listing ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        /**
         * The image listing ID.
         *
         * @param listingId the value to set
         * @return this builder
         */
        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
            return this;
        }
        /** The image package version. */
        @com.fasterxml.jackson.annotation.JsonProperty("packageVersion")
        private String packageVersion;

        /**
         * The image package version.
         *
         * @param packageVersion the value to set
         * @return this builder
         */
        public Builder packageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            this.__explicitlySet__.add("packageVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImageResponse build() {
            ImageResponse model =
                    new ImageResponse(
                            this.id,
                            this.listingName,
                            this.publisher,
                            this.listingId,
                            this.packageVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImageResponse model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("listingName")) {
                this.listingName(model.getListingName());
            }
            if (model.wasPropertyExplicitlySet("publisher")) {
                this.publisher(model.getPublisher());
            }
            if (model.wasPropertyExplicitlySet("listingId")) {
                this.listingId(model.getListingId());
            }
            if (model.wasPropertyExplicitlySet("packageVersion")) {
                this.packageVersion(model.getPackageVersion());
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

    /** The image ID associated with the product license. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The image ID associated with the product license.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The listing name associated with the product license. */
    @com.fasterxml.jackson.annotation.JsonProperty("listingName")
    private final String listingName;

    /**
     * The listing name associated with the product license.
     *
     * @return the value
     */
    public String getListingName() {
        return listingName;
    }

    /** The image publisher. */
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    private final String publisher;

    /**
     * The image publisher.
     *
     * @return the value
     */
    public String getPublisher() {
        return publisher;
    }

    /** The image listing ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("listingId")
    private final String listingId;

    /**
     * The image listing ID.
     *
     * @return the value
     */
    public String getListingId() {
        return listingId;
    }

    /** The image package version. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageVersion")
    private final String packageVersion;

    /**
     * The image package version.
     *
     * @return the value
     */
    public String getPackageVersion() {
        return packageVersion;
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
        sb.append("ImageResponse(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", listingName=").append(String.valueOf(this.listingName));
        sb.append(", publisher=").append(String.valueOf(this.publisher));
        sb.append(", listingId=").append(String.valueOf(this.listingId));
        sb.append(", packageVersion=").append(String.valueOf(this.packageVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImageResponse)) {
            return false;
        }

        ImageResponse other = (ImageResponse) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.listingName, other.listingName)
                && java.util.Objects.equals(this.publisher, other.publisher)
                && java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.packageVersion, other.packageVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.listingName == null ? 43 : this.listingName.hashCode());
        result = (result * PRIME) + (this.publisher == null ? 43 : this.publisher.hashCode());
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result =
                (result * PRIME)
                        + (this.packageVersion == null ? 43 : this.packageVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
