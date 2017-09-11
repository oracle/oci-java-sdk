/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * Information about a single backend server health check result reported by a load balancer.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HealthCheckResult.Builder.class
)
public class HealthCheckResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("healthCheckStatus")
        private HealthCheckStatus healthCheckStatus;

        @com.fasterxml.jackson.annotation.JsonProperty("sourceIpAddress")
        private String sourceIpAddress;

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        public HealthCheckResult build() {
            return new HealthCheckResult(healthCheckStatus, sourceIpAddress, subnetId, timestamp);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HealthCheckResult o) {
            return healthCheckStatus(o.getHealthCheckStatus())
                    .sourceIpAddress(o.getSourceIpAddress())
                    .subnetId(o.getSubnetId())
                    .timestamp(o.getTimestamp());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The result of the most recent health check.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum HealthCheckStatus {
        Ok("OK"),
        InvalidStatusCode("INVALID_STATUS_CODE"),
        TimedOut("TIMED_OUT"),
        RegexMismatch("REGEX_MISMATCH"),
        ConnectFailed("CONNECT_FAILED"),
        IoError("IO_ERROR"),
        Offline("OFFLINE"),
        Unknown("UNKNOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, HealthCheckStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (HealthCheckStatus v : HealthCheckStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        HealthCheckStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static HealthCheckStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'HealthCheckStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The result of the most recent health check.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("healthCheckStatus")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    HealthCheckStatus healthCheckStatus;

    /**
     * The IP address of the health check status report provider. This identifier helps you differentiate same-subnet
     * (private) load balancers that report health check status.
     * <p>
     * Example: `10.2.0.1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceIpAddress")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String sourceIpAddress;

    /**
     * The OCID of the subnet hosting the load balancer that reported this health check status.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String subnetId;

    /**
     * The date and time the data was retrieved, in the format defined by RFC3339.
     * <p>
     * Example: `2017-06-02T18:28:11+00:00`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    java.util.Date timestamp;
}
