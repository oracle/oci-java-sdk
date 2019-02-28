/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.monitoring.requests;

import com.oracle.bmc.monitoring.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class ListMetricsRequest extends com.oracle.bmc.requests.BmcRequest {

    /**
     * The [OCID](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the
     * resources monitored by the metric that you are searching for. Use tenancyId to search in
     * the root compartment.
     *
     */
    private String compartmentId;

    /**
     * The dimensions used to filter metrics.
     */
    private ListMetricsDetails listMetricsDetails;

    /**
     * Customer part of the request identifier token. If you need to contact Oracle about a particular
     * request, please provide the complete request ID.
     *
     */
    private String opcRequestId;

    /**
     * For list pagination. The value of the `opc-next-page` response header from the previous \"List\" call.
     * For important details about how pagination works, see [List Pagination](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated \"List\" call.
     * 1 is the minimum, 1000 is the maximum.
     * For important details about how pagination works, see [List Pagination](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Default: 1000
     * <p>
     * Example: 500
     *
     */
    private Integer limit;

    /**
     * When true, returns resources from all compartments and subcompartments. The parameter can
     * only be set to true when compartmentId is the tenancy OCID (the tenancy is the root compartment).
     * A true value requires the user to have tenancy-level permissions. If this requirement is not met,
     * then the call is rejected. When false, returns resources from only the compartment specified in
     * compartmentId. Default is false.
     *
     */
    private Boolean compartmentIdInSubtree;

    public static class Builder {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;

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
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListMetricsRequest o) {
            compartmentId(o.getCompartmentId());
            listMetricsDetails(o.getListMetricsDetails());
            opcRequestId(o.getOpcRequestId());
            page(o.getPage());
            limit(o.getLimit());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            invocationCallback(o.getInvocationCallback());
            return this;
        }

        /**
         * Build the instance of ListMetricsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListMetricsRequest
         */
        public ListMetricsRequest build() {
            ListMetricsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            return request;
        }
    }
}
