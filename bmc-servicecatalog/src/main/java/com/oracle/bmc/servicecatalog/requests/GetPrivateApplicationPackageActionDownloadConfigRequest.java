/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicecatalog.requests;

import com.oracle.bmc.servicecatalog.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/servicecatalog/GetPrivateApplicationPackageActionDownloadConfigExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetPrivateApplicationPackageActionDownloadConfigRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210527")
public class GetPrivateApplicationPackageActionDownloadConfigRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The unique identifier for the private application package.
     */
    private String privateApplicationPackageId;

    /**
     * The unique identifier for the private application package.
     */
    public String getPrivateApplicationPackageId() {
        return privateApplicationPackageId;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetPrivateApplicationPackageActionDownloadConfigRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The unique identifier for the private application package.
         */
        private String privateApplicationPackageId = null;

        /**
         * The unique identifier for the private application package.
         * @param privateApplicationPackageId the value to set
         * @return this builder instance
         */
        public Builder privateApplicationPackageId(String privateApplicationPackageId) {
            this.privateApplicationPackageId = privateApplicationPackageId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetPrivateApplicationPackageActionDownloadConfigRequest o) {
            privateApplicationPackageId(o.getPrivateApplicationPackageId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetPrivateApplicationPackageActionDownloadConfigRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetPrivateApplicationPackageActionDownloadConfigRequest
         */
        public GetPrivateApplicationPackageActionDownloadConfigRequest build() {
            GetPrivateApplicationPackageActionDownloadConfigRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetPrivateApplicationPackageActionDownloadConfigRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetPrivateApplicationPackageActionDownloadConfigRequest
         */
        public GetPrivateApplicationPackageActionDownloadConfigRequest
                buildWithoutInvocationCallback() {
            GetPrivateApplicationPackageActionDownloadConfigRequest request =
                    new GetPrivateApplicationPackageActionDownloadConfigRequest();
            request.privateApplicationPackageId = privateApplicationPackageId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetPrivateApplicationPackageActionDownloadConfigRequest(privateApplicationPackageId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .privateApplicationPackageId(privateApplicationPackageId)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",privateApplicationPackageId=")
                .append(String.valueOf(this.privateApplicationPackageId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetPrivateApplicationPackageActionDownloadConfigRequest)) {
            return false;
        }

        GetPrivateApplicationPackageActionDownloadConfigRequest other =
                (GetPrivateApplicationPackageActionDownloadConfigRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.privateApplicationPackageId, other.privateApplicationPackageId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.privateApplicationPackageId == null
                                ? 43
                                : this.privateApplicationPackageId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
