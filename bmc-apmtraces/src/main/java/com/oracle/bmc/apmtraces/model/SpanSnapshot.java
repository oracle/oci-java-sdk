/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Definition of a span snapshot object.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SpanSnapshot.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SpanSnapshot {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("spanName")
        private String spanName;

        public Builder spanName(String spanName) {
            this.spanName = spanName;
            this.__explicitlySet__.add("spanName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("spanSnapshotDetails")
        private java.util.List<SnapshotDetail> spanSnapshotDetails;

        public Builder spanSnapshotDetails(java.util.List<SnapshotDetail> spanSnapshotDetails) {
            this.spanSnapshotDetails = spanSnapshotDetails;
            this.__explicitlySet__.add("spanSnapshotDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("threadSnapshots")
        private java.util.List<ThreadSnapshot> threadSnapshots;

        public Builder threadSnapshots(java.util.List<ThreadSnapshot> threadSnapshots) {
            this.threadSnapshots = threadSnapshots;
            this.__explicitlySet__.add("threadSnapshots");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("children")
        private java.util.List<SpanSnapshot> children;

        public Builder children(java.util.List<SpanSnapshot> children) {
            this.children = children;
            this.__explicitlySet__.add("children");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SpanSnapshot build() {
            SpanSnapshot __instance__ =
                    new SpanSnapshot(
                            key,
                            spanName,
                            timeStarted,
                            timeEnded,
                            spanSnapshotDetails,
                            threadSnapshots,
                            children);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SpanSnapshot o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .spanName(o.getSpanName())
                            .timeStarted(o.getTimeStarted())
                            .timeEnded(o.getTimeEnded())
                            .spanSnapshotDetails(o.getSpanSnapshotDetails())
                            .threadSnapshots(o.getThreadSnapshots())
                            .children(o.getChildren());

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
     * Unique identifier (spanId) for the trace span.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * Span name associated with the trace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("spanName")
    String spanName;

    /**
     * Start time of the span.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    java.util.Date timeStarted;

    /**
     * End time of the span.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    java.util.Date timeEnded;

    /**
     * Span snapshots properties.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("spanSnapshotDetails")
    java.util.List<SnapshotDetail> spanSnapshotDetails;

    /**
     * Thread snapshots.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("threadSnapshots")
    java.util.List<ThreadSnapshot> threadSnapshots;

    /**
     * An array of child span snapshots.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("children")
    java.util.List<SpanSnapshot> children;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
