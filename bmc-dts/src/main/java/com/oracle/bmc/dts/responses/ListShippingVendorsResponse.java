/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dts.responses;

import com.oracle.bmc.dts.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.011")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListShippingVendorsResponse {

    /**
     *
     */
    private String opcRequestId;

    /**
     * The returned ShippingVendors instance.
     */
    private ShippingVendors shippingVendors;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListShippingVendorsResponse o) {
            opcRequestId(o.getOpcRequestId());
            shippingVendors(o.getShippingVendors());

            return this;
        }
    }
}
