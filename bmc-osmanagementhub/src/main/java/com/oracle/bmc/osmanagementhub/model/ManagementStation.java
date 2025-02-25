/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides information about the management station, including name, state, and configuration. <br>
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
        builder = ManagementStation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagementStation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "managedInstanceId",
        "compartmentId",
        "scheduledJobId",
        "profileId",
        "displayName",
        "description",
        "hostname",
        "overallState",
        "overallPercentage",
        "mirrorCapacity",
        "totalMirrors",
        "mirrorSyncStatus",
        "proxy",
        "mirror",
        "health",
        "lifecycleState",
        "isAutoConfigEnabled",
        "peerManagementStations",
        "location",
        "mirrorStorageAvailableSize",
        "mirrorStorageSize",
        "mirrorSize",
        "mirrorUniquePackageCount",
        "mirrorPackageCount",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public ManagementStation(
            String id,
            String managedInstanceId,
            String compartmentId,
            String scheduledJobId,
            String profileId,
            String displayName,
            String description,
            String hostname,
            OverallState overallState,
            Integer overallPercentage,
            Integer mirrorCapacity,
            Integer totalMirrors,
            MirrorSyncStatus mirrorSyncStatus,
            ProxyConfiguration proxy,
            MirrorConfiguration mirror,
            StationHealth health,
            LifecycleState lifecycleState,
            Boolean isAutoConfigEnabled,
            java.util.List<PeerManagementStation> peerManagementStations,
            ManagedInstanceLocation location,
            Long mirrorStorageAvailableSize,
            Long mirrorStorageSize,
            Long mirrorSize,
            Integer mirrorUniquePackageCount,
            Integer mirrorPackageCount,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.managedInstanceId = managedInstanceId;
        this.compartmentId = compartmentId;
        this.scheduledJobId = scheduledJobId;
        this.profileId = profileId;
        this.displayName = displayName;
        this.description = description;
        this.hostname = hostname;
        this.overallState = overallState;
        this.overallPercentage = overallPercentage;
        this.mirrorCapacity = mirrorCapacity;
        this.totalMirrors = totalMirrors;
        this.mirrorSyncStatus = mirrorSyncStatus;
        this.proxy = proxy;
        this.mirror = mirror;
        this.health = health;
        this.lifecycleState = lifecycleState;
        this.isAutoConfigEnabled = isAutoConfigEnabled;
        this.peerManagementStations = peerManagementStations;
        this.location = location;
        this.mirrorStorageAvailableSize = mirrorStorageAvailableSize;
        this.mirrorStorageSize = mirrorStorageSize;
        this.mirrorSize = mirrorSize;
        this.mirrorUniquePackageCount = mirrorUniquePackageCount;
        this.mirrorPackageCount = mirrorPackageCount;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the management station.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the management station.
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
         * of the instance that is acting as the management station.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
        private String managedInstanceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the instance that is acting as the management station.
         *
         * @param managedInstanceId the value to set
         * @return this builder
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            this.__explicitlySet__.add("managedInstanceId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment that contains the management station.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment that contains the management station.
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
         * of the scheduled job for the mirror sync.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledJobId")
        private String scheduledJobId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the scheduled job for the mirror sync.
         *
         * @param scheduledJobId the value to set
         * @return this builder
         */
        public Builder scheduledJobId(String scheduledJobId) {
            this.scheduledJobId = scheduledJobId;
            this.__explicitlySet__.add("scheduledJobId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the registration profile used for the management station.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("profileId")
        private String profileId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the registration profile used for the management station.
         *
         * @param profileId the value to set
         * @return this builder
         */
        public Builder profileId(String profileId) {
            this.profileId = profileId;
            this.__explicitlySet__.add("profileId");
            return this;
        }
        /** A user-friendly name for the management station. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the management station.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** User-specified description for the management station. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * User-specified description for the management station.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Hostname of the management station. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * Hostname of the management station.
         *
         * @param hostname the value to set
         * @return this builder
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }
        /** Current state of the mirror sync for the management station. */
        @com.fasterxml.jackson.annotation.JsonProperty("overallState")
        private OverallState overallState;

        /**
         * Current state of the mirror sync for the management station.
         *
         * @param overallState the value to set
         * @return this builder
         */
        public Builder overallState(OverallState overallState) {
            this.overallState = overallState;
            this.__explicitlySet__.add("overallState");
            return this;
        }
        /** A decimal number representing the progress of the current mirror sync. */
        @com.fasterxml.jackson.annotation.JsonProperty("overallPercentage")
        private Integer overallPercentage;

        /**
         * A decimal number representing the progress of the current mirror sync.
         *
         * @param overallPercentage the value to set
         * @return this builder
         */
        public Builder overallPercentage(Integer overallPercentage) {
            this.overallPercentage = overallPercentage;
            this.__explicitlySet__.add("overallPercentage");
            return this;
        }
        /** A decimal number representing the amount of mirror capacity used by the sync. */
        @com.fasterxml.jackson.annotation.JsonProperty("mirrorCapacity")
        private Integer mirrorCapacity;

        /**
         * A decimal number representing the amount of mirror capacity used by the sync.
         *
         * @param mirrorCapacity the value to set
         * @return this builder
         */
        public Builder mirrorCapacity(Integer mirrorCapacity) {
            this.mirrorCapacity = mirrorCapacity;
            this.__explicitlySet__.add("mirrorCapacity");
            return this;
        }
        /** The number of software sources that the station is mirroring. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalMirrors")
        private Integer totalMirrors;

        /**
         * The number of software sources that the station is mirroring.
         *
         * @param totalMirrors the value to set
         * @return this builder
         */
        public Builder totalMirrors(Integer totalMirrors) {
            this.totalMirrors = totalMirrors;
            this.__explicitlySet__.add("totalMirrors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mirrorSyncStatus")
        private MirrorSyncStatus mirrorSyncStatus;

        public Builder mirrorSyncStatus(MirrorSyncStatus mirrorSyncStatus) {
            this.mirrorSyncStatus = mirrorSyncStatus;
            this.__explicitlySet__.add("mirrorSyncStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("proxy")
        private ProxyConfiguration proxy;

        public Builder proxy(ProxyConfiguration proxy) {
            this.proxy = proxy;
            this.__explicitlySet__.add("proxy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mirror")
        private MirrorConfiguration mirror;

        public Builder mirror(MirrorConfiguration mirror) {
            this.mirror = mirror;
            this.__explicitlySet__.add("mirror");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("health")
        private StationHealth health;

        public Builder health(StationHealth health) {
            this.health = health;
            this.__explicitlySet__.add("health");
            return this;
        }
        /** The current state of the management station. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the management station.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * When enabled, the station setup script automatically runs to configure the firewall and
         * SELinux settings on the station.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoConfigEnabled")
        private Boolean isAutoConfigEnabled;

        /**
         * When enabled, the station setup script automatically runs to configure the firewall and
         * SELinux settings on the station.
         *
         * @param isAutoConfigEnabled the value to set
         * @return this builder
         */
        public Builder isAutoConfigEnabled(Boolean isAutoConfigEnabled) {
            this.isAutoConfigEnabled = isAutoConfigEnabled;
            this.__explicitlySet__.add("isAutoConfigEnabled");
            return this;
        }
        /**
         * A list of other management stations that are behind the same load balancer within a high
         * availability configuration. Stations are identified as peers if they have the same
         * hostname and compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerManagementStations")
        private java.util.List<PeerManagementStation> peerManagementStations;

        /**
         * A list of other management stations that are behind the same load balancer within a high
         * availability configuration. Stations are identified as peers if they have the same
         * hostname and compartment.
         *
         * @param peerManagementStations the value to set
         * @return this builder
         */
        public Builder peerManagementStations(
                java.util.List<PeerManagementStation> peerManagementStations) {
            this.peerManagementStations = peerManagementStations;
            this.__explicitlySet__.add("peerManagementStations");
            return this;
        }
        /** The location of the instance that is acting as the management station. */
        @com.fasterxml.jackson.annotation.JsonProperty("location")
        private ManagedInstanceLocation location;

        /**
         * The location of the instance that is acting as the management station.
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(ManagedInstanceLocation location) {
            this.location = location;
            this.__explicitlySet__.add("location");
            return this;
        }
        /** Amount of available mirror storage in bytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("mirrorStorageAvailableSize")
        private Long mirrorStorageAvailableSize;

        /**
         * Amount of available mirror storage in bytes.
         *
         * @param mirrorStorageAvailableSize the value to set
         * @return this builder
         */
        public Builder mirrorStorageAvailableSize(Long mirrorStorageAvailableSize) {
            this.mirrorStorageAvailableSize = mirrorStorageAvailableSize;
            this.__explicitlySet__.add("mirrorStorageAvailableSize");
            return this;
        }
        /** Total mirror storage size in bytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("mirrorStorageSize")
        private Long mirrorStorageSize;

        /**
         * Total mirror storage size in bytes.
         *
         * @param mirrorStorageSize the value to set
         * @return this builder
         */
        public Builder mirrorStorageSize(Long mirrorStorageSize) {
            this.mirrorStorageSize = mirrorStorageSize;
            this.__explicitlySet__.add("mirrorStorageSize");
            return this;
        }
        /** The total size of all software source mirrors in bytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("mirrorSize")
        private Long mirrorSize;

        /**
         * The total size of all software source mirrors in bytes.
         *
         * @param mirrorSize the value to set
         * @return this builder
         */
        public Builder mirrorSize(Long mirrorSize) {
            this.mirrorSize = mirrorSize;
            this.__explicitlySet__.add("mirrorSize");
            return this;
        }
        /**
         * The total number of unique packages within the mirrored software sources on the station.
         * Each package is counted only once, regardless of how many versions it has.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mirrorUniquePackageCount")
        private Integer mirrorUniquePackageCount;

        /**
         * The total number of unique packages within the mirrored software sources on the station.
         * Each package is counted only once, regardless of how many versions it has.
         *
         * @param mirrorUniquePackageCount the value to set
         * @return this builder
         */
        public Builder mirrorUniquePackageCount(Integer mirrorUniquePackageCount) {
            this.mirrorUniquePackageCount = mirrorUniquePackageCount;
            this.__explicitlySet__.add("mirrorUniquePackageCount");
            return this;
        }
        /** The total number of all packages within the mirrored software sources. */
        @com.fasterxml.jackson.annotation.JsonProperty("mirrorPackageCount")
        private Integer mirrorPackageCount;

        /**
         * The total number of all packages within the mirrored software sources.
         *
         * @param mirrorPackageCount the value to set
         * @return this builder
         */
        public Builder mirrorPackageCount(Integer mirrorPackageCount) {
            this.mirrorPackageCount = mirrorPackageCount;
            this.__explicitlySet__.add("mirrorPackageCount");
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

        public ManagementStation build() {
            ManagementStation model =
                    new ManagementStation(
                            this.id,
                            this.managedInstanceId,
                            this.compartmentId,
                            this.scheduledJobId,
                            this.profileId,
                            this.displayName,
                            this.description,
                            this.hostname,
                            this.overallState,
                            this.overallPercentage,
                            this.mirrorCapacity,
                            this.totalMirrors,
                            this.mirrorSyncStatus,
                            this.proxy,
                            this.mirror,
                            this.health,
                            this.lifecycleState,
                            this.isAutoConfigEnabled,
                            this.peerManagementStations,
                            this.location,
                            this.mirrorStorageAvailableSize,
                            this.mirrorStorageSize,
                            this.mirrorSize,
                            this.mirrorUniquePackageCount,
                            this.mirrorPackageCount,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagementStation model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceId")) {
                this.managedInstanceId(model.getManagedInstanceId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("scheduledJobId")) {
                this.scheduledJobId(model.getScheduledJobId());
            }
            if (model.wasPropertyExplicitlySet("profileId")) {
                this.profileId(model.getProfileId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("hostname")) {
                this.hostname(model.getHostname());
            }
            if (model.wasPropertyExplicitlySet("overallState")) {
                this.overallState(model.getOverallState());
            }
            if (model.wasPropertyExplicitlySet("overallPercentage")) {
                this.overallPercentage(model.getOverallPercentage());
            }
            if (model.wasPropertyExplicitlySet("mirrorCapacity")) {
                this.mirrorCapacity(model.getMirrorCapacity());
            }
            if (model.wasPropertyExplicitlySet("totalMirrors")) {
                this.totalMirrors(model.getTotalMirrors());
            }
            if (model.wasPropertyExplicitlySet("mirrorSyncStatus")) {
                this.mirrorSyncStatus(model.getMirrorSyncStatus());
            }
            if (model.wasPropertyExplicitlySet("proxy")) {
                this.proxy(model.getProxy());
            }
            if (model.wasPropertyExplicitlySet("mirror")) {
                this.mirror(model.getMirror());
            }
            if (model.wasPropertyExplicitlySet("health")) {
                this.health(model.getHealth());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("isAutoConfigEnabled")) {
                this.isAutoConfigEnabled(model.getIsAutoConfigEnabled());
            }
            if (model.wasPropertyExplicitlySet("peerManagementStations")) {
                this.peerManagementStations(model.getPeerManagementStations());
            }
            if (model.wasPropertyExplicitlySet("location")) {
                this.location(model.getLocation());
            }
            if (model.wasPropertyExplicitlySet("mirrorStorageAvailableSize")) {
                this.mirrorStorageAvailableSize(model.getMirrorStorageAvailableSize());
            }
            if (model.wasPropertyExplicitlySet("mirrorStorageSize")) {
                this.mirrorStorageSize(model.getMirrorStorageSize());
            }
            if (model.wasPropertyExplicitlySet("mirrorSize")) {
                this.mirrorSize(model.getMirrorSize());
            }
            if (model.wasPropertyExplicitlySet("mirrorUniquePackageCount")) {
                this.mirrorUniquePackageCount(model.getMirrorUniquePackageCount());
            }
            if (model.wasPropertyExplicitlySet("mirrorPackageCount")) {
                this.mirrorPackageCount(model.getMirrorPackageCount());
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
     * the management station.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the management station.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the instance that is acting as the management station.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
    private final String managedInstanceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the instance that is acting as the management station.
     *
     * @return the value
     */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment that contains the management station.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment that contains the management station.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the scheduled job for the mirror sync.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledJobId")
    private final String scheduledJobId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the scheduled job for the mirror sync.
     *
     * @return the value
     */
    public String getScheduledJobId() {
        return scheduledJobId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the registration profile used for the management station.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("profileId")
    private final String profileId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the registration profile used for the management station.
     *
     * @return the value
     */
    public String getProfileId() {
        return profileId;
    }

    /** A user-friendly name for the management station. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the management station.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** User-specified description for the management station. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * User-specified description for the management station.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Hostname of the management station. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * Hostname of the management station.
     *
     * @return the value
     */
    public String getHostname() {
        return hostname;
    }

    /** Current state of the mirror sync for the management station. */
    @com.fasterxml.jackson.annotation.JsonProperty("overallState")
    private final OverallState overallState;

    /**
     * Current state of the mirror sync for the management station.
     *
     * @return the value
     */
    public OverallState getOverallState() {
        return overallState;
    }

    /** A decimal number representing the progress of the current mirror sync. */
    @com.fasterxml.jackson.annotation.JsonProperty("overallPercentage")
    private final Integer overallPercentage;

    /**
     * A decimal number representing the progress of the current mirror sync.
     *
     * @return the value
     */
    public Integer getOverallPercentage() {
        return overallPercentage;
    }

    /** A decimal number representing the amount of mirror capacity used by the sync. */
    @com.fasterxml.jackson.annotation.JsonProperty("mirrorCapacity")
    private final Integer mirrorCapacity;

    /**
     * A decimal number representing the amount of mirror capacity used by the sync.
     *
     * @return the value
     */
    public Integer getMirrorCapacity() {
        return mirrorCapacity;
    }

    /** The number of software sources that the station is mirroring. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalMirrors")
    private final Integer totalMirrors;

    /**
     * The number of software sources that the station is mirroring.
     *
     * @return the value
     */
    public Integer getTotalMirrors() {
        return totalMirrors;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("mirrorSyncStatus")
    private final MirrorSyncStatus mirrorSyncStatus;

    public MirrorSyncStatus getMirrorSyncStatus() {
        return mirrorSyncStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("proxy")
    private final ProxyConfiguration proxy;

    public ProxyConfiguration getProxy() {
        return proxy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("mirror")
    private final MirrorConfiguration mirror;

    public MirrorConfiguration getMirror() {
        return mirror;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("health")
    private final StationHealth health;

    public StationHealth getHealth() {
        return health;
    }

    /** The current state of the management station. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the management station. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the management station.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * When enabled, the station setup script automatically runs to configure the firewall and
     * SELinux settings on the station.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoConfigEnabled")
    private final Boolean isAutoConfigEnabled;

    /**
     * When enabled, the station setup script automatically runs to configure the firewall and
     * SELinux settings on the station.
     *
     * @return the value
     */
    public Boolean getIsAutoConfigEnabled() {
        return isAutoConfigEnabled;
    }

    /**
     * A list of other management stations that are behind the same load balancer within a high
     * availability configuration. Stations are identified as peers if they have the same hostname
     * and compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerManagementStations")
    private final java.util.List<PeerManagementStation> peerManagementStations;

    /**
     * A list of other management stations that are behind the same load balancer within a high
     * availability configuration. Stations are identified as peers if they have the same hostname
     * and compartment.
     *
     * @return the value
     */
    public java.util.List<PeerManagementStation> getPeerManagementStations() {
        return peerManagementStations;
    }

    /** The location of the instance that is acting as the management station. */
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    private final ManagedInstanceLocation location;

    /**
     * The location of the instance that is acting as the management station.
     *
     * @return the value
     */
    public ManagedInstanceLocation getLocation() {
        return location;
    }

    /** Amount of available mirror storage in bytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("mirrorStorageAvailableSize")
    private final Long mirrorStorageAvailableSize;

    /**
     * Amount of available mirror storage in bytes.
     *
     * @return the value
     */
    public Long getMirrorStorageAvailableSize() {
        return mirrorStorageAvailableSize;
    }

    /** Total mirror storage size in bytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("mirrorStorageSize")
    private final Long mirrorStorageSize;

    /**
     * Total mirror storage size in bytes.
     *
     * @return the value
     */
    public Long getMirrorStorageSize() {
        return mirrorStorageSize;
    }

    /** The total size of all software source mirrors in bytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("mirrorSize")
    private final Long mirrorSize;

    /**
     * The total size of all software source mirrors in bytes.
     *
     * @return the value
     */
    public Long getMirrorSize() {
        return mirrorSize;
    }

    /**
     * The total number of unique packages within the mirrored software sources on the station. Each
     * package is counted only once, regardless of how many versions it has.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mirrorUniquePackageCount")
    private final Integer mirrorUniquePackageCount;

    /**
     * The total number of unique packages within the mirrored software sources on the station. Each
     * package is counted only once, regardless of how many versions it has.
     *
     * @return the value
     */
    public Integer getMirrorUniquePackageCount() {
        return mirrorUniquePackageCount;
    }

    /** The total number of all packages within the mirrored software sources. */
    @com.fasterxml.jackson.annotation.JsonProperty("mirrorPackageCount")
    private final Integer mirrorPackageCount;

    /**
     * The total number of all packages within the mirrored software sources.
     *
     * @return the value
     */
    public Integer getMirrorPackageCount() {
        return mirrorPackageCount;
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
        sb.append("ManagementStation(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", scheduledJobId=").append(String.valueOf(this.scheduledJobId));
        sb.append(", profileId=").append(String.valueOf(this.profileId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
        sb.append(", overallState=").append(String.valueOf(this.overallState));
        sb.append(", overallPercentage=").append(String.valueOf(this.overallPercentage));
        sb.append(", mirrorCapacity=").append(String.valueOf(this.mirrorCapacity));
        sb.append(", totalMirrors=").append(String.valueOf(this.totalMirrors));
        sb.append(", mirrorSyncStatus=").append(String.valueOf(this.mirrorSyncStatus));
        sb.append(", proxy=").append(String.valueOf(this.proxy));
        sb.append(", mirror=").append(String.valueOf(this.mirror));
        sb.append(", health=").append(String.valueOf(this.health));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", isAutoConfigEnabled=").append(String.valueOf(this.isAutoConfigEnabled));
        sb.append(", peerManagementStations=").append(String.valueOf(this.peerManagementStations));
        sb.append(", location=").append(String.valueOf(this.location));
        sb.append(", mirrorStorageAvailableSize=")
                .append(String.valueOf(this.mirrorStorageAvailableSize));
        sb.append(", mirrorStorageSize=").append(String.valueOf(this.mirrorStorageSize));
        sb.append(", mirrorSize=").append(String.valueOf(this.mirrorSize));
        sb.append(", mirrorUniquePackageCount=")
                .append(String.valueOf(this.mirrorUniquePackageCount));
        sb.append(", mirrorPackageCount=").append(String.valueOf(this.mirrorPackageCount));
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
        if (!(o instanceof ManagementStation)) {
            return false;
        }

        ManagementStation other = (ManagementStation) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.scheduledJobId, other.scheduledJobId)
                && java.util.Objects.equals(this.profileId, other.profileId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.overallState, other.overallState)
                && java.util.Objects.equals(this.overallPercentage, other.overallPercentage)
                && java.util.Objects.equals(this.mirrorCapacity, other.mirrorCapacity)
                && java.util.Objects.equals(this.totalMirrors, other.totalMirrors)
                && java.util.Objects.equals(this.mirrorSyncStatus, other.mirrorSyncStatus)
                && java.util.Objects.equals(this.proxy, other.proxy)
                && java.util.Objects.equals(this.mirror, other.mirror)
                && java.util.Objects.equals(this.health, other.health)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.isAutoConfigEnabled, other.isAutoConfigEnabled)
                && java.util.Objects.equals(
                        this.peerManagementStations, other.peerManagementStations)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(
                        this.mirrorStorageAvailableSize, other.mirrorStorageAvailableSize)
                && java.util.Objects.equals(this.mirrorStorageSize, other.mirrorStorageSize)
                && java.util.Objects.equals(this.mirrorSize, other.mirrorSize)
                && java.util.Objects.equals(
                        this.mirrorUniquePackageCount, other.mirrorUniquePackageCount)
                && java.util.Objects.equals(this.mirrorPackageCount, other.mirrorPackageCount)
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
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledJobId == null ? 43 : this.scheduledJobId.hashCode());
        result = (result * PRIME) + (this.profileId == null ? 43 : this.profileId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + (this.overallState == null ? 43 : this.overallState.hashCode());
        result =
                (result * PRIME)
                        + (this.overallPercentage == null ? 43 : this.overallPercentage.hashCode());
        result =
                (result * PRIME)
                        + (this.mirrorCapacity == null ? 43 : this.mirrorCapacity.hashCode());
        result = (result * PRIME) + (this.totalMirrors == null ? 43 : this.totalMirrors.hashCode());
        result =
                (result * PRIME)
                        + (this.mirrorSyncStatus == null ? 43 : this.mirrorSyncStatus.hashCode());
        result = (result * PRIME) + (this.proxy == null ? 43 : this.proxy.hashCode());
        result = (result * PRIME) + (this.mirror == null ? 43 : this.mirror.hashCode());
        result = (result * PRIME) + (this.health == null ? 43 : this.health.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoConfigEnabled == null
                                ? 43
                                : this.isAutoConfigEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.peerManagementStations == null
                                ? 43
                                : this.peerManagementStations.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.mirrorStorageAvailableSize == null
                                ? 43
                                : this.mirrorStorageAvailableSize.hashCode());
        result =
                (result * PRIME)
                        + (this.mirrorStorageSize == null ? 43 : this.mirrorStorageSize.hashCode());
        result = (result * PRIME) + (this.mirrorSize == null ? 43 : this.mirrorSize.hashCode());
        result =
                (result * PRIME)
                        + (this.mirrorUniquePackageCount == null
                                ? 43
                                : this.mirrorUniquePackageCount.hashCode());
        result =
                (result * PRIME)
                        + (this.mirrorPackageCount == null
                                ? 43
                                : this.mirrorPackageCount.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
