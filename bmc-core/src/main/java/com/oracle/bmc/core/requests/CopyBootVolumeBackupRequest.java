/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CopyBootVolumeBackupExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use CopyBootVolumeBackupRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class CopyBootVolumeBackupRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.CopyBootVolumeBackupDetails> {

    /** The OCID of the boot volume backup. */
    private String bootVolumeBackupId;

    /** The OCID of the boot volume backup. */
    public String getBootVolumeBackupId() {
        return bootVolumeBackupId;
    }
    /** Request to create a cross-region copy of given boot volume backup. */
    private com.oracle.bmc.core.model.CopyBootVolumeBackupDetails copyBootVolumeBackupDetails;

    /** Request to create a cross-region copy of given boot volume backup. */
    public com.oracle.bmc.core.model.CopyBootVolumeBackupDetails getCopyBootVolumeBackupDetails() {
        return copyBootVolumeBackupDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
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
    public com.oracle.bmc.core.model.CopyBootVolumeBackupDetails getBody$() {
        return copyBootVolumeBackupDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CopyBootVolumeBackupRequest,
                    com.oracle.bmc.core.model.CopyBootVolumeBackupDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the boot volume backup. */
        private String bootVolumeBackupId = null;

        /**
         * The OCID of the boot volume backup.
         *
         * @param bootVolumeBackupId the value to set
         * @return this builder instance
         */
        public Builder bootVolumeBackupId(String bootVolumeBackupId) {
            this.bootVolumeBackupId = bootVolumeBackupId;
            return this;
        }

        /** Request to create a cross-region copy of given boot volume backup. */
        private com.oracle.bmc.core.model.CopyBootVolumeBackupDetails copyBootVolumeBackupDetails =
                null;

        /**
         * Request to create a cross-region copy of given boot volume backup.
         *
         * @param copyBootVolumeBackupDetails the value to set
         * @return this builder instance
         */
        public Builder copyBootVolumeBackupDetails(
                com.oracle.bmc.core.model.CopyBootVolumeBackupDetails copyBootVolumeBackupDetails) {
            this.copyBootVolumeBackupDetails = copyBootVolumeBackupDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
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
        public Builder copy(CopyBootVolumeBackupRequest o) {
            bootVolumeBackupId(o.getBootVolumeBackupId());
            copyBootVolumeBackupDetails(o.getCopyBootVolumeBackupDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CopyBootVolumeBackupRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CopyBootVolumeBackupRequest
         */
        public CopyBootVolumeBackupRequest build() {
            CopyBootVolumeBackupRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.CopyBootVolumeBackupDetails body) {
            copyBootVolumeBackupDetails(body);
            return this;
        }

        /**
         * Build the instance of CopyBootVolumeBackupRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CopyBootVolumeBackupRequest
         */
        public CopyBootVolumeBackupRequest buildWithoutInvocationCallback() {
            CopyBootVolumeBackupRequest request = new CopyBootVolumeBackupRequest();
            request.bootVolumeBackupId = bootVolumeBackupId;
            request.copyBootVolumeBackupDetails = copyBootVolumeBackupDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CopyBootVolumeBackupRequest(bootVolumeBackupId, copyBootVolumeBackupDetails,
            // opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .bootVolumeBackupId(bootVolumeBackupId)
                .copyBootVolumeBackupDetails(copyBootVolumeBackupDetails)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",bootVolumeBackupId=").append(String.valueOf(this.bootVolumeBackupId));
        sb.append(",copyBootVolumeBackupDetails=")
                .append(String.valueOf(this.copyBootVolumeBackupDetails));
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
        if (!(o instanceof CopyBootVolumeBackupRequest)) {
            return false;
        }

        CopyBootVolumeBackupRequest other = (CopyBootVolumeBackupRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.bootVolumeBackupId, other.bootVolumeBackupId)
                && java.util.Objects.equals(
                        this.copyBootVolumeBackupDetails, other.copyBootVolumeBackupDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.bootVolumeBackupId == null
                                ? 43
                                : this.bootVolumeBackupId.hashCode());
        result =
                (result * PRIME)
                        + (this.copyBootVolumeBackupDetails == null
                                ? 43
                                : this.copyBootVolumeBackupDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
