/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BackendSetSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BackendSetSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "policy",
        "isPreserveSource",
        "ipVersion",
        "backends",
        "healthChecker"
    })
    public BackendSetSummary(
            String name,
            NetworkLoadBalancingPolicy policy,
            Boolean isPreserveSource,
            IpVersion ipVersion,
            java.util.List<Backend> backends,
            HealthChecker healthChecker) {
        super();
        this.name = name;
        this.policy = policy;
        this.isPreserveSource = isPreserveSource;
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
         * If this parameter is enabled, the network load balancer preserves the source IP of the packet forwarded to the backend servers.
         * Backend servers see the original source IP. If the {@code isPreserveSourceDestination} parameter is enabled for the network load balancer resource, this parameter cannot be disabled.
         * The value is true by default.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPreserveSource")
        private Boolean isPreserveSource;

        /**
         * If this parameter is enabled, the network load balancer preserves the source IP of the packet forwarded to the backend servers.
         * Backend servers see the original source IP. If the {@code isPreserveSourceDestination} parameter is enabled for the network load balancer resource, this parameter cannot be disabled.
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

        public BackendSetSummary build() {
            BackendSetSummary model =
                    new BackendSetSummary(
                            this.name,
                            this.policy,
                            this.isPreserveSource,
                            this.ipVersion,
                            this.backends,
                            this.healthChecker);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BackendSetSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("policy")) {
                this.policy(model.getPolicy());
            }
            if (model.wasPropertyExplicitlySet("isPreserveSource")) {
                this.isPreserveSource(model.getIsPreserveSource());
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
     * If this parameter is enabled, the network load balancer preserves the source IP of the packet forwarded to the backend servers.
     * Backend servers see the original source IP. If the {@code isPreserveSourceDestination} parameter is enabled for the network load balancer resource, this parameter cannot be disabled.
     * The value is true by default.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPreserveSource")
    private final Boolean isPreserveSource;

    /**
     * If this parameter is enabled, the network load balancer preserves the source IP of the packet forwarded to the backend servers.
     * Backend servers see the original source IP. If the {@code isPreserveSourceDestination} parameter is enabled for the network load balancer resource, this parameter cannot be disabled.
     * The value is true by default.
     *
     * @return the value
     **/
    public Boolean getIsPreserveSource() {
        return isPreserveSource;
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
        sb.append("BackendSetSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", policy=").append(String.valueOf(this.policy));
        sb.append(", isPreserveSource=").append(String.valueOf(this.isPreserveSource));
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
        if (!(o instanceof BackendSetSummary)) {
            return false;
        }

        BackendSetSummary other = (BackendSetSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.policy, other.policy)
                && java.util.Objects.equals(this.isPreserveSource, other.isPreserveSource)
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
        result = (result * PRIME) + (this.ipVersion == null ? 43 : this.ipVersion.hashCode());
        result = (result * PRIME) + (this.backends == null ? 43 : this.backends.hashCode());
        result =
                (result * PRIME)
                        + (this.healthChecker == null ? 43 : this.healthChecker.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
