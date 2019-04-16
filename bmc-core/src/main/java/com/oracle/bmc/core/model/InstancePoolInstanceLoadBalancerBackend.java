/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * Represents the load balancer Backend that is configured for an instance pool instance.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InstancePoolInstanceLoadBalancerBackend.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class InstancePoolInstanceLoadBalancerBackend {
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

        @com.fasterxml.jackson.annotation.JsonProperty("backendSetName")
        private String backendSetName;

        public Builder backendSetName(String backendSetName) {
            this.backendSetName = backendSetName;
            this.__explicitlySet__.add("backendSetName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backendName")
        private String backendName;

        public Builder backendName(String backendName) {
            this.backendName = backendName;
            this.__explicitlySet__.add("backendName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backendHealthStatus")
        private BackendHealthStatus backendHealthStatus;

        public Builder backendHealthStatus(BackendHealthStatus backendHealthStatus) {
            this.backendHealthStatus = backendHealthStatus;
            this.__explicitlySet__.add("backendHealthStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstancePoolInstanceLoadBalancerBackend build() {
            InstancePoolInstanceLoadBalancerBackend __instance__ =
                    new InstancePoolInstanceLoadBalancerBackend(
                            loadBalancerId, backendSetName, backendName, backendHealthStatus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstancePoolInstanceLoadBalancerBackend o) {
            Builder copiedBuilder =
                    loadBalancerId(o.getLoadBalancerId())
                            .backendSetName(o.getBackendSetName())
                            .backendName(o.getBackendName())
                            .backendHealthStatus(o.getBackendHealthStatus());

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
     * The OCID of the load balancer attached to the instance pool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerId")
    String loadBalancerId;

    /**
     * The name of the backend set on the load balancer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backendSetName")
    String backendSetName;

    /**
     * The name of the backend in the backend set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backendName")
    String backendName;
    /**
     * The health of the backend as observed by the load balancer.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum BackendHealthStatus {
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
        private static java.util.Map<String, BackendHealthStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (BackendHealthStatus v : BackendHealthStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BackendHealthStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BackendHealthStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BackendHealthStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The health of the backend as observed by the load balancer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backendHealthStatus")
    BackendHealthStatus backendHealthStatus;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
