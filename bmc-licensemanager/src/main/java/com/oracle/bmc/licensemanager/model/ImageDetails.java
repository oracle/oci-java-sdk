/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.model;

/**
 * Image details associated with the product license. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ImageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ImageDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"listingId", "packageVersion"})
    public ImageDetails(String listingId, String packageVersion) {
        super();
        this.listingId = listingId;
        this.packageVersion = packageVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Marketplace image listing ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        /**
         * Marketplace image listing ID.
         *
         * @param listingId the value to set
         * @return this builder
         */
        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
            return this;
        }
        /** Image package version. */
        @com.fasterxml.jackson.annotation.JsonProperty("packageVersion")
        private String packageVersion;

        /**
         * Image package version.
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

        public ImageDetails build() {
            ImageDetails model = new ImageDetails(this.listingId, this.packageVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImageDetails model) {
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

    /** Marketplace image listing ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("listingId")
    private final String listingId;

    /**
     * Marketplace image listing ID.
     *
     * @return the value
     */
    public String getListingId() {
        return listingId;
    }

    /** Image package version. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageVersion")
    private final String packageVersion;

    /**
     * Image package version.
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
        sb.append("ImageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("listingId=").append(String.valueOf(this.listingId));
        sb.append(", packageVersion=").append(String.valueOf(this.packageVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImageDetails)) {
            return false;
        }

        ImageDetails other = (ImageDetails) o;
        return java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.packageVersion, other.packageVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result =
                (result * PRIME)
                        + (this.packageVersion == null ? 43 : this.packageVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
