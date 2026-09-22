/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.clusterhealth.requests;

import com.oracle.bmc.clusterhealth.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/clusterhealth/RequestDiagnosisExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use RequestDiagnosisRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260331")
public class RequestDiagnosisRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.clusterhealth.model.RequestDiagnosisDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Diagnosis.
     */
    private String diagnosisStoreId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Diagnosis.
     */
    public String getDiagnosisStoreId() {
        return diagnosisStoreId;
    }
    /**
     * At least one healthCheck ID.
     */
    private com.oracle.bmc.clusterhealth.model.RequestDiagnosisDetails requestDiagnosisDetails;

    /**
     * At least one healthCheck ID.
     */
    public com.oracle.bmc.clusterhealth.model.RequestDiagnosisDetails getRequestDiagnosisDetails() {
        return requestDiagnosisDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     * The only valid characters for request IDs are letters, numbers,
     * underscore, and dash.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     * The only valid characters for request IDs are letters, numbers,
     * underscore, and dash.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.clusterhealth.model.RequestDiagnosisDetails getBody$() {
        return requestDiagnosisDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RequestDiagnosisRequest,
                    com.oracle.bmc.clusterhealth.model.RequestDiagnosisDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Diagnosis.
         */
        private String diagnosisStoreId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Diagnosis.
         * @param diagnosisStoreId the value to set
         * @return this builder instance
         */
        public Builder diagnosisStoreId(String diagnosisStoreId) {
            this.diagnosisStoreId = diagnosisStoreId;
            return this;
        }

        /**
         * At least one healthCheck ID.
         */
        private com.oracle.bmc.clusterhealth.model.RequestDiagnosisDetails requestDiagnosisDetails =
                null;

        /**
         * At least one healthCheck ID.
         * @param requestDiagnosisDetails the value to set
         * @return this builder instance
         */
        public Builder requestDiagnosisDetails(
                com.oracle.bmc.clusterhealth.model.RequestDiagnosisDetails
                        requestDiagnosisDetails) {
            this.requestDiagnosisDetails = requestDiagnosisDetails;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         * The only valid characters for request IDs are letters, numbers,
         * underscore, and dash.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         * The only valid characters for request IDs are letters, numbers,
         * underscore, and dash.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
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
         * @return this builder instance
         */
        public Builder copy(RequestDiagnosisRequest o) {
            diagnosisStoreId(o.getDiagnosisStoreId());
            requestDiagnosisDetails(o.getRequestDiagnosisDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RequestDiagnosisRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of RequestDiagnosisRequest
         */
        public RequestDiagnosisRequest build() {
            RequestDiagnosisRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.clusterhealth.model.RequestDiagnosisDetails body) {
            requestDiagnosisDetails(body);
            return this;
        }

        /**
         * Build the instance of RequestDiagnosisRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RequestDiagnosisRequest
         */
        public RequestDiagnosisRequest buildWithoutInvocationCallback() {
            RequestDiagnosisRequest request = new RequestDiagnosisRequest();
            request.diagnosisStoreId = diagnosisStoreId;
            request.requestDiagnosisDetails = requestDiagnosisDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new RequestDiagnosisRequest(diagnosisStoreId, requestDiagnosisDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .diagnosisStoreId(diagnosisStoreId)
                .requestDiagnosisDetails(requestDiagnosisDetails)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
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
        sb.append(",diagnosisStoreId=").append(String.valueOf(this.diagnosisStoreId));
        sb.append(",requestDiagnosisDetails=").append(String.valueOf(this.requestDiagnosisDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestDiagnosisRequest)) {
            return false;
        }

        RequestDiagnosisRequest other = (RequestDiagnosisRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.diagnosisStoreId, other.diagnosisStoreId)
                && java.util.Objects.equals(
                        this.requestDiagnosisDetails, other.requestDiagnosisDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.diagnosisStoreId == null ? 43 : this.diagnosisStoreId.hashCode());
        result =
                (result * PRIME)
                        + (this.requestDiagnosisDetails == null
                                ? 43
                                : this.requestDiagnosisDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
