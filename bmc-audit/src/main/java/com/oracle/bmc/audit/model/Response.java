/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.audit.model;

/**
 * A container object for response attributes. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Response.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Response extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"status", "responseTime", "headers", "payload", "message"})
    public Response(
            String status,
            java.util.Date responseTime,
            java.util.Map<String, java.util.List<String>> headers,
            java.util.Map<String, Object> payload,
            String message) {
        super();
        this.status = status;
        this.responseTime = responseTime;
        this.headers = headers;
        this.payload = payload;
        this.message = message;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The status code of the response.
         *
         * <p>Example: {@code 200}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * The status code of the response.
         *
         * <p>Example: {@code 200}
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The time of the response to the audited request, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2019-09-18T00:10:59.278Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("responseTime")
        private java.util.Date responseTime;

        /**
         * The time of the response to the audited request, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2019-09-18T00:10:59.278Z}
         *
         * @param responseTime the value to set
         * @return this builder
         */
        public Builder responseTime(java.util.Date responseTime) {
            this.responseTime = responseTime;
            this.__explicitlySet__.add("responseTime");
            return this;
        }
        /**
         * The headers of the response.
         *
         * <p>Example:
         *
         * <p>----- { "ETag": [ "<unique_ID>" ], "Connection": [ "close" ], "Content-Length": [
         * "1828" ], "opc-request-id": [ "<unique_ID>" ], "Date": [ "Wed, 18 Sep 2019 00:10:59 GMT"
         * ], "Content-Type": [ "application/json" ] } -----
         */
        @com.fasterxml.jackson.annotation.JsonProperty("headers")
        private java.util.Map<String, java.util.List<String>> headers;

        /**
         * The headers of the response.
         *
         * <p>Example:
         *
         * <p>----- { "ETag": [ "<unique_ID>" ], "Connection": [ "close" ], "Content-Length": [
         * "1828" ], "opc-request-id": [ "<unique_ID>" ], "Date": [ "Wed, 18 Sep 2019 00:10:59 GMT"
         * ], "Content-Type": [ "application/json" ] } -----
         *
         * @param headers the value to set
         * @return this builder
         */
        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            this.__explicitlySet__.add("headers");
            return this;
        }
        /**
         * This value is included for backward compatibility with the Audit version 1 schema, where
         * it contained metadata of interest from the response payload.
         *
         * <p>Example:
         *
         * <p>----- { "resourceName": "my_instance", "id": "ocid1.instance.oc1.phx.<unique_ID>" }
         * -----
         */
        @com.fasterxml.jackson.annotation.JsonProperty("payload")
        private java.util.Map<String, Object> payload;

        /**
         * This value is included for backward compatibility with the Audit version 1 schema, where
         * it contained metadata of interest from the response payload.
         *
         * <p>Example:
         *
         * <p>----- { "resourceName": "my_instance", "id": "ocid1.instance.oc1.phx.<unique_ID>" }
         * -----
         *
         * @param payload the value to set
         * @return this builder
         */
        public Builder payload(java.util.Map<String, Object> payload) {
            this.payload = payload;
            this.__explicitlySet__.add("payload");
            return this;
        }
        /**
         * A friendly description of what happened during the operation. Use this for
         * troubleshooting.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * A friendly description of what happened during the operation. Use this for
         * troubleshooting.
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Response build() {
            Response model =
                    new Response(
                            this.status,
                            this.responseTime,
                            this.headers,
                            this.payload,
                            this.message);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Response model) {
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("responseTime")) {
                this.responseTime(model.getResponseTime());
            }
            if (model.wasPropertyExplicitlySet("headers")) {
                this.headers(model.getHeaders());
            }
            if (model.wasPropertyExplicitlySet("payload")) {
                this.payload(model.getPayload());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
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

    /**
     * The status code of the response.
     *
     * <p>Example: {@code 200}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * The status code of the response.
     *
     * <p>Example: {@code 200}
     *
     * @return the value
     */
    public String getStatus() {
        return status;
    }

    /**
     * The time of the response to the audited request, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2019-09-18T00:10:59.278Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("responseTime")
    private final java.util.Date responseTime;

    /**
     * The time of the response to the audited request, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2019-09-18T00:10:59.278Z}
     *
     * @return the value
     */
    public java.util.Date getResponseTime() {
        return responseTime;
    }

    /**
     * The headers of the response.
     *
     * <p>Example:
     *
     * <p>----- { "ETag": [ "<unique_ID>" ], "Connection": [ "close" ], "Content-Length": [ "1828"
     * ], "opc-request-id": [ "<unique_ID>" ], "Date": [ "Wed, 18 Sep 2019 00:10:59 GMT" ],
     * "Content-Type": [ "application/json" ] } -----
     */
    @com.fasterxml.jackson.annotation.JsonProperty("headers")
    private final java.util.Map<String, java.util.List<String>> headers;

    /**
     * The headers of the response.
     *
     * <p>Example:
     *
     * <p>----- { "ETag": [ "<unique_ID>" ], "Connection": [ "close" ], "Content-Length": [ "1828"
     * ], "opc-request-id": [ "<unique_ID>" ], "Date": [ "Wed, 18 Sep 2019 00:10:59 GMT" ],
     * "Content-Type": [ "application/json" ] } -----
     *
     * @return the value
     */
    public java.util.Map<String, java.util.List<String>> getHeaders() {
        return headers;
    }

    /**
     * This value is included for backward compatibility with the Audit version 1 schema, where it
     * contained metadata of interest from the response payload.
     *
     * <p>Example:
     *
     * <p>----- { "resourceName": "my_instance", "id": "ocid1.instance.oc1.phx.<unique_ID>" } -----
     */
    @com.fasterxml.jackson.annotation.JsonProperty("payload")
    private final java.util.Map<String, Object> payload;

    /**
     * This value is included for backward compatibility with the Audit version 1 schema, where it
     * contained metadata of interest from the response payload.
     *
     * <p>Example:
     *
     * <p>----- { "resourceName": "my_instance", "id": "ocid1.instance.oc1.phx.<unique_ID>" } -----
     *
     * @return the value
     */
    public java.util.Map<String, Object> getPayload() {
        return payload;
    }

    /**
     * A friendly description of what happened during the operation. Use this for troubleshooting.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * A friendly description of what happened during the operation. Use this for troubleshooting.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
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
        sb.append("Response(");
        sb.append("super=").append(super.toString());
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", responseTime=").append(String.valueOf(this.responseTime));
        sb.append(", headers=").append(String.valueOf(this.headers));
        sb.append(", payload=").append(String.valueOf(this.payload));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Response)) {
            return false;
        }

        Response other = (Response) o;
        return java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.responseTime, other.responseTime)
                && java.util.Objects.equals(this.headers, other.headers)
                && java.util.Objects.equals(this.payload, other.payload)
                && java.util.Objects.equals(this.message, other.message)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.responseTime == null ? 43 : this.responseTime.hashCode());
        result = (result * PRIME) + (this.headers == null ? 43 : this.headers.hashCode());
        result = (result * PRIME) + (this.payload == null ? 43 : this.payload.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
