/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ListingSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ListingSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
        private String shortDescription;

        public Builder shortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            this.__explicitlySet__.add("shortDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tagline")
        private String tagline;

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

        @com.fasterxml.jackson.annotation.JsonProperty("packageType")
        private PackageTypeEnum packageType;

        public Builder packageType(PackageTypeEnum packageType) {
            this.packageType = packageType;
            this.__explicitlySet__.add("packageType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pricingTypes")
        private java.util.List<PricingTypes> pricingTypes;

        public Builder pricingTypes(java.util.List<PricingTypes> pricingTypes) {
            this.pricingTypes = pricingTypes;
            this.__explicitlySet__.add("pricingTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("regions")
        private java.util.List<Region> regions;

        public Builder regions(java.util.List<Region> regions) {
            this.regions = regions;
            this.__explicitlySet__.add("regions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isFeatured")
        private Boolean isFeatured;

        public Builder isFeatured(Boolean isFeatured) {
            this.isFeatured = isFeatured;
            this.__explicitlySet__.add("isFeatured");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("categories")
        private java.util.List<String> categories;

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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ListingSummary build() {
            ListingSummary __instance__ =
                    new ListingSummary(
                            id,
                            name,
                            shortDescription,
                            tagline,
                            icon,
                            packageType,
                            pricingTypes,
                            regions,
                            isFeatured,
                            categories,
                            publisher);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ListingSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .name(o.getName())
                            .shortDescription(o.getShortDescription())
                            .tagline(o.getTagline())
                            .icon(o.getIcon())
                            .packageType(o.getPackageType())
                            .pricingTypes(o.getPricingTypes())
                            .regions(o.getRegions())
                            .isFeatured(o.getIsFeatured())
                            .categories(o.getCategories())
                            .publisher(o.getPublisher());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The unique identifier for the listing in Marketplace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The name of the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * A short description of the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
    String shortDescription;

    /**
     * The tagline of the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tagline")
    String tagline;

    @com.fasterxml.jackson.annotation.JsonProperty("icon")
    UploadData icon;

    /**
     * The listing's package type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("packageType")
    PackageTypeEnum packageType;
    /**
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PricingTypes {
        Free("FREE"),
        Byol("BYOL"),
        Paygo("PAYGO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    java.util.List<PricingTypes> pricingTypes;

    /**
     * The regions where the listing is eligible to be deployed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regions")
    java.util.List<Region> regions;

    /**
     * Indicates whether the listing is featured.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFeatured")
    Boolean isFeatured;

    /**
     * Product categories that the listing belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("categories")
    java.util.List<String> categories;

    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    PublisherSummary publisher;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
