/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.requests;

import com.oracle.bmc.stackmonitoring.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/stackmonitoring/UpdateProcessSetExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateProcessSetRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
public class UpdateProcessSetRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.stackmonitoring.model.UpdateProcessSetDetails> {

    /**
     * The Process Set ID
     */
    private String processSetId;

    /**
     * The Process Set ID
     */
    public String getProcessSetId() {
        return processSetId;
    }
    /**
     * The updated Process Set details.
     */
    private com.oracle.bmc.stackmonitoring.model.UpdateProcessSetDetails updateProcessSetDetails;

    /**
     * The updated Process Set details.
     */
    public com.oracle.bmc.stackmonitoring.model.UpdateProcessSetDetails
            getUpdateProcessSetDetails() {
        return updateProcessSetDetails;
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
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.stackmonitoring.model.UpdateProcessSetDetails getBody$() {
        return updateProcessSetDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateProcessSetRequest,
                    com.oracle.bmc.stackmonitoring.model.UpdateProcessSetDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The Process Set ID
         */
        private String processSetId = null;

        /**
         * The Process Set ID
         * @param processSetId the value to set
         * @return this builder instance
         */
        public Builder processSetId(String processSetId) {
            this.processSetId = processSetId;
            return this;
        }

        /**
         * The updated Process Set details.
         */
        private com.oracle.bmc.stackmonitoring.model.UpdateProcessSetDetails
                updateProcessSetDetails = null;

        /**
         * The updated Process Set details.
         * @param updateProcessSetDetails the value to set
         * @return this builder instance
         */
        public Builder updateProcessSetDetails(
                com.oracle.bmc.stackmonitoring.model.UpdateProcessSetDetails
                        updateProcessSetDetails) {
            this.updateProcessSetDetails = updateProcessSetDetails;
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
        public Builder copy(UpdateProcessSetRequest o) {
            processSetId(o.getProcessSetId());
            updateProcessSetDetails(o.getUpdateProcessSetDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateProcessSetRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateProcessSetRequest
         */
        public UpdateProcessSetRequest build() {
            UpdateProcessSetRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.stackmonitoring.model.UpdateProcessSetDetails body) {
            updateProcessSetDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateProcessSetRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateProcessSetRequest
         */
        public UpdateProcessSetRequest buildWithoutInvocationCallback() {
            UpdateProcessSetRequest request = new UpdateProcessSetRequest();
            request.processSetId = processSetId;
            request.updateProcessSetDetails = updateProcessSetDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateProcessSetRequest(processSetId, updateProcessSetDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .processSetId(processSetId)
                .updateProcessSetDetails(updateProcessSetDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
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
        sb.append(",processSetId=").append(String.valueOf(this.processSetId));
        sb.append(",updateProcessSetDetails=").append(String.valueOf(this.updateProcessSetDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateProcessSetRequest)) {
            return false;
        }

        UpdateProcessSetRequest other = (UpdateProcessSetRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.processSetId, other.processSetId)
                && java.util.Objects.equals(
                        this.updateProcessSetDetails, other.updateProcessSetDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.processSetId == null ? 43 : this.processSetId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateProcessSetDetails == null
                                ? 43
                                : this.updateProcessSetDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
