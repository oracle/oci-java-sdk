/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Telemetry configuration details of a DB System or a read replica.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TelemetryConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TelemetryConfigurationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"logs"})
    public TelemetryConfigurationDetails(java.util.List<LoggingDestinationConfiguration> logs) {
        super();
        this.logs = logs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Telemetry configuration details for logging.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logs")
        private java.util.List<LoggingDestinationConfiguration> logs;

        /**
         * Telemetry configuration details for logging.
         * @param logs the value to set
         * @return this builder
         **/
        public Builder logs(java.util.List<LoggingDestinationConfiguration> logs) {
            this.logs = logs;
            this.__explicitlySet__.add("logs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TelemetryConfigurationDetails build() {
            TelemetryConfigurationDetails model = new TelemetryConfigurationDetails(this.logs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TelemetryConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("logs")) {
                this.logs(model.getLogs());
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
     * Telemetry configuration details for logging.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logs")
    private final java.util.List<LoggingDestinationConfiguration> logs;

    /**
     * Telemetry configuration details for logging.
     * @return the value
     **/
    public java.util.List<LoggingDestinationConfiguration> getLogs() {
        return logs;
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
        sb.append("TelemetryConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("logs=").append(String.valueOf(this.logs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TelemetryConfigurationDetails)) {
            return false;
        }

        TelemetryConfigurationDetails other = (TelemetryConfigurationDetails) o;
        return java.util.Objects.equals(this.logs, other.logs) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.logs == null ? 43 : this.logs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
