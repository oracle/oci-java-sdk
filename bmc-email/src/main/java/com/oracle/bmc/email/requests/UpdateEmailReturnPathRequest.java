/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.email.requests;

import com.oracle.bmc.email.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/email/UpdateEmailReturnPathExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateEmailReturnPathRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
public class UpdateEmailReturnPathRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.email.model.UpdateEmailReturnPathDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of this
     * email return path.
     */
    private String emailReturnPathId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of this
     * email return path.
     */
    public String getEmailReturnPathId() {
        return emailReturnPathId;
    }
    /** The new email return path attributes to apply. */
    private com.oracle.bmc.email.model.UpdateEmailReturnPathDetails updateEmailReturnPathDetails;

    /** The new email return path attributes to apply. */
    public com.oracle.bmc.email.model.UpdateEmailReturnPathDetails
            getUpdateEmailReturnPathDetails() {
        return updateEmailReturnPathDetails;
    }
    /**
     * Used for optimistic concurrency control. In the update or delete call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous get, create, or update
     * response for that resource. The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     */
    private String ifMatch;

    /**
     * Used for optimistic concurrency control. In the update or delete call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous get, create, or update
     * response for that resource. The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /** The request ID for tracing from the system */
    private String opcRequestId;

    /** The request ID for tracing from the system */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** Whether to override locks (if any exist). */
    private Boolean isLockOverride;

    /** Whether to override locks (if any exist). */
    public Boolean getIsLockOverride() {
        return isLockOverride;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.email.model.UpdateEmailReturnPathDetails getBody$() {
        return updateEmailReturnPathDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateEmailReturnPathRequest,
                    com.oracle.bmc.email.model.UpdateEmailReturnPathDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of this
         * email return path.
         */
        private String emailReturnPathId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of this
         * email return path.
         *
         * @param emailReturnPathId the value to set
         * @return this builder instance
         */
        public Builder emailReturnPathId(String emailReturnPathId) {
            this.emailReturnPathId = emailReturnPathId;
            return this;
        }

        /** The new email return path attributes to apply. */
        private com.oracle.bmc.email.model.UpdateEmailReturnPathDetails
                updateEmailReturnPathDetails = null;

        /**
         * The new email return path attributes to apply.
         *
         * @param updateEmailReturnPathDetails the value to set
         * @return this builder instance
         */
        public Builder updateEmailReturnPathDetails(
                com.oracle.bmc.email.model.UpdateEmailReturnPathDetails
                        updateEmailReturnPathDetails) {
            this.updateEmailReturnPathDetails = updateEmailReturnPathDetails;
            return this;
        }

        /**
         * Used for optimistic concurrency control. In the update or delete call for a resource, set
         * the {@code if-match} parameter to the value of the etag from a previous get, create, or
         * update response for that resource. The resource will be updated or deleted only if the
         * etag you provide matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * Used for optimistic concurrency control. In the update or delete call for a resource, set
         * the {@code if-match} parameter to the value of the etag from a previous get, create, or
         * update response for that resource. The resource will be updated or deleted only if the
         * etag you provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /** The request ID for tracing from the system */
        private String opcRequestId = null;

        /**
         * The request ID for tracing from the system
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** Whether to override locks (if any exist). */
        private Boolean isLockOverride = null;

        /**
         * Whether to override locks (if any exist).
         *
         * @param isLockOverride the value to set
         * @return this builder instance
         */
        public Builder isLockOverride(Boolean isLockOverride) {
            this.isLockOverride = isLockOverride;
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
        public Builder copy(UpdateEmailReturnPathRequest o) {
            emailReturnPathId(o.getEmailReturnPathId());
            updateEmailReturnPathDetails(o.getUpdateEmailReturnPathDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            isLockOverride(o.getIsLockOverride());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateEmailReturnPathRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateEmailReturnPathRequest
         */
        public UpdateEmailReturnPathRequest build() {
            UpdateEmailReturnPathRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.email.model.UpdateEmailReturnPathDetails body) {
            updateEmailReturnPathDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateEmailReturnPathRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateEmailReturnPathRequest
         */
        public UpdateEmailReturnPathRequest buildWithoutInvocationCallback() {
            UpdateEmailReturnPathRequest request = new UpdateEmailReturnPathRequest();
            request.emailReturnPathId = emailReturnPathId;
            request.updateEmailReturnPathDetails = updateEmailReturnPathDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.isLockOverride = isLockOverride;
            return request;
            // new UpdateEmailReturnPathRequest(emailReturnPathId, updateEmailReturnPathDetails,
            // ifMatch, opcRequestId, isLockOverride);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .emailReturnPathId(emailReturnPathId)
                .updateEmailReturnPathDetails(updateEmailReturnPathDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .isLockOverride(isLockOverride);
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
        sb.append(",emailReturnPathId=").append(String.valueOf(this.emailReturnPathId));
        sb.append(",updateEmailReturnPathDetails=")
                .append(String.valueOf(this.updateEmailReturnPathDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",isLockOverride=").append(String.valueOf(this.isLockOverride));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateEmailReturnPathRequest)) {
            return false;
        }

        UpdateEmailReturnPathRequest other = (UpdateEmailReturnPathRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.emailReturnPathId, other.emailReturnPathId)
                && java.util.Objects.equals(
                        this.updateEmailReturnPathDetails, other.updateEmailReturnPathDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.isLockOverride, other.isLockOverride);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.emailReturnPathId == null ? 43 : this.emailReturnPathId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateEmailReturnPathDetails == null
                                ? 43
                                : this.updateEmailReturnPathDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.isLockOverride == null ? 43 : this.isLockOverride.hashCode());
        return result;
    }
}
