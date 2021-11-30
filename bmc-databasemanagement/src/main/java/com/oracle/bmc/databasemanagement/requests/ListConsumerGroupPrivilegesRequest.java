/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListConsumerGroupPrivilegesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListConsumerGroupPrivilegesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListConsumerGroupPrivilegesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
     */
    private String managedDatabaseId;

    /**
     * The name of the user whose details are to be viewed.
     */
    private String userName;

    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * A filter to return only resources that match the entire name.
     */
    private String name;

    /**
     * The field to sort information by. Only one sortOrder can be used. The default sort order
     * for \u2018NAME\u2019 is ascending. The \u2018NAME\u2019 sort order is case-sensitive.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort information by. Only one sortOrder can be used. The default sort order
     * for \u2018NAME\u2019 is ascending. The \u2018NAME\u2019 sort order is case-sensitive.
     *
     **/
    public enum SortBy {
        Name("NAME"),
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
     * The option to sort information in ascending (\u2018ASC\u2019) or descending (\u2018DESC\u2019) order. Ascending order is the default order.
     */
    private com.oracle.bmc.databasemanagement.model.SortOrders sortOrder;

    /**
     * The maximum number of records returned in the paginated response.
     */
    private Integer limit;

    /**
     * The page token representing the page from where the next set of paginated results
     * are retrieved. This is usually retrieved from a previous list call.
     *
     */
    private String page;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListConsumerGroupPrivilegesRequest, java.lang.Void> {
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
        public Builder copy(ListConsumerGroupPrivilegesRequest o) {
            managedDatabaseId(o.getManagedDatabaseId());
            userName(o.getUserName());
            opcRequestId(o.getOpcRequestId());
            name(o.getName());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            limit(o.getLimit());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListConsumerGroupPrivilegesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListConsumerGroupPrivilegesRequest
         */
        public ListConsumerGroupPrivilegesRequest build() {
            ListConsumerGroupPrivilegesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
