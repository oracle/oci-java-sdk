/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database.responses;

import com.oracle.bmc.database.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class RestoreAutonomousDataWarehouseResponse {

    /**
     * For optimistic concurrency control. See `if-match`.
     */
    private String etag;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned AutonomousDataWarehouse instance.
     */
    private AutonomousDataWarehouse autonomousDataWarehouse;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(RestoreAutonomousDataWarehouseResponse o) {
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            autonomousDataWarehouse(o.getAutonomousDataWarehouse());

            return this;
        }
    }
}
