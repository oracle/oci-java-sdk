/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.streaming.model;

/**
 * Object used to create a cursor to consume messages in a stream.
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
    builder = CreateCursorDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateCursorDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("partition")
        private String partition;

        public Builder partition(String partition) {
            this.partition = partition;
            this.__explicitlySet__.add("partition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("offset")
        private Long offset;

        public Builder offset(Long offset) {
            this.offset = offset;
            this.__explicitlySet__.add("offset");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("time")
        private java.util.Date time;

        public Builder time(java.util.Date time) {
            this.time = time;
            this.__explicitlySet__.add("time");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCursorDetails build() {
            CreateCursorDetails __instance__ =
                    new CreateCursorDetails(partition, type, offset, time);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCursorDetails o) {
            Builder copiedBuilder =
                    partition(o.getPartition())
                            .type(o.getType())
                            .offset(o.getOffset())
                            .time(o.getTime());

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
     * The partition to get messages from.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partition")
    String partition;
    /**
     * The type of cursor, which determines the starting point from which the stream will be consumed:
     * <p>
     * - `AFTER_OFFSET:` The partition position immediately following the offset you specify. (Offsets are assigned when you successfully append a message to a partition in a stream.)
     * - `AT_OFFSET:` The exact partition position indicated by the offset you specify.
     * - `AT_TIME:` A specific point in time.
     * - `LATEST:` The most recent message in the partition that was added after the cursor was created.
     * - `TRIM_HORIZON:` The oldest message in the partition that is within the retention period window.
     *
     **/
    public enum Type {
        AfterOffset("AFTER_OFFSET"),
        AtOffset("AT_OFFSET"),
        AtTime("AT_TIME"),
        Latest("LATEST"),
        TrimHorizon("TRIM_HORIZON"),
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new RuntimeException("Invalid Type: " + key);
        }
    };
    /**
     * The type of cursor, which determines the starting point from which the stream will be consumed:
     * <p>
     * - `AFTER_OFFSET:` The partition position immediately following the offset you specify. (Offsets are assigned when you successfully append a message to a partition in a stream.)
     * - `AT_OFFSET:` The exact partition position indicated by the offset you specify.
     * - `AT_TIME:` A specific point in time.
     * - `LATEST:` The most recent message in the partition that was added after the cursor was created.
     * - `TRIM_HORIZON:` The oldest message in the partition that is within the retention period window.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    Type type;

    /**
     * The offset to consume from if the cursor type is `AT_OFFSET` or `AFTER_OFFSET`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offset")
    Long offset;

    /**
     * The time to consume from if the cursor type is `AT_TIME`, expressed in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("time")
    java.util.Date time;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
