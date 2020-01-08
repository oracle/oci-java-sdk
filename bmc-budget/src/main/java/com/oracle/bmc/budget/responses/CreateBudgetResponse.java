/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.budget.responses;

import com.oracle.bmc.budget.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class CreateBudgetResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For optimistic concurrency control. See `if-match`.
     */
    private String etag;

    /**
     * The returned Budget instance.
     */
    private Budget budget;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateBudgetResponse o) {
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            budget(o.getBudget());

            return this;
        }
    }
}
