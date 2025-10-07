/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot.model;

/**
 * Text data payload definition <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InvokeRawTextCommandDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "requestDataFormat")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InvokeRawTextCommandDetails extends InvokeRawCommandDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("requestDuration")
        private String requestDuration;

        public Builder requestDuration(String requestDuration) {
            this.requestDuration = requestDuration;
            this.__explicitlySet__.add("requestDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseDuration")
        private String responseDuration;

        public Builder responseDuration(String responseDuration) {
            this.responseDuration = responseDuration;
            this.__explicitlySet__.add("responseDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestEndpoint")
        private String requestEndpoint;

        public Builder requestEndpoint(String requestEndpoint) {
            this.requestEndpoint = requestEndpoint;
            this.__explicitlySet__.add("requestEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseEndpoint")
        private String responseEndpoint;

        public Builder responseEndpoint(String responseEndpoint) {
            this.responseEndpoint = responseEndpoint;
            this.__explicitlySet__.add("responseEndpoint");
            return this;
        }
        /** Mime content type of text data, default is text/plain */
        @com.fasterxml.jackson.annotation.JsonProperty("requestDataContentType")
        private String requestDataContentType;

        /**
         * Mime content type of text data, default is text/plain
         *
         * @param requestDataContentType the value to set
         * @return this builder
         */
        public Builder requestDataContentType(String requestDataContentType) {
            this.requestDataContentType = requestDataContentType;
            this.__explicitlySet__.add("requestDataContentType");
            return this;
        }
        /** Plain text request data */
        @com.fasterxml.jackson.annotation.JsonProperty("requestData")
        private String requestData;

        /**
         * Plain text request data
         *
         * @param requestData the value to set
         * @return this builder
         */
        public Builder requestData(String requestData) {
            this.requestData = requestData;
            this.__explicitlySet__.add("requestData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InvokeRawTextCommandDetails build() {
            InvokeRawTextCommandDetails model =
                    new InvokeRawTextCommandDetails(
                            this.requestDuration,
                            this.responseDuration,
                            this.requestEndpoint,
                            this.responseEndpoint,
                            this.requestDataContentType,
                            this.requestData);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InvokeRawTextCommandDetails model) {
            if (model.wasPropertyExplicitlySet("requestDuration")) {
                this.requestDuration(model.getRequestDuration());
            }
            if (model.wasPropertyExplicitlySet("responseDuration")) {
                this.responseDuration(model.getResponseDuration());
            }
            if (model.wasPropertyExplicitlySet("requestEndpoint")) {
                this.requestEndpoint(model.getRequestEndpoint());
            }
            if (model.wasPropertyExplicitlySet("responseEndpoint")) {
                this.responseEndpoint(model.getResponseEndpoint());
            }
            if (model.wasPropertyExplicitlySet("requestDataContentType")) {
                this.requestDataContentType(model.getRequestDataContentType());
            }
            if (model.wasPropertyExplicitlySet("requestData")) {
                this.requestData(model.getRequestData());
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

    @Deprecated
    public InvokeRawTextCommandDetails(
            String requestDuration,
            String responseDuration,
            String requestEndpoint,
            String responseEndpoint,
            String requestDataContentType,
            String requestData) {
        super(requestDuration, responseDuration, requestEndpoint, responseEndpoint);
        this.requestDataContentType = requestDataContentType;
        this.requestData = requestData;
    }

    /** Mime content type of text data, default is text/plain */
    @com.fasterxml.jackson.annotation.JsonProperty("requestDataContentType")
    private final String requestDataContentType;

    /**
     * Mime content type of text data, default is text/plain
     *
     * @return the value
     */
    public String getRequestDataContentType() {
        return requestDataContentType;
    }

    /** Plain text request data */
    @com.fasterxml.jackson.annotation.JsonProperty("requestData")
    private final String requestData;

    /**
     * Plain text request data
     *
     * @return the value
     */
    public String getRequestData() {
        return requestData;
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
        sb.append("InvokeRawTextCommandDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", requestDataContentType=").append(String.valueOf(this.requestDataContentType));
        sb.append(", requestData=").append(String.valueOf(this.requestData));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InvokeRawTextCommandDetails)) {
            return false;
        }

        InvokeRawTextCommandDetails other = (InvokeRawTextCommandDetails) o;
        return java.util.Objects.equals(this.requestDataContentType, other.requestDataContentType)
                && java.util.Objects.equals(this.requestData, other.requestData)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.requestDataContentType == null
                                ? 43
                                : this.requestDataContentType.hashCode());
        result = (result * PRIME) + (this.requestData == null ? 43 : this.requestData.hashCode());
        return result;
    }
}
