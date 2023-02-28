/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The configuration details for updating a listener. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateListenerDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateListenerDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "defaultBackendSetName",
        "port",
        "protocol",
        "hostnameNames",
        "pathRouteSetName",
        "routingPolicyName",
        "sslConfiguration",
        "connectionConfiguration",
        "ruleSetNames"
    })
    public UpdateListenerDetails(
            String defaultBackendSetName,
            Integer port,
            String protocol,
            java.util.List<String> hostnameNames,
            String pathRouteSetName,
            String routingPolicyName,
            SSLConfigurationDetails sslConfiguration,
            ConnectionConfiguration connectionConfiguration,
            java.util.List<String> ruleSetNames) {
        super();
        this.defaultBackendSetName = defaultBackendSetName;
        this.port = port;
        this.protocol = protocol;
        this.hostnameNames = hostnameNames;
        this.pathRouteSetName = pathRouteSetName;
        this.routingPolicyName = routingPolicyName;
        this.sslConfiguration = sslConfiguration;
        this.connectionConfiguration = connectionConfiguration;
        this.ruleSetNames = ruleSetNames;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the associated backend set.
         *
         * <p>Example: {@code example_backend_set}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultBackendSetName")
        private String defaultBackendSetName;

        /**
         * The name of the associated backend set.
         *
         * <p>Example: {@code example_backend_set}
         *
         * @param defaultBackendSetName the value to set
         * @return this builder
         */
        public Builder defaultBackendSetName(String defaultBackendSetName) {
            this.defaultBackendSetName = defaultBackendSetName;
            this.__explicitlySet__.add("defaultBackendSetName");
            return this;
        }
        /**
         * The communication port for the listener.
         *
         * <p>Example: {@code 80}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The communication port for the listener.
         *
         * <p>Example: {@code 80}
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /**
         * The protocol on which the listener accepts connection requests. To get a list of valid
         * protocols, use the {@link #listProtocols(ListProtocolsRequest) listProtocols} operation.
         *
         * <p>Example: {@code HTTP}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private String protocol;

        /**
         * The protocol on which the listener accepts connection requests. To get a list of valid
         * protocols, use the {@link #listProtocols(ListProtocolsRequest) listProtocols} operation.
         *
         * <p>Example: {@code HTTP}
         *
         * @param protocol the value to set
         * @return this builder
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }
        /** An array of hostname resource names. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostnameNames")
        private java.util.List<String> hostnameNames;

        /**
         * An array of hostname resource names.
         *
         * @param hostnameNames the value to set
         * @return this builder
         */
        public Builder hostnameNames(java.util.List<String> hostnameNames) {
            this.hostnameNames = hostnameNames;
            this.__explicitlySet__.add("hostnameNames");
            return this;
        }
        /**
         * Deprecated. Please use {@code routingPolicies} instead.
         *
         * <p>The name of the set of path-based routing rules, {@link PathRouteSet}, applied to this
         * listener's traffic.
         *
         * <p>Example: {@code example_path_route_set}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("pathRouteSetName")
        private String pathRouteSetName;

        /**
         * Deprecated. Please use {@code routingPolicies} instead.
         *
         * <p>The name of the set of path-based routing rules, {@link PathRouteSet}, applied to this
         * listener's traffic.
         *
         * <p>Example: {@code example_path_route_set}
         *
         * @param pathRouteSetName the value to set
         * @return this builder
         */
        public Builder pathRouteSetName(String pathRouteSetName) {
            this.pathRouteSetName = pathRouteSetName;
            this.__explicitlySet__.add("pathRouteSetName");
            return this;
        }
        /**
         * The name of the routing policy applied to this listener's traffic.
         *
         * <p>Example: {@code example_routing_policy}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("routingPolicyName")
        private String routingPolicyName;

        /**
         * The name of the routing policy applied to this listener's traffic.
         *
         * <p>Example: {@code example_routing_policy}
         *
         * @param routingPolicyName the value to set
         * @return this builder
         */
        public Builder routingPolicyName(String routingPolicyName) {
            this.routingPolicyName = routingPolicyName;
            this.__explicitlySet__.add("routingPolicyName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sslConfiguration")
        private SSLConfigurationDetails sslConfiguration;

        public Builder sslConfiguration(SSLConfigurationDetails sslConfiguration) {
            this.sslConfiguration = sslConfiguration;
            this.__explicitlySet__.add("sslConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionConfiguration")
        private ConnectionConfiguration connectionConfiguration;

        public Builder connectionConfiguration(ConnectionConfiguration connectionConfiguration) {
            this.connectionConfiguration = connectionConfiguration;
            this.__explicitlySet__.add("connectionConfiguration");
            return this;
        }
        /**
         * The names of the {@link RuleSet} to apply to the listener.
         *
         * <p>Example: ["example_rule_set"]
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ruleSetNames")
        private java.util.List<String> ruleSetNames;

        /**
         * The names of the {@link RuleSet} to apply to the listener.
         *
         * <p>Example: ["example_rule_set"]
         *
         * @param ruleSetNames the value to set
         * @return this builder
         */
        public Builder ruleSetNames(java.util.List<String> ruleSetNames) {
            this.ruleSetNames = ruleSetNames;
            this.__explicitlySet__.add("ruleSetNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateListenerDetails build() {
            UpdateListenerDetails model =
                    new UpdateListenerDetails(
                            this.defaultBackendSetName,
                            this.port,
                            this.protocol,
                            this.hostnameNames,
                            this.pathRouteSetName,
                            this.routingPolicyName,
                            this.sslConfiguration,
                            this.connectionConfiguration,
                            this.ruleSetNames);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateListenerDetails model) {
            if (model.wasPropertyExplicitlySet("defaultBackendSetName")) {
                this.defaultBackendSetName(model.getDefaultBackendSetName());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("protocol")) {
                this.protocol(model.getProtocol());
            }
            if (model.wasPropertyExplicitlySet("hostnameNames")) {
                this.hostnameNames(model.getHostnameNames());
            }
            if (model.wasPropertyExplicitlySet("pathRouteSetName")) {
                this.pathRouteSetName(model.getPathRouteSetName());
            }
            if (model.wasPropertyExplicitlySet("routingPolicyName")) {
                this.routingPolicyName(model.getRoutingPolicyName());
            }
            if (model.wasPropertyExplicitlySet("sslConfiguration")) {
                this.sslConfiguration(model.getSslConfiguration());
            }
            if (model.wasPropertyExplicitlySet("connectionConfiguration")) {
                this.connectionConfiguration(model.getConnectionConfiguration());
            }
            if (model.wasPropertyExplicitlySet("ruleSetNames")) {
                this.ruleSetNames(model.getRuleSetNames());
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
     * The name of the associated backend set.
     *
     * <p>Example: {@code example_backend_set}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultBackendSetName")
    private final String defaultBackendSetName;

    /**
     * The name of the associated backend set.
     *
     * <p>Example: {@code example_backend_set}
     *
     * @return the value
     */
    public String getDefaultBackendSetName() {
        return defaultBackendSetName;
    }

    /**
     * The communication port for the listener.
     *
     * <p>Example: {@code 80}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The communication port for the listener.
     *
     * <p>Example: {@code 80}
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
    }

    /**
     * The protocol on which the listener accepts connection requests. To get a list of valid
     * protocols, use the {@link #listProtocols(ListProtocolsRequest) listProtocols} operation.
     *
     * <p>Example: {@code HTTP}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final String protocol;

    /**
     * The protocol on which the listener accepts connection requests. To get a list of valid
     * protocols, use the {@link #listProtocols(ListProtocolsRequest) listProtocols} operation.
     *
     * <p>Example: {@code HTTP}
     *
     * @return the value
     */
    public String getProtocol() {
        return protocol;
    }

    /** An array of hostname resource names. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostnameNames")
    private final java.util.List<String> hostnameNames;

    /**
     * An array of hostname resource names.
     *
     * @return the value
     */
    public java.util.List<String> getHostnameNames() {
        return hostnameNames;
    }

    /**
     * Deprecated. Please use {@code routingPolicies} instead.
     *
     * <p>The name of the set of path-based routing rules, {@link PathRouteSet}, applied to this
     * listener's traffic.
     *
     * <p>Example: {@code example_path_route_set}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pathRouteSetName")
    private final String pathRouteSetName;

    /**
     * Deprecated. Please use {@code routingPolicies} instead.
     *
     * <p>The name of the set of path-based routing rules, {@link PathRouteSet}, applied to this
     * listener's traffic.
     *
     * <p>Example: {@code example_path_route_set}
     *
     * @return the value
     */
    public String getPathRouteSetName() {
        return pathRouteSetName;
    }

    /**
     * The name of the routing policy applied to this listener's traffic.
     *
     * <p>Example: {@code example_routing_policy}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("routingPolicyName")
    private final String routingPolicyName;

    /**
     * The name of the routing policy applied to this listener's traffic.
     *
     * <p>Example: {@code example_routing_policy}
     *
     * @return the value
     */
    public String getRoutingPolicyName() {
        return routingPolicyName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sslConfiguration")
    private final SSLConfigurationDetails sslConfiguration;

    public SSLConfigurationDetails getSslConfiguration() {
        return sslConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectionConfiguration")
    private final ConnectionConfiguration connectionConfiguration;

    public ConnectionConfiguration getConnectionConfiguration() {
        return connectionConfiguration;
    }

    /**
     * The names of the {@link RuleSet} to apply to the listener.
     *
     * <p>Example: ["example_rule_set"]
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ruleSetNames")
    private final java.util.List<String> ruleSetNames;

    /**
     * The names of the {@link RuleSet} to apply to the listener.
     *
     * <p>Example: ["example_rule_set"]
     *
     * @return the value
     */
    public java.util.List<String> getRuleSetNames() {
        return ruleSetNames;
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
        sb.append("UpdateListenerDetails(");
        sb.append("super=").append(super.toString());
        sb.append("defaultBackendSetName=").append(String.valueOf(this.defaultBackendSetName));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", protocol=").append(String.valueOf(this.protocol));
        sb.append(", hostnameNames=").append(String.valueOf(this.hostnameNames));
        sb.append(", pathRouteSetName=").append(String.valueOf(this.pathRouteSetName));
        sb.append(", routingPolicyName=").append(String.valueOf(this.routingPolicyName));
        sb.append(", sslConfiguration=").append(String.valueOf(this.sslConfiguration));
        sb.append(", connectionConfiguration=")
                .append(String.valueOf(this.connectionConfiguration));
        sb.append(", ruleSetNames=").append(String.valueOf(this.ruleSetNames));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateListenerDetails)) {
            return false;
        }

        UpdateListenerDetails other = (UpdateListenerDetails) o;
        return java.util.Objects.equals(this.defaultBackendSetName, other.defaultBackendSetName)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.hostnameNames, other.hostnameNames)
                && java.util.Objects.equals(this.pathRouteSetName, other.pathRouteSetName)
                && java.util.Objects.equals(this.routingPolicyName, other.routingPolicyName)
                && java.util.Objects.equals(this.sslConfiguration, other.sslConfiguration)
                && java.util.Objects.equals(
                        this.connectionConfiguration, other.connectionConfiguration)
                && java.util.Objects.equals(this.ruleSetNames, other.ruleSetNames)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.defaultBackendSetName == null
                                ? 43
                                : this.defaultBackendSetName.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result =
                (result * PRIME)
                        + (this.hostnameNames == null ? 43 : this.hostnameNames.hashCode());
        result =
                (result * PRIME)
                        + (this.pathRouteSetName == null ? 43 : this.pathRouteSetName.hashCode());
        result =
                (result * PRIME)
                        + (this.routingPolicyName == null ? 43 : this.routingPolicyName.hashCode());
        result =
                (result * PRIME)
                        + (this.sslConfiguration == null ? 43 : this.sslConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionConfiguration == null
                                ? 43
                                : this.connectionConfiguration.hashCode());
        result = (result * PRIME) + (this.ruleSetNames == null ? 43 : this.ruleSetNames.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
