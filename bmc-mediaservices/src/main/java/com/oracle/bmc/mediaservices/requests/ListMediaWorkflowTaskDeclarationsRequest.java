/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.requests;

import com.oracle.bmc.mediaservices.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mediaservices/ListMediaWorkflowTaskDeclarationsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListMediaWorkflowTaskDeclarationsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
public class ListMediaWorkflowTaskDeclarationsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The ID of the compartment in which to list resources. */
    private String compartmentId;

    /** The ID of the compartment in which to list resources. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * A filter to return only the resources with their system defined, unique name matching the
     * given name.
     */
    private String name;

    /**
     * A filter to return only the resources with their system defined, unique name matching the
     * given name.
     */
    public String getName() {
        return name;
    }
    /** A filter to select MediaWorkflowTaskDeclaration by version. */
    private Integer version;

    /** A filter to select MediaWorkflowTaskDeclaration by version. */
    public Integer getVersion() {
        return version;
    }
    /** A filter to only select the newest version for each MediaWorkflowTaskDeclaration name. */
    private Boolean isCurrent;

    /** A filter to only select the newest version for each MediaWorkflowTaskDeclaration name. */
    public Boolean getIsCurrent() {
        return isCurrent;
    }
    /** The field to sort by. Only one sort order may be provided. */
    private com.oracle.bmc.mediaservices.model.MediaWorkflowTaskDeclarationSortBy sortBy;

    /** The field to sort by. Only one sort order may be provided. */
    public com.oracle.bmc.mediaservices.model.MediaWorkflowTaskDeclarationSortBy getSortBy() {
        return sortBy;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
     */
    public String getPage() {
        return page;
    }
    /** The sort order to use, either 'ASC' or 'DESC'. */
    private com.oracle.bmc.mediaservices.model.SortOrder sortOrder;

    /** The sort order to use, either 'ASC' or 'DESC'. */
    public com.oracle.bmc.mediaservices.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListMediaWorkflowTaskDeclarationsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The ID of the compartment in which to list resources. */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A filter to return only the resources with their system defined, unique name matching the
         * given name.
         */
        private String name = null;

        /**
         * A filter to return only the resources with their system defined, unique name matching the
         * given name.
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /** A filter to select MediaWorkflowTaskDeclaration by version. */
        private Integer version = null;

        /**
         * A filter to select MediaWorkflowTaskDeclaration by version.
         *
         * @param version the value to set
         * @return this builder instance
         */
        public Builder version(Integer version) {
            this.version = version;
            return this;
        }

        /**
         * A filter to only select the newest version for each MediaWorkflowTaskDeclaration name.
         */
        private Boolean isCurrent = null;

        /**
         * A filter to only select the newest version for each MediaWorkflowTaskDeclaration name.
         *
         * @param isCurrent the value to set
         * @return this builder instance
         */
        public Builder isCurrent(Boolean isCurrent) {
            this.isCurrent = isCurrent;
            return this;
        }

        /** The field to sort by. Only one sort order may be provided. */
        private com.oracle.bmc.mediaservices.model.MediaWorkflowTaskDeclarationSortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(
                com.oracle.bmc.mediaservices.model.MediaWorkflowTaskDeclarationSortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The maximum number of items to return. */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} header field of a previous response.
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} header field of a previous response.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order to use, either 'ASC' or 'DESC'. */
        private com.oracle.bmc.mediaservices.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.mediaservices.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(ListMediaWorkflowTaskDeclarationsRequest o) {
            compartmentId(o.getCompartmentId());
            name(o.getName());
            version(o.getVersion());
            isCurrent(o.getIsCurrent());
            sortBy(o.getSortBy());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListMediaWorkflowTaskDeclarationsRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListMediaWorkflowTaskDeclarationsRequest
         */
        public ListMediaWorkflowTaskDeclarationsRequest build() {
            ListMediaWorkflowTaskDeclarationsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListMediaWorkflowTaskDeclarationsRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListMediaWorkflowTaskDeclarationsRequest
         */
        public ListMediaWorkflowTaskDeclarationsRequest buildWithoutInvocationCallback() {
            ListMediaWorkflowTaskDeclarationsRequest request =
                    new ListMediaWorkflowTaskDeclarationsRequest();
            request.compartmentId = compartmentId;
            request.name = name;
            request.version = version;
            request.isCurrent = isCurrent;
            request.sortBy = sortBy;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListMediaWorkflowTaskDeclarationsRequest(compartmentId, name, version, isCurrent,
            // sortBy, limit, page, sortOrder, opcRequestId);
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
                .name(name)
                .version(version)
                .isCurrent(isCurrent)
                .sortBy(sortBy)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",version=").append(String.valueOf(this.version));
        sb.append(",isCurrent=").append(String.valueOf(this.isCurrent));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListMediaWorkflowTaskDeclarationsRequest)) {
            return false;
        }

        ListMediaWorkflowTaskDeclarationsRequest other =
                (ListMediaWorkflowTaskDeclarationsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.isCurrent, other.isCurrent)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.isCurrent == null ? 43 : this.isCurrent.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
