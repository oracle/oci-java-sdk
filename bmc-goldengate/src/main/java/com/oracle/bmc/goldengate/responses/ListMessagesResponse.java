/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.responses;

import com.oracle.bmc.goldengate.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public class ListMessagesResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please include the request ID.
     *
     */
    private String opcRequestId;

    /**
     * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please include the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned DeploymentMessageCollection instance.
     */
    private com.oracle.bmc.goldengate.model.DeploymentMessageCollection deploymentMessageCollection;

    /**
     * The returned DeploymentMessageCollection instance.
     * @return the value
     */
    public com.oracle.bmc.goldengate.model.DeploymentMessageCollection
            getDeploymentMessageCollection() {
        return deploymentMessageCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "deploymentMessageCollection"
    })
    private ListMessagesResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            com.oracle.bmc.goldengate.model.DeploymentMessageCollection
                    deploymentMessageCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.deploymentMessageCollection = deploymentMessageCollection;
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
         * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please include the request ID.
         *
         */
        private String opcRequestId;

        /**
         * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please include the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned DeploymentMessageCollection instance.
         */
        private com.oracle.bmc.goldengate.model.DeploymentMessageCollection
                deploymentMessageCollection;

        /**
         * The returned DeploymentMessageCollection instance.
         * @param deploymentMessageCollection the value to set
         * @return this builder
         */
        public Builder deploymentMessageCollection(
                com.oracle.bmc.goldengate.model.DeploymentMessageCollection
                        deploymentMessageCollection) {
            this.deploymentMessageCollection = deploymentMessageCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListMessagesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            deploymentMessageCollection(o.getDeploymentMessageCollection());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListMessagesResponse build() {
            return new ListMessagesResponse(
                    __httpStatusCode__, headers, opcRequestId, deploymentMessageCollection);
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
        sb.append(",deploymentMessageCollection=")
                .append(String.valueOf(deploymentMessageCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListMessagesResponse)) {
            return false;
        }

        ListMessagesResponse other = (ListMessagesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.deploymentMessageCollection, other.deploymentMessageCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentMessageCollection == null
                                ? 43
                                : this.deploymentMessageCollection.hashCode());
        return result;
    }
}
