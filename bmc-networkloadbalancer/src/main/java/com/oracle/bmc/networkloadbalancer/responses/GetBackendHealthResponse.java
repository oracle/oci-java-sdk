/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.responses;

import com.oracle.bmc.networkloadbalancer.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetBackendHealthResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you must contact
     * Oracle about a particular request, then provide the request identifier.
     *
     */
    private String opcRequestId;

    /**
     * The returned BackendHealth instance.
     */
    private com.oracle.bmc.networkloadbalancer.model.BackendHealth backendHealth;

    @java.beans.ConstructorProperties({"__httpStatusCode__", "opcRequestId", "backendHealth"})
    private GetBackendHealthResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.networkloadbalancer.model.BackendHealth backendHealth) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.backendHealth = backendHealth;
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
        public Builder copy(GetBackendHealthResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            backendHealth(o.getBackendHealth());

            return this;
        }

        public GetBackendHealthResponse build() {
            return new GetBackendHealthResponse(__httpStatusCode__, opcRequestId, backendHealth);
        }
    }
}
