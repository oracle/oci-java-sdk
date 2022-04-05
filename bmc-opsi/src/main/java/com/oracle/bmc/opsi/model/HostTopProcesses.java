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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HostTopProcesses.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "metricName"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class HostTopProcesses extends HostPerformanceMetricGroup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pid")
        private java.math.BigDecimal pid;

        public Builder pid(java.math.BigDecimal pid) {
            this.pid = pid;
            this.__explicitlySet__.add("pid");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("memoryUtilizationPercent")
        private Double memoryUtilizationPercent;

        public Builder memoryUtilizationPercent(Double memoryUtilizationPercent) {
            this.memoryUtilizationPercent = memoryUtilizationPercent;
            this.__explicitlySet__.add("memoryUtilizationPercent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuUtilizationPercent")
        private Double cpuUtilizationPercent;

        public Builder cpuUtilizationPercent(Double cpuUtilizationPercent) {
            this.cpuUtilizationPercent = cpuUtilizationPercent;
            this.__explicitlySet__.add("cpuUtilizationPercent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuUsageInSeconds")
        private Double cpuUsageInSeconds;

        public Builder cpuUsageInSeconds(Double cpuUsageInSeconds) {
            this.cpuUsageInSeconds = cpuUsageInSeconds;
            this.__explicitlySet__.add("cpuUsageInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("command")
        private String command;

        public Builder command(String command) {
            this.command = command;
            this.__explicitlySet__.add("command");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("virtualMemoryInMBs")
        private Double virtualMemoryInMBs;

        public Builder virtualMemoryInMBs(Double virtualMemoryInMBs) {
            this.virtualMemoryInMBs = virtualMemoryInMBs;
            this.__explicitlySet__.add("virtualMemoryInMBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("physicalMemoryInMBs")
        private Double physicalMemoryInMBs;

        public Builder physicalMemoryInMBs(Double physicalMemoryInMBs) {
            this.physicalMemoryInMBs = physicalMemoryInMBs;
            this.__explicitlySet__.add("physicalMemoryInMBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("startTime")
        private java.util.Date startTime;

        public Builder startTime(java.util.Date startTime) {
            this.startTime = startTime;
            this.__explicitlySet__.add("startTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalProcesses")
        private java.math.BigDecimal totalProcesses;

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
    java.math.BigDecimal pid;

    /**
     * User that started the process
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    String userName;

    /**
     * Memory utilization percentage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryUtilizationPercent")
    Double memoryUtilizationPercent;

    /**
     * CPU utilization percentage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuUtilizationPercent")
    Double cpuUtilizationPercent;

    /**
     * CPU usage in seconds
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuUsageInSeconds")
    Double cpuUsageInSeconds;

    /**
     * Command line executed for the process
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("command")
    String command;

    /**
     * Virtual memory in megabytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("virtualMemoryInMBs")
    Double virtualMemoryInMBs;

    /**
     * Physical memory in megabytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("physicalMemoryInMBs")
    Double physicalMemoryInMBs;

    /**
     * Process Start Time
     * Example: {@code "2020-03-31T00:00:00.000Z"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startTime")
    java.util.Date startTime;

    /**
     * Number of processes running at the time of collection
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalProcesses")
    java.math.BigDecimal totalProcesses;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
