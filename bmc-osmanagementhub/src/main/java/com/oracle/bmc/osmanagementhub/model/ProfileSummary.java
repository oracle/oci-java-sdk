/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides summary information for a registration profile. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ProfileSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ProfileSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "compartmentId",
        "managementStationId",
        "profileType",
        "registrationType",
        "vendorName",
        "osFamily",
        "archType",
        "timeCreated",
        "lifecycleState",
        "isDefaultProfile",
        "isServiceProvidedProfile",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public ProfileSummary(
            String id,
            String displayName,
            String description,
            String compartmentId,
            String managementStationId,
            ProfileType profileType,
            Profile.RegistrationType registrationType,
            VendorName vendorName,
            OsFamily osFamily,
            ArchType archType,
            java.util.Date timeCreated,
            Profile.LifecycleState lifecycleState,
            Boolean isDefaultProfile,
            Boolean isServiceProvidedProfile,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.managementStationId = managementStationId;
        this.profileType = profileType;
        this.registrationType = registrationType;
        this.vendorName = vendorName;
        this.osFamily = osFamily;
        this.archType = archType;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
        this.isDefaultProfile = isDefaultProfile;
        this.isServiceProvidedProfile = isServiceProvidedProfile;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the registration profile.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the registration profile.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** A user-friendly name for the profile. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the profile.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** User-specified description of the registration profile. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * User-specified description of the registration profile.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment that contains the registration profile.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment that contains the registration profile.
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the management station to associate with an instance once registered. Associating with
         * a management station applies only to non-OCI instances.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managementStationId")
        private String managementStationId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the management station to associate with an instance once registered. Associating with
         * a management station applies only to non-OCI instances.
         *
         * @param managementStationId the value to set
         * @return this builder
         */
        public Builder managementStationId(String managementStationId) {
            this.managementStationId = managementStationId;
            this.__explicitlySet__.add("managementStationId");
            return this;
        }
        /** The type of registration profile. */
        @com.fasterxml.jackson.annotation.JsonProperty("profileType")
        private ProfileType profileType;

        /**
         * The type of registration profile.
         *
         * @param profileType the value to set
         * @return this builder
         */
        public Builder profileType(ProfileType profileType) {
            this.profileType = profileType;
            this.__explicitlySet__.add("profileType");
            return this;
        }
        /** The type of instance to register. */
        @com.fasterxml.jackson.annotation.JsonProperty("registrationType")
        private Profile.RegistrationType registrationType;

        /**
         * The type of instance to register.
         *
         * @param registrationType the value to set
         * @return this builder
         */
        public Builder registrationType(Profile.RegistrationType registrationType) {
            this.registrationType = registrationType;
            this.__explicitlySet__.add("registrationType");
            return this;
        }
        /** The vendor of the operating system for the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("vendorName")
        private VendorName vendorName;

        /**
         * The vendor of the operating system for the instance.
         *
         * @param vendorName the value to set
         * @return this builder
         */
        public Builder vendorName(VendorName vendorName) {
            this.vendorName = vendorName;
            this.__explicitlySet__.add("vendorName");
            return this;
        }
        /** The operating system family. */
        @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
        private OsFamily osFamily;

        /**
         * The operating system family.
         *
         * @param osFamily the value to set
         * @return this builder
         */
        public Builder osFamily(OsFamily osFamily) {
            this.osFamily = osFamily;
            this.__explicitlySet__.add("osFamily");
            return this;
        }
        /** The architecture type. */
        @com.fasterxml.jackson.annotation.JsonProperty("archType")
        private ArchType archType;

        /**
         * The architecture type.
         *
         * @param archType the value to set
         * @return this builder
         */
        public Builder archType(ArchType archType) {
            this.archType = archType;
            this.__explicitlySet__.add("archType");
            return this;
        }
        /** The time the the Onboarding was created. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the the Onboarding was created. An RFC3339 formatted datetime string
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The current state of the registration profile. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Profile.LifecycleState lifecycleState;

        /**
         * The current state of the registration profile.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(Profile.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Indicates if the profile is set as the default. There is exactly one default profile for
         * a specified architecture, OS family, registration type, and vendor. When registering an
         * instance with the corresonding characteristics, the default profile is used, unless
         * another profile is specified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDefaultProfile")
        private Boolean isDefaultProfile;

        /**
         * Indicates if the profile is set as the default. There is exactly one default profile for
         * a specified architecture, OS family, registration type, and vendor. When registering an
         * instance with the corresonding characteristics, the default profile is used, unless
         * another profile is specified.
         *
         * @param isDefaultProfile the value to set
         * @return this builder
         */
        public Builder isDefaultProfile(Boolean isDefaultProfile) {
            this.isDefaultProfile = isDefaultProfile;
            this.__explicitlySet__.add("isDefaultProfile");
            return this;
        }
        /**
         * Indicates if the profile was created by the service. OS Management Hub provides a limited
         * set of standardized profiles that can be used to register Autonomous Linux or Windows
         * instances.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isServiceProvidedProfile")
        private Boolean isServiceProvidedProfile;

        /**
         * Indicates if the profile was created by the service. OS Management Hub provides a limited
         * set of standardized profiles that can be used to register Autonomous Linux or Windows
         * instances.
         *
         * @param isServiceProvidedProfile the value to set
         * @return this builder
         */
        public Builder isServiceProvidedProfile(Boolean isServiceProvidedProfile) {
            this.isServiceProvidedProfile = isServiceProvidedProfile;
            this.__explicitlySet__.add("isServiceProvidedProfile");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProfileSummary build() {
            ProfileSummary model =
                    new ProfileSummary(
                            this.id,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.managementStationId,
                            this.profileType,
                            this.registrationType,
                            this.vendorName,
                            this.osFamily,
                            this.archType,
                            this.timeCreated,
                            this.lifecycleState,
                            this.isDefaultProfile,
                            this.isServiceProvidedProfile,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProfileSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("managementStationId")) {
                this.managementStationId(model.getManagementStationId());
            }
            if (model.wasPropertyExplicitlySet("profileType")) {
                this.profileType(model.getProfileType());
            }
            if (model.wasPropertyExplicitlySet("registrationType")) {
                this.registrationType(model.getRegistrationType());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the registration profile.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the registration profile.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** A user-friendly name for the profile. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the profile.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** User-specified description of the registration profile. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * User-specified description of the registration profile.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment that contains the registration profile.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment that contains the registration profile.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the management station to associate with an instance once registered. Associating with a
     * management station applies only to non-OCI instances.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managementStationId")
    private final String managementStationId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the management station to associate with an instance once registered. Associating with a
     * management station applies only to non-OCI instances.
     *
     * @return the value
     */
    public String getManagementStationId() {
        return managementStationId;
    }

    /** The type of registration profile. */
    @com.fasterxml.jackson.annotation.JsonProperty("profileType")
    private final ProfileType profileType;

    /**
     * The type of registration profile.
     *
     * @return the value
     */
    public ProfileType getProfileType() {
        return profileType;
    }

    /** The type of instance to register. */
    @com.fasterxml.jackson.annotation.JsonProperty("registrationType")
    private final Profile.RegistrationType registrationType;

    /**
     * The type of instance to register.
     *
     * @return the value
     */
    public Profile.RegistrationType getRegistrationType() {
        return registrationType;
    }

    /** The vendor of the operating system for the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("vendorName")
    private final VendorName vendorName;

    /**
     * The vendor of the operating system for the instance.
     *
     * @return the value
     */
    public VendorName getVendorName() {
        return vendorName;
    }

    /** The operating system family. */
    @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
    private final OsFamily osFamily;

    /**
     * The operating system family.
     *
     * @return the value
     */
    public OsFamily getOsFamily() {
        return osFamily;
    }

    /** The architecture type. */
    @com.fasterxml.jackson.annotation.JsonProperty("archType")
    private final ArchType archType;

    /**
     * The architecture type.
     *
     * @return the value
     */
    public ArchType getArchType() {
        return archType;
    }

    /** The time the the Onboarding was created. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the the Onboarding was created. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The current state of the registration profile. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final Profile.LifecycleState lifecycleState;

    /**
     * The current state of the registration profile.
     *
     * @return the value
     */
    public Profile.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Indicates if the profile is set as the default. There is exactly one default profile for a
     * specified architecture, OS family, registration type, and vendor. When registering an
     * instance with the corresonding characteristics, the default profile is used, unless another
     * profile is specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDefaultProfile")
    private final Boolean isDefaultProfile;

    /**
     * Indicates if the profile is set as the default. There is exactly one default profile for a
     * specified architecture, OS family, registration type, and vendor. When registering an
     * instance with the corresonding characteristics, the default profile is used, unless another
     * profile is specified.
     *
     * @return the value
     */
    public Boolean getIsDefaultProfile() {
        return isDefaultProfile;
    }

    /**
     * Indicates if the profile was created by the service. OS Management Hub provides a limited set
     * of standardized profiles that can be used to register Autonomous Linux or Windows instances.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isServiceProvidedProfile")
    private final Boolean isServiceProvidedProfile;

    /**
     * Indicates if the profile was created by the service. OS Management Hub provides a limited set
     * of standardized profiles that can be used to register Autonomous Linux or Windows instances.
     *
     * @return the value
     */
    public Boolean getIsServiceProvidedProfile() {
        return isServiceProvidedProfile;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("ProfileSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", managementStationId=").append(String.valueOf(this.managementStationId));
        sb.append(", profileType=").append(String.valueOf(this.profileType));
        sb.append(", registrationType=").append(String.valueOf(this.registrationType));
        sb.append(", vendorName=").append(String.valueOf(this.vendorName));
        sb.append(", osFamily=").append(String.valueOf(this.osFamily));
        sb.append(", archType=").append(String.valueOf(this.archType));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", isDefaultProfile=").append(String.valueOf(this.isDefaultProfile));
        sb.append(", isServiceProvidedProfile=")
                .append(String.valueOf(this.isServiceProvidedProfile));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProfileSummary)) {
            return false;
        }

        ProfileSummary other = (ProfileSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.managementStationId, other.managementStationId)
                && java.util.Objects.equals(this.profileType, other.profileType)
                && java.util.Objects.equals(this.registrationType, other.registrationType)
                && java.util.Objects.equals(this.vendorName, other.vendorName)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.archType, other.archType)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.isDefaultProfile, other.isDefaultProfile)
                && java.util.Objects.equals(
                        this.isServiceProvidedProfile, other.isServiceProvidedProfile)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.managementStationId == null
                                ? 43
                                : this.managementStationId.hashCode());
        result = (result * PRIME) + (this.profileType == null ? 43 : this.profileType.hashCode());
        result =
                (result * PRIME)
                        + (this.registrationType == null ? 43 : this.registrationType.hashCode());
        result = (result * PRIME) + (this.vendorName == null ? 43 : this.vendorName.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result = (result * PRIME) + (this.archType == null ? 43 : this.archType.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.isDefaultProfile == null ? 43 : this.isDefaultProfile.hashCode());
        result =
                (result * PRIME)
                        + (this.isServiceProvidedProfile == null
                                ? 43
                                : this.isServiceProvidedProfile.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
