/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Represents a specific version of a registration profile. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ProfileVersion.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ProfileVersion
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "description",
        "managementStationId",
        "softwareSources",
        "managedInstanceGroup",
        "lifecycleEnvironment",
        "lifecycleStage",
        "profileType",
        "vendorName",
        "osFamily",
        "archType",
        "timeCreated",
        "timeModified",
        "profileVersion",
        "lifecycleState",
        "registrationType",
        "isDefaultProfile",
        "isServiceProvidedProfile"
    })
    public ProfileVersion(
            String id,
            String compartmentId,
            String displayName,
            String description,
            String managementStationId,
            java.util.List<SoftwareSourceDetails> softwareSources,
            ManagedInstanceGroupDetails managedInstanceGroup,
            LifecycleEnvironmentDetails lifecycleEnvironment,
            LifecycleStageDetails lifecycleStage,
            ProfileType profileType,
            VendorName vendorName,
            OsFamily osFamily,
            ArchType archType,
            java.util.Date timeCreated,
            java.util.Date timeModified,
            String profileVersion,
            Profile.LifecycleState lifecycleState,
            RegistrationType registrationType,
            Boolean isDefaultProfile,
            Boolean isServiceProvidedProfile) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.managementStationId = managementStationId;
        this.softwareSources = softwareSources;
        this.managedInstanceGroup = managedInstanceGroup;
        this.lifecycleEnvironment = lifecycleEnvironment;
        this.lifecycleStage = lifecycleStage;
        this.profileType = profileType;
        this.vendorName = vendorName;
        this.osFamily = osFamily;
        this.archType = archType;
        this.timeCreated = timeCreated;
        this.timeModified = timeModified;
        this.profileVersion = profileVersion;
        this.lifecycleState = lifecycleState;
        this.registrationType = registrationType;
        this.isDefaultProfile = isDefaultProfile;
        this.isServiceProvidedProfile = isServiceProvidedProfile;
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
        /** The description of the registration profile. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the registration profile.
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
         * of the management station to associate with an instance once registered. Management
         * stations are only used with non-OCI instances.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managementStationId")
        private String managementStationId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the management station to associate with an instance once registered. Management
         * stations are only used with non-OCI instances.
         *
         * @param managementStationId the value to set
         * @return this builder
         */
        public Builder managementStationId(String managementStationId) {
            this.managementStationId = managementStationId;
            this.__explicitlySet__.add("managementStationId");
            return this;
        }
        /** The list of software sources that the registration profile will use. */
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSources")
        private java.util.List<SoftwareSourceDetails> softwareSources;

        /**
         * The list of software sources that the registration profile will use.
         *
         * @param softwareSources the value to set
         * @return this builder
         */
        public Builder softwareSources(java.util.List<SoftwareSourceDetails> softwareSources) {
            this.softwareSources = softwareSources;
            this.__explicitlySet__.add("softwareSources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceGroup")
        private ManagedInstanceGroupDetails managedInstanceGroup;

        public Builder managedInstanceGroup(ManagedInstanceGroupDetails managedInstanceGroup) {
            this.managedInstanceGroup = managedInstanceGroup;
            this.__explicitlySet__.add("managedInstanceGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleEnvironment")
        private LifecycleEnvironmentDetails lifecycleEnvironment;

        public Builder lifecycleEnvironment(LifecycleEnvironmentDetails lifecycleEnvironment) {
            this.lifecycleEnvironment = lifecycleEnvironment;
            this.__explicitlySet__.add("lifecycleEnvironment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStage")
        private LifecycleStageDetails lifecycleStage;

        public Builder lifecycleStage(LifecycleStageDetails lifecycleStage) {
            this.lifecycleStage = lifecycleStage;
            this.__explicitlySet__.add("lifecycleStage");
            return this;
        }
        /** The type of profile. */
        @com.fasterxml.jackson.annotation.JsonProperty("profileType")
        private ProfileType profileType;

        /**
         * The type of profile.
         *
         * @param profileType the value to set
         * @return this builder
         */
        public Builder profileType(ProfileType profileType) {
            this.profileType = profileType;
            this.__explicitlySet__.add("profileType");
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
        /**
         * The time the registration profile was created (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the registration profile was created (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the registration profile was last modified (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
        private java.util.Date timeModified;

        /**
         * The time the registration profile was last modified (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * @param timeModified the value to set
         * @return this builder
         */
        public Builder timeModified(java.util.Date timeModified) {
            this.timeModified = timeModified;
            this.__explicitlySet__.add("timeModified");
            return this;
        }
        /** The version of the profile. */
        @com.fasterxml.jackson.annotation.JsonProperty("profileVersion")
        private String profileVersion;

        /**
         * The version of the profile.
         *
         * @param profileVersion the value to set
         * @return this builder
         */
        public Builder profileVersion(String profileVersion) {
            this.profileVersion = profileVersion;
            this.__explicitlySet__.add("profileVersion");
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
        /** The type of instance to register. */
        @com.fasterxml.jackson.annotation.JsonProperty("registrationType")
        private RegistrationType registrationType;

        /**
         * The type of instance to register.
         *
         * @param registrationType the value to set
         * @return this builder
         */
        public Builder registrationType(RegistrationType registrationType) {
            this.registrationType = registrationType;
            this.__explicitlySet__.add("registrationType");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProfileVersion build() {
            ProfileVersion model =
                    new ProfileVersion(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.managementStationId,
                            this.softwareSources,
                            this.managedInstanceGroup,
                            this.lifecycleEnvironment,
                            this.lifecycleStage,
                            this.profileType,
                            this.vendorName,
                            this.osFamily,
                            this.archType,
                            this.timeCreated,
                            this.timeModified,
                            this.profileVersion,
                            this.lifecycleState,
                            this.registrationType,
                            this.isDefaultProfile,
                            this.isServiceProvidedProfile);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProfileVersion model) {
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
            if (model.wasPropertyExplicitlySet("softwareSources")) {
                this.softwareSources(model.getSoftwareSources());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceGroup")) {
                this.managedInstanceGroup(model.getManagedInstanceGroup());
            }
            if (model.wasPropertyExplicitlySet("lifecycleEnvironment")) {
                this.lifecycleEnvironment(model.getLifecycleEnvironment());
            }
            if (model.wasPropertyExplicitlySet("lifecycleStage")) {
                this.lifecycleStage(model.getLifecycleStage());
            }
            if (model.wasPropertyExplicitlySet("profileType")) {
                this.profileType(model.getProfileType());
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
            if (model.wasPropertyExplicitlySet("timeModified")) {
                this.timeModified(model.getTimeModified());
            }
            if (model.wasPropertyExplicitlySet("profileVersion")) {
                this.profileVersion(model.getProfileVersion());
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

    /** The description of the registration profile. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the registration profile.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the management station to associate with an instance once registered. Management stations are
     * only used with non-OCI instances.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managementStationId")
    private final String managementStationId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the management station to associate with an instance once registered. Management stations are
     * only used with non-OCI instances.
     *
     * @return the value
     */
    public String getManagementStationId() {
        return managementStationId;
    }

    /** The list of software sources that the registration profile will use. */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSources")
    private final java.util.List<SoftwareSourceDetails> softwareSources;

    /**
     * The list of software sources that the registration profile will use.
     *
     * @return the value
     */
    public java.util.List<SoftwareSourceDetails> getSoftwareSources() {
        return softwareSources;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceGroup")
    private final ManagedInstanceGroupDetails managedInstanceGroup;

    public ManagedInstanceGroupDetails getManagedInstanceGroup() {
        return managedInstanceGroup;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleEnvironment")
    private final LifecycleEnvironmentDetails lifecycleEnvironment;

    public LifecycleEnvironmentDetails getLifecycleEnvironment() {
        return lifecycleEnvironment;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStage")
    private final LifecycleStageDetails lifecycleStage;

    public LifecycleStageDetails getLifecycleStage() {
        return lifecycleStage;
    }

    /** The type of profile. */
    @com.fasterxml.jackson.annotation.JsonProperty("profileType")
    private final ProfileType profileType;

    /**
     * The type of profile.
     *
     * @return the value
     */
    public ProfileType getProfileType() {
        return profileType;
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

    /**
     * The time the registration profile was created (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the registration profile was created (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the registration profile was last modified (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
    private final java.util.Date timeModified;

    /**
     * The time the registration profile was last modified (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     * @return the value
     */
    public java.util.Date getTimeModified() {
        return timeModified;
    }

    /** The version of the profile. */
    @com.fasterxml.jackson.annotation.JsonProperty("profileVersion")
    private final String profileVersion;

    /**
     * The version of the profile.
     *
     * @return the value
     */
    public String getProfileVersion() {
        return profileVersion;
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

    /** The type of instance to register. */
    public enum RegistrationType implements com.oracle.bmc.http.internal.BmcEnum {
        OciLinux("OCI_LINUX"),
        NonOciLinux("NON_OCI_LINUX"),
        OciWindows("OCI_WINDOWS"),
        AutonomousLinux("AUTONOMOUS_LINUX"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RegistrationType.class);

        private final String value;
        private static java.util.Map<String, RegistrationType> map;

        static {
            map = new java.util.HashMap<>();
            for (RegistrationType v : RegistrationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RegistrationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RegistrationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RegistrationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The type of instance to register. */
    @com.fasterxml.jackson.annotation.JsonProperty("registrationType")
    private final RegistrationType registrationType;

    /**
     * The type of instance to register.
     *
     * @return the value
     */
    public RegistrationType getRegistrationType() {
        return registrationType;
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
        sb.append("ProfileVersion(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", managementStationId=").append(String.valueOf(this.managementStationId));
        sb.append(", softwareSources=").append(String.valueOf(this.softwareSources));
        sb.append(", managedInstanceGroup=").append(String.valueOf(this.managedInstanceGroup));
        sb.append(", lifecycleEnvironment=").append(String.valueOf(this.lifecycleEnvironment));
        sb.append(", lifecycleStage=").append(String.valueOf(this.lifecycleStage));
        sb.append(", profileType=").append(String.valueOf(this.profileType));
        sb.append(", vendorName=").append(String.valueOf(this.vendorName));
        sb.append(", osFamily=").append(String.valueOf(this.osFamily));
        sb.append(", archType=").append(String.valueOf(this.archType));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeModified=").append(String.valueOf(this.timeModified));
        sb.append(", profileVersion=").append(String.valueOf(this.profileVersion));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", registrationType=").append(String.valueOf(this.registrationType));
        sb.append(", isDefaultProfile=").append(String.valueOf(this.isDefaultProfile));
        sb.append(", isServiceProvidedProfile=")
                .append(String.valueOf(this.isServiceProvidedProfile));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProfileVersion)) {
            return false;
        }

        ProfileVersion other = (ProfileVersion) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.managementStationId, other.managementStationId)
                && java.util.Objects.equals(this.softwareSources, other.softwareSources)
                && java.util.Objects.equals(this.managedInstanceGroup, other.managedInstanceGroup)
                && java.util.Objects.equals(this.lifecycleEnvironment, other.lifecycleEnvironment)
                && java.util.Objects.equals(this.lifecycleStage, other.lifecycleStage)
                && java.util.Objects.equals(this.profileType, other.profileType)
                && java.util.Objects.equals(this.vendorName, other.vendorName)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.archType, other.archType)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeModified, other.timeModified)
                && java.util.Objects.equals(this.profileVersion, other.profileVersion)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.registrationType, other.registrationType)
                && java.util.Objects.equals(this.isDefaultProfile, other.isDefaultProfile)
                && java.util.Objects.equals(
                        this.isServiceProvidedProfile, other.isServiceProvidedProfile)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.managementStationId == null
                                ? 43
                                : this.managementStationId.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareSources == null ? 43 : this.softwareSources.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceGroup == null
                                ? 43
                                : this.managedInstanceGroup.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleEnvironment == null
                                ? 43
                                : this.lifecycleEnvironment.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleStage == null ? 43 : this.lifecycleStage.hashCode());
        result = (result * PRIME) + (this.profileType == null ? 43 : this.profileType.hashCode());
        result = (result * PRIME) + (this.vendorName == null ? 43 : this.vendorName.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result = (result * PRIME) + (this.archType == null ? 43 : this.archType.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeModified == null ? 43 : this.timeModified.hashCode());
        result =
                (result * PRIME)
                        + (this.profileVersion == null ? 43 : this.profileVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.registrationType == null ? 43 : this.registrationType.hashCode());
        result =
                (result * PRIME)
                        + (this.isDefaultProfile == null ? 43 : this.isDefaultProfile.hashCode());
        result =
                (result * PRIME)
                        + (this.isServiceProvidedProfile == null
                                ? 43
                                : this.isServiceProvidedProfile.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
