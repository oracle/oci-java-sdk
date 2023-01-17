/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.requests;

import com.oracle.bmc.aianomalydetection.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/aianomalydetection/ChangeAiPrivateEndpointCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeAiPrivateEndpointCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
public class ChangeAiPrivateEndpointCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.aianomalydetection.model.ChangeAiPrivateEndpointCompartmentDetails> {

    /**
     * Unique private reverse connection identifier.
     */
    private String aiPrivateEndpointId;

    /**
     * Unique private reverse connection identifier.
     */
    public String getAiPrivateEndpointId() {
        return aiPrivateEndpointId;
    }
    /**
     * Details for the target compartment.
     */
    private com.oracle.bmc.aianomalydetection.model.ChangeAiPrivateEndpointCompartmentDetails
            changeAiPrivateEndpointCompartmentDetails;

    /**
     * Details for the target compartment.
     */
    public com.oracle.bmc.aianomalydetection.model.ChangeAiPrivateEndpointCompartmentDetails
            getChangeAiPrivateEndpointCompartmentDetails() {
        return changeAiPrivateEndpointCompartmentDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.aianomalydetection.model.ChangeAiPrivateEndpointCompartmentDetails
            getBody$() {
        return changeAiPrivateEndpointCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeAiPrivateEndpointCompartmentRequest,
                    com.oracle.bmc.aianomalydetection.model
                            .ChangeAiPrivateEndpointCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique private reverse connection identifier.
         */
        private String aiPrivateEndpointId = null;

        /**
         * Unique private reverse connection identifier.
         * @param aiPrivateEndpointId the value to set
         * @return this builder instance
         */
        public Builder aiPrivateEndpointId(String aiPrivateEndpointId) {
            this.aiPrivateEndpointId = aiPrivateEndpointId;
            return this;
        }

        /**
         * Details for the target compartment.
         */
        private com.oracle.bmc.aianomalydetection.model.ChangeAiPrivateEndpointCompartmentDetails
                changeAiPrivateEndpointCompartmentDetails = null;

        /**
         * Details for the target compartment.
         * @param changeAiPrivateEndpointCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeAiPrivateEndpointCompartmentDetails(
                com.oracle.bmc.aianomalydetection.model.ChangeAiPrivateEndpointCompartmentDetails
                        changeAiPrivateEndpointCompartmentDetails) {
            this.changeAiPrivateEndpointCompartmentDetails =
                    changeAiPrivateEndpointCompartmentDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
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
        public Builder copy(ChangeAiPrivateEndpointCompartmentRequest o) {
            aiPrivateEndpointId(o.getAiPrivateEndpointId());
            changeAiPrivateEndpointCompartmentDetails(
                    o.getChangeAiPrivateEndpointCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeAiPrivateEndpointCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeAiPrivateEndpointCompartmentRequest
         */
        public ChangeAiPrivateEndpointCompartmentRequest build() {
            ChangeAiPrivateEndpointCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.aianomalydetection.model.ChangeAiPrivateEndpointCompartmentDetails
                        body) {
            changeAiPrivateEndpointCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeAiPrivateEndpointCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeAiPrivateEndpointCompartmentRequest
         */
        public ChangeAiPrivateEndpointCompartmentRequest buildWithoutInvocationCallback() {
            ChangeAiPrivateEndpointCompartmentRequest request =
                    new ChangeAiPrivateEndpointCompartmentRequest();
            request.aiPrivateEndpointId = aiPrivateEndpointId;
            request.changeAiPrivateEndpointCompartmentDetails =
                    changeAiPrivateEndpointCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeAiPrivateEndpointCompartmentRequest(aiPrivateEndpointId, changeAiPrivateEndpointCompartmentDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .aiPrivateEndpointId(aiPrivateEndpointId)
                .changeAiPrivateEndpointCompartmentDetails(
                        changeAiPrivateEndpointCompartmentDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",aiPrivateEndpointId=").append(String.valueOf(this.aiPrivateEndpointId));
        sb.append(",changeAiPrivateEndpointCompartmentDetails=")
                .append(String.valueOf(this.changeAiPrivateEndpointCompartmentDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
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
        if (!(o instanceof ChangeAiPrivateEndpointCompartmentRequest)) {
            return false;
        }

        ChangeAiPrivateEndpointCompartmentRequest other =
                (ChangeAiPrivateEndpointCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.aiPrivateEndpointId, other.aiPrivateEndpointId)
                && java.util.Objects.equals(
                        this.changeAiPrivateEndpointCompartmentDetails,
                        other.changeAiPrivateEndpointCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.aiPrivateEndpointId == null
                                ? 43
                                : this.aiPrivateEndpointId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeAiPrivateEndpointCompartmentDetails == null
                                ? 43
                                : this.changeAiPrivateEndpointCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
