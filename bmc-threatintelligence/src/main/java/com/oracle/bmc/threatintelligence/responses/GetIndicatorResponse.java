/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.threatintelligence.responses;

import com.oracle.bmc.threatintelligence.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210831")
public class GetIndicatorResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned Indicator instance.
     */
    private com.oracle.bmc.threatintelligence.model.Indicator indicator;

    public com.oracle.bmc.threatintelligence.model.Indicator getIndicator() {
        return indicator;
    }

    @java.beans.ConstructorProperties({"__httpStatusCode__", "opcRequestId", "indicator"})
    private GetIndicatorResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.threatintelligence.model.Indicator indicator) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.indicator = indicator;
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

        private com.oracle.bmc.threatintelligence.model.Indicator indicator;

        public Builder indicator(com.oracle.bmc.threatintelligence.model.Indicator indicator) {
            this.indicator = indicator;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetIndicatorResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            indicator(o.getIndicator());

            return this;
        }

        public GetIndicatorResponse build() {
            return new GetIndicatorResponse(__httpStatusCode__, opcRequestId, indicator);
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
        sb.append(",indicator=").append(String.valueOf(indicator));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetIndicatorResponse)) {
            return false;
        }

        GetIndicatorResponse other = (GetIndicatorResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.indicator, other.indicator);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.indicator == null ? 43 : this.indicator.hashCode());
        return result;
    }
}
