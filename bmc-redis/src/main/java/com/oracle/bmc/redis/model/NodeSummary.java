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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NodeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NodeSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "privateEndpointFqdn",
        "privateEndpointIpAddress",
        "displayName",
        "redisClusterId",
        "shardNumber"
    })
    public NodeSummary(
            String privateEndpointFqdn,
            String privateEndpointIpAddress,
            String displayName,
            String redisClusterId,
            Integer shardNumber) {
        super();
        this.privateEndpointFqdn = privateEndpointFqdn;
        this.privateEndpointIpAddress = privateEndpointIpAddress;
        this.displayName = displayName;
        this.redisClusterId = redisClusterId;
        this.shardNumber = shardNumber;
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
        /** The OCID of the cluster */
        @com.fasterxml.jackson.annotation.JsonProperty("redisClusterId")
        private String redisClusterId;

        /**
         * The OCID of the cluster
         *
         * @param redisClusterId the value to set
         * @return this builder
         */
        public Builder redisClusterId(String redisClusterId) {
            this.redisClusterId = redisClusterId;
            this.__explicitlySet__.add("redisClusterId");
            return this;
        }
        /** The shard number to which the node belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("shardNumber")
        private Integer shardNumber;

        /**
         * The shard number to which the node belongs to.
         *
         * @param shardNumber the value to set
         * @return this builder
         */
        public Builder shardNumber(Integer shardNumber) {
            this.shardNumber = shardNumber;
            this.__explicitlySet__.add("shardNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NodeSummary build() {
            NodeSummary model =
                    new NodeSummary(
                            this.privateEndpointFqdn,
                            this.privateEndpointIpAddress,
                            this.displayName,
                            this.redisClusterId,
                            this.shardNumber);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NodeSummary model) {
            if (model.wasPropertyExplicitlySet("privateEndpointFqdn")) {
                this.privateEndpointFqdn(model.getPrivateEndpointFqdn());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointIpAddress")) {
                this.privateEndpointIpAddress(model.getPrivateEndpointIpAddress());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("redisClusterId")) {
                this.redisClusterId(model.getRedisClusterId());
            }
            if (model.wasPropertyExplicitlySet("shardNumber")) {
                this.shardNumber(model.getShardNumber());
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

    /** The OCID of the cluster */
    @com.fasterxml.jackson.annotation.JsonProperty("redisClusterId")
    private final String redisClusterId;

    /**
     * The OCID of the cluster
     *
     * @return the value
     */
    public String getRedisClusterId() {
        return redisClusterId;
    }

    /** The shard number to which the node belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("shardNumber")
    private final Integer shardNumber;

    /**
     * The shard number to which the node belongs to.
     *
     * @return the value
     */
    public Integer getShardNumber() {
        return shardNumber;
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
        sb.append("NodeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("privateEndpointFqdn=").append(String.valueOf(this.privateEndpointFqdn));
        sb.append(", privateEndpointIpAddress=")
                .append(String.valueOf(this.privateEndpointIpAddress));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", redisClusterId=").append(String.valueOf(this.redisClusterId));
        sb.append(", shardNumber=").append(String.valueOf(this.shardNumber));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NodeSummary)) {
            return false;
        }

        NodeSummary other = (NodeSummary) o;
        return java.util.Objects.equals(this.privateEndpointFqdn, other.privateEndpointFqdn)
                && java.util.Objects.equals(
                        this.privateEndpointIpAddress, other.privateEndpointIpAddress)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.redisClusterId, other.redisClusterId)
                && java.util.Objects.equals(this.shardNumber, other.shardNumber)
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
        result =
                (result * PRIME)
                        + (this.redisClusterId == null ? 43 : this.redisClusterId.hashCode());
        result = (result * PRIME) + (this.shardNumber == null ? 43 : this.shardNumber.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
