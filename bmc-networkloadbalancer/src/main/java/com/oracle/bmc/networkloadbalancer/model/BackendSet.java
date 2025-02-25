/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.model;

/**
 * The configuration of a network load balancer backend set.
 * For more information about backend set configuration, see
 * [Backend Sets for Network Load Balancers](https://docs.oracle.com/iaas/Content/NetworkLoadBalancer/BackendSets/backend-set-management.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BackendSet.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BackendSet extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "policy",
        "isPreserveSource",
        "isFailOpen",
        "isInstantFailoverEnabled",
        "isInstantFailoverTcpResetEnabled",
        "areOperationallyActiveBackendsPreferred",
        "ipVersion",
        "backends",
        "healthChecker"
    })
    public BackendSet(
            String name,
            NetworkLoadBalancingPolicy policy,
            Boolean isPreserveSource,
            Boolean isFailOpen,
            Boolean isInstantFailoverEnabled,
            Boolean isInstantFailoverTcpResetEnabled,
            Boolean areOperationallyActiveBackendsPreferred,
            IpVersion ipVersion,
            java.util.List<Backend> backends,
            HealthChecker healthChecker) {
        super();
        this.name = name;
        this.policy = policy;
        this.isPreserveSource = isPreserveSource;
        this.isFailOpen = isFailOpen;
        this.isInstantFailoverEnabled = isInstantFailoverEnabled;
        this.isInstantFailoverTcpResetEnabled = isInstantFailoverTcpResetEnabled;
        this.areOperationallyActiveBackendsPreferred = areOperationallyActiveBackendsPreferred;
        this.ipVersion = ipVersion;
        this.backends = backends;
        this.healthChecker = healthChecker;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        private String name;

        /**
         * A user-friendly name for the backend set that must be unique and cannot be changed.
         * <p>
         * Valid backend set names include only alphanumeric characters, dashes, and underscores. Backend set names cannot
         * contain spaces. Avoid entering confidential information.
         * <p>
         * Example: {@code example_backend_set}
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The network load balancer policy for the backend set.
         * <p>
         * Example: {@code FIVE_TUPLE}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("policy")
        private NetworkLoadBalancingPolicy policy;

        /**
         * The network load balancer policy for the backend set.
         * <p>
         * Example: {@code FIVE_TUPLE}
         *
         * @param policy the value to set
         * @return this builder
         **/
        public Builder policy(NetworkLoadBalancingPolicy policy) {
            this.policy = policy;
            this.__explicitlySet__.add("policy");
            return this;
        }
        /**
         * If this parameter is enabled, then the network load balancer preserves the source IP of the packet when it is forwarded to backends.
         * Backends see the original source IP. If the isPreserveSourceDestination parameter is enabled for the network load balancer resource, then this parameter cannot be disabled.
         * The value is true by default.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPreserveSource")
        private Boolean isPreserveSource;

        /**
         * If this parameter is enabled, then the network load balancer preserves the source IP of the packet when it is forwarded to backends.
         * Backends see the original source IP. If the isPreserveSourceDestination parameter is enabled for the network load balancer resource, then this parameter cannot be disabled.
         * The value is true by default.
         *
         * @param isPreserveSource the value to set
         * @return this builder
         **/
        public Builder isPreserveSource(Boolean isPreserveSource) {
            this.isPreserveSource = isPreserveSource;
            this.__explicitlySet__.add("isPreserveSource");
            return this;
        }
        /**
         * If enabled, the network load balancer will continue to distribute traffic in the configured distribution in the event all backends are unhealthy.
         * The value is false by default.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isFailOpen")
        private Boolean isFailOpen;

        /**
         * If enabled, the network load balancer will continue to distribute traffic in the configured distribution in the event all backends are unhealthy.
         * The value is false by default.
         *
         * @param isFailOpen the value to set
         * @return this builder
         **/
        public Builder isFailOpen(Boolean isFailOpen) {
            this.isFailOpen = isFailOpen;
            this.__explicitlySet__.add("isFailOpen");
            return this;
        }
        /**
         * If enabled existing connections will be forwarded to an alternative healthy backend as soon as current backend becomes unhealthy.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isInstantFailoverEnabled")
        private Boolean isInstantFailoverEnabled;

        /**
         * If enabled existing connections will be forwarded to an alternative healthy backend as soon as current backend becomes unhealthy.
         *
         * @param isInstantFailoverEnabled the value to set
         * @return this builder
         **/
        public Builder isInstantFailoverEnabled(Boolean isInstantFailoverEnabled) {
            this.isInstantFailoverEnabled = isInstantFailoverEnabled;
            this.__explicitlySet__.add("isInstantFailoverEnabled");
            return this;
        }
        /**
         * If enabled along with instant failover, the network load balancer will send TCP RST to the clients for the existing connections instead of failing over to a healthy backend. This only applies when using the instant failover. By default, TCP RST is enabled.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isInstantFailoverTcpResetEnabled")
        private Boolean isInstantFailoverTcpResetEnabled;

        /**
         * If enabled along with instant failover, the network load balancer will send TCP RST to the clients for the existing connections instead of failing over to a healthy backend. This only applies when using the instant failover. By default, TCP RST is enabled.
         *
         * @param isInstantFailoverTcpResetEnabled the value to set
         * @return this builder
         **/
        public Builder isInstantFailoverTcpResetEnabled(Boolean isInstantFailoverTcpResetEnabled) {
            this.isInstantFailoverTcpResetEnabled = isInstantFailoverTcpResetEnabled;
            this.__explicitlySet__.add("isInstantFailoverTcpResetEnabled");
            return this;
        }
        /**
         * If enabled, NLB supports active-standby backends. The standby backend takes over the traffic when the active node fails, and continues to serve the traffic even when the old active node is back healthy.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("areOperationallyActiveBackendsPreferred")
        private Boolean areOperationallyActiveBackendsPreferred;

        /**
         * If enabled, NLB supports active-standby backends. The standby backend takes over the traffic when the active node fails, and continues to serve the traffic even when the old active node is back healthy.
         *
         * @param areOperationallyActiveBackendsPreferred the value to set
         * @return this builder
         **/
        public Builder areOperationallyActiveBackendsPreferred(
                Boolean areOperationallyActiveBackendsPreferred) {
            this.areOperationallyActiveBackendsPreferred = areOperationallyActiveBackendsPreferred;
            this.__explicitlySet__.add("areOperationallyActiveBackendsPreferred");
            return this;
        }
        /**
         * IP version associated with the backend set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipVersion")
        private IpVersion ipVersion;

        /**
         * IP version associated with the backend set.
         * @param ipVersion the value to set
         * @return this builder
         **/
        public Builder ipVersion(IpVersion ipVersion) {
            this.ipVersion = ipVersion;
            this.__explicitlySet__.add("ipVersion");
            return this;
        }
        /**
         * An array of backends.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backends")
        private java.util.List<Backend> backends;

        /**
         * An array of backends.
         *
         * @param backends the value to set
         * @return this builder
         **/
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

        public BackendSet build() {
            BackendSet model =
                    new BackendSet(
                            this.name,
                            this.policy,
                            this.isPreserveSource,
                            this.isFailOpen,
                            this.isInstantFailoverEnabled,
                            this.isInstantFailoverTcpResetEnabled,
                            this.areOperationallyActiveBackendsPreferred,
                            this.ipVersion,
                            this.backends,
                            this.healthChecker);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BackendSet model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("policy")) {
                this.policy(model.getPolicy());
            }
            if (model.wasPropertyExplicitlySet("isPreserveSource")) {
                this.isPreserveSource(model.getIsPreserveSource());
            }
            if (model.wasPropertyExplicitlySet("isFailOpen")) {
                this.isFailOpen(model.getIsFailOpen());
            }
            if (model.wasPropertyExplicitlySet("isInstantFailoverEnabled")) {
                this.isInstantFailoverEnabled(model.getIsInstantFailoverEnabled());
            }
            if (model.wasPropertyExplicitlySet("isInstantFailoverTcpResetEnabled")) {
                this.isInstantFailoverTcpResetEnabled(model.getIsInstantFailoverTcpResetEnabled());
            }
            if (model.wasPropertyExplicitlySet("areOperationallyActiveBackendsPreferred")) {
                this.areOperationallyActiveBackendsPreferred(
                        model.getAreOperationallyActiveBackendsPreferred());
            }
            if (model.wasPropertyExplicitlySet("ipVersion")) {
                this.ipVersion(model.getIpVersion());
            }
            if (model.wasPropertyExplicitlySet("backends")) {
                this.backends(model.getBackends());
            }
            if (model.wasPropertyExplicitlySet("healthChecker")) {
                this.healthChecker(model.getHealthChecker());
            }
            return this;
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
     * A user-friendly name for the backend set that must be unique and cannot be changed.
     * <p>
     * Valid backend set names include only alphanumeric characters, dashes, and underscores. Backend set names cannot
     * contain spaces. Avoid entering confidential information.
     * <p>
     * Example: {@code example_backend_set}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A user-friendly name for the backend set that must be unique and cannot be changed.
     * <p>
     * Valid backend set names include only alphanumeric characters, dashes, and underscores. Backend set names cannot
     * contain spaces. Avoid entering confidential information.
     * <p>
     * Example: {@code example_backend_set}
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The network load balancer policy for the backend set.
     * <p>
     * Example: {@code FIVE_TUPLE}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policy")
    private final NetworkLoadBalancingPolicy policy;

    /**
     * The network load balancer policy for the backend set.
     * <p>
     * Example: {@code FIVE_TUPLE}
     *
     * @return the value
     **/
    public NetworkLoadBalancingPolicy getPolicy() {
        return policy;
    }

    /**
     * If this parameter is enabled, then the network load balancer preserves the source IP of the packet when it is forwarded to backends.
     * Backends see the original source IP. If the isPreserveSourceDestination parameter is enabled for the network load balancer resource, then this parameter cannot be disabled.
     * The value is true by default.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPreserveSource")
    private final Boolean isPreserveSource;

    /**
     * If this parameter is enabled, then the network load balancer preserves the source IP of the packet when it is forwarded to backends.
     * Backends see the original source IP. If the isPreserveSourceDestination parameter is enabled for the network load balancer resource, then this parameter cannot be disabled.
     * The value is true by default.
     *
     * @return the value
     **/
    public Boolean getIsPreserveSource() {
        return isPreserveSource;
    }

    /**
     * If enabled, the network load balancer will continue to distribute traffic in the configured distribution in the event all backends are unhealthy.
     * The value is false by default.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFailOpen")
    private final Boolean isFailOpen;

    /**
     * If enabled, the network load balancer will continue to distribute traffic in the configured distribution in the event all backends are unhealthy.
     * The value is false by default.
     *
     * @return the value
     **/
    public Boolean getIsFailOpen() {
        return isFailOpen;
    }

    /**
     * If enabled existing connections will be forwarded to an alternative healthy backend as soon as current backend becomes unhealthy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isInstantFailoverEnabled")
    private final Boolean isInstantFailoverEnabled;

    /**
     * If enabled existing connections will be forwarded to an alternative healthy backend as soon as current backend becomes unhealthy.
     *
     * @return the value
     **/
    public Boolean getIsInstantFailoverEnabled() {
        return isInstantFailoverEnabled;
    }

    /**
     * If enabled along with instant failover, the network load balancer will send TCP RST to the clients for the existing connections instead of failing over to a healthy backend. This only applies when using the instant failover. By default, TCP RST is enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isInstantFailoverTcpResetEnabled")
    private final Boolean isInstantFailoverTcpResetEnabled;

    /**
     * If enabled along with instant failover, the network load balancer will send TCP RST to the clients for the existing connections instead of failing over to a healthy backend. This only applies when using the instant failover. By default, TCP RST is enabled.
     *
     * @return the value
     **/
    public Boolean getIsInstantFailoverTcpResetEnabled() {
        return isInstantFailoverTcpResetEnabled;
    }

    /**
     * If enabled, NLB supports active-standby backends. The standby backend takes over the traffic when the active node fails, and continues to serve the traffic even when the old active node is back healthy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areOperationallyActiveBackendsPreferred")
    private final Boolean areOperationallyActiveBackendsPreferred;

    /**
     * If enabled, NLB supports active-standby backends. The standby backend takes over the traffic when the active node fails, and continues to serve the traffic even when the old active node is back healthy.
     *
     * @return the value
     **/
    public Boolean getAreOperationallyActiveBackendsPreferred() {
        return areOperationallyActiveBackendsPreferred;
    }

    /**
     * IP version associated with the backend set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipVersion")
    private final IpVersion ipVersion;

    /**
     * IP version associated with the backend set.
     * @return the value
     **/
    public IpVersion getIpVersion() {
        return ipVersion;
    }

    /**
     * An array of backends.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backends")
    private final java.util.List<Backend> backends;

    /**
     * An array of backends.
     *
     * @return the value
     **/
    public java.util.List<Backend> getBackends() {
        return backends;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("healthChecker")
    private final HealthChecker healthChecker;

    public HealthChecker getHealthChecker() {
        return healthChecker;
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
        sb.append("BackendSet(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", policy=").append(String.valueOf(this.policy));
        sb.append(", isPreserveSource=").append(String.valueOf(this.isPreserveSource));
        sb.append(", isFailOpen=").append(String.valueOf(this.isFailOpen));
        sb.append(", isInstantFailoverEnabled=")
                .append(String.valueOf(this.isInstantFailoverEnabled));
        sb.append(", isInstantFailoverTcpResetEnabled=")
                .append(String.valueOf(this.isInstantFailoverTcpResetEnabled));
        sb.append(", areOperationallyActiveBackendsPreferred=")
                .append(String.valueOf(this.areOperationallyActiveBackendsPreferred));
        sb.append(", ipVersion=").append(String.valueOf(this.ipVersion));
        sb.append(", backends=").append(String.valueOf(this.backends));
        sb.append(", healthChecker=").append(String.valueOf(this.healthChecker));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BackendSet)) {
            return false;
        }

        BackendSet other = (BackendSet) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.policy, other.policy)
                && java.util.Objects.equals(this.isPreserveSource, other.isPreserveSource)
                && java.util.Objects.equals(this.isFailOpen, other.isFailOpen)
                && java.util.Objects.equals(
                        this.isInstantFailoverEnabled, other.isInstantFailoverEnabled)
                && java.util.Objects.equals(
                        this.isInstantFailoverTcpResetEnabled,
                        other.isInstantFailoverTcpResetEnabled)
                && java.util.Objects.equals(
                        this.areOperationallyActiveBackendsPreferred,
                        other.areOperationallyActiveBackendsPreferred)
                && java.util.Objects.equals(this.ipVersion, other.ipVersion)
                && java.util.Objects.equals(this.backends, other.backends)
                && java.util.Objects.equals(this.healthChecker, other.healthChecker)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.policy == null ? 43 : this.policy.hashCode());
        result =
                (result * PRIME)
                        + (this.isPreserveSource == null ? 43 : this.isPreserveSource.hashCode());
        result = (result * PRIME) + (this.isFailOpen == null ? 43 : this.isFailOpen.hashCode());
        result =
                (result * PRIME)
                        + (this.isInstantFailoverEnabled == null
                                ? 43
                                : this.isInstantFailoverEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isInstantFailoverTcpResetEnabled == null
                                ? 43
                                : this.isInstantFailoverTcpResetEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.areOperationallyActiveBackendsPreferred == null
                                ? 43
                                : this.areOperationallyActiveBackendsPreferred.hashCode());
        result = (result * PRIME) + (this.ipVersion == null ? 43 : this.ipVersion.hashCode());
        result = (result * PRIME) + (this.backends == null ? 43 : this.backends.hashCode());
        result =
                (result * PRIME)
                        + (this.healthChecker == null ? 43 : this.healthChecker.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
