/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Represents the load balancer Backend that is configured for an instance pool instance. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstancePoolInstanceLoadBalancerBackend.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstancePoolInstanceLoadBalancerBackend
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** The OCID of the load balancer attached to the instance pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerId")
        private String loadBalancerId;

        /**
         * The OCID of the load balancer attached to the instance pool.
         *
         * @param loadBalancerId the value to set
         * @return this builder
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            this.__explicitlySet__.add("loadBalancerId");
            return this;
        }
        /** The name of the backend set on the load balancer. */
        @com.fasterxml.jackson.annotation.JsonProperty("backendSetName")
        private String backendSetName;

        /**
         * The name of the backend set on the load balancer.
         *
         * @param backendSetName the value to set
         * @return this builder
         */
        public Builder backendSetName(String backendSetName) {
            this.backendSetName = backendSetName;
            this.__explicitlySet__.add("backendSetName");
            return this;
        }
        /** The name of the backend in the backend set. */
        @com.fasterxml.jackson.annotation.JsonProperty("backendName")
        private String backendName;

        /**
         * The name of the backend in the backend set.
         *
         * @param backendName the value to set
         * @return this builder
         */
        public Builder backendName(String backendName) {
            this.backendName = backendName;
            this.__explicitlySet__.add("backendName");
            return this;
        }
        /** The health of the backend as observed by the load balancer. */
        @com.fasterxml.jackson.annotation.JsonProperty("backendHealthStatus")
        private BackendHealthStatus backendHealthStatus;

        /**
         * The health of the backend as observed by the load balancer.
         *
         * @param backendHealthStatus the value to set
         * @return this builder
         */
        public Builder backendHealthStatus(BackendHealthStatus backendHealthStatus) {
            this.backendHealthStatus = backendHealthStatus;
            this.__explicitlySet__.add("backendHealthStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstancePoolInstanceLoadBalancerBackend build() {
            InstancePoolInstanceLoadBalancerBackend model =
                    new InstancePoolInstanceLoadBalancerBackend(
                            this.loadBalancerId,
                            this.backendSetName,
                            this.backendName,
                            this.backendHealthStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstancePoolInstanceLoadBalancerBackend model) {
            if (model.wasPropertyExplicitlySet("loadBalancerId")) {
                this.loadBalancerId(model.getLoadBalancerId());
            }
            if (model.wasPropertyExplicitlySet("backendSetName")) {
                this.backendSetName(model.getBackendSetName());
            }
            if (model.wasPropertyExplicitlySet("backendName")) {
                this.backendName(model.getBackendName());
            }
            if (model.wasPropertyExplicitlySet("backendHealthStatus")) {
                this.backendHealthStatus(model.getBackendHealthStatus());
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

    /** The OCID of the load balancer attached to the instance pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerId")
    private final String loadBalancerId;

    /**
     * The OCID of the load balancer attached to the instance pool.
     *
     * @return the value
     */
    public String getLoadBalancerId() {
        return loadBalancerId;
    }

    /** The name of the backend set on the load balancer. */
    @com.fasterxml.jackson.annotation.JsonProperty("backendSetName")
    private final String backendSetName;

    /**
     * The name of the backend set on the load balancer.
     *
     * @return the value
     */
    public String getBackendSetName() {
        return backendSetName;
    }

    /** The name of the backend in the backend set. */
    @com.fasterxml.jackson.annotation.JsonProperty("backendName")
    private final String backendName;

    /**
     * The name of the backend in the backend set.
     *
     * @return the value
     */
    public String getBackendName() {
        return backendName;
    }

    /** The health of the backend as observed by the load balancer. */
    public enum BackendHealthStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Ok("OK"),
        Warning("WARNING"),
        Critical("CRITICAL"),
        Unknown("UNKNOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** The health of the backend as observed by the load balancer. */
    @com.fasterxml.jackson.annotation.JsonProperty("backendHealthStatus")
    private final BackendHealthStatus backendHealthStatus;

    /**
     * The health of the backend as observed by the load balancer.
     *
     * @return the value
     */
    public BackendHealthStatus getBackendHealthStatus() {
        return backendHealthStatus;
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
        sb.append("InstancePoolInstanceLoadBalancerBackend(");
        sb.append("super=").append(super.toString());
        sb.append("loadBalancerId=").append(String.valueOf(this.loadBalancerId));
        sb.append(", backendSetName=").append(String.valueOf(this.backendSetName));
        sb.append(", backendName=").append(String.valueOf(this.backendName));
        sb.append(", backendHealthStatus=").append(String.valueOf(this.backendHealthStatus));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
