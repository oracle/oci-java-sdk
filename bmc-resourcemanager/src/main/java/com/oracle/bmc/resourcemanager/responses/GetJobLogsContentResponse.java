/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.responses;

import com.oracle.bmc.resourcemanager.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
public class GetJobLogsContentResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique identifier for the request
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned String instance.
     */
    private String value;

    /**
     * The returned String instance.
     * @return the value
     */
    public String getValue() {
        return value;
    }

    @java.beans.ConstructorProperties({"__httpStatusCode__", "opcRequestId", "value"})
    private GetJobLogsContentResponse(int __httpStatusCode__, String opcRequestId, String value) {
        super(__httpStatusCode__);
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
         * Unique identifier for the request
         */
        private String opcRequestId;

        /**
         * Unique identifier for the request
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned String instance.
         */
        private String value;

        /**
         * The returned String instance.
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetJobLogsContentResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            value(o.getValue());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetJobLogsContentResponse build() {
            return new GetJobLogsContentResponse(__httpStatusCode__, opcRequestId, value);
        }
    }

    /**
     * Return a new builder for this response object.
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",value=").append(String.valueOf(value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetJobLogsContentResponse)) {
            return false;
        }

        GetJobLogsContentResponse other = (GetJobLogsContentResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.value, other.value);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        return result;
    }
}
