/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateVmClusterNetworkExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateVmClusterNetworkRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateVmClusterNetworkRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.UpdateVmClusterNetworkDetails> {

    /**
     * The Exadata infrastructure
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String exadataInfrastructureId;

    /**
     * The Exadata infrastructure
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getExadataInfrastructureId() {
        return exadataInfrastructureId;
    }
    /**
     * The VM cluster network
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String vmClusterNetworkId;

    /**
     * The VM cluster network
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getVmClusterNetworkId() {
        return vmClusterNetworkId;
    }
    /** Request to update the properties of a VM cluster network. */
    private com.oracle.bmc.database.model.UpdateVmClusterNetworkDetails
            updateVmClusterNetworkDetails;

    /** Request to update the properties of a VM cluster network. */
    public com.oracle.bmc.database.model.UpdateVmClusterNetworkDetails
            getUpdateVmClusterNetworkDetails() {
        return updateVmClusterNetworkDetails;
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
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
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
    public com.oracle.bmc.database.model.UpdateVmClusterNetworkDetails getBody$() {
        return updateVmClusterNetworkDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateVmClusterNetworkRequest,
                    com.oracle.bmc.database.model.UpdateVmClusterNetworkDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The Exadata infrastructure
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String exadataInfrastructureId = null;

        /**
         * The Exadata infrastructure
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param exadataInfrastructureId the value to set
         * @return this builder instance
         */
        public Builder exadataInfrastructureId(String exadataInfrastructureId) {
            this.exadataInfrastructureId = exadataInfrastructureId;
            return this;
        }

        /**
         * The VM cluster network
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String vmClusterNetworkId = null;

        /**
         * The VM cluster network
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param vmClusterNetworkId the value to set
         * @return this builder instance
         */
        public Builder vmClusterNetworkId(String vmClusterNetworkId) {
            this.vmClusterNetworkId = vmClusterNetworkId;
            return this;
        }

        /** Request to update the properties of a VM cluster network. */
        private com.oracle.bmc.database.model.UpdateVmClusterNetworkDetails
                updateVmClusterNetworkDetails = null;

        /**
         * Request to update the properties of a VM cluster network.
         *
         * @param updateVmClusterNetworkDetails the value to set
         * @return this builder instance
         */
        public Builder updateVmClusterNetworkDetails(
                com.oracle.bmc.database.model.UpdateVmClusterNetworkDetails
                        updateVmClusterNetworkDetails) {
            this.updateVmClusterNetworkDetails = updateVmClusterNetworkDetails;
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

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(UpdateVmClusterNetworkRequest o) {
            exadataInfrastructureId(o.getExadataInfrastructureId());
            vmClusterNetworkId(o.getVmClusterNetworkId());
            updateVmClusterNetworkDetails(o.getUpdateVmClusterNetworkDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateVmClusterNetworkRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateVmClusterNetworkRequest
         */
        public UpdateVmClusterNetworkRequest build() {
            UpdateVmClusterNetworkRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.database.model.UpdateVmClusterNetworkDetails body) {
            updateVmClusterNetworkDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateVmClusterNetworkRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateVmClusterNetworkRequest
         */
        public UpdateVmClusterNetworkRequest buildWithoutInvocationCallback() {
            UpdateVmClusterNetworkRequest request = new UpdateVmClusterNetworkRequest();
            request.exadataInfrastructureId = exadataInfrastructureId;
            request.vmClusterNetworkId = vmClusterNetworkId;
            request.updateVmClusterNetworkDetails = updateVmClusterNetworkDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateVmClusterNetworkRequest(exadataInfrastructureId, vmClusterNetworkId,
            // updateVmClusterNetworkDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .exadataInfrastructureId(exadataInfrastructureId)
                .vmClusterNetworkId(vmClusterNetworkId)
                .updateVmClusterNetworkDetails(updateVmClusterNetworkDetails)
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
        sb.append(",exadataInfrastructureId=").append(String.valueOf(this.exadataInfrastructureId));
        sb.append(",vmClusterNetworkId=").append(String.valueOf(this.vmClusterNetworkId));
        sb.append(",updateVmClusterNetworkDetails=")
                .append(String.valueOf(this.updateVmClusterNetworkDetails));
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
        if (!(o instanceof UpdateVmClusterNetworkRequest)) {
            return false;
        }

        UpdateVmClusterNetworkRequest other = (UpdateVmClusterNetworkRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.exadataInfrastructureId, other.exadataInfrastructureId)
                && java.util.Objects.equals(this.vmClusterNetworkId, other.vmClusterNetworkId)
                && java.util.Objects.equals(
                        this.updateVmClusterNetworkDetails, other.updateVmClusterNetworkDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.exadataInfrastructureId == null
                                ? 43
                                : this.exadataInfrastructureId.hashCode());
        result =
                (result * PRIME)
                        + (this.vmClusterNetworkId == null
                                ? 43
                                : this.vmClusterNetworkId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateVmClusterNetworkDetails == null
                                ? 43
                                : this.updateVmClusterNetworkDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
