/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.model;

/**
 * The request body used to validate a Span Filter pattern.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ValidateSpanFilterPatternDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ValidateSpanFilterPatternDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"filterText"})
    public ValidateSpanFilterPatternDetails(String filterText) {
        super();
        this.filterText = filterText;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The string that defines the Span Filter expression.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("filterText")
        private String filterText;

        /**
         * The string that defines the Span Filter expression.
         *
         * @param filterText the value to set
         * @return this builder
         **/
        public Builder filterText(String filterText) {
            this.filterText = filterText;
            this.__explicitlySet__.add("filterText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ValidateSpanFilterPatternDetails build() {
            ValidateSpanFilterPatternDetails __instance__ =
                    new ValidateSpanFilterPatternDetails(filterText);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ValidateSpanFilterPatternDetails o) {
            Builder copiedBuilder = filterText(o.getFilterText());

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
     * The string that defines the Span Filter expression.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filterText")
    private final String filterText;

    /**
     * The string that defines the Span Filter expression.
     *
     * @return the value
     **/
    public String getFilterText() {
        return filterText;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ValidateSpanFilterPatternDetails(");
        sb.append("filterText=").append(String.valueOf(this.filterText));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidateSpanFilterPatternDetails)) {
            return false;
        }

        ValidateSpanFilterPatternDetails other = (ValidateSpanFilterPatternDetails) o;
        return java.util.Objects.equals(this.filterText, other.filterText)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.filterText == null ? 43 : this.filterText.hashCode());
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
