/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The health status of the specified backend server as reported by the primary and standby load balancers.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BackendHealth.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class BackendHealth {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("healthCheckResults")
        private java.util.List<HealthCheckResult> healthCheckResults;

        public Builder healthCheckResults(java.util.List<HealthCheckResult> healthCheckResults) {
            this.healthCheckResults = healthCheckResults;
            this.__explicitlySet__.add("healthCheckResults");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BackendHealth build() {
            BackendHealth __instance__ = new BackendHealth(healthCheckResults, status);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BackendHealth o) {
            Builder copiedBuilder =
                    healthCheckResults(o.getHealthCheckResults()).status(o.getStatus());

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
     * A list of the most recent health check results returned for the specified backend server.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("healthCheckResults")
    java.util.List<HealthCheckResult> healthCheckResults;
    /**
     * The general health status of the specified backend server as reported by the primary and standby load balancers.
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
     * The general health status of the specified backend server as reported by the primary and standby load balancers.
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
    Status status;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
