/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.responses;

import com.oracle.bmc.devops.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class ListDeployArtifactsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, provide the request ID.
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
     */
    private String opcNextPage;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * The returned DeployArtifactCollection instance.
     */
    private com.oracle.bmc.devops.model.DeployArtifactCollection deployArtifactCollection;

    /**
     * The returned DeployArtifactCollection instance.
     * @return the value
     */
    public com.oracle.bmc.devops.model.DeployArtifactCollection getDeployArtifactCollection() {
        return deployArtifactCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "deployArtifactCollection"
    })
    private ListDeployArtifactsResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.devops.model.DeployArtifactCollection deployArtifactCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.deployArtifactCollection = deployArtifactCollection;
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
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, provide the request ID.
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
         */
        private String opcNextPage;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * The returned DeployArtifactCollection instance.
         */
        private com.oracle.bmc.devops.model.DeployArtifactCollection deployArtifactCollection;

        /**
         * The returned DeployArtifactCollection instance.
         * @param deployArtifactCollection the value to set
         * @return this builder
         */
        public Builder deployArtifactCollection(
                com.oracle.bmc.devops.model.DeployArtifactCollection deployArtifactCollection) {
            this.deployArtifactCollection = deployArtifactCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListDeployArtifactsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            deployArtifactCollection(o.getDeployArtifactCollection());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListDeployArtifactsResponse build() {
            return new ListDeployArtifactsResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    deployArtifactCollection);
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
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",deployArtifactCollection=").append(String.valueOf(deployArtifactCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDeployArtifactsResponse)) {
            return false;
        }

        ListDeployArtifactsResponse other = (ListDeployArtifactsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.deployArtifactCollection, other.deployArtifactCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.deployArtifactCollection == null
                                ? 43
                                : this.deployArtifactCollection.hashCode());
        return result;
    }
}
