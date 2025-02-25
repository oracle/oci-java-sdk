/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/GetTagExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetTagRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetTagRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the tag namespace.
     *
     */
    private String tagNamespaceId;

    /**
     * The OCID of the tag namespace.
     *
     */
    public String getTagNamespaceId() {
        return tagNamespaceId;
    }
    /**
     * The name of the tag.
     *
     */
    private String tagName;

    /**
     * The name of the tag.
     *
     */
    public String getTagName() {
        return tagName;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<GetTagRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the tag namespace.
         *
         */
        private String tagNamespaceId = null;

        /**
         * The OCID of the tag namespace.
         *
         * @param tagNamespaceId the value to set
         * @return this builder instance
         */
        public Builder tagNamespaceId(String tagNamespaceId) {
            this.tagNamespaceId = tagNamespaceId;
            return this;
        }

        /**
         * The name of the tag.
         *
         */
        private String tagName = null;

        /**
         * The name of the tag.
         *
         * @param tagName the value to set
         * @return this builder instance
         */
        public Builder tagName(String tagName) {
            this.tagName = tagName;
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
        public Builder copy(GetTagRequest o) {
            tagNamespaceId(o.getTagNamespaceId());
            tagName(o.getTagName());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetTagRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetTagRequest
         */
        public GetTagRequest build() {
            GetTagRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetTagRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetTagRequest
         */
        public GetTagRequest buildWithoutInvocationCallback() {
            GetTagRequest request = new GetTagRequest();
            request.tagNamespaceId = tagNamespaceId;
            request.tagName = tagName;
            return request;
            // new GetTagRequest(tagNamespaceId, tagName);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().tagNamespaceId(tagNamespaceId).tagName(tagName);
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
        sb.append(",tagNamespaceId=").append(String.valueOf(this.tagNamespaceId));
        sb.append(",tagName=").append(String.valueOf(this.tagName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetTagRequest)) {
            return false;
        }

        GetTagRequest other = (GetTagRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.tagNamespaceId, other.tagNamespaceId)
                && java.util.Objects.equals(this.tagName, other.tagName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.tagNamespaceId == null ? 43 : this.tagNamespaceId.hashCode());
        result = (result * PRIME) + (this.tagName == null ? 43 : this.tagName.hashCode());
        return result;
    }
}
