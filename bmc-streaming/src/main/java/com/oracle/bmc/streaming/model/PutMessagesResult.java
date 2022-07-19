/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming.model;

/**
 * The response to a {@link #putMessages(PutMessagesRequest) putMessages} request. It indicates the number
 * of failed messages as well as an array of results for successful and failed messages.
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
    builder = PutMessagesResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PutMessagesResult {
    @Deprecated
    @java.beans.ConstructorProperties({"failures", "entries"})
    public PutMessagesResult(Integer failures, java.util.List<PutMessagesResultEntry> entries) {
        super();
        this.failures = failures;
        this.entries = entries;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The number of messages that failed to be added to the stream.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("failures")
        private Integer failures;

        /**
         * The number of messages that failed to be added to the stream.
         * @param failures the value to set
         * @return this builder
         **/
        public Builder failures(Integer failures) {
            this.failures = failures;
            this.__explicitlySet__.add("failures");
            return this;
        }
        /**
         * An array of items representing the result of each message.
         * The order is guaranteed to be the same as in the {@code PutMessagesDetails} object.
         * If a message was successfully appended to the stream, the entry includes the {@code offset}, {@code partition}, and {@code timestamp}.
         * If a message failed to be appended to the stream, the entry includes the {@code error} and {@code errorMessage}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entries")
        private java.util.List<PutMessagesResultEntry> entries;

        /**
         * An array of items representing the result of each message.
         * The order is guaranteed to be the same as in the {@code PutMessagesDetails} object.
         * If a message was successfully appended to the stream, the entry includes the {@code offset}, {@code partition}, and {@code timestamp}.
         * If a message failed to be appended to the stream, the entry includes the {@code error} and {@code errorMessage}.
         *
         * @param entries the value to set
         * @return this builder
         **/
        public Builder entries(java.util.List<PutMessagesResultEntry> entries) {
            this.entries = entries;
            this.__explicitlySet__.add("entries");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PutMessagesResult build() {
            PutMessagesResult __instance__ = new PutMessagesResult(failures, entries);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PutMessagesResult o) {
            Builder copiedBuilder = failures(o.getFailures()).entries(o.getEntries());

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
     * The number of messages that failed to be added to the stream.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failures")
    private final Integer failures;

    /**
     * The number of messages that failed to be added to the stream.
     * @return the value
     **/
    public Integer getFailures() {
        return failures;
    }

    /**
     * An array of items representing the result of each message.
     * The order is guaranteed to be the same as in the {@code PutMessagesDetails} object.
     * If a message was successfully appended to the stream, the entry includes the {@code offset}, {@code partition}, and {@code timestamp}.
     * If a message failed to be appended to the stream, the entry includes the {@code error} and {@code errorMessage}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entries")
    private final java.util.List<PutMessagesResultEntry> entries;

    /**
     * An array of items representing the result of each message.
     * The order is guaranteed to be the same as in the {@code PutMessagesDetails} object.
     * If a message was successfully appended to the stream, the entry includes the {@code offset}, {@code partition}, and {@code timestamp}.
     * If a message failed to be appended to the stream, the entry includes the {@code error} and {@code errorMessage}.
     *
     * @return the value
     **/
    public java.util.List<PutMessagesResultEntry> getEntries() {
        return entries;
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
        sb.append("PutMessagesResult(");
        sb.append("failures=").append(String.valueOf(this.failures));
        sb.append(", entries=").append(String.valueOf(this.entries));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PutMessagesResult)) {
            return false;
        }

        PutMessagesResult other = (PutMessagesResult) o;
        return java.util.Objects.equals(this.failures, other.failures)
                && java.util.Objects.equals(this.entries, other.entries)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.failures == null ? 43 : this.failures.hashCode());
        result = (result * PRIME) + (this.entries == null ? 43 : this.entries.hashCode());
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
