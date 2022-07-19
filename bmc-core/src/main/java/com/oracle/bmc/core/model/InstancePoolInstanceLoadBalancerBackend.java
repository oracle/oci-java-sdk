/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InstancePoolInstanceLoadBalancerBackend.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InstancePoolInstanceLoadBalancerBackend {
    @Deprecated
    @java.beans.ConstructorProperties({
        "loadBalancerId",
        "backendSetName",
        "backendName",
        "backendHealthStatus"
    })
    public InstancePoolInstanceLoadBalancerBackend(
            String loadBalancerId,
            String backendSetName,
            String backendName,
            BackendHealthStatus backendHealthStatus) {
        super();
        this.loadBalancerId = loadBalancerId;
        this.backendSetName = backendSetName;
        this.backendName = backendName;
        this.backendHealthStatus = backendHealthStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the load balancer attached to the instance pool.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerId")
        private String loadBalancerId;

        /**
         * The OCID of the load balancer attached to the instance pool.
         * @param loadBalancerId the value to set
         * @return this builder
         **/
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            this.__explicitlySet__.add("loadBalancerId");
            return this;
        }
        /**
         * The name of the backend set on the load balancer.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backendSetName")
        private String backendSetName;

        /**
         * The name of the backend set on the load balancer.
         * @param backendSetName the value to set
         * @return this builder
         **/
        public Builder backendSetName(String backendSetName) {
            this.backendSetName = backendSetName;
            this.__explicitlySet__.add("backendSetName");
            return this;
        }
        /**
         * The name of the backend in the backend set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backendName")
        private String backendName;

        /**
         * The name of the backend in the backend set.
         * @param backendName the value to set
         * @return this builder
         **/
        public Builder backendName(String backendName) {
            this.backendName = backendName;
            this.__explicitlySet__.add("backendName");
            return this;
        }
        /**
         * The health of the backend as observed by the load balancer.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backendHealthStatus")
        private BackendHealthStatus backendHealthStatus;

        /**
         * The health of the backend as observed by the load balancer.
         * @param backendHealthStatus the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The OCID of the load balancer attached to the instance pool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerId")
    private final String loadBalancerId;

    /**
     * The OCID of the load balancer attached to the instance pool.
     * @return the value
     **/
    public String getLoadBalancerId() {
        return loadBalancerId;
    }

    /**
     * The name of the backend set on the load balancer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backendSetName")
    private final String backendSetName;

    /**
     * The name of the backend set on the load balancer.
     * @return the value
     **/
    public String getBackendSetName() {
        return backendSetName;
    }

    /**
     * The name of the backend in the backend set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backendName")
    private final String backendName;

    /**
     * The name of the backend in the backend set.
     * @return the value
     **/
    public String getBackendName() {
        return backendName;
    }

    /**
     * The health of the backend as observed by the load balancer.
     **/
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

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BackendHealthStatus.class);

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
    private final BackendHealthStatus backendHealthStatus;

    /**
     * The health of the backend as observed by the load balancer.
     * @return the value
     **/
    public BackendHealthStatus getBackendHealthStatus() {
        return backendHealthStatus;
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
        sb.append("InstancePoolInstanceLoadBalancerBackend(");
        sb.append("loadBalancerId=").append(String.valueOf(this.loadBalancerId));
        sb.append(", backendSetName=").append(String.valueOf(this.backendSetName));
        sb.append(", backendName=").append(String.valueOf(this.backendName));
        sb.append(", backendHealthStatus=").append(String.valueOf(this.backendHealthStatus));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstancePoolInstanceLoadBalancerBackend)) {
            return false;
        }

        InstancePoolInstanceLoadBalancerBackend other = (InstancePoolInstanceLoadBalancerBackend) o;
        return java.util.Objects.equals(this.loadBalancerId, other.loadBalancerId)
                && java.util.Objects.equals(this.backendSetName, other.backendSetName)
                && java.util.Objects.equals(this.backendName, other.backendName)
                && java.util.Objects.equals(this.backendHealthStatus, other.backendHealthStatus)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.loadBalancerId == null ? 43 : this.loadBalancerId.hashCode());
        result =
                (result * PRIME)
                        + (this.backendSetName == null ? 43 : this.backendSetName.hashCode());
        result = (result * PRIME) + (this.backendName == null ? 43 : this.backendName.hashCode());
        result =
                (result * PRIME)
                        + (this.backendHealthStatus == null
                                ? 43
                                : this.backendHealthStatus.hashCode());
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
