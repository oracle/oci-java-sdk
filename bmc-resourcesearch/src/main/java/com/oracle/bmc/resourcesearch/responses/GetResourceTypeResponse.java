/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.resourcesearch.responses;

import com.oracle.bmc.resourcesearch.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.4")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetResourceTypeResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned ResourceType instance.
     */
    private ResourceType resourceType;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetResourceTypeResponse o) {
            opcRequestId(o.getOpcRequestId());
            resourceType(o.getResourceType());

            return this;
        }
    }
}
