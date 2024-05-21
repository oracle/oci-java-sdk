/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waa.requests;

import com.oracle.bmc.waa.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/waa/UpdateWebAppAccelerationPolicyExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateWebAppAccelerationPolicyRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211230")
public class UpdateWebAppAccelerationPolicyRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.waa.model.UpdateWebAppAccelerationPolicyDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the WebAppAccelerationPolicy.
     */
    private String webAppAccelerationPolicyId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the WebAppAccelerationPolicy.
     */
    public String getWebAppAccelerationPolicyId() {
        return webAppAccelerationPolicyId;
    }
    /**
     * The information to be updated.
     */
    private com.oracle.bmc.waa.model.UpdateWebAppAccelerationPolicyDetails
            updateWebAppAccelerationPolicyDetails;

    /**
     * The information to be updated.
     */
    public com.oracle.bmc.waa.model.UpdateWebAppAccelerationPolicyDetails
            getUpdateWebAppAccelerationPolicyDetails() {
        return updateWebAppAccelerationPolicyDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource,
     * set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource,
     * set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.waa.model.UpdateWebAppAccelerationPolicyDetails getBody$() {
        return updateWebAppAccelerationPolicyDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateWebAppAccelerationPolicyRequest,
                    com.oracle.bmc.waa.model.UpdateWebAppAccelerationPolicyDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the WebAppAccelerationPolicy.
         */
        private String webAppAccelerationPolicyId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the WebAppAccelerationPolicy.
         * @param webAppAccelerationPolicyId the value to set
         * @return this builder instance
         */
        public Builder webAppAccelerationPolicyId(String webAppAccelerationPolicyId) {
            this.webAppAccelerationPolicyId = webAppAccelerationPolicyId;
            return this;
        }

        /**
         * The information to be updated.
         */
        private com.oracle.bmc.waa.model.UpdateWebAppAccelerationPolicyDetails
                updateWebAppAccelerationPolicyDetails = null;

        /**
         * The information to be updated.
         * @param updateWebAppAccelerationPolicyDetails the value to set
         * @return this builder instance
         */
        public Builder updateWebAppAccelerationPolicyDetails(
                com.oracle.bmc.waa.model.UpdateWebAppAccelerationPolicyDetails
                        updateWebAppAccelerationPolicyDetails) {
            this.updateWebAppAccelerationPolicyDetails = updateWebAppAccelerationPolicyDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource,
         * set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource,
         * set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(UpdateWebAppAccelerationPolicyRequest o) {
            webAppAccelerationPolicyId(o.getWebAppAccelerationPolicyId());
            updateWebAppAccelerationPolicyDetails(o.getUpdateWebAppAccelerationPolicyDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateWebAppAccelerationPolicyRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateWebAppAccelerationPolicyRequest
         */
        public UpdateWebAppAccelerationPolicyRequest build() {
            UpdateWebAppAccelerationPolicyRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.waa.model.UpdateWebAppAccelerationPolicyDetails body) {
            updateWebAppAccelerationPolicyDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateWebAppAccelerationPolicyRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateWebAppAccelerationPolicyRequest
         */
        public UpdateWebAppAccelerationPolicyRequest buildWithoutInvocationCallback() {
            UpdateWebAppAccelerationPolicyRequest request =
                    new UpdateWebAppAccelerationPolicyRequest();
            request.webAppAccelerationPolicyId = webAppAccelerationPolicyId;
            request.updateWebAppAccelerationPolicyDetails = updateWebAppAccelerationPolicyDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateWebAppAccelerationPolicyRequest(webAppAccelerationPolicyId, updateWebAppAccelerationPolicyDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .webAppAccelerationPolicyId(webAppAccelerationPolicyId)
                .updateWebAppAccelerationPolicyDetails(updateWebAppAccelerationPolicyDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
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
        sb.append(",webAppAccelerationPolicyId=")
                .append(String.valueOf(this.webAppAccelerationPolicyId));
        sb.append(",updateWebAppAccelerationPolicyDetails=")
                .append(String.valueOf(this.updateWebAppAccelerationPolicyDetails));
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
        if (!(o instanceof UpdateWebAppAccelerationPolicyRequest)) {
            return false;
        }

        UpdateWebAppAccelerationPolicyRequest other = (UpdateWebAppAccelerationPolicyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.webAppAccelerationPolicyId, other.webAppAccelerationPolicyId)
                && java.util.Objects.equals(
                        this.updateWebAppAccelerationPolicyDetails,
                        other.updateWebAppAccelerationPolicyDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.webAppAccelerationPolicyId == null
                                ? 43
                                : this.webAppAccelerationPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateWebAppAccelerationPolicyDetails == null
                                ? 43
                                : this.updateWebAppAccelerationPolicyDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
