/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies configuration for load balancer traffic shift stages. The load balancer specified here
 * should be an Application load balancer type. Network load balancers are not supported. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LoadBalancerConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LoadBalancerConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"loadBalancerId", "listenerName", "backendPort"})
    public LoadBalancerConfig(String loadBalancerId, String listenerName, Integer backendPort) {
        super();
        this.loadBalancerId = loadBalancerId;
        this.listenerName = listenerName;
        this.backendPort = backendPort;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the load balancer. */
        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerId")
        private String loadBalancerId;

        /**
         * The OCID of the load balancer.
         *
         * @param loadBalancerId the value to set
         * @return this builder
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            this.__explicitlySet__.add("loadBalancerId");
            return this;
        }
        /** Name of the load balancer listener. */
        @com.fasterxml.jackson.annotation.JsonProperty("listenerName")
        private String listenerName;

        /**
         * Name of the load balancer listener.
         *
         * @param listenerName the value to set
         * @return this builder
         */
        public Builder listenerName(String listenerName) {
            this.listenerName = listenerName;
            this.__explicitlySet__.add("listenerName");
            return this;
        }
        /** Listen port for the backend server. */
        @com.fasterxml.jackson.annotation.JsonProperty("backendPort")
        private Integer backendPort;

        /**
         * Listen port for the backend server.
         *
         * @param backendPort the value to set
         * @return this builder
         */
        public Builder backendPort(Integer backendPort) {
            this.backendPort = backendPort;
            this.__explicitlySet__.add("backendPort");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LoadBalancerConfig build() {
            LoadBalancerConfig model =
                    new LoadBalancerConfig(
                            this.loadBalancerId, this.listenerName, this.backendPort);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoadBalancerConfig model) {
            if (model.wasPropertyExplicitlySet("loadBalancerId")) {
                this.loadBalancerId(model.getLoadBalancerId());
            }
            if (model.wasPropertyExplicitlySet("listenerName")) {
                this.listenerName(model.getListenerName());
            }
            if (model.wasPropertyExplicitlySet("backendPort")) {
                this.backendPort(model.getBackendPort());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The OCID of the load balancer. */
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerId")
    private final String loadBalancerId;

    /**
     * The OCID of the load balancer.
     *
     * @return the value
     */
    public String getLoadBalancerId() {
        return loadBalancerId;
    }

    /** Name of the load balancer listener. */
    @com.fasterxml.jackson.annotation.JsonProperty("listenerName")
    private final String listenerName;

    /**
     * Name of the load balancer listener.
     *
     * @return the value
     */
    public String getListenerName() {
        return listenerName;
    }

    /** Listen port for the backend server. */
    @com.fasterxml.jackson.annotation.JsonProperty("backendPort")
    private final Integer backendPort;

    /**
     * Listen port for the backend server.
     *
     * @return the value
     */
    public Integer getBackendPort() {
        return backendPort;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LoadBalancerConfig(");
        sb.append("super=").append(super.toString());
        sb.append("loadBalancerId=").append(String.valueOf(this.loadBalancerId));
        sb.append(", listenerName=").append(String.valueOf(this.listenerName));
        sb.append(", backendPort=").append(String.valueOf(this.backendPort));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoadBalancerConfig)) {
            return false;
        }

        LoadBalancerConfig other = (LoadBalancerConfig) o;
        return java.util.Objects.equals(this.loadBalancerId, other.loadBalancerId)
                && java.util.Objects.equals(this.listenerName, other.listenerName)
                && java.util.Objects.equals(this.backendPort, other.backendPort)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.loadBalancerId == null ? 43 : this.loadBalancerId.hashCode());
        result = (result * PRIME) + (this.listenerName == null ? 43 : this.listenerName.hashCode());
        result = (result * PRIME) + (this.backendPort == null ? 43 : this.backendPort.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
