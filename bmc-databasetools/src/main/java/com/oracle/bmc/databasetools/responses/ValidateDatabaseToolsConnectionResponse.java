/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.responses;

import com.oracle.bmc.databasetools.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ValidateDatabaseToolsConnectionResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned ValidateDatabaseToolsConnectionResult instance.
     */
    private com.oracle.bmc.databasetools.model.ValidateDatabaseToolsConnectionResult
            validateDatabaseToolsConnectionResult;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "validateDatabaseToolsConnectionResult"
    })
    private ValidateDatabaseToolsConnectionResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.databasetools.model.ValidateDatabaseToolsConnectionResult
                    validateDatabaseToolsConnectionResult) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.validateDatabaseToolsConnectionResult = validateDatabaseToolsConnectionResult;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ValidateDatabaseToolsConnectionResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            validateDatabaseToolsConnectionResult(o.getValidateDatabaseToolsConnectionResult());

            return this;
        }

        public ValidateDatabaseToolsConnectionResponse build() {
            return new ValidateDatabaseToolsConnectionResponse(
                    __httpStatusCode__, opcRequestId, validateDatabaseToolsConnectionResult);
        }
    }
}
