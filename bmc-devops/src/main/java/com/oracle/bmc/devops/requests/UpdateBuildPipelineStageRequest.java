/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.requests;

import com.oracle.bmc.devops.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/UpdateBuildPipelineStageExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateBuildPipelineStageRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class UpdateBuildPipelineStageRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.devops.model.UpdateBuildPipelineStageDetails> {

    /**
     * Unique stage identifier.
     */
    private String buildPipelineStageId;

    public String getBuildPipelineStageId() {
        return buildPipelineStageId;
    }
    /**
     * The information to be updated.
     */
    private com.oracle.bmc.devops.model.UpdateBuildPipelineStageDetails
            updateBuildPipelineStageDetails;

    public com.oracle.bmc.devops.model.UpdateBuildPipelineStageDetails
            getUpdateBuildPipelineStageDetails() {
        return updateBuildPipelineStageDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
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
    public com.oracle.bmc.devops.model.UpdateBuildPipelineStageDetails getBody$() {
        return updateBuildPipelineStageDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateBuildPipelineStageRequest,
                    com.oracle.bmc.devops.model.UpdateBuildPipelineStageDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String buildPipelineStageId = null;

        /**
         * Unique stage identifier.
         * @return this builder instance
         */
        public Builder buildPipelineStageId(String buildPipelineStageId) {
            this.buildPipelineStageId = buildPipelineStageId;
            return this;
        }

        private com.oracle.bmc.devops.model.UpdateBuildPipelineStageDetails
                updateBuildPipelineStageDetails = null;

        /**
         * The information to be updated.
         * @return this builder instance
         */
        public Builder updateBuildPipelineStageDetails(
                com.oracle.bmc.devops.model.UpdateBuildPipelineStageDetails
                        updateBuildPipelineStageDetails) {
            this.updateBuildPipelineStageDetails = updateBuildPipelineStageDetails;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
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
        public Builder copy(UpdateBuildPipelineStageRequest o) {
            buildPipelineStageId(o.getBuildPipelineStageId());
            updateBuildPipelineStageDetails(o.getUpdateBuildPipelineStageDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateBuildPipelineStageRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateBuildPipelineStageRequest
         */
        public UpdateBuildPipelineStageRequest build() {
            UpdateBuildPipelineStageRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.devops.model.UpdateBuildPipelineStageDetails body) {
            updateBuildPipelineStageDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateBuildPipelineStageRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateBuildPipelineStageRequest
         */
        public UpdateBuildPipelineStageRequest buildWithoutInvocationCallback() {
            UpdateBuildPipelineStageRequest request = new UpdateBuildPipelineStageRequest();
            request.buildPipelineStageId = buildPipelineStageId;
            request.updateBuildPipelineStageDetails = updateBuildPipelineStageDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateBuildPipelineStageRequest(buildPipelineStageId, updateBuildPipelineStageDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .buildPipelineStageId(buildPipelineStageId)
                .updateBuildPipelineStageDetails(updateBuildPipelineStageDetails)
                .ifMatch(ifMatch)
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
        sb.append(",buildPipelineStageId=").append(String.valueOf(this.buildPipelineStageId));
        sb.append(",updateBuildPipelineStageDetails=")
                .append(String.valueOf(this.updateBuildPipelineStageDetails));
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
        if (!(o instanceof UpdateBuildPipelineStageRequest)) {
            return false;
        }

        UpdateBuildPipelineStageRequest other = (UpdateBuildPipelineStageRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.buildPipelineStageId, other.buildPipelineStageId)
                && java.util.Objects.equals(
                        this.updateBuildPipelineStageDetails, other.updateBuildPipelineStageDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.buildPipelineStageId == null
                                ? 43
                                : this.buildPipelineStageId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateBuildPipelineStageDetails == null
                                ? 43
                                : this.updateBuildPipelineStageDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
