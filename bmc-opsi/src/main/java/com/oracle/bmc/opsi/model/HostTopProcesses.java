/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Top Processes metric for the host
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HostTopProcesses.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "metricName"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HostTopProcesses extends HostPerformanceMetricGroup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /**
         * process id
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pid")
        private java.math.BigDecimal pid;

        /**
         * process id
         * @param pid the value to set
         * @return this builder
         **/
        public Builder pid(java.math.BigDecimal pid) {
            this.pid = pid;
            this.__explicitlySet__.add("pid");
            return this;
        }
        /**
         * User that started the process
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * User that started the process
         * @param userName the value to set
         * @return this builder
         **/
        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }
        /**
         * Memory utilization percentage
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("memoryUtilizationPercent")
        private Double memoryUtilizationPercent;

        /**
         * Memory utilization percentage
         * @param memoryUtilizationPercent the value to set
         * @return this builder
         **/
        public Builder memoryUtilizationPercent(Double memoryUtilizationPercent) {
            this.memoryUtilizationPercent = memoryUtilizationPercent;
            this.__explicitlySet__.add("memoryUtilizationPercent");
            return this;
        }
        /**
         * CPU utilization percentage
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuUtilizationPercent")
        private Double cpuUtilizationPercent;

        /**
         * CPU utilization percentage
         * @param cpuUtilizationPercent the value to set
         * @return this builder
         **/
        public Builder cpuUtilizationPercent(Double cpuUtilizationPercent) {
            this.cpuUtilizationPercent = cpuUtilizationPercent;
            this.__explicitlySet__.add("cpuUtilizationPercent");
            return this;
        }
        /**
         * CPU usage in seconds
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuUsageInSeconds")
        private Double cpuUsageInSeconds;

        /**
         * CPU usage in seconds
         * @param cpuUsageInSeconds the value to set
         * @return this builder
         **/
        public Builder cpuUsageInSeconds(Double cpuUsageInSeconds) {
            this.cpuUsageInSeconds = cpuUsageInSeconds;
            this.__explicitlySet__.add("cpuUsageInSeconds");
            return this;
        }
        /**
         * Command line executed for the process
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("command")
        private String command;

        /**
         * Command line executed for the process
         * @param command the value to set
         * @return this builder
         **/
        public Builder command(String command) {
            this.command = command;
            this.__explicitlySet__.add("command");
            return this;
        }
        /**
         * Virtual memory in megabytes
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("virtualMemoryInMBs")
        private Double virtualMemoryInMBs;

        /**
         * Virtual memory in megabytes
         * @param virtualMemoryInMBs the value to set
         * @return this builder
         **/
        public Builder virtualMemoryInMBs(Double virtualMemoryInMBs) {
            this.virtualMemoryInMBs = virtualMemoryInMBs;
            this.__explicitlySet__.add("virtualMemoryInMBs");
            return this;
        }
        /**
         * Physical memory in megabytes
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("physicalMemoryInMBs")
        private Double physicalMemoryInMBs;

        /**
         * Physical memory in megabytes
         * @param physicalMemoryInMBs the value to set
         * @return this builder
         **/
        public Builder physicalMemoryInMBs(Double physicalMemoryInMBs) {
            this.physicalMemoryInMBs = physicalMemoryInMBs;
            this.__explicitlySet__.add("physicalMemoryInMBs");
            return this;
        }
        /**
         * Process Start Time
         * Example: {@code "2020-03-31T00:00:00.000Z"}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("startTime")
        private java.util.Date startTime;

        /**
         * Process Start Time
         * Example: {@code "2020-03-31T00:00:00.000Z"}
         *
         * @param startTime the value to set
         * @return this builder
         **/
        public Builder startTime(java.util.Date startTime) {
            this.startTime = startTime;
            this.__explicitlySet__.add("startTime");
            return this;
        }
        /**
         * Number of processes running at the time of collection
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalProcesses")
        private java.math.BigDecimal totalProcesses;

        /**
         * Number of processes running at the time of collection
         * @param totalProcesses the value to set
         * @return this builder
         **/
        public Builder totalProcesses(java.math.BigDecimal totalProcesses) {
            this.totalProcesses = totalProcesses;
            this.__explicitlySet__.add("totalProcesses");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostTopProcesses build() {
            HostTopProcesses __instance__ =
                    new HostTopProcesses(
                            timeCollected,
                            pid,
                            userName,
                            memoryUtilizationPercent,
                            cpuUtilizationPercent,
                            cpuUsageInSeconds,
                            command,
                            virtualMemoryInMBs,
                            physicalMemoryInMBs,
                            startTime,
                            totalProcesses);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostTopProcesses o) {
            Builder copiedBuilder =
                    timeCollected(o.getTimeCollected())
                            .pid(o.getPid())
                            .userName(o.getUserName())
                            .memoryUtilizationPercent(o.getMemoryUtilizationPercent())
                            .cpuUtilizationPercent(o.getCpuUtilizationPercent())
                            .cpuUsageInSeconds(o.getCpuUsageInSeconds())
                            .command(o.getCommand())
                            .virtualMemoryInMBs(o.getVirtualMemoryInMBs())
                            .physicalMemoryInMBs(o.getPhysicalMemoryInMBs())
                            .startTime(o.getStartTime())
                            .totalProcesses(o.getTotalProcesses());

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
    public HostTopProcesses(
            java.util.Date timeCollected,
            java.math.BigDecimal pid,
            String userName,
            Double memoryUtilizationPercent,
            Double cpuUtilizationPercent,
            Double cpuUsageInSeconds,
            String command,
            Double virtualMemoryInMBs,
            Double physicalMemoryInMBs,
            java.util.Date startTime,
            java.math.BigDecimal totalProcesses) {
        super(timeCollected);
        this.pid = pid;
        this.userName = userName;
        this.memoryUtilizationPercent = memoryUtilizationPercent;
        this.cpuUtilizationPercent = cpuUtilizationPercent;
        this.cpuUsageInSeconds = cpuUsageInSeconds;
        this.command = command;
        this.virtualMemoryInMBs = virtualMemoryInMBs;
        this.physicalMemoryInMBs = physicalMemoryInMBs;
        this.startTime = startTime;
        this.totalProcesses = totalProcesses;
    }

    /**
     * process id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pid")
    private final java.math.BigDecimal pid;

    /**
     * process id
     * @return the value
     **/
    public java.math.BigDecimal getPid() {
        return pid;
    }

    /**
     * User that started the process
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * User that started the process
     * @return the value
     **/
    public String getUserName() {
        return userName;
    }

    /**
     * Memory utilization percentage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryUtilizationPercent")
    private final Double memoryUtilizationPercent;

    /**
     * Memory utilization percentage
     * @return the value
     **/
    public Double getMemoryUtilizationPercent() {
        return memoryUtilizationPercent;
    }

    /**
     * CPU utilization percentage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuUtilizationPercent")
    private final Double cpuUtilizationPercent;

    /**
     * CPU utilization percentage
     * @return the value
     **/
    public Double getCpuUtilizationPercent() {
        return cpuUtilizationPercent;
    }

    /**
     * CPU usage in seconds
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuUsageInSeconds")
    private final Double cpuUsageInSeconds;

    /**
     * CPU usage in seconds
     * @return the value
     **/
    public Double getCpuUsageInSeconds() {
        return cpuUsageInSeconds;
    }

    /**
     * Command line executed for the process
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("command")
    private final String command;

    /**
     * Command line executed for the process
     * @return the value
     **/
    public String getCommand() {
        return command;
    }

    /**
     * Virtual memory in megabytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("virtualMemoryInMBs")
    private final Double virtualMemoryInMBs;

    /**
     * Virtual memory in megabytes
     * @return the value
     **/
    public Double getVirtualMemoryInMBs() {
        return virtualMemoryInMBs;
    }

    /**
     * Physical memory in megabytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("physicalMemoryInMBs")
    private final Double physicalMemoryInMBs;

    /**
     * Physical memory in megabytes
     * @return the value
     **/
    public Double getPhysicalMemoryInMBs() {
        return physicalMemoryInMBs;
    }

    /**
     * Process Start Time
     * Example: {@code "2020-03-31T00:00:00.000Z"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startTime")
    private final java.util.Date startTime;

    /**
     * Process Start Time
     * Example: {@code "2020-03-31T00:00:00.000Z"}
     *
     * @return the value
     **/
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * Number of processes running at the time of collection
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalProcesses")
    private final java.math.BigDecimal totalProcesses;

    /**
     * Number of processes running at the time of collection
     * @return the value
     **/
    public java.math.BigDecimal getTotalProcesses() {
        return totalProcesses;
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
        sb.append("HostTopProcesses(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", pid=").append(String.valueOf(this.pid));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", memoryUtilizationPercent=")
                .append(String.valueOf(this.memoryUtilizationPercent));
        sb.append(", cpuUtilizationPercent=").append(String.valueOf(this.cpuUtilizationPercent));
        sb.append(", cpuUsageInSeconds=").append(String.valueOf(this.cpuUsageInSeconds));
        sb.append(", command=").append(String.valueOf(this.command));
        sb.append(", virtualMemoryInMBs=").append(String.valueOf(this.virtualMemoryInMBs));
        sb.append(", physicalMemoryInMBs=").append(String.valueOf(this.physicalMemoryInMBs));
        sb.append(", startTime=").append(String.valueOf(this.startTime));
        sb.append(", totalProcesses=").append(String.valueOf(this.totalProcesses));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostTopProcesses)) {
            return false;
        }

        HostTopProcesses other = (HostTopProcesses) o;
        return java.util.Objects.equals(this.pid, other.pid)
                && java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(
                        this.memoryUtilizationPercent, other.memoryUtilizationPercent)
                && java.util.Objects.equals(this.cpuUtilizationPercent, other.cpuUtilizationPercent)
                && java.util.Objects.equals(this.cpuUsageInSeconds, other.cpuUsageInSeconds)
                && java.util.Objects.equals(this.command, other.command)
                && java.util.Objects.equals(this.virtualMemoryInMBs, other.virtualMemoryInMBs)
                && java.util.Objects.equals(this.physicalMemoryInMBs, other.physicalMemoryInMBs)
                && java.util.Objects.equals(this.startTime, other.startTime)
                && java.util.Objects.equals(this.totalProcesses, other.totalProcesses)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.pid == null ? 43 : this.pid.hashCode());
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryUtilizationPercent == null
                                ? 43
                                : this.memoryUtilizationPercent.hashCode());
        result =
                (result * PRIME)
                        + (this.cpuUtilizationPercent == null
                                ? 43
                                : this.cpuUtilizationPercent.hashCode());
        result =
                (result * PRIME)
                        + (this.cpuUsageInSeconds == null ? 43 : this.cpuUsageInSeconds.hashCode());
        result = (result * PRIME) + (this.command == null ? 43 : this.command.hashCode());
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
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result =
                (result * PRIME)
                        + (this.totalProcesses == null ? 43 : this.totalProcesses.hashCode());
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
