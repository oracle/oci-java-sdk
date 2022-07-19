/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * The result of GetRow.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Row.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Row {
    @Deprecated
    @java.beans.ConstructorProperties({"value", "timeOfExpiration", "usage"})
    public Row(
            java.util.Map<String, Object> value,
            java.util.Date timeOfExpiration,
            RequestUsage usage) {
        super();
        this.value = value;
        this.timeOfExpiration = timeOfExpiration;
        this.usage = usage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The map of values from a row.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private java.util.Map<String, Object> value;

        /**
         * The map of values from a row.
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(java.util.Map<String, Object> value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * The expiration time of the row. A zero value indicates that
         * the row does not expire. An RFC3339 formatted datetime
         * string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfExpiration")
        private java.util.Date timeOfExpiration;

        /**
         * The expiration time of the row. A zero value indicates that
         * the row does not expire. An RFC3339 formatted datetime
         * string.
         *
         * @param timeOfExpiration the value to set
         * @return this builder
         **/
        public Builder timeOfExpiration(java.util.Date timeOfExpiration) {
            this.timeOfExpiration = timeOfExpiration;
            this.__explicitlySet__.add("timeOfExpiration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usage")
        private RequestUsage usage;

        public Builder usage(RequestUsage usage) {
            this.usage = usage;
            this.__explicitlySet__.add("usage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Row build() {
            Row __instance__ = new Row(value, timeOfExpiration, usage);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Row o) {
            Builder copiedBuilder =
                    value(o.getValue())
                            .timeOfExpiration(o.getTimeOfExpiration())
                            .usage(o.getUsage());

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
     * The map of values from a row.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final java.util.Map<String, Object> value;

    /**
     * The map of values from a row.
     * @return the value
     **/
    public java.util.Map<String, Object> getValue() {
        return value;
    }

    /**
     * The expiration time of the row. A zero value indicates that
     * the row does not expire. An RFC3339 formatted datetime
     * string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfExpiration")
    private final java.util.Date timeOfExpiration;

    /**
     * The expiration time of the row. A zero value indicates that
     * the row does not expire. An RFC3339 formatted datetime
     * string.
     *
     * @return the value
     **/
    public java.util.Date getTimeOfExpiration() {
        return timeOfExpiration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("usage")
    private final RequestUsage usage;

    public RequestUsage getUsage() {
        return usage;
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
        sb.append("Row(");
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", timeOfExpiration=").append(String.valueOf(this.timeOfExpiration));
        sb.append(", usage=").append(String.valueOf(this.usage));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Row)) {
            return false;
        }

        Row other = (Row) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.timeOfExpiration, other.timeOfExpiration)
                && java.util.Objects.equals(this.usage, other.usage)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfExpiration == null ? 43 : this.timeOfExpiration.hashCode());
        result = (result * PRIME) + (this.usage == null ? 43 : this.usage.hashCode());
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
