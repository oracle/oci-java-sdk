/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.responses;

import com.oracle.bmc.operatoraccesscontrol.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetOperatorActionResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned OperatorAction instance.
     */
    private com.oracle.bmc.operatoraccesscontrol.model.OperatorAction operatorAction;

    @java.beans.ConstructorProperties({"__httpStatusCode__", "opcRequestId", "operatorAction"})
    private GetOperatorActionResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.operatoraccesscontrol.model.OperatorAction operatorAction) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.operatorAction = operatorAction;
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
        public Builder copy(GetOperatorActionResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            operatorAction(o.getOperatorAction());

            return this;
        }

        public GetOperatorActionResponse build() {
            return new GetOperatorActionResponse(__httpStatusCode__, opcRequestId, operatorAction);
        }
    }
}
