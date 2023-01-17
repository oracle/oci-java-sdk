/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LogEntryBatch.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogEntryBatch extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "entries",
        "source",
        "type",
        "subject",
        "defaultlogentrytime"
    })
    public LogEntryBatch(
            java.util.List<LogEntry> entries,
            String source,
            String type,
            String subject,
            java.util.Date defaultlogentrytime) {
        super();
        this.entries = entries;
        this.source = source;
        this.type = type;
        this.subject = subject;
        this.defaultlogentrytime = defaultlogentrytime;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of data entries.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entries")
        private java.util.List<LogEntry> entries;

        /**
         * List of data entries.
         * @param entries the value to set
         * @return this builder
         **/
        public Builder entries(java.util.List<LogEntry> entries) {
            this.entries = entries;
            this.__explicitlySet__.add("entries");
            return this;
        }
        /**
         * Source of the logs that generated the message. This could be the
         * instance name, hostname, or the source used to read the event. For example, "ServerA".
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private String source;

        /**
         * Source of the logs that generated the message. This could be the
         * instance name, hostname, or the source used to read the event. For example, "ServerA".
         *
         * @param source the value to set
         * @return this builder
         **/
        public Builder source(String source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }
        /**
         * This field signifies the type of logs being ingested.
         * For example: ServerA.requestLogs.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * This field signifies the type of logs being ingested.
         * For example: ServerA.requestLogs.
         *
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * This optional field is useful for specifying the specific sub-resource
         * or input file used to read the event.
         * For example: "/var/log/application.log".
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subject")
        private String subject;

        /**
         * This optional field is useful for specifying the specific sub-resource
         * or input file used to read the event.
         * For example: "/var/log/application.log".
         *
         * @param subject the value to set
         * @return this builder
         **/
        public Builder subject(String subject) {
            this.subject = subject;
            this.__explicitlySet__.add("subject");
            return this;
        }
        /**
         * The timestamp for all log entries in this batch. This can be
         * considered as the default timestamp for each entry, unless it is
         * overwritten by the entry time. An RFC3339-formatted date-time string
         * with milliseconds precision.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultlogentrytime")
        private java.util.Date defaultlogentrytime;

        /**
         * The timestamp for all log entries in this batch. This can be
         * considered as the default timestamp for each entry, unless it is
         * overwritten by the entry time. An RFC3339-formatted date-time string
         * with milliseconds precision.
         *
         * @param defaultlogentrytime the value to set
         * @return this builder
         **/
        public Builder defaultlogentrytime(java.util.Date defaultlogentrytime) {
            this.defaultlogentrytime = defaultlogentrytime;
            this.__explicitlySet__.add("defaultlogentrytime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogEntryBatch build() {
            LogEntryBatch model =
                    new LogEntryBatch(
                            this.entries,
                            this.source,
                            this.type,
                            this.subject,
                            this.defaultlogentrytime);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogEntryBatch model) {
            if (model.wasPropertyExplicitlySet("entries")) {
                this.entries(model.getEntries());
            }
            if (model.wasPropertyExplicitlySet("source")) {
                this.source(model.getSource());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("subject")) {
                this.subject(model.getSubject());
            }
            if (model.wasPropertyExplicitlySet("defaultlogentrytime")) {
                this.defaultlogentrytime(model.getDefaultlogentrytime());
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
     * List of data entries.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entries")
    private final java.util.List<LogEntry> entries;

    /**
     * List of data entries.
     * @return the value
     **/
    public java.util.List<LogEntry> getEntries() {
        return entries;
    }

    /**
     * Source of the logs that generated the message. This could be the
     * instance name, hostname, or the source used to read the event. For example, "ServerA".
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final String source;

    /**
     * Source of the logs that generated the message. This could be the
     * instance name, hostname, or the source used to read the event. For example, "ServerA".
     *
     * @return the value
     **/
    public String getSource() {
        return source;
    }

    /**
     * This field signifies the type of logs being ingested.
     * For example: ServerA.requestLogs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * This field signifies the type of logs being ingested.
     * For example: ServerA.requestLogs.
     *
     * @return the value
     **/
    public String getType() {
        return type;
    }

    /**
     * This optional field is useful for specifying the specific sub-resource
     * or input file used to read the event.
     * For example: "/var/log/application.log".
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    private final String subject;

    /**
     * This optional field is useful for specifying the specific sub-resource
     * or input file used to read the event.
     * For example: "/var/log/application.log".
     *
     * @return the value
     **/
    public String getSubject() {
        return subject;
    }

    /**
     * The timestamp for all log entries in this batch. This can be
     * considered as the default timestamp for each entry, unless it is
     * overwritten by the entry time. An RFC3339-formatted date-time string
     * with milliseconds precision.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultlogentrytime")
    private final java.util.Date defaultlogentrytime;

    /**
     * The timestamp for all log entries in this batch. This can be
     * considered as the default timestamp for each entry, unless it is
     * overwritten by the entry time. An RFC3339-formatted date-time string
     * with milliseconds precision.
     *
     * @return the value
     **/
    public java.util.Date getDefaultlogentrytime() {
        return defaultlogentrytime;
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
        sb.append("LogEntryBatch(");
        sb.append("super=").append(super.toString());
        sb.append("entries=").append(String.valueOf(this.entries));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", subject=").append(String.valueOf(this.subject));
        sb.append(", defaultlogentrytime=").append(String.valueOf(this.defaultlogentrytime));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogEntryBatch)) {
            return false;
        }

        LogEntryBatch other = (LogEntryBatch) o;
        return java.util.Objects.equals(this.entries, other.entries)
                && java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.subject, other.subject)
                && java.util.Objects.equals(this.defaultlogentrytime, other.defaultlogentrytime)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.entries == null ? 43 : this.entries.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.subject == null ? 43 : this.subject.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultlogentrytime == null
                                ? 43
                                : this.defaultlogentrytime.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
