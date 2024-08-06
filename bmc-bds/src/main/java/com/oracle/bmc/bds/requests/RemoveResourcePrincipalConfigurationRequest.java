/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.requests;

import com.oracle.bmc.bds.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bds/RemoveResourcePrincipalConfigurationExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * RemoveResourcePrincipalConfigurationRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
public class RemoveResourcePrincipalConfigurationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.bds.model.RemoveResourcePrincipalConfigurationDetails> {

    /** The OCID of the cluster. */
    private String bdsInstanceId;

    /** The OCID of the cluster. */
    public String getBdsInstanceId() {
        return bdsInstanceId;
    }
    /** Unique Oracle-assigned identifier of the ResourcePrincipalConfiguration. */
    private String resourcePrincipalConfigurationId;

    /** Unique Oracle-assigned identifier of the ResourcePrincipalConfiguration. */
    public String getResourcePrincipalConfigurationId() {
        return resourcePrincipalConfigurationId;
    }
    /** Details of removing a resource principal for the bds cluster. */
    private com.oracle.bmc.bds.model.RemoveResourcePrincipalConfigurationDetails
            removeResourcePrincipalConfigurationDetails;

    /** Details of removing a resource principal for the bds cluster. */
    public com.oracle.bmc.bds.model.RemoveResourcePrincipalConfigurationDetails
            getRemoveResourcePrincipalConfigurationDetails() {
        return removeResourcePrincipalConfigurationDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.bds.model.RemoveResourcePrincipalConfigurationDetails getBody$() {
        return removeResourcePrincipalConfigurationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RemoveResourcePrincipalConfigurationRequest,
                    com.oracle.bmc.bds.model.RemoveResourcePrincipalConfigurationDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the cluster. */
        private String bdsInstanceId = null;

        /**
         * The OCID of the cluster.
         *
         * @param bdsInstanceId the value to set
         * @return this builder instance
         */
        public Builder bdsInstanceId(String bdsInstanceId) {
            this.bdsInstanceId = bdsInstanceId;
            return this;
        }

        /** Unique Oracle-assigned identifier of the ResourcePrincipalConfiguration. */
        private String resourcePrincipalConfigurationId = null;

        /**
         * Unique Oracle-assigned identifier of the ResourcePrincipalConfiguration.
         *
         * @param resourcePrincipalConfigurationId the value to set
         * @return this builder instance
         */
        public Builder resourcePrincipalConfigurationId(String resourcePrincipalConfigurationId) {
            this.resourcePrincipalConfigurationId = resourcePrincipalConfigurationId;
            return this;
        }

        /** Details of removing a resource principal for the bds cluster. */
        private com.oracle.bmc.bds.model.RemoveResourcePrincipalConfigurationDetails
                removeResourcePrincipalConfigurationDetails = null;

        /**
         * Details of removing a resource principal for the bds cluster.
         *
         * @param removeResourcePrincipalConfigurationDetails the value to set
         * @return this builder instance
         */
        public Builder removeResourcePrincipalConfigurationDetails(
                com.oracle.bmc.bds.model.RemoveResourcePrincipalConfigurationDetails
                        removeResourcePrincipalConfigurationDetails) {
            this.removeResourcePrincipalConfigurationDetails =
                    removeResourcePrincipalConfigurationDetails;
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

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(RemoveResourcePrincipalConfigurationRequest o) {
            bdsInstanceId(o.getBdsInstanceId());
            resourcePrincipalConfigurationId(o.getResourcePrincipalConfigurationId());
            removeResourcePrincipalConfigurationDetails(
                    o.getRemoveResourcePrincipalConfigurationDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RemoveResourcePrincipalConfigurationRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of RemoveResourcePrincipalConfigurationRequest
         */
        public RemoveResourcePrincipalConfigurationRequest build() {
            RemoveResourcePrincipalConfigurationRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.bds.model.RemoveResourcePrincipalConfigurationDetails body) {
            removeResourcePrincipalConfigurationDetails(body);
            return this;
        }

        /**
         * Build the instance of RemoveResourcePrincipalConfigurationRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RemoveResourcePrincipalConfigurationRequest
         */
        public RemoveResourcePrincipalConfigurationRequest buildWithoutInvocationCallback() {
            RemoveResourcePrincipalConfigurationRequest request =
                    new RemoveResourcePrincipalConfigurationRequest();
            request.bdsInstanceId = bdsInstanceId;
            request.resourcePrincipalConfigurationId = resourcePrincipalConfigurationId;
            request.removeResourcePrincipalConfigurationDetails =
                    removeResourcePrincipalConfigurationDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new RemoveResourcePrincipalConfigurationRequest(bdsInstanceId,
            // resourcePrincipalConfigurationId, removeResourcePrincipalConfigurationDetails,
            // opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .bdsInstanceId(bdsInstanceId)
                .resourcePrincipalConfigurationId(resourcePrincipalConfigurationId)
                .removeResourcePrincipalConfigurationDetails(
                        removeResourcePrincipalConfigurationDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
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
        sb.append(",bdsInstanceId=").append(String.valueOf(this.bdsInstanceId));
        sb.append(",resourcePrincipalConfigurationId=")
                .append(String.valueOf(this.resourcePrincipalConfigurationId));
        sb.append(",removeResourcePrincipalConfigurationDetails=")
                .append(String.valueOf(this.removeResourcePrincipalConfigurationDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoveResourcePrincipalConfigurationRequest)) {
            return false;
        }

        RemoveResourcePrincipalConfigurationRequest other =
                (RemoveResourcePrincipalConfigurationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.bdsInstanceId, other.bdsInstanceId)
                && java.util.Objects.equals(
                        this.resourcePrincipalConfigurationId,
                        other.resourcePrincipalConfigurationId)
                && java.util.Objects.equals(
                        this.removeResourcePrincipalConfigurationDetails,
                        other.removeResourcePrincipalConfigurationDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.bdsInstanceId == null ? 43 : this.bdsInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.resourcePrincipalConfigurationId == null
                                ? 43
                                : this.resourcePrincipalConfigurationId.hashCode());
        result =
                (result * PRIME)
                        + (this.removeResourcePrincipalConfigurationDetails == null
                                ? 43
                                : this.removeResourcePrincipalConfigurationDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
