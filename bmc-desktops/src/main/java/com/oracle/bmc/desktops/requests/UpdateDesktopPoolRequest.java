/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.desktops.requests;

import com.oracle.bmc.desktops.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/desktops/UpdateDesktopPoolExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateDesktopPoolRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220618")
public class UpdateDesktopPoolRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.desktops.model.UpdateDesktopPoolDetails> {

    /** The OCID of the desktop pool. */
    private String desktopPoolId;

    /** The OCID of the desktop pool. */
    public String getDesktopPoolId() {
        return desktopPoolId;
    }
    /** The details of the update. */
    private com.oracle.bmc.desktops.model.UpdateDesktopPoolDetails updateDesktopPoolDetails;

    /** The details of the update. */
    public com.oracle.bmc.desktops.model.UpdateDesktopPoolDetails getUpdateDesktopPoolDetails() {
        return updateDesktopPoolDetails;
    }
    /** The unique identifier of the request. */
    private String opcRequestId;

    /** The unique identifier of the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** For optimistic concurrency control. */
    private String ifMatch;

    /** For optimistic concurrency control. */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.desktops.model.UpdateDesktopPoolDetails getBody$() {
        return updateDesktopPoolDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateDesktopPoolRequest,
                    com.oracle.bmc.desktops.model.UpdateDesktopPoolDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the desktop pool. */
        private String desktopPoolId = null;

        /**
         * The OCID of the desktop pool.
         *
         * @param desktopPoolId the value to set
         * @return this builder instance
         */
        public Builder desktopPoolId(String desktopPoolId) {
            this.desktopPoolId = desktopPoolId;
            return this;
        }

        /** The details of the update. */
        private com.oracle.bmc.desktops.model.UpdateDesktopPoolDetails updateDesktopPoolDetails =
                null;

        /**
         * The details of the update.
         *
         * @param updateDesktopPoolDetails the value to set
         * @return this builder instance
         */
        public Builder updateDesktopPoolDetails(
                com.oracle.bmc.desktops.model.UpdateDesktopPoolDetails updateDesktopPoolDetails) {
            this.updateDesktopPoolDetails = updateDesktopPoolDetails;
            return this;
        }

        /** The unique identifier of the request. */
        private String opcRequestId = null;

        /**
         * The unique identifier of the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** For optimistic concurrency control. */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control.
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
        public Builder copy(UpdateDesktopPoolRequest o) {
            desktopPoolId(o.getDesktopPoolId());
            updateDesktopPoolDetails(o.getUpdateDesktopPoolDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateDesktopPoolRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateDesktopPoolRequest
         */
        public UpdateDesktopPoolRequest build() {
            UpdateDesktopPoolRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.desktops.model.UpdateDesktopPoolDetails body) {
            updateDesktopPoolDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateDesktopPoolRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateDesktopPoolRequest
         */
        public UpdateDesktopPoolRequest buildWithoutInvocationCallback() {
            UpdateDesktopPoolRequest request = new UpdateDesktopPoolRequest();
            request.desktopPoolId = desktopPoolId;
            request.updateDesktopPoolDetails = updateDesktopPoolDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateDesktopPoolRequest(desktopPoolId, updateDesktopPoolDetails, opcRequestId,
            // ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .desktopPoolId(desktopPoolId)
                .updateDesktopPoolDetails(updateDesktopPoolDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
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
        sb.append(",desktopPoolId=").append(String.valueOf(this.desktopPoolId));
        sb.append(",updateDesktopPoolDetails=")
                .append(String.valueOf(this.updateDesktopPoolDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDesktopPoolRequest)) {
            return false;
        }

        UpdateDesktopPoolRequest other = (UpdateDesktopPoolRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.desktopPoolId, other.desktopPoolId)
                && java.util.Objects.equals(
                        this.updateDesktopPoolDetails, other.updateDesktopPoolDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.desktopPoolId == null ? 43 : this.desktopPoolId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateDesktopPoolDetails == null
                                ? 43
                                : this.updateDesktopPoolDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
