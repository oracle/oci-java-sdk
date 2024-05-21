/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateVolumeGroupBackupExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateVolumeGroupBackupRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateVolumeGroupBackupRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.UpdateVolumeGroupBackupDetails> {

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
     * Update volume group backup fields
     */
    private com.oracle.bmc.core.model.UpdateVolumeGroupBackupDetails updateVolumeGroupBackupDetails;

    /**
     * Update volume group backup fields
     */
    public com.oracle.bmc.core.model.UpdateVolumeGroupBackupDetails
            getUpdateVolumeGroupBackupDetails() {
        return updateVolumeGroupBackupDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource. The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource. The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.UpdateVolumeGroupBackupDetails getBody$() {
        return updateVolumeGroupBackupDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateVolumeGroupBackupRequest,
                    com.oracle.bmc.core.model.UpdateVolumeGroupBackupDetails> {
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
         * Update volume group backup fields
         */
        private com.oracle.bmc.core.model.UpdateVolumeGroupBackupDetails
                updateVolumeGroupBackupDetails = null;

        /**
         * Update volume group backup fields
         * @param updateVolumeGroupBackupDetails the value to set
         * @return this builder instance
         */
        public Builder updateVolumeGroupBackupDetails(
                com.oracle.bmc.core.model.UpdateVolumeGroupBackupDetails
                        updateVolumeGroupBackupDetails) {
            this.updateVolumeGroupBackupDetails = updateVolumeGroupBackupDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource. The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource. The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
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
        public Builder copy(UpdateVolumeGroupBackupRequest o) {
            volumeGroupBackupId(o.getVolumeGroupBackupId());
            updateVolumeGroupBackupDetails(o.getUpdateVolumeGroupBackupDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateVolumeGroupBackupRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateVolumeGroupBackupRequest
         */
        public UpdateVolumeGroupBackupRequest build() {
            UpdateVolumeGroupBackupRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.UpdateVolumeGroupBackupDetails body) {
            updateVolumeGroupBackupDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateVolumeGroupBackupRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateVolumeGroupBackupRequest
         */
        public UpdateVolumeGroupBackupRequest buildWithoutInvocationCallback() {
            UpdateVolumeGroupBackupRequest request = new UpdateVolumeGroupBackupRequest();
            request.volumeGroupBackupId = volumeGroupBackupId;
            request.updateVolumeGroupBackupDetails = updateVolumeGroupBackupDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateVolumeGroupBackupRequest(volumeGroupBackupId, updateVolumeGroupBackupDetails, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .volumeGroupBackupId(volumeGroupBackupId)
                .updateVolumeGroupBackupDetails(updateVolumeGroupBackupDetails)
                .ifMatch(ifMatch);
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
        sb.append(",updateVolumeGroupBackupDetails=")
                .append(String.valueOf(this.updateVolumeGroupBackupDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateVolumeGroupBackupRequest)) {
            return false;
        }

        UpdateVolumeGroupBackupRequest other = (UpdateVolumeGroupBackupRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.volumeGroupBackupId, other.volumeGroupBackupId)
                && java.util.Objects.equals(
                        this.updateVolumeGroupBackupDetails, other.updateVolumeGroupBackupDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
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
                        + (this.updateVolumeGroupBackupDetails == null
                                ? 43
                                : this.updateVolumeGroupBackupDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
