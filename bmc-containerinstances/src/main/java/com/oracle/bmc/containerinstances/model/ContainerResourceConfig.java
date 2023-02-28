/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/**
 * The resource configuration for a Container. The resource configuration determines the guaranteed
 * resources allocated to the container and the maximum allowed resources for a container. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ContainerResourceConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ContainerResourceConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"vcpusLimit", "memoryLimitInGBs"})
    public ContainerResourceConfig(Float vcpusLimit, Float memoryLimitInGBs) {
        super();
        this.vcpusLimit = vcpusLimit;
        this.memoryLimitInGBs = memoryLimitInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The maximum amount of CPU utilization which may be consumed by the Container's process.
         * If no value is provided, then the process may consume all CPU resources on the Instance.
         * CPU usage is defined in terms of logical CPUs. This means that the maximum possible value
         * on an E3 ContainerInstance with 1 OCPU is 2.0.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcpusLimit")
        private Float vcpusLimit;

        /**
         * The maximum amount of CPU utilization which may be consumed by the Container's process.
         * If no value is provided, then the process may consume all CPU resources on the Instance.
         * CPU usage is defined in terms of logical CPUs. This means that the maximum possible value
         * on an E3 ContainerInstance with 1 OCPU is 2.0.
         *
         * @param vcpusLimit the value to set
         * @return this builder
         */
        public Builder vcpusLimit(Float vcpusLimit) {
            this.vcpusLimit = vcpusLimit;
            this.__explicitlySet__.add("vcpusLimit");
            return this;
        }
        /**
         * The maximum amount of memory which may be consumed by the Container's process. If no
         * value is provided, then the process may use all available memory on the Instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryLimitInGBs")
        private Float memoryLimitInGBs;

        /**
         * The maximum amount of memory which may be consumed by the Container's process. If no
         * value is provided, then the process may use all available memory on the Instance.
         *
         * @param memoryLimitInGBs the value to set
         * @return this builder
         */
        public Builder memoryLimitInGBs(Float memoryLimitInGBs) {
            this.memoryLimitInGBs = memoryLimitInGBs;
            this.__explicitlySet__.add("memoryLimitInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerResourceConfig build() {
            ContainerResourceConfig model =
                    new ContainerResourceConfig(this.vcpusLimit, this.memoryLimitInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerResourceConfig model) {
            if (model.wasPropertyExplicitlySet("vcpusLimit")) {
                this.vcpusLimit(model.getVcpusLimit());
            }
            if (model.wasPropertyExplicitlySet("memoryLimitInGBs")) {
                this.memoryLimitInGBs(model.getMemoryLimitInGBs());
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

    /**
     * The maximum amount of CPU utilization which may be consumed by the Container's process. If no
     * value is provided, then the process may consume all CPU resources on the Instance. CPU usage
     * is defined in terms of logical CPUs. This means that the maximum possible value on an E3
     * ContainerInstance with 1 OCPU is 2.0.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcpusLimit")
    private final Float vcpusLimit;

    /**
     * The maximum amount of CPU utilization which may be consumed by the Container's process. If no
     * value is provided, then the process may consume all CPU resources on the Instance. CPU usage
     * is defined in terms of logical CPUs. This means that the maximum possible value on an E3
     * ContainerInstance with 1 OCPU is 2.0.
     *
     * @return the value
     */
    public Float getVcpusLimit() {
        return vcpusLimit;
    }

    /**
     * The maximum amount of memory which may be consumed by the Container's process. If no value is
     * provided, then the process may use all available memory on the Instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryLimitInGBs")
    private final Float memoryLimitInGBs;

    /**
     * The maximum amount of memory which may be consumed by the Container's process. If no value is
     * provided, then the process may use all available memory on the Instance.
     *
     * @return the value
     */
    public Float getMemoryLimitInGBs() {
        return memoryLimitInGBs;
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
        sb.append("ContainerResourceConfig(");
        sb.append("super=").append(super.toString());
        sb.append("vcpusLimit=").append(String.valueOf(this.vcpusLimit));
        sb.append(", memoryLimitInGBs=").append(String.valueOf(this.memoryLimitInGBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContainerResourceConfig)) {
            return false;
        }

        ContainerResourceConfig other = (ContainerResourceConfig) o;
        return java.util.Objects.equals(this.vcpusLimit, other.vcpusLimit)
                && java.util.Objects.equals(this.memoryLimitInGBs, other.memoryLimitInGBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vcpusLimit == null ? 43 : this.vcpusLimit.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryLimitInGBs == null ? 43 : this.memoryLimitInGBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
