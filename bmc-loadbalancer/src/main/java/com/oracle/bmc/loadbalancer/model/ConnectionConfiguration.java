/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * Configuration details for the connection between the client and backend servers. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ConnectionConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ConnectionConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"idleTimeout", "backendTcpProxyProtocolVersion"})
    public ConnectionConfiguration(Long idleTimeout, Integer backendTcpProxyProtocolVersion) {
        super();
        this.idleTimeout = idleTimeout;
        this.backendTcpProxyProtocolVersion = backendTcpProxyProtocolVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The maximum idle time, in seconds, allowed between two successive receive or two
         * successive send operations between the client and backend servers. A send operation does
         * not reset the timer for receive operations. A receive operation does not reset the timer
         * for send operations.
         *
         * <p>For more information, see [Connection
         * Configuration](https://docs.cloud.oracle.com/Content/Balance/Reference/connectionreuse.htm#ConnectionConfiguration).
         *
         * <p>Example: {@code 1200}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idleTimeout")
        private Long idleTimeout;

        /**
         * The maximum idle time, in seconds, allowed between two successive receive or two
         * successive send operations between the client and backend servers. A send operation does
         * not reset the timer for receive operations. A receive operation does not reset the timer
         * for send operations.
         *
         * <p>For more information, see [Connection
         * Configuration](https://docs.cloud.oracle.com/Content/Balance/Reference/connectionreuse.htm#ConnectionConfiguration).
         *
         * <p>Example: {@code 1200}
         *
         * @param idleTimeout the value to set
         * @return this builder
         */
        public Builder idleTimeout(Long idleTimeout) {
            this.idleTimeout = idleTimeout;
            this.__explicitlySet__.add("idleTimeout");
            return this;
        }
        /**
         * The backend TCP Proxy Protocol version.
         *
         * <p>Example: {@code 1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backendTcpProxyProtocolVersion")
        private Integer backendTcpProxyProtocolVersion;

        /**
         * The backend TCP Proxy Protocol version.
         *
         * <p>Example: {@code 1}
         *
         * @param backendTcpProxyProtocolVersion the value to set
         * @return this builder
         */
        public Builder backendTcpProxyProtocolVersion(Integer backendTcpProxyProtocolVersion) {
            this.backendTcpProxyProtocolVersion = backendTcpProxyProtocolVersion;
            this.__explicitlySet__.add("backendTcpProxyProtocolVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConnectionConfiguration build() {
            ConnectionConfiguration model =
                    new ConnectionConfiguration(
                            this.idleTimeout, this.backendTcpProxyProtocolVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConnectionConfiguration model) {
            if (model.wasPropertyExplicitlySet("idleTimeout")) {
                this.idleTimeout(model.getIdleTimeout());
            }
            if (model.wasPropertyExplicitlySet("backendTcpProxyProtocolVersion")) {
                this.backendTcpProxyProtocolVersion(model.getBackendTcpProxyProtocolVersion());
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
     * The maximum idle time, in seconds, allowed between two successive receive or two successive
     * send operations between the client and backend servers. A send operation does not reset the
     * timer for receive operations. A receive operation does not reset the timer for send
     * operations.
     *
     * <p>For more information, see [Connection
     * Configuration](https://docs.cloud.oracle.com/Content/Balance/Reference/connectionreuse.htm#ConnectionConfiguration).
     *
     * <p>Example: {@code 1200}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idleTimeout")
    private final Long idleTimeout;

    /**
     * The maximum idle time, in seconds, allowed between two successive receive or two successive
     * send operations between the client and backend servers. A send operation does not reset the
     * timer for receive operations. A receive operation does not reset the timer for send
     * operations.
     *
     * <p>For more information, see [Connection
     * Configuration](https://docs.cloud.oracle.com/Content/Balance/Reference/connectionreuse.htm#ConnectionConfiguration).
     *
     * <p>Example: {@code 1200}
     *
     * @return the value
     */
    public Long getIdleTimeout() {
        return idleTimeout;
    }

    /**
     * The backend TCP Proxy Protocol version.
     *
     * <p>Example: {@code 1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backendTcpProxyProtocolVersion")
    private final Integer backendTcpProxyProtocolVersion;

    /**
     * The backend TCP Proxy Protocol version.
     *
     * <p>Example: {@code 1}
     *
     * @return the value
     */
    public Integer getBackendTcpProxyProtocolVersion() {
        return backendTcpProxyProtocolVersion;
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
        sb.append("ConnectionConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("idleTimeout=").append(String.valueOf(this.idleTimeout));
        sb.append(", backendTcpProxyProtocolVersion=")
                .append(String.valueOf(this.backendTcpProxyProtocolVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConnectionConfiguration)) {
            return false;
        }

        ConnectionConfiguration other = (ConnectionConfiguration) o;
        return java.util.Objects.equals(this.idleTimeout, other.idleTimeout)
                && java.util.Objects.equals(
                        this.backendTcpProxyProtocolVersion, other.backendTcpProxyProtocolVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.idleTimeout == null ? 43 : this.idleTimeout.hashCode());
        result =
                (result * PRIME)
                        + (this.backendTcpProxyProtocolVersion == null
                                ? 43
                                : this.backendTcpProxyProtocolVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
