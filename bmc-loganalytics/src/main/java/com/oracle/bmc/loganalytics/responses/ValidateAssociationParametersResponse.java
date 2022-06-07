/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.responses;

import com.oracle.bmc.loganalytics.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class ValidateAssociationParametersResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    public String getEtag() {
        return etag;
    }

    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned LogAnalyticsAssociationParameterCollection instance.
     */
    private com.oracle.bmc.loganalytics.model.LogAnalyticsAssociationParameterCollection
            logAnalyticsAssociationParameterCollection;

    public com.oracle.bmc.loganalytics.model.LogAnalyticsAssociationParameterCollection
            getLogAnalyticsAssociationParameterCollection() {
        return logAnalyticsAssociationParameterCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "opcRequestId",
        "logAnalyticsAssociationParameterCollection"
    })
    private ValidateAssociationParametersResponse(
            int __httpStatusCode__,
            String etag,
            String opcRequestId,
            com.oracle.bmc.loganalytics.model.LogAnalyticsAssociationParameterCollection
                    logAnalyticsAssociationParameterCollection) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.logAnalyticsAssociationParameterCollection =
                logAnalyticsAssociationParameterCollection;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String etag;

        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private com.oracle.bmc.loganalytics.model.LogAnalyticsAssociationParameterCollection
                logAnalyticsAssociationParameterCollection;

        public Builder logAnalyticsAssociationParameterCollection(
                com.oracle.bmc.loganalytics.model.LogAnalyticsAssociationParameterCollection
                        logAnalyticsAssociationParameterCollection) {
            this.logAnalyticsAssociationParameterCollection =
                    logAnalyticsAssociationParameterCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ValidateAssociationParametersResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            logAnalyticsAssociationParameterCollection(
                    o.getLogAnalyticsAssociationParameterCollection());

            return this;
        }

        public ValidateAssociationParametersResponse build() {
            return new ValidateAssociationParametersResponse(
                    __httpStatusCode__,
                    etag,
                    opcRequestId,
                    logAnalyticsAssociationParameterCollection);
        }
    }

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
        sb.append(",logAnalyticsAssociationParameterCollection=")
                .append(String.valueOf(logAnalyticsAssociationParameterCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidateAssociationParametersResponse)) {
            return false;
        }

        ValidateAssociationParametersResponse other = (ValidateAssociationParametersResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.logAnalyticsAssociationParameterCollection,
                        other.logAnalyticsAssociationParameterCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.logAnalyticsAssociationParameterCollection == null
                                ? 43
                                : this.logAnalyticsAssociationParameterCollection.hashCode());
        return result;
    }
}
