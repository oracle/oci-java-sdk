/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.model;

/**
 * The configuration of the listener. For more information about backend set configuration, see
 * [Managing Load Balancer
 * Listeners](https://docs.cloud.oracle.com/Content/Balance/Tasks/managinglisteners.htm). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ListenerSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ListenerSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "defaultBackendSetName",
        "port",
        "protocol",
        "ipVersion"
    })
    public ListenerSummary(
            String name,
            String defaultBackendSetName,
            Integer port,
            ListenerProtocols protocol,
            IpVersion ipVersion) {
        super();
        this.name = name;
        this.defaultBackendSetName = defaultBackendSetName;
        this.port = port;
        this.protocol = protocol;
        this.ipVersion = ipVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A friendly name for the listener. It must be unique and it cannot be changed.
         *
         * <p>Example: {@code example_listener}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A friendly name for the listener. It must be unique and it cannot be changed.
         *
         * <p>Example: {@code example_listener}
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
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
         * The protocol on which the listener accepts connection requests. For public network load
         * balancers, ANY protocol refers to TCP/UDP. For private network load balancers, ANY
         * protocol refers to TCP/UDP/ICMP (note that ICMP requires isPreserveSourceDestination to
         * be set to true). To get a list of valid protocols, use the {@link
         * #listNetworkLoadBalancersProtocols(ListNetworkLoadBalancersProtocolsRequest)
         * listNetworkLoadBalancersProtocols} operation.
         *
         * <p>Example: {@code TCP}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private ListenerProtocols protocol;

        /**
         * The protocol on which the listener accepts connection requests. For public network load
         * balancers, ANY protocol refers to TCP/UDP. For private network load balancers, ANY
         * protocol refers to TCP/UDP/ICMP (note that ICMP requires isPreserveSourceDestination to
         * be set to true). To get a list of valid protocols, use the {@link
         * #listNetworkLoadBalancersProtocols(ListNetworkLoadBalancersProtocolsRequest)
         * listNetworkLoadBalancersProtocols} operation.
         *
         * <p>Example: {@code TCP}
         *
         * @param protocol the value to set
         * @return this builder
         */
        public Builder protocol(ListenerProtocols protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }
        /** IP version associated with the listener. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipVersion")
        private IpVersion ipVersion;

        /**
         * IP version associated with the listener.
         *
         * @param ipVersion the value to set
         * @return this builder
         */
        public Builder ipVersion(IpVersion ipVersion) {
            this.ipVersion = ipVersion;
            this.__explicitlySet__.add("ipVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ListenerSummary build() {
            ListenerSummary model =
                    new ListenerSummary(
                            this.name,
                            this.defaultBackendSetName,
                            this.port,
                            this.protocol,
                            this.ipVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ListenerSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("defaultBackendSetName")) {
                this.defaultBackendSetName(model.getDefaultBackendSetName());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("protocol")) {
                this.protocol(model.getProtocol());
            }
            if (model.wasPropertyExplicitlySet("ipVersion")) {
                this.ipVersion(model.getIpVersion());
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
     * A friendly name for the listener. It must be unique and it cannot be changed.
     *
     * <p>Example: {@code example_listener}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A friendly name for the listener. It must be unique and it cannot be changed.
     *
     * <p>Example: {@code example_listener}
     *
     * @return the value
     */
    public String getName() {
        return name;
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
     * The protocol on which the listener accepts connection requests. For public network load
     * balancers, ANY protocol refers to TCP/UDP. For private network load balancers, ANY protocol
     * refers to TCP/UDP/ICMP (note that ICMP requires isPreserveSourceDestination to be set to
     * true). To get a list of valid protocols, use the {@link
     * #listNetworkLoadBalancersProtocols(ListNetworkLoadBalancersProtocolsRequest)
     * listNetworkLoadBalancersProtocols} operation.
     *
     * <p>Example: {@code TCP}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final ListenerProtocols protocol;

    /**
     * The protocol on which the listener accepts connection requests. For public network load
     * balancers, ANY protocol refers to TCP/UDP. For private network load balancers, ANY protocol
     * refers to TCP/UDP/ICMP (note that ICMP requires isPreserveSourceDestination to be set to
     * true). To get a list of valid protocols, use the {@link
     * #listNetworkLoadBalancersProtocols(ListNetworkLoadBalancersProtocolsRequest)
     * listNetworkLoadBalancersProtocols} operation.
     *
     * <p>Example: {@code TCP}
     *
     * @return the value
     */
    public ListenerProtocols getProtocol() {
        return protocol;
    }

    /** IP version associated with the listener. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipVersion")
    private final IpVersion ipVersion;

    /**
     * IP version associated with the listener.
     *
     * @return the value
     */
    public IpVersion getIpVersion() {
        return ipVersion;
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
        sb.append("ListenerSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", defaultBackendSetName=").append(String.valueOf(this.defaultBackendSetName));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", protocol=").append(String.valueOf(this.protocol));
        sb.append(", ipVersion=").append(String.valueOf(this.ipVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListenerSummary)) {
            return false;
        }

        ListenerSummary other = (ListenerSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.defaultBackendSetName, other.defaultBackendSetName)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.ipVersion, other.ipVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultBackendSetName == null
                                ? 43
                                : this.defaultBackendSetName.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result = (result * PRIME) + (this.ipVersion == null ? 43 : this.ipVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
