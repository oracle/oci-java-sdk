/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.requests;

import com.oracle.bmc.marketplacepublisher.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplacepublisher/UpdateListingRevisionBannerContentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateListingRevisionBannerContentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
public class UpdateListingRevisionBannerContentRequest
        extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream> {

    /** listing revision */
    private String listingRevisionId;

    /** listing revision */
    public String getListingRevisionId() {
        return listingRevisionId;
    }
    /** banner name */
    private String bannerName;

    /** banner name */
    public String getBannerName() {
        return bannerName;
    }
    /** The listing revision icon to be updated. */
    private java.io.InputStream updateListingRevisionBannerContent;

    /** The listing revision icon to be updated. */
    public java.io.InputStream getUpdateListingRevisionBannerContent() {
        return updateListingRevisionBannerContent;
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
        return updateListingRevisionBannerContent;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateListingRevisionBannerContentRequest, java.io.InputStream> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** listing revision */
        private String listingRevisionId = null;

        /**
         * listing revision
         *
         * @param listingRevisionId the value to set
         * @return this builder instance
         */
        public Builder listingRevisionId(String listingRevisionId) {
            this.listingRevisionId = listingRevisionId;
            return this;
        }

        /** banner name */
        private String bannerName = null;

        /**
         * banner name
         *
         * @param bannerName the value to set
         * @return this builder instance
         */
        public Builder bannerName(String bannerName) {
            this.bannerName = bannerName;
            return this;
        }

        /** The listing revision icon to be updated. */
        private java.io.InputStream updateListingRevisionBannerContent = null;

        /**
         * The listing revision icon to be updated.
         *
         * @param updateListingRevisionBannerContent the value to set
         * @return this builder instance
         */
        public Builder updateListingRevisionBannerContent(
                java.io.InputStream updateListingRevisionBannerContent) {
            this.updateListingRevisionBannerContent = updateListingRevisionBannerContent;
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
        public Builder copy(UpdateListingRevisionBannerContentRequest o) {
            listingRevisionId(o.getListingRevisionId());
            bannerName(o.getBannerName());
            updateListingRevisionBannerContent(o.getUpdateListingRevisionBannerContent());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateListingRevisionBannerContentRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateListingRevisionBannerContentRequest
         */
        public UpdateListingRevisionBannerContentRequest build() {
            UpdateListingRevisionBannerContentRequest request = buildWithoutInvocationCallback();
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
            updateListingRevisionBannerContent(body);
            return this;
        }

        /**
         * Build the instance of UpdateListingRevisionBannerContentRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateListingRevisionBannerContentRequest
         */
        public UpdateListingRevisionBannerContentRequest buildWithoutInvocationCallback() {
            UpdateListingRevisionBannerContentRequest request =
                    new UpdateListingRevisionBannerContentRequest();
            request.listingRevisionId = listingRevisionId;
            request.bannerName = bannerName;
            request.updateListingRevisionBannerContent = updateListingRevisionBannerContent;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateListingRevisionBannerContentRequest(listingRevisionId, bannerName,
            // updateListingRevisionBannerContent, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .listingRevisionId(listingRevisionId)
                .bannerName(bannerName)
                .updateListingRevisionBannerContent(updateListingRevisionBannerContent)
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
        sb.append(",listingRevisionId=").append(String.valueOf(this.listingRevisionId));
        sb.append(",bannerName=").append(String.valueOf(this.bannerName));
        sb.append(",updateListingRevisionBannerContent=")
                .append(String.valueOf(this.updateListingRevisionBannerContent));
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
        if (!(o instanceof UpdateListingRevisionBannerContentRequest)) {
            return false;
        }

        UpdateListingRevisionBannerContentRequest other =
                (UpdateListingRevisionBannerContentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.listingRevisionId, other.listingRevisionId)
                && java.util.Objects.equals(this.bannerName, other.bannerName)
                && java.util.Objects.equals(
                        this.updateListingRevisionBannerContent,
                        other.updateListingRevisionBannerContent)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.listingRevisionId == null ? 43 : this.listingRevisionId.hashCode());
        result = (result * PRIME) + (this.bannerName == null ? 43 : this.bannerName.hashCode());
        result =
                (result * PRIME)
                        + (this.updateListingRevisionBannerContent == null
                                ? 43
                                : this.updateListingRevisionBannerContent.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
