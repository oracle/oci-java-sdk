/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListAvailabilityDomainsRequest {

    /**
     * The OCID of the compartment (remember that the tenancy is simply the root compartment).
     *
     */
    private String compartmentId;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListAvailabilityDomainsRequest o) {
            compartmentId(o.getCompartmentId());
            return this;
        }
    }
}
