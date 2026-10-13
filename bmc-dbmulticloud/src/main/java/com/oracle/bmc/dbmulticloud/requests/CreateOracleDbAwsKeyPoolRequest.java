/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.requests;

import com.oracle.bmc.dbmulticloud.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dbmulticloud/CreateOracleDbAwsKeyPoolExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateOracleDbAwsKeyPoolRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
public class CreateOracleDbAwsKeyPoolRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dbmulticloud.model.CreateOracleDbAwsKeyPoolDetails> {

    /** Details to create AWS Key Pool details. */
    private com.oracle.bmc.dbmulticloud.model.CreateOracleDbAwsKeyPoolDetails
            createOracleDbAwsKeyPoolDetails;

    /** Details to create AWS Key Pool details. */
    public com.oracle.bmc.dbmulticloud.model.CreateOracleDbAwsKeyPoolDetails
            getCreateOracleDbAwsKeyPoolDetails() {
        return createOracleDbAwsKeyPoolDetails;
    }
    /**
     * A token that uniquely identifies a request, allowing it to be safely retried in the event of
     * a timeout or server error without the risk of the action being executed more than once.
     *
     * <p>Retry tokens expire after 24 hours but can be invalidated sooner if conflicting operations
     * occur.
     *
     * <p>For example, if a resource has been deleted and permanently purged from the system, a
     * retry of the original creation request may be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request, allowing it to be safely retried in the event of
     * a timeout or server error without the risk of the action being executed more than once.
     *
     * <p>Retry tokens expire after 24 hours but can be invalidated sooner if conflicting operations
     * occur.
     *
     * <p>For example, if a resource has been deleted and permanently purged from the system, a
     * retry of the original creation request may be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
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
    public com.oracle.bmc.dbmulticloud.model.CreateOracleDbAwsKeyPoolDetails getBody$() {
        return createOracleDbAwsKeyPoolDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateOracleDbAwsKeyPoolRequest,
                    com.oracle.bmc.dbmulticloud.model.CreateOracleDbAwsKeyPoolDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Details to create AWS Key Pool details. */
        private com.oracle.bmc.dbmulticloud.model.CreateOracleDbAwsKeyPoolDetails
                createOracleDbAwsKeyPoolDetails = null;

        /**
         * Details to create AWS Key Pool details.
         *
         * @param createOracleDbAwsKeyPoolDetails the value to set
         * @return this builder instance
         */
        public Builder createOracleDbAwsKeyPoolDetails(
                com.oracle.bmc.dbmulticloud.model.CreateOracleDbAwsKeyPoolDetails
                        createOracleDbAwsKeyPoolDetails) {
            this.createOracleDbAwsKeyPoolDetails = createOracleDbAwsKeyPoolDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request, allowing it to be safely retried in the event
         * of a timeout or server error without the risk of the action being executed more than
         * once.
         *
         * <p>Retry tokens expire after 24 hours but can be invalidated sooner if conflicting
         * operations occur.
         *
         * <p>For example, if a resource has been deleted and permanently purged from the system, a
         * retry of the original creation request may be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request, allowing it to be safely retried in the event
         * of a timeout or server error without the risk of the action being executed more than
         * once.
         *
         * <p>Retry tokens expire after 24 hours but can be invalidated sooner if conflicting
         * operations occur.
         *
         * <p>For example, if a resource has been deleted and permanently purged from the system, a
         * retry of the original creation request may be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(CreateOracleDbAwsKeyPoolRequest o) {
            createOracleDbAwsKeyPoolDetails(o.getCreateOracleDbAwsKeyPoolDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateOracleDbAwsKeyPoolRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateOracleDbAwsKeyPoolRequest
         */
        public CreateOracleDbAwsKeyPoolRequest build() {
            CreateOracleDbAwsKeyPoolRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.dbmulticloud.model.CreateOracleDbAwsKeyPoolDetails body) {
            createOracleDbAwsKeyPoolDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateOracleDbAwsKeyPoolRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateOracleDbAwsKeyPoolRequest
         */
        public CreateOracleDbAwsKeyPoolRequest buildWithoutInvocationCallback() {
            CreateOracleDbAwsKeyPoolRequest request = new CreateOracleDbAwsKeyPoolRequest();
            request.createOracleDbAwsKeyPoolDetails = createOracleDbAwsKeyPoolDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreateOracleDbAwsKeyPoolRequest(createOracleDbAwsKeyPoolDetails, opcRetryToken,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createOracleDbAwsKeyPoolDetails(createOracleDbAwsKeyPoolDetails)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",createOracleDbAwsKeyPoolDetails=")
                .append(String.valueOf(this.createOracleDbAwsKeyPoolDetails));
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
        if (!(o instanceof CreateOracleDbAwsKeyPoolRequest)) {
            return false;
        }

        CreateOracleDbAwsKeyPoolRequest other = (CreateOracleDbAwsKeyPoolRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createOracleDbAwsKeyPoolDetails, other.createOracleDbAwsKeyPoolDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createOracleDbAwsKeyPoolDetails == null
                                ? 43
                                : this.createOracleDbAwsKeyPoolDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
