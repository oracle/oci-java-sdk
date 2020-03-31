/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.secrets.responses;

import com.oracle.bmc.secrets.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190301")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetSecretBundleResponse {

    /**
     * For optimistic concurrency control. See `if-match`.
     */
    private String etag;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * The returned SecretBundle instance.
     */
    private SecretBundle secretBundle;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetSecretBundleResponse o) {
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            secretBundle(o.getSecretBundle());

            return this;
        }
    }
}
