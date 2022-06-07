/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * The details of the Management Agent inventory including the associated plugins.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ManagementAgent.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ManagementAgent {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "installKeyId",
        "displayName",
        "platformType",
        "platformName",
        "platformVersion",
        "version",
        "resourceArtifactVersion",
        "host",
        "hostId",
        "installPath",
        "pluginList",
        "compartmentId",
        "isAgentAutoUpgradable",
        "timeCreated",
        "timeUpdated",
        "timeLastHeartbeat",
        "availabilityStatus",
        "lifecycleState",
        "lifecycleDetails",
        "isCustomerDeployed",
        "installType",
        "freeformTags",
        "definedTags"
    })
    public ManagementAgent(
            String id,
            String installKeyId,
            String displayName,
            PlatformTypes platformType,
            String platformName,
            String platformVersion,
            String version,
            String resourceArtifactVersion,
            String host,
            String hostId,
            String installPath,
            java.util.List<ManagementAgentPluginDetails> pluginList,
            String compartmentId,
            Boolean isAgentAutoUpgradable,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeLastHeartbeat,
            AvailabilityStatus availabilityStatus,
            LifecycleStates lifecycleState,
            String lifecycleDetails,
            Boolean isCustomerDeployed,
            InstallTypes installType,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.installKeyId = installKeyId;
        this.displayName = displayName;
        this.platformType = platformType;
        this.platformName = platformName;
        this.platformVersion = platformVersion;
        this.version = version;
        this.resourceArtifactVersion = resourceArtifactVersion;
        this.host = host;
        this.hostId = hostId;
        this.installPath = installPath;
        this.pluginList = pluginList;
        this.compartmentId = compartmentId;
        this.isAgentAutoUpgradable = isAgentAutoUpgradable;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeLastHeartbeat = timeLastHeartbeat;
        this.availabilityStatus = availabilityStatus;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.isCustomerDeployed = isCustomerDeployed;
        this.installType = installType;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("installKeyId")
        private String installKeyId;

        public Builder installKeyId(String installKeyId) {
            this.installKeyId = installKeyId;
            this.__explicitlySet__.add("installKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("platformType")
        private PlatformTypes platformType;

        public Builder platformType(PlatformTypes platformType) {
            this.platformType = platformType;
            this.__explicitlySet__.add("platformType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("platformName")
        private String platformName;

        public Builder platformName(String platformName) {
            this.platformName = platformName;
            this.__explicitlySet__.add("platformName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("platformVersion")
        private String platformVersion;

        public Builder platformVersion(String platformVersion) {
            this.platformVersion = platformVersion;
            this.__explicitlySet__.add("platformVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceArtifactVersion")
        private String resourceArtifactVersion;

        public Builder resourceArtifactVersion(String resourceArtifactVersion) {
            this.resourceArtifactVersion = resourceArtifactVersion;
            this.__explicitlySet__.add("resourceArtifactVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostId")
        private String hostId;

        public Builder hostId(String hostId) {
            this.hostId = hostId;
            this.__explicitlySet__.add("hostId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("installPath")
        private String installPath;

        public Builder installPath(String installPath) {
            this.installPath = installPath;
            this.__explicitlySet__.add("installPath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pluginList")
        private java.util.List<ManagementAgentPluginDetails> pluginList;

        public Builder pluginList(java.util.List<ManagementAgentPluginDetails> pluginList) {
            this.pluginList = pluginList;
            this.__explicitlySet__.add("pluginList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAgentAutoUpgradable")
        private Boolean isAgentAutoUpgradable;

        public Builder isAgentAutoUpgradable(Boolean isAgentAutoUpgradable) {
            this.isAgentAutoUpgradable = isAgentAutoUpgradable;
            this.__explicitlySet__.add("isAgentAutoUpgradable");
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastHeartbeat")
        private java.util.Date timeLastHeartbeat;

        public Builder timeLastHeartbeat(java.util.Date timeLastHeartbeat) {
            this.timeLastHeartbeat = timeLastHeartbeat;
            this.__explicitlySet__.add("timeLastHeartbeat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availabilityStatus")
        private AvailabilityStatus availabilityStatus;

        public Builder availabilityStatus(AvailabilityStatus availabilityStatus) {
            this.availabilityStatus = availabilityStatus;
            this.__explicitlySet__.add("availabilityStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isCustomerDeployed")
        private Boolean isCustomerDeployed;

        public Builder isCustomerDeployed(Boolean isCustomerDeployed) {
            this.isCustomerDeployed = isCustomerDeployed;
            this.__explicitlySet__.add("isCustomerDeployed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("installType")
        private InstallTypes installType;

        public Builder installType(InstallTypes installType) {
            this.installType = installType;
            this.__explicitlySet__.add("installType");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagementAgent build() {
            ManagementAgent __instance__ =
                    new ManagementAgent(
                            id,
                            installKeyId,
                            displayName,
                            platformType,
                            platformName,
                            platformVersion,
                            version,
                            resourceArtifactVersion,
                            host,
                            hostId,
                            installPath,
                            pluginList,
                            compartmentId,
                            isAgentAutoUpgradable,
                            timeCreated,
                            timeUpdated,
                            timeLastHeartbeat,
                            availabilityStatus,
                            lifecycleState,
                            lifecycleDetails,
                            isCustomerDeployed,
                            installType,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagementAgent o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .installKeyId(o.getInstallKeyId())
                            .displayName(o.getDisplayName())
                            .platformType(o.getPlatformType())
                            .platformName(o.getPlatformName())
                            .platformVersion(o.getPlatformVersion())
                            .version(o.getVersion())
                            .resourceArtifactVersion(o.getResourceArtifactVersion())
                            .host(o.getHost())
                            .hostId(o.getHostId())
                            .installPath(o.getInstallPath())
                            .pluginList(o.getPluginList())
                            .compartmentId(o.getCompartmentId())
                            .isAgentAutoUpgradable(o.getIsAgentAutoUpgradable())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .timeLastHeartbeat(o.getTimeLastHeartbeat())
                            .availabilityStatus(o.getAvailabilityStatus())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .isCustomerDeployed(o.getIsCustomerDeployed())
                            .installType(o.getInstallType())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * agent identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * agent install key identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("installKeyId")
    private final String installKeyId;

    public String getInstallKeyId() {
        return installKeyId;
    }

    /**
     * Management Agent Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * Platform Type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformType")
    private final PlatformTypes platformType;

    public PlatformTypes getPlatformType() {
        return platformType;
    }

    /**
     * Platform Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformName")
    private final String platformName;

    public String getPlatformName() {
        return platformName;
    }

    /**
     * Platform Version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformVersion")
    private final String platformVersion;

    public String getPlatformVersion() {
        return platformVersion;
    }

    /**
     * Management Agent Version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    public String getVersion() {
        return version;
    }

    /**
     * Version of the deployment artifact instantiated by this Management Agent.
     * The format for Standalone resourceMode is YYMMDD.HHMM, and the format for other modes
     * (whose artifacts are based upon Standalone but can advance independently)
     * is YYMMDD.HHMM.VVVVVVVVVVVV.
     * VVVVVVVVVVVV is always a numeric value between 000000000000 and 999999999999
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceArtifactVersion")
    private final String resourceArtifactVersion;

    public String getResourceArtifactVersion() {
        return resourceArtifactVersion;
    }

    /**
     * Management Agent host machine name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    private final String host;

    public String getHost() {
        return host;
    }

    /**
     * Host resource ocid
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostId")
    private final String hostId;

    public String getHostId() {
        return hostId;
    }

    /**
     * Path where Management Agent is installed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("installPath")
    private final String installPath;

    public String getInstallPath() {
        return installPath;
    }

    /**
     * list of managementAgentPlugins associated with the agent
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pluginList")
    private final java.util.List<ManagementAgentPluginDetails> pluginList;

    public java.util.List<ManagementAgentPluginDetails> getPluginList() {
        return pluginList;
    }

    /**
     * Compartment Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * true if the agent can be upgraded automatically; false if it must be upgraded manually. This flag is derived from the tenancy level auto upgrade preference.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAgentAutoUpgradable")
    private final Boolean isAgentAutoUpgradable;

    public Boolean getIsAgentAutoUpgradable() {
        return isAgentAutoUpgradable;
    }

    /**
     * The time the Management Agent was created. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the Management Agent was updated. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The time the Management Agent has last recorded its health status in telemetry. This value will be null if the agent has not recorded its health status in last 7 days. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastHeartbeat")
    private final java.util.Date timeLastHeartbeat;

    public java.util.Date getTimeLastHeartbeat() {
        return timeLastHeartbeat;
    }

    /**
     * The current availability status of managementAgent
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityStatus")
    private final AvailabilityStatus availabilityStatus;

    public AvailabilityStatus getAvailabilityStatus() {
        return availabilityStatus;
    }

    /**
     * The current state of managementAgent
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleStates lifecycleState;

    public LifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * true, if the agent image is manually downloaded and installed. false, if the agent is deployed as a plugin in Oracle Cloud Agent.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCustomerDeployed")
    private final Boolean isCustomerDeployed;

    public Boolean getIsCustomerDeployed() {
        return isCustomerDeployed;
    }

    /**
     * The install type, either AGENT or GATEWAY
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("installType")
    private final InstallTypes installType;

    public InstallTypes getInstallType() {
        return installType;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ManagementAgent(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", installKeyId=").append(String.valueOf(this.installKeyId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", platformType=").append(String.valueOf(this.platformType));
        sb.append(", platformName=").append(String.valueOf(this.platformName));
        sb.append(", platformVersion=").append(String.valueOf(this.platformVersion));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", resourceArtifactVersion=")
                .append(String.valueOf(this.resourceArtifactVersion));
        sb.append(", host=").append(String.valueOf(this.host));
        sb.append(", hostId=").append(String.valueOf(this.hostId));
        sb.append(", installPath=").append(String.valueOf(this.installPath));
        sb.append(", pluginList=").append(String.valueOf(this.pluginList));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", isAgentAutoUpgradable=").append(String.valueOf(this.isAgentAutoUpgradable));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeLastHeartbeat=").append(String.valueOf(this.timeLastHeartbeat));
        sb.append(", availabilityStatus=").append(String.valueOf(this.availabilityStatus));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", isCustomerDeployed=").append(String.valueOf(this.isCustomerDeployed));
        sb.append(", installType=").append(String.valueOf(this.installType));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagementAgent)) {
            return false;
        }

        ManagementAgent other = (ManagementAgent) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.installKeyId, other.installKeyId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.platformType, other.platformType)
                && java.util.Objects.equals(this.platformName, other.platformName)
                && java.util.Objects.equals(this.platformVersion, other.platformVersion)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(
                        this.resourceArtifactVersion, other.resourceArtifactVersion)
                && java.util.Objects.equals(this.host, other.host)
                && java.util.Objects.equals(this.hostId, other.hostId)
                && java.util.Objects.equals(this.installPath, other.installPath)
                && java.util.Objects.equals(this.pluginList, other.pluginList)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.isAgentAutoUpgradable, other.isAgentAutoUpgradable)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeLastHeartbeat, other.timeLastHeartbeat)
                && java.util.Objects.equals(this.availabilityStatus, other.availabilityStatus)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.isCustomerDeployed, other.isCustomerDeployed)
                && java.util.Objects.equals(this.installType, other.installType)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.installKeyId == null ? 43 : this.installKeyId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.platformType == null ? 43 : this.platformType.hashCode());
        result = (result * PRIME) + (this.platformName == null ? 43 : this.platformName.hashCode());
        result =
                (result * PRIME)
                        + (this.platformVersion == null ? 43 : this.platformVersion.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceArtifactVersion == null
                                ? 43
                                : this.resourceArtifactVersion.hashCode());
        result = (result * PRIME) + (this.host == null ? 43 : this.host.hashCode());
        result = (result * PRIME) + (this.hostId == null ? 43 : this.hostId.hashCode());
        result = (result * PRIME) + (this.installPath == null ? 43 : this.installPath.hashCode());
        result = (result * PRIME) + (this.pluginList == null ? 43 : this.pluginList.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.isAgentAutoUpgradable == null
                                ? 43
                                : this.isAgentAutoUpgradable.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastHeartbeat == null ? 43 : this.timeLastHeartbeat.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityStatus == null
                                ? 43
                                : this.availabilityStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.isCustomerDeployed == null
                                ? 43
                                : this.isCustomerDeployed.hashCode());
        result = (result * PRIME) + (this.installType == null ? 43 : this.installType.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
