/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.requests;

import com.oracle.bmc.dts.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dts/UpdateTransferApplianceExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateTransferApplianceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
public class UpdateTransferApplianceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dts.model.UpdateTransferApplianceDetails> {

    /**
     * ID of the Transfer Job
     */
    private String id;

    /**
     * ID of the Transfer Job
     */
    public String getId() {
        return id;
    }
    /**
     * Label of the Transfer Appliance
     */
    private String transferApplianceLabel;

    /**
     * Label of the Transfer Appliance
     */
    public String getTransferApplianceLabel() {
        return transferApplianceLabel;
    }
    /**
     * fields to update
     */
    private com.oracle.bmc.dts.model.UpdateTransferApplianceDetails updateTransferApplianceDetails;

    /**
     * fields to update
     */
    public com.oracle.bmc.dts.model.UpdateTransferApplianceDetails
            getUpdateTransferApplianceDetails() {
        return updateTransferApplianceDetails;
    }
    /**
     * The entity tag to match. Optional, if set, the update will be successful only if the
     * object's tag matches the tag specified in the request.
     *
     */
    private String ifMatch;

    /**
     * The entity tag to match. Optional, if set, the update will be successful only if the
     * object's tag matches the tag specified in the request.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dts.model.UpdateTransferApplianceDetails getBody$() {
        return updateTransferApplianceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateTransferApplianceRequest,
                    com.oracle.bmc.dts.model.UpdateTransferApplianceDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * ID of the Transfer Job
         */
        private String id = null;

        /**
         * ID of the Transfer Job
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Label of the Transfer Appliance
         */
        private String transferApplianceLabel = null;

        /**
         * Label of the Transfer Appliance
         * @param transferApplianceLabel the value to set
         * @return this builder instance
         */
        public Builder transferApplianceLabel(String transferApplianceLabel) {
            this.transferApplianceLabel = transferApplianceLabel;
            return this;
        }

        /**
         * fields to update
         */
        private com.oracle.bmc.dts.model.UpdateTransferApplianceDetails
                updateTransferApplianceDetails = null;

        /**
         * fields to update
         * @param updateTransferApplianceDetails the value to set
         * @return this builder instance
         */
        public Builder updateTransferApplianceDetails(
                com.oracle.bmc.dts.model.UpdateTransferApplianceDetails
                        updateTransferApplianceDetails) {
            this.updateTransferApplianceDetails = updateTransferApplianceDetails;
            return this;
        }

        /**
         * The entity tag to match. Optional, if set, the update will be successful only if the
         * object's tag matches the tag specified in the request.
         *
         */
        private String ifMatch = null;

        /**
         * The entity tag to match. Optional, if set, the update will be successful only if the
         * object's tag matches the tag specified in the request.
         *
         * @param ifMatch the value to set
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
        public Builder copy(UpdateTransferApplianceRequest o) {
            id(o.getId());
            transferApplianceLabel(o.getTransferApplianceLabel());
            updateTransferApplianceDetails(o.getUpdateTransferApplianceDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateTransferApplianceRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateTransferApplianceRequest
         */
        public UpdateTransferApplianceRequest build() {
            UpdateTransferApplianceRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.dts.model.UpdateTransferApplianceDetails body) {
            updateTransferApplianceDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateTransferApplianceRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateTransferApplianceRequest
         */
        public UpdateTransferApplianceRequest buildWithoutInvocationCallback() {
            UpdateTransferApplianceRequest request = new UpdateTransferApplianceRequest();
            request.id = id;
            request.transferApplianceLabel = transferApplianceLabel;
            request.updateTransferApplianceDetails = updateTransferApplianceDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateTransferApplianceRequest(id, transferApplianceLabel, updateTransferApplianceDetails, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .id(id)
                .transferApplianceLabel(transferApplianceLabel)
                .updateTransferApplianceDetails(updateTransferApplianceDetails)
                .ifMatch(ifMatch);
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
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",transferApplianceLabel=").append(String.valueOf(this.transferApplianceLabel));
        sb.append(",updateTransferApplianceDetails=")
                .append(String.valueOf(this.updateTransferApplianceDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTransferApplianceRequest)) {
            return false;
        }

        UpdateTransferApplianceRequest other = (UpdateTransferApplianceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(
                        this.transferApplianceLabel, other.transferApplianceLabel)
                && java.util.Objects.equals(
                        this.updateTransferApplianceDetails, other.updateTransferApplianceDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.transferApplianceLabel == null
                                ? 43
                                : this.transferApplianceLabel.hashCode());
        result =
                (result * PRIME)
                        + (this.updateTransferApplianceDetails == null
                                ? 43
                                : this.updateTransferApplianceDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
