/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.responses;

import com.oracle.bmc.identity.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ResetIdpScimClientResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned ScimClientCredentials instance.
     */
    private ScimClientCredentials scimClientCredentials;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ResetIdpScimClientResponse o) {
            opcRequestId(o.getOpcRequestId());
            scimClientCredentials(o.getScimClientCredentials());

            return this;
        }
    }
}
