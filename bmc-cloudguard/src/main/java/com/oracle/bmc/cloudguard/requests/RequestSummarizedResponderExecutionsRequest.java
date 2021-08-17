/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.requests;

import com.oracle.bmc.cloudguard.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/RequestSummarizedResponderExecutionsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use RequestSummarizedResponderExecutionsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class RequestSummarizedResponderExecutionsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The possible attributes based on which the responder executions can be distinguished
     */
    private java.util.List<com.oracle.bmc.cloudguard.model.ResponderDimension>
            responderExecutionsDimensions;

    /**
     * The ID of the compartment in which to list resources.
     */
    private String compartmentId;

    /**
     * The possible filters for Responder Type Dimension to distinguish Responder Executions.
     * If no values are passed, the metric for responder executions of all reponder types are returned
     *
     */
    private java.util.List<com.oracle.bmc.cloudguard.model.ResponderType> responderTypeFilter;

    /**
     * The possible filters for Responder Type Dimension to distinguish Responder Executions.
     * If no values are passed, the metric for responder executions of all status are returned
     *
     */
    private java.util.List<com.oracle.bmc.cloudguard.model.ResponderExecutionStatus>
            responderExecutionStatusFilter;

    /**
     * Default is false.
     * When set to true, the hierarchy of compartments is traversed
     * and all compartments and subcompartments in the tenancy are
     * returned depending on the the setting of {@code accessLevel}.
     *
     */
    private Boolean compartmentIdInSubtree;

    /**
     * Valid values are {@code RESTRICTED} and {@code ACCESSIBLE}. Default is {@code RESTRICTED}.
     * Setting this to {@code ACCESSIBLE} returns only those compartments for which the
     * user has INSPECT permissions directly or indirectly (permissions can be on a
     * resource in a subcompartment).
     * When set to {@code RESTRICTED} permissions are checked and no partial results are displayed.
     *
     */
    private AccessLevel accessLevel;

    /**
     * Valid values are {@code RESTRICTED} and {@code ACCESSIBLE}. Default is {@code RESTRICTED}.
     * Setting this to {@code ACCESSIBLE} returns only those compartments for which the
     * user has INSPECT permissions directly or indirectly (permissions can be on a
     * resource in a subcompartment).
     * When set to {@code RESTRICTED} permissions are checked and no partial results are displayed.
     *
     **/
    public enum AccessLevel {
        Restricted("RESTRICTED"),
        Accessible("ACCESSIBLE"),
        ;

        private final String value;
        private static java.util.Map<String, AccessLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (AccessLevel v : AccessLevel.values()) {
                map.put(v.getValue(), v);
            }
        }

        AccessLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AccessLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AccessLevel: " + key);
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
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RequestSummarizedResponderExecutionsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private java.util.List<com.oracle.bmc.cloudguard.model.ResponderDimension>
                responderExecutionsDimensions = null;

        /**
         * The possible attributes based on which the responder executions can be distinguished
         * @return this builder instance
         */
        public Builder responderExecutionsDimensions(
                java.util.List<com.oracle.bmc.cloudguard.model.ResponderDimension>
                        responderExecutionsDimensions) {
            this.responderExecutionsDimensions = responderExecutionsDimensions;
            return this;
        }

        /**
         * Singular setter. The possible attributes based on which the responder executions can be distinguished
         * @return this builder instance
         */
        public Builder responderExecutionsDimensions(ResponderDimension singularValue) {
            return this.responderExecutionsDimensions(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<com.oracle.bmc.cloudguard.model.ResponderType> responderTypeFilter =
                null;

        /**
         * The possible filters for Responder Type Dimension to distinguish Responder Executions.
         * If no values are passed, the metric for responder executions of all reponder types are returned
         *
         * @return this builder instance
         */
        public Builder responderTypeFilter(
                java.util.List<com.oracle.bmc.cloudguard.model.ResponderType> responderTypeFilter) {
            this.responderTypeFilter = responderTypeFilter;
            return this;
        }

        /**
         * Singular setter. The possible filters for Responder Type Dimension to distinguish Responder Executions.
         * If no values are passed, the metric for responder executions of all reponder types are returned
         *
         * @return this builder instance
         */
        public Builder responderTypeFilter(ResponderType singularValue) {
            return this.responderTypeFilter(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<com.oracle.bmc.cloudguard.model.ResponderExecutionStatus>
                responderExecutionStatusFilter = null;

        /**
         * The possible filters for Responder Type Dimension to distinguish Responder Executions.
         * If no values are passed, the metric for responder executions of all status are returned
         *
         * @return this builder instance
         */
        public Builder responderExecutionStatusFilter(
                java.util.List<com.oracle.bmc.cloudguard.model.ResponderExecutionStatus>
                        responderExecutionStatusFilter) {
            this.responderExecutionStatusFilter = responderExecutionStatusFilter;
            return this;
        }

        /**
         * Singular setter. The possible filters for Responder Type Dimension to distinguish Responder Executions.
         * If no values are passed, the metric for responder executions of all status are returned
         *
         * @return this builder instance
         */
        public Builder responderExecutionStatusFilter(ResponderExecutionStatus singularValue) {
            return this.responderExecutionStatusFilter(java.util.Arrays.asList(singularValue));
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
        public Builder copy(RequestSummarizedResponderExecutionsRequest o) {
            responderExecutionsDimensions(o.getResponderExecutionsDimensions());
            compartmentId(o.getCompartmentId());
            responderTypeFilter(o.getResponderTypeFilter());
            responderExecutionStatusFilter(o.getResponderExecutionStatusFilter());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            accessLevel(o.getAccessLevel());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RequestSummarizedResponderExecutionsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of RequestSummarizedResponderExecutionsRequest
         */
        public RequestSummarizedResponderExecutionsRequest build() {
            RequestSummarizedResponderExecutionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
