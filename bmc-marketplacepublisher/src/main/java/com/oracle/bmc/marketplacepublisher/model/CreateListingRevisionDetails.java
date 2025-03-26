/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * The model for an Oracle Cloud Infrastructure Marketplace Publisher listing revision.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateListingRevisionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateListingRevisionDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "listingId",
        "versionDetails",
        "headline",
        "tagline",
        "keywords",
        "shortDescription",
        "usageInformation",
        "longDescription",
        "systemRequirements",
        "categories",
        "markets",
        "contentLanguage",
        "supportedlanguages",
        "supportContacts",
        "supportLinks",
        "status",
        "pricingType",
        "freeformTags",
        "definedTags"
    })
    public CreateListingRevisionDetails(
            String displayName,
            String listingId,
            VersionDetails versionDetails,
            String headline,
            String tagline,
            String keywords,
            String shortDescription,
            String usageInformation,
            String longDescription,
            String systemRequirements,
            java.util.List<String> categories,
            java.util.List<String> markets,
            LanguageItem contentLanguage,
            java.util.List<LanguageItem> supportedlanguages,
            java.util.List<SupportContact> supportContacts,
            java.util.List<NamedLink> supportLinks,
            ListingRevision.Status status,
            ListingRevision.PricingType pricingType,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.listingId = listingId;
        this.versionDetails = versionDetails;
        this.headline = headline;
        this.tagline = tagline;
        this.keywords = keywords;
        this.shortDescription = shortDescription;
        this.usageInformation = usageInformation;
        this.longDescription = longDescription;
        this.systemRequirements = systemRequirements;
        this.categories = categories;
        this.markets = markets;
        this.contentLanguage = contentLanguage;
        this.supportedlanguages = supportedlanguages;
        this.supportContacts = supportContacts;
        this.supportLinks = supportLinks;
        this.status = status;
        this.pricingType = pricingType;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name for the listing revision.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name for the listing revision.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The unique identifier for the listing this revision belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        /**
         * The unique identifier for the listing this revision belongs to.
         * @param listingId the value to set
         * @return this builder
         **/
        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
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
         * Single line introduction for the listing revision.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("headline")
        private String headline;

        /**
         * Single line introduction for the listing revision.
         * @param headline the value to set
         * @return this builder
         **/
        public Builder headline(String headline) {
            this.headline = headline;
            this.__explicitlySet__.add("headline");
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
         * Keywords associated with the listing revision.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keywords")
        private String keywords;

        /**
         * Keywords associated with the listing revision.
         * @param keywords the value to set
         * @return this builder
         **/
        public Builder keywords(String keywords) {
            this.keywords = keywords;
            this.__explicitlySet__.add("keywords");
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
         * Usage information for the listing revision.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usageInformation")
        private String usageInformation;

        /**
         * Usage information for the listing revision.
         * @param usageInformation the value to set
         * @return this builder
         **/
        public Builder usageInformation(String usageInformation) {
            this.usageInformation = usageInformation;
            this.__explicitlySet__.add("usageInformation");
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
         * The categories for the listing revision.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("categories")
        private java.util.List<String> categories;

        /**
         * The categories for the listing revision.
         * @param categories the value to set
         * @return this builder
         **/
        public Builder categories(java.util.List<String> categories) {
            this.categories = categories;
            this.__explicitlySet__.add("categories");
            return this;
        }
        /**
         * The markets supported by the listing revision.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("markets")
        private java.util.List<String> markets;

        /**
         * The markets supported by the listing revision.
         * @param markets the value to set
         * @return this builder
         **/
        public Builder markets(java.util.List<String> markets) {
            this.markets = markets;
            this.__explicitlySet__.add("markets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contentLanguage")
        private LanguageItem contentLanguage;

        public Builder contentLanguage(LanguageItem contentLanguage) {
            this.contentLanguage = contentLanguage;
            this.__explicitlySet__.add("contentLanguage");
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
         * Contact information to use to get support from the publisher for the listing revision.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("supportContacts")
        private java.util.List<SupportContact> supportContacts;

        /**
         * Contact information to use to get support from the publisher for the listing revision.
         * @param supportContacts the value to set
         * @return this builder
         **/
        public Builder supportContacts(java.util.List<SupportContact> supportContacts) {
            this.supportContacts = supportContacts;
            this.__explicitlySet__.add("supportContacts");
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
         * The current status of the Listing revision.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private ListingRevision.Status status;

        /**
         * The current status of the Listing revision.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(ListingRevision.Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The pricing model for the listing revision.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pricingType")
        private ListingRevision.PricingType pricingType;

        /**
         * The pricing model for the listing revision.
         * @param pricingType the value to set
         * @return this builder
         **/
        public Builder pricingType(ListingRevision.PricingType pricingType) {
            this.pricingType = pricingType;
            this.__explicitlySet__.add("pricingType");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateListingRevisionDetails build() {
            CreateListingRevisionDetails model =
                    new CreateListingRevisionDetails(
                            this.displayName,
                            this.listingId,
                            this.versionDetails,
                            this.headline,
                            this.tagline,
                            this.keywords,
                            this.shortDescription,
                            this.usageInformation,
                            this.longDescription,
                            this.systemRequirements,
                            this.categories,
                            this.markets,
                            this.contentLanguage,
                            this.supportedlanguages,
                            this.supportContacts,
                            this.supportLinks,
                            this.status,
                            this.pricingType,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateListingRevisionDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("listingId")) {
                this.listingId(model.getListingId());
            }
            if (model.wasPropertyExplicitlySet("versionDetails")) {
                this.versionDetails(model.getVersionDetails());
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
            if (model.wasPropertyExplicitlySet("systemRequirements")) {
                this.systemRequirements(model.getSystemRequirements());
            }
            if (model.wasPropertyExplicitlySet("categories")) {
                this.categories(model.getCategories());
            }
            if (model.wasPropertyExplicitlySet("markets")) {
                this.markets(model.getMarkets());
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
            if (model.wasPropertyExplicitlySet("pricingType")) {
                this.pricingType(model.getPricingType());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The name for the listing revision.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name for the listing revision.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The unique identifier for the listing this revision belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingId")
    private final String listingId;

    /**
     * The unique identifier for the listing this revision belongs to.
     * @return the value
     **/
    public String getListingId() {
        return listingId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("versionDetails")
    private final VersionDetails versionDetails;

    public VersionDetails getVersionDetails() {
        return versionDetails;
    }

    /**
     * Single line introduction for the listing revision.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headline")
    private final String headline;

    /**
     * Single line introduction for the listing revision.
     * @return the value
     **/
    public String getHeadline() {
        return headline;
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
     * Keywords associated with the listing revision.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keywords")
    private final String keywords;

    /**
     * Keywords associated with the listing revision.
     * @return the value
     **/
    public String getKeywords() {
        return keywords;
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
     * Usage information for the listing revision.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageInformation")
    private final String usageInformation;

    /**
     * Usage information for the listing revision.
     * @return the value
     **/
    public String getUsageInformation() {
        return usageInformation;
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
     * The categories for the listing revision.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("categories")
    private final java.util.List<String> categories;

    /**
     * The categories for the listing revision.
     * @return the value
     **/
    public java.util.List<String> getCategories() {
        return categories;
    }

    /**
     * The markets supported by the listing revision.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("markets")
    private final java.util.List<String> markets;

    /**
     * The markets supported by the listing revision.
     * @return the value
     **/
    public java.util.List<String> getMarkets() {
        return markets;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("contentLanguage")
    private final LanguageItem contentLanguage;

    public LanguageItem getContentLanguage() {
        return contentLanguage;
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
     * Contact information to use to get support from the publisher for the listing revision.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportContacts")
    private final java.util.List<SupportContact> supportContacts;

    /**
     * Contact information to use to get support from the publisher for the listing revision.
     * @return the value
     **/
    public java.util.List<SupportContact> getSupportContacts() {
        return supportContacts;
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
     * The current status of the Listing revision.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final ListingRevision.Status status;

    /**
     * The current status of the Listing revision.
     * @return the value
     **/
    public ListingRevision.Status getStatus() {
        return status;
    }

    /**
     * The pricing model for the listing revision.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pricingType")
    private final ListingRevision.PricingType pricingType;

    /**
     * The pricing model for the listing revision.
     * @return the value
     **/
    public ListingRevision.PricingType getPricingType() {
        return pricingType;
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
        sb.append("CreateListingRevisionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", listingId=").append(String.valueOf(this.listingId));
        sb.append(", versionDetails=").append(String.valueOf(this.versionDetails));
        sb.append(", headline=").append(String.valueOf(this.headline));
        sb.append(", tagline=").append(String.valueOf(this.tagline));
        sb.append(", keywords=").append(String.valueOf(this.keywords));
        sb.append(", shortDescription=").append(String.valueOf(this.shortDescription));
        sb.append(", usageInformation=").append(String.valueOf(this.usageInformation));
        sb.append(", longDescription=").append(String.valueOf(this.longDescription));
        sb.append(", systemRequirements=").append(String.valueOf(this.systemRequirements));
        sb.append(", categories=").append(String.valueOf(this.categories));
        sb.append(", markets=").append(String.valueOf(this.markets));
        sb.append(", contentLanguage=").append(String.valueOf(this.contentLanguage));
        sb.append(", supportedlanguages=").append(String.valueOf(this.supportedlanguages));
        sb.append(", supportContacts=").append(String.valueOf(this.supportContacts));
        sb.append(", supportLinks=").append(String.valueOf(this.supportLinks));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", pricingType=").append(String.valueOf(this.pricingType));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateListingRevisionDetails)) {
            return false;
        }

        CreateListingRevisionDetails other = (CreateListingRevisionDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.versionDetails, other.versionDetails)
                && java.util.Objects.equals(this.headline, other.headline)
                && java.util.Objects.equals(this.tagline, other.tagline)
                && java.util.Objects.equals(this.keywords, other.keywords)
                && java.util.Objects.equals(this.shortDescription, other.shortDescription)
                && java.util.Objects.equals(this.usageInformation, other.usageInformation)
                && java.util.Objects.equals(this.longDescription, other.longDescription)
                && java.util.Objects.equals(this.systemRequirements, other.systemRequirements)
                && java.util.Objects.equals(this.categories, other.categories)
                && java.util.Objects.equals(this.markets, other.markets)
                && java.util.Objects.equals(this.contentLanguage, other.contentLanguage)
                && java.util.Objects.equals(this.supportedlanguages, other.supportedlanguages)
                && java.util.Objects.equals(this.supportContacts, other.supportContacts)
                && java.util.Objects.equals(this.supportLinks, other.supportLinks)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.pricingType, other.pricingType)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result =
                (result * PRIME)
                        + (this.versionDetails == null ? 43 : this.versionDetails.hashCode());
        result = (result * PRIME) + (this.headline == null ? 43 : this.headline.hashCode());
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
                        + (this.systemRequirements == null
                                ? 43
                                : this.systemRequirements.hashCode());
        result = (result * PRIME) + (this.categories == null ? 43 : this.categories.hashCode());
        result = (result * PRIME) + (this.markets == null ? 43 : this.markets.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLanguage == null ? 43 : this.contentLanguage.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedlanguages == null
                                ? 43
                                : this.supportedlanguages.hashCode());
        result =
                (result * PRIME)
                        + (this.supportContacts == null ? 43 : this.supportContacts.hashCode());
        result = (result * PRIME) + (this.supportLinks == null ? 43 : this.supportLinks.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.pricingType == null ? 43 : this.pricingType.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
