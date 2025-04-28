/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides summary information for a managed instance. <br>
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
        builder = ManagedInstanceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagedInstanceSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "tenancyId",
        "compartmentId",
        "location",
        "architecture",
        "osFamily",
        "status",
        "managedInstanceGroup",
        "lifecycleEnvironment",
        "lifecycleStage",
        "isRebootRequired",
        "updatesAvailable",
        "isManagementStation",
        "notificationTopicId",
        "autonomousSettings",
        "isManagedByAutonomousLinux",
        "agentVersion"
    })
    public ManagedInstanceSummary(
            String id,
            String displayName,
            String description,
            String tenancyId,
            String compartmentId,
            ManagedInstanceLocation location,
            ArchType architecture,
            OsFamily osFamily,
            ManagedInstanceStatus status,
            Id managedInstanceGroup,
            Id lifecycleEnvironment,
            Id lifecycleStage,
            Boolean isRebootRequired,
            Integer updatesAvailable,
            Boolean isManagementStation,
            String notificationTopicId,
            AutonomousSettings autonomousSettings,
            Boolean isManagedByAutonomousLinux,
            String agentVersion) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.tenancyId = tenancyId;
        this.compartmentId = compartmentId;
        this.location = location;
        this.architecture = architecture;
        this.osFamily = osFamily;
        this.status = status;
        this.managedInstanceGroup = managedInstanceGroup;
        this.lifecycleEnvironment = lifecycleEnvironment;
        this.lifecycleStage = lifecycleStage;
        this.isRebootRequired = isRebootRequired;
        this.updatesAvailable = updatesAvailable;
        this.isManagementStation = isManagementStation;
        this.notificationTopicId = notificationTopicId;
        this.autonomousSettings = autonomousSettings;
        this.isManagedByAutonomousLinux = isManagedByAutonomousLinux;
        this.agentVersion = agentVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * managed instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * managed instance.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** User-friendly name for the managed instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * User-friendly name for the managed instance.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** User-specified description of the managed instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * User-specified description of the managed instance.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * tenancy this managed instance resides in.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * tenancy this managed instance resides in.
         *
         * @param tenancyId the value to set
         * @return this builder
         */
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the managed instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the managed instance.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The location of the managed instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("location")
        private ManagedInstanceLocation location;

        /**
         * The location of the managed instance.
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(ManagedInstanceLocation location) {
            this.location = location;
            this.__explicitlySet__.add("location");
            return this;
        }
        /** The CPU architecture type of the managed instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("architecture")
        private ArchType architecture;

        /**
         * The CPU architecture type of the managed instance.
         *
         * @param architecture the value to set
         * @return this builder
         */
        public Builder architecture(ArchType architecture) {
            this.architecture = architecture;
            this.__explicitlySet__.add("architecture");
            return this;
        }
        /** The operating system type of the managed instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
        private OsFamily osFamily;

        /**
         * The operating system type of the managed instance.
         *
         * @param osFamily the value to set
         * @return this builder
         */
        public Builder osFamily(OsFamily osFamily) {
            this.osFamily = osFamily;
            this.__explicitlySet__.add("osFamily");
            return this;
        }
        /** Current status of the managed instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private ManagedInstanceStatus status;

        /**
         * Current status of the managed instance.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(ManagedInstanceStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceGroup")
        private Id managedInstanceGroup;

        public Builder managedInstanceGroup(Id managedInstanceGroup) {
            this.managedInstanceGroup = managedInstanceGroup;
            this.__explicitlySet__.add("managedInstanceGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleEnvironment")
        private Id lifecycleEnvironment;

        public Builder lifecycleEnvironment(Id lifecycleEnvironment) {
            this.lifecycleEnvironment = lifecycleEnvironment;
            this.__explicitlySet__.add("lifecycleEnvironment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStage")
        private Id lifecycleStage;

        public Builder lifecycleStage(Id lifecycleStage) {
            this.lifecycleStage = lifecycleStage;
            this.__explicitlySet__.add("lifecycleStage");
            return this;
        }
        /** Indicates whether a reboot is required to complete installation of updates. */
        @com.fasterxml.jackson.annotation.JsonProperty("isRebootRequired")
        private Boolean isRebootRequired;

        /**
         * Indicates whether a reboot is required to complete installation of updates.
         *
         * @param isRebootRequired the value to set
         * @return this builder
         */
        public Builder isRebootRequired(Boolean isRebootRequired) {
            this.isRebootRequired = isRebootRequired;
            this.__explicitlySet__.add("isRebootRequired");
            return this;
        }
        /** Number of updates available for installation. */
        @com.fasterxml.jackson.annotation.JsonProperty("updatesAvailable")
        private Integer updatesAvailable;

        /**
         * Number of updates available for installation.
         *
         * @param updatesAvailable the value to set
         * @return this builder
         */
        public Builder updatesAvailable(Integer updatesAvailable) {
            this.updatesAvailable = updatesAvailable;
            this.__explicitlySet__.add("updatesAvailable");
            return this;
        }
        /** Whether this managed instance is acting as an on-premises management station. */
        @com.fasterxml.jackson.annotation.JsonProperty("isManagementStation")
        private Boolean isManagementStation;

        /**
         * Whether this managed instance is acting as an on-premises management station.
         *
         * @param isManagementStation the value to set
         * @return this builder
         */
        public Builder isManagementStation(Boolean isManagementStation) {
            this.isManagementStation = isManagementStation;
            this.__explicitlySet__.add("isManagementStation");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * Oracle Notifications service (ONS) topic. ONS is the channel used to send notifications
         * to the customer.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("notificationTopicId")
        private String notificationTopicId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * Oracle Notifications service (ONS) topic. ONS is the channel used to send notifications
         * to the customer.
         *
         * @param notificationTopicId the value to set
         * @return this builder
         */
        public Builder notificationTopicId(String notificationTopicId) {
            this.notificationTopicId = notificationTopicId;
            this.__explicitlySet__.add("notificationTopicId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("autonomousSettings")
        private AutonomousSettings autonomousSettings;

        public Builder autonomousSettings(AutonomousSettings autonomousSettings) {
            this.autonomousSettings = autonomousSettings;
            this.__explicitlySet__.add("autonomousSettings");
            return this;
        }
        /** Indicates whether Autonomous Linux manages this instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("isManagedByAutonomousLinux")
        private Boolean isManagedByAutonomousLinux;

        /**
         * Indicates whether Autonomous Linux manages this instance.
         *
         * @param isManagedByAutonomousLinux the value to set
         * @return this builder
         */
        public Builder isManagedByAutonomousLinux(Boolean isManagedByAutonomousLinux) {
            this.isManagedByAutonomousLinux = isManagedByAutonomousLinux;
            this.__explicitlySet__.add("isManagedByAutonomousLinux");
            return this;
        }
        /** The version of osmh-agent running on the managed instance */
        @com.fasterxml.jackson.annotation.JsonProperty("agentVersion")
        private String agentVersion;

        /**
         * The version of osmh-agent running on the managed instance
         *
         * @param agentVersion the value to set
         * @return this builder
         */
        public Builder agentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            this.__explicitlySet__.add("agentVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedInstanceSummary build() {
            ManagedInstanceSummary model =
                    new ManagedInstanceSummary(
                            this.id,
                            this.displayName,
                            this.description,
                            this.tenancyId,
                            this.compartmentId,
                            this.location,
                            this.architecture,
                            this.osFamily,
                            this.status,
                            this.managedInstanceGroup,
                            this.lifecycleEnvironment,
                            this.lifecycleStage,
                            this.isRebootRequired,
                            this.updatesAvailable,
                            this.isManagementStation,
                            this.notificationTopicId,
                            this.autonomousSettings,
                            this.isManagedByAutonomousLinux,
                            this.agentVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedInstanceSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("tenancyId")) {
                this.tenancyId(model.getTenancyId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("location")) {
                this.location(model.getLocation());
            }
            if (model.wasPropertyExplicitlySet("architecture")) {
                this.architecture(model.getArchitecture());
            }
            if (model.wasPropertyExplicitlySet("osFamily")) {
                this.osFamily(model.getOsFamily());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
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
            if (model.wasPropertyExplicitlySet("isRebootRequired")) {
                this.isRebootRequired(model.getIsRebootRequired());
            }
            if (model.wasPropertyExplicitlySet("updatesAvailable")) {
                this.updatesAvailable(model.getUpdatesAvailable());
            }
            if (model.wasPropertyExplicitlySet("isManagementStation")) {
                this.isManagementStation(model.getIsManagementStation());
            }
            if (model.wasPropertyExplicitlySet("notificationTopicId")) {
                this.notificationTopicId(model.getNotificationTopicId());
            }
            if (model.wasPropertyExplicitlySet("autonomousSettings")) {
                this.autonomousSettings(model.getAutonomousSettings());
            }
            if (model.wasPropertyExplicitlySet("isManagedByAutonomousLinux")) {
                this.isManagedByAutonomousLinux(model.getIsManagedByAutonomousLinux());
            }
            if (model.wasPropertyExplicitlySet("agentVersion")) {
                this.agentVersion(model.getAgentVersion());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * managed instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * managed instance.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** User-friendly name for the managed instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * User-friendly name for the managed instance.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** User-specified description of the managed instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * User-specified description of the managed instance.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * tenancy this managed instance resides in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    private final String tenancyId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * tenancy this managed instance resides in.
     *
     * @return the value
     */
    public String getTenancyId() {
        return tenancyId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the managed instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the managed instance.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The location of the managed instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    private final ManagedInstanceLocation location;

    /**
     * The location of the managed instance.
     *
     * @return the value
     */
    public ManagedInstanceLocation getLocation() {
        return location;
    }

    /** The CPU architecture type of the managed instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("architecture")
    private final ArchType architecture;

    /**
     * The CPU architecture type of the managed instance.
     *
     * @return the value
     */
    public ArchType getArchitecture() {
        return architecture;
    }

    /** The operating system type of the managed instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
    private final OsFamily osFamily;

    /**
     * The operating system type of the managed instance.
     *
     * @return the value
     */
    public OsFamily getOsFamily() {
        return osFamily;
    }

    /** Current status of the managed instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final ManagedInstanceStatus status;

    /**
     * Current status of the managed instance.
     *
     * @return the value
     */
    public ManagedInstanceStatus getStatus() {
        return status;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceGroup")
    private final Id managedInstanceGroup;

    public Id getManagedInstanceGroup() {
        return managedInstanceGroup;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleEnvironment")
    private final Id lifecycleEnvironment;

    public Id getLifecycleEnvironment() {
        return lifecycleEnvironment;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStage")
    private final Id lifecycleStage;

    public Id getLifecycleStage() {
        return lifecycleStage;
    }

    /** Indicates whether a reboot is required to complete installation of updates. */
    @com.fasterxml.jackson.annotation.JsonProperty("isRebootRequired")
    private final Boolean isRebootRequired;

    /**
     * Indicates whether a reboot is required to complete installation of updates.
     *
     * @return the value
     */
    public Boolean getIsRebootRequired() {
        return isRebootRequired;
    }

    /** Number of updates available for installation. */
    @com.fasterxml.jackson.annotation.JsonProperty("updatesAvailable")
    private final Integer updatesAvailable;

    /**
     * Number of updates available for installation.
     *
     * @return the value
     */
    public Integer getUpdatesAvailable() {
        return updatesAvailable;
    }

    /** Whether this managed instance is acting as an on-premises management station. */
    @com.fasterxml.jackson.annotation.JsonProperty("isManagementStation")
    private final Boolean isManagementStation;

    /**
     * Whether this managed instance is acting as an on-premises management station.
     *
     * @return the value
     */
    public Boolean getIsManagementStation() {
        return isManagementStation;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * Oracle Notifications service (ONS) topic. ONS is the channel used to send notifications to
     * the customer.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("notificationTopicId")
    private final String notificationTopicId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * Oracle Notifications service (ONS) topic. ONS is the channel used to send notifications to
     * the customer.
     *
     * @return the value
     */
    public String getNotificationTopicId() {
        return notificationTopicId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("autonomousSettings")
    private final AutonomousSettings autonomousSettings;

    public AutonomousSettings getAutonomousSettings() {
        return autonomousSettings;
    }

    /** Indicates whether Autonomous Linux manages this instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("isManagedByAutonomousLinux")
    private final Boolean isManagedByAutonomousLinux;

    /**
     * Indicates whether Autonomous Linux manages this instance.
     *
     * @return the value
     */
    public Boolean getIsManagedByAutonomousLinux() {
        return isManagedByAutonomousLinux;
    }

    /** The version of osmh-agent running on the managed instance */
    @com.fasterxml.jackson.annotation.JsonProperty("agentVersion")
    private final String agentVersion;

    /**
     * The version of osmh-agent running on the managed instance
     *
     * @return the value
     */
    public String getAgentVersion() {
        return agentVersion;
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
        sb.append("ManagedInstanceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", location=").append(String.valueOf(this.location));
        sb.append(", architecture=").append(String.valueOf(this.architecture));
        sb.append(", osFamily=").append(String.valueOf(this.osFamily));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", managedInstanceGroup=").append(String.valueOf(this.managedInstanceGroup));
        sb.append(", lifecycleEnvironment=").append(String.valueOf(this.lifecycleEnvironment));
        sb.append(", lifecycleStage=").append(String.valueOf(this.lifecycleStage));
        sb.append(", isRebootRequired=").append(String.valueOf(this.isRebootRequired));
        sb.append(", updatesAvailable=").append(String.valueOf(this.updatesAvailable));
        sb.append(", isManagementStation=").append(String.valueOf(this.isManagementStation));
        sb.append(", notificationTopicId=").append(String.valueOf(this.notificationTopicId));
        sb.append(", autonomousSettings=").append(String.valueOf(this.autonomousSettings));
        sb.append(", isManagedByAutonomousLinux=")
                .append(String.valueOf(this.isManagedByAutonomousLinux));
        sb.append(", agentVersion=").append(String.valueOf(this.agentVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedInstanceSummary)) {
            return false;
        }

        ManagedInstanceSummary other = (ManagedInstanceSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.architecture, other.architecture)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.managedInstanceGroup, other.managedInstanceGroup)
                && java.util.Objects.equals(this.lifecycleEnvironment, other.lifecycleEnvironment)
                && java.util.Objects.equals(this.lifecycleStage, other.lifecycleStage)
                && java.util.Objects.equals(this.isRebootRequired, other.isRebootRequired)
                && java.util.Objects.equals(this.updatesAvailable, other.updatesAvailable)
                && java.util.Objects.equals(this.isManagementStation, other.isManagementStation)
                && java.util.Objects.equals(this.notificationTopicId, other.notificationTopicId)
                && java.util.Objects.equals(this.autonomousSettings, other.autonomousSettings)
                && java.util.Objects.equals(
                        this.isManagedByAutonomousLinux, other.isManagedByAutonomousLinux)
                && java.util.Objects.equals(this.agentVersion, other.agentVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.architecture == null ? 43 : this.architecture.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
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
        result =
                (result * PRIME)
                        + (this.isRebootRequired == null ? 43 : this.isRebootRequired.hashCode());
        result =
                (result * PRIME)
                        + (this.updatesAvailable == null ? 43 : this.updatesAvailable.hashCode());
        result =
                (result * PRIME)
                        + (this.isManagementStation == null
                                ? 43
                                : this.isManagementStation.hashCode());
        result =
                (result * PRIME)
                        + (this.notificationTopicId == null
                                ? 43
                                : this.notificationTopicId.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousSettings == null
                                ? 43
                                : this.autonomousSettings.hashCode());
        result =
                (result * PRIME)
                        + (this.isManagedByAutonomousLinux == null
                                ? 43
                                : this.isManagedByAutonomousLinux.hashCode());
        result = (result * PRIME) + (this.agentVersion == null ? 43 : this.agentVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
