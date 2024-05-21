/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateExternalAsmInstanceExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateExternalAsmInstanceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class UpdateExternalAsmInstanceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasemanagement.model.UpdateExternalAsmInstanceDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the external ASM instance.
     */
    private String externalAsmInstanceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the external ASM instance.
     */
    public String getExternalAsmInstanceId() {
        return externalAsmInstanceId;
    }
    /**
     * The details required to update an external ASM instance.
     */
    private com.oracle.bmc.databasemanagement.model.UpdateExternalAsmInstanceDetails
            updateExternalAsmInstanceDetails;

    /**
     * The details required to update an external ASM instance.
     */
    public com.oracle.bmc.databasemanagement.model.UpdateExternalAsmInstanceDetails
            getUpdateExternalAsmInstanceDetails() {
        return updateExternalAsmInstanceDetails;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
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
    public com.oracle.bmc.databasemanagement.model.UpdateExternalAsmInstanceDetails getBody$() {
        return updateExternalAsmInstanceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateExternalAsmInstanceRequest,
                    com.oracle.bmc.databasemanagement.model.UpdateExternalAsmInstanceDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the external ASM instance.
         */
        private String externalAsmInstanceId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the external ASM instance.
         * @param externalAsmInstanceId the value to set
         * @return this builder instance
         */
        public Builder externalAsmInstanceId(String externalAsmInstanceId) {
            this.externalAsmInstanceId = externalAsmInstanceId;
            return this;
        }

        /**
         * The details required to update an external ASM instance.
         */
        private com.oracle.bmc.databasemanagement.model.UpdateExternalAsmInstanceDetails
                updateExternalAsmInstanceDetails = null;

        /**
         * The details required to update an external ASM instance.
         * @param updateExternalAsmInstanceDetails the value to set
         * @return this builder instance
         */
        public Builder updateExternalAsmInstanceDetails(
                com.oracle.bmc.databasemanagement.model.UpdateExternalAsmInstanceDetails
                        updateExternalAsmInstanceDetails) {
            this.updateExternalAsmInstanceDetails = updateExternalAsmInstanceDetails;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
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
        public Builder copy(UpdateExternalAsmInstanceRequest o) {
            externalAsmInstanceId(o.getExternalAsmInstanceId());
            updateExternalAsmInstanceDetails(o.getUpdateExternalAsmInstanceDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateExternalAsmInstanceRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateExternalAsmInstanceRequest
         */
        public UpdateExternalAsmInstanceRequest build() {
            UpdateExternalAsmInstanceRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.databasemanagement.model.UpdateExternalAsmInstanceDetails body) {
            updateExternalAsmInstanceDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateExternalAsmInstanceRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateExternalAsmInstanceRequest
         */
        public UpdateExternalAsmInstanceRequest buildWithoutInvocationCallback() {
            UpdateExternalAsmInstanceRequest request = new UpdateExternalAsmInstanceRequest();
            request.externalAsmInstanceId = externalAsmInstanceId;
            request.updateExternalAsmInstanceDetails = updateExternalAsmInstanceDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateExternalAsmInstanceRequest(externalAsmInstanceId, updateExternalAsmInstanceDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .externalAsmInstanceId(externalAsmInstanceId)
                .updateExternalAsmInstanceDetails(updateExternalAsmInstanceDetails)
                .opcRequestId(opcRequestId)
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
        sb.append(",externalAsmInstanceId=").append(String.valueOf(this.externalAsmInstanceId));
        sb.append(",updateExternalAsmInstanceDetails=")
                .append(String.valueOf(this.updateExternalAsmInstanceDetails));
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
        if (!(o instanceof UpdateExternalAsmInstanceRequest)) {
            return false;
        }

        UpdateExternalAsmInstanceRequest other = (UpdateExternalAsmInstanceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.externalAsmInstanceId, other.externalAsmInstanceId)
                && java.util.Objects.equals(
                        this.updateExternalAsmInstanceDetails,
                        other.updateExternalAsmInstanceDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.externalAsmInstanceId == null
                                ? 43
                                : this.externalAsmInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateExternalAsmInstanceDetails == null
                                ? 43
                                : this.updateExternalAsmInstanceDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
