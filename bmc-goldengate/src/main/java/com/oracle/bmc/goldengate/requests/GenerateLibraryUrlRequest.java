/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.requests;

import com.oracle.bmc.goldengate.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/goldengate/GenerateLibraryUrlExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GenerateLibraryUrlRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public class GenerateLibraryUrlRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.goldengate.model.GenerateLibraryUrlDetails> {

    /**
     * A unique Deployment identifier.
     *
     */
    private String deploymentId;

    /**
     * A unique Deployment identifier.
     *
     */
    public String getDeploymentId() {
        return deploymentId;
    }
    /**
     * A placeholder for any additional metadata to describe the request details.
     *
     */
    private com.oracle.bmc.goldengate.model.GenerateLibraryUrlDetails generateLibraryUrlDetails;

    /**
     * A placeholder for any additional metadata to describe the request details.
     *
     */
    public com.oracle.bmc.goldengate.model.GenerateLibraryUrlDetails
            getGenerateLibraryUrlDetails() {
        return generateLibraryUrlDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource.  The resource is updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource.  The resource is updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The client request ID for tracing.
     *
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried, in case of a timeout or server error,
     * without the risk of executing that same action again. Retry tokens expire after 24 hours but can be
     * invalidated before then due to conflicting operations. For example, if a resource was deleted and purged
     * from the system, then a retry of the original creation request is rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried, in case of a timeout or server error,
     * without the risk of executing that same action again. Retry tokens expire after 24 hours but can be
     * invalidated before then due to conflicting operations. For example, if a resource was deleted and purged
     * from the system, then a retry of the original creation request is rejected.
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
    public com.oracle.bmc.goldengate.model.GenerateLibraryUrlDetails getBody$() {
        return generateLibraryUrlDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GenerateLibraryUrlRequest,
                    com.oracle.bmc.goldengate.model.GenerateLibraryUrlDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * A unique Deployment identifier.
         *
         */
        private String deploymentId = null;

        /**
         * A unique Deployment identifier.
         *
         * @param deploymentId the value to set
         * @return this builder instance
         */
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * A placeholder for any additional metadata to describe the request details.
         *
         */
        private com.oracle.bmc.goldengate.model.GenerateLibraryUrlDetails
                generateLibraryUrlDetails = null;

        /**
         * A placeholder for any additional metadata to describe the request details.
         *
         * @param generateLibraryUrlDetails the value to set
         * @return this builder instance
         */
        public Builder generateLibraryUrlDetails(
                com.oracle.bmc.goldengate.model.GenerateLibraryUrlDetails
                        generateLibraryUrlDetails) {
            this.generateLibraryUrlDetails = generateLibraryUrlDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response for that
         * resource.  The resource is updated or deleted only if the etag you provide matches the
         * resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response for that
         * resource.  The resource is updated or deleted only if the etag you provide matches the
         * resource's current etag value.
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
         *
         */
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
         * A token that uniquely identifies a request so it can be retried, in case of a timeout or server error,
         * without the risk of executing that same action again. Retry tokens expire after 24 hours but can be
         * invalidated before then due to conflicting operations. For example, if a resource was deleted and purged
         * from the system, then a retry of the original creation request is rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried, in case of a timeout or server error,
         * without the risk of executing that same action again. Retry tokens expire after 24 hours but can be
         * invalidated before then due to conflicting operations. For example, if a resource was deleted and purged
         * from the system, then a retry of the original creation request is rejected.
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
        public Builder copy(GenerateLibraryUrlRequest o) {
            deploymentId(o.getDeploymentId());
            generateLibraryUrlDetails(o.getGenerateLibraryUrlDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GenerateLibraryUrlRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GenerateLibraryUrlRequest
         */
        public GenerateLibraryUrlRequest build() {
            GenerateLibraryUrlRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.goldengate.model.GenerateLibraryUrlDetails body) {
            generateLibraryUrlDetails(body);
            return this;
        }

        /**
         * Build the instance of GenerateLibraryUrlRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GenerateLibraryUrlRequest
         */
        public GenerateLibraryUrlRequest buildWithoutInvocationCallback() {
            GenerateLibraryUrlRequest request = new GenerateLibraryUrlRequest();
            request.deploymentId = deploymentId;
            request.generateLibraryUrlDetails = generateLibraryUrlDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new GenerateLibraryUrlRequest(deploymentId, generateLibraryUrlDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .deploymentId(deploymentId)
                .generateLibraryUrlDetails(generateLibraryUrlDetails)
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
        sb.append(",deploymentId=").append(String.valueOf(this.deploymentId));
        sb.append(",generateLibraryUrlDetails=")
                .append(String.valueOf(this.generateLibraryUrlDetails));
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
        if (!(o instanceof GenerateLibraryUrlRequest)) {
            return false;
        }

        GenerateLibraryUrlRequest other = (GenerateLibraryUrlRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.deploymentId, other.deploymentId)
                && java.util.Objects.equals(
                        this.generateLibraryUrlDetails, other.generateLibraryUrlDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.deploymentId == null ? 43 : this.deploymentId.hashCode());
        result =
                (result * PRIME)
                        + (this.generateLibraryUrlDetails == null
                                ? 43
                                : this.generateLibraryUrlDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
