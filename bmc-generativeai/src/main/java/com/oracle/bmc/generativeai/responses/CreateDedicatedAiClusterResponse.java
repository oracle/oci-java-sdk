/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.responses;

import com.oracle.bmc.generativeai.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public class CreateDedicatedAiClusterResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** Provides deprecation details for models, included only when a model is deprecated. */
    private String modelDeprecationInfo;

    /**
     * Provides deprecation details for models, included only when a model is deprecated.
     *
     * @return the value
     */
    public String getModelDeprecationInfo() {
        return modelDeprecationInfo;
    }

    /** The returned {@code DedicatedAiCluster} instance. */
    private com.oracle.bmc.generativeai.model.DedicatedAiCluster dedicatedAiCluster;

    /**
     * The returned {@code DedicatedAiCluster} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.generativeai.model.DedicatedAiCluster getDedicatedAiCluster() {
        return dedicatedAiCluster;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcWorkRequestId",
        "opcRequestId",
        "modelDeprecationInfo",
        "dedicatedAiCluster"
    })
    private CreateDedicatedAiClusterResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcWorkRequestId,
            String opcRequestId,
            String modelDeprecationInfo,
            com.oracle.bmc.generativeai.model.DedicatedAiCluster dedicatedAiCluster) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.modelDeprecationInfo = modelDeprecationInfo;
        this.dedicatedAiCluster = dedicatedAiCluster;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    CreateDedicatedAiClusterResponse> {
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

        /** Provides deprecation details for models, included only when a model is deprecated. */
        private String modelDeprecationInfo;

        /**
         * Provides deprecation details for models, included only when a model is deprecated.
         *
         * @param modelDeprecationInfo the value to set
         * @return this builder
         */
        public Builder modelDeprecationInfo(String modelDeprecationInfo) {
            this.modelDeprecationInfo = modelDeprecationInfo;
            return this;
        }

        /** The returned {@code DedicatedAiCluster} instance. */
        private com.oracle.bmc.generativeai.model.DedicatedAiCluster dedicatedAiCluster;

        /**
         * The returned {@code DedicatedAiCluster} instance.
         *
         * @param dedicatedAiCluster the value to set
         * @return this builder
         */
        public Builder dedicatedAiCluster(
                com.oracle.bmc.generativeai.model.DedicatedAiCluster dedicatedAiCluster) {
            this.dedicatedAiCluster = dedicatedAiCluster;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateDedicatedAiClusterResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            modelDeprecationInfo(o.getModelDeprecationInfo());
            dedicatedAiCluster(o.getDedicatedAiCluster());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CreateDedicatedAiClusterResponse build() {
            return new CreateDedicatedAiClusterResponse(
                    __httpStatusCode__,
                    headers,
                    etag,
                    opcWorkRequestId,
                    opcRequestId,
                    modelDeprecationInfo,
                    dedicatedAiCluster);
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
        sb.append(",modelDeprecationInfo=").append(String.valueOf(modelDeprecationInfo));
        sb.append(",dedicatedAiCluster=").append(String.valueOf(dedicatedAiCluster));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDedicatedAiClusterResponse)) {
            return false;
        }

        CreateDedicatedAiClusterResponse other = (CreateDedicatedAiClusterResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.modelDeprecationInfo, other.modelDeprecationInfo)
                && java.util.Objects.equals(this.dedicatedAiCluster, other.dedicatedAiCluster);
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
                        + (this.modelDeprecationInfo == null
                                ? 43
                                : this.modelDeprecationInfo.hashCode());
        result =
                (result * PRIME)
                        + (this.dedicatedAiCluster == null
                                ? 43
                                : this.dedicatedAiCluster.hashCode());
        return result;
    }
}
