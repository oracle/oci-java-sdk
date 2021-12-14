/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * The AWR snapshot summary of one snapshot.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AwrSnapshotSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AwrSnapshotSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("awrSourceDatabaseId")
        private String awrSourceDatabaseId;

        public Builder awrSourceDatabaseId(String awrSourceDatabaseId) {
            this.awrSourceDatabaseId = awrSourceDatabaseId;
            this.__explicitlySet__.add("awrSourceDatabaseId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceNumber")
        private Integer instanceNumber;

        public Builder instanceNumber(Integer instanceNumber) {
            this.instanceNumber = instanceNumber;
            this.__explicitlySet__.add("instanceNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeDbStartup")
        private java.util.Date timeDbStartup;

        public Builder timeDbStartup(java.util.Date timeDbStartup) {
            this.timeDbStartup = timeDbStartup;
            this.__explicitlySet__.add("timeDbStartup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeSnapshotBegin")
        private java.util.Date timeSnapshotBegin;

        public Builder timeSnapshotBegin(java.util.Date timeSnapshotBegin) {
            this.timeSnapshotBegin = timeSnapshotBegin;
            this.__explicitlySet__.add("timeSnapshotBegin");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeSnapshotEnd")
        private java.util.Date timeSnapshotEnd;

        public Builder timeSnapshotEnd(java.util.Date timeSnapshotEnd) {
            this.timeSnapshotEnd = timeSnapshotEnd;
            this.__explicitlySet__.add("timeSnapshotEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("snapshotIdentifier")
        private Integer snapshotIdentifier;

        public Builder snapshotIdentifier(Integer snapshotIdentifier) {
            this.snapshotIdentifier = snapshotIdentifier;
            this.__explicitlySet__.add("snapshotIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errorCount")
        private Long errorCount;

        public Builder errorCount(Long errorCount) {
            this.errorCount = errorCount;
            this.__explicitlySet__.add("errorCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrSnapshotSummary build() {
            AwrSnapshotSummary __instance__ =
                    new AwrSnapshotSummary(
                            awrSourceDatabaseId,
                            instanceNumber,
                            timeDbStartup,
                            timeSnapshotBegin,
                            timeSnapshotEnd,
                            snapshotIdentifier,
                            errorCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrSnapshotSummary o) {
            Builder copiedBuilder =
                    awrSourceDatabaseId(o.getAwrSourceDatabaseId())
                            .instanceNumber(o.getInstanceNumber())
                            .timeDbStartup(o.getTimeDbStartup())
                            .timeSnapshotBegin(o.getTimeSnapshotBegin())
                            .timeSnapshotEnd(o.getTimeSnapshotEnd())
                            .snapshotIdentifier(o.getSnapshotIdentifier())
                            .errorCount(o.getErrorCount());

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
     * DatabaseId of the Source database for which AWR Data will be uploaded to AWR Hub.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("awrSourceDatabaseId")
    String awrSourceDatabaseId;

    /**
     * The database instance number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceNumber")
    Integer instanceNumber;

    /**
     * The timestamp of the database startup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDbStartup")
    java.util.Date timeDbStartup;

    /**
     * The start time of the snapshot.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeSnapshotBegin")
    java.util.Date timeSnapshotBegin;

    /**
     * The end time of the snapshot.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeSnapshotEnd")
    java.util.Date timeSnapshotEnd;

    /**
     * The identifier of the snapshot.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotIdentifier")
    Integer snapshotIdentifier;

    /**
     * The total number of errors.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorCount")
    Long errorCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
