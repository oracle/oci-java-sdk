/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming.model;

/**
 * A message in a stream.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Message.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Message {
    @Deprecated
    @java.beans.ConstructorProperties({
        "stream",
        "partition",
        "key",
        "value",
        "offset",
        "timestamp"
    })
    public Message(
            String stream,
            String partition,
            byte[] key,
            byte[] value,
            Long offset,
            java.util.Date timestamp) {
        super();
        this.stream = stream;
        this.partition = partition;
        this.key = key;
        this.value = value;
        this.offset = offset;
        this.timestamp = timestamp;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the stream that the message belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stream")
        private String stream;

        /**
         * The name of the stream that the message belongs to.
         * @param stream the value to set
         * @return this builder
         **/
        public Builder stream(String stream) {
            this.stream = stream;
            this.__explicitlySet__.add("stream");
            return this;
        }
        /**
         * The ID of the partition where the message is stored.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("partition")
        private String partition;

        /**
         * The ID of the partition where the message is stored.
         * @param partition the value to set
         * @return this builder
         **/
        public Builder partition(String partition) {
            this.partition = partition;
            this.__explicitlySet__.add("partition");
            return this;
        }
        /**
         * The key associated with the message, expressed as a byte array.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private byte[] key;

        /**
         * The key associated with the message, expressed as a byte array.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(byte[] key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The value associated with the message, expressed as a byte array.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private byte[] value;

        /**
         * The value associated with the message, expressed as a byte array.
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(byte[] value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * The offset of the message, which uniquely identifies it within the partition.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("offset")
        private Long offset;

        /**
         * The offset of the message, which uniquely identifies it within the partition.
         * @param offset the value to set
         * @return this builder
         **/
        public Builder offset(Long offset) {
            this.offset = offset;
            this.__explicitlySet__.add("offset");
            return this;
        }
        /**
         * The timestamp indicating when the server appended the message to the stream.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * The timestamp indicating when the server appended the message to the stream.
         * @param timestamp the value to set
         * @return this builder
         **/
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Message build() {
            Message __instance__ = new Message(stream, partition, key, value, offset, timestamp);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Message o) {
            Builder copiedBuilder =
                    stream(o.getStream())
                            .partition(o.getPartition())
                            .key(o.getKey())
                            .value(o.getValue())
                            .offset(o.getOffset())
                            .timestamp(o.getTimestamp());

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

    /**
     * The name of the stream that the message belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stream")
    private final String stream;

    /**
     * The name of the stream that the message belongs to.
     * @return the value
     **/
    public String getStream() {
        return stream;
    }

    /**
     * The ID of the partition where the message is stored.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partition")
    private final String partition;

    /**
     * The ID of the partition where the message is stored.
     * @return the value
     **/
    public String getPartition() {
        return partition;
    }

    /**
     * The key associated with the message, expressed as a byte array.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final byte[] key;

    /**
     * The key associated with the message, expressed as a byte array.
     * @return the value
     **/
    public byte[] getKey() {
        return key;
    }

    /**
     * The value associated with the message, expressed as a byte array.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final byte[] value;

    /**
     * The value associated with the message, expressed as a byte array.
     * @return the value
     **/
    public byte[] getValue() {
        return value;
    }

    /**
     * The offset of the message, which uniquely identifies it within the partition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offset")
    private final Long offset;

    /**
     * The offset of the message, which uniquely identifies it within the partition.
     * @return the value
     **/
    public Long getOffset() {
        return offset;
    }

    /**
     * The timestamp indicating when the server appended the message to the stream.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * The timestamp indicating when the server appended the message to the stream.
     * @return the value
     **/
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Message(");
        sb.append("stream=").append(String.valueOf(this.stream));
        sb.append(", partition=").append(String.valueOf(this.partition));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", offset=").append(String.valueOf(this.offset));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Message)) {
            return false;
        }

        Message other = (Message) o;
        return java.util.Objects.equals(this.stream, other.stream)
                && java.util.Objects.equals(this.partition, other.partition)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.offset, other.offset)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.stream == null ? 43 : this.stream.hashCode());
        result = (result * PRIME) + (this.partition == null ? 43 : this.partition.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.offset == null ? 43 : this.offset.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
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
