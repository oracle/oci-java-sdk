/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waas.responses;

import com.oracle.bmc.waas.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetProtectionRuleResponse {

    /**
     * For optimistic concurrency control. See `if-match`.
     */
    private String etag;

    /**
     * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * The returned ProtectionRule instance.
     */
    private ProtectionRule protectionRule;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetProtectionRuleResponse o) {
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            protectionRule(o.getProtectionRule());

            return this;
        }
    }
}
