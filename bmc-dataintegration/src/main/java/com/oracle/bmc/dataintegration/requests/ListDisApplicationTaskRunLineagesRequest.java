/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.requests;

import com.oracle.bmc.dataintegration.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListDisApplicationTaskRunLineagesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListDisApplicationTaskRunLineagesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
public class ListDisApplicationTaskRunLineagesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The workspace ID. */
    private String workspaceId;

    /** The workspace ID. */
    public String getWorkspaceId() {
        return workspaceId;
    }
    /** The OCID of the DIS Application. */
    private String disApplicationId;

    /** The OCID of the DIS Application. */
    public String getDisApplicationId() {
        return disApplicationId;
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
    /** Specifies the fields to get for an object. */
    private java.util.List<String> fields;

    /** Specifies the fields to get for an object. */
    public java.util.List<String> getFields() {
        return fields;
    }
    /**
     * For list pagination. The value for this parameter is the {@code opc-next-page} or the {@code
     * opc-prev-page} response header from the previous {@code List} call. See [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value for this parameter is the {@code opc-next-page} or the {@code
     * opc-prev-page} response header from the previous {@code List} call. See [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /**
     * Sets the maximum number of results per page, or items to return in a paginated {@code List}
     * call. See [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * Sets the maximum number of results per page, or items to return in a paginated {@code List}
     * call. See [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /** Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending). */
    private SortOrder sortOrder;

    /** Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending). */
    public enum SortOrder implements com.oracle.bmc.http.internal.BmcEnum {
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

    /** Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending). */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * Specifies the field to sort by. Accepts only one field. By default, when you sort by time
     * fields, results are shown in descending order. All other fields default to ascending order.
     * Sorting related parameters are ignored when parameter {@code query} is present (search
     * operation and sorting order is by relevance score in descending order).
     */
    private SortBy sortBy;

    /**
     * Specifies the field to sort by. Accepts only one field. By default, when you sort by time
     * fields, results are shown in descending order. All other fields default to ascending order.
     * Sorting related parameters are ignored when parameter {@code query} is present (search
     * operation and sorting order is by relevance score in descending order).
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("TIME_CREATED"),
        DisplayName("DISPLAY_NAME"),
        TimeUpdated("TIME_UPDATED"),
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
     * Specifies the field to sort by. Accepts only one field. By default, when you sort by time
     * fields, results are shown in descending order. All other fields default to ascending order.
     * Sorting related parameters are ignored when parameter {@code query} is present (search
     * operation and sorting order is by relevance score in descending order).
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * This filter parameter can be used to filter by model specific queryable fields of the object
     * <br>
     * <br>
     * <B>Examples:-</B><br>
     *
     * <ul>
     *   <li><B>?filter=status eq Failed</B> returns all objects that have a status field with value
     *       Failed
     * </ul>
     */
    private java.util.List<String> filter;

    /**
     * This filter parameter can be used to filter by model specific queryable fields of the object
     * <br>
     * <br>
     * <B>Examples:-</B><br>
     *
     * <ul>
     *   <li><B>?filter=status eq Failed</B> returns all objects that have a status field with value
     *       Failed
     * </ul>
     */
    public java.util.List<String> getFilter() {
        return filter;
    }
    /**
     * This parameter allows users to get objects which were updated after a certain time. The
     * format of timeUpdatedGreaterThan is "YYYY-MM-dd'T'HH:mm:ss.SSS'Z'"
     */
    private java.util.Date timeUpdatedGreaterThan;

    /**
     * This parameter allows users to get objects which were updated after a certain time. The
     * format of timeUpdatedGreaterThan is "YYYY-MM-dd'T'HH:mm:ss.SSS'Z'"
     */
    public java.util.Date getTimeUpdatedGreaterThan() {
        return timeUpdatedGreaterThan;
    }
    /**
     * This parameter allows users to get objects which were updated after and at a certain time.
     * The format of timeUpdatedGreaterThanOrEqualTo is "YYYY-MM-dd'T'HH:mm:ss.SSS'Z'"
     */
    private java.util.Date timeUpdatedGreaterThanOrEqualTo;

    /**
     * This parameter allows users to get objects which were updated after and at a certain time.
     * The format of timeUpdatedGreaterThanOrEqualTo is "YYYY-MM-dd'T'HH:mm:ss.SSS'Z'"
     */
    public java.util.Date getTimeUpdatedGreaterThanOrEqualTo() {
        return timeUpdatedGreaterThanOrEqualTo;
    }
    /**
     * This parameter allows users to get objects which were updated before a certain time. The
     * format of timeUpatedLessThan is "YYYY-MM-dd'T'HH:mm:ss.SSS'Z'"
     */
    private java.util.Date timeUpatedLessThan;

    /**
     * This parameter allows users to get objects which were updated before a certain time. The
     * format of timeUpatedLessThan is "YYYY-MM-dd'T'HH:mm:ss.SSS'Z'"
     */
    public java.util.Date getTimeUpatedLessThan() {
        return timeUpatedLessThan;
    }
    /**
     * This parameter allows users to get objects which were updated before and at a certain time.
     * The format of timeUpatedLessThanOrEqualTo is "YYYY-MM-dd'T'HH:mm:ss.SSS'Z'"
     */
    private java.util.Date timeUpatedLessThanOrEqualTo;

    /**
     * This parameter allows users to get objects which were updated before and at a certain time.
     * The format of timeUpatedLessThanOrEqualTo is "YYYY-MM-dd'T'HH:mm:ss.SSS'Z'"
     */
    public java.util.Date getTimeUpatedLessThanOrEqualTo() {
        return timeUpatedLessThanOrEqualTo;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDisApplicationTaskRunLineagesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The workspace ID. */
        private String workspaceId = null;

        /**
         * The workspace ID.
         *
         * @param workspaceId the value to set
         * @return this builder instance
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        /** The OCID of the DIS Application. */
        private String disApplicationId = null;

        /**
         * The OCID of the DIS Application.
         *
         * @param disApplicationId the value to set
         * @return this builder instance
         */
        public Builder disApplicationId(String disApplicationId) {
            this.disApplicationId = disApplicationId;
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

        /** Specifies the fields to get for an object. */
        private java.util.List<String> fields = null;

        /**
         * Specifies the fields to get for an object.
         *
         * @param fields the value to set
         * @return this builder instance
         */
        public Builder fields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Singular setter. Specifies the fields to get for an object.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder fields(String singularValue) {
            return this.fields(java.util.Arrays.asList(singularValue));
        }

        /**
         * For list pagination. The value for this parameter is the {@code opc-next-page} or the
         * {@code opc-prev-page} response header from the previous {@code List} call. See [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value for this parameter is the {@code opc-next-page} or the
         * {@code opc-prev-page} response header from the previous {@code List} call. See [List
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
         * Sets the maximum number of results per page, or items to return in a paginated {@code
         * List} call. See [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * Sets the maximum number of results per page, or items to return in a paginated {@code
         * List} call. See [List
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
         * Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending).
         */
        private SortOrder sortOrder = null;

        /**
         * Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Specifies the field to sort by. Accepts only one field. By default, when you sort by time
         * fields, results are shown in descending order. All other fields default to ascending
         * order. Sorting related parameters are ignored when parameter {@code query} is present
         * (search operation and sorting order is by relevance score in descending order).
         */
        private SortBy sortBy = null;

        /**
         * Specifies the field to sort by. Accepts only one field. By default, when you sort by time
         * fields, results are shown in descending order. All other fields default to ascending
         * order. Sorting related parameters are ignored when parameter {@code query} is present
         * (search operation and sorting order is by relevance score in descending order).
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * This filter parameter can be used to filter by model specific queryable fields of the
         * object <br>
         * <br>
         * <B>Examples:-</B><br>
         *
         * <ul>
         *   <li><B>?filter=status eq Failed</B> returns all objects that have a status field with
         *       value Failed
         * </ul>
         */
        private java.util.List<String> filter = null;

        /**
         * This filter parameter can be used to filter by model specific queryable fields of the
         * object <br>
         * <br>
         * <B>Examples:-</B><br>
         *
         * <ul>
         *   <li><B>?filter=status eq Failed</B> returns all objects that have a status field with
         *       value Failed
         * </ul>
         *
         * @param filter the value to set
         * @return this builder instance
         */
        public Builder filter(java.util.List<String> filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Singular setter. This filter parameter can be used to filter by model specific queryable
         * fields of the object <br>
         * <br>
         * <B>Examples:-</B><br>
         *
         * <ul>
         *   <li><B>?filter=status eq Failed</B> returns all objects that have a status field with
         *       value Failed
         * </ul>
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder filter(String singularValue) {
            return this.filter(java.util.Arrays.asList(singularValue));
        }

        /**
         * This parameter allows users to get objects which were updated after a certain time. The
         * format of timeUpdatedGreaterThan is "YYYY-MM-dd'T'HH:mm:ss.SSS'Z'"
         */
        private java.util.Date timeUpdatedGreaterThan = null;

        /**
         * This parameter allows users to get objects which were updated after a certain time. The
         * format of timeUpdatedGreaterThan is "YYYY-MM-dd'T'HH:mm:ss.SSS'Z'"
         *
         * @param timeUpdatedGreaterThan the value to set
         * @return this builder instance
         */
        public Builder timeUpdatedGreaterThan(java.util.Date timeUpdatedGreaterThan) {
            this.timeUpdatedGreaterThan = timeUpdatedGreaterThan;
            return this;
        }

        /**
         * This parameter allows users to get objects which were updated after and at a certain
         * time. The format of timeUpdatedGreaterThanOrEqualTo is "YYYY-MM-dd'T'HH:mm:ss.SSS'Z'"
         */
        private java.util.Date timeUpdatedGreaterThanOrEqualTo = null;

        /**
         * This parameter allows users to get objects which were updated after and at a certain
         * time. The format of timeUpdatedGreaterThanOrEqualTo is "YYYY-MM-dd'T'HH:mm:ss.SSS'Z'"
         *
         * @param timeUpdatedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeUpdatedGreaterThanOrEqualTo(
                java.util.Date timeUpdatedGreaterThanOrEqualTo) {
            this.timeUpdatedGreaterThanOrEqualTo = timeUpdatedGreaterThanOrEqualTo;
            return this;
        }

        /**
         * This parameter allows users to get objects which were updated before a certain time. The
         * format of timeUpatedLessThan is "YYYY-MM-dd'T'HH:mm:ss.SSS'Z'"
         */
        private java.util.Date timeUpatedLessThan = null;

        /**
         * This parameter allows users to get objects which were updated before a certain time. The
         * format of timeUpatedLessThan is "YYYY-MM-dd'T'HH:mm:ss.SSS'Z'"
         *
         * @param timeUpatedLessThan the value to set
         * @return this builder instance
         */
        public Builder timeUpatedLessThan(java.util.Date timeUpatedLessThan) {
            this.timeUpatedLessThan = timeUpatedLessThan;
            return this;
        }

        /**
         * This parameter allows users to get objects which were updated before and at a certain
         * time. The format of timeUpatedLessThanOrEqualTo is "YYYY-MM-dd'T'HH:mm:ss.SSS'Z'"
         */
        private java.util.Date timeUpatedLessThanOrEqualTo = null;

        /**
         * This parameter allows users to get objects which were updated before and at a certain
         * time. The format of timeUpatedLessThanOrEqualTo is "YYYY-MM-dd'T'HH:mm:ss.SSS'Z'"
         *
         * @param timeUpatedLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeUpatedLessThanOrEqualTo(java.util.Date timeUpatedLessThanOrEqualTo) {
            this.timeUpatedLessThanOrEqualTo = timeUpatedLessThanOrEqualTo;
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
        public Builder copy(ListDisApplicationTaskRunLineagesRequest o) {
            workspaceId(o.getWorkspaceId());
            disApplicationId(o.getDisApplicationId());
            opcRequestId(o.getOpcRequestId());
            fields(o.getFields());
            page(o.getPage());
            limit(o.getLimit());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            filter(o.getFilter());
            timeUpdatedGreaterThan(o.getTimeUpdatedGreaterThan());
            timeUpdatedGreaterThanOrEqualTo(o.getTimeUpdatedGreaterThanOrEqualTo());
            timeUpatedLessThan(o.getTimeUpatedLessThan());
            timeUpatedLessThanOrEqualTo(o.getTimeUpatedLessThanOrEqualTo());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListDisApplicationTaskRunLineagesRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListDisApplicationTaskRunLineagesRequest
         */
        public ListDisApplicationTaskRunLineagesRequest build() {
            ListDisApplicationTaskRunLineagesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDisApplicationTaskRunLineagesRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDisApplicationTaskRunLineagesRequest
         */
        public ListDisApplicationTaskRunLineagesRequest buildWithoutInvocationCallback() {
            ListDisApplicationTaskRunLineagesRequest request =
                    new ListDisApplicationTaskRunLineagesRequest();
            request.workspaceId = workspaceId;
            request.disApplicationId = disApplicationId;
            request.opcRequestId = opcRequestId;
            request.fields = fields;
            request.page = page;
            request.limit = limit;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.filter = filter;
            request.timeUpdatedGreaterThan = timeUpdatedGreaterThan;
            request.timeUpdatedGreaterThanOrEqualTo = timeUpdatedGreaterThanOrEqualTo;
            request.timeUpatedLessThan = timeUpatedLessThan;
            request.timeUpatedLessThanOrEqualTo = timeUpatedLessThanOrEqualTo;
            return request;
            // new ListDisApplicationTaskRunLineagesRequest(workspaceId, disApplicationId,
            // opcRequestId, fields, page, limit, sortOrder, sortBy, filter, timeUpdatedGreaterThan,
            // timeUpdatedGreaterThanOrEqualTo, timeUpatedLessThan, timeUpatedLessThanOrEqualTo);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .workspaceId(workspaceId)
                .disApplicationId(disApplicationId)
                .opcRequestId(opcRequestId)
                .fields(fields)
                .page(page)
                .limit(limit)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .filter(filter)
                .timeUpdatedGreaterThan(timeUpdatedGreaterThan)
                .timeUpdatedGreaterThanOrEqualTo(timeUpdatedGreaterThanOrEqualTo)
                .timeUpatedLessThan(timeUpatedLessThan)
                .timeUpatedLessThanOrEqualTo(timeUpatedLessThanOrEqualTo);
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
        sb.append(",workspaceId=").append(String.valueOf(this.workspaceId));
        sb.append(",disApplicationId=").append(String.valueOf(this.disApplicationId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",fields=").append(String.valueOf(this.fields));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",filter=").append(String.valueOf(this.filter));
        sb.append(",timeUpdatedGreaterThan=").append(String.valueOf(this.timeUpdatedGreaterThan));
        sb.append(",timeUpdatedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeUpdatedGreaterThanOrEqualTo));
        sb.append(",timeUpatedLessThan=").append(String.valueOf(this.timeUpatedLessThan));
        sb.append(",timeUpatedLessThanOrEqualTo=")
                .append(String.valueOf(this.timeUpatedLessThanOrEqualTo));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDisApplicationTaskRunLineagesRequest)) {
            return false;
        }

        ListDisApplicationTaskRunLineagesRequest other =
                (ListDisApplicationTaskRunLineagesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.workspaceId, other.workspaceId)
                && java.util.Objects.equals(this.disApplicationId, other.disApplicationId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.filter, other.filter)
                && java.util.Objects.equals(
                        this.timeUpdatedGreaterThan, other.timeUpdatedGreaterThan)
                && java.util.Objects.equals(
                        this.timeUpdatedGreaterThanOrEqualTo, other.timeUpdatedGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeUpatedLessThan, other.timeUpatedLessThan)
                && java.util.Objects.equals(
                        this.timeUpatedLessThanOrEqualTo, other.timeUpatedLessThanOrEqualTo);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.workspaceId == null ? 43 : this.workspaceId.hashCode());
        result =
                (result * PRIME)
                        + (this.disApplicationId == null ? 43 : this.disApplicationId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.filter == null ? 43 : this.filter.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUpdatedGreaterThan == null
                                ? 43
                                : this.timeUpdatedGreaterThan.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUpdatedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeUpdatedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUpatedLessThan == null
                                ? 43
                                : this.timeUpatedLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUpatedLessThanOrEqualTo == null
                                ? 43
                                : this.timeUpatedLessThanOrEqualTo.hashCode());
        return result;
    }
}
