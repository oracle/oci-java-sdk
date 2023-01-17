/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.requests;

import com.oracle.bmc.cims.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cims/GetStatusExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetStatusRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
public class GetStatusRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The system that generated the support ticket, such as My Oracle Support. */
    private String source;

    /** The system that generated the support ticket, such as My Oracle Support. */
    public String getSource() {
        return source;
    }
    /**
     * User OCID for Oracle Identity Cloud Service (IDCS) users who also have a federated Oracle
     * Cloud Infrastructure account.
     */
    private String ocid;

    /**
     * User OCID for Oracle Identity Cloud Service (IDCS) users who also have a federated Oracle
     * Cloud Infrastructure account.
     */
    public String getOcid() {
        return ocid;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** The region of the tenancy. */
    private String homeregion;

    /** The region of the tenancy. */
    public String getHomeregion() {
        return homeregion;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetStatusRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The system that generated the support ticket, such as My Oracle Support. */
        private String source = null;

        /**
         * The system that generated the support ticket, such as My Oracle Support.
         *
         * @param source the value to set
         * @return this builder instance
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * User OCID for Oracle Identity Cloud Service (IDCS) users who also have a federated Oracle
         * Cloud Infrastructure account.
         */
        private String ocid = null;

        /**
         * User OCID for Oracle Identity Cloud Service (IDCS) users who also have a federated Oracle
         * Cloud Infrastructure account.
         *
         * @param ocid the value to set
         * @return this builder instance
         */
        public Builder ocid(String ocid) {
            this.ocid = ocid;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The region of the tenancy. */
        private String homeregion = null;

        /**
         * The region of the tenancy.
         *
         * @param homeregion the value to set
         * @return this builder instance
         */
        public Builder homeregion(String homeregion) {
            this.homeregion = homeregion;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        public Builder copy(GetStatusRequest o) {
            source(o.getSource());
            ocid(o.getOcid());
            opcRequestId(o.getOpcRequestId());
            homeregion(o.getHomeregion());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetStatusRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetStatusRequest
         */
        public GetStatusRequest build() {
            GetStatusRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetStatusRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetStatusRequest
         */
        public GetStatusRequest buildWithoutInvocationCallback() {
            GetStatusRequest request = new GetStatusRequest();
            request.source = source;
            request.ocid = ocid;
            request.opcRequestId = opcRequestId;
            request.homeregion = homeregion;
            return request;
            // new GetStatusRequest(source, ocid, opcRequestId, homeregion);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .source(source)
                .ocid(ocid)
                .opcRequestId(opcRequestId)
                .homeregion(homeregion);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",source=").append(String.valueOf(this.source));
        sb.append(",ocid=").append(String.valueOf(this.ocid));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",homeregion=").append(String.valueOf(this.homeregion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetStatusRequest)) {
            return false;
        }

        GetStatusRequest other = (GetStatusRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.ocid, other.ocid)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.homeregion, other.homeregion);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.ocid == null ? 43 : this.ocid.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.homeregion == null ? 43 : this.homeregion.hashCode());
        return result;
    }
}
