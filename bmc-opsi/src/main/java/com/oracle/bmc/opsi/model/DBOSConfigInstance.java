/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Configuration parameters defined for external databases instance level. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DBOSConfigInstance.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "metricName")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DBOSConfigInstance extends DatabaseConfigurationMetricGroup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /** Name of the database instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
        private String instanceName;

        /**
         * Name of the database instance.
         *
         * @param instanceName the value to set
         * @return this builder
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            this.__explicitlySet__.add("instanceName");
            return this;
        }
        /** Host name of the database instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * Host name of the database instance.
         *
         * @param hostName the value to set
         * @return this builder
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /** Total number of CPUs available. */
        @com.fasterxml.jackson.annotation.JsonProperty("numCPUs")
        private Integer numCPUs;

        /**
         * Total number of CPUs available.
         *
         * @param numCPUs the value to set
         * @return this builder
         */
        public Builder numCPUs(Integer numCPUs) {
            this.numCPUs = numCPUs;
            this.__explicitlySet__.add("numCPUs");
            return this;
        }
        /**
         * Number of CPU cores available (includes subcores of multicore CPUs as well as single-core
         * CPUs).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("numCPUCores")
        private Integer numCPUCores;

        /**
         * Number of CPU cores available (includes subcores of multicore CPUs as well as single-core
         * CPUs).
         *
         * @param numCPUCores the value to set
         * @return this builder
         */
        public Builder numCPUCores(Integer numCPUCores) {
            this.numCPUCores = numCPUCores;
            this.__explicitlySet__.add("numCPUCores");
            return this;
        }
        /** Number of CPU Sockets available. */
        @com.fasterxml.jackson.annotation.JsonProperty("numCPUSockets")
        private Integer numCPUSockets;

        /**
         * Number of CPU Sockets available.
         *
         * @param numCPUSockets the value to set
         * @return this builder
         */
        public Builder numCPUSockets(Integer numCPUSockets) {
            this.numCPUSockets = numCPUSockets;
            this.__explicitlySet__.add("numCPUSockets");
            return this;
        }
        /** Total number of bytes of physical memory. */
        @com.fasterxml.jackson.annotation.JsonProperty("physicalMemoryBytes")
        private Double physicalMemoryBytes;

        /**
         * Total number of bytes of physical memory.
         *
         * @param physicalMemoryBytes the value to set
         * @return this builder
         */
        public Builder physicalMemoryBytes(Double physicalMemoryBytes) {
            this.physicalMemoryBytes = physicalMemoryBytes;
            this.__explicitlySet__.add("physicalMemoryBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DBOSConfigInstance build() {
            DBOSConfigInstance model =
                    new DBOSConfigInstance(
                            this.timeCollected,
                            this.instanceName,
                            this.hostName,
                            this.numCPUs,
                            this.numCPUCores,
                            this.numCPUSockets,
                            this.physicalMemoryBytes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DBOSConfigInstance model) {
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("instanceName")) {
                this.instanceName(model.getInstanceName());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("numCPUs")) {
                this.numCPUs(model.getNumCPUs());
            }
            if (model.wasPropertyExplicitlySet("numCPUCores")) {
                this.numCPUCores(model.getNumCPUCores());
            }
            if (model.wasPropertyExplicitlySet("numCPUSockets")) {
                this.numCPUSockets(model.getNumCPUSockets());
            }
            if (model.wasPropertyExplicitlySet("physicalMemoryBytes")) {
                this.physicalMemoryBytes(model.getPhysicalMemoryBytes());
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
    public DBOSConfigInstance(
            java.util.Date timeCollected,
            String instanceName,
            String hostName,
            Integer numCPUs,
            Integer numCPUCores,
            Integer numCPUSockets,
            Double physicalMemoryBytes) {
        super(timeCollected);
        this.instanceName = instanceName;
        this.hostName = hostName;
        this.numCPUs = numCPUs;
        this.numCPUCores = numCPUCores;
        this.numCPUSockets = numCPUSockets;
        this.physicalMemoryBytes = physicalMemoryBytes;
    }

    /** Name of the database instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
    private final String instanceName;

    /**
     * Name of the database instance.
     *
     * @return the value
     */
    public String getInstanceName() {
        return instanceName;
    }

    /** Host name of the database instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * Host name of the database instance.
     *
     * @return the value
     */
    public String getHostName() {
        return hostName;
    }

    /** Total number of CPUs available. */
    @com.fasterxml.jackson.annotation.JsonProperty("numCPUs")
    private final Integer numCPUs;

    /**
     * Total number of CPUs available.
     *
     * @return the value
     */
    public Integer getNumCPUs() {
        return numCPUs;
    }

    /**
     * Number of CPU cores available (includes subcores of multicore CPUs as well as single-core
     * CPUs).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("numCPUCores")
    private final Integer numCPUCores;

    /**
     * Number of CPU cores available (includes subcores of multicore CPUs as well as single-core
     * CPUs).
     *
     * @return the value
     */
    public Integer getNumCPUCores() {
        return numCPUCores;
    }

    /** Number of CPU Sockets available. */
    @com.fasterxml.jackson.annotation.JsonProperty("numCPUSockets")
    private final Integer numCPUSockets;

    /**
     * Number of CPU Sockets available.
     *
     * @return the value
     */
    public Integer getNumCPUSockets() {
        return numCPUSockets;
    }

    /** Total number of bytes of physical memory. */
    @com.fasterxml.jackson.annotation.JsonProperty("physicalMemoryBytes")
    private final Double physicalMemoryBytes;

    /**
     * Total number of bytes of physical memory.
     *
     * @return the value
     */
    public Double getPhysicalMemoryBytes() {
        return physicalMemoryBytes;
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
        sb.append("DBOSConfigInstance(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", instanceName=").append(String.valueOf(this.instanceName));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", numCPUs=").append(String.valueOf(this.numCPUs));
        sb.append(", numCPUCores=").append(String.valueOf(this.numCPUCores));
        sb.append(", numCPUSockets=").append(String.valueOf(this.numCPUSockets));
        sb.append(", physicalMemoryBytes=").append(String.valueOf(this.physicalMemoryBytes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DBOSConfigInstance)) {
            return false;
        }

        DBOSConfigInstance other = (DBOSConfigInstance) o;
        return java.util.Objects.equals(this.instanceName, other.instanceName)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.numCPUs, other.numCPUs)
                && java.util.Objects.equals(this.numCPUCores, other.numCPUCores)
                && java.util.Objects.equals(this.numCPUSockets, other.numCPUSockets)
                && java.util.Objects.equals(this.physicalMemoryBytes, other.physicalMemoryBytes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.instanceName == null ? 43 : this.instanceName.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result = (result * PRIME) + (this.numCPUs == null ? 43 : this.numCPUs.hashCode());
        result = (result * PRIME) + (this.numCPUCores == null ? 43 : this.numCPUCores.hashCode());
        result =
                (result * PRIME)
                        + (this.numCPUSockets == null ? 43 : this.numCPUSockets.hashCode());
        result =
                (result * PRIME)
                        + (this.physicalMemoryBytes == null
                                ? 43
                                : this.physicalMemoryBytes.hashCode());
        return result;
    }
}
