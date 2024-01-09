/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateExternalExadataStorageConnectorExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateExternalExadataStorageConnectorRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class UpdateExternalExadataStorageConnectorRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasemanagement.model
                        .UpdateExternalExadataStorageConnectorDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * connector to the Exadata storage server.
     */
    private String externalExadataStorageConnectorId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * connector to the Exadata storage server.
     */
    public String getExternalExadataStorageConnectorId() {
        return externalExadataStorageConnectorId;
    }
    /** The details required to update connections to the Exadata storage servers. */
    private com.oracle.bmc.databasemanagement.model.UpdateExternalExadataStorageConnectorDetails
            updateExternalExadataStorageConnectorDetails;

    /** The details required to update connections to the Exadata storage servers. */
    public com.oracle.bmc.databasemanagement.model.UpdateExternalExadataStorageConnectorDetails
            getUpdateExternalExadataStorageConnectorDetails() {
        return updateExternalExadataStorageConnectorDetails;
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
    public com.oracle.bmc.databasemanagement.model.UpdateExternalExadataStorageConnectorDetails
            getBody$() {
        return updateExternalExadataStorageConnectorDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateExternalExadataStorageConnectorRequest,
                    com.oracle.bmc.databasemanagement.model
                            .UpdateExternalExadataStorageConnectorDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * connector to the Exadata storage server.
         */
        private String externalExadataStorageConnectorId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * connector to the Exadata storage server.
         *
         * @param externalExadataStorageConnectorId the value to set
         * @return this builder instance
         */
        public Builder externalExadataStorageConnectorId(String externalExadataStorageConnectorId) {
            this.externalExadataStorageConnectorId = externalExadataStorageConnectorId;
            return this;
        }

        /** The details required to update connections to the Exadata storage servers. */
        private com.oracle.bmc.databasemanagement.model.UpdateExternalExadataStorageConnectorDetails
                updateExternalExadataStorageConnectorDetails = null;

        /**
         * The details required to update connections to the Exadata storage servers.
         *
         * @param updateExternalExadataStorageConnectorDetails the value to set
         * @return this builder instance
         */
        public Builder updateExternalExadataStorageConnectorDetails(
                com.oracle.bmc.databasemanagement.model.UpdateExternalExadataStorageConnectorDetails
                        updateExternalExadataStorageConnectorDetails) {
            this.updateExternalExadataStorageConnectorDetails =
                    updateExternalExadataStorageConnectorDetails;
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
        public Builder copy(UpdateExternalExadataStorageConnectorRequest o) {
            externalExadataStorageConnectorId(o.getExternalExadataStorageConnectorId());
            updateExternalExadataStorageConnectorDetails(
                    o.getUpdateExternalExadataStorageConnectorDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateExternalExadataStorageConnectorRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateExternalExadataStorageConnectorRequest
         */
        public UpdateExternalExadataStorageConnectorRequest build() {
            UpdateExternalExadataStorageConnectorRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.databasemanagement.model.UpdateExternalExadataStorageConnectorDetails
                        body) {
            updateExternalExadataStorageConnectorDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateExternalExadataStorageConnectorRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateExternalExadataStorageConnectorRequest
         */
        public UpdateExternalExadataStorageConnectorRequest buildWithoutInvocationCallback() {
            UpdateExternalExadataStorageConnectorRequest request =
                    new UpdateExternalExadataStorageConnectorRequest();
            request.externalExadataStorageConnectorId = externalExadataStorageConnectorId;
            request.updateExternalExadataStorageConnectorDetails =
                    updateExternalExadataStorageConnectorDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateExternalExadataStorageConnectorRequest(externalExadataStorageConnectorId,
            // updateExternalExadataStorageConnectorDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .externalExadataStorageConnectorId(externalExadataStorageConnectorId)
                .updateExternalExadataStorageConnectorDetails(
                        updateExternalExadataStorageConnectorDetails)
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
        sb.append(",externalExadataStorageConnectorId=")
                .append(String.valueOf(this.externalExadataStorageConnectorId));
        sb.append(",updateExternalExadataStorageConnectorDetails=")
                .append(String.valueOf(this.updateExternalExadataStorageConnectorDetails));
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
        if (!(o instanceof UpdateExternalExadataStorageConnectorRequest)) {
            return false;
        }

        UpdateExternalExadataStorageConnectorRequest other =
                (UpdateExternalExadataStorageConnectorRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.externalExadataStorageConnectorId,
                        other.externalExadataStorageConnectorId)
                && java.util.Objects.equals(
                        this.updateExternalExadataStorageConnectorDetails,
                        other.updateExternalExadataStorageConnectorDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.externalExadataStorageConnectorId == null
                                ? 43
                                : this.externalExadataStorageConnectorId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateExternalExadataStorageConnectorDetails == null
                                ? 43
                                : this.updateExternalExadataStorageConnectorDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
