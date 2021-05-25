/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary of the AWR wait event time series data for one event.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AwrDbWaitEventSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AwrDbWaitEventSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeBegin")
        private java.util.Date timeBegin;

        public Builder timeBegin(java.util.Date timeBegin) {
            this.timeBegin = timeBegin;
            this.__explicitlySet__.add("timeBegin");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("waitsPerSec")
        private Double waitsPerSec;

        public Builder waitsPerSec(Double waitsPerSec) {
            this.waitsPerSec = waitsPerSec;
            this.__explicitlySet__.add("waitsPerSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("avgWaitTimePerSec")
        private Double avgWaitTimePerSec;

        public Builder avgWaitTimePerSec(Double avgWaitTimePerSec) {
            this.avgWaitTimePerSec = avgWaitTimePerSec;
            this.__explicitlySet__.add("avgWaitTimePerSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("snapshotId")
        private Integer snapshotId;

        public Builder snapshotId(Integer snapshotId) {
            this.snapshotId = snapshotId;
            this.__explicitlySet__.add("snapshotId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrDbWaitEventSummary build() {
            AwrDbWaitEventSummary __instance__ =
                    new AwrDbWaitEventSummary(
                            name, timeBegin, timeEnd, waitsPerSec, avgWaitTimePerSec, snapshotId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrDbWaitEventSummary o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .timeBegin(o.getTimeBegin())
                            .timeEnd(o.getTimeEnd())
                            .waitsPerSec(o.getWaitsPerSec())
                            .avgWaitTimePerSec(o.getAvgWaitTimePerSec())
                            .snapshotId(o.getSnapshotId());

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
     * The name of the event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The begin time of the wait event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeBegin")
    java.util.Date timeBegin;

    /**
     * The end time of the wait event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    java.util.Date timeEnd;

    /**
     * The wait count per second.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("waitsPerSec")
    Double waitsPerSec;

    /**
     * The average wait time per second.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("avgWaitTimePerSec")
    Double avgWaitTimePerSec;

    /**
     * The ID of the snapshot. The snapshot ID is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * It can be retrieved from the following endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbs/{awrDbId}/awrDbSnapshots
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotId")
    Integer snapshotId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
