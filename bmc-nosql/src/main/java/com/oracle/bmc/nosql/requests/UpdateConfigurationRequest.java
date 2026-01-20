/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.requests;

import com.oracle.bmc.nosql.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/nosql/UpdateConfigurationExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateConfigurationRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
public class UpdateConfigurationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.nosql.model.UpdateConfigurationDetails> {

    /** The ID of a table's compartment. */
    private String compartmentId;

    /** The ID of a table's compartment. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The configuration details. */
    private com.oracle.bmc.nosql.model.UpdateConfigurationDetails updateConfigurationDetails;

    /** The configuration details. */
    public com.oracle.bmc.nosql.model.UpdateConfigurationDetails getUpdateConfigurationDetails() {
        return updateConfigurationDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
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
     * If true, indicates that the request is a dry run A dry run request does not modify the
     * configuration item details and is used only to perform validation on the submitted data.
     */
    private Boolean isOpcDryRun;

    /**
     * If true, indicates that the request is a dry run A dry run request does not modify the
     * configuration item details and is used only to perform validation on the submitted data.
     */
    public Boolean getIsOpcDryRun() {
        return isOpcDryRun;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.nosql.model.UpdateConfigurationDetails getBody$() {
        return updateConfigurationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateConfigurationRequest,
                    com.oracle.bmc.nosql.model.UpdateConfigurationDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The ID of a table's compartment. */
        private String compartmentId = null;

        /**
         * The ID of a table's compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The configuration details. */
        private com.oracle.bmc.nosql.model.UpdateConfigurationDetails updateConfigurationDetails =
                null;

        /**
         * The configuration details.
         *
         * @param updateConfigurationDetails the value to set
         * @return this builder instance
         */
        public Builder updateConfigurationDetails(
                com.oracle.bmc.nosql.model.UpdateConfigurationDetails updateConfigurationDetails) {
            this.updateConfigurationDetails = updateConfigurationDetails;
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
         * If true, indicates that the request is a dry run A dry run request does not modify the
         * configuration item details and is used only to perform validation on the submitted data.
         */
        private Boolean isOpcDryRun = null;

        /**
         * If true, indicates that the request is a dry run A dry run request does not modify the
         * configuration item details and is used only to perform validation on the submitted data.
         *
         * @param isOpcDryRun the value to set
         * @return this builder instance
         */
        public Builder isOpcDryRun(Boolean isOpcDryRun) {
            this.isOpcDryRun = isOpcDryRun;
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
        public Builder copy(UpdateConfigurationRequest o) {
            compartmentId(o.getCompartmentId());
            updateConfigurationDetails(o.getUpdateConfigurationDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            isOpcDryRun(o.getIsOpcDryRun());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateConfigurationRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateConfigurationRequest
         */
        public UpdateConfigurationRequest build() {
            UpdateConfigurationRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.nosql.model.UpdateConfigurationDetails body) {
            updateConfigurationDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateConfigurationRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateConfigurationRequest
         */
        public UpdateConfigurationRequest buildWithoutInvocationCallback() {
            UpdateConfigurationRequest request = new UpdateConfigurationRequest();
            request.compartmentId = compartmentId;
            request.updateConfigurationDetails = updateConfigurationDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            request.isOpcDryRun = isOpcDryRun;
            return request;
            // new UpdateConfigurationRequest(compartmentId, updateConfigurationDetails,
            // opcRequestId, ifMatch, isOpcDryRun);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .updateConfigurationDetails(updateConfigurationDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch)
                .isOpcDryRun(isOpcDryRun);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",updateConfigurationDetails=")
                .append(String.valueOf(this.updateConfigurationDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",isOpcDryRun=").append(String.valueOf(this.isOpcDryRun));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateConfigurationRequest)) {
            return false;
        }

        UpdateConfigurationRequest other = (UpdateConfigurationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.updateConfigurationDetails, other.updateConfigurationDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.isOpcDryRun, other.isOpcDryRun);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateConfigurationDetails == null
                                ? 43
                                : this.updateConfigurationDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.isOpcDryRun == null ? 43 : this.isOpcDryRun.hashCode());
        return result;
    }
}
