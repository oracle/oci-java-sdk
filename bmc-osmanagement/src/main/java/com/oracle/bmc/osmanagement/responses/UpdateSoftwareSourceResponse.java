/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.osmanagement.responses;

import com.oracle.bmc.osmanagement.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class UpdateSoftwareSourceResponse {

    /**
     * For optimistic concurrency control. See `if-match`.
     *
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
     * The returned SoftwareSource instance.
     */
    private SoftwareSource softwareSource;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateSoftwareSourceResponse o) {
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            softwareSource(o.getSoftwareSource());

            return this;
        }
    }
}
