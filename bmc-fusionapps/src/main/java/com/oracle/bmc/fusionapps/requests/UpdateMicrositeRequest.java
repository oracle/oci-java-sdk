/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.requests;

import com.oracle.bmc.fusionapps.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/UpdateMicrositeExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateMicrositeRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
public class UpdateMicrositeRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.fusionapps.model.UpdateMicrositeDetails> {

    /** unique FusionEnvironment identifier */
    private String fusionEnvironmentId;

    /** unique FusionEnvironment identifier */
    public String getFusionEnvironmentId() {
        return fusionEnvironmentId;
    }
    /** unique brand identifier */
    private String marketingBrandId;

    /** unique brand identifier */
    public String getMarketingBrandId() {
        return marketingBrandId;
    }
    /** unique microsite identifier */
    private String micrositeId;

    /** unique microsite identifier */
    public String getMicrositeId() {
        return micrositeId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.fusionapps.model.UpdateMicrositeDetails updateMicrositeDetails;

    /** The information to be updated. */
    public com.oracle.bmc.fusionapps.model.UpdateMicrositeDetails getUpdateMicrositeDetails() {
        return updateMicrositeDetails;
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
    public com.oracle.bmc.fusionapps.model.UpdateMicrositeDetails getBody$() {
        return updateMicrositeDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateMicrositeRequest,
                    com.oracle.bmc.fusionapps.model.UpdateMicrositeDetails> {
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

        /** unique brand identifier */
        private String marketingBrandId = null;

        /**
         * unique brand identifier
         *
         * @param marketingBrandId the value to set
         * @return this builder instance
         */
        public Builder marketingBrandId(String marketingBrandId) {
            this.marketingBrandId = marketingBrandId;
            return this;
        }

        /** unique microsite identifier */
        private String micrositeId = null;

        /**
         * unique microsite identifier
         *
         * @param micrositeId the value to set
         * @return this builder instance
         */
        public Builder micrositeId(String micrositeId) {
            this.micrositeId = micrositeId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.fusionapps.model.UpdateMicrositeDetails updateMicrositeDetails =
                null;

        /**
         * The information to be updated.
         *
         * @param updateMicrositeDetails the value to set
         * @return this builder instance
         */
        public Builder updateMicrositeDetails(
                com.oracle.bmc.fusionapps.model.UpdateMicrositeDetails updateMicrositeDetails) {
            this.updateMicrositeDetails = updateMicrositeDetails;
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
        public Builder copy(UpdateMicrositeRequest o) {
            fusionEnvironmentId(o.getFusionEnvironmentId());
            marketingBrandId(o.getMarketingBrandId());
            micrositeId(o.getMicrositeId());
            updateMicrositeDetails(o.getUpdateMicrositeDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateMicrositeRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateMicrositeRequest
         */
        public UpdateMicrositeRequest build() {
            UpdateMicrositeRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.fusionapps.model.UpdateMicrositeDetails body) {
            updateMicrositeDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateMicrositeRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateMicrositeRequest
         */
        public UpdateMicrositeRequest buildWithoutInvocationCallback() {
            UpdateMicrositeRequest request = new UpdateMicrositeRequest();
            request.fusionEnvironmentId = fusionEnvironmentId;
            request.marketingBrandId = marketingBrandId;
            request.micrositeId = micrositeId;
            request.updateMicrositeDetails = updateMicrositeDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateMicrositeRequest(fusionEnvironmentId, marketingBrandId, micrositeId,
            // updateMicrositeDetails, ifMatch, opcRequestId);
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
                .marketingBrandId(marketingBrandId)
                .micrositeId(micrositeId)
                .updateMicrositeDetails(updateMicrositeDetails)
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
        sb.append(",fusionEnvironmentId=").append(String.valueOf(this.fusionEnvironmentId));
        sb.append(",marketingBrandId=").append(String.valueOf(this.marketingBrandId));
        sb.append(",micrositeId=").append(String.valueOf(this.micrositeId));
        sb.append(",updateMicrositeDetails=").append(String.valueOf(this.updateMicrositeDetails));
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
        if (!(o instanceof UpdateMicrositeRequest)) {
            return false;
        }

        UpdateMicrositeRequest other = (UpdateMicrositeRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.fusionEnvironmentId, other.fusionEnvironmentId)
                && java.util.Objects.equals(this.marketingBrandId, other.marketingBrandId)
                && java.util.Objects.equals(this.micrositeId, other.micrositeId)
                && java.util.Objects.equals(
                        this.updateMicrositeDetails, other.updateMicrositeDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
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
                        + (this.marketingBrandId == null ? 43 : this.marketingBrandId.hashCode());
        result = (result * PRIME) + (this.micrositeId == null ? 43 : this.micrositeId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateMicrositeDetails == null
                                ? 43
                                : this.updateMicrositeDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
