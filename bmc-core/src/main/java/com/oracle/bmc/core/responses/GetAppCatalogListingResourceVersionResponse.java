/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.responses;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetAppCatalogListingResourceVersionResponse {

    /**
     * For optimistic concurrency control. See `if-match`.
     *
     */
    private String etag;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned AppCatalogListingResourceVersion instance.
     */
    private AppCatalogListingResourceVersion appCatalogListingResourceVersion;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetAppCatalogListingResourceVersionResponse o) {
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            appCatalogListingResourceVersion(o.getAppCatalogListingResourceVersion());

            return this;
        }
    }
}
