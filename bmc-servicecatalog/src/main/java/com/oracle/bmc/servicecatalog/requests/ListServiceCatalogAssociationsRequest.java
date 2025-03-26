/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicecatalog.requests;

import com.oracle.bmc.servicecatalog.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/servicecatalog/ListServiceCatalogAssociationsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListServiceCatalogAssociationsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210527")
public class ListServiceCatalogAssociationsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The unique identifier for the service catalog association.
     */
    private String serviceCatalogAssociationId;

    /**
     * The unique identifier for the service catalog association.
     */
    public String getServiceCatalogAssociationId() {
        return serviceCatalogAssociationId;
    }
    /**
     * The unique identifier for the service catalog.
     */
    private String serviceCatalogId;

    /**
     * The unique identifier for the service catalog.
     */
    public String getServiceCatalogId() {
        return serviceCatalogId;
    }
    /**
     * The unique identifier of the entity associated with service catalog.
     */
    private String entityId;

    /**
     * The unique identifier of the entity associated with service catalog.
     */
    public String getEntityId() {
        return entityId;
    }
    /**
     * The type of the application in the service catalog.
     */
    private String entityType;

    /**
     * The type of the application in the service catalog.
     */
    public String getEntityType() {
        return entityType;
    }
    /**
     * How many records to return. Specify a value greater than zero and less than or equal to 1000. The default is 30.
     *
     */
    private Integer limit;

    /**
     * How many records to return. Specify a value greater than zero and less than or equal to 1000. The default is 30.
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The value of the {@code opc-next-page} response header from the previous "List" call.
     */
    private String page;

    /**
     * The value of the {@code opc-next-page} response header from the previous "List" call.
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order to apply, either {@code ASC} or {@code DESC}. Default is {@code ASC}.
     */
    private SortOrder sortOrder;

    /**
     * The sort order to apply, either {@code ASC} or {@code DESC}. Default is {@code ASC}.
     **/
    public enum SortOrder {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };

    /**
     * The sort order to apply, either {@code ASC} or {@code DESC}. Default is {@code ASC}.
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * Default is {@code TIMECREATED}
     */
    private SortBy sortBy;

    /**
     * Default is {@code TIMECREATED}
     **/
    public enum SortBy {
        Timecreated("TIMECREATED"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };

    /**
     * Default is {@code TIMECREATED}
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListServiceCatalogAssociationsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The unique identifier for the service catalog association.
         */
        private String serviceCatalogAssociationId = null;

        /**
         * The unique identifier for the service catalog association.
         * @param serviceCatalogAssociationId the value to set
         * @return this builder instance
         */
        public Builder serviceCatalogAssociationId(String serviceCatalogAssociationId) {
            this.serviceCatalogAssociationId = serviceCatalogAssociationId;
            return this;
        }

        /**
         * The unique identifier for the service catalog.
         */
        private String serviceCatalogId = null;

        /**
         * The unique identifier for the service catalog.
         * @param serviceCatalogId the value to set
         * @return this builder instance
         */
        public Builder serviceCatalogId(String serviceCatalogId) {
            this.serviceCatalogId = serviceCatalogId;
            return this;
        }

        /**
         * The unique identifier of the entity associated with service catalog.
         */
        private String entityId = null;

        /**
         * The unique identifier of the entity associated with service catalog.
         * @param entityId the value to set
         * @return this builder instance
         */
        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * The type of the application in the service catalog.
         */
        private String entityType = null;

        /**
         * The type of the application in the service catalog.
         * @param entityType the value to set
         * @return this builder instance
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * How many records to return. Specify a value greater than zero and less than or equal to 1000. The default is 30.
         *
         */
        private Integer limit = null;

        /**
         * How many records to return. Specify a value greater than zero and less than or equal to 1000. The default is 30.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The value of the {@code opc-next-page} response header from the previous "List" call.
         */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header from the previous "List" call.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The sort order to apply, either {@code ASC} or {@code DESC}. Default is {@code ASC}.
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to apply, either {@code ASC} or {@code DESC}. Default is {@code ASC}.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Default is {@code TIMECREATED}
         */
        private SortBy sortBy = null;

        /**
         * Default is {@code TIMECREATED}
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
         * please provide the request ID.
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
        public Builder copy(ListServiceCatalogAssociationsRequest o) {
            serviceCatalogAssociationId(o.getServiceCatalogAssociationId());
            serviceCatalogId(o.getServiceCatalogId());
            entityId(o.getEntityId());
            entityType(o.getEntityType());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListServiceCatalogAssociationsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListServiceCatalogAssociationsRequest
         */
        public ListServiceCatalogAssociationsRequest build() {
            ListServiceCatalogAssociationsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListServiceCatalogAssociationsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListServiceCatalogAssociationsRequest
         */
        public ListServiceCatalogAssociationsRequest buildWithoutInvocationCallback() {
            ListServiceCatalogAssociationsRequest request =
                    new ListServiceCatalogAssociationsRequest();
            request.serviceCatalogAssociationId = serviceCatalogAssociationId;
            request.serviceCatalogId = serviceCatalogId;
            request.entityId = entityId;
            request.entityType = entityType;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListServiceCatalogAssociationsRequest(serviceCatalogAssociationId, serviceCatalogId, entityId, entityType, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .serviceCatalogAssociationId(serviceCatalogAssociationId)
                .serviceCatalogId(serviceCatalogId)
                .entityId(entityId)
                .entityType(entityType)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId);
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
        sb.append(",serviceCatalogAssociationId=")
                .append(String.valueOf(this.serviceCatalogAssociationId));
        sb.append(",serviceCatalogId=").append(String.valueOf(this.serviceCatalogId));
        sb.append(",entityId=").append(String.valueOf(this.entityId));
        sb.append(",entityType=").append(String.valueOf(this.entityType));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListServiceCatalogAssociationsRequest)) {
            return false;
        }

        ListServiceCatalogAssociationsRequest other = (ListServiceCatalogAssociationsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.serviceCatalogAssociationId, other.serviceCatalogAssociationId)
                && java.util.Objects.equals(this.serviceCatalogId, other.serviceCatalogId)
                && java.util.Objects.equals(this.entityId, other.entityId)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.serviceCatalogAssociationId == null
                                ? 43
                                : this.serviceCatalogAssociationId.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceCatalogId == null ? 43 : this.serviceCatalogId.hashCode());
        result = (result * PRIME) + (this.entityId == null ? 43 : this.entityId.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
