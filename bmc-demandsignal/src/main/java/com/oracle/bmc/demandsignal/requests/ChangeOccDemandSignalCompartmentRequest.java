/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.demandsignal.requests;

import com.oracle.bmc.demandsignal.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/demandsignal/ChangeOccDemandSignalCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeOccDemandSignalCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240430")
public class ChangeOccDemandSignalCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.demandsignal.model.ChangeOccDemandSignalCompartmentDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * OccDemandSignal.
     */
    private String occDemandSignalId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * OccDemandSignal.
     */
    public String getOccDemandSignalId() {
        return occDemandSignalId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.demandsignal.model.ChangeOccDemandSignalCompartmentDetails
            changeOccDemandSignalCompartmentDetails;

    /** The information to be updated. */
    public com.oracle.bmc.demandsignal.model.ChangeOccDemandSignalCompartmentDetails
            getChangeOccDemandSignalCompartmentDetails() {
        return changeOccDemandSignalCompartmentDetails;
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
    public com.oracle.bmc.demandsignal.model.ChangeOccDemandSignalCompartmentDetails getBody$() {
        return changeOccDemandSignalCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeOccDemandSignalCompartmentRequest,
                    com.oracle.bmc.demandsignal.model.ChangeOccDemandSignalCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * OccDemandSignal.
         */
        private String occDemandSignalId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * OccDemandSignal.
         *
         * @param occDemandSignalId the value to set
         * @return this builder instance
         */
        public Builder occDemandSignalId(String occDemandSignalId) {
            this.occDemandSignalId = occDemandSignalId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.demandsignal.model.ChangeOccDemandSignalCompartmentDetails
                changeOccDemandSignalCompartmentDetails = null;

        /**
         * The information to be updated.
         *
         * @param changeOccDemandSignalCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeOccDemandSignalCompartmentDetails(
                com.oracle.bmc.demandsignal.model.ChangeOccDemandSignalCompartmentDetails
                        changeOccDemandSignalCompartmentDetails) {
            this.changeOccDemandSignalCompartmentDetails = changeOccDemandSignalCompartmentDetails;
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
        public Builder copy(ChangeOccDemandSignalCompartmentRequest o) {
            occDemandSignalId(o.getOccDemandSignalId());
            changeOccDemandSignalCompartmentDetails(o.getChangeOccDemandSignalCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeOccDemandSignalCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeOccDemandSignalCompartmentRequest
         */
        public ChangeOccDemandSignalCompartmentRequest build() {
            ChangeOccDemandSignalCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.demandsignal.model.ChangeOccDemandSignalCompartmentDetails body) {
            changeOccDemandSignalCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeOccDemandSignalCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeOccDemandSignalCompartmentRequest
         */
        public ChangeOccDemandSignalCompartmentRequest buildWithoutInvocationCallback() {
            ChangeOccDemandSignalCompartmentRequest request =
                    new ChangeOccDemandSignalCompartmentRequest();
            request.occDemandSignalId = occDemandSignalId;
            request.changeOccDemandSignalCompartmentDetails =
                    changeOccDemandSignalCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeOccDemandSignalCompartmentRequest(occDemandSignalId,
            // changeOccDemandSignalCompartmentDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .occDemandSignalId(occDemandSignalId)
                .changeOccDemandSignalCompartmentDetails(changeOccDemandSignalCompartmentDetails)
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
        sb.append(",occDemandSignalId=").append(String.valueOf(this.occDemandSignalId));
        sb.append(",changeOccDemandSignalCompartmentDetails=")
                .append(String.valueOf(this.changeOccDemandSignalCompartmentDetails));
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
        if (!(o instanceof ChangeOccDemandSignalCompartmentRequest)) {
            return false;
        }

        ChangeOccDemandSignalCompartmentRequest other = (ChangeOccDemandSignalCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.occDemandSignalId, other.occDemandSignalId)
                && java.util.Objects.equals(
                        this.changeOccDemandSignalCompartmentDetails,
                        other.changeOccDemandSignalCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.occDemandSignalId == null ? 43 : this.occDemandSignalId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeOccDemandSignalCompartmentDetails == null
                                ? 43
                                : this.changeOccDemandSignalCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
