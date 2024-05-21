/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateDbNodeExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateDbNodeRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateDbNodeRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.UpdateDbNodeDetails> {

    /**
     * The database node [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String dbNodeId;

    /**
     * The database node [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getDbNodeId() {
        return dbNodeId;
    }
    /**
     * Request to update the specified database node.
     */
    private com.oracle.bmc.database.model.UpdateDbNodeDetails updateDbNodeDetails;

    /**
     * Request to update the specified database node.
     */
    public com.oracle.bmc.database.model.UpdateDbNodeDetails getUpdateDbNodeDetails() {
        return updateDbNodeDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique identifier for the request.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
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
    public com.oracle.bmc.database.model.UpdateDbNodeDetails getBody$() {
        return updateDbNodeDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateDbNodeRequest, com.oracle.bmc.database.model.UpdateDbNodeDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The database node [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String dbNodeId = null;

        /**
         * The database node [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param dbNodeId the value to set
         * @return this builder instance
         */
        public Builder dbNodeId(String dbNodeId) {
            this.dbNodeId = dbNodeId;
            return this;
        }

        /**
         * Request to update the specified database node.
         */
        private com.oracle.bmc.database.model.UpdateDbNodeDetails updateDbNodeDetails = null;

        /**
         * Request to update the specified database node.
         * @param updateDbNodeDetails the value to set
         * @return this builder instance
         */
        public Builder updateDbNodeDetails(
                com.oracle.bmc.database.model.UpdateDbNodeDetails updateDbNodeDetails) {
            this.updateDbNodeDetails = updateDbNodeDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
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
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(UpdateDbNodeRequest o) {
            dbNodeId(o.getDbNodeId());
            updateDbNodeDetails(o.getUpdateDbNodeDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateDbNodeRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateDbNodeRequest
         */
        public UpdateDbNodeRequest build() {
            UpdateDbNodeRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.database.model.UpdateDbNodeDetails body) {
            updateDbNodeDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateDbNodeRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateDbNodeRequest
         */
        public UpdateDbNodeRequest buildWithoutInvocationCallback() {
            UpdateDbNodeRequest request = new UpdateDbNodeRequest();
            request.dbNodeId = dbNodeId;
            request.updateDbNodeDetails = updateDbNodeDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateDbNodeRequest(dbNodeId, updateDbNodeDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .dbNodeId(dbNodeId)
                .updateDbNodeDetails(updateDbNodeDetails)
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
        sb.append(",dbNodeId=").append(String.valueOf(this.dbNodeId));
        sb.append(",updateDbNodeDetails=").append(String.valueOf(this.updateDbNodeDetails));
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
        if (!(o instanceof UpdateDbNodeRequest)) {
            return false;
        }

        UpdateDbNodeRequest other = (UpdateDbNodeRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.dbNodeId, other.dbNodeId)
                && java.util.Objects.equals(this.updateDbNodeDetails, other.updateDbNodeDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dbNodeId == null ? 43 : this.dbNodeId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateDbNodeDetails == null
                                ? 43
                                : this.updateDbNodeDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
