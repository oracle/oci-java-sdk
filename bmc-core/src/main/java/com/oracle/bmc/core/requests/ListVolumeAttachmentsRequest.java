/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class ListVolumeAttachmentsRequest extends com.oracle.bmc.requests.BmcRequest {

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

    /**
     * The OCID of the instance.
     */
    private String instanceId;

    /**
     * The OCID of the volume.
     */
    private String volumeId;

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
        public Builder copy(ListVolumeAttachmentsRequest o) {
            compartmentId(o.getCompartmentId());
            availabilityDomain(o.getAvailabilityDomain());
            limit(o.getLimit());
            page(o.getPage());
            instanceId(o.getInstanceId());
            volumeId(o.getVolumeId());
            return this;
        }

        /**
         * Build the instance of ListVolumeAttachmentsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListVolumeAttachmentsRequest
         */
        public ListVolumeAttachmentsRequest build() {
            ListVolumeAttachmentsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            return request;
        }
    }
}
