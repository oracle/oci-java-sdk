/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The data profile payload.
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
    builder = CreateDataProfileDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateDataProfileDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "readOperationConfig",
        "dataAsset",
        "connection",
        "schema",
        "dataEntity",
        "profileConfig"
    })
    public CreateDataProfileDetails(
            ReadOperationConfig readOperationConfig,
            DataAsset dataAsset,
            Connection connection,
            Schema schema,
            DataEntity dataEntity,
            ProfileConfig profileConfig) {
        super();
        this.readOperationConfig = readOperationConfig;
        this.dataAsset = dataAsset;
        this.connection = connection;
        this.schema = schema;
        this.dataEntity = dataEntity;
        this.profileConfig = profileConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("readOperationConfig")
        private ReadOperationConfig readOperationConfig;

        public Builder readOperationConfig(ReadOperationConfig readOperationConfig) {
            this.readOperationConfig = readOperationConfig;
            this.__explicitlySet__.add("readOperationConfig");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("schema")
        private Schema schema;

        public Builder schema(Schema schema) {
            this.schema = schema;
            this.__explicitlySet__.add("schema");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataEntity")
        private DataEntity dataEntity;

        public Builder dataEntity(DataEntity dataEntity) {
            this.dataEntity = dataEntity;
            this.__explicitlySet__.add("dataEntity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("profileConfig")
        private ProfileConfig profileConfig;

        public Builder profileConfig(ProfileConfig profileConfig) {
            this.profileConfig = profileConfig;
            this.__explicitlySet__.add("profileConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDataProfileDetails build() {
            CreateDataProfileDetails model =
                    new CreateDataProfileDetails(
                            this.readOperationConfig,
                            this.dataAsset,
                            this.connection,
                            this.schema,
                            this.dataEntity,
                            this.profileConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDataProfileDetails model) {
            if (model.wasPropertyExplicitlySet("readOperationConfig")) {
                this.readOperationConfig(model.getReadOperationConfig());
            }
            if (model.wasPropertyExplicitlySet("dataAsset")) {
                this.dataAsset(model.getDataAsset());
            }
            if (model.wasPropertyExplicitlySet("connection")) {
                this.connection(model.getConnection());
            }
            if (model.wasPropertyExplicitlySet("schema")) {
                this.schema(model.getSchema());
            }
            if (model.wasPropertyExplicitlySet("dataEntity")) {
                this.dataEntity(model.getDataEntity());
            }
            if (model.wasPropertyExplicitlySet("profileConfig")) {
                this.profileConfig(model.getProfileConfig());
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

    @com.fasterxml.jackson.annotation.JsonProperty("readOperationConfig")
    private final ReadOperationConfig readOperationConfig;

    public ReadOperationConfig getReadOperationConfig() {
        return readOperationConfig;
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

    @com.fasterxml.jackson.annotation.JsonProperty("schema")
    private final Schema schema;

    public Schema getSchema() {
        return schema;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataEntity")
    private final DataEntity dataEntity;

    public DataEntity getDataEntity() {
        return dataEntity;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("profileConfig")
    private final ProfileConfig profileConfig;

    public ProfileConfig getProfileConfig() {
        return profileConfig;
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
        sb.append("CreateDataProfileDetails(");
        sb.append("super=").append(super.toString());
        sb.append("readOperationConfig=").append(String.valueOf(this.readOperationConfig));
        sb.append(", dataAsset=").append(String.valueOf(this.dataAsset));
        sb.append(", connection=").append(String.valueOf(this.connection));
        sb.append(", schema=").append(String.valueOf(this.schema));
        sb.append(", dataEntity=").append(String.valueOf(this.dataEntity));
        sb.append(", profileConfig=").append(String.valueOf(this.profileConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDataProfileDetails)) {
            return false;
        }

        CreateDataProfileDetails other = (CreateDataProfileDetails) o;
        return java.util.Objects.equals(this.readOperationConfig, other.readOperationConfig)
                && java.util.Objects.equals(this.dataAsset, other.dataAsset)
                && java.util.Objects.equals(this.connection, other.connection)
                && java.util.Objects.equals(this.schema, other.schema)
                && java.util.Objects.equals(this.dataEntity, other.dataEntity)
                && java.util.Objects.equals(this.profileConfig, other.profileConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.readOperationConfig == null
                                ? 43
                                : this.readOperationConfig.hashCode());
        result = (result * PRIME) + (this.dataAsset == null ? 43 : this.dataAsset.hashCode());
        result = (result * PRIME) + (this.connection == null ? 43 : this.connection.hashCode());
        result = (result * PRIME) + (this.schema == null ? 43 : this.schema.hashCode());
        result = (result * PRIME) + (this.dataEntity == null ? 43 : this.dataEntity.hashCode());
        result =
                (result * PRIME)
                        + (this.profileConfig == null ? 43 : this.profileConfig.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
