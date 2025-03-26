/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateNamedCredentialExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateNamedCredentialRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class UpdateNamedCredentialRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasemanagement.model.UpdateNamedCredentialDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the named credential.
     */
    private String namedCredentialId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the named credential.
     */
    public String getNamedCredentialId() {
        return namedCredentialId;
    }
    /**
     * The details required to update a named credential.
     */
    private com.oracle.bmc.databasemanagement.model.UpdateNamedCredentialDetails
            updateNamedCredentialDetails;

    /**
     * The details required to update a named credential.
     */
    public com.oracle.bmc.databasemanagement.model.UpdateNamedCredentialDetails
            getUpdateNamedCredentialDetails() {
        return updateNamedCredentialDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
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
    public com.oracle.bmc.databasemanagement.model.UpdateNamedCredentialDetails getBody$() {
        return updateNamedCredentialDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateNamedCredentialRequest,
                    com.oracle.bmc.databasemanagement.model.UpdateNamedCredentialDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the named credential.
         */
        private String namedCredentialId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the named credential.
         * @param namedCredentialId the value to set
         * @return this builder instance
         */
        public Builder namedCredentialId(String namedCredentialId) {
            this.namedCredentialId = namedCredentialId;
            return this;
        }

        /**
         * The details required to update a named credential.
         */
        private com.oracle.bmc.databasemanagement.model.UpdateNamedCredentialDetails
                updateNamedCredentialDetails = null;

        /**
         * The details required to update a named credential.
         * @param updateNamedCredentialDetails the value to set
         * @return this builder instance
         */
        public Builder updateNamedCredentialDetails(
                com.oracle.bmc.databasemanagement.model.UpdateNamedCredentialDetails
                        updateNamedCredentialDetails) {
            this.updateNamedCredentialDetails = updateNamedCredentialDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
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
        public Builder copy(UpdateNamedCredentialRequest o) {
            namedCredentialId(o.getNamedCredentialId());
            updateNamedCredentialDetails(o.getUpdateNamedCredentialDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateNamedCredentialRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateNamedCredentialRequest
         */
        public UpdateNamedCredentialRequest build() {
            UpdateNamedCredentialRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.databasemanagement.model.UpdateNamedCredentialDetails body) {
            updateNamedCredentialDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateNamedCredentialRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateNamedCredentialRequest
         */
        public UpdateNamedCredentialRequest buildWithoutInvocationCallback() {
            UpdateNamedCredentialRequest request = new UpdateNamedCredentialRequest();
            request.namedCredentialId = namedCredentialId;
            request.updateNamedCredentialDetails = updateNamedCredentialDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateNamedCredentialRequest(namedCredentialId, updateNamedCredentialDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namedCredentialId(namedCredentialId)
                .updateNamedCredentialDetails(updateNamedCredentialDetails)
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
        sb.append(",namedCredentialId=").append(String.valueOf(this.namedCredentialId));
        sb.append(",updateNamedCredentialDetails=")
                .append(String.valueOf(this.updateNamedCredentialDetails));
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
        if (!(o instanceof UpdateNamedCredentialRequest)) {
            return false;
        }

        UpdateNamedCredentialRequest other = (UpdateNamedCredentialRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namedCredentialId, other.namedCredentialId)
                && java.util.Objects.equals(
                        this.updateNamedCredentialDetails, other.updateNamedCredentialDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namedCredentialId == null ? 43 : this.namedCredentialId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateNamedCredentialDetails == null
                                ? 43
                                : this.updateNamedCredentialDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
