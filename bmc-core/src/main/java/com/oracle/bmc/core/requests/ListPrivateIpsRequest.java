/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListPrivateIpsRequest {

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
     * The private IP address of the `privateIp` object.
     * <p>
     * Example: `10.0.3.3`
     *
     */
    private String ipAddress;

    /**
     * The OCID of the subnet.
     */
    private String subnetId;

    /**
     * The OCID of the VNIC.
     */
    private String vnicId;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListPrivateIpsRequest o) {
            limit(o.getLimit());
            page(o.getPage());
            ipAddress(o.getIpAddress());
            subnetId(o.getSubnetId());
            vnicId(o.getVnicId());
            return this;
        }
    }
}
