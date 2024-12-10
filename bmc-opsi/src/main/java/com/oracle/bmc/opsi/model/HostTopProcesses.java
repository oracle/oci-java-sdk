/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
        /**
         * Container id if this process corresponds to a running container in the host
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("containerId")
        private String containerId;

        /**
         * Container id if this process corresponds to a running container in the host
         * @param containerId the value to set
         * @return this builder
         **/
        public Builder containerId(String containerId) {
            this.containerId = containerId;
            this.__explicitlySet__.add("containerId");
            return this;
        }
        /**
         * Bytes Read
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("diskBytesRead")
        private Double diskBytesRead;

        /**
         * Bytes Read
         * @param diskBytesRead the value to set
         * @return this builder
         **/
        public Builder diskBytesRead(Double diskBytesRead) {
            this.diskBytesRead = diskBytesRead;
            this.__explicitlySet__.add("diskBytesRead");
            return this;
        }
        /**
         * Bytes Written
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("diskBytesWritten")
        private Double diskBytesWritten;

        /**
         * Bytes Written
         * @param diskBytesWritten the value to set
         * @return this builder
         **/
        public Builder diskBytesWritten(Double diskBytesWritten) {
            this.diskBytesWritten = diskBytesWritten;
            this.__explicitlySet__.add("diskBytesWritten");
            return this;
        }
        /**
         * Read transactions per second
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("diskIopsRead")
        private Double diskIopsRead;

        /**
         * Read transactions per second
         * @param diskIopsRead the value to set
         * @return this builder
         **/
        public Builder diskIopsRead(Double diskIopsRead) {
            this.diskIopsRead = diskIopsRead;
            this.__explicitlySet__.add("diskIopsRead");
            return this;
        }
        /**
         * Write transactions per second
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("diskIopsWritten")
        private Double diskIopsWritten;

        /**
         * Write transactions per second
         * @param diskIopsWritten the value to set
         * @return this builder
         **/
        public Builder diskIopsWritten(Double diskIopsWritten) {
            this.diskIopsWritten = diskIopsWritten;
            this.__explicitlySet__.add("diskIopsWritten");
            return this;
        }
        /**
         * IO Transactions per second
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("diskIops")
        private Double diskIops;

        /**
         * IO Transactions per second
         * @param diskIops the value to set
         * @return this builder
         **/
        public Builder diskIops(Double diskIops) {
            this.diskIops = diskIops;
            this.__explicitlySet__.add("diskIops");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostTopProcesses build() {
            HostTopProcesses model =
                    new HostTopProcesses(
                            this.timeCollected,
                            this.pid,
                            this.userName,
                            this.memoryUtilizationPercent,
                            this.cpuUtilizationPercent,
                            this.cpuUsageInSeconds,
                            this.command,
                            this.virtualMemoryInMBs,
                            this.physicalMemoryInMBs,
                            this.startTime,
                            this.totalProcesses,
                            this.containerId,
                            this.diskBytesRead,
                            this.diskBytesWritten,
                            this.diskIopsRead,
                            this.diskIopsWritten,
                            this.diskIops);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostTopProcesses model) {
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("pid")) {
                this.pid(model.getPid());
            }
            if (model.wasPropertyExplicitlySet("userName")) {
                this.userName(model.getUserName());
            }
            if (model.wasPropertyExplicitlySet("memoryUtilizationPercent")) {
                this.memoryUtilizationPercent(model.getMemoryUtilizationPercent());
            }
            if (model.wasPropertyExplicitlySet("cpuUtilizationPercent")) {
                this.cpuUtilizationPercent(model.getCpuUtilizationPercent());
            }
            if (model.wasPropertyExplicitlySet("cpuUsageInSeconds")) {
                this.cpuUsageInSeconds(model.getCpuUsageInSeconds());
            }
            if (model.wasPropertyExplicitlySet("command")) {
                this.command(model.getCommand());
            }
            if (model.wasPropertyExplicitlySet("virtualMemoryInMBs")) {
                this.virtualMemoryInMBs(model.getVirtualMemoryInMBs());
            }
            if (model.wasPropertyExplicitlySet("physicalMemoryInMBs")) {
                this.physicalMemoryInMBs(model.getPhysicalMemoryInMBs());
            }
            if (model.wasPropertyExplicitlySet("startTime")) {
                this.startTime(model.getStartTime());
            }
            if (model.wasPropertyExplicitlySet("totalProcesses")) {
                this.totalProcesses(model.getTotalProcesses());
            }
            if (model.wasPropertyExplicitlySet("containerId")) {
                this.containerId(model.getContainerId());
            }
            if (model.wasPropertyExplicitlySet("diskBytesRead")) {
                this.diskBytesRead(model.getDiskBytesRead());
            }
            if (model.wasPropertyExplicitlySet("diskBytesWritten")) {
                this.diskBytesWritten(model.getDiskBytesWritten());
            }
            if (model.wasPropertyExplicitlySet("diskIopsRead")) {
                this.diskIopsRead(model.getDiskIopsRead());
            }
            if (model.wasPropertyExplicitlySet("diskIopsWritten")) {
                this.diskIopsWritten(model.getDiskIopsWritten());
            }
            if (model.wasPropertyExplicitlySet("diskIops")) {
                this.diskIops(model.getDiskIops());
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
            java.math.BigDecimal totalProcesses,
            String containerId,
            Double diskBytesRead,
            Double diskBytesWritten,
            Double diskIopsRead,
            Double diskIopsWritten,
            Double diskIops) {
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
        this.containerId = containerId;
        this.diskBytesRead = diskBytesRead;
        this.diskBytesWritten = diskBytesWritten;
        this.diskIopsRead = diskIopsRead;
        this.diskIopsWritten = diskIopsWritten;
        this.diskIops = diskIops;
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

    /**
     * Container id if this process corresponds to a running container in the host
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("containerId")
    private final String containerId;

    /**
     * Container id if this process corresponds to a running container in the host
     * @return the value
     **/
    public String getContainerId() {
        return containerId;
    }

    /**
     * Bytes Read
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diskBytesRead")
    private final Double diskBytesRead;

    /**
     * Bytes Read
     * @return the value
     **/
    public Double getDiskBytesRead() {
        return diskBytesRead;
    }

    /**
     * Bytes Written
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diskBytesWritten")
    private final Double diskBytesWritten;

    /**
     * Bytes Written
     * @return the value
     **/
    public Double getDiskBytesWritten() {
        return diskBytesWritten;
    }

    /**
     * Read transactions per second
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diskIopsRead")
    private final Double diskIopsRead;

    /**
     * Read transactions per second
     * @return the value
     **/
    public Double getDiskIopsRead() {
        return diskIopsRead;
    }

    /**
     * Write transactions per second
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diskIopsWritten")
    private final Double diskIopsWritten;

    /**
     * Write transactions per second
     * @return the value
     **/
    public Double getDiskIopsWritten() {
        return diskIopsWritten;
    }

    /**
     * IO Transactions per second
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diskIops")
    private final Double diskIops;

    /**
     * IO Transactions per second
     * @return the value
     **/
    public Double getDiskIops() {
        return diskIops;
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
        sb.append(", containerId=").append(String.valueOf(this.containerId));
        sb.append(", diskBytesRead=").append(String.valueOf(this.diskBytesRead));
        sb.append(", diskBytesWritten=").append(String.valueOf(this.diskBytesWritten));
        sb.append(", diskIopsRead=").append(String.valueOf(this.diskIopsRead));
        sb.append(", diskIopsWritten=").append(String.valueOf(this.diskIopsWritten));
        sb.append(", diskIops=").append(String.valueOf(this.diskIops));
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
                && java.util.Objects.equals(this.containerId, other.containerId)
                && java.util.Objects.equals(this.diskBytesRead, other.diskBytesRead)
                && java.util.Objects.equals(this.diskBytesWritten, other.diskBytesWritten)
                && java.util.Objects.equals(this.diskIopsRead, other.diskIopsRead)
                && java.util.Objects.equals(this.diskIopsWritten, other.diskIopsWritten)
                && java.util.Objects.equals(this.diskIops, other.diskIops)
                && super.equals(other);
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
        result = (result * PRIME) + (this.containerId == null ? 43 : this.containerId.hashCode());
        result =
                (result * PRIME)
                        + (this.diskBytesRead == null ? 43 : this.diskBytesRead.hashCode());
        result =
                (result * PRIME)
                        + (this.diskBytesWritten == null ? 43 : this.diskBytesWritten.hashCode());
        result = (result * PRIME) + (this.diskIopsRead == null ? 43 : this.diskIopsRead.hashCode());
        result =
                (result * PRIME)
                        + (this.diskIopsWritten == null ? 43 : this.diskIopsWritten.hashCode());
        result = (result * PRIME) + (this.diskIops == null ? 43 : this.diskIops.hashCode());
        return result;
    }
}
