/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateSensitiveTypesExportExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateSensitiveTypesExportRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class UpdateSensitiveTypesExportRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.UpdateSensitiveTypesExportDetails> {

    /**
     * The OCID of the sensitive types export.
     */
    private String sensitiveTypesExportId;

    /**
     * The OCID of the sensitive types export.
     */
    public String getSensitiveTypesExportId() {
        return sensitiveTypesExportId;
    }
    /**
     * Details to update a sensitive type.
     */
    private com.oracle.bmc.datasafe.model.UpdateSensitiveTypesExportDetails
            updateSensitiveTypesExportDetails;

    /**
     * Details to update a sensitive type.
     */
    public com.oracle.bmc.datasafe.model.UpdateSensitiveTypesExportDetails
            getUpdateSensitiveTypesExportDetails() {
        return updateSensitiveTypesExportDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the if-match parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the if-match parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
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
    public com.oracle.bmc.datasafe.model.UpdateSensitiveTypesExportDetails getBody$() {
        return updateSensitiveTypesExportDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateSensitiveTypesExportRequest,
                    com.oracle.bmc.datasafe.model.UpdateSensitiveTypesExportDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the sensitive types export.
         */
        private String sensitiveTypesExportId = null;

        /**
         * The OCID of the sensitive types export.
         * @param sensitiveTypesExportId the value to set
         * @return this builder instance
         */
        public Builder sensitiveTypesExportId(String sensitiveTypesExportId) {
            this.sensitiveTypesExportId = sensitiveTypesExportId;
            return this;
        }

        /**
         * Details to update a sensitive type.
         */
        private com.oracle.bmc.datasafe.model.UpdateSensitiveTypesExportDetails
                updateSensitiveTypesExportDetails = null;

        /**
         * Details to update a sensitive type.
         * @param updateSensitiveTypesExportDetails the value to set
         * @return this builder instance
         */
        public Builder updateSensitiveTypesExportDetails(
                com.oracle.bmc.datasafe.model.UpdateSensitiveTypesExportDetails
                        updateSensitiveTypesExportDetails) {
            this.updateSensitiveTypesExportDetails = updateSensitiveTypesExportDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the if-match parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the if-match parameter to the value of the
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
         * Unique identifier for the request.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(UpdateSensitiveTypesExportRequest o) {
            sensitiveTypesExportId(o.getSensitiveTypesExportId());
            updateSensitiveTypesExportDetails(o.getUpdateSensitiveTypesExportDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateSensitiveTypesExportRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateSensitiveTypesExportRequest
         */
        public UpdateSensitiveTypesExportRequest build() {
            UpdateSensitiveTypesExportRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datasafe.model.UpdateSensitiveTypesExportDetails body) {
            updateSensitiveTypesExportDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateSensitiveTypesExportRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateSensitiveTypesExportRequest
         */
        public UpdateSensitiveTypesExportRequest buildWithoutInvocationCallback() {
            UpdateSensitiveTypesExportRequest request = new UpdateSensitiveTypesExportRequest();
            request.sensitiveTypesExportId = sensitiveTypesExportId;
            request.updateSensitiveTypesExportDetails = updateSensitiveTypesExportDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateSensitiveTypesExportRequest(sensitiveTypesExportId, updateSensitiveTypesExportDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .sensitiveTypesExportId(sensitiveTypesExportId)
                .updateSensitiveTypesExportDetails(updateSensitiveTypesExportDetails)
                .ifMatch(ifMatch)
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
        sb.append(",sensitiveTypesExportId=").append(String.valueOf(this.sensitiveTypesExportId));
        sb.append(",updateSensitiveTypesExportDetails=")
                .append(String.valueOf(this.updateSensitiveTypesExportDetails));
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
        if (!(o instanceof UpdateSensitiveTypesExportRequest)) {
            return false;
        }

        UpdateSensitiveTypesExportRequest other = (UpdateSensitiveTypesExportRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.sensitiveTypesExportId, other.sensitiveTypesExportId)
                && java.util.Objects.equals(
                        this.updateSensitiveTypesExportDetails,
                        other.updateSensitiveTypesExportDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.sensitiveTypesExportId == null
                                ? 43
                                : this.sensitiveTypesExportId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateSensitiveTypesExportDetails == null
                                ? 43
                                : this.updateSensitiveTypesExportDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
