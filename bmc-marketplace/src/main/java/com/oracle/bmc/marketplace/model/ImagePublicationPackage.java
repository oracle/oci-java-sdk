/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * A publication package for image publications.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ImagePublicationPackage.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "packageType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ImagePublicationPackage extends PublicationPackage {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
        private OperatingSystem operatingSystem;

        public Builder operatingSystem(OperatingSystem operatingSystem) {
            this.operatingSystem = operatingSystem;
            this.__explicitlySet__.add("operatingSystem");
            return this;
        }
        /**
         * The ID of the listing resource associated with this publication package. For more information, see [AppCatalogListing](https://docs.cloud.oracle.com/en-us/iaas/api/#/en/iaas/latest/AppCatalogListing/) in the Core Services API.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("appCatalogListingId")
        private String appCatalogListingId;

        /**
         * The ID of the listing resource associated with this publication package. For more information, see [AppCatalogListing](https://docs.cloud.oracle.com/en-us/iaas/api/#/en/iaas/latest/AppCatalogListing/) in the Core Services API.
         *
         * @param appCatalogListingId the value to set
         * @return this builder
         **/
        public Builder appCatalogListingId(String appCatalogListingId) {
            this.appCatalogListingId = appCatalogListingId;
            this.__explicitlySet__.add("appCatalogListingId");
            return this;
        }
        /**
         * The resource version of the listing resource associated with this publication package.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("appCatalogListingResourceVersion")
        private String appCatalogListingResourceVersion;

        /**
         * The resource version of the listing resource associated with this publication package.
         * @param appCatalogListingResourceVersion the value to set
         * @return this builder
         **/
        public Builder appCatalogListingResourceVersion(String appCatalogListingResourceVersion) {
            this.appCatalogListingResourceVersion = appCatalogListingResourceVersion;
            this.__explicitlySet__.add("appCatalogListingResourceVersion");
            return this;
        }
        /**
         * The ID of the image that corresponds to the package.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("imageId")
        private String imageId;

        /**
         * The ID of the image that corresponds to the package.
         * @param imageId the value to set
         * @return this builder
         **/
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            this.__explicitlySet__.add("imageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImagePublicationPackage build() {
            ImagePublicationPackage model =
                    new ImagePublicationPackage(
                            this.description,
                            this.listingId,
                            this.version,
                            this.resourceId,
                            this.timeCreated,
                            this.operatingSystem,
                            this.appCatalogListingId,
                            this.appCatalogListingResourceVersion,
                            this.imageId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImagePublicationPackage model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("listingId")) {
                this.listingId(model.getListingId());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("operatingSystem")) {
                this.operatingSystem(model.getOperatingSystem());
            }
            if (model.wasPropertyExplicitlySet("appCatalogListingId")) {
                this.appCatalogListingId(model.getAppCatalogListingId());
            }
            if (model.wasPropertyExplicitlySet("appCatalogListingResourceVersion")) {
                this.appCatalogListingResourceVersion(model.getAppCatalogListingResourceVersion());
            }
            if (model.wasPropertyExplicitlySet("imageId")) {
                this.imageId(model.getImageId());
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
    public ImagePublicationPackage(
            String description,
            String listingId,
            String version,
            String resourceId,
            java.util.Date timeCreated,
            OperatingSystem operatingSystem,
            String appCatalogListingId,
            String appCatalogListingResourceVersion,
            String imageId) {
        super(description, listingId, version, resourceId, timeCreated, operatingSystem);
        this.appCatalogListingId = appCatalogListingId;
        this.appCatalogListingResourceVersion = appCatalogListingResourceVersion;
        this.imageId = imageId;
    }

    /**
     * The ID of the listing resource associated with this publication package. For more information, see [AppCatalogListing](https://docs.cloud.oracle.com/en-us/iaas/api/#/en/iaas/latest/AppCatalogListing/) in the Core Services API.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("appCatalogListingId")
    private final String appCatalogListingId;

    /**
     * The ID of the listing resource associated with this publication package. For more information, see [AppCatalogListing](https://docs.cloud.oracle.com/en-us/iaas/api/#/en/iaas/latest/AppCatalogListing/) in the Core Services API.
     *
     * @return the value
     **/
    public String getAppCatalogListingId() {
        return appCatalogListingId;
    }

    /**
     * The resource version of the listing resource associated with this publication package.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("appCatalogListingResourceVersion")
    private final String appCatalogListingResourceVersion;

    /**
     * The resource version of the listing resource associated with this publication package.
     * @return the value
     **/
    public String getAppCatalogListingResourceVersion() {
        return appCatalogListingResourceVersion;
    }

    /**
     * The ID of the image that corresponds to the package.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageId")
    private final String imageId;

    /**
     * The ID of the image that corresponds to the package.
     * @return the value
     **/
    public String getImageId() {
        return imageId;
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
        sb.append("ImagePublicationPackage(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", appCatalogListingId=").append(String.valueOf(this.appCatalogListingId));
        sb.append(", appCatalogListingResourceVersion=")
                .append(String.valueOf(this.appCatalogListingResourceVersion));
        sb.append(", imageId=").append(String.valueOf(this.imageId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImagePublicationPackage)) {
            return false;
        }

        ImagePublicationPackage other = (ImagePublicationPackage) o;
        return java.util.Objects.equals(this.appCatalogListingId, other.appCatalogListingId)
                && java.util.Objects.equals(
                        this.appCatalogListingResourceVersion,
                        other.appCatalogListingResourceVersion)
                && java.util.Objects.equals(this.imageId, other.imageId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.appCatalogListingId == null
                                ? 43
                                : this.appCatalogListingId.hashCode());
        result =
                (result * PRIME)
                        + (this.appCatalogListingResourceVersion == null
                                ? 43
                                : this.appCatalogListingResourceVersion.hashCode());
        result = (result * PRIME) + (this.imageId == null ? 43 : this.imageId.hashCode());
        return result;
    }
}
