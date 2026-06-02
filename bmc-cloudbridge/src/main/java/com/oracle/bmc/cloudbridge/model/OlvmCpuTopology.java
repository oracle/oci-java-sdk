/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * CPU Topology in OLVM
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OlvmCpuTopology.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OlvmCpuTopology extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"cores", "sockets", "threads"})
    public OlvmCpuTopology(Integer cores, Integer sockets, Integer threads) {
        super();
        this.cores = cores;
        this.sockets = sockets;
        this.threads = threads;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Number of cores
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cores")
        private Integer cores;

        /**
         * Number of cores
         * @param cores the value to set
         * @return this builder
         **/
        public Builder cores(Integer cores) {
            this.cores = cores;
            this.__explicitlySet__.add("cores");
            return this;
        }
        /**
         * Number of sockets
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sockets")
        private Integer sockets;

        /**
         * Number of sockets
         * @param sockets the value to set
         * @return this builder
         **/
        public Builder sockets(Integer sockets) {
            this.sockets = sockets;
            this.__explicitlySet__.add("sockets");
            return this;
        }
        /**
         * Number of threads
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("threads")
        private Integer threads;

        /**
         * Number of threads
         * @param threads the value to set
         * @return this builder
         **/
        public Builder threads(Integer threads) {
            this.threads = threads;
            this.__explicitlySet__.add("threads");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmCpuTopology build() {
            OlvmCpuTopology model = new OlvmCpuTopology(this.cores, this.sockets, this.threads);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmCpuTopology model) {
            if (model.wasPropertyExplicitlySet("cores")) {
                this.cores(model.getCores());
            }
            if (model.wasPropertyExplicitlySet("sockets")) {
                this.sockets(model.getSockets());
            }
            if (model.wasPropertyExplicitlySet("threads")) {
                this.threads(model.getThreads());
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
     * Number of cores
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cores")
    private final Integer cores;

    /**
     * Number of cores
     * @return the value
     **/
    public Integer getCores() {
        return cores;
    }

    /**
     * Number of sockets
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sockets")
    private final Integer sockets;

    /**
     * Number of sockets
     * @return the value
     **/
    public Integer getSockets() {
        return sockets;
    }

    /**
     * Number of threads
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("threads")
    private final Integer threads;

    /**
     * Number of threads
     * @return the value
     **/
    public Integer getThreads() {
        return threads;
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
        sb.append("OlvmCpuTopology(");
        sb.append("super=").append(super.toString());
        sb.append("cores=").append(String.valueOf(this.cores));
        sb.append(", sockets=").append(String.valueOf(this.sockets));
        sb.append(", threads=").append(String.valueOf(this.threads));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmCpuTopology)) {
            return false;
        }

        OlvmCpuTopology other = (OlvmCpuTopology) o;
        return java.util.Objects.equals(this.cores, other.cores)
                && java.util.Objects.equals(this.sockets, other.sockets)
                && java.util.Objects.equals(this.threads, other.threads)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cores == null ? 43 : this.cores.hashCode());
        result = (result * PRIME) + (this.sockets == null ? 43 : this.sockets.hashCode());
        result = (result * PRIME) + (this.threads == null ? 43 : this.threads.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
