/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
public final class FleetAgentConfiguration
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "jreScanFrequencyInMinutes",
        "javaUsageTrackerProcessingFrequencyInMinutes",
        "workRequestValidityPeriodInDays",
        "agentPollingIntervalInMinutes",
        "linuxConfiguration",
        "windowsConfiguration",
        "timeLastModified"
    })
    public FleetAgentConfiguration(
            Integer jreScanFrequencyInMinutes,
            Integer javaUsageTrackerProcessingFrequencyInMinutes,
            Integer workRequestValidityPeriodInDays,
            Integer agentPollingIntervalInMinutes,
            FleetAgentOsConfiguration linuxConfiguration,
            FleetAgentOsConfiguration windowsConfiguration,
            java.util.Date timeLastModified) {
        super();
        this.jreScanFrequencyInMinutes = jreScanFrequencyInMinutes;
        this.javaUsageTrackerProcessingFrequencyInMinutes =
                javaUsageTrackerProcessingFrequencyInMinutes;
        this.workRequestValidityPeriodInDays = workRequestValidityPeriodInDays;
        this.agentPollingIntervalInMinutes = agentPollingIntervalInMinutes;
        this.linuxConfiguration = linuxConfiguration;
        this.windowsConfiguration = windowsConfiguration;
        this.timeLastModified = timeLastModified;
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
        /**
         * The validity period in days for work requests.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("workRequestValidityPeriodInDays")
        private Integer workRequestValidityPeriodInDays;

        /**
         * The validity period in days for work requests.
         *
         * @param workRequestValidityPeriodInDays the value to set
         * @return this builder
         **/
        public Builder workRequestValidityPeriodInDays(Integer workRequestValidityPeriodInDays) {
            this.workRequestValidityPeriodInDays = workRequestValidityPeriodInDays;
            this.__explicitlySet__.add("workRequestValidityPeriodInDays");
            return this;
        }
        /**
         * Agent polling interval in minutes
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("agentPollingIntervalInMinutes")
        private Integer agentPollingIntervalInMinutes;

        /**
         * Agent polling interval in minutes
         *
         * @param agentPollingIntervalInMinutes the value to set
         * @return this builder
         **/
        public Builder agentPollingIntervalInMinutes(Integer agentPollingIntervalInMinutes) {
            this.agentPollingIntervalInMinutes = agentPollingIntervalInMinutes;
            this.__explicitlySet__.add("agentPollingIntervalInMinutes");
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
        /**
         * The date and time of the last modification to the Fleet Agent Configuration (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
        private java.util.Date timeLastModified;

        /**
         * The date and time of the last modification to the Fleet Agent Configuration (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         * @param timeLastModified the value to set
         * @return this builder
         **/
        public Builder timeLastModified(java.util.Date timeLastModified) {
            this.timeLastModified = timeLastModified;
            this.__explicitlySet__.add("timeLastModified");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FleetAgentConfiguration build() {
            FleetAgentConfiguration model =
                    new FleetAgentConfiguration(
                            this.jreScanFrequencyInMinutes,
                            this.javaUsageTrackerProcessingFrequencyInMinutes,
                            this.workRequestValidityPeriodInDays,
                            this.agentPollingIntervalInMinutes,
                            this.linuxConfiguration,
                            this.windowsConfiguration,
                            this.timeLastModified);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FleetAgentConfiguration model) {
            if (model.wasPropertyExplicitlySet("jreScanFrequencyInMinutes")) {
                this.jreScanFrequencyInMinutes(model.getJreScanFrequencyInMinutes());
            }
            if (model.wasPropertyExplicitlySet("javaUsageTrackerProcessingFrequencyInMinutes")) {
                this.javaUsageTrackerProcessingFrequencyInMinutes(
                        model.getJavaUsageTrackerProcessingFrequencyInMinutes());
            }
            if (model.wasPropertyExplicitlySet("workRequestValidityPeriodInDays")) {
                this.workRequestValidityPeriodInDays(model.getWorkRequestValidityPeriodInDays());
            }
            if (model.wasPropertyExplicitlySet("agentPollingIntervalInMinutes")) {
                this.agentPollingIntervalInMinutes(model.getAgentPollingIntervalInMinutes());
            }
            if (model.wasPropertyExplicitlySet("linuxConfiguration")) {
                this.linuxConfiguration(model.getLinuxConfiguration());
            }
            if (model.wasPropertyExplicitlySet("windowsConfiguration")) {
                this.windowsConfiguration(model.getWindowsConfiguration());
            }
            if (model.wasPropertyExplicitlySet("timeLastModified")) {
                this.timeLastModified(model.getTimeLastModified());
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

    /**
     * The validity period in days for work requests.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workRequestValidityPeriodInDays")
    private final Integer workRequestValidityPeriodInDays;

    /**
     * The validity period in days for work requests.
     *
     * @return the value
     **/
    public Integer getWorkRequestValidityPeriodInDays() {
        return workRequestValidityPeriodInDays;
    }

    /**
     * Agent polling interval in minutes
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("agentPollingIntervalInMinutes")
    private final Integer agentPollingIntervalInMinutes;

    /**
     * Agent polling interval in minutes
     *
     * @return the value
     **/
    public Integer getAgentPollingIntervalInMinutes() {
        return agentPollingIntervalInMinutes;
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

    /**
     * The date and time of the last modification to the Fleet Agent Configuration (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     *
     * @return the value
     **/
    public java.util.Date getTimeLastModified() {
        return timeLastModified;
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
        sb.append("FleetAgentConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("jreScanFrequencyInMinutes=")
                .append(String.valueOf(this.jreScanFrequencyInMinutes));
        sb.append(", javaUsageTrackerProcessingFrequencyInMinutes=")
                .append(String.valueOf(this.javaUsageTrackerProcessingFrequencyInMinutes));
        sb.append(", workRequestValidityPeriodInDays=")
                .append(String.valueOf(this.workRequestValidityPeriodInDays));
        sb.append(", agentPollingIntervalInMinutes=")
                .append(String.valueOf(this.agentPollingIntervalInMinutes));
        sb.append(", linuxConfiguration=").append(String.valueOf(this.linuxConfiguration));
        sb.append(", windowsConfiguration=").append(String.valueOf(this.windowsConfiguration));
        sb.append(", timeLastModified=").append(String.valueOf(this.timeLastModified));
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
                && java.util.Objects.equals(
                        this.workRequestValidityPeriodInDays, other.workRequestValidityPeriodInDays)
                && java.util.Objects.equals(
                        this.agentPollingIntervalInMinutes, other.agentPollingIntervalInMinutes)
                && java.util.Objects.equals(this.linuxConfiguration, other.linuxConfiguration)
                && java.util.Objects.equals(this.windowsConfiguration, other.windowsConfiguration)
                && java.util.Objects.equals(this.timeLastModified, other.timeLastModified)
                && super.equals(other);
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
                        + (this.workRequestValidityPeriodInDays == null
                                ? 43
                                : this.workRequestValidityPeriodInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.agentPollingIntervalInMinutes == null
                                ? 43
                                : this.agentPollingIntervalInMinutes.hashCode());
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
