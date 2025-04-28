/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateDynamicGroupExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateDynamicGroupRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateDynamicGroupRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.identity.model.UpdateDynamicGroupDetails> {

    /** The OCID of the dynamic group. */
    private String dynamicGroupId;

    /** The OCID of the dynamic group. */
    public String getDynamicGroupId() {
        return dynamicGroupId;
    }
    /** Request object for updating an dynamic group. */
    private com.oracle.bmc.identity.model.UpdateDynamicGroupDetails updateDynamicGroupDetails;

    /** Request object for updating an dynamic group. */
    public com.oracle.bmc.identity.model.UpdateDynamicGroupDetails getUpdateDynamicGroupDetails() {
        return updateDynamicGroupDetails;
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
    public com.oracle.bmc.identity.model.UpdateDynamicGroupDetails getBody$() {
        return updateDynamicGroupDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateDynamicGroupRequest,
                    com.oracle.bmc.identity.model.UpdateDynamicGroupDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the dynamic group. */
        private String dynamicGroupId = null;

        /**
         * The OCID of the dynamic group.
         *
         * @param dynamicGroupId the value to set
         * @return this builder instance
         */
        public Builder dynamicGroupId(String dynamicGroupId) {
            this.dynamicGroupId = dynamicGroupId;
            return this;
        }

        /** Request object for updating an dynamic group. */
        private com.oracle.bmc.identity.model.UpdateDynamicGroupDetails updateDynamicGroupDetails =
                null;

        /**
         * Request object for updating an dynamic group.
         *
         * @param updateDynamicGroupDetails the value to set
         * @return this builder instance
         */
        public Builder updateDynamicGroupDetails(
                com.oracle.bmc.identity.model.UpdateDynamicGroupDetails updateDynamicGroupDetails) {
            this.updateDynamicGroupDetails = updateDynamicGroupDetails;
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
        public Builder copy(UpdateDynamicGroupRequest o) {
            dynamicGroupId(o.getDynamicGroupId());
            updateDynamicGroupDetails(o.getUpdateDynamicGroupDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateDynamicGroupRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateDynamicGroupRequest
         */
        public UpdateDynamicGroupRequest build() {
            UpdateDynamicGroupRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.identity.model.UpdateDynamicGroupDetails body) {
            updateDynamicGroupDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateDynamicGroupRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateDynamicGroupRequest
         */
        public UpdateDynamicGroupRequest buildWithoutInvocationCallback() {
            UpdateDynamicGroupRequest request = new UpdateDynamicGroupRequest();
            request.dynamicGroupId = dynamicGroupId;
            request.updateDynamicGroupDetails = updateDynamicGroupDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateDynamicGroupRequest(dynamicGroupId, updateDynamicGroupDetails, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .dynamicGroupId(dynamicGroupId)
                .updateDynamicGroupDetails(updateDynamicGroupDetails)
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
        sb.append(",dynamicGroupId=").append(String.valueOf(this.dynamicGroupId));
        sb.append(",updateDynamicGroupDetails=")
                .append(String.valueOf(this.updateDynamicGroupDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDynamicGroupRequest)) {
            return false;
        }

        UpdateDynamicGroupRequest other = (UpdateDynamicGroupRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.dynamicGroupId, other.dynamicGroupId)
                && java.util.Objects.equals(
                        this.updateDynamicGroupDetails, other.updateDynamicGroupDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.dynamicGroupId == null ? 43 : this.dynamicGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateDynamicGroupDetails == null
                                ? 43
                                : this.updateDynamicGroupDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
