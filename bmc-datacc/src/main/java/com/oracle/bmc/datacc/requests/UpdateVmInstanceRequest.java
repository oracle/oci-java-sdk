/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.requests;

import com.oracle.bmc.datacc.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacc/UpdateVmInstanceExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateVmInstanceRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class UpdateVmInstanceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datacc.model.UpdateVmInstanceDetails> {

    /** The updated VM instance details. */
    private com.oracle.bmc.datacc.model.UpdateVmInstanceDetails updateVmInstanceDetails;

    /** The updated VM instance details. */
    public com.oracle.bmc.datacc.model.UpdateVmInstanceDetails getUpdateVmInstanceDetails() {
        return updateVmInstanceDetails;
    }
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

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.datacc.model.UpdateVmInstanceDetails getBody$() {
        return updateVmInstanceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateVmInstanceRequest, com.oracle.bmc.datacc.model.UpdateVmInstanceDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The updated VM instance details. */
        private com.oracle.bmc.datacc.model.UpdateVmInstanceDetails updateVmInstanceDetails = null;

        /**
         * The updated VM instance details.
         *
         * @param updateVmInstanceDetails the value to set
         * @return this builder instance
         */
        public Builder updateVmInstanceDetails(
                com.oracle.bmc.datacc.model.UpdateVmInstanceDetails updateVmInstanceDetails) {
            this.updateVmInstanceDetails = updateVmInstanceDetails;
            return this;
        }

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
        public Builder copy(UpdateVmInstanceRequest o) {
            updateVmInstanceDetails(o.getUpdateVmInstanceDetails());
            vmInstanceId(o.getVmInstanceId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateVmInstanceRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateVmInstanceRequest
         */
        public UpdateVmInstanceRequest build() {
            UpdateVmInstanceRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datacc.model.UpdateVmInstanceDetails body) {
            updateVmInstanceDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateVmInstanceRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateVmInstanceRequest
         */
        public UpdateVmInstanceRequest buildWithoutInvocationCallback() {
            UpdateVmInstanceRequest request = new UpdateVmInstanceRequest();
            request.updateVmInstanceDetails = updateVmInstanceDetails;
            request.vmInstanceId = vmInstanceId;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateVmInstanceRequest(updateVmInstanceDetails, vmInstanceId, ifMatch,
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
                .updateVmInstanceDetails(updateVmInstanceDetails)
                .vmInstanceId(vmInstanceId)
                .ifMatch(ifMatch)
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
        sb.append(",updateVmInstanceDetails=").append(String.valueOf(this.updateVmInstanceDetails));
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
        if (!(o instanceof UpdateVmInstanceRequest)) {
            return false;
        }

        UpdateVmInstanceRequest other = (UpdateVmInstanceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.updateVmInstanceDetails, other.updateVmInstanceDetails)
                && java.util.Objects.equals(this.vmInstanceId, other.vmInstanceId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.updateVmInstanceDetails == null
                                ? 43
                                : this.updateVmInstanceDetails.hashCode());
        result = (result * PRIME) + (this.vmInstanceId == null ? 43 : this.vmInstanceId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
