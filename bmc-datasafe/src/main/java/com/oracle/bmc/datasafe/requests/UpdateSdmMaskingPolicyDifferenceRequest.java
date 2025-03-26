/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateSdmMaskingPolicyDifferenceExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateSdmMaskingPolicyDifferenceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class UpdateSdmMaskingPolicyDifferenceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.UpdateSdmMaskingPolicyDifferenceDetails> {

    /**
     * The OCID of the SDM masking policy difference.
     */
    private String sdmMaskingPolicyDifferenceId;

    /**
     * The OCID of the SDM masking policy difference.
     */
    public String getSdmMaskingPolicyDifferenceId() {
        return sdmMaskingPolicyDifferenceId;
    }
    /**
     * Details to update a sdm masking policy difference.
     */
    private com.oracle.bmc.datasafe.model.UpdateSdmMaskingPolicyDifferenceDetails
            updateSdmMaskingPolicyDifferenceDetails;

    /**
     * Details to update a sdm masking policy difference.
     */
    public com.oracle.bmc.datasafe.model.UpdateSdmMaskingPolicyDifferenceDetails
            getUpdateSdmMaskingPolicyDifferenceDetails() {
        return updateSdmMaskingPolicyDifferenceDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the if-match parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the if-match parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
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
    public com.oracle.bmc.datasafe.model.UpdateSdmMaskingPolicyDifferenceDetails getBody$() {
        return updateSdmMaskingPolicyDifferenceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateSdmMaskingPolicyDifferenceRequest,
                    com.oracle.bmc.datasafe.model.UpdateSdmMaskingPolicyDifferenceDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the SDM masking policy difference.
         */
        private String sdmMaskingPolicyDifferenceId = null;

        /**
         * The OCID of the SDM masking policy difference.
         * @param sdmMaskingPolicyDifferenceId the value to set
         * @return this builder instance
         */
        public Builder sdmMaskingPolicyDifferenceId(String sdmMaskingPolicyDifferenceId) {
            this.sdmMaskingPolicyDifferenceId = sdmMaskingPolicyDifferenceId;
            return this;
        }

        /**
         * Details to update a sdm masking policy difference.
         */
        private com.oracle.bmc.datasafe.model.UpdateSdmMaskingPolicyDifferenceDetails
                updateSdmMaskingPolicyDifferenceDetails = null;

        /**
         * Details to update a sdm masking policy difference.
         * @param updateSdmMaskingPolicyDifferenceDetails the value to set
         * @return this builder instance
         */
        public Builder updateSdmMaskingPolicyDifferenceDetails(
                com.oracle.bmc.datasafe.model.UpdateSdmMaskingPolicyDifferenceDetails
                        updateSdmMaskingPolicyDifferenceDetails) {
            this.updateSdmMaskingPolicyDifferenceDetails = updateSdmMaskingPolicyDifferenceDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the if-match parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the if-match parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique identifier for the request.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(UpdateSdmMaskingPolicyDifferenceRequest o) {
            sdmMaskingPolicyDifferenceId(o.getSdmMaskingPolicyDifferenceId());
            updateSdmMaskingPolicyDifferenceDetails(o.getUpdateSdmMaskingPolicyDifferenceDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateSdmMaskingPolicyDifferenceRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateSdmMaskingPolicyDifferenceRequest
         */
        public UpdateSdmMaskingPolicyDifferenceRequest build() {
            UpdateSdmMaskingPolicyDifferenceRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.datasafe.model.UpdateSdmMaskingPolicyDifferenceDetails body) {
            updateSdmMaskingPolicyDifferenceDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateSdmMaskingPolicyDifferenceRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateSdmMaskingPolicyDifferenceRequest
         */
        public UpdateSdmMaskingPolicyDifferenceRequest buildWithoutInvocationCallback() {
            UpdateSdmMaskingPolicyDifferenceRequest request =
                    new UpdateSdmMaskingPolicyDifferenceRequest();
            request.sdmMaskingPolicyDifferenceId = sdmMaskingPolicyDifferenceId;
            request.updateSdmMaskingPolicyDifferenceDetails =
                    updateSdmMaskingPolicyDifferenceDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateSdmMaskingPolicyDifferenceRequest(sdmMaskingPolicyDifferenceId, updateSdmMaskingPolicyDifferenceDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .sdmMaskingPolicyDifferenceId(sdmMaskingPolicyDifferenceId)
                .updateSdmMaskingPolicyDifferenceDetails(updateSdmMaskingPolicyDifferenceDetails)
                .ifMatch(ifMatch)
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
        sb.append(",sdmMaskingPolicyDifferenceId=")
                .append(String.valueOf(this.sdmMaskingPolicyDifferenceId));
        sb.append(",updateSdmMaskingPolicyDifferenceDetails=")
                .append(String.valueOf(this.updateSdmMaskingPolicyDifferenceDetails));
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
        if (!(o instanceof UpdateSdmMaskingPolicyDifferenceRequest)) {
            return false;
        }

        UpdateSdmMaskingPolicyDifferenceRequest other = (UpdateSdmMaskingPolicyDifferenceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.sdmMaskingPolicyDifferenceId, other.sdmMaskingPolicyDifferenceId)
                && java.util.Objects.equals(
                        this.updateSdmMaskingPolicyDifferenceDetails,
                        other.updateSdmMaskingPolicyDifferenceDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.sdmMaskingPolicyDifferenceId == null
                                ? 43
                                : this.sdmMaskingPolicyDifferenceId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateSdmMaskingPolicyDifferenceDetails == null
                                ? 43
                                : this.updateSdmMaskingPolicyDifferenceDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
