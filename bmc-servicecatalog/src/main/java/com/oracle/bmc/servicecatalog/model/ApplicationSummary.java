/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicecatalog.model;

/**
 * The model for summary of an application in service catalog. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210527")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ApplicationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ApplicationSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** Identifier of the application from a service catalog. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityId")
        private String entityId;

        /**
         * Identifier of the application from a service catalog.
         *
         * @param entityId the value to set
         * @return this builder
         */
        public Builder entityId(String entityId) {
            this.entityId = entityId;
            this.__explicitlySet__.add("entityId");
            return this;
        }
        /** The type of an application in the service catalog. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        /**
         * The type of an application in the service catalog.
         *
         * @param entityType the value to set
         * @return this builder
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }
        /** The name that service catalog should use to display this application. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name that service catalog should use to display this application.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Indicates whether the application is featured. */
        @com.fasterxml.jackson.annotation.JsonProperty("isFeatured")
        private Boolean isFeatured;

        /**
         * Indicates whether the application is featured.
         *
         * @param isFeatured the value to set
         * @return this builder
         */
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
        /** A short description of the application. */
        @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
        private String shortDescription;

        /**
         * A short description of the application.
         *
         * @param shortDescription the value to set
         * @return this builder
         */
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
        /** Summary of the pricing types available across all packages in the application. */
        @com.fasterxml.jackson.annotation.JsonProperty("pricingType")
        private PricingTypeEnum pricingType;

        /**
         * Summary of the pricing types available across all packages in the application.
         *
         * @param pricingType the value to set
         * @return this builder
         */
        public Builder pricingType(PricingTypeEnum pricingType) {
            this.pricingType = pricingType;
            this.__explicitlySet__.add("pricingType");
            return this;
        }
        /** The type of the packages withing the application. */
        @com.fasterxml.jackson.annotation.JsonProperty("packageType")
        private PackageTypeEnum packageType;

        /**
         * The type of the packages withing the application.
         *
         * @param packageType the value to set
         * @return this builder
         */
        public Builder packageType(PackageTypeEnum packageType) {
            this.packageType = packageType;
            this.__explicitlySet__.add("packageType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApplicationSummary build() {
            ApplicationSummary model =
                    new ApplicationSummary(
                            this.entityId,
                            this.entityType,
                            this.displayName,
                            this.isFeatured,
                            this.publisher,
                            this.shortDescription,
                            this.logo,
                            this.pricingType,
                            this.packageType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApplicationSummary model) {
            if (model.wasPropertyExplicitlySet("entityId")) {
                this.entityId(model.getEntityId());
            }
            if (model.wasPropertyExplicitlySet("entityType")) {
                this.entityType(model.getEntityType());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("isFeatured")) {
                this.isFeatured(model.getIsFeatured());
            }
            if (model.wasPropertyExplicitlySet("publisher")) {
                this.publisher(model.getPublisher());
            }
            if (model.wasPropertyExplicitlySet("shortDescription")) {
                this.shortDescription(model.getShortDescription());
            }
            if (model.wasPropertyExplicitlySet("logo")) {
                this.logo(model.getLogo());
            }
            if (model.wasPropertyExplicitlySet("pricingType")) {
                this.pricingType(model.getPricingType());
            }
            if (model.wasPropertyExplicitlySet("packageType")) {
                this.packageType(model.getPackageType());
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

    /** Identifier of the application from a service catalog. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityId")
    private final String entityId;

    /**
     * Identifier of the application from a service catalog.
     *
     * @return the value
     */
    public String getEntityId() {
        return entityId;
    }

    /** The type of an application in the service catalog. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final String entityType;

    /**
     * The type of an application in the service catalog.
     *
     * @return the value
     */
    public String getEntityType() {
        return entityType;
    }

    /** The name that service catalog should use to display this application. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name that service catalog should use to display this application.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Indicates whether the application is featured. */
    @com.fasterxml.jackson.annotation.JsonProperty("isFeatured")
    private final Boolean isFeatured;

    /**
     * Indicates whether the application is featured.
     *
     * @return the value
     */
    public Boolean getIsFeatured() {
        return isFeatured;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    private final PublisherSummary publisher;

    public PublisherSummary getPublisher() {
        return publisher;
    }

    /** A short description of the application. */
    @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
    private final String shortDescription;

    /**
     * A short description of the application.
     *
     * @return the value
     */
    public String getShortDescription() {
        return shortDescription;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("logo")
    private final UploadData logo;

    public UploadData getLogo() {
        return logo;
    }

    /** Summary of the pricing types available across all packages in the application. */
    @com.fasterxml.jackson.annotation.JsonProperty("pricingType")
    private final PricingTypeEnum pricingType;

    /**
     * Summary of the pricing types available across all packages in the application.
     *
     * @return the value
     */
    public PricingTypeEnum getPricingType() {
        return pricingType;
    }

    /** The type of the packages withing the application. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageType")
    private final PackageTypeEnum packageType;

    /**
     * The type of the packages withing the application.
     *
     * @return the value
     */
    public PackageTypeEnum getPackageType() {
        return packageType;
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
        sb.append("ApplicationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("entityId=").append(String.valueOf(this.entityId));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", isFeatured=").append(String.valueOf(this.isFeatured));
        sb.append(", publisher=").append(String.valueOf(this.publisher));
        sb.append(", shortDescription=").append(String.valueOf(this.shortDescription));
        sb.append(", logo=").append(String.valueOf(this.logo));
        sb.append(", pricingType=").append(String.valueOf(this.pricingType));
        sb.append(", packageType=").append(String.valueOf(this.packageType));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
