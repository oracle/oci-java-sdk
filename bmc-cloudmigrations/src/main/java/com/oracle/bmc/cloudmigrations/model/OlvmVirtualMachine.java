/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Represents a virtual machine. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OlvmVirtualMachine.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OlvmVirtualMachine
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "autoPinningPolicy",
        "bios",
        "comment",
        "console",
        "cpu",
        "cpuPinningPolicy",
        "cpuShares",
        "timeCreated",
        "customCompatibilityVersion",
        "customCpuModel",
        "customEmulatedMachine",
        "customProperties",
        "isDeleteProtected",
        "description",
        "display",
        "domain",
        "fqdn",
        "guestOperatingSystem",
        "guestTimeZone",
        "isContainIllegalImages",
        "highAvailability",
        "initialization",
        "ioThreads",
        "largeIcon",
        "storageDomainLease",
        "memoryInBytes",
        "memoryPolicy",
        "migrationPolicy",
        "migrationDowntimeInMs",
        "isMultiQueuesEnabled",
        "virtualMachineName",
        "isNextRunConfigurationExists",
        "numaTuneMode",
        "origin",
        "os",
        "placementPolicy",
        "isRunOnce",
        "serialNumber",
        "smallIcon",
        "isSoundcardEnabled",
        "isStartPaused",
        "timeStart",
        "isStateless",
        "status",
        "statusDetail",
        "stopReason",
        "timeStop",
        "storageErrorResumeBehavior",
        "timezone",
        "isTpmEnabled",
        "isTunnelMigration",
        "type",
        "usb",
        "isUseLatestTemplateVersion",
        "isVirtioScsiEnabled",
        "virtioScsiMultiQueues",
        "isVirtioScsiMultiQueuesEnabled"
    })
    public OlvmVirtualMachine(
            AutoPinningPolicy autoPinningPolicy,
            OlvmBios bios,
            String comment,
            OlvmConsole console,
            OlvmCpu cpu,
            CpuPinningPolicy cpuPinningPolicy,
            Integer cpuShares,
            java.util.Date timeCreated,
            OlvmVersion customCompatibilityVersion,
            String customCpuModel,
            String customEmulatedMachine,
            java.util.List<OlvmCustomProperty> customProperties,
            Boolean isDeleteProtected,
            String description,
            OlvmDisplay display,
            OlvmDomain domain,
            String fqdn,
            OlvmGuestOperatingSystem guestOperatingSystem,
            String guestTimeZone,
            Boolean isContainIllegalImages,
            OlvmHighAvailability highAvailability,
            OlvmInitialization initialization,
            Integer ioThreads,
            OlvmIcon largeIcon,
            OlvmStorageDomainProperties storageDomainLease,
            Long memoryInBytes,
            OlvmMemoryPolicy memoryPolicy,
            OlvmMigrationOptions migrationPolicy,
            Integer migrationDowntimeInMs,
            Boolean isMultiQueuesEnabled,
            String virtualMachineName,
            Boolean isNextRunConfigurationExists,
            NumaTuneMode numaTuneMode,
            String origin,
            OlvmOperatingSystem os,
            OlvmVmPlacementPolicy placementPolicy,
            Boolean isRunOnce,
            OlvmSerialNumber serialNumber,
            OlvmIcon smallIcon,
            Boolean isSoundcardEnabled,
            Boolean isStartPaused,
            java.util.Date timeStart,
            Boolean isStateless,
            OlvmVmStatus status,
            String statusDetail,
            String stopReason,
            java.util.Date timeStop,
            StorageErrorResumeBehavior storageErrorResumeBehavior,
            String timezone,
            Boolean isTpmEnabled,
            Boolean isTunnelMigration,
            OlvmVmType type,
            OlvmUsb usb,
            Boolean isUseLatestTemplateVersion,
            Boolean isVirtioScsiEnabled,
            Integer virtioScsiMultiQueues,
            Boolean isVirtioScsiMultiQueuesEnabled) {
        super();
        this.autoPinningPolicy = autoPinningPolicy;
        this.bios = bios;
        this.comment = comment;
        this.console = console;
        this.cpu = cpu;
        this.cpuPinningPolicy = cpuPinningPolicy;
        this.cpuShares = cpuShares;
        this.timeCreated = timeCreated;
        this.customCompatibilityVersion = customCompatibilityVersion;
        this.customCpuModel = customCpuModel;
        this.customEmulatedMachine = customEmulatedMachine;
        this.customProperties = customProperties;
        this.isDeleteProtected = isDeleteProtected;
        this.description = description;
        this.display = display;
        this.domain = domain;
        this.fqdn = fqdn;
        this.guestOperatingSystem = guestOperatingSystem;
        this.guestTimeZone = guestTimeZone;
        this.isContainIllegalImages = isContainIllegalImages;
        this.highAvailability = highAvailability;
        this.initialization = initialization;
        this.ioThreads = ioThreads;
        this.largeIcon = largeIcon;
        this.storageDomainLease = storageDomainLease;
        this.memoryInBytes = memoryInBytes;
        this.memoryPolicy = memoryPolicy;
        this.migrationPolicy = migrationPolicy;
        this.migrationDowntimeInMs = migrationDowntimeInMs;
        this.isMultiQueuesEnabled = isMultiQueuesEnabled;
        this.virtualMachineName = virtualMachineName;
        this.isNextRunConfigurationExists = isNextRunConfigurationExists;
        this.numaTuneMode = numaTuneMode;
        this.origin = origin;
        this.os = os;
        this.placementPolicy = placementPolicy;
        this.isRunOnce = isRunOnce;
        this.serialNumber = serialNumber;
        this.smallIcon = smallIcon;
        this.isSoundcardEnabled = isSoundcardEnabled;
        this.isStartPaused = isStartPaused;
        this.timeStart = timeStart;
        this.isStateless = isStateless;
        this.status = status;
        this.statusDetail = statusDetail;
        this.stopReason = stopReason;
        this.timeStop = timeStop;
        this.storageErrorResumeBehavior = storageErrorResumeBehavior;
        this.timezone = timezone;
        this.isTpmEnabled = isTpmEnabled;
        this.isTunnelMigration = isTunnelMigration;
        this.type = type;
        this.usb = usb;
        this.isUseLatestTemplateVersion = isUseLatestTemplateVersion;
        this.isVirtioScsiEnabled = isVirtioScsiEnabled;
        this.virtioScsiMultiQueues = virtioScsiMultiQueues;
        this.isVirtioScsiMultiQueuesEnabled = isVirtioScsiMultiQueuesEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Specifies if and how the auto CPU and NUMA configuration is applied. */
        @com.fasterxml.jackson.annotation.JsonProperty("autoPinningPolicy")
        private AutoPinningPolicy autoPinningPolicy;

        /**
         * Specifies if and how the auto CPU and NUMA configuration is applied.
         *
         * @param autoPinningPolicy the value to set
         * @return this builder
         */
        public Builder autoPinningPolicy(AutoPinningPolicy autoPinningPolicy) {
            this.autoPinningPolicy = autoPinningPolicy;
            this.__explicitlySet__.add("autoPinningPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bios")
        private OlvmBios bios;

        public Builder bios(OlvmBios bios) {
            this.bios = bios;
            this.__explicitlySet__.add("bios");
            return this;
        }
        /** Free text containing comments about this object. */
        @com.fasterxml.jackson.annotation.JsonProperty("comment")
        private String comment;

        /**
         * Free text containing comments about this object.
         *
         * @param comment the value to set
         * @return this builder
         */
        public Builder comment(String comment) {
            this.comment = comment;
            this.__explicitlySet__.add("comment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("console")
        private OlvmConsole console;

        public Builder console(OlvmConsole console) {
            this.console = console;
            this.__explicitlySet__.add("console");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpu")
        private OlvmCpu cpu;

        public Builder cpu(OlvmCpu cpu) {
            this.cpu = cpu;
            this.__explicitlySet__.add("cpu");
            return this;
        }
        /** Type representing the CPU and NUMA pinning policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuPinningPolicy")
        private CpuPinningPolicy cpuPinningPolicy;

        /**
         * Type representing the CPU and NUMA pinning policy.
         *
         * @param cpuPinningPolicy the value to set
         * @return this builder
         */
        public Builder cpuPinningPolicy(CpuPinningPolicy cpuPinningPolicy) {
            this.cpuPinningPolicy = cpuPinningPolicy;
            this.__explicitlySet__.add("cpuPinningPolicy");
            return this;
        }
        /** Number of CPU Shares */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuShares")
        private Integer cpuShares;

        /**
         * Number of CPU Shares
         *
         * @param cpuShares the value to set
         * @return this builder
         */
        public Builder cpuShares(Integer cpuShares) {
            this.cpuShares = cpuShares;
            this.__explicitlySet__.add("cpuShares");
            return this;
        }
        /** Creation time. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Creation time.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customCompatibilityVersion")
        private OlvmVersion customCompatibilityVersion;

        public Builder customCompatibilityVersion(OlvmVersion customCompatibilityVersion) {
            this.customCompatibilityVersion = customCompatibilityVersion;
            this.__explicitlySet__.add("customCompatibilityVersion");
            return this;
        }
        /** Custom CPU model */
        @com.fasterxml.jackson.annotation.JsonProperty("customCpuModel")
        private String customCpuModel;

        /**
         * Custom CPU model
         *
         * @param customCpuModel the value to set
         * @return this builder
         */
        public Builder customCpuModel(String customCpuModel) {
            this.customCpuModel = customCpuModel;
            this.__explicitlySet__.add("customCpuModel");
            return this;
        }
        /** Custom Emulated machine */
        @com.fasterxml.jackson.annotation.JsonProperty("customEmulatedMachine")
        private String customEmulatedMachine;

        /**
         * Custom Emulated machine
         *
         * @param customEmulatedMachine the value to set
         * @return this builder
         */
        public Builder customEmulatedMachine(String customEmulatedMachine) {
            this.customEmulatedMachine = customEmulatedMachine;
            this.__explicitlySet__.add("customEmulatedMachine");
            return this;
        }
        /** Custom properties applied to the vNIC profile. */
        @com.fasterxml.jackson.annotation.JsonProperty("customProperties")
        private java.util.List<OlvmCustomProperty> customProperties;

        /**
         * Custom properties applied to the vNIC profile.
         *
         * @param customProperties the value to set
         * @return this builder
         */
        public Builder customProperties(java.util.List<OlvmCustomProperty> customProperties) {
            this.customProperties = customProperties;
            this.__explicitlySet__.add("customProperties");
            return this;
        }
        /** If true, the virtual machine cannot be deleted. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDeleteProtected")
        private Boolean isDeleteProtected;

        /**
         * If true, the virtual machine cannot be deleted.
         *
         * @param isDeleteProtected the value to set
         * @return this builder
         */
        public Builder isDeleteProtected(Boolean isDeleteProtected) {
            this.isDeleteProtected = isDeleteProtected;
            this.__explicitlySet__.add("isDeleteProtected");
            return this;
        }
        /** A human-readable description in plain text. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A human-readable description in plain text.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("display")
        private OlvmDisplay display;

        public Builder display(OlvmDisplay display) {
            this.display = display;
            this.__explicitlySet__.add("display");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private OlvmDomain domain;

        public Builder domain(OlvmDomain domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }
        /** Fully qualified domain name of the virtual machine. */
        @com.fasterxml.jackson.annotation.JsonProperty("fqdn")
        private String fqdn;

        /**
         * Fully qualified domain name of the virtual machine.
         *
         * @param fqdn the value to set
         * @return this builder
         */
        public Builder fqdn(String fqdn) {
            this.fqdn = fqdn;
            this.__explicitlySet__.add("fqdn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("guestOperatingSystem")
        private OlvmGuestOperatingSystem guestOperatingSystem;

        public Builder guestOperatingSystem(OlvmGuestOperatingSystem guestOperatingSystem) {
            this.guestOperatingSystem = guestOperatingSystem;
            this.__explicitlySet__.add("guestOperatingSystem");
            return this;
        }
        /** What time zone is used by the virtual machine (as returned by guest agent). */
        @com.fasterxml.jackson.annotation.JsonProperty("guestTimeZone")
        private String guestTimeZone;

        /**
         * What time zone is used by the virtual machine (as returned by guest agent).
         *
         * @param guestTimeZone the value to set
         * @return this builder
         */
        public Builder guestTimeZone(String guestTimeZone) {
            this.guestTimeZone = guestTimeZone;
            this.__explicitlySet__.add("guestTimeZone");
            return this;
        }
        /** Indicates whether the virtual machine has snapshots with disks in ILLEGAL state. */
        @com.fasterxml.jackson.annotation.JsonProperty("isContainIllegalImages")
        private Boolean isContainIllegalImages;

        /**
         * Indicates whether the virtual machine has snapshots with disks in ILLEGAL state.
         *
         * @param isContainIllegalImages the value to set
         * @return this builder
         */
        public Builder isContainIllegalImages(Boolean isContainIllegalImages) {
            this.isContainIllegalImages = isContainIllegalImages;
            this.__explicitlySet__.add("isContainIllegalImages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("highAvailability")
        private OlvmHighAvailability highAvailability;

        public Builder highAvailability(OlvmHighAvailability highAvailability) {
            this.highAvailability = highAvailability;
            this.__explicitlySet__.add("highAvailability");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("initialization")
        private OlvmInitialization initialization;

        public Builder initialization(OlvmInitialization initialization) {
            this.initialization = initialization;
            this.__explicitlySet__.add("initialization");
            return this;
        }
        /** For performance tuning of IO threading. */
        @com.fasterxml.jackson.annotation.JsonProperty("ioThreads")
        private Integer ioThreads;

        /**
         * For performance tuning of IO threading.
         *
         * @param ioThreads the value to set
         * @return this builder
         */
        public Builder ioThreads(Integer ioThreads) {
            this.ioThreads = ioThreads;
            this.__explicitlySet__.add("ioThreads");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("largeIcon")
        private OlvmIcon largeIcon;

        public Builder largeIcon(OlvmIcon largeIcon) {
            this.largeIcon = largeIcon;
            this.__explicitlySet__.add("largeIcon");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageDomainLease")
        private OlvmStorageDomainProperties storageDomainLease;

        public Builder storageDomainLease(OlvmStorageDomainProperties storageDomainLease) {
            this.storageDomainLease = storageDomainLease;
            this.__explicitlySet__.add("storageDomainLease");
            return this;
        }
        /** The virtual machine???s memory, in bytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryInBytes")
        private Long memoryInBytes;

        /**
         * The virtual machine???s memory, in bytes.
         *
         * @param memoryInBytes the value to set
         * @return this builder
         */
        public Builder memoryInBytes(Long memoryInBytes) {
            this.memoryInBytes = memoryInBytes;
            this.__explicitlySet__.add("memoryInBytes");
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
         * Maximum time the virtual machine can be non responsive during its live migration to
         * another host in ms.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("migrationDowntimeInMs")
        private Integer migrationDowntimeInMs;

        /**
         * Maximum time the virtual machine can be non responsive during its live migration to
         * another host in ms.
         *
         * @param migrationDowntimeInMs the value to set
         * @return this builder
         */
        public Builder migrationDowntimeInMs(Integer migrationDowntimeInMs) {
            this.migrationDowntimeInMs = migrationDowntimeInMs;
            this.__explicitlySet__.add("migrationDowntimeInMs");
            return this;
        }
        /**
         * If true, each virtual interface will get the optimal number of queues, depending on the
         * available virtual Cpus.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isMultiQueuesEnabled")
        private Boolean isMultiQueuesEnabled;

        /**
         * If true, each virtual interface will get the optimal number of queues, depending on the
         * available virtual Cpus.
         *
         * @param isMultiQueuesEnabled the value to set
         * @return this builder
         */
        public Builder isMultiQueuesEnabled(Boolean isMultiQueuesEnabled) {
            this.isMultiQueuesEnabled = isMultiQueuesEnabled;
            this.__explicitlySet__.add("isMultiQueuesEnabled");
            return this;
        }
        /** Name of the property. */
        @com.fasterxml.jackson.annotation.JsonProperty("virtualMachineName")
        private String virtualMachineName;

        /**
         * Name of the property.
         *
         * @param virtualMachineName the value to set
         * @return this builder
         */
        public Builder virtualMachineName(String virtualMachineName) {
            this.virtualMachineName = virtualMachineName;
            this.__explicitlySet__.add("virtualMachineName");
            return this;
        }
        /**
         * Indicates if virtual machine configuration has been changed and requires restart of the
         * virtual machine.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isNextRunConfigurationExists")
        private Boolean isNextRunConfigurationExists;

        /**
         * Indicates if virtual machine configuration has been changed and requires restart of the
         * virtual machine.
         *
         * @param isNextRunConfigurationExists the value to set
         * @return this builder
         */
        public Builder isNextRunConfigurationExists(Boolean isNextRunConfigurationExists) {
            this.isNextRunConfigurationExists = isNextRunConfigurationExists;
            this.__explicitlySet__.add("isNextRunConfigurationExists");
            return this;
        }
        /** How the NUMA topology is applied. */
        @com.fasterxml.jackson.annotation.JsonProperty("numaTuneMode")
        private NumaTuneMode numaTuneMode;

        /**
         * How the NUMA topology is applied.
         *
         * @param numaTuneMode the value to set
         * @return this builder
         */
        public Builder numaTuneMode(NumaTuneMode numaTuneMode) {
            this.numaTuneMode = numaTuneMode;
            this.__explicitlySet__.add("numaTuneMode");
            return this;
        }
        /** The origin of this virtual machine. */
        @com.fasterxml.jackson.annotation.JsonProperty("origin")
        private String origin;

        /**
         * The origin of this virtual machine.
         *
         * @param origin the value to set
         * @return this builder
         */
        public Builder origin(String origin) {
            this.origin = origin;
            this.__explicitlySet__.add("origin");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("os")
        private OlvmOperatingSystem os;

        public Builder os(OlvmOperatingSystem os) {
            this.os = os;
            this.__explicitlySet__.add("os");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("placementPolicy")
        private OlvmVmPlacementPolicy placementPolicy;

        public Builder placementPolicy(OlvmVmPlacementPolicy placementPolicy) {
            this.placementPolicy = placementPolicy;
            this.__explicitlySet__.add("placementPolicy");
            return this;
        }
        /**
         * If true, the virtual machine has been started using the run once command, meaning it???s
         * configuration might differ from the stored one for the purpose of this single run.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRunOnce")
        private Boolean isRunOnce;

        /**
         * If true, the virtual machine has been started using the run once command, meaning it???s
         * configuration might differ from the stored one for the purpose of this single run.
         *
         * @param isRunOnce the value to set
         * @return this builder
         */
        public Builder isRunOnce(Boolean isRunOnce) {
            this.isRunOnce = isRunOnce;
            this.__explicitlySet__.add("isRunOnce");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
        private OlvmSerialNumber serialNumber;

        public Builder serialNumber(OlvmSerialNumber serialNumber) {
            this.serialNumber = serialNumber;
            this.__explicitlySet__.add("serialNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("smallIcon")
        private OlvmIcon smallIcon;

        public Builder smallIcon(OlvmIcon smallIcon) {
            this.smallIcon = smallIcon;
            this.__explicitlySet__.add("smallIcon");
            return this;
        }
        /** If true, the sound card is added to the virtual machine. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSoundcardEnabled")
        private Boolean isSoundcardEnabled;

        /**
         * If true, the sound card is added to the virtual machine.
         *
         * @param isSoundcardEnabled the value to set
         * @return this builder
         */
        public Builder isSoundcardEnabled(Boolean isSoundcardEnabled) {
            this.isSoundcardEnabled = isSoundcardEnabled;
            this.__explicitlySet__.add("isSoundcardEnabled");
            return this;
        }
        /** If true, the virtual machine will be initially in 'paused' state after start. */
        @com.fasterxml.jackson.annotation.JsonProperty("isStartPaused")
        private Boolean isStartPaused;

        /**
         * If true, the virtual machine will be initially in 'paused' state after start.
         *
         * @param isStartPaused the value to set
         * @return this builder
         */
        public Builder isStartPaused(Boolean isStartPaused) {
            this.isStartPaused = isStartPaused;
            this.__explicitlySet__.add("isStartPaused");
            return this;
        }
        /** The date in which the virtual machine was started. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        /**
         * The date in which the virtual machine was started.
         *
         * @param timeStart the value to set
         * @return this builder
         */
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }
        /**
         * If true, the virtual machine is stateless - it???s state (disks) are rolled-back after
         * shutdown.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isStateless")
        private Boolean isStateless;

        /**
         * If true, the virtual machine is stateless - it???s state (disks) are rolled-back after
         * shutdown.
         *
         * @param isStateless the value to set
         * @return this builder
         */
        public Builder isStateless(Boolean isStateless) {
            this.isStateless = isStateless;
            this.__explicitlySet__.add("isStateless");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private OlvmVmStatus status;

        public Builder status(OlvmVmStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Human readable detail of current status. */
        @com.fasterxml.jackson.annotation.JsonProperty("statusDetail")
        private String statusDetail;

        /**
         * Human readable detail of current status.
         *
         * @param statusDetail the value to set
         * @return this builder
         */
        public Builder statusDetail(String statusDetail) {
            this.statusDetail = statusDetail;
            this.__explicitlySet__.add("statusDetail");
            return this;
        }
        /** The reason the virtual machine was stopped. */
        @com.fasterxml.jackson.annotation.JsonProperty("stopReason")
        private String stopReason;

        /**
         * The reason the virtual machine was stopped.
         *
         * @param stopReason the value to set
         * @return this builder
         */
        public Builder stopReason(String stopReason) {
            this.stopReason = stopReason;
            this.__explicitlySet__.add("stopReason");
            return this;
        }
        /** The date in which the virtual machine was stopped. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStop")
        private java.util.Date timeStop;

        /**
         * The date in which the virtual machine was stopped.
         *
         * @param timeStop the value to set
         * @return this builder
         */
        public Builder timeStop(java.util.Date timeStop) {
            this.timeStop = timeStop;
            this.__explicitlySet__.add("timeStop");
            return this;
        }
        /** Determines how the virtual machine will be resumed after storage error. */
        @com.fasterxml.jackson.annotation.JsonProperty("storageErrorResumeBehavior")
        private StorageErrorResumeBehavior storageErrorResumeBehavior;

        /**
         * Determines how the virtual machine will be resumed after storage error.
         *
         * @param storageErrorResumeBehavior the value to set
         * @return this builder
         */
        public Builder storageErrorResumeBehavior(
                StorageErrorResumeBehavior storageErrorResumeBehavior) {
            this.storageErrorResumeBehavior = storageErrorResumeBehavior;
            this.__explicitlySet__.add("storageErrorResumeBehavior");
            return this;
        }
        /** Name of time zone. */
        @com.fasterxml.jackson.annotation.JsonProperty("timezone")
        private String timezone;

        /**
         * Name of time zone.
         *
         * @param timezone the value to set
         * @return this builder
         */
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            this.__explicitlySet__.add("timezone");
            return this;
        }
        /** If true, a TPM device is added to the virtual machine. */
        @com.fasterxml.jackson.annotation.JsonProperty("isTpmEnabled")
        private Boolean isTpmEnabled;

        /**
         * If true, a TPM device is added to the virtual machine.
         *
         * @param isTpmEnabled the value to set
         * @return this builder
         */
        public Builder isTpmEnabled(Boolean isTpmEnabled) {
            this.isTpmEnabled = isTpmEnabled;
            this.__explicitlySet__.add("isTpmEnabled");
            return this;
        }
        /**
         * If true, the network data transfer will be encrypted during virtual machine live
         * migration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isTunnelMigration")
        private Boolean isTunnelMigration;

        /**
         * If true, the network data transfer will be encrypted during virtual machine live
         * migration.
         *
         * @param isTunnelMigration the value to set
         * @return this builder
         */
        public Builder isTunnelMigration(Boolean isTunnelMigration) {
            this.isTunnelMigration = isTunnelMigration;
            this.__explicitlySet__.add("isTunnelMigration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private OlvmVmType type;

        public Builder type(OlvmVmType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usb")
        private OlvmUsb usb;

        public Builder usb(OlvmUsb usb) {
            this.usb = usb;
            this.__explicitlySet__.add("usb");
            return this;
        }
        /**
         * If true, the virtual machine is reconfigured to the latest version of it???s template
         * when it is started.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isUseLatestTemplateVersion")
        private Boolean isUseLatestTemplateVersion;

        /**
         * If true, the virtual machine is reconfigured to the latest version of it???s template
         * when it is started.
         *
         * @param isUseLatestTemplateVersion the value to set
         * @return this builder
         */
        public Builder isUseLatestTemplateVersion(Boolean isUseLatestTemplateVersion) {
            this.isUseLatestTemplateVersion = isUseLatestTemplateVersion;
            this.__explicitlySet__.add("isUseLatestTemplateVersion");
            return this;
        }
        /** Indicates if Virtio SCSI Support is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isVirtioScsiEnabled")
        private Boolean isVirtioScsiEnabled;

        /**
         * Indicates if Virtio SCSI Support is enabled.
         *
         * @param isVirtioScsiEnabled the value to set
         * @return this builder
         */
        public Builder isVirtioScsiEnabled(Boolean isVirtioScsiEnabled) {
            this.isVirtioScsiEnabled = isVirtioScsiEnabled;
            this.__explicitlySet__.add("isVirtioScsiEnabled");
            return this;
        }
        /**
         * Number of queues for a Virtio-SCSI contoller this field requires
         * virtioScsiMultiQueuesEnabled to be true see virtioScsiMultiQueuesEnabled for more info
         */
        @com.fasterxml.jackson.annotation.JsonProperty("virtioScsiMultiQueues")
        private Integer virtioScsiMultiQueues;

        /**
         * Number of queues for a Virtio-SCSI contoller this field requires
         * virtioScsiMultiQueuesEnabled to be true see virtioScsiMultiQueuesEnabled for more info
         *
         * @param virtioScsiMultiQueues the value to set
         * @return this builder
         */
        public Builder virtioScsiMultiQueues(Integer virtioScsiMultiQueues) {
            this.virtioScsiMultiQueues = virtioScsiMultiQueues;
            this.__explicitlySet__.add("virtioScsiMultiQueues");
            return this;
        }
        /**
         * If true, the Virtio-SCSI devices will obtain a number of multiple queues depending on the
         * available virtual Cpus and disks, or according to the specified virtioScsiMultiQueues
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isVirtioScsiMultiQueuesEnabled")
        private Boolean isVirtioScsiMultiQueuesEnabled;

        /**
         * If true, the Virtio-SCSI devices will obtain a number of multiple queues depending on the
         * available virtual Cpus and disks, or according to the specified virtioScsiMultiQueues
         *
         * @param isVirtioScsiMultiQueuesEnabled the value to set
         * @return this builder
         */
        public Builder isVirtioScsiMultiQueuesEnabled(Boolean isVirtioScsiMultiQueuesEnabled) {
            this.isVirtioScsiMultiQueuesEnabled = isVirtioScsiMultiQueuesEnabled;
            this.__explicitlySet__.add("isVirtioScsiMultiQueuesEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmVirtualMachine build() {
            OlvmVirtualMachine model =
                    new OlvmVirtualMachine(
                            this.autoPinningPolicy,
                            this.bios,
                            this.comment,
                            this.console,
                            this.cpu,
                            this.cpuPinningPolicy,
                            this.cpuShares,
                            this.timeCreated,
                            this.customCompatibilityVersion,
                            this.customCpuModel,
                            this.customEmulatedMachine,
                            this.customProperties,
                            this.isDeleteProtected,
                            this.description,
                            this.display,
                            this.domain,
                            this.fqdn,
                            this.guestOperatingSystem,
                            this.guestTimeZone,
                            this.isContainIllegalImages,
                            this.highAvailability,
                            this.initialization,
                            this.ioThreads,
                            this.largeIcon,
                            this.storageDomainLease,
                            this.memoryInBytes,
                            this.memoryPolicy,
                            this.migrationPolicy,
                            this.migrationDowntimeInMs,
                            this.isMultiQueuesEnabled,
                            this.virtualMachineName,
                            this.isNextRunConfigurationExists,
                            this.numaTuneMode,
                            this.origin,
                            this.os,
                            this.placementPolicy,
                            this.isRunOnce,
                            this.serialNumber,
                            this.smallIcon,
                            this.isSoundcardEnabled,
                            this.isStartPaused,
                            this.timeStart,
                            this.isStateless,
                            this.status,
                            this.statusDetail,
                            this.stopReason,
                            this.timeStop,
                            this.storageErrorResumeBehavior,
                            this.timezone,
                            this.isTpmEnabled,
                            this.isTunnelMigration,
                            this.type,
                            this.usb,
                            this.isUseLatestTemplateVersion,
                            this.isVirtioScsiEnabled,
                            this.virtioScsiMultiQueues,
                            this.isVirtioScsiMultiQueuesEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmVirtualMachine model) {
            if (model.wasPropertyExplicitlySet("autoPinningPolicy")) {
                this.autoPinningPolicy(model.getAutoPinningPolicy());
            }
            if (model.wasPropertyExplicitlySet("bios")) {
                this.bios(model.getBios());
            }
            if (model.wasPropertyExplicitlySet("comment")) {
                this.comment(model.getComment());
            }
            if (model.wasPropertyExplicitlySet("console")) {
                this.console(model.getConsole());
            }
            if (model.wasPropertyExplicitlySet("cpu")) {
                this.cpu(model.getCpu());
            }
            if (model.wasPropertyExplicitlySet("cpuPinningPolicy")) {
                this.cpuPinningPolicy(model.getCpuPinningPolicy());
            }
            if (model.wasPropertyExplicitlySet("cpuShares")) {
                this.cpuShares(model.getCpuShares());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("customCompatibilityVersion")) {
                this.customCompatibilityVersion(model.getCustomCompatibilityVersion());
            }
            if (model.wasPropertyExplicitlySet("customCpuModel")) {
                this.customCpuModel(model.getCustomCpuModel());
            }
            if (model.wasPropertyExplicitlySet("customEmulatedMachine")) {
                this.customEmulatedMachine(model.getCustomEmulatedMachine());
            }
            if (model.wasPropertyExplicitlySet("customProperties")) {
                this.customProperties(model.getCustomProperties());
            }
            if (model.wasPropertyExplicitlySet("isDeleteProtected")) {
                this.isDeleteProtected(model.getIsDeleteProtected());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("display")) {
                this.display(model.getDisplay());
            }
            if (model.wasPropertyExplicitlySet("domain")) {
                this.domain(model.getDomain());
            }
            if (model.wasPropertyExplicitlySet("fqdn")) {
                this.fqdn(model.getFqdn());
            }
            if (model.wasPropertyExplicitlySet("guestOperatingSystem")) {
                this.guestOperatingSystem(model.getGuestOperatingSystem());
            }
            if (model.wasPropertyExplicitlySet("guestTimeZone")) {
                this.guestTimeZone(model.getGuestTimeZone());
            }
            if (model.wasPropertyExplicitlySet("isContainIllegalImages")) {
                this.isContainIllegalImages(model.getIsContainIllegalImages());
            }
            if (model.wasPropertyExplicitlySet("highAvailability")) {
                this.highAvailability(model.getHighAvailability());
            }
            if (model.wasPropertyExplicitlySet("initialization")) {
                this.initialization(model.getInitialization());
            }
            if (model.wasPropertyExplicitlySet("ioThreads")) {
                this.ioThreads(model.getIoThreads());
            }
            if (model.wasPropertyExplicitlySet("largeIcon")) {
                this.largeIcon(model.getLargeIcon());
            }
            if (model.wasPropertyExplicitlySet("storageDomainLease")) {
                this.storageDomainLease(model.getStorageDomainLease());
            }
            if (model.wasPropertyExplicitlySet("memoryInBytes")) {
                this.memoryInBytes(model.getMemoryInBytes());
            }
            if (model.wasPropertyExplicitlySet("memoryPolicy")) {
                this.memoryPolicy(model.getMemoryPolicy());
            }
            if (model.wasPropertyExplicitlySet("migrationPolicy")) {
                this.migrationPolicy(model.getMigrationPolicy());
            }
            if (model.wasPropertyExplicitlySet("migrationDowntimeInMs")) {
                this.migrationDowntimeInMs(model.getMigrationDowntimeInMs());
            }
            if (model.wasPropertyExplicitlySet("isMultiQueuesEnabled")) {
                this.isMultiQueuesEnabled(model.getIsMultiQueuesEnabled());
            }
            if (model.wasPropertyExplicitlySet("virtualMachineName")) {
                this.virtualMachineName(model.getVirtualMachineName());
            }
            if (model.wasPropertyExplicitlySet("isNextRunConfigurationExists")) {
                this.isNextRunConfigurationExists(model.getIsNextRunConfigurationExists());
            }
            if (model.wasPropertyExplicitlySet("numaTuneMode")) {
                this.numaTuneMode(model.getNumaTuneMode());
            }
            if (model.wasPropertyExplicitlySet("origin")) {
                this.origin(model.getOrigin());
            }
            if (model.wasPropertyExplicitlySet("os")) {
                this.os(model.getOs());
            }
            if (model.wasPropertyExplicitlySet("placementPolicy")) {
                this.placementPolicy(model.getPlacementPolicy());
            }
            if (model.wasPropertyExplicitlySet("isRunOnce")) {
                this.isRunOnce(model.getIsRunOnce());
            }
            if (model.wasPropertyExplicitlySet("serialNumber")) {
                this.serialNumber(model.getSerialNumber());
            }
            if (model.wasPropertyExplicitlySet("smallIcon")) {
                this.smallIcon(model.getSmallIcon());
            }
            if (model.wasPropertyExplicitlySet("isSoundcardEnabled")) {
                this.isSoundcardEnabled(model.getIsSoundcardEnabled());
            }
            if (model.wasPropertyExplicitlySet("isStartPaused")) {
                this.isStartPaused(model.getIsStartPaused());
            }
            if (model.wasPropertyExplicitlySet("timeStart")) {
                this.timeStart(model.getTimeStart());
            }
            if (model.wasPropertyExplicitlySet("isStateless")) {
                this.isStateless(model.getIsStateless());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("statusDetail")) {
                this.statusDetail(model.getStatusDetail());
            }
            if (model.wasPropertyExplicitlySet("stopReason")) {
                this.stopReason(model.getStopReason());
            }
            if (model.wasPropertyExplicitlySet("timeStop")) {
                this.timeStop(model.getTimeStop());
            }
            if (model.wasPropertyExplicitlySet("storageErrorResumeBehavior")) {
                this.storageErrorResumeBehavior(model.getStorageErrorResumeBehavior());
            }
            if (model.wasPropertyExplicitlySet("timezone")) {
                this.timezone(model.getTimezone());
            }
            if (model.wasPropertyExplicitlySet("isTpmEnabled")) {
                this.isTpmEnabled(model.getIsTpmEnabled());
            }
            if (model.wasPropertyExplicitlySet("isTunnelMigration")) {
                this.isTunnelMigration(model.getIsTunnelMigration());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("usb")) {
                this.usb(model.getUsb());
            }
            if (model.wasPropertyExplicitlySet("isUseLatestTemplateVersion")) {
                this.isUseLatestTemplateVersion(model.getIsUseLatestTemplateVersion());
            }
            if (model.wasPropertyExplicitlySet("isVirtioScsiEnabled")) {
                this.isVirtioScsiEnabled(model.getIsVirtioScsiEnabled());
            }
            if (model.wasPropertyExplicitlySet("virtioScsiMultiQueues")) {
                this.virtioScsiMultiQueues(model.getVirtioScsiMultiQueues());
            }
            if (model.wasPropertyExplicitlySet("isVirtioScsiMultiQueuesEnabled")) {
                this.isVirtioScsiMultiQueuesEnabled(model.getIsVirtioScsiMultiQueuesEnabled());
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

    /** Specifies if and how the auto CPU and NUMA configuration is applied. */
    public enum AutoPinningPolicy implements com.oracle.bmc.http.internal.BmcEnum {
        Adjust("ADJUST"),
        Disabled("DISABLED"),
        Existing("EXISTING"),
        ;

        private final String value;
        private static java.util.Map<String, AutoPinningPolicy> map;

        static {
            map = new java.util.HashMap<>();
            for (AutoPinningPolicy v : AutoPinningPolicy.values()) {
                map.put(v.getValue(), v);
            }
        }

        AutoPinningPolicy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AutoPinningPolicy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AutoPinningPolicy: " + key);
        }
    };
    /** Specifies if and how the auto CPU and NUMA configuration is applied. */
    @com.fasterxml.jackson.annotation.JsonProperty("autoPinningPolicy")
    private final AutoPinningPolicy autoPinningPolicy;

    /**
     * Specifies if and how the auto CPU and NUMA configuration is applied.
     *
     * @return the value
     */
    public AutoPinningPolicy getAutoPinningPolicy() {
        return autoPinningPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("bios")
    private final OlvmBios bios;

    public OlvmBios getBios() {
        return bios;
    }

    /** Free text containing comments about this object. */
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    private final String comment;

    /**
     * Free text containing comments about this object.
     *
     * @return the value
     */
    public String getComment() {
        return comment;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("console")
    private final OlvmConsole console;

    public OlvmConsole getConsole() {
        return console;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cpu")
    private final OlvmCpu cpu;

    public OlvmCpu getCpu() {
        return cpu;
    }

    /** Type representing the CPU and NUMA pinning policy. */
    public enum CpuPinningPolicy implements com.oracle.bmc.http.internal.BmcEnum {
        Dedicated("DEDICATED"),
        IsolatedThreads("ISOLATED_THREADS"),
        Manual("MANUAL"),
        None("NONE"),
        ResizeAndPinNuma("RESIZE_AND_PIN_NUMA"),
        ;

        private final String value;
        private static java.util.Map<String, CpuPinningPolicy> map;

        static {
            map = new java.util.HashMap<>();
            for (CpuPinningPolicy v : CpuPinningPolicy.values()) {
                map.put(v.getValue(), v);
            }
        }

        CpuPinningPolicy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CpuPinningPolicy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid CpuPinningPolicy: " + key);
        }
    };
    /** Type representing the CPU and NUMA pinning policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuPinningPolicy")
    private final CpuPinningPolicy cpuPinningPolicy;

    /**
     * Type representing the CPU and NUMA pinning policy.
     *
     * @return the value
     */
    public CpuPinningPolicy getCpuPinningPolicy() {
        return cpuPinningPolicy;
    }

    /** Number of CPU Shares */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuShares")
    private final Integer cpuShares;

    /**
     * Number of CPU Shares
     *
     * @return the value
     */
    public Integer getCpuShares() {
        return cpuShares;
    }

    /** Creation time. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Creation time.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("customCompatibilityVersion")
    private final OlvmVersion customCompatibilityVersion;

    public OlvmVersion getCustomCompatibilityVersion() {
        return customCompatibilityVersion;
    }

    /** Custom CPU model */
    @com.fasterxml.jackson.annotation.JsonProperty("customCpuModel")
    private final String customCpuModel;

    /**
     * Custom CPU model
     *
     * @return the value
     */
    public String getCustomCpuModel() {
        return customCpuModel;
    }

    /** Custom Emulated machine */
    @com.fasterxml.jackson.annotation.JsonProperty("customEmulatedMachine")
    private final String customEmulatedMachine;

    /**
     * Custom Emulated machine
     *
     * @return the value
     */
    public String getCustomEmulatedMachine() {
        return customEmulatedMachine;
    }

    /** Custom properties applied to the vNIC profile. */
    @com.fasterxml.jackson.annotation.JsonProperty("customProperties")
    private final java.util.List<OlvmCustomProperty> customProperties;

    /**
     * Custom properties applied to the vNIC profile.
     *
     * @return the value
     */
    public java.util.List<OlvmCustomProperty> getCustomProperties() {
        return customProperties;
    }

    /** If true, the virtual machine cannot be deleted. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDeleteProtected")
    private final Boolean isDeleteProtected;

    /**
     * If true, the virtual machine cannot be deleted.
     *
     * @return the value
     */
    public Boolean getIsDeleteProtected() {
        return isDeleteProtected;
    }

    /** A human-readable description in plain text. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A human-readable description in plain text.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("display")
    private final OlvmDisplay display;

    public OlvmDisplay getDisplay() {
        return display;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    private final OlvmDomain domain;

    public OlvmDomain getDomain() {
        return domain;
    }

    /** Fully qualified domain name of the virtual machine. */
    @com.fasterxml.jackson.annotation.JsonProperty("fqdn")
    private final String fqdn;

    /**
     * Fully qualified domain name of the virtual machine.
     *
     * @return the value
     */
    public String getFqdn() {
        return fqdn;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("guestOperatingSystem")
    private final OlvmGuestOperatingSystem guestOperatingSystem;

    public OlvmGuestOperatingSystem getGuestOperatingSystem() {
        return guestOperatingSystem;
    }

    /** What time zone is used by the virtual machine (as returned by guest agent). */
    @com.fasterxml.jackson.annotation.JsonProperty("guestTimeZone")
    private final String guestTimeZone;

    /**
     * What time zone is used by the virtual machine (as returned by guest agent).
     *
     * @return the value
     */
    public String getGuestTimeZone() {
        return guestTimeZone;
    }

    /** Indicates whether the virtual machine has snapshots with disks in ILLEGAL state. */
    @com.fasterxml.jackson.annotation.JsonProperty("isContainIllegalImages")
    private final Boolean isContainIllegalImages;

    /**
     * Indicates whether the virtual machine has snapshots with disks in ILLEGAL state.
     *
     * @return the value
     */
    public Boolean getIsContainIllegalImages() {
        return isContainIllegalImages;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("highAvailability")
    private final OlvmHighAvailability highAvailability;

    public OlvmHighAvailability getHighAvailability() {
        return highAvailability;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("initialization")
    private final OlvmInitialization initialization;

    public OlvmInitialization getInitialization() {
        return initialization;
    }

    /** For performance tuning of IO threading. */
    @com.fasterxml.jackson.annotation.JsonProperty("ioThreads")
    private final Integer ioThreads;

    /**
     * For performance tuning of IO threading.
     *
     * @return the value
     */
    public Integer getIoThreads() {
        return ioThreads;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("largeIcon")
    private final OlvmIcon largeIcon;

    public OlvmIcon getLargeIcon() {
        return largeIcon;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("storageDomainLease")
    private final OlvmStorageDomainProperties storageDomainLease;

    public OlvmStorageDomainProperties getStorageDomainLease() {
        return storageDomainLease;
    }

    /** The virtual machine???s memory, in bytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInBytes")
    private final Long memoryInBytes;

    /**
     * The virtual machine???s memory, in bytes.
     *
     * @return the value
     */
    public Long getMemoryInBytes() {
        return memoryInBytes;
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
     * Maximum time the virtual machine can be non responsive during its live migration to another
     * host in ms.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("migrationDowntimeInMs")
    private final Integer migrationDowntimeInMs;

    /**
     * Maximum time the virtual machine can be non responsive during its live migration to another
     * host in ms.
     *
     * @return the value
     */
    public Integer getMigrationDowntimeInMs() {
        return migrationDowntimeInMs;
    }

    /**
     * If true, each virtual interface will get the optimal number of queues, depending on the
     * available virtual Cpus.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isMultiQueuesEnabled")
    private final Boolean isMultiQueuesEnabled;

    /**
     * If true, each virtual interface will get the optimal number of queues, depending on the
     * available virtual Cpus.
     *
     * @return the value
     */
    public Boolean getIsMultiQueuesEnabled() {
        return isMultiQueuesEnabled;
    }

    /** Name of the property. */
    @com.fasterxml.jackson.annotation.JsonProperty("virtualMachineName")
    private final String virtualMachineName;

    /**
     * Name of the property.
     *
     * @return the value
     */
    public String getVirtualMachineName() {
        return virtualMachineName;
    }

    /**
     * Indicates if virtual machine configuration has been changed and requires restart of the
     * virtual machine.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isNextRunConfigurationExists")
    private final Boolean isNextRunConfigurationExists;

    /**
     * Indicates if virtual machine configuration has been changed and requires restart of the
     * virtual machine.
     *
     * @return the value
     */
    public Boolean getIsNextRunConfigurationExists() {
        return isNextRunConfigurationExists;
    }

    /** How the NUMA topology is applied. */
    public enum NumaTuneMode implements com.oracle.bmc.http.internal.BmcEnum {
        Interleave("INTERLEAVE"),
        Preferred("PREFERRED"),
        Strict("STRICT"),
        ;

        private final String value;
        private static java.util.Map<String, NumaTuneMode> map;

        static {
            map = new java.util.HashMap<>();
            for (NumaTuneMode v : NumaTuneMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        NumaTuneMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NumaTuneMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid NumaTuneMode: " + key);
        }
    };
    /** How the NUMA topology is applied. */
    @com.fasterxml.jackson.annotation.JsonProperty("numaTuneMode")
    private final NumaTuneMode numaTuneMode;

    /**
     * How the NUMA topology is applied.
     *
     * @return the value
     */
    public NumaTuneMode getNumaTuneMode() {
        return numaTuneMode;
    }

    /** The origin of this virtual machine. */
    @com.fasterxml.jackson.annotation.JsonProperty("origin")
    private final String origin;

    /**
     * The origin of this virtual machine.
     *
     * @return the value
     */
    public String getOrigin() {
        return origin;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("os")
    private final OlvmOperatingSystem os;

    public OlvmOperatingSystem getOs() {
        return os;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("placementPolicy")
    private final OlvmVmPlacementPolicy placementPolicy;

    public OlvmVmPlacementPolicy getPlacementPolicy() {
        return placementPolicy;
    }

    /**
     * If true, the virtual machine has been started using the run once command, meaning it???s
     * configuration might differ from the stored one for the purpose of this single run.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRunOnce")
    private final Boolean isRunOnce;

    /**
     * If true, the virtual machine has been started using the run once command, meaning it???s
     * configuration might differ from the stored one for the purpose of this single run.
     *
     * @return the value
     */
    public Boolean getIsRunOnce() {
        return isRunOnce;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
    private final OlvmSerialNumber serialNumber;

    public OlvmSerialNumber getSerialNumber() {
        return serialNumber;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("smallIcon")
    private final OlvmIcon smallIcon;

    public OlvmIcon getSmallIcon() {
        return smallIcon;
    }

    /** If true, the sound card is added to the virtual machine. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSoundcardEnabled")
    private final Boolean isSoundcardEnabled;

    /**
     * If true, the sound card is added to the virtual machine.
     *
     * @return the value
     */
    public Boolean getIsSoundcardEnabled() {
        return isSoundcardEnabled;
    }

    /** If true, the virtual machine will be initially in 'paused' state after start. */
    @com.fasterxml.jackson.annotation.JsonProperty("isStartPaused")
    private final Boolean isStartPaused;

    /**
     * If true, the virtual machine will be initially in 'paused' state after start.
     *
     * @return the value
     */
    public Boolean getIsStartPaused() {
        return isStartPaused;
    }

    /** The date in which the virtual machine was started. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    /**
     * The date in which the virtual machine was started.
     *
     * @return the value
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /**
     * If true, the virtual machine is stateless - it???s state (disks) are rolled-back after
     * shutdown.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isStateless")
    private final Boolean isStateless;

    /**
     * If true, the virtual machine is stateless - it???s state (disks) are rolled-back after
     * shutdown.
     *
     * @return the value
     */
    public Boolean getIsStateless() {
        return isStateless;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final OlvmVmStatus status;

    public OlvmVmStatus getStatus() {
        return status;
    }

    /** Human readable detail of current status. */
    @com.fasterxml.jackson.annotation.JsonProperty("statusDetail")
    private final String statusDetail;

    /**
     * Human readable detail of current status.
     *
     * @return the value
     */
    public String getStatusDetail() {
        return statusDetail;
    }

    /** The reason the virtual machine was stopped. */
    @com.fasterxml.jackson.annotation.JsonProperty("stopReason")
    private final String stopReason;

    /**
     * The reason the virtual machine was stopped.
     *
     * @return the value
     */
    public String getStopReason() {
        return stopReason;
    }

    /** The date in which the virtual machine was stopped. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStop")
    private final java.util.Date timeStop;

    /**
     * The date in which the virtual machine was stopped.
     *
     * @return the value
     */
    public java.util.Date getTimeStop() {
        return timeStop;
    }

    /** Determines how the virtual machine will be resumed after storage error. */
    public enum StorageErrorResumeBehavior implements com.oracle.bmc.http.internal.BmcEnum {
        AutoResume("AUTO_RESUME"),
        Kill("KILL"),
        LeavePaused("LEAVE_PAUSED"),
        ;

        private final String value;
        private static java.util.Map<String, StorageErrorResumeBehavior> map;

        static {
            map = new java.util.HashMap<>();
            for (StorageErrorResumeBehavior v : StorageErrorResumeBehavior.values()) {
                map.put(v.getValue(), v);
            }
        }

        StorageErrorResumeBehavior(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StorageErrorResumeBehavior create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid StorageErrorResumeBehavior: " + key);
        }
    };
    /** Determines how the virtual machine will be resumed after storage error. */
    @com.fasterxml.jackson.annotation.JsonProperty("storageErrorResumeBehavior")
    private final StorageErrorResumeBehavior storageErrorResumeBehavior;

    /**
     * Determines how the virtual machine will be resumed after storage error.
     *
     * @return the value
     */
    public StorageErrorResumeBehavior getStorageErrorResumeBehavior() {
        return storageErrorResumeBehavior;
    }

    /** Name of time zone. */
    @com.fasterxml.jackson.annotation.JsonProperty("timezone")
    private final String timezone;

    /**
     * Name of time zone.
     *
     * @return the value
     */
    public String getTimezone() {
        return timezone;
    }

    /** If true, a TPM device is added to the virtual machine. */
    @com.fasterxml.jackson.annotation.JsonProperty("isTpmEnabled")
    private final Boolean isTpmEnabled;

    /**
     * If true, a TPM device is added to the virtual machine.
     *
     * @return the value
     */
    public Boolean getIsTpmEnabled() {
        return isTpmEnabled;
    }

    /**
     * If true, the network data transfer will be encrypted during virtual machine live migration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isTunnelMigration")
    private final Boolean isTunnelMigration;

    /**
     * If true, the network data transfer will be encrypted during virtual machine live migration.
     *
     * @return the value
     */
    public Boolean getIsTunnelMigration() {
        return isTunnelMigration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final OlvmVmType type;

    public OlvmVmType getType() {
        return type;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("usb")
    private final OlvmUsb usb;

    public OlvmUsb getUsb() {
        return usb;
    }

    /**
     * If true, the virtual machine is reconfigured to the latest version of it???s template when it
     * is started.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isUseLatestTemplateVersion")
    private final Boolean isUseLatestTemplateVersion;

    /**
     * If true, the virtual machine is reconfigured to the latest version of it???s template when it
     * is started.
     *
     * @return the value
     */
    public Boolean getIsUseLatestTemplateVersion() {
        return isUseLatestTemplateVersion;
    }

    /** Indicates if Virtio SCSI Support is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isVirtioScsiEnabled")
    private final Boolean isVirtioScsiEnabled;

    /**
     * Indicates if Virtio SCSI Support is enabled.
     *
     * @return the value
     */
    public Boolean getIsVirtioScsiEnabled() {
        return isVirtioScsiEnabled;
    }

    /**
     * Number of queues for a Virtio-SCSI contoller this field requires virtioScsiMultiQueuesEnabled
     * to be true see virtioScsiMultiQueuesEnabled for more info
     */
    @com.fasterxml.jackson.annotation.JsonProperty("virtioScsiMultiQueues")
    private final Integer virtioScsiMultiQueues;

    /**
     * Number of queues for a Virtio-SCSI contoller this field requires virtioScsiMultiQueuesEnabled
     * to be true see virtioScsiMultiQueuesEnabled for more info
     *
     * @return the value
     */
    public Integer getVirtioScsiMultiQueues() {
        return virtioScsiMultiQueues;
    }

    /**
     * If true, the Virtio-SCSI devices will obtain a number of multiple queues depending on the
     * available virtual Cpus and disks, or according to the specified virtioScsiMultiQueues
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isVirtioScsiMultiQueuesEnabled")
    private final Boolean isVirtioScsiMultiQueuesEnabled;

    /**
     * If true, the Virtio-SCSI devices will obtain a number of multiple queues depending on the
     * available virtual Cpus and disks, or according to the specified virtioScsiMultiQueues
     *
     * @return the value
     */
    public Boolean getIsVirtioScsiMultiQueuesEnabled() {
        return isVirtioScsiMultiQueuesEnabled;
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
        sb.append("OlvmVirtualMachine(");
        sb.append("super=").append(super.toString());
        sb.append("autoPinningPolicy=").append(String.valueOf(this.autoPinningPolicy));
        sb.append(", bios=").append(String.valueOf(this.bios));
        sb.append(", comment=").append(String.valueOf(this.comment));
        sb.append(", console=").append(String.valueOf(this.console));
        sb.append(", cpu=").append(String.valueOf(this.cpu));
        sb.append(", cpuPinningPolicy=").append(String.valueOf(this.cpuPinningPolicy));
        sb.append(", cpuShares=").append(String.valueOf(this.cpuShares));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", customCompatibilityVersion=")
                .append(String.valueOf(this.customCompatibilityVersion));
        sb.append(", customCpuModel=").append(String.valueOf(this.customCpuModel));
        sb.append(", customEmulatedMachine=").append(String.valueOf(this.customEmulatedMachine));
        sb.append(", customProperties=").append(String.valueOf(this.customProperties));
        sb.append(", isDeleteProtected=").append(String.valueOf(this.isDeleteProtected));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", display=").append(String.valueOf(this.display));
        sb.append(", domain=").append(String.valueOf(this.domain));
        sb.append(", fqdn=").append(String.valueOf(this.fqdn));
        sb.append(", guestOperatingSystem=").append(String.valueOf(this.guestOperatingSystem));
        sb.append(", guestTimeZone=").append(String.valueOf(this.guestTimeZone));
        sb.append(", isContainIllegalImages=").append(String.valueOf(this.isContainIllegalImages));
        sb.append(", highAvailability=").append(String.valueOf(this.highAvailability));
        sb.append(", initialization=").append(String.valueOf(this.initialization));
        sb.append(", ioThreads=").append(String.valueOf(this.ioThreads));
        sb.append(", largeIcon=").append(String.valueOf(this.largeIcon));
        sb.append(", storageDomainLease=").append(String.valueOf(this.storageDomainLease));
        sb.append(", memoryInBytes=").append(String.valueOf(this.memoryInBytes));
        sb.append(", memoryPolicy=").append(String.valueOf(this.memoryPolicy));
        sb.append(", migrationPolicy=").append(String.valueOf(this.migrationPolicy));
        sb.append(", migrationDowntimeInMs=").append(String.valueOf(this.migrationDowntimeInMs));
        sb.append(", isMultiQueuesEnabled=").append(String.valueOf(this.isMultiQueuesEnabled));
        sb.append(", virtualMachineName=").append(String.valueOf(this.virtualMachineName));
        sb.append(", isNextRunConfigurationExists=")
                .append(String.valueOf(this.isNextRunConfigurationExists));
        sb.append(", numaTuneMode=").append(String.valueOf(this.numaTuneMode));
        sb.append(", origin=").append(String.valueOf(this.origin));
        sb.append(", os=").append(String.valueOf(this.os));
        sb.append(", placementPolicy=").append(String.valueOf(this.placementPolicy));
        sb.append(", isRunOnce=").append(String.valueOf(this.isRunOnce));
        sb.append(", serialNumber=").append(String.valueOf(this.serialNumber));
        sb.append(", smallIcon=").append(String.valueOf(this.smallIcon));
        sb.append(", isSoundcardEnabled=").append(String.valueOf(this.isSoundcardEnabled));
        sb.append(", isStartPaused=").append(String.valueOf(this.isStartPaused));
        sb.append(", timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", isStateless=").append(String.valueOf(this.isStateless));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", statusDetail=").append(String.valueOf(this.statusDetail));
        sb.append(", stopReason=").append(String.valueOf(this.stopReason));
        sb.append(", timeStop=").append(String.valueOf(this.timeStop));
        sb.append(", storageErrorResumeBehavior=")
                .append(String.valueOf(this.storageErrorResumeBehavior));
        sb.append(", timezone=").append(String.valueOf(this.timezone));
        sb.append(", isTpmEnabled=").append(String.valueOf(this.isTpmEnabled));
        sb.append(", isTunnelMigration=").append(String.valueOf(this.isTunnelMigration));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", usb=").append(String.valueOf(this.usb));
        sb.append(", isUseLatestTemplateVersion=")
                .append(String.valueOf(this.isUseLatestTemplateVersion));
        sb.append(", isVirtioScsiEnabled=").append(String.valueOf(this.isVirtioScsiEnabled));
        sb.append(", virtioScsiMultiQueues=").append(String.valueOf(this.virtioScsiMultiQueues));
        sb.append(", isVirtioScsiMultiQueuesEnabled=")
                .append(String.valueOf(this.isVirtioScsiMultiQueuesEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmVirtualMachine)) {
            return false;
        }

        OlvmVirtualMachine other = (OlvmVirtualMachine) o;
        return java.util.Objects.equals(this.autoPinningPolicy, other.autoPinningPolicy)
                && java.util.Objects.equals(this.bios, other.bios)
                && java.util.Objects.equals(this.comment, other.comment)
                && java.util.Objects.equals(this.console, other.console)
                && java.util.Objects.equals(this.cpu, other.cpu)
                && java.util.Objects.equals(this.cpuPinningPolicy, other.cpuPinningPolicy)
                && java.util.Objects.equals(this.cpuShares, other.cpuShares)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(
                        this.customCompatibilityVersion, other.customCompatibilityVersion)
                && java.util.Objects.equals(this.customCpuModel, other.customCpuModel)
                && java.util.Objects.equals(this.customEmulatedMachine, other.customEmulatedMachine)
                && java.util.Objects.equals(this.customProperties, other.customProperties)
                && java.util.Objects.equals(this.isDeleteProtected, other.isDeleteProtected)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.display, other.display)
                && java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(this.fqdn, other.fqdn)
                && java.util.Objects.equals(this.guestOperatingSystem, other.guestOperatingSystem)
                && java.util.Objects.equals(this.guestTimeZone, other.guestTimeZone)
                && java.util.Objects.equals(
                        this.isContainIllegalImages, other.isContainIllegalImages)
                && java.util.Objects.equals(this.highAvailability, other.highAvailability)
                && java.util.Objects.equals(this.initialization, other.initialization)
                && java.util.Objects.equals(this.ioThreads, other.ioThreads)
                && java.util.Objects.equals(this.largeIcon, other.largeIcon)
                && java.util.Objects.equals(this.storageDomainLease, other.storageDomainLease)
                && java.util.Objects.equals(this.memoryInBytes, other.memoryInBytes)
                && java.util.Objects.equals(this.memoryPolicy, other.memoryPolicy)
                && java.util.Objects.equals(this.migrationPolicy, other.migrationPolicy)
                && java.util.Objects.equals(this.migrationDowntimeInMs, other.migrationDowntimeInMs)
                && java.util.Objects.equals(this.isMultiQueuesEnabled, other.isMultiQueuesEnabled)
                && java.util.Objects.equals(this.virtualMachineName, other.virtualMachineName)
                && java.util.Objects.equals(
                        this.isNextRunConfigurationExists, other.isNextRunConfigurationExists)
                && java.util.Objects.equals(this.numaTuneMode, other.numaTuneMode)
                && java.util.Objects.equals(this.origin, other.origin)
                && java.util.Objects.equals(this.os, other.os)
                && java.util.Objects.equals(this.placementPolicy, other.placementPolicy)
                && java.util.Objects.equals(this.isRunOnce, other.isRunOnce)
                && java.util.Objects.equals(this.serialNumber, other.serialNumber)
                && java.util.Objects.equals(this.smallIcon, other.smallIcon)
                && java.util.Objects.equals(this.isSoundcardEnabled, other.isSoundcardEnabled)
                && java.util.Objects.equals(this.isStartPaused, other.isStartPaused)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.isStateless, other.isStateless)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.statusDetail, other.statusDetail)
                && java.util.Objects.equals(this.stopReason, other.stopReason)
                && java.util.Objects.equals(this.timeStop, other.timeStop)
                && java.util.Objects.equals(
                        this.storageErrorResumeBehavior, other.storageErrorResumeBehavior)
                && java.util.Objects.equals(this.timezone, other.timezone)
                && java.util.Objects.equals(this.isTpmEnabled, other.isTpmEnabled)
                && java.util.Objects.equals(this.isTunnelMigration, other.isTunnelMigration)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.usb, other.usb)
                && java.util.Objects.equals(
                        this.isUseLatestTemplateVersion, other.isUseLatestTemplateVersion)
                && java.util.Objects.equals(this.isVirtioScsiEnabled, other.isVirtioScsiEnabled)
                && java.util.Objects.equals(this.virtioScsiMultiQueues, other.virtioScsiMultiQueues)
                && java.util.Objects.equals(
                        this.isVirtioScsiMultiQueuesEnabled, other.isVirtioScsiMultiQueuesEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.autoPinningPolicy == null ? 43 : this.autoPinningPolicy.hashCode());
        result = (result * PRIME) + (this.bios == null ? 43 : this.bios.hashCode());
        result = (result * PRIME) + (this.comment == null ? 43 : this.comment.hashCode());
        result = (result * PRIME) + (this.console == null ? 43 : this.console.hashCode());
        result = (result * PRIME) + (this.cpu == null ? 43 : this.cpu.hashCode());
        result =
                (result * PRIME)
                        + (this.cpuPinningPolicy == null ? 43 : this.cpuPinningPolicy.hashCode());
        result = (result * PRIME) + (this.cpuShares == null ? 43 : this.cpuShares.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.customCompatibilityVersion == null
                                ? 43
                                : this.customCompatibilityVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.customCpuModel == null ? 43 : this.customCpuModel.hashCode());
        result =
                (result * PRIME)
                        + (this.customEmulatedMachine == null
                                ? 43
                                : this.customEmulatedMachine.hashCode());
        result =
                (result * PRIME)
                        + (this.customProperties == null ? 43 : this.customProperties.hashCode());
        result =
                (result * PRIME)
                        + (this.isDeleteProtected == null ? 43 : this.isDeleteProtected.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.display == null ? 43 : this.display.hashCode());
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result = (result * PRIME) + (this.fqdn == null ? 43 : this.fqdn.hashCode());
        result =
                (result * PRIME)
                        + (this.guestOperatingSystem == null
                                ? 43
                                : this.guestOperatingSystem.hashCode());
        result =
                (result * PRIME)
                        + (this.guestTimeZone == null ? 43 : this.guestTimeZone.hashCode());
        result =
                (result * PRIME)
                        + (this.isContainIllegalImages == null
                                ? 43
                                : this.isContainIllegalImages.hashCode());
        result =
                (result * PRIME)
                        + (this.highAvailability == null ? 43 : this.highAvailability.hashCode());
        result =
                (result * PRIME)
                        + (this.initialization == null ? 43 : this.initialization.hashCode());
        result = (result * PRIME) + (this.ioThreads == null ? 43 : this.ioThreads.hashCode());
        result = (result * PRIME) + (this.largeIcon == null ? 43 : this.largeIcon.hashCode());
        result =
                (result * PRIME)
                        + (this.storageDomainLease == null
                                ? 43
                                : this.storageDomainLease.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryInBytes == null ? 43 : this.memoryInBytes.hashCode());
        result = (result * PRIME) + (this.memoryPolicy == null ? 43 : this.memoryPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.migrationPolicy == null ? 43 : this.migrationPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.migrationDowntimeInMs == null
                                ? 43
                                : this.migrationDowntimeInMs.hashCode());
        result =
                (result * PRIME)
                        + (this.isMultiQueuesEnabled == null
                                ? 43
                                : this.isMultiQueuesEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.virtualMachineName == null
                                ? 43
                                : this.virtualMachineName.hashCode());
        result =
                (result * PRIME)
                        + (this.isNextRunConfigurationExists == null
                                ? 43
                                : this.isNextRunConfigurationExists.hashCode());
        result = (result * PRIME) + (this.numaTuneMode == null ? 43 : this.numaTuneMode.hashCode());
        result = (result * PRIME) + (this.origin == null ? 43 : this.origin.hashCode());
        result = (result * PRIME) + (this.os == null ? 43 : this.os.hashCode());
        result =
                (result * PRIME)
                        + (this.placementPolicy == null ? 43 : this.placementPolicy.hashCode());
        result = (result * PRIME) + (this.isRunOnce == null ? 43 : this.isRunOnce.hashCode());
        result = (result * PRIME) + (this.serialNumber == null ? 43 : this.serialNumber.hashCode());
        result = (result * PRIME) + (this.smallIcon == null ? 43 : this.smallIcon.hashCode());
        result =
                (result * PRIME)
                        + (this.isSoundcardEnabled == null
                                ? 43
                                : this.isSoundcardEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isStartPaused == null ? 43 : this.isStartPaused.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.isStateless == null ? 43 : this.isStateless.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.statusDetail == null ? 43 : this.statusDetail.hashCode());
        result = (result * PRIME) + (this.stopReason == null ? 43 : this.stopReason.hashCode());
        result = (result * PRIME) + (this.timeStop == null ? 43 : this.timeStop.hashCode());
        result =
                (result * PRIME)
                        + (this.storageErrorResumeBehavior == null
                                ? 43
                                : this.storageErrorResumeBehavior.hashCode());
        result = (result * PRIME) + (this.timezone == null ? 43 : this.timezone.hashCode());
        result = (result * PRIME) + (this.isTpmEnabled == null ? 43 : this.isTpmEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isTunnelMigration == null ? 43 : this.isTunnelMigration.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.usb == null ? 43 : this.usb.hashCode());
        result =
                (result * PRIME)
                        + (this.isUseLatestTemplateVersion == null
                                ? 43
                                : this.isUseLatestTemplateVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.isVirtioScsiEnabled == null
                                ? 43
                                : this.isVirtioScsiEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.virtioScsiMultiQueues == null
                                ? 43
                                : this.virtioScsiMultiQueues.hashCode());
        result =
                (result * PRIME)
                        + (this.isVirtioScsiMultiQueuesEnabled == null
                                ? 43
                                : this.isVirtioScsiMultiQueuesEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
