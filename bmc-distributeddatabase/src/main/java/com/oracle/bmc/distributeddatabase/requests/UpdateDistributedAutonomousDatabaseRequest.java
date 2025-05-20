/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase.requests;

import com.oracle.bmc.distributeddatabase.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/distributeddatabase/UpdateDistributedAutonomousDatabaseExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateDistributedAutonomousDatabaseRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
public class UpdateDistributedAutonomousDatabaseRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.distributeddatabase.model
                        .UpdateDistributedAutonomousDatabaseDetails> {

    /** Globally distributed autonomous database identifier */
    private String distributedAutonomousDatabaseId;

    /** Globally distributed autonomous database identifier */
    public String getDistributedAutonomousDatabaseId() {
        return distributedAutonomousDatabaseId;
    }
    /** The configuration of the Globally distributed autonomous database to be updated. */
    private com.oracle.bmc.distributeddatabase.model.UpdateDistributedAutonomousDatabaseDetails
            updateDistributedAutonomousDatabaseDetails;

    /** The configuration of the Globally distributed autonomous database to be updated. */
    public com.oracle.bmc.distributeddatabase.model.UpdateDistributedAutonomousDatabaseDetails
            getUpdateDistributedAutonomousDatabaseDetails() {
        return updateDistributedAutonomousDatabaseDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
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
    public com.oracle.bmc.distributeddatabase.model.UpdateDistributedAutonomousDatabaseDetails
            getBody$() {
        return updateDistributedAutonomousDatabaseDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateDistributedAutonomousDatabaseRequest,
                    com.oracle.bmc.distributeddatabase.model
                            .UpdateDistributedAutonomousDatabaseDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Globally distributed autonomous database identifier */
        private String distributedAutonomousDatabaseId = null;

        /**
         * Globally distributed autonomous database identifier
         *
         * @param distributedAutonomousDatabaseId the value to set
         * @return this builder instance
         */
        public Builder distributedAutonomousDatabaseId(String distributedAutonomousDatabaseId) {
            this.distributedAutonomousDatabaseId = distributedAutonomousDatabaseId;
            return this;
        }

        /** The configuration of the Globally distributed autonomous database to be updated. */
        private com.oracle.bmc.distributeddatabase.model.UpdateDistributedAutonomousDatabaseDetails
                updateDistributedAutonomousDatabaseDetails = null;

        /**
         * The configuration of the Globally distributed autonomous database to be updated.
         *
         * @param updateDistributedAutonomousDatabaseDetails the value to set
         * @return this builder instance
         */
        public Builder updateDistributedAutonomousDatabaseDetails(
                com.oracle.bmc.distributeddatabase.model.UpdateDistributedAutonomousDatabaseDetails
                        updateDistributedAutonomousDatabaseDetails) {
            this.updateDistributedAutonomousDatabaseDetails =
                    updateDistributedAutonomousDatabaseDetails;
            return this;
        }

        /** The client request ID for tracing. */
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
        public Builder copy(UpdateDistributedAutonomousDatabaseRequest o) {
            distributedAutonomousDatabaseId(o.getDistributedAutonomousDatabaseId());
            updateDistributedAutonomousDatabaseDetails(
                    o.getUpdateDistributedAutonomousDatabaseDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateDistributedAutonomousDatabaseRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateDistributedAutonomousDatabaseRequest
         */
        public UpdateDistributedAutonomousDatabaseRequest build() {
            UpdateDistributedAutonomousDatabaseRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.distributeddatabase.model.UpdateDistributedAutonomousDatabaseDetails
                        body) {
            updateDistributedAutonomousDatabaseDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateDistributedAutonomousDatabaseRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateDistributedAutonomousDatabaseRequest
         */
        public UpdateDistributedAutonomousDatabaseRequest buildWithoutInvocationCallback() {
            UpdateDistributedAutonomousDatabaseRequest request =
                    new UpdateDistributedAutonomousDatabaseRequest();
            request.distributedAutonomousDatabaseId = distributedAutonomousDatabaseId;
            request.updateDistributedAutonomousDatabaseDetails =
                    updateDistributedAutonomousDatabaseDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateDistributedAutonomousDatabaseRequest(distributedAutonomousDatabaseId,
            // updateDistributedAutonomousDatabaseDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .distributedAutonomousDatabaseId(distributedAutonomousDatabaseId)
                .updateDistributedAutonomousDatabaseDetails(
                        updateDistributedAutonomousDatabaseDetails)
                .opcRequestId(opcRequestId)
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
        sb.append(",distributedAutonomousDatabaseId=")
                .append(String.valueOf(this.distributedAutonomousDatabaseId));
        sb.append(",updateDistributedAutonomousDatabaseDetails=")
                .append(String.valueOf(this.updateDistributedAutonomousDatabaseDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDistributedAutonomousDatabaseRequest)) {
            return false;
        }

        UpdateDistributedAutonomousDatabaseRequest other =
                (UpdateDistributedAutonomousDatabaseRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.distributedAutonomousDatabaseId, other.distributedAutonomousDatabaseId)
                && java.util.Objects.equals(
                        this.updateDistributedAutonomousDatabaseDetails,
                        other.updateDistributedAutonomousDatabaseDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.distributedAutonomousDatabaseId == null
                                ? 43
                                : this.distributedAutonomousDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateDistributedAutonomousDatabaseDetails == null
                                ? 43
                                : this.updateDistributedAutonomousDatabaseDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
