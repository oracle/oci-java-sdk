/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.requests;

import com.oracle.bmc.datacc.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacc/DeleteVmInstanceExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use DeleteVmInstanceRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class DeleteVmInstanceRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM
     * instance.
     */
    private String vmInstanceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM
     * instance.
     */
    public String getVmInstanceId() {
        return vmInstanceId;
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeleteVmInstanceRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VM instance.
         */
        private String vmInstanceId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VM instance.
         *
         * @param vmInstanceId the value to set
         * @return this builder instance
         */
        public Builder vmInstanceId(String vmInstanceId) {
            this.vmInstanceId = vmInstanceId;
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
        public Builder copy(DeleteVmInstanceRequest o) {
            vmInstanceId(o.getVmInstanceId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeleteVmInstanceRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DeleteVmInstanceRequest
         */
        public DeleteVmInstanceRequest build() {
            DeleteVmInstanceRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DeleteVmInstanceRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeleteVmInstanceRequest
         */
        public DeleteVmInstanceRequest buildWithoutInvocationCallback() {
            DeleteVmInstanceRequest request = new DeleteVmInstanceRequest();
            request.vmInstanceId = vmInstanceId;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new DeleteVmInstanceRequest(vmInstanceId, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().vmInstanceId(vmInstanceId).ifMatch(ifMatch).opcRequestId(opcRequestId);
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
        sb.append(",vmInstanceId=").append(String.valueOf(this.vmInstanceId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteVmInstanceRequest)) {
            return false;
        }

        DeleteVmInstanceRequest other = (DeleteVmInstanceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.vmInstanceId, other.vmInstanceId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.vmInstanceId == null ? 43 : this.vmInstanceId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
