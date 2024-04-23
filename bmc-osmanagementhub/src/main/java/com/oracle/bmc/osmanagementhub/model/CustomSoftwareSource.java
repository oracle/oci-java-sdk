/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * The object that defines a custom software source. A software source contains a collection of
 * packages. For more information, see [Managing Software
 * Sources](https://docs.cloud.oracle.com/iaas/osmh/doc/software-sources.htm). <br>
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
        builder = CustomSoftwareSource.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "softwareSourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CustomSoftwareSource extends SoftwareSource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availability")
        private Availability availability;

        public Builder availability(Availability availability) {
            this.availability = availability;
            this.__explicitlySet__.add("availability");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availabilityAtOci")
        private Availability availabilityAtOci;

        public Builder availabilityAtOci(Availability availabilityAtOci) {
            this.availabilityAtOci = availabilityAtOci;
            this.__explicitlySet__.add("availabilityAtOci");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("repoId")
        private String repoId;

        public Builder repoId(String repoId) {
            this.repoId = repoId;
            this.__explicitlySet__.add("repoId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
        private OsFamily osFamily;

        public Builder osFamily(OsFamily osFamily) {
            this.osFamily = osFamily;
            this.__explicitlySet__.add("osFamily");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("archType")
        private ArchType archType;

        public Builder archType(ArchType archType) {
            this.archType = archType;
            this.__explicitlySet__.add("archType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("packageCount")
        private Long packageCount;

        public Builder packageCount(Long packageCount) {
            this.packageCount = packageCount;
            this.__explicitlySet__.add("packageCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("checksumType")
        private ChecksumType checksumType;

        public Builder checksumType(ChecksumType checksumType) {
            this.checksumType = checksumType;
            this.__explicitlySet__.add("checksumType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("gpgKeyUrl")
        private String gpgKeyUrl;

        public Builder gpgKeyUrl(String gpgKeyUrl) {
            this.gpgKeyUrl = gpgKeyUrl;
            this.__explicitlySet__.add("gpgKeyUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("gpgKeyId")
        private String gpgKeyId;

        public Builder gpgKeyId(String gpgKeyId) {
            this.gpgKeyId = gpgKeyId;
            this.__explicitlySet__.add("gpgKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("gpgKeyFingerprint")
        private String gpgKeyFingerprint;

        public Builder gpgKeyFingerprint(String gpgKeyFingerprint) {
            this.gpgKeyFingerprint = gpgKeyFingerprint;
            this.__explicitlySet__.add("gpgKeyFingerprint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("size")
        private Double size;

        public Builder size(Double size) {
            this.size = size;
            this.__explicitlySet__.add("size");
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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * List of vendor software sources that are used for the basis of the custom software
         * source.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vendorSoftwareSources")
        private java.util.List<Id> vendorSoftwareSources;

        /**
         * List of vendor software sources that are used for the basis of the custom software
         * source.
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
        /**
         * Indicates whether the service should automatically update the custom software source to
         * use the latest package versions available. The service reviews packages levels once a
         * day.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutomaticallyUpdated")
        private Boolean isAutomaticallyUpdated;

        /**
         * Indicates whether the service should automatically update the custom software source to
         * use the latest package versions available. The service reviews packages levels once a
         * day.
         *
         * @param isAutomaticallyUpdated the value to set
         * @return this builder
         */
        public Builder isAutomaticallyUpdated(Boolean isAutomaticallyUpdated) {
            this.isAutomaticallyUpdated = isAutomaticallyUpdated;
            this.__explicitlySet__.add("isAutomaticallyUpdated");
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
        /** The packages in the software source. */
        @com.fasterxml.jackson.annotation.JsonProperty("packages")
        private java.util.List<String> packages;

        /**
         * The packages in the software source.
         *
         * @param packages the value to set
         * @return this builder
         */
        public Builder packages(java.util.List<String> packages) {
            this.packages = packages;
            this.__explicitlySet__.add("packages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CustomSoftwareSource build() {
            CustomSoftwareSource model =
                    new CustomSoftwareSource(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.timeCreated,
                            this.description,
                            this.availability,
                            this.availabilityAtOci,
                            this.repoId,
                            this.osFamily,
                            this.archType,
                            this.lifecycleState,
                            this.packageCount,
                            this.url,
                            this.checksumType,
                            this.gpgKeyUrl,
                            this.gpgKeyId,
                            this.gpgKeyFingerprint,
                            this.size,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.vendorSoftwareSources,
                            this.customSoftwareSourceFilter,
                            this.isAutomaticallyUpdated,
                            this.isAutoResolveDependencies,
                            this.isCreatedFromPackageList,
                            this.packages);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomSoftwareSource model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("availability")) {
                this.availability(model.getAvailability());
            }
            if (model.wasPropertyExplicitlySet("availabilityAtOci")) {
                this.availabilityAtOci(model.getAvailabilityAtOci());
            }
            if (model.wasPropertyExplicitlySet("repoId")) {
                this.repoId(model.getRepoId());
            }
            if (model.wasPropertyExplicitlySet("osFamily")) {
                this.osFamily(model.getOsFamily());
            }
            if (model.wasPropertyExplicitlySet("archType")) {
                this.archType(model.getArchType());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("packageCount")) {
                this.packageCount(model.getPackageCount());
            }
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
            }
            if (model.wasPropertyExplicitlySet("checksumType")) {
                this.checksumType(model.getChecksumType());
            }
            if (model.wasPropertyExplicitlySet("gpgKeyUrl")) {
                this.gpgKeyUrl(model.getGpgKeyUrl());
            }
            if (model.wasPropertyExplicitlySet("gpgKeyId")) {
                this.gpgKeyId(model.getGpgKeyId());
            }
            if (model.wasPropertyExplicitlySet("gpgKeyFingerprint")) {
                this.gpgKeyFingerprint(model.getGpgKeyFingerprint());
            }
            if (model.wasPropertyExplicitlySet("size")) {
                this.size(model.getSize());
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
            if (model.wasPropertyExplicitlySet("vendorSoftwareSources")) {
                this.vendorSoftwareSources(model.getVendorSoftwareSources());
            }
            if (model.wasPropertyExplicitlySet("customSoftwareSourceFilter")) {
                this.customSoftwareSourceFilter(model.getCustomSoftwareSourceFilter());
            }
            if (model.wasPropertyExplicitlySet("isAutomaticallyUpdated")) {
                this.isAutomaticallyUpdated(model.getIsAutomaticallyUpdated());
            }
            if (model.wasPropertyExplicitlySet("isAutoResolveDependencies")) {
                this.isAutoResolveDependencies(model.getIsAutoResolveDependencies());
            }
            if (model.wasPropertyExplicitlySet("isCreatedFromPackageList")) {
                this.isCreatedFromPackageList(model.getIsCreatedFromPackageList());
            }
            if (model.wasPropertyExplicitlySet("packages")) {
                this.packages(model.getPackages());
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
    public CustomSoftwareSource(
            String id,
            String compartmentId,
            String displayName,
            java.util.Date timeCreated,
            String description,
            Availability availability,
            Availability availabilityAtOci,
            String repoId,
            OsFamily osFamily,
            ArchType archType,
            LifecycleState lifecycleState,
            Long packageCount,
            String url,
            ChecksumType checksumType,
            String gpgKeyUrl,
            String gpgKeyId,
            String gpgKeyFingerprint,
            Double size,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.List<Id> vendorSoftwareSources,
            CustomSoftwareSourceFilter customSoftwareSourceFilter,
            Boolean isAutomaticallyUpdated,
            Boolean isAutoResolveDependencies,
            Boolean isCreatedFromPackageList,
            java.util.List<String> packages) {
        super(
                id,
                compartmentId,
                displayName,
                timeCreated,
                description,
                availability,
                availabilityAtOci,
                repoId,
                osFamily,
                archType,
                lifecycleState,
                packageCount,
                url,
                checksumType,
                gpgKeyUrl,
                gpgKeyId,
                gpgKeyFingerprint,
                size,
                freeformTags,
                definedTags,
                systemTags);
        this.vendorSoftwareSources = vendorSoftwareSources;
        this.customSoftwareSourceFilter = customSoftwareSourceFilter;
        this.isAutomaticallyUpdated = isAutomaticallyUpdated;
        this.isAutoResolveDependencies = isAutoResolveDependencies;
        this.isCreatedFromPackageList = isCreatedFromPackageList;
        this.packages = packages;
    }

    /**
     * List of vendor software sources that are used for the basis of the custom software source.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vendorSoftwareSources")
    private final java.util.List<Id> vendorSoftwareSources;

    /**
     * List of vendor software sources that are used for the basis of the custom software source.
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

    /**
     * Indicates whether the service should automatically update the custom software source to use
     * the latest package versions available. The service reviews packages levels once a day.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutomaticallyUpdated")
    private final Boolean isAutomaticallyUpdated;

    /**
     * Indicates whether the service should automatically update the custom software source to use
     * the latest package versions available. The service reviews packages levels once a day.
     *
     * @return the value
     */
    public Boolean getIsAutomaticallyUpdated() {
        return isAutomaticallyUpdated;
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

    /** The packages in the software source. */
    @com.fasterxml.jackson.annotation.JsonProperty("packages")
    private final java.util.List<String> packages;

    /**
     * The packages in the software source.
     *
     * @return the value
     */
    public java.util.List<String> getPackages() {
        return packages;
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
        sb.append("CustomSoftwareSource(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", vendorSoftwareSources=").append(String.valueOf(this.vendorSoftwareSources));
        sb.append(", customSoftwareSourceFilter=")
                .append(String.valueOf(this.customSoftwareSourceFilter));
        sb.append(", isAutomaticallyUpdated=").append(String.valueOf(this.isAutomaticallyUpdated));
        sb.append(", isAutoResolveDependencies=")
                .append(String.valueOf(this.isAutoResolveDependencies));
        sb.append(", isCreatedFromPackageList=")
                .append(String.valueOf(this.isCreatedFromPackageList));
        sb.append(", packages=").append(String.valueOf(this.packages));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomSoftwareSource)) {
            return false;
        }

        CustomSoftwareSource other = (CustomSoftwareSource) o;
        return java.util.Objects.equals(this.vendorSoftwareSources, other.vendorSoftwareSources)
                && java.util.Objects.equals(
                        this.customSoftwareSourceFilter, other.customSoftwareSourceFilter)
                && java.util.Objects.equals(
                        this.isAutomaticallyUpdated, other.isAutomaticallyUpdated)
                && java.util.Objects.equals(
                        this.isAutoResolveDependencies, other.isAutoResolveDependencies)
                && java.util.Objects.equals(
                        this.isCreatedFromPackageList, other.isCreatedFromPackageList)
                && java.util.Objects.equals(this.packages, other.packages)
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
                        + (this.isAutomaticallyUpdated == null
                                ? 43
                                : this.isAutomaticallyUpdated.hashCode());
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
        result = (result * PRIME) + (this.packages == null ? 43 : this.packages.hashCode());
        return result;
    }
}
