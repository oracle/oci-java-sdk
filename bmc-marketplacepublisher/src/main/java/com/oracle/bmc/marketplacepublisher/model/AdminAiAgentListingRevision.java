/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Listing revision details for AI agent listings <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AdminAiAgentListingRevision.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "listingType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AdminAiAgentListingRevision extends AdminListingRevision {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("legacyId")
        private String legacyId;

        public Builder legacyId(String legacyId) {
            this.legacyId = legacyId;
            this.__explicitlySet__.add("legacyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("publisherId")
        private String publisherId;

        public Builder publisherId(String publisherId) {
            this.publisherId = publisherId;
            this.__explicitlySet__.add("publisherId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("approverId")
        private String approverId;

        public Builder approverId(String approverId) {
            this.approverId = approverId;
            this.__explicitlySet__.add("approverId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("approverEmail")
        private String approverEmail;

        public Builder approverEmail(String approverEmail) {
            this.approverEmail = approverEmail;
            this.__explicitlySet__.add("approverEmail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("revisionNumber")
        private String revisionNumber;

        public Builder revisionNumber(String revisionNumber) {
            this.revisionNumber = revisionNumber;
            this.__explicitlySet__.add("revisionNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("headline")
        private String headline;

        public Builder headline(String headline) {
            this.headline = headline;
            this.__explicitlySet__.add("headline");
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contentLanguage")
        private LanguageItem contentLanguage;

        public Builder contentLanguage(LanguageItem contentLanguage) {
            this.contentLanguage = contentLanguage;
            this.__explicitlySet__.add("contentLanguage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("supportedlanguages")
        private java.util.List<LanguageItem> supportedlanguages;

        public Builder supportedlanguages(java.util.List<LanguageItem> supportedlanguages) {
            this.supportedlanguages = supportedlanguages;
            this.__explicitlySet__.add("supportedlanguages");
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

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private ListingRevision.Status status;

        public Builder status(ListingRevision.Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("statusNotes")
        private String statusNotes;

        public Builder statusNotes(String statusNotes) {
            this.statusNotes = statusNotes;
            this.__explicitlySet__.add("statusNotes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ListingRevision.LifecycleState lifecycleState;

        public Builder lifecycleState(ListingRevision.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("packageType")
        private PackageType packageType;

        public Builder packageType(PackageType packageType) {
            this.packageType = packageType;
            this.__explicitlySet__.add("packageType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
        private java.util.Map<String, String> extendedMetadata;

        public Builder extendedMetadata(java.util.Map<String, String> extendedMetadata) {
            this.extendedMetadata = extendedMetadata;
            this.__explicitlySet__.add("extendedMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("versionDetails")
        private VersionDetails versionDetails;

        public Builder versionDetails(VersionDetails versionDetails) {
            this.versionDetails = versionDetails;
            this.__explicitlySet__.add("versionDetails");
            return this;
        }
        /** Custom link to the listing */
        @com.fasterxml.jackson.annotation.JsonProperty("vanityUrl")
        private String vanityUrl;

        /**
         * Custom link to the listing
         *
         * @param vanityUrl the value to set
         * @return this builder
         */
        public Builder vanityUrl(String vanityUrl) {
            this.vanityUrl = vanityUrl;
            this.__explicitlySet__.add("vanityUrl");
            return this;
        }
        /** Measurable or compelling value of the agent */
        @com.fasterxml.jackson.annotation.JsonProperty("keyBenefits")
        private String keyBenefits;

        /**
         * Measurable or compelling value of the agent
         *
         * @param keyBenefits the value to set
         * @return this builder
         */
        public Builder keyBenefits(String keyBenefits) {
            this.keyBenefits = keyBenefits;
            this.__explicitlySet__.add("keyBenefits");
            return this;
        }
        /** Capture asset competitive differentiator */
        @com.fasterxml.jackson.annotation.JsonProperty("competitiveDifferentiators")
        private String competitiveDifferentiators;

        /**
         * Capture asset competitive differentiator
         *
         * @param competitiveDifferentiators the value to set
         * @return this builder
         */
        public Builder competitiveDifferentiators(String competitiveDifferentiators) {
            this.competitiveDifferentiators = competitiveDifferentiators;
            this.__explicitlySet__.add("competitiveDifferentiators");
            return this;
        }
        /** Target audience for the asset */
        @com.fasterxml.jackson.annotation.JsonProperty("targetAudience")
        private String targetAudience;

        /**
         * Target audience for the asset
         *
         * @param targetAudience the value to set
         * @return this builder
         */
        public Builder targetAudience(String targetAudience) {
            this.targetAudience = targetAudience;
            this.__explicitlySet__.add("targetAudience");
            return this;
        }
        /** List of industries subscribed by listing. */
        @com.fasterxml.jackson.annotation.JsonProperty("industries")
        private java.util.List<String> industries;

        /**
         * List of industries subscribed by listing.
         *
         * @param industries the value to set
         * @return this builder
         */
        public Builder industries(java.util.List<String> industries) {
            this.industries = industries;
            this.__explicitlySet__.add("industries");
            return this;
        }
        /** Support details based on geographic location */
        @com.fasterxml.jackson.annotation.JsonProperty("geoLocations")
        private java.util.List<GeoLocation> geoLocations;

        /**
         * Support details based on geographic location
         *
         * @param geoLocations the value to set
         * @return this builder
         */
        public Builder geoLocations(java.util.List<GeoLocation> geoLocations) {
            this.geoLocations = geoLocations;
            this.__explicitlySet__.add("geoLocations");
            return this;
        }
        /** Agent asset type */
        @com.fasterxml.jackson.annotation.JsonProperty("assetType")
        private AssetType assetType;

        /**
         * Agent asset type
         *
         * @param assetType the value to set
         * @return this builder
         */
        public Builder assetType(AssetType assetType) {
            this.assetType = assetType;
            this.__explicitlySet__.add("assetType");
            return this;
        }
        /** Work area that surfaces the AI agent */
        @com.fasterxml.jackson.annotation.JsonProperty("location")
        private Location location;

        /**
         * Work area that surfaces the AI agent
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(Location location) {
            this.location = location;
            this.__explicitlySet__.add("location");
            return this;
        }
        /** List of products subscribed by listing. */
        @com.fasterxml.jackson.annotation.JsonProperty("products")
        private java.util.List<AdminListingProduct> products;

        /**
         * List of products subscribed by listing.
         *
         * @param products the value to set
         * @return this builder
         */
        public Builder products(java.util.List<AdminListingProduct> products) {
            this.products = products;
            this.__explicitlySet__.add("products");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdminAiAgentListingRevision build() {
            AdminAiAgentListingRevision model =
                    new AdminAiAgentListingRevision(
                            this.id,
                            this.legacyId,
                            this.listingId,
                            this.compartmentId,
                            this.publisherId,
                            this.approverId,
                            this.approverEmail,
                            this.displayName,
                            this.revisionNumber,
                            this.headline,
                            this.tagline,
                            this.keywords,
                            this.shortDescription,
                            this.usageInformation,
                            this.longDescription,
                            this.timeCreated,
                            this.timeUpdated,
                            this.contentLanguage,
                            this.supportedlanguages,
                            this.supportContacts,
                            this.supportLinks,
                            this.icon,
                            this.banner,
                            this.status,
                            this.statusNotes,
                            this.lifecycleState,
                            this.packageType,
                            this.extendedMetadata,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.versionDetails,
                            this.vanityUrl,
                            this.keyBenefits,
                            this.competitiveDifferentiators,
                            this.targetAudience,
                            this.industries,
                            this.geoLocations,
                            this.assetType,
                            this.location,
                            this.products);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdminAiAgentListingRevision model) {
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
            if (model.wasPropertyExplicitlySet("approverId")) {
                this.approverId(model.getApproverId());
            }
            if (model.wasPropertyExplicitlySet("approverEmail")) {
                this.approverEmail(model.getApproverEmail());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("revisionNumber")) {
                this.revisionNumber(model.getRevisionNumber());
            }
            if (model.wasPropertyExplicitlySet("headline")) {
                this.headline(model.getHeadline());
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
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("contentLanguage")) {
                this.contentLanguage(model.getContentLanguage());
            }
            if (model.wasPropertyExplicitlySet("supportedlanguages")) {
                this.supportedlanguages(model.getSupportedlanguages());
            }
            if (model.wasPropertyExplicitlySet("supportContacts")) {
                this.supportContacts(model.getSupportContacts());
            }
            if (model.wasPropertyExplicitlySet("supportLinks")) {
                this.supportLinks(model.getSupportLinks());
            }
            if (model.wasPropertyExplicitlySet("icon")) {
                this.icon(model.getIcon());
            }
            if (model.wasPropertyExplicitlySet("banner")) {
                this.banner(model.getBanner());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("statusNotes")) {
                this.statusNotes(model.getStatusNotes());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("packageType")) {
                this.packageType(model.getPackageType());
            }
            if (model.wasPropertyExplicitlySet("extendedMetadata")) {
                this.extendedMetadata(model.getExtendedMetadata());
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
            if (model.wasPropertyExplicitlySet("versionDetails")) {
                this.versionDetails(model.getVersionDetails());
            }
            if (model.wasPropertyExplicitlySet("vanityUrl")) {
                this.vanityUrl(model.getVanityUrl());
            }
            if (model.wasPropertyExplicitlySet("keyBenefits")) {
                this.keyBenefits(model.getKeyBenefits());
            }
            if (model.wasPropertyExplicitlySet("competitiveDifferentiators")) {
                this.competitiveDifferentiators(model.getCompetitiveDifferentiators());
            }
            if (model.wasPropertyExplicitlySet("targetAudience")) {
                this.targetAudience(model.getTargetAudience());
            }
            if (model.wasPropertyExplicitlySet("industries")) {
                this.industries(model.getIndustries());
            }
            if (model.wasPropertyExplicitlySet("geoLocations")) {
                this.geoLocations(model.getGeoLocations());
            }
            if (model.wasPropertyExplicitlySet("assetType")) {
                this.assetType(model.getAssetType());
            }
            if (model.wasPropertyExplicitlySet("location")) {
                this.location(model.getLocation());
            }
            if (model.wasPropertyExplicitlySet("products")) {
                this.products(model.getProducts());
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

    @Deprecated
    public AdminAiAgentListingRevision(
            String id,
            String legacyId,
            String listingId,
            String compartmentId,
            String publisherId,
            String approverId,
            String approverEmail,
            String displayName,
            String revisionNumber,
            String headline,
            String tagline,
            String keywords,
            String shortDescription,
            String usageInformation,
            String longDescription,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LanguageItem contentLanguage,
            java.util.List<LanguageItem> supportedlanguages,
            java.util.List<SupportContact> supportContacts,
            java.util.List<NamedLink> supportLinks,
            ListingRevisionIconAttachment icon,
            ListingRevisionBannerAttachment banner,
            ListingRevision.Status status,
            String statusNotes,
            ListingRevision.LifecycleState lifecycleState,
            PackageType packageType,
            java.util.Map<String, String> extendedMetadata,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            VersionDetails versionDetails,
            String vanityUrl,
            String keyBenefits,
            String competitiveDifferentiators,
            String targetAudience,
            java.util.List<String> industries,
            java.util.List<GeoLocation> geoLocations,
            AssetType assetType,
            Location location,
            java.util.List<AdminListingProduct> products) {
        super(
                id,
                legacyId,
                listingId,
                compartmentId,
                publisherId,
                approverId,
                approverEmail,
                displayName,
                revisionNumber,
                headline,
                tagline,
                keywords,
                shortDescription,
                usageInformation,
                longDescription,
                timeCreated,
                timeUpdated,
                contentLanguage,
                supportedlanguages,
                supportContacts,
                supportLinks,
                icon,
                banner,
                status,
                statusNotes,
                lifecycleState,
                packageType,
                extendedMetadata,
                freeformTags,
                definedTags,
                systemTags);
        this.versionDetails = versionDetails;
        this.vanityUrl = vanityUrl;
        this.keyBenefits = keyBenefits;
        this.competitiveDifferentiators = competitiveDifferentiators;
        this.targetAudience = targetAudience;
        this.industries = industries;
        this.geoLocations = geoLocations;
        this.assetType = assetType;
        this.location = location;
        this.products = products;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("versionDetails")
    private final VersionDetails versionDetails;

    public VersionDetails getVersionDetails() {
        return versionDetails;
    }

    /** Custom link to the listing */
    @com.fasterxml.jackson.annotation.JsonProperty("vanityUrl")
    private final String vanityUrl;

    /**
     * Custom link to the listing
     *
     * @return the value
     */
    public String getVanityUrl() {
        return vanityUrl;
    }

    /** Measurable or compelling value of the agent */
    @com.fasterxml.jackson.annotation.JsonProperty("keyBenefits")
    private final String keyBenefits;

    /**
     * Measurable or compelling value of the agent
     *
     * @return the value
     */
    public String getKeyBenefits() {
        return keyBenefits;
    }

    /** Capture asset competitive differentiator */
    @com.fasterxml.jackson.annotation.JsonProperty("competitiveDifferentiators")
    private final String competitiveDifferentiators;

    /**
     * Capture asset competitive differentiator
     *
     * @return the value
     */
    public String getCompetitiveDifferentiators() {
        return competitiveDifferentiators;
    }

    /** Target audience for the asset */
    @com.fasterxml.jackson.annotation.JsonProperty("targetAudience")
    private final String targetAudience;

    /**
     * Target audience for the asset
     *
     * @return the value
     */
    public String getTargetAudience() {
        return targetAudience;
    }

    /** List of industries subscribed by listing. */
    @com.fasterxml.jackson.annotation.JsonProperty("industries")
    private final java.util.List<String> industries;

    /**
     * List of industries subscribed by listing.
     *
     * @return the value
     */
    public java.util.List<String> getIndustries() {
        return industries;
    }

    /** Support details based on geographic location */
    @com.fasterxml.jackson.annotation.JsonProperty("geoLocations")
    private final java.util.List<GeoLocation> geoLocations;

    /**
     * Support details based on geographic location
     *
     * @return the value
     */
    public java.util.List<GeoLocation> getGeoLocations() {
        return geoLocations;
    }

    /** Agent asset type */
    public enum AssetType implements com.oracle.bmc.http.internal.BmcEnum {
        Foundational("FOUNDATIONAL"),
        Team("TEAM"),
        Workflow("WORKFLOW"),
        Application("APPLICATION"),
        Connector("CONNECTOR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AssetType.class);

        private final String value;
        private static java.util.Map<String, AssetType> map;

        static {
            map = new java.util.HashMap<>();
            for (AssetType v : AssetType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AssetType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AssetType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AssetType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Agent asset type */
    @com.fasterxml.jackson.annotation.JsonProperty("assetType")
    private final AssetType assetType;

    /**
     * Agent asset type
     *
     * @return the value
     */
    public AssetType getAssetType() {
        return assetType;
    }

    /** Work area that surfaces the AI agent */
    public enum Location implements com.oracle.bmc.http.internal.BmcEnum {
        Seeded("SEEDED"),
        LeadGen("LEAD_GEN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Location.class);

        private final String value;
        private static java.util.Map<String, Location> map;

        static {
            map = new java.util.HashMap<>();
            for (Location v : Location.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Location(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Location create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Location', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Work area that surfaces the AI agent */
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    private final Location location;

    /**
     * Work area that surfaces the AI agent
     *
     * @return the value
     */
    public Location getLocation() {
        return location;
    }

    /** List of products subscribed by listing. */
    @com.fasterxml.jackson.annotation.JsonProperty("products")
    private final java.util.List<AdminListingProduct> products;

    /**
     * List of products subscribed by listing.
     *
     * @return the value
     */
    public java.util.List<AdminListingProduct> getProducts() {
        return products;
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
        sb.append("AdminAiAgentListingRevision(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", versionDetails=").append(String.valueOf(this.versionDetails));
        sb.append(", vanityUrl=").append(String.valueOf(this.vanityUrl));
        sb.append(", keyBenefits=").append(String.valueOf(this.keyBenefits));
        sb.append(", competitiveDifferentiators=")
                .append(String.valueOf(this.competitiveDifferentiators));
        sb.append(", targetAudience=").append(String.valueOf(this.targetAudience));
        sb.append(", industries=").append(String.valueOf(this.industries));
        sb.append(", geoLocations=").append(String.valueOf(this.geoLocations));
        sb.append(", assetType=").append(String.valueOf(this.assetType));
        sb.append(", location=").append(String.valueOf(this.location));
        sb.append(", products=").append(String.valueOf(this.products));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdminAiAgentListingRevision)) {
            return false;
        }

        AdminAiAgentListingRevision other = (AdminAiAgentListingRevision) o;
        return java.util.Objects.equals(this.versionDetails, other.versionDetails)
                && java.util.Objects.equals(this.vanityUrl, other.vanityUrl)
                && java.util.Objects.equals(this.keyBenefits, other.keyBenefits)
                && java.util.Objects.equals(
                        this.competitiveDifferentiators, other.competitiveDifferentiators)
                && java.util.Objects.equals(this.targetAudience, other.targetAudience)
                && java.util.Objects.equals(this.industries, other.industries)
                && java.util.Objects.equals(this.geoLocations, other.geoLocations)
                && java.util.Objects.equals(this.assetType, other.assetType)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.products, other.products)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.versionDetails == null ? 43 : this.versionDetails.hashCode());
        result = (result * PRIME) + (this.vanityUrl == null ? 43 : this.vanityUrl.hashCode());
        result = (result * PRIME) + (this.keyBenefits == null ? 43 : this.keyBenefits.hashCode());
        result =
                (result * PRIME)
                        + (this.competitiveDifferentiators == null
                                ? 43
                                : this.competitiveDifferentiators.hashCode());
        result =
                (result * PRIME)
                        + (this.targetAudience == null ? 43 : this.targetAudience.hashCode());
        result = (result * PRIME) + (this.industries == null ? 43 : this.industries.hashCode());
        result = (result * PRIME) + (this.geoLocations == null ? 43 : this.geoLocations.hashCode());
        result = (result * PRIME) + (this.assetType == null ? 43 : this.assetType.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.products == null ? 43 : this.products.hashCode());
        return result;
    }
}
