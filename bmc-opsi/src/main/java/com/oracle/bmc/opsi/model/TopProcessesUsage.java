/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Aggregated data for top processes on a specific date.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TopProcessesUsage.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TopProcessesUsage extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "command",
        "containerId",
        "processHash",
        "cpuUsage",
        "cpuUtilization",
        "memoryUtilization",
        "virtualMemoryInMBs",
        "physicalMemoryInMBs",
        "maxProcessCount"
    })
    public TopProcessesUsage(
            String command,
            String containerId,
            String processHash,
            Double cpuUsage,
            Double cpuUtilization,
            Double memoryUtilization,
            Double virtualMemoryInMBs,
            Double physicalMemoryInMBs,
            Integer maxProcessCount) {
        super();
        this.command = command;
        this.containerId = containerId;
        this.processHash = processHash;
        this.cpuUsage = cpuUsage;
        this.cpuUtilization = cpuUtilization;
        this.memoryUtilization = memoryUtilization;
        this.virtualMemoryInMBs = virtualMemoryInMBs;
        this.physicalMemoryInMBs = physicalMemoryInMBs;
        this.maxProcessCount = maxProcessCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Command line and arguments used to launch process.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("command")
        private String command;

        /**
         * Command line and arguments used to launch process.
         * @param command the value to set
         * @return this builder
         **/
        public Builder command(String command) {
            this.command = command;
            this.__explicitlySet__.add("command");
            return this;
        }
        /**
         * Container id if this process corresponds to a running container in the host.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("containerId")
        private String containerId;

        /**
         * Container id if this process corresponds to a running container in the host.
         * @param containerId the value to set
         * @return this builder
         **/
        public Builder containerId(String containerId) {
            this.containerId = containerId;
            this.__explicitlySet__.add("containerId");
            return this;
        }
        /**
         * Unique identifier for a process.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("processHash")
        private String processHash;

        /**
         * Unique identifier for a process.
         * @param processHash the value to set
         * @return this builder
         **/
        public Builder processHash(String processHash) {
            this.processHash = processHash;
            this.__explicitlySet__.add("processHash");
            return this;
        }
        /**
         * Process CPU usage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuUsage")
        private Double cpuUsage;

        /**
         * Process CPU usage.
         * @param cpuUsage the value to set
         * @return this builder
         **/
        public Builder cpuUsage(Double cpuUsage) {
            this.cpuUsage = cpuUsage;
            this.__explicitlySet__.add("cpuUsage");
            return this;
        }
        /**
         * Process CPU utilization percentage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuUtilization")
        private Double cpuUtilization;

        /**
         * Process CPU utilization percentage.
         * @param cpuUtilization the value to set
         * @return this builder
         **/
        public Builder cpuUtilization(Double cpuUtilization) {
            this.cpuUtilization = cpuUtilization;
            this.__explicitlySet__.add("cpuUtilization");
            return this;
        }
        /**
         * Process memory utilization percentage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("memoryUtilization")
        private Double memoryUtilization;

        /**
         * Process memory utilization percentage.
         * @param memoryUtilization the value to set
         * @return this builder
         **/
        public Builder memoryUtilization(Double memoryUtilization) {
            this.memoryUtilization = memoryUtilization;
            this.__explicitlySet__.add("memoryUtilization");
            return this;
        }
        /**
         * Process virtual memory in Megabytes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("virtualMemoryInMBs")
        private Double virtualMemoryInMBs;

        /**
         * Process virtual memory in Megabytes.
         * @param virtualMemoryInMBs the value to set
         * @return this builder
         **/
        public Builder virtualMemoryInMBs(Double virtualMemoryInMBs) {
            this.virtualMemoryInMBs = virtualMemoryInMBs;
            this.__explicitlySet__.add("virtualMemoryInMBs");
            return this;
        }
        /**
         * Procress physical memory in Megabytes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("physicalMemoryInMBs")
        private Double physicalMemoryInMBs;

        /**
         * Procress physical memory in Megabytes.
         * @param physicalMemoryInMBs the value to set
         * @return this builder
         **/
        public Builder physicalMemoryInMBs(Double physicalMemoryInMBs) {
            this.physicalMemoryInMBs = physicalMemoryInMBs;
            this.__explicitlySet__.add("physicalMemoryInMBs");
            return this;
        }
        /**
         * Maximum number of processes running at time of collection.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxProcessCount")
        private Integer maxProcessCount;

        /**
         * Maximum number of processes running at time of collection.
         * @param maxProcessCount the value to set
         * @return this builder
         **/
        public Builder maxProcessCount(Integer maxProcessCount) {
            this.maxProcessCount = maxProcessCount;
            this.__explicitlySet__.add("maxProcessCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TopProcessesUsage build() {
            TopProcessesUsage model =
                    new TopProcessesUsage(
                            this.command,
                            this.containerId,
                            this.processHash,
                            this.cpuUsage,
                            this.cpuUtilization,
                            this.memoryUtilization,
                            this.virtualMemoryInMBs,
                            this.physicalMemoryInMBs,
                            this.maxProcessCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TopProcessesUsage model) {
            if (model.wasPropertyExplicitlySet("command")) {
                this.command(model.getCommand());
            }
            if (model.wasPropertyExplicitlySet("containerId")) {
                this.containerId(model.getContainerId());
            }
            if (model.wasPropertyExplicitlySet("processHash")) {
                this.processHash(model.getProcessHash());
            }
            if (model.wasPropertyExplicitlySet("cpuUsage")) {
                this.cpuUsage(model.getCpuUsage());
            }
            if (model.wasPropertyExplicitlySet("cpuUtilization")) {
                this.cpuUtilization(model.getCpuUtilization());
            }
            if (model.wasPropertyExplicitlySet("memoryUtilization")) {
                this.memoryUtilization(model.getMemoryUtilization());
            }
            if (model.wasPropertyExplicitlySet("virtualMemoryInMBs")) {
                this.virtualMemoryInMBs(model.getVirtualMemoryInMBs());
            }
            if (model.wasPropertyExplicitlySet("physicalMemoryInMBs")) {
                this.physicalMemoryInMBs(model.getPhysicalMemoryInMBs());
            }
            if (model.wasPropertyExplicitlySet("maxProcessCount")) {
                this.maxProcessCount(model.getMaxProcessCount());
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
     * Command line and arguments used to launch process.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("command")
    private final String command;

    /**
     * Command line and arguments used to launch process.
     * @return the value
     **/
    public String getCommand() {
        return command;
    }

    /**
     * Container id if this process corresponds to a running container in the host.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("containerId")
    private final String containerId;

    /**
     * Container id if this process corresponds to a running container in the host.
     * @return the value
     **/
    public String getContainerId() {
        return containerId;
    }

    /**
     * Unique identifier for a process.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("processHash")
    private final String processHash;

    /**
     * Unique identifier for a process.
     * @return the value
     **/
    public String getProcessHash() {
        return processHash;
    }

    /**
     * Process CPU usage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuUsage")
    private final Double cpuUsage;

    /**
     * Process CPU usage.
     * @return the value
     **/
    public Double getCpuUsage() {
        return cpuUsage;
    }

    /**
     * Process CPU utilization percentage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuUtilization")
    private final Double cpuUtilization;

    /**
     * Process CPU utilization percentage.
     * @return the value
     **/
    public Double getCpuUtilization() {
        return cpuUtilization;
    }

    /**
     * Process memory utilization percentage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryUtilization")
    private final Double memoryUtilization;

    /**
     * Process memory utilization percentage.
     * @return the value
     **/
    public Double getMemoryUtilization() {
        return memoryUtilization;
    }

    /**
     * Process virtual memory in Megabytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("virtualMemoryInMBs")
    private final Double virtualMemoryInMBs;

    /**
     * Process virtual memory in Megabytes.
     * @return the value
     **/
    public Double getVirtualMemoryInMBs() {
        return virtualMemoryInMBs;
    }

    /**
     * Procress physical memory in Megabytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("physicalMemoryInMBs")
    private final Double physicalMemoryInMBs;

    /**
     * Procress physical memory in Megabytes.
     * @return the value
     **/
    public Double getPhysicalMemoryInMBs() {
        return physicalMemoryInMBs;
    }

    /**
     * Maximum number of processes running at time of collection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxProcessCount")
    private final Integer maxProcessCount;

    /**
     * Maximum number of processes running at time of collection.
     * @return the value
     **/
    public Integer getMaxProcessCount() {
        return maxProcessCount;
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
        sb.append("TopProcessesUsage(");
        sb.append("super=").append(super.toString());
        sb.append("command=").append(String.valueOf(this.command));
        sb.append(", containerId=").append(String.valueOf(this.containerId));
        sb.append(", processHash=").append(String.valueOf(this.processHash));
        sb.append(", cpuUsage=").append(String.valueOf(this.cpuUsage));
        sb.append(", cpuUtilization=").append(String.valueOf(this.cpuUtilization));
        sb.append(", memoryUtilization=").append(String.valueOf(this.memoryUtilization));
        sb.append(", virtualMemoryInMBs=").append(String.valueOf(this.virtualMemoryInMBs));
        sb.append(", physicalMemoryInMBs=").append(String.valueOf(this.physicalMemoryInMBs));
        sb.append(", maxProcessCount=").append(String.valueOf(this.maxProcessCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TopProcessesUsage)) {
            return false;
        }

        TopProcessesUsage other = (TopProcessesUsage) o;
        return java.util.Objects.equals(this.command, other.command)
                && java.util.Objects.equals(this.containerId, other.containerId)
                && java.util.Objects.equals(this.processHash, other.processHash)
                && java.util.Objects.equals(this.cpuUsage, other.cpuUsage)
                && java.util.Objects.equals(this.cpuUtilization, other.cpuUtilization)
                && java.util.Objects.equals(this.memoryUtilization, other.memoryUtilization)
                && java.util.Objects.equals(this.virtualMemoryInMBs, other.virtualMemoryInMBs)
                && java.util.Objects.equals(this.physicalMemoryInMBs, other.physicalMemoryInMBs)
                && java.util.Objects.equals(this.maxProcessCount, other.maxProcessCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.command == null ? 43 : this.command.hashCode());
        result = (result * PRIME) + (this.containerId == null ? 43 : this.containerId.hashCode());
        result = (result * PRIME) + (this.processHash == null ? 43 : this.processHash.hashCode());
        result = (result * PRIME) + (this.cpuUsage == null ? 43 : this.cpuUsage.hashCode());
        result =
                (result * PRIME)
                        + (this.cpuUtilization == null ? 43 : this.cpuUtilization.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryUtilization == null ? 43 : this.memoryUtilization.hashCode());
        result =
                (result * PRIME)
                        + (this.virtualMemoryInMBs == null
                                ? 43
                                : this.virtualMemoryInMBs.hashCode());
        result =
                (result * PRIME)
                        + (this.physicalMemoryInMBs == null
                                ? 43
                                : this.physicalMemoryInMBs.hashCode());
        result =
                (result * PRIME)
                        + (this.maxProcessCount == null ? 43 : this.maxProcessCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
