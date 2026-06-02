/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.requests;

import com.oracle.bmc.fusionapps.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/UpdateVanityDomainActivityExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateVanityDomainActivityRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
public class UpdateVanityDomainActivityRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.fusionapps.model.UpdateVanityDomainActivityDetails> {

    /**
     * unique FusionEnvironment identifier
     */
    private String fusionEnvironmentId;

    /**
     * unique FusionEnvironment identifier
     */
    public String getFusionEnvironmentId() {
        return fusionEnvironmentId;
    }
    /**
     * The unique identifier (OCID) of the VanityDomainActivity
     */
    private String vanityDomainActivityId;

    /**
     * The unique identifier (OCID) of the VanityDomainActivity
     */
    public String getVanityDomainActivityId() {
        return vanityDomainActivityId;
    }
    /**
     * Details for the updating scheduled VanityDomainActivity
     */
    private com.oracle.bmc.fusionapps.model.UpdateVanityDomainActivityDetails
            updateVanityDomainActivityDetails;

    /**
     * Details for the updating scheduled VanityDomainActivity
     */
    public com.oracle.bmc.fusionapps.model.UpdateVanityDomainActivityDetails
            getUpdateVanityDomainActivityDetails() {
        return updateVanityDomainActivityDetails;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
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
    public com.oracle.bmc.fusionapps.model.UpdateVanityDomainActivityDetails getBody$() {
        return updateVanityDomainActivityDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateVanityDomainActivityRequest,
                    com.oracle.bmc.fusionapps.model.UpdateVanityDomainActivityDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * unique FusionEnvironment identifier
         */
        private String fusionEnvironmentId = null;

        /**
         * unique FusionEnvironment identifier
         * @param fusionEnvironmentId the value to set
         * @return this builder instance
         */
        public Builder fusionEnvironmentId(String fusionEnvironmentId) {
            this.fusionEnvironmentId = fusionEnvironmentId;
            return this;
        }

        /**
         * The unique identifier (OCID) of the VanityDomainActivity
         */
        private String vanityDomainActivityId = null;

        /**
         * The unique identifier (OCID) of the VanityDomainActivity
         * @param vanityDomainActivityId the value to set
         * @return this builder instance
         */
        public Builder vanityDomainActivityId(String vanityDomainActivityId) {
            this.vanityDomainActivityId = vanityDomainActivityId;
            return this;
        }

        /**
         * Details for the updating scheduled VanityDomainActivity
         */
        private com.oracle.bmc.fusionapps.model.UpdateVanityDomainActivityDetails
                updateVanityDomainActivityDetails = null;

        /**
         * Details for the updating scheduled VanityDomainActivity
         * @param updateVanityDomainActivityDetails the value to set
         * @return this builder instance
         */
        public Builder updateVanityDomainActivityDetails(
                com.oracle.bmc.fusionapps.model.UpdateVanityDomainActivityDetails
                        updateVanityDomainActivityDetails) {
            this.updateVanityDomainActivityDetails = updateVanityDomainActivityDetails;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
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
        public Builder copy(UpdateVanityDomainActivityRequest o) {
            fusionEnvironmentId(o.getFusionEnvironmentId());
            vanityDomainActivityId(o.getVanityDomainActivityId());
            updateVanityDomainActivityDetails(o.getUpdateVanityDomainActivityDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateVanityDomainActivityRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateVanityDomainActivityRequest
         */
        public UpdateVanityDomainActivityRequest build() {
            UpdateVanityDomainActivityRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.fusionapps.model.UpdateVanityDomainActivityDetails body) {
            updateVanityDomainActivityDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateVanityDomainActivityRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateVanityDomainActivityRequest
         */
        public UpdateVanityDomainActivityRequest buildWithoutInvocationCallback() {
            UpdateVanityDomainActivityRequest request = new UpdateVanityDomainActivityRequest();
            request.fusionEnvironmentId = fusionEnvironmentId;
            request.vanityDomainActivityId = vanityDomainActivityId;
            request.updateVanityDomainActivityDetails = updateVanityDomainActivityDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateVanityDomainActivityRequest(fusionEnvironmentId, vanityDomainActivityId, updateVanityDomainActivityDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .fusionEnvironmentId(fusionEnvironmentId)
                .vanityDomainActivityId(vanityDomainActivityId)
                .updateVanityDomainActivityDetails(updateVanityDomainActivityDetails)
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
        sb.append(",fusionEnvironmentId=").append(String.valueOf(this.fusionEnvironmentId));
        sb.append(",vanityDomainActivityId=").append(String.valueOf(this.vanityDomainActivityId));
        sb.append(",updateVanityDomainActivityDetails=")
                .append(String.valueOf(this.updateVanityDomainActivityDetails));
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
        if (!(o instanceof UpdateVanityDomainActivityRequest)) {
            return false;
        }

        UpdateVanityDomainActivityRequest other = (UpdateVanityDomainActivityRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.fusionEnvironmentId, other.fusionEnvironmentId)
                && java.util.Objects.equals(
                        this.vanityDomainActivityId, other.vanityDomainActivityId)
                && java.util.Objects.equals(
                        this.updateVanityDomainActivityDetails,
                        other.updateVanityDomainActivityDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.fusionEnvironmentId == null
                                ? 43
                                : this.fusionEnvironmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.vanityDomainActivityId == null
                                ? 43
                                : this.vanityDomainActivityId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateVanityDomainActivityDetails == null
                                ? 43
                                : this.updateVanityDomainActivityDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
