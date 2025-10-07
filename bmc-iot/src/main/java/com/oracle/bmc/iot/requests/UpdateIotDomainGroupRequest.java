/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot.requests;

import com.oracle.bmc.iot.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/iot/UpdateIotDomainGroupExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateIotDomainGroupRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250531")
public class UpdateIotDomainGroupRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.iot.model.UpdateIotDomainGroupDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of an IoT
     * Domain Group.
     */
    private String iotDomainGroupId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of an IoT
     * Domain Group.
     */
    public String getIotDomainGroupId() {
        return iotDomainGroupId;
    }
    /** The IoT domain group details to be updated. */
    private com.oracle.bmc.iot.model.UpdateIotDomainGroupDetails updateIotDomainGroupDetails;

    /** The IoT domain group details to be updated. */
    public com.oracle.bmc.iot.model.UpdateIotDomainGroupDetails getUpdateIotDomainGroupDetails() {
        return updateIotDomainGroupDetails;
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
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
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
    public com.oracle.bmc.iot.model.UpdateIotDomainGroupDetails getBody$() {
        return updateIotDomainGroupDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateIotDomainGroupRequest,
                    com.oracle.bmc.iot.model.UpdateIotDomainGroupDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of an
         * IoT Domain Group.
         */
        private String iotDomainGroupId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of an
         * IoT Domain Group.
         *
         * @param iotDomainGroupId the value to set
         * @return this builder instance
         */
        public Builder iotDomainGroupId(String iotDomainGroupId) {
            this.iotDomainGroupId = iotDomainGroupId;
            return this;
        }

        /** The IoT domain group details to be updated. */
        private com.oracle.bmc.iot.model.UpdateIotDomainGroupDetails updateIotDomainGroupDetails =
                null;

        /**
         * The IoT domain group details to be updated.
         *
         * @param updateIotDomainGroupDetails the value to set
         * @return this builder instance
         */
        public Builder updateIotDomainGroupDetails(
                com.oracle.bmc.iot.model.UpdateIotDomainGroupDetails updateIotDomainGroupDetails) {
            this.updateIotDomainGroupDetails = updateIotDomainGroupDetails;
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
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide the request ID.
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
        public Builder copy(UpdateIotDomainGroupRequest o) {
            iotDomainGroupId(o.getIotDomainGroupId());
            updateIotDomainGroupDetails(o.getUpdateIotDomainGroupDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateIotDomainGroupRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateIotDomainGroupRequest
         */
        public UpdateIotDomainGroupRequest build() {
            UpdateIotDomainGroupRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.iot.model.UpdateIotDomainGroupDetails body) {
            updateIotDomainGroupDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateIotDomainGroupRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateIotDomainGroupRequest
         */
        public UpdateIotDomainGroupRequest buildWithoutInvocationCallback() {
            UpdateIotDomainGroupRequest request = new UpdateIotDomainGroupRequest();
            request.iotDomainGroupId = iotDomainGroupId;
            request.updateIotDomainGroupDetails = updateIotDomainGroupDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateIotDomainGroupRequest(iotDomainGroupId, updateIotDomainGroupDetails,
            // ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .iotDomainGroupId(iotDomainGroupId)
                .updateIotDomainGroupDetails(updateIotDomainGroupDetails)
                .ifMatch(ifMatch)
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
        sb.append(",iotDomainGroupId=").append(String.valueOf(this.iotDomainGroupId));
        sb.append(",updateIotDomainGroupDetails=")
                .append(String.valueOf(this.updateIotDomainGroupDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateIotDomainGroupRequest)) {
            return false;
        }

        UpdateIotDomainGroupRequest other = (UpdateIotDomainGroupRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.iotDomainGroupId, other.iotDomainGroupId)
                && java.util.Objects.equals(
                        this.updateIotDomainGroupDetails, other.updateIotDomainGroupDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.iotDomainGroupId == null ? 43 : this.iotDomainGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateIotDomainGroupDetails == null
                                ? 43
                                : this.updateIotDomainGroupDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
