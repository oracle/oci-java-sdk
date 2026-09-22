/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Listing revision details for listings
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
    builder = AdminOciListingRevision.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "listingType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AdminOciListingRevision extends AdminListingRevision {
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
        /**
         * The pricing model for the listing revision.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pricingType")
        private OciListingRevision.PricingType pricingType;

        /**
         * The pricing model for the listing revision.
         * @param pricingType the value to set
         * @return this builder
         **/
        public Builder pricingType(OciListingRevision.PricingType pricingType) {
            this.pricingType = pricingType;
            this.__explicitlySet__.add("pricingType");
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
        /**
         * List of Products subscribed by listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("products")
        private java.util.List<AdminListingProduct> products;

        /**
         * List of Products subscribed by listing.
         * @param products the value to set
         * @return this builder
         **/
        public Builder products(java.util.List<AdminListingProduct> products) {
            this.products = products;
            this.__explicitlySet__.add("products");
            return this;
        }
        /**
         * The url provided by partner for the registration of subscription.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("partnerRegistrationUrl")
        private String partnerRegistrationUrl;

        /**
         * The url provided by partner for the registration of subscription.
         * @param partnerRegistrationUrl the value to set
         * @return this builder
         **/
        public Builder partnerRegistrationUrl(String partnerRegistrationUrl) {
            this.partnerRegistrationUrl = partnerRegistrationUrl;
            this.__explicitlySet__.add("partnerRegistrationUrl");
            return this;
        }
        /**
         * The unique id of the term attached to the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("termId")
        private String termId;

        /**
         * The unique id of the term attached to the listing.
         * @param termId the value to set
         * @return this builder
         **/
        public Builder termId(String termId) {
            this.termId = termId;
            this.__explicitlySet__.add("termId");
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
         * The markets where the listing will be published.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("markets")
        private java.util.List<AdminMarket> markets;

        /**
         * The markets where the listing will be published.
         *
         * @param markets the value to set
         * @return this builder
         **/
        public Builder markets(java.util.List<AdminMarket> markets) {
            this.markets = markets;
            this.__explicitlySet__.add("markets");
            return this;
        }
        /**
         * Allowed tenancies provided when a listing revision is published as private.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allowedTenancies")
        private java.util.List<String> allowedTenancies;

        /**
         * Allowed tenancies provided when a listing revision is published as private.
         * @param allowedTenancies the value to set
         * @return this builder
         **/
        public Builder allowedTenancies(java.util.List<String> allowedTenancies) {
            this.allowedTenancies = allowedTenancies;
            this.__explicitlySet__.add("allowedTenancies");
            return this;
        }
        /**
         * Identifies whether publisher allows internal tenancy launches for the listing revision.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("areInternalTenancyLaunchAllowed")
        private Boolean areInternalTenancyLaunchAllowed;

        /**
         * Identifies whether publisher allows internal tenancy launches for the listing revision.
         * @param areInternalTenancyLaunchAllowed the value to set
         * @return this builder
         **/
        public Builder areInternalTenancyLaunchAllowed(Boolean areInternalTenancyLaunchAllowed) {
            this.areInternalTenancyLaunchAllowed = areInternalTenancyLaunchAllowed;
            this.__explicitlySet__.add("areInternalTenancyLaunchAllowed");
            return this;
        }
        /**
         * Is this listing rover exportable
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRoverExportable")
        private Boolean isRoverExportable;

        /**
         * Is this listing rover exportable
         * @param isRoverExportable the value to set
         * @return this builder
         **/
        public Builder isRoverExportable(Boolean isRoverExportable) {
            this.isRoverExportable = isRoverExportable;
            this.__explicitlySet__.add("isRoverExportable");
            return this;
        }
        /**
         * Custom link to the listing
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vanityUrl")
        private String vanityUrl;

        /**
         * Custom link to the listing
         * @param vanityUrl the value to set
         * @return this builder
         **/
        public Builder vanityUrl(String vanityUrl) {
            this.vanityUrl = vanityUrl;
            this.__explicitlySet__.add("vanityUrl");
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
         * Url to training resources of the listing
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("selfPacedTrainingUrl")
        private String selfPacedTrainingUrl;

        /**
         * Url to training resources of the listing
         * @param selfPacedTrainingUrl the value to set
         * @return this builder
         **/
        public Builder selfPacedTrainingUrl(String selfPacedTrainingUrl) {
            this.selfPacedTrainingUrl = selfPacedTrainingUrl;
            this.__explicitlySet__.add("selfPacedTrainingUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdminOciListingRevision build() {
            AdminOciListingRevision model =
                    new AdminOciListingRevision(
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
                            this.pricingType,
                            this.systemRequirements,
                            this.products,
                            this.partnerRegistrationUrl,
                            this.termId,
                            this.pricingPlans,
                            this.markets,
                            this.allowedTenancies,
                            this.areInternalTenancyLaunchAllowed,
                            this.isRoverExportable,
                            this.vanityUrl,
                            this.demoUrl,
                            this.selfPacedTrainingUrl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdminOciListingRevision model) {
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
            if (model.wasPropertyExplicitlySet("pricingType")) {
                this.pricingType(model.getPricingType());
            }
            if (model.wasPropertyExplicitlySet("systemRequirements")) {
                this.systemRequirements(model.getSystemRequirements());
            }
            if (model.wasPropertyExplicitlySet("products")) {
                this.products(model.getProducts());
            }
            if (model.wasPropertyExplicitlySet("partnerRegistrationUrl")) {
                this.partnerRegistrationUrl(model.getPartnerRegistrationUrl());
            }
            if (model.wasPropertyExplicitlySet("termId")) {
                this.termId(model.getTermId());
            }
            if (model.wasPropertyExplicitlySet("pricingPlans")) {
                this.pricingPlans(model.getPricingPlans());
            }
            if (model.wasPropertyExplicitlySet("markets")) {
                this.markets(model.getMarkets());
            }
            if (model.wasPropertyExplicitlySet("allowedTenancies")) {
                this.allowedTenancies(model.getAllowedTenancies());
            }
            if (model.wasPropertyExplicitlySet("areInternalTenancyLaunchAllowed")) {
                this.areInternalTenancyLaunchAllowed(model.getAreInternalTenancyLaunchAllowed());
            }
            if (model.wasPropertyExplicitlySet("isRoverExportable")) {
                this.isRoverExportable(model.getIsRoverExportable());
            }
            if (model.wasPropertyExplicitlySet("vanityUrl")) {
                this.vanityUrl(model.getVanityUrl());
            }
            if (model.wasPropertyExplicitlySet("demoUrl")) {
                this.demoUrl(model.getDemoUrl());
            }
            if (model.wasPropertyExplicitlySet("selfPacedTrainingUrl")) {
                this.selfPacedTrainingUrl(model.getSelfPacedTrainingUrl());
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
    public AdminOciListingRevision(
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
            OciListingRevision.PricingType pricingType,
            String systemRequirements,
            java.util.List<AdminListingProduct> products,
            String partnerRegistrationUrl,
            String termId,
            java.util.List<PricingPlan> pricingPlans,
            java.util.List<AdminMarket> markets,
            java.util.List<String> allowedTenancies,
            Boolean areInternalTenancyLaunchAllowed,
            Boolean isRoverExportable,
            String vanityUrl,
            String demoUrl,
            String selfPacedTrainingUrl) {
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
        this.pricingType = pricingType;
        this.systemRequirements = systemRequirements;
        this.products = products;
        this.partnerRegistrationUrl = partnerRegistrationUrl;
        this.termId = termId;
        this.pricingPlans = pricingPlans;
        this.markets = markets;
        this.allowedTenancies = allowedTenancies;
        this.areInternalTenancyLaunchAllowed = areInternalTenancyLaunchAllowed;
        this.isRoverExportable = isRoverExportable;
        this.vanityUrl = vanityUrl;
        this.demoUrl = demoUrl;
        this.selfPacedTrainingUrl = selfPacedTrainingUrl;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("versionDetails")
    private final VersionDetails versionDetails;

    public VersionDetails getVersionDetails() {
        return versionDetails;
    }

    /**
     * The pricing model for the listing revision.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pricingType")
    private final OciListingRevision.PricingType pricingType;

    /**
     * The pricing model for the listing revision.
     * @return the value
     **/
    public OciListingRevision.PricingType getPricingType() {
        return pricingType;
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

    /**
     * List of Products subscribed by listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("products")
    private final java.util.List<AdminListingProduct> products;

    /**
     * List of Products subscribed by listing.
     * @return the value
     **/
    public java.util.List<AdminListingProduct> getProducts() {
        return products;
    }

    /**
     * The url provided by partner for the registration of subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partnerRegistrationUrl")
    private final String partnerRegistrationUrl;

    /**
     * The url provided by partner for the registration of subscription.
     * @return the value
     **/
    public String getPartnerRegistrationUrl() {
        return partnerRegistrationUrl;
    }

    /**
     * The unique id of the term attached to the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("termId")
    private final String termId;

    /**
     * The unique id of the term attached to the listing.
     * @return the value
     **/
    public String getTermId() {
        return termId;
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
     * The markets where the listing will be published.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("markets")
    private final java.util.List<AdminMarket> markets;

    /**
     * The markets where the listing will be published.
     *
     * @return the value
     **/
    public java.util.List<AdminMarket> getMarkets() {
        return markets;
    }

    /**
     * Allowed tenancies provided when a listing revision is published as private.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedTenancies")
    private final java.util.List<String> allowedTenancies;

    /**
     * Allowed tenancies provided when a listing revision is published as private.
     * @return the value
     **/
    public java.util.List<String> getAllowedTenancies() {
        return allowedTenancies;
    }

    /**
     * Identifies whether publisher allows internal tenancy launches for the listing revision.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areInternalTenancyLaunchAllowed")
    private final Boolean areInternalTenancyLaunchAllowed;

    /**
     * Identifies whether publisher allows internal tenancy launches for the listing revision.
     * @return the value
     **/
    public Boolean getAreInternalTenancyLaunchAllowed() {
        return areInternalTenancyLaunchAllowed;
    }

    /**
     * Is this listing rover exportable
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRoverExportable")
    private final Boolean isRoverExportable;

    /**
     * Is this listing rover exportable
     * @return the value
     **/
    public Boolean getIsRoverExportable() {
        return isRoverExportable;
    }

    /**
     * Custom link to the listing
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vanityUrl")
    private final String vanityUrl;

    /**
     * Custom link to the listing
     * @return the value
     **/
    public String getVanityUrl() {
        return vanityUrl;
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
     * Url to training resources of the listing
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("selfPacedTrainingUrl")
    private final String selfPacedTrainingUrl;

    /**
     * Url to training resources of the listing
     * @return the value
     **/
    public String getSelfPacedTrainingUrl() {
        return selfPacedTrainingUrl;
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
        sb.append("AdminOciListingRevision(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", versionDetails=").append(String.valueOf(this.versionDetails));
        sb.append(", pricingType=").append(String.valueOf(this.pricingType));
        sb.append(", systemRequirements=").append(String.valueOf(this.systemRequirements));
        sb.append(", products=").append(String.valueOf(this.products));
        sb.append(", partnerRegistrationUrl=").append(String.valueOf(this.partnerRegistrationUrl));
        sb.append(", termId=").append(String.valueOf(this.termId));
        sb.append(", pricingPlans=").append(String.valueOf(this.pricingPlans));
        sb.append(", markets=").append(String.valueOf(this.markets));
        sb.append(", allowedTenancies=").append(String.valueOf(this.allowedTenancies));
        sb.append(", areInternalTenancyLaunchAllowed=")
                .append(String.valueOf(this.areInternalTenancyLaunchAllowed));
        sb.append(", isRoverExportable=").append(String.valueOf(this.isRoverExportable));
        sb.append(", vanityUrl=").append(String.valueOf(this.vanityUrl));
        sb.append(", demoUrl=").append(String.valueOf(this.demoUrl));
        sb.append(", selfPacedTrainingUrl=").append(String.valueOf(this.selfPacedTrainingUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdminOciListingRevision)) {
            return false;
        }

        AdminOciListingRevision other = (AdminOciListingRevision) o;
        return java.util.Objects.equals(this.versionDetails, other.versionDetails)
                && java.util.Objects.equals(this.pricingType, other.pricingType)
                && java.util.Objects.equals(this.systemRequirements, other.systemRequirements)
                && java.util.Objects.equals(this.products, other.products)
                && java.util.Objects.equals(
                        this.partnerRegistrationUrl, other.partnerRegistrationUrl)
                && java.util.Objects.equals(this.termId, other.termId)
                && java.util.Objects.equals(this.pricingPlans, other.pricingPlans)
                && java.util.Objects.equals(this.markets, other.markets)
                && java.util.Objects.equals(this.allowedTenancies, other.allowedTenancies)
                && java.util.Objects.equals(
                        this.areInternalTenancyLaunchAllowed, other.areInternalTenancyLaunchAllowed)
                && java.util.Objects.equals(this.isRoverExportable, other.isRoverExportable)
                && java.util.Objects.equals(this.vanityUrl, other.vanityUrl)
                && java.util.Objects.equals(this.demoUrl, other.demoUrl)
                && java.util.Objects.equals(this.selfPacedTrainingUrl, other.selfPacedTrainingUrl)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.versionDetails == null ? 43 : this.versionDetails.hashCode());
        result = (result * PRIME) + (this.pricingType == null ? 43 : this.pricingType.hashCode());
        result =
                (result * PRIME)
                        + (this.systemRequirements == null
                                ? 43
                                : this.systemRequirements.hashCode());
        result = (result * PRIME) + (this.products == null ? 43 : this.products.hashCode());
        result =
                (result * PRIME)
                        + (this.partnerRegistrationUrl == null
                                ? 43
                                : this.partnerRegistrationUrl.hashCode());
        result = (result * PRIME) + (this.termId == null ? 43 : this.termId.hashCode());
        result = (result * PRIME) + (this.pricingPlans == null ? 43 : this.pricingPlans.hashCode());
        result = (result * PRIME) + (this.markets == null ? 43 : this.markets.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedTenancies == null ? 43 : this.allowedTenancies.hashCode());
        result =
                (result * PRIME)
                        + (this.areInternalTenancyLaunchAllowed == null
                                ? 43
                                : this.areInternalTenancyLaunchAllowed.hashCode());
        result =
                (result * PRIME)
                        + (this.isRoverExportable == null ? 43 : this.isRoverExportable.hashCode());
        result = (result * PRIME) + (this.vanityUrl == null ? 43 : this.vanityUrl.hashCode());
        result = (result * PRIME) + (this.demoUrl == null ? 43 : this.demoUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.selfPacedTrainingUrl == null
                                ? 43
                                : this.selfPacedTrainingUrl.hashCode());
        return result;
    }
}
