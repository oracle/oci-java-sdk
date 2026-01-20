/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.requests;

import com.oracle.bmc.opensearch.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opensearch/UpdateOpensearchClusterPipelineExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateOpensearchClusterPipelineRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
public class UpdateOpensearchClusterPipelineRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.opensearch.model.UpdateOpensearchClusterPipelineDetails> {

    /** unique OpensearchClusterPipeline identifier */
    private String opensearchClusterPipelineId;

    /** unique OpensearchClusterPipeline identifier */
    public String getOpensearchClusterPipelineId() {
        return opensearchClusterPipelineId;
    }
    /** Update the opensearch cluster pipeline details. */
    private com.oracle.bmc.opensearch.model.UpdateOpensearchClusterPipelineDetails
            updateOpensearchClusterPipelineDetails;

    /** Update the opensearch cluster pipeline details. */
    public com.oracle.bmc.opensearch.model.UpdateOpensearchClusterPipelineDetails
            getUpdateOpensearchClusterPipelineDetails() {
        return updateOpensearchClusterPipelineDetails;
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
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Indicates that the request is a dry run, if set to "true". A dry run request does not modify
     * the configuration item details and is used only to perform validation on the submitted data.
     */
    private Boolean opcDryRun;

    /**
     * Indicates that the request is a dry run, if set to "true". A dry run request does not modify
     * the configuration item details and is used only to perform validation on the submitted data.
     */
    public Boolean getOpcDryRun() {
        return opcDryRun;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.opensearch.model.UpdateOpensearchClusterPipelineDetails getBody$() {
        return updateOpensearchClusterPipelineDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateOpensearchClusterPipelineRequest,
                    com.oracle.bmc.opensearch.model.UpdateOpensearchClusterPipelineDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** unique OpensearchClusterPipeline identifier */
        private String opensearchClusterPipelineId = null;

        /**
         * unique OpensearchClusterPipeline identifier
         *
         * @param opensearchClusterPipelineId the value to set
         * @return this builder instance
         */
        public Builder opensearchClusterPipelineId(String opensearchClusterPipelineId) {
            this.opensearchClusterPipelineId = opensearchClusterPipelineId;
            return this;
        }

        /** Update the opensearch cluster pipeline details. */
        private com.oracle.bmc.opensearch.model.UpdateOpensearchClusterPipelineDetails
                updateOpensearchClusterPipelineDetails = null;

        /**
         * Update the opensearch cluster pipeline details.
         *
         * @param updateOpensearchClusterPipelineDetails the value to set
         * @return this builder instance
         */
        public Builder updateOpensearchClusterPipelineDetails(
                com.oracle.bmc.opensearch.model.UpdateOpensearchClusterPipelineDetails
                        updateOpensearchClusterPipelineDetails) {
            this.updateOpensearchClusterPipelineDetails = updateOpensearchClusterPipelineDetails;
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
         * Indicates that the request is a dry run, if set to "true". A dry run request does not
         * modify the configuration item details and is used only to perform validation on the
         * submitted data.
         */
        private Boolean opcDryRun = null;

        /**
         * Indicates that the request is a dry run, if set to "true". A dry run request does not
         * modify the configuration item details and is used only to perform validation on the
         * submitted data.
         *
         * @param opcDryRun the value to set
         * @return this builder instance
         */
        public Builder opcDryRun(Boolean opcDryRun) {
            this.opcDryRun = opcDryRun;
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
        public Builder copy(UpdateOpensearchClusterPipelineRequest o) {
            opensearchClusterPipelineId(o.getOpensearchClusterPipelineId());
            updateOpensearchClusterPipelineDetails(o.getUpdateOpensearchClusterPipelineDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcDryRun(o.getOpcDryRun());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateOpensearchClusterPipelineRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateOpensearchClusterPipelineRequest
         */
        public UpdateOpensearchClusterPipelineRequest build() {
            UpdateOpensearchClusterPipelineRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.opensearch.model.UpdateOpensearchClusterPipelineDetails body) {
            updateOpensearchClusterPipelineDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateOpensearchClusterPipelineRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateOpensearchClusterPipelineRequest
         */
        public UpdateOpensearchClusterPipelineRequest buildWithoutInvocationCallback() {
            UpdateOpensearchClusterPipelineRequest request =
                    new UpdateOpensearchClusterPipelineRequest();
            request.opensearchClusterPipelineId = opensearchClusterPipelineId;
            request.updateOpensearchClusterPipelineDetails = updateOpensearchClusterPipelineDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcDryRun = opcDryRun;
            return request;
            // new UpdateOpensearchClusterPipelineRequest(opensearchClusterPipelineId,
            // updateOpensearchClusterPipelineDetails, ifMatch, opcRequestId, opcDryRun);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .opensearchClusterPipelineId(opensearchClusterPipelineId)
                .updateOpensearchClusterPipelineDetails(updateOpensearchClusterPipelineDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .opcDryRun(opcDryRun);
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
        sb.append(",opensearchClusterPipelineId=")
                .append(String.valueOf(this.opensearchClusterPipelineId));
        sb.append(",updateOpensearchClusterPipelineDetails=")
                .append(String.valueOf(this.updateOpensearchClusterPipelineDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcDryRun=").append(String.valueOf(this.opcDryRun));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOpensearchClusterPipelineRequest)) {
            return false;
        }

        UpdateOpensearchClusterPipelineRequest other = (UpdateOpensearchClusterPipelineRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.opensearchClusterPipelineId, other.opensearchClusterPipelineId)
                && java.util.Objects.equals(
                        this.updateOpensearchClusterPipelineDetails,
                        other.updateOpensearchClusterPipelineDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcDryRun, other.opcDryRun);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.opensearchClusterPipelineId == null
                                ? 43
                                : this.opensearchClusterPipelineId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateOpensearchClusterPipelineDetails == null
                                ? 43
                                : this.updateOpensearchClusterPipelineDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcDryRun == null ? 43 : this.opcDryRun.hashCode());
        return result;
    }
}
