/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The User Defined Function masking format lets you define your own logic to
 * mask column data. The return value of the user-defined function is used to
 * replace the original values. The user-defined function has a fixed signature
 * and is a PL/SQL function that can be invoked in a SELECT statement. To learn
 * more, check User Defined Function in the Data Safe documentation.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UDFFormatEntry.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UDFFormatEntry extends FormatEntry {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userDefinedFunction")
        private String userDefinedFunction;

        public Builder userDefinedFunction(String userDefinedFunction) {
            this.userDefinedFunction = userDefinedFunction;
            this.__explicitlySet__.add("userDefinedFunction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UDFFormatEntry build() {
            UDFFormatEntry __instance__ = new UDFFormatEntry(description, userDefinedFunction);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UDFFormatEntry o) {
            Builder copiedBuilder =
                    description(o.getDescription()).userDefinedFunction(o.getUserDefinedFunction());

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

    @Deprecated
    public UDFFormatEntry(String description, String userDefinedFunction) {
        super(description);
        this.userDefinedFunction = userDefinedFunction;
    }

    /**
     * The user-defined function in SCHEMA_NAME.PACKAGE_NAME.FUNCTION_NAME format.
     * It can be a standalone or packaged function, so PACKAGE_NAME is optional.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userDefinedFunction")
    private final String userDefinedFunction;

    public String getUserDefinedFunction() {
        return userDefinedFunction;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UDFFormatEntry(");
        sb.append("super=").append(super.toString());
        sb.append(", userDefinedFunction=").append(String.valueOf(this.userDefinedFunction));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UDFFormatEntry)) {
            return false;
        }

        UDFFormatEntry other = (UDFFormatEntry) o;
        return java.util.Objects.equals(this.userDefinedFunction, other.userDefinedFunction)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.userDefinedFunction == null
                                ? 43
                                : this.userDefinedFunction.hashCode());
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
