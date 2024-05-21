/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Detail information for an OCI Compute instance that is being managed
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ManagedInstance.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ManagedInstance extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "id",
        "description",
        "lastCheckin",
        "lastBoot",
        "updatesAvailable",
        "osName",
        "osVersion",
        "osKernelVersion",
        "compartmentId",
        "status",
        "parentSoftwareSource",
        "childSoftwareSources",
        "managedInstanceGroups",
        "osFamily",
        "isRebootRequired",
        "notificationTopicId",
        "kspliceEffectiveKernelVersion",
        "isDataCollectionAuthorized",
        "autonomous",
        "securityUpdatesAvailable",
        "bugUpdatesAvailable",
        "enhancementUpdatesAvailable",
        "otherUpdatesAvailable",
        "scheduledJobCount",
        "workRequestCount"
    })
    public ManagedInstance(
            String displayName,
            String id,
            String description,
            String lastCheckin,
            String lastBoot,
            Integer updatesAvailable,
            String osName,
            String osVersion,
            String osKernelVersion,
            String compartmentId,
            Status status,
            SoftwareSourceId parentSoftwareSource,
            java.util.List<SoftwareSourceId> childSoftwareSources,
            java.util.List<Id> managedInstanceGroups,
            OsFamilies osFamily,
            Boolean isRebootRequired,
            String notificationTopicId,
            String kspliceEffectiveKernelVersion,
            Boolean isDataCollectionAuthorized,
            AutonomousSettings autonomous,
            Integer securityUpdatesAvailable,
            Integer bugUpdatesAvailable,
            Integer enhancementUpdatesAvailable,
            Integer otherUpdatesAvailable,
            Integer scheduledJobCount,
            Integer workRequestCount) {
        super();
        this.displayName = displayName;
        this.id = id;
        this.description = description;
        this.lastCheckin = lastCheckin;
        this.lastBoot = lastBoot;
        this.updatesAvailable = updatesAvailable;
        this.osName = osName;
        this.osVersion = osVersion;
        this.osKernelVersion = osKernelVersion;
        this.compartmentId = compartmentId;
        this.status = status;
        this.parentSoftwareSource = parentSoftwareSource;
        this.childSoftwareSources = childSoftwareSources;
        this.managedInstanceGroups = managedInstanceGroups;
        this.osFamily = osFamily;
        this.isRebootRequired = isRebootRequired;
        this.notificationTopicId = notificationTopicId;
        this.kspliceEffectiveKernelVersion = kspliceEffectiveKernelVersion;
        this.isDataCollectionAuthorized = isDataCollectionAuthorized;
        this.autonomous = autonomous;
        this.securityUpdatesAvailable = securityUpdatesAvailable;
        this.bugUpdatesAvailable = bugUpdatesAvailable;
        this.enhancementUpdatesAvailable = enhancementUpdatesAvailable;
        this.otherUpdatesAvailable = otherUpdatesAvailable;
        this.scheduledJobCount = scheduledJobCount;
        this.workRequestCount = workRequestCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Managed Instance identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Managed Instance identifier
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * OCID for the managed instance
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID for the managed instance
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Information specified by the user about the managed instance
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Information specified by the user about the managed instance
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Time at which the instance last checked in
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastCheckin")
        private String lastCheckin;

        /**
         * Time at which the instance last checked in
         * @param lastCheckin the value to set
         * @return this builder
         **/
        public Builder lastCheckin(String lastCheckin) {
            this.lastCheckin = lastCheckin;
            this.__explicitlySet__.add("lastCheckin");
            return this;
        }
        /**
         * Time at which the instance last booted
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastBoot")
        private String lastBoot;

        /**
         * Time at which the instance last booted
         * @param lastBoot the value to set
         * @return this builder
         **/
        public Builder lastBoot(String lastBoot) {
            this.lastBoot = lastBoot;
            this.__explicitlySet__.add("lastBoot");
            return this;
        }
        /**
         * Number of updates available to be installed
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updatesAvailable")
        private Integer updatesAvailable;

        /**
         * Number of updates available to be installed
         * @param updatesAvailable the value to set
         * @return this builder
         **/
        public Builder updatesAvailable(Integer updatesAvailable) {
            this.updatesAvailable = updatesAvailable;
            this.__explicitlySet__.add("updatesAvailable");
            return this;
        }
        /**
         * Operating System Name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osName")
        private String osName;

        /**
         * Operating System Name
         * @param osName the value to set
         * @return this builder
         **/
        public Builder osName(String osName) {
            this.osName = osName;
            this.__explicitlySet__.add("osName");
            return this;
        }
        /**
         * Operating System Version
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osVersion")
        private String osVersion;

        /**
         * Operating System Version
         * @param osVersion the value to set
         * @return this builder
         **/
        public Builder osVersion(String osVersion) {
            this.osVersion = osVersion;
            this.__explicitlySet__.add("osVersion");
            return this;
        }
        /**
         * Operating System Kernel Version
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osKernelVersion")
        private String osKernelVersion;

        /**
         * Operating System Kernel Version
         * @param osKernelVersion the value to set
         * @return this builder
         **/
        public Builder osKernelVersion(String osKernelVersion) {
            this.osKernelVersion = osKernelVersion;
            this.__explicitlySet__.add("osKernelVersion");
            return this;
        }
        /**
         * OCID for the Compartment
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID for the Compartment
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * status of the managed instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * status of the managed instance.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * the parent (base) Software Source attached to the Managed Instance
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentSoftwareSource")
        private SoftwareSourceId parentSoftwareSource;

        /**
         * the parent (base) Software Source attached to the Managed Instance
         * @param parentSoftwareSource the value to set
         * @return this builder
         **/
        public Builder parentSoftwareSource(SoftwareSourceId parentSoftwareSource) {
            this.parentSoftwareSource = parentSoftwareSource;
            this.__explicitlySet__.add("parentSoftwareSource");
            return this;
        }
        /**
         * list of child Software Sources attached to the Managed Instance
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("childSoftwareSources")
        private java.util.List<SoftwareSourceId> childSoftwareSources;

        /**
         * list of child Software Sources attached to the Managed Instance
         * @param childSoftwareSources the value to set
         * @return this builder
         **/
        public Builder childSoftwareSources(java.util.List<SoftwareSourceId> childSoftwareSources) {
            this.childSoftwareSources = childSoftwareSources;
            this.__explicitlySet__.add("childSoftwareSources");
            return this;
        }
        /**
         * The ids of the managed instance groups of which this instance is a
         * member.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceGroups")
        private java.util.List<Id> managedInstanceGroups;

        /**
         * The ids of the managed instance groups of which this instance is a
         * member.
         *
         * @param managedInstanceGroups the value to set
         * @return this builder
         **/
        public Builder managedInstanceGroups(java.util.List<Id> managedInstanceGroups) {
            this.managedInstanceGroups = managedInstanceGroups;
            this.__explicitlySet__.add("managedInstanceGroups");
            return this;
        }
        /**
         * The Operating System type of the managed instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
        private OsFamilies osFamily;

        /**
         * The Operating System type of the managed instance.
         * @param osFamily the value to set
         * @return this builder
         **/
        public Builder osFamily(OsFamilies osFamily) {
            this.osFamily = osFamily;
            this.__explicitlySet__.add("osFamily");
            return this;
        }
        /**
         * Indicates whether a reboot is required to complete installation of updates.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRebootRequired")
        private Boolean isRebootRequired;

        /**
         * Indicates whether a reboot is required to complete installation of updates.
         * @param isRebootRequired the value to set
         * @return this builder
         **/
        public Builder isRebootRequired(Boolean isRebootRequired) {
            this.isRebootRequired = isRebootRequired;
            this.__explicitlySet__.add("isRebootRequired");
            return this;
        }
        /**
         * OCID of the ONS topic used to send notification to users
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("notificationTopicId")
        private String notificationTopicId;

        /**
         * OCID of the ONS topic used to send notification to users
         * @param notificationTopicId the value to set
         * @return this builder
         **/
        public Builder notificationTopicId(String notificationTopicId) {
            this.notificationTopicId = notificationTopicId;
            this.__explicitlySet__.add("notificationTopicId");
            return this;
        }
        /**
         * The ksplice effective kernel version
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kspliceEffectiveKernelVersion")
        private String kspliceEffectiveKernelVersion;

        /**
         * The ksplice effective kernel version
         * @param kspliceEffectiveKernelVersion the value to set
         * @return this builder
         **/
        public Builder kspliceEffectiveKernelVersion(String kspliceEffectiveKernelVersion) {
            this.kspliceEffectiveKernelVersion = kspliceEffectiveKernelVersion;
            this.__explicitlySet__.add("kspliceEffectiveKernelVersion");
            return this;
        }
        /**
         * True if user allow data collection for this instance
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDataCollectionAuthorized")
        private Boolean isDataCollectionAuthorized;

        /**
         * True if user allow data collection for this instance
         * @param isDataCollectionAuthorized the value to set
         * @return this builder
         **/
        public Builder isDataCollectionAuthorized(Boolean isDataCollectionAuthorized) {
            this.isDataCollectionAuthorized = isDataCollectionAuthorized;
            this.__explicitlySet__.add("isDataCollectionAuthorized");
            return this;
        }
        /**
         * if present, indicates the Managed Instance is an autonomous instance. Holds all the Autonomous specific information
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("autonomous")
        private AutonomousSettings autonomous;

        /**
         * if present, indicates the Managed Instance is an autonomous instance. Holds all the Autonomous specific information
         * @param autonomous the value to set
         * @return this builder
         **/
        public Builder autonomous(AutonomousSettings autonomous) {
            this.autonomous = autonomous;
            this.__explicitlySet__.add("autonomous");
            return this;
        }
        /**
         * Number of security type updates available to be installed
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("securityUpdatesAvailable")
        private Integer securityUpdatesAvailable;

        /**
         * Number of security type updates available to be installed
         * @param securityUpdatesAvailable the value to set
         * @return this builder
         **/
        public Builder securityUpdatesAvailable(Integer securityUpdatesAvailable) {
            this.securityUpdatesAvailable = securityUpdatesAvailable;
            this.__explicitlySet__.add("securityUpdatesAvailable");
            return this;
        }
        /**
         * Number of bug fix type updates available to be installed
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bugUpdatesAvailable")
        private Integer bugUpdatesAvailable;

        /**
         * Number of bug fix type updates available to be installed
         * @param bugUpdatesAvailable the value to set
         * @return this builder
         **/
        public Builder bugUpdatesAvailable(Integer bugUpdatesAvailable) {
            this.bugUpdatesAvailable = bugUpdatesAvailable;
            this.__explicitlySet__.add("bugUpdatesAvailable");
            return this;
        }
        /**
         * Number of enhancement type updates available to be installed
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enhancementUpdatesAvailable")
        private Integer enhancementUpdatesAvailable;

        /**
         * Number of enhancement type updates available to be installed
         * @param enhancementUpdatesAvailable the value to set
         * @return this builder
         **/
        public Builder enhancementUpdatesAvailable(Integer enhancementUpdatesAvailable) {
            this.enhancementUpdatesAvailable = enhancementUpdatesAvailable;
            this.__explicitlySet__.add("enhancementUpdatesAvailable");
            return this;
        }
        /**
         * Number of non-classified updates available to be installed
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("otherUpdatesAvailable")
        private Integer otherUpdatesAvailable;

        /**
         * Number of non-classified updates available to be installed
         * @param otherUpdatesAvailable the value to set
         * @return this builder
         **/
        public Builder otherUpdatesAvailable(Integer otherUpdatesAvailable) {
            this.otherUpdatesAvailable = otherUpdatesAvailable;
            this.__explicitlySet__.add("otherUpdatesAvailable");
            return this;
        }
        /**
         * Number of scheduled jobs associated with this instance
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledJobCount")
        private Integer scheduledJobCount;

        /**
         * Number of scheduled jobs associated with this instance
         * @param scheduledJobCount the value to set
         * @return this builder
         **/
        public Builder scheduledJobCount(Integer scheduledJobCount) {
            this.scheduledJobCount = scheduledJobCount;
            this.__explicitlySet__.add("scheduledJobCount");
            return this;
        }
        /**
         * Number of work requests associated with this instance
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("workRequestCount")
        private Integer workRequestCount;

        /**
         * Number of work requests associated with this instance
         * @param workRequestCount the value to set
         * @return this builder
         **/
        public Builder workRequestCount(Integer workRequestCount) {
            this.workRequestCount = workRequestCount;
            this.__explicitlySet__.add("workRequestCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedInstance build() {
            ManagedInstance model =
                    new ManagedInstance(
                            this.displayName,
                            this.id,
                            this.description,
                            this.lastCheckin,
                            this.lastBoot,
                            this.updatesAvailable,
                            this.osName,
                            this.osVersion,
                            this.osKernelVersion,
                            this.compartmentId,
                            this.status,
                            this.parentSoftwareSource,
                            this.childSoftwareSources,
                            this.managedInstanceGroups,
                            this.osFamily,
                            this.isRebootRequired,
                            this.notificationTopicId,
                            this.kspliceEffectiveKernelVersion,
                            this.isDataCollectionAuthorized,
                            this.autonomous,
                            this.securityUpdatesAvailable,
                            this.bugUpdatesAvailable,
                            this.enhancementUpdatesAvailable,
                            this.otherUpdatesAvailable,
                            this.scheduledJobCount,
                            this.workRequestCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedInstance model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("lastCheckin")) {
                this.lastCheckin(model.getLastCheckin());
            }
            if (model.wasPropertyExplicitlySet("lastBoot")) {
                this.lastBoot(model.getLastBoot());
            }
            if (model.wasPropertyExplicitlySet("updatesAvailable")) {
                this.updatesAvailable(model.getUpdatesAvailable());
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
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("parentSoftwareSource")) {
                this.parentSoftwareSource(model.getParentSoftwareSource());
            }
            if (model.wasPropertyExplicitlySet("childSoftwareSources")) {
                this.childSoftwareSources(model.getChildSoftwareSources());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceGroups")) {
                this.managedInstanceGroups(model.getManagedInstanceGroups());
            }
            if (model.wasPropertyExplicitlySet("osFamily")) {
                this.osFamily(model.getOsFamily());
            }
            if (model.wasPropertyExplicitlySet("isRebootRequired")) {
                this.isRebootRequired(model.getIsRebootRequired());
            }
            if (model.wasPropertyExplicitlySet("notificationTopicId")) {
                this.notificationTopicId(model.getNotificationTopicId());
            }
            if (model.wasPropertyExplicitlySet("kspliceEffectiveKernelVersion")) {
                this.kspliceEffectiveKernelVersion(model.getKspliceEffectiveKernelVersion());
            }
            if (model.wasPropertyExplicitlySet("isDataCollectionAuthorized")) {
                this.isDataCollectionAuthorized(model.getIsDataCollectionAuthorized());
            }
            if (model.wasPropertyExplicitlySet("autonomous")) {
                this.autonomous(model.getAutonomous());
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

    /**
     * Managed Instance identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Managed Instance identifier
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * OCID for the managed instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID for the managed instance
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Information specified by the user about the managed instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Information specified by the user about the managed instance
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Time at which the instance last checked in
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastCheckin")
    private final String lastCheckin;

    /**
     * Time at which the instance last checked in
     * @return the value
     **/
    public String getLastCheckin() {
        return lastCheckin;
    }

    /**
     * Time at which the instance last booted
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastBoot")
    private final String lastBoot;

    /**
     * Time at which the instance last booted
     * @return the value
     **/
    public String getLastBoot() {
        return lastBoot;
    }

    /**
     * Number of updates available to be installed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatesAvailable")
    private final Integer updatesAvailable;

    /**
     * Number of updates available to be installed
     * @return the value
     **/
    public Integer getUpdatesAvailable() {
        return updatesAvailable;
    }

    /**
     * Operating System Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osName")
    private final String osName;

    /**
     * Operating System Name
     * @return the value
     **/
    public String getOsName() {
        return osName;
    }

    /**
     * Operating System Version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osVersion")
    private final String osVersion;

    /**
     * Operating System Version
     * @return the value
     **/
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * Operating System Kernel Version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osKernelVersion")
    private final String osKernelVersion;

    /**
     * Operating System Kernel Version
     * @return the value
     **/
    public String getOsKernelVersion() {
        return osKernelVersion;
    }

    /**
     * OCID for the Compartment
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID for the Compartment
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * status of the managed instance.
     **/
    public enum Status {
        Normal("NORMAL"),
        Unreachable("UNREACHABLE"),
        Error("ERROR"),
        Warning("WARNING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * status of the managed instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * status of the managed instance.
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * the parent (base) Software Source attached to the Managed Instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentSoftwareSource")
    private final SoftwareSourceId parentSoftwareSource;

    /**
     * the parent (base) Software Source attached to the Managed Instance
     * @return the value
     **/
    public SoftwareSourceId getParentSoftwareSource() {
        return parentSoftwareSource;
    }

    /**
     * list of child Software Sources attached to the Managed Instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("childSoftwareSources")
    private final java.util.List<SoftwareSourceId> childSoftwareSources;

    /**
     * list of child Software Sources attached to the Managed Instance
     * @return the value
     **/
    public java.util.List<SoftwareSourceId> getChildSoftwareSources() {
        return childSoftwareSources;
    }

    /**
     * The ids of the managed instance groups of which this instance is a
     * member.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceGroups")
    private final java.util.List<Id> managedInstanceGroups;

    /**
     * The ids of the managed instance groups of which this instance is a
     * member.
     *
     * @return the value
     **/
    public java.util.List<Id> getManagedInstanceGroups() {
        return managedInstanceGroups;
    }

    /**
     * The Operating System type of the managed instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
    private final OsFamilies osFamily;

    /**
     * The Operating System type of the managed instance.
     * @return the value
     **/
    public OsFamilies getOsFamily() {
        return osFamily;
    }

    /**
     * Indicates whether a reboot is required to complete installation of updates.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRebootRequired")
    private final Boolean isRebootRequired;

    /**
     * Indicates whether a reboot is required to complete installation of updates.
     * @return the value
     **/
    public Boolean getIsRebootRequired() {
        return isRebootRequired;
    }

    /**
     * OCID of the ONS topic used to send notification to users
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("notificationTopicId")
    private final String notificationTopicId;

    /**
     * OCID of the ONS topic used to send notification to users
     * @return the value
     **/
    public String getNotificationTopicId() {
        return notificationTopicId;
    }

    /**
     * The ksplice effective kernel version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kspliceEffectiveKernelVersion")
    private final String kspliceEffectiveKernelVersion;

    /**
     * The ksplice effective kernel version
     * @return the value
     **/
    public String getKspliceEffectiveKernelVersion() {
        return kspliceEffectiveKernelVersion;
    }

    /**
     * True if user allow data collection for this instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDataCollectionAuthorized")
    private final Boolean isDataCollectionAuthorized;

    /**
     * True if user allow data collection for this instance
     * @return the value
     **/
    public Boolean getIsDataCollectionAuthorized() {
        return isDataCollectionAuthorized;
    }

    /**
     * if present, indicates the Managed Instance is an autonomous instance. Holds all the Autonomous specific information
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autonomous")
    private final AutonomousSettings autonomous;

    /**
     * if present, indicates the Managed Instance is an autonomous instance. Holds all the Autonomous specific information
     * @return the value
     **/
    public AutonomousSettings getAutonomous() {
        return autonomous;
    }

    /**
     * Number of security type updates available to be installed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityUpdatesAvailable")
    private final Integer securityUpdatesAvailable;

    /**
     * Number of security type updates available to be installed
     * @return the value
     **/
    public Integer getSecurityUpdatesAvailable() {
        return securityUpdatesAvailable;
    }

    /**
     * Number of bug fix type updates available to be installed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bugUpdatesAvailable")
    private final Integer bugUpdatesAvailable;

    /**
     * Number of bug fix type updates available to be installed
     * @return the value
     **/
    public Integer getBugUpdatesAvailable() {
        return bugUpdatesAvailable;
    }

    /**
     * Number of enhancement type updates available to be installed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enhancementUpdatesAvailable")
    private final Integer enhancementUpdatesAvailable;

    /**
     * Number of enhancement type updates available to be installed
     * @return the value
     **/
    public Integer getEnhancementUpdatesAvailable() {
        return enhancementUpdatesAvailable;
    }

    /**
     * Number of non-classified updates available to be installed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("otherUpdatesAvailable")
    private final Integer otherUpdatesAvailable;

    /**
     * Number of non-classified updates available to be installed
     * @return the value
     **/
    public Integer getOtherUpdatesAvailable() {
        return otherUpdatesAvailable;
    }

    /**
     * Number of scheduled jobs associated with this instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledJobCount")
    private final Integer scheduledJobCount;

    /**
     * Number of scheduled jobs associated with this instance
     * @return the value
     **/
    public Integer getScheduledJobCount() {
        return scheduledJobCount;
    }

    /**
     * Number of work requests associated with this instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workRequestCount")
    private final Integer workRequestCount;

    /**
     * Number of work requests associated with this instance
     * @return the value
     **/
    public Integer getWorkRequestCount() {
        return workRequestCount;
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
        sb.append("ManagedInstance(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", lastCheckin=").append(String.valueOf(this.lastCheckin));
        sb.append(", lastBoot=").append(String.valueOf(this.lastBoot));
        sb.append(", updatesAvailable=").append(String.valueOf(this.updatesAvailable));
        sb.append(", osName=").append(String.valueOf(this.osName));
        sb.append(", osVersion=").append(String.valueOf(this.osVersion));
        sb.append(", osKernelVersion=").append(String.valueOf(this.osKernelVersion));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", parentSoftwareSource=").append(String.valueOf(this.parentSoftwareSource));
        sb.append(", childSoftwareSources=").append(String.valueOf(this.childSoftwareSources));
        sb.append(", managedInstanceGroups=").append(String.valueOf(this.managedInstanceGroups));
        sb.append(", osFamily=").append(String.valueOf(this.osFamily));
        sb.append(", isRebootRequired=").append(String.valueOf(this.isRebootRequired));
        sb.append(", notificationTopicId=").append(String.valueOf(this.notificationTopicId));
        sb.append(", kspliceEffectiveKernelVersion=")
                .append(String.valueOf(this.kspliceEffectiveKernelVersion));
        sb.append(", isDataCollectionAuthorized=")
                .append(String.valueOf(this.isDataCollectionAuthorized));
        sb.append(", autonomous=").append(String.valueOf(this.autonomous));
        sb.append(", securityUpdatesAvailable=")
                .append(String.valueOf(this.securityUpdatesAvailable));
        sb.append(", bugUpdatesAvailable=").append(String.valueOf(this.bugUpdatesAvailable));
        sb.append(", enhancementUpdatesAvailable=")
                .append(String.valueOf(this.enhancementUpdatesAvailable));
        sb.append(", otherUpdatesAvailable=").append(String.valueOf(this.otherUpdatesAvailable));
        sb.append(", scheduledJobCount=").append(String.valueOf(this.scheduledJobCount));
        sb.append(", workRequestCount=").append(String.valueOf(this.workRequestCount));
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
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.lastCheckin, other.lastCheckin)
                && java.util.Objects.equals(this.lastBoot, other.lastBoot)
                && java.util.Objects.equals(this.updatesAvailable, other.updatesAvailable)
                && java.util.Objects.equals(this.osName, other.osName)
                && java.util.Objects.equals(this.osVersion, other.osVersion)
                && java.util.Objects.equals(this.osKernelVersion, other.osKernelVersion)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.parentSoftwareSource, other.parentSoftwareSource)
                && java.util.Objects.equals(this.childSoftwareSources, other.childSoftwareSources)
                && java.util.Objects.equals(this.managedInstanceGroups, other.managedInstanceGroups)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.isRebootRequired, other.isRebootRequired)
                && java.util.Objects.equals(this.notificationTopicId, other.notificationTopicId)
                && java.util.Objects.equals(
                        this.kspliceEffectiveKernelVersion, other.kspliceEffectiveKernelVersion)
                && java.util.Objects.equals(
                        this.isDataCollectionAuthorized, other.isDataCollectionAuthorized)
                && java.util.Objects.equals(this.autonomous, other.autonomous)
                && java.util.Objects.equals(
                        this.securityUpdatesAvailable, other.securityUpdatesAvailable)
                && java.util.Objects.equals(this.bugUpdatesAvailable, other.bugUpdatesAvailable)
                && java.util.Objects.equals(
                        this.enhancementUpdatesAvailable, other.enhancementUpdatesAvailable)
                && java.util.Objects.equals(this.otherUpdatesAvailable, other.otherUpdatesAvailable)
                && java.util.Objects.equals(this.scheduledJobCount, other.scheduledJobCount)
                && java.util.Objects.equals(this.workRequestCount, other.workRequestCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.lastCheckin == null ? 43 : this.lastCheckin.hashCode());
        result = (result * PRIME) + (this.lastBoot == null ? 43 : this.lastBoot.hashCode());
        result =
                (result * PRIME)
                        + (this.updatesAvailable == null ? 43 : this.updatesAvailable.hashCode());
        result = (result * PRIME) + (this.osName == null ? 43 : this.osName.hashCode());
        result = (result * PRIME) + (this.osVersion == null ? 43 : this.osVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.osKernelVersion == null ? 43 : this.osKernelVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.parentSoftwareSource == null
                                ? 43
                                : this.parentSoftwareSource.hashCode());
        result =
                (result * PRIME)
                        + (this.childSoftwareSources == null
                                ? 43
                                : this.childSoftwareSources.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceGroups == null
                                ? 43
                                : this.managedInstanceGroups.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result =
                (result * PRIME)
                        + (this.isRebootRequired == null ? 43 : this.isRebootRequired.hashCode());
        result =
                (result * PRIME)
                        + (this.notificationTopicId == null
                                ? 43
                                : this.notificationTopicId.hashCode());
        result =
                (result * PRIME)
                        + (this.kspliceEffectiveKernelVersion == null
                                ? 43
                                : this.kspliceEffectiveKernelVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.isDataCollectionAuthorized == null
                                ? 43
                                : this.isDataCollectionAuthorized.hashCode());
        result = (result * PRIME) + (this.autonomous == null ? 43 : this.autonomous.hashCode());
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
