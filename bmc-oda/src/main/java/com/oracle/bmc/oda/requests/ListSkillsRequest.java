/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.requests;

import com.oracle.bmc.oda.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/ListSkillsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSkillsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListSkillsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique Digital Assistant instance identifier.
     */
    private String odaInstanceId;

    /**
     * Unique Skill identifier.
     */
    private String skillId;

    /**
     * List only Bot resources with this category.
     */
    private String category;

    /**
     * List only Bot resources with this name. Names are unique and may not change.
     * <p>
     * Example: {@code MySkill}
     *
     */
    private String name;

    /**
     * List only Bot resources with this version. Versions are unique and may not change.
     * <p>
     * Example: {@code 1.0}
     *
     */
    private String version;

    /**
     * List only Bot resources with this namespace. Namespaces may not change.
     * <p>
     * Example: {@code MyNamespace}
     *
     */
    private String namespace;

    /**
     * List only Bot resources with this platform version.
     *
     */
    private String platformVersion;

    /**
     * List only the resources that are in this lifecycle state.
     */
    private com.oracle.bmc.oda.model.LifecycleState lifecycleState;

    /**
     * List only Bot resources with this lifecycle details.
     *
     */
    private String lifecycleDetails;

    /**
     * The maximum number of items to return per page.
     */
    private Integer limit;

    /**
     * The page at which to start retrieving results.
     * <p>
     * You get this value from the {@code opc-next-page} header in a previous list request.
     * To retireve the first page, omit this query parameter.
     * <p>
     * Example: {@code MToxMA==}
     *
     */
    private String page;

    /**
     * Sort the results in this order, use either {@code ASC} (ascending) or {@code DESC} (descending).
     */
    private SortOrder sortOrder;

    /**
     * Sort the results in this order, use either {@code ASC} (ascending) or {@code DESC} (descending).
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
     * Sort on this field. You can specify one sort order only. The default sort field is {@code timeCreated}.
     * <p>
     * The default sort order for {@code timeCreated} and {@code timeUpdated} is descending.
     * For all other sort fields the default sort order is ascending.
     *
     */
    private SortBy sortBy;

    /**
     * Sort on this field. You can specify one sort order only. The default sort field is {@code timeCreated}.
     * <p>
     * The default sort order for {@code timeCreated} and {@code timeUpdated} is descending.
     * For all other sort fields the default sort order is ascending.
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
     * The client request ID for tracing. This value is included in the opc-request-id response header.
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSkillsRequest, java.lang.Void> {
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
        public Builder copy(ListSkillsRequest o) {
            odaInstanceId(o.getOdaInstanceId());
            skillId(o.getSkillId());
            category(o.getCategory());
            name(o.getName());
            version(o.getVersion());
            namespace(o.getNamespace());
            platformVersion(o.getPlatformVersion());
            lifecycleState(o.getLifecycleState());
            lifecycleDetails(o.getLifecycleDetails());
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
         * Build the instance of ListSkillsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListSkillsRequest
         */
        public ListSkillsRequest build() {
            ListSkillsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
