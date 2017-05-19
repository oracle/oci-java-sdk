/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.requests;

import java.io.*;
import java.util.*;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Accessors;

import com.oracle.bmc.model.*;
import com.oracle.bmc.identity.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Builder(builderClassName = "Builder")
@Getter
public class GetIdpGroupMappingRequest {

    /**
     * The OCID of the identity provider.
     */
    private String identityProviderId;

    /**
     * The OCID of the group mapping.
     */
    private String mappingId;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetIdpGroupMappingRequest o) {
            identityProviderId(o.getIdentityProviderId());
            mappingId(o.getMappingId());
            return this;
        }
    }
}
