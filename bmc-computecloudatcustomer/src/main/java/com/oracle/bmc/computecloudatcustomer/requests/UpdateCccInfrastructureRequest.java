/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computecloudatcustomer.requests;

import com.oracle.bmc.computecloudatcustomer.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/computecloudatcustomer/UpdateCccInfrastructureExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateCccInfrastructureRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221208")
public class UpdateCccInfrastructureRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.computecloudatcustomer.model.UpdateCccInfrastructureDetails> {

    /**
     * An [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for a
     * Compute Cloud@Customer Infrastructure.
     */
    private String cccInfrastructureId;

    /**
     * An [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for a
     * Compute Cloud@Customer Infrastructure.
     */
    public String getCccInfrastructureId() {
        return cccInfrastructureId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.computecloudatcustomer.model.UpdateCccInfrastructureDetails
            updateCccInfrastructureDetails;

    /** The information to be updated. */
    public com.oracle.bmc.computecloudatcustomer.model.UpdateCccInfrastructureDetails
            getUpdateCccInfrastructureDetails() {
        return updateCccInfrastructureDetails;
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
     * The client request
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * tracing.
     */
    private String opcRequestId;

    /**
     * The client request
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * tracing.
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
    public com.oracle.bmc.computecloudatcustomer.model.UpdateCccInfrastructureDetails getBody$() {
        return updateCccInfrastructureDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateCccInfrastructureRequest,
                    com.oracle.bmc.computecloudatcustomer.model.UpdateCccInfrastructureDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * An [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * for a Compute Cloud@Customer Infrastructure.
         */
        private String cccInfrastructureId = null;

        /**
         * An [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * for a Compute Cloud@Customer Infrastructure.
         *
         * @param cccInfrastructureId the value to set
         * @return this builder instance
         */
        public Builder cccInfrastructureId(String cccInfrastructureId) {
            this.cccInfrastructureId = cccInfrastructureId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.computecloudatcustomer.model.UpdateCccInfrastructureDetails
                updateCccInfrastructureDetails = null;

        /**
         * The information to be updated.
         *
         * @param updateCccInfrastructureDetails the value to set
         * @return this builder instance
         */
        public Builder updateCccInfrastructureDetails(
                com.oracle.bmc.computecloudatcustomer.model.UpdateCccInfrastructureDetails
                        updateCccInfrastructureDetails) {
            this.updateCccInfrastructureDetails = updateCccInfrastructureDetails;
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
         * The client request
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
         * tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
         * tracing.
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
        public Builder copy(UpdateCccInfrastructureRequest o) {
            cccInfrastructureId(o.getCccInfrastructureId());
            updateCccInfrastructureDetails(o.getUpdateCccInfrastructureDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateCccInfrastructureRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateCccInfrastructureRequest
         */
        public UpdateCccInfrastructureRequest build() {
            UpdateCccInfrastructureRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.computecloudatcustomer.model.UpdateCccInfrastructureDetails body) {
            updateCccInfrastructureDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateCccInfrastructureRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateCccInfrastructureRequest
         */
        public UpdateCccInfrastructureRequest buildWithoutInvocationCallback() {
            UpdateCccInfrastructureRequest request = new UpdateCccInfrastructureRequest();
            request.cccInfrastructureId = cccInfrastructureId;
            request.updateCccInfrastructureDetails = updateCccInfrastructureDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateCccInfrastructureRequest(cccInfrastructureId,
            // updateCccInfrastructureDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .cccInfrastructureId(cccInfrastructureId)
                .updateCccInfrastructureDetails(updateCccInfrastructureDetails)
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
        sb.append(",cccInfrastructureId=").append(String.valueOf(this.cccInfrastructureId));
        sb.append(",updateCccInfrastructureDetails=")
                .append(String.valueOf(this.updateCccInfrastructureDetails));
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
        if (!(o instanceof UpdateCccInfrastructureRequest)) {
            return false;
        }

        UpdateCccInfrastructureRequest other = (UpdateCccInfrastructureRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.cccInfrastructureId, other.cccInfrastructureId)
                && java.util.Objects.equals(
                        this.updateCccInfrastructureDetails, other.updateCccInfrastructureDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.cccInfrastructureId == null
                                ? 43
                                : this.cccInfrastructureId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateCccInfrastructureDetails == null
                                ? 43
                                : this.updateCccInfrastructureDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
