/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListLabelsExample.java.html">here</a> to see how to use ListLabelsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class ListLabelsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The Logging Analytics namespace used for the request.
     *
     */
    private String namespaceName;

    /**
     * label name
     */
    private String labelName;

    /**
     * search by label display name or description
     */
    private String labelDisplayText;

    /**
     * Is system param of value (all, custom, sourceUsing)
     *
     */
    private IsSystem isSystem;

    /**
     * Is system param of value (all, custom, sourceUsing)
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
     * label priority
     */
    private LabelPriority labelPriority;

    /**
     * label priority
     **/
    public enum LabelPriority {
        None("NONE"),
        Low("LOW"),
        Medium("MEDIUM"),
        High("HIGH"),
        ;

        private final String value;
        private static java.util.Map<String, LabelPriority> map;

        static {
            map = new java.util.HashMap<>();
            for (LabelPriority v : LabelPriority.values()) {
                map.put(v.getValue(), v);
            }
        }

        LabelPriority(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LabelPriority create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LabelPriority: " + key);
        }
    };
    /**
     * isCountPop
     */
    private Boolean isCountPop;

    /**
     * isAliasPop
     */
    private Boolean isAliasPop;

    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The sort order to use, either ascending (`ASC`) or descending (`DESC`).
     *
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either ascending (`ASC`) or descending (`DESC`).
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
     * sort by label
     */
    private LabelSortBy labelSortBy;

    /**
     * sort by label
     **/
    public enum LabelSortBy {
        Name("name"),
        Priority("priority"),
        SourceUsing("sourceUsing"),
        ;

        private final String value;
        private static java.util.Map<String, LabelSortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (LabelSortBy v : LabelSortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        LabelSortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LabelSortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LabelSortBy: " + key);
        }
    };
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListLabelsRequest, java.lang.Void> {
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
        public Builder copy(ListLabelsRequest o) {
            namespaceName(o.getNamespaceName());
            labelName(o.getLabelName());
            labelDisplayText(o.getLabelDisplayText());
            isSystem(o.getIsSystem());
            labelPriority(o.getLabelPriority());
            isCountPop(o.getIsCountPop());
            isAliasPop(o.getIsAliasPop());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            labelSortBy(o.getLabelSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListLabelsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListLabelsRequest
         */
        public ListLabelsRequest build() {
            ListLabelsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
