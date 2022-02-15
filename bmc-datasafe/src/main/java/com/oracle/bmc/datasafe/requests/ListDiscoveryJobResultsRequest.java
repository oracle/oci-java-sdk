/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListDiscoveryJobResultsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListDiscoveryJobResultsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListDiscoveryJobResultsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the discovery job.
     */
    private String discoveryJobId;

    /**
     * A filter to return only the resources that match the specified discovery type.
     */
    private com.oracle.bmc.datasafe.model.DiscoveryJob.DiscoveryType discoveryType;

    /**
     * A filter to return only the resources that match the specified planned action.
     */
    private com.oracle.bmc.datasafe.model.DiscoveryJobResult.PlannedAction plannedAction;

    /**
     * A filter to return the discovery result resources based on the value of their isResultApplied attribute.
     */
    private Boolean isResultApplied;

    /**
     * A filter to return only items related to specific schema name.
     */
    private java.util.List<String> schemaName;

    /**
     * A filter to return only items related to a specific object name.
     */
    private java.util.List<String> objectName;

    /**
     * A filter to return only a specific column based on column name.
     */
    private java.util.List<String> columnName;

    /**
     * The sort order to use, either ascending (ASC) or descending (DESC).
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either ascending (ASC) or descending (DESC).
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
     * The field to sort by. You can specify only one sort order (sortOrder). The default order for timeFinished is descending.
     * The default order for discoveryType, schemaName, objectName, columnName and plannedAction is ascending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can specify only one sort order (sortOrder). The default order for timeFinished is descending.
     * The default order for discoveryType, schemaName, objectName, columnName and plannedAction is ascending.
     *
     **/
    public enum SortBy {
        DiscoveryType("discoveryType"),
        TimeFinished("timeFinished"),
        SchemaName("schemaName"),
        ObjectName("objectName"),
        ColumnName("columnName"),
        PlannedAction("plannedAction"),
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
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDiscoveryJobResultsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private java.util.List<String> schemaName = null;

        /**
         * A filter to return only items related to specific schema name.
         * @return this builder instance
         */
        public Builder schemaName(java.util.List<String> schemaName) {
            this.schemaName = schemaName;
            return this;
        }

        /**
         * Singular setter. A filter to return only items related to specific schema name.
         * @return this builder instance
         */
        public Builder schemaName(String singularValue) {
            return this.schemaName(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> objectName = null;

        /**
         * A filter to return only items related to a specific object name.
         * @return this builder instance
         */
        public Builder objectName(java.util.List<String> objectName) {
            this.objectName = objectName;
            return this;
        }

        /**
         * Singular setter. A filter to return only items related to a specific object name.
         * @return this builder instance
         */
        public Builder objectName(String singularValue) {
            return this.objectName(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> columnName = null;

        /**
         * A filter to return only a specific column based on column name.
         * @return this builder instance
         */
        public Builder columnName(java.util.List<String> columnName) {
            this.columnName = columnName;
            return this;
        }

        /**
         * Singular setter. A filter to return only a specific column based on column name.
         * @return this builder instance
         */
        public Builder columnName(String singularValue) {
            return this.columnName(java.util.Arrays.asList(singularValue));
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
        public Builder copy(ListDiscoveryJobResultsRequest o) {
            discoveryJobId(o.getDiscoveryJobId());
            discoveryType(o.getDiscoveryType());
            plannedAction(o.getPlannedAction());
            isResultApplied(o.getIsResultApplied());
            schemaName(o.getSchemaName());
            objectName(o.getObjectName());
            columnName(o.getColumnName());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListDiscoveryJobResultsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListDiscoveryJobResultsRequest
         */
        public ListDiscoveryJobResultsRequest build() {
            ListDiscoveryJobResultsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
