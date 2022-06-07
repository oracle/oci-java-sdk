/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateVolumeGroupExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateVolumeGroupRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateVolumeGroupRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.UpdateVolumeGroupDetails> {

    /**
     * The Oracle Cloud ID (OCID) that uniquely identifies the volume group.
     */
    private String volumeGroupId;

    public String getVolumeGroupId() {
        return volumeGroupId;
    }
    /**
     * Update volume group's set of volumes and/or display name
     */
    private com.oracle.bmc.core.model.UpdateVolumeGroupDetails updateVolumeGroupDetails;

    public com.oracle.bmc.core.model.UpdateVolumeGroupDetails getUpdateVolumeGroupDetails() {
        return updateVolumeGroupDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource. The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Specifies whether to disable or preserve the individual volume replication when removing a volume from the
     * replication enabled volume group. When set to {@code true}, the individual volume replica is preserved. The default
     * value is {@code true}.
     *
     */
    private Boolean preserveVolumeReplica;

    public Boolean getPreserveVolumeReplica() {
        return preserveVolumeReplica;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.UpdateVolumeGroupDetails getBody$() {
        return updateVolumeGroupDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateVolumeGroupRequest, com.oracle.bmc.core.model.UpdateVolumeGroupDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String volumeGroupId = null;

        /**
         * The Oracle Cloud ID (OCID) that uniquely identifies the volume group.
         * @return this builder instance
         */
        public Builder volumeGroupId(String volumeGroupId) {
            this.volumeGroupId = volumeGroupId;
            return this;
        }

        private com.oracle.bmc.core.model.UpdateVolumeGroupDetails updateVolumeGroupDetails = null;

        /**
         * Update volume group's set of volumes and/or display name
         * @return this builder instance
         */
        public Builder updateVolumeGroupDetails(
                com.oracle.bmc.core.model.UpdateVolumeGroupDetails updateVolumeGroupDetails) {
            this.updateVolumeGroupDetails = updateVolumeGroupDetails;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource. The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        private Boolean preserveVolumeReplica = null;

        /**
         * Specifies whether to disable or preserve the individual volume replication when removing a volume from the
         * replication enabled volume group. When set to {@code true}, the individual volume replica is preserved. The default
         * value is {@code true}.
         *
         * @return this builder instance
         */
        public Builder preserveVolumeReplica(Boolean preserveVolumeReplica) {
            this.preserveVolumeReplica = preserveVolumeReplica;
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
        public Builder copy(UpdateVolumeGroupRequest o) {
            volumeGroupId(o.getVolumeGroupId());
            updateVolumeGroupDetails(o.getUpdateVolumeGroupDetails());
            ifMatch(o.getIfMatch());
            preserveVolumeReplica(o.getPreserveVolumeReplica());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateVolumeGroupRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateVolumeGroupRequest
         */
        public UpdateVolumeGroupRequest build() {
            UpdateVolumeGroupRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.UpdateVolumeGroupDetails body) {
            updateVolumeGroupDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateVolumeGroupRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateVolumeGroupRequest
         */
        public UpdateVolumeGroupRequest buildWithoutInvocationCallback() {
            UpdateVolumeGroupRequest request = new UpdateVolumeGroupRequest();
            request.volumeGroupId = volumeGroupId;
            request.updateVolumeGroupDetails = updateVolumeGroupDetails;
            request.ifMatch = ifMatch;
            request.preserveVolumeReplica = preserveVolumeReplica;
            return request;
            // new UpdateVolumeGroupRequest(volumeGroupId, updateVolumeGroupDetails, ifMatch, preserveVolumeReplica);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .volumeGroupId(volumeGroupId)
                .updateVolumeGroupDetails(updateVolumeGroupDetails)
                .ifMatch(ifMatch)
                .preserveVolumeReplica(preserveVolumeReplica);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",volumeGroupId=").append(String.valueOf(this.volumeGroupId));
        sb.append(",updateVolumeGroupDetails=")
                .append(String.valueOf(this.updateVolumeGroupDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",preserveVolumeReplica=").append(String.valueOf(this.preserveVolumeReplica));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateVolumeGroupRequest)) {
            return false;
        }

        UpdateVolumeGroupRequest other = (UpdateVolumeGroupRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.volumeGroupId, other.volumeGroupId)
                && java.util.Objects.equals(
                        this.updateVolumeGroupDetails, other.updateVolumeGroupDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(
                        this.preserveVolumeReplica, other.preserveVolumeReplica);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.volumeGroupId == null ? 43 : this.volumeGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateVolumeGroupDetails == null
                                ? 43
                                : this.updateVolumeGroupDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.preserveVolumeReplica == null
                                ? 43
                                : this.preserveVolumeReplica.hashCode());
        return result;
    }
}
