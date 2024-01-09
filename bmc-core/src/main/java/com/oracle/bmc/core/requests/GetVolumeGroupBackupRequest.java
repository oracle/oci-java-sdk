/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetVolumeGroupBackupExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetVolumeGroupBackupRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetVolumeGroupBackupRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The Oracle Cloud ID (OCID) that uniquely identifies the volume group backup. */
    private String volumeGroupBackupId;

    /** The Oracle Cloud ID (OCID) that uniquely identifies the volume group backup. */
    public String getVolumeGroupBackupId() {
        return volumeGroupBackupId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetVolumeGroupBackupRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The Oracle Cloud ID (OCID) that uniquely identifies the volume group backup. */
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
        public Builder copy(GetVolumeGroupBackupRequest o) {
            volumeGroupBackupId(o.getVolumeGroupBackupId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetVolumeGroupBackupRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetVolumeGroupBackupRequest
         */
        public GetVolumeGroupBackupRequest build() {
            GetVolumeGroupBackupRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetVolumeGroupBackupRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetVolumeGroupBackupRequest
         */
        public GetVolumeGroupBackupRequest buildWithoutInvocationCallback() {
            GetVolumeGroupBackupRequest request = new GetVolumeGroupBackupRequest();
            request.volumeGroupBackupId = volumeGroupBackupId;
            return request;
            // new GetVolumeGroupBackupRequest(volumeGroupBackupId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().volumeGroupBackupId(volumeGroupBackupId);
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
        sb.append(",volumeGroupBackupId=").append(String.valueOf(this.volumeGroupBackupId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetVolumeGroupBackupRequest)) {
            return false;
        }

        GetVolumeGroupBackupRequest other = (GetVolumeGroupBackupRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.volumeGroupBackupId, other.volumeGroupBackupId);
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
        return result;
    }
}
