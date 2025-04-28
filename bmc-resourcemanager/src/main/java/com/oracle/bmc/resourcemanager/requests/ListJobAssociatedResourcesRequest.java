/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.requests;

import com.oracle.bmc.resourcemanager.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/ListJobAssociatedResourcesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListJobAssociatedResourcesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
public class ListJobAssociatedResourcesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job.
     */
    private String jobId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job.
     */
    public String getJobId() {
        return jobId;
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
     * A filter to return only resources that exist in the compartment, identified by
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String compartmentId;

    /**
     * A filter to return only resources that exist in the compartment, identified by
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * A filter to return only specified resource types. For more information about resource types
     * supported for the Oracle Cloud Infrastructure [OCI] provider, see [Oracle Cloud
     * Infrastructure Provider](https://registry.terraform.io/providers/oracle/oci/latest/docs).
     */
    private String terraformResourceType;

    /**
     * A filter to return only specified resource types. For more information about resource types
     * supported for the Oracle Cloud Infrastructure [OCI] provider, see [Oracle Cloud
     * Infrastructure Provider](https://registry.terraform.io/providers/oracle/oci/latest/docs).
     */
    public String getTerraformResourceType() {
        return terraformResourceType;
    }
    /**
     * The number of items returned in a paginated {@code List} call. For information about
     * pagination, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * The number of items returned in a paginated {@code List} call. For information about
     * pagination, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The value of the {@code opc-next-page} response header from the preceding {@code List} call.
     * For information about pagination, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * The value of the {@code opc-next-page} response header from the preceding {@code List} call.
     * For information about pagination, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListJobAssociatedResourcesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * job.
         */
        private String jobId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * job.
         *
         * @param jobId the value to set
         * @return this builder instance
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
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
         * A filter to return only resources that exist in the compartment, identified by
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String compartmentId = null;

        /**
         * A filter to return only resources that exist in the compartment, identified by
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A filter to return only specified resource types. For more information about resource
         * types supported for the Oracle Cloud Infrastructure [OCI] provider, see [Oracle Cloud
         * Infrastructure Provider](https://registry.terraform.io/providers/oracle/oci/latest/docs).
         */
        private String terraformResourceType = null;

        /**
         * A filter to return only specified resource types. For more information about resource
         * types supported for the Oracle Cloud Infrastructure [OCI] provider, see [Oracle Cloud
         * Infrastructure Provider](https://registry.terraform.io/providers/oracle/oci/latest/docs).
         *
         * @param terraformResourceType the value to set
         * @return this builder instance
         */
        public Builder terraformResourceType(String terraformResourceType) {
            this.terraformResourceType = terraformResourceType;
            return this;
        }

        /**
         * The number of items returned in a paginated {@code List} call. For information about
         * pagination, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * The number of items returned in a paginated {@code List} call. For information about
         * pagination, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The value of the {@code opc-next-page} response header from the preceding {@code List}
         * call. For information about pagination, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header from the preceding {@code List}
         * call. For information about pagination, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
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
        public Builder copy(ListJobAssociatedResourcesRequest o) {
            jobId(o.getJobId());
            opcRequestId(o.getOpcRequestId());
            compartmentId(o.getCompartmentId());
            terraformResourceType(o.getTerraformResourceType());
            limit(o.getLimit());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListJobAssociatedResourcesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListJobAssociatedResourcesRequest
         */
        public ListJobAssociatedResourcesRequest build() {
            ListJobAssociatedResourcesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListJobAssociatedResourcesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListJobAssociatedResourcesRequest
         */
        public ListJobAssociatedResourcesRequest buildWithoutInvocationCallback() {
            ListJobAssociatedResourcesRequest request = new ListJobAssociatedResourcesRequest();
            request.jobId = jobId;
            request.opcRequestId = opcRequestId;
            request.compartmentId = compartmentId;
            request.terraformResourceType = terraformResourceType;
            request.limit = limit;
            request.page = page;
            return request;
            // new ListJobAssociatedResourcesRequest(jobId, opcRequestId, compartmentId,
            // terraformResourceType, limit, page);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .jobId(jobId)
                .opcRequestId(opcRequestId)
                .compartmentId(compartmentId)
                .terraformResourceType(terraformResourceType)
                .limit(limit)
                .page(page);
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
        sb.append(",jobId=").append(String.valueOf(this.jobId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",terraformResourceType=").append(String.valueOf(this.terraformResourceType));
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
        if (!(o instanceof ListJobAssociatedResourcesRequest)) {
            return false;
        }

        ListJobAssociatedResourcesRequest other = (ListJobAssociatedResourcesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.jobId, other.jobId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.terraformResourceType, other.terraformResourceType)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.jobId == null ? 43 : this.jobId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.terraformResourceType == null
                                ? 43
                                : this.terraformResourceType.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        return result;
    }
}
