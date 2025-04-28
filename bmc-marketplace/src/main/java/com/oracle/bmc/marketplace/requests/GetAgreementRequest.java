/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.requests;

import com.oracle.bmc.marketplace.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplace/GetAgreementExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetAgreementRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public class GetAgreementRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The unique identifier for the listing. */
    private String listingId;

    /** The unique identifier for the listing. */
    public String getListingId() {
        return listingId;
    }
    /** The version of the package. Package versions are unique within a listing. */
    private String packageVersion;

    /** The version of the package. Package versions are unique within a listing. */
    public String getPackageVersion() {
        return packageVersion;
    }
    /** The unique identifier for the agreement. */
    private String agreementId;

    /** The unique identifier for the agreement. */
    public String getAgreementId() {
        return agreementId;
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
    /** The unique identifier for the compartment. */
    private String compartmentId;

    /** The unique identifier for the compartment. */
    public String getCompartmentId() {
        return compartmentId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetAgreementRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The unique identifier for the listing. */
        private String listingId = null;

        /**
         * The unique identifier for the listing.
         *
         * @param listingId the value to set
         * @return this builder instance
         */
        public Builder listingId(String listingId) {
            this.listingId = listingId;
            return this;
        }

        /** The version of the package. Package versions are unique within a listing. */
        private String packageVersion = null;

        /**
         * The version of the package. Package versions are unique within a listing.
         *
         * @param packageVersion the value to set
         * @return this builder instance
         */
        public Builder packageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }

        /** The unique identifier for the agreement. */
        private String agreementId = null;

        /**
         * The unique identifier for the agreement.
         *
         * @param agreementId the value to set
         * @return this builder instance
         */
        public Builder agreementId(String agreementId) {
            this.agreementId = agreementId;
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

        /** The unique identifier for the compartment. */
        private String compartmentId = null;

        /**
         * The unique identifier for the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
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
        public Builder copy(GetAgreementRequest o) {
            listingId(o.getListingId());
            packageVersion(o.getPackageVersion());
            agreementId(o.getAgreementId());
            opcRequestId(o.getOpcRequestId());
            compartmentId(o.getCompartmentId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetAgreementRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetAgreementRequest
         */
        public GetAgreementRequest build() {
            GetAgreementRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetAgreementRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetAgreementRequest
         */
        public GetAgreementRequest buildWithoutInvocationCallback() {
            GetAgreementRequest request = new GetAgreementRequest();
            request.listingId = listingId;
            request.packageVersion = packageVersion;
            request.agreementId = agreementId;
            request.opcRequestId = opcRequestId;
            request.compartmentId = compartmentId;
            return request;
            // new GetAgreementRequest(listingId, packageVersion, agreementId, opcRequestId,
            // compartmentId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .listingId(listingId)
                .packageVersion(packageVersion)
                .agreementId(agreementId)
                .opcRequestId(opcRequestId)
                .compartmentId(compartmentId);
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
        sb.append(",listingId=").append(String.valueOf(this.listingId));
        sb.append(",packageVersion=").append(String.valueOf(this.packageVersion));
        sb.append(",agreementId=").append(String.valueOf(this.agreementId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetAgreementRequest)) {
            return false;
        }

        GetAgreementRequest other = (GetAgreementRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.packageVersion, other.packageVersion)
                && java.util.Objects.equals(this.agreementId, other.agreementId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result =
                (result * PRIME)
                        + (this.packageVersion == null ? 43 : this.packageVersion.hashCode());
        result = (result * PRIME) + (this.agreementId == null ? 43 : this.agreementId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        return result;
    }
}
