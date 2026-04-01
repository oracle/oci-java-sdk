/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase.responses;

import com.oracle.bmc.distributeddatabase.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
public class GetDistributedDatabaseRaftMetricResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned DistributedDatabaseRaftMetric instance.
     */
    private com.oracle.bmc.distributeddatabase.model.DistributedDatabaseRaftMetric
            distributedDatabaseRaftMetric;

    /**
     * The returned DistributedDatabaseRaftMetric instance.
     * @return the value
     */
    public com.oracle.bmc.distributeddatabase.model.DistributedDatabaseRaftMetric
            getDistributedDatabaseRaftMetric() {
        return distributedDatabaseRaftMetric;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "distributedDatabaseRaftMetric"
    })
    private GetDistributedDatabaseRaftMetricResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            com.oracle.bmc.distributeddatabase.model.DistributedDatabaseRaftMetric
                    distributedDatabaseRaftMetric) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.distributedDatabaseRaftMetric = distributedDatabaseRaftMetric;
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
         * The returned DistributedDatabaseRaftMetric instance.
         */
        private com.oracle.bmc.distributeddatabase.model.DistributedDatabaseRaftMetric
                distributedDatabaseRaftMetric;

        /**
         * The returned DistributedDatabaseRaftMetric instance.
         * @param distributedDatabaseRaftMetric the value to set
         * @return this builder
         */
        public Builder distributedDatabaseRaftMetric(
                com.oracle.bmc.distributeddatabase.model.DistributedDatabaseRaftMetric
                        distributedDatabaseRaftMetric) {
            this.distributedDatabaseRaftMetric = distributedDatabaseRaftMetric;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetDistributedDatabaseRaftMetricResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            distributedDatabaseRaftMetric(o.getDistributedDatabaseRaftMetric());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetDistributedDatabaseRaftMetricResponse build() {
            return new GetDistributedDatabaseRaftMetricResponse(
                    __httpStatusCode__, headers, opcRequestId, distributedDatabaseRaftMetric);
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
        sb.append(",distributedDatabaseRaftMetric=")
                .append(String.valueOf(distributedDatabaseRaftMetric));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetDistributedDatabaseRaftMetricResponse)) {
            return false;
        }

        GetDistributedDatabaseRaftMetricResponse other =
                (GetDistributedDatabaseRaftMetricResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.distributedDatabaseRaftMetric, other.distributedDatabaseRaftMetric);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.distributedDatabaseRaftMetric == null
                                ? 43
                                : this.distributedDatabaseRaftMetric.hashCode());
        return result;
    }
}
