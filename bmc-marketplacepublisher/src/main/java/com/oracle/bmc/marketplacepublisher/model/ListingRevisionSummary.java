/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * The model for a summary of an Oracle Cloud Infrastructure Marketplace Publisher listing revision.
 * <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ListingRevisionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ListingRevisionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "listingId",
        "compartmentId",
        "displayName",
        "status",
        "lifecycleState",
        "packageType",
        "pricingType",
        "shortDescription",
        "tagline",
        "icon",
        "markets",
        "categories",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public ListingRevisionSummary(
            String id,
            String listingId,
            String compartmentId,
            String displayName,
            ListingRevision.Status status,
            ListingRevision.LifecycleState lifecycleState,
            PackageType packageType,
            ListingRevision.PricingType pricingType,
            String shortDescription,
            String tagline,
            ListingRevisionIconAttachment icon,
            java.util.List<String> markets,
            java.util.List<String> categories,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.listingId = listingId;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.status = status;
        this.lifecycleState = lifecycleState;
        this.packageType = packageType;
        this.pricingType = pricingType;
        this.shortDescription = shortDescription;
        this.tagline = tagline;
        this.icon = icon;
        this.markets = markets;
        this.categories = categories;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID for the listing revision in Marketplace Publisher. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID for the listing revision in Marketplace Publisher.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID for the listing in Marketplace Publisher. */
        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        /**
         * The OCID for the listing in Marketplace Publisher.
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
        /** The name of the listing revision. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the listing revision.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The current status of the listing revision. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private ListingRevision.Status status;

        /**
         * The current status of the listing revision.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(ListingRevision.Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The current state of the Listing. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ListingRevision.LifecycleState lifecycleState;

        /**
         * The current state of the Listing.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(ListingRevision.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The listing's package type. */
        @com.fasterxml.jackson.annotation.JsonProperty("packageType")
        private PackageType packageType;

        /**
         * The listing's package type.
         *
         * @param packageType the value to set
         * @return this builder
         */
        public Builder packageType(PackageType packageType) {
            this.packageType = packageType;
            this.__explicitlySet__.add("packageType");
            return this;
        }
        /** Pricing type of the listing. */
        @com.fasterxml.jackson.annotation.JsonProperty("pricingType")
        private ListingRevision.PricingType pricingType;

        /**
         * Pricing type of the listing.
         *
         * @param pricingType the value to set
         * @return this builder
         */
        public Builder pricingType(ListingRevision.PricingType pricingType) {
            this.pricingType = pricingType;
            this.__explicitlySet__.add("pricingType");
            return this;
        }
        /** A short description of the listing revision. */
        @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
        private String shortDescription;

        /**
         * A short description of the listing revision.
         *
         * @param shortDescription the value to set
         * @return this builder
         */
        public Builder shortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            this.__explicitlySet__.add("shortDescription");
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

        @com.fasterxml.jackson.annotation.JsonProperty("icon")
        private ListingRevisionIconAttachment icon;

        public Builder icon(ListingRevisionIconAttachment icon) {
            this.icon = icon;
            this.__explicitlySet__.add("icon");
            return this;
        }
        /** The markets where you can deploy the listing. */
        @com.fasterxml.jackson.annotation.JsonProperty("markets")
        private java.util.List<String> markets;

        /**
         * The markets where you can deploy the listing.
         *
         * @param markets the value to set
         * @return this builder
         */
        public Builder markets(java.util.List<String> markets) {
            this.markets = markets;
            this.__explicitlySet__.add("markets");
            return this;
        }
        /** Categories that the listing revision belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("categories")
        private java.util.List<String> categories;

        /**
         * Categories that the listing revision belongs to.
         *
         * @param categories the value to set
         * @return this builder
         */
        public Builder categories(java.util.List<String> categories) {
            this.categories = categories;
            this.__explicitlySet__.add("categories");
            return this;
        }
        /**
         * The date and time the listing revision was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2022-09-15T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the listing revision was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2022-09-15T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the listing revision was updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2022-09-15T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the listing revision was updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2022-09-15T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
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

        public ListingRevisionSummary build() {
            ListingRevisionSummary model =
                    new ListingRevisionSummary(
                            this.id,
                            this.listingId,
                            this.compartmentId,
                            this.displayName,
                            this.status,
                            this.lifecycleState,
                            this.packageType,
                            this.pricingType,
                            this.shortDescription,
                            this.tagline,
                            this.icon,
                            this.markets,
                            this.categories,
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
        public Builder copy(ListingRevisionSummary model) {
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
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
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
            if (model.wasPropertyExplicitlySet("shortDescription")) {
                this.shortDescription(model.getShortDescription());
            }
            if (model.wasPropertyExplicitlySet("tagline")) {
                this.tagline(model.getTagline());
            }
            if (model.wasPropertyExplicitlySet("icon")) {
                this.icon(model.getIcon());
            }
            if (model.wasPropertyExplicitlySet("markets")) {
                this.markets(model.getMarkets());
            }
            if (model.wasPropertyExplicitlySet("categories")) {
                this.categories(model.getCategories());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The OCID for the listing revision in Marketplace Publisher. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID for the listing revision in Marketplace Publisher.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID for the listing in Marketplace Publisher. */
    @com.fasterxml.jackson.annotation.JsonProperty("listingId")
    private final String listingId;

    /**
     * The OCID for the listing in Marketplace Publisher.
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

    /** The name of the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the listing revision.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The current status of the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final ListingRevision.Status status;

    /**
     * The current status of the listing revision.
     *
     * @return the value
     */
    public ListingRevision.Status getStatus() {
        return status;
    }

    /** The current state of the Listing. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ListingRevision.LifecycleState lifecycleState;

    /**
     * The current state of the Listing.
     *
     * @return the value
     */
    public ListingRevision.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The listing's package type. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageType")
    private final PackageType packageType;

    /**
     * The listing's package type.
     *
     * @return the value
     */
    public PackageType getPackageType() {
        return packageType;
    }

    /** Pricing type of the listing. */
    @com.fasterxml.jackson.annotation.JsonProperty("pricingType")
    private final ListingRevision.PricingType pricingType;

    /**
     * Pricing type of the listing.
     *
     * @return the value
     */
    public ListingRevision.PricingType getPricingType() {
        return pricingType;
    }

    /** A short description of the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
    private final String shortDescription;

    /**
     * A short description of the listing revision.
     *
     * @return the value
     */
    public String getShortDescription() {
        return shortDescription;
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

    @com.fasterxml.jackson.annotation.JsonProperty("icon")
    private final ListingRevisionIconAttachment icon;

    public ListingRevisionIconAttachment getIcon() {
        return icon;
    }

    /** The markets where you can deploy the listing. */
    @com.fasterxml.jackson.annotation.JsonProperty("markets")
    private final java.util.List<String> markets;

    /**
     * The markets where you can deploy the listing.
     *
     * @return the value
     */
    public java.util.List<String> getMarkets() {
        return markets;
    }

    /** Categories that the listing revision belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("categories")
    private final java.util.List<String> categories;

    /**
     * Categories that the listing revision belongs to.
     *
     * @return the value
     */
    public java.util.List<String> getCategories() {
        return categories;
    }

    /**
     * The date and time the listing revision was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2022-09-15T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the listing revision was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2022-09-15T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the listing revision was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2022-09-15T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the listing revision was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2022-09-15T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("ListingRevisionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", listingId=").append(String.valueOf(this.listingId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", packageType=").append(String.valueOf(this.packageType));
        sb.append(", pricingType=").append(String.valueOf(this.pricingType));
        sb.append(", shortDescription=").append(String.valueOf(this.shortDescription));
        sb.append(", tagline=").append(String.valueOf(this.tagline));
        sb.append(", icon=").append(String.valueOf(this.icon));
        sb.append(", markets=").append(String.valueOf(this.markets));
        sb.append(", categories=").append(String.valueOf(this.categories));
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
        if (!(o instanceof ListingRevisionSummary)) {
            return false;
        }

        ListingRevisionSummary other = (ListingRevisionSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.packageType, other.packageType)
                && java.util.Objects.equals(this.pricingType, other.pricingType)
                && java.util.Objects.equals(this.shortDescription, other.shortDescription)
                && java.util.Objects.equals(this.tagline, other.tagline)
                && java.util.Objects.equals(this.icon, other.icon)
                && java.util.Objects.equals(this.markets, other.markets)
                && java.util.Objects.equals(this.categories, other.categories)
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
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.packageType == null ? 43 : this.packageType.hashCode());
        result = (result * PRIME) + (this.pricingType == null ? 43 : this.pricingType.hashCode());
        result =
                (result * PRIME)
                        + (this.shortDescription == null ? 43 : this.shortDescription.hashCode());
        result = (result * PRIME) + (this.tagline == null ? 43 : this.tagline.hashCode());
        result = (result * PRIME) + (this.icon == null ? 43 : this.icon.hashCode());
        result = (result * PRIME) + (this.markets == null ? 43 : this.markets.hashCode());
        result = (result * PRIME) + (this.categories == null ? 43 : this.categories.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
