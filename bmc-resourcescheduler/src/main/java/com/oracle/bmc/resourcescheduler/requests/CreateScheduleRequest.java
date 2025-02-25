/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcescheduler.requests;

import com.oracle.bmc.resourcescheduler.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcescheduler/CreateScheduleExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateScheduleRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240430")
public class CreateScheduleRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.resourcescheduler.model.CreateScheduleDetails> {

    /**
     * This API shows the details of the new schedule
     */
    private com.oracle.bmc.resourcescheduler.model.CreateScheduleDetails createScheduleDetails;

    /**
     * This API shows the details of the new schedule
     */
    public com.oracle.bmc.resourcescheduler.model.CreateScheduleDetails getCreateScheduleDetails() {
        return createScheduleDetails;
    }
    /**
     * This is a token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of running that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and removed from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * This is a token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of running that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and removed from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * This is a unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     * The only valid characters for request IDs are letters, numbers,
     * underscore, and dash.
     *
     */
    private String opcRequestId;

    /**
     * This is a unique Oracle-assigned identifier for the request. If you need to contact
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
    public com.oracle.bmc.resourcescheduler.model.CreateScheduleDetails getBody$() {
        return createScheduleDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateScheduleRequest,
                    com.oracle.bmc.resourcescheduler.model.CreateScheduleDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * This API shows the details of the new schedule
         */
        private com.oracle.bmc.resourcescheduler.model.CreateScheduleDetails createScheduleDetails =
                null;

        /**
         * This API shows the details of the new schedule
         * @param createScheduleDetails the value to set
         * @return this builder instance
         */
        public Builder createScheduleDetails(
                com.oracle.bmc.resourcescheduler.model.CreateScheduleDetails
                        createScheduleDetails) {
            this.createScheduleDetails = createScheduleDetails;
            return this;
        }

        /**
         * This is a token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of running that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and removed from the system, then a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * This is a token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of running that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and removed from the system, then a retry of the original creation request
         * might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * This is a unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         * The only valid characters for request IDs are letters, numbers,
         * underscore, and dash.
         *
         */
        private String opcRequestId = null;

        /**
         * This is a unique Oracle-assigned identifier for the request. If you need to contact
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
        public Builder copy(CreateScheduleRequest o) {
            createScheduleDetails(o.getCreateScheduleDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateScheduleRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateScheduleRequest
         */
        public CreateScheduleRequest build() {
            CreateScheduleRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.resourcescheduler.model.CreateScheduleDetails body) {
            createScheduleDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateScheduleRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateScheduleRequest
         */
        public CreateScheduleRequest buildWithoutInvocationCallback() {
            CreateScheduleRequest request = new CreateScheduleRequest();
            request.createScheduleDetails = createScheduleDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreateScheduleRequest(createScheduleDetails, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createScheduleDetails(createScheduleDetails)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",createScheduleDetails=").append(String.valueOf(this.createScheduleDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateScheduleRequest)) {
            return false;
        }

        CreateScheduleRequest other = (CreateScheduleRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.createScheduleDetails, other.createScheduleDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createScheduleDetails == null
                                ? 43
                                : this.createScheduleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
