/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ons.responses;

import com.oracle.bmc.ons.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode
@lombok.Getter
public class ResendSubscriptionConfirmationResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned Subscription instance.
     */
    private com.oracle.bmc.ons.model.Subscription subscription;

    private ResendSubscriptionConfirmationResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.ons.model.Subscription subscription) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.subscription = subscription;
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
        public Builder copy(ResendSubscriptionConfirmationResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            subscription(o.getSubscription());

            return this;
        }

        public ResendSubscriptionConfirmationResponse build() {
            return new ResendSubscriptionConfirmationResponse(
                    __httpStatusCode__, opcRequestId, subscription);
        }
    }
}
