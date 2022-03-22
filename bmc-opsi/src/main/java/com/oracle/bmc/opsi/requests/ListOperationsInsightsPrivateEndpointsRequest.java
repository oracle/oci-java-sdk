/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListOperationsInsightsPrivateEndpointsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListOperationsInsightsPrivateEndpointsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListOperationsInsightsPrivateEndpointsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    private String compartmentId;

    /**
     * A filter to return only resources that match the entire display name.
     */
    private String displayName;

    /**
     * Unique Operations Insights PrivateEndpoint identifier
     */
    private String opsiPrivateEndpointId;

    /**
     * The option to filter OPSI private endpoints that can used for RAC. Should be used along with vcnId query parameter.
     */
    private Boolean isUsedForRacDbs;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VCN.
     */
    private String vcnId;

    /**
     * Lifecycle states
     */
    private java.util.List<
                    com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpointLifecycleState>
            lifecycleState;

    /**
     * For list pagination. The maximum number of results per page, or items to
     * return in a paginated "List" call.
     * For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     * Example: {@code 50}
     *
     */
    private Integer limit;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from
     * the previous "List" call. For important details about how pagination works,
     * see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    private com.oracle.bmc.opsi.model.SortOrder sortOrder;

    /**
     * The field to sort private endpoints.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort private endpoints.
     *
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
        Id("id"),
        DisplayName("displayName"),
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
     * A flag to search all resources within a given compartment and all sub-compartments.
     *
     */
    private Boolean compartmentIdInSubtree;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListOperationsInsightsPrivateEndpointsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private java.util.List<
                        com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpointLifecycleState>
                lifecycleState = null;

        /**
         * Lifecycle states
         * @return this builder instance
         */
        public Builder lifecycleState(
                java.util.List<
                                com.oracle.bmc.opsi.model
                                        .OperationsInsightsPrivateEndpointLifecycleState>
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * Singular setter. Lifecycle states
         * @return this builder instance
         */
        public Builder lifecycleState(
                OperationsInsightsPrivateEndpointLifecycleState singularValue) {
            return this.lifecycleState(java.util.Arrays.asList(singularValue));
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
        public Builder copy(ListOperationsInsightsPrivateEndpointsRequest o) {
            compartmentId(o.getCompartmentId());
            displayName(o.getDisplayName());
            opsiPrivateEndpointId(o.getOpsiPrivateEndpointId());
            isUsedForRacDbs(o.getIsUsedForRacDbs());
            vcnId(o.getVcnId());
            lifecycleState(o.getLifecycleState());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListOperationsInsightsPrivateEndpointsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListOperationsInsightsPrivateEndpointsRequest
         */
        public ListOperationsInsightsPrivateEndpointsRequest build() {
            ListOperationsInsightsPrivateEndpointsRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
