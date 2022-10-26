/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * The summary of the Management Agent inventory including the associated plugins. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ManagementAgentSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ManagementAgentSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        "isAgentAutoUpgradable",
        "timeCreated",
        "timeUpdated",
        "host",
        "hostId",
        "pluginList",
        "compartmentId",
        "timeLastHeartbeat",
        "availabilityStatus",
        "lifecycleState",
        "lifecycleDetails",
        "isCustomerDeployed",
        "installType",
        "freeformTags",
        "definedTags"
    })
    public ManagementAgentSummary(
            String id,
            String installKeyId,
            String displayName,
            PlatformTypes platformType,
            String platformName,
            String platformVersion,
            String version,
            String resourceArtifactVersion,
            Boolean isAgentAutoUpgradable,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String host,
            String hostId,
            java.util.List<ManagementAgentPluginDetails> pluginList,
            String compartmentId,
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
        this.isAgentAutoUpgradable = isAgentAutoUpgradable;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.host = host;
        this.hostId = hostId;
        this.pluginList = pluginList;
        this.compartmentId = compartmentId;
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
        /** agent identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * agent identifier
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** agent install key identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("installKeyId")
        private String installKeyId;

        /**
         * agent install key identifier
         *
         * @param installKeyId the value to set
         * @return this builder
         */
        public Builder installKeyId(String installKeyId) {
            this.installKeyId = installKeyId;
            this.__explicitlySet__.add("installKeyId");
            return this;
        }
        /** Management Agent Name */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Management Agent Name
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Platform Type */
        @com.fasterxml.jackson.annotation.JsonProperty("platformType")
        private PlatformTypes platformType;

        /**
         * Platform Type
         *
         * @param platformType the value to set
         * @return this builder
         */
        public Builder platformType(PlatformTypes platformType) {
            this.platformType = platformType;
            this.__explicitlySet__.add("platformType");
            return this;
        }
        /** Platform Name */
        @com.fasterxml.jackson.annotation.JsonProperty("platformName")
        private String platformName;

        /**
         * Platform Name
         *
         * @param platformName the value to set
         * @return this builder
         */
        public Builder platformName(String platformName) {
            this.platformName = platformName;
            this.__explicitlySet__.add("platformName");
            return this;
        }
        /** Platform Version */
        @com.fasterxml.jackson.annotation.JsonProperty("platformVersion")
        private String platformVersion;

        /**
         * Platform Version
         *
         * @param platformVersion the value to set
         * @return this builder
         */
        public Builder platformVersion(String platformVersion) {
            this.platformVersion = platformVersion;
            this.__explicitlySet__.add("platformVersion");
            return this;
        }
        /** Management Agent Version */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * Management Agent Version
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * Version of the deployment artifact instantiated by this Management Agent. The format for
         * Standalone resourceMode is YYMMDD.HHMM, and the format for other modes (whose artifacts
         * are based upon Standalone but can advance independently) is YYMMDD.HHMM.VVVVVVVVVVVV.
         * VVVVVVVVVVVV is always a numeric value between 000000000000 and 999999999999
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceArtifactVersion")
        private String resourceArtifactVersion;

        /**
         * Version of the deployment artifact instantiated by this Management Agent. The format for
         * Standalone resourceMode is YYMMDD.HHMM, and the format for other modes (whose artifacts
         * are based upon Standalone but can advance independently) is YYMMDD.HHMM.VVVVVVVVVVVV.
         * VVVVVVVVVVVV is always a numeric value between 000000000000 and 999999999999
         *
         * @param resourceArtifactVersion the value to set
         * @return this builder
         */
        public Builder resourceArtifactVersion(String resourceArtifactVersion) {
            this.resourceArtifactVersion = resourceArtifactVersion;
            this.__explicitlySet__.add("resourceArtifactVersion");
            return this;
        }
        /**
         * true if the agent can be upgraded automatically; false if it must be upgraded manually.
         * This flag is derived from the tenancy level auto upgrade preference.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAgentAutoUpgradable")
        private Boolean isAgentAutoUpgradable;

        /**
         * true if the agent can be upgraded automatically; false if it must be upgraded manually.
         * This flag is derived from the tenancy level auto upgrade preference.
         *
         * @param isAgentAutoUpgradable the value to set
         * @return this builder
         */
        public Builder isAgentAutoUpgradable(Boolean isAgentAutoUpgradable) {
            this.isAgentAutoUpgradable = isAgentAutoUpgradable;
            this.__explicitlySet__.add("isAgentAutoUpgradable");
            return this;
        }
        /** The time the Management Agent was created. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the Management Agent was created. An RFC3339 formatted datetime string
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time the Management Agent was last updated. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the Management Agent was last updated. An RFC3339 formatted datetime string
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** Management Agent host machine name */
        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        /**
         * Management Agent host machine name
         *
         * @param host the value to set
         * @return this builder
         */
        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }
        /** Host resource ocid */
        @com.fasterxml.jackson.annotation.JsonProperty("hostId")
        private String hostId;

        /**
         * Host resource ocid
         *
         * @param hostId the value to set
         * @return this builder
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            this.__explicitlySet__.add("hostId");
            return this;
        }
        /** list of managementAgentPlugins associated with the agent */
        @com.fasterxml.jackson.annotation.JsonProperty("pluginList")
        private java.util.List<ManagementAgentPluginDetails> pluginList;

        /**
         * list of managementAgentPlugins associated with the agent
         *
         * @param pluginList the value to set
         * @return this builder
         */
        public Builder pluginList(java.util.List<ManagementAgentPluginDetails> pluginList) {
            this.pluginList = pluginList;
            this.__explicitlySet__.add("pluginList");
            return this;
        }
        /** Compartment Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
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
         * The time the Management Agent has last recorded its heartbeat. An RFC3339 formatted
         * datetime string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastHeartbeat")
        private java.util.Date timeLastHeartbeat;

        /**
         * The time the Management Agent has last recorded its heartbeat. An RFC3339 formatted
         * datetime string
         *
         * @param timeLastHeartbeat the value to set
         * @return this builder
         */
        public Builder timeLastHeartbeat(java.util.Date timeLastHeartbeat) {
            this.timeLastHeartbeat = timeLastHeartbeat;
            this.__explicitlySet__.add("timeLastHeartbeat");
            return this;
        }
        /** The current availability status of managementAgent */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityStatus")
        private AvailabilityStatus availabilityStatus;

        /**
         * The current availability status of managementAgent
         *
         * @param availabilityStatus the value to set
         * @return this builder
         */
        public Builder availabilityStatus(AvailabilityStatus availabilityStatus) {
            this.availabilityStatus = availabilityStatus;
            this.__explicitlySet__.add("availabilityStatus");
            return this;
        }
        /** The current state of managementAgent */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        /**
         * The current state of managementAgent
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * true, if the agent image is manually downloaded and installed. false, if the agent is
         * deployed as a plugin in Oracle Cloud Agent.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isCustomerDeployed")
        private Boolean isCustomerDeployed;

        /**
         * true, if the agent image is manually downloaded and installed. false, if the agent is
         * deployed as a plugin in Oracle Cloud Agent.
         *
         * @param isCustomerDeployed the value to set
         * @return this builder
         */
        public Builder isCustomerDeployed(Boolean isCustomerDeployed) {
            this.isCustomerDeployed = isCustomerDeployed;
            this.__explicitlySet__.add("isCustomerDeployed");
            return this;
        }
        /** The install type, either AGENT or GATEWAY */
        @com.fasterxml.jackson.annotation.JsonProperty("installType")
        private InstallTypes installType;

        /**
         * The install type, either AGENT or GATEWAY
         *
         * @param installType the value to set
         * @return this builder
         */
        public Builder installType(InstallTypes installType) {
            this.installType = installType;
            this.__explicitlySet__.add("installType");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagementAgentSummary build() {
            ManagementAgentSummary model =
                    new ManagementAgentSummary(
                            this.id,
                            this.installKeyId,
                            this.displayName,
                            this.platformType,
                            this.platformName,
                            this.platformVersion,
                            this.version,
                            this.resourceArtifactVersion,
                            this.isAgentAutoUpgradable,
                            this.timeCreated,
                            this.timeUpdated,
                            this.host,
                            this.hostId,
                            this.pluginList,
                            this.compartmentId,
                            this.timeLastHeartbeat,
                            this.availabilityStatus,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.isCustomerDeployed,
                            this.installType,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagementAgentSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("installKeyId")) {
                this.installKeyId(model.getInstallKeyId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("platformType")) {
                this.platformType(model.getPlatformType());
            }
            if (model.wasPropertyExplicitlySet("platformName")) {
                this.platformName(model.getPlatformName());
            }
            if (model.wasPropertyExplicitlySet("platformVersion")) {
                this.platformVersion(model.getPlatformVersion());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("resourceArtifactVersion")) {
                this.resourceArtifactVersion(model.getResourceArtifactVersion());
            }
            if (model.wasPropertyExplicitlySet("isAgentAutoUpgradable")) {
                this.isAgentAutoUpgradable(model.getIsAgentAutoUpgradable());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("host")) {
                this.host(model.getHost());
            }
            if (model.wasPropertyExplicitlySet("hostId")) {
                this.hostId(model.getHostId());
            }
            if (model.wasPropertyExplicitlySet("pluginList")) {
                this.pluginList(model.getPluginList());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("timeLastHeartbeat")) {
                this.timeLastHeartbeat(model.getTimeLastHeartbeat());
            }
            if (model.wasPropertyExplicitlySet("availabilityStatus")) {
                this.availabilityStatus(model.getAvailabilityStatus());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("isCustomerDeployed")) {
                this.isCustomerDeployed(model.getIsCustomerDeployed());
            }
            if (model.wasPropertyExplicitlySet("installType")) {
                this.installType(model.getInstallType());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** agent identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * agent identifier
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** agent install key identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("installKeyId")
    private final String installKeyId;

    /**
     * agent install key identifier
     *
     * @return the value
     */
    public String getInstallKeyId() {
        return installKeyId;
    }

    /** Management Agent Name */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Management Agent Name
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Platform Type */
    @com.fasterxml.jackson.annotation.JsonProperty("platformType")
    private final PlatformTypes platformType;

    /**
     * Platform Type
     *
     * @return the value
     */
    public PlatformTypes getPlatformType() {
        return platformType;
    }

    /** Platform Name */
    @com.fasterxml.jackson.annotation.JsonProperty("platformName")
    private final String platformName;

    /**
     * Platform Name
     *
     * @return the value
     */
    public String getPlatformName() {
        return platformName;
    }

    /** Platform Version */
    @com.fasterxml.jackson.annotation.JsonProperty("platformVersion")
    private final String platformVersion;

    /**
     * Platform Version
     *
     * @return the value
     */
    public String getPlatformVersion() {
        return platformVersion;
    }

    /** Management Agent Version */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * Management Agent Version
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /**
     * Version of the deployment artifact instantiated by this Management Agent. The format for
     * Standalone resourceMode is YYMMDD.HHMM, and the format for other modes (whose artifacts are
     * based upon Standalone but can advance independently) is YYMMDD.HHMM.VVVVVVVVVVVV.
     * VVVVVVVVVVVV is always a numeric value between 000000000000 and 999999999999
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceArtifactVersion")
    private final String resourceArtifactVersion;

    /**
     * Version of the deployment artifact instantiated by this Management Agent. The format for
     * Standalone resourceMode is YYMMDD.HHMM, and the format for other modes (whose artifacts are
     * based upon Standalone but can advance independently) is YYMMDD.HHMM.VVVVVVVVVVVV.
     * VVVVVVVVVVVV is always a numeric value between 000000000000 and 999999999999
     *
     * @return the value
     */
    public String getResourceArtifactVersion() {
        return resourceArtifactVersion;
    }

    /**
     * true if the agent can be upgraded automatically; false if it must be upgraded manually. This
     * flag is derived from the tenancy level auto upgrade preference.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAgentAutoUpgradable")
    private final Boolean isAgentAutoUpgradable;

    /**
     * true if the agent can be upgraded automatically; false if it must be upgraded manually. This
     * flag is derived from the tenancy level auto upgrade preference.
     *
     * @return the value
     */
    public Boolean getIsAgentAutoUpgradable() {
        return isAgentAutoUpgradable;
    }

    /** The time the Management Agent was created. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the Management Agent was created. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the Management Agent was last updated. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the Management Agent was last updated. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Management Agent host machine name */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    private final String host;

    /**
     * Management Agent host machine name
     *
     * @return the value
     */
    public String getHost() {
        return host;
    }

    /** Host resource ocid */
    @com.fasterxml.jackson.annotation.JsonProperty("hostId")
    private final String hostId;

    /**
     * Host resource ocid
     *
     * @return the value
     */
    public String getHostId() {
        return hostId;
    }

    /** list of managementAgentPlugins associated with the agent */
    @com.fasterxml.jackson.annotation.JsonProperty("pluginList")
    private final java.util.List<ManagementAgentPluginDetails> pluginList;

    /**
     * list of managementAgentPlugins associated with the agent
     *
     * @return the value
     */
    public java.util.List<ManagementAgentPluginDetails> getPluginList() {
        return pluginList;
    }

    /** Compartment Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The time the Management Agent has last recorded its heartbeat. An RFC3339 formatted datetime
     * string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastHeartbeat")
    private final java.util.Date timeLastHeartbeat;

    /**
     * The time the Management Agent has last recorded its heartbeat. An RFC3339 formatted datetime
     * string
     *
     * @return the value
     */
    public java.util.Date getTimeLastHeartbeat() {
        return timeLastHeartbeat;
    }

    /** The current availability status of managementAgent */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityStatus")
    private final AvailabilityStatus availabilityStatus;

    /**
     * The current availability status of managementAgent
     *
     * @return the value
     */
    public AvailabilityStatus getAvailabilityStatus() {
        return availabilityStatus;
    }

    /** The current state of managementAgent */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleStates lifecycleState;

    /**
     * The current state of managementAgent
     *
     * @return the value
     */
    public LifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * true, if the agent image is manually downloaded and installed. false, if the agent is
     * deployed as a plugin in Oracle Cloud Agent.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isCustomerDeployed")
    private final Boolean isCustomerDeployed;

    /**
     * true, if the agent image is manually downloaded and installed. false, if the agent is
     * deployed as a plugin in Oracle Cloud Agent.
     *
     * @return the value
     */
    public Boolean getIsCustomerDeployed() {
        return isCustomerDeployed;
    }

    /** The install type, either AGENT or GATEWAY */
    @com.fasterxml.jackson.annotation.JsonProperty("installType")
    private final InstallTypes installType;

    /**
     * The install type, either AGENT or GATEWAY
     *
     * @return the value
     */
    public InstallTypes getInstallType() {
        return installType;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("ManagementAgentSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", installKeyId=").append(String.valueOf(this.installKeyId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", platformType=").append(String.valueOf(this.platformType));
        sb.append(", platformName=").append(String.valueOf(this.platformName));
        sb.append(", platformVersion=").append(String.valueOf(this.platformVersion));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", resourceArtifactVersion=")
                .append(String.valueOf(this.resourceArtifactVersion));
        sb.append(", isAgentAutoUpgradable=").append(String.valueOf(this.isAgentAutoUpgradable));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", host=").append(String.valueOf(this.host));
        sb.append(", hostId=").append(String.valueOf(this.hostId));
        sb.append(", pluginList=").append(String.valueOf(this.pluginList));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeLastHeartbeat=").append(String.valueOf(this.timeLastHeartbeat));
        sb.append(", availabilityStatus=").append(String.valueOf(this.availabilityStatus));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", isCustomerDeployed=").append(String.valueOf(this.isCustomerDeployed));
        sb.append(", installType=").append(String.valueOf(this.installType));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagementAgentSummary)) {
            return false;
        }

        ManagementAgentSummary other = (ManagementAgentSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.installKeyId, other.installKeyId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.platformType, other.platformType)
                && java.util.Objects.equals(this.platformName, other.platformName)
                && java.util.Objects.equals(this.platformVersion, other.platformVersion)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(
                        this.resourceArtifactVersion, other.resourceArtifactVersion)
                && java.util.Objects.equals(this.isAgentAutoUpgradable, other.isAgentAutoUpgradable)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.host, other.host)
                && java.util.Objects.equals(this.hostId, other.hostId)
                && java.util.Objects.equals(this.pluginList, other.pluginList)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeLastHeartbeat, other.timeLastHeartbeat)
                && java.util.Objects.equals(this.availabilityStatus, other.availabilityStatus)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.isCustomerDeployed, other.isCustomerDeployed)
                && java.util.Objects.equals(this.installType, other.installType)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
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
        result =
                (result * PRIME)
                        + (this.isAgentAutoUpgradable == null
                                ? 43
                                : this.isAgentAutoUpgradable.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.host == null ? 43 : this.host.hashCode());
        result = (result * PRIME) + (this.hostId == null ? 43 : this.hostId.hashCode());
        result = (result * PRIME) + (this.pluginList == null ? 43 : this.pluginList.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
