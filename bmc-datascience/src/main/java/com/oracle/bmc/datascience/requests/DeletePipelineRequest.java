/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.requests;

import com.oracle.bmc.datascience.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/DeletePipelineExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use DeletePipelineRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class DeletePipelineRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the pipeline.
     */
    private String pipelineId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the pipeline.
     */
    public String getPipelineId() {
        return pipelineId;
    }
    /**
     * A boolean value to specify whether to delete related PipelineRuns or not.
     */
    private Boolean deleteRelatedPipelineRuns;

    /**
     * A boolean value to specify whether to delete related PipelineRuns or not.
     */
    public Boolean getDeleteRelatedPipelineRuns() {
        return deleteRelatedPipelineRuns;
    }
    /**
     * A boolean value to specify whether to delete related jobRuns or not.
     */
    private Boolean deleteRelatedJobRuns;

    /**
     * A boolean value to specify whether to delete related jobRuns or not.
     */
    public Boolean getDeleteRelatedJobRuns() {
        return deleteRelatedJobRuns;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource is updated or deleted only if the {@code etag} you
     * provide matches the resource's current {@code etag} value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource is updated or deleted only if the {@code etag} you
     * provide matches the resource's current {@code etag} value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a particular request, then provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a particular request, then provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeletePipelineRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the pipeline.
         */
        private String pipelineId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the pipeline.
         * @param pipelineId the value to set
         * @return this builder instance
         */
        public Builder pipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * A boolean value to specify whether to delete related PipelineRuns or not.
         */
        private Boolean deleteRelatedPipelineRuns = null;

        /**
         * A boolean value to specify whether to delete related PipelineRuns or not.
         * @param deleteRelatedPipelineRuns the value to set
         * @return this builder instance
         */
        public Builder deleteRelatedPipelineRuns(Boolean deleteRelatedPipelineRuns) {
            this.deleteRelatedPipelineRuns = deleteRelatedPipelineRuns;
            return this;
        }

        /**
         * A boolean value to specify whether to delete related jobRuns or not.
         */
        private Boolean deleteRelatedJobRuns = null;

        /**
         * A boolean value to specify whether to delete related jobRuns or not.
         * @param deleteRelatedJobRuns the value to set
         * @return this builder instance
         */
        public Builder deleteRelatedJobRuns(Boolean deleteRelatedJobRuns) {
            this.deleteRelatedJobRuns = deleteRelatedJobRuns;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource is updated or deleted only if the {@code etag} you
         * provide matches the resource's current {@code etag} value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource is updated or deleted only if the {@code etag} you
         * provide matches the resource's current {@code etag} value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a particular request, then provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a particular request, then provide the request ID.
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
        public Builder copy(DeletePipelineRequest o) {
            pipelineId(o.getPipelineId());
            deleteRelatedPipelineRuns(o.getDeleteRelatedPipelineRuns());
            deleteRelatedJobRuns(o.getDeleteRelatedJobRuns());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeletePipelineRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of DeletePipelineRequest
         */
        public DeletePipelineRequest build() {
            DeletePipelineRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DeletePipelineRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeletePipelineRequest
         */
        public DeletePipelineRequest buildWithoutInvocationCallback() {
            DeletePipelineRequest request = new DeletePipelineRequest();
            request.pipelineId = pipelineId;
            request.deleteRelatedPipelineRuns = deleteRelatedPipelineRuns;
            request.deleteRelatedJobRuns = deleteRelatedJobRuns;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new DeletePipelineRequest(pipelineId, deleteRelatedPipelineRuns, deleteRelatedJobRuns, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .pipelineId(pipelineId)
                .deleteRelatedPipelineRuns(deleteRelatedPipelineRuns)
                .deleteRelatedJobRuns(deleteRelatedJobRuns)
                .ifMatch(ifMatch)
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
        sb.append(",pipelineId=").append(String.valueOf(this.pipelineId));
        sb.append(",deleteRelatedPipelineRuns=")
                .append(String.valueOf(this.deleteRelatedPipelineRuns));
        sb.append(",deleteRelatedJobRuns=").append(String.valueOf(this.deleteRelatedJobRuns));
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
        if (!(o instanceof DeletePipelineRequest)) {
            return false;
        }

        DeletePipelineRequest other = (DeletePipelineRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.pipelineId, other.pipelineId)
                && java.util.Objects.equals(
                        this.deleteRelatedPipelineRuns, other.deleteRelatedPipelineRuns)
                && java.util.Objects.equals(this.deleteRelatedJobRuns, other.deleteRelatedJobRuns)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.pipelineId == null ? 43 : this.pipelineId.hashCode());
        result =
                (result * PRIME)
                        + (this.deleteRelatedPipelineRuns == null
                                ? 43
                                : this.deleteRelatedPipelineRuns.hashCode());
        result =
                (result * PRIME)
                        + (this.deleteRelatedJobRuns == null
                                ? 43
                                : this.deleteRelatedJobRuns.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
