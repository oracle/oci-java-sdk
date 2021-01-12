/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Properties to configure when writing to Oracle Autonomous Data Warehouse Cloud.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OracleAtpWriteAttributes.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class OracleAtpWriteAttributes {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stagingFileName")
        private String stagingFileName;

        public Builder stagingFileName(String stagingFileName) {
            this.stagingFileName = stagingFileName;
            this.__explicitlySet__.add("stagingFileName");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OracleAtpWriteAttributes build() {
            OracleAtpWriteAttributes __instance__ =
                    new OracleAtpWriteAttributes(
                            bucketName, stagingFileName, stagingDataAsset, stagingConnection);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OracleAtpWriteAttributes o) {
            Builder copiedBuilder =
                    bucketName(o.getBucketName())
                            .stagingFileName(o.getStagingFileName())
                            .stagingDataAsset(o.getStagingDataAsset())
                            .stagingConnection(o.getStagingConnection());

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

    /**
     * The bucket name for the attribute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    String bucketName;

    /**
     * The file name for the attribute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stagingFileName")
    String stagingFileName;

    @com.fasterxml.jackson.annotation.JsonProperty("stagingDataAsset")
    DataAsset stagingDataAsset;

    @com.fasterxml.jackson.annotation.JsonProperty("stagingConnection")
    Connection stagingConnection;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
