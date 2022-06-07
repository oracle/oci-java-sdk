/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Definition of a log which is a key-value pair of log data.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SpanLog.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SpanLog {
    @Deprecated
    @java.beans.ConstructorProperties({"logKey", "logValue"})
    public SpanLog(String logKey, String logValue) {
        super();
        this.logKey = logKey;
        this.logValue = logValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("logKey")
        private String logKey;

        public Builder logKey(String logKey) {
            this.logKey = logKey;
            this.__explicitlySet__.add("logKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logValue")
        private String logValue;

        public Builder logValue(String logValue) {
            this.logValue = logValue;
            this.__explicitlySet__.add("logValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SpanLog build() {
            SpanLog __instance__ = new SpanLog(logKey, logValue);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SpanLog o) {
            Builder copiedBuilder = logKey(o.getLogKey()).logValue(o.getLogValue());

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
     * Key that specifies the log name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logKey")
    private final String logKey;

    public String getLogKey() {
        return logKey;
    }

    /**
     * Value associated with the log key.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logValue")
    private final String logValue;

    public String getLogValue() {
        return logValue;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SpanLog(");
        sb.append("logKey=").append(String.valueOf(this.logKey));
        sb.append(", logValue=").append(String.valueOf(this.logValue));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SpanLog)) {
            return false;
        }

        SpanLog other = (SpanLog) o;
        return java.util.Objects.equals(this.logKey, other.logKey)
                && java.util.Objects.equals(this.logValue, other.logValue)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.logKey == null ? 43 : this.logKey.hashCode());
        result = (result * PRIME) + (this.logValue == null ? 43 : this.logValue.hashCode());
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
