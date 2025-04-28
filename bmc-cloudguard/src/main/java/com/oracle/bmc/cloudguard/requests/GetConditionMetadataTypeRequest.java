/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.requests;

import com.oracle.bmc.cloudguard.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/GetConditionMetadataTypeExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetConditionMetadataTypeRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public class GetConditionMetadataTypeRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The type of the condition metadata. */
    private com.oracle.bmc.cloudguard.model.ConditionTypeEnum conditionMetadataTypeId;

    /** The type of the condition metadata. */
    public com.oracle.bmc.cloudguard.model.ConditionTypeEnum getConditionMetadataTypeId() {
        return conditionMetadataTypeId;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** Service type filter for the condition metadata. */
    private String serviceType;

    /** Service type filter for the condition metadata. */
    public String getServiceType() {
        return serviceType;
    }
    /** Resource filter for the condition metadata. */
    private String resourceType;

    /** Resource filter for the condition metadata. */
    public String getResourceType() {
        return resourceType;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetConditionMetadataTypeRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The type of the condition metadata. */
        private com.oracle.bmc.cloudguard.model.ConditionTypeEnum conditionMetadataTypeId = null;

        /**
         * The type of the condition metadata.
         *
         * @param conditionMetadataTypeId the value to set
         * @return this builder instance
         */
        public Builder conditionMetadataTypeId(
                com.oracle.bmc.cloudguard.model.ConditionTypeEnum conditionMetadataTypeId) {
            this.conditionMetadataTypeId = conditionMetadataTypeId;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** Service type filter for the condition metadata. */
        private String serviceType = null;

        /**
         * Service type filter for the condition metadata.
         *
         * @param serviceType the value to set
         * @return this builder instance
         */
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        /** Resource filter for the condition metadata. */
        private String resourceType = null;

        /**
         * Resource filter for the condition metadata.
         *
         * @param resourceType the value to set
         * @return this builder instance
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
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
        public Builder copy(GetConditionMetadataTypeRequest o) {
            conditionMetadataTypeId(o.getConditionMetadataTypeId());
            opcRequestId(o.getOpcRequestId());
            serviceType(o.getServiceType());
            resourceType(o.getResourceType());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetConditionMetadataTypeRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetConditionMetadataTypeRequest
         */
        public GetConditionMetadataTypeRequest build() {
            GetConditionMetadataTypeRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetConditionMetadataTypeRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetConditionMetadataTypeRequest
         */
        public GetConditionMetadataTypeRequest buildWithoutInvocationCallback() {
            GetConditionMetadataTypeRequest request = new GetConditionMetadataTypeRequest();
            request.conditionMetadataTypeId = conditionMetadataTypeId;
            request.opcRequestId = opcRequestId;
            request.serviceType = serviceType;
            request.resourceType = resourceType;
            return request;
            // new GetConditionMetadataTypeRequest(conditionMetadataTypeId, opcRequestId,
            // serviceType, resourceType);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .conditionMetadataTypeId(conditionMetadataTypeId)
                .opcRequestId(opcRequestId)
                .serviceType(serviceType)
                .resourceType(resourceType);
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
        sb.append(",conditionMetadataTypeId=").append(String.valueOf(this.conditionMetadataTypeId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",serviceType=").append(String.valueOf(this.serviceType));
        sb.append(",resourceType=").append(String.valueOf(this.resourceType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetConditionMetadataTypeRequest)) {
            return false;
        }

        GetConditionMetadataTypeRequest other = (GetConditionMetadataTypeRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.conditionMetadataTypeId, other.conditionMetadataTypeId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.serviceType, other.serviceType)
                && java.util.Objects.equals(this.resourceType, other.resourceType);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.conditionMetadataTypeId == null
                                ? 43
                                : this.conditionMetadataTypeId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.serviceType == null ? 43 : this.serviceType.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        return result;
    }
}
