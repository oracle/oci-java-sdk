/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.responses;

import com.oracle.bmc.dataintegration.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
public class GetSchemaResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned Schema instance.
     */
    private com.oracle.bmc.dataintegration.model.Schema schema;

    public com.oracle.bmc.dataintegration.model.Schema getSchema() {
        return schema;
    }

    @java.beans.ConstructorProperties({"__httpStatusCode__", "opcRequestId", "schema"})
    private GetSchemaResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.dataintegration.model.Schema schema) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.schema = schema;
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

        private com.oracle.bmc.dataintegration.model.Schema schema;

        public Builder schema(com.oracle.bmc.dataintegration.model.Schema schema) {
            this.schema = schema;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetSchemaResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            schema(o.getSchema());

            return this;
        }

        public GetSchemaResponse build() {
            return new GetSchemaResponse(__httpStatusCode__, opcRequestId, schema);
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
        sb.append(",schema=").append(String.valueOf(schema));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetSchemaResponse)) {
            return false;
        }

        GetSchemaResponse other = (GetSchemaResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.schema, other.schema);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.schema == null ? 43 : this.schema.hashCode());
        return result;
    }
}
