/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The properties used in create connection validation operations.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateConnectionValidationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateConnectionValidationDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"dataAsset", "connection", "registryMetadata"})
    public CreateConnectionValidationDetails(
            CreateDataAssetDetails dataAsset,
            CreateConnectionDetails connection,
            RegistryMetadata registryMetadata) {
        super();
        this.dataAsset = dataAsset;
        this.connection = connection;
        this.registryMetadata = registryMetadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("dataAsset")
        private CreateDataAssetDetails dataAsset;

        public Builder dataAsset(CreateDataAssetDetails dataAsset) {
            this.dataAsset = dataAsset;
            this.__explicitlySet__.add("dataAsset");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connection")
        private CreateConnectionDetails connection;

        public Builder connection(CreateConnectionDetails connection) {
            this.connection = connection;
            this.__explicitlySet__.add("connection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("registryMetadata")
        private RegistryMetadata registryMetadata;

        public Builder registryMetadata(RegistryMetadata registryMetadata) {
            this.registryMetadata = registryMetadata;
            this.__explicitlySet__.add("registryMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateConnectionValidationDetails build() {
            CreateConnectionValidationDetails __instance__ =
                    new CreateConnectionValidationDetails(dataAsset, connection, registryMetadata);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateConnectionValidationDetails o) {
            Builder copiedBuilder =
                    dataAsset(o.getDataAsset())
                            .connection(o.getConnection())
                            .registryMetadata(o.getRegistryMetadata());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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

    @com.fasterxml.jackson.annotation.JsonProperty("dataAsset")
    private final CreateDataAssetDetails dataAsset;

    public CreateDataAssetDetails getDataAsset() {
        return dataAsset;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connection")
    private final CreateConnectionDetails connection;

    public CreateConnectionDetails getConnection() {
        return connection;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("registryMetadata")
    private final RegistryMetadata registryMetadata;

    public RegistryMetadata getRegistryMetadata() {
        return registryMetadata;
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
        sb.append("CreateConnectionValidationDetails(");
        sb.append("dataAsset=").append(String.valueOf(this.dataAsset));
        sb.append(", connection=").append(String.valueOf(this.connection));
        sb.append(", registryMetadata=").append(String.valueOf(this.registryMetadata));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateConnectionValidationDetails)) {
            return false;
        }

        CreateConnectionValidationDetails other = (CreateConnectionValidationDetails) o;
        return java.util.Objects.equals(this.dataAsset, other.dataAsset)
                && java.util.Objects.equals(this.connection, other.connection)
                && java.util.Objects.equals(this.registryMetadata, other.registryMetadata)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dataAsset == null ? 43 : this.dataAsset.hashCode());
        result = (result * PRIME) + (this.connection == null ? 43 : this.connection.hashCode());
        result =
                (result * PRIME)
                        + (this.registryMetadata == null ? 43 : this.registryMetadata.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
