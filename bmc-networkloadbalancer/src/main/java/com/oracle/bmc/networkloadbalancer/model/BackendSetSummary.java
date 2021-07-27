/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.model;

/**
 * The configuration of a network load balancer backend set.
 * For more information about backend set configuration, see
 * [Managing Backend Sets](https://docs.cloud.oracle.com/Content/Balance/Tasks/managingbackendsets.htm).
 * <p>
 **Caution:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BackendSetSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class BackendSetSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("policy")
        private NetworkLoadBalancingPolicy policy;

        public Builder policy(NetworkLoadBalancingPolicy policy) {
            this.policy = policy;
            this.__explicitlySet__.add("policy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPreserveSource")
        private Boolean isPreserveSource;

        public Builder isPreserveSource(Boolean isPreserveSource) {
            this.isPreserveSource = isPreserveSource;
            this.__explicitlySet__.add("isPreserveSource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backends")
        private java.util.List<Backend> backends;

        public Builder backends(java.util.List<Backend> backends) {
            this.backends = backends;
            this.__explicitlySet__.add("backends");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("healthChecker")
        private HealthChecker healthChecker;

        public Builder healthChecker(HealthChecker healthChecker) {
            this.healthChecker = healthChecker;
            this.__explicitlySet__.add("healthChecker");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BackendSetSummary build() {
            BackendSetSummary __instance__ =
                    new BackendSetSummary(name, policy, isPreserveSource, backends, healthChecker);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BackendSetSummary o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .policy(o.getPolicy())
                            .isPreserveSource(o.getIsPreserveSource())
                            .backends(o.getBackends())
                            .healthChecker(o.getHealthChecker());

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
     * A user-friendly name for the backend set that must be unique and cannot be changed.
     * <p>
     * Valid backend set names include only alphanumeric characters, dashes, and underscores. Backend set names cannot
     * contain spaces. Avoid entering confidential information.
     * <p>
     * Example: {@code example_backend_set}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The network load balancer policy for the backend set.
     * <p>
     * Example: {@code FIVE_TUPLE}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policy")
    NetworkLoadBalancingPolicy policy;

    /**
     * If this parameter is enabled, then the network load balancer preserves the source IP of the packet when it is forwarded to backends.
     * Backends see the original source IP. If the isPreserveSourceDestination parameter is enabled for the network load balancer resource, then this parameter cannot be disabled.
     * The value is true by default.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPreserveSource")
    Boolean isPreserveSource;

    /**
     * An array of backends.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backends")
    java.util.List<Backend> backends;

    @com.fasterxml.jackson.annotation.JsonProperty("healthChecker")
    HealthChecker healthChecker;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
