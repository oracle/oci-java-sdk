/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.threatintelligence.requests;

import com.oracle.bmc.threatintelligence.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/threatintelligence/ListIndicatorsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListIndicatorsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210831")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListIndicatorsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The ID of the tenancy to use to filter results.
     */
    private String compartmentId;

    /**
     * The result set will include indicators that have any of the provided threat types. To filter for multiple threat types repeat the query parameter.
     */
    private java.util.List<String> threatTypeName;

    /**
     * The indicator type of entities to be returned.
     */
    private com.oracle.bmc.threatintelligence.model.IndicatorType type;

    /**
     * The indicator value of entities to be returned.
     */
    private String value;

    /**
     * The minimum confidence score of entities to be returned.
     */
    private Integer confidenceGreaterThanOrEqualTo;

    /**
     * The oldest update time of entities to be returned.
     */
    private java.util.Date timeUpdatedGreaterThanOrEqualTo;

    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of a previous response.
     */
    private String page;

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    private com.oracle.bmc.threatintelligence.model.SortOrder sortOrder;

    /**
     * The field to sort by. Only one field to sort by may be provided.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one field to sort by may be provided.
     *
     **/
    public enum SortBy {
        Confidence("confidence"),
        TimeUpdated("timeUpdated"),
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
                    ListIndicatorsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private java.util.List<String> threatTypeName = null;

        /**
         * The result set will include indicators that have any of the provided threat types. To filter for multiple threat types repeat the query parameter.
         * @return this builder instance
         */
        public Builder threatTypeName(java.util.List<String> threatTypeName) {
            this.threatTypeName = threatTypeName;
            return this;
        }

        /**
         * Singular setter. The result set will include indicators that have any of the provided threat types. To filter for multiple threat types repeat the query parameter.
         * @return this builder instance
         */
        public Builder threatTypeName(String singularValue) {
            return this.threatTypeName(java.util.Arrays.asList(singularValue));
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
        public Builder copy(ListIndicatorsRequest o) {
            compartmentId(o.getCompartmentId());
            threatTypeName(o.getThreatTypeName());
            type(o.getType());
            value(o.getValue());
            confidenceGreaterThanOrEqualTo(o.getConfidenceGreaterThanOrEqualTo());
            timeUpdatedGreaterThanOrEqualTo(o.getTimeUpdatedGreaterThanOrEqualTo());
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
         * Build the instance of ListIndicatorsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListIndicatorsRequest
         */
        public ListIndicatorsRequest build() {
            ListIndicatorsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
