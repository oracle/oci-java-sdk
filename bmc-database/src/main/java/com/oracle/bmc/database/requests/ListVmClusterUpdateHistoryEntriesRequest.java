/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListVmClusterUpdateHistoryEntriesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListVmClusterUpdateHistoryEntriesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListVmClusterUpdateHistoryEntriesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The VM cluster [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String vmClusterId;

    /**
     * A filter to return only resources that match the given update type exactly.
     */
    private UpdateType updateType;

    /**
     * A filter to return only resources that match the given update type exactly.
     **/
    public enum UpdateType {
        GiUpgrade("GI_UPGRADE"),
        GiPatch("GI_PATCH"),
        OsUpdate("OS_UPDATE"),
        ;

        private final String value;
        private static java.util.Map<String, UpdateType> map;

        static {
            map = new java.util.HashMap<>();
            for (UpdateType v : UpdateType.values()) {
                map.put(v.getValue(), v);
            }
        }

        UpdateType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UpdateType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid UpdateType: " + key);
        }
    };
    /**
     * A filter to return only resources that match the given lifecycle state exactly.
     */
    private com.oracle.bmc.database.model.VmClusterUpdateHistoryEntrySummary.LifecycleState
            lifecycleState;

    /**
     * The maximum number of items to return per page.
     */
    private Integer limit;

    /**
     * The pagination token to continue listing from.
     */
    private String page;

    /**
     * Unique identifier for the request.
     *
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListVmClusterUpdateHistoryEntriesRequest, java.lang.Void> {
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
        public Builder copy(ListVmClusterUpdateHistoryEntriesRequest o) {
            vmClusterId(o.getVmClusterId());
            updateType(o.getUpdateType());
            lifecycleState(o.getLifecycleState());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListVmClusterUpdateHistoryEntriesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListVmClusterUpdateHistoryEntriesRequest
         */
        public ListVmClusterUpdateHistoryEntriesRequest build() {
            ListVmClusterUpdateHistoryEntriesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
