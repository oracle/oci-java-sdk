/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Partial information about the VM Cluster which includes name, memory allocated etc.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VmClusterSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VmClusterSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "vmclusterName",
        "memoryAllocatedInGBs",
        "cpuAllocated",
        "dbNodesCount"
    })
    public VmClusterSummary(
            String vmclusterName,
            Integer memoryAllocatedInGBs,
            Integer cpuAllocated,
            Integer dbNodesCount) {
        super();
        this.vmclusterName = vmclusterName;
        this.memoryAllocatedInGBs = memoryAllocatedInGBs;
        this.cpuAllocated = cpuAllocated;
        this.dbNodesCount = dbNodesCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the vm cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vmclusterName")
        private String vmclusterName;

        /**
         * The name of the vm cluster.
         * @param vmclusterName the value to set
         * @return this builder
         **/
        public Builder vmclusterName(String vmclusterName) {
            this.vmclusterName = vmclusterName;
            this.__explicitlySet__.add("vmclusterName");
            return this;
        }
        /**
         * The memory allocated on a vm cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("memoryAllocatedInGBs")
        private Integer memoryAllocatedInGBs;

        /**
         * The memory allocated on a vm cluster.
         * @param memoryAllocatedInGBs the value to set
         * @return this builder
         **/
        public Builder memoryAllocatedInGBs(Integer memoryAllocatedInGBs) {
            this.memoryAllocatedInGBs = memoryAllocatedInGBs;
            this.__explicitlySet__.add("memoryAllocatedInGBs");
            return this;
        }
        /**
         * The cpu allocated on a vm cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuAllocated")
        private Integer cpuAllocated;

        /**
         * The cpu allocated on a vm cluster.
         * @param cpuAllocated the value to set
         * @return this builder
         **/
        public Builder cpuAllocated(Integer cpuAllocated) {
            this.cpuAllocated = cpuAllocated;
            this.__explicitlySet__.add("cpuAllocated");
            return this;
        }
        /**
         * The number of DB nodes on a vm cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbNodesCount")
        private Integer dbNodesCount;

        /**
         * The number of DB nodes on a vm cluster.
         * @param dbNodesCount the value to set
         * @return this builder
         **/
        public Builder dbNodesCount(Integer dbNodesCount) {
            this.dbNodesCount = dbNodesCount;
            this.__explicitlySet__.add("dbNodesCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VmClusterSummary build() {
            VmClusterSummary model =
                    new VmClusterSummary(
                            this.vmclusterName,
                            this.memoryAllocatedInGBs,
                            this.cpuAllocated,
                            this.dbNodesCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VmClusterSummary model) {
            if (model.wasPropertyExplicitlySet("vmclusterName")) {
                this.vmclusterName(model.getVmclusterName());
            }
            if (model.wasPropertyExplicitlySet("memoryAllocatedInGBs")) {
                this.memoryAllocatedInGBs(model.getMemoryAllocatedInGBs());
            }
            if (model.wasPropertyExplicitlySet("cpuAllocated")) {
                this.cpuAllocated(model.getCpuAllocated());
            }
            if (model.wasPropertyExplicitlySet("dbNodesCount")) {
                this.dbNodesCount(model.getDbNodesCount());
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
     * The name of the vm cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vmclusterName")
    private final String vmclusterName;

    /**
     * The name of the vm cluster.
     * @return the value
     **/
    public String getVmclusterName() {
        return vmclusterName;
    }

    /**
     * The memory allocated on a vm cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryAllocatedInGBs")
    private final Integer memoryAllocatedInGBs;

    /**
     * The memory allocated on a vm cluster.
     * @return the value
     **/
    public Integer getMemoryAllocatedInGBs() {
        return memoryAllocatedInGBs;
    }

    /**
     * The cpu allocated on a vm cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuAllocated")
    private final Integer cpuAllocated;

    /**
     * The cpu allocated on a vm cluster.
     * @return the value
     **/
    public Integer getCpuAllocated() {
        return cpuAllocated;
    }

    /**
     * The number of DB nodes on a vm cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbNodesCount")
    private final Integer dbNodesCount;

    /**
     * The number of DB nodes on a vm cluster.
     * @return the value
     **/
    public Integer getDbNodesCount() {
        return dbNodesCount;
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
        sb.append("VmClusterSummary(");
        sb.append("super=").append(super.toString());
        sb.append("vmclusterName=").append(String.valueOf(this.vmclusterName));
        sb.append(", memoryAllocatedInGBs=").append(String.valueOf(this.memoryAllocatedInGBs));
        sb.append(", cpuAllocated=").append(String.valueOf(this.cpuAllocated));
        sb.append(", dbNodesCount=").append(String.valueOf(this.dbNodesCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VmClusterSummary)) {
            return false;
        }

        VmClusterSummary other = (VmClusterSummary) o;
        return java.util.Objects.equals(this.vmclusterName, other.vmclusterName)
                && java.util.Objects.equals(this.memoryAllocatedInGBs, other.memoryAllocatedInGBs)
                && java.util.Objects.equals(this.cpuAllocated, other.cpuAllocated)
                && java.util.Objects.equals(this.dbNodesCount, other.dbNodesCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.vmclusterName == null ? 43 : this.vmclusterName.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryAllocatedInGBs == null
                                ? 43
                                : this.memoryAllocatedInGBs.hashCode());
        result = (result * PRIME) + (this.cpuAllocated == null ? 43 : this.cpuAllocated.hashCode());
        result = (result * PRIME) + (this.dbNodesCount == null ? 43 : this.dbNodesCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
