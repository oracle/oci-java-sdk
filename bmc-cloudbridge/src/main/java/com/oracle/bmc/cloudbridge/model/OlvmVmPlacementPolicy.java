/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * The configuration of the virtual machine\u2019s placement policy.
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
    builder = OlvmVmPlacementPolicy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OlvmVmPlacementPolicy
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"vmAffinity", "hosts"})
    public OlvmVmPlacementPolicy(VmAffinity vmAffinity, java.util.List<OlvmHost> hosts) {
        super();
        this.vmAffinity = vmAffinity;
        this.hosts = hosts;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Affinity of the virtual machine.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vmAffinity")
        private VmAffinity vmAffinity;

        /**
         * Affinity of the virtual machine.
         * @param vmAffinity the value to set
         * @return this builder
         **/
        public Builder vmAffinity(VmAffinity vmAffinity) {
            this.vmAffinity = vmAffinity;
            this.__explicitlySet__.add("vmAffinity");
            return this;
        }
        /**
         * List of hosts.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hosts")
        private java.util.List<OlvmHost> hosts;

        /**
         * List of hosts.
         * @param hosts the value to set
         * @return this builder
         **/
        public Builder hosts(java.util.List<OlvmHost> hosts) {
            this.hosts = hosts;
            this.__explicitlySet__.add("hosts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmVmPlacementPolicy build() {
            OlvmVmPlacementPolicy model = new OlvmVmPlacementPolicy(this.vmAffinity, this.hosts);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmVmPlacementPolicy model) {
            if (model.wasPropertyExplicitlySet("vmAffinity")) {
                this.vmAffinity(model.getVmAffinity());
            }
            if (model.wasPropertyExplicitlySet("hosts")) {
                this.hosts(model.getHosts());
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
     * Affinity of the virtual machine.
     **/
    public enum VmAffinity {
        Migratable("MIGRATABLE"),
        Pinned("PINNED"),
        UserMigratable("USER_MIGRATABLE"),
        ;

        private final String value;
        private static java.util.Map<String, VmAffinity> map;

        static {
            map = new java.util.HashMap<>();
            for (VmAffinity v : VmAffinity.values()) {
                map.put(v.getValue(), v);
            }
        }

        VmAffinity(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static VmAffinity create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid VmAffinity: " + key);
        }
    };
    /**
     * Affinity of the virtual machine.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vmAffinity")
    private final VmAffinity vmAffinity;

    /**
     * Affinity of the virtual machine.
     * @return the value
     **/
    public VmAffinity getVmAffinity() {
        return vmAffinity;
    }

    /**
     * List of hosts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hosts")
    private final java.util.List<OlvmHost> hosts;

    /**
     * List of hosts.
     * @return the value
     **/
    public java.util.List<OlvmHost> getHosts() {
        return hosts;
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
        sb.append("OlvmVmPlacementPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("vmAffinity=").append(String.valueOf(this.vmAffinity));
        sb.append(", hosts=").append(String.valueOf(this.hosts));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmVmPlacementPolicy)) {
            return false;
        }

        OlvmVmPlacementPolicy other = (OlvmVmPlacementPolicy) o;
        return java.util.Objects.equals(this.vmAffinity, other.vmAffinity)
                && java.util.Objects.equals(this.hosts, other.hosts)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vmAffinity == null ? 43 : this.vmAffinity.hashCode());
        result = (result * PRIME) + (this.hosts == null ? 43 : this.hosts.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
