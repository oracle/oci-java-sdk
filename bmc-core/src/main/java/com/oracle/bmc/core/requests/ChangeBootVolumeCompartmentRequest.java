/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeBootVolumeCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeBootVolumeCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ChangeBootVolumeCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.ChangeBootVolumeCompartmentDetails> {

    /**
     * The OCID of the boot volume.
     */
    private String bootVolumeId;

    /**
     * The OCID of the boot volume.
     */
    public String getBootVolumeId() {
        return bootVolumeId;
    }
    /**
     * Request to change the compartment of given boot volume.
     */
    private com.oracle.bmc.core.model.ChangeBootVolumeCompartmentDetails
            changeBootVolumeCompartmentDetails;

    /**
     * Request to change the compartment of given boot volume.
     */
    public com.oracle.bmc.core.model.ChangeBootVolumeCompartmentDetails
            getChangeBootVolumeCompartmentDetails() {
        return changeBootVolumeCompartmentDetails;
    }
    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.ChangeBootVolumeCompartmentDetails getBody$() {
        return changeBootVolumeCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeBootVolumeCompartmentRequest,
                    com.oracle.bmc.core.model.ChangeBootVolumeCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the boot volume.
         */
        private String bootVolumeId = null;

        /**
         * The OCID of the boot volume.
         * @param bootVolumeId the value to set
         * @return this builder instance
         */
        public Builder bootVolumeId(String bootVolumeId) {
            this.bootVolumeId = bootVolumeId;
            return this;
        }

        /**
         * Request to change the compartment of given boot volume.
         */
        private com.oracle.bmc.core.model.ChangeBootVolumeCompartmentDetails
                changeBootVolumeCompartmentDetails = null;

        /**
         * Request to change the compartment of given boot volume.
         * @param changeBootVolumeCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeBootVolumeCompartmentDetails(
                com.oracle.bmc.core.model.ChangeBootVolumeCompartmentDetails
                        changeBootVolumeCompartmentDetails) {
            this.changeBootVolumeCompartmentDetails = changeBootVolumeCompartmentDetails;
            return this;
        }

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
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
        public Builder copy(ChangeBootVolumeCompartmentRequest o) {
            bootVolumeId(o.getBootVolumeId());
            changeBootVolumeCompartmentDetails(o.getChangeBootVolumeCompartmentDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeBootVolumeCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeBootVolumeCompartmentRequest
         */
        public ChangeBootVolumeCompartmentRequest build() {
            ChangeBootVolumeCompartmentRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.core.model.ChangeBootVolumeCompartmentDetails body) {
            changeBootVolumeCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeBootVolumeCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeBootVolumeCompartmentRequest
         */
        public ChangeBootVolumeCompartmentRequest buildWithoutInvocationCallback() {
            ChangeBootVolumeCompartmentRequest request = new ChangeBootVolumeCompartmentRequest();
            request.bootVolumeId = bootVolumeId;
            request.changeBootVolumeCompartmentDetails = changeBootVolumeCompartmentDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeBootVolumeCompartmentRequest(bootVolumeId, changeBootVolumeCompartmentDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .bootVolumeId(bootVolumeId)
                .changeBootVolumeCompartmentDetails(changeBootVolumeCompartmentDetails)
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
        sb.append(",bootVolumeId=").append(String.valueOf(this.bootVolumeId));
        sb.append(",changeBootVolumeCompartmentDetails=")
                .append(String.valueOf(this.changeBootVolumeCompartmentDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeBootVolumeCompartmentRequest)) {
            return false;
        }

        ChangeBootVolumeCompartmentRequest other = (ChangeBootVolumeCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.bootVolumeId, other.bootVolumeId)
                && java.util.Objects.equals(
                        this.changeBootVolumeCompartmentDetails,
                        other.changeBootVolumeCompartmentDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.bootVolumeId == null ? 43 : this.bootVolumeId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeBootVolumeCompartmentDetails == null
                                ? 43
                                : this.changeBootVolumeCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
