/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch.model;

/**
 * The bucket used for the Object Storage target.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ObjectStorageTargetDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "kind"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ObjectStorageTargetDetails extends TargetDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectNamePrefix")
        private String objectNamePrefix;

        public Builder objectNamePrefix(String objectNamePrefix) {
            this.objectNamePrefix = objectNamePrefix;
            this.__explicitlySet__.add("objectNamePrefix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("batchRolloverSizeInMBs")
        private Integer batchRolloverSizeInMBs;

        public Builder batchRolloverSizeInMBs(Integer batchRolloverSizeInMBs) {
            this.batchRolloverSizeInMBs = batchRolloverSizeInMBs;
            this.__explicitlySet__.add("batchRolloverSizeInMBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("batchRolloverTimeInMs")
        private Integer batchRolloverTimeInMs;

        public Builder batchRolloverTimeInMs(Integer batchRolloverTimeInMs) {
            this.batchRolloverTimeInMs = batchRolloverTimeInMs;
            this.__explicitlySet__.add("batchRolloverTimeInMs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ObjectStorageTargetDetails build() {
            ObjectStorageTargetDetails __instance__ =
                    new ObjectStorageTargetDetails(
                            namespace,
                            bucketName,
                            objectNamePrefix,
                            batchRolloverSizeInMBs,
                            batchRolloverTimeInMs);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ObjectStorageTargetDetails o) {
            Builder copiedBuilder =
                    namespace(o.getNamespace())
                            .bucketName(o.getBucketName())
                            .objectNamePrefix(o.getObjectNamePrefix())
                            .batchRolloverSizeInMBs(o.getBatchRolloverSizeInMBs())
                            .batchRolloverTimeInMs(o.getBatchRolloverTimeInMs());

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
    public ObjectStorageTargetDetails(
            String namespace,
            String bucketName,
            String objectNamePrefix,
            Integer batchRolloverSizeInMBs,
            Integer batchRolloverTimeInMs) {
        super();
        this.namespace = namespace;
        this.bucketName = bucketName;
        this.objectNamePrefix = objectNamePrefix;
        this.batchRolloverSizeInMBs = batchRolloverSizeInMBs;
        this.batchRolloverTimeInMs = batchRolloverTimeInMs;
    }

    /**
     * The namespace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    String namespace;

    /**
     * The name of the bucket. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    String bucketName;

    /**
     * The prefix of the objects. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectNamePrefix")
    String objectNamePrefix;

    /**
     * The batch rollover size in megabytes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("batchRolloverSizeInMBs")
    Integer batchRolloverSizeInMBs;

    /**
     * The batch rollover time in milliseconds.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("batchRolloverTimeInMs")
    Integer batchRolloverTimeInMs;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
