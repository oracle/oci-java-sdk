/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot.model;

/**
 * Definition of unstructured command invocation payload <br>
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "requestDataFormat",
        defaultImpl = InvokeRawCommandDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = InvokeRawBinaryCommandDetails.class,
            name = "BINARY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = InvokeRawTextCommandDetails.class,
            name = "TEXT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = InvokeRawJsonCommandDetails.class,
            name = "JSON")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class InvokeRawCommandDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "requestDuration",
        "responseDuration",
        "requestEndpoint",
        "responseEndpoint"
    })
    protected InvokeRawCommandDetails(
            String requestDuration,
            String responseDuration,
            String requestEndpoint,
            String responseEndpoint) {
        super();
        this.requestDuration = requestDuration;
        this.responseDuration = responseDuration;
        this.requestEndpoint = requestEndpoint;
        this.responseEndpoint = responseEndpoint;
    }

    /** Specified duration by which to send the request by. */
    @com.fasterxml.jackson.annotation.JsonProperty("requestDuration")
    private final String requestDuration;

    /**
     * Specified duration by which to send the request by.
     *
     * @return the value
     */
    public String getRequestDuration() {
        return requestDuration;
    }

    /** Specified duration by which to receive the response by. */
    @com.fasterxml.jackson.annotation.JsonProperty("responseDuration")
    private final String responseDuration;

    /**
     * Specified duration by which to receive the response by.
     *
     * @return the value
     */
    public String getResponseDuration() {
        return responseDuration;
    }

    /** Device endpoint where request should be forwarded to. */
    @com.fasterxml.jackson.annotation.JsonProperty("requestEndpoint")
    private final String requestEndpoint;

    /**
     * Device endpoint where request should be forwarded to.
     *
     * @return the value
     */
    public String getRequestEndpoint() {
        return requestEndpoint;
    }

    /** Device endpoint from which response is expected to come. */
    @com.fasterxml.jackson.annotation.JsonProperty("responseEndpoint")
    private final String responseEndpoint;

    /**
     * Device endpoint from which response is expected to come.
     *
     * @return the value
     */
    public String getResponseEndpoint() {
        return responseEndpoint;
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
        sb.append("InvokeRawCommandDetails(");
        sb.append("super=").append(super.toString());
        sb.append("requestDuration=").append(String.valueOf(this.requestDuration));
        sb.append(", responseDuration=").append(String.valueOf(this.responseDuration));
        sb.append(", requestEndpoint=").append(String.valueOf(this.requestEndpoint));
        sb.append(", responseEndpoint=").append(String.valueOf(this.responseEndpoint));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InvokeRawCommandDetails)) {
            return false;
        }

        InvokeRawCommandDetails other = (InvokeRawCommandDetails) o;
        return java.util.Objects.equals(this.requestDuration, other.requestDuration)
                && java.util.Objects.equals(this.responseDuration, other.responseDuration)
                && java.util.Objects.equals(this.requestEndpoint, other.requestEndpoint)
                && java.util.Objects.equals(this.responseEndpoint, other.responseEndpoint)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.requestDuration == null ? 43 : this.requestDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.responseDuration == null ? 43 : this.responseDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.requestEndpoint == null ? 43 : this.requestEndpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.responseEndpoint == null ? 43 : this.responseEndpoint.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** data format: json, binary, text */
    public enum RequestDataFormat implements com.oracle.bmc.http.internal.BmcEnum {
        Text("TEXT"),
        Json("JSON"),
        Binary("BINARY"),
        ;

        private final String value;
        private static java.util.Map<String, RequestDataFormat> map;

        static {
            map = new java.util.HashMap<>();
            for (RequestDataFormat v : RequestDataFormat.values()) {
                map.put(v.getValue(), v);
            }
        }

        RequestDataFormat(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RequestDataFormat create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid RequestDataFormat: " + key);
        }
    };
}
