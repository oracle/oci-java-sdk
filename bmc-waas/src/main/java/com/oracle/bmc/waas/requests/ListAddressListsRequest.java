/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.requests;

import com.oracle.bmc.waas.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/waas/ListAddressListsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListAddressListsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
public class ListAddressListsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment. This number is generated when the compartment is created.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment. This number is generated when the compartment is created.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The maximum number of items to return in a paginated call. If unspecified, defaults to {@code 10}.
     */
    private Integer limit;

    /**
     * The maximum number of items to return in a paginated call. If unspecified, defaults to {@code 10}.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The value of the {@code opc-next-page} response header from the previous paginated call.
     */
    private String page;

    /**
     * The value of the {@code opc-next-page} response header from the previous paginated call.
     */
    public String getPage() {
        return page;
    }
    /**
     * The value by which address lists are sorted in a paginated 'List' call. If unspecified, defaults to {@code timeCreated}.
     */
    private SortBy sortBy;

    /**
     * The value by which address lists are sorted in a paginated 'List' call. If unspecified, defaults to {@code timeCreated}.
     **/
    public enum SortBy {
        Id("id"),
        Name("name"),
        TimeCreated("timeCreated"),
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
     * The value by which address lists are sorted in a paginated 'List' call. If unspecified, defaults to {@code timeCreated}.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The value of the sorting direction of resources in a paginated 'List' call. If unspecified, defaults to {@code DESC}.
     */
    private SortOrder sortOrder;

    /**
     * The value of the sorting direction of resources in a paginated 'List' call. If unspecified, defaults to {@code DESC}.
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
     * The value of the sorting direction of resources in a paginated 'List' call. If unspecified, defaults to {@code DESC}.
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * Filter address lists using a list of address lists OCIDs.
     */
    private java.util.List<String> id;

    /**
     * Filter address lists using a list of address lists OCIDs.
     */
    public java.util.List<String> getId() {
        return id;
    }
    /**
     * Filter address lists using a list of names.
     */
    private java.util.List<String> name;

    /**
     * Filter address lists using a list of names.
     */
    public java.util.List<String> getName() {
        return name;
    }
    /**
     * Filter address lists using a list of lifecycle states.
     */
    private java.util.List<com.oracle.bmc.waas.model.LifecycleStates> lifecycleState;

    /**
     * Filter address lists using a list of lifecycle states.
     */
    public java.util.List<com.oracle.bmc.waas.model.LifecycleStates> getLifecycleState() {
        return lifecycleState;
    }
    /**
     * A filter that matches address lists created on or after the specified date-time.
     */
    private java.util.Date timeCreatedGreaterThanOrEqualTo;

    /**
     * A filter that matches address lists created on or after the specified date-time.
     */
    public java.util.Date getTimeCreatedGreaterThanOrEqualTo() {
        return timeCreatedGreaterThanOrEqualTo;
    }
    /**
     * A filter that matches address lists created before the specified date-time.
     */
    private java.util.Date timeCreatedLessThan;

    /**
     * A filter that matches address lists created before the specified date-time.
     */
    public java.util.Date getTimeCreatedLessThan() {
        return timeCreatedLessThan;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListAddressListsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment. This number is generated when the compartment is created.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment. This number is generated when the compartment is created.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The maximum number of items to return in a paginated call. If unspecified, defaults to {@code 10}.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return in a paginated call. If unspecified, defaults to {@code 10}.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The value of the {@code opc-next-page} response header from the previous paginated call.
         */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header from the previous paginated call.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The value by which address lists are sorted in a paginated 'List' call. If unspecified, defaults to {@code timeCreated}.
         */
        private SortBy sortBy = null;

        /**
         * The value by which address lists are sorted in a paginated 'List' call. If unspecified, defaults to {@code timeCreated}.
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The value of the sorting direction of resources in a paginated 'List' call. If unspecified, defaults to {@code DESC}.
         */
        private SortOrder sortOrder = null;

        /**
         * The value of the sorting direction of resources in a paginated 'List' call. If unspecified, defaults to {@code DESC}.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Filter address lists using a list of address lists OCIDs.
         */
        private java.util.List<String> id = null;

        /**
         * Filter address lists using a list of address lists OCIDs.
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(java.util.List<String> id) {
            this.id = id;
            return this;
        }

        /**
         * Singular setter. Filter address lists using a list of address lists OCIDs.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder id(String singularValue) {
            return this.id(java.util.Arrays.asList(singularValue));
        }

        /**
         * Filter address lists using a list of names.
         */
        private java.util.List<String> name = null;

        /**
         * Filter address lists using a list of names.
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(java.util.List<String> name) {
            this.name = name;
            return this;
        }

        /**
         * Singular setter. Filter address lists using a list of names.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder name(String singularValue) {
            return this.name(java.util.Arrays.asList(singularValue));
        }

        /**
         * Filter address lists using a list of lifecycle states.
         */
        private java.util.List<com.oracle.bmc.waas.model.LifecycleStates> lifecycleState = null;

        /**
         * Filter address lists using a list of lifecycle states.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                java.util.List<com.oracle.bmc.waas.model.LifecycleStates> lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * Singular setter. Filter address lists using a list of lifecycle states.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder lifecycleState(LifecycleStates singularValue) {
            return this.lifecycleState(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter that matches address lists created on or after the specified date-time.
         */
        private java.util.Date timeCreatedGreaterThanOrEqualTo = null;

        /**
         * A filter that matches address lists created on or after the specified date-time.
         * @param timeCreatedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeCreatedGreaterThanOrEqualTo(
                java.util.Date timeCreatedGreaterThanOrEqualTo) {
            this.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            return this;
        }

        /**
         * A filter that matches address lists created before the specified date-time.
         */
        private java.util.Date timeCreatedLessThan = null;

        /**
         * A filter that matches address lists created before the specified date-time.
         * @param timeCreatedLessThan the value to set
         * @return this builder instance
         */
        public Builder timeCreatedLessThan(java.util.Date timeCreatedLessThan) {
            this.timeCreatedLessThan = timeCreatedLessThan;
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
        public Builder copy(ListAddressListsRequest o) {
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            id(o.getId());
            name(o.getName());
            lifecycleState(o.getLifecycleState());
            timeCreatedGreaterThanOrEqualTo(o.getTimeCreatedGreaterThanOrEqualTo());
            timeCreatedLessThan(o.getTimeCreatedLessThan());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListAddressListsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListAddressListsRequest
         */
        public ListAddressListsRequest build() {
            ListAddressListsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListAddressListsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListAddressListsRequest
         */
        public ListAddressListsRequest buildWithoutInvocationCallback() {
            ListAddressListsRequest request = new ListAddressListsRequest();
            request.compartmentId = compartmentId;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.id = id;
            request.name = name;
            request.lifecycleState = lifecycleState;
            request.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            request.timeCreatedLessThan = timeCreatedLessThan;
            return request;
            // new ListAddressListsRequest(compartmentId, opcRequestId, limit, page, sortBy, sortOrder, id, name, lifecycleState, timeCreatedGreaterThanOrEqualTo, timeCreatedLessThan);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .id(id)
                .name(name)
                .lifecycleState(lifecycleState)
                .timeCreatedGreaterThanOrEqualTo(timeCreatedGreaterThanOrEqualTo)
                .timeCreatedLessThan(timeCreatedLessThan);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",timeCreatedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeCreatedGreaterThanOrEqualTo));
        sb.append(",timeCreatedLessThan=").append(String.valueOf(this.timeCreatedLessThan));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListAddressListsRequest)) {
            return false;
        }

        ListAddressListsRequest other = (ListAddressListsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.timeCreatedGreaterThanOrEqualTo, other.timeCreatedGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeCreatedLessThan, other.timeCreatedLessThan);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeCreatedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedLessThan == null
                                ? 43
                                : this.timeCreatedLessThan.hashCode());
        return result;
    }
}
