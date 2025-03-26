/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
public final class TraceSnapshot extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
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
        /**
         * Unique identifier (traceId) for the trace that represents the span set.  Note that this field is
         * defined as traceKey in the API and it maps to the traceId in the trace data in Application Performance
         * Monitoring.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique identifier (traceId) for the trace that represents the span set.  Note that this field is
         * defined as traceKey in the API and it maps to the traceId in the trace data in Application Performance
         * Monitoring.
         *
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * Start time of the trace.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * Start time of the trace.
         *
         * @param timeStarted the value to set
         * @return this builder
         **/
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * End time of the trace.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * End time of the trace.
         *
         * @param timeEnded the value to set
         * @return this builder
         **/
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /**
         * Trace snapshots properties.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("traceSnapshotDetails")
        private java.util.List<SnapshotDetail> traceSnapshotDetails;

        /**
         * Trace snapshots properties.
         *
         * @param traceSnapshotDetails the value to set
         * @return this builder
         **/
        public Builder traceSnapshotDetails(java.util.List<SnapshotDetail> traceSnapshotDetails) {
            this.traceSnapshotDetails = traceSnapshotDetails;
            this.__explicitlySet__.add("traceSnapshotDetails");
            return this;
        }
        /**
         * List of spans.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("spanSnapshots")
        private java.util.List<SpanSnapshot> spanSnapshots;

        /**
         * List of spans.
         *
         * @param spanSnapshots the value to set
         * @return this builder
         **/
        public Builder spanSnapshots(java.util.List<SpanSnapshot> spanSnapshots) {
            this.spanSnapshots = spanSnapshots;
            this.__explicitlySet__.add("spanSnapshots");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TraceSnapshot build() {
            TraceSnapshot model =
                    new TraceSnapshot(
                            this.key,
                            this.timeStarted,
                            this.timeEnded,
                            this.traceSnapshotDetails,
                            this.spanSnapshots);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TraceSnapshot model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeEnded")) {
                this.timeEnded(model.getTimeEnded());
            }
            if (model.wasPropertyExplicitlySet("traceSnapshotDetails")) {
                this.traceSnapshotDetails(model.getTraceSnapshotDetails());
            }
            if (model.wasPropertyExplicitlySet("spanSnapshots")) {
                this.spanSnapshots(model.getSpanSnapshots());
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
     * Unique identifier (traceId) for the trace that represents the span set.  Note that this field is
     * defined as traceKey in the API and it maps to the traceId in the trace data in Application Performance
     * Monitoring.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique identifier (traceId) for the trace that represents the span set.  Note that this field is
     * defined as traceKey in the API and it maps to the traceId in the trace data in Application Performance
     * Monitoring.
     *
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * Start time of the trace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * Start time of the trace.
     *
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * End time of the trace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * End time of the trace.
     *
     * @return the value
     **/
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /**
     * Trace snapshots properties.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("traceSnapshotDetails")
    private final java.util.List<SnapshotDetail> traceSnapshotDetails;

    /**
     * Trace snapshots properties.
     *
     * @return the value
     **/
    public java.util.List<SnapshotDetail> getTraceSnapshotDetails() {
        return traceSnapshotDetails;
    }

    /**
     * List of spans.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("spanSnapshots")
    private final java.util.List<SpanSnapshot> spanSnapshots;

    /**
     * List of spans.
     *
     * @return the value
     **/
    public java.util.List<SpanSnapshot> getSpanSnapshots() {
        return spanSnapshots;
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
        sb.append("TraceSnapshot(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", traceSnapshotDetails=").append(String.valueOf(this.traceSnapshotDetails));
        sb.append(", spanSnapshots=").append(String.valueOf(this.spanSnapshots));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
