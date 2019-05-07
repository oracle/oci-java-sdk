/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * Information about a single backend server health check result reported by a load balancer.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HealthCheckResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class HealthCheckResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceIpAddress")
        private String sourceIpAddress;

        public Builder sourceIpAddress(String sourceIpAddress) {
            this.sourceIpAddress = sourceIpAddress;
            this.__explicitlySet__.add("sourceIpAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("healthCheckStatus")
        private HealthCheckStatus healthCheckStatus;

        public Builder healthCheckStatus(HealthCheckStatus healthCheckStatus) {
            this.healthCheckStatus = healthCheckStatus;
            this.__explicitlySet__.add("healthCheckStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HealthCheckResult build() {
            HealthCheckResult __instance__ =
                    new HealthCheckResult(subnetId, sourceIpAddress, timestamp, healthCheckStatus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HealthCheckResult o) {
            Builder copiedBuilder =
                    subnetId(o.getSubnetId())
                            .sourceIpAddress(o.getSourceIpAddress())
                            .timestamp(o.getTimestamp())
                            .healthCheckStatus(o.getHealthCheckStatus());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the subnet hosting the load balancer that reported this health check status.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    String subnetId;

    /**
     * The IP address of the health check status report provider. This identifier helps you differentiate same-subnet
     * load balancers that report health check status.
     * <p>
     * Example: `10.0.0.7`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceIpAddress")
    String sourceIpAddress;

    /**
     * The date and time the data was retrieved, in the format defined by RFC3339.
     * <p>
     * Example: `2017-06-02T18:28:11+00:00`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    java.util.Date timestamp;
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
    HealthCheckStatus healthCheckStatus;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
