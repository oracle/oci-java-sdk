/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.requests;

import com.oracle.bmc.datascience.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/ListJobRunsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListJobRunsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListJobRunsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * <b>Filter</b> results by the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    private String compartmentId;

    /**
     * <b>Filter</b> results by [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Must be an OCID of the correct type for the resource type.
     *
     */
    private String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job.
     */
    private String jobId;

    /**
     * <b>Filter</b> results by the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the resource.
     */
    private String createdBy;

    /**
     * <b>Filter</b> results by its user-friendly name.
     */
    private String displayName;

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a particular request, then provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For list pagination. The maximum number of results per page,
     * or items to return in a paginated "List" call.
     * 1 is the minimum, 1000 is the maximum.
     * See [List Pagination](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 500}
     *
     */
    private Integer limit;

    /**
     * For list pagination. The value of the {@code opc-next-page} response
     * header from the previous "List" call.
     * <p>
     * See [List Pagination](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending).
     *
     */
    private SortOrder sortOrder;

    /**
     * Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending).
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
     * Specifies the field to sort by. Accepts only one field.
     * By default, when you sort by {@code timeCreated}, the results are shown
     * in descending order. When you sort by {@code displayName}, the results are
     * shown in ascending order. Sort order for the {@code displayName} field is case sensitive.
     *
     */
    private SortBy sortBy;

    /**
     * Specifies the field to sort by. Accepts only one field.
     * By default, when you sort by {@code timeCreated}, the results are shown
     * in descending order. When you sort by {@code displayName}, the results are
     * shown in ascending order. Sort order for the {@code displayName} field is case sensitive.
     *
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
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
     * <b>Filter</b> results by the specified lifecycle state. Must be a valid
     * state for the resource type.
     *
     */
    private com.oracle.bmc.datascience.model.JobRunLifecycleState lifecycleState;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListJobRunsRequest, java.lang.Void> {
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
        public Builder copy(ListJobRunsRequest o) {
            compartmentId(o.getCompartmentId());
            id(o.getId());
            jobId(o.getJobId());
            createdBy(o.getCreatedBy());
            displayName(o.getDisplayName());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            lifecycleState(o.getLifecycleState());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListJobRunsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListJobRunsRequest
         */
        public ListJobRunsRequest build() {
            ListJobRunsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
