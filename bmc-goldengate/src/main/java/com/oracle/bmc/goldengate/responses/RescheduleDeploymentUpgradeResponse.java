/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.responses;

import com.oracle.bmc.goldengate.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public class RescheduleDeploymentUpgradeResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
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
     * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please include the request ID.
     *
     */
    private String opcRequestId;

    /**
     * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please include the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned DeploymentUpgrade instance.
     */
    private com.oracle.bmc.goldengate.model.DeploymentUpgrade deploymentUpgrade;

    /**
     * The returned DeploymentUpgrade instance.
     * @return the value
     */
    public com.oracle.bmc.goldengate.model.DeploymentUpgrade getDeploymentUpgrade() {
        return deploymentUpgrade;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "deploymentUpgrade"
    })
    private RescheduleDeploymentUpgradeResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String etag,
            String opcRequestId,
            com.oracle.bmc.goldengate.model.DeploymentUpgrade deploymentUpgrade) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.deploymentUpgrade = deploymentUpgrade;
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
         * For optimistic concurrency control. See {@code if-match}.
         *
         */
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
         * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please include the request ID.
         *
         */
        private String opcRequestId;

        /**
         * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please include the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned DeploymentUpgrade instance.
         */
        private com.oracle.bmc.goldengate.model.DeploymentUpgrade deploymentUpgrade;

        /**
         * The returned DeploymentUpgrade instance.
         * @param deploymentUpgrade the value to set
         * @return this builder
         */
        public Builder deploymentUpgrade(
                com.oracle.bmc.goldengate.model.DeploymentUpgrade deploymentUpgrade) {
            this.deploymentUpgrade = deploymentUpgrade;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(RescheduleDeploymentUpgradeResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            deploymentUpgrade(o.getDeploymentUpgrade());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public RescheduleDeploymentUpgradeResponse build() {
            return new RescheduleDeploymentUpgradeResponse(
                    __httpStatusCode__, headers, etag, opcRequestId, deploymentUpgrade);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",deploymentUpgrade=").append(String.valueOf(deploymentUpgrade));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RescheduleDeploymentUpgradeResponse)) {
            return false;
        }

        RescheduleDeploymentUpgradeResponse other = (RescheduleDeploymentUpgradeResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.deploymentUpgrade, other.deploymentUpgrade);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentUpgrade == null ? 43 : this.deploymentUpgrade.hashCode());
        return result;
    }
}
