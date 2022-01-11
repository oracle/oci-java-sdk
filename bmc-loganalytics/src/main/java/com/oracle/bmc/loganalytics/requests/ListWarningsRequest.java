/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListWarningsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListWarningsRequest.
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
public class ListWarningsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * The warning state used for filtering.  A value of SUPPRESSED will return only
     * suppressed warnings, a value of UNSUPPRESSED will return only unsuppressed
     * warnings, and a value of ALL will return all warnings regardless of their
     * suppression state.  Default is UNSUPPRESSED.
     *
     */
    private WarningState warningState;

    /**
     * The warning state used for filtering.  A value of SUPPRESSED will return only
     * suppressed warnings, a value of UNSUPPRESSED will return only unsuppressed
     * warnings, and a value of ALL will return all warnings regardless of their
     * suppression state.  Default is UNSUPPRESSED.
     *
     **/
    public enum WarningState {
        All("ALL"),
        Suppressed("SUPPRESSED"),
        Unsuppressed("UNSUPPRESSED"),
        ;

        private final String value;
        private static java.util.Map<String, WarningState> map;

        static {
            map = new java.util.HashMap<>();
            for (WarningState v : WarningState.values()) {
                map.put(v.getValue(), v);
            }
        }

        WarningState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static WarningState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid WarningState: " + key);
        }
    };
    /**
     * The source name.
     */
    private String sourceName;

    /**
     * The source pattern used for filtering.  Only warnings associated with a source with the
     * specified pattern will be returned.
     *
     */
    private String sourcePattern;

    /**
     * warning message query parameter
     */
    private String warningMessage;

    /**
     * The entity name used for filtering.  Only warnings associated with an entity with the
     * specified name will be returned.
     *
     */
    private String entityName;

    /**
     * The entity type used for filtering.  Only associations on an entity with the
     * specified type will be returned.
     *
     */
    private String entityType;

    /**
     * The warning type query parameter.
     */
    private String warningType;

    /**
     * A flag indicating whether to filter warnings based on source display name or on warning level.
     * A value of true will filter based on warning level (rule, source, or pattern), while a
     * value of false will filter based on source display name.
     *
     */
    private Boolean isNoSource;

    /**
     * The warning start date query parameter.
     */
    private String startTime;

    /**
     * The warning end date query parameter.
     */
    private String endTime;

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
     * The attribute used to sort the returned warnings
     */
    private SortBy sortBy;

    /**
     * The attribute used to sort the returned warnings
     **/
    public enum SortBy {
        EntityType("EntityType"),
        SourceName("SourceName"),
        PatternText("PatternText"),
        FirstReported("FirstReported"),
        WarningMessage("WarningMessage"),
        Host("Host"),
        EntityName("EntityName"),
        InitialWarningDate("InitialWarningDate"),
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
                    ListWarningsRequest, java.lang.Void> {
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
        public Builder copy(ListWarningsRequest o) {
            namespaceName(o.getNamespaceName());
            compartmentId(o.getCompartmentId());
            warningState(o.getWarningState());
            sourceName(o.getSourceName());
            sourcePattern(o.getSourcePattern());
            warningMessage(o.getWarningMessage());
            entityName(o.getEntityName());
            entityType(o.getEntityType());
            warningType(o.getWarningType());
            isNoSource(o.getIsNoSource());
            startTime(o.getStartTime());
            endTime(o.getEndTime());
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
         * Build the instance of ListWarningsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListWarningsRequest
         */
        public ListWarningsRequest build() {
            ListWarningsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
