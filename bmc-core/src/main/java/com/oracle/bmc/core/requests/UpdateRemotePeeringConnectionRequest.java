/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateRemotePeeringConnectionExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateRemotePeeringConnectionRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateRemotePeeringConnectionRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.UpdateRemotePeeringConnectionDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the remote peering connection (RPC).
     */
    private String remotePeeringConnectionId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the remote peering connection (RPC).
     */
    public String getRemotePeeringConnectionId() {
        return remotePeeringConnectionId;
    }
    /**
     * Request to the update the peering connection to remote region
     */
    private com.oracle.bmc.core.model.UpdateRemotePeeringConnectionDetails
            updateRemotePeeringConnectionDetails;

    /**
     * Request to the update the peering connection to remote region
     */
    public com.oracle.bmc.core.model.UpdateRemotePeeringConnectionDetails
            getUpdateRemotePeeringConnectionDetails() {
        return updateRemotePeeringConnectionDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource. The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource. The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.UpdateRemotePeeringConnectionDetails getBody$() {
        return updateRemotePeeringConnectionDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateRemotePeeringConnectionRequest,
                    com.oracle.bmc.core.model.UpdateRemotePeeringConnectionDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the remote peering connection (RPC).
         */
        private String remotePeeringConnectionId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the remote peering connection (RPC).
         * @param remotePeeringConnectionId the value to set
         * @return this builder instance
         */
        public Builder remotePeeringConnectionId(String remotePeeringConnectionId) {
            this.remotePeeringConnectionId = remotePeeringConnectionId;
            return this;
        }

        /**
         * Request to the update the peering connection to remote region
         */
        private com.oracle.bmc.core.model.UpdateRemotePeeringConnectionDetails
                updateRemotePeeringConnectionDetails = null;

        /**
         * Request to the update the peering connection to remote region
         * @param updateRemotePeeringConnectionDetails the value to set
         * @return this builder instance
         */
        public Builder updateRemotePeeringConnectionDetails(
                com.oracle.bmc.core.model.UpdateRemotePeeringConnectionDetails
                        updateRemotePeeringConnectionDetails) {
            this.updateRemotePeeringConnectionDetails = updateRemotePeeringConnectionDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource. The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource. The resource
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
        public Builder copy(UpdateRemotePeeringConnectionRequest o) {
            remotePeeringConnectionId(o.getRemotePeeringConnectionId());
            updateRemotePeeringConnectionDetails(o.getUpdateRemotePeeringConnectionDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateRemotePeeringConnectionRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateRemotePeeringConnectionRequest
         */
        public UpdateRemotePeeringConnectionRequest build() {
            UpdateRemotePeeringConnectionRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.UpdateRemotePeeringConnectionDetails body) {
            updateRemotePeeringConnectionDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateRemotePeeringConnectionRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateRemotePeeringConnectionRequest
         */
        public UpdateRemotePeeringConnectionRequest buildWithoutInvocationCallback() {
            UpdateRemotePeeringConnectionRequest request =
                    new UpdateRemotePeeringConnectionRequest();
            request.remotePeeringConnectionId = remotePeeringConnectionId;
            request.updateRemotePeeringConnectionDetails = updateRemotePeeringConnectionDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateRemotePeeringConnectionRequest(remotePeeringConnectionId, updateRemotePeeringConnectionDetails, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .remotePeeringConnectionId(remotePeeringConnectionId)
                .updateRemotePeeringConnectionDetails(updateRemotePeeringConnectionDetails)
                .ifMatch(ifMatch);
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
        sb.append(",remotePeeringConnectionId=")
                .append(String.valueOf(this.remotePeeringConnectionId));
        sb.append(",updateRemotePeeringConnectionDetails=")
                .append(String.valueOf(this.updateRemotePeeringConnectionDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateRemotePeeringConnectionRequest)) {
            return false;
        }

        UpdateRemotePeeringConnectionRequest other = (UpdateRemotePeeringConnectionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.remotePeeringConnectionId, other.remotePeeringConnectionId)
                && java.util.Objects.equals(
                        this.updateRemotePeeringConnectionDetails,
                        other.updateRemotePeeringConnectionDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.remotePeeringConnectionId == null
                                ? 43
                                : this.remotePeeringConnectionId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateRemotePeeringConnectionDetails == null
                                ? 43
                                : this.updateRemotePeeringConnectionDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
