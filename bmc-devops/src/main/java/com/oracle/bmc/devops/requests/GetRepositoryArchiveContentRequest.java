/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.requests;

import com.oracle.bmc.devops.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/GetRepositoryArchiveContentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetRepositoryArchiveContentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class GetRepositoryArchiveContentRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique repository identifier.
     */
    private String repositoryId;

    /**
     * Unique repository identifier.
     */
    public String getRepositoryId() {
        return repositoryId;
    }
    /**
     * A filter to return only resources that match the given reference name.
     */
    private String refName;

    /**
     * A filter to return only resources that match the given reference name.
     */
    public String getRefName() {
        return refName;
    }
    /**
     * The archive format query parameter for downloading repository endpoint.
     */
    private String format;

    /**
     * The archive format query parameter for downloading repository endpoint.
     */
    public String getFormat() {
        return format;
    }
    /**
     * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetRepositoryArchiveContentRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique repository identifier.
         */
        private String repositoryId = null;

        /**
         * Unique repository identifier.
         * @param repositoryId the value to set
         * @return this builder instance
         */
        public Builder repositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * A filter to return only resources that match the given reference name.
         */
        private String refName = null;

        /**
         * A filter to return only resources that match the given reference name.
         * @param refName the value to set
         * @return this builder instance
         */
        public Builder refName(String refName) {
            this.refName = refName;
            return this;
        }

        /**
         * The archive format query parameter for downloading repository endpoint.
         */
        private String format = null;

        /**
         * The archive format query parameter for downloading repository endpoint.
         * @param format the value to set
         * @return this builder instance
         */
        public Builder format(String format) {
            this.format = format;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
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
        public Builder copy(GetRepositoryArchiveContentRequest o) {
            repositoryId(o.getRepositoryId());
            refName(o.getRefName());
            format(o.getFormat());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetRepositoryArchiveContentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetRepositoryArchiveContentRequest
         */
        public GetRepositoryArchiveContentRequest build() {
            GetRepositoryArchiveContentRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetRepositoryArchiveContentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetRepositoryArchiveContentRequest
         */
        public GetRepositoryArchiveContentRequest buildWithoutInvocationCallback() {
            GetRepositoryArchiveContentRequest request = new GetRepositoryArchiveContentRequest();
            request.repositoryId = repositoryId;
            request.refName = refName;
            request.format = format;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetRepositoryArchiveContentRequest(repositoryId, refName, format, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .repositoryId(repositoryId)
                .refName(refName)
                .format(format)
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
        sb.append(",repositoryId=").append(String.valueOf(this.repositoryId));
        sb.append(",refName=").append(String.valueOf(this.refName));
        sb.append(",format=").append(String.valueOf(this.format));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetRepositoryArchiveContentRequest)) {
            return false;
        }

        GetRepositoryArchiveContentRequest other = (GetRepositoryArchiveContentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.repositoryId, other.repositoryId)
                && java.util.Objects.equals(this.refName, other.refName)
                && java.util.Objects.equals(this.format, other.format)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.repositoryId == null ? 43 : this.repositoryId.hashCode());
        result = (result * PRIME) + (this.refName == null ? 43 : this.refName.hashCode());
        result = (result * PRIME) + (this.format == null ? 43 : this.format.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
