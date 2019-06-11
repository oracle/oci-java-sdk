/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.resourcemanager.requests;

import com.oracle.bmc.resourcemanager.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class ListJobsRequest extends com.oracle.bmc.requests.BmcRequest {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The compartment OCID on which to filter.
     */
    private String compartmentId;

    /**
     * The stack OCID on which to filter.
     *
     */
    private String stackId;

    /**
     * The OCID on which to query for jobs.
     *
     */
    private String id;

    /**
     * A filter that returns all resources that match the specified lifecycle state.
     * The state value is case-insensitive.
     * <p>
     * Allowable values:
     * - ACCEPTED
     * - IN_PROGRESS
     * - FAILED
     * - SUCCEEDED
     * - CANCELING
     * - CANCELED
     *
     */
    private Job.LifecycleState lifecycleState;

    /**
     * Display name on which to query.
     */
    private String displayName;

    /**
     * Specifies the field on which to sort.
     * By default, `TIMECREATED` is ordered descending.
     * By default, `DISPLAYNAME` is ordered ascending. Note that you can sort only on one field.
     *
     */
    private SortBy sortBy;

    /**
     * Specifies the field on which to sort.
     * By default, `TIMECREATED` is ordered descending.
     * By default, `DISPLAYNAME` is ordered ascending. Note that you can sort only on one field.
     *
     **/
    public enum SortBy {
        Timecreated("TIMECREATED"),
        Displayname("DISPLAYNAME"),
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
            throw new RuntimeException("Invalid SortBy: " + key);
        }
    };

    /**
     * The sort order, either `ASC` (ascending) or `DESC` (descending).
     *
     */
    private SortOrder sortOrder;

    /**
     * The sort order, either `ASC` (ascending) or `DESC` (descending).
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
            throw new RuntimeException("Invalid SortOrder: " + key);
        }
    };

    /**
     * The number of items returned in a paginated `List` call. For information about pagination, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private Integer limit;

    /**
     * The value of the `opc-next-page` response header from the preceding `List` call.
     * For information about pagination, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    public static class Builder {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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
        public Builder copy(ListJobsRequest o) {
            opcRequestId(o.getOpcRequestId());
            compartmentId(o.getCompartmentId());
            stackId(o.getStackId());
            id(o.getId());
            lifecycleState(o.getLifecycleState());
            displayName(o.getDisplayName());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            limit(o.getLimit());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListJobsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListJobsRequest
         */
        public ListJobsRequest build() {
            ListJobsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
