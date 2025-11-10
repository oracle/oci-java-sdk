/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The data to create a CatalogItem. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateCatalogItemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateCatalogItemDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "configSourceType",
        "description",
        "versionDescription",
        "shortDescription",
        "timeReleased",
        "displayName",
        "catalogSourcePayload",
        "listingId",
        "listingVersion",
        "packageType",
        "isItemLocked",
        "freeformTags",
        "definedTags"
    })
    public CreateCatalogItemDetails(
            String compartmentId,
            CatalogItem.ConfigSourceType configSourceType,
            String description,
            String versionDescription,
            String shortDescription,
            java.util.Date timeReleased,
            String displayName,
            CatalogSourcePayload catalogSourcePayload,
            String listingId,
            String listingVersion,
            CatalogItem.PackageType packageType,
            Boolean isItemLocked,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.configSourceType = configSourceType;
        this.description = description;
        this.versionDescription = versionDescription;
        this.shortDescription = shortDescription;
        this.timeReleased = timeReleased;
        this.displayName = displayName;
        this.catalogSourcePayload = catalogSourcePayload;
        this.listingId = listingId;
        this.listingVersion = listingVersion;
        this.packageType = packageType;
        this.isItemLocked = isItemLocked;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Config source type Eg: STACK_TEMPLATE_CATALOG_SOURCE, PAR_CATALOG_SOURCE,
         * GIT_CATALOG_SOURCE, MARKETPLACE_CATALOG_SOURCE.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("configSourceType")
        private CatalogItem.ConfigSourceType configSourceType;

        /**
         * Config source type Eg: STACK_TEMPLATE_CATALOG_SOURCE, PAR_CATALOG_SOURCE,
         * GIT_CATALOG_SOURCE, MARKETPLACE_CATALOG_SOURCE.
         *
         * @param configSourceType the value to set
         * @return this builder
         */
        public Builder configSourceType(CatalogItem.ConfigSourceType configSourceType) {
            this.configSourceType = configSourceType;
            this.__explicitlySet__.add("configSourceType");
            return this;
        }
        /** The description of the CatalogItem. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the CatalogItem.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Version description about the catalog item. */
        @com.fasterxml.jackson.annotation.JsonProperty("versionDescription")
        private String versionDescription;

        /**
         * Version description about the catalog item.
         *
         * @param versionDescription the value to set
         * @return this builder
         */
        public Builder versionDescription(String versionDescription) {
            this.versionDescription = versionDescription;
            this.__explicitlySet__.add("versionDescription");
            return this;
        }
        /** Short description about the catalog item. */
        @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
        private String shortDescription;

        /**
         * Short description about the catalog item.
         *
         * @param shortDescription the value to set
         * @return this builder
         */
        public Builder shortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            this.__explicitlySet__.add("shortDescription");
            return this;
        }
        /**
         * The date and time the CatalogItem was released, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
        private java.util.Date timeReleased;

        /**
         * The date and time the CatalogItem was released, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeReleased the value to set
         * @return this builder
         */
        public Builder timeReleased(java.util.Date timeReleased) {
            this.timeReleased = timeReleased;
            this.__explicitlySet__.add("timeReleased");
            return this;
        }
        /** The CatalogItem name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The CatalogItem name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("catalogSourcePayload")
        private CatalogSourcePayload catalogSourcePayload;

        public Builder catalogSourcePayload(CatalogSourcePayload catalogSourcePayload) {
            this.catalogSourcePayload = catalogSourcePayload;
            this.__explicitlySet__.add("catalogSourcePayload");
            return this;
        }
        /** The catalog listing Id. */
        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        /**
         * The catalog listing Id.
         *
         * @param listingId the value to set
         * @return this builder
         */
        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
            return this;
        }
        /** The catalog package version. */
        @com.fasterxml.jackson.annotation.JsonProperty("listingVersion")
        private String listingVersion;

        /**
         * The catalog package version.
         *
         * @param listingVersion the value to set
         * @return this builder
         */
        public Builder listingVersion(String listingVersion) {
            this.listingVersion = listingVersion;
            this.__explicitlySet__.add("listingVersion");
            return this;
        }
        /** Config package type Eg: TF_PACKAGE, NON_TF_PACKAGE, CONFIG_FILE. */
        @com.fasterxml.jackson.annotation.JsonProperty("packageType")
        private CatalogItem.PackageType packageType;

        /**
         * Config package type Eg: TF_PACKAGE, NON_TF_PACKAGE, CONFIG_FILE.
         *
         * @param packageType the value to set
         * @return this builder
         */
        public Builder packageType(CatalogItem.PackageType packageType) {
            this.packageType = packageType;
            this.__explicitlySet__.add("packageType");
            return this;
        }
        /** Indicates if the CatalogItem is immutable or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("isItemLocked")
        private Boolean isItemLocked;

        /**
         * Indicates if the CatalogItem is immutable or not.
         *
         * @param isItemLocked the value to set
         * @return this builder
         */
        public Builder isItemLocked(Boolean isItemLocked) {
            this.isItemLocked = isItemLocked;
            this.__explicitlySet__.add("isItemLocked");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCatalogItemDetails build() {
            CreateCatalogItemDetails model =
                    new CreateCatalogItemDetails(
                            this.compartmentId,
                            this.configSourceType,
                            this.description,
                            this.versionDescription,
                            this.shortDescription,
                            this.timeReleased,
                            this.displayName,
                            this.catalogSourcePayload,
                            this.listingId,
                            this.listingVersion,
                            this.packageType,
                            this.isItemLocked,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCatalogItemDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("configSourceType")) {
                this.configSourceType(model.getConfigSourceType());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("versionDescription")) {
                this.versionDescription(model.getVersionDescription());
            }
            if (model.wasPropertyExplicitlySet("shortDescription")) {
                this.shortDescription(model.getShortDescription());
            }
            if (model.wasPropertyExplicitlySet("timeReleased")) {
                this.timeReleased(model.getTimeReleased());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("catalogSourcePayload")) {
                this.catalogSourcePayload(model.getCatalogSourcePayload());
            }
            if (model.wasPropertyExplicitlySet("listingId")) {
                this.listingId(model.getListingId());
            }
            if (model.wasPropertyExplicitlySet("listingVersion")) {
                this.listingVersion(model.getListingVersion());
            }
            if (model.wasPropertyExplicitlySet("packageType")) {
                this.packageType(model.getPackageType());
            }
            if (model.wasPropertyExplicitlySet("isItemLocked")) {
                this.isItemLocked(model.getIsItemLocked());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Config source type Eg: STACK_TEMPLATE_CATALOG_SOURCE, PAR_CATALOG_SOURCE, GIT_CATALOG_SOURCE,
     * MARKETPLACE_CATALOG_SOURCE.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configSourceType")
    private final CatalogItem.ConfigSourceType configSourceType;

    /**
     * Config source type Eg: STACK_TEMPLATE_CATALOG_SOURCE, PAR_CATALOG_SOURCE, GIT_CATALOG_SOURCE,
     * MARKETPLACE_CATALOG_SOURCE.
     *
     * @return the value
     */
    public CatalogItem.ConfigSourceType getConfigSourceType() {
        return configSourceType;
    }

    /** The description of the CatalogItem. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the CatalogItem.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Version description about the catalog item. */
    @com.fasterxml.jackson.annotation.JsonProperty("versionDescription")
    private final String versionDescription;

    /**
     * Version description about the catalog item.
     *
     * @return the value
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    /** Short description about the catalog item. */
    @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
    private final String shortDescription;

    /**
     * Short description about the catalog item.
     *
     * @return the value
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * The date and time the CatalogItem was released, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
    private final java.util.Date timeReleased;

    /**
     * The date and time the CatalogItem was released, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeReleased() {
        return timeReleased;
    }

    /** The CatalogItem name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The CatalogItem name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("catalogSourcePayload")
    private final CatalogSourcePayload catalogSourcePayload;

    public CatalogSourcePayload getCatalogSourcePayload() {
        return catalogSourcePayload;
    }

    /** The catalog listing Id. */
    @com.fasterxml.jackson.annotation.JsonProperty("listingId")
    private final String listingId;

    /**
     * The catalog listing Id.
     *
     * @return the value
     */
    public String getListingId() {
        return listingId;
    }

    /** The catalog package version. */
    @com.fasterxml.jackson.annotation.JsonProperty("listingVersion")
    private final String listingVersion;

    /**
     * The catalog package version.
     *
     * @return the value
     */
    public String getListingVersion() {
        return listingVersion;
    }

    /** Config package type Eg: TF_PACKAGE, NON_TF_PACKAGE, CONFIG_FILE. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageType")
    private final CatalogItem.PackageType packageType;

    /**
     * Config package type Eg: TF_PACKAGE, NON_TF_PACKAGE, CONFIG_FILE.
     *
     * @return the value
     */
    public CatalogItem.PackageType getPackageType() {
        return packageType;
    }

    /** Indicates if the CatalogItem is immutable or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("isItemLocked")
    private final Boolean isItemLocked;

    /**
     * Indicates if the CatalogItem is immutable or not.
     *
     * @return the value
     */
    public Boolean getIsItemLocked() {
        return isItemLocked;
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
        sb.append("CreateCatalogItemDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", configSourceType=").append(String.valueOf(this.configSourceType));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", versionDescription=").append(String.valueOf(this.versionDescription));
        sb.append(", shortDescription=").append(String.valueOf(this.shortDescription));
        sb.append(", timeReleased=").append(String.valueOf(this.timeReleased));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", catalogSourcePayload=").append(String.valueOf(this.catalogSourcePayload));
        sb.append(", listingId=").append(String.valueOf(this.listingId));
        sb.append(", listingVersion=").append(String.valueOf(this.listingVersion));
        sb.append(", packageType=").append(String.valueOf(this.packageType));
        sb.append(", isItemLocked=").append(String.valueOf(this.isItemLocked));
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
        if (!(o instanceof CreateCatalogItemDetails)) {
            return false;
        }

        CreateCatalogItemDetails other = (CreateCatalogItemDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.configSourceType, other.configSourceType)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.versionDescription, other.versionDescription)
                && java.util.Objects.equals(this.shortDescription, other.shortDescription)
                && java.util.Objects.equals(this.timeReleased, other.timeReleased)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.catalogSourcePayload, other.catalogSourcePayload)
                && java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.listingVersion, other.listingVersion)
                && java.util.Objects.equals(this.packageType, other.packageType)
                && java.util.Objects.equals(this.isItemLocked, other.isItemLocked)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.configSourceType == null ? 43 : this.configSourceType.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.versionDescription == null
                                ? 43
                                : this.versionDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.shortDescription == null ? 43 : this.shortDescription.hashCode());
        result = (result * PRIME) + (this.timeReleased == null ? 43 : this.timeReleased.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.catalogSourcePayload == null
                                ? 43
                                : this.catalogSourcePayload.hashCode());
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result =
                (result * PRIME)
                        + (this.listingVersion == null ? 43 : this.listingVersion.hashCode());
        result = (result * PRIME) + (this.packageType == null ? 43 : this.packageType.hashCode());
        result = (result * PRIME) + (this.isItemLocked == null ? 43 : this.isItemLocked.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
