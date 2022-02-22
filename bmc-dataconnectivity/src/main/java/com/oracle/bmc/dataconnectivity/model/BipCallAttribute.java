/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The call attributes impl
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
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
        @com.fasterxml.jackson.annotation.JsonProperty("stagingBucket")
        private Schema stagingBucket;

        public Builder stagingBucket(Schema stagingBucket) {
            this.stagingBucket = stagingBucket;
            this.__explicitlySet__.add("stagingBucket");
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
        private DataAsset stagingDataAsset;

        public Builder stagingDataAsset(DataAsset stagingDataAsset) {
            this.stagingDataAsset = stagingDataAsset;
            this.__explicitlySet__.add("stagingDataAsset");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stagingConnection")
        private Connection stagingConnection;

        public Builder stagingConnection(Connection stagingConnection) {
            this.stagingConnection = stagingConnection;
            this.__explicitlySet__.add("stagingConnection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stagingPrefix")
        private String stagingPrefix;

        public Builder stagingPrefix(String stagingPrefix) {
            this.stagingPrefix = stagingPrefix;
            this.__explicitlySet__.add("stagingPrefix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BipCallAttribute build() {
            BipCallAttribute __instance__ =
                    new BipCallAttribute(
                            stagingBucket,
                            offsetParameter,
                            fetchNextRowsParameter,
                            stagingDataAsset,
                            stagingConnection,
                            stagingPrefix);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BipCallAttribute o) {
            Builder copiedBuilder =
                    stagingBucket(o.getStagingBucket())
                            .offsetParameter(o.getOffsetParameter())
                            .fetchNextRowsParameter(o.getFetchNextRowsParameter())
                            .stagingDataAsset(o.getStagingDataAsset())
                            .stagingConnection(o.getStagingConnection())
                            .stagingPrefix(o.getStagingPrefix());

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
            Schema stagingBucket,
            String offsetParameter,
            String fetchNextRowsParameter,
            DataAsset stagingDataAsset,
            Connection stagingConnection,
            String stagingPrefix) {
        super();
        this.stagingBucket = stagingBucket;
        this.offsetParameter = offsetParameter;
        this.fetchNextRowsParameter = fetchNextRowsParameter;
        this.stagingDataAsset = stagingDataAsset;
        this.stagingConnection = stagingConnection;
        this.stagingPrefix = stagingPrefix;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stagingBucket")
    Schema stagingBucket;

    /**
     * Parameter to set offset
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offsetParameter")
    String offsetParameter;

    /**
     * Parameter to fetch next set of rows
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fetchNextRowsParameter")
    String fetchNextRowsParameter;

    @com.fasterxml.jackson.annotation.JsonProperty("stagingDataAsset")
    DataAsset stagingDataAsset;

    @com.fasterxml.jackson.annotation.JsonProperty("stagingConnection")
    Connection stagingConnection;

    /**
     * Prefix for the staging DataAsset
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stagingPrefix")
    String stagingPrefix;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
