/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.requests;

import com.oracle.bmc.dts.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dts/UpdateTransferPackageExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateTransferPackageRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.015")
public class UpdateTransferPackageRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dts.model.UpdateTransferPackageDetails> {

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
     * fields to update
     */
    private com.oracle.bmc.dts.model.UpdateTransferPackageDetails updateTransferPackageDetails;

    public com.oracle.bmc.dts.model.UpdateTransferPackageDetails getUpdateTransferPackageDetails() {
        return updateTransferPackageDetails;
    }
    /**
     * The entity tag to match. Optional, if set, the update will be successful only if the
     * object's tag matches the tag specified in the request.
     *
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dts.model.UpdateTransferPackageDetails getBody$() {
        return updateTransferPackageDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateTransferPackageRequest,
                    com.oracle.bmc.dts.model.UpdateTransferPackageDetails> {
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

        private com.oracle.bmc.dts.model.UpdateTransferPackageDetails updateTransferPackageDetails =
                null;

        /**
         * fields to update
         * @return this builder instance
         */
        public Builder updateTransferPackageDetails(
                com.oracle.bmc.dts.model.UpdateTransferPackageDetails
                        updateTransferPackageDetails) {
            this.updateTransferPackageDetails = updateTransferPackageDetails;
            return this;
        }

        private String ifMatch = null;

        /**
         * The entity tag to match. Optional, if set, the update will be successful only if the
         * object's tag matches the tag specified in the request.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(UpdateTransferPackageRequest o) {
            id(o.getId());
            transferPackageLabel(o.getTransferPackageLabel());
            updateTransferPackageDetails(o.getUpdateTransferPackageDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateTransferPackageRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateTransferPackageRequest
         */
        public UpdateTransferPackageRequest build() {
            UpdateTransferPackageRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.dts.model.UpdateTransferPackageDetails body) {
            updateTransferPackageDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateTransferPackageRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateTransferPackageRequest
         */
        public UpdateTransferPackageRequest buildWithoutInvocationCallback() {
            UpdateTransferPackageRequest request = new UpdateTransferPackageRequest();
            request.id = id;
            request.transferPackageLabel = transferPackageLabel;
            request.updateTransferPackageDetails = updateTransferPackageDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateTransferPackageRequest(id, transferPackageLabel, updateTransferPackageDetails, ifMatch);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .id(id)
                .transferPackageLabel(transferPackageLabel)
                .updateTransferPackageDetails(updateTransferPackageDetails)
                .ifMatch(ifMatch);
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
        sb.append(",updateTransferPackageDetails=")
                .append(String.valueOf(this.updateTransferPackageDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTransferPackageRequest)) {
            return false;
        }

        UpdateTransferPackageRequest other = (UpdateTransferPackageRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.transferPackageLabel, other.transferPackageLabel)
                && java.util.Objects.equals(
                        this.updateTransferPackageDetails, other.updateTransferPackageDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
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
                        + (this.updateTransferPackageDetails == null
                                ? 43
                                : this.updateTransferPackageDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
