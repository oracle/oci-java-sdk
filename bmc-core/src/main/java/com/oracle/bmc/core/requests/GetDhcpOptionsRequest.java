/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetDhcpOptionsRequest {

    /**
     * The OCID for the set of DHCP options.
     */
    private String dhcpId;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetDhcpOptionsRequest o) {
            dhcpId(o.getDhcpId());
            return this;
        }
    }
}
