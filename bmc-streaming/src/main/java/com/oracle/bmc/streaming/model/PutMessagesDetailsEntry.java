/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming.model;

/**
 * Object that represents a message to emit to a stream. <br>
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
        builder = PutMessagesDetailsEntry.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PutMessagesDetailsEntry
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "value"})
    public PutMessagesDetailsEntry(byte[] key, byte[] value) {
        super();
        this.key = key;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The key of the message, expressed as a byte array up to 256 bytes in size. Messages with
         * the same key are stored in the same partition.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private byte[] key;

        /**
         * The key of the message, expressed as a byte array up to 256 bytes in size. Messages with
         * the same key are stored in the same partition.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(byte[] key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The message, expressed as a byte array up to 1 MiB in size. */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private byte[] value;

        /**
         * The message, expressed as a byte array up to 1 MiB in size.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(byte[] value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PutMessagesDetailsEntry build() {
            PutMessagesDetailsEntry model = new PutMessagesDetailsEntry(this.key, this.value);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PutMessagesDetailsEntry model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
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

    /**
     * The key of the message, expressed as a byte array up to 256 bytes in size. Messages with the
     * same key are stored in the same partition.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final byte[] key;

    /**
     * The key of the message, expressed as a byte array up to 256 bytes in size. Messages with the
     * same key are stored in the same partition.
     *
     * @return the value
     */
    public byte[] getKey() {
        return key;
    }

    /** The message, expressed as a byte array up to 1 MiB in size. */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final byte[] value;

    /**
     * The message, expressed as a byte array up to 1 MiB in size.
     *
     * @return the value
     */
    public byte[] getValue() {
        return value;
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
        sb.append("PutMessagesDetailsEntry(");
        sb.append("super=").append(super.toString());
        sb.append("key=")
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
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PutMessagesDetailsEntry)) {
            return false;
        }

        PutMessagesDetailsEntry other = (PutMessagesDetailsEntry) o;
        return java.util.Arrays.equals(this.key, other.key)
                && java.util.Arrays.equals(this.value, other.value)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + java.util.Arrays.hashCode(this.key);
        result = (result * PRIME) + java.util.Arrays.hashCode(this.value);
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
