/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * This config is used to choose the load balancer service and bandwidth for OpenSearch and
 * OpenDashboard load balancers. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LoadBalancerConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LoadBalancerConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "loadBalancerServiceType",
        "loadBalancerMinBandwidthInMbps",
        "loadBalancerMaxBandwidthInMbps"
    })
    public LoadBalancerConfig(
            LoadBalancerServiceType loadBalancerServiceType,
            Integer loadBalancerMinBandwidthInMbps,
            Integer loadBalancerMaxBandwidthInMbps) {
        super();
        this.loadBalancerServiceType = loadBalancerServiceType;
        this.loadBalancerMinBandwidthInMbps = loadBalancerMinBandwidthInMbps;
        this.loadBalancerMaxBandwidthInMbps = loadBalancerMaxBandwidthInMbps;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Load balancer service for OpenSearch and OpenDashboard load balancer. Default value is
         * LOAD_BALANCER.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerServiceType")
        private LoadBalancerServiceType loadBalancerServiceType;

        /**
         * Load balancer service for OpenSearch and OpenDashboard load balancer. Default value is
         * LOAD_BALANCER.
         *
         * @param loadBalancerServiceType the value to set
         * @return this builder
         */
        public Builder loadBalancerServiceType(LoadBalancerServiceType loadBalancerServiceType) {
            this.loadBalancerServiceType = loadBalancerServiceType;
            this.__explicitlySet__.add("loadBalancerServiceType");
            return this;
        }
        /**
         * Minimum bandwidth (Mbps) of OpenSearch load balancer. Not applicable for network load
         * balancer service.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerMinBandwidthInMbps")
        private Integer loadBalancerMinBandwidthInMbps;

        /**
         * Minimum bandwidth (Mbps) of OpenSearch load balancer. Not applicable for network load
         * balancer service.
         *
         * @param loadBalancerMinBandwidthInMbps the value to set
         * @return this builder
         */
        public Builder loadBalancerMinBandwidthInMbps(Integer loadBalancerMinBandwidthInMbps) {
            this.loadBalancerMinBandwidthInMbps = loadBalancerMinBandwidthInMbps;
            this.__explicitlySet__.add("loadBalancerMinBandwidthInMbps");
            return this;
        }
        /**
         * Maximum bandwidth (Mbps) of OpenSearch load balancer. Not applicable for network load
         * balancer service.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerMaxBandwidthInMbps")
        private Integer loadBalancerMaxBandwidthInMbps;

        /**
         * Maximum bandwidth (Mbps) of OpenSearch load balancer. Not applicable for network load
         * balancer service.
         *
         * @param loadBalancerMaxBandwidthInMbps the value to set
         * @return this builder
         */
        public Builder loadBalancerMaxBandwidthInMbps(Integer loadBalancerMaxBandwidthInMbps) {
            this.loadBalancerMaxBandwidthInMbps = loadBalancerMaxBandwidthInMbps;
            this.__explicitlySet__.add("loadBalancerMaxBandwidthInMbps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LoadBalancerConfig build() {
            LoadBalancerConfig model =
                    new LoadBalancerConfig(
                            this.loadBalancerServiceType,
                            this.loadBalancerMinBandwidthInMbps,
                            this.loadBalancerMaxBandwidthInMbps);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoadBalancerConfig model) {
            if (model.wasPropertyExplicitlySet("loadBalancerServiceType")) {
                this.loadBalancerServiceType(model.getLoadBalancerServiceType());
            }
            if (model.wasPropertyExplicitlySet("loadBalancerMinBandwidthInMbps")) {
                this.loadBalancerMinBandwidthInMbps(model.getLoadBalancerMinBandwidthInMbps());
            }
            if (model.wasPropertyExplicitlySet("loadBalancerMaxBandwidthInMbps")) {
                this.loadBalancerMaxBandwidthInMbps(model.getLoadBalancerMaxBandwidthInMbps());
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

    /**
     * Load balancer service for OpenSearch and OpenDashboard load balancer. Default value is
     * LOAD_BALANCER.
     */
    public enum LoadBalancerServiceType implements com.oracle.bmc.http.internal.BmcEnum {
        LoadBalancer("LOAD_BALANCER"),
        NetworkLoadBalancer("NETWORK_LOAD_BALANCER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LoadBalancerServiceType.class);

        private final String value;
        private static java.util.Map<String, LoadBalancerServiceType> map;

        static {
            map = new java.util.HashMap<>();
            for (LoadBalancerServiceType v : LoadBalancerServiceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LoadBalancerServiceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LoadBalancerServiceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LoadBalancerServiceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Load balancer service for OpenSearch and OpenDashboard load balancer. Default value is
     * LOAD_BALANCER.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerServiceType")
    private final LoadBalancerServiceType loadBalancerServiceType;

    /**
     * Load balancer service for OpenSearch and OpenDashboard load balancer. Default value is
     * LOAD_BALANCER.
     *
     * @return the value
     */
    public LoadBalancerServiceType getLoadBalancerServiceType() {
        return loadBalancerServiceType;
    }

    /**
     * Minimum bandwidth (Mbps) of OpenSearch load balancer. Not applicable for network load
     * balancer service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerMinBandwidthInMbps")
    private final Integer loadBalancerMinBandwidthInMbps;

    /**
     * Minimum bandwidth (Mbps) of OpenSearch load balancer. Not applicable for network load
     * balancer service.
     *
     * @return the value
     */
    public Integer getLoadBalancerMinBandwidthInMbps() {
        return loadBalancerMinBandwidthInMbps;
    }

    /**
     * Maximum bandwidth (Mbps) of OpenSearch load balancer. Not applicable for network load
     * balancer service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerMaxBandwidthInMbps")
    private final Integer loadBalancerMaxBandwidthInMbps;

    /**
     * Maximum bandwidth (Mbps) of OpenSearch load balancer. Not applicable for network load
     * balancer service.
     *
     * @return the value
     */
    public Integer getLoadBalancerMaxBandwidthInMbps() {
        return loadBalancerMaxBandwidthInMbps;
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
        sb.append("loadBalancerServiceType=").append(String.valueOf(this.loadBalancerServiceType));
        sb.append(", loadBalancerMinBandwidthInMbps=")
                .append(String.valueOf(this.loadBalancerMinBandwidthInMbps));
        sb.append(", loadBalancerMaxBandwidthInMbps=")
                .append(String.valueOf(this.loadBalancerMaxBandwidthInMbps));
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
        return java.util.Objects.equals(this.loadBalancerServiceType, other.loadBalancerServiceType)
                && java.util.Objects.equals(
                        this.loadBalancerMinBandwidthInMbps, other.loadBalancerMinBandwidthInMbps)
                && java.util.Objects.equals(
                        this.loadBalancerMaxBandwidthInMbps, other.loadBalancerMaxBandwidthInMbps)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.loadBalancerServiceType == null
                                ? 43
                                : this.loadBalancerServiceType.hashCode());
        result =
                (result * PRIME)
                        + (this.loadBalancerMinBandwidthInMbps == null
                                ? 43
                                : this.loadBalancerMinBandwidthInMbps.hashCode());
        result =
                (result * PRIME)
                        + (this.loadBalancerMaxBandwidthInMbps == null
                                ? 43
                                : this.loadBalancerMaxBandwidthInMbps.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
