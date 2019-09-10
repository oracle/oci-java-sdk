/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.oce.responses;

import com.oracle.bmc.oce.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190912")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetOceInstanceResponse {

    /**
     * For optimistic concurrency control. See `if-match`.
     */
    private String etag;

    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned OceInstance instance.
     */
    private OceInstance oceInstance;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetOceInstanceResponse o) {
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            oceInstance(o.getOceInstance());

            return this;
        }
    }
}
