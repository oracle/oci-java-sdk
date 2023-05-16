/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Attributes to update a Fleet Agent Configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateFleetAgentConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateFleetAgentConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "jreScanFrequencyInMinutes",
        "javaUsageTrackerProcessingFrequencyInMinutes",
        "workRequestValidityPeriodInDays",
        "agentPollingIntervalInMinutes",
        "linuxConfiguration",
        "windowsConfiguration"
    })
    public UpdateFleetAgentConfigurationDetails(
            Integer jreScanFrequencyInMinutes,
            Integer javaUsageTrackerProcessingFrequencyInMinutes,
            Integer workRequestValidityPeriodInDays,
            Integer agentPollingIntervalInMinutes,
            FleetAgentOsConfiguration linuxConfiguration,
            FleetAgentOsConfiguration windowsConfiguration) {
        super();
        this.jreScanFrequencyInMinutes = jreScanFrequencyInMinutes;
        this.javaUsageTrackerProcessingFrequencyInMinutes =
                javaUsageTrackerProcessingFrequencyInMinutes;
        this.workRequestValidityPeriodInDays = workRequestValidityPeriodInDays;
        this.agentPollingIntervalInMinutes = agentPollingIntervalInMinutes;
        this.linuxConfiguration = linuxConfiguration;
        this.windowsConfiguration = windowsConfiguration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The frequency (in minutes) of JRE scanning. (That is, how often should JMS scan for JRE
         * installations.)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jreScanFrequencyInMinutes")
        private Integer jreScanFrequencyInMinutes;

        /**
         * The frequency (in minutes) of JRE scanning. (That is, how often should JMS scan for JRE
         * installations.)
         *
         * @param jreScanFrequencyInMinutes the value to set
         * @return this builder
         */
        public Builder jreScanFrequencyInMinutes(Integer jreScanFrequencyInMinutes) {
            this.jreScanFrequencyInMinutes = jreScanFrequencyInMinutes;
            this.__explicitlySet__.add("jreScanFrequencyInMinutes");
            return this;
        }
        /**
         * The frequency (in minutes) of Java Usage Tracker processing. (That is, how often should
         * JMS process data from the Java Usage Tracker.)
         */
        @com.fasterxml.jackson.annotation.JsonProperty(
                "javaUsageTrackerProcessingFrequencyInMinutes")
        private Integer javaUsageTrackerProcessingFrequencyInMinutes;

        /**
         * The frequency (in minutes) of Java Usage Tracker processing. (That is, how often should
         * JMS process data from the Java Usage Tracker.)
         *
         * @param javaUsageTrackerProcessingFrequencyInMinutes the value to set
         * @return this builder
         */
        public Builder javaUsageTrackerProcessingFrequencyInMinutes(
                Integer javaUsageTrackerProcessingFrequencyInMinutes) {
            this.javaUsageTrackerProcessingFrequencyInMinutes =
                    javaUsageTrackerProcessingFrequencyInMinutes;
            this.__explicitlySet__.add("javaUsageTrackerProcessingFrequencyInMinutes");
            return this;
        }
        /** The validity period in days for work requests. */
        @com.fasterxml.jackson.annotation.JsonProperty("workRequestValidityPeriodInDays")
        private Integer workRequestValidityPeriodInDays;

        /**
         * The validity period in days for work requests.
         *
         * @param workRequestValidityPeriodInDays the value to set
         * @return this builder
         */
        public Builder workRequestValidityPeriodInDays(Integer workRequestValidityPeriodInDays) {
            this.workRequestValidityPeriodInDays = workRequestValidityPeriodInDays;
            this.__explicitlySet__.add("workRequestValidityPeriodInDays");
            return this;
        }
        /** Agent polling interval in minutes */
        @com.fasterxml.jackson.annotation.JsonProperty("agentPollingIntervalInMinutes")
        private Integer agentPollingIntervalInMinutes;

        /**
         * Agent polling interval in minutes
         *
         * @param agentPollingIntervalInMinutes the value to set
         * @return this builder
         */
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateFleetAgentConfigurationDetails build() {
            UpdateFleetAgentConfigurationDetails model =
                    new UpdateFleetAgentConfigurationDetails(
                            this.jreScanFrequencyInMinutes,
                            this.javaUsageTrackerProcessingFrequencyInMinutes,
                            this.workRequestValidityPeriodInDays,
                            this.agentPollingIntervalInMinutes,
                            this.linuxConfiguration,
                            this.windowsConfiguration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateFleetAgentConfigurationDetails model) {
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

    /**
     * The frequency (in minutes) of JRE scanning. (That is, how often should JMS scan for JRE
     * installations.)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jreScanFrequencyInMinutes")
    private final Integer jreScanFrequencyInMinutes;

    /**
     * The frequency (in minutes) of JRE scanning. (That is, how often should JMS scan for JRE
     * installations.)
     *
     * @return the value
     */
    public Integer getJreScanFrequencyInMinutes() {
        return jreScanFrequencyInMinutes;
    }

    /**
     * The frequency (in minutes) of Java Usage Tracker processing. (That is, how often should JMS
     * process data from the Java Usage Tracker.)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("javaUsageTrackerProcessingFrequencyInMinutes")
    private final Integer javaUsageTrackerProcessingFrequencyInMinutes;

    /**
     * The frequency (in minutes) of Java Usage Tracker processing. (That is, how often should JMS
     * process data from the Java Usage Tracker.)
     *
     * @return the value
     */
    public Integer getJavaUsageTrackerProcessingFrequencyInMinutes() {
        return javaUsageTrackerProcessingFrequencyInMinutes;
    }

    /** The validity period in days for work requests. */
    @com.fasterxml.jackson.annotation.JsonProperty("workRequestValidityPeriodInDays")
    private final Integer workRequestValidityPeriodInDays;

    /**
     * The validity period in days for work requests.
     *
     * @return the value
     */
    public Integer getWorkRequestValidityPeriodInDays() {
        return workRequestValidityPeriodInDays;
    }

    /** Agent polling interval in minutes */
    @com.fasterxml.jackson.annotation.JsonProperty("agentPollingIntervalInMinutes")
    private final Integer agentPollingIntervalInMinutes;

    /**
     * Agent polling interval in minutes
     *
     * @return the value
     */
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
        sb.append("UpdateFleetAgentConfigurationDetails(");
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
                && java.util.Objects.equals(
                        this.workRequestValidityPeriodInDays, other.workRequestValidityPeriodInDays)
                && java.util.Objects.equals(
                        this.agentPollingIntervalInMinutes, other.agentPollingIntervalInMinutes)
                && java.util.Objects.equals(this.linuxConfiguration, other.linuxConfiguration)
                && java.util.Objects.equals(this.windowsConfiguration, other.windowsConfiguration)
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
