/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.streaming.model;

/**
 * Represents the parameters of the stream archiver.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateArchiverDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateArchiverDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("useExistingBucket")
        private Boolean useExistingBucket;

        public Builder useExistingBucket(Boolean useExistingBucket) {
            this.useExistingBucket = useExistingBucket;
            this.__explicitlySet__.add("useExistingBucket");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("startPosition")
        private ArchiverStartPosition startPosition;

        public Builder startPosition(ArchiverStartPosition startPosition) {
            this.startPosition = startPosition;
            this.__explicitlySet__.add("startPosition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("batchRolloverSizeInMBs")
        private Integer batchRolloverSizeInMBs;

        public Builder batchRolloverSizeInMBs(Integer batchRolloverSizeInMBs) {
            this.batchRolloverSizeInMBs = batchRolloverSizeInMBs;
            this.__explicitlySet__.add("batchRolloverSizeInMBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("batchRolloverTimeInSeconds")
        private Integer batchRolloverTimeInSeconds;

        public Builder batchRolloverTimeInSeconds(Integer batchRolloverTimeInSeconds) {
            this.batchRolloverTimeInSeconds = batchRolloverTimeInSeconds;
            this.__explicitlySet__.add("batchRolloverTimeInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateArchiverDetails build() {
            CreateArchiverDetails __instance__ =
                    new CreateArchiverDetails(
                            bucketName,
                            useExistingBucket,
                            startPosition,
                            batchRolloverSizeInMBs,
                            batchRolloverTimeInSeconds);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateArchiverDetails o) {
            Builder copiedBuilder =
                    bucketName(o.getBucketName())
                            .useExistingBucket(o.getUseExistingBucket())
                            .startPosition(o.getStartPosition())
                            .batchRolloverSizeInMBs(o.getBatchRolloverSizeInMBs())
                            .batchRolloverTimeInSeconds(o.getBatchRolloverTimeInSeconds());

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
     * The name of the bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    String bucketName;

    /**
     * The flag to create a new bucket or use existing one.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("useExistingBucket")
    Boolean useExistingBucket;

    /**
     * The start message.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startPosition")
    ArchiverStartPosition startPosition;

    /**
     * The batch rollover size in megabytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("batchRolloverSizeInMBs")
    Integer batchRolloverSizeInMBs;

    /**
     * The rollover time in seconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("batchRolloverTimeInSeconds")
    Integer batchRolloverTimeInSeconds;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
