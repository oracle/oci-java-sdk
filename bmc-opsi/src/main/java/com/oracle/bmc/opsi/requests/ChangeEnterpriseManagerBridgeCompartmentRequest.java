/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ChangeEnterpriseManagerBridgeCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeEnterpriseManagerBridgeCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class ChangeEnterpriseManagerBridgeCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.opsi.model.ChangeEnterpriseManagerBridgeCompartmentDetails> {

    /** Unique Enterprise Manager bridge identifier */
    private String enterpriseManagerBridgeId;

    /** Unique Enterprise Manager bridge identifier */
    public String getEnterpriseManagerBridgeId() {
        return enterpriseManagerBridgeId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.opsi.model.ChangeEnterpriseManagerBridgeCompartmentDetails
            changeEnterpriseManagerBridgeCompartmentDetails;

    /** The information to be updated. */
    public com.oracle.bmc.opsi.model.ChangeEnterpriseManagerBridgeCompartmentDetails
            getChangeEnterpriseManagerBridgeCompartmentDetails() {
        return changeEnterpriseManagerBridgeCompartmentDetails;
    }
    /**
     * Used for optimistic concurrency control. In the update or delete call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous get, create, or update
     * response for that resource. The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     */
    private String ifMatch;

    /**
     * Used for optimistic concurrency control. In the update or delete call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous get, create, or update
     * response for that resource. The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
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
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.opsi.model.ChangeEnterpriseManagerBridgeCompartmentDetails getBody$() {
        return changeEnterpriseManagerBridgeCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeEnterpriseManagerBridgeCompartmentRequest,
                    com.oracle.bmc.opsi.model.ChangeEnterpriseManagerBridgeCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique Enterprise Manager bridge identifier */
        private String enterpriseManagerBridgeId = null;

        /**
         * Unique Enterprise Manager bridge identifier
         *
         * @param enterpriseManagerBridgeId the value to set
         * @return this builder instance
         */
        public Builder enterpriseManagerBridgeId(String enterpriseManagerBridgeId) {
            this.enterpriseManagerBridgeId = enterpriseManagerBridgeId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.opsi.model.ChangeEnterpriseManagerBridgeCompartmentDetails
                changeEnterpriseManagerBridgeCompartmentDetails = null;

        /**
         * The information to be updated.
         *
         * @param changeEnterpriseManagerBridgeCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeEnterpriseManagerBridgeCompartmentDetails(
                com.oracle.bmc.opsi.model.ChangeEnterpriseManagerBridgeCompartmentDetails
                        changeEnterpriseManagerBridgeCompartmentDetails) {
            this.changeEnterpriseManagerBridgeCompartmentDetails =
                    changeEnterpriseManagerBridgeCompartmentDetails;
            return this;
        }

        /**
         * Used for optimistic concurrency control. In the update or delete call for a resource, set
         * the {@code if-match} parameter to the value of the etag from a previous get, create, or
         * update response for that resource. The resource will be updated or deleted only if the
         * etag you provide matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * Used for optimistic concurrency control. In the update or delete call for a resource, set
         * the {@code if-match} parameter to the value of the etag from a previous get, create, or
         * update response for that resource. The resource will be updated or deleted only if the
         * etag you provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(ChangeEnterpriseManagerBridgeCompartmentRequest o) {
            enterpriseManagerBridgeId(o.getEnterpriseManagerBridgeId());
            changeEnterpriseManagerBridgeCompartmentDetails(
                    o.getChangeEnterpriseManagerBridgeCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeEnterpriseManagerBridgeCompartmentRequest as configured by
         * this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeEnterpriseManagerBridgeCompartmentRequest
         */
        public ChangeEnterpriseManagerBridgeCompartmentRequest build() {
            ChangeEnterpriseManagerBridgeCompartmentRequest request =
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
                com.oracle.bmc.opsi.model.ChangeEnterpriseManagerBridgeCompartmentDetails body) {
            changeEnterpriseManagerBridgeCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeEnterpriseManagerBridgeCompartmentRequest as configured by
         * this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeEnterpriseManagerBridgeCompartmentRequest
         */
        public ChangeEnterpriseManagerBridgeCompartmentRequest buildWithoutInvocationCallback() {
            ChangeEnterpriseManagerBridgeCompartmentRequest request =
                    new ChangeEnterpriseManagerBridgeCompartmentRequest();
            request.enterpriseManagerBridgeId = enterpriseManagerBridgeId;
            request.changeEnterpriseManagerBridgeCompartmentDetails =
                    changeEnterpriseManagerBridgeCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeEnterpriseManagerBridgeCompartmentRequest(enterpriseManagerBridgeId,
            // changeEnterpriseManagerBridgeCompartmentDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .enterpriseManagerBridgeId(enterpriseManagerBridgeId)
                .changeEnterpriseManagerBridgeCompartmentDetails(
                        changeEnterpriseManagerBridgeCompartmentDetails)
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
        sb.append(",enterpriseManagerBridgeId=")
                .append(String.valueOf(this.enterpriseManagerBridgeId));
        sb.append(",changeEnterpriseManagerBridgeCompartmentDetails=")
                .append(String.valueOf(this.changeEnterpriseManagerBridgeCompartmentDetails));
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
        if (!(o instanceof ChangeEnterpriseManagerBridgeCompartmentRequest)) {
            return false;
        }

        ChangeEnterpriseManagerBridgeCompartmentRequest other =
                (ChangeEnterpriseManagerBridgeCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.enterpriseManagerBridgeId, other.enterpriseManagerBridgeId)
                && java.util.Objects.equals(
                        this.changeEnterpriseManagerBridgeCompartmentDetails,
                        other.changeEnterpriseManagerBridgeCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.enterpriseManagerBridgeId == null
                                ? 43
                                : this.enterpriseManagerBridgeId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeEnterpriseManagerBridgeCompartmentDetails == null
                                ? 43
                                : this.changeEnterpriseManagerBridgeCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
