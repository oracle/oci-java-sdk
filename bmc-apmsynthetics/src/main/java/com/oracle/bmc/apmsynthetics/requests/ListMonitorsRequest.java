/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.requests;

import com.oracle.bmc.apmsynthetics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmsynthetics/ListMonitorsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListMonitorsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class ListMonitorsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The APM domain ID the request is intended for. */
    private String apmDomainId;

    /** The APM domain ID the request is intended for. */
    public String getApmDomainId() {
        return apmDomainId;
    }
    /** A filter to return only the resources that match the entire display name. */
    private String displayName;

    /** A filter to return only the resources that match the entire display name. */
    public String getDisplayName() {
        return displayName;
    }
    /** A filter to return only monitors using scriptId. */
    private String scriptId;

    /** A filter to return only monitors using scriptId. */
    public String getScriptId() {
        return scriptId;
    }
    /** The name of the public or dedicated vantage point. */
    private String vantagePoint;

    /** The name of the public or dedicated vantage point. */
    public String getVantagePoint() {
        return vantagePoint;
    }
    /**
     * A filter to return only monitors that match the given monitor type. Supported values are
     * SCRIPTED_BROWSER, BROWSER, SCRIPTED_REST and REST.
     */
    private String monitorType;

    /**
     * A filter to return only monitors that match the given monitor type. Supported values are
     * SCRIPTED_BROWSER, BROWSER, SCRIPTED_REST and REST.
     */
    public String getMonitorType() {
        return monitorType;
    }
    /** A filter to return only monitors that match the status given. */
    private com.oracle.bmc.apmsynthetics.model.MonitorStatus status;

    /** A filter to return only monitors that match the status given. */
    public com.oracle.bmc.apmsynthetics.model.MonitorStatus getStatus() {
        return status;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The maximum number of results per page, or items to return in a paginated "List" call. For
     * information on how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 50}
     */
    private String page;

    /**
     * The maximum number of results per page, or items to return in a paginated "List" call. For
     * information on how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 50}
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). Default
     * sort order is ascending.
     */
    private com.oracle.bmc.apmsynthetics.model.SortOrders sortOrder;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). Default
     * sort order is ascending.
     */
    public com.oracle.bmc.apmsynthetics.model.SortOrders getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order of displayName is
     * ascending. Default order of timeCreated and timeUpdated is descending. The displayName sort
     * by is case insensitive.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order of displayName is
     * ascending. Default order of timeCreated and timeUpdated is descending. The displayName sort
     * by is case insensitive.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        DisplayName("displayName"),
        TimeCreated("timeCreated"),
        TimeUpdated("timeUpdated"),
        Status("status"),
        MonitorType("monitorType"),
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
     * The field to sort by. Only one sort order may be provided. Default order of displayName is
     * ascending. Default order of timeCreated and timeUpdated is descending. The displayName sort
     * by is case insensitive.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListMonitorsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The APM domain ID the request is intended for. */
        private String apmDomainId = null;

        /**
         * The APM domain ID the request is intended for.
         *
         * @param apmDomainId the value to set
         * @return this builder instance
         */
        public Builder apmDomainId(String apmDomainId) {
            this.apmDomainId = apmDomainId;
            return this;
        }

        /** A filter to return only the resources that match the entire display name. */
        private String displayName = null;

        /**
         * A filter to return only the resources that match the entire display name.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /** A filter to return only monitors using scriptId. */
        private String scriptId = null;

        /**
         * A filter to return only monitors using scriptId.
         *
         * @param scriptId the value to set
         * @return this builder instance
         */
        public Builder scriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }

        /** The name of the public or dedicated vantage point. */
        private String vantagePoint = null;

        /**
         * The name of the public or dedicated vantage point.
         *
         * @param vantagePoint the value to set
         * @return this builder instance
         */
        public Builder vantagePoint(String vantagePoint) {
            this.vantagePoint = vantagePoint;
            return this;
        }

        /**
         * A filter to return only monitors that match the given monitor type. Supported values are
         * SCRIPTED_BROWSER, BROWSER, SCRIPTED_REST and REST.
         */
        private String monitorType = null;

        /**
         * A filter to return only monitors that match the given monitor type. Supported values are
         * SCRIPTED_BROWSER, BROWSER, SCRIPTED_REST and REST.
         *
         * @param monitorType the value to set
         * @return this builder instance
         */
        public Builder monitorType(String monitorType) {
            this.monitorType = monitorType;
            return this;
        }

        /** A filter to return only monitors that match the status given. */
        private com.oracle.bmc.apmsynthetics.model.MonitorStatus status = null;

        /**
         * A filter to return only monitors that match the status given.
         *
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(com.oracle.bmc.apmsynthetics.model.MonitorStatus status) {
            this.status = status;
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
         * The maximum number of results per page, or items to return in a paginated "List" call.
         * For information on how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 50}
         */
        private String page = null;

        /**
         * The maximum number of results per page, or items to return in a paginated "List" call.
         * For information on how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 50}
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
         * Default sort order is ascending.
         */
        private com.oracle.bmc.apmsynthetics.model.SortOrders sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         * Default sort order is ascending.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.apmsynthetics.model.SortOrders sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order of displayName
         * is ascending. Default order of timeCreated and timeUpdated is descending. The displayName
         * sort by is case insensitive.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order of displayName
         * is ascending. Default order of timeCreated and timeUpdated is descending. The displayName
         * sort by is case insensitive.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
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
        public Builder copy(ListMonitorsRequest o) {
            apmDomainId(o.getApmDomainId());
            displayName(o.getDisplayName());
            scriptId(o.getScriptId());
            vantagePoint(o.getVantagePoint());
            monitorType(o.getMonitorType());
            status(o.getStatus());
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
         * Build the instance of ListMonitorsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListMonitorsRequest
         */
        public ListMonitorsRequest build() {
            ListMonitorsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListMonitorsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListMonitorsRequest
         */
        public ListMonitorsRequest buildWithoutInvocationCallback() {
            ListMonitorsRequest request = new ListMonitorsRequest();
            request.apmDomainId = apmDomainId;
            request.displayName = displayName;
            request.scriptId = scriptId;
            request.vantagePoint = vantagePoint;
            request.monitorType = monitorType;
            request.status = status;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListMonitorsRequest(apmDomainId, displayName, scriptId, vantagePoint,
            // monitorType, status, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .apmDomainId(apmDomainId)
                .displayName(displayName)
                .scriptId(scriptId)
                .vantagePoint(vantagePoint)
                .monitorType(monitorType)
                .status(status)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
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
        sb.append(",apmDomainId=").append(String.valueOf(this.apmDomainId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",scriptId=").append(String.valueOf(this.scriptId));
        sb.append(",vantagePoint=").append(String.valueOf(this.vantagePoint));
        sb.append(",monitorType=").append(String.valueOf(this.monitorType));
        sb.append(",status=").append(String.valueOf(this.status));
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
        if (!(o instanceof ListMonitorsRequest)) {
            return false;
        }

        ListMonitorsRequest other = (ListMonitorsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.apmDomainId, other.apmDomainId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.scriptId, other.scriptId)
                && java.util.Objects.equals(this.vantagePoint, other.vantagePoint)
                && java.util.Objects.equals(this.monitorType, other.monitorType)
                && java.util.Objects.equals(this.status, other.status)
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
        result = (result * PRIME) + (this.apmDomainId == null ? 43 : this.apmDomainId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.scriptId == null ? 43 : this.scriptId.hashCode());
        result = (result * PRIME) + (this.vantagePoint == null ? 43 : this.vantagePoint.hashCode());
        result = (result * PRIME) + (this.monitorType == null ? 43 : this.monitorType.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
