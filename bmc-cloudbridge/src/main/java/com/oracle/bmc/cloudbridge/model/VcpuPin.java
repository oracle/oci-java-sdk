/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * vCPU Pin <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VcpuPin.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VcpuPin extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"cpuSet", "vcpu"})
    public VcpuPin(String cpuSet, Integer vcpu) {
        super();
        this.cpuSet = cpuSet;
        this.vcpu = vcpu;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** CPU Set */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuSet")
        private String cpuSet;

        /**
         * CPU Set
         *
         * @param cpuSet the value to set
         * @return this builder
         */
        public Builder cpuSet(String cpuSet) {
            this.cpuSet = cpuSet;
            this.__explicitlySet__.add("cpuSet");
            return this;
        }
        /** vCPU number */
        @com.fasterxml.jackson.annotation.JsonProperty("vcpu")
        private Integer vcpu;

        /**
         * vCPU number
         *
         * @param vcpu the value to set
         * @return this builder
         */
        public Builder vcpu(Integer vcpu) {
            this.vcpu = vcpu;
            this.__explicitlySet__.add("vcpu");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VcpuPin build() {
            VcpuPin model = new VcpuPin(this.cpuSet, this.vcpu);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VcpuPin model) {
            if (model.wasPropertyExplicitlySet("cpuSet")) {
                this.cpuSet(model.getCpuSet());
            }
            if (model.wasPropertyExplicitlySet("vcpu")) {
                this.vcpu(model.getVcpu());
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

    /** CPU Set */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuSet")
    private final String cpuSet;

    /**
     * CPU Set
     *
     * @return the value
     */
    public String getCpuSet() {
        return cpuSet;
    }

    /** vCPU number */
    @com.fasterxml.jackson.annotation.JsonProperty("vcpu")
    private final Integer vcpu;

    /**
     * vCPU number
     *
     * @return the value
     */
    public Integer getVcpu() {
        return vcpu;
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
        sb.append("VcpuPin(");
        sb.append("super=").append(super.toString());
        sb.append("cpuSet=").append(String.valueOf(this.cpuSet));
        sb.append(", vcpu=").append(String.valueOf(this.vcpu));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VcpuPin)) {
            return false;
        }

        VcpuPin other = (VcpuPin) o;
        return java.util.Objects.equals(this.cpuSet, other.cpuSet)
                && java.util.Objects.equals(this.vcpu, other.vcpu)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cpuSet == null ? 43 : this.cpuSet.hashCode());
        result = (result * PRIME) + (this.vcpu == null ? 43 : this.vcpu.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
