/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PutMessagesResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class PutMessagesResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("failures")
        private Integer failures;

        public Builder failures(Integer failures) {
            this.failures = failures;
            this.__explicitlySet__.add("failures");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entries")
        private java.util.List<PutMessagesResultEntry> entries;

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

    /**
     * The number of messages that failed to be added to the stream.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failures")
    Integer failures;

    /**
     * An array of items representing the result of each message.
     * The order is guaranteed to be the same as in the `PutMessagesDetails` object.
     * If a message was successfully appended to the stream, the entry includes the `offset`, `partition`, and `timestamp`.
     * If a message failed to be appended to the stream, the entry includes the `error` and `errorMessage`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entries")
    java.util.List<PutMessagesResultEntry> entries;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
