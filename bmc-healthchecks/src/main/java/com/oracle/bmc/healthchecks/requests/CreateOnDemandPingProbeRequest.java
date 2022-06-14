/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.healthchecks.requests;

import com.oracle.bmc.healthchecks.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/healthchecks/CreateOnDemandPingProbeExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateOnDemandPingProbeRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
public class CreateOnDemandPingProbeRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.healthchecks.model.CreateOnDemandPingProbeDetails> {

    /**
     * Configuration details for creating an on-demand ping probe.
     */
    private com.oracle.bmc.healthchecks.model.CreateOnDemandPingProbeDetails
            createOnDemandPingProbeDetails;

    /**
     * Configuration details for creating an on-demand ping probe.
     */
    public com.oracle.bmc.healthchecks.model.CreateOnDemandPingProbeDetails
            getCreateOnDemandPingProbeDetails() {
        return createOnDemandPingProbeDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
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
    public com.oracle.bmc.healthchecks.model.CreateOnDemandPingProbeDetails getBody$() {
        return createOnDemandPingProbeDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateOnDemandPingProbeRequest,
                    com.oracle.bmc.healthchecks.model.CreateOnDemandPingProbeDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Configuration details for creating an on-demand ping probe.
         */
        private com.oracle.bmc.healthchecks.model.CreateOnDemandPingProbeDetails
                createOnDemandPingProbeDetails = null;

        /**
         * Configuration details for creating an on-demand ping probe.
         * @param createOnDemandPingProbeDetails the value to set
         * @return this builder instance
         */
        public Builder createOnDemandPingProbeDetails(
                com.oracle.bmc.healthchecks.model.CreateOnDemandPingProbeDetails
                        createOnDemandPingProbeDetails) {
            this.createOnDemandPingProbeDetails = createOnDemandPingProbeDetails;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
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
        public Builder copy(CreateOnDemandPingProbeRequest o) {
            createOnDemandPingProbeDetails(o.getCreateOnDemandPingProbeDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateOnDemandPingProbeRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateOnDemandPingProbeRequest
         */
        public CreateOnDemandPingProbeRequest build() {
            CreateOnDemandPingProbeRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.healthchecks.model.CreateOnDemandPingProbeDetails body) {
            createOnDemandPingProbeDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateOnDemandPingProbeRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateOnDemandPingProbeRequest
         */
        public CreateOnDemandPingProbeRequest buildWithoutInvocationCallback() {
            CreateOnDemandPingProbeRequest request = new CreateOnDemandPingProbeRequest();
            request.createOnDemandPingProbeDetails = createOnDemandPingProbeDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreateOnDemandPingProbeRequest(createOnDemandPingProbeDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createOnDemandPingProbeDetails(createOnDemandPingProbeDetails)
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
        sb.append(",createOnDemandPingProbeDetails=")
                .append(String.valueOf(this.createOnDemandPingProbeDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOnDemandPingProbeRequest)) {
            return false;
        }

        CreateOnDemandPingProbeRequest other = (CreateOnDemandPingProbeRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createOnDemandPingProbeDetails, other.createOnDemandPingProbeDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createOnDemandPingProbeDetails == null
                                ? 43
                                : this.createOnDemandPingProbeDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
