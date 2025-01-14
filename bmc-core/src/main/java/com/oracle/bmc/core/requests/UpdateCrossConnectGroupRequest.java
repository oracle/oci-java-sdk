/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateCrossConnectGroupExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateCrossConnectGroupRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateCrossConnectGroupRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.UpdateCrossConnectGroupDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the cross-connect group.
     */
    private String crossConnectGroupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the cross-connect group.
     */
    public String getCrossConnectGroupId() {
        return crossConnectGroupId;
    }
    /** Update CrossConnectGroup fields */
    private com.oracle.bmc.core.model.UpdateCrossConnectGroupDetails updateCrossConnectGroupDetails;

    /** Update CrossConnectGroup fields */
    public com.oracle.bmc.core.model.UpdateCrossConnectGroupDetails
            getUpdateCrossConnectGroupDetails() {
        return updateCrossConnectGroupDetails;
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
    public com.oracle.bmc.core.model.UpdateCrossConnectGroupDetails getBody$() {
        return updateCrossConnectGroupDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateCrossConnectGroupRequest,
                    com.oracle.bmc.core.model.UpdateCrossConnectGroupDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the cross-connect group.
         */
        private String crossConnectGroupId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the cross-connect group.
         *
         * @param crossConnectGroupId the value to set
         * @return this builder instance
         */
        public Builder crossConnectGroupId(String crossConnectGroupId) {
            this.crossConnectGroupId = crossConnectGroupId;
            return this;
        }

        /** Update CrossConnectGroup fields */
        private com.oracle.bmc.core.model.UpdateCrossConnectGroupDetails
                updateCrossConnectGroupDetails = null;

        /**
         * Update CrossConnectGroup fields
         *
         * @param updateCrossConnectGroupDetails the value to set
         * @return this builder instance
         */
        public Builder updateCrossConnectGroupDetails(
                com.oracle.bmc.core.model.UpdateCrossConnectGroupDetails
                        updateCrossConnectGroupDetails) {
            this.updateCrossConnectGroupDetails = updateCrossConnectGroupDetails;
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
        public Builder copy(UpdateCrossConnectGroupRequest o) {
            crossConnectGroupId(o.getCrossConnectGroupId());
            updateCrossConnectGroupDetails(o.getUpdateCrossConnectGroupDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateCrossConnectGroupRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateCrossConnectGroupRequest
         */
        public UpdateCrossConnectGroupRequest build() {
            UpdateCrossConnectGroupRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.UpdateCrossConnectGroupDetails body) {
            updateCrossConnectGroupDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateCrossConnectGroupRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateCrossConnectGroupRequest
         */
        public UpdateCrossConnectGroupRequest buildWithoutInvocationCallback() {
            UpdateCrossConnectGroupRequest request = new UpdateCrossConnectGroupRequest();
            request.crossConnectGroupId = crossConnectGroupId;
            request.updateCrossConnectGroupDetails = updateCrossConnectGroupDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateCrossConnectGroupRequest(crossConnectGroupId,
            // updateCrossConnectGroupDetails, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .crossConnectGroupId(crossConnectGroupId)
                .updateCrossConnectGroupDetails(updateCrossConnectGroupDetails)
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
        sb.append(",crossConnectGroupId=").append(String.valueOf(this.crossConnectGroupId));
        sb.append(",updateCrossConnectGroupDetails=")
                .append(String.valueOf(this.updateCrossConnectGroupDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateCrossConnectGroupRequest)) {
            return false;
        }

        UpdateCrossConnectGroupRequest other = (UpdateCrossConnectGroupRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.crossConnectGroupId, other.crossConnectGroupId)
                && java.util.Objects.equals(
                        this.updateCrossConnectGroupDetails, other.updateCrossConnectGroupDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.crossConnectGroupId == null
                                ? 43
                                : this.crossConnectGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateCrossConnectGroupDetails == null
                                ? 43
                                : this.updateCrossConnectGroupDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
