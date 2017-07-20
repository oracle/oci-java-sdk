/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.requests;

import com.oracle.bmc.loadbalancer.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class DeleteLoadBalancerRequest {

    /**
     * The [OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm) of the load balancer to delete.
     */
    private String loadBalancerId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(DeleteLoadBalancerRequest o) {
            loadBalancerId(o.getLoadBalancerId());
            opcRequestId(o.getOpcRequestId());
            return this;
        }
    }
}
