/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.requests;

import java.io.*;
import java.util.*;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Accessors;

import com.oracle.bmc.model.*;
import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Builder(builderClassName = "Builder")
@Getter
public class ListImagesRequest {

    /**
     * The OCID of the compartment.
     */
    private String compartmentId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * <p>
     * Example: `My new resource`
     *
     */
    private String displayName;

    /**
     * The image's operating system.
     * <p>
     * Example: `Oracle Linux`
     *
     */
    private String operatingSystem;

    /**
     * The image's operating system version.
     * <p>
     * Example: `7.2`
     *
     */
    private String operatingSystemVersion;

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

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListImagesRequest o) {
            compartmentId(o.getCompartmentId());
            displayName(o.getDisplayName());
            operatingSystem(o.getOperatingSystem());
            operatingSystemVersion(o.getOperatingSystemVersion());
            limit(o.getLimit());
            page(o.getPage());
            return this;
        }
    }
}
