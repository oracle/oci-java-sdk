/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.requests;

import com.oracle.bmc.ospgateway.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ospgateway/ListInvoiceLinesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListInvoiceLinesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
public class ListInvoiceLinesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The home region's public name of the logged in user. */
    private String ospHomeRegion;

    /** The home region's public name of the logged in user. */
    public String getOspHomeRegion() {
        return ospHomeRegion;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The identifier of the invoice. */
    private String internalInvoiceId;

    /** The identifier of the invoice. */
    public String getInternalInvoiceId() {
        return internalInvoiceId;
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
     * For list pagination. The value of the opc-next-page response header from the previous "List"
     * call.
     */
    private String page;

    /**
     * For list pagination. The value of the opc-next-page response header from the previous "List"
     * call.
     */
    public String getPage() {
        return page;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call.
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call.
     */
    public Integer getLimit() {
        return limit;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListInvoiceLinesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The home region's public name of the logged in user. */
        private String ospHomeRegion = null;

        /**
         * The home region's public name of the logged in user.
         *
         * @param ospHomeRegion the value to set
         * @return this builder instance
         */
        public Builder ospHomeRegion(String ospHomeRegion) {
            this.ospHomeRegion = ospHomeRegion;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The identifier of the invoice. */
        private String internalInvoiceId = null;

        /**
         * The identifier of the invoice.
         *
         * @param internalInvoiceId the value to set
         * @return this builder instance
         */
        public Builder internalInvoiceId(String internalInvoiceId) {
            this.internalInvoiceId = internalInvoiceId;
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
         * For list pagination. The value of the opc-next-page response header from the previous
         * "List" call.
         */
        private String page = null;

        /**
         * For list pagination. The value of the opc-next-page response header from the previous
         * "List" call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call.
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
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
        public Builder copy(ListInvoiceLinesRequest o) {
            ospHomeRegion(o.getOspHomeRegion());
            compartmentId(o.getCompartmentId());
            internalInvoiceId(o.getInternalInvoiceId());
            opcRequestId(o.getOpcRequestId());
            page(o.getPage());
            limit(o.getLimit());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListInvoiceLinesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListInvoiceLinesRequest
         */
        public ListInvoiceLinesRequest build() {
            ListInvoiceLinesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListInvoiceLinesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListInvoiceLinesRequest
         */
        public ListInvoiceLinesRequest buildWithoutInvocationCallback() {
            ListInvoiceLinesRequest request = new ListInvoiceLinesRequest();
            request.ospHomeRegion = ospHomeRegion;
            request.compartmentId = compartmentId;
            request.internalInvoiceId = internalInvoiceId;
            request.opcRequestId = opcRequestId;
            request.page = page;
            request.limit = limit;
            return request;
            // new ListInvoiceLinesRequest(ospHomeRegion, compartmentId, internalInvoiceId,
            // opcRequestId, page, limit);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .ospHomeRegion(ospHomeRegion)
                .compartmentId(compartmentId)
                .internalInvoiceId(internalInvoiceId)
                .opcRequestId(opcRequestId)
                .page(page)
                .limit(limit);
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
        sb.append(",ospHomeRegion=").append(String.valueOf(this.ospHomeRegion));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",internalInvoiceId=").append(String.valueOf(this.internalInvoiceId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListInvoiceLinesRequest)) {
            return false;
        }

        ListInvoiceLinesRequest other = (ListInvoiceLinesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.ospHomeRegion, other.ospHomeRegion)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.internalInvoiceId, other.internalInvoiceId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.ospHomeRegion == null ? 43 : this.ospHomeRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.internalInvoiceId == null ? 43 : this.internalInvoiceId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        return result;
    }
}
