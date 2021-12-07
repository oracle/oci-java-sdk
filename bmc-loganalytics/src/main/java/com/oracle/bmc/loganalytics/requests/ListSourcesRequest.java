/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListSourcesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSourcesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListSourcesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The Logging Analytics namespace used for the request.
     *
     */
    private String namespaceName;

    /**
     * The ID of the compartment in which to list resources.
     */
    private String compartmentId;

    /**
     * A filter to return only sources associated with entities of the specified type.
     * The match is case-insensitive.
     *
     */
    private String entityType;

    /**
     * The source display text used for filtering.  Only sources with the specified name
     * or description will be returned.
     *
     */
    private String sourceDisplayText;

    /**
     * The system value used for filtering.  Only items with the specified system value
     * will be returned.  Valid values are built in, custom (for user defined items), or
     * all (for all items, regardless of system value).
     *
     */
    private IsSystem isSystem;

    /**
     * The system value used for filtering.  Only items with the specified system value
     * will be returned.  Valid values are built in, custom (for user defined items), or
     * all (for all items, regardless of system value).
     *
     **/
    public enum IsSystem {
        All("ALL"),
        Custom("CUSTOM"),
        BuiltIn("BUILT_IN"),
        ;

        private final String value;
        private static java.util.Map<String, IsSystem> map;

        static {
            map = new java.util.HashMap<>();
            for (IsSystem v : IsSystem.values()) {
                map.put(v.getValue(), v);
            }
        }

        IsSystem(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IsSystem create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid IsSystem: " + key);
        }
    };
    /**
     * An auto-associate flag used for filtering.  Only sources which are marked for automatic
     * association will be returned.
     *
     */
    private Boolean isAutoAssociated;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
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
     * The attribute used to sort the returned sources
     */
    private SortBy sortBy;

    /**
     * The attribute used to sort the returned sources
     **/
    public enum SortBy {
        Name("name"),
        TimeUpdated("timeUpdated"),
        AssociationCount("associationCount"),
        SourceType("sourceType"),
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
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * A filter to return only log analytics entities whose name matches the entire name given. The match
     * is case-insensitive.
     *
     */
    private String name;

    /**
     * A comma-separated list of categories used for filtering
     */
    private String categories;

    /**
     * A flag specifying whether or not to return all source information, or a subset of the
     * information about each source.  A value of true will return only the source unique
     * identifier and the source name.  A value of false will return all source information
     * (such as author, updated date, system flag, etc.)
     *
     */
    private Boolean isSimplified;

    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSourcesRequest, java.lang.Void> {
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
        public Builder copy(ListSourcesRequest o) {
            namespaceName(o.getNamespaceName());
            compartmentId(o.getCompartmentId());
            entityType(o.getEntityType());
            sourceDisplayText(o.getSourceDisplayText());
            isSystem(o.getIsSystem());
            isAutoAssociated(o.getIsAutoAssociated());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            limit(o.getLimit());
            page(o.getPage());
            name(o.getName());
            categories(o.getCategories());
            isSimplified(o.getIsSimplified());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSourcesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListSourcesRequest
         */
        public ListSourcesRequest build() {
            ListSourcesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
