/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetVcnOverlapExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetVcnOverlapRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetVcnOverlapRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.GetIpInventoryVcnOverlapDetails> {

    /**
     * Specify the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the VCN.
     */
    private String vcnId;

    /**
     * Specify the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the VCN.
     */
    public String getVcnId() {
        return vcnId;
    }
    /** Lists details of the IP Inventory VCN overlap data. */
    private com.oracle.bmc.core.model.GetIpInventoryVcnOverlapDetails getVcnOverlapDetails;

    /** Lists details of the IP Inventory VCN overlap data. */
    public com.oracle.bmc.core.model.GetIpInventoryVcnOverlapDetails getGetVcnOverlapDetails() {
        return getVcnOverlapDetails;
    }
    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.GetIpInventoryVcnOverlapDetails getBody$() {
        return getVcnOverlapDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetVcnOverlapRequest,
                    com.oracle.bmc.core.model.GetIpInventoryVcnOverlapDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Specify the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the VCN.
         */
        private String vcnId = null;

        /**
         * Specify the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the VCN.
         *
         * @param vcnId the value to set
         * @return this builder instance
         */
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            return this;
        }

        /** Lists details of the IP Inventory VCN overlap data. */
        private com.oracle.bmc.core.model.GetIpInventoryVcnOverlapDetails getVcnOverlapDetails =
                null;

        /**
         * Lists details of the IP Inventory VCN overlap data.
         *
         * @param getVcnOverlapDetails the value to set
         * @return this builder instance
         */
        public Builder getVcnOverlapDetails(
                com.oracle.bmc.core.model.GetIpInventoryVcnOverlapDetails getVcnOverlapDetails) {
            this.getVcnOverlapDetails = getVcnOverlapDetails;
            return this;
        }

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(GetVcnOverlapRequest o) {
            vcnId(o.getVcnId());
            getVcnOverlapDetails(o.getGetVcnOverlapDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetVcnOverlapRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetVcnOverlapRequest
         */
        public GetVcnOverlapRequest build() {
            GetVcnOverlapRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.core.model.GetIpInventoryVcnOverlapDetails body) {
            getVcnOverlapDetails(body);
            return this;
        }

        /**
         * Build the instance of GetVcnOverlapRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetVcnOverlapRequest
         */
        public GetVcnOverlapRequest buildWithoutInvocationCallback() {
            GetVcnOverlapRequest request = new GetVcnOverlapRequest();
            request.vcnId = vcnId;
            request.getVcnOverlapDetails = getVcnOverlapDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new GetVcnOverlapRequest(vcnId, getVcnOverlapDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .vcnId(vcnId)
                .getVcnOverlapDetails(getVcnOverlapDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",vcnId=").append(String.valueOf(this.vcnId));
        sb.append(",getVcnOverlapDetails=").append(String.valueOf(this.getVcnOverlapDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetVcnOverlapRequest)) {
            return false;
        }

        GetVcnOverlapRequest other = (GetVcnOverlapRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.getVcnOverlapDetails, other.getVcnOverlapDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result =
                (result * PRIME)
                        + (this.getVcnOverlapDetails == null
                                ? 43
                                : this.getVcnOverlapDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
