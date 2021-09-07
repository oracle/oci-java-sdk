/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.responses;

import com.oracle.bmc.rover.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode
@lombok.Getter
public class GetRoverEntitlementResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     *
     */
    private String opcRequestId;

    /**
     *
     */
    private String etag;

    /**
     * The returned RoverEntitlement instance.
     */
    private com.oracle.bmc.rover.model.RoverEntitlement roverEntitlement;

    private GetRoverEntitlementResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String etag,
            com.oracle.bmc.rover.model.RoverEntitlement roverEntitlement) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.roverEntitlement = roverEntitlement;
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
        public Builder copy(GetRoverEntitlementResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            roverEntitlement(o.getRoverEntitlement());

            return this;
        }

        public GetRoverEntitlementResponse build() {
            return new GetRoverEntitlementResponse(
                    __httpStatusCode__, opcRequestId, etag, roverEntitlement);
        }
    }
}
