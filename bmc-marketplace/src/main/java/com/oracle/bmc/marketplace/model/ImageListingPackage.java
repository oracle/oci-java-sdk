/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.marketplace.model;

/**
 * A package for image listings.
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
    builder = ImageListingPackage.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "packageType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ImageListingPackage extends ListingPackage {
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

        @com.fasterxml.jackson.annotation.JsonProperty("pricing")
        private PricingModel pricing;

        public Builder pricing(PricingModel pricing) {
            this.pricing = pricing;
            this.__explicitlySet__.add("pricing");
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

        @com.fasterxml.jackson.annotation.JsonProperty("regions")
        private java.util.List<Region> regions;

        public Builder regions(java.util.List<Region> regions) {
            this.regions = regions;
            this.__explicitlySet__.add("regions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImageListingPackage build() {
            ImageListingPackage __instance__ =
                    new ImageListingPackage(
                            description,
                            listingId,
                            version,
                            pricing,
                            resourceId,
                            timeCreated,
                            appCatalogListingId,
                            appCatalogListingResourceVersion,
                            regions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImageListingPackage o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .listingId(o.getListingId())
                            .version(o.getVersion())
                            .pricing(o.getPricing())
                            .resourceId(o.getResourceId())
                            .timeCreated(o.getTimeCreated())
                            .appCatalogListingId(o.getAppCatalogListingId())
                            .appCatalogListingResourceVersion(
                                    o.getAppCatalogListingResourceVersion())
                            .regions(o.getRegions());

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
    public ImageListingPackage(
            String description,
            String listingId,
            String version,
            PricingModel pricing,
            String resourceId,
            java.util.Date timeCreated,
            String appCatalogListingId,
            String appCatalogListingResourceVersion,
            java.util.List<Region> regions) {
        super(description, listingId, version, pricing, resourceId, timeCreated);
        this.appCatalogListingId = appCatalogListingId;
        this.appCatalogListingResourceVersion = appCatalogListingResourceVersion;
        this.regions = regions;
    }

    /**
     * The id of the AppCatalogListing associated with this ListingPackage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("appCatalogListingId")
    String appCatalogListingId;

    /**
     * The resource version of the AppCatalogListing associated with this ListingPackage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("appCatalogListingResourceVersion")
    String appCatalogListingResourceVersion;

    /**
     * List of regions in which this ListingPackage is available.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regions")
    java.util.List<Region> regions;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
