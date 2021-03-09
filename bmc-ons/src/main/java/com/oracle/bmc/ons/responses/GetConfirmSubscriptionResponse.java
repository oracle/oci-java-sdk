/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ons.responses;

import com.oracle.bmc.ons.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetConfirmSubscriptionResponse {
    /**
     * HTTP status code returned by the operation.
     */
    private final int __httpStatusCode__;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For optimistic concurrency control. See `if-match`.
     *
     */
    private String etag;

    /**
     * The returned ConfirmationResult instance.
     */
    private ConfirmationResult confirmationResult;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetConfirmSubscriptionResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            confirmationResult(o.getConfirmationResult());

            return this;
        }
    }
}
