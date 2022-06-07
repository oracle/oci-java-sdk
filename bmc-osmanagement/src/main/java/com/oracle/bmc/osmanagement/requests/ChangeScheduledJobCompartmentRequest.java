/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.requests;

import com.oracle.bmc.osmanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ChangeScheduledJobCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeScheduledJobCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
public class ChangeScheduledJobCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.osmanagement.model.ChangeScheduledJobCompartmentDetails> {

    /**
     * The ID of the scheduled job.
     */
    private String scheduledJobId;

    public String getScheduledJobId() {
        return scheduledJobId;
    }
    /**
     * OCID for the compartment to which the resource will be moved.
     */
    private com.oracle.bmc.osmanagement.model.ChangeScheduledJobCompartmentDetails
            changeScheduledJobCompartmentDetails;

    public com.oracle.bmc.osmanagement.model.ChangeScheduledJobCompartmentDetails
            getChangeScheduledJobCompartmentDetails() {
        return changeScheduledJobCompartmentDetails;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
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

    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.osmanagement.model.ChangeScheduledJobCompartmentDetails getBody$() {
        return changeScheduledJobCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeScheduledJobCompartmentRequest,
                    com.oracle.bmc.osmanagement.model.ChangeScheduledJobCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String scheduledJobId = null;

        /**
         * The ID of the scheduled job.
         * @return this builder instance
         */
        public Builder scheduledJobId(String scheduledJobId) {
            this.scheduledJobId = scheduledJobId;
            return this;
        }

        private com.oracle.bmc.osmanagement.model.ChangeScheduledJobCompartmentDetails
                changeScheduledJobCompartmentDetails = null;

        /**
         * OCID for the compartment to which the resource will be moved.
         * @return this builder instance
         */
        public Builder changeScheduledJobCompartmentDetails(
                com.oracle.bmc.osmanagement.model.ChangeScheduledJobCompartmentDetails
                        changeScheduledJobCompartmentDetails) {
            this.changeScheduledJobCompartmentDetails = changeScheduledJobCompartmentDetails;
            return this;
        }

        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(ChangeScheduledJobCompartmentRequest o) {
            scheduledJobId(o.getScheduledJobId());
            changeScheduledJobCompartmentDetails(o.getChangeScheduledJobCompartmentDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeScheduledJobCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeScheduledJobCompartmentRequest
         */
        public ChangeScheduledJobCompartmentRequest build() {
            ChangeScheduledJobCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.osmanagement.model.ChangeScheduledJobCompartmentDetails body) {
            changeScheduledJobCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeScheduledJobCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeScheduledJobCompartmentRequest
         */
        public ChangeScheduledJobCompartmentRequest buildWithoutInvocationCallback() {
            ChangeScheduledJobCompartmentRequest request =
                    new ChangeScheduledJobCompartmentRequest();
            request.scheduledJobId = scheduledJobId;
            request.changeScheduledJobCompartmentDetails = changeScheduledJobCompartmentDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeScheduledJobCompartmentRequest(scheduledJobId, changeScheduledJobCompartmentDetails, opcRequestId, ifMatch, opcRetryToken);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .scheduledJobId(scheduledJobId)
                .changeScheduledJobCompartmentDetails(changeScheduledJobCompartmentDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch)
                .opcRetryToken(opcRetryToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",scheduledJobId=").append(String.valueOf(this.scheduledJobId));
        sb.append(",changeScheduledJobCompartmentDetails=")
                .append(String.valueOf(this.changeScheduledJobCompartmentDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeScheduledJobCompartmentRequest)) {
            return false;
        }

        ChangeScheduledJobCompartmentRequest other = (ChangeScheduledJobCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.scheduledJobId, other.scheduledJobId)
                && java.util.Objects.equals(
                        this.changeScheduledJobCompartmentDetails,
                        other.changeScheduledJobCompartmentDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.scheduledJobId == null ? 43 : this.scheduledJobId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeScheduledJobCompartmentDetails == null
                                ? 43
                                : this.changeScheduledJobCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
