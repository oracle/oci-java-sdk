/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * A key map. If provided, key is replaced with generated key. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dataAsset", "connection", "compartmentId", "schema"})
    public ConfigurationDetails(
            DataAsset dataAsset, Connection connection, String compartmentId, Schema schema) {
        super();
        this.dataAsset = dataAsset;
        this.connection = connection;
        this.compartmentId = compartmentId;
        this.schema = schema;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("dataAsset")
        private DataAsset dataAsset;

        public Builder dataAsset(DataAsset dataAsset) {
            this.dataAsset = dataAsset;
            this.__explicitlySet__.add("dataAsset");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connection")
        private Connection connection;

        public Builder connection(Connection connection) {
            this.connection = connection;
            this.__explicitlySet__.add("connection");
            return this;
        }
        /** The compartment ID of the object store. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment ID of the object store.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("schema")
        private Schema schema;

        public Builder schema(Schema schema) {
            this.schema = schema;
            this.__explicitlySet__.add("schema");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfigurationDetails build() {
            ConfigurationDetails model =
                    new ConfigurationDetails(
                            this.dataAsset, this.connection, this.compartmentId, this.schema);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("dataAsset")) {
                this.dataAsset(model.getDataAsset());
            }
            if (model.wasPropertyExplicitlySet("connection")) {
                this.connection(model.getConnection());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("schema")) {
                this.schema(model.getSchema());
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

    @com.fasterxml.jackson.annotation.JsonProperty("dataAsset")
    private final DataAsset dataAsset;

    public DataAsset getDataAsset() {
        return dataAsset;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connection")
    private final Connection connection;

    public Connection getConnection() {
        return connection;
    }

    /** The compartment ID of the object store. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment ID of the object store.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("schema")
    private final Schema schema;

    public Schema getSchema() {
        return schema;
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
        sb.append("ConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("dataAsset=").append(String.valueOf(this.dataAsset));
        sb.append(", connection=").append(String.valueOf(this.connection));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", schema=").append(String.valueOf(this.schema));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfigurationDetails)) {
            return false;
        }

        ConfigurationDetails other = (ConfigurationDetails) o;
        return java.util.Objects.equals(this.dataAsset, other.dataAsset)
                && java.util.Objects.equals(this.connection, other.connection)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.schema, other.schema)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dataAsset == null ? 43 : this.dataAsset.hashCode());
        result = (result * PRIME) + (this.connection == null ? 43 : this.connection.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.schema == null ? 43 : this.schema.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
