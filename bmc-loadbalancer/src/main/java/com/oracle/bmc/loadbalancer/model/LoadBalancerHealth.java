/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The health status details for the specified load balancer.
 * <p>
 * This object does not explicitly enumerate backend sets with a status of `OK`. However, they are included in the
 * `totalBackendSetCount` sum.
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
    builder = LoadBalancerHealth.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class LoadBalancerHealth {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("warningStateBackendSetNames")
        private java.util.List<String> warningStateBackendSetNames;

        public Builder warningStateBackendSetNames(
                java.util.List<String> warningStateBackendSetNames) {
            this.warningStateBackendSetNames = warningStateBackendSetNames;
            this.__explicitlySet__.add("warningStateBackendSetNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("criticalStateBackendSetNames")
        private java.util.List<String> criticalStateBackendSetNames;

        public Builder criticalStateBackendSetNames(
                java.util.List<String> criticalStateBackendSetNames) {
            this.criticalStateBackendSetNames = criticalStateBackendSetNames;
            this.__explicitlySet__.add("criticalStateBackendSetNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("unknownStateBackendSetNames")
        private java.util.List<String> unknownStateBackendSetNames;

        public Builder unknownStateBackendSetNames(
                java.util.List<String> unknownStateBackendSetNames) {
            this.unknownStateBackendSetNames = unknownStateBackendSetNames;
            this.__explicitlySet__.add("unknownStateBackendSetNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalBackendSetCount")
        private Integer totalBackendSetCount;

        public Builder totalBackendSetCount(Integer totalBackendSetCount) {
            this.totalBackendSetCount = totalBackendSetCount;
            this.__explicitlySet__.add("totalBackendSetCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LoadBalancerHealth build() {
            LoadBalancerHealth __instance__ =
                    new LoadBalancerHealth(
                            status,
                            warningStateBackendSetNames,
                            criticalStateBackendSetNames,
                            unknownStateBackendSetNames,
                            totalBackendSetCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoadBalancerHealth o) {
            Builder copiedBuilder =
                    status(o.getStatus())
                            .warningStateBackendSetNames(o.getWarningStateBackendSetNames())
                            .criticalStateBackendSetNames(o.getCriticalStateBackendSetNames())
                            .unknownStateBackendSetNames(o.getUnknownStateBackendSetNames())
                            .totalBackendSetCount(o.getTotalBackendSetCount());

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
     * The overall health status of the load balancer.
     * <p>
     *  **OK:** All backend sets associated with the load balancer return a status of `OK`.
     * <p>
     *  **WARNING:** At least one of the backend sets associated with the load balancer returns a status of `WARNING`,
     * no backend sets return a status of `CRITICAL`, and the load balancer life cycle state is `ACTIVE`.
     * <p>
     *  **CRITICAL:** One or more of the backend sets associated with the load balancer return a status of `CRITICAL`.
     * <p>
     *  **UNKNOWN:** If any one of the following conditions is true:
     * <p>
     *  The load balancer life cycle state is not `ACTIVE`.
     * <p>
     *  No backend sets are defined for the load balancer.
     * <p>
     *  More than half of the backend sets associated with the load balancer return a status of `UNKNOWN`, none of the backend
     *        sets return a status of `WARNING` or `CRITICAL`, and the load balancer life cycle state is `ACTIVE`.
     * <p>
     *  The system could not retrieve metrics for any reason.
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
     * The overall health status of the load balancer.
     * <p>
     *  **OK:** All backend sets associated with the load balancer return a status of `OK`.
     * <p>
     *  **WARNING:** At least one of the backend sets associated with the load balancer returns a status of `WARNING`,
     * no backend sets return a status of `CRITICAL`, and the load balancer life cycle state is `ACTIVE`.
     * <p>
     *  **CRITICAL:** One or more of the backend sets associated with the load balancer return a status of `CRITICAL`.
     * <p>
     *  **UNKNOWN:** If any one of the following conditions is true:
     * <p>
     *  The load balancer life cycle state is not `ACTIVE`.
     * <p>
     *  No backend sets are defined for the load balancer.
     * <p>
     *  More than half of the backend sets associated with the load balancer return a status of `UNKNOWN`, none of the backend
     *        sets return a status of `WARNING` or `CRITICAL`, and the load balancer life cycle state is `ACTIVE`.
     * <p>
     *  The system could not retrieve metrics for any reason.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Status status;

    /**
     * A list of backend sets that are currently in the `WARNING` health state. The list identifies each backend set by the
     * friendly name you assigned when you created it.
     * <p>
     * Example: `example_backend_set3`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("warningStateBackendSetNames")
    java.util.List<String> warningStateBackendSetNames;

    /**
     * A list of backend sets that are currently in the `CRITICAL` health state. The list identifies each backend set by the
     * friendly name you assigned when you created it.
     * <p>
     * Example: `example_backend_set`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("criticalStateBackendSetNames")
    java.util.List<String> criticalStateBackendSetNames;

    /**
     * A list of backend sets that are currently in the `UNKNOWN` health state. The list identifies each backend set by the
     * friendly name you assigned when you created it.
     * <p>
     * Example: `example_backend_set2`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unknownStateBackendSetNames")
    java.util.List<String> unknownStateBackendSetNames;

    /**
     * The total number of backend sets associated with this load balancer.
     * <p>
     * Example: `4`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalBackendSetCount")
    Integer totalBackendSetCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
