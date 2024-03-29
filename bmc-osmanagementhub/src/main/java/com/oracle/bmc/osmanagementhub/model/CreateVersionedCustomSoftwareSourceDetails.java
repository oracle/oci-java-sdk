/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Description of a versioned custom software source to be created. <br>
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
        builder = CreateVersionedCustomSoftwareSourceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "softwareSourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateVersionedCustomSoftwareSourceDetails extends CreateSoftwareSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
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
        /** List of vendor software sources. */
        @com.fasterxml.jackson.annotation.JsonProperty("vendorSoftwareSources")
        private java.util.List<Id> vendorSoftwareSources;

        /**
         * List of vendor software sources.
         *
         * @param vendorSoftwareSources the value to set
         * @return this builder
         */
        public Builder vendorSoftwareSources(java.util.List<Id> vendorSoftwareSources) {
            this.vendorSoftwareSources = vendorSoftwareSources;
            this.__explicitlySet__.add("vendorSoftwareSources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customSoftwareSourceFilter")
        private CustomSoftwareSourceFilter customSoftwareSourceFilter;

        public Builder customSoftwareSourceFilter(
                CustomSoftwareSourceFilter customSoftwareSourceFilter) {
            this.customSoftwareSourceFilter = customSoftwareSourceFilter;
            this.__explicitlySet__.add("customSoftwareSourceFilter");
            return this;
        }
        /** The version to assign to this custom software source. */
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceVersion")
        private String softwareSourceVersion;

        /**
         * The version to assign to this custom software source.
         *
         * @param softwareSourceVersion the value to set
         * @return this builder
         */
        public Builder softwareSourceVersion(String softwareSourceVersion) {
            this.softwareSourceVersion = softwareSourceVersion;
            this.__explicitlySet__.add("softwareSourceVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateVersionedCustomSoftwareSourceDetails build() {
            CreateVersionedCustomSoftwareSourceDetails model =
                    new CreateVersionedCustomSoftwareSourceDetails(
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.freeformTags,
                            this.definedTags,
                            this.vendorSoftwareSources,
                            this.customSoftwareSourceFilter,
                            this.softwareSourceVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVersionedCustomSoftwareSourceDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("vendorSoftwareSources")) {
                this.vendorSoftwareSources(model.getVendorSoftwareSources());
            }
            if (model.wasPropertyExplicitlySet("customSoftwareSourceFilter")) {
                this.customSoftwareSourceFilter(model.getCustomSoftwareSourceFilter());
            }
            if (model.wasPropertyExplicitlySet("softwareSourceVersion")) {
                this.softwareSourceVersion(model.getSoftwareSourceVersion());
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
    public CreateVersionedCustomSoftwareSourceDetails(
            String compartmentId,
            String displayName,
            String description,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<Id> vendorSoftwareSources,
            CustomSoftwareSourceFilter customSoftwareSourceFilter,
            String softwareSourceVersion) {
        super(compartmentId, displayName, description, freeformTags, definedTags);
        this.vendorSoftwareSources = vendorSoftwareSources;
        this.customSoftwareSourceFilter = customSoftwareSourceFilter;
        this.softwareSourceVersion = softwareSourceVersion;
    }

    /** List of vendor software sources. */
    @com.fasterxml.jackson.annotation.JsonProperty("vendorSoftwareSources")
    private final java.util.List<Id> vendorSoftwareSources;

    /**
     * List of vendor software sources.
     *
     * @return the value
     */
    public java.util.List<Id> getVendorSoftwareSources() {
        return vendorSoftwareSources;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("customSoftwareSourceFilter")
    private final CustomSoftwareSourceFilter customSoftwareSourceFilter;

    public CustomSoftwareSourceFilter getCustomSoftwareSourceFilter() {
        return customSoftwareSourceFilter;
    }

    /** The version to assign to this custom software source. */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceVersion")
    private final String softwareSourceVersion;

    /**
     * The version to assign to this custom software source.
     *
     * @return the value
     */
    public String getSoftwareSourceVersion() {
        return softwareSourceVersion;
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
        sb.append("CreateVersionedCustomSoftwareSourceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", vendorSoftwareSources=").append(String.valueOf(this.vendorSoftwareSources));
        sb.append(", customSoftwareSourceFilter=")
                .append(String.valueOf(this.customSoftwareSourceFilter));
        sb.append(", softwareSourceVersion=").append(String.valueOf(this.softwareSourceVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateVersionedCustomSoftwareSourceDetails)) {
            return false;
        }

        CreateVersionedCustomSoftwareSourceDetails other =
                (CreateVersionedCustomSoftwareSourceDetails) o;
        return java.util.Objects.equals(this.vendorSoftwareSources, other.vendorSoftwareSources)
                && java.util.Objects.equals(
                        this.customSoftwareSourceFilter, other.customSoftwareSourceFilter)
                && java.util.Objects.equals(this.softwareSourceVersion, other.softwareSourceVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.vendorSoftwareSources == null
                                ? 43
                                : this.vendorSoftwareSources.hashCode());
        result =
                (result * PRIME)
                        + (this.customSoftwareSourceFilter == null
                                ? 43
                                : this.customSoftwareSourceFilter.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareSourceVersion == null
                                ? 43
                                : this.softwareSourceVersion.hashCode());
        return result;
    }
}
