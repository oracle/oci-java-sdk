/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides the information for a software source registration profile.
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
    builder = SoftwareSourceProfile.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "profileType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SoftwareSourceProfile extends Profile {
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

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managementStationId")
        private String managementStationId;

        public Builder managementStationId(String managementStationId) {
            this.managementStationId = managementStationId;
            this.__explicitlySet__.add("managementStationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vendorName")
        private VendorName vendorName;

        public Builder vendorName(VendorName vendorName) {
            this.vendorName = vendorName;
            this.__explicitlySet__.add("vendorName");
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("registrationType")
        private RegistrationType registrationType;

        public Builder registrationType(RegistrationType registrationType) {
            this.registrationType = registrationType;
            this.__explicitlySet__.add("registrationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDefaultProfile")
        private Boolean isDefaultProfile;

        public Builder isDefaultProfile(Boolean isDefaultProfile) {
            this.isDefaultProfile = isDefaultProfile;
            this.__explicitlySet__.add("isDefaultProfile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isServiceProvidedProfile")
        private Boolean isServiceProvidedProfile;

        public Builder isServiceProvidedProfile(Boolean isServiceProvidedProfile) {
            this.isServiceProvidedProfile = isServiceProvidedProfile;
            this.__explicitlySet__.add("isServiceProvidedProfile");
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
         * The list of software sources that the registration profile will use.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSources")
        private java.util.List<SoftwareSourceDetails> softwareSources;

        /**
         * The list of software sources that the registration profile will use.
         * @param softwareSources the value to set
         * @return this builder
         **/
        public Builder softwareSources(java.util.List<SoftwareSourceDetails> softwareSources) {
            this.softwareSources = softwareSources;
            this.__explicitlySet__.add("softwareSources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SoftwareSourceProfile build() {
            SoftwareSourceProfile model =
                    new SoftwareSourceProfile(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.managementStationId,
                            this.vendorName,
                            this.osFamily,
                            this.archType,
                            this.timeCreated,
                            this.lifecycleState,
                            this.registrationType,
                            this.isDefaultProfile,
                            this.isServiceProvidedProfile,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.softwareSources);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SoftwareSourceProfile model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("managementStationId")) {
                this.managementStationId(model.getManagementStationId());
            }
            if (model.wasPropertyExplicitlySet("vendorName")) {
                this.vendorName(model.getVendorName());
            }
            if (model.wasPropertyExplicitlySet("osFamily")) {
                this.osFamily(model.getOsFamily());
            }
            if (model.wasPropertyExplicitlySet("archType")) {
                this.archType(model.getArchType());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("registrationType")) {
                this.registrationType(model.getRegistrationType());
            }
            if (model.wasPropertyExplicitlySet("isDefaultProfile")) {
                this.isDefaultProfile(model.getIsDefaultProfile());
            }
            if (model.wasPropertyExplicitlySet("isServiceProvidedProfile")) {
                this.isServiceProvidedProfile(model.getIsServiceProvidedProfile());
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
            if (model.wasPropertyExplicitlySet("softwareSources")) {
                this.softwareSources(model.getSoftwareSources());
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
    public SoftwareSourceProfile(
            String id,
            String compartmentId,
            String displayName,
            String description,
            String managementStationId,
            VendorName vendorName,
            OsFamily osFamily,
            ArchType archType,
            java.util.Date timeCreated,
            LifecycleState lifecycleState,
            RegistrationType registrationType,
            Boolean isDefaultProfile,
            Boolean isServiceProvidedProfile,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.List<SoftwareSourceDetails> softwareSources) {
        super(
                id,
                compartmentId,
                displayName,
                description,
                managementStationId,
                vendorName,
                osFamily,
                archType,
                timeCreated,
                lifecycleState,
                registrationType,
                isDefaultProfile,
                isServiceProvidedProfile,
                freeformTags,
                definedTags,
                systemTags);
        this.softwareSources = softwareSources;
    }

    /**
     * The list of software sources that the registration profile will use.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSources")
    private final java.util.List<SoftwareSourceDetails> softwareSources;

    /**
     * The list of software sources that the registration profile will use.
     * @return the value
     **/
    public java.util.List<SoftwareSourceDetails> getSoftwareSources() {
        return softwareSources;
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
        sb.append("SoftwareSourceProfile(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", softwareSources=").append(String.valueOf(this.softwareSources));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SoftwareSourceProfile)) {
            return false;
        }

        SoftwareSourceProfile other = (SoftwareSourceProfile) o;
        return java.util.Objects.equals(this.softwareSources, other.softwareSources)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.softwareSources == null ? 43 : this.softwareSources.hashCode());
        return result;
    }
}
