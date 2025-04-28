/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.requests;

import com.oracle.bmc.aispeech.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/aispeech/UpdateTranscriptionJobExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateTranscriptionJobRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220101")
public class UpdateTranscriptionJobRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.aispeech.model.UpdateTranscriptionJobDetails> {

    /** Unique Transcription Job identifier. */
    private String transcriptionJobId;

    /** Unique Transcription Job identifier. */
    public String getTranscriptionJobId() {
        return transcriptionJobId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.aispeech.model.UpdateTranscriptionJobDetails
            updateTranscriptionJobDetails;

    /** The information to be updated. */
    public com.oracle.bmc.aispeech.model.UpdateTranscriptionJobDetails
            getUpdateTranscriptionJobDetails() {
        return updateTranscriptionJobDetails;
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
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.aispeech.model.UpdateTranscriptionJobDetails getBody$() {
        return updateTranscriptionJobDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateTranscriptionJobRequest,
                    com.oracle.bmc.aispeech.model.UpdateTranscriptionJobDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique Transcription Job identifier. */
        private String transcriptionJobId = null;

        /**
         * Unique Transcription Job identifier.
         *
         * @param transcriptionJobId the value to set
         * @return this builder instance
         */
        public Builder transcriptionJobId(String transcriptionJobId) {
            this.transcriptionJobId = transcriptionJobId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.aispeech.model.UpdateTranscriptionJobDetails
                updateTranscriptionJobDetails = null;

        /**
         * The information to be updated.
         *
         * @param updateTranscriptionJobDetails the value to set
         * @return this builder instance
         */
        public Builder updateTranscriptionJobDetails(
                com.oracle.bmc.aispeech.model.UpdateTranscriptionJobDetails
                        updateTranscriptionJobDetails) {
            this.updateTranscriptionJobDetails = updateTranscriptionJobDetails;
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
        public Builder copy(UpdateTranscriptionJobRequest o) {
            transcriptionJobId(o.getTranscriptionJobId());
            updateTranscriptionJobDetails(o.getUpdateTranscriptionJobDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateTranscriptionJobRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateTranscriptionJobRequest
         */
        public UpdateTranscriptionJobRequest build() {
            UpdateTranscriptionJobRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.aispeech.model.UpdateTranscriptionJobDetails body) {
            updateTranscriptionJobDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateTranscriptionJobRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateTranscriptionJobRequest
         */
        public UpdateTranscriptionJobRequest buildWithoutInvocationCallback() {
            UpdateTranscriptionJobRequest request = new UpdateTranscriptionJobRequest();
            request.transcriptionJobId = transcriptionJobId;
            request.updateTranscriptionJobDetails = updateTranscriptionJobDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateTranscriptionJobRequest(transcriptionJobId, updateTranscriptionJobDetails,
            // ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .transcriptionJobId(transcriptionJobId)
                .updateTranscriptionJobDetails(updateTranscriptionJobDetails)
                .ifMatch(ifMatch)
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
        sb.append(",transcriptionJobId=").append(String.valueOf(this.transcriptionJobId));
        sb.append(",updateTranscriptionJobDetails=")
                .append(String.valueOf(this.updateTranscriptionJobDetails));
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
        if (!(o instanceof UpdateTranscriptionJobRequest)) {
            return false;
        }

        UpdateTranscriptionJobRequest other = (UpdateTranscriptionJobRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.transcriptionJobId, other.transcriptionJobId)
                && java.util.Objects.equals(
                        this.updateTranscriptionJobDetails, other.updateTranscriptionJobDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.transcriptionJobId == null
                                ? 43
                                : this.transcriptionJobId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateTranscriptionJobDetails == null
                                ? 43
                                : this.updateTranscriptionJobDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
