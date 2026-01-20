/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.requests;

import com.oracle.bmc.disasterrecovery.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/UpdateAutomaticDrConfigurationExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateAutomaticDrConfigurationRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public class UpdateAutomaticDrConfigurationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.disasterrecovery.model.UpdateAutomaticDrConfigurationDetails> {

    /** Details for updating the Automatic DR configuration. */
    private com.oracle.bmc.disasterrecovery.model.UpdateAutomaticDrConfigurationDetails
            updateAutomaticDrConfigurationDetails;

    /** Details for updating the Automatic DR configuration. */
    public com.oracle.bmc.disasterrecovery.model.UpdateAutomaticDrConfigurationDetails
            getUpdateAutomaticDrConfigurationDetails() {
        return updateAutomaticDrConfigurationDetails;
    }
    /**
     * The OCID of the Automatic DR configuration.
     *
     * <p>Example: {@code ocid1.automaticDrConfiguration.oc1..uniqueID}
     */
    private String automaticDrConfigurationId;

    /**
     * The OCID of the Automatic DR configuration.
     *
     * <p>Example: {@code ocid1.automaticDrConfiguration.oc1..uniqueID}
     */
    public String getAutomaticDrConfigurationId() {
        return automaticDrConfigurationId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
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
    public com.oracle.bmc.disasterrecovery.model.UpdateAutomaticDrConfigurationDetails getBody$() {
        return updateAutomaticDrConfigurationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateAutomaticDrConfigurationRequest,
                    com.oracle.bmc.disasterrecovery.model.UpdateAutomaticDrConfigurationDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Details for updating the Automatic DR configuration. */
        private com.oracle.bmc.disasterrecovery.model.UpdateAutomaticDrConfigurationDetails
                updateAutomaticDrConfigurationDetails = null;

        /**
         * Details for updating the Automatic DR configuration.
         *
         * @param updateAutomaticDrConfigurationDetails the value to set
         * @return this builder instance
         */
        public Builder updateAutomaticDrConfigurationDetails(
                com.oracle.bmc.disasterrecovery.model.UpdateAutomaticDrConfigurationDetails
                        updateAutomaticDrConfigurationDetails) {
            this.updateAutomaticDrConfigurationDetails = updateAutomaticDrConfigurationDetails;
            return this;
        }

        /**
         * The OCID of the Automatic DR configuration.
         *
         * <p>Example: {@code ocid1.automaticDrConfiguration.oc1..uniqueID}
         */
        private String automaticDrConfigurationId = null;

        /**
         * The OCID of the Automatic DR configuration.
         *
         * <p>Example: {@code ocid1.automaticDrConfiguration.oc1..uniqueID}
         *
         * @param automaticDrConfigurationId the value to set
         * @return this builder instance
         */
        public Builder automaticDrConfigurationId(String automaticDrConfigurationId) {
            this.automaticDrConfigurationId = automaticDrConfigurationId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(UpdateAutomaticDrConfigurationRequest o) {
            updateAutomaticDrConfigurationDetails(o.getUpdateAutomaticDrConfigurationDetails());
            automaticDrConfigurationId(o.getAutomaticDrConfigurationId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateAutomaticDrConfigurationRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateAutomaticDrConfigurationRequest
         */
        public UpdateAutomaticDrConfigurationRequest build() {
            UpdateAutomaticDrConfigurationRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.disasterrecovery.model.UpdateAutomaticDrConfigurationDetails body) {
            updateAutomaticDrConfigurationDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateAutomaticDrConfigurationRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateAutomaticDrConfigurationRequest
         */
        public UpdateAutomaticDrConfigurationRequest buildWithoutInvocationCallback() {
            UpdateAutomaticDrConfigurationRequest request =
                    new UpdateAutomaticDrConfigurationRequest();
            request.updateAutomaticDrConfigurationDetails = updateAutomaticDrConfigurationDetails;
            request.automaticDrConfigurationId = automaticDrConfigurationId;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateAutomaticDrConfigurationRequest(updateAutomaticDrConfigurationDetails,
            // automaticDrConfigurationId, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .updateAutomaticDrConfigurationDetails(updateAutomaticDrConfigurationDetails)
                .automaticDrConfigurationId(automaticDrConfigurationId)
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
        sb.append(",updateAutomaticDrConfigurationDetails=")
                .append(String.valueOf(this.updateAutomaticDrConfigurationDetails));
        sb.append(",automaticDrConfigurationId=")
                .append(String.valueOf(this.automaticDrConfigurationId));
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
        if (!(o instanceof UpdateAutomaticDrConfigurationRequest)) {
            return false;
        }

        UpdateAutomaticDrConfigurationRequest other = (UpdateAutomaticDrConfigurationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.updateAutomaticDrConfigurationDetails,
                        other.updateAutomaticDrConfigurationDetails)
                && java.util.Objects.equals(
                        this.automaticDrConfigurationId, other.automaticDrConfigurationId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.updateAutomaticDrConfigurationDetails == null
                                ? 43
                                : this.updateAutomaticDrConfigurationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.automaticDrConfigurationId == null
                                ? 43
                                : this.automaticDrConfigurationId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
