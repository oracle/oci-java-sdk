/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.resourcemanager.responses;

import com.oracle.bmc.resourcemanager.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetJobLogsContentResponse {

    /**
     * Unique identifier for the request
     */
    private String opcRequestId;

    /**
     * The returned String instance.
     */
    private String value;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetJobLogsContentResponse o) {
            opcRequestId(o.getOpcRequestId());
            value(o.getValue());

            return this;
        }
    }
}
