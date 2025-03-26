/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides summary information for a versioned custom software source.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VersionedCustomSoftwareSourceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "softwareSourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VersionedCustomSoftwareSourceSummary extends SoftwareSourceSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("repoId")
        private String repoId;

        public Builder repoId(String repoId) {
            this.repoId = repoId;
            this.__explicitlySet__.add("repoId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
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

        @com.fasterxml.jackson.annotation.JsonProperty("packageCount")
        private Long packageCount;

        public Builder packageCount(Long packageCount) {
            this.packageCount = packageCount;
            this.__explicitlySet__.add("packageCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private SoftwareSource.LifecycleState lifecycleState;

        public Builder lifecycleState(SoftwareSource.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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
         * List of vendor software sources that are used for the basis of the versioned custom software source.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vendorSoftwareSources")
        private java.util.List<Id> vendorSoftwareSources;

        /**
         * List of vendor software sources that are used for the basis of the versioned custom software source.
         * @param vendorSoftwareSources the value to set
         * @return this builder
         **/
        public Builder vendorSoftwareSources(java.util.List<Id> vendorSoftwareSources) {
            this.vendorSoftwareSources = vendorSoftwareSources;
            this.__explicitlySet__.add("vendorSoftwareSources");
            return this;
        }
        /**
         * The version to assign to this custom software source.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceVersion")
        private String softwareSourceVersion;

        /**
         * The version to assign to this custom software source.
         * @param softwareSourceVersion the value to set
         * @return this builder
         **/
        public Builder softwareSourceVersion(String softwareSourceVersion) {
            this.softwareSourceVersion = softwareSourceVersion;
            this.__explicitlySet__.add("softwareSourceVersion");
            return this;
        }
        /**
         * Identifies how the versioned custom software source was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceSubType")
        private SoftwareSourceSubType softwareSourceSubType;

        /**
         * Identifies how the versioned custom software source was created.
         * @param softwareSourceSubType the value to set
         * @return this builder
         **/
        public Builder softwareSourceSubType(SoftwareSourceSubType softwareSourceSubType) {
            this.softwareSourceSubType = softwareSourceSubType;
            this.__explicitlySet__.add("softwareSourceSubType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VersionedCustomSoftwareSourceSummary build() {
            VersionedCustomSoftwareSourceSummary model =
                    new VersionedCustomSoftwareSourceSummary(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.repoId,
                            this.url,
                            this.timeCreated,
                            this.timeUpdated,
                            this.description,
                            this.availability,
                            this.availabilityAtOci,
                            this.osFamily,
                            this.archType,
                            this.packageCount,
                            this.lifecycleState,
                            this.size,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.vendorSoftwareSources,
                            this.softwareSourceVersion,
                            this.softwareSourceSubType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VersionedCustomSoftwareSourceSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("repoId")) {
                this.repoId(model.getRepoId());
            }
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
            if (model.wasPropertyExplicitlySet("osFamily")) {
                this.osFamily(model.getOsFamily());
            }
            if (model.wasPropertyExplicitlySet("archType")) {
                this.archType(model.getArchType());
            }
            if (model.wasPropertyExplicitlySet("packageCount")) {
                this.packageCount(model.getPackageCount());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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
            if (model.wasPropertyExplicitlySet("softwareSourceVersion")) {
                this.softwareSourceVersion(model.getSoftwareSourceVersion());
            }
            if (model.wasPropertyExplicitlySet("softwareSourceSubType")) {
                this.softwareSourceSubType(model.getSoftwareSourceSubType());
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

    @Deprecated
    public VersionedCustomSoftwareSourceSummary(
            String id,
            String compartmentId,
            String displayName,
            String repoId,
            String url,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String description,
            Availability availability,
            Availability availabilityAtOci,
            OsFamily osFamily,
            ArchType archType,
            Long packageCount,
            SoftwareSource.LifecycleState lifecycleState,
            Double size,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.List<Id> vendorSoftwareSources,
            String softwareSourceVersion,
            SoftwareSourceSubType softwareSourceSubType) {
        super(
                id,
                compartmentId,
                displayName,
                repoId,
                url,
                timeCreated,
                timeUpdated,
                description,
                availability,
                availabilityAtOci,
                osFamily,
                archType,
                packageCount,
                lifecycleState,
                size,
                freeformTags,
                definedTags,
                systemTags);
        this.vendorSoftwareSources = vendorSoftwareSources;
        this.softwareSourceVersion = softwareSourceVersion;
        this.softwareSourceSubType = softwareSourceSubType;
    }

    /**
     * List of vendor software sources that are used for the basis of the versioned custom software source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vendorSoftwareSources")
    private final java.util.List<Id> vendorSoftwareSources;

    /**
     * List of vendor software sources that are used for the basis of the versioned custom software source.
     * @return the value
     **/
    public java.util.List<Id> getVendorSoftwareSources() {
        return vendorSoftwareSources;
    }

    /**
     * The version to assign to this custom software source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceVersion")
    private final String softwareSourceVersion;

    /**
     * The version to assign to this custom software source.
     * @return the value
     **/
    public String getSoftwareSourceVersion() {
        return softwareSourceVersion;
    }

    /**
     * Identifies how the versioned custom software source was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceSubType")
    private final SoftwareSourceSubType softwareSourceSubType;

    /**
     * Identifies how the versioned custom software source was created.
     * @return the value
     **/
    public SoftwareSourceSubType getSoftwareSourceSubType() {
        return softwareSourceSubType;
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
        sb.append("VersionedCustomSoftwareSourceSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", vendorSoftwareSources=").append(String.valueOf(this.vendorSoftwareSources));
        sb.append(", softwareSourceVersion=").append(String.valueOf(this.softwareSourceVersion));
        sb.append(", softwareSourceSubType=").append(String.valueOf(this.softwareSourceSubType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VersionedCustomSoftwareSourceSummary)) {
            return false;
        }

        VersionedCustomSoftwareSourceSummary other = (VersionedCustomSoftwareSourceSummary) o;
        return java.util.Objects.equals(this.vendorSoftwareSources, other.vendorSoftwareSources)
                && java.util.Objects.equals(this.softwareSourceVersion, other.softwareSourceVersion)
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
                        + (this.softwareSourceVersion == null
                                ? 43
                                : this.softwareSourceVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareSourceSubType == null
                                ? 43
                                : this.softwareSourceSubType.hashCode());
        return result;
    }
}
