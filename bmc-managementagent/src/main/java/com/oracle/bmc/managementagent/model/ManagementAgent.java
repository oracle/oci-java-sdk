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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ManagementAgent.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ManagementAgent {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * agent identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * agent install key identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("installKeyId")
    String installKeyId;

    /**
     * Management Agent Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Platform Type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformType")
    PlatformTypes platformType;

    /**
     * Platform Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformName")
    String platformName;

    /**
     * Platform Version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformVersion")
    String platformVersion;

    /**
     * Management Agent Version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    String version;

    /**
     * Version of the deployment artifact instantiated by this Management Agent.
     * The format for Standalone resourceMode is YYMMDD.HHMM, and the format for other modes
     * (whose artifacts are based upon Standalone but can advance independently)
     * is YYMMDD.HHMM.VVVVVVVVVVVV.
     * VVVVVVVVVVVV is always a numeric value between 000000000000 and 999999999999
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceArtifactVersion")
    String resourceArtifactVersion;

    /**
     * Management Agent host machine name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    String host;

    /**
     * Host resource ocid
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostId")
    String hostId;

    /**
     * Path where Management Agent is installed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("installPath")
    String installPath;

    /**
     * list of managementAgentPlugins associated with the agent
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pluginList")
    java.util.List<ManagementAgentPluginDetails> pluginList;

    /**
     * Compartment Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * true if the agent can be upgraded automatically; false if it must be upgraded manually. This flag is derived from the tenancy level auto upgrade preference.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAgentAutoUpgradable")
    Boolean isAgentAutoUpgradable;

    /**
     * The time the Management Agent was created. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The time the Management Agent was updated. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The time the Management Agent has last recorded its health status in telemetry. This value will be null if the agent has not recorded its health status in last 7 days. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastHeartbeat")
    java.util.Date timeLastHeartbeat;

    /**
     * The current availability status of managementAgent
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityStatus")
    AvailabilityStatus availabilityStatus;

    /**
     * The current state of managementAgent
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleStates lifecycleState;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * true, if the agent image is manually downloaded and installed. false, if the agent is deployed as a plugin in Oracle Cloud Agent.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCustomerDeployed")
    Boolean isCustomerDeployed;

    /**
     * The install type, either AGENT or GATEWAY
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("installType")
    InstallTypes installType;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
