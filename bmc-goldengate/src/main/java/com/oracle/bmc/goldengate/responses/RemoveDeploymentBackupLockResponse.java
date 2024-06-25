/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.responses;

import com.oracle.bmc.goldengate.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public class RemoveDeploymentBackupLockResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * etag for the returned DeploymentBackup resource.
     *
     */
    private String etag;

    /**
     * etag for the returned DeploymentBackup resource.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * The returned DeploymentBackup instance.
     */
    private com.oracle.bmc.goldengate.model.DeploymentBackup deploymentBackup;

    /**
     * The returned DeploymentBackup instance.
     * @return the value
     */
    public com.oracle.bmc.goldengate.model.DeploymentBackup getDeploymentBackup() {
        return deploymentBackup;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "etag",
        "deploymentBackup"
    })
    private RemoveDeploymentBackupLockResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            String etag,
            com.oracle.bmc.goldengate.model.DeploymentBackup deploymentBackup) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.deploymentBackup = deploymentBackup;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private javax.ws.rs.core.MultivaluedMap<String, String> headers;

        public Builder headers(javax.ws.rs.core.MultivaluedMap<String, String> headers) {
            this.headers = headers;
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
         * etag for the returned DeploymentBackup resource.
         *
         */
        private String etag;

        /**
         * etag for the returned DeploymentBackup resource.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * The returned DeploymentBackup instance.
         */
        private com.oracle.bmc.goldengate.model.DeploymentBackup deploymentBackup;

        /**
         * The returned DeploymentBackup instance.
         * @param deploymentBackup the value to set
         * @return this builder
         */
        public Builder deploymentBackup(
                com.oracle.bmc.goldengate.model.DeploymentBackup deploymentBackup) {
            this.deploymentBackup = deploymentBackup;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(RemoveDeploymentBackupLockResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            deploymentBackup(o.getDeploymentBackup());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public RemoveDeploymentBackupLockResponse build() {
            return new RemoveDeploymentBackupLockResponse(
                    __httpStatusCode__, headers, opcRequestId, etag, deploymentBackup);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",deploymentBackup=").append(String.valueOf(deploymentBackup));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoveDeploymentBackupLockResponse)) {
            return false;
        }

        RemoveDeploymentBackupLockResponse other = (RemoveDeploymentBackupLockResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.deploymentBackup, other.deploymentBackup);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentBackup == null ? 43 : this.deploymentBackup.hashCode());
        return result;
    }
}
