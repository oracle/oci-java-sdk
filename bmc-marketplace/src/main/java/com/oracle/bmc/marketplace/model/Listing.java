/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.marketplace.model;

/**
 * The model for an Oracle Cloud Infrastructure Marketplace listing.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Listing.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class Listing {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tagline")
        private String tagline;

        public Builder tagline(String tagline) {
            this.tagline = tagline;
            this.__explicitlySet__.add("tagline");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keywords")
        private String keywords;

        public Builder keywords(String keywords) {
            this.keywords = keywords;
            this.__explicitlySet__.add("keywords");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
        private String shortDescription;

        public Builder shortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            this.__explicitlySet__.add("shortDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usageInformation")
        private String usageInformation;

        public Builder usageInformation(String usageInformation) {
            this.usageInformation = usageInformation;
            this.__explicitlySet__.add("usageInformation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("longDescription")
        private String longDescription;

        public Builder longDescription(String longDescription) {
            this.longDescription = longDescription;
            this.__explicitlySet__.add("longDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("licenseModelDescription")
        private String licenseModelDescription;

        public Builder licenseModelDescription(String licenseModelDescription) {
            this.licenseModelDescription = licenseModelDescription;
            this.__explicitlySet__.add("licenseModelDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemRequirements")
        private String systemRequirements;

        public Builder systemRequirements(String systemRequirements) {
            this.systemRequirements = systemRequirements;
            this.__explicitlySet__.add("systemRequirements");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
        private java.util.Date timeReleased;

        public Builder timeReleased(java.util.Date timeReleased) {
            this.timeReleased = timeReleased;
            this.__explicitlySet__.add("timeReleased");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("releaseNotes")
        private String releaseNotes;

        public Builder releaseNotes(String releaseNotes) {
            this.releaseNotes = releaseNotes;
            this.__explicitlySet__.add("releaseNotes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("categories")
        private java.util.List<String> categories;

        public Builder categories(java.util.List<String> categories) {
            this.categories = categories;
            this.__explicitlySet__.add("categories");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("publisher")
        private Publisher publisher;

        public Builder publisher(Publisher publisher) {
            this.publisher = publisher;
            this.__explicitlySet__.add("publisher");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("languages")
        private java.util.List<Item> languages;

        public Builder languages(java.util.List<Item> languages) {
            this.languages = languages;
            this.__explicitlySet__.add("languages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("screenshots")
        private java.util.List<Screenshot> screenshots;

        public Builder screenshots(java.util.List<Screenshot> screenshots) {
            this.screenshots = screenshots;
            this.__explicitlySet__.add("screenshots");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("videos")
        private java.util.List<NamedLink> videos;

        public Builder videos(java.util.List<NamedLink> videos) {
            this.videos = videos;
            this.__explicitlySet__.add("videos");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("supportContacts")
        private java.util.List<SupportContact> supportContacts;

        public Builder supportContacts(java.util.List<SupportContact> supportContacts) {
            this.supportContacts = supportContacts;
            this.__explicitlySet__.add("supportContacts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("supportLinks")
        private java.util.List<NamedLink> supportLinks;

        public Builder supportLinks(java.util.List<NamedLink> supportLinks) {
            this.supportLinks = supportLinks;
            this.__explicitlySet__.add("supportLinks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("documentationLinks")
        private java.util.List<DocumentationLink> documentationLinks;

        public Builder documentationLinks(java.util.List<DocumentationLink> documentationLinks) {
            this.documentationLinks = documentationLinks;
            this.__explicitlySet__.add("documentationLinks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("icon")
        private UploadData icon;

        public Builder icon(UploadData icon) {
            this.icon = icon;
            this.__explicitlySet__.add("icon");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("banner")
        private UploadData banner;

        public Builder banner(UploadData banner) {
            this.banner = banner;
            this.__explicitlySet__.add("banner");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("regions")
        private java.util.List<Region> regions;

        public Builder regions(java.util.List<Region> regions) {
            this.regions = regions;
            this.__explicitlySet__.add("regions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("packageType")
        private PackageTypeEnum packageType;

        public Builder packageType(PackageTypeEnum packageType) {
            this.packageType = packageType;
            this.__explicitlySet__.add("packageType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultPackageVersion")
        private String defaultPackageVersion;

        public Builder defaultPackageVersion(String defaultPackageVersion) {
            this.defaultPackageVersion = defaultPackageVersion;
            this.__explicitlySet__.add("defaultPackageVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("links")
        private java.util.List<Link> links;

        public Builder links(java.util.List<Link> links) {
            this.links = links;
            this.__explicitlySet__.add("links");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isFeatured")
        private Boolean isFeatured;

        public Builder isFeatured(Boolean isFeatured) {
            this.isFeatured = isFeatured;
            this.__explicitlySet__.add("isFeatured");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Listing build() {
            Listing __instance__ =
                    new Listing(
                            id,
                            name,
                            version,
                            tagline,
                            keywords,
                            shortDescription,
                            usageInformation,
                            longDescription,
                            licenseModelDescription,
                            systemRequirements,
                            timeReleased,
                            releaseNotes,
                            categories,
                            publisher,
                            languages,
                            screenshots,
                            videos,
                            supportContacts,
                            supportLinks,
                            documentationLinks,
                            icon,
                            banner,
                            regions,
                            packageType,
                            defaultPackageVersion,
                            links,
                            isFeatured);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Listing o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .name(o.getName())
                            .version(o.getVersion())
                            .tagline(o.getTagline())
                            .keywords(o.getKeywords())
                            .shortDescription(o.getShortDescription())
                            .usageInformation(o.getUsageInformation())
                            .longDescription(o.getLongDescription())
                            .licenseModelDescription(o.getLicenseModelDescription())
                            .systemRequirements(o.getSystemRequirements())
                            .timeReleased(o.getTimeReleased())
                            .releaseNotes(o.getReleaseNotes())
                            .categories(o.getCategories())
                            .publisher(o.getPublisher())
                            .languages(o.getLanguages())
                            .screenshots(o.getScreenshots())
                            .videos(o.getVideos())
                            .supportContacts(o.getSupportContacts())
                            .supportLinks(o.getSupportLinks())
                            .documentationLinks(o.getDocumentationLinks())
                            .icon(o.getIcon())
                            .banner(o.getBanner())
                            .regions(o.getRegions())
                            .packageType(o.getPackageType())
                            .defaultPackageVersion(o.getDefaultPackageVersion())
                            .links(o.getLinks())
                            .isFeatured(o.getIsFeatured());

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

    /**
     * The unique identifier for the listing in Marketplace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The name of the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The version of the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    String version;

    /**
     * The tagline of the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tagline")
    String tagline;

    /**
     * Keywords associated with the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keywords")
    String keywords;

    /**
     * A short description of the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
    String shortDescription;

    /**
     * Usage information for the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageInformation")
    String usageInformation;

    /**
     * A long description of the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("longDescription")
    String longDescription;

    /**
     * A description of the publisher's licensing model for the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModelDescription")
    String licenseModelDescription;

    /**
     * System requirements for the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemRequirements")
    String systemRequirements;

    /**
     * The release date of the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
    java.util.Date timeReleased;

    /**
     * Release notes for the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("releaseNotes")
    String releaseNotes;

    /**
     * Categories that the listing belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("categories")
    java.util.List<String> categories;

    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    Publisher publisher;

    /**
     * Languages supported by the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("languages")
    java.util.List<Item> languages;

    /**
     * Screenshots of the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("screenshots")
    java.util.List<Screenshot> screenshots;

    /**
     * Videos of the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("videos")
    java.util.List<NamedLink> videos;

    /**
     * Contact information to use to get support from the publisher for the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportContacts")
    java.util.List<SupportContact> supportContacts;

    /**
     * Links to support resources for the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportLinks")
    java.util.List<NamedLink> supportLinks;

    /**
     * Links to additional documentation provided by the publisher specifically for the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("documentationLinks")
    java.util.List<DocumentationLink> documentationLinks;

    @com.fasterxml.jackson.annotation.JsonProperty("icon")
    UploadData icon;

    @com.fasterxml.jackson.annotation.JsonProperty("banner")
    UploadData banner;

    /**
     * The regions where the listing is available.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regions")
    java.util.List<Region> regions;

    /**
     * The listing's package type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("packageType")
    PackageTypeEnum packageType;

    /**
     * The default package version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultPackageVersion")
    String defaultPackageVersion;

    /**
     * Links to reference material.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("links")
    java.util.List<Link> links;

    /**
     * Indicates whether the listing is included in Featured Listings.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFeatured")
    Boolean isFeatured;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
