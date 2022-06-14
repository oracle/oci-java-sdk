/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeVolumeBackupCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeVolumeBackupCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ChangeVolumeBackupCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.ChangeVolumeBackupCompartmentDetails> {

    /**
     * The OCID of the volume backup.
     */
    private String volumeBackupId;

    /**
     * The OCID of the volume backup.
     */
    public String getVolumeBackupId() {
        return volumeBackupId;
    }
    /**
     * Request to change the compartment of given volume backup.
     */
    private com.oracle.bmc.core.model.ChangeVolumeBackupCompartmentDetails
            changeVolumeBackupCompartmentDetails;

    /**
     * Request to change the compartment of given volume backup.
     */
    public com.oracle.bmc.core.model.ChangeVolumeBackupCompartmentDetails
            getChangeVolumeBackupCompartmentDetails() {
        return changeVolumeBackupCompartmentDetails;
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
    public com.oracle.bmc.core.model.ChangeVolumeBackupCompartmentDetails getBody$() {
        return changeVolumeBackupCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeVolumeBackupCompartmentRequest,
                    com.oracle.bmc.core.model.ChangeVolumeBackupCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the volume backup.
         */
        private String volumeBackupId = null;

        /**
         * The OCID of the volume backup.
         * @param volumeBackupId the value to set
         * @return this builder instance
         */
        public Builder volumeBackupId(String volumeBackupId) {
            this.volumeBackupId = volumeBackupId;
            return this;
        }

        /**
         * Request to change the compartment of given volume backup.
         */
        private com.oracle.bmc.core.model.ChangeVolumeBackupCompartmentDetails
                changeVolumeBackupCompartmentDetails = null;

        /**
         * Request to change the compartment of given volume backup.
         * @param changeVolumeBackupCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeVolumeBackupCompartmentDetails(
                com.oracle.bmc.core.model.ChangeVolumeBackupCompartmentDetails
                        changeVolumeBackupCompartmentDetails) {
            this.changeVolumeBackupCompartmentDetails = changeVolumeBackupCompartmentDetails;
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
        public Builder copy(ChangeVolumeBackupCompartmentRequest o) {
            volumeBackupId(o.getVolumeBackupId());
            changeVolumeBackupCompartmentDetails(o.getChangeVolumeBackupCompartmentDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeVolumeBackupCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeVolumeBackupCompartmentRequest
         */
        public ChangeVolumeBackupCompartmentRequest build() {
            ChangeVolumeBackupCompartmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.ChangeVolumeBackupCompartmentDetails body) {
            changeVolumeBackupCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeVolumeBackupCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeVolumeBackupCompartmentRequest
         */
        public ChangeVolumeBackupCompartmentRequest buildWithoutInvocationCallback() {
            ChangeVolumeBackupCompartmentRequest request =
                    new ChangeVolumeBackupCompartmentRequest();
            request.volumeBackupId = volumeBackupId;
            request.changeVolumeBackupCompartmentDetails = changeVolumeBackupCompartmentDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeVolumeBackupCompartmentRequest(volumeBackupId, changeVolumeBackupCompartmentDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .volumeBackupId(volumeBackupId)
                .changeVolumeBackupCompartmentDetails(changeVolumeBackupCompartmentDetails)
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
        sb.append(",volumeBackupId=").append(String.valueOf(this.volumeBackupId));
        sb.append(",changeVolumeBackupCompartmentDetails=")
                .append(String.valueOf(this.changeVolumeBackupCompartmentDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeVolumeBackupCompartmentRequest)) {
            return false;
        }

        ChangeVolumeBackupCompartmentRequest other = (ChangeVolumeBackupCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.volumeBackupId, other.volumeBackupId)
                && java.util.Objects.equals(
                        this.changeVolumeBackupCompartmentDetails,
                        other.changeVolumeBackupCompartmentDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.volumeBackupId == null ? 43 : this.volumeBackupId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeVolumeBackupCompartmentDetails == null
                                ? 43
                                : this.changeVolumeBackupCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
