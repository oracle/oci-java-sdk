/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.requests;

import com.oracle.bmc.fusionapps.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/UpdateVanityDomainExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateVanityDomainRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
public class UpdateVanityDomainRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.fusionapps.model.UpdateVanityDomainDetails> {

    /** unique FusionEnvironment identifier */
    private String fusionEnvironmentId;

    /** unique FusionEnvironment identifier */
    public String getFusionEnvironmentId() {
        return fusionEnvironmentId;
    }
    /** The unique identifier (OCID) of the VanityDomain */
    private String vanityDomainId;

    /** The unique identifier (OCID) of the VanityDomain */
    public String getVanityDomainId() {
        return vanityDomainId;
    }
    /** Details for the updating scheduled VanityDomain */
    private com.oracle.bmc.fusionapps.model.UpdateVanityDomainDetails updateVanityDomainDetails;

    /** Details for the updating scheduled VanityDomain */
    public com.oracle.bmc.fusionapps.model.UpdateVanityDomainDetails
            getUpdateVanityDomainDetails() {
        return updateVanityDomainDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
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

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.fusionapps.model.UpdateVanityDomainDetails getBody$() {
        return updateVanityDomainDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateVanityDomainRequest,
                    com.oracle.bmc.fusionapps.model.UpdateVanityDomainDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** unique FusionEnvironment identifier */
        private String fusionEnvironmentId = null;

        /**
         * unique FusionEnvironment identifier
         *
         * @param fusionEnvironmentId the value to set
         * @return this builder instance
         */
        public Builder fusionEnvironmentId(String fusionEnvironmentId) {
            this.fusionEnvironmentId = fusionEnvironmentId;
            return this;
        }

        /** The unique identifier (OCID) of the VanityDomain */
        private String vanityDomainId = null;

        /**
         * The unique identifier (OCID) of the VanityDomain
         *
         * @param vanityDomainId the value to set
         * @return this builder instance
         */
        public Builder vanityDomainId(String vanityDomainId) {
            this.vanityDomainId = vanityDomainId;
            return this;
        }

        /** Details for the updating scheduled VanityDomain */
        private com.oracle.bmc.fusionapps.model.UpdateVanityDomainDetails
                updateVanityDomainDetails = null;

        /**
         * Details for the updating scheduled VanityDomain
         *
         * @param updateVanityDomainDetails the value to set
         * @return this builder instance
         */
        public Builder updateVanityDomainDetails(
                com.oracle.bmc.fusionapps.model.UpdateVanityDomainDetails
                        updateVanityDomainDetails) {
            this.updateVanityDomainDetails = updateVanityDomainDetails;
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
        public Builder copy(UpdateVanityDomainRequest o) {
            fusionEnvironmentId(o.getFusionEnvironmentId());
            vanityDomainId(o.getVanityDomainId());
            updateVanityDomainDetails(o.getUpdateVanityDomainDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateVanityDomainRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateVanityDomainRequest
         */
        public UpdateVanityDomainRequest build() {
            UpdateVanityDomainRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.fusionapps.model.UpdateVanityDomainDetails body) {
            updateVanityDomainDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateVanityDomainRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateVanityDomainRequest
         */
        public UpdateVanityDomainRequest buildWithoutInvocationCallback() {
            UpdateVanityDomainRequest request = new UpdateVanityDomainRequest();
            request.fusionEnvironmentId = fusionEnvironmentId;
            request.vanityDomainId = vanityDomainId;
            request.updateVanityDomainDetails = updateVanityDomainDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateVanityDomainRequest(fusionEnvironmentId, vanityDomainId,
            // updateVanityDomainDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .fusionEnvironmentId(fusionEnvironmentId)
                .vanityDomainId(vanityDomainId)
                .updateVanityDomainDetails(updateVanityDomainDetails)
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
        sb.append(",fusionEnvironmentId=").append(String.valueOf(this.fusionEnvironmentId));
        sb.append(",vanityDomainId=").append(String.valueOf(this.vanityDomainId));
        sb.append(",updateVanityDomainDetails=")
                .append(String.valueOf(this.updateVanityDomainDetails));
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
        if (!(o instanceof UpdateVanityDomainRequest)) {
            return false;
        }

        UpdateVanityDomainRequest other = (UpdateVanityDomainRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.fusionEnvironmentId, other.fusionEnvironmentId)
                && java.util.Objects.equals(this.vanityDomainId, other.vanityDomainId)
                && java.util.Objects.equals(
                        this.updateVanityDomainDetails, other.updateVanityDomainDetails)
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
                        + (this.vanityDomainId == null ? 43 : this.vanityDomainId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateVanityDomainDetails == null
                                ? 43
                                : this.updateVanityDomainDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
