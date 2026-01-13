/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Listing revision details for listings <br>
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
        builder = OciListingRevision.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "listingType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OciListingRevision extends ListingRevision {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
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

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
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
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
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
        /** System requirements for the listing revision. */
        @com.fasterxml.jackson.annotation.JsonProperty("systemRequirements")
        private String systemRequirements;

        /**
         * System requirements for the listing revision.
         *
         * @param systemRequirements the value to set
         * @return this builder
         */
        public Builder systemRequirements(String systemRequirements) {
            this.systemRequirements = systemRequirements;
            this.__explicitlySet__.add("systemRequirements");
            return this;
        }
        /** The pricing model for the listing revision. */
        @com.fasterxml.jackson.annotation.JsonProperty("pricingType")
        private PricingType pricingType;

        /**
         * The pricing model for the listing revision.
         *
         * @param pricingType the value to set
         * @return this builder
         */
        public Builder pricingType(PricingType pricingType) {
            this.pricingType = pricingType;
            this.__explicitlySet__.add("pricingType");
            return this;
        }
        /** List of products subscribed by listing. */
        @com.fasterxml.jackson.annotation.JsonProperty("products")
        private java.util.List<ListingProduct> products;

        /**
         * List of products subscribed by listing.
         *
         * @param products the value to set
         * @return this builder
         */
        public Builder products(java.util.List<ListingProduct> products) {
            this.products = products;
            this.__explicitlySet__.add("products");
            return this;
        }
        /** List of Pricing Plans provided by publisher. */
        @com.fasterxml.jackson.annotation.JsonProperty("pricingPlans")
        private java.util.List<PricingPlan> pricingPlans;

        /**
         * List of Pricing Plans provided by publisher.
         *
         * @param pricingPlans the value to set
         * @return this builder
         */
        public Builder pricingPlans(java.util.List<PricingPlan> pricingPlans) {
            this.pricingPlans = pricingPlans;
            this.__explicitlySet__.add("pricingPlans");
            return this;
        }
        /** Listing availability and Pricing Policy statement. */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityAndPricingPolicy")
        private String availabilityAndPricingPolicy;

        /**
         * Listing availability and Pricing Policy statement.
         *
         * @param availabilityAndPricingPolicy the value to set
         * @return this builder
         */
        public Builder availabilityAndPricingPolicy(String availabilityAndPricingPolicy) {
            this.availabilityAndPricingPolicy = availabilityAndPricingPolicy;
            this.__explicitlySet__.add("availabilityAndPricingPolicy");
            return this;
        }
        /** Allowed tenancies provided when a listing revision is published as private. */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedTenancies")
        private java.util.List<String> allowedTenancies;

        /**
         * Allowed tenancies provided when a listing revision is published as private.
         *
         * @param allowedTenancies the value to set
         * @return this builder
         */
        public Builder allowedTenancies(java.util.List<String> allowedTenancies) {
            this.allowedTenancies = allowedTenancies;
            this.__explicitlySet__.add("allowedTenancies");
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
        /** OCIDs of service listings attached to lead gen listing */
        @com.fasterxml.jackson.annotation.JsonProperty("recommendedServiceProviderListingIds")
        private java.util.List<String> recommendedServiceProviderListingIds;

        /**
         * OCIDs of service listings attached to lead gen listing
         *
         * @param recommendedServiceProviderListingIds the value to set
         * @return this builder
         */
        public Builder recommendedServiceProviderListingIds(
                java.util.List<String> recommendedServiceProviderListingIds) {
            this.recommendedServiceProviderListingIds = recommendedServiceProviderListingIds;
            this.__explicitlySet__.add("recommendedServiceProviderListingIds");
            return this;
        }
        /**
         * Identifies whether publisher allows internal tenancy launches for the listing revision.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("areInternalTenancyLaunchAllowed")
        private Boolean areInternalTenancyLaunchAllowed;

        /**
         * Identifies whether publisher allows internal tenancy launches for the listing revision.
         *
         * @param areInternalTenancyLaunchAllowed the value to set
         * @return this builder
         */
        public Builder areInternalTenancyLaunchAllowed(Boolean areInternalTenancyLaunchAllowed) {
            this.areInternalTenancyLaunchAllowed = areInternalTenancyLaunchAllowed;
            this.__explicitlySet__.add("areInternalTenancyLaunchAllowed");
            return this;
        }
        /** Is this listing rover exportable */
        @com.fasterxml.jackson.annotation.JsonProperty("isRoverExportable")
        private Boolean isRoverExportable;

        /**
         * Is this listing rover exportable
         *
         * @param isRoverExportable the value to set
         * @return this builder
         */
        public Builder isRoverExportable(Boolean isRoverExportable) {
            this.isRoverExportable = isRoverExportable;
            this.__explicitlySet__.add("isRoverExportable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OciListingRevision build() {
            OciListingRevision model =
                    new OciListingRevision(
                            this.id,
                            this.listingId,
                            this.compartmentId,
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
                            this.status,
                            this.statusNotes,
                            this.lifecycleState,
                            this.packageType,
                            this.extendedMetadata,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.versionDetails,
                            this.systemRequirements,
                            this.pricingType,
                            this.products,
                            this.pricingPlans,
                            this.availabilityAndPricingPolicy,
                            this.allowedTenancies,
                            this.vanityUrl,
                            this.recommendedServiceProviderListingIds,
                            this.areInternalTenancyLaunchAllowed,
                            this.isRoverExportable);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OciListingRevision model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("listingId")) {
                this.listingId(model.getListingId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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
            if (model.wasPropertyExplicitlySet("systemRequirements")) {
                this.systemRequirements(model.getSystemRequirements());
            }
            if (model.wasPropertyExplicitlySet("pricingType")) {
                this.pricingType(model.getPricingType());
            }
            if (model.wasPropertyExplicitlySet("products")) {
                this.products(model.getProducts());
            }
            if (model.wasPropertyExplicitlySet("pricingPlans")) {
                this.pricingPlans(model.getPricingPlans());
            }
            if (model.wasPropertyExplicitlySet("availabilityAndPricingPolicy")) {
                this.availabilityAndPricingPolicy(model.getAvailabilityAndPricingPolicy());
            }
            if (model.wasPropertyExplicitlySet("allowedTenancies")) {
                this.allowedTenancies(model.getAllowedTenancies());
            }
            if (model.wasPropertyExplicitlySet("vanityUrl")) {
                this.vanityUrl(model.getVanityUrl());
            }
            if (model.wasPropertyExplicitlySet("recommendedServiceProviderListingIds")) {
                this.recommendedServiceProviderListingIds(
                        model.getRecommendedServiceProviderListingIds());
            }
            if (model.wasPropertyExplicitlySet("areInternalTenancyLaunchAllowed")) {
                this.areInternalTenancyLaunchAllowed(model.getAreInternalTenancyLaunchAllowed());
            }
            if (model.wasPropertyExplicitlySet("isRoverExportable")) {
                this.isRoverExportable(model.getIsRoverExportable());
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
    public OciListingRevision(
            String id,
            String listingId,
            String compartmentId,
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
            Status status,
            String statusNotes,
            LifecycleState lifecycleState,
            PackageType packageType,
            java.util.Map<String, String> extendedMetadata,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            VersionDetails versionDetails,
            String systemRequirements,
            PricingType pricingType,
            java.util.List<ListingProduct> products,
            java.util.List<PricingPlan> pricingPlans,
            String availabilityAndPricingPolicy,
            java.util.List<String> allowedTenancies,
            String vanityUrl,
            java.util.List<String> recommendedServiceProviderListingIds,
            Boolean areInternalTenancyLaunchAllowed,
            Boolean isRoverExportable) {
        super(
                id,
                listingId,
                compartmentId,
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
                status,
                statusNotes,
                lifecycleState,
                packageType,
                extendedMetadata,
                freeformTags,
                definedTags,
                systemTags);
        this.versionDetails = versionDetails;
        this.systemRequirements = systemRequirements;
        this.pricingType = pricingType;
        this.products = products;
        this.pricingPlans = pricingPlans;
        this.availabilityAndPricingPolicy = availabilityAndPricingPolicy;
        this.allowedTenancies = allowedTenancies;
        this.vanityUrl = vanityUrl;
        this.recommendedServiceProviderListingIds = recommendedServiceProviderListingIds;
        this.areInternalTenancyLaunchAllowed = areInternalTenancyLaunchAllowed;
        this.isRoverExportable = isRoverExportable;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("versionDetails")
    private final VersionDetails versionDetails;

    public VersionDetails getVersionDetails() {
        return versionDetails;
    }

    /** System requirements for the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("systemRequirements")
    private final String systemRequirements;

    /**
     * System requirements for the listing revision.
     *
     * @return the value
     */
    public String getSystemRequirements() {
        return systemRequirements;
    }

    /** The pricing model for the listing revision. */
    public enum PricingType implements com.oracle.bmc.http.internal.BmcEnum {
        Free("FREE"),
        Byol("BYOL"),
        Paygo("PAYGO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** The pricing model for the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("pricingType")
    private final PricingType pricingType;

    /**
     * The pricing model for the listing revision.
     *
     * @return the value
     */
    public PricingType getPricingType() {
        return pricingType;
    }

    /** List of products subscribed by listing. */
    @com.fasterxml.jackson.annotation.JsonProperty("products")
    private final java.util.List<ListingProduct> products;

    /**
     * List of products subscribed by listing.
     *
     * @return the value
     */
    public java.util.List<ListingProduct> getProducts() {
        return products;
    }

    /** List of Pricing Plans provided by publisher. */
    @com.fasterxml.jackson.annotation.JsonProperty("pricingPlans")
    private final java.util.List<PricingPlan> pricingPlans;

    /**
     * List of Pricing Plans provided by publisher.
     *
     * @return the value
     */
    public java.util.List<PricingPlan> getPricingPlans() {
        return pricingPlans;
    }

    /** Listing availability and Pricing Policy statement. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityAndPricingPolicy")
    private final String availabilityAndPricingPolicy;

    /**
     * Listing availability and Pricing Policy statement.
     *
     * @return the value
     */
    public String getAvailabilityAndPricingPolicy() {
        return availabilityAndPricingPolicy;
    }

    /** Allowed tenancies provided when a listing revision is published as private. */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedTenancies")
    private final java.util.List<String> allowedTenancies;

    /**
     * Allowed tenancies provided when a listing revision is published as private.
     *
     * @return the value
     */
    public java.util.List<String> getAllowedTenancies() {
        return allowedTenancies;
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

    /** OCIDs of service listings attached to lead gen listing */
    @com.fasterxml.jackson.annotation.JsonProperty("recommendedServiceProviderListingIds")
    private final java.util.List<String> recommendedServiceProviderListingIds;

    /**
     * OCIDs of service listings attached to lead gen listing
     *
     * @return the value
     */
    public java.util.List<String> getRecommendedServiceProviderListingIds() {
        return recommendedServiceProviderListingIds;
    }

    /** Identifies whether publisher allows internal tenancy launches for the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("areInternalTenancyLaunchAllowed")
    private final Boolean areInternalTenancyLaunchAllowed;

    /**
     * Identifies whether publisher allows internal tenancy launches for the listing revision.
     *
     * @return the value
     */
    public Boolean getAreInternalTenancyLaunchAllowed() {
        return areInternalTenancyLaunchAllowed;
    }

    /** Is this listing rover exportable */
    @com.fasterxml.jackson.annotation.JsonProperty("isRoverExportable")
    private final Boolean isRoverExportable;

    /**
     * Is this listing rover exportable
     *
     * @return the value
     */
    public Boolean getIsRoverExportable() {
        return isRoverExportable;
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
        sb.append("OciListingRevision(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", versionDetails=").append(String.valueOf(this.versionDetails));
        sb.append(", systemRequirements=").append(String.valueOf(this.systemRequirements));
        sb.append(", pricingType=").append(String.valueOf(this.pricingType));
        sb.append(", products=").append(String.valueOf(this.products));
        sb.append(", pricingPlans=").append(String.valueOf(this.pricingPlans));
        sb.append(", availabilityAndPricingPolicy=")
                .append(String.valueOf(this.availabilityAndPricingPolicy));
        sb.append(", allowedTenancies=").append(String.valueOf(this.allowedTenancies));
        sb.append(", vanityUrl=").append(String.valueOf(this.vanityUrl));
        sb.append(", recommendedServiceProviderListingIds=")
                .append(String.valueOf(this.recommendedServiceProviderListingIds));
        sb.append(", areInternalTenancyLaunchAllowed=")
                .append(String.valueOf(this.areInternalTenancyLaunchAllowed));
        sb.append(", isRoverExportable=").append(String.valueOf(this.isRoverExportable));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OciListingRevision)) {
            return false;
        }

        OciListingRevision other = (OciListingRevision) o;
        return java.util.Objects.equals(this.versionDetails, other.versionDetails)
                && java.util.Objects.equals(this.systemRequirements, other.systemRequirements)
                && java.util.Objects.equals(this.pricingType, other.pricingType)
                && java.util.Objects.equals(this.products, other.products)
                && java.util.Objects.equals(this.pricingPlans, other.pricingPlans)
                && java.util.Objects.equals(
                        this.availabilityAndPricingPolicy, other.availabilityAndPricingPolicy)
                && java.util.Objects.equals(this.allowedTenancies, other.allowedTenancies)
                && java.util.Objects.equals(this.vanityUrl, other.vanityUrl)
                && java.util.Objects.equals(
                        this.recommendedServiceProviderListingIds,
                        other.recommendedServiceProviderListingIds)
                && java.util.Objects.equals(
                        this.areInternalTenancyLaunchAllowed, other.areInternalTenancyLaunchAllowed)
                && java.util.Objects.equals(this.isRoverExportable, other.isRoverExportable)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.versionDetails == null ? 43 : this.versionDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.systemRequirements == null
                                ? 43
                                : this.systemRequirements.hashCode());
        result = (result * PRIME) + (this.pricingType == null ? 43 : this.pricingType.hashCode());
        result = (result * PRIME) + (this.products == null ? 43 : this.products.hashCode());
        result = (result * PRIME) + (this.pricingPlans == null ? 43 : this.pricingPlans.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityAndPricingPolicy == null
                                ? 43
                                : this.availabilityAndPricingPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedTenancies == null ? 43 : this.allowedTenancies.hashCode());
        result = (result * PRIME) + (this.vanityUrl == null ? 43 : this.vanityUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendedServiceProviderListingIds == null
                                ? 43
                                : this.recommendedServiceProviderListingIds.hashCode());
        result =
                (result * PRIME)
                        + (this.areInternalTenancyLaunchAllowed == null
                                ? 43
                                : this.areInternalTenancyLaunchAllowed.hashCode());
        result =
                (result * PRIME)
                        + (this.isRoverExportable == null ? 43 : this.isRoverExportable.hashCode());
        return result;
    }
}
