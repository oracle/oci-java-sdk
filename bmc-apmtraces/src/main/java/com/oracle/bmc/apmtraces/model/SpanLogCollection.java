/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Definition of span log collection object.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SpanLogCollection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SpanLogCollection extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeCreated", "eventName", "spanLogs"})
    public SpanLogCollection(
            java.util.Date timeCreated, String eventName, java.util.List<SpanLog> spanLogs) {
        super();
        this.timeCreated = timeCreated;
        this.eventName = eventName;
        this.spanLogs = spanLogs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Timestamp at which the log is created.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Timestamp at which the log is created.
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Name of the event for which the log is created.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("eventName")
        private String eventName;

        /**
         * Name of the event for which the log is created.
         *
         * @param eventName the value to set
         * @return this builder
         **/
        public Builder eventName(String eventName) {
            this.eventName = eventName;
            this.__explicitlySet__.add("eventName");
            return this;
        }
        /**
         * List of logs associated with the span at the given timestamp.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("spanLogs")
        private java.util.List<SpanLog> spanLogs;

        /**
         * List of logs associated with the span at the given timestamp.
         *
         * @param spanLogs the value to set
         * @return this builder
         **/
        public Builder spanLogs(java.util.List<SpanLog> spanLogs) {
            this.spanLogs = spanLogs;
            this.__explicitlySet__.add("spanLogs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SpanLogCollection build() {
            SpanLogCollection model =
                    new SpanLogCollection(this.timeCreated, this.eventName, this.spanLogs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SpanLogCollection model) {
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("eventName")) {
                this.eventName(model.getEventName());
            }
            if (model.wasPropertyExplicitlySet("spanLogs")) {
                this.spanLogs(model.getSpanLogs());
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
     * Timestamp at which the log is created.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Timestamp at which the log is created.
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Name of the event for which the log is created.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventName")
    private final String eventName;

    /**
     * Name of the event for which the log is created.
     *
     * @return the value
     **/
    public String getEventName() {
        return eventName;
    }

    /**
     * List of logs associated with the span at the given timestamp.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("spanLogs")
    private final java.util.List<SpanLog> spanLogs;

    /**
     * List of logs associated with the span at the given timestamp.
     *
     * @return the value
     **/
    public java.util.List<SpanLog> getSpanLogs() {
        return spanLogs;
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
        sb.append("SpanLogCollection(");
        sb.append("super=").append(super.toString());
        sb.append("timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", eventName=").append(String.valueOf(this.eventName));
        sb.append(", spanLogs=").append(String.valueOf(this.spanLogs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SpanLogCollection)) {
            return false;
        }

        SpanLogCollection other = (SpanLogCollection) o;
        return java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.eventName, other.eventName)
                && java.util.Objects.equals(this.spanLogs, other.spanLogs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.eventName == null ? 43 : this.eventName.hashCode());
        result = (result * PRIME) + (this.spanLogs == null ? 43 : this.spanLogs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
