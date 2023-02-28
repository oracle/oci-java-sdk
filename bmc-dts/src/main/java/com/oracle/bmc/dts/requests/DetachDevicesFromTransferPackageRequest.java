/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.requests;

import com.oracle.bmc.dts.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dts/DetachDevicesFromTransferPackageExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * DetachDevicesFromTransferPackageRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
public class DetachDevicesFromTransferPackageRequest
        extends com.oracle.bmc.requests.BmcRequest<com.oracle.bmc.dts.model.DetachDevicesDetails> {

    /** ID of the Transfer Job */
    private String id;

    /** ID of the Transfer Job */
    public String getId() {
        return id;
    }
    /** Label of the Transfer Package */
    private String transferPackageLabel;

    /** Label of the Transfer Package */
    public String getTransferPackageLabel() {
        return transferPackageLabel;
    }
    /** Labels of Transfer Devices to detach */
    private com.oracle.bmc.dts.model.DetachDevicesDetails detachDevicesDetails;

    /** Labels of Transfer Devices to detach */
    public com.oracle.bmc.dts.model.DetachDevicesDetails getDetachDevicesDetails() {
        return detachDevicesDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (e.g., if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (e.g., if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dts.model.DetachDevicesDetails getBody$() {
        return detachDevicesDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DetachDevicesFromTransferPackageRequest,
                    com.oracle.bmc.dts.model.DetachDevicesDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** ID of the Transfer Job */
        private String id = null;

        /**
         * ID of the Transfer Job
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /** Label of the Transfer Package */
        private String transferPackageLabel = null;

        /**
         * Label of the Transfer Package
         *
         * @param transferPackageLabel the value to set
         * @return this builder instance
         */
        public Builder transferPackageLabel(String transferPackageLabel) {
            this.transferPackageLabel = transferPackageLabel;
            return this;
        }

        /** Labels of Transfer Devices to detach */
        private com.oracle.bmc.dts.model.DetachDevicesDetails detachDevicesDetails = null;

        /**
         * Labels of Transfer Devices to detach
         *
         * @param detachDevicesDetails the value to set
         * @return this builder instance
         */
        public Builder detachDevicesDetails(
                com.oracle.bmc.dts.model.DetachDevicesDetails detachDevicesDetails) {
            this.detachDevicesDetails = detachDevicesDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (e.g., if a
         * resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (e.g., if a
         * resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(DetachDevicesFromTransferPackageRequest o) {
            id(o.getId());
            transferPackageLabel(o.getTransferPackageLabel());
            detachDevicesDetails(o.getDetachDevicesDetails());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DetachDevicesFromTransferPackageRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DetachDevicesFromTransferPackageRequest
         */
        public DetachDevicesFromTransferPackageRequest build() {
            DetachDevicesFromTransferPackageRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.dts.model.DetachDevicesDetails body) {
            detachDevicesDetails(body);
            return this;
        }

        /**
         * Build the instance of DetachDevicesFromTransferPackageRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DetachDevicesFromTransferPackageRequest
         */
        public DetachDevicesFromTransferPackageRequest buildWithoutInvocationCallback() {
            DetachDevicesFromTransferPackageRequest request =
                    new DetachDevicesFromTransferPackageRequest();
            request.id = id;
            request.transferPackageLabel = transferPackageLabel;
            request.detachDevicesDetails = detachDevicesDetails;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new DetachDevicesFromTransferPackageRequest(id, transferPackageLabel,
            // detachDevicesDetails, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .id(id)
                .transferPackageLabel(transferPackageLabel)
                .detachDevicesDetails(detachDevicesDetails)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",transferPackageLabel=").append(String.valueOf(this.transferPackageLabel));
        sb.append(",detachDevicesDetails=").append(String.valueOf(this.detachDevicesDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetachDevicesFromTransferPackageRequest)) {
            return false;
        }

        DetachDevicesFromTransferPackageRequest other = (DetachDevicesFromTransferPackageRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.transferPackageLabel, other.transferPackageLabel)
                && java.util.Objects.equals(this.detachDevicesDetails, other.detachDevicesDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
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
                        + (this.detachDevicesDetails == null
                                ? 43
                                : this.detachDevicesDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
