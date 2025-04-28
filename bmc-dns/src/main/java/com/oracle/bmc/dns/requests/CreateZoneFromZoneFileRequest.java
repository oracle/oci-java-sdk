/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.requests;

import com.oracle.bmc.dns.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/CreateZoneFromZoneFileExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateZoneFromZoneFileRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public class CreateZoneFromZoneFileRequest
        extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream> {

    /** The OCID of the compartment the resource belongs to. */
    private String compartmentId;

    /** The OCID of the compartment the resource belongs to. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The zone file contents. */
    private java.io.InputStream createZoneFromZoneFileDetails;

    /** The zone file contents. */
    public java.io.InputStream getCreateZoneFromZoneFileDetails() {
        return createZoneFromZoneFileDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** Specifies to operate only on resources that have a matching DNS scope. */
    private com.oracle.bmc.dns.model.Scope scope;

    /** Specifies to operate only on resources that have a matching DNS scope. */
    public com.oracle.bmc.dns.model.Scope getScope() {
        return scope;
    }
    /** The OCID of the view the resource is associated with. */
    private String viewId;

    /** The OCID of the view the resource is associated with. */
    public String getViewId() {
        return viewId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.io.InputStream getBody$() {
        return createZoneFromZoneFileDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateZoneFromZoneFileRequest, java.io.InputStream> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the compartment the resource belongs to. */
        private String compartmentId = null;

        /**
         * The OCID of the compartment the resource belongs to.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The zone file contents. */
        private java.io.InputStream createZoneFromZoneFileDetails = null;

        /**
         * The zone file contents.
         *
         * @param createZoneFromZoneFileDetails the value to set
         * @return this builder instance
         */
        public Builder createZoneFromZoneFileDetails(
                java.io.InputStream createZoneFromZoneFileDetails) {
            this.createZoneFromZoneFileDetails = createZoneFromZoneFileDetails;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** Specifies to operate only on resources that have a matching DNS scope. */
        private com.oracle.bmc.dns.model.Scope scope = null;

        /**
         * Specifies to operate only on resources that have a matching DNS scope.
         *
         * @param scope the value to set
         * @return this builder instance
         */
        public Builder scope(com.oracle.bmc.dns.model.Scope scope) {
            this.scope = scope;
            return this;
        }

        /** The OCID of the view the resource is associated with. */
        private String viewId = null;

        /**
         * The OCID of the view the resource is associated with.
         *
         * @param viewId the value to set
         * @return this builder instance
         */
        public Builder viewId(String viewId) {
            this.viewId = viewId;
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
        public Builder copy(CreateZoneFromZoneFileRequest o) {
            compartmentId(o.getCompartmentId());
            createZoneFromZoneFileDetails(o.getCreateZoneFromZoneFileDetails());
            opcRequestId(o.getOpcRequestId());
            scope(o.getScope());
            viewId(o.getViewId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateZoneFromZoneFileRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateZoneFromZoneFileRequest
         */
        public CreateZoneFromZoneFileRequest build() {
            CreateZoneFromZoneFileRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(java.io.InputStream body) {
            createZoneFromZoneFileDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateZoneFromZoneFileRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateZoneFromZoneFileRequest
         */
        public CreateZoneFromZoneFileRequest buildWithoutInvocationCallback() {
            CreateZoneFromZoneFileRequest request = new CreateZoneFromZoneFileRequest();
            request.compartmentId = compartmentId;
            request.createZoneFromZoneFileDetails = createZoneFromZoneFileDetails;
            request.opcRequestId = opcRequestId;
            request.scope = scope;
            request.viewId = viewId;
            return request;
            // new CreateZoneFromZoneFileRequest(compartmentId, createZoneFromZoneFileDetails,
            // opcRequestId, scope, viewId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .createZoneFromZoneFileDetails(createZoneFromZoneFileDetails)
                .opcRequestId(opcRequestId)
                .scope(scope)
                .viewId(viewId);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",createZoneFromZoneFileDetails=")
                .append(String.valueOf(this.createZoneFromZoneFileDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",scope=").append(String.valueOf(this.scope));
        sb.append(",viewId=").append(String.valueOf(this.viewId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateZoneFromZoneFileRequest)) {
            return false;
        }

        CreateZoneFromZoneFileRequest other = (CreateZoneFromZoneFileRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.createZoneFromZoneFileDetails, other.createZoneFromZoneFileDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.viewId, other.viewId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.createZoneFromZoneFileDetails == null
                                ? 43
                                : this.createZoneFromZoneFileDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + (this.viewId == null ? 43 : this.viewId.hashCode());
        return result;
    }
}
