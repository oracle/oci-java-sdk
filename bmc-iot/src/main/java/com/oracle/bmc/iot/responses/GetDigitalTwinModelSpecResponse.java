/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot.responses;

import com.oracle.bmc.iot.model.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.oracle.bmc.InternalSdk;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250531")
public class GetDigitalTwinModelSpecResponse extends com.oracle.bmc.responses.BmcResponse {
    /** For optimistic concurrency control. See {@code if-match}. */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** The returned {@code java.util.Map<String, Object>} instance. */
    private java.util.Map<String, Object> map;

    /**
     * The returned {@code java.util.Map<String, Object>} instance.
     *
     * @return the value
     */
    public java.util.Map<String, Object> getMap() {
        return map;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "map"
    })
    private GetDigitalTwinModelSpecResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcRequestId,
            java.util.Map<String, Object> map) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.map = map;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    GetDigitalTwinModelSpecResponse> {
        private int __httpStatusCode__;

        @Override
        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private java.util.Map<String, java.util.List<String>> headers;

        @Override
        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            return this;
        }

        /** For optimistic concurrency control. See {@code if-match}. */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The returned {@code java.util.Map<String, Object>} instance. */
        private java.util.Map<String, Object> map;

        /**
         * The returned {@code java.util.Map<String, Object>} instance.
         *
         * @param map the value to set
         * @return this builder
         */
        public Builder map(java.util.Map<String, Object> map) {
            this.map = map;
            return this;
        }

        /**
         * The returned {@code java.util.Map&lt;String, Object&gt;} instance.
         *
         * <p>This method allows setting the result using the {@link ResultWrapper} type.
         *
         * @param resultWrapper the response body type wrapper
         * @return this builder
         */
        @InternalSdk
        public Builder resultWrapper(ResultWrapper resultWrapper) {
            this.map = resultWrapper.result;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetDigitalTwinModelSpecResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            map(o.getMap());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetDigitalTwinModelSpecResponse build() {
            return new GetDigitalTwinModelSpecResponse(
                    __httpStatusCode__, headers, etag, opcRequestId, map);
        }
    }

    /**
     * A wrapper for the response body type.
     * <p>The wrapper simplifies the deserialization and serialization of the
     * {@code java.util.Map<String, Object> as it contains generic parameters.</p>
     */
    @InternalSdk
    public static class ResultWrapper {

        private final java.util.Map<String, Object> result;

        /** Create the wrapper given the response body. */
        @InternalSdk
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        public ResultWrapper(java.util.Map<String, Object> result) {
            this.result = result;
        }

        /** Get the response body. */
        @JsonValue
        public java.util.Map<String, Object> getResult() {
            return result;
        }
    }

    /**
     * Return a new builder for this response object.
     *
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",map=").append(String.valueOf(map));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetDigitalTwinModelSpecResponse)) {
            return false;
        }

        GetDigitalTwinModelSpecResponse other = (GetDigitalTwinModelSpecResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.map, other.map);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.map == null ? 43 : this.map.hashCode());
        return result;
    }
}
