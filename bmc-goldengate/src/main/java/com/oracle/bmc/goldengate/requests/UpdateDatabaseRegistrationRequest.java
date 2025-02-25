/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.requests;

import com.oracle.bmc.goldengate.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/goldengate/UpdateDatabaseRegistrationExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateDatabaseRegistrationRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public class UpdateDatabaseRegistrationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.goldengate.model.UpdateDatabaseRegistrationDetails> {

    /**
     * A unique DatabaseRegistration identifier.
     *
     */
    private String databaseRegistrationId;

    /**
     * A unique DatabaseRegistration identifier.
     *
     */
    public String getDatabaseRegistrationId() {
        return databaseRegistrationId;
    }
    /**
     * The new DatabaseRegistration specifications to apply.
     *
     */
    private com.oracle.bmc.goldengate.model.UpdateDatabaseRegistrationDetails
            updateDatabaseRegistrationDetails;

    /**
     * The new DatabaseRegistration specifications to apply.
     *
     */
    public com.oracle.bmc.goldengate.model.UpdateDatabaseRegistrationDetails
            getUpdateDatabaseRegistrationDetails() {
        return updateDatabaseRegistrationDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource.  The resource is updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource.  The resource is updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The client request ID for tracing.
     *
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     *
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
    public com.oracle.bmc.goldengate.model.UpdateDatabaseRegistrationDetails getBody$() {
        return updateDatabaseRegistrationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateDatabaseRegistrationRequest,
                    com.oracle.bmc.goldengate.model.UpdateDatabaseRegistrationDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * A unique DatabaseRegistration identifier.
         *
         */
        private String databaseRegistrationId = null;

        /**
         * A unique DatabaseRegistration identifier.
         *
         * @param databaseRegistrationId the value to set
         * @return this builder instance
         */
        public Builder databaseRegistrationId(String databaseRegistrationId) {
            this.databaseRegistrationId = databaseRegistrationId;
            return this;
        }

        /**
         * The new DatabaseRegistration specifications to apply.
         *
         */
        private com.oracle.bmc.goldengate.model.UpdateDatabaseRegistrationDetails
                updateDatabaseRegistrationDetails = null;

        /**
         * The new DatabaseRegistration specifications to apply.
         *
         * @param updateDatabaseRegistrationDetails the value to set
         * @return this builder instance
         */
        public Builder updateDatabaseRegistrationDetails(
                com.oracle.bmc.goldengate.model.UpdateDatabaseRegistrationDetails
                        updateDatabaseRegistrationDetails) {
            this.updateDatabaseRegistrationDetails = updateDatabaseRegistrationDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response for that
         * resource.  The resource is updated or deleted only if the etag you provide matches the
         * resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response for that
         * resource.  The resource is updated or deleted only if the etag you provide matches the
         * resource's current etag value.
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
         *
         */
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
        public Builder copy(UpdateDatabaseRegistrationRequest o) {
            databaseRegistrationId(o.getDatabaseRegistrationId());
            updateDatabaseRegistrationDetails(o.getUpdateDatabaseRegistrationDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateDatabaseRegistrationRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateDatabaseRegistrationRequest
         */
        public UpdateDatabaseRegistrationRequest build() {
            UpdateDatabaseRegistrationRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.goldengate.model.UpdateDatabaseRegistrationDetails body) {
            updateDatabaseRegistrationDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateDatabaseRegistrationRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateDatabaseRegistrationRequest
         */
        public UpdateDatabaseRegistrationRequest buildWithoutInvocationCallback() {
            UpdateDatabaseRegistrationRequest request = new UpdateDatabaseRegistrationRequest();
            request.databaseRegistrationId = databaseRegistrationId;
            request.updateDatabaseRegistrationDetails = updateDatabaseRegistrationDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateDatabaseRegistrationRequest(databaseRegistrationId, updateDatabaseRegistrationDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .databaseRegistrationId(databaseRegistrationId)
                .updateDatabaseRegistrationDetails(updateDatabaseRegistrationDetails)
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
        sb.append(",databaseRegistrationId=").append(String.valueOf(this.databaseRegistrationId));
        sb.append(",updateDatabaseRegistrationDetails=")
                .append(String.valueOf(this.updateDatabaseRegistrationDetails));
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
        if (!(o instanceof UpdateDatabaseRegistrationRequest)) {
            return false;
        }

        UpdateDatabaseRegistrationRequest other = (UpdateDatabaseRegistrationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.databaseRegistrationId, other.databaseRegistrationId)
                && java.util.Objects.equals(
                        this.updateDatabaseRegistrationDetails,
                        other.updateDatabaseRegistrationDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.databaseRegistrationId == null
                                ? 43
                                : this.databaseRegistrationId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateDatabaseRegistrationDetails == null
                                ? 43
                                : this.updateDatabaseRegistrationDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
