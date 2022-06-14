/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicecatalog.requests;

import com.oracle.bmc.servicecatalog.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/servicecatalog/ChangeServiceCatalogCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeServiceCatalogCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210527")
public class ChangeServiceCatalogCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.servicecatalog.model.ChangeServiceCatalogCompartmentDetails> {

    /**
     * The unique identifier for the service catalog.
     */
    private String serviceCatalogId;

    /**
     * The unique identifier for the service catalog.
     */
    public String getServiceCatalogId() {
        return serviceCatalogId;
    }
    /**
     * The details of the request to change the compartment of a given service catalog.
     */
    private com.oracle.bmc.servicecatalog.model.ChangeServiceCatalogCompartmentDetails
            changeServiceCatalogCompartmentDetails;

    /**
     * The details of the request to change the compartment of a given service catalog.
     */
    public com.oracle.bmc.servicecatalog.model.ChangeServiceCatalogCompartmentDetails
            getChangeServiceCatalogCompartmentDetails() {
        return changeServiceCatalogCompartmentDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to
     * the value of the etag from a previous GET or POST response for that resource.  The resource will be updated or
     * deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to
     * the value of the etag from a previous GET or POST response for that resource.  The resource will be updated or
     * deleted only if the etag you provide matches the resource's current etag value.
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
    public com.oracle.bmc.servicecatalog.model.ChangeServiceCatalogCompartmentDetails getBody$() {
        return changeServiceCatalogCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeServiceCatalogCompartmentRequest,
                    com.oracle.bmc.servicecatalog.model.ChangeServiceCatalogCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The unique identifier for the service catalog.
         */
        private String serviceCatalogId = null;

        /**
         * The unique identifier for the service catalog.
         * @param serviceCatalogId the value to set
         * @return this builder instance
         */
        public Builder serviceCatalogId(String serviceCatalogId) {
            this.serviceCatalogId = serviceCatalogId;
            return this;
        }

        /**
         * The details of the request to change the compartment of a given service catalog.
         */
        private com.oracle.bmc.servicecatalog.model.ChangeServiceCatalogCompartmentDetails
                changeServiceCatalogCompartmentDetails = null;

        /**
         * The details of the request to change the compartment of a given service catalog.
         * @param changeServiceCatalogCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeServiceCatalogCompartmentDetails(
                com.oracle.bmc.servicecatalog.model.ChangeServiceCatalogCompartmentDetails
                        changeServiceCatalogCompartmentDetails) {
            this.changeServiceCatalogCompartmentDetails = changeServiceCatalogCompartmentDetails;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to
         * the value of the etag from a previous GET or POST response for that resource.  The resource will be updated or
         * deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to
         * the value of the etag from a previous GET or POST response for that resource.  The resource will be updated or
         * deleted only if the etag you provide matches the resource's current etag value.
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
        public Builder copy(ChangeServiceCatalogCompartmentRequest o) {
            serviceCatalogId(o.getServiceCatalogId());
            changeServiceCatalogCompartmentDetails(o.getChangeServiceCatalogCompartmentDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeServiceCatalogCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeServiceCatalogCompartmentRequest
         */
        public ChangeServiceCatalogCompartmentRequest build() {
            ChangeServiceCatalogCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.servicecatalog.model.ChangeServiceCatalogCompartmentDetails body) {
            changeServiceCatalogCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeServiceCatalogCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeServiceCatalogCompartmentRequest
         */
        public ChangeServiceCatalogCompartmentRequest buildWithoutInvocationCallback() {
            ChangeServiceCatalogCompartmentRequest request =
                    new ChangeServiceCatalogCompartmentRequest();
            request.serviceCatalogId = serviceCatalogId;
            request.changeServiceCatalogCompartmentDetails = changeServiceCatalogCompartmentDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new ChangeServiceCatalogCompartmentRequest(serviceCatalogId, changeServiceCatalogCompartmentDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .serviceCatalogId(serviceCatalogId)
                .changeServiceCatalogCompartmentDetails(changeServiceCatalogCompartmentDetails)
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
        sb.append(",serviceCatalogId=").append(String.valueOf(this.serviceCatalogId));
        sb.append(",changeServiceCatalogCompartmentDetails=")
                .append(String.valueOf(this.changeServiceCatalogCompartmentDetails));
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
        if (!(o instanceof ChangeServiceCatalogCompartmentRequest)) {
            return false;
        }

        ChangeServiceCatalogCompartmentRequest other = (ChangeServiceCatalogCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.serviceCatalogId, other.serviceCatalogId)
                && java.util.Objects.equals(
                        this.changeServiceCatalogCompartmentDetails,
                        other.changeServiceCatalogCompartmentDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.serviceCatalogId == null ? 43 : this.serviceCatalogId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeServiceCatalogCompartmentDetails == null
                                ? 43
                                : this.changeServiceCatalogCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
