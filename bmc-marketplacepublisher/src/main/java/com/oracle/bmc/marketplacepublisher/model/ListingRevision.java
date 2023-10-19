/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * The model for an Oracle Cloud Infrastructure Marketplace Publisher listing revision. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ListingRevision.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ListingRevision
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "listingId",
        "compartmentId",
        "displayName",
        "revisionNumber",
        "versionDetails",
        "headline",
        "tagline",
        "keywords",
        "shortDescription",
        "usageInformation",
        "longDescription",
        "systemRequirements",
        "timeCreated",
        "timeUpdated",
        "categories",
        "markets",
        "contentLanguage",
        "supportedlanguages",
        "supportContacts",
        "supportLinks",
        "icon",
        "status",
        "statusNotes",
        "lifecycleState",
        "packageType",
        "pricingType",
        "allowedTenancies",
        "areInternalTenancyLaunchAllowed",
        "extendedMetadata",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public ListingRevision(
            String id,
            String listingId,
            String compartmentId,
            String displayName,
            String revisionNumber,
            VersionDetails versionDetails,
            String headline,
            String tagline,
            String keywords,
            String shortDescription,
            String usageInformation,
            String longDescription,
            String systemRequirements,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.List<String> categories,
            java.util.List<String> markets,
            LanguageItem contentLanguage,
            java.util.List<LanguageItem> supportedlanguages,
            java.util.List<SupportContact> supportContacts,
            java.util.List<NamedLink> supportLinks,
            ListingRevisionIconAttachment icon,
            Status status,
            String statusNotes,
            LifecycleState lifecycleState,
            PackageType packageType,
            PricingType pricingType,
            java.util.List<String> allowedTenancies,
            Boolean areInternalTenancyLaunchAllowed,
            java.util.Map<String, String> extendedMetadata,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.listingId = listingId;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.revisionNumber = revisionNumber;
        this.versionDetails = versionDetails;
        this.headline = headline;
        this.tagline = tagline;
        this.keywords = keywords;
        this.shortDescription = shortDescription;
        this.usageInformation = usageInformation;
        this.longDescription = longDescription;
        this.systemRequirements = systemRequirements;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.categories = categories;
        this.markets = markets;
        this.contentLanguage = contentLanguage;
        this.supportedlanguages = supportedlanguages;
        this.supportContacts = supportContacts;
        this.supportLinks = supportLinks;
        this.icon = icon;
        this.status = status;
        this.statusNotes = statusNotes;
        this.lifecycleState = lifecycleState;
        this.packageType = packageType;
        this.pricingType = pricingType;
        this.allowedTenancies = allowedTenancies;
        this.areInternalTenancyLaunchAllowed = areInternalTenancyLaunchAllowed;
        this.extendedMetadata = extendedMetadata;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique OCID identifier for the listing revision in Marketplace Publisher. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique OCID identifier for the listing revision in Marketplace Publisher.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The unique identifier for the listing this revision belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        /**
         * The unique identifier for the listing this revision belongs to.
         *
         * @param listingId the value to set
         * @return this builder
         */
        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
            return this;
        }
        /** The unique identifier for the compartment. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The unique identifier for the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The name for the listing revision. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name for the listing revision.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The revision number for the listing revision. This is an internal attribute */
        @com.fasterxml.jackson.annotation.JsonProperty("revisionNumber")
        private String revisionNumber;

        /**
         * The revision number for the listing revision. This is an internal attribute
         *
         * @param revisionNumber the value to set
         * @return this builder
         */
        public Builder revisionNumber(String revisionNumber) {
            this.revisionNumber = revisionNumber;
            this.__explicitlySet__.add("revisionNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("versionDetails")
        private VersionDetails versionDetails;

        public Builder versionDetails(VersionDetails versionDetails) {
            this.versionDetails = versionDetails;
            this.__explicitlySet__.add("versionDetails");
            return this;
        }
        /** Single line introduction for the listing revision. */
        @com.fasterxml.jackson.annotation.JsonProperty("headline")
        private String headline;

        /**
         * Single line introduction for the listing revision.
         *
         * @param headline the value to set
         * @return this builder
         */
        public Builder headline(String headline) {
            this.headline = headline;
            this.__explicitlySet__.add("headline");
            return this;
        }
        /** The tagline of the listing revision. */
        @com.fasterxml.jackson.annotation.JsonProperty("tagline")
        private String tagline;

        /**
         * The tagline of the listing revision.
         *
         * @param tagline the value to set
         * @return this builder
         */
        public Builder tagline(String tagline) {
            this.tagline = tagline;
            this.__explicitlySet__.add("tagline");
            return this;
        }
        /** Keywords associated with the listing revision. */
        @com.fasterxml.jackson.annotation.JsonProperty("keywords")
        private String keywords;

        /**
         * Keywords associated with the listing revision.
         *
         * @param keywords the value to set
         * @return this builder
         */
        public Builder keywords(String keywords) {
            this.keywords = keywords;
            this.__explicitlySet__.add("keywords");
            return this;
        }
        /** A short description for the listing revision. */
        @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
        private String shortDescription;

        /**
         * A short description for the listing revision.
         *
         * @param shortDescription the value to set
         * @return this builder
         */
        public Builder shortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            this.__explicitlySet__.add("shortDescription");
            return this;
        }
        /** Usage information for the listing revision. */
        @com.fasterxml.jackson.annotation.JsonProperty("usageInformation")
        private String usageInformation;

        /**
         * Usage information for the listing revision.
         *
         * @param usageInformation the value to set
         * @return this builder
         */
        public Builder usageInformation(String usageInformation) {
            this.usageInformation = usageInformation;
            this.__explicitlySet__.add("usageInformation");
            return this;
        }
        /** A long description for the listing revision. */
        @com.fasterxml.jackson.annotation.JsonProperty("longDescription")
        private String longDescription;

        /**
         * A long description for the listing revision.
         *
         * @param longDescription the value to set
         * @return this builder
         */
        public Builder longDescription(String longDescription) {
            this.longDescription = longDescription;
            this.__explicitlySet__.add("longDescription");
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
        /** The time the listing revision was created. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the listing revision was created. An RFC3339 formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time the listing revision was updated. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the listing revision was updated. An RFC3339 formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The categories for the listing revsion. */
        @com.fasterxml.jackson.annotation.JsonProperty("categories")
        private java.util.List<String> categories;

        /**
         * The categories for the listing revsion.
         *
         * @param categories the value to set
         * @return this builder
         */
        public Builder categories(java.util.List<String> categories) {
            this.categories = categories;
            this.__explicitlySet__.add("categories");
            return this;
        }
        /** The markets supported by the listing revision. */
        @com.fasterxml.jackson.annotation.JsonProperty("markets")
        private java.util.List<String> markets;

        /**
         * The markets supported by the listing revision.
         *
         * @param markets the value to set
         * @return this builder
         */
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
        /** Languages supported by the publisher for the listing revision. */
        @com.fasterxml.jackson.annotation.JsonProperty("supportedlanguages")
        private java.util.List<LanguageItem> supportedlanguages;

        /**
         * Languages supported by the publisher for the listing revision.
         *
         * @param supportedlanguages the value to set
         * @return this builder
         */
        public Builder supportedlanguages(java.util.List<LanguageItem> supportedlanguages) {
            this.supportedlanguages = supportedlanguages;
            this.__explicitlySet__.add("supportedlanguages");
            return this;
        }
        /**
         * Contact information to use to get support from the publisher for the listing revision.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("supportContacts")
        private java.util.List<SupportContact> supportContacts;

        /**
         * Contact information to use to get support from the publisher for the listing revision.
         *
         * @param supportContacts the value to set
         * @return this builder
         */
        public Builder supportContacts(java.util.List<SupportContact> supportContacts) {
            this.supportContacts = supportContacts;
            this.__explicitlySet__.add("supportContacts");
            return this;
        }
        /** Links to support resources for the listing revision. */
        @com.fasterxml.jackson.annotation.JsonProperty("supportLinks")
        private java.util.List<NamedLink> supportLinks;

        /**
         * Links to support resources for the listing revision.
         *
         * @param supportLinks the value to set
         * @return this builder
         */
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
        /** The current status for the Listing revision. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The current status for the Listing revision.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Status notes for the listing revision. */
        @com.fasterxml.jackson.annotation.JsonProperty("statusNotes")
        private String statusNotes;

        /**
         * Status notes for the listing revision.
         *
         * @param statusNotes the value to set
         * @return this builder
         */
        public Builder statusNotes(String statusNotes) {
            this.statusNotes = statusNotes;
            this.__explicitlySet__.add("statusNotes");
            return this;
        }
        /** The current state of the listing revision. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the listing revision.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The listing's package type. Populated from the listing. */
        @com.fasterxml.jackson.annotation.JsonProperty("packageType")
        private PackageType packageType;

        /**
         * The listing's package type. Populated from the listing.
         *
         * @param packageType the value to set
         * @return this builder
         */
        public Builder packageType(PackageType packageType) {
            this.packageType = packageType;
            this.__explicitlySet__.add("packageType");
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
        /** Additional metadata key/value pairs for the listing revision summary. */
        @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
        private java.util.Map<String, String> extendedMetadata;

        /**
         * Additional metadata key/value pairs for the listing revision summary.
         *
         * @param extendedMetadata the value to set
         * @return this builder
         */
        public Builder extendedMetadata(java.util.Map<String, String> extendedMetadata) {
            this.extendedMetadata = extendedMetadata;
            this.__explicitlySet__.add("extendedMetadata");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ListingRevision build() {
            ListingRevision model =
                    new ListingRevision(
                            this.id,
                            this.listingId,
                            this.compartmentId,
                            this.displayName,
                            this.revisionNumber,
                            this.versionDetails,
                            this.headline,
                            this.tagline,
                            this.keywords,
                            this.shortDescription,
                            this.usageInformation,
                            this.longDescription,
                            this.systemRequirements,
                            this.timeCreated,
                            this.timeUpdated,
                            this.categories,
                            this.markets,
                            this.contentLanguage,
                            this.supportedlanguages,
                            this.supportContacts,
                            this.supportLinks,
                            this.icon,
                            this.status,
                            this.statusNotes,
                            this.lifecycleState,
                            this.packageType,
                            this.pricingType,
                            this.allowedTenancies,
                            this.areInternalTenancyLaunchAllowed,
                            this.extendedMetadata,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ListingRevision model) {
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
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
            if (model.wasPropertyExplicitlySet("pricingType")) {
                this.pricingType(model.getPricingType());
            }
            if (model.wasPropertyExplicitlySet("allowedTenancies")) {
                this.allowedTenancies(model.getAllowedTenancies());
            }
            if (model.wasPropertyExplicitlySet("areInternalTenancyLaunchAllowed")) {
                this.areInternalTenancyLaunchAllowed(model.getAreInternalTenancyLaunchAllowed());
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

    /** Unique OCID identifier for the listing revision in Marketplace Publisher. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique OCID identifier for the listing revision in Marketplace Publisher.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The unique identifier for the listing this revision belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("listingId")
    private final String listingId;

    /**
     * The unique identifier for the listing this revision belongs to.
     *
     * @return the value
     */
    public String getListingId() {
        return listingId;
    }

    /** The unique identifier for the compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The unique identifier for the compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The name for the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name for the listing revision.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The revision number for the listing revision. This is an internal attribute */
    @com.fasterxml.jackson.annotation.JsonProperty("revisionNumber")
    private final String revisionNumber;

    /**
     * The revision number for the listing revision. This is an internal attribute
     *
     * @return the value
     */
    public String getRevisionNumber() {
        return revisionNumber;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("versionDetails")
    private final VersionDetails versionDetails;

    public VersionDetails getVersionDetails() {
        return versionDetails;
    }

    /** Single line introduction for the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("headline")
    private final String headline;

    /**
     * Single line introduction for the listing revision.
     *
     * @return the value
     */
    public String getHeadline() {
        return headline;
    }

    /** The tagline of the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("tagline")
    private final String tagline;

    /**
     * The tagline of the listing revision.
     *
     * @return the value
     */
    public String getTagline() {
        return tagline;
    }

    /** Keywords associated with the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("keywords")
    private final String keywords;

    /**
     * Keywords associated with the listing revision.
     *
     * @return the value
     */
    public String getKeywords() {
        return keywords;
    }

    /** A short description for the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
    private final String shortDescription;

    /**
     * A short description for the listing revision.
     *
     * @return the value
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /** Usage information for the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("usageInformation")
    private final String usageInformation;

    /**
     * Usage information for the listing revision.
     *
     * @return the value
     */
    public String getUsageInformation() {
        return usageInformation;
    }

    /** A long description for the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("longDescription")
    private final String longDescription;

    /**
     * A long description for the listing revision.
     *
     * @return the value
     */
    public String getLongDescription() {
        return longDescription;
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

    /** The time the listing revision was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the listing revision was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the listing revision was updated. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the listing revision was updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The categories for the listing revsion. */
    @com.fasterxml.jackson.annotation.JsonProperty("categories")
    private final java.util.List<String> categories;

    /**
     * The categories for the listing revsion.
     *
     * @return the value
     */
    public java.util.List<String> getCategories() {
        return categories;
    }

    /** The markets supported by the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("markets")
    private final java.util.List<String> markets;

    /**
     * The markets supported by the listing revision.
     *
     * @return the value
     */
    public java.util.List<String> getMarkets() {
        return markets;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("contentLanguage")
    private final LanguageItem contentLanguage;

    public LanguageItem getContentLanguage() {
        return contentLanguage;
    }

    /** Languages supported by the publisher for the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("supportedlanguages")
    private final java.util.List<LanguageItem> supportedlanguages;

    /**
     * Languages supported by the publisher for the listing revision.
     *
     * @return the value
     */
    public java.util.List<LanguageItem> getSupportedlanguages() {
        return supportedlanguages;
    }

    /** Contact information to use to get support from the publisher for the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("supportContacts")
    private final java.util.List<SupportContact> supportContacts;

    /**
     * Contact information to use to get support from the publisher for the listing revision.
     *
     * @return the value
     */
    public java.util.List<SupportContact> getSupportContacts() {
        return supportContacts;
    }

    /** Links to support resources for the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("supportLinks")
    private final java.util.List<NamedLink> supportLinks;

    /**
     * Links to support resources for the listing revision.
     *
     * @return the value
     */
    public java.util.List<NamedLink> getSupportLinks() {
        return supportLinks;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("icon")
    private final ListingRevisionIconAttachment icon;

    public ListingRevisionIconAttachment getIcon() {
        return icon;
    }

    /** The current status for the Listing revision. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        New("NEW"),
        PendingReview("PENDING_REVIEW"),
        ReviewInProgress("REVIEW_IN_PROGRESS"),
        Rejected("REJECTED"),
        Approved("APPROVED"),
        PublishInProgress("PUBLISH_IN_PROGRESS"),
        PublishFailed("PUBLISH_FAILED"),
        Published("PUBLISHED"),
        PublishAsPrivateFailed("PUBLISH_AS_PRIVATE_FAILED"),
        PublishedAsPrivate("PUBLISHED_AS_PRIVATE"),
        PublishAsPrivateInProgress("PUBLISH_AS_PRIVATE_IN_PROGRESS"),
        UnpublishInProgress("UNPUBLISH_IN_PROGRESS"),
        Unpublished("UNPUBLISHED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current status for the Listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The current status for the Listing revision.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** Status notes for the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("statusNotes")
    private final String statusNotes;

    /**
     * Status notes for the listing revision.
     *
     * @return the value
     */
    public String getStatusNotes() {
        return statusNotes;
    }

    /** The current state of the listing revision. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the listing revision.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The listing's package type. Populated from the listing. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageType")
    private final PackageType packageType;

    /**
     * The listing's package type. Populated from the listing.
     *
     * @return the value
     */
    public PackageType getPackageType() {
        return packageType;
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

    /** Additional metadata key/value pairs for the listing revision summary. */
    @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
    private final java.util.Map<String, String> extendedMetadata;

    /**
     * Additional metadata key/value pairs for the listing revision summary.
     *
     * @return the value
     */
    public java.util.Map<String, String> getExtendedMetadata() {
        return extendedMetadata;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("ListingRevision(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", listingId=").append(String.valueOf(this.listingId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", revisionNumber=").append(String.valueOf(this.revisionNumber));
        sb.append(", versionDetails=").append(String.valueOf(this.versionDetails));
        sb.append(", headline=").append(String.valueOf(this.headline));
        sb.append(", tagline=").append(String.valueOf(this.tagline));
        sb.append(", keywords=").append(String.valueOf(this.keywords));
        sb.append(", shortDescription=").append(String.valueOf(this.shortDescription));
        sb.append(", usageInformation=").append(String.valueOf(this.usageInformation));
        sb.append(", longDescription=").append(String.valueOf(this.longDescription));
        sb.append(", systemRequirements=").append(String.valueOf(this.systemRequirements));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", categories=").append(String.valueOf(this.categories));
        sb.append(", markets=").append(String.valueOf(this.markets));
        sb.append(", contentLanguage=").append(String.valueOf(this.contentLanguage));
        sb.append(", supportedlanguages=").append(String.valueOf(this.supportedlanguages));
        sb.append(", supportContacts=").append(String.valueOf(this.supportContacts));
        sb.append(", supportLinks=").append(String.valueOf(this.supportLinks));
        sb.append(", icon=").append(String.valueOf(this.icon));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", statusNotes=").append(String.valueOf(this.statusNotes));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", packageType=").append(String.valueOf(this.packageType));
        sb.append(", pricingType=").append(String.valueOf(this.pricingType));
        sb.append(", allowedTenancies=").append(String.valueOf(this.allowedTenancies));
        sb.append(", areInternalTenancyLaunchAllowed=")
                .append(String.valueOf(this.areInternalTenancyLaunchAllowed));
        sb.append(", extendedMetadata=").append(String.valueOf(this.extendedMetadata));
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
        if (!(o instanceof ListingRevision)) {
            return false;
        }

        ListingRevision other = (ListingRevision) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.revisionNumber, other.revisionNumber)
                && java.util.Objects.equals(this.versionDetails, other.versionDetails)
                && java.util.Objects.equals(this.headline, other.headline)
                && java.util.Objects.equals(this.tagline, other.tagline)
                && java.util.Objects.equals(this.keywords, other.keywords)
                && java.util.Objects.equals(this.shortDescription, other.shortDescription)
                && java.util.Objects.equals(this.usageInformation, other.usageInformation)
                && java.util.Objects.equals(this.longDescription, other.longDescription)
                && java.util.Objects.equals(this.systemRequirements, other.systemRequirements)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.categories, other.categories)
                && java.util.Objects.equals(this.markets, other.markets)
                && java.util.Objects.equals(this.contentLanguage, other.contentLanguage)
                && java.util.Objects.equals(this.supportedlanguages, other.supportedlanguages)
                && java.util.Objects.equals(this.supportContacts, other.supportContacts)
                && java.util.Objects.equals(this.supportLinks, other.supportLinks)
                && java.util.Objects.equals(this.icon, other.icon)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.statusNotes, other.statusNotes)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.packageType, other.packageType)
                && java.util.Objects.equals(this.pricingType, other.pricingType)
                && java.util.Objects.equals(this.allowedTenancies, other.allowedTenancies)
                && java.util.Objects.equals(
                        this.areInternalTenancyLaunchAllowed, other.areInternalTenancyLaunchAllowed)
                && java.util.Objects.equals(this.extendedMetadata, other.extendedMetadata)
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
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.revisionNumber == null ? 43 : this.revisionNumber.hashCode());
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
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
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
        result = (result * PRIME) + (this.icon == null ? 43 : this.icon.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.statusNotes == null ? 43 : this.statusNotes.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.packageType == null ? 43 : this.packageType.hashCode());
        result = (result * PRIME) + (this.pricingType == null ? 43 : this.pricingType.hashCode());
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
                        + (this.extendedMetadata == null ? 43 : this.extendedMetadata.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
