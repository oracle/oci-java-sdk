/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.responses;

import com.oracle.bmc.ailanguage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
public class DetectLanguageEntitiesResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** This API will be retired on Monday, 10 Oct 2022 00:00:00 GMT */
    private String sunset;

    /**
     * This API will be retired on Monday, 10 Oct 2022 00:00:00 GMT
     *
     * @return the value
     */
    public String getSunset() {
        return sunset;
    }

    /** The returned DetectLanguageEntitiesResult instance. */
    private com.oracle.bmc.ailanguage.model.DetectLanguageEntitiesResult
            detectLanguageEntitiesResult;

    /**
     * The returned DetectLanguageEntitiesResult instance.
     *
     * @return the value
     */
    public com.oracle.bmc.ailanguage.model.DetectLanguageEntitiesResult
            getDetectLanguageEntitiesResult() {
        return detectLanguageEntitiesResult;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "sunset",
        "detectLanguageEntitiesResult"
    })
    private DetectLanguageEntitiesResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String sunset,
            com.oracle.bmc.ailanguage.model.DetectLanguageEntitiesResult
                    detectLanguageEntitiesResult) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.sunset = sunset;
        this.detectLanguageEntitiesResult = detectLanguageEntitiesResult;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    DetectLanguageEntitiesResponse> {
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

        /** This API will be retired on Monday, 10 Oct 2022 00:00:00 GMT */
        private String sunset;

        /**
         * This API will be retired on Monday, 10 Oct 2022 00:00:00 GMT
         *
         * @param sunset the value to set
         * @return this builder
         */
        public Builder sunset(String sunset) {
            this.sunset = sunset;
            return this;
        }

        /** The returned DetectLanguageEntitiesResult instance. */
        private com.oracle.bmc.ailanguage.model.DetectLanguageEntitiesResult
                detectLanguageEntitiesResult;

        /**
         * The returned DetectLanguageEntitiesResult instance.
         *
         * @param detectLanguageEntitiesResult the value to set
         * @return this builder
         */
        public Builder detectLanguageEntitiesResult(
                com.oracle.bmc.ailanguage.model.DetectLanguageEntitiesResult
                        detectLanguageEntitiesResult) {
            this.detectLanguageEntitiesResult = detectLanguageEntitiesResult;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(DetectLanguageEntitiesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            sunset(o.getSunset());
            detectLanguageEntitiesResult(o.getDetectLanguageEntitiesResult());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public DetectLanguageEntitiesResponse build() {
            return new DetectLanguageEntitiesResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    sunset,
                    detectLanguageEntitiesResult);
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
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",sunset=").append(String.valueOf(sunset));
        sb.append(",detectLanguageEntitiesResult=")
                .append(String.valueOf(detectLanguageEntitiesResult));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetectLanguageEntitiesResponse)) {
            return false;
        }

        DetectLanguageEntitiesResponse other = (DetectLanguageEntitiesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.sunset, other.sunset)
                && java.util.Objects.equals(
                        this.detectLanguageEntitiesResult, other.detectLanguageEntitiesResult);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.sunset == null ? 43 : this.sunset.hashCode());
        result =
                (result * PRIME)
                        + (this.detectLanguageEntitiesResult == null
                                ? 43
                                : this.detectLanguageEntitiesResult.hashCode());
        return result;
    }
}
