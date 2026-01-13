/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * MultiNodeJobNodeConfigurationDetails <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MultiNodeJobNodeConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "jobNodeType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MultiNodeJobNodeConfigurationDetails extends JobNodeConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The execution order of node groups */
        @com.fasterxml.jackson.annotation.JsonProperty("startupOrder")
        private StartupOrder startupOrder;

        /**
         * The execution order of node groups
         *
         * @param startupOrder the value to set
         * @return this builder
         */
        public Builder startupOrder(StartupOrder startupOrder) {
            this.startupOrder = startupOrder;
            this.__explicitlySet__.add("startupOrder");
            return this;
        }
        /**
         * A time bound for the execution of the job run. Timer starts when the job run is in
         * progress.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maximumRuntimeInMinutes")
        private Long maximumRuntimeInMinutes;

        /**
         * A time bound for the execution of the job run. Timer starts when the job run is in
         * progress.
         *
         * @param maximumRuntimeInMinutes the value to set
         * @return this builder
         */
        public Builder maximumRuntimeInMinutes(Long maximumRuntimeInMinutes) {
            this.maximumRuntimeInMinutes = maximumRuntimeInMinutes;
            this.__explicitlySet__.add("maximumRuntimeInMinutes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobNetworkConfiguration")
        private JobNetworkConfiguration jobNetworkConfiguration;

        public Builder jobNetworkConfiguration(JobNetworkConfiguration jobNetworkConfiguration) {
            this.jobNetworkConfiguration = jobNetworkConfiguration;
            this.__explicitlySet__.add("jobNetworkConfiguration");
            return this;
        }
        /** List of JobNodeGroupConfigurationDetails */
        @com.fasterxml.jackson.annotation.JsonProperty("jobNodeGroupConfigurationDetailsList")
        private java.util.List<JobNodeGroupConfigurationDetails>
                jobNodeGroupConfigurationDetailsList;

        /**
         * List of JobNodeGroupConfigurationDetails
         *
         * @param jobNodeGroupConfigurationDetailsList the value to set
         * @return this builder
         */
        public Builder jobNodeGroupConfigurationDetailsList(
                java.util.List<JobNodeGroupConfigurationDetails>
                        jobNodeGroupConfigurationDetailsList) {
            this.jobNodeGroupConfigurationDetailsList = jobNodeGroupConfigurationDetailsList;
            this.__explicitlySet__.add("jobNodeGroupConfigurationDetailsList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MultiNodeJobNodeConfigurationDetails build() {
            MultiNodeJobNodeConfigurationDetails model =
                    new MultiNodeJobNodeConfigurationDetails(
                            this.startupOrder,
                            this.maximumRuntimeInMinutes,
                            this.jobNetworkConfiguration,
                            this.jobNodeGroupConfigurationDetailsList);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MultiNodeJobNodeConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("startupOrder")) {
                this.startupOrder(model.getStartupOrder());
            }
            if (model.wasPropertyExplicitlySet("maximumRuntimeInMinutes")) {
                this.maximumRuntimeInMinutes(model.getMaximumRuntimeInMinutes());
            }
            if (model.wasPropertyExplicitlySet("jobNetworkConfiguration")) {
                this.jobNetworkConfiguration(model.getJobNetworkConfiguration());
            }
            if (model.wasPropertyExplicitlySet("jobNodeGroupConfigurationDetailsList")) {
                this.jobNodeGroupConfigurationDetailsList(
                        model.getJobNodeGroupConfigurationDetailsList());
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

    @Deprecated
    public MultiNodeJobNodeConfigurationDetails(
            StartupOrder startupOrder,
            Long maximumRuntimeInMinutes,
            JobNetworkConfiguration jobNetworkConfiguration,
            java.util.List<JobNodeGroupConfigurationDetails> jobNodeGroupConfigurationDetailsList) {
        super();
        this.startupOrder = startupOrder;
        this.maximumRuntimeInMinutes = maximumRuntimeInMinutes;
        this.jobNetworkConfiguration = jobNetworkConfiguration;
        this.jobNodeGroupConfigurationDetailsList = jobNodeGroupConfigurationDetailsList;
    }

    /** The execution order of node groups */
    public enum StartupOrder implements com.oracle.bmc.http.internal.BmcEnum {
        InOrder("IN_ORDER"),
        InParallel("IN_PARALLEL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(StartupOrder.class);

        private final String value;
        private static java.util.Map<String, StartupOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (StartupOrder v : StartupOrder.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        StartupOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StartupOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'StartupOrder', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The execution order of node groups */
    @com.fasterxml.jackson.annotation.JsonProperty("startupOrder")
    private final StartupOrder startupOrder;

    /**
     * The execution order of node groups
     *
     * @return the value
     */
    public StartupOrder getStartupOrder() {
        return startupOrder;
    }

    /**
     * A time bound for the execution of the job run. Timer starts when the job run is in progress.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maximumRuntimeInMinutes")
    private final Long maximumRuntimeInMinutes;

    /**
     * A time bound for the execution of the job run. Timer starts when the job run is in progress.
     *
     * @return the value
     */
    public Long getMaximumRuntimeInMinutes() {
        return maximumRuntimeInMinutes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("jobNetworkConfiguration")
    private final JobNetworkConfiguration jobNetworkConfiguration;

    public JobNetworkConfiguration getJobNetworkConfiguration() {
        return jobNetworkConfiguration;
    }

    /** List of JobNodeGroupConfigurationDetails */
    @com.fasterxml.jackson.annotation.JsonProperty("jobNodeGroupConfigurationDetailsList")
    private final java.util.List<JobNodeGroupConfigurationDetails>
            jobNodeGroupConfigurationDetailsList;

    /**
     * List of JobNodeGroupConfigurationDetails
     *
     * @return the value
     */
    public java.util.List<JobNodeGroupConfigurationDetails>
            getJobNodeGroupConfigurationDetailsList() {
        return jobNodeGroupConfigurationDetailsList;
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
        sb.append("MultiNodeJobNodeConfigurationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", startupOrder=").append(String.valueOf(this.startupOrder));
        sb.append(", maximumRuntimeInMinutes=")
                .append(String.valueOf(this.maximumRuntimeInMinutes));
        sb.append(", jobNetworkConfiguration=")
                .append(String.valueOf(this.jobNetworkConfiguration));
        sb.append(", jobNodeGroupConfigurationDetailsList=")
                .append(String.valueOf(this.jobNodeGroupConfigurationDetailsList));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MultiNodeJobNodeConfigurationDetails)) {
            return false;
        }

        MultiNodeJobNodeConfigurationDetails other = (MultiNodeJobNodeConfigurationDetails) o;
        return java.util.Objects.equals(this.startupOrder, other.startupOrder)
                && java.util.Objects.equals(
                        this.maximumRuntimeInMinutes, other.maximumRuntimeInMinutes)
                && java.util.Objects.equals(
                        this.jobNetworkConfiguration, other.jobNetworkConfiguration)
                && java.util.Objects.equals(
                        this.jobNodeGroupConfigurationDetailsList,
                        other.jobNodeGroupConfigurationDetailsList)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.startupOrder == null ? 43 : this.startupOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.maximumRuntimeInMinutes == null
                                ? 43
                                : this.maximumRuntimeInMinutes.hashCode());
        result =
                (result * PRIME)
                        + (this.jobNetworkConfiguration == null
                                ? 43
                                : this.jobNetworkConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.jobNodeGroupConfigurationDetailsList == null
                                ? 43
                                : this.jobNodeGroupConfigurationDetailsList.hashCode());
        return result;
    }
}
