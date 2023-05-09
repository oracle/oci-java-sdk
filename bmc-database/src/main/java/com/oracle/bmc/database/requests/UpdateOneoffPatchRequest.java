/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateOneoffPatchExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateOneoffPatchRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateOneoffPatchRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.UpdateOneoffPatchDetails> {

    /**
     * The one-off patch
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String oneoffPatchId;

    /**
     * The one-off patch
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getOneoffPatchId() {
        return oneoffPatchId;
    }
    /** Request to update the properties of a one-off patch. */
    private com.oracle.bmc.database.model.UpdateOneoffPatchDetails updateOneoffPatchDetails;

    /** Request to update the properties of a one-off patch. */
    public com.oracle.bmc.database.model.UpdateOneoffPatchDetails getUpdateOneoffPatchDetails() {
        return updateOneoffPatchDetails;
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
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
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
    public com.oracle.bmc.database.model.UpdateOneoffPatchDetails getBody$() {
        return updateOneoffPatchDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateOneoffPatchRequest,
                    com.oracle.bmc.database.model.UpdateOneoffPatchDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The one-off patch
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String oneoffPatchId = null;

        /**
         * The one-off patch
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param oneoffPatchId the value to set
         * @return this builder instance
         */
        public Builder oneoffPatchId(String oneoffPatchId) {
            this.oneoffPatchId = oneoffPatchId;
            return this;
        }

        /** Request to update the properties of a one-off patch. */
        private com.oracle.bmc.database.model.UpdateOneoffPatchDetails updateOneoffPatchDetails =
                null;

        /**
         * Request to update the properties of a one-off patch.
         *
         * @param updateOneoffPatchDetails the value to set
         * @return this builder instance
         */
        public Builder updateOneoffPatchDetails(
                com.oracle.bmc.database.model.UpdateOneoffPatchDetails updateOneoffPatchDetails) {
            this.updateOneoffPatchDetails = updateOneoffPatchDetails;
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

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(UpdateOneoffPatchRequest o) {
            oneoffPatchId(o.getOneoffPatchId());
            updateOneoffPatchDetails(o.getUpdateOneoffPatchDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateOneoffPatchRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateOneoffPatchRequest
         */
        public UpdateOneoffPatchRequest build() {
            UpdateOneoffPatchRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.database.model.UpdateOneoffPatchDetails body) {
            updateOneoffPatchDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateOneoffPatchRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateOneoffPatchRequest
         */
        public UpdateOneoffPatchRequest buildWithoutInvocationCallback() {
            UpdateOneoffPatchRequest request = new UpdateOneoffPatchRequest();
            request.oneoffPatchId = oneoffPatchId;
            request.updateOneoffPatchDetails = updateOneoffPatchDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateOneoffPatchRequest(oneoffPatchId, updateOneoffPatchDetails, ifMatch,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .oneoffPatchId(oneoffPatchId)
                .updateOneoffPatchDetails(updateOneoffPatchDetails)
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
        sb.append(",oneoffPatchId=").append(String.valueOf(this.oneoffPatchId));
        sb.append(",updateOneoffPatchDetails=")
                .append(String.valueOf(this.updateOneoffPatchDetails));
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
        if (!(o instanceof UpdateOneoffPatchRequest)) {
            return false;
        }

        UpdateOneoffPatchRequest other = (UpdateOneoffPatchRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.oneoffPatchId, other.oneoffPatchId)
                && java.util.Objects.equals(
                        this.updateOneoffPatchDetails, other.updateOneoffPatchDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.oneoffPatchId == null ? 43 : this.oneoffPatchId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateOneoffPatchDetails == null
                                ? 43
                                : this.updateOneoffPatchDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
