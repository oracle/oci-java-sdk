/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The platform configuration of a bare metal instance that uses the BM.Standard.E3.128 shape (the AMD Rome platform).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AmdRomeBmPlatformConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AmdRomeBmPlatformConfig extends PlatformConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isSecureBootEnabled")
        private Boolean isSecureBootEnabled;

        public Builder isSecureBootEnabled(Boolean isSecureBootEnabled) {
            this.isSecureBootEnabled = isSecureBootEnabled;
            this.__explicitlySet__.add("isSecureBootEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isTrustedPlatformModuleEnabled")
        private Boolean isTrustedPlatformModuleEnabled;

        public Builder isTrustedPlatformModuleEnabled(Boolean isTrustedPlatformModuleEnabled) {
            this.isTrustedPlatformModuleEnabled = isTrustedPlatformModuleEnabled;
            this.__explicitlySet__.add("isTrustedPlatformModuleEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMeasuredBootEnabled")
        private Boolean isMeasuredBootEnabled;

        public Builder isMeasuredBootEnabled(Boolean isMeasuredBootEnabled) {
            this.isMeasuredBootEnabled = isMeasuredBootEnabled;
            this.__explicitlySet__.add("isMeasuredBootEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("numaNodesPerSocket")
        private NumaNodesPerSocket numaNodesPerSocket;

        public Builder numaNodesPerSocket(NumaNodesPerSocket numaNodesPerSocket) {
            this.numaNodesPerSocket = numaNodesPerSocket;
            this.__explicitlySet__.add("numaNodesPerSocket");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSymmetricMultiThreadingEnabled")
        private Boolean isSymmetricMultiThreadingEnabled;

        public Builder isSymmetricMultiThreadingEnabled(Boolean isSymmetricMultiThreadingEnabled) {
            this.isSymmetricMultiThreadingEnabled = isSymmetricMultiThreadingEnabled;
            this.__explicitlySet__.add("isSymmetricMultiThreadingEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAccessControlServiceEnabled")
        private Boolean isAccessControlServiceEnabled;

        public Builder isAccessControlServiceEnabled(Boolean isAccessControlServiceEnabled) {
            this.isAccessControlServiceEnabled = isAccessControlServiceEnabled;
            this.__explicitlySet__.add("isAccessControlServiceEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("areVirtualInstructionsEnabled")
        private Boolean areVirtualInstructionsEnabled;

        public Builder areVirtualInstructionsEnabled(Boolean areVirtualInstructionsEnabled) {
            this.areVirtualInstructionsEnabled = areVirtualInstructionsEnabled;
            this.__explicitlySet__.add("areVirtualInstructionsEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isInputOutputMemoryManagementUnitEnabled")
        private Boolean isInputOutputMemoryManagementUnitEnabled;

        public Builder isInputOutputMemoryManagementUnitEnabled(
                Boolean isInputOutputMemoryManagementUnitEnabled) {
            this.isInputOutputMemoryManagementUnitEnabled =
                    isInputOutputMemoryManagementUnitEnabled;
            this.__explicitlySet__.add("isInputOutputMemoryManagementUnitEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("percentageOfCoresEnabled")
        private Integer percentageOfCoresEnabled;

        public Builder percentageOfCoresEnabled(Integer percentageOfCoresEnabled) {
            this.percentageOfCoresEnabled = percentageOfCoresEnabled;
            this.__explicitlySet__.add("percentageOfCoresEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AmdRomeBmPlatformConfig build() {
            AmdRomeBmPlatformConfig __instance__ =
                    new AmdRomeBmPlatformConfig(
                            isSecureBootEnabled,
                            isTrustedPlatformModuleEnabled,
                            isMeasuredBootEnabled,
                            numaNodesPerSocket,
                            isSymmetricMultiThreadingEnabled,
                            isAccessControlServiceEnabled,
                            areVirtualInstructionsEnabled,
                            isInputOutputMemoryManagementUnitEnabled,
                            percentageOfCoresEnabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AmdRomeBmPlatformConfig o) {
            Builder copiedBuilder =
                    isSecureBootEnabled(o.getIsSecureBootEnabled())
                            .isTrustedPlatformModuleEnabled(o.getIsTrustedPlatformModuleEnabled())
                            .isMeasuredBootEnabled(o.getIsMeasuredBootEnabled())
                            .numaNodesPerSocket(o.getNumaNodesPerSocket())
                            .isSymmetricMultiThreadingEnabled(
                                    o.getIsSymmetricMultiThreadingEnabled())
                            .isAccessControlServiceEnabled(o.getIsAccessControlServiceEnabled())
                            .areVirtualInstructionsEnabled(o.getAreVirtualInstructionsEnabled())
                            .isInputOutputMemoryManagementUnitEnabled(
                                    o.getIsInputOutputMemoryManagementUnitEnabled())
                            .percentageOfCoresEnabled(o.getPercentageOfCoresEnabled());

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

    @Deprecated
    public AmdRomeBmPlatformConfig(
            Boolean isSecureBootEnabled,
            Boolean isTrustedPlatformModuleEnabled,
            Boolean isMeasuredBootEnabled,
            NumaNodesPerSocket numaNodesPerSocket,
            Boolean isSymmetricMultiThreadingEnabled,
            Boolean isAccessControlServiceEnabled,
            Boolean areVirtualInstructionsEnabled,
            Boolean isInputOutputMemoryManagementUnitEnabled,
            Integer percentageOfCoresEnabled) {
        super(isSecureBootEnabled, isTrustedPlatformModuleEnabled, isMeasuredBootEnabled);
        this.numaNodesPerSocket = numaNodesPerSocket;
        this.isSymmetricMultiThreadingEnabled = isSymmetricMultiThreadingEnabled;
        this.isAccessControlServiceEnabled = isAccessControlServiceEnabled;
        this.areVirtualInstructionsEnabled = areVirtualInstructionsEnabled;
        this.isInputOutputMemoryManagementUnitEnabled = isInputOutputMemoryManagementUnitEnabled;
        this.percentageOfCoresEnabled = percentageOfCoresEnabled;
    }

    /**
     * The number of NUMA nodes per socket (NPS).
     *
     **/
    public enum NumaNodesPerSocket {
        Nps0("NPS0"),
        Nps1("NPS1"),
        Nps2("NPS2"),
        Nps4("NPS4"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(NumaNodesPerSocket.class);

        private final String value;
        private static java.util.Map<String, NumaNodesPerSocket> map;

        static {
            map = new java.util.HashMap<>();
            for (NumaNodesPerSocket v : NumaNodesPerSocket.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        NumaNodesPerSocket(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NumaNodesPerSocket create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'NumaNodesPerSocket', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The number of NUMA nodes per socket (NPS).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numaNodesPerSocket")
    private final NumaNodesPerSocket numaNodesPerSocket;

    public NumaNodesPerSocket getNumaNodesPerSocket() {
        return numaNodesPerSocket;
    }

    /**
     * Whether symmetric multithreading is enabled on the instance. Symmetric multithreading is also
     * called simultaneous multithreading (SMT) or Intel Hyper-Threading.
     * <p>
     * Intel and AMD processors have two hardware execution threads per core (OCPU). SMT permits multiple
     * independent threads of execution, to better use the resources and increase the efficiency
     * of the CPU. When multithreading is disabled, only one thread is permitted to run on each core, which
     * can provide higher or more predictable performance for some workloads.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSymmetricMultiThreadingEnabled")
    private final Boolean isSymmetricMultiThreadingEnabled;

    public Boolean getIsSymmetricMultiThreadingEnabled() {
        return isSymmetricMultiThreadingEnabled;
    }

    /**
     * Whether the Access Control Service is enabled on the instance. When enabled,
     * the platform can enforce PCIe device isolation, required for VFIO device pass-through.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAccessControlServiceEnabled")
    private final Boolean isAccessControlServiceEnabled;

    public Boolean getIsAccessControlServiceEnabled() {
        return isAccessControlServiceEnabled;
    }

    /**
     * Whether virtualization instructions are available. For example, Secure Virtual Machine for AMD shapes
     * or VT-x for Intel shapes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areVirtualInstructionsEnabled")
    private final Boolean areVirtualInstructionsEnabled;

    public Boolean getAreVirtualInstructionsEnabled() {
        return areVirtualInstructionsEnabled;
    }

    /**
     * Whether the input-output memory management unit is enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isInputOutputMemoryManagementUnitEnabled")
    private final Boolean isInputOutputMemoryManagementUnitEnabled;

    public Boolean getIsInputOutputMemoryManagementUnitEnabled() {
        return isInputOutputMemoryManagementUnitEnabled;
    }

    /**
     * The percentage of cores enabled. Value must be a multiple of 25%. If the requested percentage
     * results in a fractional number of cores, the system rounds up the number of cores across processors
     * and provisions an instance with a whole number of cores.
     * <p>
     * If the applications that you run on the instance use a core-based licensing model and need fewer cores
     * than the full size of the shape, you can disable cores to reduce your licensing costs. The instance
     * itself is billed for the full shape, regardless of whether all cores are enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("percentageOfCoresEnabled")
    private final Integer percentageOfCoresEnabled;

    public Integer getPercentageOfCoresEnabled() {
        return percentageOfCoresEnabled;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AmdRomeBmPlatformConfig(");
        sb.append("super=").append(super.toString());
        sb.append(", numaNodesPerSocket=").append(String.valueOf(this.numaNodesPerSocket));
        sb.append(", isSymmetricMultiThreadingEnabled=")
                .append(String.valueOf(this.isSymmetricMultiThreadingEnabled));
        sb.append(", isAccessControlServiceEnabled=")
                .append(String.valueOf(this.isAccessControlServiceEnabled));
        sb.append(", areVirtualInstructionsEnabled=")
                .append(String.valueOf(this.areVirtualInstructionsEnabled));
        sb.append(", isInputOutputMemoryManagementUnitEnabled=")
                .append(String.valueOf(this.isInputOutputMemoryManagementUnitEnabled));
        sb.append(", percentageOfCoresEnabled=")
                .append(String.valueOf(this.percentageOfCoresEnabled));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AmdRomeBmPlatformConfig)) {
            return false;
        }

        AmdRomeBmPlatformConfig other = (AmdRomeBmPlatformConfig) o;
        return java.util.Objects.equals(this.numaNodesPerSocket, other.numaNodesPerSocket)
                && java.util.Objects.equals(
                        this.isSymmetricMultiThreadingEnabled,
                        other.isSymmetricMultiThreadingEnabled)
                && java.util.Objects.equals(
                        this.isAccessControlServiceEnabled, other.isAccessControlServiceEnabled)
                && java.util.Objects.equals(
                        this.areVirtualInstructionsEnabled, other.areVirtualInstructionsEnabled)
                && java.util.Objects.equals(
                        this.isInputOutputMemoryManagementUnitEnabled,
                        other.isInputOutputMemoryManagementUnitEnabled)
                && java.util.Objects.equals(
                        this.percentageOfCoresEnabled, other.percentageOfCoresEnabled)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.numaNodesPerSocket == null
                                ? 43
                                : this.numaNodesPerSocket.hashCode());
        result =
                (result * PRIME)
                        + (this.isSymmetricMultiThreadingEnabled == null
                                ? 43
                                : this.isSymmetricMultiThreadingEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isAccessControlServiceEnabled == null
                                ? 43
                                : this.isAccessControlServiceEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.areVirtualInstructionsEnabled == null
                                ? 43
                                : this.areVirtualInstructionsEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isInputOutputMemoryManagementUnitEnabled == null
                                ? 43
                                : this.isInputOutputMemoryManagementUnitEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.percentageOfCoresEnabled == null
                                ? 43
                                : this.percentageOfCoresEnabled.hashCode());
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
