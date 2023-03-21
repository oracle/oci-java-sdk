/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.requests;

import com.oracle.bmc.functions.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/functions/ListPbfListingsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListPbfListingsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListPbfListingsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * unique PbfListing identifier
     */
    private String pbfListingId;

    /**
     * unique PbfListing identifier
     */
    public String getPbfListingId() {
        return pbfListingId;
    }
    /**
     * A filter to return only resources that match the entire PBF name given.
     */
    private String name;

    /**
     * A filter to return only resources that match the entire PBF name given.
     */
    public String getName() {
        return name;
    }
    /**
     * A filter to return only resources that contain the supplied filter text in the PBF name given.
     */
    private String nameContains;

    /**
     * A filter to return only resources that contain the supplied filter text in the PBF name given.
     */
    public String getNameContains() {
        return nameContains;
    }
    /**
     * A filter to return only resources that start with the supplied filter text in the PBF name given.
     */
    private String nameStartsWith;

    /**
     * A filter to return only resources that start with the supplied filter text in the PBF name given.
     */
    public String getNameStartsWith() {
        return nameStartsWith;
    }
    /**
     * A filter to return only resources that match the service trigger sources of a PBF.
     */
    private java.util.List<String> trigger;

    /**
     * A filter to return only resources that match the service trigger sources of a PBF.
     */
    public java.util.List<String> getTrigger() {
        return trigger;
    }
    /**
     * A filter to return only resources their lifecycleState matches the given lifecycleState.
     */
    private com.oracle.bmc.functions.model.PbfListing.LifecycleState lifecycleState;

    /**
     * A filter to return only resources their lifecycleState matches the given lifecycleState.
     */
    public com.oracle.bmc.functions.model.PbfListing.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The maximum number of items to return. 1 is the minimum, 50 is the maximum.
     * <p>
     * Default: 10
     *
     */
    private Integer limit;

    /**
     * The maximum number of items to return. 1 is the minimum, 50 is the maximum.
     * <p>
     * Default: 10
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The pagination token for a list query returned by a previous operation
     *
     */
    private String page;

    /**
     * The pagination token for a list query returned by a previous operation
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * Specifies sort order.
     * <p>
     * **ASC:** Ascending sort order.
     * * **DESC:** Descending sort order.
     *
     */
    private SortOrder sortOrder;

    /**
     * Specifies sort order.
     * <p>
     * **ASC:** Ascending sort order.
     * * **DESC:** Descending sort order.
     *
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
     * Specifies sort order.
     * <p>
     * **ASC:** Ascending sort order.
     * * **DESC:** Descending sort order.
     *
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for name is ascending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for name is ascending.
     *
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for name is ascending.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListPbfListingsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * unique PbfListing identifier
         */
        private String pbfListingId = null;

        /**
         * unique PbfListing identifier
         * @param pbfListingId the value to set
         * @return this builder instance
         */
        public Builder pbfListingId(String pbfListingId) {
            this.pbfListingId = pbfListingId;
            return this;
        }

        /**
         * A filter to return only resources that match the entire PBF name given.
         */
        private String name = null;

        /**
         * A filter to return only resources that match the entire PBF name given.
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * A filter to return only resources that contain the supplied filter text in the PBF name given.
         */
        private String nameContains = null;

        /**
         * A filter to return only resources that contain the supplied filter text in the PBF name given.
         * @param nameContains the value to set
         * @return this builder instance
         */
        public Builder nameContains(String nameContains) {
            this.nameContains = nameContains;
            return this;
        }

        /**
         * A filter to return only resources that start with the supplied filter text in the PBF name given.
         */
        private String nameStartsWith = null;

        /**
         * A filter to return only resources that start with the supplied filter text in the PBF name given.
         * @param nameStartsWith the value to set
         * @return this builder instance
         */
        public Builder nameStartsWith(String nameStartsWith) {
            this.nameStartsWith = nameStartsWith;
            return this;
        }

        /**
         * A filter to return only resources that match the service trigger sources of a PBF.
         */
        private java.util.List<String> trigger = null;

        /**
         * A filter to return only resources that match the service trigger sources of a PBF.
         * @param trigger the value to set
         * @return this builder instance
         */
        public Builder trigger(java.util.List<String> trigger) {
            this.trigger = trigger;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources that match the service trigger sources of a PBF.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder trigger(String singularValue) {
            return this.trigger(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return only resources their lifecycleState matches the given lifecycleState.
         */
        private com.oracle.bmc.functions.model.PbfListing.LifecycleState lifecycleState = null;

        /**
         * A filter to return only resources their lifecycleState matches the given lifecycleState.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.functions.model.PbfListing.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The maximum number of items to return. 1 is the minimum, 50 is the maximum.
         * <p>
         * Default: 10
         *
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return. 1 is the minimum, 50 is the maximum.
         * <p>
         * Default: 10
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The pagination token for a list query returned by a previous operation
         *
         */
        private String page = null;

        /**
         * The pagination token for a list query returned by a previous operation
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Specifies sort order.
         * <p>
         * **ASC:** Ascending sort order.
         * * **DESC:** Descending sort order.
         *
         */
        private SortOrder sortOrder = null;

        /**
         * Specifies sort order.
         * <p>
         * **ASC:** Ascending sort order.
         * * **DESC:** Descending sort order.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for name is ascending.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for name is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
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
        public Builder copy(ListPbfListingsRequest o) {
            pbfListingId(o.getPbfListingId());
            name(o.getName());
            nameContains(o.getNameContains());
            nameStartsWith(o.getNameStartsWith());
            trigger(o.getTrigger());
            lifecycleState(o.getLifecycleState());
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
         * Build the instance of ListPbfListingsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListPbfListingsRequest
         */
        public ListPbfListingsRequest build() {
            ListPbfListingsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListPbfListingsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListPbfListingsRequest
         */
        public ListPbfListingsRequest buildWithoutInvocationCallback() {
            ListPbfListingsRequest request = new ListPbfListingsRequest();
            request.pbfListingId = pbfListingId;
            request.name = name;
            request.nameContains = nameContains;
            request.nameStartsWith = nameStartsWith;
            request.trigger = trigger;
            request.lifecycleState = lifecycleState;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListPbfListingsRequest(pbfListingId, name, nameContains, nameStartsWith, trigger, lifecycleState, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .pbfListingId(pbfListingId)
                .name(name)
                .nameContains(nameContains)
                .nameStartsWith(nameStartsWith)
                .trigger(trigger)
                .lifecycleState(lifecycleState)
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
        sb.append(",pbfListingId=").append(String.valueOf(this.pbfListingId));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",nameContains=").append(String.valueOf(this.nameContains));
        sb.append(",nameStartsWith=").append(String.valueOf(this.nameStartsWith));
        sb.append(",trigger=").append(String.valueOf(this.trigger));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
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
        if (!(o instanceof ListPbfListingsRequest)) {
            return false;
        }

        ListPbfListingsRequest other = (ListPbfListingsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.pbfListingId, other.pbfListingId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.nameContains, other.nameContains)
                && java.util.Objects.equals(this.nameStartsWith, other.nameStartsWith)
                && java.util.Objects.equals(this.trigger, other.trigger)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
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
        result = (result * PRIME) + (this.pbfListingId == null ? 43 : this.pbfListingId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.nameContains == null ? 43 : this.nameContains.hashCode());
        result =
                (result * PRIME)
                        + (this.nameStartsWith == null ? 43 : this.nameStartsWith.hashCode());
        result = (result * PRIME) + (this.trigger == null ? 43 : this.trigger.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
