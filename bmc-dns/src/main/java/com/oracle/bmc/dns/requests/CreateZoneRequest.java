/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.requests;

import com.oracle.bmc.dns.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/CreateZoneExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateZoneRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public class CreateZoneRequest
        extends com.oracle.bmc.requests.BmcRequest<com.oracle.bmc.dns.model.CreateZoneBaseDetails> {

    /** Details for creating a new zone. */
    private com.oracle.bmc.dns.model.CreateZoneBaseDetails createZoneDetails;

    /** Details for creating a new zone. */
    public com.oracle.bmc.dns.model.CreateZoneBaseDetails getCreateZoneDetails() {
        return createZoneDetails;
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
    /**
     * The OCID of the compartment the zone belongs to.
     *
     * <p>This parameter is deprecated and should be omitted.
     */
    private String compartmentId;

    /**
     * The OCID of the compartment the zone belongs to.
     *
     * <p>This parameter is deprecated and should be omitted.
     */
    public String getCompartmentId() {
        return compartmentId;
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
    public com.oracle.bmc.dns.model.CreateZoneBaseDetails getBody$() {
        return createZoneDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateZoneRequest, com.oracle.bmc.dns.model.CreateZoneBaseDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Details for creating a new zone. */
        private com.oracle.bmc.dns.model.CreateZoneBaseDetails createZoneDetails = null;

        /**
         * Details for creating a new zone.
         *
         * @param createZoneDetails the value to set
         * @return this builder instance
         */
        public Builder createZoneDetails(
                com.oracle.bmc.dns.model.CreateZoneBaseDetails createZoneDetails) {
            this.createZoneDetails = createZoneDetails;
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

        /**
         * The OCID of the compartment the zone belongs to.
         *
         * <p>This parameter is deprecated and should be omitted.
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment the zone belongs to.
         *
         * <p>This parameter is deprecated and should be omitted.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
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
        public Builder copy(CreateZoneRequest o) {
            createZoneDetails(o.getCreateZoneDetails());
            opcRequestId(o.getOpcRequestId());
            compartmentId(o.getCompartmentId());
            scope(o.getScope());
            viewId(o.getViewId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateZoneRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateZoneRequest
         */
        public CreateZoneRequest build() {
            CreateZoneRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.dns.model.CreateZoneBaseDetails body) {
            createZoneDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateZoneRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateZoneRequest
         */
        public CreateZoneRequest buildWithoutInvocationCallback() {
            CreateZoneRequest request = new CreateZoneRequest();
            request.createZoneDetails = createZoneDetails;
            request.opcRequestId = opcRequestId;
            request.compartmentId = compartmentId;
            request.scope = scope;
            request.viewId = viewId;
            return request;
            // new CreateZoneRequest(createZoneDetails, opcRequestId, compartmentId, scope, viewId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createZoneDetails(createZoneDetails)
                .opcRequestId(opcRequestId)
                .compartmentId(compartmentId)
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
        sb.append(",createZoneDetails=").append(String.valueOf(this.createZoneDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
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
        if (!(o instanceof CreateZoneRequest)) {
            return false;
        }

        CreateZoneRequest other = (CreateZoneRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.createZoneDetails, other.createZoneDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.viewId, other.viewId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createZoneDetails == null ? 43 : this.createZoneDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + (this.viewId == null ? 43 : this.viewId.hashCode());
        return result;
    }
}
