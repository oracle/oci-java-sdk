/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * A package for container image listings.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HelmChartPackage.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "packageType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HelmChartPackage extends ListingRevisionPackage {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
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

        @com.fasterxml.jackson.annotation.JsonProperty("listingRevisionId")
        private String listingRevisionId;

        public Builder listingRevisionId(String listingRevisionId) {
            this.listingRevisionId = listingRevisionId;
            this.__explicitlySet__.add("listingRevisionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("artifactId")
        private String artifactId;

        public Builder artifactId(String artifactId) {
            this.artifactId = artifactId;
            this.__explicitlySet__.add("artifactId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("termId")
        private String termId;

        public Builder termId(String termId) {
            this.termId = termId;
            this.__explicitlySet__.add("termId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("packageVersion")
        private String packageVersion;

        public Builder packageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            this.__explicitlySet__.add("packageVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("areSecurityUpgradesProvided")
        private Boolean areSecurityUpgradesProvided;

        public Builder areSecurityUpgradesProvided(Boolean areSecurityUpgradesProvided) {
            this.areSecurityUpgradesProvided = areSecurityUpgradesProvided;
            this.__explicitlySet__.add("areSecurityUpgradesProvided");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
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

        @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
        private java.util.Map<String, String> extendedMetadata;

        public Builder extendedMetadata(java.util.Map<String, String> extendedMetadata) {
            this.extendedMetadata = extendedMetadata;
            this.__explicitlySet__.add("extendedMetadata");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HelmChartPackage build() {
            HelmChartPackage model =
                    new HelmChartPackage(
                            this.id,
                            this.displayName,
                            this.description,
                            this.listingRevisionId,
                            this.compartmentId,
                            this.artifactId,
                            this.termId,
                            this.packageVersion,
                            this.lifecycleState,
                            this.status,
                            this.areSecurityUpgradesProvided,
                            this.isDefault,
                            this.timeCreated,
                            this.timeUpdated,
                            this.extendedMetadata,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HelmChartPackage model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("listingRevisionId")) {
                this.listingRevisionId(model.getListingRevisionId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("artifactId")) {
                this.artifactId(model.getArtifactId());
            }
            if (model.wasPropertyExplicitlySet("termId")) {
                this.termId(model.getTermId());
            }
            if (model.wasPropertyExplicitlySet("packageVersion")) {
                this.packageVersion(model.getPackageVersion());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("areSecurityUpgradesProvided")) {
                this.areSecurityUpgradesProvided(model.getAreSecurityUpgradesProvided());
            }
            if (model.wasPropertyExplicitlySet("isDefault")) {
                this.isDefault(model.getIsDefault());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("extendedMetadata")) {
                this.extendedMetadata(model.getExtendedMetadata());
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
    public HelmChartPackage(
            String id,
            String displayName,
            String description,
            String listingRevisionId,
            String compartmentId,
            String artifactId,
            String termId,
            String packageVersion,
            LifecycleState lifecycleState,
            Status status,
            Boolean areSecurityUpgradesProvided,
            Boolean isDefault,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> extendedMetadata,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super(
                id,
                displayName,
                description,
                listingRevisionId,
                compartmentId,
                artifactId,
                termId,
                packageVersion,
                lifecycleState,
                status,
                areSecurityUpgradesProvided,
                isDefault,
                timeCreated,
                timeUpdated,
                extendedMetadata,
                freeformTags,
                definedTags,
                systemTags);
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
        sb.append("HelmChartPackage(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HelmChartPackage)) {
            return false;
        }

        HelmChartPackage other = (HelmChartPackage) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        return result;
    }
}
