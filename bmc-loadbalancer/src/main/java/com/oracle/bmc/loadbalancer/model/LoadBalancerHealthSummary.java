/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * A health status summary for the specified load balancer.
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
    builder = LoadBalancerHealthSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class LoadBalancerHealthSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerId")
        private String loadBalancerId;

        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            this.__explicitlySet__.add("loadBalancerId");
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

        public LoadBalancerHealthSummary build() {
            LoadBalancerHealthSummary __instance__ =
                    new LoadBalancerHealthSummary(loadBalancerId, status);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoadBalancerHealthSummary o) {
            Builder copiedBuilder = loadBalancerId(o.getLoadBalancerId()).status(o.getStatus());

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
     * The [OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm) of the load balancer the health status is associated with.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerId")
    String loadBalancerId;
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

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
