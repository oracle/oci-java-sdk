/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmcontrolplane.responses;

import com.oracle.bmc.apmcontrolplane.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode
@lombok.Getter
public class ListDataKeysResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * A list of com.oracle.bmc.apmcontrolplane.model.DataKeySummary instances.
     */
    private java.util.List<com.oracle.bmc.apmcontrolplane.model.DataKeySummary> items;

    private ListDataKeysResponse(
            int __httpStatusCode__,
            String opcRequestId,
            java.util.List<com.oracle.bmc.apmcontrolplane.model.DataKeySummary> items) {
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
        public Builder copy(ListDataKeysResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            items(o.getItems());

            return this;
        }

        public ListDataKeysResponse build() {
            return new ListDataKeysResponse(__httpStatusCode__, opcRequestId, items);
        }
    }
}
