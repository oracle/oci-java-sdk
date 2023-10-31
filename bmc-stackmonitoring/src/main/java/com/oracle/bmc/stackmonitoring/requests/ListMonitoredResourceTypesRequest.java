/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.requests;

import com.oracle.bmc.stackmonitoring.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/stackmonitoring/ListMonitoredResourceTypesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListMonitoredResourceTypesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
public class ListMonitoredResourceTypesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * tenancy for which monitored resource types should be listed.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * tenancy for which monitored resource types should be listed.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * A filter to return monitored resource types that match exactly with the resource type name
     * given.
     */
    private String name;

    /**
     * A filter to return monitored resource types that match exactly with the resource type name
     * given.
     */
    public String getName() {
        return name;
    }
    /** A filter to return only resources that matches with lifecycleState given. */
    private com.oracle.bmc.stackmonitoring.model.ResourceTypeLifecycleState status;

    /** A filter to return only resources that matches with lifecycleState given. */
    public com.oracle.bmc.stackmonitoring.model.ResourceTypeLifecycleState getStatus() {
        return status;
    }
    /**
     * A filter to exclude system resource types. If set to true, system resource types will be
     * excluded.
     */
    private Boolean isExcludeSystemTypes;

    /**
     * A filter to exclude system resource types. If set to true, system resource types will be
     * excluded.
     */
    public Boolean getIsExcludeSystemTypes() {
        return isExcludeSystemTypes;
    }
    /** A filter to return monitored resource types that has the matching namespace. */
    private String metricNamespace;

    /** A filter to return monitored resource types that has the matching namespace. */
    public String getMetricNamespace() {
        return metricNamespace;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for 'timeUpdated' is
     * descending. Default order for 'name' is ascending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for 'timeUpdated' is
     * descending. Default order for 'name' is ascending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeUpdated("timeUpdated"),
        Name("name"),
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
     * The field to sort by. Only one sort order may be provided. Default order for 'timeUpdated' is
     * descending. Default order for 'name' is ascending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    private com.oracle.bmc.stackmonitoring.model.SortOrder sortOrder;

    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    public com.oracle.bmc.stackmonitoring.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
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
     * Partial response refers to an optimization technique offered by the RESTful web APIs, to
     * return only the information (fields) required by the client. In this mechanism, the client
     * sends the required field names as the query parameters for an API to the server, and the
     * server trims down the default response content by removing the fields that are not required
     * by the client. The parameter controls which fields to return and should be a query string
     * parameter called "fields" of an array type, provide the values as enums, and use
     * collectionFormat.
     *
     * <p>MonitoredResourceType Id, name and compartment will be added by default.
     */
    private java.util.List<String> fields;

    /**
     * Partial response refers to an optimization technique offered by the RESTful web APIs, to
     * return only the information (fields) required by the client. In this mechanism, the client
     * sends the required field names as the query parameters for an API to the server, and the
     * server trims down the default response content by removing the fields that are not required
     * by the client. The parameter controls which fields to return and should be a query string
     * parameter called "fields" of an array type, provide the values as enums, and use
     * collectionFormat.
     *
     * <p>MonitoredResourceType Id, name and compartment will be added by default.
     */
    public java.util.List<String> getFields() {
        return fields;
    }
    /**
     * Partial response refers to an optimization technique offered by the RESTful web APIs, to
     * return all the information except the fields requested to be excluded (excludeFields) by the
     * client. In this mechanism, the client sends the exclude field names as the query parameters
     * for an API to the server, and the server trims down the default response content by removing
     * the fields that are not required by the client. The parameter controls which fields to exlude
     * and to return and should be a query string parameter called "excludeFields" of an array type,
     * provide the values as enums, and use collectionFormat.
     */
    private java.util.List<String> excludeFields;

    /**
     * Partial response refers to an optimization technique offered by the RESTful web APIs, to
     * return all the information except the fields requested to be excluded (excludeFields) by the
     * client. In this mechanism, the client sends the exclude field names as the query parameters
     * for an API to the server, and the server trims down the default response content by removing
     * the fields that are not required by the client. The parameter controls which fields to exlude
     * and to return and should be a query string parameter called "excludeFields" of an array type,
     * provide the values as enums, and use collectionFormat.
     */
    public java.util.List<String> getExcludeFields() {
        return excludeFields;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListMonitoredResourceTypesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * tenancy for which monitored resource types should be listed.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * tenancy for which monitored resource types should be listed.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A filter to return monitored resource types that match exactly with the resource type
         * name given.
         */
        private String name = null;

        /**
         * A filter to return monitored resource types that match exactly with the resource type
         * name given.
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /** A filter to return only resources that matches with lifecycleState given. */
        private com.oracle.bmc.stackmonitoring.model.ResourceTypeLifecycleState status = null;

        /**
         * A filter to return only resources that matches with lifecycleState given.
         *
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(
                com.oracle.bmc.stackmonitoring.model.ResourceTypeLifecycleState status) {
            this.status = status;
            return this;
        }

        /**
         * A filter to exclude system resource types. If set to true, system resource types will be
         * excluded.
         */
        private Boolean isExcludeSystemTypes = null;

        /**
         * A filter to exclude system resource types. If set to true, system resource types will be
         * excluded.
         *
         * @param isExcludeSystemTypes the value to set
         * @return this builder instance
         */
        public Builder isExcludeSystemTypes(Boolean isExcludeSystemTypes) {
            this.isExcludeSystemTypes = isExcludeSystemTypes;
            return this;
        }

        /** A filter to return monitored resource types that has the matching namespace. */
        private String metricNamespace = null;

        /**
         * A filter to return monitored resource types that has the matching namespace.
         *
         * @param metricNamespace the value to set
         * @return this builder instance
         */
        public Builder metricNamespace(String metricNamespace) {
            this.metricNamespace = metricNamespace;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for
         * 'timeUpdated' is descending. Default order for 'name' is ascending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for
         * 'timeUpdated' is descending. Default order for 'name' is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
        private com.oracle.bmc.stackmonitoring.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.stackmonitoring.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
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
         * Partial response refers to an optimization technique offered by the RESTful web APIs, to
         * return only the information (fields) required by the client. In this mechanism, the
         * client sends the required field names as the query parameters for an API to the server,
         * and the server trims down the default response content by removing the fields that are
         * not required by the client. The parameter controls which fields to return and should be a
         * query string parameter called "fields" of an array type, provide the values as enums, and
         * use collectionFormat.
         *
         * <p>MonitoredResourceType Id, name and compartment will be added by default.
         */
        private java.util.List<String> fields = null;

        /**
         * Partial response refers to an optimization technique offered by the RESTful web APIs, to
         * return only the information (fields) required by the client. In this mechanism, the
         * client sends the required field names as the query parameters for an API to the server,
         * and the server trims down the default response content by removing the fields that are
         * not required by the client. The parameter controls which fields to return and should be a
         * query string parameter called "fields" of an array type, provide the values as enums, and
         * use collectionFormat.
         *
         * <p>MonitoredResourceType Id, name and compartment will be added by default.
         *
         * @param fields the value to set
         * @return this builder instance
         */
        public Builder fields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Singular setter. Partial response refers to an optimization technique offered by the
         * RESTful web APIs, to return only the information (fields) required by the client. In this
         * mechanism, the client sends the required field names as the query parameters for an API
         * to the server, and the server trims down the default response content by removing the
         * fields that are not required by the client. The parameter controls which fields to return
         * and should be a query string parameter called "fields" of an array type, provide the
         * values as enums, and use collectionFormat.
         *
         * <p>MonitoredResourceType Id, name and compartment will be added by default.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder fields(String singularValue) {
            return this.fields(java.util.Arrays.asList(singularValue));
        }

        /**
         * Partial response refers to an optimization technique offered by the RESTful web APIs, to
         * return all the information except the fields requested to be excluded (excludeFields) by
         * the client. In this mechanism, the client sends the exclude field names as the query
         * parameters for an API to the server, and the server trims down the default response
         * content by removing the fields that are not required by the client. The parameter
         * controls which fields to exlude and to return and should be a query string parameter
         * called "excludeFields" of an array type, provide the values as enums, and use
         * collectionFormat.
         */
        private java.util.List<String> excludeFields = null;

        /**
         * Partial response refers to an optimization technique offered by the RESTful web APIs, to
         * return all the information except the fields requested to be excluded (excludeFields) by
         * the client. In this mechanism, the client sends the exclude field names as the query
         * parameters for an API to the server, and the server trims down the default response
         * content by removing the fields that are not required by the client. The parameter
         * controls which fields to exlude and to return and should be a query string parameter
         * called "excludeFields" of an array type, provide the values as enums, and use
         * collectionFormat.
         *
         * @param excludeFields the value to set
         * @return this builder instance
         */
        public Builder excludeFields(java.util.List<String> excludeFields) {
            this.excludeFields = excludeFields;
            return this;
        }

        /**
         * Singular setter. Partial response refers to an optimization technique offered by the
         * RESTful web APIs, to return all the information except the fields requested to be
         * excluded (excludeFields) by the client. In this mechanism, the client sends the exclude
         * field names as the query parameters for an API to the server, and the server trims down
         * the default response content by removing the fields that are not required by the client.
         * The parameter controls which fields to exlude and to return and should be a query string
         * parameter called "excludeFields" of an array type, provide the values as enums, and use
         * collectionFormat.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder excludeFields(String singularValue) {
            return this.excludeFields(java.util.Arrays.asList(singularValue));
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
        public Builder copy(ListMonitoredResourceTypesRequest o) {
            compartmentId(o.getCompartmentId());
            name(o.getName());
            status(o.getStatus());
            isExcludeSystemTypes(o.getIsExcludeSystemTypes());
            metricNamespace(o.getMetricNamespace());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            fields(o.getFields());
            excludeFields(o.getExcludeFields());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListMonitoredResourceTypesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListMonitoredResourceTypesRequest
         */
        public ListMonitoredResourceTypesRequest build() {
            ListMonitoredResourceTypesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListMonitoredResourceTypesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListMonitoredResourceTypesRequest
         */
        public ListMonitoredResourceTypesRequest buildWithoutInvocationCallback() {
            ListMonitoredResourceTypesRequest request = new ListMonitoredResourceTypesRequest();
            request.compartmentId = compartmentId;
            request.name = name;
            request.status = status;
            request.isExcludeSystemTypes = isExcludeSystemTypes;
            request.metricNamespace = metricNamespace;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            request.fields = fields;
            request.excludeFields = excludeFields;
            return request;
            // new ListMonitoredResourceTypesRequest(compartmentId, name, status,
            // isExcludeSystemTypes, metricNamespace, sortBy, sortOrder, limit, page, opcRequestId,
            // fields, excludeFields);
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
                .status(status)
                .isExcludeSystemTypes(isExcludeSystemTypes)
                .metricNamespace(metricNamespace)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId)
                .fields(fields)
                .excludeFields(excludeFields);
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
        sb.append(",status=").append(String.valueOf(this.status));
        sb.append(",isExcludeSystemTypes=").append(String.valueOf(this.isExcludeSystemTypes));
        sb.append(",metricNamespace=").append(String.valueOf(this.metricNamespace));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",fields=").append(String.valueOf(this.fields));
        sb.append(",excludeFields=").append(String.valueOf(this.excludeFields));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListMonitoredResourceTypesRequest)) {
            return false;
        }

        ListMonitoredResourceTypesRequest other = (ListMonitoredResourceTypesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.isExcludeSystemTypes, other.isExcludeSystemTypes)
                && java.util.Objects.equals(this.metricNamespace, other.metricNamespace)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.excludeFields, other.excludeFields);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.isExcludeSystemTypes == null
                                ? 43
                                : this.isExcludeSystemTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.metricNamespace == null ? 43 : this.metricNamespace.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result =
                (result * PRIME)
                        + (this.excludeFields == null ? 43 : this.excludeFields.hashCode());
        return result;
    }
}
