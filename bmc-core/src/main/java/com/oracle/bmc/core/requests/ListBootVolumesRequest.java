/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class ListBootVolumesRequest extends com.oracle.bmc.requests.BmcRequest {

    /**
     * The name of the availability domain.
     * <p>
     * Example: `Uocm:PHX-AD-1`
     *
     */
    private String availabilityDomain;

    /**
     * The OCID of the compartment.
     */
    private String compartmentId;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated
     * \"List\" call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: `50`
     *
     */
    private Integer limit;

    /**
     * For list pagination. The value of the `opc-next-page` response header from the previous \"List\"
     * call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * The OCID of the volume group.
     */
    private String volumeGroupId;

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
        public Builder copy(ListBootVolumesRequest o) {
            availabilityDomain(o.getAvailabilityDomain());
            compartmentId(o.getCompartmentId());
            limit(o.getLimit());
            page(o.getPage());
            volumeGroupId(o.getVolumeGroupId());
            invocationCallback(o.getInvocationCallback());
            return this;
        }

        /**
         * Build the instance of ListBootVolumesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListBootVolumesRequest
         */
        public ListBootVolumesRequest build() {
            ListBootVolumesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            return request;
        }
    }
}
