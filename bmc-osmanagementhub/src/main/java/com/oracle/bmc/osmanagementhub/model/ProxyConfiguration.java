/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Proxy information used for the management station configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ProxyConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ProxyConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isEnabled", "hosts", "port", "forward"})
    public ProxyConfiguration(
            Boolean isEnabled, java.util.List<String> hosts, String port, String forward) {
        super();
        this.isEnabled = isEnabled;
        this.hosts = hosts;
        this.port = port;
        this.forward = forward;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Indicates if the proxy should be enabled or disabled. Default is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Indicates if the proxy should be enabled or disabled. Default is enabled.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /** List of hosts. */
        @com.fasterxml.jackson.annotation.JsonProperty("hosts")
        private java.util.List<String> hosts;

        /**
         * List of hosts.
         *
         * @param hosts the value to set
         * @return this builder
         */
        public Builder hosts(java.util.List<String> hosts) {
            this.hosts = hosts;
            this.__explicitlySet__.add("hosts");
            return this;
        }
        /** Listening port used for the proxy. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private String port;

        /**
         * Listening port used for the proxy.
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(String port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /** The URL the proxy will forward to. */
        @com.fasterxml.jackson.annotation.JsonProperty("forward")
        private String forward;

        /**
         * The URL the proxy will forward to.
         *
         * @param forward the value to set
         * @return this builder
         */
        public Builder forward(String forward) {
            this.forward = forward;
            this.__explicitlySet__.add("forward");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProxyConfiguration build() {
            ProxyConfiguration model =
                    new ProxyConfiguration(this.isEnabled, this.hosts, this.port, this.forward);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProxyConfiguration model) {
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("hosts")) {
                this.hosts(model.getHosts());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("forward")) {
                this.forward(model.getForward());
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

    /** Indicates if the proxy should be enabled or disabled. Default is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Indicates if the proxy should be enabled or disabled. Default is enabled.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /** List of hosts. */
    @com.fasterxml.jackson.annotation.JsonProperty("hosts")
    private final java.util.List<String> hosts;

    /**
     * List of hosts.
     *
     * @return the value
     */
    public java.util.List<String> getHosts() {
        return hosts;
    }

    /** Listening port used for the proxy. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final String port;

    /**
     * Listening port used for the proxy.
     *
     * @return the value
     */
    public String getPort() {
        return port;
    }

    /** The URL the proxy will forward to. */
    @com.fasterxml.jackson.annotation.JsonProperty("forward")
    private final String forward;

    /**
     * The URL the proxy will forward to.
     *
     * @return the value
     */
    public String getForward() {
        return forward;
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
        sb.append("ProxyConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", hosts=").append(String.valueOf(this.hosts));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", forward=").append(String.valueOf(this.forward));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProxyConfiguration)) {
            return false;
        }

        ProxyConfiguration other = (ProxyConfiguration) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.hosts, other.hosts)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.forward, other.forward)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.hosts == null ? 43 : this.hosts.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.forward == null ? 43 : this.forward.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
