/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Listing revision update details for listings <br>
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
        builder = CreateLeadGenListingRevisionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "listingType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateLeadGenListingRevisionDetails extends CreateListingRevisionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private ListingRevision.Status status;

        public Builder status(ListingRevision.Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
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
        private OciListingRevision.PricingType pricingType;

        /**
         * The pricing model for the listing revision.
         *
         * @param pricingType the value to set
         * @return this builder
         */
        public Builder pricingType(OciListingRevision.PricingType pricingType) {
            this.pricingType = pricingType;
            this.__explicitlySet__.add("pricingType");
            return this;
        }
        /** List of Products subscribed by listing. */
        @com.fasterxml.jackson.annotation.JsonProperty("products")
        private java.util.List<ListingProduct> products;

        /**
         * List of Products subscribed by listing.
         *
         * @param products the value to set
         * @return this builder
         */
        public Builder products(java.util.List<ListingProduct> products) {
            this.products = products;
            this.__explicitlySet__.add("products");
            return this;
        }
        /** Url to demo of the listing */
        @com.fasterxml.jackson.annotation.JsonProperty("demoUrl")
        private String demoUrl;

        /**
         * Url to demo of the listing
         *
         * @param demoUrl the value to set
         * @return this builder
         */
        public Builder demoUrl(String demoUrl) {
            this.demoUrl = demoUrl;
            this.__explicitlySet__.add("demoUrl");
            return this;
        }
        /** Url to training resources of the listing */
        @com.fasterxml.jackson.annotation.JsonProperty("selfPacedTrainingUrl")
        private String selfPacedTrainingUrl;

        /**
         * Url to training resources of the listing
         *
         * @param selfPacedTrainingUrl the value to set
         * @return this builder
         */
        public Builder selfPacedTrainingUrl(String selfPacedTrainingUrl) {
            this.selfPacedTrainingUrl = selfPacedTrainingUrl;
            this.__explicitlySet__.add("selfPacedTrainingUrl");
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

        @com.fasterxml.jackson.annotation.JsonProperty("downloadInfo")
        private DownloadInfo downloadInfo;

        public Builder downloadInfo(DownloadInfo downloadInfo) {
            this.downloadInfo = downloadInfo;
            this.__explicitlySet__.add("downloadInfo");
            return this;
        }
        /** Pricing details for lead gen listing */
        @com.fasterxml.jackson.annotation.JsonProperty("pricingPlans")
        private String pricingPlans;

        /**
         * Pricing details for lead gen listing
         *
         * @param pricingPlans the value to set
         * @return this builder
         */
        public Builder pricingPlans(String pricingPlans) {
            this.pricingPlans = pricingPlans;
            this.__explicitlySet__.add("pricingPlans");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateLeadGenListingRevisionDetails build() {
            CreateLeadGenListingRevisionDetails model =
                    new CreateLeadGenListingRevisionDetails(
                            this.displayName,
                            this.listingId,
                            this.headline,
                            this.tagline,
                            this.keywords,
                            this.shortDescription,
                            this.usageInformation,
                            this.longDescription,
                            this.contentLanguage,
                            this.supportedlanguages,
                            this.supportContacts,
                            this.supportLinks,
                            this.status,
                            this.freeformTags,
                            this.definedTags,
                            this.versionDetails,
                            this.systemRequirements,
                            this.pricingType,
                            this.products,
                            this.demoUrl,
                            this.selfPacedTrainingUrl,
                            this.recommendedServiceProviderListingIds,
                            this.vanityUrl,
                            this.downloadInfo,
                            this.pricingPlans);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateLeadGenListingRevisionDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("listingId")) {
                this.listingId(model.getListingId());
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
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
            if (model.wasPropertyExplicitlySet("demoUrl")) {
                this.demoUrl(model.getDemoUrl());
            }
            if (model.wasPropertyExplicitlySet("selfPacedTrainingUrl")) {
                this.selfPacedTrainingUrl(model.getSelfPacedTrainingUrl());
            }
            if (model.wasPropertyExplicitlySet("recommendedServiceProviderListingIds")) {
                this.recommendedServiceProviderListingIds(
                        model.getRecommendedServiceProviderListingIds());
            }
            if (model.wasPropertyExplicitlySet("vanityUrl")) {
                this.vanityUrl(model.getVanityUrl());
            }
            if (model.wasPropertyExplicitlySet("downloadInfo")) {
                this.downloadInfo(model.getDownloadInfo());
            }
            if (model.wasPropertyExplicitlySet("pricingPlans")) {
                this.pricingPlans(model.getPricingPlans());
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
    public CreateLeadGenListingRevisionDetails(
            String displayName,
            String listingId,
            String headline,
            String tagline,
            String keywords,
            String shortDescription,
            String usageInformation,
            String longDescription,
            LanguageItem contentLanguage,
            java.util.List<LanguageItem> supportedlanguages,
            java.util.List<SupportContact> supportContacts,
            java.util.List<NamedLink> supportLinks,
            ListingRevision.Status status,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            VersionDetails versionDetails,
            String systemRequirements,
            OciListingRevision.PricingType pricingType,
            java.util.List<ListingProduct> products,
            String demoUrl,
            String selfPacedTrainingUrl,
            java.util.List<String> recommendedServiceProviderListingIds,
            String vanityUrl,
            DownloadInfo downloadInfo,
            String pricingPlans) {
        super(
                displayName,
                listingId,
                headline,
                tagline,
                keywords,
                shortDescription,
                usageInformation,
                longDescription,
                contentLanguage,
                supportedlanguages,
                supportContacts,
                supportLinks,
                status,
                freeformTags,
                definedTags);
        this.versionDetails = versionDetails;
        this.systemRequirements = systemRequirements;
        this.pricingType = pricingType;
        this.products = products;
        this.demoUrl = demoUrl;
        this.selfPacedTrainingUrl = selfPacedTrainingUrl;
        this.recommendedServiceProviderListingIds = recommendedServiceProviderListingIds;
        this.vanityUrl = vanityUrl;
        this.downloadInfo = downloadInfo;
        this.pricingPlans = pricingPlans;
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
    @com.fasterxml.jackson.annotation.JsonProperty("pricingType")
    private final OciListingRevision.PricingType pricingType;

    /**
     * The pricing model for the listing revision.
     *
     * @return the value
     */
    public OciListingRevision.PricingType getPricingType() {
        return pricingType;
    }

    /** List of Products subscribed by listing. */
    @com.fasterxml.jackson.annotation.JsonProperty("products")
    private final java.util.List<ListingProduct> products;

    /**
     * List of Products subscribed by listing.
     *
     * @return the value
     */
    public java.util.List<ListingProduct> getProducts() {
        return products;
    }

    /** Url to demo of the listing */
    @com.fasterxml.jackson.annotation.JsonProperty("demoUrl")
    private final String demoUrl;

    /**
     * Url to demo of the listing
     *
     * @return the value
     */
    public String getDemoUrl() {
        return demoUrl;
    }

    /** Url to training resources of the listing */
    @com.fasterxml.jackson.annotation.JsonProperty("selfPacedTrainingUrl")
    private final String selfPacedTrainingUrl;

    /**
     * Url to training resources of the listing
     *
     * @return the value
     */
    public String getSelfPacedTrainingUrl() {
        return selfPacedTrainingUrl;
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

    @com.fasterxml.jackson.annotation.JsonProperty("downloadInfo")
    private final DownloadInfo downloadInfo;

    public DownloadInfo getDownloadInfo() {
        return downloadInfo;
    }

    /** Pricing details for lead gen listing */
    @com.fasterxml.jackson.annotation.JsonProperty("pricingPlans")
    private final String pricingPlans;

    /**
     * Pricing details for lead gen listing
     *
     * @return the value
     */
    public String getPricingPlans() {
        return pricingPlans;
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
        sb.append("CreateLeadGenListingRevisionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", versionDetails=").append(String.valueOf(this.versionDetails));
        sb.append(", systemRequirements=").append(String.valueOf(this.systemRequirements));
        sb.append(", pricingType=").append(String.valueOf(this.pricingType));
        sb.append(", products=").append(String.valueOf(this.products));
        sb.append(", demoUrl=").append(String.valueOf(this.demoUrl));
        sb.append(", selfPacedTrainingUrl=").append(String.valueOf(this.selfPacedTrainingUrl));
        sb.append(", recommendedServiceProviderListingIds=")
                .append(String.valueOf(this.recommendedServiceProviderListingIds));
        sb.append(", vanityUrl=").append(String.valueOf(this.vanityUrl));
        sb.append(", downloadInfo=").append(String.valueOf(this.downloadInfo));
        sb.append(", pricingPlans=").append(String.valueOf(this.pricingPlans));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateLeadGenListingRevisionDetails)) {
            return false;
        }

        CreateLeadGenListingRevisionDetails other = (CreateLeadGenListingRevisionDetails) o;
        return java.util.Objects.equals(this.versionDetails, other.versionDetails)
                && java.util.Objects.equals(this.systemRequirements, other.systemRequirements)
                && java.util.Objects.equals(this.pricingType, other.pricingType)
                && java.util.Objects.equals(this.products, other.products)
                && java.util.Objects.equals(this.demoUrl, other.demoUrl)
                && java.util.Objects.equals(this.selfPacedTrainingUrl, other.selfPacedTrainingUrl)
                && java.util.Objects.equals(
                        this.recommendedServiceProviderListingIds,
                        other.recommendedServiceProviderListingIds)
                && java.util.Objects.equals(this.vanityUrl, other.vanityUrl)
                && java.util.Objects.equals(this.downloadInfo, other.downloadInfo)
                && java.util.Objects.equals(this.pricingPlans, other.pricingPlans)
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
        result = (result * PRIME) + (this.demoUrl == null ? 43 : this.demoUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.selfPacedTrainingUrl == null
                                ? 43
                                : this.selfPacedTrainingUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendedServiceProviderListingIds == null
                                ? 43
                                : this.recommendedServiceProviderListingIds.hashCode());
        result = (result * PRIME) + (this.vanityUrl == null ? 43 : this.vanityUrl.hashCode());
        result = (result * PRIME) + (this.downloadInfo == null ? 43 : this.downloadInfo.hashCode());
        result = (result * PRIME) + (this.pricingPlans == null ? 43 : this.pricingPlans.hashCode());
        return result;
    }
}
