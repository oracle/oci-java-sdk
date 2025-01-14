/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateVolumeAttachmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateVolumeAttachmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateVolumeAttachmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.UpdateVolumeAttachmentDetails> {

    /** The OCID of the volume attachment. */
    private String volumeAttachmentId;

    /** The OCID of the volume attachment. */
    public String getVolumeAttachmentId() {
        return volumeAttachmentId;
    }
    /** Update information about the specified volume attachment. */
    private com.oracle.bmc.core.model.UpdateVolumeAttachmentDetails updateVolumeAttachmentDetails;

    /** Update information about the specified volume attachment. */
    public com.oracle.bmc.core.model.UpdateVolumeAttachmentDetails
            getUpdateVolumeAttachmentDetails() {
        return updateVolumeAttachmentDetails;
    }
    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
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

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.UpdateVolumeAttachmentDetails getBody$() {
        return updateVolumeAttachmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateVolumeAttachmentRequest,
                    com.oracle.bmc.core.model.UpdateVolumeAttachmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the volume attachment. */
        private String volumeAttachmentId = null;

        /**
         * The OCID of the volume attachment.
         *
         * @param volumeAttachmentId the value to set
         * @return this builder instance
         */
        public Builder volumeAttachmentId(String volumeAttachmentId) {
            this.volumeAttachmentId = volumeAttachmentId;
            return this;
        }

        /** Update information about the specified volume attachment. */
        private com.oracle.bmc.core.model.UpdateVolumeAttachmentDetails
                updateVolumeAttachmentDetails = null;

        /**
         * Update information about the specified volume attachment.
         *
         * @param updateVolumeAttachmentDetails the value to set
         * @return this builder instance
         */
        public Builder updateVolumeAttachmentDetails(
                com.oracle.bmc.core.model.UpdateVolumeAttachmentDetails
                        updateVolumeAttachmentDetails) {
            this.updateVolumeAttachmentDetails = updateVolumeAttachmentDetails;
            return this;
        }

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(UpdateVolumeAttachmentRequest o) {
            volumeAttachmentId(o.getVolumeAttachmentId());
            updateVolumeAttachmentDetails(o.getUpdateVolumeAttachmentDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateVolumeAttachmentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateVolumeAttachmentRequest
         */
        public UpdateVolumeAttachmentRequest build() {
            UpdateVolumeAttachmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.UpdateVolumeAttachmentDetails body) {
            updateVolumeAttachmentDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateVolumeAttachmentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateVolumeAttachmentRequest
         */
        public UpdateVolumeAttachmentRequest buildWithoutInvocationCallback() {
            UpdateVolumeAttachmentRequest request = new UpdateVolumeAttachmentRequest();
            request.volumeAttachmentId = volumeAttachmentId;
            request.updateVolumeAttachmentDetails = updateVolumeAttachmentDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateVolumeAttachmentRequest(volumeAttachmentId, updateVolumeAttachmentDetails,
            // opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .volumeAttachmentId(volumeAttachmentId)
                .updateVolumeAttachmentDetails(updateVolumeAttachmentDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
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
        sb.append(",volumeAttachmentId=").append(String.valueOf(this.volumeAttachmentId));
        sb.append(",updateVolumeAttachmentDetails=")
                .append(String.valueOf(this.updateVolumeAttachmentDetails));
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
        if (!(o instanceof UpdateVolumeAttachmentRequest)) {
            return false;
        }

        UpdateVolumeAttachmentRequest other = (UpdateVolumeAttachmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.volumeAttachmentId, other.volumeAttachmentId)
                && java.util.Objects.equals(
                        this.updateVolumeAttachmentDetails, other.updateVolumeAttachmentDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.volumeAttachmentId == null
                                ? 43
                                : this.volumeAttachmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateVolumeAttachmentDetails == null
                                ? 43
                                : this.updateVolumeAttachmentDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
