/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.requests;

import com.oracle.bmc.monitoring.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/monitoring/ListMetricsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListMetricsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
public class ListMetricsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.monitoring.model.ListMetricsDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment containing the resources monitored by the metric that you are searching for.
     * Use tenancyId to search in the root compartment.
     *
     * <p>Example: {@code ocid1.compartment.oc1..exampleuniqueID}
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment containing the resources monitored by the metric that you are searching for.
     * Use tenancyId to search in the root compartment.
     *
     * <p>Example: {@code ocid1.compartment.oc1..exampleuniqueID}
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The dimensions used to filter metrics. */
    private com.oracle.bmc.monitoring.model.ListMetricsDetails listMetricsDetails;

    /** The dimensions used to filter metrics. */
    public com.oracle.bmc.monitoring.model.ListMetricsDetails getListMetricsDetails() {
        return listMetricsDetails;
    }
    /**
     * Customer part of the request identifier token. If you need to contact Oracle about a
     * particular request, please provide the complete request ID.
     */
    private String opcRequestId;

    /**
     * Customer part of the request identifier token. If you need to contact Oracle about a
     * particular request, please provide the complete request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Default: 1000
     *
     * <p>Example: 500
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Default: 1000
     *
     * <p>Example: 500
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * When true, returns resources from all compartments and subcompartments. The parameter can
     * only be set to true when compartmentId is the tenancy OCID (the tenancy is the root
     * compartment). A true value requires the user to have tenancy-level permissions. If this
     * requirement is not met, then the call is rejected. When false, returns resources from only
     * the compartment specified in compartmentId. Default is false.
     */
    private Boolean compartmentIdInSubtree;

    /**
     * When true, returns resources from all compartments and subcompartments. The parameter can
     * only be set to true when compartmentId is the tenancy OCID (the tenancy is the root
     * compartment). A true value requires the user to have tenancy-level permissions. If this
     * requirement is not met, then the call is rejected. When false, returns resources from only
     * the compartment specified in compartmentId. Default is false.
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.monitoring.model.ListMetricsDetails getBody$() {
        return listMetricsDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListMetricsRequest, com.oracle.bmc.monitoring.model.ListMetricsDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment containing the resources monitored by the metric that you are
         * searching for. Use tenancyId to search in the root compartment.
         *
         * <p>Example: {@code ocid1.compartment.oc1..exampleuniqueID}
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment containing the resources monitored by the metric that you are
         * searching for. Use tenancyId to search in the root compartment.
         *
         * <p>Example: {@code ocid1.compartment.oc1..exampleuniqueID}
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The dimensions used to filter metrics. */
        private com.oracle.bmc.monitoring.model.ListMetricsDetails listMetricsDetails = null;

        /**
         * The dimensions used to filter metrics.
         *
         * @param listMetricsDetails the value to set
         * @return this builder instance
         */
        public Builder listMetricsDetails(
                com.oracle.bmc.monitoring.model.ListMetricsDetails listMetricsDetails) {
            this.listMetricsDetails = listMetricsDetails;
            return this;
        }

        /**
         * Customer part of the request identifier token. If you need to contact Oracle about a
         * particular request, please provide the complete request ID.
         */
        private String opcRequestId = null;

        /**
         * Customer part of the request identifier token. If you need to contact Oracle about a
         * particular request, please provide the complete request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
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
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Default: 1000
         *
         * <p>Example: 500
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Default: 1000
         *
         * <p>Example: 500
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * When true, returns resources from all compartments and subcompartments. The parameter can
         * only be set to true when compartmentId is the tenancy OCID (the tenancy is the root
         * compartment). A true value requires the user to have tenancy-level permissions. If this
         * requirement is not met, then the call is rejected. When false, returns resources from
         * only the compartment specified in compartmentId. Default is false.
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * When true, returns resources from all compartments and subcompartments. The parameter can
         * only be set to true when compartmentId is the tenancy OCID (the tenancy is the root
         * compartment). A true value requires the user to have tenancy-level permissions. If this
         * requirement is not met, then the call is rejected. When false, returns resources from
         * only the compartment specified in compartmentId. Default is false.
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
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
        public Builder copy(ListMetricsRequest o) {
            compartmentId(o.getCompartmentId());
            listMetricsDetails(o.getListMetricsDetails());
            opcRequestId(o.getOpcRequestId());
            page(o.getPage());
            limit(o.getLimit());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListMetricsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListMetricsRequest
         */
        public ListMetricsRequest build() {
            ListMetricsRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.monitoring.model.ListMetricsDetails body) {
            listMetricsDetails(body);
            return this;
        }

        /**
         * Build the instance of ListMetricsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListMetricsRequest
         */
        public ListMetricsRequest buildWithoutInvocationCallback() {
            ListMetricsRequest request = new ListMetricsRequest();
            request.compartmentId = compartmentId;
            request.listMetricsDetails = listMetricsDetails;
            request.opcRequestId = opcRequestId;
            request.page = page;
            request.limit = limit;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            return request;
            // new ListMetricsRequest(compartmentId, listMetricsDetails, opcRequestId, page, limit,
            // compartmentIdInSubtree);
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
                .listMetricsDetails(listMetricsDetails)
                .opcRequestId(opcRequestId)
                .page(page)
                .limit(limit)
                .compartmentIdInSubtree(compartmentIdInSubtree);
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
        sb.append(",listMetricsDetails=").append(String.valueOf(this.listMetricsDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListMetricsRequest)) {
            return false;
        }

        ListMetricsRequest other = (ListMetricsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.listMetricsDetails, other.listMetricsDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree);
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
                        + (this.listMetricsDetails == null
                                ? 43
                                : this.listMetricsDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        return result;
    }
}
