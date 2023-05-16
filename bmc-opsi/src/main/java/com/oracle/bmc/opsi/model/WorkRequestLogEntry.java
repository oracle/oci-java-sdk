/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * A log message from the execution of a work request. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = WorkRequestLogEntry.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class WorkRequestLogEntry
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"message", "timestamp"})
    public WorkRequestLogEntry(String message, java.util.Date timestamp) {
        super();
        this.message = message;
        this.timestamp = timestamp;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Human-readable log message. */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * Human-readable log message.
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /** The time the log message was written. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * The time the log message was written. An RFC3339 formatted datetime string
         *
         * @param timestamp the value to set
         * @return this builder
         */
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkRequestLogEntry build() {
            WorkRequestLogEntry model = new WorkRequestLogEntry(this.message, this.timestamp);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkRequestLogEntry model) {
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
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

    /** Human-readable log message. */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * Human-readable log message.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    /** The time the log message was written. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * The time the log message was written. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimestamp() {
        return timestamp;
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
        sb.append("WorkRequestLogEntry(");
        sb.append("super=").append(super.toString());
        sb.append("message=").append(String.valueOf(this.message));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkRequestLogEntry)) {
            return false;
        }

        WorkRequestLogEntry other = (WorkRequestLogEntry) o;
        return java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
