/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.requests;

import com.oracle.bmc.resourcemanager.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/ListStackAssociatedResourcesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListStackAssociatedResourcesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
public class ListStackAssociatedResourcesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the stack.
     */
    private String stackId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the stack.
     */
    public String getStackId() {
        return stackId;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A filter to return only specified resource types.
     * For more information about resource types supported for the Oracle Cloud Infrastructure [OCI] provider, see [Oracle Cloud Infrastructure Provider](https://registry.terraform.io/providers/oracle/oci/latest/docs).
     *
     */
    private String terraformResourceType;

    /**
     * A filter to return only specified resource types.
     * For more information about resource types supported for the Oracle Cloud Infrastructure [OCI] provider, see [Oracle Cloud Infrastructure Provider](https://registry.terraform.io/providers/oracle/oci/latest/docs).
     *
     */
    public String getTerraformResourceType() {
        return terraformResourceType;
    }
    /**
     * A filter to return only resources that exist in the compartment, identified by [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     */
    private String compartmentId;

    /**
     * A filter to return only resources that exist in the compartment, identified by [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The number of items returned in a paginated {@code List} call. For information about pagination, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private Integer limit;

    /**
     * The number of items returned in a paginated {@code List} call. For information about pagination, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The value of the {@code opc-next-page} response header from the preceding {@code List} call.
     * For information about pagination, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * The value of the {@code opc-next-page} response header from the preceding {@code List} call.
     * For information about pagination, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public String getPage() {
        return page;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListStackAssociatedResourcesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the stack.
         */
        private String stackId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the stack.
         * @param stackId the value to set
         * @return this builder instance
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
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
         * A filter to return only specified resource types.
         * For more information about resource types supported for the Oracle Cloud Infrastructure [OCI] provider, see [Oracle Cloud Infrastructure Provider](https://registry.terraform.io/providers/oracle/oci/latest/docs).
         *
         */
        private String terraformResourceType = null;

        /**
         * A filter to return only specified resource types.
         * For more information about resource types supported for the Oracle Cloud Infrastructure [OCI] provider, see [Oracle Cloud Infrastructure Provider](https://registry.terraform.io/providers/oracle/oci/latest/docs).
         *
         * @param terraformResourceType the value to set
         * @return this builder instance
         */
        public Builder terraformResourceType(String terraformResourceType) {
            this.terraformResourceType = terraformResourceType;
            return this;
        }

        /**
         * A filter to return only resources that exist in the compartment, identified by [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         */
        private String compartmentId = null;

        /**
         * A filter to return only resources that exist in the compartment, identified by [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The number of items returned in a paginated {@code List} call. For information about pagination, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private Integer limit = null;

        /**
         * The number of items returned in a paginated {@code List} call. For information about pagination, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The value of the {@code opc-next-page} response header from the preceding {@code List} call.
         * For information about pagination, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header from the preceding {@code List} call.
         * For information about pagination, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
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
        public Builder copy(ListStackAssociatedResourcesRequest o) {
            stackId(o.getStackId());
            opcRequestId(o.getOpcRequestId());
            terraformResourceType(o.getTerraformResourceType());
            compartmentId(o.getCompartmentId());
            limit(o.getLimit());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListStackAssociatedResourcesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListStackAssociatedResourcesRequest
         */
        public ListStackAssociatedResourcesRequest build() {
            ListStackAssociatedResourcesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListStackAssociatedResourcesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListStackAssociatedResourcesRequest
         */
        public ListStackAssociatedResourcesRequest buildWithoutInvocationCallback() {
            ListStackAssociatedResourcesRequest request = new ListStackAssociatedResourcesRequest();
            request.stackId = stackId;
            request.opcRequestId = opcRequestId;
            request.terraformResourceType = terraformResourceType;
            request.compartmentId = compartmentId;
            request.limit = limit;
            request.page = page;
            return request;
            // new ListStackAssociatedResourcesRequest(stackId, opcRequestId, terraformResourceType, compartmentId, limit, page);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .stackId(stackId)
                .opcRequestId(opcRequestId)
                .terraformResourceType(terraformResourceType)
                .compartmentId(compartmentId)
                .limit(limit)
                .page(page);
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
        sb.append(",stackId=").append(String.valueOf(this.stackId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",terraformResourceType=").append(String.valueOf(this.terraformResourceType));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListStackAssociatedResourcesRequest)) {
            return false;
        }

        ListStackAssociatedResourcesRequest other = (ListStackAssociatedResourcesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.stackId, other.stackId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.terraformResourceType, other.terraformResourceType)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.stackId == null ? 43 : this.stackId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.terraformResourceType == null
                                ? 43
                                : this.terraformResourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        return result;
    }
}
