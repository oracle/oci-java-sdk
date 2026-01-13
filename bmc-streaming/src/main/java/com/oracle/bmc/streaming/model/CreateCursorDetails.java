/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming.model;

/**
 * Object used to create a cursor to consume messages in a stream. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateCursorDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateCursorDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"partition", "type", "offset", "time"})
    public CreateCursorDetails(String partition, Type type, Long offset, java.util.Date time) {
        super();
        this.partition = partition;
        this.type = type;
        this.offset = offset;
        this.time = time;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The partition to get messages from. */
        @com.fasterxml.jackson.annotation.JsonProperty("partition")
        private String partition;

        /**
         * The partition to get messages from.
         *
         * @param partition the value to set
         * @return this builder
         */
        public Builder partition(String partition) {
            this.partition = partition;
            this.__explicitlySet__.add("partition");
            return this;
        }
        /**
         * The type of cursor, which determines the starting point from which the stream will be
         * consumed:
         *
         * <p>- {@code AFTER_OFFSET:} The partition position immediately following the offset you
         * specify. (Offsets are assigned when you successfully append a message to a partition in a
         * stream.) - {@code AT_OFFSET:} The exact partition position indicated by the offset you
         * specify. - {@code AT_TIME:} A specific point in time. - {@code LATEST:} The most recent
         * message in the partition that was added after the cursor was created. - {@code
         * TRIM_HORIZON:} The oldest message in the partition that is within the retention period
         * window.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of cursor, which determines the starting point from which the stream will be
         * consumed:
         *
         * <p>- {@code AFTER_OFFSET:} The partition position immediately following the offset you
         * specify. (Offsets are assigned when you successfully append a message to a partition in a
         * stream.) - {@code AT_OFFSET:} The exact partition position indicated by the offset you
         * specify. - {@code AT_TIME:} A specific point in time. - {@code LATEST:} The most recent
         * message in the partition that was added after the cursor was created. - {@code
         * TRIM_HORIZON:} The oldest message in the partition that is within the retention period
         * window.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The offset to consume from if the cursor type is {@code AT_OFFSET} or {@code
         * AFTER_OFFSET}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("offset")
        private Long offset;

        /**
         * The offset to consume from if the cursor type is {@code AT_OFFSET} or {@code
         * AFTER_OFFSET}.
         *
         * @param offset the value to set
         * @return this builder
         */
        public Builder offset(Long offset) {
            this.offset = offset;
            this.__explicitlySet__.add("offset");
            return this;
        }
        /**
         * The time to consume from if the cursor type is {@code AT_TIME}, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("time")
        private java.util.Date time;

        /**
         * The time to consume from if the cursor type is {@code AT_TIME}, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * @param time the value to set
         * @return this builder
         */
        public Builder time(java.util.Date time) {
            this.time = time;
            this.__explicitlySet__.add("time");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCursorDetails build() {
            CreateCursorDetails model =
                    new CreateCursorDetails(this.partition, this.type, this.offset, this.time);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCursorDetails model) {
            if (model.wasPropertyExplicitlySet("partition")) {
                this.partition(model.getPartition());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("offset")) {
                this.offset(model.getOffset());
            }
            if (model.wasPropertyExplicitlySet("time")) {
                this.time(model.getTime());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The partition to get messages from. */
    @com.fasterxml.jackson.annotation.JsonProperty("partition")
    private final String partition;

    /**
     * The partition to get messages from.
     *
     * @return the value
     */
    public String getPartition() {
        return partition;
    }

    /**
     * The type of cursor, which determines the starting point from which the stream will be
     * consumed:
     *
     * <p>- {@code AFTER_OFFSET:} The partition position immediately following the offset you
     * specify. (Offsets are assigned when you successfully append a message to a partition in a
     * stream.) - {@code AT_OFFSET:} The exact partition position indicated by the offset you
     * specify. - {@code AT_TIME:} A specific point in time. - {@code LATEST:} The most recent
     * message in the partition that was added after the cursor was created. - {@code TRIM_HORIZON:}
     * The oldest message in the partition that is within the retention period window.
     */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
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
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };
    /**
     * The type of cursor, which determines the starting point from which the stream will be
     * consumed:
     *
     * <p>- {@code AFTER_OFFSET:} The partition position immediately following the offset you
     * specify. (Offsets are assigned when you successfully append a message to a partition in a
     * stream.) - {@code AT_OFFSET:} The exact partition position indicated by the offset you
     * specify. - {@code AT_TIME:} A specific point in time. - {@code LATEST:} The most recent
     * message in the partition that was added after the cursor was created. - {@code TRIM_HORIZON:}
     * The oldest message in the partition that is within the retention period window.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of cursor, which determines the starting point from which the stream will be
     * consumed:
     *
     * <p>- {@code AFTER_OFFSET:} The partition position immediately following the offset you
     * specify. (Offsets are assigned when you successfully append a message to a partition in a
     * stream.) - {@code AT_OFFSET:} The exact partition position indicated by the offset you
     * specify. - {@code AT_TIME:} A specific point in time. - {@code LATEST:} The most recent
     * message in the partition that was added after the cursor was created. - {@code TRIM_HORIZON:}
     * The oldest message in the partition that is within the retention period window.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /**
     * The offset to consume from if the cursor type is {@code AT_OFFSET} or {@code AFTER_OFFSET}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("offset")
    private final Long offset;

    /**
     * The offset to consume from if the cursor type is {@code AT_OFFSET} or {@code AFTER_OFFSET}.
     *
     * @return the value
     */
    public Long getOffset() {
        return offset;
    }

    /**
     * The time to consume from if the cursor type is {@code AT_TIME}, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("time")
    private final java.util.Date time;

    /**
     * The time to consume from if the cursor type is {@code AT_TIME}, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * @return the value
     */
    public java.util.Date getTime() {
        return time;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateCursorDetails(");
        sb.append("super=").append(super.toString());
        sb.append("partition=").append(String.valueOf(this.partition));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", offset=").append(String.valueOf(this.offset));
        sb.append(", time=").append(String.valueOf(this.time));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCursorDetails)) {
            return false;
        }

        CreateCursorDetails other = (CreateCursorDetails) o;
        return java.util.Objects.equals(this.partition, other.partition)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.offset, other.offset)
                && java.util.Objects.equals(this.time, other.time)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.partition == null ? 43 : this.partition.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.offset == null ? 43 : this.offset.hashCode());
        result = (result * PRIME) + (this.time == null ? 43 : this.time.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
