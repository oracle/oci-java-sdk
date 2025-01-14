/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/UpdateCatalogPrivateEndpointExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateCatalogPrivateEndpointRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class UpdateCatalogPrivateEndpointRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datacatalog.model.UpdateCatalogPrivateEndpointDetails> {

    /** Unique private reverse connection identifier. */
    private String catalogPrivateEndpointId;

    /** Unique private reverse connection identifier. */
    public String getCatalogPrivateEndpointId() {
        return catalogPrivateEndpointId;
    }
    /** The information to be updated in private reverse connection */
    private com.oracle.bmc.datacatalog.model.UpdateCatalogPrivateEndpointDetails
            updateCatalogPrivateEndpointDetails;

    /** The information to be updated in private reverse connection */
    public com.oracle.bmc.datacatalog.model.UpdateCatalogPrivateEndpointDetails
            getUpdateCatalogPrivateEndpointDetails() {
        return updateCatalogPrivateEndpointDetails;
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
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** Whether to override locks (if any exist). */
    private Boolean isLockOverride;

    /** Whether to override locks (if any exist). */
    public Boolean getIsLockOverride() {
        return isLockOverride;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.datacatalog.model.UpdateCatalogPrivateEndpointDetails getBody$() {
        return updateCatalogPrivateEndpointDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateCatalogPrivateEndpointRequest,
                    com.oracle.bmc.datacatalog.model.UpdateCatalogPrivateEndpointDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique private reverse connection identifier. */
        private String catalogPrivateEndpointId = null;

        /**
         * Unique private reverse connection identifier.
         *
         * @param catalogPrivateEndpointId the value to set
         * @return this builder instance
         */
        public Builder catalogPrivateEndpointId(String catalogPrivateEndpointId) {
            this.catalogPrivateEndpointId = catalogPrivateEndpointId;
            return this;
        }

        /** The information to be updated in private reverse connection */
        private com.oracle.bmc.datacatalog.model.UpdateCatalogPrivateEndpointDetails
                updateCatalogPrivateEndpointDetails = null;

        /**
         * The information to be updated in private reverse connection
         *
         * @param updateCatalogPrivateEndpointDetails the value to set
         * @return this builder instance
         */
        public Builder updateCatalogPrivateEndpointDetails(
                com.oracle.bmc.datacatalog.model.UpdateCatalogPrivateEndpointDetails
                        updateCatalogPrivateEndpointDetails) {
            this.updateCatalogPrivateEndpointDetails = updateCatalogPrivateEndpointDetails;
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

        /** Whether to override locks (if any exist). */
        private Boolean isLockOverride = null;

        /**
         * Whether to override locks (if any exist).
         *
         * @param isLockOverride the value to set
         * @return this builder instance
         */
        public Builder isLockOverride(Boolean isLockOverride) {
            this.isLockOverride = isLockOverride;
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
        public Builder copy(UpdateCatalogPrivateEndpointRequest o) {
            catalogPrivateEndpointId(o.getCatalogPrivateEndpointId());
            updateCatalogPrivateEndpointDetails(o.getUpdateCatalogPrivateEndpointDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            isLockOverride(o.getIsLockOverride());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateCatalogPrivateEndpointRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateCatalogPrivateEndpointRequest
         */
        public UpdateCatalogPrivateEndpointRequest build() {
            UpdateCatalogPrivateEndpointRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.datacatalog.model.UpdateCatalogPrivateEndpointDetails body) {
            updateCatalogPrivateEndpointDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateCatalogPrivateEndpointRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateCatalogPrivateEndpointRequest
         */
        public UpdateCatalogPrivateEndpointRequest buildWithoutInvocationCallback() {
            UpdateCatalogPrivateEndpointRequest request = new UpdateCatalogPrivateEndpointRequest();
            request.catalogPrivateEndpointId = catalogPrivateEndpointId;
            request.updateCatalogPrivateEndpointDetails = updateCatalogPrivateEndpointDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.isLockOverride = isLockOverride;
            return request;
            // new UpdateCatalogPrivateEndpointRequest(catalogPrivateEndpointId,
            // updateCatalogPrivateEndpointDetails, ifMatch, opcRequestId, isLockOverride);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .catalogPrivateEndpointId(catalogPrivateEndpointId)
                .updateCatalogPrivateEndpointDetails(updateCatalogPrivateEndpointDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .isLockOverride(isLockOverride);
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
        sb.append(",catalogPrivateEndpointId=")
                .append(String.valueOf(this.catalogPrivateEndpointId));
        sb.append(",updateCatalogPrivateEndpointDetails=")
                .append(String.valueOf(this.updateCatalogPrivateEndpointDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",isLockOverride=").append(String.valueOf(this.isLockOverride));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateCatalogPrivateEndpointRequest)) {
            return false;
        }

        UpdateCatalogPrivateEndpointRequest other = (UpdateCatalogPrivateEndpointRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.catalogPrivateEndpointId, other.catalogPrivateEndpointId)
                && java.util.Objects.equals(
                        this.updateCatalogPrivateEndpointDetails,
                        other.updateCatalogPrivateEndpointDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.isLockOverride, other.isLockOverride);
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
                        + (this.updateCatalogPrivateEndpointDetails == null
                                ? 43
                                : this.updateCatalogPrivateEndpointDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.isLockOverride == null ? 43 : this.isLockOverride.hashCode());
        return result;
    }
}
