/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CopyVolumeGroupBackupExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CopyVolumeGroupBackupRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class CopyVolumeGroupBackupRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.CopyVolumeGroupBackupDetails> {

    /**
     * The Oracle Cloud ID (OCID) that uniquely identifies the volume group backup.
     *
     */
    private String volumeGroupBackupId;

    /**
     * The Oracle Cloud ID (OCID) that uniquely identifies the volume group backup.
     *
     */
    public String getVolumeGroupBackupId() {
        return volumeGroupBackupId;
    }
    /**
     * Request to create a cross-region copy of given volume group backup.
     */
    private com.oracle.bmc.core.model.CopyVolumeGroupBackupDetails copyVolumeGroupBackupDetails;

    /**
     * Request to create a cross-region copy of given volume group backup.
     */
    public com.oracle.bmc.core.model.CopyVolumeGroupBackupDetails
            getCopyVolumeGroupBackupDetails() {
        return copyVolumeGroupBackupDetails;
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
    public com.oracle.bmc.core.model.CopyVolumeGroupBackupDetails getBody$() {
        return copyVolumeGroupBackupDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CopyVolumeGroupBackupRequest,
                    com.oracle.bmc.core.model.CopyVolumeGroupBackupDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The Oracle Cloud ID (OCID) that uniquely identifies the volume group backup.
         *
         */
        private String volumeGroupBackupId = null;

        /**
         * The Oracle Cloud ID (OCID) that uniquely identifies the volume group backup.
         *
         * @param volumeGroupBackupId the value to set
         * @return this builder instance
         */
        public Builder volumeGroupBackupId(String volumeGroupBackupId) {
            this.volumeGroupBackupId = volumeGroupBackupId;
            return this;
        }

        /**
         * Request to create a cross-region copy of given volume group backup.
         */
        private com.oracle.bmc.core.model.CopyVolumeGroupBackupDetails
                copyVolumeGroupBackupDetails = null;

        /**
         * Request to create a cross-region copy of given volume group backup.
         * @param copyVolumeGroupBackupDetails the value to set
         * @return this builder instance
         */
        public Builder copyVolumeGroupBackupDetails(
                com.oracle.bmc.core.model.CopyVolumeGroupBackupDetails
                        copyVolumeGroupBackupDetails) {
            this.copyVolumeGroupBackupDetails = copyVolumeGroupBackupDetails;
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
        public Builder copy(CopyVolumeGroupBackupRequest o) {
            volumeGroupBackupId(o.getVolumeGroupBackupId());
            copyVolumeGroupBackupDetails(o.getCopyVolumeGroupBackupDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CopyVolumeGroupBackupRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CopyVolumeGroupBackupRequest
         */
        public CopyVolumeGroupBackupRequest build() {
            CopyVolumeGroupBackupRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.CopyVolumeGroupBackupDetails body) {
            copyVolumeGroupBackupDetails(body);
            return this;
        }

        /**
         * Build the instance of CopyVolumeGroupBackupRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CopyVolumeGroupBackupRequest
         */
        public CopyVolumeGroupBackupRequest buildWithoutInvocationCallback() {
            CopyVolumeGroupBackupRequest request = new CopyVolumeGroupBackupRequest();
            request.volumeGroupBackupId = volumeGroupBackupId;
            request.copyVolumeGroupBackupDetails = copyVolumeGroupBackupDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CopyVolumeGroupBackupRequest(volumeGroupBackupId, copyVolumeGroupBackupDetails, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .volumeGroupBackupId(volumeGroupBackupId)
                .copyVolumeGroupBackupDetails(copyVolumeGroupBackupDetails)
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
        sb.append(",volumeGroupBackupId=").append(String.valueOf(this.volumeGroupBackupId));
        sb.append(",copyVolumeGroupBackupDetails=")
                .append(String.valueOf(this.copyVolumeGroupBackupDetails));
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
        if (!(o instanceof CopyVolumeGroupBackupRequest)) {
            return false;
        }

        CopyVolumeGroupBackupRequest other = (CopyVolumeGroupBackupRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.volumeGroupBackupId, other.volumeGroupBackupId)
                && java.util.Objects.equals(
                        this.copyVolumeGroupBackupDetails, other.copyVolumeGroupBackupDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.volumeGroupBackupId == null
                                ? 43
                                : this.volumeGroupBackupId.hashCode());
        result =
                (result * PRIME)
                        + (this.copyVolumeGroupBackupDetails == null
                                ? 43
                                : this.copyVolumeGroupBackupDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
