/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Summary of the Upload.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UploadSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UploadSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("reference")
        private String reference;

        public Builder reference(String reference) {
            this.reference = reference;
            this.__explicitlySet__.add("reference");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeEarliestLogEntry")
        private java.util.Date timeEarliestLogEntry;

        public Builder timeEarliestLogEntry(java.util.Date timeEarliestLogEntry) {
            this.timeEarliestLogEntry = timeEarliestLogEntry;
            this.__explicitlySet__.add("timeEarliestLogEntry");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLatestLogEntry")
        private java.util.Date timeLatestLogEntry;

        public Builder timeLatestLogEntry(java.util.Date timeLatestLogEntry) {
            this.timeLatestLogEntry = timeLatestLogEntry;
            this.__explicitlySet__.add("timeLatestLogEntry");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("warningsCount")
        private Integer warningsCount;

        public Builder warningsCount(Integer warningsCount) {
            this.warningsCount = warningsCount;
            this.__explicitlySet__.add("warningsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UploadSummary build() {
            UploadSummary __instance__ =
                    new UploadSummary(
                            reference,
                            name,
                            timeCreated,
                            timeUpdated,
                            timeEarliestLogEntry,
                            timeLatestLogEntry,
                            warningsCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UploadSummary o) {
            Builder copiedBuilder =
                    reference(o.getReference())
                            .name(o.getName())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .timeEarliestLogEntry(o.getTimeEarliestLogEntry())
                            .timeLatestLogEntry(o.getTimeLatestLogEntry())
                            .warningsCount(o.getWarningsCount());

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
     * Unique internal identifier to refer to the upload container
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reference")
    String reference;

    /**
     * The name of the upload container
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The time when this upload container is created. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The latest time when this upload container is modified. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * This time represents the earliest time of the log entry in this container. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEarliestLogEntry")
    java.util.Date timeEarliestLogEntry;

    /**
     * This time represents the latest time of the log entry in this container. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLatestLogEntry")
    java.util.Date timeLatestLogEntry;

    /**
     * Number of warnings associated to the upload.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("warningsCount")
    Integer warningsCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
