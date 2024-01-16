/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdatePeerTargetDatabaseExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdatePeerTargetDatabaseRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class UpdatePeerTargetDatabaseRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.UpdatePeerTargetDatabaseDetails> {

    /** The OCID of the Data Safe target database. */
    private String targetDatabaseId;

    /** The OCID of the Data Safe target database. */
    public String getTargetDatabaseId() {
        return targetDatabaseId;
    }
    /** The unique id of the peer target database. */
    private Integer peerTargetDatabaseId;

    /** The unique id of the peer target database. */
    public Integer getPeerTargetDatabaseId() {
        return peerTargetDatabaseId;
    }
    /** Database details to be used to update the peer target database. */
    private com.oracle.bmc.datasafe.model.UpdatePeerTargetDatabaseDetails
            updatePeerTargetDatabaseDetails;

    /** Database details to be used to update the peer target database. */
    public com.oracle.bmc.datasafe.model.UpdatePeerTargetDatabaseDetails
            getUpdatePeerTargetDatabaseDetails() {
        return updatePeerTargetDatabaseDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * if-match parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * if-match parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
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

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.datasafe.model.UpdatePeerTargetDatabaseDetails getBody$() {
        return updatePeerTargetDatabaseDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdatePeerTargetDatabaseRequest,
                    com.oracle.bmc.datasafe.model.UpdatePeerTargetDatabaseDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the Data Safe target database. */
        private String targetDatabaseId = null;

        /**
         * The OCID of the Data Safe target database.
         *
         * @param targetDatabaseId the value to set
         * @return this builder instance
         */
        public Builder targetDatabaseId(String targetDatabaseId) {
            this.targetDatabaseId = targetDatabaseId;
            return this;
        }

        /** The unique id of the peer target database. */
        private Integer peerTargetDatabaseId = null;

        /**
         * The unique id of the peer target database.
         *
         * @param peerTargetDatabaseId the value to set
         * @return this builder instance
         */
        public Builder peerTargetDatabaseId(Integer peerTargetDatabaseId) {
            this.peerTargetDatabaseId = peerTargetDatabaseId;
            return this;
        }

        /** Database details to be used to update the peer target database. */
        private com.oracle.bmc.datasafe.model.UpdatePeerTargetDatabaseDetails
                updatePeerTargetDatabaseDetails = null;

        /**
         * Database details to be used to update the peer target database.
         *
         * @param updatePeerTargetDatabaseDetails the value to set
         * @return this builder instance
         */
        public Builder updatePeerTargetDatabaseDetails(
                com.oracle.bmc.datasafe.model.UpdatePeerTargetDatabaseDetails
                        updatePeerTargetDatabaseDetails) {
            this.updatePeerTargetDatabaseDetails = updatePeerTargetDatabaseDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * if-match parameter to the value of the etag from a previous GET or POST response for that
         * resource. The resource will be updated or deleted only if the etag you provide matches
         * the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * if-match parameter to the value of the etag from a previous GET or POST response for that
         * resource. The resource will be updated or deleted only if the etag you provide matches
         * the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(UpdatePeerTargetDatabaseRequest o) {
            targetDatabaseId(o.getTargetDatabaseId());
            peerTargetDatabaseId(o.getPeerTargetDatabaseId());
            updatePeerTargetDatabaseDetails(o.getUpdatePeerTargetDatabaseDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdatePeerTargetDatabaseRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdatePeerTargetDatabaseRequest
         */
        public UpdatePeerTargetDatabaseRequest build() {
            UpdatePeerTargetDatabaseRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datasafe.model.UpdatePeerTargetDatabaseDetails body) {
            updatePeerTargetDatabaseDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdatePeerTargetDatabaseRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdatePeerTargetDatabaseRequest
         */
        public UpdatePeerTargetDatabaseRequest buildWithoutInvocationCallback() {
            UpdatePeerTargetDatabaseRequest request = new UpdatePeerTargetDatabaseRequest();
            request.targetDatabaseId = targetDatabaseId;
            request.peerTargetDatabaseId = peerTargetDatabaseId;
            request.updatePeerTargetDatabaseDetails = updatePeerTargetDatabaseDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new UpdatePeerTargetDatabaseRequest(targetDatabaseId, peerTargetDatabaseId,
            // updatePeerTargetDatabaseDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .targetDatabaseId(targetDatabaseId)
                .peerTargetDatabaseId(peerTargetDatabaseId)
                .updatePeerTargetDatabaseDetails(updatePeerTargetDatabaseDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",targetDatabaseId=").append(String.valueOf(this.targetDatabaseId));
        sb.append(",peerTargetDatabaseId=").append(String.valueOf(this.peerTargetDatabaseId));
        sb.append(",updatePeerTargetDatabaseDetails=")
                .append(String.valueOf(this.updatePeerTargetDatabaseDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePeerTargetDatabaseRequest)) {
            return false;
        }

        UpdatePeerTargetDatabaseRequest other = (UpdatePeerTargetDatabaseRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.targetDatabaseId, other.targetDatabaseId)
                && java.util.Objects.equals(this.peerTargetDatabaseId, other.peerTargetDatabaseId)
                && java.util.Objects.equals(
                        this.updatePeerTargetDatabaseDetails, other.updatePeerTargetDatabaseDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.targetDatabaseId == null ? 43 : this.targetDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.peerTargetDatabaseId == null
                                ? 43
                                : this.peerTargetDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.updatePeerTargetDatabaseDetails == null
                                ? 43
                                : this.updatePeerTargetDatabaseDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
