/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.model;

/**
 * The health status details for the specified network load balancer.
 * <p>
 * This object does not explicitly enumerate backend sets with a status of {@code OK}. However, the backend sets are included in the
 * {@code totalBackendSetCount} sum.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = NetworkLoadBalancerHealth.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NetworkLoadBalancerHealth {
    @Deprecated
    @java.beans.ConstructorProperties({
        "status",
        "warningStateBackendSetNames",
        "criticalStateBackendSetNames",
        "unknownStateBackendSetNames",
        "totalBackendSetCount"
    })
    public NetworkLoadBalancerHealth(
            Status status,
            java.util.List<String> warningStateBackendSetNames,
            java.util.List<String> criticalStateBackendSetNames,
            java.util.List<String> unknownStateBackendSetNames,
            Integer totalBackendSetCount) {
        super();
        this.status = status;
        this.warningStateBackendSetNames = warningStateBackendSetNames;
        this.criticalStateBackendSetNames = criticalStateBackendSetNames;
        this.unknownStateBackendSetNames = unknownStateBackendSetNames;
        this.totalBackendSetCount = totalBackendSetCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

        public NetworkLoadBalancerHealth build() {
            NetworkLoadBalancerHealth __instance__ =
                    new NetworkLoadBalancerHealth(
                            status,
                            warningStateBackendSetNames,
                            criticalStateBackendSetNames,
                            unknownStateBackendSetNames,
                            totalBackendSetCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NetworkLoadBalancerHealth o) {
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The overall health status of the network load balancer.
     * <p>
     *  **OK:** All backend sets associated with the network load balancer return a status of {@code OK}.
     * <p>
     *  **WARNING:** At least one of the backend sets associated with the network load balancer returns a status of {@code WARNING},
     * no backend sets return a status of {@code CRITICAL}, and the network load balancer life cycle state is {@code ACTIVE}.
     * <p>
     *  **CRITICAL:** One or more of the backend sets associated with the network load balancer return a status of {@code CRITICAL}.
     * <p>
     *  **UNKNOWN:** If any one of the following conditions is true:
     * <p>
     *  The network load balancer life cycle state is not {@code ACTIVE}.
     * <p>
     *  No backend sets are defined for the network load balancer.
     * <p>
     *  More than half of the backend sets associated with the network load balancer return a status of {@code UNKNOWN}, none of the backend
     *        sets return a status of {@code WARNING} or {@code CRITICAL}, and the network load balancer life cycle state is {@code ACTIVE}.
     * <p>
     *  The system could not retrieve metrics for any reason.
     *
     **/
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

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

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
     * The overall health status of the network load balancer.
     * <p>
     *  **OK:** All backend sets associated with the network load balancer return a status of {@code OK}.
     * <p>
     *  **WARNING:** At least one of the backend sets associated with the network load balancer returns a status of {@code WARNING},
     * no backend sets return a status of {@code CRITICAL}, and the network load balancer life cycle state is {@code ACTIVE}.
     * <p>
     *  **CRITICAL:** One or more of the backend sets associated with the network load balancer return a status of {@code CRITICAL}.
     * <p>
     *  **UNKNOWN:** If any one of the following conditions is true:
     * <p>
     *  The network load balancer life cycle state is not {@code ACTIVE}.
     * <p>
     *  No backend sets are defined for the network load balancer.
     * <p>
     *  More than half of the backend sets associated with the network load balancer return a status of {@code UNKNOWN}, none of the backend
     *        sets return a status of {@code WARNING} or {@code CRITICAL}, and the network load balancer life cycle state is {@code ACTIVE}.
     * <p>
     *  The system could not retrieve metrics for any reason.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    public Status getStatus() {
        return status;
    }

    /**
     * A list of backend sets that are currently in the {@code WARNING} health state. The list identifies each backend set by the
     * user-friendly name you assigned when you created the backend set.
     * <p>
     * Example: {@code example_backend_set3}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("warningStateBackendSetNames")
    private final java.util.List<String> warningStateBackendSetNames;

    public java.util.List<String> getWarningStateBackendSetNames() {
        return warningStateBackendSetNames;
    }

    /**
     * A list of backend sets that are currently in the {@code CRITICAL} health state. The list identifies each backend set by the
     * user-friendly name you assigned when you created the backend set.
     * <p>
     * Example: {@code example_backend_set}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("criticalStateBackendSetNames")
    private final java.util.List<String> criticalStateBackendSetNames;

    public java.util.List<String> getCriticalStateBackendSetNames() {
        return criticalStateBackendSetNames;
    }

    /**
     * A list of backend sets that are currently in the {@code UNKNOWN} health state. The list identifies each backend set by the
     * user-friendly name you assigned when you created the backend set.
     * <p>
     * Example: {@code example_backend_set2}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unknownStateBackendSetNames")
    private final java.util.List<String> unknownStateBackendSetNames;

    public java.util.List<String> getUnknownStateBackendSetNames() {
        return unknownStateBackendSetNames;
    }

    /**
     * The total number of backend sets associated with this network load balancer.
     * <p>
     * Example: {@code 4}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalBackendSetCount")
    private final Integer totalBackendSetCount;

    public Integer getTotalBackendSetCount() {
        return totalBackendSetCount;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("NetworkLoadBalancerHealth(");
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", warningStateBackendSetNames=")
                .append(String.valueOf(this.warningStateBackendSetNames));
        sb.append(", criticalStateBackendSetNames=")
                .append(String.valueOf(this.criticalStateBackendSetNames));
        sb.append(", unknownStateBackendSetNames=")
                .append(String.valueOf(this.unknownStateBackendSetNames));
        sb.append(", totalBackendSetCount=").append(String.valueOf(this.totalBackendSetCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NetworkLoadBalancerHealth)) {
            return false;
        }

        NetworkLoadBalancerHealth other = (NetworkLoadBalancerHealth) o;
        return java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(
                        this.warningStateBackendSetNames, other.warningStateBackendSetNames)
                && java.util.Objects.equals(
                        this.criticalStateBackendSetNames, other.criticalStateBackendSetNames)
                && java.util.Objects.equals(
                        this.unknownStateBackendSetNames, other.unknownStateBackendSetNames)
                && java.util.Objects.equals(this.totalBackendSetCount, other.totalBackendSetCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.warningStateBackendSetNames == null
                                ? 43
                                : this.warningStateBackendSetNames.hashCode());
        result =
                (result * PRIME)
                        + (this.criticalStateBackendSetNames == null
                                ? 43
                                : this.criticalStateBackendSetNames.hashCode());
        result =
                (result * PRIME)
                        + (this.unknownStateBackendSetNames == null
                                ? 43
                                : this.unknownStateBackendSetNames.hashCode());
        result =
                (result * PRIME)
                        + (this.totalBackendSetCount == null
                                ? 43
                                : this.totalBackendSetCount.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
