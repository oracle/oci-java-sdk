/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.requests;

import com.oracle.bmc.cims.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cims/ListIncidentResourceTypesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListIncidentResourceTypesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
public class ListIncidentResourceTypesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The kind of support request.
     */
    private String problemType;

    /**
     * The kind of support request.
     */
    public String getProblemType() {
        return problemType;
    }
    /**
     * The OCID of the tenancy.
     */
    private String compartmentId;

    /**
     * The OCID of the tenancy.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call. For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call. For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * The key to use to sort the returned items.
     */
    private com.oracle.bmc.cims.model.SortBy sortBy;

    /**
     * The key to use to sort the returned items.
     */
    public com.oracle.bmc.cims.model.SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The order to sort the results in.
     */
    private com.oracle.bmc.cims.model.SortOrder sortOrder;

    /**
     * The order to sort the results in.
     */
    public com.oracle.bmc.cims.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The user-friendly name of the support ticket type.
     */
    private String name;

    /**
     * The user-friendly name of the support ticket type.
     */
    public String getName() {
        return name;
    }
    /**
     * The Customer Support Identifier (CSI) number associated with the support account.
     * The CSI is optional for all support request types.
     *
     */
    private String csi;

    /**
     * The Customer Support Identifier (CSI) number associated with the support account.
     * The CSI is optional for all support request types.
     *
     */
    public String getCsi() {
        return csi;
    }
    /**
     * User OCID for Oracle Identity Cloud Service (IDCS) users who also have a federated Oracle Cloud Infrastructure account.
     * User OCID is mandatory for OCI Users and optional for Multicloud users.
     *
     */
    private String ocid;

    /**
     * User OCID for Oracle Identity Cloud Service (IDCS) users who also have a federated Oracle Cloud Infrastructure account.
     * User OCID is mandatory for OCI Users and optional for Multicloud users.
     *
     */
    public String getOcid() {
        return ocid;
    }
    /**
     * The region of the tenancy.
     */
    private String homeregion;

    /**
     * The region of the tenancy.
     */
    public String getHomeregion() {
        return homeregion;
    }
    /**
     * The OCID of identity domain.
     * DomainID is mandatory if the user is part of Non Default Identity domain.
     *
     */
    private String domainid;

    /**
     * The OCID of identity domain.
     * DomainID is mandatory if the user is part of Non Default Identity domain.
     *
     */
    public String getDomainid() {
        return domainid;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListIncidentResourceTypesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The kind of support request.
         */
        private String problemType = null;

        /**
         * The kind of support request.
         * @param problemType the value to set
         * @return this builder instance
         */
        public Builder problemType(String problemType) {
            this.problemType = problemType;
            return this;
        }

        /**
         * The OCID of the tenancy.
         */
        private String compartmentId = null;

        /**
         * The OCID of the tenancy.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call. For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call. For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call. For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The key to use to sort the returned items.
         */
        private com.oracle.bmc.cims.model.SortBy sortBy = null;

        /**
         * The key to use to sort the returned items.
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(com.oracle.bmc.cims.model.SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The order to sort the results in.
         */
        private com.oracle.bmc.cims.model.SortOrder sortOrder = null;

        /**
         * The order to sort the results in.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.cims.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The user-friendly name of the support ticket type.
         */
        private String name = null;

        /**
         * The user-friendly name of the support ticket type.
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The Customer Support Identifier (CSI) number associated with the support account.
         * The CSI is optional for all support request types.
         *
         */
        private String csi = null;

        /**
         * The Customer Support Identifier (CSI) number associated with the support account.
         * The CSI is optional for all support request types.
         *
         * @param csi the value to set
         * @return this builder instance
         */
        public Builder csi(String csi) {
            this.csi = csi;
            return this;
        }

        /**
         * User OCID for Oracle Identity Cloud Service (IDCS) users who also have a federated Oracle Cloud Infrastructure account.
         * User OCID is mandatory for OCI Users and optional for Multicloud users.
         *
         */
        private String ocid = null;

        /**
         * User OCID for Oracle Identity Cloud Service (IDCS) users who also have a federated Oracle Cloud Infrastructure account.
         * User OCID is mandatory for OCI Users and optional for Multicloud users.
         *
         * @param ocid the value to set
         * @return this builder instance
         */
        public Builder ocid(String ocid) {
            this.ocid = ocid;
            return this;
        }

        /**
         * The region of the tenancy.
         */
        private String homeregion = null;

        /**
         * The region of the tenancy.
         * @param homeregion the value to set
         * @return this builder instance
         */
        public Builder homeregion(String homeregion) {
            this.homeregion = homeregion;
            return this;
        }

        /**
         * The OCID of identity domain.
         * DomainID is mandatory if the user is part of Non Default Identity domain.
         *
         */
        private String domainid = null;

        /**
         * The OCID of identity domain.
         * DomainID is mandatory if the user is part of Non Default Identity domain.
         *
         * @param domainid the value to set
         * @return this builder instance
         */
        public Builder domainid(String domainid) {
            this.domainid = domainid;
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
        public Builder copy(ListIncidentResourceTypesRequest o) {
            problemType(o.getProblemType());
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            name(o.getName());
            csi(o.getCsi());
            ocid(o.getOcid());
            homeregion(o.getHomeregion());
            domainid(o.getDomainid());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListIncidentResourceTypesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListIncidentResourceTypesRequest
         */
        public ListIncidentResourceTypesRequest build() {
            ListIncidentResourceTypesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListIncidentResourceTypesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListIncidentResourceTypesRequest
         */
        public ListIncidentResourceTypesRequest buildWithoutInvocationCallback() {
            ListIncidentResourceTypesRequest request = new ListIncidentResourceTypesRequest();
            request.problemType = problemType;
            request.compartmentId = compartmentId;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.name = name;
            request.csi = csi;
            request.ocid = ocid;
            request.homeregion = homeregion;
            request.domainid = domainid;
            return request;
            // new ListIncidentResourceTypesRequest(problemType, compartmentId, opcRequestId, limit, page, sortBy, sortOrder, name, csi, ocid, homeregion, domainid);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .problemType(problemType)
                .compartmentId(compartmentId)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .name(name)
                .csi(csi)
                .ocid(ocid)
                .homeregion(homeregion)
                .domainid(domainid);
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
        sb.append(",problemType=").append(String.valueOf(this.problemType));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",csi=").append(String.valueOf(this.csi));
        sb.append(",ocid=").append(String.valueOf(this.ocid));
        sb.append(",homeregion=").append(String.valueOf(this.homeregion));
        sb.append(",domainid=").append(String.valueOf(this.domainid));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListIncidentResourceTypesRequest)) {
            return false;
        }

        ListIncidentResourceTypesRequest other = (ListIncidentResourceTypesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.problemType, other.problemType)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.csi, other.csi)
                && java.util.Objects.equals(this.ocid, other.ocid)
                && java.util.Objects.equals(this.homeregion, other.homeregion)
                && java.util.Objects.equals(this.domainid, other.domainid);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.problemType == null ? 43 : this.problemType.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.csi == null ? 43 : this.csi.hashCode());
        result = (result * PRIME) + (this.ocid == null ? 43 : this.ocid.hashCode());
        result = (result * PRIME) + (this.homeregion == null ? 43 : this.homeregion.hashCode());
        result = (result * PRIME) + (this.domainid == null ? 43 : this.domainid.hashCode());
        return result;
    }
}
