/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Compute related properties.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ComputeProperties.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ComputeProperties extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "primaryIp",
        "dnsName",
        "description",
        "coresCount",
        "cpuModel",
        "gpuDevicesCount",
        "gpuDevices",
        "threadsPerCoreCount",
        "memoryInMBs",
        "isPmemEnabled",
        "pmemInMBs",
        "operatingSystem",
        "operatingSystemVersion",
        "hostName",
        "powerState",
        "guestState",
        "isTpmEnabled",
        "connectedNetworks",
        "nicsCount",
        "nics",
        "storageProvisionedInMBs",
        "disksCount",
        "disks",
        "firmware",
        "latencySensitivity",
        "nvdimms",
        "nvdimmController",
        "scsiController",
        "hardwareVersion"
    })
    public ComputeProperties(
            String primaryIp,
            String dnsName,
            String description,
            Integer coresCount,
            String cpuModel,
            Integer gpuDevicesCount,
            java.util.List<GpuDevice> gpuDevices,
            Integer threadsPerCoreCount,
            Long memoryInMBs,
            Boolean isPmemEnabled,
            Long pmemInMBs,
            String operatingSystem,
            String operatingSystemVersion,
            String hostName,
            String powerState,
            String guestState,
            Boolean isTpmEnabled,
            Integer connectedNetworks,
            Integer nicsCount,
            java.util.List<Nic> nics,
            Long storageProvisionedInMBs,
            Integer disksCount,
            java.util.List<Disk> disks,
            String firmware,
            String latencySensitivity,
            java.util.List<Nvdimm> nvdimms,
            NvdimmController nvdimmController,
            ScsiController scsiController,
            String hardwareVersion) {
        super();
        this.primaryIp = primaryIp;
        this.dnsName = dnsName;
        this.description = description;
        this.coresCount = coresCount;
        this.cpuModel = cpuModel;
        this.gpuDevicesCount = gpuDevicesCount;
        this.gpuDevices = gpuDevices;
        this.threadsPerCoreCount = threadsPerCoreCount;
        this.memoryInMBs = memoryInMBs;
        this.isPmemEnabled = isPmemEnabled;
        this.pmemInMBs = pmemInMBs;
        this.operatingSystem = operatingSystem;
        this.operatingSystemVersion = operatingSystemVersion;
        this.hostName = hostName;
        this.powerState = powerState;
        this.guestState = guestState;
        this.isTpmEnabled = isTpmEnabled;
        this.connectedNetworks = connectedNetworks;
        this.nicsCount = nicsCount;
        this.nics = nics;
        this.storageProvisionedInMBs = storageProvisionedInMBs;
        this.disksCount = disksCount;
        this.disks = disks;
        this.firmware = firmware;
        this.latencySensitivity = latencySensitivity;
        this.nvdimms = nvdimms;
        this.nvdimmController = nvdimmController;
        this.scsiController = scsiController;
        this.hardwareVersion = hardwareVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Primary IP address of the compute instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("primaryIp")
        private String primaryIp;

        /**
         * Primary IP address of the compute instance.
         * @param primaryIp the value to set
         * @return this builder
         **/
        public Builder primaryIp(String primaryIp) {
            this.primaryIp = primaryIp;
            this.__explicitlySet__.add("primaryIp");
            return this;
        }
        /**
         * Fully Qualified DNS Name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dnsName")
        private String dnsName;

        /**
         * Fully Qualified DNS Name.
         * @param dnsName the value to set
         * @return this builder
         **/
        public Builder dnsName(String dnsName) {
            this.dnsName = dnsName;
            this.__explicitlySet__.add("dnsName");
            return this;
        }
        /**
         * Information about the asset.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Information about the asset.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Number of CPUs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("coresCount")
        private Integer coresCount;

        /**
         * Number of CPUs.
         * @param coresCount the value to set
         * @return this builder
         **/
        public Builder coresCount(Integer coresCount) {
            this.coresCount = coresCount;
            this.__explicitlySet__.add("coresCount");
            return this;
        }
        /**
         * CPU model name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuModel")
        private String cpuModel;

        /**
         * CPU model name.
         * @param cpuModel the value to set
         * @return this builder
         **/
        public Builder cpuModel(String cpuModel) {
            this.cpuModel = cpuModel;
            this.__explicitlySet__.add("cpuModel");
            return this;
        }
        /**
         * Number of GPU devices.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("gpuDevicesCount")
        private Integer gpuDevicesCount;

        /**
         * Number of GPU devices.
         * @param gpuDevicesCount the value to set
         * @return this builder
         **/
        public Builder gpuDevicesCount(Integer gpuDevicesCount) {
            this.gpuDevicesCount = gpuDevicesCount;
            this.__explicitlySet__.add("gpuDevicesCount");
            return this;
        }
        /**
         * List of GPU devices attached to a virtual machine.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("gpuDevices")
        private java.util.List<GpuDevice> gpuDevices;

        /**
         * List of GPU devices attached to a virtual machine.
         * @param gpuDevices the value to set
         * @return this builder
         **/
        public Builder gpuDevices(java.util.List<GpuDevice> gpuDevices) {
            this.gpuDevices = gpuDevices;
            this.__explicitlySet__.add("gpuDevices");
            return this;
        }
        /**
         * Number of threads per core.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("threadsPerCoreCount")
        private Integer threadsPerCoreCount;

        /**
         * Number of threads per core.
         * @param threadsPerCoreCount the value to set
         * @return this builder
         **/
        public Builder threadsPerCoreCount(Integer threadsPerCoreCount) {
            this.threadsPerCoreCount = threadsPerCoreCount;
            this.__explicitlySet__.add("threadsPerCoreCount");
            return this;
        }
        /**
         * Memory size in MBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("memoryInMBs")
        private Long memoryInMBs;

        /**
         * Memory size in MBs.
         * @param memoryInMBs the value to set
         * @return this builder
         **/
        public Builder memoryInMBs(Long memoryInMBs) {
            this.memoryInMBs = memoryInMBs;
            this.__explicitlySet__.add("memoryInMBs");
            return this;
        }
        /**
         * Whether Pmem is enabled. Decides if NVDIMMs are used as a permanent memory.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPmemEnabled")
        private Boolean isPmemEnabled;

        /**
         * Whether Pmem is enabled. Decides if NVDIMMs are used as a permanent memory.
         * @param isPmemEnabled the value to set
         * @return this builder
         **/
        public Builder isPmemEnabled(Boolean isPmemEnabled) {
            this.isPmemEnabled = isPmemEnabled;
            this.__explicitlySet__.add("isPmemEnabled");
            return this;
        }
        /**
         * Pmem size in MBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pmemInMBs")
        private Long pmemInMBs;

        /**
         * Pmem size in MBs.
         * @param pmemInMBs the value to set
         * @return this builder
         **/
        public Builder pmemInMBs(Long pmemInMBs) {
            this.pmemInMBs = pmemInMBs;
            this.__explicitlySet__.add("pmemInMBs");
            return this;
        }
        /**
         * Operating system.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
        private String operatingSystem;

        /**
         * Operating system.
         * @param operatingSystem the value to set
         * @return this builder
         **/
        public Builder operatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            this.__explicitlySet__.add("operatingSystem");
            return this;
        }
        /**
         * Operating system version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operatingSystemVersion")
        private String operatingSystemVersion;

        /**
         * Operating system version.
         * @param operatingSystemVersion the value to set
         * @return this builder
         **/
        public Builder operatingSystemVersion(String operatingSystemVersion) {
            this.operatingSystemVersion = operatingSystemVersion;
            this.__explicitlySet__.add("operatingSystemVersion");
            return this;
        }
        /**
         * Host name of the VM.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * Host name of the VM.
         * @param hostName the value to set
         * @return this builder
         **/
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /**
         * The current power state of the virtual machine.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("powerState")
        private String powerState;

        /**
         * The current power state of the virtual machine.
         * @param powerState the value to set
         * @return this builder
         **/
        public Builder powerState(String powerState) {
            this.powerState = powerState;
            this.__explicitlySet__.add("powerState");
            return this;
        }
        /**
         * Guest state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("guestState")
        private String guestState;

        /**
         * Guest state.
         * @param guestState the value to set
         * @return this builder
         **/
        public Builder guestState(String guestState) {
            this.guestState = guestState;
            this.__explicitlySet__.add("guestState");
            return this;
        }
        /**
         * Whether Trusted Platform Module (TPM) is enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isTpmEnabled")
        private Boolean isTpmEnabled;

        /**
         * Whether Trusted Platform Module (TPM) is enabled.
         * @param isTpmEnabled the value to set
         * @return this builder
         **/
        public Builder isTpmEnabled(Boolean isTpmEnabled) {
            this.isTpmEnabled = isTpmEnabled;
            this.__explicitlySet__.add("isTpmEnabled");
            return this;
        }
        /**
         * Number of connected networks.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectedNetworks")
        private Integer connectedNetworks;

        /**
         * Number of connected networks.
         * @param connectedNetworks the value to set
         * @return this builder
         **/
        public Builder connectedNetworks(Integer connectedNetworks) {
            this.connectedNetworks = connectedNetworks;
            this.__explicitlySet__.add("connectedNetworks");
            return this;
        }
        /**
         * Number of network ethernet cards.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nicsCount")
        private Integer nicsCount;

        /**
         * Number of network ethernet cards.
         * @param nicsCount the value to set
         * @return this builder
         **/
        public Builder nicsCount(Integer nicsCount) {
            this.nicsCount = nicsCount;
            this.__explicitlySet__.add("nicsCount");
            return this;
        }
        /**
         * List of network ethernet cards attached to a virtual machine.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nics")
        private java.util.List<Nic> nics;

        /**
         * List of network ethernet cards attached to a virtual machine.
         * @param nics the value to set
         * @return this builder
         **/
        public Builder nics(java.util.List<Nic> nics) {
            this.nics = nics;
            this.__explicitlySet__.add("nics");
            return this;
        }
        /**
         * Provision storage size in MBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storageProvisionedInMBs")
        private Long storageProvisionedInMBs;

        /**
         * Provision storage size in MBs.
         * @param storageProvisionedInMBs the value to set
         * @return this builder
         **/
        public Builder storageProvisionedInMBs(Long storageProvisionedInMBs) {
            this.storageProvisionedInMBs = storageProvisionedInMBs;
            this.__explicitlySet__.add("storageProvisionedInMBs");
            return this;
        }
        /**
         * Number of disks.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("disksCount")
        private Integer disksCount;

        /**
         * Number of disks.
         * @param disksCount the value to set
         * @return this builder
         **/
        public Builder disksCount(Integer disksCount) {
            this.disksCount = disksCount;
            this.__explicitlySet__.add("disksCount");
            return this;
        }
        /**
         * Lists the set of disks belonging to the virtual machine. This list is unordered.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("disks")
        private java.util.List<Disk> disks;

        /**
         * Lists the set of disks belonging to the virtual machine. This list is unordered.
         * @param disks the value to set
         * @return this builder
         **/
        public Builder disks(java.util.List<Disk> disks) {
            this.disks = disks;
            this.__explicitlySet__.add("disks");
            return this;
        }
        /**
         * Information about firmware type for this virtual machine.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("firmware")
        private String firmware;

        /**
         * Information about firmware type for this virtual machine.
         * @param firmware the value to set
         * @return this builder
         **/
        public Builder firmware(String firmware) {
            this.firmware = firmware;
            this.__explicitlySet__.add("firmware");
            return this;
        }
        /**
         * Latency sensitivity.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("latencySensitivity")
        private String latencySensitivity;

        /**
         * Latency sensitivity.
         * @param latencySensitivity the value to set
         * @return this builder
         **/
        public Builder latencySensitivity(String latencySensitivity) {
            this.latencySensitivity = latencySensitivity;
            this.__explicitlySet__.add("latencySensitivity");
            return this;
        }
        /**
         * The properties of the NVDIMMs attached to a virtual machine.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nvdimms")
        private java.util.List<Nvdimm> nvdimms;

        /**
         * The properties of the NVDIMMs attached to a virtual machine.
         * @param nvdimms the value to set
         * @return this builder
         **/
        public Builder nvdimms(java.util.List<Nvdimm> nvdimms) {
            this.nvdimms = nvdimms;
            this.__explicitlySet__.add("nvdimms");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nvdimmController")
        private NvdimmController nvdimmController;

        public Builder nvdimmController(NvdimmController nvdimmController) {
            this.nvdimmController = nvdimmController;
            this.__explicitlySet__.add("nvdimmController");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scsiController")
        private ScsiController scsiController;

        public Builder scsiController(ScsiController scsiController) {
            this.scsiController = scsiController;
            this.__explicitlySet__.add("scsiController");
            return this;
        }
        /**
         * Hardware version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hardwareVersion")
        private String hardwareVersion;

        /**
         * Hardware version.
         * @param hardwareVersion the value to set
         * @return this builder
         **/
        public Builder hardwareVersion(String hardwareVersion) {
            this.hardwareVersion = hardwareVersion;
            this.__explicitlySet__.add("hardwareVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeProperties build() {
            ComputeProperties model =
                    new ComputeProperties(
                            this.primaryIp,
                            this.dnsName,
                            this.description,
                            this.coresCount,
                            this.cpuModel,
                            this.gpuDevicesCount,
                            this.gpuDevices,
                            this.threadsPerCoreCount,
                            this.memoryInMBs,
                            this.isPmemEnabled,
                            this.pmemInMBs,
                            this.operatingSystem,
                            this.operatingSystemVersion,
                            this.hostName,
                            this.powerState,
                            this.guestState,
                            this.isTpmEnabled,
                            this.connectedNetworks,
                            this.nicsCount,
                            this.nics,
                            this.storageProvisionedInMBs,
                            this.disksCount,
                            this.disks,
                            this.firmware,
                            this.latencySensitivity,
                            this.nvdimms,
                            this.nvdimmController,
                            this.scsiController,
                            this.hardwareVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeProperties model) {
            if (model.wasPropertyExplicitlySet("primaryIp")) {
                this.primaryIp(model.getPrimaryIp());
            }
            if (model.wasPropertyExplicitlySet("dnsName")) {
                this.dnsName(model.getDnsName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("coresCount")) {
                this.coresCount(model.getCoresCount());
            }
            if (model.wasPropertyExplicitlySet("cpuModel")) {
                this.cpuModel(model.getCpuModel());
            }
            if (model.wasPropertyExplicitlySet("gpuDevicesCount")) {
                this.gpuDevicesCount(model.getGpuDevicesCount());
            }
            if (model.wasPropertyExplicitlySet("gpuDevices")) {
                this.gpuDevices(model.getGpuDevices());
            }
            if (model.wasPropertyExplicitlySet("threadsPerCoreCount")) {
                this.threadsPerCoreCount(model.getThreadsPerCoreCount());
            }
            if (model.wasPropertyExplicitlySet("memoryInMBs")) {
                this.memoryInMBs(model.getMemoryInMBs());
            }
            if (model.wasPropertyExplicitlySet("isPmemEnabled")) {
                this.isPmemEnabled(model.getIsPmemEnabled());
            }
            if (model.wasPropertyExplicitlySet("pmemInMBs")) {
                this.pmemInMBs(model.getPmemInMBs());
            }
            if (model.wasPropertyExplicitlySet("operatingSystem")) {
                this.operatingSystem(model.getOperatingSystem());
            }
            if (model.wasPropertyExplicitlySet("operatingSystemVersion")) {
                this.operatingSystemVersion(model.getOperatingSystemVersion());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("powerState")) {
                this.powerState(model.getPowerState());
            }
            if (model.wasPropertyExplicitlySet("guestState")) {
                this.guestState(model.getGuestState());
            }
            if (model.wasPropertyExplicitlySet("isTpmEnabled")) {
                this.isTpmEnabled(model.getIsTpmEnabled());
            }
            if (model.wasPropertyExplicitlySet("connectedNetworks")) {
                this.connectedNetworks(model.getConnectedNetworks());
            }
            if (model.wasPropertyExplicitlySet("nicsCount")) {
                this.nicsCount(model.getNicsCount());
            }
            if (model.wasPropertyExplicitlySet("nics")) {
                this.nics(model.getNics());
            }
            if (model.wasPropertyExplicitlySet("storageProvisionedInMBs")) {
                this.storageProvisionedInMBs(model.getStorageProvisionedInMBs());
            }
            if (model.wasPropertyExplicitlySet("disksCount")) {
                this.disksCount(model.getDisksCount());
            }
            if (model.wasPropertyExplicitlySet("disks")) {
                this.disks(model.getDisks());
            }
            if (model.wasPropertyExplicitlySet("firmware")) {
                this.firmware(model.getFirmware());
            }
            if (model.wasPropertyExplicitlySet("latencySensitivity")) {
                this.latencySensitivity(model.getLatencySensitivity());
            }
            if (model.wasPropertyExplicitlySet("nvdimms")) {
                this.nvdimms(model.getNvdimms());
            }
            if (model.wasPropertyExplicitlySet("nvdimmController")) {
                this.nvdimmController(model.getNvdimmController());
            }
            if (model.wasPropertyExplicitlySet("scsiController")) {
                this.scsiController(model.getScsiController());
            }
            if (model.wasPropertyExplicitlySet("hardwareVersion")) {
                this.hardwareVersion(model.getHardwareVersion());
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
     * Primary IP address of the compute instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("primaryIp")
    private final String primaryIp;

    /**
     * Primary IP address of the compute instance.
     * @return the value
     **/
    public String getPrimaryIp() {
        return primaryIp;
    }

    /**
     * Fully Qualified DNS Name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsName")
    private final String dnsName;

    /**
     * Fully Qualified DNS Name.
     * @return the value
     **/
    public String getDnsName() {
        return dnsName;
    }

    /**
     * Information about the asset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Information about the asset.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Number of CPUs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("coresCount")
    private final Integer coresCount;

    /**
     * Number of CPUs.
     * @return the value
     **/
    public Integer getCoresCount() {
        return coresCount;
    }

    /**
     * CPU model name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuModel")
    private final String cpuModel;

    /**
     * CPU model name.
     * @return the value
     **/
    public String getCpuModel() {
        return cpuModel;
    }

    /**
     * Number of GPU devices.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gpuDevicesCount")
    private final Integer gpuDevicesCount;

    /**
     * Number of GPU devices.
     * @return the value
     **/
    public Integer getGpuDevicesCount() {
        return gpuDevicesCount;
    }

    /**
     * List of GPU devices attached to a virtual machine.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gpuDevices")
    private final java.util.List<GpuDevice> gpuDevices;

    /**
     * List of GPU devices attached to a virtual machine.
     * @return the value
     **/
    public java.util.List<GpuDevice> getGpuDevices() {
        return gpuDevices;
    }

    /**
     * Number of threads per core.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("threadsPerCoreCount")
    private final Integer threadsPerCoreCount;

    /**
     * Number of threads per core.
     * @return the value
     **/
    public Integer getThreadsPerCoreCount() {
        return threadsPerCoreCount;
    }

    /**
     * Memory size in MBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInMBs")
    private final Long memoryInMBs;

    /**
     * Memory size in MBs.
     * @return the value
     **/
    public Long getMemoryInMBs() {
        return memoryInMBs;
    }

    /**
     * Whether Pmem is enabled. Decides if NVDIMMs are used as a permanent memory.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPmemEnabled")
    private final Boolean isPmemEnabled;

    /**
     * Whether Pmem is enabled. Decides if NVDIMMs are used as a permanent memory.
     * @return the value
     **/
    public Boolean getIsPmemEnabled() {
        return isPmemEnabled;
    }

    /**
     * Pmem size in MBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pmemInMBs")
    private final Long pmemInMBs;

    /**
     * Pmem size in MBs.
     * @return the value
     **/
    public Long getPmemInMBs() {
        return pmemInMBs;
    }

    /**
     * Operating system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
    private final String operatingSystem;

    /**
     * Operating system.
     * @return the value
     **/
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * Operating system version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystemVersion")
    private final String operatingSystemVersion;

    /**
     * Operating system version.
     * @return the value
     **/
    public String getOperatingSystemVersion() {
        return operatingSystemVersion;
    }

    /**
     * Host name of the VM.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * Host name of the VM.
     * @return the value
     **/
    public String getHostName() {
        return hostName;
    }

    /**
     * The current power state of the virtual machine.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("powerState")
    private final String powerState;

    /**
     * The current power state of the virtual machine.
     * @return the value
     **/
    public String getPowerState() {
        return powerState;
    }

    /**
     * Guest state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("guestState")
    private final String guestState;

    /**
     * Guest state.
     * @return the value
     **/
    public String getGuestState() {
        return guestState;
    }

    /**
     * Whether Trusted Platform Module (TPM) is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTpmEnabled")
    private final Boolean isTpmEnabled;

    /**
     * Whether Trusted Platform Module (TPM) is enabled.
     * @return the value
     **/
    public Boolean getIsTpmEnabled() {
        return isTpmEnabled;
    }

    /**
     * Number of connected networks.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectedNetworks")
    private final Integer connectedNetworks;

    /**
     * Number of connected networks.
     * @return the value
     **/
    public Integer getConnectedNetworks() {
        return connectedNetworks;
    }

    /**
     * Number of network ethernet cards.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nicsCount")
    private final Integer nicsCount;

    /**
     * Number of network ethernet cards.
     * @return the value
     **/
    public Integer getNicsCount() {
        return nicsCount;
    }

    /**
     * List of network ethernet cards attached to a virtual machine.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nics")
    private final java.util.List<Nic> nics;

    /**
     * List of network ethernet cards attached to a virtual machine.
     * @return the value
     **/
    public java.util.List<Nic> getNics() {
        return nics;
    }

    /**
     * Provision storage size in MBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageProvisionedInMBs")
    private final Long storageProvisionedInMBs;

    /**
     * Provision storage size in MBs.
     * @return the value
     **/
    public Long getStorageProvisionedInMBs() {
        return storageProvisionedInMBs;
    }

    /**
     * Number of disks.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("disksCount")
    private final Integer disksCount;

    /**
     * Number of disks.
     * @return the value
     **/
    public Integer getDisksCount() {
        return disksCount;
    }

    /**
     * Lists the set of disks belonging to the virtual machine. This list is unordered.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("disks")
    private final java.util.List<Disk> disks;

    /**
     * Lists the set of disks belonging to the virtual machine. This list is unordered.
     * @return the value
     **/
    public java.util.List<Disk> getDisks() {
        return disks;
    }

    /**
     * Information about firmware type for this virtual machine.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("firmware")
    private final String firmware;

    /**
     * Information about firmware type for this virtual machine.
     * @return the value
     **/
    public String getFirmware() {
        return firmware;
    }

    /**
     * Latency sensitivity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("latencySensitivity")
    private final String latencySensitivity;

    /**
     * Latency sensitivity.
     * @return the value
     **/
    public String getLatencySensitivity() {
        return latencySensitivity;
    }

    /**
     * The properties of the NVDIMMs attached to a virtual machine.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nvdimms")
    private final java.util.List<Nvdimm> nvdimms;

    /**
     * The properties of the NVDIMMs attached to a virtual machine.
     * @return the value
     **/
    public java.util.List<Nvdimm> getNvdimms() {
        return nvdimms;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("nvdimmController")
    private final NvdimmController nvdimmController;

    public NvdimmController getNvdimmController() {
        return nvdimmController;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scsiController")
    private final ScsiController scsiController;

    public ScsiController getScsiController() {
        return scsiController;
    }

    /**
     * Hardware version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hardwareVersion")
    private final String hardwareVersion;

    /**
     * Hardware version.
     * @return the value
     **/
    public String getHardwareVersion() {
        return hardwareVersion;
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
        sb.append("ComputeProperties(");
        sb.append("super=").append(super.toString());
        sb.append("primaryIp=").append(String.valueOf(this.primaryIp));
        sb.append(", dnsName=").append(String.valueOf(this.dnsName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", coresCount=").append(String.valueOf(this.coresCount));
        sb.append(", cpuModel=").append(String.valueOf(this.cpuModel));
        sb.append(", gpuDevicesCount=").append(String.valueOf(this.gpuDevicesCount));
        sb.append(", gpuDevices=").append(String.valueOf(this.gpuDevices));
        sb.append(", threadsPerCoreCount=").append(String.valueOf(this.threadsPerCoreCount));
        sb.append(", memoryInMBs=").append(String.valueOf(this.memoryInMBs));
        sb.append(", isPmemEnabled=").append(String.valueOf(this.isPmemEnabled));
        sb.append(", pmemInMBs=").append(String.valueOf(this.pmemInMBs));
        sb.append(", operatingSystem=").append(String.valueOf(this.operatingSystem));
        sb.append(", operatingSystemVersion=").append(String.valueOf(this.operatingSystemVersion));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", powerState=").append(String.valueOf(this.powerState));
        sb.append(", guestState=").append(String.valueOf(this.guestState));
        sb.append(", isTpmEnabled=").append(String.valueOf(this.isTpmEnabled));
        sb.append(", connectedNetworks=").append(String.valueOf(this.connectedNetworks));
        sb.append(", nicsCount=").append(String.valueOf(this.nicsCount));
        sb.append(", nics=").append(String.valueOf(this.nics));
        sb.append(", storageProvisionedInMBs=")
                .append(String.valueOf(this.storageProvisionedInMBs));
        sb.append(", disksCount=").append(String.valueOf(this.disksCount));
        sb.append(", disks=").append(String.valueOf(this.disks));
        sb.append(", firmware=").append(String.valueOf(this.firmware));
        sb.append(", latencySensitivity=").append(String.valueOf(this.latencySensitivity));
        sb.append(", nvdimms=").append(String.valueOf(this.nvdimms));
        sb.append(", nvdimmController=").append(String.valueOf(this.nvdimmController));
        sb.append(", scsiController=").append(String.valueOf(this.scsiController));
        sb.append(", hardwareVersion=").append(String.valueOf(this.hardwareVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeProperties)) {
            return false;
        }

        ComputeProperties other = (ComputeProperties) o;
        return java.util.Objects.equals(this.primaryIp, other.primaryIp)
                && java.util.Objects.equals(this.dnsName, other.dnsName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.coresCount, other.coresCount)
                && java.util.Objects.equals(this.cpuModel, other.cpuModel)
                && java.util.Objects.equals(this.gpuDevicesCount, other.gpuDevicesCount)
                && java.util.Objects.equals(this.gpuDevices, other.gpuDevices)
                && java.util.Objects.equals(this.threadsPerCoreCount, other.threadsPerCoreCount)
                && java.util.Objects.equals(this.memoryInMBs, other.memoryInMBs)
                && java.util.Objects.equals(this.isPmemEnabled, other.isPmemEnabled)
                && java.util.Objects.equals(this.pmemInMBs, other.pmemInMBs)
                && java.util.Objects.equals(this.operatingSystem, other.operatingSystem)
                && java.util.Objects.equals(
                        this.operatingSystemVersion, other.operatingSystemVersion)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.powerState, other.powerState)
                && java.util.Objects.equals(this.guestState, other.guestState)
                && java.util.Objects.equals(this.isTpmEnabled, other.isTpmEnabled)
                && java.util.Objects.equals(this.connectedNetworks, other.connectedNetworks)
                && java.util.Objects.equals(this.nicsCount, other.nicsCount)
                && java.util.Objects.equals(this.nics, other.nics)
                && java.util.Objects.equals(
                        this.storageProvisionedInMBs, other.storageProvisionedInMBs)
                && java.util.Objects.equals(this.disksCount, other.disksCount)
                && java.util.Objects.equals(this.disks, other.disks)
                && java.util.Objects.equals(this.firmware, other.firmware)
                && java.util.Objects.equals(this.latencySensitivity, other.latencySensitivity)
                && java.util.Objects.equals(this.nvdimms, other.nvdimms)
                && java.util.Objects.equals(this.nvdimmController, other.nvdimmController)
                && java.util.Objects.equals(this.scsiController, other.scsiController)
                && java.util.Objects.equals(this.hardwareVersion, other.hardwareVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.primaryIp == null ? 43 : this.primaryIp.hashCode());
        result = (result * PRIME) + (this.dnsName == null ? 43 : this.dnsName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.coresCount == null ? 43 : this.coresCount.hashCode());
        result = (result * PRIME) + (this.cpuModel == null ? 43 : this.cpuModel.hashCode());
        result =
                (result * PRIME)
                        + (this.gpuDevicesCount == null ? 43 : this.gpuDevicesCount.hashCode());
        result = (result * PRIME) + (this.gpuDevices == null ? 43 : this.gpuDevices.hashCode());
        result =
                (result * PRIME)
                        + (this.threadsPerCoreCount == null
                                ? 43
                                : this.threadsPerCoreCount.hashCode());
        result = (result * PRIME) + (this.memoryInMBs == null ? 43 : this.memoryInMBs.hashCode());
        result =
                (result * PRIME)
                        + (this.isPmemEnabled == null ? 43 : this.isPmemEnabled.hashCode());
        result = (result * PRIME) + (this.pmemInMBs == null ? 43 : this.pmemInMBs.hashCode());
        result =
                (result * PRIME)
                        + (this.operatingSystem == null ? 43 : this.operatingSystem.hashCode());
        result =
                (result * PRIME)
                        + (this.operatingSystemVersion == null
                                ? 43
                                : this.operatingSystemVersion.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result = (result * PRIME) + (this.powerState == null ? 43 : this.powerState.hashCode());
        result = (result * PRIME) + (this.guestState == null ? 43 : this.guestState.hashCode());
        result = (result * PRIME) + (this.isTpmEnabled == null ? 43 : this.isTpmEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.connectedNetworks == null ? 43 : this.connectedNetworks.hashCode());
        result = (result * PRIME) + (this.nicsCount == null ? 43 : this.nicsCount.hashCode());
        result = (result * PRIME) + (this.nics == null ? 43 : this.nics.hashCode());
        result =
                (result * PRIME)
                        + (this.storageProvisionedInMBs == null
                                ? 43
                                : this.storageProvisionedInMBs.hashCode());
        result = (result * PRIME) + (this.disksCount == null ? 43 : this.disksCount.hashCode());
        result = (result * PRIME) + (this.disks == null ? 43 : this.disks.hashCode());
        result = (result * PRIME) + (this.firmware == null ? 43 : this.firmware.hashCode());
        result =
                (result * PRIME)
                        + (this.latencySensitivity == null
                                ? 43
                                : this.latencySensitivity.hashCode());
        result = (result * PRIME) + (this.nvdimms == null ? 43 : this.nvdimms.hashCode());
        result =
                (result * PRIME)
                        + (this.nvdimmController == null ? 43 : this.nvdimmController.hashCode());
        result =
                (result * PRIME)
                        + (this.scsiController == null ? 43 : this.scsiController.hashCode());
        result =
                (result * PRIME)
                        + (this.hardwareVersion == null ? 43 : this.hardwareVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
