/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.audit.responses;

import com.oracle.bmc.audit.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190901")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetConfigurationResponse {

    /**
     * The returned Configuration instance.
     */
    private Configuration configuration;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetConfigurationResponse o) {

            configuration(o.getConfiguration());

            return this;
        }
    }
}
