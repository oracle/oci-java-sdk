/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeBootVolumeBackupCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeBootVolumeBackupCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ChangeBootVolumeBackupCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.ChangeBootVolumeBackupCompartmentDetails> {

    /** The OCID of the boot volume backup. */
    private String bootVolumeBackupId;

    /** The OCID of the boot volume backup. */
    public String getBootVolumeBackupId() {
        return bootVolumeBackupId;
    }
    /** Request to change the compartment of given boot volume backup. */
    private com.oracle.bmc.core.model.ChangeBootVolumeBackupCompartmentDetails
            changeBootVolumeBackupCompartmentDetails;

    /** Request to change the compartment of given boot volume backup. */
    public com.oracle.bmc.core.model.ChangeBootVolumeBackupCompartmentDetails
            getChangeBootVolumeBackupCompartmentDetails() {
        return changeBootVolumeBackupCompartmentDetails;
    }
    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
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
    public com.oracle.bmc.core.model.ChangeBootVolumeBackupCompartmentDetails getBody$() {
        return changeBootVolumeBackupCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeBootVolumeBackupCompartmentRequest,
                    com.oracle.bmc.core.model.ChangeBootVolumeBackupCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the boot volume backup. */
        private String bootVolumeBackupId = null;

        /**
         * The OCID of the boot volume backup.
         *
         * @param bootVolumeBackupId the value to set
         * @return this builder instance
         */
        public Builder bootVolumeBackupId(String bootVolumeBackupId) {
            this.bootVolumeBackupId = bootVolumeBackupId;
            return this;
        }

        /** Request to change the compartment of given boot volume backup. */
        private com.oracle.bmc.core.model.ChangeBootVolumeBackupCompartmentDetails
                changeBootVolumeBackupCompartmentDetails = null;

        /**
         * Request to change the compartment of given boot volume backup.
         *
         * @param changeBootVolumeBackupCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeBootVolumeBackupCompartmentDetails(
                com.oracle.bmc.core.model.ChangeBootVolumeBackupCompartmentDetails
                        changeBootVolumeBackupCompartmentDetails) {
            this.changeBootVolumeBackupCompartmentDetails =
                    changeBootVolumeBackupCompartmentDetails;
            return this;
        }

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
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
        public Builder copy(ChangeBootVolumeBackupCompartmentRequest o) {
            bootVolumeBackupId(o.getBootVolumeBackupId());
            changeBootVolumeBackupCompartmentDetails(
                    o.getChangeBootVolumeBackupCompartmentDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeBootVolumeBackupCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeBootVolumeBackupCompartmentRequest
         */
        public ChangeBootVolumeBackupCompartmentRequest build() {
            ChangeBootVolumeBackupCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.core.model.ChangeBootVolumeBackupCompartmentDetails body) {
            changeBootVolumeBackupCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeBootVolumeBackupCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeBootVolumeBackupCompartmentRequest
         */
        public ChangeBootVolumeBackupCompartmentRequest buildWithoutInvocationCallback() {
            ChangeBootVolumeBackupCompartmentRequest request =
                    new ChangeBootVolumeBackupCompartmentRequest();
            request.bootVolumeBackupId = bootVolumeBackupId;
            request.changeBootVolumeBackupCompartmentDetails =
                    changeBootVolumeBackupCompartmentDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeBootVolumeBackupCompartmentRequest(bootVolumeBackupId,
            // changeBootVolumeBackupCompartmentDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .bootVolumeBackupId(bootVolumeBackupId)
                .changeBootVolumeBackupCompartmentDetails(changeBootVolumeBackupCompartmentDetails)
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
        sb.append(",bootVolumeBackupId=").append(String.valueOf(this.bootVolumeBackupId));
        sb.append(",changeBootVolumeBackupCompartmentDetails=")
                .append(String.valueOf(this.changeBootVolumeBackupCompartmentDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeBootVolumeBackupCompartmentRequest)) {
            return false;
        }

        ChangeBootVolumeBackupCompartmentRequest other =
                (ChangeBootVolumeBackupCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.bootVolumeBackupId, other.bootVolumeBackupId)
                && java.util.Objects.equals(
                        this.changeBootVolumeBackupCompartmentDetails,
                        other.changeBootVolumeBackupCompartmentDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.bootVolumeBackupId == null
                                ? 43
                                : this.bootVolumeBackupId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeBootVolumeBackupCompartmentDetails == null
                                ? 43
                                : this.changeBootVolumeBackupCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
