/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.requests;

import com.oracle.bmc.apmsynthetics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmsynthetics/ListWorkersExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListWorkersRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class ListWorkersRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The APM domain ID the request is intended for. */
    private String apmDomainId;

    /** The APM domain ID the request is intended for. */
    public String getApmDomainId() {
        return apmDomainId;
    }
    /** The OCID of the On-premise vantage point. */
    private String onPremiseVantagePointId;

    /** The OCID of the On-premise vantage point. */
    public String getOnPremiseVantagePointId() {
        return onPremiseVantagePointId;
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
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 50}
     */
    private String page;

    /**
     * The maximum number of results per page, or items to return in a paginated "List" call. For
     * information on how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 50}
     */
    public String getPage() {
        return page;
    }
    /** A filter to return only On-premise VP workers that match the status given. */
    private com.oracle.bmc.apmsynthetics.model.OnPremiseVantagePointWorkerStatus status;

    /** A filter to return only On-premise VP workers that match the status given. */
    public com.oracle.bmc.apmsynthetics.model.OnPremiseVantagePointWorkerStatus getStatus() {
        return status;
    }
    /** A filter to return only On-premise VP workers that match the capability given. */
    private String capability;

    /** A filter to return only On-premise VP workers that match the capability given. */
    public String getCapability() {
        return capability;
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
     * ascending. Default order of timeCreated, timeUpdated and timeLastSyncup is descending. The
     * displayName sort by is case-sensitive.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order of displayName is
     * ascending. Default order of timeCreated, timeUpdated and timeLastSyncup is descending. The
     * displayName sort by is case-sensitive.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        DisplayName("displayName"),
        Name("name"),
        Status("status"),
        Priority("priority"),
        TimeCreated("timeCreated"),
        TimeUpdated("timeUpdated"),
        TimeLastSyncup("timeLastSyncup"),
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
     * ascending. Default order of timeCreated, timeUpdated and timeLastSyncup is descending. The
     * displayName sort by is case-sensitive.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** A filter to return only the resources that match the entire display name. */
    private String displayName;

    /** A filter to return only the resources that match the entire display name. */
    public String getDisplayName() {
        return displayName;
    }
    /** A filter to return only the resources that match the entire name. */
    private String name;

    /** A filter to return only the resources that match the entire name. */
    public String getName() {
        return name;
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
                    ListWorkersRequest, java.lang.Void> {
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

        /** The OCID of the On-premise vantage point. */
        private String onPremiseVantagePointId = null;

        /**
         * The OCID of the On-premise vantage point.
         *
         * @param onPremiseVantagePointId the value to set
         * @return this builder instance
         */
        public Builder onPremiseVantagePointId(String onPremiseVantagePointId) {
            this.onPremiseVantagePointId = onPremiseVantagePointId;
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
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 50}
         */
        private String page = null;

        /**
         * The maximum number of results per page, or items to return in a paginated "List" call.
         * For information on how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
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

        /** A filter to return only On-premise VP workers that match the status given. */
        private com.oracle.bmc.apmsynthetics.model.OnPremiseVantagePointWorkerStatus status = null;

        /**
         * A filter to return only On-premise VP workers that match the status given.
         *
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(
                com.oracle.bmc.apmsynthetics.model.OnPremiseVantagePointWorkerStatus status) {
            this.status = status;
            return this;
        }

        /** A filter to return only On-premise VP workers that match the capability given. */
        private String capability = null;

        /**
         * A filter to return only On-premise VP workers that match the capability given.
         *
         * @param capability the value to set
         * @return this builder instance
         */
        public Builder capability(String capability) {
            this.capability = capability;
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
         * is ascending. Default order of timeCreated, timeUpdated and timeLastSyncup is descending.
         * The displayName sort by is case-sensitive.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order of displayName
         * is ascending. Default order of timeCreated, timeUpdated and timeLastSyncup is descending.
         * The displayName sort by is case-sensitive.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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

        /** A filter to return only the resources that match the entire name. */
        private String name = null;

        /**
         * A filter to return only the resources that match the entire name.
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
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
        public Builder copy(ListWorkersRequest o) {
            apmDomainId(o.getApmDomainId());
            onPremiseVantagePointId(o.getOnPremiseVantagePointId());
            limit(o.getLimit());
            page(o.getPage());
            status(o.getStatus());
            capability(o.getCapability());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            displayName(o.getDisplayName());
            name(o.getName());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListWorkersRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListWorkersRequest
         */
        public ListWorkersRequest build() {
            ListWorkersRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListWorkersRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListWorkersRequest
         */
        public ListWorkersRequest buildWithoutInvocationCallback() {
            ListWorkersRequest request = new ListWorkersRequest();
            request.apmDomainId = apmDomainId;
            request.onPremiseVantagePointId = onPremiseVantagePointId;
            request.limit = limit;
            request.page = page;
            request.status = status;
            request.capability = capability;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.displayName = displayName;
            request.name = name;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListWorkersRequest(apmDomainId, onPremiseVantagePointId, limit, page, status,
            // capability, sortOrder, sortBy, displayName, name, opcRequestId);
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
                .onPremiseVantagePointId(onPremiseVantagePointId)
                .limit(limit)
                .page(page)
                .status(status)
                .capability(capability)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .displayName(displayName)
                .name(name)
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
        sb.append(",onPremiseVantagePointId=").append(String.valueOf(this.onPremiseVantagePointId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",status=").append(String.valueOf(this.status));
        sb.append(",capability=").append(String.valueOf(this.capability));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListWorkersRequest)) {
            return false;
        }

        ListWorkersRequest other = (ListWorkersRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.apmDomainId, other.apmDomainId)
                && java.util.Objects.equals(
                        this.onPremiseVantagePointId, other.onPremiseVantagePointId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.capability, other.capability)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.apmDomainId == null ? 43 : this.apmDomainId.hashCode());
        result =
                (result * PRIME)
                        + (this.onPremiseVantagePointId == null
                                ? 43
                                : this.onPremiseVantagePointId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.capability == null ? 43 : this.capability.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
