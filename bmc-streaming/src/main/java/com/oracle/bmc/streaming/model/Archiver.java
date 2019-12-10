/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.streaming.model;

/**
 * Represents the current state of the stream archiver.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Archiver.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class Archiver {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("error")
        private ArchiverError error;

        public Builder error(ArchiverError error) {
            this.error = error;
            this.__explicitlySet__.add("error");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Archiver build() {
            Archiver __instance__ =
                    new Archiver(
                            timeCreated,
                            lifecycleState,
                            bucketName,
                            useExistingBucket,
                            startPosition,
                            batchRolloverSizeInMBs,
                            batchRolloverTimeInSeconds,
                            error);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Archiver o) {
            Builder copiedBuilder =
                    timeCreated(o.getTimeCreated())
                            .lifecycleState(o.getLifecycleState())
                            .bucketName(o.getBucketName())
                            .useExistingBucket(o.getUseExistingBucket())
                            .startPosition(o.getStartPosition())
                            .batchRolloverSizeInMBs(o.getBatchRolloverSizeInMBs())
                            .batchRolloverTimeInSeconds(o.getBatchRolloverTimeInSeconds())
                            .error(o.getError());

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
     * Time when the resource was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;
    /**
     * The state of the stream archiver.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Creating("CREATING"),
        Stopped("STOPPED"),
        Starting("STARTING"),
        Running("RUNNING"),
        Stopping("STOPPING"),
        Updating("UPDATING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The state of the stream archiver.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

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

    @com.fasterxml.jackson.annotation.JsonProperty("error")
    ArchiverError error;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
