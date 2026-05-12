/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * The details of an MCP server endpoint. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DatabaseToolsMcpServerEndpoint.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatabaseToolsMcpServerEndpoint
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "endpoint"})
    public DatabaseToolsMcpServerEndpoint(DatabaseToolsMcpServerType type, String endpoint) {
        super();
        this.type = type;
        this.endpoint = endpoint;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The MCP server type */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private DatabaseToolsMcpServerType type;

        /**
         * The MCP server type
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(DatabaseToolsMcpServerType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The URI endpoint of the MCP server */
        @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
        private String endpoint;

        /**
         * The URI endpoint of the MCP server
         *
         * @param endpoint the value to set
         * @return this builder
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            this.__explicitlySet__.add("endpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseToolsMcpServerEndpoint build() {
            DatabaseToolsMcpServerEndpoint model =
                    new DatabaseToolsMcpServerEndpoint(this.type, this.endpoint);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseToolsMcpServerEndpoint model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("endpoint")) {
                this.endpoint(model.getEndpoint());
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

    /** The MCP server type */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final DatabaseToolsMcpServerType type;

    /**
     * The MCP server type
     *
     * @return the value
     */
    public DatabaseToolsMcpServerType getType() {
        return type;
    }

    /** The URI endpoint of the MCP server */
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    private final String endpoint;

    /**
     * The URI endpoint of the MCP server
     *
     * @return the value
     */
    public String getEndpoint() {
        return endpoint;
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
        sb.append("DatabaseToolsMcpServerEndpoint(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", endpoint=").append(String.valueOf(this.endpoint));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseToolsMcpServerEndpoint)) {
            return false;
        }

        DatabaseToolsMcpServerEndpoint other = (DatabaseToolsMcpServerEndpoint) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.endpoint, other.endpoint)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.endpoint == null ? 43 : this.endpoint.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
