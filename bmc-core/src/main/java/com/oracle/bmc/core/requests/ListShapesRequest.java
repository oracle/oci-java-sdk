/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListShapesRequest {

    /**
     * The OCID of the compartment.
     */
    private String compartmentId;

    /**
     * The name of the Availability Domain.
     * <p>
     * Example: `Uocm:PHX-AD-1`
     *
     */
    private String availabilityDomain;

    /**
     * The maximum number of items to return in a paginated \"List\" call.
     * <p>
     * Example: `500`
     *
     */
    private Integer limit;

    /**
     * The value of the `opc-next-page` response header from the previous \"List\" call.
     *
     */
    private String page;

    /**
     * The OCID of an image.
     */
    private String imageId;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListShapesRequest o) {
            compartmentId(o.getCompartmentId());
            availabilityDomain(o.getAvailabilityDomain());
            limit(o.getLimit());
            page(o.getPage());
            imageId(o.getImageId());
            return this;
        }
    }
}
