/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * The model for a summary of an Oracle Cloud Infrastructure Marketplace listing.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ListingSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ListingSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "shortDescription",
        "isRoverExportable",
        "tagline",
        "icon",
        "packageType",
        "pricingTypes",
        "compatibleArchitectures",
        "regions",
        "isFeatured",
        "categories",
        "publisher",
        "supportedOperatingSystems",
        "listingType"
    })
    public ListingSummary(
            String id,
            String name,
            String shortDescription,
            Boolean isRoverExportable,
            String tagline,
            UploadData icon,
            PackageTypeEnum packageType,
            java.util.List<PricingTypes> pricingTypes,
            java.util.List<CompatibleArchitectures> compatibleArchitectures,
            java.util.List<Region> regions,
            Boolean isFeatured,
            java.util.List<String> categories,
            PublisherSummary publisher,
            java.util.List<OperatingSystem> supportedOperatingSystems,
            ListingType listingType) {
        super();
        this.id = id;
        this.name = name;
        this.shortDescription = shortDescription;
        this.isRoverExportable = isRoverExportable;
        this.tagline = tagline;
        this.icon = icon;
        this.packageType = packageType;
        this.pricingTypes = pricingTypes;
        this.compatibleArchitectures = compatibleArchitectures;
        this.regions = regions;
        this.isFeatured = isFeatured;
        this.categories = categories;
        this.publisher = publisher;
        this.supportedOperatingSystems = supportedOperatingSystems;
        this.listingType = listingType;
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
         * True if this application is Rover exportable
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRoverExportable")
        private Boolean isRoverExportable;

        /**
         * True if this application is Rover exportable
         * @param isRoverExportable the value to set
         * @return this builder
         **/
        public Builder isRoverExportable(Boolean isRoverExportable) {
            this.isRoverExportable = isRoverExportable;
            this.__explicitlySet__.add("isRoverExportable");
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

        @com.fasterxml.jackson.annotation.JsonProperty("icon")
        private UploadData icon;

        public Builder icon(UploadData icon) {
            this.icon = icon;
            this.__explicitlySet__.add("icon");
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
         * Summary of the pricing types available across all packages in the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pricingTypes")
        private java.util.List<PricingTypes> pricingTypes;

        /**
         * Summary of the pricing types available across all packages in the listing.
         * @param pricingTypes the value to set
         * @return this builder
         **/
        public Builder pricingTypes(java.util.List<PricingTypes> pricingTypes) {
            this.pricingTypes = pricingTypes;
            this.__explicitlySet__.add("pricingTypes");
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
         * Indicates whether the listing is featured.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isFeatured")
        private Boolean isFeatured;

        /**
         * Indicates whether the listing is featured.
         * @param isFeatured the value to set
         * @return this builder
         **/
        public Builder isFeatured(Boolean isFeatured) {
            this.isFeatured = isFeatured;
            this.__explicitlySet__.add("isFeatured");
            return this;
        }
        /**
         * Product categories that the listing belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("categories")
        private java.util.List<String> categories;

        /**
         * Product categories that the listing belongs to.
         * @param categories the value to set
         * @return this builder
         **/
        public Builder categories(java.util.List<String> categories) {
            this.categories = categories;
            this.__explicitlySet__.add("categories");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("publisher")
        private PublisherSummary publisher;

        public Builder publisher(PublisherSummary publisher) {
            this.publisher = publisher;
            this.__explicitlySet__.add("publisher");
            return this;
        }
        /**
         * The list of operating systems supported by the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("supportedOperatingSystems")
        private java.util.List<OperatingSystem> supportedOperatingSystems;

        /**
         * The list of operating systems supported by the listing.
         * @param supportedOperatingSystems the value to set
         * @return this builder
         **/
        public Builder supportedOperatingSystems(
                java.util.List<OperatingSystem> supportedOperatingSystems) {
            this.supportedOperatingSystems = supportedOperatingSystems;
            this.__explicitlySet__.add("supportedOperatingSystems");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ListingSummary build() {
            ListingSummary model =
                    new ListingSummary(
                            this.id,
                            this.name,
                            this.shortDescription,
                            this.isRoverExportable,
                            this.tagline,
                            this.icon,
                            this.packageType,
                            this.pricingTypes,
                            this.compatibleArchitectures,
                            this.regions,
                            this.isFeatured,
                            this.categories,
                            this.publisher,
                            this.supportedOperatingSystems,
                            this.listingType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ListingSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("shortDescription")) {
                this.shortDescription(model.getShortDescription());
            }
            if (model.wasPropertyExplicitlySet("isRoverExportable")) {
                this.isRoverExportable(model.getIsRoverExportable());
            }
            if (model.wasPropertyExplicitlySet("tagline")) {
                this.tagline(model.getTagline());
            }
            if (model.wasPropertyExplicitlySet("icon")) {
                this.icon(model.getIcon());
            }
            if (model.wasPropertyExplicitlySet("packageType")) {
                this.packageType(model.getPackageType());
            }
            if (model.wasPropertyExplicitlySet("pricingTypes")) {
                this.pricingTypes(model.getPricingTypes());
            }
            if (model.wasPropertyExplicitlySet("compatibleArchitectures")) {
                this.compatibleArchitectures(model.getCompatibleArchitectures());
            }
            if (model.wasPropertyExplicitlySet("regions")) {
                this.regions(model.getRegions());
            }
            if (model.wasPropertyExplicitlySet("isFeatured")) {
                this.isFeatured(model.getIsFeatured());
            }
            if (model.wasPropertyExplicitlySet("categories")) {
                this.categories(model.getCategories());
            }
            if (model.wasPropertyExplicitlySet("publisher")) {
                this.publisher(model.getPublisher());
            }
            if (model.wasPropertyExplicitlySet("supportedOperatingSystems")) {
                this.supportedOperatingSystems(model.getSupportedOperatingSystems());
            }
            if (model.wasPropertyExplicitlySet("listingType")) {
                this.listingType(model.getListingType());
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
     * True if this application is Rover exportable
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRoverExportable")
    private final Boolean isRoverExportable;

    /**
     * True if this application is Rover exportable
     * @return the value
     **/
    public Boolean getIsRoverExportable() {
        return isRoverExportable;
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

    @com.fasterxml.jackson.annotation.JsonProperty("icon")
    private final UploadData icon;

    public UploadData getIcon() {
        return icon;
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
     **/
    public enum PricingTypes {
        Free("FREE"),
        Byol("BYOL"),
        Paygo("PAYGO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PricingTypes.class);

        private final String value;
        private static java.util.Map<String, PricingTypes> map;

        static {
            map = new java.util.HashMap<>();
            for (PricingTypes v : PricingTypes.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PricingTypes(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PricingTypes create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PricingTypes', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Summary of the pricing types available across all packages in the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pricingTypes")
    private final java.util.List<PricingTypes> pricingTypes;

    /**
     * Summary of the pricing types available across all packages in the listing.
     * @return the value
     **/
    public java.util.List<PricingTypes> getPricingTypes() {
        return pricingTypes;
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
     * Indicates whether the listing is featured.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFeatured")
    private final Boolean isFeatured;

    /**
     * Indicates whether the listing is featured.
     * @return the value
     **/
    public Boolean getIsFeatured() {
        return isFeatured;
    }

    /**
     * Product categories that the listing belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("categories")
    private final java.util.List<String> categories;

    /**
     * Product categories that the listing belongs to.
     * @return the value
     **/
    public java.util.List<String> getCategories() {
        return categories;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    private final PublisherSummary publisher;

    public PublisherSummary getPublisher() {
        return publisher;
    }

    /**
     * The list of operating systems supported by the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportedOperatingSystems")
    private final java.util.List<OperatingSystem> supportedOperatingSystems;

    /**
     * The list of operating systems supported by the listing.
     * @return the value
     **/
    public java.util.List<OperatingSystem> getSupportedOperatingSystems() {
        return supportedOperatingSystems;
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
        sb.append("ListingSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", shortDescription=").append(String.valueOf(this.shortDescription));
        sb.append(", isRoverExportable=").append(String.valueOf(this.isRoverExportable));
        sb.append(", tagline=").append(String.valueOf(this.tagline));
        sb.append(", icon=").append(String.valueOf(this.icon));
        sb.append(", packageType=").append(String.valueOf(this.packageType));
        sb.append(", pricingTypes=").append(String.valueOf(this.pricingTypes));
        sb.append(", compatibleArchitectures=")
                .append(String.valueOf(this.compatibleArchitectures));
        sb.append(", regions=").append(String.valueOf(this.regions));
        sb.append(", isFeatured=").append(String.valueOf(this.isFeatured));
        sb.append(", categories=").append(String.valueOf(this.categories));
        sb.append(", publisher=").append(String.valueOf(this.publisher));
        sb.append(", supportedOperatingSystems=")
                .append(String.valueOf(this.supportedOperatingSystems));
        sb.append(", listingType=").append(String.valueOf(this.listingType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListingSummary)) {
            return false;
        }

        ListingSummary other = (ListingSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.shortDescription, other.shortDescription)
                && java.util.Objects.equals(this.isRoverExportable, other.isRoverExportable)
                && java.util.Objects.equals(this.tagline, other.tagline)
                && java.util.Objects.equals(this.icon, other.icon)
                && java.util.Objects.equals(this.packageType, other.packageType)
                && java.util.Objects.equals(this.pricingTypes, other.pricingTypes)
                && java.util.Objects.equals(
                        this.compatibleArchitectures, other.compatibleArchitectures)
                && java.util.Objects.equals(this.regions, other.regions)
                && java.util.Objects.equals(this.isFeatured, other.isFeatured)
                && java.util.Objects.equals(this.categories, other.categories)
                && java.util.Objects.equals(this.publisher, other.publisher)
                && java.util.Objects.equals(
                        this.supportedOperatingSystems, other.supportedOperatingSystems)
                && java.util.Objects.equals(this.listingType, other.listingType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.shortDescription == null ? 43 : this.shortDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.isRoverExportable == null ? 43 : this.isRoverExportable.hashCode());
        result = (result * PRIME) + (this.tagline == null ? 43 : this.tagline.hashCode());
        result = (result * PRIME) + (this.icon == null ? 43 : this.icon.hashCode());
        result = (result * PRIME) + (this.packageType == null ? 43 : this.packageType.hashCode());
        result = (result * PRIME) + (this.pricingTypes == null ? 43 : this.pricingTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.compatibleArchitectures == null
                                ? 43
                                : this.compatibleArchitectures.hashCode());
        result = (result * PRIME) + (this.regions == null ? 43 : this.regions.hashCode());
        result = (result * PRIME) + (this.isFeatured == null ? 43 : this.isFeatured.hashCode());
        result = (result * PRIME) + (this.categories == null ? 43 : this.categories.hashCode());
        result = (result * PRIME) + (this.publisher == null ? 43 : this.publisher.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedOperatingSystems == null
                                ? 43
                                : this.supportedOperatingSystems.hashCode());
        result = (result * PRIME) + (this.listingType == null ? 43 : this.listingType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
