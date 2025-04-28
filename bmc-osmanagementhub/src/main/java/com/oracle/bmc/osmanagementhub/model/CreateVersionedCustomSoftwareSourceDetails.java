/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides the information used to create a versioned custom software source. <br>
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
        /**
         * Indicates whether the service should automatically resolve package dependencies when
         * including specific packages in the software source.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoResolveDependencies")
        private Boolean isAutoResolveDependencies;

        /**
         * Indicates whether the service should automatically resolve package dependencies when
         * including specific packages in the software source.
         *
         * @param isAutoResolveDependencies the value to set
         * @return this builder
         */
        public Builder isAutoResolveDependencies(Boolean isAutoResolveDependencies) {
            this.isAutoResolveDependencies = isAutoResolveDependencies;
            this.__explicitlySet__.add("isAutoResolveDependencies");
            return this;
        }
        /**
         * Indicates whether the service should create the software source from a list of packages
         * provided by the user.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isCreatedFromPackageList")
        private Boolean isCreatedFromPackageList;

        /**
         * Indicates whether the service should create the software source from a list of packages
         * provided by the user.
         *
         * @param isCreatedFromPackageList the value to set
         * @return this builder
         */
        public Builder isCreatedFromPackageList(Boolean isCreatedFromPackageList) {
            this.isCreatedFromPackageList = isCreatedFromPackageList;
            this.__explicitlySet__.add("isCreatedFromPackageList");
            return this;
        }
        /**
         * Indicates whether the software source will include only the latest versions of content
         * from vendor software sources, while accounting for other constraints set in the custom or
         * versioned custom software source (such as a package list or filters). * For a module
         * filter that does not specify a stream, this will include all available streams, and
         * within each stream only the latest version of packages. * For a module filter that does
         * specify a stream, this will include only the latest version of packages for the specified
         * stream. * For a package filter that does not specify a version, this will include only
         * the latest available version of the package. * For a package filter that does specify a
         * version, this will include only the specified version of the package (the
         * isLatestContentOnly attribute is ignored). * For a package list, this will include only
         * the specified version of packages and modules in the list (the isLatestContentOnly
         * attribute is ignored).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isLatestContentOnly")
        private Boolean isLatestContentOnly;

        /**
         * Indicates whether the software source will include only the latest versions of content
         * from vendor software sources, while accounting for other constraints set in the custom or
         * versioned custom software source (such as a package list or filters). * For a module
         * filter that does not specify a stream, this will include all available streams, and
         * within each stream only the latest version of packages. * For a module filter that does
         * specify a stream, this will include only the latest version of packages for the specified
         * stream. * For a package filter that does not specify a version, this will include only
         * the latest available version of the package. * For a package filter that does specify a
         * version, this will include only the specified version of the package (the
         * isLatestContentOnly attribute is ignored). * For a package list, this will include only
         * the specified version of packages and modules in the list (the isLatestContentOnly
         * attribute is ignored).
         *
         * @param isLatestContentOnly the value to set
         * @return this builder
         */
        public Builder isLatestContentOnly(Boolean isLatestContentOnly) {
            this.isLatestContentOnly = isLatestContentOnly;
            this.__explicitlySet__.add("isLatestContentOnly");
            return this;
        }
        /**
         * A property used for compatibility only. It doesn't provide a complete list of packages.
         * See {@link #addPackagesToSoftwareSourceDetails(AddPackagesToSoftwareSourceDetailsRequest)
         * addPackagesToSoftwareSourceDetails} for providing the list of packages used to create the
         * software source when isCreatedFromPackageList is set to true.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("packages")
        private java.util.List<String> packages;

        /**
         * A property used for compatibility only. It doesn't provide a complete list of packages.
         * See {@link #addPackagesToSoftwareSourceDetails(AddPackagesToSoftwareSourceDetailsRequest)
         * addPackagesToSoftwareSourceDetails} for providing the list of packages used to create the
         * software source when isCreatedFromPackageList is set to true.
         *
         * @param packages the value to set
         * @return this builder
         */
        public Builder packages(java.util.List<String> packages) {
            this.packages = packages;
            this.__explicitlySet__.add("packages");
            return this;
        }
        /** The creation type of a software source. */
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceSubType")
        private SoftwareSourceSubType softwareSourceSubType;

        /**
         * The creation type of a software source.
         *
         * @param softwareSourceSubType the value to set
         * @return this builder
         */
        public Builder softwareSourceSubType(SoftwareSourceSubType softwareSourceSubType) {
            this.softwareSourceSubType = softwareSourceSubType;
            this.__explicitlySet__.add("softwareSourceSubType");
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
                            this.softwareSourceVersion,
                            this.isAutoResolveDependencies,
                            this.isCreatedFromPackageList,
                            this.isLatestContentOnly,
                            this.packages,
                            this.softwareSourceSubType);
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
            if (model.wasPropertyExplicitlySet("isAutoResolveDependencies")) {
                this.isAutoResolveDependencies(model.getIsAutoResolveDependencies());
            }
            if (model.wasPropertyExplicitlySet("isCreatedFromPackageList")) {
                this.isCreatedFromPackageList(model.getIsCreatedFromPackageList());
            }
            if (model.wasPropertyExplicitlySet("isLatestContentOnly")) {
                this.isLatestContentOnly(model.getIsLatestContentOnly());
            }
            if (model.wasPropertyExplicitlySet("packages")) {
                this.packages(model.getPackages());
            }
            if (model.wasPropertyExplicitlySet("softwareSourceSubType")) {
                this.softwareSourceSubType(model.getSoftwareSourceSubType());
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
            String softwareSourceVersion,
            Boolean isAutoResolveDependencies,
            Boolean isCreatedFromPackageList,
            Boolean isLatestContentOnly,
            java.util.List<String> packages,
            SoftwareSourceSubType softwareSourceSubType) {
        super(compartmentId, displayName, description, freeformTags, definedTags);
        this.vendorSoftwareSources = vendorSoftwareSources;
        this.customSoftwareSourceFilter = customSoftwareSourceFilter;
        this.softwareSourceVersion = softwareSourceVersion;
        this.isAutoResolveDependencies = isAutoResolveDependencies;
        this.isCreatedFromPackageList = isCreatedFromPackageList;
        this.isLatestContentOnly = isLatestContentOnly;
        this.packages = packages;
        this.softwareSourceSubType = softwareSourceSubType;
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

    /**
     * Indicates whether the service should automatically resolve package dependencies when
     * including specific packages in the software source.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoResolveDependencies")
    private final Boolean isAutoResolveDependencies;

    /**
     * Indicates whether the service should automatically resolve package dependencies when
     * including specific packages in the software source.
     *
     * @return the value
     */
    public Boolean getIsAutoResolveDependencies() {
        return isAutoResolveDependencies;
    }

    /**
     * Indicates whether the service should create the software source from a list of packages
     * provided by the user.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isCreatedFromPackageList")
    private final Boolean isCreatedFromPackageList;

    /**
     * Indicates whether the service should create the software source from a list of packages
     * provided by the user.
     *
     * @return the value
     */
    public Boolean getIsCreatedFromPackageList() {
        return isCreatedFromPackageList;
    }

    /**
     * Indicates whether the software source will include only the latest versions of content from
     * vendor software sources, while accounting for other constraints set in the custom or
     * versioned custom software source (such as a package list or filters). * For a module filter
     * that does not specify a stream, this will include all available streams, and within each
     * stream only the latest version of packages. * For a module filter that does specify a stream,
     * this will include only the latest version of packages for the specified stream. * For a
     * package filter that does not specify a version, this will include only the latest available
     * version of the package. * For a package filter that does specify a version, this will include
     * only the specified version of the package (the isLatestContentOnly attribute is ignored). *
     * For a package list, this will include only the specified version of packages and modules in
     * the list (the isLatestContentOnly attribute is ignored).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isLatestContentOnly")
    private final Boolean isLatestContentOnly;

    /**
     * Indicates whether the software source will include only the latest versions of content from
     * vendor software sources, while accounting for other constraints set in the custom or
     * versioned custom software source (such as a package list or filters). * For a module filter
     * that does not specify a stream, this will include all available streams, and within each
     * stream only the latest version of packages. * For a module filter that does specify a stream,
     * this will include only the latest version of packages for the specified stream. * For a
     * package filter that does not specify a version, this will include only the latest available
     * version of the package. * For a package filter that does specify a version, this will include
     * only the specified version of the package (the isLatestContentOnly attribute is ignored). *
     * For a package list, this will include only the specified version of packages and modules in
     * the list (the isLatestContentOnly attribute is ignored).
     *
     * @return the value
     */
    public Boolean getIsLatestContentOnly() {
        return isLatestContentOnly;
    }

    /**
     * A property used for compatibility only. It doesn't provide a complete list of packages. See
     * {@link #addPackagesToSoftwareSourceDetails(AddPackagesToSoftwareSourceDetailsRequest)
     * addPackagesToSoftwareSourceDetails} for providing the list of packages used to create the
     * software source when isCreatedFromPackageList is set to true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("packages")
    private final java.util.List<String> packages;

    /**
     * A property used for compatibility only. It doesn't provide a complete list of packages. See
     * {@link #addPackagesToSoftwareSourceDetails(AddPackagesToSoftwareSourceDetailsRequest)
     * addPackagesToSoftwareSourceDetails} for providing the list of packages used to create the
     * software source when isCreatedFromPackageList is set to true.
     *
     * @return the value
     */
    public java.util.List<String> getPackages() {
        return packages;
    }

    /** The creation type of a software source. */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceSubType")
    private final SoftwareSourceSubType softwareSourceSubType;

    /**
     * The creation type of a software source.
     *
     * @return the value
     */
    public SoftwareSourceSubType getSoftwareSourceSubType() {
        return softwareSourceSubType;
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
        sb.append(", isAutoResolveDependencies=")
                .append(String.valueOf(this.isAutoResolveDependencies));
        sb.append(", isCreatedFromPackageList=")
                .append(String.valueOf(this.isCreatedFromPackageList));
        sb.append(", isLatestContentOnly=").append(String.valueOf(this.isLatestContentOnly));
        sb.append(", packages=").append(String.valueOf(this.packages));
        sb.append(", softwareSourceSubType=").append(String.valueOf(this.softwareSourceSubType));
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
                && java.util.Objects.equals(
                        this.isAutoResolveDependencies, other.isAutoResolveDependencies)
                && java.util.Objects.equals(
                        this.isCreatedFromPackageList, other.isCreatedFromPackageList)
                && java.util.Objects.equals(this.isLatestContentOnly, other.isLatestContentOnly)
                && java.util.Objects.equals(this.packages, other.packages)
                && java.util.Objects.equals(this.softwareSourceSubType, other.softwareSourceSubType)
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
        result =
                (result * PRIME)
                        + (this.isAutoResolveDependencies == null
                                ? 43
                                : this.isAutoResolveDependencies.hashCode());
        result =
                (result * PRIME)
                        + (this.isCreatedFromPackageList == null
                                ? 43
                                : this.isCreatedFromPackageList.hashCode());
        result =
                (result * PRIME)
                        + (this.isLatestContentOnly == null
                                ? 43
                                : this.isLatestContentOnly.hashCode());
        result = (result * PRIME) + (this.packages == null ? 43 : this.packages.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareSourceSubType == null
                                ? 43
                                : this.softwareSourceSubType.hashCode());
        return result;
    }
}
