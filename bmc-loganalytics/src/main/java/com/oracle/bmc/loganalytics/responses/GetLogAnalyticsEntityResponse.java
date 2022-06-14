/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.responses;

import com.oracle.bmc.loganalytics.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class GetLogAnalyticsEntityResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
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
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned LogAnalyticsEntity instance.
     */
    private com.oracle.bmc.loganalytics.model.LogAnalyticsEntity logAnalyticsEntity;

    /**
     * The returned LogAnalyticsEntity instance.
     * @return the value
     */
    public com.oracle.bmc.loganalytics.model.LogAnalyticsEntity getLogAnalyticsEntity() {
        return logAnalyticsEntity;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "opcRequestId",
        "logAnalyticsEntity"
    })
    private GetLogAnalyticsEntityResponse(
            int __httpStatusCode__,
            String etag,
            String opcRequestId,
            com.oracle.bmc.loganalytics.model.LogAnalyticsEntity logAnalyticsEntity) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.logAnalyticsEntity = logAnalyticsEntity;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         */
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
         * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned LogAnalyticsEntity instance.
         */
        private com.oracle.bmc.loganalytics.model.LogAnalyticsEntity logAnalyticsEntity;

        /**
         * The returned LogAnalyticsEntity instance.
         * @param logAnalyticsEntity the value to set
         * @return this builder
         */
        public Builder logAnalyticsEntity(
                com.oracle.bmc.loganalytics.model.LogAnalyticsEntity logAnalyticsEntity) {
            this.logAnalyticsEntity = logAnalyticsEntity;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetLogAnalyticsEntityResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            logAnalyticsEntity(o.getLogAnalyticsEntity());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetLogAnalyticsEntityResponse build() {
            return new GetLogAnalyticsEntityResponse(
                    __httpStatusCode__, etag, opcRequestId, logAnalyticsEntity);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",logAnalyticsEntity=").append(String.valueOf(logAnalyticsEntity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetLogAnalyticsEntityResponse)) {
            return false;
        }

        GetLogAnalyticsEntityResponse other = (GetLogAnalyticsEntityResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.logAnalyticsEntity, other.logAnalyticsEntity);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.logAnalyticsEntity == null
                                ? 43
                                : this.logAnalyticsEntity.hashCode());
        return result;
    }
}
