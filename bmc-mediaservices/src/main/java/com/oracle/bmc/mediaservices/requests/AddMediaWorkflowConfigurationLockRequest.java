/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.requests;

import com.oracle.bmc.mediaservices.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mediaservices/AddMediaWorkflowConfigurationLockExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use AddMediaWorkflowConfigurationLockRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
public class AddMediaWorkflowConfigurationLockRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.mediaservices.model.AddLockDetails> {

    /**
     * AddResourceLockDetails body parameter
     */
    private com.oracle.bmc.mediaservices.model.AddLockDetails addResourceLockDetails;

    /**
     * AddResourceLockDetails body parameter
     */
    public com.oracle.bmc.mediaservices.model.AddLockDetails getAddResourceLockDetails() {
        return addResourceLockDetails;
    }
    /**
     * Unique MediaWorkflowConfiguration identifier.
     */
    private String mediaWorkflowConfigurationId;

    /**
     * Unique MediaWorkflowConfiguration identifier.
     */
    public String getMediaWorkflowConfigurationId() {
        return mediaWorkflowConfigurationId;
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
     * server error without the risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without the risk of executing that same action again. Retry tokens expire after 24
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
    public com.oracle.bmc.mediaservices.model.AddLockDetails getBody$() {
        return addResourceLockDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    AddMediaWorkflowConfigurationLockRequest,
                    com.oracle.bmc.mediaservices.model.AddLockDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * AddResourceLockDetails body parameter
         */
        private com.oracle.bmc.mediaservices.model.AddLockDetails addResourceLockDetails = null;

        /**
         * AddResourceLockDetails body parameter
         * @param addResourceLockDetails the value to set
         * @return this builder instance
         */
        public Builder addResourceLockDetails(
                com.oracle.bmc.mediaservices.model.AddLockDetails addResourceLockDetails) {
            this.addResourceLockDetails = addResourceLockDetails;
            return this;
        }

        /**
         * Unique MediaWorkflowConfiguration identifier.
         */
        private String mediaWorkflowConfigurationId = null;

        /**
         * Unique MediaWorkflowConfiguration identifier.
         * @param mediaWorkflowConfigurationId the value to set
         * @return this builder instance
         */
        public Builder mediaWorkflowConfigurationId(String mediaWorkflowConfigurationId) {
            this.mediaWorkflowConfigurationId = mediaWorkflowConfigurationId;
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
         * server error without the risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without the risk of executing that same action again. Retry tokens expire after 24
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
        public Builder copy(AddMediaWorkflowConfigurationLockRequest o) {
            addResourceLockDetails(o.getAddResourceLockDetails());
            mediaWorkflowConfigurationId(o.getMediaWorkflowConfigurationId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of AddMediaWorkflowConfigurationLockRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of AddMediaWorkflowConfigurationLockRequest
         */
        public AddMediaWorkflowConfigurationLockRequest build() {
            AddMediaWorkflowConfigurationLockRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.mediaservices.model.AddLockDetails body) {
            addResourceLockDetails(body);
            return this;
        }

        /**
         * Build the instance of AddMediaWorkflowConfigurationLockRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of AddMediaWorkflowConfigurationLockRequest
         */
        public AddMediaWorkflowConfigurationLockRequest buildWithoutInvocationCallback() {
            AddMediaWorkflowConfigurationLockRequest request =
                    new AddMediaWorkflowConfigurationLockRequest();
            request.addResourceLockDetails = addResourceLockDetails;
            request.mediaWorkflowConfigurationId = mediaWorkflowConfigurationId;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new AddMediaWorkflowConfigurationLockRequest(addResourceLockDetails, mediaWorkflowConfigurationId, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .addResourceLockDetails(addResourceLockDetails)
                .mediaWorkflowConfigurationId(mediaWorkflowConfigurationId)
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
        sb.append(",addResourceLockDetails=").append(String.valueOf(this.addResourceLockDetails));
        sb.append(",mediaWorkflowConfigurationId=")
                .append(String.valueOf(this.mediaWorkflowConfigurationId));
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
        if (!(o instanceof AddMediaWorkflowConfigurationLockRequest)) {
            return false;
        }

        AddMediaWorkflowConfigurationLockRequest other =
                (AddMediaWorkflowConfigurationLockRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.addResourceLockDetails, other.addResourceLockDetails)
                && java.util.Objects.equals(
                        this.mediaWorkflowConfigurationId, other.mediaWorkflowConfigurationId)
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
                        + (this.addResourceLockDetails == null
                                ? 43
                                : this.addResourceLockDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.mediaWorkflowConfigurationId == null
                                ? 43
                                : this.mediaWorkflowConfigurationId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
