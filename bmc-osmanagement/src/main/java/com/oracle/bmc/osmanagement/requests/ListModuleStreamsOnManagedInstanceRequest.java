/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.requests;

import com.oracle.bmc.osmanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListModuleStreamsOnManagedInstanceExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListModuleStreamsOnManagedInstanceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListModuleStreamsOnManagedInstanceRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * OCID for the managed instance
     */
    private String managedInstanceId;

    /**
     * The ID of the compartment in which to list resources. This parameter is optional and in some cases may have no effect.
     */
    private String compartmentId;

    /**
     * The name of a module.  This parameter is required if a
     * streamName is specified.
     *
     */
    private String moduleName;

    /**
     * The name of the stream of the containing module.  This parameter
     * is required if a profileName is specified.
     *
     */
    private String streamName;

    /**
     * The status of the stream
     * <p>
     * A stream with the "ENABLED" status can be used as a source for installing
     * profiles.  Streams with this status are also "ACTIVE".
     * <p>
     * A stream with the "DISABLED" status cannot be the source for installing
     * profiles.  To install profiles and packages from this stream, it must be
     * enabled.
     * <p>
     * A stream with the "ACTIVE" status can be used as a source for installing
     * profiles.  The packages that comprise the stream are also used when a
     * matching package is installed directly.  In general, a stream can have
     * this status if it is the default stream for the module and no stream has
     * been explicitly enabled.
     *
     */
    private StreamStatus streamStatus;

    /**
     * The status of the stream
     * <p>
     * A stream with the "ENABLED" status can be used as a source for installing
     * profiles.  Streams with this status are also "ACTIVE".
     * <p>
     * A stream with the "DISABLED" status cannot be the source for installing
     * profiles.  To install profiles and packages from this stream, it must be
     * enabled.
     * <p>
     * A stream with the "ACTIVE" status can be used as a source for installing
     * profiles.  The packages that comprise the stream are also used when a
     * matching package is installed directly.  In general, a stream can have
     * this status if it is the default stream for the module and no stream has
     * been explicitly enabled.
     *
     **/
    public enum StreamStatus {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        Active("ACTIVE"),
        ;

        private final String value;
        private static java.util.Map<String, StreamStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (StreamStatus v : StreamStatus.values()) {
                map.put(v.getValue(), v);
            }
        }

        StreamStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StreamStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid StreamStatus: " + key);
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
     * The sort order to use, either 'asc' or 'desc'.
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either 'asc' or 'desc'.
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
     * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED is default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED is default.
     *
     **/
    public enum SortBy {
        Timecreated("TIMECREATED"),
        Displayname("DISPLAYNAME"),
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
                    ListModuleStreamsOnManagedInstanceRequest, java.lang.Void> {
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
        public Builder copy(ListModuleStreamsOnManagedInstanceRequest o) {
            managedInstanceId(o.getManagedInstanceId());
            compartmentId(o.getCompartmentId());
            moduleName(o.getModuleName());
            streamName(o.getStreamName());
            streamStatus(o.getStreamStatus());
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
         * Build the instance of ListModuleStreamsOnManagedInstanceRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListModuleStreamsOnManagedInstanceRequest
         */
        public ListModuleStreamsOnManagedInstanceRequest build() {
            ListModuleStreamsOnManagedInstanceRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
