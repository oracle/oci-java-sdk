/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The configuration of a backend server that is a member of a load balancer backend set. For more
 * information, see [Managing Backend
 * Servers](https://docs.oracle.com/iaas/Content/Balance/Tasks/managingbackendservers.htm). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Backend.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Backend extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "ipAddress",
        "port",
        "weight",
        "maxConnections",
        "drain",
        "backup",
        "offline"
    })
    public Backend(
            String name,
            String ipAddress,
            Integer port,
            Integer weight,
            Integer maxConnections,
            Boolean drain,
            Boolean backup,
            Boolean offline) {
        super();
        this.name = name;
        this.ipAddress = ipAddress;
        this.port = port;
        this.weight = weight;
        this.maxConnections = maxConnections;
        this.drain = drain;
        this.backup = backup;
        this.offline = offline;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A read-only field showing the IP address and port that uniquely identify this backend
         * server in the backend set.
         *
         * <p>Example: {@code 10.0.0.3:8080}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A read-only field showing the IP address and port that uniquely identify this backend
         * server in the backend set.
         *
         * <p>Example: {@code 10.0.0.3:8080}
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
         * The IP address of the backend server.
         *
         * <p>Example: {@code 10.0.0.3}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * The IP address of the backend server.
         *
         * <p>Example: {@code 10.0.0.3}
         *
         * @param ipAddress the value to set
         * @return this builder
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /**
         * The communication port for the backend server.
         *
         * <p>Example: {@code 8080}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The communication port for the backend server.
         *
         * <p>Example: {@code 8080}
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
         * The load balancing policy weight assigned to the server. Backend servers with a higher
         * weight receive a larger proportion of incoming traffic. For example, a server weighted
         * '3' receives 3 times the number of new connections as a server weighted '1'. For more
         * information on load balancing policies, see [How Load Balancing Policies
         * Work](https://docs.oracle.com/iaas/Content/Balance/Reference/lbpolicies.htm).
         *
         * <p>Example: {@code 3}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("weight")
        private Integer weight;

        /**
         * The load balancing policy weight assigned to the server. Backend servers with a higher
         * weight receive a larger proportion of incoming traffic. For example, a server weighted
         * '3' receives 3 times the number of new connections as a server weighted '1'. For more
         * information on load balancing policies, see [How Load Balancing Policies
         * Work](https://docs.oracle.com/iaas/Content/Balance/Reference/lbpolicies.htm).
         *
         * <p>Example: {@code 3}
         *
         * @param weight the value to set
         * @return this builder
         */
        public Builder weight(Integer weight) {
            this.weight = weight;
            this.__explicitlySet__.add("weight");
            return this;
        }
        /**
         * The maximum number of simultaneous connections the load balancer can make to the backend.
         * If this is not set or set to 0 then the maximum number of simultaneous connections the
         * load balancer can make to the backend is unlimited.
         *
         * <p>Example: {@code 300}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxConnections")
        private Integer maxConnections;

        /**
         * The maximum number of simultaneous connections the load balancer can make to the backend.
         * If this is not set or set to 0 then the maximum number of simultaneous connections the
         * load balancer can make to the backend is unlimited.
         *
         * <p>Example: {@code 300}
         *
         * @param maxConnections the value to set
         * @return this builder
         */
        public Builder maxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            this.__explicitlySet__.add("maxConnections");
            return this;
        }
        /**
         * Whether the load balancer should drain this server. Servers marked "drain" receive no new
         * incoming traffic.
         *
         * <p>Example: {@code false}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("drain")
        private Boolean drain;

        /**
         * Whether the load balancer should drain this server. Servers marked "drain" receive no new
         * incoming traffic.
         *
         * <p>Example: {@code false}
         *
         * @param drain the value to set
         * @return this builder
         */
        public Builder drain(Boolean drain) {
            this.drain = drain;
            this.__explicitlySet__.add("drain");
            return this;
        }
        /**
         * Whether the load balancer should treat this server as a backup unit. If {@code true}, the
         * load balancer forwards no ingress traffic to this backend server unless all other backend
         * servers not marked as "backup" fail the health check policy.
         *
         * <p>*Note:** You cannot add a backend server marked as {@code backup} to a backend set
         * that uses the IP Hash policy.
         *
         * <p>Example: {@code false}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backup")
        private Boolean backup;

        /**
         * Whether the load balancer should treat this server as a backup unit. If {@code true}, the
         * load balancer forwards no ingress traffic to this backend server unless all other backend
         * servers not marked as "backup" fail the health check policy.
         *
         * <p>*Note:** You cannot add a backend server marked as {@code backup} to a backend set
         * that uses the IP Hash policy.
         *
         * <p>Example: {@code false}
         *
         * @param backup the value to set
         * @return this builder
         */
        public Builder backup(Boolean backup) {
            this.backup = backup;
            this.__explicitlySet__.add("backup");
            return this;
        }
        /**
         * Whether the load balancer should treat this server as offline. Offline servers receive no
         * incoming traffic.
         *
         * <p>Example: {@code false}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("offline")
        private Boolean offline;

        /**
         * Whether the load balancer should treat this server as offline. Offline servers receive no
         * incoming traffic.
         *
         * <p>Example: {@code false}
         *
         * @param offline the value to set
         * @return this builder
         */
        public Builder offline(Boolean offline) {
            this.offline = offline;
            this.__explicitlySet__.add("offline");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Backend build() {
            Backend model =
                    new Backend(
                            this.name,
                            this.ipAddress,
                            this.port,
                            this.weight,
                            this.maxConnections,
                            this.drain,
                            this.backup,
                            this.offline);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Backend model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("weight")) {
                this.weight(model.getWeight());
            }
            if (model.wasPropertyExplicitlySet("maxConnections")) {
                this.maxConnections(model.getMaxConnections());
            }
            if (model.wasPropertyExplicitlySet("drain")) {
                this.drain(model.getDrain());
            }
            if (model.wasPropertyExplicitlySet("backup")) {
                this.backup(model.getBackup());
            }
            if (model.wasPropertyExplicitlySet("offline")) {
                this.offline(model.getOffline());
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
     * A read-only field showing the IP address and port that uniquely identify this backend server
     * in the backend set.
     *
     * <p>Example: {@code 10.0.0.3:8080}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A read-only field showing the IP address and port that uniquely identify this backend server
     * in the backend set.
     *
     * <p>Example: {@code 10.0.0.3:8080}
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The IP address of the backend server.
     *
     * <p>Example: {@code 10.0.0.3}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * The IP address of the backend server.
     *
     * <p>Example: {@code 10.0.0.3}
     *
     * @return the value
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * The communication port for the backend server.
     *
     * <p>Example: {@code 8080}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The communication port for the backend server.
     *
     * <p>Example: {@code 8080}
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
    }

    /**
     * The load balancing policy weight assigned to the server. Backend servers with a higher weight
     * receive a larger proportion of incoming traffic. For example, a server weighted '3' receives
     * 3 times the number of new connections as a server weighted '1'. For more information on load
     * balancing policies, see [How Load Balancing Policies
     * Work](https://docs.oracle.com/iaas/Content/Balance/Reference/lbpolicies.htm).
     *
     * <p>Example: {@code 3}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("weight")
    private final Integer weight;

    /**
     * The load balancing policy weight assigned to the server. Backend servers with a higher weight
     * receive a larger proportion of incoming traffic. For example, a server weighted '3' receives
     * 3 times the number of new connections as a server weighted '1'. For more information on load
     * balancing policies, see [How Load Balancing Policies
     * Work](https://docs.oracle.com/iaas/Content/Balance/Reference/lbpolicies.htm).
     *
     * <p>Example: {@code 3}
     *
     * @return the value
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * The maximum number of simultaneous connections the load balancer can make to the backend. If
     * this is not set or set to 0 then the maximum number of simultaneous connections the load
     * balancer can make to the backend is unlimited.
     *
     * <p>Example: {@code 300}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxConnections")
    private final Integer maxConnections;

    /**
     * The maximum number of simultaneous connections the load balancer can make to the backend. If
     * this is not set or set to 0 then the maximum number of simultaneous connections the load
     * balancer can make to the backend is unlimited.
     *
     * <p>Example: {@code 300}
     *
     * @return the value
     */
    public Integer getMaxConnections() {
        return maxConnections;
    }

    /**
     * Whether the load balancer should drain this server. Servers marked "drain" receive no new
     * incoming traffic.
     *
     * <p>Example: {@code false}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("drain")
    private final Boolean drain;

    /**
     * Whether the load balancer should drain this server. Servers marked "drain" receive no new
     * incoming traffic.
     *
     * <p>Example: {@code false}
     *
     * @return the value
     */
    public Boolean getDrain() {
        return drain;
    }

    /**
     * Whether the load balancer should treat this server as a backup unit. If {@code true}, the
     * load balancer forwards no ingress traffic to this backend server unless all other backend
     * servers not marked as "backup" fail the health check policy.
     *
     * <p>*Note:** You cannot add a backend server marked as {@code backup} to a backend set that
     * uses the IP Hash policy.
     *
     * <p>Example: {@code false}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backup")
    private final Boolean backup;

    /**
     * Whether the load balancer should treat this server as a backup unit. If {@code true}, the
     * load balancer forwards no ingress traffic to this backend server unless all other backend
     * servers not marked as "backup" fail the health check policy.
     *
     * <p>*Note:** You cannot add a backend server marked as {@code backup} to a backend set that
     * uses the IP Hash policy.
     *
     * <p>Example: {@code false}
     *
     * @return the value
     */
    public Boolean getBackup() {
        return backup;
    }

    /**
     * Whether the load balancer should treat this server as offline. Offline servers receive no
     * incoming traffic.
     *
     * <p>Example: {@code false}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("offline")
    private final Boolean offline;

    /**
     * Whether the load balancer should treat this server as offline. Offline servers receive no
     * incoming traffic.
     *
     * <p>Example: {@code false}
     *
     * @return the value
     */
    public Boolean getOffline() {
        return offline;
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
        sb.append("Backend(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", weight=").append(String.valueOf(this.weight));
        sb.append(", maxConnections=").append(String.valueOf(this.maxConnections));
        sb.append(", drain=").append(String.valueOf(this.drain));
        sb.append(", backup=").append(String.valueOf(this.backup));
        sb.append(", offline=").append(String.valueOf(this.offline));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Backend)) {
            return false;
        }

        Backend other = (Backend) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.weight, other.weight)
                && java.util.Objects.equals(this.maxConnections, other.maxConnections)
                && java.util.Objects.equals(this.drain, other.drain)
                && java.util.Objects.equals(this.backup, other.backup)
                && java.util.Objects.equals(this.offline, other.offline)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.weight == null ? 43 : this.weight.hashCode());
        result =
                (result * PRIME)
                        + (this.maxConnections == null ? 43 : this.maxConnections.hashCode());
        result = (result * PRIME) + (this.drain == null ? 43 : this.drain.hashCode());
        result = (result * PRIME) + (this.backup == null ? 43 : this.backup.hashCode());
        result = (result * PRIME) + (this.offline == null ? 43 : this.offline.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
