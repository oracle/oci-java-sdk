/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * The model for a summary of an Oracle Cloud Infrastructure Marketplace Publisher listing revision.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AdminListingRevisionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AdminListingRevisionSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "legacyId",
        "listingId",
        "compartmentId",
        "publisherId",
        "displayName",
        "status",
        "lifecycleState",
        "packageType",
        "shortDescription",
        "longDescription",
        "pricingPlans",
        "supportedlanguages",
        "supportLinks",
        "systemRequirements",
        "versionDetails",
        "trainedProfessionals",
        "geoLocations",
        "pricingType",
        "markets",
        "tagline",
        "products",
        "icon",
        "banner",
        "demoUrl",
        "industries",
        "listingType",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public AdminListingRevisionSummary(
            String id,
            String legacyId,
            String listingId,
            String compartmentId,
            String publisherId,
            String displayName,
            ListingRevision.Status status,
            ListingRevision.LifecycleState lifecycleState,
            PackageType packageType,
            String shortDescription,
            String longDescription,
            java.util.List<PricingPlan> pricingPlans,
            java.util.List<LanguageItem> supportedlanguages,
            java.util.List<NamedLink> supportLinks,
            String systemRequirements,
            VersionDetails versionDetails,
            java.util.List<TrainedProfessionals> trainedProfessionals,
            java.util.List<GeoLocation> geoLocations,
            PricingType pricingType,
            java.util.List<String> markets,
            String tagline,
            java.util.List<AdminListingProduct> products,
            ListingRevisionIconAttachment icon,
            ListingRevisionBannerAttachment banner,
            String demoUrl,
            java.util.List<String> industries,
            ListingType listingType,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.legacyId = legacyId;
        this.listingId = listingId;
        this.compartmentId = compartmentId;
        this.publisherId = publisherId;
        this.displayName = displayName;
        this.status = status;
        this.lifecycleState = lifecycleState;
        this.packageType = packageType;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.pricingPlans = pricingPlans;
        this.supportedlanguages = supportedlanguages;
        this.supportLinks = supportLinks;
        this.systemRequirements = systemRequirements;
        this.versionDetails = versionDetails;
        this.trainedProfessionals = trainedProfessionals;
        this.geoLocations = geoLocations;
        this.pricingType = pricingType;
        this.markets = markets;
        this.tagline = tagline;
        this.products = products;
        this.icon = icon;
        this.banner = banner;
        this.demoUrl = demoUrl;
        this.industries = industries;
        this.listingType = listingType;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID for the listing revision in Marketplace Publisher.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID for the listing revision in Marketplace Publisher.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The unique legacy identifier for the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("legacyId")
        private String legacyId;

        /**
         * The unique legacy identifier for the listing.
         * @param legacyId the value to set
         * @return this builder
         **/
        public Builder legacyId(String legacyId) {
            this.legacyId = legacyId;
            this.__explicitlySet__.add("legacyId");
            return this;
        }
        /**
         * The OCID for the Listing in Marketplace Publisher.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        /**
         * The OCID for the Listing in Marketplace Publisher.
         * @param listingId the value to set
         * @return this builder
         **/
        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
            return this;
        }
        /**
         * The unique identifier for the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The unique identifier for the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The OCID for the publisher in Marketplace Publisher.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publisherId")
        private String publisherId;

        /**
         * The OCID for the publisher in Marketplace Publisher.
         * @param publisherId the value to set
         * @return this builder
         **/
        public Builder publisherId(String publisherId) {
            this.publisherId = publisherId;
            this.__explicitlySet__.add("publisherId");
            return this;
        }
        /**
         * The display name for the listing revision.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name for the listing revision.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The current status for the listing revision.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private ListingRevision.Status status;

        /**
         * The current status for the listing revision.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(ListingRevision.Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The current state for the listing revision.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ListingRevision.LifecycleState lifecycleState;

        /**
         * The current state for the listing revision.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(ListingRevision.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The listing's package type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("packageType")
        private PackageType packageType;

        /**
         * The listing's package type.
         * @param packageType the value to set
         * @return this builder
         **/
        public Builder packageType(PackageType packageType) {
            this.packageType = packageType;
            this.__explicitlySet__.add("packageType");
            return this;
        }
        /**
         * A short description for the listing revision.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
        private String shortDescription;

        /**
         * A short description for the listing revision.
         * @param shortDescription the value to set
         * @return this builder
         **/
        public Builder shortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            this.__explicitlySet__.add("shortDescription");
            return this;
        }
        /**
         * A long description for the listing revision.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("longDescription")
        private String longDescription;

        /**
         * A long description for the listing revision.
         * @param longDescription the value to set
         * @return this builder
         **/
        public Builder longDescription(String longDescription) {
            this.longDescription = longDescription;
            this.__explicitlySet__.add("longDescription");
            return this;
        }
        /**
         * List of Pricing Plans provided by publisher.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pricingPlans")
        private java.util.List<PricingPlan> pricingPlans;

        /**
         * List of Pricing Plans provided by publisher.
         * @param pricingPlans the value to set
         * @return this builder
         **/
        public Builder pricingPlans(java.util.List<PricingPlan> pricingPlans) {
            this.pricingPlans = pricingPlans;
            this.__explicitlySet__.add("pricingPlans");
            return this;
        }
        /**
         * Languages supported by the publisher for the listing revision.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("supportedlanguages")
        private java.util.List<LanguageItem> supportedlanguages;

        /**
         * Languages supported by the publisher for the listing revision.
         * @param supportedlanguages the value to set
         * @return this builder
         **/
        public Builder supportedlanguages(java.util.List<LanguageItem> supportedlanguages) {
            this.supportedlanguages = supportedlanguages;
            this.__explicitlySet__.add("supportedlanguages");
            return this;
        }
        /**
         * Links to support resources for the listing revision.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("supportLinks")
        private java.util.List<NamedLink> supportLinks;

        /**
         * Links to support resources for the listing revision.
         * @param supportLinks the value to set
         * @return this builder
         **/
        public Builder supportLinks(java.util.List<NamedLink> supportLinks) {
            this.supportLinks = supportLinks;
            this.__explicitlySet__.add("supportLinks");
            return this;
        }
        /**
         * System requirements for the listing revision.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemRequirements")
        private String systemRequirements;

        /**
         * System requirements for the listing revision.
         * @param systemRequirements the value to set
         * @return this builder
         **/
        public Builder systemRequirements(String systemRequirements) {
            this.systemRequirements = systemRequirements;
            this.__explicitlySet__.add("systemRequirements");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("versionDetails")
        private VersionDetails versionDetails;

        public Builder versionDetails(VersionDetails versionDetails) {
            this.versionDetails = versionDetails;
            this.__explicitlySet__.add("versionDetails");
            return this;
        }
        /**
         * Number of trained professional per product
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("trainedProfessionals")
        private java.util.List<TrainedProfessionals> trainedProfessionals;

        /**
         * Number of trained professional per product
         * @param trainedProfessionals the value to set
         * @return this builder
         **/
        public Builder trainedProfessionals(
                java.util.List<TrainedProfessionals> trainedProfessionals) {
            this.trainedProfessionals = trainedProfessionals;
            this.__explicitlySet__.add("trainedProfessionals");
            return this;
        }
        /**
         * Support details based on geographic location
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("geoLocations")
        private java.util.List<GeoLocation> geoLocations;

        /**
         * Support details based on geographic location
         * @param geoLocations the value to set
         * @return this builder
         **/
        public Builder geoLocations(java.util.List<GeoLocation> geoLocations) {
            this.geoLocations = geoLocations;
            this.__explicitlySet__.add("geoLocations");
            return this;
        }
        /**
         * The pricing model for the listing revision.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pricingType")
        private PricingType pricingType;

        /**
         * The pricing model for the listing revision.
         * @param pricingType the value to set
         * @return this builder
         **/
        public Builder pricingType(PricingType pricingType) {
            this.pricingType = pricingType;
            this.__explicitlySet__.add("pricingType");
            return this;
        }
        /**
         * Markets associated with Listing revision.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("markets")
        private java.util.List<String> markets;

        /**
         * Markets associated with Listing revision.
         * @param markets the value to set
         * @return this builder
         **/
        public Builder markets(java.util.List<String> markets) {
            this.markets = markets;
            this.__explicitlySet__.add("markets");
            return this;
        }
        /**
         * The tagline for the listing revision.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tagline")
        private String tagline;

        /**
         * The tagline for the listing revision.
         * @param tagline the value to set
         * @return this builder
         **/
        public Builder tagline(String tagline) {
            this.tagline = tagline;
            this.__explicitlySet__.add("tagline");
            return this;
        }
        /**
         * List of Admin Products subscribed by listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("products")
        private java.util.List<AdminListingProduct> products;

        /**
         * List of Admin Products subscribed by listing.
         * @param products the value to set
         * @return this builder
         **/
        public Builder products(java.util.List<AdminListingProduct> products) {
            this.products = products;
            this.__explicitlySet__.add("products");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("icon")
        private ListingRevisionIconAttachment icon;

        public Builder icon(ListingRevisionIconAttachment icon) {
            this.icon = icon;
            this.__explicitlySet__.add("icon");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("banner")
        private ListingRevisionBannerAttachment banner;

        public Builder banner(ListingRevisionBannerAttachment banner) {
            this.banner = banner;
            this.__explicitlySet__.add("banner");
            return this;
        }
        /**
         * Url to demo of the listing
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("demoUrl")
        private String demoUrl;

        /**
         * Url to demo of the listing
         * @param demoUrl the value to set
         * @return this builder
         **/
        public Builder demoUrl(String demoUrl) {
            this.demoUrl = demoUrl;
            this.__explicitlySet__.add("demoUrl");
            return this;
        }
        /**
         * List of industries subscribed by listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("industries")
        private java.util.List<String> industries;

        /**
         * List of industries subscribed by listing.
         * @param industries the value to set
         * @return this builder
         **/
        public Builder industries(java.util.List<String> industries) {
            this.industries = industries;
            this.__explicitlySet__.add("industries");
            return this;
        }
        /**
         * The listing's type. Populated from the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listingType")
        private ListingType listingType;

        /**
         * The listing's type. Populated from the listing.
         * @param listingType the value to set
         * @return this builder
         **/
        public Builder listingType(ListingType listingType) {
            this.listingType = listingType;
            this.__explicitlySet__.add("listingType");
            return this;
        }
        /**
         * The date and time the listing revision was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         * Example: {@code 2022-09-15T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the listing revision was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         * Example: {@code 2022-09-15T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the listing revision was updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         * Example: {@code 2022-09-15T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the listing revision was updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         * Example: {@code 2022-09-15T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdminListingRevisionSummary build() {
            AdminListingRevisionSummary model =
                    new AdminListingRevisionSummary(
                            this.id,
                            this.legacyId,
                            this.listingId,
                            this.compartmentId,
                            this.publisherId,
                            this.displayName,
                            this.status,
                            this.lifecycleState,
                            this.packageType,
                            this.shortDescription,
                            this.longDescription,
                            this.pricingPlans,
                            this.supportedlanguages,
                            this.supportLinks,
                            this.systemRequirements,
                            this.versionDetails,
                            this.trainedProfessionals,
                            this.geoLocations,
                            this.pricingType,
                            this.markets,
                            this.tagline,
                            this.products,
                            this.icon,
                            this.banner,
                            this.demoUrl,
                            this.industries,
                            this.listingType,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdminListingRevisionSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("legacyId")) {
                this.legacyId(model.getLegacyId());
            }
            if (model.wasPropertyExplicitlySet("listingId")) {
                this.listingId(model.getListingId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("publisherId")) {
                this.publisherId(model.getPublisherId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("packageType")) {
                this.packageType(model.getPackageType());
            }
            if (model.wasPropertyExplicitlySet("shortDescription")) {
                this.shortDescription(model.getShortDescription());
            }
            if (model.wasPropertyExplicitlySet("longDescription")) {
                this.longDescription(model.getLongDescription());
            }
            if (model.wasPropertyExplicitlySet("pricingPlans")) {
                this.pricingPlans(model.getPricingPlans());
            }
            if (model.wasPropertyExplicitlySet("supportedlanguages")) {
                this.supportedlanguages(model.getSupportedlanguages());
            }
            if (model.wasPropertyExplicitlySet("supportLinks")) {
                this.supportLinks(model.getSupportLinks());
            }
            if (model.wasPropertyExplicitlySet("systemRequirements")) {
                this.systemRequirements(model.getSystemRequirements());
            }
            if (model.wasPropertyExplicitlySet("versionDetails")) {
                this.versionDetails(model.getVersionDetails());
            }
            if (model.wasPropertyExplicitlySet("trainedProfessionals")) {
                this.trainedProfessionals(model.getTrainedProfessionals());
            }
            if (model.wasPropertyExplicitlySet("geoLocations")) {
                this.geoLocations(model.getGeoLocations());
            }
            if (model.wasPropertyExplicitlySet("pricingType")) {
                this.pricingType(model.getPricingType());
            }
            if (model.wasPropertyExplicitlySet("markets")) {
                this.markets(model.getMarkets());
            }
            if (model.wasPropertyExplicitlySet("tagline")) {
                this.tagline(model.getTagline());
            }
            if (model.wasPropertyExplicitlySet("products")) {
                this.products(model.getProducts());
            }
            if (model.wasPropertyExplicitlySet("icon")) {
                this.icon(model.getIcon());
            }
            if (model.wasPropertyExplicitlySet("banner")) {
                this.banner(model.getBanner());
            }
            if (model.wasPropertyExplicitlySet("demoUrl")) {
                this.demoUrl(model.getDemoUrl());
            }
            if (model.wasPropertyExplicitlySet("industries")) {
                this.industries(model.getIndustries());
            }
            if (model.wasPropertyExplicitlySet("listingType")) {
                this.listingType(model.getListingType());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
     * The OCID for the listing revision in Marketplace Publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID for the listing revision in Marketplace Publisher.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The unique legacy identifier for the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("legacyId")
    private final String legacyId;

    /**
     * The unique legacy identifier for the listing.
     * @return the value
     **/
    public String getLegacyId() {
        return legacyId;
    }

    /**
     * The OCID for the Listing in Marketplace Publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingId")
    private final String listingId;

    /**
     * The OCID for the Listing in Marketplace Publisher.
     * @return the value
     **/
    public String getListingId() {
        return listingId;
    }

    /**
     * The unique identifier for the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The unique identifier for the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The OCID for the publisher in Marketplace Publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publisherId")
    private final String publisherId;

    /**
     * The OCID for the publisher in Marketplace Publisher.
     * @return the value
     **/
    public String getPublisherId() {
        return publisherId;
    }

    /**
     * The display name for the listing revision.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name for the listing revision.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The current status for the listing revision.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final ListingRevision.Status status;

    /**
     * The current status for the listing revision.
     * @return the value
     **/
    public ListingRevision.Status getStatus() {
        return status;
    }

    /**
     * The current state for the listing revision.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ListingRevision.LifecycleState lifecycleState;

    /**
     * The current state for the listing revision.
     * @return the value
     **/
    public ListingRevision.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The listing's package type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("packageType")
    private final PackageType packageType;

    /**
     * The listing's package type.
     * @return the value
     **/
    public PackageType getPackageType() {
        return packageType;
    }

    /**
     * A short description for the listing revision.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
    private final String shortDescription;

    /**
     * A short description for the listing revision.
     * @return the value
     **/
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * A long description for the listing revision.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("longDescription")
    private final String longDescription;

    /**
     * A long description for the listing revision.
     * @return the value
     **/
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * List of Pricing Plans provided by publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pricingPlans")
    private final java.util.List<PricingPlan> pricingPlans;

    /**
     * List of Pricing Plans provided by publisher.
     * @return the value
     **/
    public java.util.List<PricingPlan> getPricingPlans() {
        return pricingPlans;
    }

    /**
     * Languages supported by the publisher for the listing revision.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportedlanguages")
    private final java.util.List<LanguageItem> supportedlanguages;

    /**
     * Languages supported by the publisher for the listing revision.
     * @return the value
     **/
    public java.util.List<LanguageItem> getSupportedlanguages() {
        return supportedlanguages;
    }

    /**
     * Links to support resources for the listing revision.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportLinks")
    private final java.util.List<NamedLink> supportLinks;

    /**
     * Links to support resources for the listing revision.
     * @return the value
     **/
    public java.util.List<NamedLink> getSupportLinks() {
        return supportLinks;
    }

    /**
     * System requirements for the listing revision.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemRequirements")
    private final String systemRequirements;

    /**
     * System requirements for the listing revision.
     * @return the value
     **/
    public String getSystemRequirements() {
        return systemRequirements;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("versionDetails")
    private final VersionDetails versionDetails;

    public VersionDetails getVersionDetails() {
        return versionDetails;
    }

    /**
     * Number of trained professional per product
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trainedProfessionals")
    private final java.util.List<TrainedProfessionals> trainedProfessionals;

    /**
     * Number of trained professional per product
     * @return the value
     **/
    public java.util.List<TrainedProfessionals> getTrainedProfessionals() {
        return trainedProfessionals;
    }

    /**
     * Support details based on geographic location
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("geoLocations")
    private final java.util.List<GeoLocation> geoLocations;

    /**
     * Support details based on geographic location
     * @return the value
     **/
    public java.util.List<GeoLocation> getGeoLocations() {
        return geoLocations;
    }

    /**
     * The pricing model for the listing revision.
     **/
    public enum PricingType {
        Free("FREE"),
        Byol("BYOL"),
        Paygo("PAYGO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PricingType.class);

        private final String value;
        private static java.util.Map<String, PricingType> map;

        static {
            map = new java.util.HashMap<>();
            for (PricingType v : PricingType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PricingType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PricingType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PricingType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The pricing model for the listing revision.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pricingType")
    private final PricingType pricingType;

    /**
     * The pricing model for the listing revision.
     * @return the value
     **/
    public PricingType getPricingType() {
        return pricingType;
    }

    /**
     * Markets associated with Listing revision.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("markets")
    private final java.util.List<String> markets;

    /**
     * Markets associated with Listing revision.
     * @return the value
     **/
    public java.util.List<String> getMarkets() {
        return markets;
    }

    /**
     * The tagline for the listing revision.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tagline")
    private final String tagline;

    /**
     * The tagline for the listing revision.
     * @return the value
     **/
    public String getTagline() {
        return tagline;
    }

    /**
     * List of Admin Products subscribed by listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("products")
    private final java.util.List<AdminListingProduct> products;

    /**
     * List of Admin Products subscribed by listing.
     * @return the value
     **/
    public java.util.List<AdminListingProduct> getProducts() {
        return products;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("icon")
    private final ListingRevisionIconAttachment icon;

    public ListingRevisionIconAttachment getIcon() {
        return icon;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("banner")
    private final ListingRevisionBannerAttachment banner;

    public ListingRevisionBannerAttachment getBanner() {
        return banner;
    }

    /**
     * Url to demo of the listing
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("demoUrl")
    private final String demoUrl;

    /**
     * Url to demo of the listing
     * @return the value
     **/
    public String getDemoUrl() {
        return demoUrl;
    }

    /**
     * List of industries subscribed by listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("industries")
    private final java.util.List<String> industries;

    /**
     * List of industries subscribed by listing.
     * @return the value
     **/
    public java.util.List<String> getIndustries() {
        return industries;
    }

    /**
     * The listing's type. Populated from the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingType")
    private final ListingType listingType;

    /**
     * The listing's type. Populated from the listing.
     * @return the value
     **/
    public ListingType getListingType() {
        return listingType;
    }

    /**
     * The date and time the listing revision was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2022-09-15T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the listing revision was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2022-09-15T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the listing revision was updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2022-09-15T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the listing revision was updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2022-09-15T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("AdminListingRevisionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", legacyId=").append(String.valueOf(this.legacyId));
        sb.append(", listingId=").append(String.valueOf(this.listingId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", publisherId=").append(String.valueOf(this.publisherId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", packageType=").append(String.valueOf(this.packageType));
        sb.append(", shortDescription=").append(String.valueOf(this.shortDescription));
        sb.append(", longDescription=").append(String.valueOf(this.longDescription));
        sb.append(", pricingPlans=").append(String.valueOf(this.pricingPlans));
        sb.append(", supportedlanguages=").append(String.valueOf(this.supportedlanguages));
        sb.append(", supportLinks=").append(String.valueOf(this.supportLinks));
        sb.append(", systemRequirements=").append(String.valueOf(this.systemRequirements));
        sb.append(", versionDetails=").append(String.valueOf(this.versionDetails));
        sb.append(", trainedProfessionals=").append(String.valueOf(this.trainedProfessionals));
        sb.append(", geoLocations=").append(String.valueOf(this.geoLocations));
        sb.append(", pricingType=").append(String.valueOf(this.pricingType));
        sb.append(", markets=").append(String.valueOf(this.markets));
        sb.append(", tagline=").append(String.valueOf(this.tagline));
        sb.append(", products=").append(String.valueOf(this.products));
        sb.append(", icon=").append(String.valueOf(this.icon));
        sb.append(", banner=").append(String.valueOf(this.banner));
        sb.append(", demoUrl=").append(String.valueOf(this.demoUrl));
        sb.append(", industries=").append(String.valueOf(this.industries));
        sb.append(", listingType=").append(String.valueOf(this.listingType));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdminListingRevisionSummary)) {
            return false;
        }

        AdminListingRevisionSummary other = (AdminListingRevisionSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.legacyId, other.legacyId)
                && java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.publisherId, other.publisherId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.packageType, other.packageType)
                && java.util.Objects.equals(this.shortDescription, other.shortDescription)
                && java.util.Objects.equals(this.longDescription, other.longDescription)
                && java.util.Objects.equals(this.pricingPlans, other.pricingPlans)
                && java.util.Objects.equals(this.supportedlanguages, other.supportedlanguages)
                && java.util.Objects.equals(this.supportLinks, other.supportLinks)
                && java.util.Objects.equals(this.systemRequirements, other.systemRequirements)
                && java.util.Objects.equals(this.versionDetails, other.versionDetails)
                && java.util.Objects.equals(this.trainedProfessionals, other.trainedProfessionals)
                && java.util.Objects.equals(this.geoLocations, other.geoLocations)
                && java.util.Objects.equals(this.pricingType, other.pricingType)
                && java.util.Objects.equals(this.markets, other.markets)
                && java.util.Objects.equals(this.tagline, other.tagline)
                && java.util.Objects.equals(this.products, other.products)
                && java.util.Objects.equals(this.icon, other.icon)
                && java.util.Objects.equals(this.banner, other.banner)
                && java.util.Objects.equals(this.demoUrl, other.demoUrl)
                && java.util.Objects.equals(this.industries, other.industries)
                && java.util.Objects.equals(this.listingType, other.listingType)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.legacyId == null ? 43 : this.legacyId.hashCode());
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.publisherId == null ? 43 : this.publisherId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.packageType == null ? 43 : this.packageType.hashCode());
        result =
                (result * PRIME)
                        + (this.shortDescription == null ? 43 : this.shortDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.longDescription == null ? 43 : this.longDescription.hashCode());
        result = (result * PRIME) + (this.pricingPlans == null ? 43 : this.pricingPlans.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedlanguages == null
                                ? 43
                                : this.supportedlanguages.hashCode());
        result = (result * PRIME) + (this.supportLinks == null ? 43 : this.supportLinks.hashCode());
        result =
                (result * PRIME)
                        + (this.systemRequirements == null
                                ? 43
                                : this.systemRequirements.hashCode());
        result =
                (result * PRIME)
                        + (this.versionDetails == null ? 43 : this.versionDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.trainedProfessionals == null
                                ? 43
                                : this.trainedProfessionals.hashCode());
        result = (result * PRIME) + (this.geoLocations == null ? 43 : this.geoLocations.hashCode());
        result = (result * PRIME) + (this.pricingType == null ? 43 : this.pricingType.hashCode());
        result = (result * PRIME) + (this.markets == null ? 43 : this.markets.hashCode());
        result = (result * PRIME) + (this.tagline == null ? 43 : this.tagline.hashCode());
        result = (result * PRIME) + (this.products == null ? 43 : this.products.hashCode());
        result = (result * PRIME) + (this.icon == null ? 43 : this.icon.hashCode());
        result = (result * PRIME) + (this.banner == null ? 43 : this.banner.hashCode());
        result = (result * PRIME) + (this.demoUrl == null ? 43 : this.demoUrl.hashCode());
        result = (result * PRIME) + (this.industries == null ? 43 : this.industries.hashCode());
        result = (result * PRIME) + (this.listingType == null ? 43 : this.listingType.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
