/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.responses;

import com.oracle.bmc.ailanguage.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
public class DetectLanguageTextClassificationResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** This API will be retired on Monday, 10 Oct 2023 00:00:00 GMT */
    private String sunset;

    /**
     * This API will be retired on Monday, 10 Oct 2023 00:00:00 GMT
     *
     * @return the value
     */
    public String getSunset() {
        return sunset;
    }

    /** The returned {@code DetectLanguageTextClassificationResult} instance. */
    private com.oracle.bmc.ailanguage.model.DetectLanguageTextClassificationResult
            detectLanguageTextClassificationResult;

    /**
     * The returned {@code DetectLanguageTextClassificationResult} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.ailanguage.model.DetectLanguageTextClassificationResult
            getDetectLanguageTextClassificationResult() {
        return detectLanguageTextClassificationResult;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "sunset",
        "detectLanguageTextClassificationResult"
    })
    private DetectLanguageTextClassificationResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String sunset,
            com.oracle.bmc.ailanguage.model.DetectLanguageTextClassificationResult
                    detectLanguageTextClassificationResult) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.sunset = sunset;
        this.detectLanguageTextClassificationResult = detectLanguageTextClassificationResult;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    DetectLanguageTextClassificationResponse> {
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

        /** This API will be retired on Monday, 10 Oct 2023 00:00:00 GMT */
        private String sunset;

        /**
         * This API will be retired on Monday, 10 Oct 2023 00:00:00 GMT
         *
         * @param sunset the value to set
         * @return this builder
         */
        public Builder sunset(String sunset) {
            this.sunset = sunset;
            return this;
        }

        /** The returned {@code DetectLanguageTextClassificationResult} instance. */
        private com.oracle.bmc.ailanguage.model.DetectLanguageTextClassificationResult
                detectLanguageTextClassificationResult;

        /**
         * The returned {@code DetectLanguageTextClassificationResult} instance.
         *
         * @param detectLanguageTextClassificationResult the value to set
         * @return this builder
         */
        public Builder detectLanguageTextClassificationResult(
                com.oracle.bmc.ailanguage.model.DetectLanguageTextClassificationResult
                        detectLanguageTextClassificationResult) {
            this.detectLanguageTextClassificationResult = detectLanguageTextClassificationResult;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(DetectLanguageTextClassificationResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            sunset(o.getSunset());
            detectLanguageTextClassificationResult(o.getDetectLanguageTextClassificationResult());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public DetectLanguageTextClassificationResponse build() {
            return new DetectLanguageTextClassificationResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    sunset,
                    detectLanguageTextClassificationResult);
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
        sb.append(",detectLanguageTextClassificationResult=")
                .append(String.valueOf(detectLanguageTextClassificationResult));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetectLanguageTextClassificationResponse)) {
            return false;
        }

        DetectLanguageTextClassificationResponse other =
                (DetectLanguageTextClassificationResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.sunset, other.sunset)
                && java.util.Objects.equals(
                        this.detectLanguageTextClassificationResult,
                        other.detectLanguageTextClassificationResult);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.sunset == null ? 43 : this.sunset.hashCode());
        result =
                (result * PRIME)
                        + (this.detectLanguageTextClassificationResult == null
                                ? 43
                                : this.detectLanguageTextClassificationResult.hashCode());
        return result;
    }
}
