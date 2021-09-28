/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.responses;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetConsoleHistoryContentResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The number of bytes remaining in the snapshot.
     */
    private Integer opcBytesRemaining;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned String instance.
     */
    private String value;

    private GetConsoleHistoryContentResponse(
            int __httpStatusCode__, Integer opcBytesRemaining, String opcRequestId, String value) {
        super(__httpStatusCode__);
        this.opcBytesRemaining = opcBytesRemaining;
        this.opcRequestId = opcRequestId;
        this.value = value;
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
        public Builder copy(GetConsoleHistoryContentResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcBytesRemaining(o.getOpcBytesRemaining());
            opcRequestId(o.getOpcRequestId());
            value(o.getValue());

            return this;
        }

        public GetConsoleHistoryContentResponse build() {
            return new GetConsoleHistoryContentResponse(
                    __httpStatusCode__, opcBytesRemaining, opcRequestId, value);
        }
    }
}
