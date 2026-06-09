/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managedkafka.responses;

import com.oracle.bmc.managedkafka.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240901")
public class InstallAddonResponse extends com.oracle.bmc.responses.BmcResponse {
    /** For optimistic concurrency control. See {@code if-match}. */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * asynchronous work request. Use GetWorkRequest with this ID to track the status of the
     * request.
     */
    private String opcWorkRequestId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * asynchronous work request. Use GetWorkRequest with this ID to track the status of the
     * request.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** The returned {@code KafkaClusterAddon} instance. */
    private com.oracle.bmc.managedkafka.model.KafkaClusterAddon kafkaClusterAddon;

    /**
     * The returned {@code KafkaClusterAddon} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.managedkafka.model.KafkaClusterAddon getKafkaClusterAddon() {
        return kafkaClusterAddon;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcWorkRequestId",
        "opcRequestId",
        "kafkaClusterAddon"
    })
    private InstallAddonResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcWorkRequestId,
            String opcRequestId,
            com.oracle.bmc.managedkafka.model.KafkaClusterAddon kafkaClusterAddon) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.kafkaClusterAddon = kafkaClusterAddon;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<InstallAddonResponse> {
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

        /** For optimistic concurrency control. See {@code if-match}. */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * asynchronous work request. Use GetWorkRequest with this ID to track the status of the
         * request.
         */
        private String opcWorkRequestId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * asynchronous work request. Use GetWorkRequest with this ID to track the status of the
         * request.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The returned {@code KafkaClusterAddon} instance. */
        private com.oracle.bmc.managedkafka.model.KafkaClusterAddon kafkaClusterAddon;

        /**
         * The returned {@code KafkaClusterAddon} instance.
         *
         * @param kafkaClusterAddon the value to set
         * @return this builder
         */
        public Builder kafkaClusterAddon(
                com.oracle.bmc.managedkafka.model.KafkaClusterAddon kafkaClusterAddon) {
            this.kafkaClusterAddon = kafkaClusterAddon;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(InstallAddonResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            kafkaClusterAddon(o.getKafkaClusterAddon());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public InstallAddonResponse build() {
            return new InstallAddonResponse(
                    __httpStatusCode__,
                    headers,
                    etag,
                    opcWorkRequestId,
                    opcRequestId,
                    kafkaClusterAddon);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",kafkaClusterAddon=").append(String.valueOf(kafkaClusterAddon));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstallAddonResponse)) {
            return false;
        }

        InstallAddonResponse other = (InstallAddonResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.kafkaClusterAddon, other.kafkaClusterAddon);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.kafkaClusterAddon == null ? 43 : this.kafkaClusterAddon.hashCode());
        return result;
    }
}
