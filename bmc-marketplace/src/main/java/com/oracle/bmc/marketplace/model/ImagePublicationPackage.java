/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ImagePublicationPackage.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "packageType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ImagePublicationPackage extends PublicationPackage {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

        @com.fasterxml.jackson.annotation.JsonProperty("appCatalogListingId")
        private String appCatalogListingId;

        public Builder appCatalogListingId(String appCatalogListingId) {
            this.appCatalogListingId = appCatalogListingId;
            this.__explicitlySet__.add("appCatalogListingId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("appCatalogListingResourceVersion")
        private String appCatalogListingResourceVersion;

        public Builder appCatalogListingResourceVersion(String appCatalogListingResourceVersion) {
            this.appCatalogListingResourceVersion = appCatalogListingResourceVersion;
            this.__explicitlySet__.add("appCatalogListingResourceVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("imageId")
        private String imageId;

        public Builder imageId(String imageId) {
            this.imageId = imageId;
            this.__explicitlySet__.add("imageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImagePublicationPackage build() {
            ImagePublicationPackage __instance__ =
                    new ImagePublicationPackage(
                            description,
                            listingId,
                            version,
                            resourceId,
                            timeCreated,
                            operatingSystem,
                            appCatalogListingId,
                            appCatalogListingResourceVersion,
                            imageId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImagePublicationPackage o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .listingId(o.getListingId())
                            .version(o.getVersion())
                            .resourceId(o.getResourceId())
                            .timeCreated(o.getTimeCreated())
                            .operatingSystem(o.getOperatingSystem())
                            .appCatalogListingId(o.getAppCatalogListingId())
                            .appCatalogListingResourceVersion(
                                    o.getAppCatalogListingResourceVersion())
                            .imageId(o.getImageId());

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
    String appCatalogListingId;

    /**
     * The resource version of the listing resource associated with this publication package.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("appCatalogListingResourceVersion")
    String appCatalogListingResourceVersion;

    /**
     * The ID of the image that corresponds to the package.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageId")
    String imageId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
