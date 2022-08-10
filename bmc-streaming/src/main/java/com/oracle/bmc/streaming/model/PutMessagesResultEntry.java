/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming.model;

/**
 * Represents the result of a {@link #putMessages(PutMessagesRequest) putMessages} request, whether it was successful or not.
 * If a message was successfully appended to the stream, the entry includes the {@code offset}, {@code partition}, and {@code timestamp}.
 * If the message failed to be appended to the stream, the entry includes the {@code error} and {@code errorMessage}.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PutMessagesResultEntry.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PutMessagesResultEntry
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"partition", "offset", "timestamp", "error", "errorMessage"})
    public PutMessagesResultEntry(
            String partition,
            Long offset,
            java.util.Date timestamp,
            String error,
            String errorMessage) {
        super();
        this.partition = partition;
        this.offset = offset;
        this.timestamp = timestamp;
        this.error = error;
        this.errorMessage = errorMessage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The ID of the partition where the message was stored.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("partition")
        private String partition;

        /**
         * The ID of the partition where the message was stored.
         * @param partition the value to set
         * @return this builder
         **/
        public Builder partition(String partition) {
            this.partition = partition;
            this.__explicitlySet__.add("partition");
            return this;
        }
        /**
         * The offset of the message in the partition.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("offset")
        private Long offset;

        /**
         * The offset of the message in the partition.
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
        /**
         * The error code, in case the message was not successfully appended to the stream.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("error")
        private String error;

        /**
         * The error code, in case the message was not successfully appended to the stream.
         * @param error the value to set
         * @return this builder
         **/
        public Builder error(String error) {
            this.error = error;
            this.__explicitlySet__.add("error");
            return this;
        }
        /**
         * A human-readable error message associated with the error code.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        /**
         * A human-readable error message associated with the error code.
         * @param errorMessage the value to set
         * @return this builder
         **/
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PutMessagesResultEntry build() {
            PutMessagesResultEntry model =
                    new PutMessagesResultEntry(
                            this.partition,
                            this.offset,
                            this.timestamp,
                            this.error,
                            this.errorMessage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PutMessagesResultEntry model) {
            if (model.wasPropertyExplicitlySet("partition")) {
                this.partition(model.getPartition());
            }
            if (model.wasPropertyExplicitlySet("offset")) {
                this.offset(model.getOffset());
            }
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
            }
            if (model.wasPropertyExplicitlySet("error")) {
                this.error(model.getError());
            }
            if (model.wasPropertyExplicitlySet("errorMessage")) {
                this.errorMessage(model.getErrorMessage());
            }
            return this;
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
     * The ID of the partition where the message was stored.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partition")
    private final String partition;

    /**
     * The ID of the partition where the message was stored.
     * @return the value
     **/
    public String getPartition() {
        return partition;
    }

    /**
     * The offset of the message in the partition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offset")
    private final Long offset;

    /**
     * The offset of the message in the partition.
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

    /**
     * The error code, in case the message was not successfully appended to the stream.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("error")
    private final String error;

    /**
     * The error code, in case the message was not successfully appended to the stream.
     * @return the value
     **/
    public String getError() {
        return error;
    }

    /**
     * A human-readable error message associated with the error code.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

    /**
     * A human-readable error message associated with the error code.
     * @return the value
     **/
    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PutMessagesResultEntry(");
        sb.append("super=").append(super.toString());
        sb.append("partition=").append(String.valueOf(this.partition));
        sb.append(", offset=").append(String.valueOf(this.offset));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", error=").append(String.valueOf(this.error));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PutMessagesResultEntry)) {
            return false;
        }

        PutMessagesResultEntry other = (PutMessagesResultEntry) o;
        return java.util.Objects.equals(this.partition, other.partition)
                && java.util.Objects.equals(this.offset, other.offset)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.error, other.error)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.partition == null ? 43 : this.partition.hashCode());
        result = (result * PRIME) + (this.offset == null ? 43 : this.offset.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + (this.error == null ? 43 : this.error.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
