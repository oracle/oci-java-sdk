/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.responses;

import com.oracle.bmc.dataconnectivity.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
public class CreateAttachDataAssetResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned AttachDataAssetInfo instance.
     */
    private com.oracle.bmc.dataconnectivity.model.AttachDataAssetInfo attachDataAssetInfo;

    /**
     * The returned AttachDataAssetInfo instance.
     * @return the value
     */
    public com.oracle.bmc.dataconnectivity.model.AttachDataAssetInfo getAttachDataAssetInfo() {
        return attachDataAssetInfo;
    }

    @java.beans.ConstructorProperties({"__httpStatusCode__", "opcRequestId", "attachDataAssetInfo"})
    private CreateAttachDataAssetResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.dataconnectivity.model.AttachDataAssetInfo attachDataAssetInfo) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.attachDataAssetInfo = attachDataAssetInfo;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned AttachDataAssetInfo instance.
         */
        private com.oracle.bmc.dataconnectivity.model.AttachDataAssetInfo attachDataAssetInfo;

        /**
         * The returned AttachDataAssetInfo instance.
         * @param attachDataAssetInfo the value to set
         * @return this builder
         */
        public Builder attachDataAssetInfo(
                com.oracle.bmc.dataconnectivity.model.AttachDataAssetInfo attachDataAssetInfo) {
            this.attachDataAssetInfo = attachDataAssetInfo;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateAttachDataAssetResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            attachDataAssetInfo(o.getAttachDataAssetInfo());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public CreateAttachDataAssetResponse build() {
            return new CreateAttachDataAssetResponse(
                    __httpStatusCode__, opcRequestId, attachDataAssetInfo);
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
        sb.append(",attachDataAssetInfo=").append(String.valueOf(attachDataAssetInfo));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAttachDataAssetResponse)) {
            return false;
        }

        CreateAttachDataAssetResponse other = (CreateAttachDataAssetResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.attachDataAssetInfo, other.attachDataAssetInfo);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.attachDataAssetInfo == null
                                ? 43
                                : this.attachDataAssetInfo.hashCode());
        return result;
    }
}