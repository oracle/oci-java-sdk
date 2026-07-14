/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.responses;

import com.oracle.bmc.datacc.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class CreateVmClusterNetworkResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique identifier created by Oracle for the asynchronous request. You can use this identifier
     * to query the status of the asynchronous operation.
     */
    private String opcWorkRequestId;

    /**
     * Unique identifier created by Oracle for the asynchronous request. You can use this identifier
     * to query the status of the asynchronous operation.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }

    /**
     * Unique identifier assigned by Oracle for the request. If you need to contact Oracle about a
     * particular request, then please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique identifier assigned by Oracle for the request. If you need to contact Oracle about a
     * particular request, then please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** For Optimistic concurrency control. See the {@code if-match}. */
    private String etag;

    /**
     * For Optimistic concurrency control. See the {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /** The full URI of the resource. */
    private String location;

    /**
     * The full URI of the resource.
     *
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /** The returned {@code VmClusterNetwork} instance. */
    private com.oracle.bmc.datacc.model.VmClusterNetwork vmClusterNetwork;

    /**
     * The returned {@code VmClusterNetwork} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.datacc.model.VmClusterNetwork getVmClusterNetwork() {
        return vmClusterNetwork;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcWorkRequestId",
        "opcRequestId",
        "etag",
        "location",
        "vmClusterNetwork"
    })
    private CreateVmClusterNetworkResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcWorkRequestId,
            String opcRequestId,
            String etag,
            String location,
            com.oracle.bmc.datacc.model.VmClusterNetwork vmClusterNetwork) {
        super(__httpStatusCode__, headers);
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.location = location;
        this.vmClusterNetwork = vmClusterNetwork;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    CreateVmClusterNetworkResponse> {
        private int __httpStatusCode__;

        @Override
        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private java.util.Map<String, java.util.List<String>> headers;

        @Override
        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Unique identifier created by Oracle for the asynchronous request. You can use this
         * identifier to query the status of the asynchronous operation.
         */
        private String opcWorkRequestId;

        /**
         * Unique identifier created by Oracle for the asynchronous request. You can use this
         * identifier to query the status of the asynchronous operation.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        /**
         * Unique identifier assigned by Oracle for the request. If you need to contact Oracle about
         * a particular request, then please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique identifier assigned by Oracle for the request. If you need to contact Oracle about
         * a particular request, then please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** For Optimistic concurrency control. See the {@code if-match}. */
        private String etag;

        /**
         * For Optimistic concurrency control. See the {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /** The full URI of the resource. */
        private String location;

        /**
         * The full URI of the resource.
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /** The returned {@code VmClusterNetwork} instance. */
        private com.oracle.bmc.datacc.model.VmClusterNetwork vmClusterNetwork;

        /**
         * The returned {@code VmClusterNetwork} instance.
         *
         * @param vmClusterNetwork the value to set
         * @return this builder
         */
        public Builder vmClusterNetwork(
                com.oracle.bmc.datacc.model.VmClusterNetwork vmClusterNetwork) {
            this.vmClusterNetwork = vmClusterNetwork;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateVmClusterNetworkResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            location(o.getLocation());
            vmClusterNetwork(o.getVmClusterNetwork());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CreateVmClusterNetworkResponse build() {
            return new CreateVmClusterNetworkResponse(
                    __httpStatusCode__,
                    headers,
                    opcWorkRequestId,
                    opcRequestId,
                    etag,
                    location,
                    vmClusterNetwork);
        }
    }

    /**
     * Return a new builder for this response object.
     *
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
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",vmClusterNetwork=").append(String.valueOf(vmClusterNetwork));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateVmClusterNetworkResponse)) {
            return false;
        }

        CreateVmClusterNetworkResponse other = (CreateVmClusterNetworkResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.vmClusterNetwork, other.vmClusterNetwork);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.vmClusterNetwork == null ? 43 : this.vmClusterNetwork.hashCode());
        return result;
    }
}
