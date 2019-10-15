/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.oda.responses;

import com.oracle.bmc.oda.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ChangeOdaInstanceCompartmentResponse {

    /**
     * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query status of
     * the operation.
     *
     */
    private String opcWorkRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. The request id consists of 3 components.
     * The first is the request ID provided by the client in the request headers and the remaining 2 are
     * generated for tracing requests.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ChangeOdaInstanceCompartmentResponse o) {
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());

            return this;
        }
    }
}
