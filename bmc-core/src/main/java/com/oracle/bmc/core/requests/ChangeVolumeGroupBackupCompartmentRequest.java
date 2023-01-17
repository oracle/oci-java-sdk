/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeVolumeGroupBackupCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeVolumeGroupBackupCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ChangeVolumeGroupBackupCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.ChangeVolumeGroupBackupCompartmentDetails> {

    /**
     * The Oracle Cloud ID (OCID) that uniquely identifies the volume group backup.
     *
     */
    private String volumeGroupBackupId;

    /**
     * The Oracle Cloud ID (OCID) that uniquely identifies the volume group backup.
     *
     */
    public String getVolumeGroupBackupId() {
        return volumeGroupBackupId;
    }
    /**
     * Request to change the compartment of given volume group backup.
     */
    private com.oracle.bmc.core.model.ChangeVolumeGroupBackupCompartmentDetails
            changeVolumeGroupBackupCompartmentDetails;

    /**
     * Request to change the compartment of given volume group backup.
     */
    public com.oracle.bmc.core.model.ChangeVolumeGroupBackupCompartmentDetails
            getChangeVolumeGroupBackupCompartmentDetails() {
        return changeVolumeGroupBackupCompartmentDetails;
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
    public com.oracle.bmc.core.model.ChangeVolumeGroupBackupCompartmentDetails getBody$() {
        return changeVolumeGroupBackupCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeVolumeGroupBackupCompartmentRequest,
                    com.oracle.bmc.core.model.ChangeVolumeGroupBackupCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The Oracle Cloud ID (OCID) that uniquely identifies the volume group backup.
         *
         */
        private String volumeGroupBackupId = null;

        /**
         * The Oracle Cloud ID (OCID) that uniquely identifies the volume group backup.
         *
         * @param volumeGroupBackupId the value to set
         * @return this builder instance
         */
        public Builder volumeGroupBackupId(String volumeGroupBackupId) {
            this.volumeGroupBackupId = volumeGroupBackupId;
            return this;
        }

        /**
         * Request to change the compartment of given volume group backup.
         */
        private com.oracle.bmc.core.model.ChangeVolumeGroupBackupCompartmentDetails
                changeVolumeGroupBackupCompartmentDetails = null;

        /**
         * Request to change the compartment of given volume group backup.
         * @param changeVolumeGroupBackupCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeVolumeGroupBackupCompartmentDetails(
                com.oracle.bmc.core.model.ChangeVolumeGroupBackupCompartmentDetails
                        changeVolumeGroupBackupCompartmentDetails) {
            this.changeVolumeGroupBackupCompartmentDetails =
                    changeVolumeGroupBackupCompartmentDetails;
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
        public Builder copy(ChangeVolumeGroupBackupCompartmentRequest o) {
            volumeGroupBackupId(o.getVolumeGroupBackupId());
            changeVolumeGroupBackupCompartmentDetails(
                    o.getChangeVolumeGroupBackupCompartmentDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeVolumeGroupBackupCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeVolumeGroupBackupCompartmentRequest
         */
        public ChangeVolumeGroupBackupCompartmentRequest build() {
            ChangeVolumeGroupBackupCompartmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.core.model.ChangeVolumeGroupBackupCompartmentDetails body) {
            changeVolumeGroupBackupCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeVolumeGroupBackupCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeVolumeGroupBackupCompartmentRequest
         */
        public ChangeVolumeGroupBackupCompartmentRequest buildWithoutInvocationCallback() {
            ChangeVolumeGroupBackupCompartmentRequest request =
                    new ChangeVolumeGroupBackupCompartmentRequest();
            request.volumeGroupBackupId = volumeGroupBackupId;
            request.changeVolumeGroupBackupCompartmentDetails =
                    changeVolumeGroupBackupCompartmentDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeVolumeGroupBackupCompartmentRequest(volumeGroupBackupId, changeVolumeGroupBackupCompartmentDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .volumeGroupBackupId(volumeGroupBackupId)
                .changeVolumeGroupBackupCompartmentDetails(
                        changeVolumeGroupBackupCompartmentDetails)
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
        sb.append(",volumeGroupBackupId=").append(String.valueOf(this.volumeGroupBackupId));
        sb.append(",changeVolumeGroupBackupCompartmentDetails=")
                .append(String.valueOf(this.changeVolumeGroupBackupCompartmentDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeVolumeGroupBackupCompartmentRequest)) {
            return false;
        }

        ChangeVolumeGroupBackupCompartmentRequest other =
                (ChangeVolumeGroupBackupCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.volumeGroupBackupId, other.volumeGroupBackupId)
                && java.util.Objects.equals(
                        this.changeVolumeGroupBackupCompartmentDetails,
                        other.changeVolumeGroupBackupCompartmentDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.volumeGroupBackupId == null
                                ? 43
                                : this.volumeGroupBackupId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeVolumeGroupBackupCompartmentDetails == null
                                ? 43
                                : this.changeVolumeGroupBackupCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
