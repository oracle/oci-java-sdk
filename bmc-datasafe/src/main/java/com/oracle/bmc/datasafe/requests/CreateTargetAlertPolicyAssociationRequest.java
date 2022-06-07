/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateTargetAlertPolicyAssociationExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateTargetAlertPolicyAssociationRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class CreateTargetAlertPolicyAssociationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.CreateTargetAlertPolicyAssociationDetails> {

    /**
     * The details used to create a new target-alert policy association.
     */
    private com.oracle.bmc.datasafe.model.CreateTargetAlertPolicyAssociationDetails
            createTargetAlertPolicyAssociationDetails;

    public com.oracle.bmc.datasafe.model.CreateTargetAlertPolicyAssociationDetails
            getCreateTargetAlertPolicyAssociationDetails() {
        return createTargetAlertPolicyAssociationDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request might be rejected.
     *
     */
    private String opcRetryToken;

    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.datasafe.model.CreateTargetAlertPolicyAssociationDetails getBody$() {
        return createTargetAlertPolicyAssociationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateTargetAlertPolicyAssociationRequest,
                    com.oracle.bmc.datasafe.model.CreateTargetAlertPolicyAssociationDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private com.oracle.bmc.datasafe.model.CreateTargetAlertPolicyAssociationDetails
                createTargetAlertPolicyAssociationDetails = null;

        /**
         * The details used to create a new target-alert policy association.
         * @return this builder instance
         */
        public Builder createTargetAlertPolicyAssociationDetails(
                com.oracle.bmc.datasafe.model.CreateTargetAlertPolicyAssociationDetails
                        createTargetAlertPolicyAssociationDetails) {
            this.createTargetAlertPolicyAssociationDetails =
                    createTargetAlertPolicyAssociationDetails;
            return this;
        }

        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request might be rejected.
         *
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(CreateTargetAlertPolicyAssociationRequest o) {
            createTargetAlertPolicyAssociationDetails(
                    o.getCreateTargetAlertPolicyAssociationDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateTargetAlertPolicyAssociationRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateTargetAlertPolicyAssociationRequest
         */
        public CreateTargetAlertPolicyAssociationRequest build() {
            CreateTargetAlertPolicyAssociationRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.datasafe.model.CreateTargetAlertPolicyAssociationDetails body) {
            createTargetAlertPolicyAssociationDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateTargetAlertPolicyAssociationRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateTargetAlertPolicyAssociationRequest
         */
        public CreateTargetAlertPolicyAssociationRequest buildWithoutInvocationCallback() {
            CreateTargetAlertPolicyAssociationRequest request =
                    new CreateTargetAlertPolicyAssociationRequest();
            request.createTargetAlertPolicyAssociationDetails =
                    createTargetAlertPolicyAssociationDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreateTargetAlertPolicyAssociationRequest(createTargetAlertPolicyAssociationDetails, opcRetryToken, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .createTargetAlertPolicyAssociationDetails(
                        createTargetAlertPolicyAssociationDetails)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",createTargetAlertPolicyAssociationDetails=")
                .append(String.valueOf(this.createTargetAlertPolicyAssociationDetails));
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
        if (!(o instanceof CreateTargetAlertPolicyAssociationRequest)) {
            return false;
        }

        CreateTargetAlertPolicyAssociationRequest other =
                (CreateTargetAlertPolicyAssociationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createTargetAlertPolicyAssociationDetails,
                        other.createTargetAlertPolicyAssociationDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createTargetAlertPolicyAssociationDetails == null
                                ? 43
                                : this.createTargetAlertPolicyAssociationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
