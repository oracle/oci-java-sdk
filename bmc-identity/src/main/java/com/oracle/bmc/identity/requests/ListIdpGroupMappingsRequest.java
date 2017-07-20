/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListIdpGroupMappingsRequest {

    /**
     * The OCID of the identity provider.
     */
    private String identityProviderId;

    /**
     * The value of the `opc-next-page` response header from the previous \"List\" call.
     *
     */
    private String page;

    /**
     * The maximum number of items to return in a paginated \"List\" call.
     *
     */
    private Integer limit;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListIdpGroupMappingsRequest o) {
            identityProviderId(o.getIdentityProviderId());
            page(o.getPage());
            limit(o.getLimit());
            return this;
        }
    }
}
