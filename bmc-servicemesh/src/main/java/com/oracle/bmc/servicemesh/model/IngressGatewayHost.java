/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * Host for the ingress listener.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = IngressGatewayHost.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IngressGatewayHost extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "hostnames", "listeners"})
    public IngressGatewayHost(
            String name,
            java.util.List<String> hostnames,
            java.util.List<IngressGatewayListener> listeners) {
        super();
        this.name = name;
        this.hostnames = hostnames;
        this.listeners = listeners;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name for the host. The name must be unique within the same ingress gateway.
         * This name can be used in the ingress gateway route table resource to attach a route to this host.
         * <p>
         * Example: {@code MyExampleHost}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A user-friendly name for the host. The name must be unique within the same ingress gateway.
         * This name can be used in the ingress gateway route table resource to attach a route to this host.
         * <p>
         * Example: {@code MyExampleHost}
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
         * Hostnames of the host. Applicable only for HTTP and TLS_PASSTHROUGH listeners.
         * Wildcard hostnames are supported in the prefix form.
         * Examples of valid hostnames are "www.example.com", "*.example.com", "*.com".
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostnames")
        private java.util.List<String> hostnames;

        /**
         * Hostnames of the host. Applicable only for HTTP and TLS_PASSTHROUGH listeners.
         * Wildcard hostnames are supported in the prefix form.
         * Examples of valid hostnames are "www.example.com", "*.example.com", "*.com".
         *
         * @param hostnames the value to set
         * @return this builder
         **/
        public Builder hostnames(java.util.List<String> hostnames) {
            this.hostnames = hostnames;
            this.__explicitlySet__.add("hostnames");
            return this;
        }
        /**
         * The listeners for the ingress gateway.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listeners")
        private java.util.List<IngressGatewayListener> listeners;

        /**
         * The listeners for the ingress gateway.
         * @param listeners the value to set
         * @return this builder
         **/
        public Builder listeners(java.util.List<IngressGatewayListener> listeners) {
            this.listeners = listeners;
            this.__explicitlySet__.add("listeners");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IngressGatewayHost build() {
            IngressGatewayHost model =
                    new IngressGatewayHost(this.name, this.hostnames, this.listeners);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IngressGatewayHost model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("hostnames")) {
                this.hostnames(model.getHostnames());
            }
            if (model.wasPropertyExplicitlySet("listeners")) {
                this.listeners(model.getListeners());
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
     * A user-friendly name for the host. The name must be unique within the same ingress gateway.
     * This name can be used in the ingress gateway route table resource to attach a route to this host.
     * <p>
     * Example: {@code MyExampleHost}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A user-friendly name for the host. The name must be unique within the same ingress gateway.
     * This name can be used in the ingress gateway route table resource to attach a route to this host.
     * <p>
     * Example: {@code MyExampleHost}
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Hostnames of the host. Applicable only for HTTP and TLS_PASSTHROUGH listeners.
     * Wildcard hostnames are supported in the prefix form.
     * Examples of valid hostnames are "www.example.com", "*.example.com", "*.com".
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostnames")
    private final java.util.List<String> hostnames;

    /**
     * Hostnames of the host. Applicable only for HTTP and TLS_PASSTHROUGH listeners.
     * Wildcard hostnames are supported in the prefix form.
     * Examples of valid hostnames are "www.example.com", "*.example.com", "*.com".
     *
     * @return the value
     **/
    public java.util.List<String> getHostnames() {
        return hostnames;
    }

    /**
     * The listeners for the ingress gateway.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listeners")
    private final java.util.List<IngressGatewayListener> listeners;

    /**
     * The listeners for the ingress gateway.
     * @return the value
     **/
    public java.util.List<IngressGatewayListener> getListeners() {
        return listeners;
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
        sb.append("IngressGatewayHost(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", hostnames=").append(String.valueOf(this.hostnames));
        sb.append(", listeners=").append(String.valueOf(this.listeners));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IngressGatewayHost)) {
            return false;
        }

        IngressGatewayHost other = (IngressGatewayHost) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.hostnames, other.hostnames)
                && java.util.Objects.equals(this.listeners, other.listeners)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.hostnames == null ? 43 : this.hostnames.hashCode());
        result = (result * PRIME) + (this.listeners == null ? 43 : this.listeners.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
