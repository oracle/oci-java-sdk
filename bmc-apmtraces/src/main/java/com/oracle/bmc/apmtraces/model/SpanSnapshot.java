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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SpanSnapshot.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SpanSnapshot {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "spanName",
        "timeStarted",
        "timeEnded",
        "spanSnapshotDetails",
        "threadSnapshots",
        "children"
    })
    public SpanSnapshot(
            String key,
            String spanName,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            java.util.List<SnapshotDetail> spanSnapshotDetails,
            java.util.List<ThreadSnapshot> threadSnapshots,
            java.util.List<SpanSnapshot> children) {
        super();
        this.key = key;
        this.spanName = spanName;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.spanSnapshotDetails = spanSnapshotDetails;
        this.threadSnapshots = threadSnapshots;
        this.children = children;
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Unique identifier (spanId) for the trace span.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    public String getKey() {
        return key;
    }

    /**
     * Span name associated with the trace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("spanName")
    private final String spanName;

    public String getSpanName() {
        return spanName;
    }

    /**
     * Start time of the span.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * End time of the span.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /**
     * Span snapshots properties.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("spanSnapshotDetails")
    private final java.util.List<SnapshotDetail> spanSnapshotDetails;

    public java.util.List<SnapshotDetail> getSpanSnapshotDetails() {
        return spanSnapshotDetails;
    }

    /**
     * Thread snapshots.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("threadSnapshots")
    private final java.util.List<ThreadSnapshot> threadSnapshots;

    public java.util.List<ThreadSnapshot> getThreadSnapshots() {
        return threadSnapshots;
    }

    /**
     * An array of child span snapshots.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("children")
    private final java.util.List<SpanSnapshot> children;

    public java.util.List<SpanSnapshot> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SpanSnapshot(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", spanName=").append(String.valueOf(this.spanName));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", spanSnapshotDetails=").append(String.valueOf(this.spanSnapshotDetails));
        sb.append(", threadSnapshots=").append(String.valueOf(this.threadSnapshots));
        sb.append(", children=").append(String.valueOf(this.children));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SpanSnapshot)) {
            return false;
        }

        SpanSnapshot other = (SpanSnapshot) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.spanName, other.spanName)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.spanSnapshotDetails, other.spanSnapshotDetails)
                && java.util.Objects.equals(this.threadSnapshots, other.threadSnapshots)
                && java.util.Objects.equals(this.children, other.children)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.spanName == null ? 43 : this.spanName.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.spanSnapshotDetails == null
                                ? 43
                                : this.spanSnapshotDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.threadSnapshots == null ? 43 : this.threadSnapshots.hashCode());
        result = (result * PRIME) + (this.children == null ? 43 : this.children.hashCode());
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
