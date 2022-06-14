/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * log header values
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExtractLogHeaderDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExtractLogHeaderDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"logKey", "headerValues"})
    public ExtractLogHeaderDetails(String logKey, java.util.List<String> headerValues) {
        super();
        this.logKey = logKey;
        this.headerValues = headerValues;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The log key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logKey")
        private String logKey;

        /**
         * The log key.
         * @param logKey the value to set
         * @return this builder
         **/
        public Builder logKey(String logKey) {
            this.logKey = logKey;
            this.__explicitlySet__.add("logKey");
            return this;
        }
        /**
         * The log header values.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("headerValues")
        private java.util.List<String> headerValues;

        /**
         * The log header values.
         * @param headerValues the value to set
         * @return this builder
         **/
        public Builder headerValues(java.util.List<String> headerValues) {
            this.headerValues = headerValues;
            this.__explicitlySet__.add("headerValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtractLogHeaderDetails build() {
            ExtractLogHeaderDetails __instance__ =
                    new ExtractLogHeaderDetails(logKey, headerValues);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtractLogHeaderDetails o) {
            Builder copiedBuilder = logKey(o.getLogKey()).headerValues(o.getHeaderValues());

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
     * The log key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logKey")
    private final String logKey;

    /**
     * The log key.
     * @return the value
     **/
    public String getLogKey() {
        return logKey;
    }

    /**
     * The log header values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headerValues")
    private final java.util.List<String> headerValues;

    /**
     * The log header values.
     * @return the value
     **/
    public java.util.List<String> getHeaderValues() {
        return headerValues;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExtractLogHeaderDetails(");
        sb.append("logKey=").append(String.valueOf(this.logKey));
        sb.append(", headerValues=").append(String.valueOf(this.headerValues));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtractLogHeaderDetails)) {
            return false;
        }

        ExtractLogHeaderDetails other = (ExtractLogHeaderDetails) o;
        return java.util.Objects.equals(this.logKey, other.logKey)
                && java.util.Objects.equals(this.headerValues, other.headerValues)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.logKey == null ? 43 : this.logKey.hashCode());
        result = (result * PRIME) + (this.headerValues == null ? 43 : this.headerValues.hashCode());
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
