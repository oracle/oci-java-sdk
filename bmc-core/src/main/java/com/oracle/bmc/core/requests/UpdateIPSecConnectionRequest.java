/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateIPSecConnectionExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateIPSecConnectionRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateIPSecConnectionRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.UpdateIPSecConnectionDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * IPSec connection.
     */
    private String ipscId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * IPSec connection.
     */
    public String getIpscId() {
        return ipscId;
    }
    /** Details object for updating an IPSec connection. */
    private com.oracle.bmc.core.model.UpdateIPSecConnectionDetails updateIPSecConnectionDetails;

    /** Details object for updating an IPSec connection. */
    public com.oracle.bmc.core.model.UpdateIPSecConnectionDetails
            getUpdateIPSecConnectionDetails() {
        return updateIPSecConnectionDetails;
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
    public com.oracle.bmc.core.model.UpdateIPSecConnectionDetails getBody$() {
        return updateIPSecConnectionDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateIPSecConnectionRequest,
                    com.oracle.bmc.core.model.UpdateIPSecConnectionDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * IPSec connection.
         */
        private String ipscId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * IPSec connection.
         *
         * @param ipscId the value to set
         * @return this builder instance
         */
        public Builder ipscId(String ipscId) {
            this.ipscId = ipscId;
            return this;
        }

        /** Details object for updating an IPSec connection. */
        private com.oracle.bmc.core.model.UpdateIPSecConnectionDetails
                updateIPSecConnectionDetails = null;

        /**
         * Details object for updating an IPSec connection.
         *
         * @param updateIPSecConnectionDetails the value to set
         * @return this builder instance
         */
        public Builder updateIPSecConnectionDetails(
                com.oracle.bmc.core.model.UpdateIPSecConnectionDetails
                        updateIPSecConnectionDetails) {
            this.updateIPSecConnectionDetails = updateIPSecConnectionDetails;
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
        public Builder copy(UpdateIPSecConnectionRequest o) {
            ipscId(o.getIpscId());
            updateIPSecConnectionDetails(o.getUpdateIPSecConnectionDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateIPSecConnectionRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateIPSecConnectionRequest
         */
        public UpdateIPSecConnectionRequest build() {
            UpdateIPSecConnectionRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.UpdateIPSecConnectionDetails body) {
            updateIPSecConnectionDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateIPSecConnectionRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateIPSecConnectionRequest
         */
        public UpdateIPSecConnectionRequest buildWithoutInvocationCallback() {
            UpdateIPSecConnectionRequest request = new UpdateIPSecConnectionRequest();
            request.ipscId = ipscId;
            request.updateIPSecConnectionDetails = updateIPSecConnectionDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateIPSecConnectionRequest(ipscId, updateIPSecConnectionDetails, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .ipscId(ipscId)
                .updateIPSecConnectionDetails(updateIPSecConnectionDetails)
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
        sb.append(",ipscId=").append(String.valueOf(this.ipscId));
        sb.append(",updateIPSecConnectionDetails=")
                .append(String.valueOf(this.updateIPSecConnectionDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateIPSecConnectionRequest)) {
            return false;
        }

        UpdateIPSecConnectionRequest other = (UpdateIPSecConnectionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.ipscId, other.ipscId)
                && java.util.Objects.equals(
                        this.updateIPSecConnectionDetails, other.updateIPSecConnectionDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.ipscId == null ? 43 : this.ipscId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateIPSecConnectionDetails == null
                                ? 43
                                : this.updateIPSecConnectionDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
