/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.requests;

import com.oracle.bmc.logging.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/logging/UpdateUnifiedAgentConfigurationExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateUnifiedAgentConfigurationRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
public class UpdateUnifiedAgentConfigurationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.logging.model.UpdateUnifiedAgentConfigurationDetails> {

    /** The OCID of the Unified Agent configuration. */
    private String unifiedAgentConfigurationId;

    /** The OCID of the Unified Agent configuration. */
    public String getUnifiedAgentConfigurationId() {
        return unifiedAgentConfigurationId;
    }
    /**
     * Unified agent configuration to update. Empty group associations list doesn't modify the list,
     * null value for group association clears all the previous associations.
     */
    private com.oracle.bmc.logging.model.UpdateUnifiedAgentConfigurationDetails
            updateUnifiedAgentConfigurationDetails;

    /**
     * Unified agent configuration to update. Empty group associations list doesn't modify the list,
     * null value for group association clears all the previous associations.
     */
    public com.oracle.bmc.logging.model.UpdateUnifiedAgentConfigurationDetails
            getUpdateUnifiedAgentConfigurationDetails() {
        return updateUnifiedAgentConfigurationDetails;
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
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
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
    public com.oracle.bmc.logging.model.UpdateUnifiedAgentConfigurationDetails getBody$() {
        return updateUnifiedAgentConfigurationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateUnifiedAgentConfigurationRequest,
                    com.oracle.bmc.logging.model.UpdateUnifiedAgentConfigurationDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the Unified Agent configuration. */
        private String unifiedAgentConfigurationId = null;

        /**
         * The OCID of the Unified Agent configuration.
         *
         * @param unifiedAgentConfigurationId the value to set
         * @return this builder instance
         */
        public Builder unifiedAgentConfigurationId(String unifiedAgentConfigurationId) {
            this.unifiedAgentConfigurationId = unifiedAgentConfigurationId;
            return this;
        }

        /**
         * Unified agent configuration to update. Empty group associations list doesn't modify the
         * list, null value for group association clears all the previous associations.
         */
        private com.oracle.bmc.logging.model.UpdateUnifiedAgentConfigurationDetails
                updateUnifiedAgentConfigurationDetails = null;

        /**
         * Unified agent configuration to update. Empty group associations list doesn't modify the
         * list, null value for group association clears all the previous associations.
         *
         * @param updateUnifiedAgentConfigurationDetails the value to set
         * @return this builder instance
         */
        public Builder updateUnifiedAgentConfigurationDetails(
                com.oracle.bmc.logging.model.UpdateUnifiedAgentConfigurationDetails
                        updateUnifiedAgentConfigurationDetails) {
            this.updateUnifiedAgentConfigurationDetails = updateUnifiedAgentConfigurationDetails;
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
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
        public Builder copy(UpdateUnifiedAgentConfigurationRequest o) {
            unifiedAgentConfigurationId(o.getUnifiedAgentConfigurationId());
            updateUnifiedAgentConfigurationDetails(o.getUpdateUnifiedAgentConfigurationDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateUnifiedAgentConfigurationRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateUnifiedAgentConfigurationRequest
         */
        public UpdateUnifiedAgentConfigurationRequest build() {
            UpdateUnifiedAgentConfigurationRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.logging.model.UpdateUnifiedAgentConfigurationDetails body) {
            updateUnifiedAgentConfigurationDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateUnifiedAgentConfigurationRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateUnifiedAgentConfigurationRequest
         */
        public UpdateUnifiedAgentConfigurationRequest buildWithoutInvocationCallback() {
            UpdateUnifiedAgentConfigurationRequest request =
                    new UpdateUnifiedAgentConfigurationRequest();
            request.unifiedAgentConfigurationId = unifiedAgentConfigurationId;
            request.updateUnifiedAgentConfigurationDetails = updateUnifiedAgentConfigurationDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateUnifiedAgentConfigurationRequest(unifiedAgentConfigurationId,
            // updateUnifiedAgentConfigurationDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .unifiedAgentConfigurationId(unifiedAgentConfigurationId)
                .updateUnifiedAgentConfigurationDetails(updateUnifiedAgentConfigurationDetails)
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
        sb.append(",unifiedAgentConfigurationId=")
                .append(String.valueOf(this.unifiedAgentConfigurationId));
        sb.append(",updateUnifiedAgentConfigurationDetails=")
                .append(String.valueOf(this.updateUnifiedAgentConfigurationDetails));
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
        if (!(o instanceof UpdateUnifiedAgentConfigurationRequest)) {
            return false;
        }

        UpdateUnifiedAgentConfigurationRequest other = (UpdateUnifiedAgentConfigurationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.unifiedAgentConfigurationId, other.unifiedAgentConfigurationId)
                && java.util.Objects.equals(
                        this.updateUnifiedAgentConfigurationDetails,
                        other.updateUnifiedAgentConfigurationDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.unifiedAgentConfigurationId == null
                                ? 43
                                : this.unifiedAgentConfigurationId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateUnifiedAgentConfigurationDetails == null
                                ? 43
                                : this.updateUnifiedAgentConfigurationDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
