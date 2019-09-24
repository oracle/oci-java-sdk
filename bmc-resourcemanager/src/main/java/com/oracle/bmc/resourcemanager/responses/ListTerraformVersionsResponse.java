/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.resourcemanager.responses;

import com.oracle.bmc.resourcemanager.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListTerraformVersionsResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned TerraformVersionCollection instance.
     */
    private TerraformVersionCollection terraformVersionCollection;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListTerraformVersionsResponse o) {
            opcRequestId(o.getOpcRequestId());
            terraformVersionCollection(o.getTerraformVersionCollection());

            return this;
        }
    }
}
