/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * OLVM Cluster properties.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OlvmClusterProperties.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OlvmClusterProperties
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "clusterName",
        "clusterDescription",
        "comment",
        "isBallooningEnabled",
        "biosType",
        "cpu",
        "customSchedulingPolicyProperties",
        "display",
        "errorHandling",
        "fencingPolicy",
        "fipsMode",
        "firewallType",
        "isGlusterService",
        "glusterTunedProfile",
        "isHaReservation",
        "ksm",
        "logMaxMemoryUsedThreshold",
        "logMaxMemoryUsedThresholdType",
        "memoryPolicy",
        "migrationPolicy",
        "requiredRngSources",
        "serialNumber",
        "supportedVersions",
        "switchType",
        "isUseThreadsAsCores",
        "isTrustedService",
        "isTunnelMigration",
        "upgradeCorrelationId",
        "isUpdateInProgress",
        "upgradePercentComplete",
        "version",
        "isVirtService",
        "isVncEncryption",
        "dataCenters"
    })
    public OlvmClusterProperties(
            String clusterName,
            String clusterDescription,
            String comment,
            Boolean isBallooningEnabled,
            OlvmBiosType biosType,
            OlvmCpu cpu,
            java.util.List<OlvmProperty> customSchedulingPolicyProperties,
            OlvmDisplay display,
            OlvmErrorHandling errorHandling,
            OlvmFencingPolicy fencingPolicy,
            FipsMode fipsMode,
            FirewallType firewallType,
            Boolean isGlusterService,
            String glusterTunedProfile,
            Boolean isHaReservation,
            Ksm ksm,
            Integer logMaxMemoryUsedThreshold,
            LogMaxMemoryUsedThresholdType logMaxMemoryUsedThresholdType,
            OlvmMemoryPolicy memoryPolicy,
            OlvmMigrationOptions migrationPolicy,
            java.util.List<RngSource> requiredRngSources,
            OlvmSerialNumber serialNumber,
            java.util.List<OlvmVersion> supportedVersions,
            SwitchType switchType,
            Boolean isUseThreadsAsCores,
            Boolean isTrustedService,
            Boolean isTunnelMigration,
            String upgradeCorrelationId,
            Boolean isUpdateInProgress,
            Integer upgradePercentComplete,
            OlvmVersion version,
            Boolean isVirtService,
            Boolean isVncEncryption,
            java.util.List<OlvmDataCenter> dataCenters) {
        super();
        this.clusterName = clusterName;
        this.clusterDescription = clusterDescription;
        this.comment = comment;
        this.isBallooningEnabled = isBallooningEnabled;
        this.biosType = biosType;
        this.cpu = cpu;
        this.customSchedulingPolicyProperties = customSchedulingPolicyProperties;
        this.display = display;
        this.errorHandling = errorHandling;
        this.fencingPolicy = fencingPolicy;
        this.fipsMode = fipsMode;
        this.firewallType = firewallType;
        this.isGlusterService = isGlusterService;
        this.glusterTunedProfile = glusterTunedProfile;
        this.isHaReservation = isHaReservation;
        this.ksm = ksm;
        this.logMaxMemoryUsedThreshold = logMaxMemoryUsedThreshold;
        this.logMaxMemoryUsedThresholdType = logMaxMemoryUsedThresholdType;
        this.memoryPolicy = memoryPolicy;
        this.migrationPolicy = migrationPolicy;
        this.requiredRngSources = requiredRngSources;
        this.serialNumber = serialNumber;
        this.supportedVersions = supportedVersions;
        this.switchType = switchType;
        this.isUseThreadsAsCores = isUseThreadsAsCores;
        this.isTrustedService = isTrustedService;
        this.isTunnelMigration = isTunnelMigration;
        this.upgradeCorrelationId = upgradeCorrelationId;
        this.isUpdateInProgress = isUpdateInProgress;
        this.upgradePercentComplete = upgradePercentComplete;
        this.version = version;
        this.isVirtService = isVirtService;
        this.isVncEncryption = isVncEncryption;
        this.dataCenters = dataCenters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A human-readable name in plain text.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
        private String clusterName;

        /**
         * A human-readable name in plain text.
         * @param clusterName the value to set
         * @return this builder
         **/
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            this.__explicitlySet__.add("clusterName");
            return this;
        }
        /**
         * A human-readable description in plain text.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterDescription")
        private String clusterDescription;

        /**
         * A human-readable description in plain text.
         * @param clusterDescription the value to set
         * @return this builder
         **/
        public Builder clusterDescription(String clusterDescription) {
            this.clusterDescription = clusterDescription;
            this.__explicitlySet__.add("clusterDescription");
            return this;
        }
        /**
         * Free text containing comments about this object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("comment")
        private String comment;

        /**
         * Free text containing comments about this object.
         * @param comment the value to set
         * @return this builder
         **/
        public Builder comment(String comment) {
            this.comment = comment;
            this.__explicitlySet__.add("comment");
            return this;
        }
        /**
         * Whether ballooning is enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isBallooningEnabled")
        private Boolean isBallooningEnabled;

        /**
         * Whether ballooning is enabled.
         * @param isBallooningEnabled the value to set
         * @return this builder
         **/
        public Builder isBallooningEnabled(Boolean isBallooningEnabled) {
            this.isBallooningEnabled = isBallooningEnabled;
            this.__explicitlySet__.add("isBallooningEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("biosType")
        private OlvmBiosType biosType;

        public Builder biosType(OlvmBiosType biosType) {
            this.biosType = biosType;
            this.__explicitlySet__.add("biosType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpu")
        private OlvmCpu cpu;

        public Builder cpu(OlvmCpu cpu) {
            this.cpu = cpu;
            this.__explicitlySet__.add("cpu");
            return this;
        }
        /**
         * Custom scheduling policy properties of the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customSchedulingPolicyProperties")
        private java.util.List<OlvmProperty> customSchedulingPolicyProperties;

        /**
         * Custom scheduling policy properties of the cluster.
         * @param customSchedulingPolicyProperties the value to set
         * @return this builder
         **/
        public Builder customSchedulingPolicyProperties(
                java.util.List<OlvmProperty> customSchedulingPolicyProperties) {
            this.customSchedulingPolicyProperties = customSchedulingPolicyProperties;
            this.__explicitlySet__.add("customSchedulingPolicyProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("display")
        private OlvmDisplay display;

        public Builder display(OlvmDisplay display) {
            this.display = display;
            this.__explicitlySet__.add("display");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errorHandling")
        private OlvmErrorHandling errorHandling;

        public Builder errorHandling(OlvmErrorHandling errorHandling) {
            this.errorHandling = errorHandling;
            this.__explicitlySet__.add("errorHandling");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fencingPolicy")
        private OlvmFencingPolicy fencingPolicy;

        public Builder fencingPolicy(OlvmFencingPolicy fencingPolicy) {
            this.fencingPolicy = fencingPolicy;
            this.__explicitlySet__.add("fencingPolicy");
            return this;
        }
        /**
         * FIPS mode of the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fipsMode")
        private FipsMode fipsMode;

        /**
         * FIPS mode of the cluster.
         * @param fipsMode the value to set
         * @return this builder
         **/
        public Builder fipsMode(FipsMode fipsMode) {
            this.fipsMode = fipsMode;
            this.__explicitlySet__.add("fipsMode");
            return this;
        }
        /**
         * The type of firewall to be used on hosts in this cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("firewallType")
        private FirewallType firewallType;

        /**
         * The type of firewall to be used on hosts in this cluster.
         * @param firewallType the value to set
         * @return this builder
         **/
        public Builder firewallType(FirewallType firewallType) {
            this.firewallType = firewallType;
            this.__explicitlySet__.add("firewallType");
            return this;
        }
        /**
         * Indicates if Gluster service is used.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isGlusterService")
        private Boolean isGlusterService;

        /**
         * Indicates if Gluster service is used.
         * @param isGlusterService the value to set
         * @return this builder
         **/
        public Builder isGlusterService(Boolean isGlusterService) {
            this.isGlusterService = isGlusterService;
            this.__explicitlySet__.add("isGlusterService");
            return this;
        }
        /**
         * The name of the tuned profile.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("glusterTunedProfile")
        private String glusterTunedProfile;

        /**
         * The name of the tuned profile.
         * @param glusterTunedProfile the value to set
         * @return this builder
         **/
        public Builder glusterTunedProfile(String glusterTunedProfile) {
            this.glusterTunedProfile = glusterTunedProfile;
            this.__explicitlySet__.add("glusterTunedProfile");
            return this;
        }
        /**
         * Indicates whether HA reservation is enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isHaReservation")
        private Boolean isHaReservation;

        /**
         * Indicates whether HA reservation is enabled.
         * @param isHaReservation the value to set
         * @return this builder
         **/
        public Builder isHaReservation(Boolean isHaReservation) {
            this.isHaReservation = isHaReservation;
            this.__explicitlySet__.add("isHaReservation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ksm")
        private Ksm ksm;

        public Builder ksm(Ksm ksm) {
            this.ksm = ksm;
            this.__explicitlySet__.add("ksm");
            return this;
        }
        /**
         * The memory consumption threshold for logging audit log events
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logMaxMemoryUsedThreshold")
        private Integer logMaxMemoryUsedThreshold;

        /**
         * The memory consumption threshold for logging audit log events
         * @param logMaxMemoryUsedThreshold the value to set
         * @return this builder
         **/
        public Builder logMaxMemoryUsedThreshold(Integer logMaxMemoryUsedThreshold) {
            this.logMaxMemoryUsedThreshold = logMaxMemoryUsedThreshold;
            this.__explicitlySet__.add("logMaxMemoryUsedThreshold");
            return this;
        }
        /**
         * The memory consumption threshold type for logging audit log events.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logMaxMemoryUsedThresholdType")
        private LogMaxMemoryUsedThresholdType logMaxMemoryUsedThresholdType;

        /**
         * The memory consumption threshold type for logging audit log events.
         * @param logMaxMemoryUsedThresholdType the value to set
         * @return this builder
         **/
        public Builder logMaxMemoryUsedThresholdType(
                LogMaxMemoryUsedThresholdType logMaxMemoryUsedThresholdType) {
            this.logMaxMemoryUsedThresholdType = logMaxMemoryUsedThresholdType;
            this.__explicitlySet__.add("logMaxMemoryUsedThresholdType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("memoryPolicy")
        private OlvmMemoryPolicy memoryPolicy;

        public Builder memoryPolicy(OlvmMemoryPolicy memoryPolicy) {
            this.memoryPolicy = memoryPolicy;
            this.__explicitlySet__.add("memoryPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("migrationPolicy")
        private OlvmMigrationOptions migrationPolicy;

        public Builder migrationPolicy(OlvmMigrationOptions migrationPolicy) {
            this.migrationPolicy = migrationPolicy;
            this.__explicitlySet__.add("migrationPolicy");
            return this;
        }
        /**
         * Set of random number generator (RNG) sources required from each host in the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("requiredRngSources")
        private java.util.List<RngSource> requiredRngSources;

        /**
         * Set of random number generator (RNG) sources required from each host in the cluster.
         * @param requiredRngSources the value to set
         * @return this builder
         **/
        public Builder requiredRngSources(java.util.List<RngSource> requiredRngSources) {
            this.requiredRngSources = requiredRngSources;
            this.__explicitlySet__.add("requiredRngSources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
        private OlvmSerialNumber serialNumber;

        public Builder serialNumber(OlvmSerialNumber serialNumber) {
            this.serialNumber = serialNumber;
            this.__explicitlySet__.add("serialNumber");
            return this;
        }
        /**
         * List of supported versions.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("supportedVersions")
        private java.util.List<OlvmVersion> supportedVersions;

        /**
         * List of supported versions.
         * @param supportedVersions the value to set
         * @return this builder
         **/
        public Builder supportedVersions(java.util.List<OlvmVersion> supportedVersions) {
            this.supportedVersions = supportedVersions;
            this.__explicitlySet__.add("supportedVersions");
            return this;
        }
        /**
         * Describes all switch types supported by the Manager
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("switchType")
        private SwitchType switchType;

        /**
         * Describes all switch types supported by the Manager
         * @param switchType the value to set
         * @return this builder
         **/
        public Builder switchType(SwitchType switchType) {
            this.switchType = switchType;
            this.__explicitlySet__.add("switchType");
            return this;
        }
        /**
         * Indicates if threads should be used as cores
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isUseThreadsAsCores")
        private Boolean isUseThreadsAsCores;

        /**
         * Indicates if threads should be used as cores
         * @param isUseThreadsAsCores the value to set
         * @return this builder
         **/
        public Builder isUseThreadsAsCores(Boolean isUseThreadsAsCores) {
            this.isUseThreadsAsCores = isUseThreadsAsCores;
            this.__explicitlySet__.add("isUseThreadsAsCores");
            return this;
        }
        /**
         * Indicates if trusted service is enabled
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isTrustedService")
        private Boolean isTrustedService;

        /**
         * Indicates if trusted service is enabled
         * @param isTrustedService the value to set
         * @return this builder
         **/
        public Builder isTrustedService(Boolean isTrustedService) {
            this.isTrustedService = isTrustedService;
            this.__explicitlySet__.add("isTrustedService");
            return this;
        }
        /**
         * Indicates if tunnel migration is enabled
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isTunnelMigration")
        private Boolean isTunnelMigration;

        /**
         * Indicates if tunnel migration is enabled
         * @param isTunnelMigration the value to set
         * @return this builder
         **/
        public Builder isTunnelMigration(Boolean isTunnelMigration) {
            this.isTunnelMigration = isTunnelMigration;
            this.__explicitlySet__.add("isTunnelMigration");
            return this;
        }
        /**
         * The upgrade correlation identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("upgradeCorrelationId")
        private String upgradeCorrelationId;

        /**
         * The upgrade correlation identifier.
         * @param upgradeCorrelationId the value to set
         * @return this builder
         **/
        public Builder upgradeCorrelationId(String upgradeCorrelationId) {
            this.upgradeCorrelationId = upgradeCorrelationId;
            this.__explicitlySet__.add("upgradeCorrelationId");
            return this;
        }
        /**
         * Indicates if an upgrade has been started for the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isUpdateInProgress")
        private Boolean isUpdateInProgress;

        /**
         * Indicates if an upgrade has been started for the cluster.
         * @param isUpdateInProgress the value to set
         * @return this builder
         **/
        public Builder isUpdateInProgress(Boolean isUpdateInProgress) {
            this.isUpdateInProgress = isUpdateInProgress;
            this.__explicitlySet__.add("isUpdateInProgress");
            return this;
        }
        /**
         * If an upgrade is in progress, the upgrade???s reported percent complete.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("upgradePercentComplete")
        private Integer upgradePercentComplete;

        /**
         * If an upgrade is in progress, the upgrade???s reported percent complete.
         * @param upgradePercentComplete the value to set
         * @return this builder
         **/
        public Builder upgradePercentComplete(Integer upgradePercentComplete) {
            this.upgradePercentComplete = upgradePercentComplete;
            this.__explicitlySet__.add("upgradePercentComplete");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private OlvmVersion version;

        public Builder version(OlvmVersion version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * Indicates if virt service is enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isVirtService")
        private Boolean isVirtService;

        /**
         * Indicates if virt service is enabled.
         * @param isVirtService the value to set
         * @return this builder
         **/
        public Builder isVirtService(Boolean isVirtService) {
            this.isVirtService = isVirtService;
            this.__explicitlySet__.add("isVirtService");
            return this;
        }
        /**
         * Indicates if VNC encryption is enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isVncEncryption")
        private Boolean isVncEncryption;

        /**
         * Indicates if VNC encryption is enabled.
         * @param isVncEncryption the value to set
         * @return this builder
         **/
        public Builder isVncEncryption(Boolean isVncEncryption) {
            this.isVncEncryption = isVncEncryption;
            this.__explicitlySet__.add("isVncEncryption");
            return this;
        }
        /**
         * List of data centers where storage domain belongs
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataCenters")
        private java.util.List<OlvmDataCenter> dataCenters;

        /**
         * List of data centers where storage domain belongs
         * @param dataCenters the value to set
         * @return this builder
         **/
        public Builder dataCenters(java.util.List<OlvmDataCenter> dataCenters) {
            this.dataCenters = dataCenters;
            this.__explicitlySet__.add("dataCenters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmClusterProperties build() {
            OlvmClusterProperties model =
                    new OlvmClusterProperties(
                            this.clusterName,
                            this.clusterDescription,
                            this.comment,
                            this.isBallooningEnabled,
                            this.biosType,
                            this.cpu,
                            this.customSchedulingPolicyProperties,
                            this.display,
                            this.errorHandling,
                            this.fencingPolicy,
                            this.fipsMode,
                            this.firewallType,
                            this.isGlusterService,
                            this.glusterTunedProfile,
                            this.isHaReservation,
                            this.ksm,
                            this.logMaxMemoryUsedThreshold,
                            this.logMaxMemoryUsedThresholdType,
                            this.memoryPolicy,
                            this.migrationPolicy,
                            this.requiredRngSources,
                            this.serialNumber,
                            this.supportedVersions,
                            this.switchType,
                            this.isUseThreadsAsCores,
                            this.isTrustedService,
                            this.isTunnelMigration,
                            this.upgradeCorrelationId,
                            this.isUpdateInProgress,
                            this.upgradePercentComplete,
                            this.version,
                            this.isVirtService,
                            this.isVncEncryption,
                            this.dataCenters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmClusterProperties model) {
            if (model.wasPropertyExplicitlySet("clusterName")) {
                this.clusterName(model.getClusterName());
            }
            if (model.wasPropertyExplicitlySet("clusterDescription")) {
                this.clusterDescription(model.getClusterDescription());
            }
            if (model.wasPropertyExplicitlySet("comment")) {
                this.comment(model.getComment());
            }
            if (model.wasPropertyExplicitlySet("isBallooningEnabled")) {
                this.isBallooningEnabled(model.getIsBallooningEnabled());
            }
            if (model.wasPropertyExplicitlySet("biosType")) {
                this.biosType(model.getBiosType());
            }
            if (model.wasPropertyExplicitlySet("cpu")) {
                this.cpu(model.getCpu());
            }
            if (model.wasPropertyExplicitlySet("customSchedulingPolicyProperties")) {
                this.customSchedulingPolicyProperties(model.getCustomSchedulingPolicyProperties());
            }
            if (model.wasPropertyExplicitlySet("display")) {
                this.display(model.getDisplay());
            }
            if (model.wasPropertyExplicitlySet("errorHandling")) {
                this.errorHandling(model.getErrorHandling());
            }
            if (model.wasPropertyExplicitlySet("fencingPolicy")) {
                this.fencingPolicy(model.getFencingPolicy());
            }
            if (model.wasPropertyExplicitlySet("fipsMode")) {
                this.fipsMode(model.getFipsMode());
            }
            if (model.wasPropertyExplicitlySet("firewallType")) {
                this.firewallType(model.getFirewallType());
            }
            if (model.wasPropertyExplicitlySet("isGlusterService")) {
                this.isGlusterService(model.getIsGlusterService());
            }
            if (model.wasPropertyExplicitlySet("glusterTunedProfile")) {
                this.glusterTunedProfile(model.getGlusterTunedProfile());
            }
            if (model.wasPropertyExplicitlySet("isHaReservation")) {
                this.isHaReservation(model.getIsHaReservation());
            }
            if (model.wasPropertyExplicitlySet("ksm")) {
                this.ksm(model.getKsm());
            }
            if (model.wasPropertyExplicitlySet("logMaxMemoryUsedThreshold")) {
                this.logMaxMemoryUsedThreshold(model.getLogMaxMemoryUsedThreshold());
            }
            if (model.wasPropertyExplicitlySet("logMaxMemoryUsedThresholdType")) {
                this.logMaxMemoryUsedThresholdType(model.getLogMaxMemoryUsedThresholdType());
            }
            if (model.wasPropertyExplicitlySet("memoryPolicy")) {
                this.memoryPolicy(model.getMemoryPolicy());
            }
            if (model.wasPropertyExplicitlySet("migrationPolicy")) {
                this.migrationPolicy(model.getMigrationPolicy());
            }
            if (model.wasPropertyExplicitlySet("requiredRngSources")) {
                this.requiredRngSources(model.getRequiredRngSources());
            }
            if (model.wasPropertyExplicitlySet("serialNumber")) {
                this.serialNumber(model.getSerialNumber());
            }
            if (model.wasPropertyExplicitlySet("supportedVersions")) {
                this.supportedVersions(model.getSupportedVersions());
            }
            if (model.wasPropertyExplicitlySet("switchType")) {
                this.switchType(model.getSwitchType());
            }
            if (model.wasPropertyExplicitlySet("isUseThreadsAsCores")) {
                this.isUseThreadsAsCores(model.getIsUseThreadsAsCores());
            }
            if (model.wasPropertyExplicitlySet("isTrustedService")) {
                this.isTrustedService(model.getIsTrustedService());
            }
            if (model.wasPropertyExplicitlySet("isTunnelMigration")) {
                this.isTunnelMigration(model.getIsTunnelMigration());
            }
            if (model.wasPropertyExplicitlySet("upgradeCorrelationId")) {
                this.upgradeCorrelationId(model.getUpgradeCorrelationId());
            }
            if (model.wasPropertyExplicitlySet("isUpdateInProgress")) {
                this.isUpdateInProgress(model.getIsUpdateInProgress());
            }
            if (model.wasPropertyExplicitlySet("upgradePercentComplete")) {
                this.upgradePercentComplete(model.getUpgradePercentComplete());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("isVirtService")) {
                this.isVirtService(model.getIsVirtService());
            }
            if (model.wasPropertyExplicitlySet("isVncEncryption")) {
                this.isVncEncryption(model.getIsVncEncryption());
            }
            if (model.wasPropertyExplicitlySet("dataCenters")) {
                this.dataCenters(model.getDataCenters());
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
     * A human-readable name in plain text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
    private final String clusterName;

    /**
     * A human-readable name in plain text.
     * @return the value
     **/
    public String getClusterName() {
        return clusterName;
    }

    /**
     * A human-readable description in plain text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterDescription")
    private final String clusterDescription;

    /**
     * A human-readable description in plain text.
     * @return the value
     **/
    public String getClusterDescription() {
        return clusterDescription;
    }

    /**
     * Free text containing comments about this object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    private final String comment;

    /**
     * Free text containing comments about this object.
     * @return the value
     **/
    public String getComment() {
        return comment;
    }

    /**
     * Whether ballooning is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBallooningEnabled")
    private final Boolean isBallooningEnabled;

    /**
     * Whether ballooning is enabled.
     * @return the value
     **/
    public Boolean getIsBallooningEnabled() {
        return isBallooningEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("biosType")
    private final OlvmBiosType biosType;

    public OlvmBiosType getBiosType() {
        return biosType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cpu")
    private final OlvmCpu cpu;

    public OlvmCpu getCpu() {
        return cpu;
    }

    /**
     * Custom scheduling policy properties of the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customSchedulingPolicyProperties")
    private final java.util.List<OlvmProperty> customSchedulingPolicyProperties;

    /**
     * Custom scheduling policy properties of the cluster.
     * @return the value
     **/
    public java.util.List<OlvmProperty> getCustomSchedulingPolicyProperties() {
        return customSchedulingPolicyProperties;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("display")
    private final OlvmDisplay display;

    public OlvmDisplay getDisplay() {
        return display;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("errorHandling")
    private final OlvmErrorHandling errorHandling;

    public OlvmErrorHandling getErrorHandling() {
        return errorHandling;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fencingPolicy")
    private final OlvmFencingPolicy fencingPolicy;

    public OlvmFencingPolicy getFencingPolicy() {
        return fencingPolicy;
    }

    /**
     * FIPS mode of the cluster.
     **/
    public enum FipsMode {
        Disabled("DISABLED"),
        Enabled("ENABLED"),
        Undefined("UNDEFINED"),
        ;

        private final String value;
        private static java.util.Map<String, FipsMode> map;

        static {
            map = new java.util.HashMap<>();
            for (FipsMode v : FipsMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        FipsMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FipsMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid FipsMode: " + key);
        }
    };
    /**
     * FIPS mode of the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fipsMode")
    private final FipsMode fipsMode;

    /**
     * FIPS mode of the cluster.
     * @return the value
     **/
    public FipsMode getFipsMode() {
        return fipsMode;
    }

    /**
     * The type of firewall to be used on hosts in this cluster.
     **/
    public enum FirewallType {
        Firewalld("FIREWALLD"),
        Iptables("IPTABLES"),
        ;

        private final String value;
        private static java.util.Map<String, FirewallType> map;

        static {
            map = new java.util.HashMap<>();
            for (FirewallType v : FirewallType.values()) {
                map.put(v.getValue(), v);
            }
        }

        FirewallType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FirewallType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid FirewallType: " + key);
        }
    };
    /**
     * The type of firewall to be used on hosts in this cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("firewallType")
    private final FirewallType firewallType;

    /**
     * The type of firewall to be used on hosts in this cluster.
     * @return the value
     **/
    public FirewallType getFirewallType() {
        return firewallType;
    }

    /**
     * Indicates if Gluster service is used.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isGlusterService")
    private final Boolean isGlusterService;

    /**
     * Indicates if Gluster service is used.
     * @return the value
     **/
    public Boolean getIsGlusterService() {
        return isGlusterService;
    }

    /**
     * The name of the tuned profile.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("glusterTunedProfile")
    private final String glusterTunedProfile;

    /**
     * The name of the tuned profile.
     * @return the value
     **/
    public String getGlusterTunedProfile() {
        return glusterTunedProfile;
    }

    /**
     * Indicates whether HA reservation is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHaReservation")
    private final Boolean isHaReservation;

    /**
     * Indicates whether HA reservation is enabled.
     * @return the value
     **/
    public Boolean getIsHaReservation() {
        return isHaReservation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ksm")
    private final Ksm ksm;

    public Ksm getKsm() {
        return ksm;
    }

    /**
     * The memory consumption threshold for logging audit log events
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logMaxMemoryUsedThreshold")
    private final Integer logMaxMemoryUsedThreshold;

    /**
     * The memory consumption threshold for logging audit log events
     * @return the value
     **/
    public Integer getLogMaxMemoryUsedThreshold() {
        return logMaxMemoryUsedThreshold;
    }

    /**
     * The memory consumption threshold type for logging audit log events.
     **/
    public enum LogMaxMemoryUsedThresholdType {
        AbsoluteValueInMb("ABSOLUTE_VALUE_IN_MB"),
        Percentage("PERCENTAGE"),
        ;

        private final String value;
        private static java.util.Map<String, LogMaxMemoryUsedThresholdType> map;

        static {
            map = new java.util.HashMap<>();
            for (LogMaxMemoryUsedThresholdType v : LogMaxMemoryUsedThresholdType.values()) {
                map.put(v.getValue(), v);
            }
        }

        LogMaxMemoryUsedThresholdType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LogMaxMemoryUsedThresholdType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LogMaxMemoryUsedThresholdType: " + key);
        }
    };
    /**
     * The memory consumption threshold type for logging audit log events.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logMaxMemoryUsedThresholdType")
    private final LogMaxMemoryUsedThresholdType logMaxMemoryUsedThresholdType;

    /**
     * The memory consumption threshold type for logging audit log events.
     * @return the value
     **/
    public LogMaxMemoryUsedThresholdType getLogMaxMemoryUsedThresholdType() {
        return logMaxMemoryUsedThresholdType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("memoryPolicy")
    private final OlvmMemoryPolicy memoryPolicy;

    public OlvmMemoryPolicy getMemoryPolicy() {
        return memoryPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("migrationPolicy")
    private final OlvmMigrationOptions migrationPolicy;

    public OlvmMigrationOptions getMigrationPolicy() {
        return migrationPolicy;
    }

    /**
     * Set of random number generator (RNG) sources required from each host in the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requiredRngSources")
    private final java.util.List<RngSource> requiredRngSources;

    /**
     * Set of random number generator (RNG) sources required from each host in the cluster.
     * @return the value
     **/
    public java.util.List<RngSource> getRequiredRngSources() {
        return requiredRngSources;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
    private final OlvmSerialNumber serialNumber;

    public OlvmSerialNumber getSerialNumber() {
        return serialNumber;
    }

    /**
     * List of supported versions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportedVersions")
    private final java.util.List<OlvmVersion> supportedVersions;

    /**
     * List of supported versions.
     * @return the value
     **/
    public java.util.List<OlvmVersion> getSupportedVersions() {
        return supportedVersions;
    }

    /**
     * Describes all switch types supported by the Manager
     **/
    public enum SwitchType {
        Legacy("LEGACY"),
        Ovs("OVS"),
        ;

        private final String value;
        private static java.util.Map<String, SwitchType> map;

        static {
            map = new java.util.HashMap<>();
            for (SwitchType v : SwitchType.values()) {
                map.put(v.getValue(), v);
            }
        }

        SwitchType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SwitchType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SwitchType: " + key);
        }
    };
    /**
     * Describes all switch types supported by the Manager
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("switchType")
    private final SwitchType switchType;

    /**
     * Describes all switch types supported by the Manager
     * @return the value
     **/
    public SwitchType getSwitchType() {
        return switchType;
    }

    /**
     * Indicates if threads should be used as cores
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUseThreadsAsCores")
    private final Boolean isUseThreadsAsCores;

    /**
     * Indicates if threads should be used as cores
     * @return the value
     **/
    public Boolean getIsUseThreadsAsCores() {
        return isUseThreadsAsCores;
    }

    /**
     * Indicates if trusted service is enabled
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTrustedService")
    private final Boolean isTrustedService;

    /**
     * Indicates if trusted service is enabled
     * @return the value
     **/
    public Boolean getIsTrustedService() {
        return isTrustedService;
    }

    /**
     * Indicates if tunnel migration is enabled
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTunnelMigration")
    private final Boolean isTunnelMigration;

    /**
     * Indicates if tunnel migration is enabled
     * @return the value
     **/
    public Boolean getIsTunnelMigration() {
        return isTunnelMigration;
    }

    /**
     * The upgrade correlation identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("upgradeCorrelationId")
    private final String upgradeCorrelationId;

    /**
     * The upgrade correlation identifier.
     * @return the value
     **/
    public String getUpgradeCorrelationId() {
        return upgradeCorrelationId;
    }

    /**
     * Indicates if an upgrade has been started for the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUpdateInProgress")
    private final Boolean isUpdateInProgress;

    /**
     * Indicates if an upgrade has been started for the cluster.
     * @return the value
     **/
    public Boolean getIsUpdateInProgress() {
        return isUpdateInProgress;
    }

    /**
     * If an upgrade is in progress, the upgrade???s reported percent complete.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("upgradePercentComplete")
    private final Integer upgradePercentComplete;

    /**
     * If an upgrade is in progress, the upgrade???s reported percent complete.
     * @return the value
     **/
    public Integer getUpgradePercentComplete() {
        return upgradePercentComplete;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final OlvmVersion version;

    public OlvmVersion getVersion() {
        return version;
    }

    /**
     * Indicates if virt service is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isVirtService")
    private final Boolean isVirtService;

    /**
     * Indicates if virt service is enabled.
     * @return the value
     **/
    public Boolean getIsVirtService() {
        return isVirtService;
    }

    /**
     * Indicates if VNC encryption is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isVncEncryption")
    private final Boolean isVncEncryption;

    /**
     * Indicates if VNC encryption is enabled.
     * @return the value
     **/
    public Boolean getIsVncEncryption() {
        return isVncEncryption;
    }

    /**
     * List of data centers where storage domain belongs
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataCenters")
    private final java.util.List<OlvmDataCenter> dataCenters;

    /**
     * List of data centers where storage domain belongs
     * @return the value
     **/
    public java.util.List<OlvmDataCenter> getDataCenters() {
        return dataCenters;
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
        sb.append("OlvmClusterProperties(");
        sb.append("super=").append(super.toString());
        sb.append("clusterName=").append(String.valueOf(this.clusterName));
        sb.append(", clusterDescription=").append(String.valueOf(this.clusterDescription));
        sb.append(", comment=").append(String.valueOf(this.comment));
        sb.append(", isBallooningEnabled=").append(String.valueOf(this.isBallooningEnabled));
        sb.append(", biosType=").append(String.valueOf(this.biosType));
        sb.append(", cpu=").append(String.valueOf(this.cpu));
        sb.append(", customSchedulingPolicyProperties=")
                .append(String.valueOf(this.customSchedulingPolicyProperties));
        sb.append(", display=").append(String.valueOf(this.display));
        sb.append(", errorHandling=").append(String.valueOf(this.errorHandling));
        sb.append(", fencingPolicy=").append(String.valueOf(this.fencingPolicy));
        sb.append(", fipsMode=").append(String.valueOf(this.fipsMode));
        sb.append(", firewallType=").append(String.valueOf(this.firewallType));
        sb.append(", isGlusterService=").append(String.valueOf(this.isGlusterService));
        sb.append(", glusterTunedProfile=").append(String.valueOf(this.glusterTunedProfile));
        sb.append(", isHaReservation=").append(String.valueOf(this.isHaReservation));
        sb.append(", ksm=").append(String.valueOf(this.ksm));
        sb.append(", logMaxMemoryUsedThreshold=")
                .append(String.valueOf(this.logMaxMemoryUsedThreshold));
        sb.append(", logMaxMemoryUsedThresholdType=")
                .append(String.valueOf(this.logMaxMemoryUsedThresholdType));
        sb.append(", memoryPolicy=").append(String.valueOf(this.memoryPolicy));
        sb.append(", migrationPolicy=").append(String.valueOf(this.migrationPolicy));
        sb.append(", requiredRngSources=").append(String.valueOf(this.requiredRngSources));
        sb.append(", serialNumber=").append(String.valueOf(this.serialNumber));
        sb.append(", supportedVersions=").append(String.valueOf(this.supportedVersions));
        sb.append(", switchType=").append(String.valueOf(this.switchType));
        sb.append(", isUseThreadsAsCores=").append(String.valueOf(this.isUseThreadsAsCores));
        sb.append(", isTrustedService=").append(String.valueOf(this.isTrustedService));
        sb.append(", isTunnelMigration=").append(String.valueOf(this.isTunnelMigration));
        sb.append(", upgradeCorrelationId=").append(String.valueOf(this.upgradeCorrelationId));
        sb.append(", isUpdateInProgress=").append(String.valueOf(this.isUpdateInProgress));
        sb.append(", upgradePercentComplete=").append(String.valueOf(this.upgradePercentComplete));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", isVirtService=").append(String.valueOf(this.isVirtService));
        sb.append(", isVncEncryption=").append(String.valueOf(this.isVncEncryption));
        sb.append(", dataCenters=").append(String.valueOf(this.dataCenters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmClusterProperties)) {
            return false;
        }

        OlvmClusterProperties other = (OlvmClusterProperties) o;
        return java.util.Objects.equals(this.clusterName, other.clusterName)
                && java.util.Objects.equals(this.clusterDescription, other.clusterDescription)
                && java.util.Objects.equals(this.comment, other.comment)
                && java.util.Objects.equals(this.isBallooningEnabled, other.isBallooningEnabled)
                && java.util.Objects.equals(this.biosType, other.biosType)
                && java.util.Objects.equals(this.cpu, other.cpu)
                && java.util.Objects.equals(
                        this.customSchedulingPolicyProperties,
                        other.customSchedulingPolicyProperties)
                && java.util.Objects.equals(this.display, other.display)
                && java.util.Objects.equals(this.errorHandling, other.errorHandling)
                && java.util.Objects.equals(this.fencingPolicy, other.fencingPolicy)
                && java.util.Objects.equals(this.fipsMode, other.fipsMode)
                && java.util.Objects.equals(this.firewallType, other.firewallType)
                && java.util.Objects.equals(this.isGlusterService, other.isGlusterService)
                && java.util.Objects.equals(this.glusterTunedProfile, other.glusterTunedProfile)
                && java.util.Objects.equals(this.isHaReservation, other.isHaReservation)
                && java.util.Objects.equals(this.ksm, other.ksm)
                && java.util.Objects.equals(
                        this.logMaxMemoryUsedThreshold, other.logMaxMemoryUsedThreshold)
                && java.util.Objects.equals(
                        this.logMaxMemoryUsedThresholdType, other.logMaxMemoryUsedThresholdType)
                && java.util.Objects.equals(this.memoryPolicy, other.memoryPolicy)
                && java.util.Objects.equals(this.migrationPolicy, other.migrationPolicy)
                && java.util.Objects.equals(this.requiredRngSources, other.requiredRngSources)
                && java.util.Objects.equals(this.serialNumber, other.serialNumber)
                && java.util.Objects.equals(this.supportedVersions, other.supportedVersions)
                && java.util.Objects.equals(this.switchType, other.switchType)
                && java.util.Objects.equals(this.isUseThreadsAsCores, other.isUseThreadsAsCores)
                && java.util.Objects.equals(this.isTrustedService, other.isTrustedService)
                && java.util.Objects.equals(this.isTunnelMigration, other.isTunnelMigration)
                && java.util.Objects.equals(this.upgradeCorrelationId, other.upgradeCorrelationId)
                && java.util.Objects.equals(this.isUpdateInProgress, other.isUpdateInProgress)
                && java.util.Objects.equals(
                        this.upgradePercentComplete, other.upgradePercentComplete)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.isVirtService, other.isVirtService)
                && java.util.Objects.equals(this.isVncEncryption, other.isVncEncryption)
                && java.util.Objects.equals(this.dataCenters, other.dataCenters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.clusterName == null ? 43 : this.clusterName.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterDescription == null
                                ? 43
                                : this.clusterDescription.hashCode());
        result = (result * PRIME) + (this.comment == null ? 43 : this.comment.hashCode());
        result =
                (result * PRIME)
                        + (this.isBallooningEnabled == null
                                ? 43
                                : this.isBallooningEnabled.hashCode());
        result = (result * PRIME) + (this.biosType == null ? 43 : this.biosType.hashCode());
        result = (result * PRIME) + (this.cpu == null ? 43 : this.cpu.hashCode());
        result =
                (result * PRIME)
                        + (this.customSchedulingPolicyProperties == null
                                ? 43
                                : this.customSchedulingPolicyProperties.hashCode());
        result = (result * PRIME) + (this.display == null ? 43 : this.display.hashCode());
        result =
                (result * PRIME)
                        + (this.errorHandling == null ? 43 : this.errorHandling.hashCode());
        result =
                (result * PRIME)
                        + (this.fencingPolicy == null ? 43 : this.fencingPolicy.hashCode());
        result = (result * PRIME) + (this.fipsMode == null ? 43 : this.fipsMode.hashCode());
        result = (result * PRIME) + (this.firewallType == null ? 43 : this.firewallType.hashCode());
        result =
                (result * PRIME)
                        + (this.isGlusterService == null ? 43 : this.isGlusterService.hashCode());
        result =
                (result * PRIME)
                        + (this.glusterTunedProfile == null
                                ? 43
                                : this.glusterTunedProfile.hashCode());
        result =
                (result * PRIME)
                        + (this.isHaReservation == null ? 43 : this.isHaReservation.hashCode());
        result = (result * PRIME) + (this.ksm == null ? 43 : this.ksm.hashCode());
        result =
                (result * PRIME)
                        + (this.logMaxMemoryUsedThreshold == null
                                ? 43
                                : this.logMaxMemoryUsedThreshold.hashCode());
        result =
                (result * PRIME)
                        + (this.logMaxMemoryUsedThresholdType == null
                                ? 43
                                : this.logMaxMemoryUsedThresholdType.hashCode());
        result = (result * PRIME) + (this.memoryPolicy == null ? 43 : this.memoryPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.migrationPolicy == null ? 43 : this.migrationPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.requiredRngSources == null
                                ? 43
                                : this.requiredRngSources.hashCode());
        result = (result * PRIME) + (this.serialNumber == null ? 43 : this.serialNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedVersions == null ? 43 : this.supportedVersions.hashCode());
        result = (result * PRIME) + (this.switchType == null ? 43 : this.switchType.hashCode());
        result =
                (result * PRIME)
                        + (this.isUseThreadsAsCores == null
                                ? 43
                                : this.isUseThreadsAsCores.hashCode());
        result =
                (result * PRIME)
                        + (this.isTrustedService == null ? 43 : this.isTrustedService.hashCode());
        result =
                (result * PRIME)
                        + (this.isTunnelMigration == null ? 43 : this.isTunnelMigration.hashCode());
        result =
                (result * PRIME)
                        + (this.upgradeCorrelationId == null
                                ? 43
                                : this.upgradeCorrelationId.hashCode());
        result =
                (result * PRIME)
                        + (this.isUpdateInProgress == null
                                ? 43
                                : this.isUpdateInProgress.hashCode());
        result =
                (result * PRIME)
                        + (this.upgradePercentComplete == null
                                ? 43
                                : this.upgradePercentComplete.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.isVirtService == null ? 43 : this.isVirtService.hashCode());
        result =
                (result * PRIME)
                        + (this.isVncEncryption == null ? 43 : this.isVncEncryption.hashCode());
        result = (result * PRIME) + (this.dataCenters == null ? 43 : this.dataCenters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
