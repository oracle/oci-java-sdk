/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.requests;

import com.oracle.bmc.marketplacepublisher.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplacepublisher/UpdateListingRevisionAttachmentContentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateListingRevisionAttachmentContentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
public class UpdateListingRevisionAttachmentContentRequest
        extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream> {

    /** attachment OCID */
    private String listingRevisionAttachmentId;

    /** attachment OCID */
    public String getListingRevisionAttachmentId() {
        return listingRevisionAttachmentId;
    }
    /** The attachment to upload. */
    private java.io.InputStream updateListingRevisionAttachmentContent;

    /** The attachment to upload. */
    public java.io.InputStream getUpdateListingRevisionAttachmentContent() {
        return updateListingRevisionAttachmentContent;
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
    public java.io.InputStream getBody$() {
        return updateListingRevisionAttachmentContent;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateListingRevisionAttachmentContentRequest, java.io.InputStream> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** attachment OCID */
        private String listingRevisionAttachmentId = null;

        /**
         * attachment OCID
         *
         * @param listingRevisionAttachmentId the value to set
         * @return this builder instance
         */
        public Builder listingRevisionAttachmentId(String listingRevisionAttachmentId) {
            this.listingRevisionAttachmentId = listingRevisionAttachmentId;
            return this;
        }

        /** The attachment to upload. */
        private java.io.InputStream updateListingRevisionAttachmentContent = null;

        /**
         * The attachment to upload.
         *
         * @param updateListingRevisionAttachmentContent the value to set
         * @return this builder instance
         */
        public Builder updateListingRevisionAttachmentContent(
                java.io.InputStream updateListingRevisionAttachmentContent) {
            this.updateListingRevisionAttachmentContent = updateListingRevisionAttachmentContent;
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
        public Builder copy(UpdateListingRevisionAttachmentContentRequest o) {
            listingRevisionAttachmentId(o.getListingRevisionAttachmentId());
            updateListingRevisionAttachmentContent(o.getUpdateListingRevisionAttachmentContent());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateListingRevisionAttachmentContentRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateListingRevisionAttachmentContentRequest
         */
        public UpdateListingRevisionAttachmentContentRequest build() {
            UpdateListingRevisionAttachmentContentRequest request =
                    buildWithoutInvocationCallback();
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
        public Builder body$(java.io.InputStream body) {
            updateListingRevisionAttachmentContent(body);
            return this;
        }

        /**
         * Build the instance of UpdateListingRevisionAttachmentContentRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateListingRevisionAttachmentContentRequest
         */
        public UpdateListingRevisionAttachmentContentRequest buildWithoutInvocationCallback() {
            UpdateListingRevisionAttachmentContentRequest request =
                    new UpdateListingRevisionAttachmentContentRequest();
            request.listingRevisionAttachmentId = listingRevisionAttachmentId;
            request.updateListingRevisionAttachmentContent = updateListingRevisionAttachmentContent;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateListingRevisionAttachmentContentRequest(listingRevisionAttachmentId,
            // updateListingRevisionAttachmentContent, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .listingRevisionAttachmentId(listingRevisionAttachmentId)
                .updateListingRevisionAttachmentContent(updateListingRevisionAttachmentContent)
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
        sb.append(",listingRevisionAttachmentId=")
                .append(String.valueOf(this.listingRevisionAttachmentId));
        sb.append(",updateListingRevisionAttachmentContent=")
                .append(String.valueOf(this.updateListingRevisionAttachmentContent));
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
        if (!(o instanceof UpdateListingRevisionAttachmentContentRequest)) {
            return false;
        }

        UpdateListingRevisionAttachmentContentRequest other =
                (UpdateListingRevisionAttachmentContentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.listingRevisionAttachmentId, other.listingRevisionAttachmentId)
                && java.util.Objects.equals(
                        this.updateListingRevisionAttachmentContent,
                        other.updateListingRevisionAttachmentContent)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.listingRevisionAttachmentId == null
                                ? 43
                                : this.listingRevisionAttachmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateListingRevisionAttachmentContent == null
                                ? 43
                                : this.updateListingRevisionAttachmentContent.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
