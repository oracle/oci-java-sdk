/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListLogAnalyticsEntitiesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListLogAnalyticsEntitiesRequest.
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
public class ListLogAnalyticsEntitiesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * A filter to return only log analytics entities whose name matches the entire name given. The match
     * is case-insensitive.
     *
     */
    private String name;

    /**
     * A filter to return only log analytics entities whose name contains the name given. The match
     * is case-insensitive.
     *
     */
    private String nameContains;

    /**
     * A filter to return only log analytics entities whose entityTypeName matches the entire log analytics entity type name of
     * one of the entityTypeNames given in the list. The match is case-insensitive.
     *
     */
    private java.util.List<String> entityTypeName;

    /**
     * A filter to return only log analytics entities whose cloudResourceId matches the cloudResourceId given.
     *
     */
    private String cloudResourceId;

    /**
     * A filter to return only those log analytics entities with the specified lifecycle state. The state
     * value is case-insensitive.
     *
     */
    private com.oracle.bmc.loganalytics.model.EntityLifecycleStates lifecycleState;

    /**
     * A filter to return only log analytics entities whose lifecycleDetails contains the specified string.
     *
     */
    private String lifecycleDetailsContains;

    /**
     * A filter to return only those log analytics entities whose managementAgentId is null or is not null.
     *
     */
    private IsManagementAgentIdNull isManagementAgentIdNull;

    /**
     * A filter to return only those log analytics entities whose managementAgentId is null or is not null.
     *
     **/
    public enum IsManagementAgentIdNull {
        True("true"),
        False("false"),
        ;

        private final String value;
        private static java.util.Map<String, IsManagementAgentIdNull> map;

        static {
            map = new java.util.HashMap<>();
            for (IsManagementAgentIdNull v : IsManagementAgentIdNull.values()) {
                map.put(v.getValue(), v);
            }
        }

        IsManagementAgentIdNull(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IsManagementAgentIdNull create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid IsManagementAgentIdNull: " + key);
        }
    };
    /**
     * A filter to return only log analytics entities whose hostname matches the entire hostname given.
     *
     */
    private String hostname;

    /**
     * A filter to return only log analytics entities whose hostname contains the substring given.
     * The match is case-insensitive.
     *
     */
    private String hostnameContains;

    /**
     * A filter to return only log analytics entities whose sourceId matches the sourceId given.
     *
     */
    private String sourceId;

    /**
     * A filter to return only those log analytics entities with the specified auto-creation source.
     *
     */
    private java.util.List<com.oracle.bmc.loganalytics.model.CreationSourceType> creationSourceType;

    /**
     * A filter to return only log analytics entities whose auto-creation source details contains the specified string.
     *
     */
    private String creationSourceDetails;

    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

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
     * The field to sort entities by. Only one sort order may be provided. Default order for timeCreated and timeUpdated
     * is descending. Default order for entity name is ascending. If no value is specified timeCreated is default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort entities by. Only one sort order may be provided. Default order for timeCreated and timeUpdated
     * is descending. Default order for entity name is ascending. If no value is specified timeCreated is default.
     *
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
        TimeUpdated("timeUpdated"),
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
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListLogAnalyticsEntitiesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private java.util.List<String> entityTypeName = null;

        /**
         * A filter to return only log analytics entities whose entityTypeName matches the entire log analytics entity type name of
         * one of the entityTypeNames given in the list. The match is case-insensitive.
         *
         * @return this builder instance
         */
        public Builder entityTypeName(java.util.List<String> entityTypeName) {
            this.entityTypeName = entityTypeName;
            return this;
        }

        /**
         * Singular setter. A filter to return only log analytics entities whose entityTypeName matches the entire log analytics entity type name of
         * one of the entityTypeNames given in the list. The match is case-insensitive.
         *
         * @return this builder instance
         */
        public Builder entityTypeName(String singularValue) {
            return this.entityTypeName(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<com.oracle.bmc.loganalytics.model.CreationSourceType>
                creationSourceType = null;

        /**
         * A filter to return only those log analytics entities with the specified auto-creation source.
         *
         * @return this builder instance
         */
        public Builder creationSourceType(
                java.util.List<com.oracle.bmc.loganalytics.model.CreationSourceType>
                        creationSourceType) {
            this.creationSourceType = creationSourceType;
            return this;
        }

        /**
         * Singular setter. A filter to return only those log analytics entities with the specified auto-creation source.
         *
         * @return this builder instance
         */
        public Builder creationSourceType(CreationSourceType singularValue) {
            return this.creationSourceType(java.util.Arrays.asList(singularValue));
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
        public Builder copy(ListLogAnalyticsEntitiesRequest o) {
            namespaceName(o.getNamespaceName());
            compartmentId(o.getCompartmentId());
            name(o.getName());
            nameContains(o.getNameContains());
            entityTypeName(o.getEntityTypeName());
            cloudResourceId(o.getCloudResourceId());
            lifecycleState(o.getLifecycleState());
            lifecycleDetailsContains(o.getLifecycleDetailsContains());
            isManagementAgentIdNull(o.getIsManagementAgentIdNull());
            hostname(o.getHostname());
            hostnameContains(o.getHostnameContains());
            sourceId(o.getSourceId());
            creationSourceType(o.getCreationSourceType());
            creationSourceDetails(o.getCreationSourceDetails());
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
         * Build the instance of ListLogAnalyticsEntitiesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListLogAnalyticsEntitiesRequest
         */
        public ListLogAnalyticsEntitiesRequest build() {
            ListLogAnalyticsEntitiesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
