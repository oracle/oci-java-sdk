/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.requests;

import com.oracle.bmc.filestorage.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/ChangeReplicationCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeReplicationCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
public class ChangeReplicationCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.filestorage.model.ChangeReplicationCompartmentDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the replication.
     */
    private String replicationId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the replication.
     */
    public String getReplicationId() {
        return replicationId;
    }
    /**
     * Details for changing the compartment.
     */
    private com.oracle.bmc.filestorage.model.ChangeReplicationCompartmentDetails
            changeReplicationCompartmentDetails;

    /**
     * Details for changing the compartment.
     */
    public com.oracle.bmc.filestorage.model.ChangeReplicationCompartmentDetails
            getChangeReplicationCompartmentDetails() {
        return changeReplicationCompartmentDetails;
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
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
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
    public com.oracle.bmc.filestorage.model.ChangeReplicationCompartmentDetails getBody$() {
        return changeReplicationCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeReplicationCompartmentRequest,
                    com.oracle.bmc.filestorage.model.ChangeReplicationCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the replication.
         */
        private String replicationId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the replication.
         * @param replicationId the value to set
         * @return this builder instance
         */
        public Builder replicationId(String replicationId) {
            this.replicationId = replicationId;
            return this;
        }

        /**
         * Details for changing the compartment.
         */
        private com.oracle.bmc.filestorage.model.ChangeReplicationCompartmentDetails
                changeReplicationCompartmentDetails = null;

        /**
         * Details for changing the compartment.
         * @param changeReplicationCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeReplicationCompartmentDetails(
                com.oracle.bmc.filestorage.model.ChangeReplicationCompartmentDetails
                        changeReplicationCompartmentDetails) {
            this.changeReplicationCompartmentDetails = changeReplicationCompartmentDetails;
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
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
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
        public Builder copy(ChangeReplicationCompartmentRequest o) {
            replicationId(o.getReplicationId());
            changeReplicationCompartmentDetails(o.getChangeReplicationCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeReplicationCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeReplicationCompartmentRequest
         */
        public ChangeReplicationCompartmentRequest build() {
            ChangeReplicationCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.filestorage.model.ChangeReplicationCompartmentDetails body) {
            changeReplicationCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeReplicationCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeReplicationCompartmentRequest
         */
        public ChangeReplicationCompartmentRequest buildWithoutInvocationCallback() {
            ChangeReplicationCompartmentRequest request = new ChangeReplicationCompartmentRequest();
            request.replicationId = replicationId;
            request.changeReplicationCompartmentDetails = changeReplicationCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeReplicationCompartmentRequest(replicationId, changeReplicationCompartmentDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .replicationId(replicationId)
                .changeReplicationCompartmentDetails(changeReplicationCompartmentDetails)
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
        sb.append(",replicationId=").append(String.valueOf(this.replicationId));
        sb.append(",changeReplicationCompartmentDetails=")
                .append(String.valueOf(this.changeReplicationCompartmentDetails));
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
        if (!(o instanceof ChangeReplicationCompartmentRequest)) {
            return false;
        }

        ChangeReplicationCompartmentRequest other = (ChangeReplicationCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.replicationId, other.replicationId)
                && java.util.Objects.equals(
                        this.changeReplicationCompartmentDetails,
                        other.changeReplicationCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.replicationId == null ? 43 : this.replicationId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeReplicationCompartmentDetails == null
                                ? 43
                                : this.changeReplicationCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
