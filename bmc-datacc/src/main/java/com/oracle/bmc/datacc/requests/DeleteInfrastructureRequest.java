/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.requests;

import com.oracle.bmc.datacc.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacc/DeleteInfrastructureExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use DeleteInfrastructureRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class DeleteInfrastructureRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Database Infrastructure.
     */
    private String infrastructureId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Database Infrastructure.
     */
    public String getInfrastructureId() {
        return infrastructureId;
    }
    /**
     * For Optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * 'if-match' parameter to the value of the Etag from a previous GET or POST response for that
     * resource. The resource is updated or deleted only if the Etag that you provide matches the
     * current Etag value for the resource.
     */
    private String ifMatch;

    /**
     * For Optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * 'if-match' parameter to the value of the Etag from a previous GET or POST response for that
     * resource. The resource is updated or deleted only if the Etag that you provide matches the
     * current Etag value for the resource.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /** The client request identifier. */
    private String opcRequestId;

    /** The client request identifier. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * When set to {@code true}, infrastructure will be deleted even if it has dependent resources.
     * If set to {@code false}, deletion will fail if the infrastructure has dependent resources.
     * Default is {@code false}.
     */
    private Boolean isForceDeleteInfrastructure;

    /**
     * When set to {@code true}, infrastructure will be deleted even if it has dependent resources.
     * If set to {@code false}, deletion will fail if the infrastructure has dependent resources.
     * Default is {@code false}.
     */
    public Boolean getIsForceDeleteInfrastructure() {
        return isForceDeleteInfrastructure;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeleteInfrastructureRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Database Infrastructure.
         */
        private String infrastructureId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Database Infrastructure.
         *
         * @param infrastructureId the value to set
         * @return this builder instance
         */
        public Builder infrastructureId(String infrastructureId) {
            this.infrastructureId = infrastructureId;
            return this;
        }

        /**
         * For Optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * 'if-match' parameter to the value of the Etag from a previous GET or POST response for
         * that resource. The resource is updated or deleted only if the Etag that you provide
         * matches the current Etag value for the resource.
         */
        private String ifMatch = null;

        /**
         * For Optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * 'if-match' parameter to the value of the Etag from a previous GET or POST response for
         * that resource. The resource is updated or deleted only if the Etag that you provide
         * matches the current Etag value for the resource.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /** The client request identifier. */
        private String opcRequestId = null;

        /**
         * The client request identifier.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * When set to {@code true}, infrastructure will be deleted even if it has dependent
         * resources. If set to {@code false}, deletion will fail if the infrastructure has
         * dependent resources. Default is {@code false}.
         */
        private Boolean isForceDeleteInfrastructure = null;

        /**
         * When set to {@code true}, infrastructure will be deleted even if it has dependent
         * resources. If set to {@code false}, deletion will fail if the infrastructure has
         * dependent resources. Default is {@code false}.
         *
         * @param isForceDeleteInfrastructure the value to set
         * @return this builder instance
         */
        public Builder isForceDeleteInfrastructure(Boolean isForceDeleteInfrastructure) {
            this.isForceDeleteInfrastructure = isForceDeleteInfrastructure;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
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
         *
         * @return this builder instance
         */
        public Builder copy(DeleteInfrastructureRequest o) {
            infrastructureId(o.getInfrastructureId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            isForceDeleteInfrastructure(o.getIsForceDeleteInfrastructure());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeleteInfrastructureRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DeleteInfrastructureRequest
         */
        public DeleteInfrastructureRequest build() {
            DeleteInfrastructureRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DeleteInfrastructureRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeleteInfrastructureRequest
         */
        public DeleteInfrastructureRequest buildWithoutInvocationCallback() {
            DeleteInfrastructureRequest request = new DeleteInfrastructureRequest();
            request.infrastructureId = infrastructureId;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.isForceDeleteInfrastructure = isForceDeleteInfrastructure;
            return request;
            // new DeleteInfrastructureRequest(infrastructureId, ifMatch, opcRequestId,
            // isForceDeleteInfrastructure);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .infrastructureId(infrastructureId)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .isForceDeleteInfrastructure(isForceDeleteInfrastructure);
    }

    /**
     * Return a new builder for this request object.
     *
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
        sb.append(",infrastructureId=").append(String.valueOf(this.infrastructureId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",isForceDeleteInfrastructure=")
                .append(String.valueOf(this.isForceDeleteInfrastructure));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteInfrastructureRequest)) {
            return false;
        }

        DeleteInfrastructureRequest other = (DeleteInfrastructureRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.infrastructureId, other.infrastructureId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.isForceDeleteInfrastructure, other.isForceDeleteInfrastructure);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.infrastructureId == null ? 43 : this.infrastructureId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.isForceDeleteInfrastructure == null
                                ? 43
                                : this.isForceDeleteInfrastructure.hashCode());
        return result;
    }
}
