/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Base Metric Group for Host performance metrics <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "metricName",
        defaultImpl = HostPerformanceMetricGroup.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HostMemoryUsage.class,
            name = "HOST_MEMORY_USAGE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HostTopProcesses.class,
            name = "HOST_TOP_PROCESSES"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HostCpuUsage.class,
            name = "HOST_CPU_USAGE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HostGpuUsage.class,
            name = "HOST_GPU_USAGE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HostGpuProcesses.class,
            name = "HOST_GPU_PROCESSES"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HostFilesystemUsage.class,
            name = "HOST_FILESYSTEM_USAGE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HostIoUsage.class,
            name = "HOST_IO_USAGE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HostNetworkActivitySummary.class,
            name = "HOST_NETWORK_ACTIVITY_SUMMARY")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class HostPerformanceMetricGroup
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeCollected"})
    protected HostPerformanceMetricGroup(java.util.Date timeCollected) {
        super();
        this.timeCollected = timeCollected;
    }

    /** Collection timestamp Example: {@code "2020-05-06T00:00:00.000Z"} */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
    private final java.util.Date timeCollected;

    /**
     * Collection timestamp Example: {@code "2020-05-06T00:00:00.000Z"}
     *
     * @return the value
     */
    public java.util.Date getTimeCollected() {
        return timeCollected;
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
        sb.append("HostPerformanceMetricGroup(");
        sb.append("super=").append(super.toString());
        sb.append("timeCollected=").append(String.valueOf(this.timeCollected));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostPerformanceMetricGroup)) {
            return false;
        }

        HostPerformanceMetricGroup other = (HostPerformanceMetricGroup) o;
        return java.util.Objects.equals(this.timeCollected, other.timeCollected)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeCollected == null ? 43 : this.timeCollected.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Name of the metric group */
    public enum MetricName implements com.oracle.bmc.http.internal.BmcEnum {
        HostCpuUsage("HOST_CPU_USAGE"),
        HostMemoryUsage("HOST_MEMORY_USAGE"),
        HostNetworkActivitySummary("HOST_NETWORK_ACTIVITY_SUMMARY"),
        HostTopProcesses("HOST_TOP_PROCESSES"),
        HostFilesystemUsage("HOST_FILESYSTEM_USAGE"),
        HostGpuUsage("HOST_GPU_USAGE"),
        HostGpuProcesses("HOST_GPU_PROCESSES"),
        HostIoUsage("HOST_IO_USAGE"),
        ;

        private final String value;
        private static java.util.Map<String, MetricName> map;

        static {
            map = new java.util.HashMap<>();
            for (MetricName v : MetricName.values()) {
                map.put(v.getValue(), v);
            }
        }

        MetricName(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MetricName create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid MetricName: " + key);
        }
    };
}
