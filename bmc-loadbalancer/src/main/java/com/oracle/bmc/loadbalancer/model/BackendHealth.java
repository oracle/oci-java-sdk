/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The health status of the specified backend server as reported by the primary and stand-by load balancers.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BackendHealth.Builder.class)
public class BackendHealth {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("healthCheckResults")
        private java.util.List<HealthCheckResult> healthCheckResults;

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public BackendHealth build() {
            return new BackendHealth(healthCheckResults, status);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BackendHealth o) {
            return healthCheckResults(o.getHealthCheckResults()).status(o.getStatus());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * A list of the most recent health check results returned for the specified backend server.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("healthCheckResults")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    java.util.List<HealthCheckResult> healthCheckResults;
    /**
     * The general health status of the specified backend server as reported by the primary and stand-by load balancers.
     * <p>
     *   **OK:** Both health checks returned `OK`.
     * <p>
     *   **WARNING:** One health check returned `OK` and one did not.
     * <p>
     *   **CRITICAL:** Neither health check returned `OK`.
     * <p>
     *   **UNKNOWN:** One or both health checks returned `UNKNOWN`, or the system was unable to retrieve metrics at this time.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Status {
        Ok("OK"),
        Warning("WARNING"),
        Critical("CRITICAL"),
        Unknown("UNKNOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The general health status of the specified backend server as reported by the primary and stand-by load balancers.
     * <p>
     *   **OK:** Both health checks returned `OK`.
     * <p>
     *   **WARNING:** One health check returned `OK` and one did not.
     * <p>
     *   **CRITICAL:** Neither health check returned `OK`.
     * <p>
     *   **UNKNOWN:** One or both health checks returned `UNKNOWN`, or the system was unable to retrieve metrics at this time.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    Status status;
}
