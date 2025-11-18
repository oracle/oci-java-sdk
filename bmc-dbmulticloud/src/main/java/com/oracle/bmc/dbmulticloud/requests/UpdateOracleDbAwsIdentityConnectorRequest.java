/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.requests;

import com.oracle.bmc.dbmulticloud.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dbmulticloud/UpdateOracleDbAwsIdentityConnectorExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateOracleDbAwsIdentityConnectorRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
public class UpdateOracleDbAwsIdentityConnectorRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dbmulticloud.model.UpdateOracleDbAwsIdentityConnectorDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle DB AWS Identity Connector resource.
     */
    private String oracleDbAwsIdentityConnectorId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle DB AWS Identity Connector resource.
     */
    public String getOracleDbAwsIdentityConnectorId() {
        return oracleDbAwsIdentityConnectorId;
    }
    /** Details for to update OracleDbAwsIdentityConnector. */
    private com.oracle.bmc.dbmulticloud.model.UpdateOracleDbAwsIdentityConnectorDetails
            updateOracleDbAwsIdentityConnectorDetails;

    /** Details for to update OracleDbAwsIdentityConnector. */
    public com.oracle.bmc.dbmulticloud.model.UpdateOracleDbAwsIdentityConnectorDetails
            getUpdateOracleDbAwsIdentityConnectorDetails() {
        return updateOracleDbAwsIdentityConnectorDetails;
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
    public com.oracle.bmc.dbmulticloud.model.UpdateOracleDbAwsIdentityConnectorDetails getBody$() {
        return updateOracleDbAwsIdentityConnectorDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateOracleDbAwsIdentityConnectorRequest,
                    com.oracle.bmc.dbmulticloud.model.UpdateOracleDbAwsIdentityConnectorDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle DB AWS Identity Connector resource.
         */
        private String oracleDbAwsIdentityConnectorId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle DB AWS Identity Connector resource.
         *
         * @param oracleDbAwsIdentityConnectorId the value to set
         * @return this builder instance
         */
        public Builder oracleDbAwsIdentityConnectorId(String oracleDbAwsIdentityConnectorId) {
            this.oracleDbAwsIdentityConnectorId = oracleDbAwsIdentityConnectorId;
            return this;
        }

        /** Details for to update OracleDbAwsIdentityConnector. */
        private com.oracle.bmc.dbmulticloud.model.UpdateOracleDbAwsIdentityConnectorDetails
                updateOracleDbAwsIdentityConnectorDetails = null;

        /**
         * Details for to update OracleDbAwsIdentityConnector.
         *
         * @param updateOracleDbAwsIdentityConnectorDetails the value to set
         * @return this builder instance
         */
        public Builder updateOracleDbAwsIdentityConnectorDetails(
                com.oracle.bmc.dbmulticloud.model.UpdateOracleDbAwsIdentityConnectorDetails
                        updateOracleDbAwsIdentityConnectorDetails) {
            this.updateOracleDbAwsIdentityConnectorDetails =
                    updateOracleDbAwsIdentityConnectorDetails;
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
        public Builder copy(UpdateOracleDbAwsIdentityConnectorRequest o) {
            oracleDbAwsIdentityConnectorId(o.getOracleDbAwsIdentityConnectorId());
            updateOracleDbAwsIdentityConnectorDetails(
                    o.getUpdateOracleDbAwsIdentityConnectorDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateOracleDbAwsIdentityConnectorRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateOracleDbAwsIdentityConnectorRequest
         */
        public UpdateOracleDbAwsIdentityConnectorRequest build() {
            UpdateOracleDbAwsIdentityConnectorRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.dbmulticloud.model.UpdateOracleDbAwsIdentityConnectorDetails body) {
            updateOracleDbAwsIdentityConnectorDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateOracleDbAwsIdentityConnectorRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateOracleDbAwsIdentityConnectorRequest
         */
        public UpdateOracleDbAwsIdentityConnectorRequest buildWithoutInvocationCallback() {
            UpdateOracleDbAwsIdentityConnectorRequest request =
                    new UpdateOracleDbAwsIdentityConnectorRequest();
            request.oracleDbAwsIdentityConnectorId = oracleDbAwsIdentityConnectorId;
            request.updateOracleDbAwsIdentityConnectorDetails =
                    updateOracleDbAwsIdentityConnectorDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateOracleDbAwsIdentityConnectorRequest(oracleDbAwsIdentityConnectorId,
            // updateOracleDbAwsIdentityConnectorDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .oracleDbAwsIdentityConnectorId(oracleDbAwsIdentityConnectorId)
                .updateOracleDbAwsIdentityConnectorDetails(
                        updateOracleDbAwsIdentityConnectorDetails)
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
        sb.append(",oracleDbAwsIdentityConnectorId=")
                .append(String.valueOf(this.oracleDbAwsIdentityConnectorId));
        sb.append(",updateOracleDbAwsIdentityConnectorDetails=")
                .append(String.valueOf(this.updateOracleDbAwsIdentityConnectorDetails));
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
        if (!(o instanceof UpdateOracleDbAwsIdentityConnectorRequest)) {
            return false;
        }

        UpdateOracleDbAwsIdentityConnectorRequest other =
                (UpdateOracleDbAwsIdentityConnectorRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.oracleDbAwsIdentityConnectorId, other.oracleDbAwsIdentityConnectorId)
                && java.util.Objects.equals(
                        this.updateOracleDbAwsIdentityConnectorDetails,
                        other.updateOracleDbAwsIdentityConnectorDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.oracleDbAwsIdentityConnectorId == null
                                ? 43
                                : this.oracleDbAwsIdentityConnectorId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateOracleDbAwsIdentityConnectorDetails == null
                                ? 43
                                : this.updateOracleDbAwsIdentityConnectorDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
