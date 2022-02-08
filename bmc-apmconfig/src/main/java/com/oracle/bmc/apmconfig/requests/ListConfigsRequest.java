/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.requests;

import com.oracle.bmc.apmconfig.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmconfig/ListConfigsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListConfigsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListConfigsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The APM Domain ID the request is intended for.
     *
     */
    private String apmDomainId;

    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * A filter to match configuration items of a given type.
     * Supported values are SPAN_FILTER, METRIC_GROUP, and APDEX.
     *
     */
    private String configType;

    /**
     * A filter to return resources that match the given display name.
     */
    private String displayName;

    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The maximum number of results per page, or items to return in a paginated "List" call. For information on
     * how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * Example: {@code 50}
     *
     */
    private String page;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The displayName sort order
     * is case-sensitive.
     *
     */
    private com.oracle.bmc.apmconfig.model.SortOrders sortOrder;

    /**
     * The field to sort by. You can provide one "sortBy" value. The default order for displayName, timeCreated
     * and timeUpdated is ascending. The displayName sort by is case-sensitive.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can provide one "sortBy" value. The default order for displayName, timeCreated
     * and timeUpdated is ascending. The displayName sort by is case-sensitive.
     *
     **/
    public enum SortBy {
        DisplayName("displayName"),
        TimeCreated("timeCreated"),
        TimeUpdated("timeUpdated"),
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListConfigsRequest, java.lang.Void> {
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
        public Builder copy(ListConfigsRequest o) {
            apmDomainId(o.getApmDomainId());
            opcRequestId(o.getOpcRequestId());
            configType(o.getConfigType());
            displayName(o.getDisplayName());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListConfigsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListConfigsRequest
         */
        public ListConfigsRequest build() {
            ListConfigsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
