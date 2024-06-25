/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.demandsignal.requests;

import com.oracle.bmc.demandsignal.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/demandsignal/PatchOccDemandSignalExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use PatchOccDemandSignalRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240430")
public class PatchOccDemandSignalRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.demandsignal.model.PatchOccDemandSignalDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OccDemandSignal.
     */
    private String occDemandSignalId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OccDemandSignal.
     */
    public String getOccDemandSignalId() {
        return occDemandSignalId;
    }
    /**
     * The information to be updated.
     */
    private com.oracle.bmc.demandsignal.model.PatchOccDemandSignalDetails
            patchOccDemandSignalDetails;

    /**
     * The information to be updated.
     */
    public com.oracle.bmc.demandsignal.model.PatchOccDemandSignalDetails
            getPatchOccDemandSignalDetails() {
        return patchOccDemandSignalDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous GET or POST response for
     * that resource. The resource will be updated or deleted only if the etag you provide
     * matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous GET or POST response for
     * that resource. The resource will be updated or deleted only if the etag you provide
     * matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
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
    public com.oracle.bmc.demandsignal.model.PatchOccDemandSignalDetails getBody$() {
        return patchOccDemandSignalDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PatchOccDemandSignalRequest,
                    com.oracle.bmc.demandsignal.model.PatchOccDemandSignalDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OccDemandSignal.
         */
        private String occDemandSignalId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OccDemandSignal.
         * @param occDemandSignalId the value to set
         * @return this builder instance
         */
        public Builder occDemandSignalId(String occDemandSignalId) {
            this.occDemandSignalId = occDemandSignalId;
            return this;
        }

        /**
         * The information to be updated.
         */
        private com.oracle.bmc.demandsignal.model.PatchOccDemandSignalDetails
                patchOccDemandSignalDetails = null;

        /**
         * The information to be updated.
         * @param patchOccDemandSignalDetails the value to set
         * @return this builder instance
         */
        public Builder patchOccDemandSignalDetails(
                com.oracle.bmc.demandsignal.model.PatchOccDemandSignalDetails
                        patchOccDemandSignalDetails) {
            this.patchOccDemandSignalDetails = patchOccDemandSignalDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response for
         * that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response for
         * that resource. The resource will be updated or deleted only if the etag you provide
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
        public Builder copy(PatchOccDemandSignalRequest o) {
            occDemandSignalId(o.getOccDemandSignalId());
            patchOccDemandSignalDetails(o.getPatchOccDemandSignalDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PatchOccDemandSignalRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of PatchOccDemandSignalRequest
         */
        public PatchOccDemandSignalRequest build() {
            PatchOccDemandSignalRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.demandsignal.model.PatchOccDemandSignalDetails body) {
            patchOccDemandSignalDetails(body);
            return this;
        }

        /**
         * Build the instance of PatchOccDemandSignalRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PatchOccDemandSignalRequest
         */
        public PatchOccDemandSignalRequest buildWithoutInvocationCallback() {
            PatchOccDemandSignalRequest request = new PatchOccDemandSignalRequest();
            request.occDemandSignalId = occDemandSignalId;
            request.patchOccDemandSignalDetails = patchOccDemandSignalDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new PatchOccDemandSignalRequest(occDemandSignalId, patchOccDemandSignalDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .occDemandSignalId(occDemandSignalId)
                .patchOccDemandSignalDetails(patchOccDemandSignalDetails)
                .ifMatch(ifMatch)
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
        sb.append(",occDemandSignalId=").append(String.valueOf(this.occDemandSignalId));
        sb.append(",patchOccDemandSignalDetails=")
                .append(String.valueOf(this.patchOccDemandSignalDetails));
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
        if (!(o instanceof PatchOccDemandSignalRequest)) {
            return false;
        }

        PatchOccDemandSignalRequest other = (PatchOccDemandSignalRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.occDemandSignalId, other.occDemandSignalId)
                && java.util.Objects.equals(
                        this.patchOccDemandSignalDetails, other.patchOccDemandSignalDetails)
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
                        + (this.patchOccDemandSignalDetails == null
                                ? 43
                                : this.patchOccDemandSignalDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
