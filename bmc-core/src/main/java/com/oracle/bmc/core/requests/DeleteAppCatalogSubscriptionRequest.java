/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteAppCatalogSubscriptionExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * DeleteAppCatalogSubscriptionRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class DeleteAppCatalogSubscriptionRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the listing. */
    private String listingId;

    /** The OCID of the listing. */
    public String getListingId() {
        return listingId;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** Listing Resource Version. */
    private String resourceVersion;

    /** Listing Resource Version. */
    public String getResourceVersion() {
        return resourceVersion;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeleteAppCatalogSubscriptionRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the listing. */
        private String listingId = null;

        /**
         * The OCID of the listing.
         *
         * @param listingId the value to set
         * @return this builder instance
         */
        public Builder listingId(String listingId) {
            this.listingId = listingId;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** Listing Resource Version. */
        private String resourceVersion = null;

        /**
         * Listing Resource Version.
         *
         * @param resourceVersion the value to set
         * @return this builder instance
         */
        public Builder resourceVersion(String resourceVersion) {
            this.resourceVersion = resourceVersion;
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
        public Builder copy(DeleteAppCatalogSubscriptionRequest o) {
            listingId(o.getListingId());
            compartmentId(o.getCompartmentId());
            resourceVersion(o.getResourceVersion());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeleteAppCatalogSubscriptionRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DeleteAppCatalogSubscriptionRequest
         */
        public DeleteAppCatalogSubscriptionRequest build() {
            DeleteAppCatalogSubscriptionRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DeleteAppCatalogSubscriptionRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeleteAppCatalogSubscriptionRequest
         */
        public DeleteAppCatalogSubscriptionRequest buildWithoutInvocationCallback() {
            DeleteAppCatalogSubscriptionRequest request = new DeleteAppCatalogSubscriptionRequest();
            request.listingId = listingId;
            request.compartmentId = compartmentId;
            request.resourceVersion = resourceVersion;
            return request;
            // new DeleteAppCatalogSubscriptionRequest(listingId, compartmentId, resourceVersion);
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
                .compartmentId(compartmentId)
                .resourceVersion(resourceVersion);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",resourceVersion=").append(String.valueOf(this.resourceVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteAppCatalogSubscriptionRequest)) {
            return false;
        }

        DeleteAppCatalogSubscriptionRequest other = (DeleteAppCatalogSubscriptionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.resourceVersion, other.resourceVersion);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceVersion == null ? 43 : this.resourceVersion.hashCode());
        return result;
    }
}
