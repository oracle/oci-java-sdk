/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FleetAgentConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class FleetAgentConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * The frequency (in minutes) of JRE scanning. (That is, how often should JMS scan for JRE installations.)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jreScanFrequencyInMinutes")
    Integer jreScanFrequencyInMinutes;

    /**
     * The frequency (in minutes) of Java Usage Tracker processing. (That is, how often should JMS process data from the Java Usage Tracker.)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("javaUsageTrackerProcessingFrequencyInMinutes")
    Integer javaUsageTrackerProcessingFrequencyInMinutes;

    @com.fasterxml.jackson.annotation.JsonProperty("linuxConfiguration")
    FleetAgentOsConfiguration linuxConfiguration;

    @com.fasterxml.jackson.annotation.JsonProperty("windowsConfiguration")
    FleetAgentOsConfiguration windowsConfiguration;

    /**
     * The date and time of the last modification to the Fleet Agent Configuration (formatted according to RFC3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
    java.util.Date timeLastModified;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
