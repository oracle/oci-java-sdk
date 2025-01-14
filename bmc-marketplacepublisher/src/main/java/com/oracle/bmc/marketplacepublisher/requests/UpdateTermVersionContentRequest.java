/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.requests;

import com.oracle.bmc.marketplacepublisher.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplacepublisher/UpdateTermVersionContentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateTermVersionContentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class UpdateTermVersionContentRequest
        extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream> {

    /** term version OCID */
    private String termVersionId;

    /** term version OCID */
    public String getTermVersionId() {
        return termVersionId;
    }
    /** The term attachment to upload. */
    private java.io.InputStream updateTermVersionContent;

    /** The term attachment to upload. */
    public java.io.InputStream getUpdateTermVersionContent() {
        return updateTermVersionContent;
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
    /** The name of the resource. */
    private String displayName;

    /** The name of the resource. */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.io.InputStream getBody$() {
        return updateTermVersionContent;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateTermVersionContentRequest, java.io.InputStream> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** term version OCID */
        private String termVersionId = null;

        /**
         * term version OCID
         *
         * @param termVersionId the value to set
         * @return this builder instance
         */
        public Builder termVersionId(String termVersionId) {
            this.termVersionId = termVersionId;
            return this;
        }

        /** The term attachment to upload. */
        private java.io.InputStream updateTermVersionContent = null;

        /**
         * The term attachment to upload.
         *
         * @param updateTermVersionContent the value to set
         * @return this builder instance
         */
        public Builder updateTermVersionContent(java.io.InputStream updateTermVersionContent) {
            this.updateTermVersionContent = updateTermVersionContent;
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

        /** The name of the resource. */
        private String displayName = null;

        /**
         * The name of the resource.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
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
        public Builder copy(UpdateTermVersionContentRequest o) {
            termVersionId(o.getTermVersionId());
            updateTermVersionContent(o.getUpdateTermVersionContent());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            displayName(o.getDisplayName());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateTermVersionContentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateTermVersionContentRequest
         */
        public UpdateTermVersionContentRequest build() {
            UpdateTermVersionContentRequest request = buildWithoutInvocationCallback();
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
            updateTermVersionContent(body);
            return this;
        }

        /**
         * Build the instance of UpdateTermVersionContentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateTermVersionContentRequest
         */
        public UpdateTermVersionContentRequest buildWithoutInvocationCallback() {
            UpdateTermVersionContentRequest request = new UpdateTermVersionContentRequest();
            request.termVersionId = termVersionId;
            request.updateTermVersionContent = updateTermVersionContent;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.displayName = displayName;
            return request;
            // new UpdateTermVersionContentRequest(termVersionId, updateTermVersionContent, ifMatch,
            // opcRequestId, displayName);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .termVersionId(termVersionId)
                .updateTermVersionContent(updateTermVersionContent)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .displayName(displayName);
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
        sb.append(",termVersionId=").append(String.valueOf(this.termVersionId));
        sb.append(",updateTermVersionContent=")
                .append(String.valueOf(this.updateTermVersionContent));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTermVersionContentRequest)) {
            return false;
        }

        UpdateTermVersionContentRequest other = (UpdateTermVersionContentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.termVersionId, other.termVersionId)
                && java.util.Objects.equals(
                        this.updateTermVersionContent, other.updateTermVersionContent)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.displayName, other.displayName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.termVersionId == null ? 43 : this.termVersionId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateTermVersionContent == null
                                ? 43
                                : this.updateTermVersionContent.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        return result;
    }
}
