/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.responses;

import com.oracle.bmc.loadbalancer.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetBackendSetResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned BackendSet instance.
     */
    private BackendSet backendSet;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetBackendSetResponse o) {
            opcRequestId(o.getOpcRequestId());
            backendSet(o.getBackendSet());

            return this;
        }
    }
}
