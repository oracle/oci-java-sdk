/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.responses;

import com.oracle.bmc.containerengine.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
public class GetClusterOptionsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned ClusterOptions instance.
     */
    private com.oracle.bmc.containerengine.model.ClusterOptions clusterOptions;

    public com.oracle.bmc.containerengine.model.ClusterOptions getClusterOptions() {
        return clusterOptions;
    }

    @java.beans.ConstructorProperties({"__httpStatusCode__", "opcRequestId", "clusterOptions"})
    private GetClusterOptionsResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.containerengine.model.ClusterOptions clusterOptions) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.clusterOptions = clusterOptions;
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

        private com.oracle.bmc.containerengine.model.ClusterOptions clusterOptions;

        public Builder clusterOptions(
                com.oracle.bmc.containerengine.model.ClusterOptions clusterOptions) {
            this.clusterOptions = clusterOptions;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetClusterOptionsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            clusterOptions(o.getClusterOptions());

            return this;
        }

        public GetClusterOptionsResponse build() {
            return new GetClusterOptionsResponse(__httpStatusCode__, opcRequestId, clusterOptions);
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
        sb.append(",clusterOptions=").append(String.valueOf(clusterOptions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetClusterOptionsResponse)) {
            return false;
        }

        GetClusterOptionsResponse other = (GetClusterOptionsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.clusterOptions, other.clusterOptions);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterOptions == null ? 43 : this.clusterOptions.hashCode());
        return result;
    }
}
