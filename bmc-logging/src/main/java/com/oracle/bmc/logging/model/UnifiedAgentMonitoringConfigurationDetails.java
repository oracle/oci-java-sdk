/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Unified Agent monitoring service configuration object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UnifiedAgentMonitoringConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configurationType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UnifiedAgentMonitoringConfigurationDetails
        extends UnifiedAgentServiceConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unified Agent monitoring application configuration details.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("applicationConfigurations")
        private java.util.List<UnifiedAgentMonitoringApplicationConfigurationDetails>
                applicationConfigurations;

        /**
         * Unified Agent monitoring application configuration details.
         * @param applicationConfigurations the value to set
         * @return this builder
         **/
        public Builder applicationConfigurations(
                java.util.List<UnifiedAgentMonitoringApplicationConfigurationDetails>
                        applicationConfigurations) {
            this.applicationConfigurations = applicationConfigurations;
            this.__explicitlySet__.add("applicationConfigurations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UnifiedAgentMonitoringConfigurationDetails build() {
            UnifiedAgentMonitoringConfigurationDetails model =
                    new UnifiedAgentMonitoringConfigurationDetails(this.applicationConfigurations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UnifiedAgentMonitoringConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("applicationConfigurations")) {
                this.applicationConfigurations(model.getApplicationConfigurations());
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
    public UnifiedAgentMonitoringConfigurationDetails(
            java.util.List<UnifiedAgentMonitoringApplicationConfigurationDetails>
                    applicationConfigurations) {
        super();
        this.applicationConfigurations = applicationConfigurations;
    }

    /**
     * Unified Agent monitoring application configuration details.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationConfigurations")
    private final java.util.List<UnifiedAgentMonitoringApplicationConfigurationDetails>
            applicationConfigurations;

    /**
     * Unified Agent monitoring application configuration details.
     * @return the value
     **/
    public java.util.List<UnifiedAgentMonitoringApplicationConfigurationDetails>
            getApplicationConfigurations() {
        return applicationConfigurations;
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
        sb.append("UnifiedAgentMonitoringConfigurationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", applicationConfigurations=")
                .append(String.valueOf(this.applicationConfigurations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UnifiedAgentMonitoringConfigurationDetails)) {
            return false;
        }

        UnifiedAgentMonitoringConfigurationDetails other =
                (UnifiedAgentMonitoringConfigurationDetails) o;
        return java.util.Objects.equals(
                        this.applicationConfigurations, other.applicationConfigurations)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.applicationConfigurations == null
                                ? 43
                                : this.applicationConfigurations.hashCode());
        return result;
    }
}
