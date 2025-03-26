/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.requests;

import com.oracle.bmc.datascience.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/UpdateDataSciencePrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateDataSciencePrivateEndpointRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class UpdateDataSciencePrivateEndpointRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datascience.model.UpdateDataSciencePrivateEndpointDetails> {

    /**
     * The unique ID for a Data Science private endpoint.
     *
     */
    private String dataSciencePrivateEndpointId;

    /**
     * The unique ID for a Data Science private endpoint.
     *
     */
    public String getDataSciencePrivateEndpointId() {
        return dataSciencePrivateEndpointId;
    }
    /**
     * Details for updating a private endpoint.
     *
     */
    private com.oracle.bmc.datascience.model.UpdateDataSciencePrivateEndpointDetails
            updateDataSciencePrivateEndpointDetails;

    /**
     * Details for updating a private endpoint.
     *
     */
    public com.oracle.bmc.datascience.model.UpdateDataSciencePrivateEndpointDetails
            getUpdateDataSciencePrivateEndpointDetails() {
        return updateDataSciencePrivateEndpointDetails;
    }
    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a particular request, then provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a particular request, then provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource is updated or deleted only if the {@code etag} you
     * provide matches the resource's current {@code etag} value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource is updated or deleted only if the {@code etag} you
     * provide matches the resource's current {@code etag} value.
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
    public com.oracle.bmc.datascience.model.UpdateDataSciencePrivateEndpointDetails getBody$() {
        return updateDataSciencePrivateEndpointDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateDataSciencePrivateEndpointRequest,
                    com.oracle.bmc.datascience.model.UpdateDataSciencePrivateEndpointDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The unique ID for a Data Science private endpoint.
         *
         */
        private String dataSciencePrivateEndpointId = null;

        /**
         * The unique ID for a Data Science private endpoint.
         *
         * @param dataSciencePrivateEndpointId the value to set
         * @return this builder instance
         */
        public Builder dataSciencePrivateEndpointId(String dataSciencePrivateEndpointId) {
            this.dataSciencePrivateEndpointId = dataSciencePrivateEndpointId;
            return this;
        }

        /**
         * Details for updating a private endpoint.
         *
         */
        private com.oracle.bmc.datascience.model.UpdateDataSciencePrivateEndpointDetails
                updateDataSciencePrivateEndpointDetails = null;

        /**
         * Details for updating a private endpoint.
         *
         * @param updateDataSciencePrivateEndpointDetails the value to set
         * @return this builder instance
         */
        public Builder updateDataSciencePrivateEndpointDetails(
                com.oracle.bmc.datascience.model.UpdateDataSciencePrivateEndpointDetails
                        updateDataSciencePrivateEndpointDetails) {
            this.updateDataSciencePrivateEndpointDetails = updateDataSciencePrivateEndpointDetails;
            return this;
        }

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a particular request, then provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a particular request, then provide the request ID.
         *
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
         * The resource is updated or deleted only if the {@code etag} you
         * provide matches the resource's current {@code etag} value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource is updated or deleted only if the {@code etag} you
         * provide matches the resource's current {@code etag} value.
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
        public Builder copy(UpdateDataSciencePrivateEndpointRequest o) {
            dataSciencePrivateEndpointId(o.getDataSciencePrivateEndpointId());
            updateDataSciencePrivateEndpointDetails(o.getUpdateDataSciencePrivateEndpointDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateDataSciencePrivateEndpointRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateDataSciencePrivateEndpointRequest
         */
        public UpdateDataSciencePrivateEndpointRequest build() {
            UpdateDataSciencePrivateEndpointRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.datascience.model.UpdateDataSciencePrivateEndpointDetails body) {
            updateDataSciencePrivateEndpointDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateDataSciencePrivateEndpointRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateDataSciencePrivateEndpointRequest
         */
        public UpdateDataSciencePrivateEndpointRequest buildWithoutInvocationCallback() {
            UpdateDataSciencePrivateEndpointRequest request =
                    new UpdateDataSciencePrivateEndpointRequest();
            request.dataSciencePrivateEndpointId = dataSciencePrivateEndpointId;
            request.updateDataSciencePrivateEndpointDetails =
                    updateDataSciencePrivateEndpointDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateDataSciencePrivateEndpointRequest(dataSciencePrivateEndpointId, updateDataSciencePrivateEndpointDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .dataSciencePrivateEndpointId(dataSciencePrivateEndpointId)
                .updateDataSciencePrivateEndpointDetails(updateDataSciencePrivateEndpointDetails)
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
        sb.append(",dataSciencePrivateEndpointId=")
                .append(String.valueOf(this.dataSciencePrivateEndpointId));
        sb.append(",updateDataSciencePrivateEndpointDetails=")
                .append(String.valueOf(this.updateDataSciencePrivateEndpointDetails));
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
        if (!(o instanceof UpdateDataSciencePrivateEndpointRequest)) {
            return false;
        }

        UpdateDataSciencePrivateEndpointRequest other = (UpdateDataSciencePrivateEndpointRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.dataSciencePrivateEndpointId, other.dataSciencePrivateEndpointId)
                && java.util.Objects.equals(
                        this.updateDataSciencePrivateEndpointDetails,
                        other.updateDataSciencePrivateEndpointDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.dataSciencePrivateEndpointId == null
                                ? 43
                                : this.dataSciencePrivateEndpointId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateDataSciencePrivateEndpointDetails == null
                                ? 43
                                : this.updateDataSciencePrivateEndpointDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
