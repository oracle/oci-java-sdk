/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.responses;

import com.oracle.bmc.aianomalydetection.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
public class DetectAnomaliesResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned AnomalyDetectResult instance.
     */
    private com.oracle.bmc.aianomalydetection.model.AnomalyDetectResult anomalyDetectResult;

    /**
     * The returned AnomalyDetectResult instance.
     * @return the value
     */
    public com.oracle.bmc.aianomalydetection.model.AnomalyDetectResult getAnomalyDetectResult() {
        return anomalyDetectResult;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "anomalyDetectResult"
    })
    private DetectAnomaliesResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            com.oracle.bmc.aianomalydetection.model.AnomalyDetectResult anomalyDetectResult) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.anomalyDetectResult = anomalyDetectResult;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private javax.ws.rs.core.MultivaluedMap<String, String> headers;

        public Builder headers(javax.ws.rs.core.MultivaluedMap<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned AnomalyDetectResult instance.
         */
        private com.oracle.bmc.aianomalydetection.model.AnomalyDetectResult anomalyDetectResult;

        /**
         * The returned AnomalyDetectResult instance.
         * @param anomalyDetectResult the value to set
         * @return this builder
         */
        public Builder anomalyDetectResult(
                com.oracle.bmc.aianomalydetection.model.AnomalyDetectResult anomalyDetectResult) {
            this.anomalyDetectResult = anomalyDetectResult;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(DetectAnomaliesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            anomalyDetectResult(o.getAnomalyDetectResult());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public DetectAnomaliesResponse build() {
            return new DetectAnomaliesResponse(
                    __httpStatusCode__, headers, opcRequestId, anomalyDetectResult);
        }
    }

    /**
     * Return a new builder for this response object.
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
        sb.append(",anomalyDetectResult=").append(String.valueOf(anomalyDetectResult));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetectAnomaliesResponse)) {
            return false;
        }

        DetectAnomaliesResponse other = (DetectAnomaliesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.anomalyDetectResult, other.anomalyDetectResult);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.anomalyDetectResult == null
                                ? 43
                                : this.anomalyDetectResult.hashCode());
        return result;
    }
}
