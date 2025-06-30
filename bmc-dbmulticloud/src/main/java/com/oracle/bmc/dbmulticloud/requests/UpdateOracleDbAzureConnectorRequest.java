/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.requests;

import com.oracle.bmc.dbmulticloud.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dbmulticloud/UpdateOracleDbAzureConnectorExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateOracleDbAzureConnectorRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
public class UpdateOracleDbAzureConnectorRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dbmulticloud.model.UpdateOracleDbAzureConnectorDetails> {

    /** The ID of the Oracle DB Azure Connector Resource. */
    private String oracleDbAzureConnectorId;

    /** The ID of the Oracle DB Azure Connector Resource. */
    public String getOracleDbAzureConnectorId() {
        return oracleDbAzureConnectorId;
    }
    /** Details for to update Oracle DB Azure Connector Resource. */
    private com.oracle.bmc.dbmulticloud.model.UpdateOracleDbAzureConnectorDetails
            updateOracleDbAzureConnectorDetails;

    /** Details for to update Oracle DB Azure Connector Resource. */
    public com.oracle.bmc.dbmulticloud.model.UpdateOracleDbAzureConnectorDetails
            getUpdateOracleDbAzureConnectorDetails() {
        return updateOracleDbAzureConnectorDetails;
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
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
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
    public com.oracle.bmc.dbmulticloud.model.UpdateOracleDbAzureConnectorDetails getBody$() {
        return updateOracleDbAzureConnectorDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateOracleDbAzureConnectorRequest,
                    com.oracle.bmc.dbmulticloud.model.UpdateOracleDbAzureConnectorDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The ID of the Oracle DB Azure Connector Resource. */
        private String oracleDbAzureConnectorId = null;

        /**
         * The ID of the Oracle DB Azure Connector Resource.
         *
         * @param oracleDbAzureConnectorId the value to set
         * @return this builder instance
         */
        public Builder oracleDbAzureConnectorId(String oracleDbAzureConnectorId) {
            this.oracleDbAzureConnectorId = oracleDbAzureConnectorId;
            return this;
        }

        /** Details for to update Oracle DB Azure Connector Resource. */
        private com.oracle.bmc.dbmulticloud.model.UpdateOracleDbAzureConnectorDetails
                updateOracleDbAzureConnectorDetails = null;

        /**
         * Details for to update Oracle DB Azure Connector Resource.
         *
         * @param updateOracleDbAzureConnectorDetails the value to set
         * @return this builder instance
         */
        public Builder updateOracleDbAzureConnectorDetails(
                com.oracle.bmc.dbmulticloud.model.UpdateOracleDbAzureConnectorDetails
                        updateOracleDbAzureConnectorDetails) {
            this.updateOracleDbAzureConnectorDetails = updateOracleDbAzureConnectorDetails;
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

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(UpdateOracleDbAzureConnectorRequest o) {
            oracleDbAzureConnectorId(o.getOracleDbAzureConnectorId());
            updateOracleDbAzureConnectorDetails(o.getUpdateOracleDbAzureConnectorDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateOracleDbAzureConnectorRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateOracleDbAzureConnectorRequest
         */
        public UpdateOracleDbAzureConnectorRequest build() {
            UpdateOracleDbAzureConnectorRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.dbmulticloud.model.UpdateOracleDbAzureConnectorDetails body) {
            updateOracleDbAzureConnectorDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateOracleDbAzureConnectorRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateOracleDbAzureConnectorRequest
         */
        public UpdateOracleDbAzureConnectorRequest buildWithoutInvocationCallback() {
            UpdateOracleDbAzureConnectorRequest request = new UpdateOracleDbAzureConnectorRequest();
            request.oracleDbAzureConnectorId = oracleDbAzureConnectorId;
            request.updateOracleDbAzureConnectorDetails = updateOracleDbAzureConnectorDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateOracleDbAzureConnectorRequest(oracleDbAzureConnectorId,
            // updateOracleDbAzureConnectorDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .oracleDbAzureConnectorId(oracleDbAzureConnectorId)
                .updateOracleDbAzureConnectorDetails(updateOracleDbAzureConnectorDetails)
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
        sb.append(",oracleDbAzureConnectorId=")
                .append(String.valueOf(this.oracleDbAzureConnectorId));
        sb.append(",updateOracleDbAzureConnectorDetails=")
                .append(String.valueOf(this.updateOracleDbAzureConnectorDetails));
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
        if (!(o instanceof UpdateOracleDbAzureConnectorRequest)) {
            return false;
        }

        UpdateOracleDbAzureConnectorRequest other = (UpdateOracleDbAzureConnectorRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.oracleDbAzureConnectorId, other.oracleDbAzureConnectorId)
                && java.util.Objects.equals(
                        this.updateOracleDbAzureConnectorDetails,
                        other.updateOracleDbAzureConnectorDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.oracleDbAzureConnectorId == null
                                ? 43
                                : this.oracleDbAzureConnectorId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateOracleDbAzureConnectorDetails == null
                                ? 43
                                : this.updateOracleDbAzureConnectorDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
