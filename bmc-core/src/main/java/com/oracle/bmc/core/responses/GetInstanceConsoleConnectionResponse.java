/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.responses;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetInstanceConsoleConnectionResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned InstanceConsoleConnection instance.
     */
    private InstanceConsoleConnection instanceConsoleConnection;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetInstanceConsoleConnectionResponse o) {
            opcRequestId(o.getOpcRequestId());
            instanceConsoleConnection(o.getInstanceConsoleConnection());

            return this;
        }
    }
}
