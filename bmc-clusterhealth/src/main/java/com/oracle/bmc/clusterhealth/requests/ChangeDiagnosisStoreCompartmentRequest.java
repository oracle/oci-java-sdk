/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.clusterhealth.requests;

import com.oracle.bmc.clusterhealth.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/clusterhealth/ChangeDiagnosisStoreCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeDiagnosisStoreCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260331")
public class ChangeDiagnosisStoreCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.clusterhealth.model.ChangeDiagnosisStoreCompartmentDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Diagnosis.
     */
    private String diagnosisStoreId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Diagnosis.
     */
    public String getDiagnosisStoreId() {
        return diagnosisStoreId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.clusterhealth.model.ChangeDiagnosisStoreCompartmentDetails
            changeDiagnosisStoreCompartmentDetails;

    /** The information to be updated. */
    public com.oracle.bmc.clusterhealth.model.ChangeDiagnosisStoreCompartmentDetails
            getChangeDiagnosisStoreCompartmentDetails() {
        return changeDiagnosisStoreCompartmentDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID. The only valid characters for request IDs
     * are letters, numbers, underscore, and dash.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID. The only valid characters for request IDs
     * are letters, numbers, underscore, and dash.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.clusterhealth.model.ChangeDiagnosisStoreCompartmentDetails getBody$() {
        return changeDiagnosisStoreCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeDiagnosisStoreCompartmentRequest,
                    com.oracle.bmc.clusterhealth.model.ChangeDiagnosisStoreCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Diagnosis.
         */
        private String diagnosisStoreId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Diagnosis.
         *
         * @param diagnosisStoreId the value to set
         * @return this builder instance
         */
        public Builder diagnosisStoreId(String diagnosisStoreId) {
            this.diagnosisStoreId = diagnosisStoreId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.clusterhealth.model.ChangeDiagnosisStoreCompartmentDetails
                changeDiagnosisStoreCompartmentDetails = null;

        /**
         * The information to be updated.
         *
         * @param changeDiagnosisStoreCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeDiagnosisStoreCompartmentDetails(
                com.oracle.bmc.clusterhealth.model.ChangeDiagnosisStoreCompartmentDetails
                        changeDiagnosisStoreCompartmentDetails) {
            this.changeDiagnosisStoreCompartmentDetails = changeDiagnosisStoreCompartmentDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID. The only valid characters for request
         * IDs are letters, numbers, underscore, and dash.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID. The only valid characters for request
         * IDs are letters, numbers, underscore, and dash.
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
        public Builder copy(ChangeDiagnosisStoreCompartmentRequest o) {
            diagnosisStoreId(o.getDiagnosisStoreId());
            changeDiagnosisStoreCompartmentDetails(o.getChangeDiagnosisStoreCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeDiagnosisStoreCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeDiagnosisStoreCompartmentRequest
         */
        public ChangeDiagnosisStoreCompartmentRequest build() {
            ChangeDiagnosisStoreCompartmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.clusterhealth.model.ChangeDiagnosisStoreCompartmentDetails body) {
            changeDiagnosisStoreCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeDiagnosisStoreCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeDiagnosisStoreCompartmentRequest
         */
        public ChangeDiagnosisStoreCompartmentRequest buildWithoutInvocationCallback() {
            ChangeDiagnosisStoreCompartmentRequest request =
                    new ChangeDiagnosisStoreCompartmentRequest();
            request.diagnosisStoreId = diagnosisStoreId;
            request.changeDiagnosisStoreCompartmentDetails = changeDiagnosisStoreCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeDiagnosisStoreCompartmentRequest(diagnosisStoreId,
            // changeDiagnosisStoreCompartmentDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .diagnosisStoreId(diagnosisStoreId)
                .changeDiagnosisStoreCompartmentDetails(changeDiagnosisStoreCompartmentDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
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
        sb.append(",diagnosisStoreId=").append(String.valueOf(this.diagnosisStoreId));
        sb.append(",changeDiagnosisStoreCompartmentDetails=")
                .append(String.valueOf(this.changeDiagnosisStoreCompartmentDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeDiagnosisStoreCompartmentRequest)) {
            return false;
        }

        ChangeDiagnosisStoreCompartmentRequest other = (ChangeDiagnosisStoreCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.diagnosisStoreId, other.diagnosisStoreId)
                && java.util.Objects.equals(
                        this.changeDiagnosisStoreCompartmentDetails,
                        other.changeDiagnosisStoreCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
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
                        + (this.changeDiagnosisStoreCompartmentDetails == null
                                ? 43
                                : this.changeDiagnosisStoreCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
