/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/AddCatalogPrivateEndpointLockExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use AddCatalogPrivateEndpointLockRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class AddCatalogPrivateEndpointLockRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datacatalog.model.AddResourceLockDetails> {

    /**
     * Unique private reverse connection identifier.
     */
    private String catalogPrivateEndpointId;

    /**
     * Unique private reverse connection identifier.
     */
    public String getCatalogPrivateEndpointId() {
        return catalogPrivateEndpointId;
    }
    /**
     * AddResourceLockDetails body parameter
     */
    private com.oracle.bmc.datacatalog.model.AddResourceLockDetails addResourceLockDetails;

    /**
     * AddResourceLockDetails body parameter
     */
    public com.oracle.bmc.datacatalog.model.AddResourceLockDetails getAddResourceLockDetails() {
        return addResourceLockDetails;
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
    public com.oracle.bmc.datacatalog.model.AddResourceLockDetails getBody$() {
        return addResourceLockDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    AddCatalogPrivateEndpointLockRequest,
                    com.oracle.bmc.datacatalog.model.AddResourceLockDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique private reverse connection identifier.
         */
        private String catalogPrivateEndpointId = null;

        /**
         * Unique private reverse connection identifier.
         * @param catalogPrivateEndpointId the value to set
         * @return this builder instance
         */
        public Builder catalogPrivateEndpointId(String catalogPrivateEndpointId) {
            this.catalogPrivateEndpointId = catalogPrivateEndpointId;
            return this;
        }

        /**
         * AddResourceLockDetails body parameter
         */
        private com.oracle.bmc.datacatalog.model.AddResourceLockDetails addResourceLockDetails =
                null;

        /**
         * AddResourceLockDetails body parameter
         * @param addResourceLockDetails the value to set
         * @return this builder instance
         */
        public Builder addResourceLockDetails(
                com.oracle.bmc.datacatalog.model.AddResourceLockDetails addResourceLockDetails) {
            this.addResourceLockDetails = addResourceLockDetails;
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
        public Builder copy(AddCatalogPrivateEndpointLockRequest o) {
            catalogPrivateEndpointId(o.getCatalogPrivateEndpointId());
            addResourceLockDetails(o.getAddResourceLockDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of AddCatalogPrivateEndpointLockRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of AddCatalogPrivateEndpointLockRequest
         */
        public AddCatalogPrivateEndpointLockRequest build() {
            AddCatalogPrivateEndpointLockRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datacatalog.model.AddResourceLockDetails body) {
            addResourceLockDetails(body);
            return this;
        }

        /**
         * Build the instance of AddCatalogPrivateEndpointLockRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of AddCatalogPrivateEndpointLockRequest
         */
        public AddCatalogPrivateEndpointLockRequest buildWithoutInvocationCallback() {
            AddCatalogPrivateEndpointLockRequest request =
                    new AddCatalogPrivateEndpointLockRequest();
            request.catalogPrivateEndpointId = catalogPrivateEndpointId;
            request.addResourceLockDetails = addResourceLockDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new AddCatalogPrivateEndpointLockRequest(catalogPrivateEndpointId, addResourceLockDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .catalogPrivateEndpointId(catalogPrivateEndpointId)
                .addResourceLockDetails(addResourceLockDetails)
                .opcRequestId(opcRequestId)
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
        sb.append(",catalogPrivateEndpointId=")
                .append(String.valueOf(this.catalogPrivateEndpointId));
        sb.append(",addResourceLockDetails=").append(String.valueOf(this.addResourceLockDetails));
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
        if (!(o instanceof AddCatalogPrivateEndpointLockRequest)) {
            return false;
        }

        AddCatalogPrivateEndpointLockRequest other = (AddCatalogPrivateEndpointLockRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.catalogPrivateEndpointId, other.catalogPrivateEndpointId)
                && java.util.Objects.equals(
                        this.addResourceLockDetails, other.addResourceLockDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.catalogPrivateEndpointId == null
                                ? 43
                                : this.catalogPrivateEndpointId.hashCode());
        result =
                (result * PRIME)
                        + (this.addResourceLockDetails == null
                                ? 43
                                : this.addResourceLockDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
