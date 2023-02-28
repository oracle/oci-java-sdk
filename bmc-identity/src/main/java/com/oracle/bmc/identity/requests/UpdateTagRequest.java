/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateTagExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateTagRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateTagRequest
        extends com.oracle.bmc.requests.BmcRequest<com.oracle.bmc.identity.model.UpdateTagDetails> {

    /** The OCID of the tag namespace. */
    private String tagNamespaceId;

    /** The OCID of the tag namespace. */
    public String getTagNamespaceId() {
        return tagNamespaceId;
    }
    /** The name of the tag. */
    private String tagName;

    /** The name of the tag. */
    public String getTagName() {
        return tagName;
    }
    /** Request object for updating a tag. */
    private com.oracle.bmc.identity.model.UpdateTagDetails updateTagDetails;

    /** Request object for updating a tag. */
    public com.oracle.bmc.identity.model.UpdateTagDetails getUpdateTagDetails() {
        return updateTagDetails;
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
    /** Whether to override locks (if any exist). */
    private Boolean isLockOverride;

    /** Whether to override locks (if any exist). */
    public Boolean getIsLockOverride() {
        return isLockOverride;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.identity.model.UpdateTagDetails getBody$() {
        return updateTagDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateTagRequest, com.oracle.bmc.identity.model.UpdateTagDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the tag namespace. */
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

        /** The name of the tag. */
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

        /** Request object for updating a tag. */
        private com.oracle.bmc.identity.model.UpdateTagDetails updateTagDetails = null;

        /**
         * Request object for updating a tag.
         *
         * @param updateTagDetails the value to set
         * @return this builder instance
         */
        public Builder updateTagDetails(
                com.oracle.bmc.identity.model.UpdateTagDetails updateTagDetails) {
            this.updateTagDetails = updateTagDetails;
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

        /** Whether to override locks (if any exist). */
        private Boolean isLockOverride = null;

        /**
         * Whether to override locks (if any exist).
         *
         * @param isLockOverride the value to set
         * @return this builder instance
         */
        public Builder isLockOverride(Boolean isLockOverride) {
            this.isLockOverride = isLockOverride;
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
        public Builder copy(UpdateTagRequest o) {
            tagNamespaceId(o.getTagNamespaceId());
            tagName(o.getTagName());
            updateTagDetails(o.getUpdateTagDetails());
            ifMatch(o.getIfMatch());
            isLockOverride(o.getIsLockOverride());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateTagRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateTagRequest
         */
        public UpdateTagRequest build() {
            UpdateTagRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.identity.model.UpdateTagDetails body) {
            updateTagDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateTagRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateTagRequest
         */
        public UpdateTagRequest buildWithoutInvocationCallback() {
            UpdateTagRequest request = new UpdateTagRequest();
            request.tagNamespaceId = tagNamespaceId;
            request.tagName = tagName;
            request.updateTagDetails = updateTagDetails;
            request.ifMatch = ifMatch;
            request.isLockOverride = isLockOverride;
            return request;
            // new UpdateTagRequest(tagNamespaceId, tagName, updateTagDetails, ifMatch,
            // isLockOverride);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .tagNamespaceId(tagNamespaceId)
                .tagName(tagName)
                .updateTagDetails(updateTagDetails)
                .ifMatch(ifMatch)
                .isLockOverride(isLockOverride);
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
        sb.append(",tagNamespaceId=").append(String.valueOf(this.tagNamespaceId));
        sb.append(",tagName=").append(String.valueOf(this.tagName));
        sb.append(",updateTagDetails=").append(String.valueOf(this.updateTagDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",isLockOverride=").append(String.valueOf(this.isLockOverride));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTagRequest)) {
            return false;
        }

        UpdateTagRequest other = (UpdateTagRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.tagNamespaceId, other.tagNamespaceId)
                && java.util.Objects.equals(this.tagName, other.tagName)
                && java.util.Objects.equals(this.updateTagDetails, other.updateTagDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.isLockOverride, other.isLockOverride);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.tagNamespaceId == null ? 43 : this.tagNamespaceId.hashCode());
        result = (result * PRIME) + (this.tagName == null ? 43 : this.tagName.hashCode());
        result =
                (result * PRIME)
                        + (this.updateTagDetails == null ? 43 : this.updateTagDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.isLockOverride == null ? 43 : this.isLockOverride.hashCode());
        return result;
    }
}
