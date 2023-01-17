/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.requests;

import com.oracle.bmc.datalabelingservicedataplane.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datalabelingservicedataplane/ListRecordsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListRecordsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
public class ListRecordsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The ID of the compartment in which to list resources.
     */
    private String compartmentId;

    /**
     * The ID of the compartment in which to list resources.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Filter the results by the OCID of the dataset.
     */
    private String datasetId;

    /**
     * Filter the results by the OCID of the dataset.
     */
    public String getDatasetId() {
        return datasetId;
    }
    /**
     * A filter to return only resources whose lifecycleState matches the given lifecycleState.
     */
    private com.oracle.bmc.datalabelingservicedataplane.model.Record.LifecycleState lifecycleState;

    /**
     * A filter to return only resources whose lifecycleState matches the given lifecycleState.
     */
    public com.oracle.bmc.datalabelingservicedataplane.model.Record.LifecycleState
            getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The name of the record.
     */
    private String name;

    /**
     * The name of the record.
     */
    public String getName() {
        return name;
    }
    /**
     * The unique OCID identifier.
     */
    private String id;

    /**
     * The unique OCID identifier.
     */
    public String getId() {
        return id;
    }
    /**
     * Whether the record has been labeled and has associated annotations.
     */
    private Boolean isLabeled;

    /**
     * Whether the record has been labeled and has associated annotations.
     */
    public Boolean getIsLabeled() {
        return isLabeled;
    }
    /**
     * Lets the user filter records based on the related annotations.
     *
     */
    private java.util.List<String> annotationLabelsContains;

    /**
     * Lets the user filter records based on the related annotations.
     *
     */
    public java.util.List<String> getAnnotationLabelsContains() {
        return annotationLabelsContains;
    }
    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The maximum number of items to return.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either 'asc' or 'desc'.
     */
    private com.oracle.bmc.datalabelingservicedataplane.model.SortOrders sortOrder;

    /**
     * The sort order to use, either 'asc' or 'desc'.
     */
    public com.oracle.bmc.datalabelingservicedataplane.model.SortOrders getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. The default order for timeCreated is descending. The default order for name is ascending. If no value is specified, timeCreated is used by default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. The default order for timeCreated is descending. The default order for name is ascending. If no value is specified, timeCreated is used by default.
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
     * The field to sort by. Only one sort order may be provided. The default order for timeCreated is descending. The default order for name is ascending. If no value is specified, timeCreated is used by default.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListRecordsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The ID of the compartment in which to list resources.
         */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Filter the results by the OCID of the dataset.
         */
        private String datasetId = null;

        /**
         * Filter the results by the OCID of the dataset.
         * @param datasetId the value to set
         * @return this builder instance
         */
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        /**
         * A filter to return only resources whose lifecycleState matches the given lifecycleState.
         */
        private com.oracle.bmc.datalabelingservicedataplane.model.Record.LifecycleState
                lifecycleState = null;

        /**
         * A filter to return only resources whose lifecycleState matches the given lifecycleState.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.datalabelingservicedataplane.model.Record.LifecycleState
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The name of the record.
         */
        private String name = null;

        /**
         * The name of the record.
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The unique OCID identifier.
         */
        private String id = null;

        /**
         * The unique OCID identifier.
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Whether the record has been labeled and has associated annotations.
         */
        private Boolean isLabeled = null;

        /**
         * Whether the record has been labeled and has associated annotations.
         * @param isLabeled the value to set
         * @return this builder instance
         */
        public Builder isLabeled(Boolean isLabeled) {
            this.isLabeled = isLabeled;
            return this;
        }

        /**
         * Lets the user filter records based on the related annotations.
         *
         */
        private java.util.List<String> annotationLabelsContains = null;

        /**
         * Lets the user filter records based on the related annotations.
         *
         * @param annotationLabelsContains the value to set
         * @return this builder instance
         */
        public Builder annotationLabelsContains(java.util.List<String> annotationLabelsContains) {
            this.annotationLabelsContains = annotationLabelsContains;
            return this;
        }

        /**
         * Singular setter. Lets the user filter records based on the related annotations.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder annotationLabelsContains(String singularValue) {
            return this.annotationLabelsContains(java.util.Arrays.asList(singularValue));
        }

        /**
         * The maximum number of items to return.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The sort order to use, either 'asc' or 'desc'.
         */
        private com.oracle.bmc.datalabelingservicedataplane.model.SortOrders sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(
                com.oracle.bmc.datalabelingservicedataplane.model.SortOrders sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. The default order for timeCreated is descending. The default order for name is ascending. If no value is specified, timeCreated is used by default.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. The default order for timeCreated is descending. The default order for name is ascending. If no value is specified, timeCreated is used by default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(ListRecordsRequest o) {
            compartmentId(o.getCompartmentId());
            datasetId(o.getDatasetId());
            lifecycleState(o.getLifecycleState());
            name(o.getName());
            id(o.getId());
            isLabeled(o.getIsLabeled());
            annotationLabelsContains(o.getAnnotationLabelsContains());
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
         * Build the instance of ListRecordsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListRecordsRequest
         */
        public ListRecordsRequest build() {
            ListRecordsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListRecordsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListRecordsRequest
         */
        public ListRecordsRequest buildWithoutInvocationCallback() {
            ListRecordsRequest request = new ListRecordsRequest();
            request.compartmentId = compartmentId;
            request.datasetId = datasetId;
            request.lifecycleState = lifecycleState;
            request.name = name;
            request.id = id;
            request.isLabeled = isLabeled;
            request.annotationLabelsContains = annotationLabelsContains;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListRecordsRequest(compartmentId, datasetId, lifecycleState, name, id, isLabeled, annotationLabelsContains, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .datasetId(datasetId)
                .lifecycleState(lifecycleState)
                .name(name)
                .id(id)
                .isLabeled(isLabeled)
                .annotationLabelsContains(annotationLabelsContains)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",datasetId=").append(String.valueOf(this.datasetId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",isLabeled=").append(String.valueOf(this.isLabeled));
        sb.append(",annotationLabelsContains=")
                .append(String.valueOf(this.annotationLabelsContains));
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
        if (!(o instanceof ListRecordsRequest)) {
            return false;
        }

        ListRecordsRequest other = (ListRecordsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.datasetId, other.datasetId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.isLabeled, other.isLabeled)
                && java.util.Objects.equals(
                        this.annotationLabelsContains, other.annotationLabelsContains)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.datasetId == null ? 43 : this.datasetId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.isLabeled == null ? 43 : this.isLabeled.hashCode());
        result =
                (result * PRIME)
                        + (this.annotationLabelsContains == null
                                ? 43
                                : this.annotationLabelsContains.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
