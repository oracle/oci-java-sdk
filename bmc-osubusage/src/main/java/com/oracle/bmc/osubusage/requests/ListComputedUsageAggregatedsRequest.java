/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osubusage.requests;

import com.oracle.bmc.osubusage.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osubusage/ListComputedUsageAggregatedsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListComputedUsageAggregatedsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210501")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListComputedUsageAggregatedsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the root compartment.
     */
    private String compartmentId;

    /**
     * Subscription Id is an identifier associated to the service used for filter the Computed Usage in SPM.
     *
     */
    private String subscriptionId;

    /**
     * Initial date to filter Computed Usage data in SPM. In the case of non aggregated data the time period between of fromDate and toDate , expressed in RFC 3339 timestamp format.
     *
     */
    private java.util.Date timeFrom;

    /**
     * Final date to filter Computed Usage data in SPM, expressed in RFC 3339 timestamp format.
     *
     */
    private java.util.Date timeTo;

    /**
     * Product part number for subscribed service line, called parent product.
     *
     */
    private String parentProduct;

    /**
     * Grouping criteria to use for aggregate the computed Usage, either hourly ({@code HOURLY}), daily ({@code DAILY}), monthly({@code MONTHLY}) or none ({@code NONE}) to not follow a grouping criteria by date.
     *
     */
    private Grouping grouping;

    /**
     * Grouping criteria to use for aggregate the computed Usage, either hourly ({@code HOURLY}), daily ({@code DAILY}), monthly({@code MONTHLY}) or none ({@code NONE}) to not follow a grouping criteria by date.
     *
     **/
    public enum Grouping {
        Hourly("HOURLY"),
        Daily("DAILY"),
        Monthly("MONTHLY"),
        None("NONE"),
        ;

        private final String value;
        private static java.util.Map<String, Grouping> map;

        static {
            map = new java.util.HashMap<>();
            for (Grouping v : Grouping.values()) {
                map.put(v.getValue(), v);
            }
        }

        Grouping(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Grouping create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Grouping: " + key);
        }
    };
    /**
     * The maximum number aggregatedComputedUsages of items to return within the Subscription "List" call, this
     * counts the overall count across all items
     * Example: {@code 500}
     *
     */
    private Integer limit;

    /**
     * The value of the {@code opc-next-page} response header from the previous "List" call.
     *
     */
    private String page;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The OCI home region name in case home region is not us-ashburn-1 (IAD), e.g. ap-mumbai-1, us-phoenix-1 etc.
     *
     */
    private String xOneOriginRegion;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListComputedUsageAggregatedsRequest, java.lang.Void> {
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
        public Builder copy(ListComputedUsageAggregatedsRequest o) {
            compartmentId(o.getCompartmentId());
            subscriptionId(o.getSubscriptionId());
            timeFrom(o.getTimeFrom());
            timeTo(o.getTimeTo());
            parentProduct(o.getParentProduct());
            grouping(o.getGrouping());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            xOneOriginRegion(o.getXOneOriginRegion());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListComputedUsageAggregatedsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListComputedUsageAggregatedsRequest
         */
        public ListComputedUsageAggregatedsRequest build() {
            ListComputedUsageAggregatedsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
