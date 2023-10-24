/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.requests;

import com.oracle.bmc.databasetools.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/RemoveDatabaseToolsPrivateEndpointLockExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * RemoveDatabaseToolsPrivateEndpointLockRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
public class RemoveDatabaseToolsPrivateEndpointLockRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasetools.model.RemoveResourceLockDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a
     * Database Tools private endpoint.
     */
    private String databaseToolsPrivateEndpointId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a
     * Database Tools private endpoint.
     */
    public String getDatabaseToolsPrivateEndpointId() {
        return databaseToolsPrivateEndpointId;
    }
    /** RemoveResourceLockDetails body parameter */
    private com.oracle.bmc.databasetools.model.RemoveResourceLockDetails removeResourceLockDetails;

    /** RemoveResourceLockDetails body parameter */
    public com.oracle.bmc.databasetools.model.RemoveResourceLockDetails
            getRemoveResourceLockDetails() {
        return removeResourceLockDetails;
    }
    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
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
    public com.oracle.bmc.databasetools.model.RemoveResourceLockDetails getBody$() {
        return removeResourceLockDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RemoveDatabaseToolsPrivateEndpointLockRequest,
                    com.oracle.bmc.databasetools.model.RemoveResourceLockDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a
         * Database Tools private endpoint.
         */
        private String databaseToolsPrivateEndpointId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a
         * Database Tools private endpoint.
         *
         * @param databaseToolsPrivateEndpointId the value to set
         * @return this builder instance
         */
        public Builder databaseToolsPrivateEndpointId(String databaseToolsPrivateEndpointId) {
            this.databaseToolsPrivateEndpointId = databaseToolsPrivateEndpointId;
            return this;
        }

        /** RemoveResourceLockDetails body parameter */
        private com.oracle.bmc.databasetools.model.RemoveResourceLockDetails
                removeResourceLockDetails = null;

        /**
         * RemoveResourceLockDetails body parameter
         *
         * @param removeResourceLockDetails the value to set
         * @return this builder instance
         */
        public Builder removeResourceLockDetails(
                com.oracle.bmc.databasetools.model.RemoveResourceLockDetails
                        removeResourceLockDetails) {
            this.removeResourceLockDetails = removeResourceLockDetails;
            return this;
        }

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
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
        public Builder copy(RemoveDatabaseToolsPrivateEndpointLockRequest o) {
            databaseToolsPrivateEndpointId(o.getDatabaseToolsPrivateEndpointId());
            removeResourceLockDetails(o.getRemoveResourceLockDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RemoveDatabaseToolsPrivateEndpointLockRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of RemoveDatabaseToolsPrivateEndpointLockRequest
         */
        public RemoveDatabaseToolsPrivateEndpointLockRequest build() {
            RemoveDatabaseToolsPrivateEndpointLockRequest request =
                    buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.databasetools.model.RemoveResourceLockDetails body) {
            removeResourceLockDetails(body);
            return this;
        }

        /**
         * Build the instance of RemoveDatabaseToolsPrivateEndpointLockRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RemoveDatabaseToolsPrivateEndpointLockRequest
         */
        public RemoveDatabaseToolsPrivateEndpointLockRequest buildWithoutInvocationCallback() {
            RemoveDatabaseToolsPrivateEndpointLockRequest request =
                    new RemoveDatabaseToolsPrivateEndpointLockRequest();
            request.databaseToolsPrivateEndpointId = databaseToolsPrivateEndpointId;
            request.removeResourceLockDetails = removeResourceLockDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new RemoveDatabaseToolsPrivateEndpointLockRequest(databaseToolsPrivateEndpointId,
            // removeResourceLockDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .databaseToolsPrivateEndpointId(databaseToolsPrivateEndpointId)
                .removeResourceLockDetails(removeResourceLockDetails)
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
        sb.append(",databaseToolsPrivateEndpointId=")
                .append(String.valueOf(this.databaseToolsPrivateEndpointId));
        sb.append(",removeResourceLockDetails=")
                .append(String.valueOf(this.removeResourceLockDetails));
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
        if (!(o instanceof RemoveDatabaseToolsPrivateEndpointLockRequest)) {
            return false;
        }

        RemoveDatabaseToolsPrivateEndpointLockRequest other =
                (RemoveDatabaseToolsPrivateEndpointLockRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.databaseToolsPrivateEndpointId, other.databaseToolsPrivateEndpointId)
                && java.util.Objects.equals(
                        this.removeResourceLockDetails, other.removeResourceLockDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.databaseToolsPrivateEndpointId == null
                                ? 43
                                : this.databaseToolsPrivateEndpointId.hashCode());
        result =
                (result * PRIME)
                        + (this.removeResourceLockDetails == null
                                ? 43
                                : this.removeResourceLockDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
