/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides the information used to create the software source registration profile.
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
    builder = CreateSoftwareSourceProfileDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "profileType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateSoftwareSourceProfileDetails extends CreateProfileDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("registrationType")
        private Profile.RegistrationType registrationType;

        public Builder registrationType(Profile.RegistrationType registrationType) {
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
        /**
         * The vendor of the operating system for the instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vendorName")
        private VendorName vendorName;

        /**
         * The vendor of the operating system for the instance.
         * @param vendorName the value to set
         * @return this builder
         **/
        public Builder vendorName(VendorName vendorName) {
            this.vendorName = vendorName;
            this.__explicitlySet__.add("vendorName");
            return this;
        }
        /**
         * The operating system family.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
        private OsFamily osFamily;

        /**
         * The operating system family.
         * @param osFamily the value to set
         * @return this builder
         **/
        public Builder osFamily(OsFamily osFamily) {
            this.osFamily = osFamily;
            this.__explicitlySet__.add("osFamily");
            return this;
        }
        /**
         * The architecture type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("archType")
        private ArchType archType;

        /**
         * The architecture type.
         * @param archType the value to set
         * @return this builder
         **/
        public Builder archType(ArchType archType) {
            this.archType = archType;
            this.__explicitlySet__.add("archType");
            return this;
        }
        /**
         * The list of software source [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that the registration profile will use.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceIds")
        private java.util.List<String> softwareSourceIds;

        /**
         * The list of software source [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that the registration profile will use.
         * @param softwareSourceIds the value to set
         * @return this builder
         **/
        public Builder softwareSourceIds(java.util.List<String> softwareSourceIds) {
            this.softwareSourceIds = softwareSourceIds;
            this.__explicitlySet__.add("softwareSourceIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSoftwareSourceProfileDetails build() {
            CreateSoftwareSourceProfileDetails model =
                    new CreateSoftwareSourceProfileDetails(
                            this.displayName,
                            this.compartmentId,
                            this.description,
                            this.managementStationId,
                            this.registrationType,
                            this.isDefaultProfile,
                            this.freeformTags,
                            this.definedTags,
                            this.vendorName,
                            this.osFamily,
                            this.archType,
                            this.softwareSourceIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSoftwareSourceProfileDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("managementStationId")) {
                this.managementStationId(model.getManagementStationId());
            }
            if (model.wasPropertyExplicitlySet("registrationType")) {
                this.registrationType(model.getRegistrationType());
            }
            if (model.wasPropertyExplicitlySet("isDefaultProfile")) {
                this.isDefaultProfile(model.getIsDefaultProfile());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
            if (model.wasPropertyExplicitlySet("softwareSourceIds")) {
                this.softwareSourceIds(model.getSoftwareSourceIds());
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
    public CreateSoftwareSourceProfileDetails(
            String displayName,
            String compartmentId,
            String description,
            String managementStationId,
            Profile.RegistrationType registrationType,
            Boolean isDefaultProfile,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            VendorName vendorName,
            OsFamily osFamily,
            ArchType archType,
            java.util.List<String> softwareSourceIds) {
        super(
                displayName,
                compartmentId,
                description,
                managementStationId,
                registrationType,
                isDefaultProfile,
                freeformTags,
                definedTags);
        this.vendorName = vendorName;
        this.osFamily = osFamily;
        this.archType = archType;
        this.softwareSourceIds = softwareSourceIds;
    }

    /**
     * The vendor of the operating system for the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vendorName")
    private final VendorName vendorName;

    /**
     * The vendor of the operating system for the instance.
     * @return the value
     **/
    public VendorName getVendorName() {
        return vendorName;
    }

    /**
     * The operating system family.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
    private final OsFamily osFamily;

    /**
     * The operating system family.
     * @return the value
     **/
    public OsFamily getOsFamily() {
        return osFamily;
    }

    /**
     * The architecture type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("archType")
    private final ArchType archType;

    /**
     * The architecture type.
     * @return the value
     **/
    public ArchType getArchType() {
        return archType;
    }

    /**
     * The list of software source [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that the registration profile will use.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceIds")
    private final java.util.List<String> softwareSourceIds;

    /**
     * The list of software source [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that the registration profile will use.
     * @return the value
     **/
    public java.util.List<String> getSoftwareSourceIds() {
        return softwareSourceIds;
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
        sb.append("CreateSoftwareSourceProfileDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", vendorName=").append(String.valueOf(this.vendorName));
        sb.append(", osFamily=").append(String.valueOf(this.osFamily));
        sb.append(", archType=").append(String.valueOf(this.archType));
        sb.append(", softwareSourceIds=").append(String.valueOf(this.softwareSourceIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSoftwareSourceProfileDetails)) {
            return false;
        }

        CreateSoftwareSourceProfileDetails other = (CreateSoftwareSourceProfileDetails) o;
        return java.util.Objects.equals(this.vendorName, other.vendorName)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.archType, other.archType)
                && java.util.Objects.equals(this.softwareSourceIds, other.softwareSourceIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.vendorName == null ? 43 : this.vendorName.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result = (result * PRIME) + (this.archType == null ? 43 : this.archType.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareSourceIds == null ? 43 : this.softwareSourceIds.hashCode());
        return result;
    }
}
