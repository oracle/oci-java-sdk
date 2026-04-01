/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateAdvancedClusterFileSystemExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateAdvancedClusterFileSystemRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateAdvancedClusterFileSystemRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.UpdateAdvancedClusterFileSystemDetails> {

    /**
     * The advanced cluster file system Id [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String advancedClusterFileSystemId;

    /**
     * The advanced cluster file system Id [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getAdvancedClusterFileSystemId() {
        return advancedClusterFileSystemId;
    }
    /**
     * Request to update the properties of an advanced cluster file system.
     */
    private com.oracle.bmc.database.model.UpdateAdvancedClusterFileSystemDetails
            updateAdvancedClusterFileSystemDetails;

    /**
     * Request to update the properties of an advanced cluster file system.
     */
    public com.oracle.bmc.database.model.UpdateAdvancedClusterFileSystemDetails
            getUpdateAdvancedClusterFileSystemDetails() {
        return updateAdvancedClusterFileSystemDetails;
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
    public com.oracle.bmc.database.model.UpdateAdvancedClusterFileSystemDetails getBody$() {
        return updateAdvancedClusterFileSystemDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateAdvancedClusterFileSystemRequest,
                    com.oracle.bmc.database.model.UpdateAdvancedClusterFileSystemDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The advanced cluster file system Id [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String advancedClusterFileSystemId = null;

        /**
         * The advanced cluster file system Id [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * @param advancedClusterFileSystemId the value to set
         * @return this builder instance
         */
        public Builder advancedClusterFileSystemId(String advancedClusterFileSystemId) {
            this.advancedClusterFileSystemId = advancedClusterFileSystemId;
            return this;
        }

        /**
         * Request to update the properties of an advanced cluster file system.
         */
        private com.oracle.bmc.database.model.UpdateAdvancedClusterFileSystemDetails
                updateAdvancedClusterFileSystemDetails = null;

        /**
         * Request to update the properties of an advanced cluster file system.
         * @param updateAdvancedClusterFileSystemDetails the value to set
         * @return this builder instance
         */
        public Builder updateAdvancedClusterFileSystemDetails(
                com.oracle.bmc.database.model.UpdateAdvancedClusterFileSystemDetails
                        updateAdvancedClusterFileSystemDetails) {
            this.updateAdvancedClusterFileSystemDetails = updateAdvancedClusterFileSystemDetails;
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
        public Builder copy(UpdateAdvancedClusterFileSystemRequest o) {
            advancedClusterFileSystemId(o.getAdvancedClusterFileSystemId());
            updateAdvancedClusterFileSystemDetails(o.getUpdateAdvancedClusterFileSystemDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateAdvancedClusterFileSystemRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateAdvancedClusterFileSystemRequest
         */
        public UpdateAdvancedClusterFileSystemRequest build() {
            UpdateAdvancedClusterFileSystemRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.database.model.UpdateAdvancedClusterFileSystemDetails body) {
            updateAdvancedClusterFileSystemDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateAdvancedClusterFileSystemRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateAdvancedClusterFileSystemRequest
         */
        public UpdateAdvancedClusterFileSystemRequest buildWithoutInvocationCallback() {
            UpdateAdvancedClusterFileSystemRequest request =
                    new UpdateAdvancedClusterFileSystemRequest();
            request.advancedClusterFileSystemId = advancedClusterFileSystemId;
            request.updateAdvancedClusterFileSystemDetails = updateAdvancedClusterFileSystemDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateAdvancedClusterFileSystemRequest(advancedClusterFileSystemId, updateAdvancedClusterFileSystemDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .advancedClusterFileSystemId(advancedClusterFileSystemId)
                .updateAdvancedClusterFileSystemDetails(updateAdvancedClusterFileSystemDetails)
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
        sb.append(",advancedClusterFileSystemId=")
                .append(String.valueOf(this.advancedClusterFileSystemId));
        sb.append(",updateAdvancedClusterFileSystemDetails=")
                .append(String.valueOf(this.updateAdvancedClusterFileSystemDetails));
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
        if (!(o instanceof UpdateAdvancedClusterFileSystemRequest)) {
            return false;
        }

        UpdateAdvancedClusterFileSystemRequest other = (UpdateAdvancedClusterFileSystemRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.advancedClusterFileSystemId, other.advancedClusterFileSystemId)
                && java.util.Objects.equals(
                        this.updateAdvancedClusterFileSystemDetails,
                        other.updateAdvancedClusterFileSystemDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.advancedClusterFileSystemId == null
                                ? 43
                                : this.advancedClusterFileSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateAdvancedClusterFileSystemDetails == null
                                ? 43
                                : this.updateAdvancedClusterFileSystemDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
