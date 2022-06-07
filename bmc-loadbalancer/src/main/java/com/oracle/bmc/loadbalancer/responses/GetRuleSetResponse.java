/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.responses;

import com.oracle.bmc.loadbalancer.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
public class GetRuleSetResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned RuleSet instance.
     */
    private com.oracle.bmc.loadbalancer.model.RuleSet ruleSet;

    public com.oracle.bmc.loadbalancer.model.RuleSet getRuleSet() {
        return ruleSet;
    }

    @java.beans.ConstructorProperties({"__httpStatusCode__", "opcRequestId", "ruleSet"})
    private GetRuleSetResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.loadbalancer.model.RuleSet ruleSet) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.ruleSet = ruleSet;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private com.oracle.bmc.loadbalancer.model.RuleSet ruleSet;

        public Builder ruleSet(com.oracle.bmc.loadbalancer.model.RuleSet ruleSet) {
            this.ruleSet = ruleSet;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetRuleSetResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            ruleSet(o.getRuleSet());

            return this;
        }

        public GetRuleSetResponse build() {
            return new GetRuleSetResponse(__httpStatusCode__, opcRequestId, ruleSet);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",ruleSet=").append(String.valueOf(ruleSet));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetRuleSetResponse)) {
            return false;
        }

        GetRuleSetResponse other = (GetRuleSetResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ruleSet, other.ruleSet);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ruleSet == null ? 43 : this.ruleSet.hashCode());
        return result;
    }
}
