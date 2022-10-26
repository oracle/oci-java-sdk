/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateTagNamespaceExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateTagNamespaceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateTagNamespaceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.identity.model.UpdateTagNamespaceDetails> {

    /** The OCID of the tag namespace. */
    private String tagNamespaceId;

    /** The OCID of the tag namespace. */
    public String getTagNamespaceId() {
        return tagNamespaceId;
    }
    /** Request object for updating a namespace. */
    private com.oracle.bmc.identity.model.UpdateTagNamespaceDetails updateTagNamespaceDetails;

    /** Request object for updating a namespace. */
    public com.oracle.bmc.identity.model.UpdateTagNamespaceDetails getUpdateTagNamespaceDetails() {
        return updateTagNamespaceDetails;
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
    public com.oracle.bmc.identity.model.UpdateTagNamespaceDetails getBody$() {
        return updateTagNamespaceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateTagNamespaceRequest,
                    com.oracle.bmc.identity.model.UpdateTagNamespaceDetails> {
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

        /** Request object for updating a namespace. */
        private com.oracle.bmc.identity.model.UpdateTagNamespaceDetails updateTagNamespaceDetails =
                null;

        /**
         * Request object for updating a namespace.
         *
         * @param updateTagNamespaceDetails the value to set
         * @return this builder instance
         */
        public Builder updateTagNamespaceDetails(
                com.oracle.bmc.identity.model.UpdateTagNamespaceDetails updateTagNamespaceDetails) {
            this.updateTagNamespaceDetails = updateTagNamespaceDetails;
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
        public Builder copy(UpdateTagNamespaceRequest o) {
            tagNamespaceId(o.getTagNamespaceId());
            updateTagNamespaceDetails(o.getUpdateTagNamespaceDetails());
            isLockOverride(o.getIsLockOverride());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateTagNamespaceRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateTagNamespaceRequest
         */
        public UpdateTagNamespaceRequest build() {
            UpdateTagNamespaceRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.identity.model.UpdateTagNamespaceDetails body) {
            updateTagNamespaceDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateTagNamespaceRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateTagNamespaceRequest
         */
        public UpdateTagNamespaceRequest buildWithoutInvocationCallback() {
            UpdateTagNamespaceRequest request = new UpdateTagNamespaceRequest();
            request.tagNamespaceId = tagNamespaceId;
            request.updateTagNamespaceDetails = updateTagNamespaceDetails;
            request.isLockOverride = isLockOverride;
            return request;
            // new UpdateTagNamespaceRequest(tagNamespaceId, updateTagNamespaceDetails,
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
                .updateTagNamespaceDetails(updateTagNamespaceDetails)
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
        sb.append(",updateTagNamespaceDetails=")
                .append(String.valueOf(this.updateTagNamespaceDetails));
        sb.append(",isLockOverride=").append(String.valueOf(this.isLockOverride));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTagNamespaceRequest)) {
            return false;
        }

        UpdateTagNamespaceRequest other = (UpdateTagNamespaceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.tagNamespaceId, other.tagNamespaceId)
                && java.util.Objects.equals(
                        this.updateTagNamespaceDetails, other.updateTagNamespaceDetails)
                && java.util.Objects.equals(this.isLockOverride, other.isLockOverride);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.tagNamespaceId == null ? 43 : this.tagNamespaceId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateTagNamespaceDetails == null
                                ? 43
                                : this.updateTagNamespaceDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.isLockOverride == null ? 43 : this.isLockOverride.hashCode());
        return result;
    }
}
