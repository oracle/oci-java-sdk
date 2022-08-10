/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Listing.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Listing extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "version",
        "tagline",
        "keywords",
        "shortDescription",
        "usageInformation",
        "longDescription",
        "licenseModelDescription",
        "systemRequirements",
        "timeReleased",
        "releaseNotes",
        "categories",
        "publisher",
        "languages",
        "screenshots",
        "videos",
        "supportContacts",
        "supportLinks",
        "documentationLinks",
        "icon",
        "banner",
        "compatibleArchitectures",
        "regions",
        "packageType",
        "defaultPackageVersion",
        "links",
        "isFeatured",
        "listingType",
        "supportedOperatingSystems"
    })
    public Listing(
            String id,
            String name,
            String version,
            String tagline,
            String keywords,
            String shortDescription,
            String usageInformation,
            String longDescription,
            String licenseModelDescription,
            String systemRequirements,
            java.util.Date timeReleased,
            String releaseNotes,
            java.util.List<String> categories,
            Publisher publisher,
            java.util.List<Item> languages,
            java.util.List<Screenshot> screenshots,
            java.util.List<NamedLink> videos,
            java.util.List<SupportContact> supportContacts,
            java.util.List<NamedLink> supportLinks,
            java.util.List<DocumentationLink> documentationLinks,
            UploadData icon,
            UploadData banner,
            java.util.List<CompatibleArchitectures> compatibleArchitectures,
            java.util.List<Region> regions,
            PackageTypeEnum packageType,
            String defaultPackageVersion,
            java.util.List<Link> links,
            Boolean isFeatured,
            ListingType listingType,
            java.util.List<OperatingSystem> supportedOperatingSystems) {
        super();
        this.id = id;
        this.name = name;
        this.version = version;
        this.tagline = tagline;
        this.keywords = keywords;
        this.shortDescription = shortDescription;
        this.usageInformation = usageInformation;
        this.longDescription = longDescription;
        this.licenseModelDescription = licenseModelDescription;
        this.systemRequirements = systemRequirements;
        this.timeReleased = timeReleased;
        this.releaseNotes = releaseNotes;
        this.categories = categories;
        this.publisher = publisher;
        this.languages = languages;
        this.screenshots = screenshots;
        this.videos = videos;
        this.supportContacts = supportContacts;
        this.supportLinks = supportLinks;
        this.documentationLinks = documentationLinks;
        this.icon = icon;
        this.banner = banner;
        this.compatibleArchitectures = compatibleArchitectures;
        this.regions = regions;
        this.packageType = packageType;
        this.defaultPackageVersion = defaultPackageVersion;
        this.links = links;
        this.isFeatured = isFeatured;
        this.listingType = listingType;
        this.supportedOperatingSystems = supportedOperatingSystems;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier for the listing in Marketplace.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique identifier for the listing in Marketplace.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The name of the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the listing.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The version of the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The version of the listing.
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * The tagline of the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tagline")
        private String tagline;

        /**
         * The tagline of the listing.
         * @param tagline the value to set
         * @return this builder
         **/
        public Builder tagline(String tagline) {
            this.tagline = tagline;
            this.__explicitlySet__.add("tagline");
            return this;
        }
        /**
         * Keywords associated with the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keywords")
        private String keywords;

        /**
         * Keywords associated with the listing.
         * @param keywords the value to set
         * @return this builder
         **/
        public Builder keywords(String keywords) {
            this.keywords = keywords;
            this.__explicitlySet__.add("keywords");
            return this;
        }
        /**
         * A short description of the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
        private String shortDescription;

        /**
         * A short description of the listing.
         * @param shortDescription the value to set
         * @return this builder
         **/
        public Builder shortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            this.__explicitlySet__.add("shortDescription");
            return this;
        }
        /**
         * Usage information for the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usageInformation")
        private String usageInformation;

        /**
         * Usage information for the listing.
         * @param usageInformation the value to set
         * @return this builder
         **/
        public Builder usageInformation(String usageInformation) {
            this.usageInformation = usageInformation;
            this.__explicitlySet__.add("usageInformation");
            return this;
        }
        /**
         * A long description of the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("longDescription")
        private String longDescription;

        /**
         * A long description of the listing.
         * @param longDescription the value to set
         * @return this builder
         **/
        public Builder longDescription(String longDescription) {
            this.longDescription = longDescription;
            this.__explicitlySet__.add("longDescription");
            return this;
        }
        /**
         * A description of the publisher's licensing model for the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModelDescription")
        private String licenseModelDescription;

        /**
         * A description of the publisher's licensing model for the listing.
         * @param licenseModelDescription the value to set
         * @return this builder
         **/
        public Builder licenseModelDescription(String licenseModelDescription) {
            this.licenseModelDescription = licenseModelDescription;
            this.__explicitlySet__.add("licenseModelDescription");
            return this;
        }
        /**
         * System requirements for the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemRequirements")
        private String systemRequirements;

        /**
         * System requirements for the listing.
         * @param systemRequirements the value to set
         * @return this builder
         **/
        public Builder systemRequirements(String systemRequirements) {
            this.systemRequirements = systemRequirements;
            this.__explicitlySet__.add("systemRequirements");
            return this;
        }
        /**
         * The release date of the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
        private java.util.Date timeReleased;

        /**
         * The release date of the listing.
         * @param timeReleased the value to set
         * @return this builder
         **/
        public Builder timeReleased(java.util.Date timeReleased) {
            this.timeReleased = timeReleased;
            this.__explicitlySet__.add("timeReleased");
            return this;
        }
        /**
         * Release notes for the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("releaseNotes")
        private String releaseNotes;

        /**
         * Release notes for the listing.
         * @param releaseNotes the value to set
         * @return this builder
         **/
        public Builder releaseNotes(String releaseNotes) {
            this.releaseNotes = releaseNotes;
            this.__explicitlySet__.add("releaseNotes");
            return this;
        }
        /**
         * Categories that the listing belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("categories")
        private java.util.List<String> categories;

        /**
         * Categories that the listing belongs to.
         * @param categories the value to set
         * @return this builder
         **/
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
        /**
         * Languages supported by the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("languages")
        private java.util.List<Item> languages;

        /**
         * Languages supported by the listing.
         * @param languages the value to set
         * @return this builder
         **/
        public Builder languages(java.util.List<Item> languages) {
            this.languages = languages;
            this.__explicitlySet__.add("languages");
            return this;
        }
        /**
         * Screenshots of the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("screenshots")
        private java.util.List<Screenshot> screenshots;

        /**
         * Screenshots of the listing.
         * @param screenshots the value to set
         * @return this builder
         **/
        public Builder screenshots(java.util.List<Screenshot> screenshots) {
            this.screenshots = screenshots;
            this.__explicitlySet__.add("screenshots");
            return this;
        }
        /**
         * Videos of the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("videos")
        private java.util.List<NamedLink> videos;

        /**
         * Videos of the listing.
         * @param videos the value to set
         * @return this builder
         **/
        public Builder videos(java.util.List<NamedLink> videos) {
            this.videos = videos;
            this.__explicitlySet__.add("videos");
            return this;
        }
        /**
         * Contact information to use to get support from the publisher for the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("supportContacts")
        private java.util.List<SupportContact> supportContacts;

        /**
         * Contact information to use to get support from the publisher for the listing.
         * @param supportContacts the value to set
         * @return this builder
         **/
        public Builder supportContacts(java.util.List<SupportContact> supportContacts) {
            this.supportContacts = supportContacts;
            this.__explicitlySet__.add("supportContacts");
            return this;
        }
        /**
         * Links to support resources for the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("supportLinks")
        private java.util.List<NamedLink> supportLinks;

        /**
         * Links to support resources for the listing.
         * @param supportLinks the value to set
         * @return this builder
         **/
        public Builder supportLinks(java.util.List<NamedLink> supportLinks) {
            this.supportLinks = supportLinks;
            this.__explicitlySet__.add("supportLinks");
            return this;
        }
        /**
         * Links to additional documentation provided by the publisher specifically for the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("documentationLinks")
        private java.util.List<DocumentationLink> documentationLinks;

        /**
         * Links to additional documentation provided by the publisher specifically for the listing.
         * @param documentationLinks the value to set
         * @return this builder
         **/
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
        /**
         * The list of compatible architectures supported by the listing
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compatibleArchitectures")
        private java.util.List<CompatibleArchitectures> compatibleArchitectures;

        /**
         * The list of compatible architectures supported by the listing
         * @param compatibleArchitectures the value to set
         * @return this builder
         **/
        public Builder compatibleArchitectures(
                java.util.List<CompatibleArchitectures> compatibleArchitectures) {
            this.compatibleArchitectures = compatibleArchitectures;
            this.__explicitlySet__.add("compatibleArchitectures");
            return this;
        }
        /**
         * The regions where you can deploy the listing. (Some listings have restrictions that limit their deployment to United States regions only.)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("regions")
        private java.util.List<Region> regions;

        /**
         * The regions where you can deploy the listing. (Some listings have restrictions that limit their deployment to United States regions only.)
         *
         * @param regions the value to set
         * @return this builder
         **/
        public Builder regions(java.util.List<Region> regions) {
            this.regions = regions;
            this.__explicitlySet__.add("regions");
            return this;
        }
        /**
         * The listing's package type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("packageType")
        private PackageTypeEnum packageType;

        /**
         * The listing's package type.
         * @param packageType the value to set
         * @return this builder
         **/
        public Builder packageType(PackageTypeEnum packageType) {
            this.packageType = packageType;
            this.__explicitlySet__.add("packageType");
            return this;
        }
        /**
         * The default package version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultPackageVersion")
        private String defaultPackageVersion;

        /**
         * The default package version.
         * @param defaultPackageVersion the value to set
         * @return this builder
         **/
        public Builder defaultPackageVersion(String defaultPackageVersion) {
            this.defaultPackageVersion = defaultPackageVersion;
            this.__explicitlySet__.add("defaultPackageVersion");
            return this;
        }
        /**
         * Links to reference material.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("links")
        private java.util.List<Link> links;

        /**
         * Links to reference material.
         * @param links the value to set
         * @return this builder
         **/
        public Builder links(java.util.List<Link> links) {
            this.links = links;
            this.__explicitlySet__.add("links");
            return this;
        }
        /**
         * Indicates whether the listing is included in Featured Listings.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isFeatured")
        private Boolean isFeatured;

        /**
         * Indicates whether the listing is included in Featured Listings.
         * @param isFeatured the value to set
         * @return this builder
         **/
        public Builder isFeatured(Boolean isFeatured) {
            this.isFeatured = isFeatured;
            this.__explicitlySet__.add("isFeatured");
            return this;
        }
        /**
         * The publisher category to which the listing belongs. The publisher category informs where the listing appears for use.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listingType")
        private ListingType listingType;

        /**
         * The publisher category to which the listing belongs. The publisher category informs where the listing appears for use.
         * @param listingType the value to set
         * @return this builder
         **/
        public Builder listingType(ListingType listingType) {
            this.listingType = listingType;
            this.__explicitlySet__.add("listingType");
            return this;
        }
        /**
         * List of operating systems supported by the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("supportedOperatingSystems")
        private java.util.List<OperatingSystem> supportedOperatingSystems;

        /**
         * List of operating systems supported by the listing.
         * @param supportedOperatingSystems the value to set
         * @return this builder
         **/
        public Builder supportedOperatingSystems(
                java.util.List<OperatingSystem> supportedOperatingSystems) {
            this.supportedOperatingSystems = supportedOperatingSystems;
            this.__explicitlySet__.add("supportedOperatingSystems");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Listing build() {
            Listing model =
                    new Listing(
                            this.id,
                            this.name,
                            this.version,
                            this.tagline,
                            this.keywords,
                            this.shortDescription,
                            this.usageInformation,
                            this.longDescription,
                            this.licenseModelDescription,
                            this.systemRequirements,
                            this.timeReleased,
                            this.releaseNotes,
                            this.categories,
                            this.publisher,
                            this.languages,
                            this.screenshots,
                            this.videos,
                            this.supportContacts,
                            this.supportLinks,
                            this.documentationLinks,
                            this.icon,
                            this.banner,
                            this.compatibleArchitectures,
                            this.regions,
                            this.packageType,
                            this.defaultPackageVersion,
                            this.links,
                            this.isFeatured,
                            this.listingType,
                            this.supportedOperatingSystems);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Listing model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("tagline")) {
                this.tagline(model.getTagline());
            }
            if (model.wasPropertyExplicitlySet("keywords")) {
                this.keywords(model.getKeywords());
            }
            if (model.wasPropertyExplicitlySet("shortDescription")) {
                this.shortDescription(model.getShortDescription());
            }
            if (model.wasPropertyExplicitlySet("usageInformation")) {
                this.usageInformation(model.getUsageInformation());
            }
            if (model.wasPropertyExplicitlySet("longDescription")) {
                this.longDescription(model.getLongDescription());
            }
            if (model.wasPropertyExplicitlySet("licenseModelDescription")) {
                this.licenseModelDescription(model.getLicenseModelDescription());
            }
            if (model.wasPropertyExplicitlySet("systemRequirements")) {
                this.systemRequirements(model.getSystemRequirements());
            }
            if (model.wasPropertyExplicitlySet("timeReleased")) {
                this.timeReleased(model.getTimeReleased());
            }
            if (model.wasPropertyExplicitlySet("releaseNotes")) {
                this.releaseNotes(model.getReleaseNotes());
            }
            if (model.wasPropertyExplicitlySet("categories")) {
                this.categories(model.getCategories());
            }
            if (model.wasPropertyExplicitlySet("publisher")) {
                this.publisher(model.getPublisher());
            }
            if (model.wasPropertyExplicitlySet("languages")) {
                this.languages(model.getLanguages());
            }
            if (model.wasPropertyExplicitlySet("screenshots")) {
                this.screenshots(model.getScreenshots());
            }
            if (model.wasPropertyExplicitlySet("videos")) {
                this.videos(model.getVideos());
            }
            if (model.wasPropertyExplicitlySet("supportContacts")) {
                this.supportContacts(model.getSupportContacts());
            }
            if (model.wasPropertyExplicitlySet("supportLinks")) {
                this.supportLinks(model.getSupportLinks());
            }
            if (model.wasPropertyExplicitlySet("documentationLinks")) {
                this.documentationLinks(model.getDocumentationLinks());
            }
            if (model.wasPropertyExplicitlySet("icon")) {
                this.icon(model.getIcon());
            }
            if (model.wasPropertyExplicitlySet("banner")) {
                this.banner(model.getBanner());
            }
            if (model.wasPropertyExplicitlySet("compatibleArchitectures")) {
                this.compatibleArchitectures(model.getCompatibleArchitectures());
            }
            if (model.wasPropertyExplicitlySet("regions")) {
                this.regions(model.getRegions());
            }
            if (model.wasPropertyExplicitlySet("packageType")) {
                this.packageType(model.getPackageType());
            }
            if (model.wasPropertyExplicitlySet("defaultPackageVersion")) {
                this.defaultPackageVersion(model.getDefaultPackageVersion());
            }
            if (model.wasPropertyExplicitlySet("links")) {
                this.links(model.getLinks());
            }
            if (model.wasPropertyExplicitlySet("isFeatured")) {
                this.isFeatured(model.getIsFeatured());
            }
            if (model.wasPropertyExplicitlySet("listingType")) {
                this.listingType(model.getListingType());
            }
            if (model.wasPropertyExplicitlySet("supportedOperatingSystems")) {
                this.supportedOperatingSystems(model.getSupportedOperatingSystems());
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
     * The unique identifier for the listing in Marketplace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique identifier for the listing in Marketplace.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The name of the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the listing.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The version of the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The version of the listing.
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    /**
     * The tagline of the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tagline")
    private final String tagline;

    /**
     * The tagline of the listing.
     * @return the value
     **/
    public String getTagline() {
        return tagline;
    }

    /**
     * Keywords associated with the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keywords")
    private final String keywords;

    /**
     * Keywords associated with the listing.
     * @return the value
     **/
    public String getKeywords() {
        return keywords;
    }

    /**
     * A short description of the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
    private final String shortDescription;

    /**
     * A short description of the listing.
     * @return the value
     **/
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Usage information for the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageInformation")
    private final String usageInformation;

    /**
     * Usage information for the listing.
     * @return the value
     **/
    public String getUsageInformation() {
        return usageInformation;
    }

    /**
     * A long description of the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("longDescription")
    private final String longDescription;

    /**
     * A long description of the listing.
     * @return the value
     **/
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * A description of the publisher's licensing model for the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModelDescription")
    private final String licenseModelDescription;

    /**
     * A description of the publisher's licensing model for the listing.
     * @return the value
     **/
    public String getLicenseModelDescription() {
        return licenseModelDescription;
    }

    /**
     * System requirements for the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemRequirements")
    private final String systemRequirements;

    /**
     * System requirements for the listing.
     * @return the value
     **/
    public String getSystemRequirements() {
        return systemRequirements;
    }

    /**
     * The release date of the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
    private final java.util.Date timeReleased;

    /**
     * The release date of the listing.
     * @return the value
     **/
    public java.util.Date getTimeReleased() {
        return timeReleased;
    }

    /**
     * Release notes for the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("releaseNotes")
    private final String releaseNotes;

    /**
     * Release notes for the listing.
     * @return the value
     **/
    public String getReleaseNotes() {
        return releaseNotes;
    }

    /**
     * Categories that the listing belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("categories")
    private final java.util.List<String> categories;

    /**
     * Categories that the listing belongs to.
     * @return the value
     **/
    public java.util.List<String> getCategories() {
        return categories;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    private final Publisher publisher;

    public Publisher getPublisher() {
        return publisher;
    }

    /**
     * Languages supported by the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("languages")
    private final java.util.List<Item> languages;

    /**
     * Languages supported by the listing.
     * @return the value
     **/
    public java.util.List<Item> getLanguages() {
        return languages;
    }

    /**
     * Screenshots of the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("screenshots")
    private final java.util.List<Screenshot> screenshots;

    /**
     * Screenshots of the listing.
     * @return the value
     **/
    public java.util.List<Screenshot> getScreenshots() {
        return screenshots;
    }

    /**
     * Videos of the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("videos")
    private final java.util.List<NamedLink> videos;

    /**
     * Videos of the listing.
     * @return the value
     **/
    public java.util.List<NamedLink> getVideos() {
        return videos;
    }

    /**
     * Contact information to use to get support from the publisher for the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportContacts")
    private final java.util.List<SupportContact> supportContacts;

    /**
     * Contact information to use to get support from the publisher for the listing.
     * @return the value
     **/
    public java.util.List<SupportContact> getSupportContacts() {
        return supportContacts;
    }

    /**
     * Links to support resources for the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportLinks")
    private final java.util.List<NamedLink> supportLinks;

    /**
     * Links to support resources for the listing.
     * @return the value
     **/
    public java.util.List<NamedLink> getSupportLinks() {
        return supportLinks;
    }

    /**
     * Links to additional documentation provided by the publisher specifically for the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("documentationLinks")
    private final java.util.List<DocumentationLink> documentationLinks;

    /**
     * Links to additional documentation provided by the publisher specifically for the listing.
     * @return the value
     **/
    public java.util.List<DocumentationLink> getDocumentationLinks() {
        return documentationLinks;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("icon")
    private final UploadData icon;

    public UploadData getIcon() {
        return icon;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("banner")
    private final UploadData banner;

    public UploadData getBanner() {
        return banner;
    }

    /**
     **/
    public enum CompatibleArchitectures {
        X86("X86"),
        Arm("ARM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CompatibleArchitectures.class);

        private final String value;
        private static java.util.Map<String, CompatibleArchitectures> map;

        static {
            map = new java.util.HashMap<>();
            for (CompatibleArchitectures v : CompatibleArchitectures.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CompatibleArchitectures(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CompatibleArchitectures create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CompatibleArchitectures', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The list of compatible architectures supported by the listing
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compatibleArchitectures")
    private final java.util.List<CompatibleArchitectures> compatibleArchitectures;

    /**
     * The list of compatible architectures supported by the listing
     * @return the value
     **/
    public java.util.List<CompatibleArchitectures> getCompatibleArchitectures() {
        return compatibleArchitectures;
    }

    /**
     * The regions where you can deploy the listing. (Some listings have restrictions that limit their deployment to United States regions only.)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regions")
    private final java.util.List<Region> regions;

    /**
     * The regions where you can deploy the listing. (Some listings have restrictions that limit their deployment to United States regions only.)
     *
     * @return the value
     **/
    public java.util.List<Region> getRegions() {
        return regions;
    }

    /**
     * The listing's package type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("packageType")
    private final PackageTypeEnum packageType;

    /**
     * The listing's package type.
     * @return the value
     **/
    public PackageTypeEnum getPackageType() {
        return packageType;
    }

    /**
     * The default package version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultPackageVersion")
    private final String defaultPackageVersion;

    /**
     * The default package version.
     * @return the value
     **/
    public String getDefaultPackageVersion() {
        return defaultPackageVersion;
    }

    /**
     * Links to reference material.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("links")
    private final java.util.List<Link> links;

    /**
     * Links to reference material.
     * @return the value
     **/
    public java.util.List<Link> getLinks() {
        return links;
    }

    /**
     * Indicates whether the listing is included in Featured Listings.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFeatured")
    private final Boolean isFeatured;

    /**
     * Indicates whether the listing is included in Featured Listings.
     * @return the value
     **/
    public Boolean getIsFeatured() {
        return isFeatured;
    }

    /**
     * The publisher category to which the listing belongs. The publisher category informs where the listing appears for use.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingType")
    private final ListingType listingType;

    /**
     * The publisher category to which the listing belongs. The publisher category informs where the listing appears for use.
     * @return the value
     **/
    public ListingType getListingType() {
        return listingType;
    }

    /**
     * List of operating systems supported by the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportedOperatingSystems")
    private final java.util.List<OperatingSystem> supportedOperatingSystems;

    /**
     * List of operating systems supported by the listing.
     * @return the value
     **/
    public java.util.List<OperatingSystem> getSupportedOperatingSystems() {
        return supportedOperatingSystems;
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
        sb.append("Listing(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", tagline=").append(String.valueOf(this.tagline));
        sb.append(", keywords=").append(String.valueOf(this.keywords));
        sb.append(", shortDescription=").append(String.valueOf(this.shortDescription));
        sb.append(", usageInformation=").append(String.valueOf(this.usageInformation));
        sb.append(", longDescription=").append(String.valueOf(this.longDescription));
        sb.append(", licenseModelDescription=")
                .append(String.valueOf(this.licenseModelDescription));
        sb.append(", systemRequirements=").append(String.valueOf(this.systemRequirements));
        sb.append(", timeReleased=").append(String.valueOf(this.timeReleased));
        sb.append(", releaseNotes=").append(String.valueOf(this.releaseNotes));
        sb.append(", categories=").append(String.valueOf(this.categories));
        sb.append(", publisher=").append(String.valueOf(this.publisher));
        sb.append(", languages=").append(String.valueOf(this.languages));
        sb.append(", screenshots=").append(String.valueOf(this.screenshots));
        sb.append(", videos=").append(String.valueOf(this.videos));
        sb.append(", supportContacts=").append(String.valueOf(this.supportContacts));
        sb.append(", supportLinks=").append(String.valueOf(this.supportLinks));
        sb.append(", documentationLinks=").append(String.valueOf(this.documentationLinks));
        sb.append(", icon=").append(String.valueOf(this.icon));
        sb.append(", banner=").append(String.valueOf(this.banner));
        sb.append(", compatibleArchitectures=")
                .append(String.valueOf(this.compatibleArchitectures));
        sb.append(", regions=").append(String.valueOf(this.regions));
        sb.append(", packageType=").append(String.valueOf(this.packageType));
        sb.append(", defaultPackageVersion=").append(String.valueOf(this.defaultPackageVersion));
        sb.append(", links=").append(String.valueOf(this.links));
        sb.append(", isFeatured=").append(String.valueOf(this.isFeatured));
        sb.append(", listingType=").append(String.valueOf(this.listingType));
        sb.append(", supportedOperatingSystems=")
                .append(String.valueOf(this.supportedOperatingSystems));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Listing)) {
            return false;
        }

        Listing other = (Listing) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.tagline, other.tagline)
                && java.util.Objects.equals(this.keywords, other.keywords)
                && java.util.Objects.equals(this.shortDescription, other.shortDescription)
                && java.util.Objects.equals(this.usageInformation, other.usageInformation)
                && java.util.Objects.equals(this.longDescription, other.longDescription)
                && java.util.Objects.equals(
                        this.licenseModelDescription, other.licenseModelDescription)
                && java.util.Objects.equals(this.systemRequirements, other.systemRequirements)
                && java.util.Objects.equals(this.timeReleased, other.timeReleased)
                && java.util.Objects.equals(this.releaseNotes, other.releaseNotes)
                && java.util.Objects.equals(this.categories, other.categories)
                && java.util.Objects.equals(this.publisher, other.publisher)
                && java.util.Objects.equals(this.languages, other.languages)
                && java.util.Objects.equals(this.screenshots, other.screenshots)
                && java.util.Objects.equals(this.videos, other.videos)
                && java.util.Objects.equals(this.supportContacts, other.supportContacts)
                && java.util.Objects.equals(this.supportLinks, other.supportLinks)
                && java.util.Objects.equals(this.documentationLinks, other.documentationLinks)
                && java.util.Objects.equals(this.icon, other.icon)
                && java.util.Objects.equals(this.banner, other.banner)
                && java.util.Objects.equals(
                        this.compatibleArchitectures, other.compatibleArchitectures)
                && java.util.Objects.equals(this.regions, other.regions)
                && java.util.Objects.equals(this.packageType, other.packageType)
                && java.util.Objects.equals(this.defaultPackageVersion, other.defaultPackageVersion)
                && java.util.Objects.equals(this.links, other.links)
                && java.util.Objects.equals(this.isFeatured, other.isFeatured)
                && java.util.Objects.equals(this.listingType, other.listingType)
                && java.util.Objects.equals(
                        this.supportedOperatingSystems, other.supportedOperatingSystems)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.tagline == null ? 43 : this.tagline.hashCode());
        result = (result * PRIME) + (this.keywords == null ? 43 : this.keywords.hashCode());
        result =
                (result * PRIME)
                        + (this.shortDescription == null ? 43 : this.shortDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.usageInformation == null ? 43 : this.usageInformation.hashCode());
        result =
                (result * PRIME)
                        + (this.longDescription == null ? 43 : this.longDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.licenseModelDescription == null
                                ? 43
                                : this.licenseModelDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.systemRequirements == null
                                ? 43
                                : this.systemRequirements.hashCode());
        result = (result * PRIME) + (this.timeReleased == null ? 43 : this.timeReleased.hashCode());
        result = (result * PRIME) + (this.releaseNotes == null ? 43 : this.releaseNotes.hashCode());
        result = (result * PRIME) + (this.categories == null ? 43 : this.categories.hashCode());
        result = (result * PRIME) + (this.publisher == null ? 43 : this.publisher.hashCode());
        result = (result * PRIME) + (this.languages == null ? 43 : this.languages.hashCode());
        result = (result * PRIME) + (this.screenshots == null ? 43 : this.screenshots.hashCode());
        result = (result * PRIME) + (this.videos == null ? 43 : this.videos.hashCode());
        result =
                (result * PRIME)
                        + (this.supportContacts == null ? 43 : this.supportContacts.hashCode());
        result = (result * PRIME) + (this.supportLinks == null ? 43 : this.supportLinks.hashCode());
        result =
                (result * PRIME)
                        + (this.documentationLinks == null
                                ? 43
                                : this.documentationLinks.hashCode());
        result = (result * PRIME) + (this.icon == null ? 43 : this.icon.hashCode());
        result = (result * PRIME) + (this.banner == null ? 43 : this.banner.hashCode());
        result =
                (result * PRIME)
                        + (this.compatibleArchitectures == null
                                ? 43
                                : this.compatibleArchitectures.hashCode());
        result = (result * PRIME) + (this.regions == null ? 43 : this.regions.hashCode());
        result = (result * PRIME) + (this.packageType == null ? 43 : this.packageType.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultPackageVersion == null
                                ? 43
                                : this.defaultPackageVersion.hashCode());
        result = (result * PRIME) + (this.links == null ? 43 : this.links.hashCode());
        result = (result * PRIME) + (this.isFeatured == null ? 43 : this.isFeatured.hashCode());
        result = (result * PRIME) + (this.listingType == null ? 43 : this.listingType.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedOperatingSystems == null
                                ? 43
                                : this.supportedOperatingSystems.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
