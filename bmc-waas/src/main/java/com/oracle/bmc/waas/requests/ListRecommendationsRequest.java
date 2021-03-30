/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.requests;

import com.oracle.bmc.waas.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/waas/ListRecommendationsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListRecommendationsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListRecommendationsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the WAAS policy.
     */
    private String waasPolicyId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * A filter that matches recommended protection rules based on the selected action. If unspecified, rules with any action type are returned.
     */
    private RecommendedAction recommendedAction;

    /**
     * A filter that matches recommended protection rules based on the selected action. If unspecified, rules with any action type are returned.
     **/
    public enum RecommendedAction {
        Detect("DETECT"),
        Block("BLOCK"),
        ;

        private final String value;
        private static java.util.Map<String, RecommendedAction> map;

        static {
            map = new java.util.HashMap<>();
            for (RecommendedAction v : RecommendedAction.values()) {
                map.put(v.getValue(), v);
            }
        }

        RecommendedAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RecommendedAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid RecommendedAction: " + key);
        }
    };
    /**
     * The maximum number of items to return in a paginated call. If unspecified, defaults to `10`.
     */
    private Integer limit;

    /**
     * The value of the `opc-next-page` response header from the previous paginated call.
     */
    private String page;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListRecommendationsRequest, java.lang.Void> {
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
        public Builder copy(ListRecommendationsRequest o) {
            waasPolicyId(o.getWaasPolicyId());
            opcRequestId(o.getOpcRequestId());
            recommendedAction(o.getRecommendedAction());
            limit(o.getLimit());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListRecommendationsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListRecommendationsRequest
         */
        public ListRecommendationsRequest build() {
            ListRecommendationsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
