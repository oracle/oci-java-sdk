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
        builder = CreateOciListingRevisionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "listingType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateOciListingRevisionDetails extends CreateListingRevisionDetails {
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
        /** List of Pricing Plans provider by publisher. */
        @com.fasterxml.jackson.annotation.JsonProperty("pricingPlans")
        private java.util.List<PricingPlan> pricingPlans;

        /**
         * List of Pricing Plans provider by publisher.
         *
         * @param pricingPlans the value to set
         * @return this builder
         */
        public Builder pricingPlans(java.util.List<PricingPlan> pricingPlans) {
            this.pricingPlans = pricingPlans;
            this.__explicitlySet__.add("pricingPlans");
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

        public CreateOciListingRevisionDetails build() {
            CreateOciListingRevisionDetails model =
                    new CreateOciListingRevisionDetails(
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
                            this.pricingPlans,
                            this.vanityUrl,
                            this.recommendedServiceProviderListingIds,
                            this.availabilityAndPricingPolicy,
                            this.isRoverExportable);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOciListingRevisionDetails model) {
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
            if (model.wasPropertyExplicitlySet("pricingPlans")) {
                this.pricingPlans(model.getPricingPlans());
            }
            if (model.wasPropertyExplicitlySet("vanityUrl")) {
                this.vanityUrl(model.getVanityUrl());
            }
            if (model.wasPropertyExplicitlySet("recommendedServiceProviderListingIds")) {
                this.recommendedServiceProviderListingIds(
                        model.getRecommendedServiceProviderListingIds());
            }
            if (model.wasPropertyExplicitlySet("availabilityAndPricingPolicy")) {
                this.availabilityAndPricingPolicy(model.getAvailabilityAndPricingPolicy());
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
    public CreateOciListingRevisionDetails(
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
            java.util.List<PricingPlan> pricingPlans,
            String vanityUrl,
            java.util.List<String> recommendedServiceProviderListingIds,
            String availabilityAndPricingPolicy,
            Boolean isRoverExportable) {
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
        this.pricingPlans = pricingPlans;
        this.vanityUrl = vanityUrl;
        this.recommendedServiceProviderListingIds = recommendedServiceProviderListingIds;
        this.availabilityAndPricingPolicy = availabilityAndPricingPolicy;
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

    /** List of Pricing Plans provider by publisher. */
    @com.fasterxml.jackson.annotation.JsonProperty("pricingPlans")
    private final java.util.List<PricingPlan> pricingPlans;

    /**
     * List of Pricing Plans provider by publisher.
     *
     * @return the value
     */
    public java.util.List<PricingPlan> getPricingPlans() {
        return pricingPlans;
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
        sb.append("CreateOciListingRevisionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", versionDetails=").append(String.valueOf(this.versionDetails));
        sb.append(", systemRequirements=").append(String.valueOf(this.systemRequirements));
        sb.append(", pricingType=").append(String.valueOf(this.pricingType));
        sb.append(", products=").append(String.valueOf(this.products));
        sb.append(", pricingPlans=").append(String.valueOf(this.pricingPlans));
        sb.append(", vanityUrl=").append(String.valueOf(this.vanityUrl));
        sb.append(", recommendedServiceProviderListingIds=")
                .append(String.valueOf(this.recommendedServiceProviderListingIds));
        sb.append(", availabilityAndPricingPolicy=")
                .append(String.valueOf(this.availabilityAndPricingPolicy));
        sb.append(", isRoverExportable=").append(String.valueOf(this.isRoverExportable));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOciListingRevisionDetails)) {
            return false;
        }

        CreateOciListingRevisionDetails other = (CreateOciListingRevisionDetails) o;
        return java.util.Objects.equals(this.versionDetails, other.versionDetails)
                && java.util.Objects.equals(this.systemRequirements, other.systemRequirements)
                && java.util.Objects.equals(this.pricingType, other.pricingType)
                && java.util.Objects.equals(this.products, other.products)
                && java.util.Objects.equals(this.pricingPlans, other.pricingPlans)
                && java.util.Objects.equals(this.vanityUrl, other.vanityUrl)
                && java.util.Objects.equals(
                        this.recommendedServiceProviderListingIds,
                        other.recommendedServiceProviderListingIds)
                && java.util.Objects.equals(
                        this.availabilityAndPricingPolicy, other.availabilityAndPricingPolicy)
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
        result = (result * PRIME) + (this.vanityUrl == null ? 43 : this.vanityUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendedServiceProviderListingIds == null
                                ? 43
                                : this.recommendedServiceProviderListingIds.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityAndPricingPolicy == null
                                ? 43
                                : this.availabilityAndPricingPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.isRoverExportable == null ? 43 : this.isRoverExportable.hashCode());
        return result;
    }
}
