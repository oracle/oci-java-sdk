/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Summary of a host configuration for a resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "entitySource",
        defaultImpl = HostConfigurationSummary.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = MacsManagedExternalHostConfigurationSummary.class,
            name = "MACS_MANAGED_EXTERNAL_HOST"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PeComanagedHostConfigurationSummary.class,
            name = "PE_COMANAGED_HOST"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = MacsManagedCloudDbHostConfigurationSummary.class,
            name = "MACS_MANAGED_CLOUD_DB_HOST"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = EmManagedExternalHostConfigurationSummary.class,
            name = "EM_MANAGED_EXTERNAL_HOST"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = MacsManagedCloudHostConfigurationSummary.class,
            name = "MACS_MANAGED_CLOUD_HOST")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class HostConfigurationSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "hostInsightId",
        "compartmentId",
        "hostName",
        "platformType",
        "platformVersion",
        "platformVendor",
        "totalCpus",
        "totalMemoryInGBs",
        "cpuArchitecture",
        "cpuCacheInMBs",
        "cpuVendor",
        "cpuFrequencyInMhz",
        "cpuImplementation",
        "coresPerSocket",
        "totalSockets",
        "threadsPerSocket",
        "isHyperThreadingEnabled",
        "definedTags",
        "freeformTags"
    })
    protected HostConfigurationSummary(
            String hostInsightId,
            String compartmentId,
            String hostName,
            PlatformType platformType,
            String platformVersion,
            String platformVendor,
            Integer totalCpus,
            Double totalMemoryInGBs,
            String cpuArchitecture,
            Double cpuCacheInMBs,
            String cpuVendor,
            Double cpuFrequencyInMhz,
            String cpuImplementation,
            Integer coresPerSocket,
            Integer totalSockets,
            Integer threadsPerSocket,
            Boolean isHyperThreadingEnabled,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags) {
        super();
        this.hostInsightId = hostInsightId;
        this.compartmentId = compartmentId;
        this.hostName = hostName;
        this.platformType = platformType;
        this.platformVersion = platformVersion;
        this.platformVendor = platformVendor;
        this.totalCpus = totalCpus;
        this.totalMemoryInGBs = totalMemoryInGBs;
        this.cpuArchitecture = cpuArchitecture;
        this.cpuCacheInMBs = cpuCacheInMBs;
        this.cpuVendor = cpuVendor;
        this.cpuFrequencyInMhz = cpuFrequencyInMhz;
        this.cpuImplementation = cpuImplementation;
        this.coresPerSocket = coresPerSocket;
        this.totalSockets = totalSockets;
        this.threadsPerSocket = threadsPerSocket;
        this.isHyperThreadingEnabled = isHyperThreadingEnabled;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the host insight resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostInsightId")
    private final String hostInsightId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the host insight resource.
     *
     * @return the value
     */
    public String getHostInsightId() {
        return hostInsightId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The host name. The host name is unique amongst the hosts managed by the same management
     * agent.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * The host name. The host name is unique amongst the hosts managed by the same management
     * agent.
     *
     * @return the value
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Platform type. Supported platformType(s) for MACS-managed external host insight: [LINUX,
     * SOLARIS, WINDOWS]. Supported platformType(s) for MACS-managed cloud host insight: [LINUX].
     * Supported platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS,
     * ZLINUX, WINDOWS, AIX, HP-UX].
     */
    public enum PlatformType implements com.oracle.bmc.http.internal.BmcEnum {
        Linux("LINUX"),
        Solaris("SOLARIS"),
        Sunos("SUNOS"),
        Zlinux("ZLINUX"),
        Windows("WINDOWS"),
        Aix("AIX"),
        HpUx("HP_UX"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PlatformType.class);

        private final String value;
        private static java.util.Map<String, PlatformType> map;

        static {
            map = new java.util.HashMap<>();
            for (PlatformType v : PlatformType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PlatformType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PlatformType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PlatformType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Platform type. Supported platformType(s) for MACS-managed external host insight: [LINUX,
     * SOLARIS, WINDOWS]. Supported platformType(s) for MACS-managed cloud host insight: [LINUX].
     * Supported platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS,
     * ZLINUX, WINDOWS, AIX, HP-UX].
     */
    @com.fasterxml.jackson.annotation.JsonProperty("platformType")
    private final PlatformType platformType;

    /**
     * Platform type. Supported platformType(s) for MACS-managed external host insight: [LINUX,
     * SOLARIS, WINDOWS]. Supported platformType(s) for MACS-managed cloud host insight: [LINUX].
     * Supported platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS,
     * ZLINUX, WINDOWS, AIX, HP-UX].
     *
     * @return the value
     */
    public PlatformType getPlatformType() {
        return platformType;
    }

    /** Platform version. */
    @com.fasterxml.jackson.annotation.JsonProperty("platformVersion")
    private final String platformVersion;

    /**
     * Platform version.
     *
     * @return the value
     */
    public String getPlatformVersion() {
        return platformVersion;
    }

    /** Platform vendor. */
    @com.fasterxml.jackson.annotation.JsonProperty("platformVendor")
    private final String platformVendor;

    /**
     * Platform vendor.
     *
     * @return the value
     */
    public String getPlatformVendor() {
        return platformVendor;
    }

    /** Total CPU on this host. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalCpus")
    private final Integer totalCpus;

    /**
     * Total CPU on this host.
     *
     * @return the value
     */
    public Integer getTotalCpus() {
        return totalCpus;
    }

    /** Total amount of usable physical memory in gibabytes */
    @com.fasterxml.jackson.annotation.JsonProperty("totalMemoryInGBs")
    private final Double totalMemoryInGBs;

    /**
     * Total amount of usable physical memory in gibabytes
     *
     * @return the value
     */
    public Double getTotalMemoryInGBs() {
        return totalMemoryInGBs;
    }

    /** CPU architechure */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuArchitecture")
    private final String cpuArchitecture;

    /**
     * CPU architechure
     *
     * @return the value
     */
    public String getCpuArchitecture() {
        return cpuArchitecture;
    }

    /** Size of cache memory in megabytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCacheInMBs")
    private final Double cpuCacheInMBs;

    /**
     * Size of cache memory in megabytes.
     *
     * @return the value
     */
    public Double getCpuCacheInMBs() {
        return cpuCacheInMBs;
    }

    /** Name of the CPU vendor. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuVendor")
    private final String cpuVendor;

    /**
     * Name of the CPU vendor.
     *
     * @return the value
     */
    public String getCpuVendor() {
        return cpuVendor;
    }

    /** Clock frequency of the processor in megahertz. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuFrequencyInMhz")
    private final Double cpuFrequencyInMhz;

    /**
     * Clock frequency of the processor in megahertz.
     *
     * @return the value
     */
    public Double getCpuFrequencyInMhz() {
        return cpuFrequencyInMhz;
    }

    /** Model name of processor. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuImplementation")
    private final String cpuImplementation;

    /**
     * Model name of processor.
     *
     * @return the value
     */
    public String getCpuImplementation() {
        return cpuImplementation;
    }

    /** Number of cores per socket. */
    @com.fasterxml.jackson.annotation.JsonProperty("coresPerSocket")
    private final Integer coresPerSocket;

    /**
     * Number of cores per socket.
     *
     * @return the value
     */
    public Integer getCoresPerSocket() {
        return coresPerSocket;
    }

    /** Number of total sockets. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalSockets")
    private final Integer totalSockets;

    /**
     * Number of total sockets.
     *
     * @return the value
     */
    public Integer getTotalSockets() {
        return totalSockets;
    }

    /** Number of threads per socket. */
    @com.fasterxml.jackson.annotation.JsonProperty("threadsPerSocket")
    private final Integer threadsPerSocket;

    /**
     * Number of threads per socket.
     *
     * @return the value
     */
    public Integer getThreadsPerSocket() {
        return threadsPerSocket;
    }

    /** Indicates if hyper-threading is enabled or not */
    @com.fasterxml.jackson.annotation.JsonProperty("isHyperThreadingEnabled")
    private final Boolean isHyperThreadingEnabled;

    /**
     * Indicates if hyper-threading is enabled or not
     *
     * @return the value
     */
    public Boolean getIsHyperThreadingEnabled() {
        return isHyperThreadingEnabled;
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
        sb.append("HostConfigurationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("hostInsightId=").append(String.valueOf(this.hostInsightId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", platformType=").append(String.valueOf(this.platformType));
        sb.append(", platformVersion=").append(String.valueOf(this.platformVersion));
        sb.append(", platformVendor=").append(String.valueOf(this.platformVendor));
        sb.append(", totalCpus=").append(String.valueOf(this.totalCpus));
        sb.append(", totalMemoryInGBs=").append(String.valueOf(this.totalMemoryInGBs));
        sb.append(", cpuArchitecture=").append(String.valueOf(this.cpuArchitecture));
        sb.append(", cpuCacheInMBs=").append(String.valueOf(this.cpuCacheInMBs));
        sb.append(", cpuVendor=").append(String.valueOf(this.cpuVendor));
        sb.append(", cpuFrequencyInMhz=").append(String.valueOf(this.cpuFrequencyInMhz));
        sb.append(", cpuImplementation=").append(String.valueOf(this.cpuImplementation));
        sb.append(", coresPerSocket=").append(String.valueOf(this.coresPerSocket));
        sb.append(", totalSockets=").append(String.valueOf(this.totalSockets));
        sb.append(", threadsPerSocket=").append(String.valueOf(this.threadsPerSocket));
        sb.append(", isHyperThreadingEnabled=")
                .append(String.valueOf(this.isHyperThreadingEnabled));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostConfigurationSummary)) {
            return false;
        }

        HostConfigurationSummary other = (HostConfigurationSummary) o;
        return java.util.Objects.equals(this.hostInsightId, other.hostInsightId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.platformType, other.platformType)
                && java.util.Objects.equals(this.platformVersion, other.platformVersion)
                && java.util.Objects.equals(this.platformVendor, other.platformVendor)
                && java.util.Objects.equals(this.totalCpus, other.totalCpus)
                && java.util.Objects.equals(this.totalMemoryInGBs, other.totalMemoryInGBs)
                && java.util.Objects.equals(this.cpuArchitecture, other.cpuArchitecture)
                && java.util.Objects.equals(this.cpuCacheInMBs, other.cpuCacheInMBs)
                && java.util.Objects.equals(this.cpuVendor, other.cpuVendor)
                && java.util.Objects.equals(this.cpuFrequencyInMhz, other.cpuFrequencyInMhz)
                && java.util.Objects.equals(this.cpuImplementation, other.cpuImplementation)
                && java.util.Objects.equals(this.coresPerSocket, other.coresPerSocket)
                && java.util.Objects.equals(this.totalSockets, other.totalSockets)
                && java.util.Objects.equals(this.threadsPerSocket, other.threadsPerSocket)
                && java.util.Objects.equals(
                        this.isHyperThreadingEnabled, other.isHyperThreadingEnabled)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.hostInsightId == null ? 43 : this.hostInsightId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result = (result * PRIME) + (this.platformType == null ? 43 : this.platformType.hashCode());
        result =
                (result * PRIME)
                        + (this.platformVersion == null ? 43 : this.platformVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.platformVendor == null ? 43 : this.platformVendor.hashCode());
        result = (result * PRIME) + (this.totalCpus == null ? 43 : this.totalCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.totalMemoryInGBs == null ? 43 : this.totalMemoryInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.cpuArchitecture == null ? 43 : this.cpuArchitecture.hashCode());
        result =
                (result * PRIME)
                        + (this.cpuCacheInMBs == null ? 43 : this.cpuCacheInMBs.hashCode());
        result = (result * PRIME) + (this.cpuVendor == null ? 43 : this.cpuVendor.hashCode());
        result =
                (result * PRIME)
                        + (this.cpuFrequencyInMhz == null ? 43 : this.cpuFrequencyInMhz.hashCode());
        result =
                (result * PRIME)
                        + (this.cpuImplementation == null ? 43 : this.cpuImplementation.hashCode());
        result =
                (result * PRIME)
                        + (this.coresPerSocket == null ? 43 : this.coresPerSocket.hashCode());
        result = (result * PRIME) + (this.totalSockets == null ? 43 : this.totalSockets.hashCode());
        result =
                (result * PRIME)
                        + (this.threadsPerSocket == null ? 43 : this.threadsPerSocket.hashCode());
        result =
                (result * PRIME)
                        + (this.isHyperThreadingEnabled == null
                                ? 43
                                : this.isHyperThreadingEnabled.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
