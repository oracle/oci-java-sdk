/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Thread snapshot.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ThreadSnapshot.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ThreadSnapshot {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeStamp")
        private java.util.Date timeStamp;

        public Builder timeStamp(java.util.Date timeStamp) {
            this.timeStamp = timeStamp;
            this.__explicitlySet__.add("timeStamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("threadSnapshotDetails")
        private java.util.List<SnapshotDetail> threadSnapshotDetails;

        public Builder threadSnapshotDetails(java.util.List<SnapshotDetail> threadSnapshotDetails) {
            this.threadSnapshotDetails = threadSnapshotDetails;
            this.__explicitlySet__.add("threadSnapshotDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stackTrace")
        private java.util.List<StackTraceElement> stackTrace;

        public Builder stackTrace(java.util.List<StackTraceElement> stackTrace) {
            this.stackTrace = stackTrace;
            this.__explicitlySet__.add("stackTrace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ThreadSnapshot build() {
            ThreadSnapshot __instance__ =
                    new ThreadSnapshot(timeStamp, threadSnapshotDetails, stackTrace);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ThreadSnapshot o) {
            Builder copiedBuilder =
                    timeStamp(o.getTimeStamp())
                            .threadSnapshotDetails(o.getThreadSnapshotDetails())
                            .stackTrace(o.getStackTrace());

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
     * Snapshot time.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStamp")
    java.util.Date timeStamp;

    /**
     * Snapshot details.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("threadSnapshotDetails")
    java.util.List<SnapshotDetail> threadSnapshotDetails;

    /**
     * Stack trace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stackTrace")
    java.util.List<StackTraceElement> stackTrace;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
