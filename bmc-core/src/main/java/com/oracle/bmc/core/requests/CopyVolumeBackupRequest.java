/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CopyVolumeBackupExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CopyVolumeBackupRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class CopyVolumeBackupRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.CopyVolumeBackupDetails> {

    /**
     * The OCID of the volume backup.
     */
    private String volumeBackupId;

    /**
     * The OCID of the volume backup.
     */
    public String getVolumeBackupId() {
        return volumeBackupId;
    }
    /**
     * Request to create a cross-region copy of given backup.
     */
    private com.oracle.bmc.core.model.CopyVolumeBackupDetails copyVolumeBackupDetails;

    /**
     * Request to create a cross-region copy of given backup.
     */
    public com.oracle.bmc.core.model.CopyVolumeBackupDetails getCopyVolumeBackupDetails() {
        return copyVolumeBackupDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.CopyVolumeBackupDetails getBody$() {
        return copyVolumeBackupDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CopyVolumeBackupRequest, com.oracle.bmc.core.model.CopyVolumeBackupDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the volume backup.
         */
        private String volumeBackupId = null;

        /**
         * The OCID of the volume backup.
         * @param volumeBackupId the value to set
         * @return this builder instance
         */
        public Builder volumeBackupId(String volumeBackupId) {
            this.volumeBackupId = volumeBackupId;
            return this;
        }

        /**
         * Request to create a cross-region copy of given backup.
         */
        private com.oracle.bmc.core.model.CopyVolumeBackupDetails copyVolumeBackupDetails = null;

        /**
         * Request to create a cross-region copy of given backup.
         * @param copyVolumeBackupDetails the value to set
         * @return this builder instance
         */
        public Builder copyVolumeBackupDetails(
                com.oracle.bmc.core.model.CopyVolumeBackupDetails copyVolumeBackupDetails) {
            this.copyVolumeBackupDetails = copyVolumeBackupDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * may be rejected).
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * may be rejected).
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
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
        public Builder copy(CopyVolumeBackupRequest o) {
            volumeBackupId(o.getVolumeBackupId());
            copyVolumeBackupDetails(o.getCopyVolumeBackupDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CopyVolumeBackupRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CopyVolumeBackupRequest
         */
        public CopyVolumeBackupRequest build() {
            CopyVolumeBackupRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.CopyVolumeBackupDetails body) {
            copyVolumeBackupDetails(body);
            return this;
        }

        /**
         * Build the instance of CopyVolumeBackupRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CopyVolumeBackupRequest
         */
        public CopyVolumeBackupRequest buildWithoutInvocationCallback() {
            CopyVolumeBackupRequest request = new CopyVolumeBackupRequest();
            request.volumeBackupId = volumeBackupId;
            request.copyVolumeBackupDetails = copyVolumeBackupDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CopyVolumeBackupRequest(volumeBackupId, copyVolumeBackupDetails, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .volumeBackupId(volumeBackupId)
                .copyVolumeBackupDetails(copyVolumeBackupDetails)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId);
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
        sb.append(",volumeBackupId=").append(String.valueOf(this.volumeBackupId));
        sb.append(",copyVolumeBackupDetails=").append(String.valueOf(this.copyVolumeBackupDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CopyVolumeBackupRequest)) {
            return false;
        }

        CopyVolumeBackupRequest other = (CopyVolumeBackupRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.volumeBackupId, other.volumeBackupId)
                && java.util.Objects.equals(
                        this.copyVolumeBackupDetails, other.copyVolumeBackupDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.volumeBackupId == null ? 43 : this.volumeBackupId.hashCode());
        result =
                (result * PRIME)
                        + (this.copyVolumeBackupDetails == null
                                ? 43
                                : this.copyVolumeBackupDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
