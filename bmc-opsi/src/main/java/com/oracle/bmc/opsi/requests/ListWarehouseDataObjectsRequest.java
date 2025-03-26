/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListWarehouseDataObjectsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListWarehouseDataObjectsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class ListWarehouseDataObjectsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Type of the Warehouse.
     */
    private WarehouseType warehouseType;

    /**
     * Type of the Warehouse.
     **/
    public enum WarehouseType {
        AwrHubs("awrHubs"),
        ;

        private final String value;
        private static java.util.Map<String, WarehouseType> map;

        static {
            map = new java.util.HashMap<>();
            for (WarehouseType v : WarehouseType.values()) {
                map.put(v.getValue(), v);
            }
        }

        WarehouseType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static WarehouseType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid WarehouseType: " + key);
        }
    };

    /**
     * Type of the Warehouse.
     */
    public WarehouseType getWarehouseType() {
        return warehouseType;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a Warehouse.
     *
     */
    private String warehouseId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a Warehouse.
     *
     */
    public String getWarehouseId() {
        return warehouseId;
    }
    /**
     * A filter to return only data objects that match the data object type. By default, no filtering will be applied on data object type.
     */
    private java.util.List<com.oracle.bmc.opsi.model.DataObjectType> dataObjectType;

    /**
     * A filter to return only data objects that match the data object type. By default, no filtering will be applied on data object type.
     */
    public java.util.List<com.oracle.bmc.opsi.model.DataObjectType> getDataObjectType() {
        return dataObjectType;
    }
    /**
     * A filter to return only data objects that match the entire data object name. By default, no filtering will be applied on data object name.
     */
    private String name;

    /**
     * A filter to return only data objects that match the entire data object name. By default, no filtering will be applied on data object name.
     */
    public String getName() {
        return name;
    }
    /**
     * A filter to return only data objects that match the entire data object owner name.  By default, no filtering will be applied on data object owner name.
     */
    private String owner;

    /**
     * A filter to return only data objects that match the entire data object owner name.  By default, no filtering will be applied on data object owner name.
     */
    public String getOwner() {
        return owner;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to
     * return in a paginated "List" call.
     * For important details about how pagination works, see
     * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * Example: {@code 50}
     *
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to
     * return in a paginated "List" call.
     * For important details about how pagination works, see
     * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * Example: {@code 50}
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from
     * the previous "List" call. For important details about how pagination works,
     * see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from
     * the previous "List" call. For important details about how pagination works,
     * see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    private com.oracle.bmc.opsi.model.SortOrder sortOrder;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    public com.oracle.bmc.opsi.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * Sort options for Warehouse data objects list.
     */
    private SortBy sortBy;

    /**
     * Sort options for Warehouse data objects list.
     **/
    public enum SortBy {
        DataObjectType("dataObjectType"),
        Name("name"),
        Owner("owner"),
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
     * Sort options for Warehouse data objects list.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * Specifies the optional fields to return in a WarehouseDataObjectSummary. Unless requested, these fields are not returned by default.
     *
     */
    private java.util.List<SummaryField> summaryField;

    /**
     * Specifies the optional fields to return in a WarehouseDataObjectSummary. Unless requested, these fields are not returned by default.
     *
     **/
    public enum SummaryField {
        Details("details"),
        ;

        private final String value;
        private static java.util.Map<String, SummaryField> map;

        static {
            map = new java.util.HashMap<>();
            for (SummaryField v : SummaryField.values()) {
                map.put(v.getValue(), v);
            }
        }

        SummaryField(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SummaryField create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SummaryField: " + key);
        }
    };

    /**
     * Specifies the optional fields to return in a WarehouseDataObjectSummary. Unless requested, these fields are not returned by default.
     *
     */
    public java.util.List<SummaryField> getSummaryField() {
        return summaryField;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListWarehouseDataObjectsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Type of the Warehouse.
         */
        private WarehouseType warehouseType = null;

        /**
         * Type of the Warehouse.
         * @param warehouseType the value to set
         * @return this builder instance
         */
        public Builder warehouseType(WarehouseType warehouseType) {
            this.warehouseType = warehouseType;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a Warehouse.
         *
         */
        private String warehouseId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a Warehouse.
         *
         * @param warehouseId the value to set
         * @return this builder instance
         */
        public Builder warehouseId(String warehouseId) {
            this.warehouseId = warehouseId;
            return this;
        }

        /**
         * A filter to return only data objects that match the data object type. By default, no filtering will be applied on data object type.
         */
        private java.util.List<com.oracle.bmc.opsi.model.DataObjectType> dataObjectType = null;

        /**
         * A filter to return only data objects that match the data object type. By default, no filtering will be applied on data object type.
         * @param dataObjectType the value to set
         * @return this builder instance
         */
        public Builder dataObjectType(
                java.util.List<com.oracle.bmc.opsi.model.DataObjectType> dataObjectType) {
            this.dataObjectType = dataObjectType;
            return this;
        }

        /**
         * Singular setter. A filter to return only data objects that match the data object type. By default, no filtering will be applied on data object type.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder dataObjectType(DataObjectType singularValue) {
            return this.dataObjectType(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return only data objects that match the entire data object name. By default, no filtering will be applied on data object name.
         */
        private String name = null;

        /**
         * A filter to return only data objects that match the entire data object name. By default, no filtering will be applied on data object name.
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * A filter to return only data objects that match the entire data object owner name.  By default, no filtering will be applied on data object owner name.
         */
        private String owner = null;

        /**
         * A filter to return only data objects that match the entire data object owner name.  By default, no filtering will be applied on data object owner name.
         * @param owner the value to set
         * @return this builder instance
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to
         * return in a paginated "List" call.
         * For important details about how pagination works, see
         * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * Example: {@code 50}
         *
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to
         * return in a paginated "List" call.
         * For important details about how pagination works, see
         * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * Example: {@code 50}
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from
         * the previous "List" call. For important details about how pagination works,
         * see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from
         * the previous "List" call. For important details about how pagination works,
         * see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         */
        private com.oracle.bmc.opsi.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.opsi.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Sort options for Warehouse data objects list.
         */
        private SortBy sortBy = null;

        /**
         * Sort options for Warehouse data objects list.
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Specifies the optional fields to return in a WarehouseDataObjectSummary. Unless requested, these fields are not returned by default.
         *
         */
        private java.util.List<SummaryField> summaryField = null;

        /**
         * Specifies the optional fields to return in a WarehouseDataObjectSummary. Unless requested, these fields are not returned by default.
         *
         * @param summaryField the value to set
         * @return this builder instance
         */
        public Builder summaryField(java.util.List<SummaryField> summaryField) {
            this.summaryField = summaryField;
            return this;
        }

        /**
         * Singular setter. Specifies the optional fields to return in a WarehouseDataObjectSummary. Unless requested, these fields are not returned by default.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder summaryField(SummaryField singularValue) {
            return this.summaryField(java.util.Arrays.asList(singularValue));
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
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
        public Builder copy(ListWarehouseDataObjectsRequest o) {
            warehouseType(o.getWarehouseType());
            warehouseId(o.getWarehouseId());
            dataObjectType(o.getDataObjectType());
            name(o.getName());
            owner(o.getOwner());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            summaryField(o.getSummaryField());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListWarehouseDataObjectsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListWarehouseDataObjectsRequest
         */
        public ListWarehouseDataObjectsRequest build() {
            ListWarehouseDataObjectsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListWarehouseDataObjectsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListWarehouseDataObjectsRequest
         */
        public ListWarehouseDataObjectsRequest buildWithoutInvocationCallback() {
            ListWarehouseDataObjectsRequest request = new ListWarehouseDataObjectsRequest();
            request.warehouseType = warehouseType;
            request.warehouseId = warehouseId;
            request.dataObjectType = dataObjectType;
            request.name = name;
            request.owner = owner;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.summaryField = summaryField;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListWarehouseDataObjectsRequest(warehouseType, warehouseId, dataObjectType, name, owner, limit, page, sortOrder, sortBy, summaryField, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .warehouseType(warehouseType)
                .warehouseId(warehouseId)
                .dataObjectType(dataObjectType)
                .name(name)
                .owner(owner)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .summaryField(summaryField)
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
        sb.append(",warehouseType=").append(String.valueOf(this.warehouseType));
        sb.append(",warehouseId=").append(String.valueOf(this.warehouseId));
        sb.append(",dataObjectType=").append(String.valueOf(this.dataObjectType));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",owner=").append(String.valueOf(this.owner));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",summaryField=").append(String.valueOf(this.summaryField));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListWarehouseDataObjectsRequest)) {
            return false;
        }

        ListWarehouseDataObjectsRequest other = (ListWarehouseDataObjectsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.warehouseType, other.warehouseType)
                && java.util.Objects.equals(this.warehouseId, other.warehouseId)
                && java.util.Objects.equals(this.dataObjectType, other.dataObjectType)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.summaryField, other.summaryField)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.warehouseType == null ? 43 : this.warehouseType.hashCode());
        result = (result * PRIME) + (this.warehouseId == null ? 43 : this.warehouseId.hashCode());
        result =
                (result * PRIME)
                        + (this.dataObjectType == null ? 43 : this.dataObjectType.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.summaryField == null ? 43 : this.summaryField.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
