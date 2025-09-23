/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
        "isCollectingManagedInstanceMetricsEnabled",
        "isCollectingUsernamesEnabled",
        "isCapturingIpAddressAndFqdnEnabled",
        "isLibrariesScanEnabled",
        "linuxConfiguration",
        "windowsConfiguration",
        "macOsConfiguration"
    })
    public UpdateFleetAgentConfigurationDetails(
            Integer jreScanFrequencyInMinutes,
            Integer javaUsageTrackerProcessingFrequencyInMinutes,
            Integer workRequestValidityPeriodInDays,
            Integer agentPollingIntervalInMinutes,
            Boolean isCollectingManagedInstanceMetricsEnabled,
            Boolean isCollectingUsernamesEnabled,
            Boolean isCapturingIpAddressAndFqdnEnabled,
            Boolean isLibrariesScanEnabled,
            FleetAgentOsConfiguration linuxConfiguration,
            FleetAgentOsConfiguration windowsConfiguration,
            FleetAgentOsConfiguration macOsConfiguration) {
        super();
        this.jreScanFrequencyInMinutes = jreScanFrequencyInMinutes;
        this.javaUsageTrackerProcessingFrequencyInMinutes =
                javaUsageTrackerProcessingFrequencyInMinutes;
        this.workRequestValidityPeriodInDays = workRequestValidityPeriodInDays;
        this.agentPollingIntervalInMinutes = agentPollingIntervalInMinutes;
        this.isCollectingManagedInstanceMetricsEnabled = isCollectingManagedInstanceMetricsEnabled;
        this.isCollectingUsernamesEnabled = isCollectingUsernamesEnabled;
        this.isCapturingIpAddressAndFqdnEnabled = isCapturingIpAddressAndFqdnEnabled;
        this.isLibrariesScanEnabled = isLibrariesScanEnabled;
        this.linuxConfiguration = linuxConfiguration;
        this.windowsConfiguration = windowsConfiguration;
        this.macOsConfiguration = macOsConfiguration;
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
        /** Collect JMS agent metrics on all managed instances in the fleet. */
        @com.fasterxml.jackson.annotation.JsonProperty("isCollectingManagedInstanceMetricsEnabled")
        private Boolean isCollectingManagedInstanceMetricsEnabled;

        /**
         * Collect JMS agent metrics on all managed instances in the fleet.
         *
         * @param isCollectingManagedInstanceMetricsEnabled the value to set
         * @return this builder
         */
        public Builder isCollectingManagedInstanceMetricsEnabled(
                Boolean isCollectingManagedInstanceMetricsEnabled) {
            this.isCollectingManagedInstanceMetricsEnabled =
                    isCollectingManagedInstanceMetricsEnabled;
            this.__explicitlySet__.add("isCollectingManagedInstanceMetricsEnabled");
            return this;
        }
        /** Collect username for application invocations for all managed instances in the fleet. */
        @com.fasterxml.jackson.annotation.JsonProperty("isCollectingUsernamesEnabled")
        private Boolean isCollectingUsernamesEnabled;

        /**
         * Collect username for application invocations for all managed instances in the fleet.
         *
         * @param isCollectingUsernamesEnabled the value to set
         * @return this builder
         */
        public Builder isCollectingUsernamesEnabled(Boolean isCollectingUsernamesEnabled) {
            this.isCollectingUsernamesEnabled = isCollectingUsernamesEnabled;
            this.__explicitlySet__.add("isCollectingUsernamesEnabled");
            return this;
        }
        /** Collect network addresses of managed instances in the fleet. */
        @com.fasterxml.jackson.annotation.JsonProperty("isCapturingIpAddressAndFqdnEnabled")
        private Boolean isCapturingIpAddressAndFqdnEnabled;

        /**
         * Collect network addresses of managed instances in the fleet.
         *
         * @param isCapturingIpAddressAndFqdnEnabled the value to set
         * @return this builder
         */
        public Builder isCapturingIpAddressAndFqdnEnabled(
                Boolean isCapturingIpAddressAndFqdnEnabled) {
            this.isCapturingIpAddressAndFqdnEnabled = isCapturingIpAddressAndFqdnEnabled;
            this.__explicitlySet__.add("isCapturingIpAddressAndFqdnEnabled");
            return this;
        }
        /** Enable libraries scan on all managed instances in the fleet. */
        @com.fasterxml.jackson.annotation.JsonProperty("isLibrariesScanEnabled")
        private Boolean isLibrariesScanEnabled;

        /**
         * Enable libraries scan on all managed instances in the fleet.
         *
         * @param isLibrariesScanEnabled the value to set
         * @return this builder
         */
        public Builder isLibrariesScanEnabled(Boolean isLibrariesScanEnabled) {
            this.isLibrariesScanEnabled = isLibrariesScanEnabled;
            this.__explicitlySet__.add("isLibrariesScanEnabled");
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

        @com.fasterxml.jackson.annotation.JsonProperty("macOsConfiguration")
        private FleetAgentOsConfiguration macOsConfiguration;

        public Builder macOsConfiguration(FleetAgentOsConfiguration macOsConfiguration) {
            this.macOsConfiguration = macOsConfiguration;
            this.__explicitlySet__.add("macOsConfiguration");
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
                            this.isCollectingManagedInstanceMetricsEnabled,
                            this.isCollectingUsernamesEnabled,
                            this.isCapturingIpAddressAndFqdnEnabled,
                            this.isLibrariesScanEnabled,
                            this.linuxConfiguration,
                            this.windowsConfiguration,
                            this.macOsConfiguration);
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
            if (model.wasPropertyExplicitlySet("isCollectingManagedInstanceMetricsEnabled")) {
                this.isCollectingManagedInstanceMetricsEnabled(
                        model.getIsCollectingManagedInstanceMetricsEnabled());
            }
            if (model.wasPropertyExplicitlySet("isCollectingUsernamesEnabled")) {
                this.isCollectingUsernamesEnabled(model.getIsCollectingUsernamesEnabled());
            }
            if (model.wasPropertyExplicitlySet("isCapturingIpAddressAndFqdnEnabled")) {
                this.isCapturingIpAddressAndFqdnEnabled(
                        model.getIsCapturingIpAddressAndFqdnEnabled());
            }
            if (model.wasPropertyExplicitlySet("isLibrariesScanEnabled")) {
                this.isLibrariesScanEnabled(model.getIsLibrariesScanEnabled());
            }
            if (model.wasPropertyExplicitlySet("linuxConfiguration")) {
                this.linuxConfiguration(model.getLinuxConfiguration());
            }
            if (model.wasPropertyExplicitlySet("windowsConfiguration")) {
                this.windowsConfiguration(model.getWindowsConfiguration());
            }
            if (model.wasPropertyExplicitlySet("macOsConfiguration")) {
                this.macOsConfiguration(model.getMacOsConfiguration());
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

    /** Collect JMS agent metrics on all managed instances in the fleet. */
    @com.fasterxml.jackson.annotation.JsonProperty("isCollectingManagedInstanceMetricsEnabled")
    private final Boolean isCollectingManagedInstanceMetricsEnabled;

    /**
     * Collect JMS agent metrics on all managed instances in the fleet.
     *
     * @return the value
     */
    public Boolean getIsCollectingManagedInstanceMetricsEnabled() {
        return isCollectingManagedInstanceMetricsEnabled;
    }

    /** Collect username for application invocations for all managed instances in the fleet. */
    @com.fasterxml.jackson.annotation.JsonProperty("isCollectingUsernamesEnabled")
    private final Boolean isCollectingUsernamesEnabled;

    /**
     * Collect username for application invocations for all managed instances in the fleet.
     *
     * @return the value
     */
    public Boolean getIsCollectingUsernamesEnabled() {
        return isCollectingUsernamesEnabled;
    }

    /** Collect network addresses of managed instances in the fleet. */
    @com.fasterxml.jackson.annotation.JsonProperty("isCapturingIpAddressAndFqdnEnabled")
    private final Boolean isCapturingIpAddressAndFqdnEnabled;

    /**
     * Collect network addresses of managed instances in the fleet.
     *
     * @return the value
     */
    public Boolean getIsCapturingIpAddressAndFqdnEnabled() {
        return isCapturingIpAddressAndFqdnEnabled;
    }

    /** Enable libraries scan on all managed instances in the fleet. */
    @com.fasterxml.jackson.annotation.JsonProperty("isLibrariesScanEnabled")
    private final Boolean isLibrariesScanEnabled;

    /**
     * Enable libraries scan on all managed instances in the fleet.
     *
     * @return the value
     */
    public Boolean getIsLibrariesScanEnabled() {
        return isLibrariesScanEnabled;
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

    @com.fasterxml.jackson.annotation.JsonProperty("macOsConfiguration")
    private final FleetAgentOsConfiguration macOsConfiguration;

    public FleetAgentOsConfiguration getMacOsConfiguration() {
        return macOsConfiguration;
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
        sb.append(", isCollectingManagedInstanceMetricsEnabled=")
                .append(String.valueOf(this.isCollectingManagedInstanceMetricsEnabled));
        sb.append(", isCollectingUsernamesEnabled=")
                .append(String.valueOf(this.isCollectingUsernamesEnabled));
        sb.append(", isCapturingIpAddressAndFqdnEnabled=")
                .append(String.valueOf(this.isCapturingIpAddressAndFqdnEnabled));
        sb.append(", isLibrariesScanEnabled=").append(String.valueOf(this.isLibrariesScanEnabled));
        sb.append(", linuxConfiguration=").append(String.valueOf(this.linuxConfiguration));
        sb.append(", windowsConfiguration=").append(String.valueOf(this.windowsConfiguration));
        sb.append(", macOsConfiguration=").append(String.valueOf(this.macOsConfiguration));
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
                && java.util.Objects.equals(
                        this.isCollectingManagedInstanceMetricsEnabled,
                        other.isCollectingManagedInstanceMetricsEnabled)
                && java.util.Objects.equals(
                        this.isCollectingUsernamesEnabled, other.isCollectingUsernamesEnabled)
                && java.util.Objects.equals(
                        this.isCapturingIpAddressAndFqdnEnabled,
                        other.isCapturingIpAddressAndFqdnEnabled)
                && java.util.Objects.equals(
                        this.isLibrariesScanEnabled, other.isLibrariesScanEnabled)
                && java.util.Objects.equals(this.linuxConfiguration, other.linuxConfiguration)
                && java.util.Objects.equals(this.windowsConfiguration, other.windowsConfiguration)
                && java.util.Objects.equals(this.macOsConfiguration, other.macOsConfiguration)
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
                        + (this.isCollectingManagedInstanceMetricsEnabled == null
                                ? 43
                                : this.isCollectingManagedInstanceMetricsEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isCollectingUsernamesEnabled == null
                                ? 43
                                : this.isCollectingUsernamesEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isCapturingIpAddressAndFqdnEnabled == null
                                ? 43
                                : this.isCapturingIpAddressAndFqdnEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isLibrariesScanEnabled == null
                                ? 43
                                : this.isLibrariesScanEnabled.hashCode());
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
                        + (this.macOsConfiguration == null
                                ? 43
                                : this.macOsConfiguration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
