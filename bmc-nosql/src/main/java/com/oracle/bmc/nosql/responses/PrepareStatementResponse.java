/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.nosql.responses;

import com.oracle.bmc.nosql.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class PrepareStatementResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need
     * to contact Oracle about a particular request, please provide
     * the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned PreparedStatement instance.
     */
    private PreparedStatement preparedStatement;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(PrepareStatementResponse o) {
            opcRequestId(o.getOpcRequestId());
            preparedStatement(o.getPreparedStatement());

            return this;
        }
    }
}
