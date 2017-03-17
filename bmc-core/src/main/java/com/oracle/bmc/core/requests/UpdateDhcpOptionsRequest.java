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
public class UpdateDhcpOptionsRequest {

    /**
     * The OCID for the set of DHCP options.
     */
    private String dhcpId;

    /**
     * Request object for updating a set of DHCP options.
     */
    private UpdateDhcpDetails updateDhcpDetails;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match`
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateDhcpOptionsRequest o) {
            dhcpId(o.getDhcpId());
            updateDhcpDetails(o.getUpdateDhcpDetails());
            ifMatch(o.getIfMatch());
            return this;
        }
    }
}
