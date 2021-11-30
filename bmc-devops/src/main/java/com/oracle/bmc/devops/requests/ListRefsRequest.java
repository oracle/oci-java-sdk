/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.requests;

import com.oracle.bmc.devops.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/ListRefsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListRefsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListRefsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique repository identifier.
     */
    private String repositoryId;

    /**
     * Reference type to distinguish between branch and tag. If it is not specified, all references are returned.
     */
    private RefType refType;

    /**
     * Reference type to distinguish between branch and tag. If it is not specified, all references are returned.
     **/
    public enum RefType {
        Branch("BRANCH"),
        Tag("TAG"),
        ;

        private final String value;
        private static java.util.Map<String, RefType> map;

        static {
            map = new java.util.HashMap<>();
            for (RefType v : RefType.values()) {
                map.put(v.getValue(), v);
            }
        }

        RefType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RefType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid RefType: " + key);
        }
    };
    /**
     * Commit ID in a repository.
     */
    private String commitId;

    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * A filter to return only resources that match the given reference name.
     */
    private String refName;

    /**
     * The sort order to use. Use either ascending or descending.
     */
    private com.oracle.bmc.devops.model.SortOrder sortOrder;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for reference name is ascending. Default order for reference type is ascending. If no value is specified reference name is default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for reference name is ascending. Default order for reference type is ascending. If no value is specified reference name is default.
     *
     **/
    public enum SortBy {
        RefType("refType"),
        RefName("refName"),
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
     * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<ListRefsRequest, java.lang.Void> {
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
        public Builder copy(ListRefsRequest o) {
            repositoryId(o.getRepositoryId());
            refType(o.getRefType());
            commitId(o.getCommitId());
            limit(o.getLimit());
            page(o.getPage());
            refName(o.getRefName());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListRefsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListRefsRequest
         */
        public ListRefsRequest build() {
            ListRefsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
