/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Query builder api response object containing updated querystring's
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FilterOutput.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FilterOutput {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayQueryString",
        "internalQueryString",
        "responseTimeInMs"
    })
    public FilterOutput(
            String displayQueryString, String internalQueryString, Long responseTimeInMs) {
        super();
        this.displayQueryString = displayQueryString;
        this.internalQueryString = internalQueryString;
        this.responseTimeInMs = responseTimeInMs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Modified user visible query string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayQueryString")
        private String displayQueryString;

        /**
         * Modified user visible query string.
         *
         * @param displayQueryString the value to set
         * @return this builder
         **/
        public Builder displayQueryString(String displayQueryString) {
            this.displayQueryString = displayQueryString;
            this.__explicitlySet__.add("displayQueryString");
            return this;
        }
        /**
         * Modified localization agnostic query string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("internalQueryString")
        private String internalQueryString;

        /**
         * Modified localization agnostic query string.
         *
         * @param internalQueryString the value to set
         * @return this builder
         **/
        public Builder internalQueryString(String internalQueryString) {
            this.internalQueryString = internalQueryString;
            this.__explicitlySet__.add("internalQueryString");
            return this;
        }
        /**
         * Operation response time.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("responseTimeInMs")
        private Long responseTimeInMs;

        /**
         * Operation response time.
         *
         * @param responseTimeInMs the value to set
         * @return this builder
         **/
        public Builder responseTimeInMs(Long responseTimeInMs) {
            this.responseTimeInMs = responseTimeInMs;
            this.__explicitlySet__.add("responseTimeInMs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FilterOutput build() {
            FilterOutput __instance__ =
                    new FilterOutput(displayQueryString, internalQueryString, responseTimeInMs);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FilterOutput o) {
            Builder copiedBuilder =
                    displayQueryString(o.getDisplayQueryString())
                            .internalQueryString(o.getInternalQueryString())
                            .responseTimeInMs(o.getResponseTimeInMs());

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
     * Modified user visible query string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayQueryString")
    private final String displayQueryString;

    /**
     * Modified user visible query string.
     *
     * @return the value
     **/
    public String getDisplayQueryString() {
        return displayQueryString;
    }

    /**
     * Modified localization agnostic query string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("internalQueryString")
    private final String internalQueryString;

    /**
     * Modified localization agnostic query string.
     *
     * @return the value
     **/
    public String getInternalQueryString() {
        return internalQueryString;
    }

    /**
     * Operation response time.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseTimeInMs")
    private final Long responseTimeInMs;

    /**
     * Operation response time.
     *
     * @return the value
     **/
    public Long getResponseTimeInMs() {
        return responseTimeInMs;
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
        sb.append("FilterOutput(");
        sb.append("displayQueryString=").append(String.valueOf(this.displayQueryString));
        sb.append(", internalQueryString=").append(String.valueOf(this.internalQueryString));
        sb.append(", responseTimeInMs=").append(String.valueOf(this.responseTimeInMs));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FilterOutput)) {
            return false;
        }

        FilterOutput other = (FilterOutput) o;
        return java.util.Objects.equals(this.displayQueryString, other.displayQueryString)
                && java.util.Objects.equals(this.internalQueryString, other.internalQueryString)
                && java.util.Objects.equals(this.responseTimeInMs, other.responseTimeInMs)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.displayQueryString == null
                                ? 43
                                : this.displayQueryString.hashCode());
        result =
                (result * PRIME)
                        + (this.internalQueryString == null
                                ? 43
                                : this.internalQueryString.hashCode());
        result =
                (result * PRIME)
                        + (this.responseTimeInMs == null ? 43 : this.responseTimeInMs.hashCode());
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
