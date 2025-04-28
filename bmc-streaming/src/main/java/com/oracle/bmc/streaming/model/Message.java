/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming.model;

/**
 * A message in a stream. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Message.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Message extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** The name of the stream that the message belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("stream")
        private String stream;

        /**
         * The name of the stream that the message belongs to.
         *
         * @param stream the value to set
         * @return this builder
         */
        public Builder stream(String stream) {
            this.stream = stream;
            this.__explicitlySet__.add("stream");
            return this;
        }
        /** The ID of the partition where the message is stored. */
        @com.fasterxml.jackson.annotation.JsonProperty("partition")
        private String partition;

        /**
         * The ID of the partition where the message is stored.
         *
         * @param partition the value to set
         * @return this builder
         */
        public Builder partition(String partition) {
            this.partition = partition;
            this.__explicitlySet__.add("partition");
            return this;
        }
        /** The key associated with the message, expressed as a byte array. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private byte[] key;

        /**
         * The key associated with the message, expressed as a byte array.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(byte[] key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The value associated with the message, expressed as a byte array. */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private byte[] value;

        /**
         * The value associated with the message, expressed as a byte array.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(byte[] value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /** The offset of the message, which uniquely identifies it within the partition. */
        @com.fasterxml.jackson.annotation.JsonProperty("offset")
        private Long offset;

        /**
         * The offset of the message, which uniquely identifies it within the partition.
         *
         * @param offset the value to set
         * @return this builder
         */
        public Builder offset(Long offset) {
            this.offset = offset;
            this.__explicitlySet__.add("offset");
            return this;
        }
        /** The timestamp indicating when the server appended the message to the stream. */
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * The timestamp indicating when the server appended the message to the stream.
         *
         * @param timestamp the value to set
         * @return this builder
         */
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Message build() {
            Message model =
                    new Message(
                            this.stream,
                            this.partition,
                            this.key,
                            this.value,
                            this.offset,
                            this.timestamp);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Message model) {
            if (model.wasPropertyExplicitlySet("stream")) {
                this.stream(model.getStream());
            }
            if (model.wasPropertyExplicitlySet("partition")) {
                this.partition(model.getPartition());
            }
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("offset")) {
                this.offset(model.getOffset());
            }
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
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

    /** The name of the stream that the message belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("stream")
    private final String stream;

    /**
     * The name of the stream that the message belongs to.
     *
     * @return the value
     */
    public String getStream() {
        return stream;
    }

    /** The ID of the partition where the message is stored. */
    @com.fasterxml.jackson.annotation.JsonProperty("partition")
    private final String partition;

    /**
     * The ID of the partition where the message is stored.
     *
     * @return the value
     */
    public String getPartition() {
        return partition;
    }

    /** The key associated with the message, expressed as a byte array. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final byte[] key;

    /**
     * The key associated with the message, expressed as a byte array.
     *
     * @return the value
     */
    public byte[] getKey() {
        return key;
    }

    /** The value associated with the message, expressed as a byte array. */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final byte[] value;

    /**
     * The value associated with the message, expressed as a byte array.
     *
     * @return the value
     */
    public byte[] getValue() {
        return value;
    }

    /** The offset of the message, which uniquely identifies it within the partition. */
    @com.fasterxml.jackson.annotation.JsonProperty("offset")
    private final Long offset;

    /**
     * The offset of the message, which uniquely identifies it within the partition.
     *
     * @return the value
     */
    public Long getOffset() {
        return offset;
    }

    /** The timestamp indicating when the server appended the message to the stream. */
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * The timestamp indicating when the server appended the message to the stream.
     *
     * @return the value
     */
    public java.util.Date getTimestamp() {
        return timestamp;
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
        sb.append("Message(");
        sb.append("super=").append(super.toString());
        sb.append("stream=").append(String.valueOf(this.stream));
        sb.append(", partition=").append(String.valueOf(this.partition));
        sb.append(", key=")
                .append(
                        (includeByteArrayContents
                                ? java.util.Arrays.toString(this.key)
                                : (String.valueOf(this.key)
                                        + (this.key != null
                                                ? " (byte[" + this.key.length + "])"
                                                : ""))));
        sb.append(", value=")
                .append(
                        (includeByteArrayContents
                                ? java.util.Arrays.toString(this.value)
                                : (String.valueOf(this.value)
                                        + (this.value != null
                                                ? " (byte[" + this.value.length + "])"
                                                : ""))));
        sb.append(", offset=").append(String.valueOf(this.offset));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
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
                && java.util.Arrays.equals(this.key, other.key)
                && java.util.Arrays.equals(this.value, other.value)
                && java.util.Objects.equals(this.offset, other.offset)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.stream == null ? 43 : this.stream.hashCode());
        result = (result * PRIME) + (this.partition == null ? 43 : this.partition.hashCode());
        result = (result * PRIME) + java.util.Arrays.hashCode(this.key);
        result = (result * PRIME) + java.util.Arrays.hashCode(this.value);
        result = (result * PRIME) + (this.offset == null ? 43 : this.offset.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
