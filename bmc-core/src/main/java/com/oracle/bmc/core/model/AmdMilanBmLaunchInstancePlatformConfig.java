/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The platform configuration used when launching a bare metal instance with one of the following
 * shapes: BM.Standard.E4.128 or BM.DenseIO.E4.128 (the AMD Milan platform). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AmdMilanBmLaunchInstancePlatformConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class AmdMilanBmLaunchInstancePlatformConfig extends LaunchInstancePlatformConfig {
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

        @com.fasterxml.jackson.annotation.JsonProperty("isMemoryEncryptionEnabled")
        private Boolean isMemoryEncryptionEnabled;

        public Builder isMemoryEncryptionEnabled(Boolean isMemoryEncryptionEnabled) {
            this.isMemoryEncryptionEnabled = isMemoryEncryptionEnabled;
            this.__explicitlySet__.add("isMemoryEncryptionEnabled");
            return this;
        }
        /** The number of NUMA nodes per socket (NPS). */
        @com.fasterxml.jackson.annotation.JsonProperty("numaNodesPerSocket")
        private NumaNodesPerSocket numaNodesPerSocket;

        /**
         * The number of NUMA nodes per socket (NPS).
         *
         * @param numaNodesPerSocket the value to set
         * @return this builder
         */
        public Builder numaNodesPerSocket(NumaNodesPerSocket numaNodesPerSocket) {
            this.numaNodesPerSocket = numaNodesPerSocket;
            this.__explicitlySet__.add("numaNodesPerSocket");
            return this;
        }
        /**
         * Whether symmetric multithreading is enabled on the instance. Symmetric multithreading is
         * also called simultaneous multithreading (SMT) or Intel Hyper-Threading.
         *
         * <p>Intel and AMD processors have two hardware execution threads per core (OCPU). SMT
         * permits multiple independent threads of execution, to better use the resources and
         * increase the efficiency of the CPU. When multithreading is disabled, only one thread is
         * permitted to run on each core, which can provide higher or more predictable performance
         * for some workloads.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSymmetricMultiThreadingEnabled")
        private Boolean isSymmetricMultiThreadingEnabled;

        /**
         * Whether symmetric multithreading is enabled on the instance. Symmetric multithreading is
         * also called simultaneous multithreading (SMT) or Intel Hyper-Threading.
         *
         * <p>Intel and AMD processors have two hardware execution threads per core (OCPU). SMT
         * permits multiple independent threads of execution, to better use the resources and
         * increase the efficiency of the CPU. When multithreading is disabled, only one thread is
         * permitted to run on each core, which can provide higher or more predictable performance
         * for some workloads.
         *
         * @param isSymmetricMultiThreadingEnabled the value to set
         * @return this builder
         */
        public Builder isSymmetricMultiThreadingEnabled(Boolean isSymmetricMultiThreadingEnabled) {
            this.isSymmetricMultiThreadingEnabled = isSymmetricMultiThreadingEnabled;
            this.__explicitlySet__.add("isSymmetricMultiThreadingEnabled");
            return this;
        }
        /**
         * Whether the Access Control Service is enabled on the instance. When enabled, the platform
         * can enforce PCIe device isolation, required for VFIO device pass-through.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAccessControlServiceEnabled")
        private Boolean isAccessControlServiceEnabled;

        /**
         * Whether the Access Control Service is enabled on the instance. When enabled, the platform
         * can enforce PCIe device isolation, required for VFIO device pass-through.
         *
         * @param isAccessControlServiceEnabled the value to set
         * @return this builder
         */
        public Builder isAccessControlServiceEnabled(Boolean isAccessControlServiceEnabled) {
            this.isAccessControlServiceEnabled = isAccessControlServiceEnabled;
            this.__explicitlySet__.add("isAccessControlServiceEnabled");
            return this;
        }
        /**
         * Whether virtualization instructions are available. For example, Secure Virtual Machine
         * for AMD shapes or VT-x for Intel shapes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("areVirtualInstructionsEnabled")
        private Boolean areVirtualInstructionsEnabled;

        /**
         * Whether virtualization instructions are available. For example, Secure Virtual Machine
         * for AMD shapes or VT-x for Intel shapes.
         *
         * @param areVirtualInstructionsEnabled the value to set
         * @return this builder
         */
        public Builder areVirtualInstructionsEnabled(Boolean areVirtualInstructionsEnabled) {
            this.areVirtualInstructionsEnabled = areVirtualInstructionsEnabled;
            this.__explicitlySet__.add("areVirtualInstructionsEnabled");
            return this;
        }
        /** Whether the input-output memory management unit is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isInputOutputMemoryManagementUnitEnabled")
        private Boolean isInputOutputMemoryManagementUnitEnabled;

        /**
         * Whether the input-output memory management unit is enabled.
         *
         * @param isInputOutputMemoryManagementUnitEnabled the value to set
         * @return this builder
         */
        public Builder isInputOutputMemoryManagementUnitEnabled(
                Boolean isInputOutputMemoryManagementUnitEnabled) {
            this.isInputOutputMemoryManagementUnitEnabled =
                    isInputOutputMemoryManagementUnitEnabled;
            this.__explicitlySet__.add("isInputOutputMemoryManagementUnitEnabled");
            return this;
        }
        /**
         * The percentage of cores enabled. Value must be a multiple of 25%. If the requested
         * percentage results in a fractional number of cores, the system rounds up the number of
         * cores across processors and provisions an instance with a whole number of cores.
         *
         * <p>If the applications that you run on the instance use a core-based licensing model and
         * need fewer cores than the full size of the shape, you can disable cores to reduce your
         * licensing costs. The instance itself is billed for the full shape, regardless of whether
         * all cores are enabled.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("percentageOfCoresEnabled")
        private Integer percentageOfCoresEnabled;

        /**
         * The percentage of cores enabled. Value must be a multiple of 25%. If the requested
         * percentage results in a fractional number of cores, the system rounds up the number of
         * cores across processors and provisions an instance with a whole number of cores.
         *
         * <p>If the applications that you run on the instance use a core-based licensing model and
         * need fewer cores than the full size of the shape, you can disable cores to reduce your
         * licensing costs. The instance itself is billed for the full shape, regardless of whether
         * all cores are enabled.
         *
         * @param percentageOfCoresEnabled the value to set
         * @return this builder
         */
        public Builder percentageOfCoresEnabled(Integer percentageOfCoresEnabled) {
            this.percentageOfCoresEnabled = percentageOfCoresEnabled;
            this.__explicitlySet__.add("percentageOfCoresEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AmdMilanBmLaunchInstancePlatformConfig build() {
            AmdMilanBmLaunchInstancePlatformConfig model =
                    new AmdMilanBmLaunchInstancePlatformConfig(
                            this.isSecureBootEnabled,
                            this.isTrustedPlatformModuleEnabled,
                            this.isMeasuredBootEnabled,
                            this.isMemoryEncryptionEnabled,
                            this.numaNodesPerSocket,
                            this.isSymmetricMultiThreadingEnabled,
                            this.isAccessControlServiceEnabled,
                            this.areVirtualInstructionsEnabled,
                            this.isInputOutputMemoryManagementUnitEnabled,
                            this.percentageOfCoresEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AmdMilanBmLaunchInstancePlatformConfig model) {
            if (model.wasPropertyExplicitlySet("isSecureBootEnabled")) {
                this.isSecureBootEnabled(model.getIsSecureBootEnabled());
            }
            if (model.wasPropertyExplicitlySet("isTrustedPlatformModuleEnabled")) {
                this.isTrustedPlatformModuleEnabled(model.getIsTrustedPlatformModuleEnabled());
            }
            if (model.wasPropertyExplicitlySet("isMeasuredBootEnabled")) {
                this.isMeasuredBootEnabled(model.getIsMeasuredBootEnabled());
            }
            if (model.wasPropertyExplicitlySet("isMemoryEncryptionEnabled")) {
                this.isMemoryEncryptionEnabled(model.getIsMemoryEncryptionEnabled());
            }
            if (model.wasPropertyExplicitlySet("numaNodesPerSocket")) {
                this.numaNodesPerSocket(model.getNumaNodesPerSocket());
            }
            if (model.wasPropertyExplicitlySet("isSymmetricMultiThreadingEnabled")) {
                this.isSymmetricMultiThreadingEnabled(model.getIsSymmetricMultiThreadingEnabled());
            }
            if (model.wasPropertyExplicitlySet("isAccessControlServiceEnabled")) {
                this.isAccessControlServiceEnabled(model.getIsAccessControlServiceEnabled());
            }
            if (model.wasPropertyExplicitlySet("areVirtualInstructionsEnabled")) {
                this.areVirtualInstructionsEnabled(model.getAreVirtualInstructionsEnabled());
            }
            if (model.wasPropertyExplicitlySet("isInputOutputMemoryManagementUnitEnabled")) {
                this.isInputOutputMemoryManagementUnitEnabled(
                        model.getIsInputOutputMemoryManagementUnitEnabled());
            }
            if (model.wasPropertyExplicitlySet("percentageOfCoresEnabled")) {
                this.percentageOfCoresEnabled(model.getPercentageOfCoresEnabled());
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

    @Deprecated
    public AmdMilanBmLaunchInstancePlatformConfig(
            Boolean isSecureBootEnabled,
            Boolean isTrustedPlatformModuleEnabled,
            Boolean isMeasuredBootEnabled,
            Boolean isMemoryEncryptionEnabled,
            NumaNodesPerSocket numaNodesPerSocket,
            Boolean isSymmetricMultiThreadingEnabled,
            Boolean isAccessControlServiceEnabled,
            Boolean areVirtualInstructionsEnabled,
            Boolean isInputOutputMemoryManagementUnitEnabled,
            Integer percentageOfCoresEnabled) {
        super(
                isSecureBootEnabled,
                isTrustedPlatformModuleEnabled,
                isMeasuredBootEnabled,
                isMemoryEncryptionEnabled);
        this.numaNodesPerSocket = numaNodesPerSocket;
        this.isSymmetricMultiThreadingEnabled = isSymmetricMultiThreadingEnabled;
        this.isAccessControlServiceEnabled = isAccessControlServiceEnabled;
        this.areVirtualInstructionsEnabled = areVirtualInstructionsEnabled;
        this.isInputOutputMemoryManagementUnitEnabled = isInputOutputMemoryManagementUnitEnabled;
        this.percentageOfCoresEnabled = percentageOfCoresEnabled;
    }

    /** The number of NUMA nodes per socket (NPS). */
    public enum NumaNodesPerSocket implements com.oracle.bmc.http.internal.BmcEnum {
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
    /** The number of NUMA nodes per socket (NPS). */
    @com.fasterxml.jackson.annotation.JsonProperty("numaNodesPerSocket")
    private final NumaNodesPerSocket numaNodesPerSocket;

    /**
     * The number of NUMA nodes per socket (NPS).
     *
     * @return the value
     */
    public NumaNodesPerSocket getNumaNodesPerSocket() {
        return numaNodesPerSocket;
    }

    /**
     * Whether symmetric multithreading is enabled on the instance. Symmetric multithreading is also
     * called simultaneous multithreading (SMT) or Intel Hyper-Threading.
     *
     * <p>Intel and AMD processors have two hardware execution threads per core (OCPU). SMT permits
     * multiple independent threads of execution, to better use the resources and increase the
     * efficiency of the CPU. When multithreading is disabled, only one thread is permitted to run
     * on each core, which can provide higher or more predictable performance for some workloads.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSymmetricMultiThreadingEnabled")
    private final Boolean isSymmetricMultiThreadingEnabled;

    /**
     * Whether symmetric multithreading is enabled on the instance. Symmetric multithreading is also
     * called simultaneous multithreading (SMT) or Intel Hyper-Threading.
     *
     * <p>Intel and AMD processors have two hardware execution threads per core (OCPU). SMT permits
     * multiple independent threads of execution, to better use the resources and increase the
     * efficiency of the CPU. When multithreading is disabled, only one thread is permitted to run
     * on each core, which can provide higher or more predictable performance for some workloads.
     *
     * @return the value
     */
    public Boolean getIsSymmetricMultiThreadingEnabled() {
        return isSymmetricMultiThreadingEnabled;
    }

    /**
     * Whether the Access Control Service is enabled on the instance. When enabled, the platform can
     * enforce PCIe device isolation, required for VFIO device pass-through.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAccessControlServiceEnabled")
    private final Boolean isAccessControlServiceEnabled;

    /**
     * Whether the Access Control Service is enabled on the instance. When enabled, the platform can
     * enforce PCIe device isolation, required for VFIO device pass-through.
     *
     * @return the value
     */
    public Boolean getIsAccessControlServiceEnabled() {
        return isAccessControlServiceEnabled;
    }

    /**
     * Whether virtualization instructions are available. For example, Secure Virtual Machine for
     * AMD shapes or VT-x for Intel shapes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("areVirtualInstructionsEnabled")
    private final Boolean areVirtualInstructionsEnabled;

    /**
     * Whether virtualization instructions are available. For example, Secure Virtual Machine for
     * AMD shapes or VT-x for Intel shapes.
     *
     * @return the value
     */
    public Boolean getAreVirtualInstructionsEnabled() {
        return areVirtualInstructionsEnabled;
    }

    /** Whether the input-output memory management unit is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isInputOutputMemoryManagementUnitEnabled")
    private final Boolean isInputOutputMemoryManagementUnitEnabled;

    /**
     * Whether the input-output memory management unit is enabled.
     *
     * @return the value
     */
    public Boolean getIsInputOutputMemoryManagementUnitEnabled() {
        return isInputOutputMemoryManagementUnitEnabled;
    }

    /**
     * The percentage of cores enabled. Value must be a multiple of 25%. If the requested percentage
     * results in a fractional number of cores, the system rounds up the number of cores across
     * processors and provisions an instance with a whole number of cores.
     *
     * <p>If the applications that you run on the instance use a core-based licensing model and need
     * fewer cores than the full size of the shape, you can disable cores to reduce your licensing
     * costs. The instance itself is billed for the full shape, regardless of whether all cores are
     * enabled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("percentageOfCoresEnabled")
    private final Integer percentageOfCoresEnabled;

    /**
     * The percentage of cores enabled. Value must be a multiple of 25%. If the requested percentage
     * results in a fractional number of cores, the system rounds up the number of cores across
     * processors and provisions an instance with a whole number of cores.
     *
     * <p>If the applications that you run on the instance use a core-based licensing model and need
     * fewer cores than the full size of the shape, you can disable cores to reduce your licensing
     * costs. The instance itself is billed for the full shape, regardless of whether all cores are
     * enabled.
     *
     * @return the value
     */
    public Integer getPercentageOfCoresEnabled() {
        return percentageOfCoresEnabled;
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
        sb.append("AmdMilanBmLaunchInstancePlatformConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
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
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AmdMilanBmLaunchInstancePlatformConfig)) {
            return false;
        }

        AmdMilanBmLaunchInstancePlatformConfig other = (AmdMilanBmLaunchInstancePlatformConfig) o;
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
                && super.equals(other);
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
        return result;
    }
}
