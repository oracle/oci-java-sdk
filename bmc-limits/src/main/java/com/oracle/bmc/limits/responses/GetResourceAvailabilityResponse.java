/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.limits.responses;

import com.oracle.bmc.limits.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: ")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetResourceAvailabilityResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned ResourceAvailability instance.
     */
    private ResourceAvailability resourceAvailability;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetResourceAvailabilityResponse o) {
            opcRequestId(o.getOpcRequestId());
            resourceAvailability(o.getResourceAvailability());

            return this;
        }
    }
}
