/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis.model;

/**
 * The details of each node in the cluster. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220315")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Node.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Node extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "privateEndpointFqdn",
        "privateEndpointIpAddress",
        "displayName"
    })
    public Node(String privateEndpointFqdn, String privateEndpointIpAddress, String displayName) {
        super();
        this.privateEndpointFqdn = privateEndpointFqdn;
        this.privateEndpointIpAddress = privateEndpointIpAddress;
        this.displayName = displayName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The fully qualified domain name (FQDN) of the API endpoint to access a specific node. */
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointFqdn")
        private String privateEndpointFqdn;

        /**
         * The fully qualified domain name (FQDN) of the API endpoint to access a specific node.
         *
         * @param privateEndpointFqdn the value to set
         * @return this builder
         */
        public Builder privateEndpointFqdn(String privateEndpointFqdn) {
            this.privateEndpointFqdn = privateEndpointFqdn;
            this.__explicitlySet__.add("privateEndpointFqdn");
            return this;
        }
        /** The private IP address of the API endpoint to access a specific node. */
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIpAddress")
        private String privateEndpointIpAddress;

        /**
         * The private IP address of the API endpoint to access a specific node.
         *
         * @param privateEndpointIpAddress the value to set
         * @return this builder
         */
        public Builder privateEndpointIpAddress(String privateEndpointIpAddress) {
            this.privateEndpointIpAddress = privateEndpointIpAddress;
            this.__explicitlySet__.add("privateEndpointIpAddress");
            return this;
        }
        /** A user-friendly name of a cluster node. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name of a cluster node.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Node build() {
            Node model =
                    new Node(
                            this.privateEndpointFqdn,
                            this.privateEndpointIpAddress,
                            this.displayName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Node model) {
            if (model.wasPropertyExplicitlySet("privateEndpointFqdn")) {
                this.privateEndpointFqdn(model.getPrivateEndpointFqdn());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointIpAddress")) {
                this.privateEndpointIpAddress(model.getPrivateEndpointIpAddress());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
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

    /** The fully qualified domain name (FQDN) of the API endpoint to access a specific node. */
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointFqdn")
    private final String privateEndpointFqdn;

    /**
     * The fully qualified domain name (FQDN) of the API endpoint to access a specific node.
     *
     * @return the value
     */
    public String getPrivateEndpointFqdn() {
        return privateEndpointFqdn;
    }

    /** The private IP address of the API endpoint to access a specific node. */
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIpAddress")
    private final String privateEndpointIpAddress;

    /**
     * The private IP address of the API endpoint to access a specific node.
     *
     * @return the value
     */
    public String getPrivateEndpointIpAddress() {
        return privateEndpointIpAddress;
    }

    /** A user-friendly name of a cluster node. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name of a cluster node.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
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
        sb.append("Node(");
        sb.append("super=").append(super.toString());
        sb.append("privateEndpointFqdn=").append(String.valueOf(this.privateEndpointFqdn));
        sb.append(", privateEndpointIpAddress=")
                .append(String.valueOf(this.privateEndpointIpAddress));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Node)) {
            return false;
        }

        Node other = (Node) o;
        return java.util.Objects.equals(this.privateEndpointFqdn, other.privateEndpointFqdn)
                && java.util.Objects.equals(
                        this.privateEndpointIpAddress, other.privateEndpointIpAddress)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.privateEndpointFqdn == null
                                ? 43
                                : this.privateEndpointFqdn.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointIpAddress == null
                                ? 43
                                : this.privateEndpointIpAddress.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
