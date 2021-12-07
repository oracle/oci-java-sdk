/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.responses;

import com.oracle.bmc.dts.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.015")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListTransferApplianceEntitlementResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     *
     */
    private String opcRequestId;

    /**
     * A list of com.oracle.bmc.dts.model.TransferApplianceEntitlementSummary instances.
     */
    private java.util.List<com.oracle.bmc.dts.model.TransferApplianceEntitlementSummary> items;

    @java.beans.ConstructorProperties({"__httpStatusCode__", "opcRequestId", "items"})
    private ListTransferApplianceEntitlementResponse(
            int __httpStatusCode__,
            String opcRequestId,
            java.util.List<com.oracle.bmc.dts.model.TransferApplianceEntitlementSummary> items) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.items = items;
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
        public Builder copy(ListTransferApplianceEntitlementResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            items(o.getItems());

            return this;
        }

        public ListTransferApplianceEntitlementResponse build() {
            return new ListTransferApplianceEntitlementResponse(
                    __httpStatusCode__, opcRequestId, items);
        }
    }
}
