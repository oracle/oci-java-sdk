/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.responses;

import com.oracle.bmc.identity.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class CreateMfaTotpDeviceResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For optimistic concurrency control. See `if-match`.
     */
    private String etag;

    /**
     * The returned MfaTotpDevice instance.
     */
    private MfaTotpDevice mfaTotpDevice;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateMfaTotpDeviceResponse o) {
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            mfaTotpDevice(o.getMfaTotpDevice());

            return this;
        }
    }
}
