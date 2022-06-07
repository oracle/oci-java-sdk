/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Definition of a trace snapshot object.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TraceSnapshot.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TraceSnapshot {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "timeStarted",
        "timeEnded",
        "traceSnapshotDetails",
        "spanSnapshots"
    })
    public TraceSnapshot(
            String key,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            java.util.List<SnapshotDetail> traceSnapshotDetails,
            java.util.List<SpanSnapshot> spanSnapshots) {
        super();
        this.key = key;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.traceSnapshotDetails = traceSnapshotDetails;
        this.spanSnapshots = spanSnapshots;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
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

        @com.fasterxml.jackson.annotation.JsonProperty("traceSnapshotDetails")
        private java.util.List<SnapshotDetail> traceSnapshotDetails;

        public Builder traceSnapshotDetails(java.util.List<SnapshotDetail> traceSnapshotDetails) {
            this.traceSnapshotDetails = traceSnapshotDetails;
            this.__explicitlySet__.add("traceSnapshotDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("spanSnapshots")
        private java.util.List<SpanSnapshot> spanSnapshots;

        public Builder spanSnapshots(java.util.List<SpanSnapshot> spanSnapshots) {
            this.spanSnapshots = spanSnapshots;
            this.__explicitlySet__.add("spanSnapshots");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TraceSnapshot build() {
            TraceSnapshot __instance__ =
                    new TraceSnapshot(
                            key, timeStarted, timeEnded, traceSnapshotDetails, spanSnapshots);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TraceSnapshot o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .timeStarted(o.getTimeStarted())
                            .timeEnded(o.getTimeEnded())
                            .traceSnapshotDetails(o.getTraceSnapshotDetails())
                            .spanSnapshots(o.getSpanSnapshots());

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
     * Unique identifier (traceId) for the trace that represents the span set.  Note that this field is
     * defined as traceKey in the API and it maps to the traceId in the trace data in Application Performance
     * Monitoring.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    public String getKey() {
        return key;
    }

    /**
     * Start time of the trace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * End time of the trace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /**
     * Trace snapshots properties.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("traceSnapshotDetails")
    private final java.util.List<SnapshotDetail> traceSnapshotDetails;

    public java.util.List<SnapshotDetail> getTraceSnapshotDetails() {
        return traceSnapshotDetails;
    }

    /**
     * List of spans.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("spanSnapshots")
    private final java.util.List<SpanSnapshot> spanSnapshots;

    public java.util.List<SpanSnapshot> getSpanSnapshots() {
        return spanSnapshots;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TraceSnapshot(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", traceSnapshotDetails=").append(String.valueOf(this.traceSnapshotDetails));
        sb.append(", spanSnapshots=").append(String.valueOf(this.spanSnapshots));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TraceSnapshot)) {
            return false;
        }

        TraceSnapshot other = (TraceSnapshot) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.traceSnapshotDetails, other.traceSnapshotDetails)
                && java.util.Objects.equals(this.spanSnapshots, other.spanSnapshots)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.traceSnapshotDetails == null
                                ? 43
                                : this.traceSnapshotDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.spanSnapshots == null ? 43 : this.spanSnapshots.hashCode());
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
