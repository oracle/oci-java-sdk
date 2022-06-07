/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicecatalog.model;

/**
 * The model for summary of an application in service catalog.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210527")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ApplicationSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ApplicationSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "entityId",
        "entityType",
        "displayName",
        "isFeatured",
        "publisher",
        "shortDescription",
        "logo",
        "pricingType",
        "packageType"
    })
    public ApplicationSummary(
            String entityId,
            String entityType,
            String displayName,
            Boolean isFeatured,
            PublisherSummary publisher,
            String shortDescription,
            UploadData logo,
            PricingTypeEnum pricingType,
            PackageTypeEnum packageType) {
        super();
        this.entityId = entityId;
        this.entityType = entityType;
        this.displayName = displayName;
        this.isFeatured = isFeatured;
        this.publisher = publisher;
        this.shortDescription = shortDescription;
        this.logo = logo;
        this.pricingType = pricingType;
        this.packageType = packageType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("entityId")
        private String entityId;

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            this.__explicitlySet__.add("entityId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isFeatured")
        private Boolean isFeatured;

        public Builder isFeatured(Boolean isFeatured) {
            this.isFeatured = isFeatured;
            this.__explicitlySet__.add("isFeatured");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("publisher")
        private PublisherSummary publisher;

        public Builder publisher(PublisherSummary publisher) {
            this.publisher = publisher;
            this.__explicitlySet__.add("publisher");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
        private String shortDescription;

        public Builder shortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            this.__explicitlySet__.add("shortDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logo")
        private UploadData logo;

        public Builder logo(UploadData logo) {
            this.logo = logo;
            this.__explicitlySet__.add("logo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pricingType")
        private PricingTypeEnum pricingType;

        public Builder pricingType(PricingTypeEnum pricingType) {
            this.pricingType = pricingType;
            this.__explicitlySet__.add("pricingType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("packageType")
        private PackageTypeEnum packageType;

        public Builder packageType(PackageTypeEnum packageType) {
            this.packageType = packageType;
            this.__explicitlySet__.add("packageType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApplicationSummary build() {
            ApplicationSummary __instance__ =
                    new ApplicationSummary(
                            entityId,
                            entityType,
                            displayName,
                            isFeatured,
                            publisher,
                            shortDescription,
                            logo,
                            pricingType,
                            packageType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApplicationSummary o) {
            Builder copiedBuilder =
                    entityId(o.getEntityId())
                            .entityType(o.getEntityType())
                            .displayName(o.getDisplayName())
                            .isFeatured(o.getIsFeatured())
                            .publisher(o.getPublisher())
                            .shortDescription(o.getShortDescription())
                            .logo(o.getLogo())
                            .pricingType(o.getPricingType())
                            .packageType(o.getPackageType());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Identifier of the application from a service catalog.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityId")
    private final String entityId;

    public String getEntityId() {
        return entityId;
    }

    /**
     * The type of an application in the service catalog.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final String entityType;

    public String getEntityType() {
        return entityType;
    }

    /**
     * The name that service catalog should use to display this application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * Indicates whether the application is featured.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFeatured")
    private final Boolean isFeatured;

    public Boolean getIsFeatured() {
        return isFeatured;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    private final PublisherSummary publisher;

    public PublisherSummary getPublisher() {
        return publisher;
    }

    /**
     * A short description of the application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
    private final String shortDescription;

    public String getShortDescription() {
        return shortDescription;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("logo")
    private final UploadData logo;

    public UploadData getLogo() {
        return logo;
    }

    /**
     * Summary of the pricing types available across all packages in the application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pricingType")
    private final PricingTypeEnum pricingType;

    public PricingTypeEnum getPricingType() {
        return pricingType;
    }

    /**
     * The type of the packages withing the application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("packageType")
    private final PackageTypeEnum packageType;

    public PackageTypeEnum getPackageType() {
        return packageType;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ApplicationSummary(");
        sb.append("entityId=").append(String.valueOf(this.entityId));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", isFeatured=").append(String.valueOf(this.isFeatured));
        sb.append(", publisher=").append(String.valueOf(this.publisher));
        sb.append(", shortDescription=").append(String.valueOf(this.shortDescription));
        sb.append(", logo=").append(String.valueOf(this.logo));
        sb.append(", pricingType=").append(String.valueOf(this.pricingType));
        sb.append(", packageType=").append(String.valueOf(this.packageType));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApplicationSummary)) {
            return false;
        }

        ApplicationSummary other = (ApplicationSummary) o;
        return java.util.Objects.equals(this.entityId, other.entityId)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.isFeatured, other.isFeatured)
                && java.util.Objects.equals(this.publisher, other.publisher)
                && java.util.Objects.equals(this.shortDescription, other.shortDescription)
                && java.util.Objects.equals(this.logo, other.logo)
                && java.util.Objects.equals(this.pricingType, other.pricingType)
                && java.util.Objects.equals(this.packageType, other.packageType)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.entityId == null ? 43 : this.entityId.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.isFeatured == null ? 43 : this.isFeatured.hashCode());
        result = (result * PRIME) + (this.publisher == null ? 43 : this.publisher.hashCode());
        result =
                (result * PRIME)
                        + (this.shortDescription == null ? 43 : this.shortDescription.hashCode());
        result = (result * PRIME) + (this.logo == null ? 43 : this.logo.hashCode());
        result = (result * PRIME) + (this.pricingType == null ? 43 : this.pricingType.hashCode());
        result = (result * PRIME) + (this.packageType == null ? 43 : this.packageType.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
