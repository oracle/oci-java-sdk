/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Information about request query parameters. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RequestQueryParam.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RequestQueryParam
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"paramName", "paramValue"})
    public RequestQueryParam(String paramName, String paramValue) {
        super();
        this.paramName = paramName;
        this.paramValue = paramValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of request query parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("paramName")
        private String paramName;

        /**
         * Name of request query parameter.
         *
         * @param paramName the value to set
         * @return this builder
         */
        public Builder paramName(String paramName) {
            this.paramName = paramName;
            this.__explicitlySet__.add("paramName");
            return this;
        }
        /** Value of request query parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("paramValue")
        private String paramValue;

        /**
         * Value of request query parameter.
         *
         * @param paramValue the value to set
         * @return this builder
         */
        public Builder paramValue(String paramValue) {
            this.paramValue = paramValue;
            this.__explicitlySet__.add("paramValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestQueryParam build() {
            RequestQueryParam model = new RequestQueryParam(this.paramName, this.paramValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequestQueryParam model) {
            if (model.wasPropertyExplicitlySet("paramName")) {
                this.paramName(model.getParamName());
            }
            if (model.wasPropertyExplicitlySet("paramValue")) {
                this.paramValue(model.getParamValue());
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

    /** Name of request query parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("paramName")
    private final String paramName;

    /**
     * Name of request query parameter.
     *
     * @return the value
     */
    public String getParamName() {
        return paramName;
    }

    /** Value of request query parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("paramValue")
    private final String paramValue;

    /**
     * Value of request query parameter.
     *
     * @return the value
     */
    public String getParamValue() {
        return paramValue;
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
        sb.append("RequestQueryParam(");
        sb.append("super=").append(super.toString());
        sb.append("paramName=").append(String.valueOf(this.paramName));
        sb.append(", paramValue=").append(String.valueOf(this.paramValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestQueryParam)) {
            return false;
        }

        RequestQueryParam other = (RequestQueryParam) o;
        return java.util.Objects.equals(this.paramName, other.paramName)
                && java.util.Objects.equals(this.paramValue, other.paramValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.paramName == null ? 43 : this.paramName.hashCode());
        result = (result * PRIME) + (this.paramValue == null ? 43 : this.paramValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
