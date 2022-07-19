/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Attributes to update a Fleet Agent Configuration.
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
    builder = UpdateFleetAgentConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateFleetAgentConfigurationDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "jreScanFrequencyInMinutes",
        "javaUsageTrackerProcessingFrequencyInMinutes",
        "linuxConfiguration",
        "windowsConfiguration"
    })
    public UpdateFleetAgentConfigurationDetails(
            Integer jreScanFrequencyInMinutes,
            Integer javaUsageTrackerProcessingFrequencyInMinutes,
            FleetAgentOsConfiguration linuxConfiguration,
            FleetAgentOsConfiguration windowsConfiguration) {
        super();
        this.jreScanFrequencyInMinutes = jreScanFrequencyInMinutes;
        this.javaUsageTrackerProcessingFrequencyInMinutes =
                javaUsageTrackerProcessingFrequencyInMinutes;
        this.linuxConfiguration = linuxConfiguration;
        this.windowsConfiguration = windowsConfiguration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The frequency (in minutes) of JRE scanning. (That is, how often should JMS scan for JRE installations.)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jreScanFrequencyInMinutes")
        private Integer jreScanFrequencyInMinutes;

        /**
         * The frequency (in minutes) of JRE scanning. (That is, how often should JMS scan for JRE installations.)
         *
         * @param jreScanFrequencyInMinutes the value to set
         * @return this builder
         **/
        public Builder jreScanFrequencyInMinutes(Integer jreScanFrequencyInMinutes) {
            this.jreScanFrequencyInMinutes = jreScanFrequencyInMinutes;
            this.__explicitlySet__.add("jreScanFrequencyInMinutes");
            return this;
        }
        /**
         * The frequency (in minutes) of Java Usage Tracker processing. (That is, how often should JMS process data from the Java Usage Tracker.)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty(
                "javaUsageTrackerProcessingFrequencyInMinutes")
        private Integer javaUsageTrackerProcessingFrequencyInMinutes;

        /**
         * The frequency (in minutes) of Java Usage Tracker processing. (That is, how often should JMS process data from the Java Usage Tracker.)
         *
         * @param javaUsageTrackerProcessingFrequencyInMinutes the value to set
         * @return this builder
         **/
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateFleetAgentConfigurationDetails build() {
            UpdateFleetAgentConfigurationDetails __instance__ =
                    new UpdateFleetAgentConfigurationDetails(
                            jreScanFrequencyInMinutes,
                            javaUsageTrackerProcessingFrequencyInMinutes,
                            linuxConfiguration,
                            windowsConfiguration);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateFleetAgentConfigurationDetails o) {
            Builder copiedBuilder =
                    jreScanFrequencyInMinutes(o.getJreScanFrequencyInMinutes())
                            .javaUsageTrackerProcessingFrequencyInMinutes(
                                    o.getJavaUsageTrackerProcessingFrequencyInMinutes())
                            .linuxConfiguration(o.getLinuxConfiguration())
                            .windowsConfiguration(o.getWindowsConfiguration());

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

    /**
     * The frequency (in minutes) of JRE scanning. (That is, how often should JMS scan for JRE installations.)
     *
     * @return the value
     **/
    public Integer getJreScanFrequencyInMinutes() {
        return jreScanFrequencyInMinutes;
    }

    /**
     * The frequency (in minutes) of Java Usage Tracker processing. (That is, how often should JMS process data from the Java Usage Tracker.)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("javaUsageTrackerProcessingFrequencyInMinutes")
    private final Integer javaUsageTrackerProcessingFrequencyInMinutes;

    /**
     * The frequency (in minutes) of Java Usage Tracker processing. (That is, how often should JMS process data from the Java Usage Tracker.)
     *
     * @return the value
     **/
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
        sb.append("UpdateFleetAgentConfigurationDetails(");
        sb.append("jreScanFrequencyInMinutes=")
                .append(String.valueOf(this.jreScanFrequencyInMinutes));
        sb.append(", javaUsageTrackerProcessingFrequencyInMinutes=")
                .append(String.valueOf(this.javaUsageTrackerProcessingFrequencyInMinutes));
        sb.append(", linuxConfiguration=").append(String.valueOf(this.linuxConfiguration));
        sb.append(", windowsConfiguration=").append(String.valueOf(this.windowsConfiguration));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateFleetAgentConfigurationDetails)) {
            return false;
        }

        UpdateFleetAgentConfigurationDetails other = (UpdateFleetAgentConfigurationDetails) o;
        return java.util.Objects.equals(
                        this.jreScanFrequencyInMinutes, other.jreScanFrequencyInMinutes)
                && java.util.Objects.equals(
                        this.javaUsageTrackerProcessingFrequencyInMinutes,
                        other.javaUsageTrackerProcessingFrequencyInMinutes)
                && java.util.Objects.equals(this.linuxConfiguration, other.linuxConfiguration)
                && java.util.Objects.equals(this.windowsConfiguration, other.windowsConfiguration)
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
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
