/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Summary of a host configuration for a resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "entitySource",
    defaultImpl = HostConfigurationSummary.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = MacsManagedExternalHostConfigurationSummary.class,
        name = "MACS_MANAGED_EXTERNAL_HOST"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = EmManagedExternalHostConfigurationSummary.class,
        name = "EM_MANAGED_EXTERNAL_HOST"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class HostConfigurationSummary {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the host insight resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostInsightId")
    String hostInsightId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The host name. The host name is unique amongst the hosts managed by the same management agent.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    String hostName;
    /**
     * Platform type.
     * Supported platformType(s) for MACS-managed external host insight: [LINUX].
     * Supported platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS, ZLINUX].
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PlatformType {
        Linux("LINUX"),
        Solaris("SOLARIS"),
        Sunos("SUNOS"),
        Zlinux("ZLINUX"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * Platform type.
     * Supported platformType(s) for MACS-managed external host insight: [LINUX].
     * Supported platformType(s) for EM-managed external host insight: [LINUX, SOLARIS, SUNOS, ZLINUX].
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformType")
    PlatformType platformType;

    /**
     * Platform version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformVersion")
    String platformVersion;

    /**
     * Platform vendor.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformVendor")
    String platformVendor;

    /**
     * Total CPU on this host.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalCpus")
    Integer totalCpus;

    /**
     * Total amount of usable physical memory in gibabytes
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalMemoryInGBs")
    Double totalMemoryInGBs;

    /**
     * CPU architechure
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuArchitecture")
    String cpuArchitecture;

    /**
     * Size of cache memory in megabytes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCacheInMBs")
    Double cpuCacheInMBs;

    /**
     * Name of the CPU vendor.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuVendor")
    String cpuVendor;

    /**
     * Clock frequency of the processor in megahertz.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuFrequencyInMhz")
    Double cpuFrequencyInMhz;

    /**
     * Model name of processor.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuImplementation")
    String cpuImplementation;

    /**
     * Number of cores per socket.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("coresPerSocket")
    Integer coresPerSocket;

    /**
     * Number of total sockets.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSockets")
    Integer totalSockets;

    /**
     * Number of threads per socket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("threadsPerSocket")
    Integer threadsPerSocket;

    /**
     * Indicates if hyper-threading is enabled or not
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHyperThreadingEnabled")
    Boolean isHyperThreadingEnabled;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;
}
