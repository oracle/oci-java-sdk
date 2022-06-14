/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The platform configuration used when launching a bare metal GPU instance with the BM.GPU4.8 shape
 * (the AMD Rome platform).
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
    builder = AmdRomeBmGpuLaunchInstancePlatformConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AmdRomeBmGpuLaunchInstancePlatformConfig extends LaunchInstancePlatformConfig {
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
        /**
         * The number of NUMA nodes per socket (NPS).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("numaNodesPerSocket")
        private NumaNodesPerSocket numaNodesPerSocket;

        /**
         * The number of NUMA nodes per socket (NPS).
         *
         * @param numaNodesPerSocket the value to set
         * @return this builder
         **/
        public Builder numaNodesPerSocket(NumaNodesPerSocket numaNodesPerSocket) {
            this.numaNodesPerSocket = numaNodesPerSocket;
            this.__explicitlySet__.add("numaNodesPerSocket");
            return this;
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
        private Boolean isSymmetricMultiThreadingEnabled;

        /**
         * Whether symmetric multithreading is enabled on the instance. Symmetric multithreading is also
         * called simultaneous multithreading (SMT) or Intel Hyper-Threading.
         * <p>
         * Intel and AMD processors have two hardware execution threads per core (OCPU). SMT permits multiple
         * independent threads of execution, to better use the resources and increase the efficiency
         * of the CPU. When multithreading is disabled, only one thread is permitted to run on each core, which
         * can provide higher or more predictable performance for some workloads.
         *
         * @param isSymmetricMultiThreadingEnabled the value to set
         * @return this builder
         **/
        public Builder isSymmetricMultiThreadingEnabled(Boolean isSymmetricMultiThreadingEnabled) {
            this.isSymmetricMultiThreadingEnabled = isSymmetricMultiThreadingEnabled;
            this.__explicitlySet__.add("isSymmetricMultiThreadingEnabled");
            return this;
        }
        /**
         * Whether the Access Control Service is enabled on the instance. When enabled,
         * the platform can enforce PCIe device isolation, required for VFIO device pass-through.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAccessControlServiceEnabled")
        private Boolean isAccessControlServiceEnabled;

        /**
         * Whether the Access Control Service is enabled on the instance. When enabled,
         * the platform can enforce PCIe device isolation, required for VFIO device pass-through.
         *
         * @param isAccessControlServiceEnabled the value to set
         * @return this builder
         **/
        public Builder isAccessControlServiceEnabled(Boolean isAccessControlServiceEnabled) {
            this.isAccessControlServiceEnabled = isAccessControlServiceEnabled;
            this.__explicitlySet__.add("isAccessControlServiceEnabled");
            return this;
        }
        /**
         * Whether virtualization instructions are available. For example, Secure Virtual Machine for AMD shapes
         * or VT-x for Intel shapes.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("areVirtualInstructionsEnabled")
        private Boolean areVirtualInstructionsEnabled;

        /**
         * Whether virtualization instructions are available. For example, Secure Virtual Machine for AMD shapes
         * or VT-x for Intel shapes.
         *
         * @param areVirtualInstructionsEnabled the value to set
         * @return this builder
         **/
        public Builder areVirtualInstructionsEnabled(Boolean areVirtualInstructionsEnabled) {
            this.areVirtualInstructionsEnabled = areVirtualInstructionsEnabled;
            this.__explicitlySet__.add("areVirtualInstructionsEnabled");
            return this;
        }
        /**
         * Whether the input-output memory management unit is enabled.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isInputOutputMemoryManagementUnitEnabled")
        private Boolean isInputOutputMemoryManagementUnitEnabled;

        /**
         * Whether the input-output memory management unit is enabled.
         *
         * @param isInputOutputMemoryManagementUnitEnabled the value to set
         * @return this builder
         **/
        public Builder isInputOutputMemoryManagementUnitEnabled(
                Boolean isInputOutputMemoryManagementUnitEnabled) {
            this.isInputOutputMemoryManagementUnitEnabled =
                    isInputOutputMemoryManagementUnitEnabled;
            this.__explicitlySet__.add("isInputOutputMemoryManagementUnitEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AmdRomeBmGpuLaunchInstancePlatformConfig build() {
            AmdRomeBmGpuLaunchInstancePlatformConfig __instance__ =
                    new AmdRomeBmGpuLaunchInstancePlatformConfig(
                            isSecureBootEnabled,
                            isTrustedPlatformModuleEnabled,
                            isMeasuredBootEnabled,
                            numaNodesPerSocket,
                            isSymmetricMultiThreadingEnabled,
                            isAccessControlServiceEnabled,
                            areVirtualInstructionsEnabled,
                            isInputOutputMemoryManagementUnitEnabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AmdRomeBmGpuLaunchInstancePlatformConfig o) {
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
                                    o.getIsInputOutputMemoryManagementUnitEnabled());

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
    public AmdRomeBmGpuLaunchInstancePlatformConfig(
            Boolean isSecureBootEnabled,
            Boolean isTrustedPlatformModuleEnabled,
            Boolean isMeasuredBootEnabled,
            NumaNodesPerSocket numaNodesPerSocket,
            Boolean isSymmetricMultiThreadingEnabled,
            Boolean isAccessControlServiceEnabled,
            Boolean areVirtualInstructionsEnabled,
            Boolean isInputOutputMemoryManagementUnitEnabled) {
        super(isSecureBootEnabled, isTrustedPlatformModuleEnabled, isMeasuredBootEnabled);
        this.numaNodesPerSocket = numaNodesPerSocket;
        this.isSymmetricMultiThreadingEnabled = isSymmetricMultiThreadingEnabled;
        this.isAccessControlServiceEnabled = isAccessControlServiceEnabled;
        this.areVirtualInstructionsEnabled = areVirtualInstructionsEnabled;
        this.isInputOutputMemoryManagementUnitEnabled = isInputOutputMemoryManagementUnitEnabled;
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
        ;

        private final String value;
        private static java.util.Map<String, NumaNodesPerSocket> map;

        static {
            map = new java.util.HashMap<>();
            for (NumaNodesPerSocket v : NumaNodesPerSocket.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid NumaNodesPerSocket: " + key);
        }
    };
    /**
     * The number of NUMA nodes per socket (NPS).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numaNodesPerSocket")
    private final NumaNodesPerSocket numaNodesPerSocket;

    /**
     * The number of NUMA nodes per socket (NPS).
     *
     * @return the value
     **/
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

    /**
     * Whether symmetric multithreading is enabled on the instance. Symmetric multithreading is also
     * called simultaneous multithreading (SMT) or Intel Hyper-Threading.
     * <p>
     * Intel and AMD processors have two hardware execution threads per core (OCPU). SMT permits multiple
     * independent threads of execution, to better use the resources and increase the efficiency
     * of the CPU. When multithreading is disabled, only one thread is permitted to run on each core, which
     * can provide higher or more predictable performance for some workloads.
     *
     * @return the value
     **/
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

    /**
     * Whether the Access Control Service is enabled on the instance. When enabled,
     * the platform can enforce PCIe device isolation, required for VFIO device pass-through.
     *
     * @return the value
     **/
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

    /**
     * Whether virtualization instructions are available. For example, Secure Virtual Machine for AMD shapes
     * or VT-x for Intel shapes.
     *
     * @return the value
     **/
    public Boolean getAreVirtualInstructionsEnabled() {
        return areVirtualInstructionsEnabled;
    }

    /**
     * Whether the input-output memory management unit is enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isInputOutputMemoryManagementUnitEnabled")
    private final Boolean isInputOutputMemoryManagementUnitEnabled;

    /**
     * Whether the input-output memory management unit is enabled.
     *
     * @return the value
     **/
    public Boolean getIsInputOutputMemoryManagementUnitEnabled() {
        return isInputOutputMemoryManagementUnitEnabled;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AmdRomeBmGpuLaunchInstancePlatformConfig(");
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
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AmdRomeBmGpuLaunchInstancePlatformConfig)) {
            return false;
        }

        AmdRomeBmGpuLaunchInstancePlatformConfig other =
                (AmdRomeBmGpuLaunchInstancePlatformConfig) o;
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
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
