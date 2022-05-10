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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BipCallAttribute.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class BipCallAttribute extends AbstractCallAttribute {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("fetchSize")
        private Integer fetchSize;

        public Builder fetchSize(Integer fetchSize) {
            this.fetchSize = fetchSize;
            this.__explicitlySet__.add("fetchSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("offsetParameter")
        private String offsetParameter;

        public Builder offsetParameter(String offsetParameter) {
            this.offsetParameter = offsetParameter;
            this.__explicitlySet__.add("offsetParameter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fetchNextRowsParameter")
        private String fetchNextRowsParameter;

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
            BipCallAttribute __instance__ =
                    new BipCallAttribute(
                            fetchSize,
                            offsetParameter,
                            fetchNextRowsParameter,
                            stagingDataAsset,
                            stagingConnection,
                            bucketSchema);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BipCallAttribute o) {
            Builder copiedBuilder =
                    fetchSize(o.getFetchSize())
                            .offsetParameter(o.getOffsetParameter())
                            .fetchNextRowsParameter(o.getFetchNextRowsParameter())
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
    String offsetParameter;

    /**
     * Name of BIP report parameter to control the fetch next rows of the chunk.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fetchNextRowsParameter")
    String fetchNextRowsParameter;

    @com.fasterxml.jackson.annotation.JsonProperty("stagingDataAsset")
    DataAssetSummaryFromObjectStorage stagingDataAsset;

    @com.fasterxml.jackson.annotation.JsonProperty("stagingConnection")
    ConnectionSummaryFromObjectStorage stagingConnection;

    @com.fasterxml.jackson.annotation.JsonProperty("bucketSchema")
    Schema bucketSchema;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
