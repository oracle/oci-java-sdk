/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.requests;

import com.oracle.bmc.dts.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dts/UpdateApplianceExportJobExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateApplianceExportJobRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
public class UpdateApplianceExportJobRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dts.model.UpdateApplianceExportJobDetails> {

    /** ID of the Appliance Export Job */
    private String applianceExportJobId;

    /** ID of the Appliance Export Job */
    public String getApplianceExportJobId() {
        return applianceExportJobId;
    }
    /** fields to update */
    private com.oracle.bmc.dts.model.UpdateApplianceExportJobDetails
            updateApplianceExportJobDetails;

    /** fields to update */
    public com.oracle.bmc.dts.model.UpdateApplianceExportJobDetails
            getUpdateApplianceExportJobDetails() {
        return updateApplianceExportJobDetails;
    }
    /**
     * The entity tag to match. Optional, if set, the update will be successful only if the object's
     * tag matches the tag specified in the request.
     */
    private String ifMatch;

    /**
     * The entity tag to match. Optional, if set, the update will be successful only if the object's
     * tag matches the tag specified in the request.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
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
    public com.oracle.bmc.dts.model.UpdateApplianceExportJobDetails getBody$() {
        return updateApplianceExportJobDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateApplianceExportJobRequest,
                    com.oracle.bmc.dts.model.UpdateApplianceExportJobDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** ID of the Appliance Export Job */
        private String applianceExportJobId = null;

        /**
         * ID of the Appliance Export Job
         *
         * @param applianceExportJobId the value to set
         * @return this builder instance
         */
        public Builder applianceExportJobId(String applianceExportJobId) {
            this.applianceExportJobId = applianceExportJobId;
            return this;
        }

        /** fields to update */
        private com.oracle.bmc.dts.model.UpdateApplianceExportJobDetails
                updateApplianceExportJobDetails = null;

        /**
         * fields to update
         *
         * @param updateApplianceExportJobDetails the value to set
         * @return this builder instance
         */
        public Builder updateApplianceExportJobDetails(
                com.oracle.bmc.dts.model.UpdateApplianceExportJobDetails
                        updateApplianceExportJobDetails) {
            this.updateApplianceExportJobDetails = updateApplianceExportJobDetails;
            return this;
        }

        /**
         * The entity tag to match. Optional, if set, the update will be successful only if the
         * object's tag matches the tag specified in the request.
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
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
        public Builder copy(UpdateApplianceExportJobRequest o) {
            applianceExportJobId(o.getApplianceExportJobId());
            updateApplianceExportJobDetails(o.getUpdateApplianceExportJobDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateApplianceExportJobRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateApplianceExportJobRequest
         */
        public UpdateApplianceExportJobRequest build() {
            UpdateApplianceExportJobRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.dts.model.UpdateApplianceExportJobDetails body) {
            updateApplianceExportJobDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateApplianceExportJobRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateApplianceExportJobRequest
         */
        public UpdateApplianceExportJobRequest buildWithoutInvocationCallback() {
            UpdateApplianceExportJobRequest request = new UpdateApplianceExportJobRequest();
            request.applianceExportJobId = applianceExportJobId;
            request.updateApplianceExportJobDetails = updateApplianceExportJobDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateApplianceExportJobRequest(applianceExportJobId,
            // updateApplianceExportJobDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .applianceExportJobId(applianceExportJobId)
                .updateApplianceExportJobDetails(updateApplianceExportJobDetails)
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
        sb.append(",applianceExportJobId=").append(String.valueOf(this.applianceExportJobId));
        sb.append(",updateApplianceExportJobDetails=")
                .append(String.valueOf(this.updateApplianceExportJobDetails));
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
        if (!(o instanceof UpdateApplianceExportJobRequest)) {
            return false;
        }

        UpdateApplianceExportJobRequest other = (UpdateApplianceExportJobRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.applianceExportJobId, other.applianceExportJobId)
                && java.util.Objects.equals(
                        this.updateApplianceExportJobDetails, other.updateApplianceExportJobDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.applianceExportJobId == null
                                ? 43
                                : this.applianceExportJobId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateApplianceExportJobDetails == null
                                ? 43
                                : this.updateApplianceExportJobDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
