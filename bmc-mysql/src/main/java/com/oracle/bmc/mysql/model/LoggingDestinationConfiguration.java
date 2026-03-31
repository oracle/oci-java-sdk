/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Configuration parameters for a given destination.
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
    builder = LoggingDestinationConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LoggingDestinationConfiguration
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"destination", "destinationConfigurations", "logTypes"})
    public LoggingDestinationConfiguration(
            Destination destination,
            java.util.List<DestinationConfiguration> destinationConfigurations,
            java.util.List<LogTypes> logTypes) {
        super();
        this.destination = destination;
        this.destinationConfigurations = destinationConfigurations;
        this.logTypes = logTypes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Type of destination where MySQL telemetry is exposed to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destination")
        private Destination destination;

        /**
         * Type of destination where MySQL telemetry is exposed to.
         * @param destination the value to set
         * @return this builder
         **/
        public Builder destination(Destination destination) {
            this.destination = destination;
            this.__explicitlySet__.add("destination");
            return this;
        }
        /**
         * List of configuration variables for a given destination type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationConfigurations")
        private java.util.List<DestinationConfiguration> destinationConfigurations;

        /**
         * List of configuration variables for a given destination type.
         * @param destinationConfigurations the value to set
         * @return this builder
         **/
        public Builder destinationConfigurations(
                java.util.List<DestinationConfiguration> destinationConfigurations) {
            this.destinationConfigurations = destinationConfigurations;
            this.__explicitlySet__.add("destinationConfigurations");
            return this;
        }
        /**
         * List of MySQL telemetry types that can be exposed on a telemetry destination
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logTypes")
        private java.util.List<LogTypes> logTypes;

        /**
         * List of MySQL telemetry types that can be exposed on a telemetry destination
         * @param logTypes the value to set
         * @return this builder
         **/
        public Builder logTypes(java.util.List<LogTypes> logTypes) {
            this.logTypes = logTypes;
            this.__explicitlySet__.add("logTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LoggingDestinationConfiguration build() {
            LoggingDestinationConfiguration model =
                    new LoggingDestinationConfiguration(
                            this.destination, this.destinationConfigurations, this.logTypes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoggingDestinationConfiguration model) {
            if (model.wasPropertyExplicitlySet("destination")) {
                this.destination(model.getDestination());
            }
            if (model.wasPropertyExplicitlySet("destinationConfigurations")) {
                this.destinationConfigurations(model.getDestinationConfigurations());
            }
            if (model.wasPropertyExplicitlySet("logTypes")) {
                this.logTypes(model.getLogTypes());
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
     * Type of destination where MySQL telemetry is exposed to.
     **/
    public enum Destination {
        LogAnalytics("LOG_ANALYTICS"),
        OpenTelemetry("OPEN_TELEMETRY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Destination.class);

        private final String value;
        private static java.util.Map<String, Destination> map;

        static {
            map = new java.util.HashMap<>();
            for (Destination v : Destination.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Destination(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Destination create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Destination', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of destination where MySQL telemetry is exposed to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    private final Destination destination;

    /**
     * Type of destination where MySQL telemetry is exposed to.
     * @return the value
     **/
    public Destination getDestination() {
        return destination;
    }

    /**
     * List of configuration variables for a given destination type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationConfigurations")
    private final java.util.List<DestinationConfiguration> destinationConfigurations;

    /**
     * List of configuration variables for a given destination type.
     * @return the value
     **/
    public java.util.List<DestinationConfiguration> getDestinationConfigurations() {
        return destinationConfigurations;
    }

    /**
     **/
    public enum LogTypes {
        ErrorLog("ERROR_LOG"),
        GeneralLog("GENERAL_LOG"),
        SlowQueryLog("SLOW_QUERY_LOG"),
        AuditLog("AUDIT_LOG"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LogTypes.class);

        private final String value;
        private static java.util.Map<String, LogTypes> map;

        static {
            map = new java.util.HashMap<>();
            for (LogTypes v : LogTypes.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LogTypes(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LogTypes create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LogTypes', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * List of MySQL telemetry types that can be exposed on a telemetry destination
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logTypes")
    private final java.util.List<LogTypes> logTypes;

    /**
     * List of MySQL telemetry types that can be exposed on a telemetry destination
     * @return the value
     **/
    public java.util.List<LogTypes> getLogTypes() {
        return logTypes;
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
        sb.append("LoggingDestinationConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("destination=").append(String.valueOf(this.destination));
        sb.append(", destinationConfigurations=")
                .append(String.valueOf(this.destinationConfigurations));
        sb.append(", logTypes=").append(String.valueOf(this.logTypes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoggingDestinationConfiguration)) {
            return false;
        }

        LoggingDestinationConfiguration other = (LoggingDestinationConfiguration) o;
        return java.util.Objects.equals(this.destination, other.destination)
                && java.util.Objects.equals(
                        this.destinationConfigurations, other.destinationConfigurations)
                && java.util.Objects.equals(this.logTypes, other.logTypes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.destination == null ? 43 : this.destination.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationConfigurations == null
                                ? 43
                                : this.destinationConfigurations.hashCode());
        result = (result * PRIME) + (this.logTypes == null ? 43 : this.logTypes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
