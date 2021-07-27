/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loggingingestion.model;

/**
 * A single batch of Log Entries.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200831")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LogEntryBatch.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogEntryBatch {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("entries")
        private java.util.List<LogEntry> entries;

        public Builder entries(java.util.List<LogEntry> entries) {
            this.entries = entries;
            this.__explicitlySet__.add("entries");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private String source;

        public Builder source(String source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subject")
        private String subject;

        public Builder subject(String subject) {
            this.subject = subject;
            this.__explicitlySet__.add("subject");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultlogentrytime")
        private java.util.Date defaultlogentrytime;

        public Builder defaultlogentrytime(java.util.Date defaultlogentrytime) {
            this.defaultlogentrytime = defaultlogentrytime;
            this.__explicitlySet__.add("defaultlogentrytime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogEntryBatch build() {
            LogEntryBatch __instance__ =
                    new LogEntryBatch(entries, source, type, subject, defaultlogentrytime);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogEntryBatch o) {
            Builder copiedBuilder =
                    entries(o.getEntries())
                            .source(o.getSource())
                            .type(o.getType())
                            .subject(o.getSubject())
                            .defaultlogentrytime(o.getDefaultlogentrytime());

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
     * List of data entries.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entries")
    java.util.List<LogEntry> entries;

    /**
     * Source of the logs that generated the message. This could be the
     * instance name, hostname, or the source used to read the event. For example, "ServerA".
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    String source;

    /**
     * This field signifies the type of logs being ingested.
     * For example: ServerA.requestLogs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    String type;

    /**
     * This optional field is useful for specifying the specific sub-resource
     * or input file used to read the event.
     * For example: "/var/log/application.log".
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    String subject;

    /**
     * The timestamp for all log entries in this batch. This can be
     * considered as the default timestamp for each entry, unless it is
     * overwritten by the entry time. An RFC3339-formatted date-time string
     * with milliseconds precision.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultlogentrytime")
    java.util.Date defaultlogentrytime;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
