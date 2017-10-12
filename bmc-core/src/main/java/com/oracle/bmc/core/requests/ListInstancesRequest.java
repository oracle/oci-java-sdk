/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class ListInstancesRequest extends com.oracle.bmc.requests.BmcRequest {

    /**
     * The OCID of the compartment.
     */
    private String compartmentId;

    /**
     * The name of the Availability Domain.
     * <p>
     * Example: `Uocm:PHX-AD-1`
     *
     */
    private String availabilityDomain;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: `My new resource`
     *
     */
    private String displayName;

    /**
     * The maximum number of items to return in a paginated \"List\" call.
     * <p>
     * Example: `500`
     *
     */
    private Integer limit;

    /**
     * The value of the `opc-next-page` response header from the previous \"List\" call.
     *
     */
    private String page;

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
        public Builder copy(ListInstancesRequest o) {
            compartmentId(o.getCompartmentId());
            availabilityDomain(o.getAvailabilityDomain());
            displayName(o.getDisplayName());
            limit(o.getLimit());
            page(o.getPage());
            return this;
        }

        /**
         * Build the instance of ListInstancesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListInstancesRequest
         */
        public ListInstancesRequest build() {
            ListInstancesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            return request;
        }
    }
}
