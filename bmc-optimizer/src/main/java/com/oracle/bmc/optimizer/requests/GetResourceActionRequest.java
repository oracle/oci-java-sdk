/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.requests;

import com.oracle.bmc.optimizer.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/optimizer/GetResourceActionExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetResourceActionRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200606")
public class GetResourceActionRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The unique OCID associated with the resource action. */
    private String resourceActionId;

    /** The unique OCID associated with the resource action. */
    public String getResourceActionId() {
        return resourceActionId;
    }
    /** Supplement additional resource information in extended metadata response. */
    private Boolean includeResourceMetadata;

    /** Supplement additional resource information in extended metadata response. */
    public Boolean getIncludeResourceMetadata() {
        return includeResourceMetadata;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetResourceActionRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The unique OCID associated with the resource action. */
        private String resourceActionId = null;

        /**
         * The unique OCID associated with the resource action.
         *
         * @param resourceActionId the value to set
         * @return this builder instance
         */
        public Builder resourceActionId(String resourceActionId) {
            this.resourceActionId = resourceActionId;
            return this;
        }

        /** Supplement additional resource information in extended metadata response. */
        private Boolean includeResourceMetadata = null;

        /**
         * Supplement additional resource information in extended metadata response.
         *
         * @param includeResourceMetadata the value to set
         * @return this builder instance
         */
        public Builder includeResourceMetadata(Boolean includeResourceMetadata) {
            this.includeResourceMetadata = includeResourceMetadata;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
        public Builder copy(GetResourceActionRequest o) {
            resourceActionId(o.getResourceActionId());
            includeResourceMetadata(o.getIncludeResourceMetadata());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetResourceActionRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetResourceActionRequest
         */
        public GetResourceActionRequest build() {
            GetResourceActionRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetResourceActionRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetResourceActionRequest
         */
        public GetResourceActionRequest buildWithoutInvocationCallback() {
            GetResourceActionRequest request = new GetResourceActionRequest();
            request.resourceActionId = resourceActionId;
            request.includeResourceMetadata = includeResourceMetadata;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetResourceActionRequest(resourceActionId, includeResourceMetadata,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .resourceActionId(resourceActionId)
                .includeResourceMetadata(includeResourceMetadata)
                .opcRequestId(opcRequestId);
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
        sb.append(",resourceActionId=").append(String.valueOf(this.resourceActionId));
        sb.append(",includeResourceMetadata=").append(String.valueOf(this.includeResourceMetadata));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetResourceActionRequest)) {
            return false;
        }

        GetResourceActionRequest other = (GetResourceActionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.resourceActionId, other.resourceActionId)
                && java.util.Objects.equals(
                        this.includeResourceMetadata, other.includeResourceMetadata)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.resourceActionId == null ? 43 : this.resourceActionId.hashCode());
        result =
                (result * PRIME)
                        + (this.includeResourceMetadata == null
                                ? 43
                                : this.includeResourceMetadata.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
