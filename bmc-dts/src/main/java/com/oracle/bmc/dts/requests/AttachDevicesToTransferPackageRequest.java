/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.requests;

import com.oracle.bmc.dts.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dts/AttachDevicesToTransferPackageExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use AttachDevicesToTransferPackageRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.015")
public class AttachDevicesToTransferPackageRequest
        extends com.oracle.bmc.requests.BmcRequest<com.oracle.bmc.dts.model.AttachDevicesDetails> {

    /**
     * ID of the Transfer Job
     */
    private String id;

    public String getId() {
        return id;
    }
    /**
     * Label of the Transfer Package
     */
    private String transferPackageLabel;

    public String getTransferPackageLabel() {
        return transferPackageLabel;
    }
    /**
     * Labels of Transfer Devices to attach
     */
    private com.oracle.bmc.dts.model.AttachDevicesDetails attachDevicesDetails;

    public com.oracle.bmc.dts.model.AttachDevicesDetails getAttachDevicesDetails() {
        return attachDevicesDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dts.model.AttachDevicesDetails getBody$() {
        return attachDevicesDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    AttachDevicesToTransferPackageRequest,
                    com.oracle.bmc.dts.model.AttachDevicesDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String id = null;

        /**
         * ID of the Transfer Job
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        private String transferPackageLabel = null;

        /**
         * Label of the Transfer Package
         * @return this builder instance
         */
        public Builder transferPackageLabel(String transferPackageLabel) {
            this.transferPackageLabel = transferPackageLabel;
            return this;
        }

        private com.oracle.bmc.dts.model.AttachDevicesDetails attachDevicesDetails = null;

        /**
         * Labels of Transfer Devices to attach
         * @return this builder instance
         */
        public Builder attachDevicesDetails(
                com.oracle.bmc.dts.model.AttachDevicesDetails attachDevicesDetails) {
            this.attachDevicesDetails = attachDevicesDetails;
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
        public Builder copy(AttachDevicesToTransferPackageRequest o) {
            id(o.getId());
            transferPackageLabel(o.getTransferPackageLabel());
            attachDevicesDetails(o.getAttachDevicesDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of AttachDevicesToTransferPackageRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of AttachDevicesToTransferPackageRequest
         */
        public AttachDevicesToTransferPackageRequest build() {
            AttachDevicesToTransferPackageRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.dts.model.AttachDevicesDetails body) {
            attachDevicesDetails(body);
            return this;
        }

        /**
         * Build the instance of AttachDevicesToTransferPackageRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of AttachDevicesToTransferPackageRequest
         */
        public AttachDevicesToTransferPackageRequest buildWithoutInvocationCallback() {
            AttachDevicesToTransferPackageRequest request =
                    new AttachDevicesToTransferPackageRequest();
            request.id = id;
            request.transferPackageLabel = transferPackageLabel;
            request.attachDevicesDetails = attachDevicesDetails;
            return request;
            // new AttachDevicesToTransferPackageRequest(id, transferPackageLabel, attachDevicesDetails);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .id(id)
                .transferPackageLabel(transferPackageLabel)
                .attachDevicesDetails(attachDevicesDetails);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",transferPackageLabel=").append(String.valueOf(this.transferPackageLabel));
        sb.append(",attachDevicesDetails=").append(String.valueOf(this.attachDevicesDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttachDevicesToTransferPackageRequest)) {
            return false;
        }

        AttachDevicesToTransferPackageRequest other = (AttachDevicesToTransferPackageRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.transferPackageLabel, other.transferPackageLabel)
                && java.util.Objects.equals(this.attachDevicesDetails, other.attachDevicesDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.transferPackageLabel == null
                                ? 43
                                : this.transferPackageLabel.hashCode());
        result =
                (result * PRIME)
                        + (this.attachDevicesDetails == null
                                ? 43
                                : this.attachDevicesDetails.hashCode());
        return result;
    }
}
