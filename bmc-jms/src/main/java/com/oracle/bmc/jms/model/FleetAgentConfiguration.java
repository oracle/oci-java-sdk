/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Management Agent Configuration for a Fleet. Includes JRE scanning frequency and list of include/exclude file system paths.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FleetAgentConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FleetAgentConfiguration {
    @Deprecated
    @java.beans.ConstructorProperties({
        "jreScanFrequencyInMinutes",
        "javaUsageTrackerProcessingFrequencyInMinutes",
        "linuxConfiguration",
        "windowsConfiguration",
        "timeLastModified"
    })
    public FleetAgentConfiguration(
            Integer jreScanFrequencyInMinutes,
            Integer javaUsageTrackerProcessingFrequencyInMinutes,
            FleetAgentOsConfiguration linuxConfiguration,
            FleetAgentOsConfiguration windowsConfiguration,
            java.util.Date timeLastModified) {
        super();
        this.jreScanFrequencyInMinutes = jreScanFrequencyInMinutes;
        this.javaUsageTrackerProcessingFrequencyInMinutes =
                javaUsageTrackerProcessingFrequencyInMinutes;
        this.linuxConfiguration = linuxConfiguration;
        this.windowsConfiguration = windowsConfiguration;
        this.timeLastModified = timeLastModified;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("jreScanFrequencyInMinutes")
        private Integer jreScanFrequencyInMinutes;

        public Builder jreScanFrequencyInMinutes(Integer jreScanFrequencyInMinutes) {
            this.jreScanFrequencyInMinutes = jreScanFrequencyInMinutes;
            this.__explicitlySet__.add("jreScanFrequencyInMinutes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "javaUsageTrackerProcessingFrequencyInMinutes")
        private Integer javaUsageTrackerProcessingFrequencyInMinutes;

        public Builder javaUsageTrackerProcessingFrequencyInMinutes(
                Integer javaUsageTrackerProcessingFrequencyInMinutes) {
            this.javaUsageTrackerProcessingFrequencyInMinutes =
                    javaUsageTrackerProcessingFrequencyInMinutes;
            this.__explicitlySet__.add("javaUsageTrackerProcessingFrequencyInMinutes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("linuxConfiguration")
        private FleetAgentOsConfiguration linuxConfiguration;

        public Builder linuxConfiguration(FleetAgentOsConfiguration linuxConfiguration) {
            this.linuxConfiguration = linuxConfiguration;
            this.__explicitlySet__.add("linuxConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("windowsConfiguration")
        private FleetAgentOsConfiguration windowsConfiguration;

        public Builder windowsConfiguration(FleetAgentOsConfiguration windowsConfiguration) {
            this.windowsConfiguration = windowsConfiguration;
            this.__explicitlySet__.add("windowsConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
        private java.util.Date timeLastModified;

        public Builder timeLastModified(java.util.Date timeLastModified) {
            this.timeLastModified = timeLastModified;
            this.__explicitlySet__.add("timeLastModified");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FleetAgentConfiguration build() {
            FleetAgentConfiguration __instance__ =
                    new FleetAgentConfiguration(
                            jreScanFrequencyInMinutes,
                            javaUsageTrackerProcessingFrequencyInMinutes,
                            linuxConfiguration,
                            windowsConfiguration,
                            timeLastModified);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FleetAgentConfiguration o) {
            Builder copiedBuilder =
                    jreScanFrequencyInMinutes(o.getJreScanFrequencyInMinutes())
                            .javaUsageTrackerProcessingFrequencyInMinutes(
                                    o.getJavaUsageTrackerProcessingFrequencyInMinutes())
                            .linuxConfiguration(o.getLinuxConfiguration())
                            .windowsConfiguration(o.getWindowsConfiguration())
                            .timeLastModified(o.getTimeLastModified());

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

    /**
     * The frequency (in minutes) of JRE scanning. (That is, how often should JMS scan for JRE installations.)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jreScanFrequencyInMinutes")
    private final Integer jreScanFrequencyInMinutes;

    public Integer getJreScanFrequencyInMinutes() {
        return jreScanFrequencyInMinutes;
    }

    /**
     * The frequency (in minutes) of Java Usage Tracker processing. (That is, how often should JMS process data from the Java Usage Tracker.)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("javaUsageTrackerProcessingFrequencyInMinutes")
    private final Integer javaUsageTrackerProcessingFrequencyInMinutes;

    public Integer getJavaUsageTrackerProcessingFrequencyInMinutes() {
        return javaUsageTrackerProcessingFrequencyInMinutes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("linuxConfiguration")
    private final FleetAgentOsConfiguration linuxConfiguration;

    public FleetAgentOsConfiguration getLinuxConfiguration() {
        return linuxConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("windowsConfiguration")
    private final FleetAgentOsConfiguration windowsConfiguration;

    public FleetAgentOsConfiguration getWindowsConfiguration() {
        return windowsConfiguration;
    }

    /**
     * The date and time of the last modification to the Fleet Agent Configuration (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
    private final java.util.Date timeLastModified;

    public java.util.Date getTimeLastModified() {
        return timeLastModified;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FleetAgentConfiguration(");
        sb.append("jreScanFrequencyInMinutes=")
                .append(String.valueOf(this.jreScanFrequencyInMinutes));
        sb.append(", javaUsageTrackerProcessingFrequencyInMinutes=")
                .append(String.valueOf(this.javaUsageTrackerProcessingFrequencyInMinutes));
        sb.append(", linuxConfiguration=").append(String.valueOf(this.linuxConfiguration));
        sb.append(", windowsConfiguration=").append(String.valueOf(this.windowsConfiguration));
        sb.append(", timeLastModified=").append(String.valueOf(this.timeLastModified));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FleetAgentConfiguration)) {
            return false;
        }

        FleetAgentConfiguration other = (FleetAgentConfiguration) o;
        return java.util.Objects.equals(
                        this.jreScanFrequencyInMinutes, other.jreScanFrequencyInMinutes)
                && java.util.Objects.equals(
                        this.javaUsageTrackerProcessingFrequencyInMinutes,
                        other.javaUsageTrackerProcessingFrequencyInMinutes)
                && java.util.Objects.equals(this.linuxConfiguration, other.linuxConfiguration)
                && java.util.Objects.equals(this.windowsConfiguration, other.windowsConfiguration)
                && java.util.Objects.equals(this.timeLastModified, other.timeLastModified)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.jreScanFrequencyInMinutes == null
                                ? 43
                                : this.jreScanFrequencyInMinutes.hashCode());
        result =
                (result * PRIME)
                        + (this.javaUsageTrackerProcessingFrequencyInMinutes == null
                                ? 43
                                : this.javaUsageTrackerProcessingFrequencyInMinutes.hashCode());
        result =
                (result * PRIME)
                        + (this.linuxConfiguration == null
                                ? 43
                                : this.linuxConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.windowsConfiguration == null
                                ? 43
                                : this.windowsConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastModified == null ? 43 : this.timeLastModified.hashCode());
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
