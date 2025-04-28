/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ChangeCatalogPrivateEndpointCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeCatalogPrivateEndpointCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class ChangeCatalogPrivateEndpointCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datacatalog.model.ChangeCatalogPrivateEndpointCompartmentDetails> {

    /** Details for the target compartment. */
    private com.oracle.bmc.datacatalog.model.ChangeCatalogPrivateEndpointCompartmentDetails
            changeCatalogPrivateEndpointCompartmentDetails;

    /** Details for the target compartment. */
    public com.oracle.bmc.datacatalog.model.ChangeCatalogPrivateEndpointCompartmentDetails
            getChangeCatalogPrivateEndpointCompartmentDetails() {
        return changeCatalogPrivateEndpointCompartmentDetails;
    }
    /** Unique private reverse connection identifier. */
    private String catalogPrivateEndpointId;

    /** Unique private reverse connection identifier. */
    public String getCatalogPrivateEndpointId() {
        return catalogPrivateEndpointId;
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
    public com.oracle.bmc.datacatalog.model.ChangeCatalogPrivateEndpointCompartmentDetails
            getBody$() {
        return changeCatalogPrivateEndpointCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeCatalogPrivateEndpointCompartmentRequest,
                    com.oracle.bmc.datacatalog.model
                            .ChangeCatalogPrivateEndpointCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Details for the target compartment. */
        private com.oracle.bmc.datacatalog.model.ChangeCatalogPrivateEndpointCompartmentDetails
                changeCatalogPrivateEndpointCompartmentDetails = null;

        /**
         * Details for the target compartment.
         *
         * @param changeCatalogPrivateEndpointCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeCatalogPrivateEndpointCompartmentDetails(
                com.oracle.bmc.datacatalog.model.ChangeCatalogPrivateEndpointCompartmentDetails
                        changeCatalogPrivateEndpointCompartmentDetails) {
            this.changeCatalogPrivateEndpointCompartmentDetails =
                    changeCatalogPrivateEndpointCompartmentDetails;
            return this;
        }

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
        public Builder copy(ChangeCatalogPrivateEndpointCompartmentRequest o) {
            changeCatalogPrivateEndpointCompartmentDetails(
                    o.getChangeCatalogPrivateEndpointCompartmentDetails());
            catalogPrivateEndpointId(o.getCatalogPrivateEndpointId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            isLockOverride(o.getIsLockOverride());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeCatalogPrivateEndpointCompartmentRequest as configured by
         * this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeCatalogPrivateEndpointCompartmentRequest
         */
        public ChangeCatalogPrivateEndpointCompartmentRequest build() {
            ChangeCatalogPrivateEndpointCompartmentRequest request =
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
        public Builder body$(
                com.oracle.bmc.datacatalog.model.ChangeCatalogPrivateEndpointCompartmentDetails
                        body) {
            changeCatalogPrivateEndpointCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeCatalogPrivateEndpointCompartmentRequest as configured by
         * this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeCatalogPrivateEndpointCompartmentRequest
         */
        public ChangeCatalogPrivateEndpointCompartmentRequest buildWithoutInvocationCallback() {
            ChangeCatalogPrivateEndpointCompartmentRequest request =
                    new ChangeCatalogPrivateEndpointCompartmentRequest();
            request.changeCatalogPrivateEndpointCompartmentDetails =
                    changeCatalogPrivateEndpointCompartmentDetails;
            request.catalogPrivateEndpointId = catalogPrivateEndpointId;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.isLockOverride = isLockOverride;
            return request;
            // new
            // ChangeCatalogPrivateEndpointCompartmentRequest(changeCatalogPrivateEndpointCompartmentDetails, catalogPrivateEndpointId, ifMatch, opcRequestId, isLockOverride);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .changeCatalogPrivateEndpointCompartmentDetails(
                        changeCatalogPrivateEndpointCompartmentDetails)
                .catalogPrivateEndpointId(catalogPrivateEndpointId)
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
        sb.append(",changeCatalogPrivateEndpointCompartmentDetails=")
                .append(String.valueOf(this.changeCatalogPrivateEndpointCompartmentDetails));
        sb.append(",catalogPrivateEndpointId=")
                .append(String.valueOf(this.catalogPrivateEndpointId));
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
        if (!(o instanceof ChangeCatalogPrivateEndpointCompartmentRequest)) {
            return false;
        }

        ChangeCatalogPrivateEndpointCompartmentRequest other =
                (ChangeCatalogPrivateEndpointCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.changeCatalogPrivateEndpointCompartmentDetails,
                        other.changeCatalogPrivateEndpointCompartmentDetails)
                && java.util.Objects.equals(
                        this.catalogPrivateEndpointId, other.catalogPrivateEndpointId)
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
                        + (this.changeCatalogPrivateEndpointCompartmentDetails == null
                                ? 43
                                : this.changeCatalogPrivateEndpointCompartmentDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.catalogPrivateEndpointId == null
                                ? 43
                                : this.catalogPrivateEndpointId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.isLockOverride == null ? 43 : this.isLockOverride.hashCode());
        return result;
    }
}
