/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Type representing a host. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OlvmHost.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OlvmHost extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "address",
        "autoNumaStatus",
        "certificate",
        "comment",
        "cpu",
        "description",
        "isHostDevicePassthrough",
        "display",
        "externalStatus",
        "hardwareInformation",
        "hostedEngine",
        "id",
        "iscsi",
        "kdumpStatus",
        "ksm",
        "libvirtVersion",
        "maxSchedulingMemoryInBytes",
        "memoryInBytes",
        "name",
        "isNetworkOperationInProgress",
        "isNumaSupported",
        "os",
        "isOverrideIpTables",
        "isOvnConfigured",
        "port",
        "powerManagement",
        "isReinstallationRequired",
        "seLinux",
        "spm",
        "hostStatus",
        "statusDetail",
        "summary",
        "isTransparentHugePagesEnabled",
        "type",
        "isUpdateAvailable",
        "version",
        "vgpuPlacement"
    })
    public OlvmHost(
            String address,
            AutoNumaStatus autoNumaStatus,
            OlvmCertificate certificate,
            String comment,
            OlvmCpu cpu,
            String description,
            Boolean isHostDevicePassthrough,
            OlvmDisplay display,
            ExternalStatus externalStatus,
            OlvmHardwareInformation hardwareInformation,
            OlvmHostedEngine hostedEngine,
            String id,
            OlvmIscsiDetails iscsi,
            KdumpStatus kdumpStatus,
            Ksm ksm,
            OlvmVersion libvirtVersion,
            Long maxSchedulingMemoryInBytes,
            Long memoryInBytes,
            String name,
            Boolean isNetworkOperationInProgress,
            Boolean isNumaSupported,
            OlvmOperatingSystem os,
            Boolean isOverrideIpTables,
            Boolean isOvnConfigured,
            Integer port,
            OlvmPowerManagement powerManagement,
            Boolean isReinstallationRequired,
            OlvmSelinux seLinux,
            OlvmSpm spm,
            OlvmHostStatus hostStatus,
            String statusDetail,
            OlvmVmSummary summary,
            Boolean isTransparentHugePagesEnabled,
            OlvmHostType type,
            Boolean isUpdateAvailable,
            OlvmVersion version,
            VgpuPlacement vgpuPlacement) {
        super();
        this.address = address;
        this.autoNumaStatus = autoNumaStatus;
        this.certificate = certificate;
        this.comment = comment;
        this.cpu = cpu;
        this.description = description;
        this.isHostDevicePassthrough = isHostDevicePassthrough;
        this.display = display;
        this.externalStatus = externalStatus;
        this.hardwareInformation = hardwareInformation;
        this.hostedEngine = hostedEngine;
        this.id = id;
        this.iscsi = iscsi;
        this.kdumpStatus = kdumpStatus;
        this.ksm = ksm;
        this.libvirtVersion = libvirtVersion;
        this.maxSchedulingMemoryInBytes = maxSchedulingMemoryInBytes;
        this.memoryInBytes = memoryInBytes;
        this.name = name;
        this.isNetworkOperationInProgress = isNetworkOperationInProgress;
        this.isNumaSupported = isNumaSupported;
        this.os = os;
        this.isOverrideIpTables = isOverrideIpTables;
        this.isOvnConfigured = isOvnConfigured;
        this.port = port;
        this.powerManagement = powerManagement;
        this.isReinstallationRequired = isReinstallationRequired;
        this.seLinux = seLinux;
        this.spm = spm;
        this.hostStatus = hostStatus;
        this.statusDetail = statusDetail;
        this.summary = summary;
        this.isTransparentHugePagesEnabled = isTransparentHugePagesEnabled;
        this.type = type;
        this.isUpdateAvailable = isUpdateAvailable;
        this.version = version;
        this.vgpuPlacement = vgpuPlacement;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The host address (FQDN/IP). */
        @com.fasterxml.jackson.annotation.JsonProperty("address")
        private String address;

        /**
         * The host address (FQDN/IP).
         *
         * @param address the value to set
         * @return this builder
         */
        public Builder address(String address) {
            this.address = address;
            this.__explicitlySet__.add("address");
            return this;
        }
        /** The host auto non uniform memory access (NUMA) status. */
        @com.fasterxml.jackson.annotation.JsonProperty("autoNumaStatus")
        private AutoNumaStatus autoNumaStatus;

        /**
         * The host auto non uniform memory access (NUMA) status.
         *
         * @param autoNumaStatus the value to set
         * @return this builder
         */
        public Builder autoNumaStatus(AutoNumaStatus autoNumaStatus) {
            this.autoNumaStatus = autoNumaStatus;
            this.__explicitlySet__.add("autoNumaStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificate")
        private OlvmCertificate certificate;

        public Builder certificate(OlvmCertificate certificate) {
            this.certificate = certificate;
            this.__explicitlySet__.add("certificate");
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

        @com.fasterxml.jackson.annotation.JsonProperty("cpu")
        private OlvmCpu cpu;

        public Builder cpu(OlvmCpu cpu) {
            this.cpu = cpu;
            this.__explicitlySet__.add("cpu");
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
        /** Specifies whether host device passthrough is enabled on this host. */
        @com.fasterxml.jackson.annotation.JsonProperty("isHostDevicePassthrough")
        private Boolean isHostDevicePassthrough;

        /**
         * Specifies whether host device passthrough is enabled on this host.
         *
         * @param isHostDevicePassthrough the value to set
         * @return this builder
         */
        public Builder isHostDevicePassthrough(Boolean isHostDevicePassthrough) {
            this.isHostDevicePassthrough = isHostDevicePassthrough;
            this.__explicitlySet__.add("isHostDevicePassthrough");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("display")
        private OlvmDisplay display;

        public Builder display(OlvmDisplay display) {
            this.display = display;
            this.__explicitlySet__.add("display");
            return this;
        }
        /** Status of storage domain. */
        @com.fasterxml.jackson.annotation.JsonProperty("externalStatus")
        private ExternalStatus externalStatus;

        /**
         * Status of storage domain.
         *
         * @param externalStatus the value to set
         * @return this builder
         */
        public Builder externalStatus(ExternalStatus externalStatus) {
            this.externalStatus = externalStatus;
            this.__explicitlySet__.add("externalStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hardwareInformation")
        private OlvmHardwareInformation hardwareInformation;

        public Builder hardwareInformation(OlvmHardwareInformation hardwareInformation) {
            this.hardwareInformation = hardwareInformation;
            this.__explicitlySet__.add("hardwareInformation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostedEngine")
        private OlvmHostedEngine hostedEngine;

        public Builder hostedEngine(OlvmHostedEngine hostedEngine) {
            this.hostedEngine = hostedEngine;
            this.__explicitlySet__.add("hostedEngine");
            return this;
        }
        /** A unique identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * A unique identifier.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("iscsi")
        private OlvmIscsiDetails iscsi;

        public Builder iscsi(OlvmIscsiDetails iscsi) {
            this.iscsi = iscsi;
            this.__explicitlySet__.add("iscsi");
            return this;
        }
        /** The host KDUMP status. */
        @com.fasterxml.jackson.annotation.JsonProperty("kdumpStatus")
        private KdumpStatus kdumpStatus;

        /**
         * The host KDUMP status.
         *
         * @param kdumpStatus the value to set
         * @return this builder
         */
        public Builder kdumpStatus(KdumpStatus kdumpStatus) {
            this.kdumpStatus = kdumpStatus;
            this.__explicitlySet__.add("kdumpStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ksm")
        private Ksm ksm;

        public Builder ksm(Ksm ksm) {
            this.ksm = ksm;
            this.__explicitlySet__.add("ksm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("libvirtVersion")
        private OlvmVersion libvirtVersion;

        public Builder libvirtVersion(OlvmVersion libvirtVersion) {
            this.libvirtVersion = libvirtVersion;
            this.__explicitlySet__.add("libvirtVersion");
            return this;
        }
        /** The max scheduling memory on this host in bytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxSchedulingMemoryInBytes")
        private Long maxSchedulingMemoryInBytes;

        /**
         * The max scheduling memory on this host in bytes.
         *
         * @param maxSchedulingMemoryInBytes the value to set
         * @return this builder
         */
        public Builder maxSchedulingMemoryInBytes(Long maxSchedulingMemoryInBytes) {
            this.maxSchedulingMemoryInBytes = maxSchedulingMemoryInBytes;
            this.__explicitlySet__.add("maxSchedulingMemoryInBytes");
            return this;
        }
        /** The amount of physical memory on this host in bytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryInBytes")
        private Long memoryInBytes;

        /**
         * The amount of physical memory on this host in bytes.
         *
         * @param memoryInBytes the value to set
         * @return this builder
         */
        public Builder memoryInBytes(Long memoryInBytes) {
            this.memoryInBytes = memoryInBytes;
            this.__explicitlySet__.add("memoryInBytes");
            return this;
        }
        /** Name of the property. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the property.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Specifies whether a network-related operation, such as 'setup networks', 'sync networks',
         * or 'refresh capabilities', is currently being executed on this host.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isNetworkOperationInProgress")
        private Boolean isNetworkOperationInProgress;

        /**
         * Specifies whether a network-related operation, such as 'setup networks', 'sync networks',
         * or 'refresh capabilities', is currently being executed on this host.
         *
         * @param isNetworkOperationInProgress the value to set
         * @return this builder
         */
        public Builder isNetworkOperationInProgress(Boolean isNetworkOperationInProgress) {
            this.isNetworkOperationInProgress = isNetworkOperationInProgress;
            this.__explicitlySet__.add("isNetworkOperationInProgress");
            return this;
        }
        /** Specifies whether non uniform memory access (NUMA) is supported on this host. */
        @com.fasterxml.jackson.annotation.JsonProperty("isNumaSupported")
        private Boolean isNumaSupported;

        /**
         * Specifies whether non uniform memory access (NUMA) is supported on this host.
         *
         * @param isNumaSupported the value to set
         * @return this builder
         */
        public Builder isNumaSupported(Boolean isNumaSupported) {
            this.isNumaSupported = isNumaSupported;
            this.__explicitlySet__.add("isNumaSupported");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("os")
        private OlvmOperatingSystem os;

        public Builder os(OlvmOperatingSystem os) {
            this.os = os;
            this.__explicitlySet__.add("os");
            return this;
        }
        /** Specifies whether we should override firewall definitions */
        @com.fasterxml.jackson.annotation.JsonProperty("isOverrideIpTables")
        private Boolean isOverrideIpTables;

        /**
         * Specifies whether we should override firewall definitions
         *
         * @param isOverrideIpTables the value to set
         * @return this builder
         */
        public Builder isOverrideIpTables(Boolean isOverrideIpTables) {
            this.isOverrideIpTables = isOverrideIpTables;
            this.__explicitlySet__.add("isOverrideIpTables");
            return this;
        }
        /** Indicates if the host has correctly configured OVN. */
        @com.fasterxml.jackson.annotation.JsonProperty("isOvnConfigured")
        private Boolean isOvnConfigured;

        /**
         * Indicates if the host has correctly configured OVN.
         *
         * @param isOvnConfigured the value to set
         * @return this builder
         */
        public Builder isOvnConfigured(Boolean isOvnConfigured) {
            this.isOvnConfigured = isOvnConfigured;
            this.__explicitlySet__.add("isOvnConfigured");
            return this;
        }
        /** The host port. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The host port.
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("powerManagement")
        private OlvmPowerManagement powerManagement;

        public Builder powerManagement(OlvmPowerManagement powerManagement) {
            this.powerManagement = powerManagement;
            this.__explicitlySet__.add("powerManagement");
            return this;
        }
        /** Specifies whether the host should be reinstalled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isReinstallationRequired")
        private Boolean isReinstallationRequired;

        /**
         * Specifies whether the host should be reinstalled.
         *
         * @param isReinstallationRequired the value to set
         * @return this builder
         */
        public Builder isReinstallationRequired(Boolean isReinstallationRequired) {
            this.isReinstallationRequired = isReinstallationRequired;
            this.__explicitlySet__.add("isReinstallationRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("seLinux")
        private OlvmSelinux seLinux;

        public Builder seLinux(OlvmSelinux seLinux) {
            this.seLinux = seLinux;
            this.__explicitlySet__.add("seLinux");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("spm")
        private OlvmSpm spm;

        public Builder spm(OlvmSpm spm) {
            this.spm = spm;
            this.__explicitlySet__.add("spm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostStatus")
        private OlvmHostStatus hostStatus;

        public Builder hostStatus(OlvmHostStatus hostStatus) {
            this.hostStatus = hostStatus;
            this.__explicitlySet__.add("hostStatus");
            return this;
        }
        /** The host status details. */
        @com.fasterxml.jackson.annotation.JsonProperty("statusDetail")
        private String statusDetail;

        /**
         * The host status details.
         *
         * @param statusDetail the value to set
         * @return this builder
         */
        public Builder statusDetail(String statusDetail) {
            this.statusDetail = statusDetail;
            this.__explicitlySet__.add("statusDetail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("summary")
        private OlvmVmSummary summary;

        public Builder summary(OlvmVmSummary summary) {
            this.summary = summary;
            this.__explicitlySet__.add("summary");
            return this;
        }
        /** Indicates if transparent huge pages (THP) support is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isTransparentHugePagesEnabled")
        private Boolean isTransparentHugePagesEnabled;

        /**
         * Indicates if transparent huge pages (THP) support is enabled.
         *
         * @param isTransparentHugePagesEnabled the value to set
         * @return this builder
         */
        public Builder isTransparentHugePagesEnabled(Boolean isTransparentHugePagesEnabled) {
            this.isTransparentHugePagesEnabled = isTransparentHugePagesEnabled;
            this.__explicitlySet__.add("isTransparentHugePagesEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private OlvmHostType type;

        public Builder type(OlvmHostType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** Specified whether there is an oVirt-related update on this host. */
        @com.fasterxml.jackson.annotation.JsonProperty("isUpdateAvailable")
        private Boolean isUpdateAvailable;

        /**
         * Specified whether there is an oVirt-related update on this host.
         *
         * @param isUpdateAvailable the value to set
         * @return this builder
         */
        public Builder isUpdateAvailable(Boolean isUpdateAvailable) {
            this.isUpdateAvailable = isUpdateAvailable;
            this.__explicitlySet__.add("isUpdateAvailable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private OlvmVersion version;

        public Builder version(OlvmVersion version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** Specifies the vGPU placement strategy. */
        @com.fasterxml.jackson.annotation.JsonProperty("vgpuPlacement")
        private VgpuPlacement vgpuPlacement;

        /**
         * Specifies the vGPU placement strategy.
         *
         * @param vgpuPlacement the value to set
         * @return this builder
         */
        public Builder vgpuPlacement(VgpuPlacement vgpuPlacement) {
            this.vgpuPlacement = vgpuPlacement;
            this.__explicitlySet__.add("vgpuPlacement");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmHost build() {
            OlvmHost model =
                    new OlvmHost(
                            this.address,
                            this.autoNumaStatus,
                            this.certificate,
                            this.comment,
                            this.cpu,
                            this.description,
                            this.isHostDevicePassthrough,
                            this.display,
                            this.externalStatus,
                            this.hardwareInformation,
                            this.hostedEngine,
                            this.id,
                            this.iscsi,
                            this.kdumpStatus,
                            this.ksm,
                            this.libvirtVersion,
                            this.maxSchedulingMemoryInBytes,
                            this.memoryInBytes,
                            this.name,
                            this.isNetworkOperationInProgress,
                            this.isNumaSupported,
                            this.os,
                            this.isOverrideIpTables,
                            this.isOvnConfigured,
                            this.port,
                            this.powerManagement,
                            this.isReinstallationRequired,
                            this.seLinux,
                            this.spm,
                            this.hostStatus,
                            this.statusDetail,
                            this.summary,
                            this.isTransparentHugePagesEnabled,
                            this.type,
                            this.isUpdateAvailable,
                            this.version,
                            this.vgpuPlacement);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmHost model) {
            if (model.wasPropertyExplicitlySet("address")) {
                this.address(model.getAddress());
            }
            if (model.wasPropertyExplicitlySet("autoNumaStatus")) {
                this.autoNumaStatus(model.getAutoNumaStatus());
            }
            if (model.wasPropertyExplicitlySet("certificate")) {
                this.certificate(model.getCertificate());
            }
            if (model.wasPropertyExplicitlySet("comment")) {
                this.comment(model.getComment());
            }
            if (model.wasPropertyExplicitlySet("cpu")) {
                this.cpu(model.getCpu());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isHostDevicePassthrough")) {
                this.isHostDevicePassthrough(model.getIsHostDevicePassthrough());
            }
            if (model.wasPropertyExplicitlySet("display")) {
                this.display(model.getDisplay());
            }
            if (model.wasPropertyExplicitlySet("externalStatus")) {
                this.externalStatus(model.getExternalStatus());
            }
            if (model.wasPropertyExplicitlySet("hardwareInformation")) {
                this.hardwareInformation(model.getHardwareInformation());
            }
            if (model.wasPropertyExplicitlySet("hostedEngine")) {
                this.hostedEngine(model.getHostedEngine());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("iscsi")) {
                this.iscsi(model.getIscsi());
            }
            if (model.wasPropertyExplicitlySet("kdumpStatus")) {
                this.kdumpStatus(model.getKdumpStatus());
            }
            if (model.wasPropertyExplicitlySet("ksm")) {
                this.ksm(model.getKsm());
            }
            if (model.wasPropertyExplicitlySet("libvirtVersion")) {
                this.libvirtVersion(model.getLibvirtVersion());
            }
            if (model.wasPropertyExplicitlySet("maxSchedulingMemoryInBytes")) {
                this.maxSchedulingMemoryInBytes(model.getMaxSchedulingMemoryInBytes());
            }
            if (model.wasPropertyExplicitlySet("memoryInBytes")) {
                this.memoryInBytes(model.getMemoryInBytes());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("isNetworkOperationInProgress")) {
                this.isNetworkOperationInProgress(model.getIsNetworkOperationInProgress());
            }
            if (model.wasPropertyExplicitlySet("isNumaSupported")) {
                this.isNumaSupported(model.getIsNumaSupported());
            }
            if (model.wasPropertyExplicitlySet("os")) {
                this.os(model.getOs());
            }
            if (model.wasPropertyExplicitlySet("isOverrideIpTables")) {
                this.isOverrideIpTables(model.getIsOverrideIpTables());
            }
            if (model.wasPropertyExplicitlySet("isOvnConfigured")) {
                this.isOvnConfigured(model.getIsOvnConfigured());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("powerManagement")) {
                this.powerManagement(model.getPowerManagement());
            }
            if (model.wasPropertyExplicitlySet("isReinstallationRequired")) {
                this.isReinstallationRequired(model.getIsReinstallationRequired());
            }
            if (model.wasPropertyExplicitlySet("seLinux")) {
                this.seLinux(model.getSeLinux());
            }
            if (model.wasPropertyExplicitlySet("spm")) {
                this.spm(model.getSpm());
            }
            if (model.wasPropertyExplicitlySet("hostStatus")) {
                this.hostStatus(model.getHostStatus());
            }
            if (model.wasPropertyExplicitlySet("statusDetail")) {
                this.statusDetail(model.getStatusDetail());
            }
            if (model.wasPropertyExplicitlySet("summary")) {
                this.summary(model.getSummary());
            }
            if (model.wasPropertyExplicitlySet("isTransparentHugePagesEnabled")) {
                this.isTransparentHugePagesEnabled(model.getIsTransparentHugePagesEnabled());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("isUpdateAvailable")) {
                this.isUpdateAvailable(model.getIsUpdateAvailable());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("vgpuPlacement")) {
                this.vgpuPlacement(model.getVgpuPlacement());
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

    /** The host address (FQDN/IP). */
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    private final String address;

    /**
     * The host address (FQDN/IP).
     *
     * @return the value
     */
    public String getAddress() {
        return address;
    }

    /** The host auto non uniform memory access (NUMA) status. */
    public enum AutoNumaStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Disable("DISABLE"),
        Enable("ENABLE"),
        Unknown("UNKNOWN"),
        ;

        private final String value;
        private static java.util.Map<String, AutoNumaStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (AutoNumaStatus v : AutoNumaStatus.values()) {
                map.put(v.getValue(), v);
            }
        }

        AutoNumaStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AutoNumaStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AutoNumaStatus: " + key);
        }
    };
    /** The host auto non uniform memory access (NUMA) status. */
    @com.fasterxml.jackson.annotation.JsonProperty("autoNumaStatus")
    private final AutoNumaStatus autoNumaStatus;

    /**
     * The host auto non uniform memory access (NUMA) status.
     *
     * @return the value
     */
    public AutoNumaStatus getAutoNumaStatus() {
        return autoNumaStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("certificate")
    private final OlvmCertificate certificate;

    public OlvmCertificate getCertificate() {
        return certificate;
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

    @com.fasterxml.jackson.annotation.JsonProperty("cpu")
    private final OlvmCpu cpu;

    public OlvmCpu getCpu() {
        return cpu;
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

    /** Specifies whether host device passthrough is enabled on this host. */
    @com.fasterxml.jackson.annotation.JsonProperty("isHostDevicePassthrough")
    private final Boolean isHostDevicePassthrough;

    /**
     * Specifies whether host device passthrough is enabled on this host.
     *
     * @return the value
     */
    public Boolean getIsHostDevicePassthrough() {
        return isHostDevicePassthrough;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("display")
    private final OlvmDisplay display;

    public OlvmDisplay getDisplay() {
        return display;
    }

    /** Status of storage domain. */
    public enum ExternalStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Error("ERROR"),
        Failure("FAILURE"),
        Info("INFO"),
        Ok("OK"),
        Warning("WARNING"),
        ;

        private final String value;
        private static java.util.Map<String, ExternalStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (ExternalStatus v : ExternalStatus.values()) {
                map.put(v.getValue(), v);
            }
        }

        ExternalStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExternalStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ExternalStatus: " + key);
        }
    };
    /** Status of storage domain. */
    @com.fasterxml.jackson.annotation.JsonProperty("externalStatus")
    private final ExternalStatus externalStatus;

    /**
     * Status of storage domain.
     *
     * @return the value
     */
    public ExternalStatus getExternalStatus() {
        return externalStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("hardwareInformation")
    private final OlvmHardwareInformation hardwareInformation;

    public OlvmHardwareInformation getHardwareInformation() {
        return hardwareInformation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("hostedEngine")
    private final OlvmHostedEngine hostedEngine;

    public OlvmHostedEngine getHostedEngine() {
        return hostedEngine;
    }

    /** A unique identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * A unique identifier.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("iscsi")
    private final OlvmIscsiDetails iscsi;

    public OlvmIscsiDetails getIscsi() {
        return iscsi;
    }

    /** The host KDUMP status. */
    public enum KdumpStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Disabled("DISABLED"),
        Enabled("ENABLED"),
        Unknown("UNKNOWN"),
        ;

        private final String value;
        private static java.util.Map<String, KdumpStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (KdumpStatus v : KdumpStatus.values()) {
                map.put(v.getValue(), v);
            }
        }

        KdumpStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static KdumpStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid KdumpStatus: " + key);
        }
    };
    /** The host KDUMP status. */
    @com.fasterxml.jackson.annotation.JsonProperty("kdumpStatus")
    private final KdumpStatus kdumpStatus;

    /**
     * The host KDUMP status.
     *
     * @return the value
     */
    public KdumpStatus getKdumpStatus() {
        return kdumpStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ksm")
    private final Ksm ksm;

    public Ksm getKsm() {
        return ksm;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("libvirtVersion")
    private final OlvmVersion libvirtVersion;

    public OlvmVersion getLibvirtVersion() {
        return libvirtVersion;
    }

    /** The max scheduling memory on this host in bytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxSchedulingMemoryInBytes")
    private final Long maxSchedulingMemoryInBytes;

    /**
     * The max scheduling memory on this host in bytes.
     *
     * @return the value
     */
    public Long getMaxSchedulingMemoryInBytes() {
        return maxSchedulingMemoryInBytes;
    }

    /** The amount of physical memory on this host in bytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInBytes")
    private final Long memoryInBytes;

    /**
     * The amount of physical memory on this host in bytes.
     *
     * @return the value
     */
    public Long getMemoryInBytes() {
        return memoryInBytes;
    }

    /** Name of the property. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the property.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Specifies whether a network-related operation, such as 'setup networks', 'sync networks', or
     * 'refresh capabilities', is currently being executed on this host.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isNetworkOperationInProgress")
    private final Boolean isNetworkOperationInProgress;

    /**
     * Specifies whether a network-related operation, such as 'setup networks', 'sync networks', or
     * 'refresh capabilities', is currently being executed on this host.
     *
     * @return the value
     */
    public Boolean getIsNetworkOperationInProgress() {
        return isNetworkOperationInProgress;
    }

    /** Specifies whether non uniform memory access (NUMA) is supported on this host. */
    @com.fasterxml.jackson.annotation.JsonProperty("isNumaSupported")
    private final Boolean isNumaSupported;

    /**
     * Specifies whether non uniform memory access (NUMA) is supported on this host.
     *
     * @return the value
     */
    public Boolean getIsNumaSupported() {
        return isNumaSupported;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("os")
    private final OlvmOperatingSystem os;

    public OlvmOperatingSystem getOs() {
        return os;
    }

    /** Specifies whether we should override firewall definitions */
    @com.fasterxml.jackson.annotation.JsonProperty("isOverrideIpTables")
    private final Boolean isOverrideIpTables;

    /**
     * Specifies whether we should override firewall definitions
     *
     * @return the value
     */
    public Boolean getIsOverrideIpTables() {
        return isOverrideIpTables;
    }

    /** Indicates if the host has correctly configured OVN. */
    @com.fasterxml.jackson.annotation.JsonProperty("isOvnConfigured")
    private final Boolean isOvnConfigured;

    /**
     * Indicates if the host has correctly configured OVN.
     *
     * @return the value
     */
    public Boolean getIsOvnConfigured() {
        return isOvnConfigured;
    }

    /** The host port. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The host port.
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("powerManagement")
    private final OlvmPowerManagement powerManagement;

    public OlvmPowerManagement getPowerManagement() {
        return powerManagement;
    }

    /** Specifies whether the host should be reinstalled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isReinstallationRequired")
    private final Boolean isReinstallationRequired;

    /**
     * Specifies whether the host should be reinstalled.
     *
     * @return the value
     */
    public Boolean getIsReinstallationRequired() {
        return isReinstallationRequired;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("seLinux")
    private final OlvmSelinux seLinux;

    public OlvmSelinux getSeLinux() {
        return seLinux;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("spm")
    private final OlvmSpm spm;

    public OlvmSpm getSpm() {
        return spm;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("hostStatus")
    private final OlvmHostStatus hostStatus;

    public OlvmHostStatus getHostStatus() {
        return hostStatus;
    }

    /** The host status details. */
    @com.fasterxml.jackson.annotation.JsonProperty("statusDetail")
    private final String statusDetail;

    /**
     * The host status details.
     *
     * @return the value
     */
    public String getStatusDetail() {
        return statusDetail;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    private final OlvmVmSummary summary;

    public OlvmVmSummary getSummary() {
        return summary;
    }

    /** Indicates if transparent huge pages (THP) support is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isTransparentHugePagesEnabled")
    private final Boolean isTransparentHugePagesEnabled;

    /**
     * Indicates if transparent huge pages (THP) support is enabled.
     *
     * @return the value
     */
    public Boolean getIsTransparentHugePagesEnabled() {
        return isTransparentHugePagesEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final OlvmHostType type;

    public OlvmHostType getType() {
        return type;
    }

    /** Specified whether there is an oVirt-related update on this host. */
    @com.fasterxml.jackson.annotation.JsonProperty("isUpdateAvailable")
    private final Boolean isUpdateAvailable;

    /**
     * Specified whether there is an oVirt-related update on this host.
     *
     * @return the value
     */
    public Boolean getIsUpdateAvailable() {
        return isUpdateAvailable;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final OlvmVersion version;

    public OlvmVersion getVersion() {
        return version;
    }

    /** Specifies the vGPU placement strategy. */
    public enum VgpuPlacement implements com.oracle.bmc.http.internal.BmcEnum {
        Consolidated("CONSOLIDATED"),
        Separated("SEPARATED"),
        ;

        private final String value;
        private static java.util.Map<String, VgpuPlacement> map;

        static {
            map = new java.util.HashMap<>();
            for (VgpuPlacement v : VgpuPlacement.values()) {
                map.put(v.getValue(), v);
            }
        }

        VgpuPlacement(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static VgpuPlacement create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid VgpuPlacement: " + key);
        }
    };
    /** Specifies the vGPU placement strategy. */
    @com.fasterxml.jackson.annotation.JsonProperty("vgpuPlacement")
    private final VgpuPlacement vgpuPlacement;

    /**
     * Specifies the vGPU placement strategy.
     *
     * @return the value
     */
    public VgpuPlacement getVgpuPlacement() {
        return vgpuPlacement;
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
        sb.append("OlvmHost(");
        sb.append("super=").append(super.toString());
        sb.append("address=").append(String.valueOf(this.address));
        sb.append(", autoNumaStatus=").append(String.valueOf(this.autoNumaStatus));
        sb.append(", certificate=").append(String.valueOf(this.certificate));
        sb.append(", comment=").append(String.valueOf(this.comment));
        sb.append(", cpu=").append(String.valueOf(this.cpu));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isHostDevicePassthrough=")
                .append(String.valueOf(this.isHostDevicePassthrough));
        sb.append(", display=").append(String.valueOf(this.display));
        sb.append(", externalStatus=").append(String.valueOf(this.externalStatus));
        sb.append(", hardwareInformation=").append(String.valueOf(this.hardwareInformation));
        sb.append(", hostedEngine=").append(String.valueOf(this.hostedEngine));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", iscsi=").append(String.valueOf(this.iscsi));
        sb.append(", kdumpStatus=").append(String.valueOf(this.kdumpStatus));
        sb.append(", ksm=").append(String.valueOf(this.ksm));
        sb.append(", libvirtVersion=").append(String.valueOf(this.libvirtVersion));
        sb.append(", maxSchedulingMemoryInBytes=")
                .append(String.valueOf(this.maxSchedulingMemoryInBytes));
        sb.append(", memoryInBytes=").append(String.valueOf(this.memoryInBytes));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", isNetworkOperationInProgress=")
                .append(String.valueOf(this.isNetworkOperationInProgress));
        sb.append(", isNumaSupported=").append(String.valueOf(this.isNumaSupported));
        sb.append(", os=").append(String.valueOf(this.os));
        sb.append(", isOverrideIpTables=").append(String.valueOf(this.isOverrideIpTables));
        sb.append(", isOvnConfigured=").append(String.valueOf(this.isOvnConfigured));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", powerManagement=").append(String.valueOf(this.powerManagement));
        sb.append(", isReinstallationRequired=")
                .append(String.valueOf(this.isReinstallationRequired));
        sb.append(", seLinux=").append(String.valueOf(this.seLinux));
        sb.append(", spm=").append(String.valueOf(this.spm));
        sb.append(", hostStatus=").append(String.valueOf(this.hostStatus));
        sb.append(", statusDetail=").append(String.valueOf(this.statusDetail));
        sb.append(", summary=").append(String.valueOf(this.summary));
        sb.append(", isTransparentHugePagesEnabled=")
                .append(String.valueOf(this.isTransparentHugePagesEnabled));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", isUpdateAvailable=").append(String.valueOf(this.isUpdateAvailable));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", vgpuPlacement=").append(String.valueOf(this.vgpuPlacement));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmHost)) {
            return false;
        }

        OlvmHost other = (OlvmHost) o;
        return java.util.Objects.equals(this.address, other.address)
                && java.util.Objects.equals(this.autoNumaStatus, other.autoNumaStatus)
                && java.util.Objects.equals(this.certificate, other.certificate)
                && java.util.Objects.equals(this.comment, other.comment)
                && java.util.Objects.equals(this.cpu, other.cpu)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.isHostDevicePassthrough, other.isHostDevicePassthrough)
                && java.util.Objects.equals(this.display, other.display)
                && java.util.Objects.equals(this.externalStatus, other.externalStatus)
                && java.util.Objects.equals(this.hardwareInformation, other.hardwareInformation)
                && java.util.Objects.equals(this.hostedEngine, other.hostedEngine)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.iscsi, other.iscsi)
                && java.util.Objects.equals(this.kdumpStatus, other.kdumpStatus)
                && java.util.Objects.equals(this.ksm, other.ksm)
                && java.util.Objects.equals(this.libvirtVersion, other.libvirtVersion)
                && java.util.Objects.equals(
                        this.maxSchedulingMemoryInBytes, other.maxSchedulingMemoryInBytes)
                && java.util.Objects.equals(this.memoryInBytes, other.memoryInBytes)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(
                        this.isNetworkOperationInProgress, other.isNetworkOperationInProgress)
                && java.util.Objects.equals(this.isNumaSupported, other.isNumaSupported)
                && java.util.Objects.equals(this.os, other.os)
                && java.util.Objects.equals(this.isOverrideIpTables, other.isOverrideIpTables)
                && java.util.Objects.equals(this.isOvnConfigured, other.isOvnConfigured)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.powerManagement, other.powerManagement)
                && java.util.Objects.equals(
                        this.isReinstallationRequired, other.isReinstallationRequired)
                && java.util.Objects.equals(this.seLinux, other.seLinux)
                && java.util.Objects.equals(this.spm, other.spm)
                && java.util.Objects.equals(this.hostStatus, other.hostStatus)
                && java.util.Objects.equals(this.statusDetail, other.statusDetail)
                && java.util.Objects.equals(this.summary, other.summary)
                && java.util.Objects.equals(
                        this.isTransparentHugePagesEnabled, other.isTransparentHugePagesEnabled)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.isUpdateAvailable, other.isUpdateAvailable)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.vgpuPlacement, other.vgpuPlacement)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.address == null ? 43 : this.address.hashCode());
        result =
                (result * PRIME)
                        + (this.autoNumaStatus == null ? 43 : this.autoNumaStatus.hashCode());
        result = (result * PRIME) + (this.certificate == null ? 43 : this.certificate.hashCode());
        result = (result * PRIME) + (this.comment == null ? 43 : this.comment.hashCode());
        result = (result * PRIME) + (this.cpu == null ? 43 : this.cpu.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.isHostDevicePassthrough == null
                                ? 43
                                : this.isHostDevicePassthrough.hashCode());
        result = (result * PRIME) + (this.display == null ? 43 : this.display.hashCode());
        result =
                (result * PRIME)
                        + (this.externalStatus == null ? 43 : this.externalStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.hardwareInformation == null
                                ? 43
                                : this.hardwareInformation.hashCode());
        result = (result * PRIME) + (this.hostedEngine == null ? 43 : this.hostedEngine.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.iscsi == null ? 43 : this.iscsi.hashCode());
        result = (result * PRIME) + (this.kdumpStatus == null ? 43 : this.kdumpStatus.hashCode());
        result = (result * PRIME) + (this.ksm == null ? 43 : this.ksm.hashCode());
        result =
                (result * PRIME)
                        + (this.libvirtVersion == null ? 43 : this.libvirtVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.maxSchedulingMemoryInBytes == null
                                ? 43
                                : this.maxSchedulingMemoryInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryInBytes == null ? 43 : this.memoryInBytes.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.isNetworkOperationInProgress == null
                                ? 43
                                : this.isNetworkOperationInProgress.hashCode());
        result =
                (result * PRIME)
                        + (this.isNumaSupported == null ? 43 : this.isNumaSupported.hashCode());
        result = (result * PRIME) + (this.os == null ? 43 : this.os.hashCode());
        result =
                (result * PRIME)
                        + (this.isOverrideIpTables == null
                                ? 43
                                : this.isOverrideIpTables.hashCode());
        result =
                (result * PRIME)
                        + (this.isOvnConfigured == null ? 43 : this.isOvnConfigured.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result =
                (result * PRIME)
                        + (this.powerManagement == null ? 43 : this.powerManagement.hashCode());
        result =
                (result * PRIME)
                        + (this.isReinstallationRequired == null
                                ? 43
                                : this.isReinstallationRequired.hashCode());
        result = (result * PRIME) + (this.seLinux == null ? 43 : this.seLinux.hashCode());
        result = (result * PRIME) + (this.spm == null ? 43 : this.spm.hashCode());
        result = (result * PRIME) + (this.hostStatus == null ? 43 : this.hostStatus.hashCode());
        result = (result * PRIME) + (this.statusDetail == null ? 43 : this.statusDetail.hashCode());
        result = (result * PRIME) + (this.summary == null ? 43 : this.summary.hashCode());
        result =
                (result * PRIME)
                        + (this.isTransparentHugePagesEnabled == null
                                ? 43
                                : this.isTransparentHugePagesEnabled.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.isUpdateAvailable == null ? 43 : this.isUpdateAvailable.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.vgpuPlacement == null ? 43 : this.vgpuPlacement.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
