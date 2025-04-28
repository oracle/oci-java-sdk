/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * The model for an Oracle Cloud Infrastructure Marketplace Publisher listing revision package. <br>
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
        builder = CreateListingRevisionPackageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateListingRevisionPackageDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "listingRevisionId",
        "packageVersion",
        "displayName",
        "description",
        "artifactId",
        "termId",
        "isDefault",
        "areSecurityUpgradesProvided",
        "freeformTags",
        "definedTags"
    })
    public CreateListingRevisionPackageDetails(
            String listingRevisionId,
            String packageVersion,
            String displayName,
            String description,
            String artifactId,
            String termId,
            Boolean isDefault,
            Boolean areSecurityUpgradesProvided,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.listingRevisionId = listingRevisionId;
        this.packageVersion = packageVersion;
        this.displayName = displayName;
        this.description = description;
        this.artifactId = artifactId;
        this.termId = termId;
        this.isDefault = isDefault;
        this.areSecurityUpgradesProvided = areSecurityUpgradesProvided;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID for the listing revision in Marketplace Publisher. */
        @com.fasterxml.jackson.annotation.JsonProperty("listingRevisionId")
        private String listingRevisionId;

        /**
         * The OCID for the listing revision in Marketplace Publisher.
         *
         * @param listingRevisionId the value to set
         * @return this builder
         */
        public Builder listingRevisionId(String listingRevisionId) {
            this.listingRevisionId = listingRevisionId;
            this.__explicitlySet__.add("listingRevisionId");
            return this;
        }
        /** The version for the package. */
        @com.fasterxml.jackson.annotation.JsonProperty("packageVersion")
        private String packageVersion;

        /**
         * The version for the package.
         *
         * @param packageVersion the value to set
         * @return this builder
         */
        public Builder packageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            this.__explicitlySet__.add("packageVersion");
            return this;
        }
        /** The name for the listing revision package. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name for the listing revision package.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Description for this package. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description for this package.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The unique identifier for the artifact. */
        @com.fasterxml.jackson.annotation.JsonProperty("artifactId")
        private String artifactId;

        /**
         * The unique identifier for the artifact.
         *
         * @param artifactId the value to set
         * @return this builder
         */
        public Builder artifactId(String artifactId) {
            this.artifactId = artifactId;
            this.__explicitlySet__.add("artifactId");
            return this;
        }
        /** The unique identifier for the term. */
        @com.fasterxml.jackson.annotation.JsonProperty("termId")
        private String termId;

        /**
         * The unique identifier for the term.
         *
         * @param termId the value to set
         * @return this builder
         */
        public Builder termId(String termId) {
            this.termId = termId;
            this.__explicitlySet__.add("termId");
            return this;
        }
        /** Identifies that this will be default package for the listing revision. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        /**
         * Identifies that this will be default package for the listing revision.
         *
         * @param isDefault the value to set
         * @return this builder
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }
        /** Identifies whether security upgrades will be provided for this package. */
        @com.fasterxml.jackson.annotation.JsonProperty("areSecurityUpgradesProvided")
        private Boolean areSecurityUpgradesProvided;

        /**
         * Identifies whether security upgrades will be provided for this package.
         *
         * @param areSecurityUpgradesProvided the value to set
         * @return this builder
         */
        public Builder areSecurityUpgradesProvided(Boolean areSecurityUpgradesProvided) {
            this.areSecurityUpgradesProvided = areSecurityUpgradesProvided;
            this.__explicitlySet__.add("areSecurityUpgradesProvided");
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

        public CreateListingRevisionPackageDetails build() {
            CreateListingRevisionPackageDetails model =
                    new CreateListingRevisionPackageDetails(
                            this.listingRevisionId,
                            this.packageVersion,
                            this.displayName,
                            this.description,
                            this.artifactId,
                            this.termId,
                            this.isDefault,
                            this.areSecurityUpgradesProvided,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateListingRevisionPackageDetails model) {
            if (model.wasPropertyExplicitlySet("listingRevisionId")) {
                this.listingRevisionId(model.getListingRevisionId());
            }
            if (model.wasPropertyExplicitlySet("packageVersion")) {
                this.packageVersion(model.getPackageVersion());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("artifactId")) {
                this.artifactId(model.getArtifactId());
            }
            if (model.wasPropertyExplicitlySet("termId")) {
                this.termId(model.getTermId());
            }
            if (model.wasPropertyExplicitlySet("isDefault")) {
                this.isDefault(model.getIsDefault());
            }
            if (model.wasPropertyExplicitlySet("areSecurityUpgradesProvided")) {
                this.areSecurityUpgradesProvided(model.getAreSecurityUpgradesProvided());
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

    /** The OCID for the listing revision in Marketplace Publisher. */
    @com.fasterxml.jackson.annotation.JsonProperty("listingRevisionId")
    private final String listingRevisionId;

    /**
     * The OCID for the listing revision in Marketplace Publisher.
     *
     * @return the value
     */
    public String getListingRevisionId() {
        return listingRevisionId;
    }

    /** The version for the package. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageVersion")
    private final String packageVersion;

    /**
     * The version for the package.
     *
     * @return the value
     */
    public String getPackageVersion() {
        return packageVersion;
    }

    /** The name for the listing revision package. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name for the listing revision package.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Description for this package. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description for this package.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The unique identifier for the artifact. */
    @com.fasterxml.jackson.annotation.JsonProperty("artifactId")
    private final String artifactId;

    /**
     * The unique identifier for the artifact.
     *
     * @return the value
     */
    public String getArtifactId() {
        return artifactId;
    }

    /** The unique identifier for the term. */
    @com.fasterxml.jackson.annotation.JsonProperty("termId")
    private final String termId;

    /**
     * The unique identifier for the term.
     *
     * @return the value
     */
    public String getTermId() {
        return termId;
    }

    /** Identifies that this will be default package for the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    /**
     * Identifies that this will be default package for the listing revision.
     *
     * @return the value
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /** Identifies whether security upgrades will be provided for this package. */
    @com.fasterxml.jackson.annotation.JsonProperty("areSecurityUpgradesProvided")
    private final Boolean areSecurityUpgradesProvided;

    /**
     * Identifies whether security upgrades will be provided for this package.
     *
     * @return the value
     */
    public Boolean getAreSecurityUpgradesProvided() {
        return areSecurityUpgradesProvided;
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
        sb.append("CreateListingRevisionPackageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("listingRevisionId=").append(String.valueOf(this.listingRevisionId));
        sb.append(", packageVersion=").append(String.valueOf(this.packageVersion));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", artifactId=").append(String.valueOf(this.artifactId));
        sb.append(", termId=").append(String.valueOf(this.termId));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(", areSecurityUpgradesProvided=")
                .append(String.valueOf(this.areSecurityUpgradesProvided));
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
        if (!(o instanceof CreateListingRevisionPackageDetails)) {
            return false;
        }

        CreateListingRevisionPackageDetails other = (CreateListingRevisionPackageDetails) o;
        return java.util.Objects.equals(this.listingRevisionId, other.listingRevisionId)
                && java.util.Objects.equals(this.packageVersion, other.packageVersion)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.artifactId, other.artifactId)
                && java.util.Objects.equals(this.termId, other.termId)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && java.util.Objects.equals(
                        this.areSecurityUpgradesProvided, other.areSecurityUpgradesProvided)
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
                        + (this.listingRevisionId == null ? 43 : this.listingRevisionId.hashCode());
        result =
                (result * PRIME)
                        + (this.packageVersion == null ? 43 : this.packageVersion.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.artifactId == null ? 43 : this.artifactId.hashCode());
        result = (result * PRIME) + (this.termId == null ? 43 : this.termId.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result =
                (result * PRIME)
                        + (this.areSecurityUpgradesProvided == null
                                ? 43
                                : this.areSecurityUpgradesProvided.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
