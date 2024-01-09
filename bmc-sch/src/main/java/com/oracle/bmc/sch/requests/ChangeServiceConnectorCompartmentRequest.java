/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch.requests;

import com.oracle.bmc.sch.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/sch/ChangeServiceConnectorCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeServiceConnectorCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
public class ChangeServiceConnectorCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.sch.model.ChangeServiceConnectorCompartmentDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the service connector.
     */
    private String serviceConnectorId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the service connector.
     */
    public String getServiceConnectorId() {
        return serviceConnectorId;
    }
    /** The configuration details for moving a service connector to a different compartment. */
    private com.oracle.bmc.sch.model.ChangeServiceConnectorCompartmentDetails
            changeServiceConnectorCompartmentDetails;

    /** The configuration details for moving a service connector to a different compartment. */
    public com.oracle.bmc.sch.model.ChangeServiceConnectorCompartmentDetails
            getChangeServiceConnectorCompartmentDetails() {
        return changeServiceConnectorCompartmentDetails;
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
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.sch.model.ChangeServiceConnectorCompartmentDetails getBody$() {
        return changeServiceConnectorCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeServiceConnectorCompartmentRequest,
                    com.oracle.bmc.sch.model.ChangeServiceConnectorCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the service connector.
         */
        private String serviceConnectorId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the service connector.
         *
         * @param serviceConnectorId the value to set
         * @return this builder instance
         */
        public Builder serviceConnectorId(String serviceConnectorId) {
            this.serviceConnectorId = serviceConnectorId;
            return this;
        }

        /** The configuration details for moving a service connector to a different compartment. */
        private com.oracle.bmc.sch.model.ChangeServiceConnectorCompartmentDetails
                changeServiceConnectorCompartmentDetails = null;

        /**
         * The configuration details for moving a service connector to a different compartment.
         *
         * @param changeServiceConnectorCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeServiceConnectorCompartmentDetails(
                com.oracle.bmc.sch.model.ChangeServiceConnectorCompartmentDetails
                        changeServiceConnectorCompartmentDetails) {
            this.changeServiceConnectorCompartmentDetails =
                    changeServiceConnectorCompartmentDetails;
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
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
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
        public Builder copy(ChangeServiceConnectorCompartmentRequest o) {
            serviceConnectorId(o.getServiceConnectorId());
            changeServiceConnectorCompartmentDetails(
                    o.getChangeServiceConnectorCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeServiceConnectorCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeServiceConnectorCompartmentRequest
         */
        public ChangeServiceConnectorCompartmentRequest build() {
            ChangeServiceConnectorCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.sch.model.ChangeServiceConnectorCompartmentDetails body) {
            changeServiceConnectorCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeServiceConnectorCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeServiceConnectorCompartmentRequest
         */
        public ChangeServiceConnectorCompartmentRequest buildWithoutInvocationCallback() {
            ChangeServiceConnectorCompartmentRequest request =
                    new ChangeServiceConnectorCompartmentRequest();
            request.serviceConnectorId = serviceConnectorId;
            request.changeServiceConnectorCompartmentDetails =
                    changeServiceConnectorCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeServiceConnectorCompartmentRequest(serviceConnectorId,
            // changeServiceConnectorCompartmentDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .serviceConnectorId(serviceConnectorId)
                .changeServiceConnectorCompartmentDetails(changeServiceConnectorCompartmentDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
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
        sb.append(",serviceConnectorId=").append(String.valueOf(this.serviceConnectorId));
        sb.append(",changeServiceConnectorCompartmentDetails=")
                .append(String.valueOf(this.changeServiceConnectorCompartmentDetails));
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
        if (!(o instanceof ChangeServiceConnectorCompartmentRequest)) {
            return false;
        }

        ChangeServiceConnectorCompartmentRequest other =
                (ChangeServiceConnectorCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.serviceConnectorId, other.serviceConnectorId)
                && java.util.Objects.equals(
                        this.changeServiceConnectorCompartmentDetails,
                        other.changeServiceConnectorCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.serviceConnectorId == null
                                ? 43
                                : this.serviceConnectorId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeServiceConnectorCompartmentDetails == null
                                ? 43
                                : this.changeServiceConnectorCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
