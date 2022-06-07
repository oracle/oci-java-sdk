/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Details of the header.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Header.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Header {
    @Deprecated
    @java.beans.ConstructorProperties({"headerName", "headerValue"})
    public Header(String headerName, String headerValue) {
        super();
        this.headerName = headerName;
        this.headerValue = headerValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("headerName")
        private String headerName;

        public Builder headerName(String headerName) {
            this.headerName = headerName;
            this.__explicitlySet__.add("headerName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("headerValue")
        private String headerValue;

        public Builder headerValue(String headerValue) {
            this.headerValue = headerValue;
            this.__explicitlySet__.add("headerValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Header build() {
            Header __instance__ = new Header(headerName, headerValue);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Header o) {
            Builder copiedBuilder = headerName(o.getHeaderName()).headerValue(o.getHeaderValue());

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
     * Name of the header.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headerName")
    private final String headerName;

    public String getHeaderName() {
        return headerName;
    }

    /**
     * Value of the header.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headerValue")
    private final String headerValue;

    public String getHeaderValue() {
        return headerValue;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Header(");
        sb.append("headerName=").append(String.valueOf(this.headerName));
        sb.append(", headerValue=").append(String.valueOf(this.headerValue));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Header)) {
            return false;
        }

        Header other = (Header) o;
        return java.util.Objects.equals(this.headerName, other.headerName)
                && java.util.Objects.equals(this.headerValue, other.headerValue)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.headerName == null ? 43 : this.headerName.hashCode());
        result = (result * PRIME) + (this.headerValue == null ? 43 : this.headerValue.hashCode());
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
