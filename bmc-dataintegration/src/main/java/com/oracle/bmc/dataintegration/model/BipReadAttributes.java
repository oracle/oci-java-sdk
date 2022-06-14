/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BipReadAttributes.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BipReadAttributes extends AbstractReadAttribute {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The fetch size for reading.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fetchSize")
        private Integer fetchSize;

        /**
         * The fetch size for reading.
         * @param fetchSize the value to set
         * @return this builder
         **/
        public Builder fetchSize(Integer fetchSize) {
            this.fetchSize = fetchSize;
            this.__explicitlySet__.add("fetchSize");
            return this;
        }
        /**
         * The maximum number of rows to read.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rowLimit")
        private Integer rowLimit;

        /**
         * The maximum number of rows to read.
         * @param rowLimit the value to set
         * @return this builder
         **/
        public Builder rowLimit(Integer rowLimit) {
            this.rowLimit = rowLimit;
            this.__explicitlySet__.add("rowLimit");
            return this;
        }
        /**
         * Name of BIP report parameter to control the start of the chunk
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("offsetParameter")
        private String offsetParameter;

        /**
         * Name of BIP report parameter to control the start of the chunk
         * @param offsetParameter the value to set
         * @return this builder
         **/
        public Builder offsetParameter(String offsetParameter) {
            this.offsetParameter = offsetParameter;
            this.__explicitlySet__.add("offsetParameter");
            return this;
        }
        /**
         * Name of BIP report parameter to control the start of the chunk
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fetchNextRowsParameter")
        private String fetchNextRowsParameter;

        /**
         * Name of BIP report parameter to control the start of the chunk
         * @param fetchNextRowsParameter the value to set
         * @return this builder
         **/
        public Builder fetchNextRowsParameter(String fetchNextRowsParameter) {
            this.fetchNextRowsParameter = fetchNextRowsParameter;
            this.__explicitlySet__.add("fetchNextRowsParameter");
            return this;
        }
        /**
         * An array of custom BIP report parameters and their values.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customParameters")
        private java.util.List<BipReportParameterValue> customParameters;

        /**
         * An array of custom BIP report parameters and their values.
         * @param customParameters the value to set
         * @return this builder
         **/
        public Builder customParameters(java.util.List<BipReportParameterValue> customParameters) {
            this.customParameters = customParameters;
            this.__explicitlySet__.add("customParameters");
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

        public BipReadAttributes build() {
            BipReadAttributes __instance__ =
                    new BipReadAttributes(
                            fetchSize,
                            rowLimit,
                            offsetParameter,
                            fetchNextRowsParameter,
                            customParameters,
                            stagingDataAsset,
                            stagingConnection,
                            bucketSchema);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BipReadAttributes o) {
            Builder copiedBuilder =
                    fetchSize(o.getFetchSize())
                            .rowLimit(o.getRowLimit())
                            .offsetParameter(o.getOffsetParameter())
                            .fetchNextRowsParameter(o.getFetchNextRowsParameter())
                            .customParameters(o.getCustomParameters())
                            .stagingDataAsset(o.getStagingDataAsset())
                            .stagingConnection(o.getStagingConnection())
                            .bucketSchema(o.getBucketSchema());

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

    @Deprecated
    public BipReadAttributes(
            Integer fetchSize,
            Integer rowLimit,
            String offsetParameter,
            String fetchNextRowsParameter,
            java.util.List<BipReportParameterValue> customParameters,
            DataAssetSummaryFromObjectStorage stagingDataAsset,
            ConnectionSummaryFromObjectStorage stagingConnection,
            Schema bucketSchema) {
        super();
        this.fetchSize = fetchSize;
        this.rowLimit = rowLimit;
        this.offsetParameter = offsetParameter;
        this.fetchNextRowsParameter = fetchNextRowsParameter;
        this.customParameters = customParameters;
        this.stagingDataAsset = stagingDataAsset;
        this.stagingConnection = stagingConnection;
        this.bucketSchema = bucketSchema;
    }

    /**
     * The fetch size for reading.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fetchSize")
    private final Integer fetchSize;

    /**
     * The fetch size for reading.
     * @return the value
     **/
    public Integer getFetchSize() {
        return fetchSize;
    }

    /**
     * The maximum number of rows to read.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rowLimit")
    private final Integer rowLimit;

    /**
     * The maximum number of rows to read.
     * @return the value
     **/
    public Integer getRowLimit() {
        return rowLimit;
    }

    /**
     * Name of BIP report parameter to control the start of the chunk
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offsetParameter")
    private final String offsetParameter;

    /**
     * Name of BIP report parameter to control the start of the chunk
     * @return the value
     **/
    public String getOffsetParameter() {
        return offsetParameter;
    }

    /**
     * Name of BIP report parameter to control the start of the chunk
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fetchNextRowsParameter")
    private final String fetchNextRowsParameter;

    /**
     * Name of BIP report parameter to control the start of the chunk
     * @return the value
     **/
    public String getFetchNextRowsParameter() {
        return fetchNextRowsParameter;
    }

    /**
     * An array of custom BIP report parameters and their values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customParameters")
    private final java.util.List<BipReportParameterValue> customParameters;

    /**
     * An array of custom BIP report parameters and their values.
     * @return the value
     **/
    public java.util.List<BipReportParameterValue> getCustomParameters() {
        return customParameters;
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BipReadAttributes(");
        sb.append("super=").append(super.toString());
        sb.append(", fetchSize=").append(String.valueOf(this.fetchSize));
        sb.append(", rowLimit=").append(String.valueOf(this.rowLimit));
        sb.append(", offsetParameter=").append(String.valueOf(this.offsetParameter));
        sb.append(", fetchNextRowsParameter=").append(String.valueOf(this.fetchNextRowsParameter));
        sb.append(", customParameters=").append(String.valueOf(this.customParameters));
        sb.append(", stagingDataAsset=").append(String.valueOf(this.stagingDataAsset));
        sb.append(", stagingConnection=").append(String.valueOf(this.stagingConnection));
        sb.append(", bucketSchema=").append(String.valueOf(this.bucketSchema));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BipReadAttributes)) {
            return false;
        }

        BipReadAttributes other = (BipReadAttributes) o;
        return java.util.Objects.equals(this.fetchSize, other.fetchSize)
                && java.util.Objects.equals(this.rowLimit, other.rowLimit)
                && java.util.Objects.equals(this.offsetParameter, other.offsetParameter)
                && java.util.Objects.equals(
                        this.fetchNextRowsParameter, other.fetchNextRowsParameter)
                && java.util.Objects.equals(this.customParameters, other.customParameters)
                && java.util.Objects.equals(this.stagingDataAsset, other.stagingDataAsset)
                && java.util.Objects.equals(this.stagingConnection, other.stagingConnection)
                && java.util.Objects.equals(this.bucketSchema, other.bucketSchema)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.fetchSize == null ? 43 : this.fetchSize.hashCode());
        result = (result * PRIME) + (this.rowLimit == null ? 43 : this.rowLimit.hashCode());
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
                        + (this.customParameters == null ? 43 : this.customParameters.hashCode());
        result =
                (result * PRIME)
                        + (this.stagingDataAsset == null ? 43 : this.stagingDataAsset.hashCode());
        result =
                (result * PRIME)
                        + (this.stagingConnection == null ? 43 : this.stagingConnection.hashCode());
        result = (result * PRIME) + (this.bucketSchema == null ? 43 : this.bucketSchema.hashCode());
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
