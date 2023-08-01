/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * An object containing details of a REST response. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EndpointResponse.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EndpointResponse
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"contentType", "example"})
    public EndpointResponse(String contentType, String example) {
        super();
        this.contentType = contentType;
        this.example = example;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The response content type. */
        @com.fasterxml.jackson.annotation.JsonProperty("contentType")
        private String contentType;

        /**
         * The response content type.
         *
         * @param contentType the value to set
         * @return this builder
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            this.__explicitlySet__.add("contentType");
            return this;
        }
        /** A sample response. */
        @com.fasterxml.jackson.annotation.JsonProperty("example")
        private String example;

        /**
         * A sample response.
         *
         * @param example the value to set
         * @return this builder
         */
        public Builder example(String example) {
            this.example = example;
            this.__explicitlySet__.add("example");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EndpointResponse build() {
            EndpointResponse model = new EndpointResponse(this.contentType, this.example);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EndpointResponse model) {
            if (model.wasPropertyExplicitlySet("contentType")) {
                this.contentType(model.getContentType());
            }
            if (model.wasPropertyExplicitlySet("example")) {
                this.example(model.getExample());
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

    /** The response content type. */
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    private final String contentType;

    /**
     * The response content type.
     *
     * @return the value
     */
    public String getContentType() {
        return contentType;
    }

    /** A sample response. */
    @com.fasterxml.jackson.annotation.JsonProperty("example")
    private final String example;

    /**
     * A sample response.
     *
     * @return the value
     */
    public String getExample() {
        return example;
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
        sb.append("EndpointResponse(");
        sb.append("super=").append(super.toString());
        sb.append("contentType=").append(String.valueOf(this.contentType));
        sb.append(", example=").append(String.valueOf(this.example));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EndpointResponse)) {
            return false;
        }

        EndpointResponse other = (EndpointResponse) o;
        return java.util.Objects.equals(this.contentType, other.contentType)
                && java.util.Objects.equals(this.example, other.example)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result = (result * PRIME) + (this.example == null ? 43 : this.example.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
