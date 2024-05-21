/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.desktops.requests;

import com.oracle.bmc.desktops.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/desktops/UpdateDesktopExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateDesktopRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220618")
public class UpdateDesktopRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.desktops.model.UpdateDesktopDetails> {

    /**
     * The OCID of the desktop.
     */
    private String desktopId;

    /**
     * The OCID of the desktop.
     */
    public String getDesktopId() {
        return desktopId;
    }
    /**
     * The details of the update.
     */
    private com.oracle.bmc.desktops.model.UpdateDesktopDetails updateDesktopDetails;

    /**
     * The details of the update.
     */
    public com.oracle.bmc.desktops.model.UpdateDesktopDetails getUpdateDesktopDetails() {
        return updateDesktopDetails;
    }
    /**
     * The unique identifier of the request.
     */
    private String opcRequestId;

    /**
     * The unique identifier of the request.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control.
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
    public com.oracle.bmc.desktops.model.UpdateDesktopDetails getBody$() {
        return updateDesktopDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateDesktopRequest, com.oracle.bmc.desktops.model.UpdateDesktopDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the desktop.
         */
        private String desktopId = null;

        /**
         * The OCID of the desktop.
         * @param desktopId the value to set
         * @return this builder instance
         */
        public Builder desktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The details of the update.
         */
        private com.oracle.bmc.desktops.model.UpdateDesktopDetails updateDesktopDetails = null;

        /**
         * The details of the update.
         * @param updateDesktopDetails the value to set
         * @return this builder instance
         */
        public Builder updateDesktopDetails(
                com.oracle.bmc.desktops.model.UpdateDesktopDetails updateDesktopDetails) {
            this.updateDesktopDetails = updateDesktopDetails;
            return this;
        }

        /**
         * The unique identifier of the request.
         */
        private String opcRequestId = null;

        /**
         * The unique identifier of the request.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control.
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
        public Builder copy(UpdateDesktopRequest o) {
            desktopId(o.getDesktopId());
            updateDesktopDetails(o.getUpdateDesktopDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateDesktopRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateDesktopRequest
         */
        public UpdateDesktopRequest build() {
            UpdateDesktopRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.desktops.model.UpdateDesktopDetails body) {
            updateDesktopDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateDesktopRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateDesktopRequest
         */
        public UpdateDesktopRequest buildWithoutInvocationCallback() {
            UpdateDesktopRequest request = new UpdateDesktopRequest();
            request.desktopId = desktopId;
            request.updateDesktopDetails = updateDesktopDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateDesktopRequest(desktopId, updateDesktopDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .desktopId(desktopId)
                .updateDesktopDetails(updateDesktopDetails)
                .opcRequestId(opcRequestId)
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
        sb.append(",desktopId=").append(String.valueOf(this.desktopId));
        sb.append(",updateDesktopDetails=").append(String.valueOf(this.updateDesktopDetails));
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
        if (!(o instanceof UpdateDesktopRequest)) {
            return false;
        }

        UpdateDesktopRequest other = (UpdateDesktopRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.desktopId, other.desktopId)
                && java.util.Objects.equals(this.updateDesktopDetails, other.updateDesktopDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.desktopId == null ? 43 : this.desktopId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateDesktopDetails == null
                                ? 43
                                : this.updateDesktopDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
