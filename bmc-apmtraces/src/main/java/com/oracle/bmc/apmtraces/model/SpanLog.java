/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Definition of a log which is a key-value pair of log data. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SpanLog.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class SpanLog extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"logKey", "logValue"})
    public SpanLog(String logKey, String logValue) {
        super();
        this.logKey = logKey;
        this.logValue = logValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Key that specifies the log name. */
        @com.fasterxml.jackson.annotation.JsonProperty("logKey")
        private String logKey;

        /**
         * Key that specifies the log name.
         *
         * @param logKey the value to set
         * @return this builder
         */
        public Builder logKey(String logKey) {
            this.logKey = logKey;
            this.__explicitlySet__.add("logKey");
            return this;
        }
        /** Value associated with the log key. */
        @com.fasterxml.jackson.annotation.JsonProperty("logValue")
        private String logValue;

        /**
         * Value associated with the log key.
         *
         * @param logValue the value to set
         * @return this builder
         */
        public Builder logValue(String logValue) {
            this.logValue = logValue;
            this.__explicitlySet__.add("logValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SpanLog build() {
            SpanLog model = new SpanLog(this.logKey, this.logValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SpanLog model) {
            if (model.wasPropertyExplicitlySet("logKey")) {
                this.logKey(model.getLogKey());
            }
            if (model.wasPropertyExplicitlySet("logValue")) {
                this.logValue(model.getLogValue());
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

    /** Key that specifies the log name. */
    @com.fasterxml.jackson.annotation.JsonProperty("logKey")
    private final String logKey;

    /**
     * Key that specifies the log name.
     *
     * @return the value
     */
    public String getLogKey() {
        return logKey;
    }

    /** Value associated with the log key. */
    @com.fasterxml.jackson.annotation.JsonProperty("logValue")
    private final String logValue;

    /**
     * Value associated with the log key.
     *
     * @return the value
     */
    public String getLogValue() {
        return logValue;
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
        sb.append("SpanLog(");
        sb.append("super=").append(super.toString());
        sb.append("logKey=").append(String.valueOf(this.logKey));
        sb.append(", logValue=").append(String.valueOf(this.logValue));
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
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.logKey == null ? 43 : this.logKey.hashCode());
        result = (result * PRIME) + (this.logValue == null ? 43 : this.logValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
