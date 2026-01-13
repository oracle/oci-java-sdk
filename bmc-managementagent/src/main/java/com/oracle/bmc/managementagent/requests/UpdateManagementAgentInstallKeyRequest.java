/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.requests;

import com.oracle.bmc.managementagent.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementagent/UpdateManagementAgentInstallKeyExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateManagementAgentInstallKeyRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
public class UpdateManagementAgentInstallKeyRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.managementagent.model.UpdateManagementAgentInstallKeyDetails> {

    /** Unique Management Agent Install Key identifier */
    private String managementAgentInstallKeyId;

    /** Unique Management Agent Install Key identifier */
    public String getManagementAgentInstallKeyId() {
        return managementAgentInstallKeyId;
    }
    /**
     * Details required for changing the modifiable properties of the Management Agent install key.
     */
    private com.oracle.bmc.managementagent.model.UpdateManagementAgentInstallKeyDetails
            updateManagementAgentInstallKeyDetails;

    /**
     * Details required for changing the modifiable properties of the Management Agent install key.
     */
    public com.oracle.bmc.managementagent.model.UpdateManagementAgentInstallKeyDetails
            getUpdateManagementAgentInstallKeyDetails() {
        return updateManagementAgentInstallKeyDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
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
    public com.oracle.bmc.managementagent.model.UpdateManagementAgentInstallKeyDetails getBody$() {
        return updateManagementAgentInstallKeyDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateManagementAgentInstallKeyRequest,
                    com.oracle.bmc.managementagent.model.UpdateManagementAgentInstallKeyDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique Management Agent Install Key identifier */
        private String managementAgentInstallKeyId = null;

        /**
         * Unique Management Agent Install Key identifier
         *
         * @param managementAgentInstallKeyId the value to set
         * @return this builder instance
         */
        public Builder managementAgentInstallKeyId(String managementAgentInstallKeyId) {
            this.managementAgentInstallKeyId = managementAgentInstallKeyId;
            return this;
        }

        /**
         * Details required for changing the modifiable properties of the Management Agent install
         * key.
         */
        private com.oracle.bmc.managementagent.model.UpdateManagementAgentInstallKeyDetails
                updateManagementAgentInstallKeyDetails = null;

        /**
         * Details required for changing the modifiable properties of the Management Agent install
         * key.
         *
         * @param updateManagementAgentInstallKeyDetails the value to set
         * @return this builder instance
         */
        public Builder updateManagementAgentInstallKeyDetails(
                com.oracle.bmc.managementagent.model.UpdateManagementAgentInstallKeyDetails
                        updateManagementAgentInstallKeyDetails) {
            this.updateManagementAgentInstallKeyDetails = updateManagementAgentInstallKeyDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(UpdateManagementAgentInstallKeyRequest o) {
            managementAgentInstallKeyId(o.getManagementAgentInstallKeyId());
            updateManagementAgentInstallKeyDetails(o.getUpdateManagementAgentInstallKeyDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateManagementAgentInstallKeyRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateManagementAgentInstallKeyRequest
         */
        public UpdateManagementAgentInstallKeyRequest build() {
            UpdateManagementAgentInstallKeyRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.managementagent.model.UpdateManagementAgentInstallKeyDetails body) {
            updateManagementAgentInstallKeyDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateManagementAgentInstallKeyRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateManagementAgentInstallKeyRequest
         */
        public UpdateManagementAgentInstallKeyRequest buildWithoutInvocationCallback() {
            UpdateManagementAgentInstallKeyRequest request =
                    new UpdateManagementAgentInstallKeyRequest();
            request.managementAgentInstallKeyId = managementAgentInstallKeyId;
            request.updateManagementAgentInstallKeyDetails = updateManagementAgentInstallKeyDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateManagementAgentInstallKeyRequest(managementAgentInstallKeyId,
            // updateManagementAgentInstallKeyDetails, opcRetryToken, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managementAgentInstallKeyId(managementAgentInstallKeyId)
                .updateManagementAgentInstallKeyDetails(updateManagementAgentInstallKeyDetails)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",managementAgentInstallKeyId=")
                .append(String.valueOf(this.managementAgentInstallKeyId));
        sb.append(",updateManagementAgentInstallKeyDetails=")
                .append(String.valueOf(this.updateManagementAgentInstallKeyDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
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
        if (!(o instanceof UpdateManagementAgentInstallKeyRequest)) {
            return false;
        }

        UpdateManagementAgentInstallKeyRequest other = (UpdateManagementAgentInstallKeyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.managementAgentInstallKeyId, other.managementAgentInstallKeyId)
                && java.util.Objects.equals(
                        this.updateManagementAgentInstallKeyDetails,
                        other.updateManagementAgentInstallKeyDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managementAgentInstallKeyId == null
                                ? 43
                                : this.managementAgentInstallKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateManagementAgentInstallKeyDetails == null
                                ? 43
                                : this.updateManagementAgentInstallKeyDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
