/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
public final class SpanLogCollection {
    @Deprecated
    @java.beans.ConstructorProperties({"timeCreated", "spanLogs"})
    public SpanLogCollection(java.util.Date timeCreated, java.util.List<SpanLog> spanLogs) {
        super();
        this.timeCreated = timeCreated;
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
            SpanLogCollection __instance__ = new SpanLogCollection(timeCreated, spanLogs);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SpanLogCollection o) {
            Builder copiedBuilder = timeCreated(o.getTimeCreated()).spanLogs(o.getSpanLogs());

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
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SpanLogCollection(");
        sb.append("timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", spanLogs=").append(String.valueOf(this.spanLogs));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.spanLogs, other.spanLogs)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.spanLogs == null ? 43 : this.spanLogs.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
