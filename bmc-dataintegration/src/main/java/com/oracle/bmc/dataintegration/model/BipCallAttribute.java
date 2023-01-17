/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Properties to configure reading from a FUSION_APP BIP data asset / connection.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BipCallAttribute.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BipCallAttribute extends AbstractCallAttribute {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("fetchSize")
        private Integer fetchSize;

        public Builder fetchSize(Integer fetchSize) {
            this.fetchSize = fetchSize;
            this.__explicitlySet__.add("fetchSize");
            return this;
        }
        /**
         * Name of BIP report parameter to control the offset of the chunk.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("offsetParameter")
        private String offsetParameter;

        /**
         * Name of BIP report parameter to control the offset of the chunk.
         * @param offsetParameter the value to set
         * @return this builder
         **/
        public Builder offsetParameter(String offsetParameter) {
            this.offsetParameter = offsetParameter;
            this.__explicitlySet__.add("offsetParameter");
            return this;
        }
        /**
         * Name of BIP report parameter to control the fetch next rows of the chunk.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fetchNextRowsParameter")
        private String fetchNextRowsParameter;

        /**
         * Name of BIP report parameter to control the fetch next rows of the chunk.
         * @param fetchNextRowsParameter the value to set
         * @return this builder
         **/
        public Builder fetchNextRowsParameter(String fetchNextRowsParameter) {
            this.fetchNextRowsParameter = fetchNextRowsParameter;
            this.__explicitlySet__.add("fetchNextRowsParameter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stagingDataAsset")
        private DataAssetSummaryFromObjectStorage stagingDataAsset;

        public Builder stagingDataAsset(DataAssetSummaryFromObjectStorage stagingDataAsset) {
            this.stagingDataAsset = stagingDataAsset;
            this.__explicitlySet__.add("stagingDataAsset");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stagingConnection")
        private ConnectionSummaryFromObjectStorage stagingConnection;

        public Builder stagingConnection(ConnectionSummaryFromObjectStorage stagingConnection) {
            this.stagingConnection = stagingConnection;
            this.__explicitlySet__.add("stagingConnection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bucketSchema")
        private Schema bucketSchema;

        public Builder bucketSchema(Schema bucketSchema) {
            this.bucketSchema = bucketSchema;
            this.__explicitlySet__.add("bucketSchema");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BipCallAttribute build() {
            BipCallAttribute model =
                    new BipCallAttribute(
                            this.fetchSize,
                            this.offsetParameter,
                            this.fetchNextRowsParameter,
                            this.stagingDataAsset,
                            this.stagingConnection,
                            this.bucketSchema);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BipCallAttribute model) {
            if (model.wasPropertyExplicitlySet("fetchSize")) {
                this.fetchSize(model.getFetchSize());
            }
            if (model.wasPropertyExplicitlySet("offsetParameter")) {
                this.offsetParameter(model.getOffsetParameter());
            }
            if (model.wasPropertyExplicitlySet("fetchNextRowsParameter")) {
                this.fetchNextRowsParameter(model.getFetchNextRowsParameter());
            }
            if (model.wasPropertyExplicitlySet("stagingDataAsset")) {
                this.stagingDataAsset(model.getStagingDataAsset());
            }
            if (model.wasPropertyExplicitlySet("stagingConnection")) {
                this.stagingConnection(model.getStagingConnection());
            }
            if (model.wasPropertyExplicitlySet("bucketSchema")) {
                this.bucketSchema(model.getBucketSchema());
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

    @Deprecated
    public BipCallAttribute(
            Integer fetchSize,
            String offsetParameter,
            String fetchNextRowsParameter,
            DataAssetSummaryFromObjectStorage stagingDataAsset,
            ConnectionSummaryFromObjectStorage stagingConnection,
            Schema bucketSchema) {
        super(fetchSize);
        this.offsetParameter = offsetParameter;
        this.fetchNextRowsParameter = fetchNextRowsParameter;
        this.stagingDataAsset = stagingDataAsset;
        this.stagingConnection = stagingConnection;
        this.bucketSchema = bucketSchema;
    }

    /**
     * Name of BIP report parameter to control the offset of the chunk.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offsetParameter")
    private final String offsetParameter;

    /**
     * Name of BIP report parameter to control the offset of the chunk.
     * @return the value
     **/
    public String getOffsetParameter() {
        return offsetParameter;
    }

    /**
     * Name of BIP report parameter to control the fetch next rows of the chunk.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fetchNextRowsParameter")
    private final String fetchNextRowsParameter;

    /**
     * Name of BIP report parameter to control the fetch next rows of the chunk.
     * @return the value
     **/
    public String getFetchNextRowsParameter() {
        return fetchNextRowsParameter;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stagingDataAsset")
    private final DataAssetSummaryFromObjectStorage stagingDataAsset;

    public DataAssetSummaryFromObjectStorage getStagingDataAsset() {
        return stagingDataAsset;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stagingConnection")
    private final ConnectionSummaryFromObjectStorage stagingConnection;

    public ConnectionSummaryFromObjectStorage getStagingConnection() {
        return stagingConnection;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("bucketSchema")
    private final Schema bucketSchema;

    public Schema getBucketSchema() {
        return bucketSchema;
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
        sb.append("BipCallAttribute(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", offsetParameter=").append(String.valueOf(this.offsetParameter));
        sb.append(", fetchNextRowsParameter=").append(String.valueOf(this.fetchNextRowsParameter));
        sb.append(", stagingDataAsset=").append(String.valueOf(this.stagingDataAsset));
        sb.append(", stagingConnection=").append(String.valueOf(this.stagingConnection));
        sb.append(", bucketSchema=").append(String.valueOf(this.bucketSchema));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BipCallAttribute)) {
            return false;
        }

        BipCallAttribute other = (BipCallAttribute) o;
        return java.util.Objects.equals(this.offsetParameter, other.offsetParameter)
                && java.util.Objects.equals(
                        this.fetchNextRowsParameter, other.fetchNextRowsParameter)
                && java.util.Objects.equals(this.stagingDataAsset, other.stagingDataAsset)
                && java.util.Objects.equals(this.stagingConnection, other.stagingConnection)
                && java.util.Objects.equals(this.bucketSchema, other.bucketSchema)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.offsetParameter == null ? 43 : this.offsetParameter.hashCode());
        result =
                (result * PRIME)
                        + (this.fetchNextRowsParameter == null
                                ? 43
                                : this.fetchNextRowsParameter.hashCode());
        result =
                (result * PRIME)
                        + (this.stagingDataAsset == null ? 43 : this.stagingDataAsset.hashCode());
        result =
                (result * PRIME)
                        + (this.stagingConnection == null ? 43 : this.stagingConnection.hashCode());
        result = (result * PRIME) + (this.bucketSchema == null ? 43 : this.bucketSchema.hashCode());
        return result;
    }
}
