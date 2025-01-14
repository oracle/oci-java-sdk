/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/UpdateOpsiConfigurationExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateOpsiConfigurationRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class UpdateOpsiConfigurationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.opsi.model.UpdateOpsiConfigurationDetails> {

    /**
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of OPSI
     * configuration resource.
     */
    private String opsiConfigurationId;

    /**
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of OPSI
     * configuration resource.
     */
    public String getOpsiConfigurationId() {
        return opsiConfigurationId;
    }
    /** The OPSI configuration resource details to be updated. */
    private com.oracle.bmc.opsi.model.UpdateOpsiConfigurationDetails updateOpsiConfigurationDetails;

    /** The OPSI configuration resource details to be updated. */
    public com.oracle.bmc.opsi.model.UpdateOpsiConfigurationDetails
            getUpdateOpsiConfigurationDetails() {
        return updateOpsiConfigurationDetails;
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
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
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
    public com.oracle.bmc.opsi.model.UpdateOpsiConfigurationDetails getBody$() {
        return updateOpsiConfigurationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateOpsiConfigurationRequest,
                    com.oracle.bmc.opsi.model.UpdateOpsiConfigurationDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * OPSI configuration resource.
         */
        private String opsiConfigurationId = null;

        /**
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * OPSI configuration resource.
         *
         * @param opsiConfigurationId the value to set
         * @return this builder instance
         */
        public Builder opsiConfigurationId(String opsiConfigurationId) {
            this.opsiConfigurationId = opsiConfigurationId;
            return this;
        }

        /** The OPSI configuration resource details to be updated. */
        private com.oracle.bmc.opsi.model.UpdateOpsiConfigurationDetails
                updateOpsiConfigurationDetails = null;

        /**
         * The OPSI configuration resource details to be updated.
         *
         * @param updateOpsiConfigurationDetails the value to set
         * @return this builder instance
         */
        public Builder updateOpsiConfigurationDetails(
                com.oracle.bmc.opsi.model.UpdateOpsiConfigurationDetails
                        updateOpsiConfigurationDetails) {
            this.updateOpsiConfigurationDetails = updateOpsiConfigurationDetails;
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

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
        public Builder copy(UpdateOpsiConfigurationRequest o) {
            opsiConfigurationId(o.getOpsiConfigurationId());
            updateOpsiConfigurationDetails(o.getUpdateOpsiConfigurationDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateOpsiConfigurationRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateOpsiConfigurationRequest
         */
        public UpdateOpsiConfigurationRequest build() {
            UpdateOpsiConfigurationRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.opsi.model.UpdateOpsiConfigurationDetails body) {
            updateOpsiConfigurationDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateOpsiConfigurationRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateOpsiConfigurationRequest
         */
        public UpdateOpsiConfigurationRequest buildWithoutInvocationCallback() {
            UpdateOpsiConfigurationRequest request = new UpdateOpsiConfigurationRequest();
            request.opsiConfigurationId = opsiConfigurationId;
            request.updateOpsiConfigurationDetails = updateOpsiConfigurationDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateOpsiConfigurationRequest(opsiConfigurationId,
            // updateOpsiConfigurationDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .opsiConfigurationId(opsiConfigurationId)
                .updateOpsiConfigurationDetails(updateOpsiConfigurationDetails)
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
        sb.append(",opsiConfigurationId=").append(String.valueOf(this.opsiConfigurationId));
        sb.append(",updateOpsiConfigurationDetails=")
                .append(String.valueOf(this.updateOpsiConfigurationDetails));
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
        if (!(o instanceof UpdateOpsiConfigurationRequest)) {
            return false;
        }

        UpdateOpsiConfigurationRequest other = (UpdateOpsiConfigurationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opsiConfigurationId, other.opsiConfigurationId)
                && java.util.Objects.equals(
                        this.updateOpsiConfigurationDetails, other.updateOpsiConfigurationDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.opsiConfigurationId == null
                                ? 43
                                : this.opsiConfigurationId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateOpsiConfigurationDetails == null
                                ? 43
                                : this.updateOpsiConfigurationDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
