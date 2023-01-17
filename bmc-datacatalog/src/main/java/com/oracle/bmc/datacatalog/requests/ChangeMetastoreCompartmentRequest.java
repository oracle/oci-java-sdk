/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ChangeMetastoreCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeMetastoreCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class ChangeMetastoreCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datacatalog.model.ChangeMetastoreCompartmentDetails> {

    /**
     * Information about a change in metastore compartment.
     */
    private com.oracle.bmc.datacatalog.model.ChangeMetastoreCompartmentDetails
            changeMetastoreCompartmentDetails;

    /**
     * Information about a change in metastore compartment.
     */
    public com.oracle.bmc.datacatalog.model.ChangeMetastoreCompartmentDetails
            getChangeMetastoreCompartmentDetails() {
        return changeMetastoreCompartmentDetails;
    }
    /**
     * The metastore's OCID.
     */
    private String metastoreId;

    /**
     * The metastore's OCID.
     */
    public String getMetastoreId() {
        return metastoreId;
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
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.datacatalog.model.ChangeMetastoreCompartmentDetails getBody$() {
        return changeMetastoreCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeMetastoreCompartmentRequest,
                    com.oracle.bmc.datacatalog.model.ChangeMetastoreCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Information about a change in metastore compartment.
         */
        private com.oracle.bmc.datacatalog.model.ChangeMetastoreCompartmentDetails
                changeMetastoreCompartmentDetails = null;

        /**
         * Information about a change in metastore compartment.
         * @param changeMetastoreCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeMetastoreCompartmentDetails(
                com.oracle.bmc.datacatalog.model.ChangeMetastoreCompartmentDetails
                        changeMetastoreCompartmentDetails) {
            this.changeMetastoreCompartmentDetails = changeMetastoreCompartmentDetails;
            return this;
        }

        /**
         * The metastore's OCID.
         */
        private String metastoreId = null;

        /**
         * The metastore's OCID.
         * @param metastoreId the value to set
         * @return this builder instance
         */
        public Builder metastoreId(String metastoreId) {
            this.metastoreId = metastoreId;
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
        public Builder copy(ChangeMetastoreCompartmentRequest o) {
            changeMetastoreCompartmentDetails(o.getChangeMetastoreCompartmentDetails());
            metastoreId(o.getMetastoreId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeMetastoreCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeMetastoreCompartmentRequest
         */
        public ChangeMetastoreCompartmentRequest build() {
            ChangeMetastoreCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.datacatalog.model.ChangeMetastoreCompartmentDetails body) {
            changeMetastoreCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeMetastoreCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeMetastoreCompartmentRequest
         */
        public ChangeMetastoreCompartmentRequest buildWithoutInvocationCallback() {
            ChangeMetastoreCompartmentRequest request = new ChangeMetastoreCompartmentRequest();
            request.changeMetastoreCompartmentDetails = changeMetastoreCompartmentDetails;
            request.metastoreId = metastoreId;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeMetastoreCompartmentRequest(changeMetastoreCompartmentDetails, metastoreId, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .changeMetastoreCompartmentDetails(changeMetastoreCompartmentDetails)
                .metastoreId(metastoreId)
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
        sb.append(",changeMetastoreCompartmentDetails=")
                .append(String.valueOf(this.changeMetastoreCompartmentDetails));
        sb.append(",metastoreId=").append(String.valueOf(this.metastoreId));
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
        if (!(o instanceof ChangeMetastoreCompartmentRequest)) {
            return false;
        }

        ChangeMetastoreCompartmentRequest other = (ChangeMetastoreCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.changeMetastoreCompartmentDetails,
                        other.changeMetastoreCompartmentDetails)
                && java.util.Objects.equals(this.metastoreId, other.metastoreId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.changeMetastoreCompartmentDetails == null
                                ? 43
                                : this.changeMetastoreCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.metastoreId == null ? 43 : this.metastoreId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
