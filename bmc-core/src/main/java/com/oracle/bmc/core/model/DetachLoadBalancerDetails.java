/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Represents a load balancer that is to be detached from an instance pool.
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
    builder = DetachLoadBalancerDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DetachLoadBalancerDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"loadBalancerId", "backendSetName"})
    public DetachLoadBalancerDetails(String loadBalancerId, String backendSetName) {
        super();
        this.loadBalancerId = loadBalancerId;
        this.backendSetName = backendSetName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the load balancer to detach from the instance pool.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerId")
        private String loadBalancerId;

        /**
         * The OCID of the load balancer to detach from the instance pool.
         * @param loadBalancerId the value to set
         * @return this builder
         **/
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            this.__explicitlySet__.add("loadBalancerId");
            return this;
        }
        /**
         * The name of the backend set on the load balancer to detach from the instance pool.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backendSetName")
        private String backendSetName;

        /**
         * The name of the backend set on the load balancer to detach from the instance pool.
         * @param backendSetName the value to set
         * @return this builder
         **/
        public Builder backendSetName(String backendSetName) {
            this.backendSetName = backendSetName;
            this.__explicitlySet__.add("backendSetName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetachLoadBalancerDetails build() {
            DetachLoadBalancerDetails __instance__ =
                    new DetachLoadBalancerDetails(loadBalancerId, backendSetName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetachLoadBalancerDetails o) {
            Builder copiedBuilder =
                    loadBalancerId(o.getLoadBalancerId()).backendSetName(o.getBackendSetName());

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
     * The OCID of the load balancer to detach from the instance pool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerId")
    private final String loadBalancerId;

    /**
     * The OCID of the load balancer to detach from the instance pool.
     * @return the value
     **/
    public String getLoadBalancerId() {
        return loadBalancerId;
    }

    /**
     * The name of the backend set on the load balancer to detach from the instance pool.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backendSetName")
    private final String backendSetName;

    /**
     * The name of the backend set on the load balancer to detach from the instance pool.
     * @return the value
     **/
    public String getBackendSetName() {
        return backendSetName;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DetachLoadBalancerDetails(");
        sb.append("loadBalancerId=").append(String.valueOf(this.loadBalancerId));
        sb.append(", backendSetName=").append(String.valueOf(this.backendSetName));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetachLoadBalancerDetails)) {
            return false;
        }

        DetachLoadBalancerDetails other = (DetachLoadBalancerDetails) o;
        return java.util.Objects.equals(this.loadBalancerId, other.loadBalancerId)
                && java.util.Objects.equals(this.backendSetName, other.backendSetName)
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
