/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loggingingestion.model;

/**
 * Contains the log content with the associated timestamp and ID. Each entry should be less than 1
 * MB size. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LogEntry.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LogEntry extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"data", "id", "time"})
    public LogEntry(String data, String id, java.util.Date time) {
        super();
        this.data = data;
        this.id = id;
        this.time = time;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The log entry content. */
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        private String data;

        /**
         * The log entry content.
         *
         * @param data the value to set
         * @return this builder
         */
        public Builder data(String data) {
            this.data = data;
            this.__explicitlySet__.add("data");
            return this;
        }
        /**
         * UUID uniquely representing this logEntry. This is not an OCID related to any oracle
         * resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * UUID uniquely representing this logEntry. This is not an OCID related to any oracle
         * resource.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Optional. The timestamp associated with the log entry. An RFC3339-formatted date-time
         * string with milliseconds precision. If unspecified, defaults to
         * PutLogsDetails.defaultlogentrytime.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("time")
        private java.util.Date time;

        /**
         * Optional. The timestamp associated with the log entry. An RFC3339-formatted date-time
         * string with milliseconds precision. If unspecified, defaults to
         * PutLogsDetails.defaultlogentrytime.
         *
         * @param time the value to set
         * @return this builder
         */
        public Builder time(java.util.Date time) {
            this.time = time;
            this.__explicitlySet__.add("time");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogEntry build() {
            LogEntry model = new LogEntry(this.data, this.id, this.time);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogEntry model) {
            if (model.wasPropertyExplicitlySet("data")) {
                this.data(model.getData());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("time")) {
                this.time(model.getTime());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The log entry content. */
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    private final String data;

    /**
     * The log entry content.
     *
     * @return the value
     */
    public String getData() {
        return data;
    }

    /**
     * UUID uniquely representing this logEntry. This is not an OCID related to any oracle resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * UUID uniquely representing this logEntry. This is not an OCID related to any oracle resource.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Optional. The timestamp associated with the log entry. An RFC3339-formatted date-time string
     * with milliseconds precision. If unspecified, defaults to PutLogsDetails.defaultlogentrytime.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("time")
    private final java.util.Date time;

    /**
     * Optional. The timestamp associated with the log entry. An RFC3339-formatted date-time string
     * with milliseconds precision. If unspecified, defaults to PutLogsDetails.defaultlogentrytime.
     *
     * @return the value
     */
    public java.util.Date getTime() {
        return time;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LogEntry(");
        sb.append("super=").append(super.toString());
        sb.append("data=").append(String.valueOf(this.data));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", time=").append(String.valueOf(this.time));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogEntry)) {
            return false;
        }

        LogEntry other = (LogEntry) o;
        return java.util.Objects.equals(this.data, other.data)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.time, other.time)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.data == null ? 43 : this.data.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.time == null ? 43 : this.time.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
