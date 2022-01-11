/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Summary of an AwrSource.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AwrSourceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AwrSourceSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("awrHubId")
        private String awrHubId;

        public Builder awrHubId(String awrHubId) {
            this.awrHubId = awrHubId;
            this.__explicitlySet__.add("awrHubId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("awrSourceDatabaseId")
        private String awrSourceDatabaseId;

        public Builder awrSourceDatabaseId(String awrSourceDatabaseId) {
            this.awrSourceDatabaseId = awrSourceDatabaseId;
            this.__explicitlySet__.add("awrSourceDatabaseId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("snapshotsUploaded")
        private java.math.BigDecimal snapshotsUploaded;

        public Builder snapshotsUploaded(java.math.BigDecimal snapshotsUploaded) {
            this.snapshotsUploaded = snapshotsUploaded;
            this.__explicitlySet__.add("snapshotsUploaded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("minSnapshotIdentifier")
        private java.math.BigDecimal minSnapshotIdentifier;

        public Builder minSnapshotIdentifier(java.math.BigDecimal minSnapshotIdentifier) {
            this.minSnapshotIdentifier = minSnapshotIdentifier;
            this.__explicitlySet__.add("minSnapshotIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxSnapshotIdentifier")
        private java.math.BigDecimal maxSnapshotIdentifier;

        public Builder maxSnapshotIdentifier(java.math.BigDecimal maxSnapshotIdentifier) {
            this.maxSnapshotIdentifier = maxSnapshotIdentifier;
            this.__explicitlySet__.add("maxSnapshotIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFirstSnapshotGenerated")
        private java.util.Date timeFirstSnapshotGenerated;

        public Builder timeFirstSnapshotGenerated(java.util.Date timeFirstSnapshotGenerated) {
            this.timeFirstSnapshotGenerated = timeFirstSnapshotGenerated;
            this.__explicitlySet__.add("timeFirstSnapshotGenerated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSnapshotGenerated")
        private java.util.Date timeLastSnapshotGenerated;

        public Builder timeLastSnapshotGenerated(java.util.Date timeLastSnapshotGenerated) {
            this.timeLastSnapshotGenerated = timeLastSnapshotGenerated;
            this.__explicitlySet__.add("timeLastSnapshotGenerated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hoursSinceLastImport")
        private Double hoursSinceLastImport;

        public Builder hoursSinceLastImport(Double hoursSinceLastImport) {
            this.hoursSinceLastImport = hoursSinceLastImport;
            this.__explicitlySet__.add("hoursSinceLastImport");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrSourceSummary build() {
            AwrSourceSummary __instance__ =
                    new AwrSourceSummary(
                            awrHubId,
                            name,
                            awrSourceDatabaseId,
                            snapshotsUploaded,
                            minSnapshotIdentifier,
                            maxSnapshotIdentifier,
                            timeFirstSnapshotGenerated,
                            timeLastSnapshotGenerated,
                            hoursSinceLastImport);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrSourceSummary o) {
            Builder copiedBuilder =
                    awrHubId(o.getAwrHubId())
                            .name(o.getName())
                            .awrSourceDatabaseId(o.getAwrSourceDatabaseId())
                            .snapshotsUploaded(o.getSnapshotsUploaded())
                            .minSnapshotIdentifier(o.getMinSnapshotIdentifier())
                            .maxSnapshotIdentifier(o.getMaxSnapshotIdentifier())
                            .timeFirstSnapshotGenerated(o.getTimeFirstSnapshotGenerated())
                            .timeLastSnapshotGenerated(o.getTimeLastSnapshotGenerated())
                            .hoursSinceLastImport(o.getHoursSinceLastImport());

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
     * AWR Hub OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("awrHubId")
    String awrHubId;

    /**
     * Database name of the Source database for which AWR Data will be uploaded to AWR Hub.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * DatabaseId of the Source database for which AWR Data will be uploaded to AWR Hub.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("awrSourceDatabaseId")
    String awrSourceDatabaseId;

    /**
     * Number of AWR snapshots uploaded from the Source database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotsUploaded")
    java.math.BigDecimal snapshotsUploaded;

    /**
     * The minimum snapshot identifier of the source database for which AWR data is uploaded to AWR Hub.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minSnapshotIdentifier")
    java.math.BigDecimal minSnapshotIdentifier;

    /**
     * The maximum snapshot identifier of the source database for which AWR data is uploaded to AWR Hub.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxSnapshotIdentifier")
    java.math.BigDecimal maxSnapshotIdentifier;

    /**
     * The time at which the earliest snapshot was generated in the source database for which data is uploaded to AWR Hub. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFirstSnapshotGenerated")
    java.util.Date timeFirstSnapshotGenerated;

    /**
     * The time at which the latest snapshot was generated in the source database for which data is uploaded to AWR Hub. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSnapshotGenerated")
    java.util.Date timeLastSnapshotGenerated;

    /**
     * Number of hours since last AWR snapshots import happened from the Source database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hoursSinceLastImport")
    Double hoursSinceLastImport;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
