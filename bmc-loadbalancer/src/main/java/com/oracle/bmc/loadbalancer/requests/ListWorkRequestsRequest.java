/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.requests;

import java.io.*;
import java.util.*;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Accessors;

import com.oracle.bmc.model.*;
import com.oracle.bmc.loadbalancer.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@Builder(builderClassName = "Builder")
@Getter
public class ListWorkRequestsRequest {

    /**
     * The [OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm) of the load balancer associated with the work requests to retrieve.
     */
    private String loadBalancerId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The maximum number of items to return in a paginated \"List\" call.
     * <p>
     * Example: `500`
     *
     */
    private Long limit;

    /**
     * The value of the `opc-next-page` response header from the previous \"List\" call.
     * <p>
     * Example: `3`
     *
     */
    private String page;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListWorkRequestsRequest o) {
            loadBalancerId(o.getLoadBalancerId());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            return this;
        }
    }
}
