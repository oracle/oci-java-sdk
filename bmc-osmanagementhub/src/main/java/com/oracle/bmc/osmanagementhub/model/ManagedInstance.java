/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * An object that defines the instance being managed by the service. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ManagedInstance.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagedInstance
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "tenancyId",
        "compartmentId",
        "location",
        "timeLastCheckin",
        "timeLastBoot",
        "osName",
        "osVersion",
        "osKernelVersion",
        "kspliceEffectiveKernelVersion",
        "architecture",
        "osFamily",
        "status",
        "profile",
        "profileVersion",
        "isManagementStation",
        "primaryManagementStationId",
        "secondaryManagementStationId",
        "softwareSources",
        "managedInstanceGroup",
        "lifecycleEnvironment",
        "lifecycleStage",
        "isRebootRequired",
        "installedPackages",
        "installedWindowsUpdates",
        "updatesAvailable",
        "securityUpdatesAvailable",
        "bugUpdatesAvailable",
        "enhancementUpdatesAvailable",
        "otherUpdatesAvailable",
        "scheduledJobCount",
        "workRequestCount",
        "timeCreated",
        "timeUpdated",
        "notificationTopicId",
        "autonomousSettings",
        "isManagedByAutonomousLinux",
        "agentVersion"
    })
    public ManagedInstance(
            String id,
            String displayName,
            String description,
            String tenancyId,
            String compartmentId,
            ManagedInstanceLocation location,
            java.util.Date timeLastCheckin,
            java.util.Date timeLastBoot,
            String osName,
            String osVersion,
            String osKernelVersion,
            String kspliceEffectiveKernelVersion,
            ArchType architecture,
            OsFamily osFamily,
            ManagedInstanceStatus status,
            String profile,
            String profileVersion,
            Boolean isManagementStation,
            String primaryManagementStationId,
            String secondaryManagementStationId,
            java.util.List<SoftwareSourceDetails> softwareSources,
            Id managedInstanceGroup,
            Id lifecycleEnvironment,
            Id lifecycleStage,
            Boolean isRebootRequired,
            Integer installedPackages,
            Integer installedWindowsUpdates,
            Integer updatesAvailable,
            Integer securityUpdatesAvailable,
            Integer bugUpdatesAvailable,
            Integer enhancementUpdatesAvailable,
            Integer otherUpdatesAvailable,
            Integer scheduledJobCount,
            Integer workRequestCount,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
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
        this.timeLastCheckin = timeLastCheckin;
        this.timeLastBoot = timeLastBoot;
        this.osName = osName;
        this.osVersion = osVersion;
        this.osKernelVersion = osKernelVersion;
        this.kspliceEffectiveKernelVersion = kspliceEffectiveKernelVersion;
        this.architecture = architecture;
        this.osFamily = osFamily;
        this.status = status;
        this.profile = profile;
        this.profileVersion = profileVersion;
        this.isManagementStation = isManagementStation;
        this.primaryManagementStationId = primaryManagementStationId;
        this.secondaryManagementStationId = secondaryManagementStationId;
        this.softwareSources = softwareSources;
        this.managedInstanceGroup = managedInstanceGroup;
        this.lifecycleEnvironment = lifecycleEnvironment;
        this.lifecycleStage = lifecycleStage;
        this.isRebootRequired = isRebootRequired;
        this.installedPackages = installedPackages;
        this.installedWindowsUpdates = installedWindowsUpdates;
        this.updatesAvailable = updatesAvailable;
        this.securityUpdatesAvailable = securityUpdatesAvailable;
        this.bugUpdatesAvailable = bugUpdatesAvailable;
        this.enhancementUpdatesAvailable = enhancementUpdatesAvailable;
        this.otherUpdatesAvailable = otherUpdatesAvailable;
        this.scheduledJobCount = scheduledJobCount;
        this.workRequestCount = workRequestCount;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.notificationTopicId = notificationTopicId;
        this.autonomousSettings = autonomousSettings;
        this.isManagedByAutonomousLinux = isManagedByAutonomousLinux;
        this.agentVersion = agentVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the managed instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the managed instance.
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
        /** User-specified description for the managed instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * User-specified description for the managed instance.
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
         * of the tenancy that the managed instance resides in.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the tenancy that the managed instance resides in.
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment that contains the managed instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment that contains the managed instance.
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
        /**
         * Time that the instance last checked in with the service (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastCheckin")
        private java.util.Date timeLastCheckin;

        /**
         * Time that the instance last checked in with the service (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * @param timeLastCheckin the value to set
         * @return this builder
         */
        public Builder timeLastCheckin(java.util.Date timeLastCheckin) {
            this.timeLastCheckin = timeLastCheckin;
            this.__explicitlySet__.add("timeLastCheckin");
            return this;
        }
        /**
         * Time that the instance last booted (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
         * format).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastBoot")
        private java.util.Date timeLastBoot;

        /**
         * Time that the instance last booted (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
         * format).
         *
         * @param timeLastBoot the value to set
         * @return this builder
         */
        public Builder timeLastBoot(java.util.Date timeLastBoot) {
            this.timeLastBoot = timeLastBoot;
            this.__explicitlySet__.add("timeLastBoot");
            return this;
        }
        /** Operating system name. */
        @com.fasterxml.jackson.annotation.JsonProperty("osName")
        private String osName;

        /**
         * Operating system name.
         *
         * @param osName the value to set
         * @return this builder
         */
        public Builder osName(String osName) {
            this.osName = osName;
            this.__explicitlySet__.add("osName");
            return this;
        }
        /** Operating system version. */
        @com.fasterxml.jackson.annotation.JsonProperty("osVersion")
        private String osVersion;

        /**
         * Operating system version.
         *
         * @param osVersion the value to set
         * @return this builder
         */
        public Builder osVersion(String osVersion) {
            this.osVersion = osVersion;
            this.__explicitlySet__.add("osVersion");
            return this;
        }
        /** Operating system kernel version. */
        @com.fasterxml.jackson.annotation.JsonProperty("osKernelVersion")
        private String osKernelVersion;

        /**
         * Operating system kernel version.
         *
         * @param osKernelVersion the value to set
         * @return this builder
         */
        public Builder osKernelVersion(String osKernelVersion) {
            this.osKernelVersion = osKernelVersion;
            this.__explicitlySet__.add("osKernelVersion");
            return this;
        }
        /** The ksplice effective kernel version. */
        @com.fasterxml.jackson.annotation.JsonProperty("kspliceEffectiveKernelVersion")
        private String kspliceEffectiveKernelVersion;

        /**
         * The ksplice effective kernel version.
         *
         * @param kspliceEffectiveKernelVersion the value to set
         * @return this builder
         */
        public Builder kspliceEffectiveKernelVersion(String kspliceEffectiveKernelVersion) {
            this.kspliceEffectiveKernelVersion = kspliceEffectiveKernelVersion;
            this.__explicitlySet__.add("kspliceEffectiveKernelVersion");
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
        /** The profile that was used to register this instance with the service. */
        @com.fasterxml.jackson.annotation.JsonProperty("profile")
        private String profile;

        /**
         * The profile that was used to register this instance with the service.
         *
         * @param profile the value to set
         * @return this builder
         */
        public Builder profile(String profile) {
            this.profile = profile;
            this.__explicitlySet__.add("profile");
            return this;
        }
        /** The version of the profile that was used to register this instance with the service. */
        @com.fasterxml.jackson.annotation.JsonProperty("profileVersion")
        private String profileVersion;

        /**
         * The version of the profile that was used to register this instance with the service.
         *
         * @param profileVersion the value to set
         * @return this builder
         */
        public Builder profileVersion(String profileVersion) {
            this.profileVersion = profileVersion;
            this.__explicitlySet__.add("profileVersion");
            return this;
        }
        /**
         * Indicates whether this managed instance is acting as an on-premises management station.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isManagementStation")
        private Boolean isManagementStation;

        /**
         * Indicates whether this managed instance is acting as an on-premises management station.
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the management station for the instance to use as primary management station.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("primaryManagementStationId")
        private String primaryManagementStationId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the management station for the instance to use as primary management station.
         *
         * @param primaryManagementStationId the value to set
         * @return this builder
         */
        public Builder primaryManagementStationId(String primaryManagementStationId) {
            this.primaryManagementStationId = primaryManagementStationId;
            this.__explicitlySet__.add("primaryManagementStationId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the management station for the instance to use as secondary management station.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secondaryManagementStationId")
        private String secondaryManagementStationId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the management station for the instance to use as secondary management station.
         *
         * @param secondaryManagementStationId the value to set
         * @return this builder
         */
        public Builder secondaryManagementStationId(String secondaryManagementStationId) {
            this.secondaryManagementStationId = secondaryManagementStationId;
            this.__explicitlySet__.add("secondaryManagementStationId");
            return this;
        }
        /** The list of software sources currently attached to the managed instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSources")
        private java.util.List<SoftwareSourceDetails> softwareSources;

        /**
         * The list of software sources currently attached to the managed instance.
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
        /** Number of packages installed on the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("installedPackages")
        private Integer installedPackages;

        /**
         * Number of packages installed on the instance.
         *
         * @param installedPackages the value to set
         * @return this builder
         */
        public Builder installedPackages(Integer installedPackages) {
            this.installedPackages = installedPackages;
            this.__explicitlySet__.add("installedPackages");
            return this;
        }
        /** Number of Windows updates installed on the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("installedWindowsUpdates")
        private Integer installedWindowsUpdates;

        /**
         * Number of Windows updates installed on the instance.
         *
         * @param installedWindowsUpdates the value to set
         * @return this builder
         */
        public Builder installedWindowsUpdates(Integer installedWindowsUpdates) {
            this.installedWindowsUpdates = installedWindowsUpdates;
            this.__explicitlySet__.add("installedWindowsUpdates");
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
        /** Number of security type updates available for installation. */
        @com.fasterxml.jackson.annotation.JsonProperty("securityUpdatesAvailable")
        private Integer securityUpdatesAvailable;

        /**
         * Number of security type updates available for installation.
         *
         * @param securityUpdatesAvailable the value to set
         * @return this builder
         */
        public Builder securityUpdatesAvailable(Integer securityUpdatesAvailable) {
            this.securityUpdatesAvailable = securityUpdatesAvailable;
            this.__explicitlySet__.add("securityUpdatesAvailable");
            return this;
        }
        /** Number of bug fix type updates available for installation. */
        @com.fasterxml.jackson.annotation.JsonProperty("bugUpdatesAvailable")
        private Integer bugUpdatesAvailable;

        /**
         * Number of bug fix type updates available for installation.
         *
         * @param bugUpdatesAvailable the value to set
         * @return this builder
         */
        public Builder bugUpdatesAvailable(Integer bugUpdatesAvailable) {
            this.bugUpdatesAvailable = bugUpdatesAvailable;
            this.__explicitlySet__.add("bugUpdatesAvailable");
            return this;
        }
        /** Number of enhancement type updates available for installation. */
        @com.fasterxml.jackson.annotation.JsonProperty("enhancementUpdatesAvailable")
        private Integer enhancementUpdatesAvailable;

        /**
         * Number of enhancement type updates available for installation.
         *
         * @param enhancementUpdatesAvailable the value to set
         * @return this builder
         */
        public Builder enhancementUpdatesAvailable(Integer enhancementUpdatesAvailable) {
            this.enhancementUpdatesAvailable = enhancementUpdatesAvailable;
            this.__explicitlySet__.add("enhancementUpdatesAvailable");
            return this;
        }
        /** Number of non-classified (other) updates available for installation. */
        @com.fasterxml.jackson.annotation.JsonProperty("otherUpdatesAvailable")
        private Integer otherUpdatesAvailable;

        /**
         * Number of non-classified (other) updates available for installation.
         *
         * @param otherUpdatesAvailable the value to set
         * @return this builder
         */
        public Builder otherUpdatesAvailable(Integer otherUpdatesAvailable) {
            this.otherUpdatesAvailable = otherUpdatesAvailable;
            this.__explicitlySet__.add("otherUpdatesAvailable");
            return this;
        }
        /** Number of scheduled jobs associated with this instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledJobCount")
        private Integer scheduledJobCount;

        /**
         * Number of scheduled jobs associated with this instance.
         *
         * @param scheduledJobCount the value to set
         * @return this builder
         */
        public Builder scheduledJobCount(Integer scheduledJobCount) {
            this.scheduledJobCount = scheduledJobCount;
            this.__explicitlySet__.add("scheduledJobCount");
            return this;
        }
        /** Number of work requests associated with this instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("workRequestCount")
        private Integer workRequestCount;

        /**
         * Number of work requests associated with this instance.
         *
         * @param workRequestCount the value to set
         * @return this builder
         */
        public Builder workRequestCount(Integer workRequestCount) {
            this.workRequestCount = workRequestCount;
            this.__explicitlySet__.add("workRequestCount");
            return this;
        }
        /**
         * The date and time the instance was created (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the instance was created (in [RFC
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
         * The date and time the instance was last updated (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the instance was last updated (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * for the Oracle Notifications service (ONS) topic. ONS is the channel used to send
         * notifications to the customer.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("notificationTopicId")
        private String notificationTopicId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * for the Oracle Notifications service (ONS) topic. ONS is the channel used to send
         * notifications to the customer.
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
        /** Indicates whether the Autonomous Linux service manages the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("isManagedByAutonomousLinux")
        private Boolean isManagedByAutonomousLinux;

        /**
         * Indicates whether the Autonomous Linux service manages the instance.
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

        public ManagedInstance build() {
            ManagedInstance model =
                    new ManagedInstance(
                            this.id,
                            this.displayName,
                            this.description,
                            this.tenancyId,
                            this.compartmentId,
                            this.location,
                            this.timeLastCheckin,
                            this.timeLastBoot,
                            this.osName,
                            this.osVersion,
                            this.osKernelVersion,
                            this.kspliceEffectiveKernelVersion,
                            this.architecture,
                            this.osFamily,
                            this.status,
                            this.profile,
                            this.profileVersion,
                            this.isManagementStation,
                            this.primaryManagementStationId,
                            this.secondaryManagementStationId,
                            this.softwareSources,
                            this.managedInstanceGroup,
                            this.lifecycleEnvironment,
                            this.lifecycleStage,
                            this.isRebootRequired,
                            this.installedPackages,
                            this.installedWindowsUpdates,
                            this.updatesAvailable,
                            this.securityUpdatesAvailable,
                            this.bugUpdatesAvailable,
                            this.enhancementUpdatesAvailable,
                            this.otherUpdatesAvailable,
                            this.scheduledJobCount,
                            this.workRequestCount,
                            this.timeCreated,
                            this.timeUpdated,
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
        public Builder copy(ManagedInstance model) {
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
            if (model.wasPropertyExplicitlySet("timeLastCheckin")) {
                this.timeLastCheckin(model.getTimeLastCheckin());
            }
            if (model.wasPropertyExplicitlySet("timeLastBoot")) {
                this.timeLastBoot(model.getTimeLastBoot());
            }
            if (model.wasPropertyExplicitlySet("osName")) {
                this.osName(model.getOsName());
            }
            if (model.wasPropertyExplicitlySet("osVersion")) {
                this.osVersion(model.getOsVersion());
            }
            if (model.wasPropertyExplicitlySet("osKernelVersion")) {
                this.osKernelVersion(model.getOsKernelVersion());
            }
            if (model.wasPropertyExplicitlySet("kspliceEffectiveKernelVersion")) {
                this.kspliceEffectiveKernelVersion(model.getKspliceEffectiveKernelVersion());
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
            if (model.wasPropertyExplicitlySet("profile")) {
                this.profile(model.getProfile());
            }
            if (model.wasPropertyExplicitlySet("profileVersion")) {
                this.profileVersion(model.getProfileVersion());
            }
            if (model.wasPropertyExplicitlySet("isManagementStation")) {
                this.isManagementStation(model.getIsManagementStation());
            }
            if (model.wasPropertyExplicitlySet("primaryManagementStationId")) {
                this.primaryManagementStationId(model.getPrimaryManagementStationId());
            }
            if (model.wasPropertyExplicitlySet("secondaryManagementStationId")) {
                this.secondaryManagementStationId(model.getSecondaryManagementStationId());
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
            if (model.wasPropertyExplicitlySet("isRebootRequired")) {
                this.isRebootRequired(model.getIsRebootRequired());
            }
            if (model.wasPropertyExplicitlySet("installedPackages")) {
                this.installedPackages(model.getInstalledPackages());
            }
            if (model.wasPropertyExplicitlySet("installedWindowsUpdates")) {
                this.installedWindowsUpdates(model.getInstalledWindowsUpdates());
            }
            if (model.wasPropertyExplicitlySet("updatesAvailable")) {
                this.updatesAvailable(model.getUpdatesAvailable());
            }
            if (model.wasPropertyExplicitlySet("securityUpdatesAvailable")) {
                this.securityUpdatesAvailable(model.getSecurityUpdatesAvailable());
            }
            if (model.wasPropertyExplicitlySet("bugUpdatesAvailable")) {
                this.bugUpdatesAvailable(model.getBugUpdatesAvailable());
            }
            if (model.wasPropertyExplicitlySet("enhancementUpdatesAvailable")) {
                this.enhancementUpdatesAvailable(model.getEnhancementUpdatesAvailable());
            }
            if (model.wasPropertyExplicitlySet("otherUpdatesAvailable")) {
                this.otherUpdatesAvailable(model.getOtherUpdatesAvailable());
            }
            if (model.wasPropertyExplicitlySet("scheduledJobCount")) {
                this.scheduledJobCount(model.getScheduledJobCount());
            }
            if (model.wasPropertyExplicitlySet("workRequestCount")) {
                this.workRequestCount(model.getWorkRequestCount());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the managed instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the managed instance.
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

    /** User-specified description for the managed instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * User-specified description for the managed instance.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the tenancy that the managed instance resides in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    private final String tenancyId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the tenancy that the managed instance resides in.
     *
     * @return the value
     */
    public String getTenancyId() {
        return tenancyId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment that contains the managed instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment that contains the managed instance.
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

    /**
     * Time that the instance last checked in with the service (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastCheckin")
    private final java.util.Date timeLastCheckin;

    /**
     * Time that the instance last checked in with the service (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     * @return the value
     */
    public java.util.Date getTimeLastCheckin() {
        return timeLastCheckin;
    }

    /**
     * Time that the instance last booted (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
     * format).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastBoot")
    private final java.util.Date timeLastBoot;

    /**
     * Time that the instance last booted (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
     * format).
     *
     * @return the value
     */
    public java.util.Date getTimeLastBoot() {
        return timeLastBoot;
    }

    /** Operating system name. */
    @com.fasterxml.jackson.annotation.JsonProperty("osName")
    private final String osName;

    /**
     * Operating system name.
     *
     * @return the value
     */
    public String getOsName() {
        return osName;
    }

    /** Operating system version. */
    @com.fasterxml.jackson.annotation.JsonProperty("osVersion")
    private final String osVersion;

    /**
     * Operating system version.
     *
     * @return the value
     */
    public String getOsVersion() {
        return osVersion;
    }

    /** Operating system kernel version. */
    @com.fasterxml.jackson.annotation.JsonProperty("osKernelVersion")
    private final String osKernelVersion;

    /**
     * Operating system kernel version.
     *
     * @return the value
     */
    public String getOsKernelVersion() {
        return osKernelVersion;
    }

    /** The ksplice effective kernel version. */
    @com.fasterxml.jackson.annotation.JsonProperty("kspliceEffectiveKernelVersion")
    private final String kspliceEffectiveKernelVersion;

    /**
     * The ksplice effective kernel version.
     *
     * @return the value
     */
    public String getKspliceEffectiveKernelVersion() {
        return kspliceEffectiveKernelVersion;
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

    /** The profile that was used to register this instance with the service. */
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    private final String profile;

    /**
     * The profile that was used to register this instance with the service.
     *
     * @return the value
     */
    public String getProfile() {
        return profile;
    }

    /** The version of the profile that was used to register this instance with the service. */
    @com.fasterxml.jackson.annotation.JsonProperty("profileVersion")
    private final String profileVersion;

    /**
     * The version of the profile that was used to register this instance with the service.
     *
     * @return the value
     */
    public String getProfileVersion() {
        return profileVersion;
    }

    /** Indicates whether this managed instance is acting as an on-premises management station. */
    @com.fasterxml.jackson.annotation.JsonProperty("isManagementStation")
    private final Boolean isManagementStation;

    /**
     * Indicates whether this managed instance is acting as an on-premises management station.
     *
     * @return the value
     */
    public Boolean getIsManagementStation() {
        return isManagementStation;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the management station for the instance to use as primary management station.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("primaryManagementStationId")
    private final String primaryManagementStationId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the management station for the instance to use as primary management station.
     *
     * @return the value
     */
    public String getPrimaryManagementStationId() {
        return primaryManagementStationId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the management station for the instance to use as secondary management station.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secondaryManagementStationId")
    private final String secondaryManagementStationId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the management station for the instance to use as secondary management station.
     *
     * @return the value
     */
    public String getSecondaryManagementStationId() {
        return secondaryManagementStationId;
    }

    /** The list of software sources currently attached to the managed instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSources")
    private final java.util.List<SoftwareSourceDetails> softwareSources;

    /**
     * The list of software sources currently attached to the managed instance.
     *
     * @return the value
     */
    public java.util.List<SoftwareSourceDetails> getSoftwareSources() {
        return softwareSources;
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

    /** Number of packages installed on the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("installedPackages")
    private final Integer installedPackages;

    /**
     * Number of packages installed on the instance.
     *
     * @return the value
     */
    public Integer getInstalledPackages() {
        return installedPackages;
    }

    /** Number of Windows updates installed on the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("installedWindowsUpdates")
    private final Integer installedWindowsUpdates;

    /**
     * Number of Windows updates installed on the instance.
     *
     * @return the value
     */
    public Integer getInstalledWindowsUpdates() {
        return installedWindowsUpdates;
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

    /** Number of security type updates available for installation. */
    @com.fasterxml.jackson.annotation.JsonProperty("securityUpdatesAvailable")
    private final Integer securityUpdatesAvailable;

    /**
     * Number of security type updates available for installation.
     *
     * @return the value
     */
    public Integer getSecurityUpdatesAvailable() {
        return securityUpdatesAvailable;
    }

    /** Number of bug fix type updates available for installation. */
    @com.fasterxml.jackson.annotation.JsonProperty("bugUpdatesAvailable")
    private final Integer bugUpdatesAvailable;

    /**
     * Number of bug fix type updates available for installation.
     *
     * @return the value
     */
    public Integer getBugUpdatesAvailable() {
        return bugUpdatesAvailable;
    }

    /** Number of enhancement type updates available for installation. */
    @com.fasterxml.jackson.annotation.JsonProperty("enhancementUpdatesAvailable")
    private final Integer enhancementUpdatesAvailable;

    /**
     * Number of enhancement type updates available for installation.
     *
     * @return the value
     */
    public Integer getEnhancementUpdatesAvailable() {
        return enhancementUpdatesAvailable;
    }

    /** Number of non-classified (other) updates available for installation. */
    @com.fasterxml.jackson.annotation.JsonProperty("otherUpdatesAvailable")
    private final Integer otherUpdatesAvailable;

    /**
     * Number of non-classified (other) updates available for installation.
     *
     * @return the value
     */
    public Integer getOtherUpdatesAvailable() {
        return otherUpdatesAvailable;
    }

    /** Number of scheduled jobs associated with this instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledJobCount")
    private final Integer scheduledJobCount;

    /**
     * Number of scheduled jobs associated with this instance.
     *
     * @return the value
     */
    public Integer getScheduledJobCount() {
        return scheduledJobCount;
    }

    /** Number of work requests associated with this instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("workRequestCount")
    private final Integer workRequestCount;

    /**
     * Number of work requests associated with this instance.
     *
     * @return the value
     */
    public Integer getWorkRequestCount() {
        return workRequestCount;
    }

    /**
     * The date and time the instance was created (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
     * format).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the instance was created (in [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
     * format).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the instance was last updated (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the instance was last updated (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * the Oracle Notifications service (ONS) topic. ONS is the channel used to send notifications
     * to the customer.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("notificationTopicId")
    private final String notificationTopicId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * the Oracle Notifications service (ONS) topic. ONS is the channel used to send notifications
     * to the customer.
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

    /** Indicates whether the Autonomous Linux service manages the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("isManagedByAutonomousLinux")
    private final Boolean isManagedByAutonomousLinux;

    /**
     * Indicates whether the Autonomous Linux service manages the instance.
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
        sb.append("ManagedInstance(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", location=").append(String.valueOf(this.location));
        sb.append(", timeLastCheckin=").append(String.valueOf(this.timeLastCheckin));
        sb.append(", timeLastBoot=").append(String.valueOf(this.timeLastBoot));
        sb.append(", osName=").append(String.valueOf(this.osName));
        sb.append(", osVersion=").append(String.valueOf(this.osVersion));
        sb.append(", osKernelVersion=").append(String.valueOf(this.osKernelVersion));
        sb.append(", kspliceEffectiveKernelVersion=")
                .append(String.valueOf(this.kspliceEffectiveKernelVersion));
        sb.append(", architecture=").append(String.valueOf(this.architecture));
        sb.append(", osFamily=").append(String.valueOf(this.osFamily));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", profile=").append(String.valueOf(this.profile));
        sb.append(", profileVersion=").append(String.valueOf(this.profileVersion));
        sb.append(", isManagementStation=").append(String.valueOf(this.isManagementStation));
        sb.append(", primaryManagementStationId=")
                .append(String.valueOf(this.primaryManagementStationId));
        sb.append(", secondaryManagementStationId=")
                .append(String.valueOf(this.secondaryManagementStationId));
        sb.append(", softwareSources=").append(String.valueOf(this.softwareSources));
        sb.append(", managedInstanceGroup=").append(String.valueOf(this.managedInstanceGroup));
        sb.append(", lifecycleEnvironment=").append(String.valueOf(this.lifecycleEnvironment));
        sb.append(", lifecycleStage=").append(String.valueOf(this.lifecycleStage));
        sb.append(", isRebootRequired=").append(String.valueOf(this.isRebootRequired));
        sb.append(", installedPackages=").append(String.valueOf(this.installedPackages));
        sb.append(", installedWindowsUpdates=")
                .append(String.valueOf(this.installedWindowsUpdates));
        sb.append(", updatesAvailable=").append(String.valueOf(this.updatesAvailable));
        sb.append(", securityUpdatesAvailable=")
                .append(String.valueOf(this.securityUpdatesAvailable));
        sb.append(", bugUpdatesAvailable=").append(String.valueOf(this.bugUpdatesAvailable));
        sb.append(", enhancementUpdatesAvailable=")
                .append(String.valueOf(this.enhancementUpdatesAvailable));
        sb.append(", otherUpdatesAvailable=").append(String.valueOf(this.otherUpdatesAvailable));
        sb.append(", scheduledJobCount=").append(String.valueOf(this.scheduledJobCount));
        sb.append(", workRequestCount=").append(String.valueOf(this.workRequestCount));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
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
        if (!(o instanceof ManagedInstance)) {
            return false;
        }

        ManagedInstance other = (ManagedInstance) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.timeLastCheckin, other.timeLastCheckin)
                && java.util.Objects.equals(this.timeLastBoot, other.timeLastBoot)
                && java.util.Objects.equals(this.osName, other.osName)
                && java.util.Objects.equals(this.osVersion, other.osVersion)
                && java.util.Objects.equals(this.osKernelVersion, other.osKernelVersion)
                && java.util.Objects.equals(
                        this.kspliceEffectiveKernelVersion, other.kspliceEffectiveKernelVersion)
                && java.util.Objects.equals(this.architecture, other.architecture)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.profile, other.profile)
                && java.util.Objects.equals(this.profileVersion, other.profileVersion)
                && java.util.Objects.equals(this.isManagementStation, other.isManagementStation)
                && java.util.Objects.equals(
                        this.primaryManagementStationId, other.primaryManagementStationId)
                && java.util.Objects.equals(
                        this.secondaryManagementStationId, other.secondaryManagementStationId)
                && java.util.Objects.equals(this.softwareSources, other.softwareSources)
                && java.util.Objects.equals(this.managedInstanceGroup, other.managedInstanceGroup)
                && java.util.Objects.equals(this.lifecycleEnvironment, other.lifecycleEnvironment)
                && java.util.Objects.equals(this.lifecycleStage, other.lifecycleStage)
                && java.util.Objects.equals(this.isRebootRequired, other.isRebootRequired)
                && java.util.Objects.equals(this.installedPackages, other.installedPackages)
                && java.util.Objects.equals(
                        this.installedWindowsUpdates, other.installedWindowsUpdates)
                && java.util.Objects.equals(this.updatesAvailable, other.updatesAvailable)
                && java.util.Objects.equals(
                        this.securityUpdatesAvailable, other.securityUpdatesAvailable)
                && java.util.Objects.equals(this.bugUpdatesAvailable, other.bugUpdatesAvailable)
                && java.util.Objects.equals(
                        this.enhancementUpdatesAvailable, other.enhancementUpdatesAvailable)
                && java.util.Objects.equals(this.otherUpdatesAvailable, other.otherUpdatesAvailable)
                && java.util.Objects.equals(this.scheduledJobCount, other.scheduledJobCount)
                && java.util.Objects.equals(this.workRequestCount, other.workRequestCount)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
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
        result =
                (result * PRIME)
                        + (this.timeLastCheckin == null ? 43 : this.timeLastCheckin.hashCode());
        result = (result * PRIME) + (this.timeLastBoot == null ? 43 : this.timeLastBoot.hashCode());
        result = (result * PRIME) + (this.osName == null ? 43 : this.osName.hashCode());
        result = (result * PRIME) + (this.osVersion == null ? 43 : this.osVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.osKernelVersion == null ? 43 : this.osKernelVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.kspliceEffectiveKernelVersion == null
                                ? 43
                                : this.kspliceEffectiveKernelVersion.hashCode());
        result = (result * PRIME) + (this.architecture == null ? 43 : this.architecture.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.profile == null ? 43 : this.profile.hashCode());
        result =
                (result * PRIME)
                        + (this.profileVersion == null ? 43 : this.profileVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.isManagementStation == null
                                ? 43
                                : this.isManagementStation.hashCode());
        result =
                (result * PRIME)
                        + (this.primaryManagementStationId == null
                                ? 43
                                : this.primaryManagementStationId.hashCode());
        result =
                (result * PRIME)
                        + (this.secondaryManagementStationId == null
                                ? 43
                                : this.secondaryManagementStationId.hashCode());
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
        result =
                (result * PRIME)
                        + (this.isRebootRequired == null ? 43 : this.isRebootRequired.hashCode());
        result =
                (result * PRIME)
                        + (this.installedPackages == null ? 43 : this.installedPackages.hashCode());
        result =
                (result * PRIME)
                        + (this.installedWindowsUpdates == null
                                ? 43
                                : this.installedWindowsUpdates.hashCode());
        result =
                (result * PRIME)
                        + (this.updatesAvailable == null ? 43 : this.updatesAvailable.hashCode());
        result =
                (result * PRIME)
                        + (this.securityUpdatesAvailable == null
                                ? 43
                                : this.securityUpdatesAvailable.hashCode());
        result =
                (result * PRIME)
                        + (this.bugUpdatesAvailable == null
                                ? 43
                                : this.bugUpdatesAvailable.hashCode());
        result =
                (result * PRIME)
                        + (this.enhancementUpdatesAvailable == null
                                ? 43
                                : this.enhancementUpdatesAvailable.hashCode());
        result =
                (result * PRIME)
                        + (this.otherUpdatesAvailable == null
                                ? 43
                                : this.otherUpdatesAvailable.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledJobCount == null ? 43 : this.scheduledJobCount.hashCode());
        result =
                (result * PRIME)
                        + (this.workRequestCount == null ? 43 : this.workRequestCount.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
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
