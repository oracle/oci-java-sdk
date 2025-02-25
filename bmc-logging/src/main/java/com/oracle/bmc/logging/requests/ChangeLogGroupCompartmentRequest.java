/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.requests;

import com.oracle.bmc.logging.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/logging/ChangeLogGroupCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeLogGroupCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
public class ChangeLogGroupCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.logging.model.ChangeLogGroupCompartmentDetails> {

    /**
     * OCID of a log group to work with.
     */
    private String logGroupId;

    /**
     * OCID of a log group to work with.
     */
    public String getLogGroupId() {
        return logGroupId;
    }
    /**
     * Request to change the compartment of a given resource.
     */
    private com.oracle.bmc.logging.model.ChangeLogGroupCompartmentDetails
            changeLogGroupCompartmentDetails;

    /**
     * Request to change the compartment of a given resource.
     */
    public com.oracle.bmc.logging.model.ChangeLogGroupCompartmentDetails
            getChangeLogGroupCompartmentDetails() {
        return changeLogGroupCompartmentDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a
     * resource, set the {@code if-match} parameter to the value of the etag from a
     * previous GET or POST response for that resource. The resource will be
     * updated or deleted only if the etag you provide matches the resource's
     * current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a
     * resource, set the {@code if-match} parameter to the value of the etag from a
     * previous GET or POST response for that resource. The resource will be
     * updated or deleted only if the etag you provide matches the resource's
     * current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
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
    public com.oracle.bmc.logging.model.ChangeLogGroupCompartmentDetails getBody$() {
        return changeLogGroupCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeLogGroupCompartmentRequest,
                    com.oracle.bmc.logging.model.ChangeLogGroupCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * OCID of a log group to work with.
         */
        private String logGroupId = null;

        /**
         * OCID of a log group to work with.
         * @param logGroupId the value to set
         * @return this builder instance
         */
        public Builder logGroupId(String logGroupId) {
            this.logGroupId = logGroupId;
            return this;
        }

        /**
         * Request to change the compartment of a given resource.
         */
        private com.oracle.bmc.logging.model.ChangeLogGroupCompartmentDetails
                changeLogGroupCompartmentDetails = null;

        /**
         * Request to change the compartment of a given resource.
         * @param changeLogGroupCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeLogGroupCompartmentDetails(
                com.oracle.bmc.logging.model.ChangeLogGroupCompartmentDetails
                        changeLogGroupCompartmentDetails) {
            this.changeLogGroupCompartmentDetails = changeLogGroupCompartmentDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a
         * resource, set the {@code if-match} parameter to the value of the etag from a
         * previous GET or POST response for that resource. The resource will be
         * updated or deleted only if the etag you provide matches the resource's
         * current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a
         * resource, set the {@code if-match} parameter to the value of the etag from a
         * previous GET or POST response for that resource. The resource will be
         * updated or deleted only if the etag you provide matches the resource's
         * current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the request ID.
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
        public Builder copy(ChangeLogGroupCompartmentRequest o) {
            logGroupId(o.getLogGroupId());
            changeLogGroupCompartmentDetails(o.getChangeLogGroupCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeLogGroupCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeLogGroupCompartmentRequest
         */
        public ChangeLogGroupCompartmentRequest build() {
            ChangeLogGroupCompartmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.logging.model.ChangeLogGroupCompartmentDetails body) {
            changeLogGroupCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeLogGroupCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeLogGroupCompartmentRequest
         */
        public ChangeLogGroupCompartmentRequest buildWithoutInvocationCallback() {
            ChangeLogGroupCompartmentRequest request = new ChangeLogGroupCompartmentRequest();
            request.logGroupId = logGroupId;
            request.changeLogGroupCompartmentDetails = changeLogGroupCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeLogGroupCompartmentRequest(logGroupId, changeLogGroupCompartmentDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .logGroupId(logGroupId)
                .changeLogGroupCompartmentDetails(changeLogGroupCompartmentDetails)
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
        sb.append(",logGroupId=").append(String.valueOf(this.logGroupId));
        sb.append(",changeLogGroupCompartmentDetails=")
                .append(String.valueOf(this.changeLogGroupCompartmentDetails));
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
        if (!(o instanceof ChangeLogGroupCompartmentRequest)) {
            return false;
        }

        ChangeLogGroupCompartmentRequest other = (ChangeLogGroupCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.logGroupId, other.logGroupId)
                && java.util.Objects.equals(
                        this.changeLogGroupCompartmentDetails,
                        other.changeLogGroupCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.logGroupId == null ? 43 : this.logGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeLogGroupCompartmentDetails == null
                                ? 43
                                : this.changeLogGroupCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
