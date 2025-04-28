/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsjavadownloads.requests;

import com.oracle.bmc.jmsjavadownloads.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jmsjavadownloads/UpdateJavaLicenseAcceptanceRecordExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateJavaLicenseAcceptanceRecordRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230601")
public class UpdateJavaLicenseAcceptanceRecordRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.jmsjavadownloads.model.UpdateJavaLicenseAcceptanceRecordDetails> {

    /** Unique Java license acceptance record identifier. */
    private String javaLicenseAcceptanceRecordId;

    /** Unique Java license acceptance record identifier. */
    public String getJavaLicenseAcceptanceRecordId() {
        return javaLicenseAcceptanceRecordId;
    }
    /** Attributes for updating the JavaLicenseAcceptanceRecord. */
    private com.oracle.bmc.jmsjavadownloads.model.UpdateJavaLicenseAcceptanceRecordDetails
            updateJavaLicenseAcceptanceRecordDetails;

    /** Attributes for updating the JavaLicenseAcceptanceRecord. */
    public com.oracle.bmc.jmsjavadownloads.model.UpdateJavaLicenseAcceptanceRecordDetails
            getUpdateJavaLicenseAcceptanceRecordDetails() {
        return updateJavaLicenseAcceptanceRecordDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the ETag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the ETag you provide matches the
     * resource's current ETag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the ETag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the ETag you provide matches the
     * resource's current ETag value.
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
    public com.oracle.bmc.jmsjavadownloads.model.UpdateJavaLicenseAcceptanceRecordDetails
            getBody$() {
        return updateJavaLicenseAcceptanceRecordDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateJavaLicenseAcceptanceRecordRequest,
                    com.oracle.bmc.jmsjavadownloads.model
                            .UpdateJavaLicenseAcceptanceRecordDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique Java license acceptance record identifier. */
        private String javaLicenseAcceptanceRecordId = null;

        /**
         * Unique Java license acceptance record identifier.
         *
         * @param javaLicenseAcceptanceRecordId the value to set
         * @return this builder instance
         */
        public Builder javaLicenseAcceptanceRecordId(String javaLicenseAcceptanceRecordId) {
            this.javaLicenseAcceptanceRecordId = javaLicenseAcceptanceRecordId;
            return this;
        }

        /** Attributes for updating the JavaLicenseAcceptanceRecord. */
        private com.oracle.bmc.jmsjavadownloads.model.UpdateJavaLicenseAcceptanceRecordDetails
                updateJavaLicenseAcceptanceRecordDetails = null;

        /**
         * Attributes for updating the JavaLicenseAcceptanceRecord.
         *
         * @param updateJavaLicenseAcceptanceRecordDetails the value to set
         * @return this builder instance
         */
        public Builder updateJavaLicenseAcceptanceRecordDetails(
                com.oracle.bmc.jmsjavadownloads.model.UpdateJavaLicenseAcceptanceRecordDetails
                        updateJavaLicenseAcceptanceRecordDetails) {
            this.updateJavaLicenseAcceptanceRecordDetails =
                    updateJavaLicenseAcceptanceRecordDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the ETag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the ETag you provide
         * matches the resource's current ETag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the ETag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the ETag you provide
         * matches the resource's current ETag value.
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
        public Builder copy(UpdateJavaLicenseAcceptanceRecordRequest o) {
            javaLicenseAcceptanceRecordId(o.getJavaLicenseAcceptanceRecordId());
            updateJavaLicenseAcceptanceRecordDetails(
                    o.getUpdateJavaLicenseAcceptanceRecordDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateJavaLicenseAcceptanceRecordRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateJavaLicenseAcceptanceRecordRequest
         */
        public UpdateJavaLicenseAcceptanceRecordRequest build() {
            UpdateJavaLicenseAcceptanceRecordRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.jmsjavadownloads.model.UpdateJavaLicenseAcceptanceRecordDetails
                        body) {
            updateJavaLicenseAcceptanceRecordDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateJavaLicenseAcceptanceRecordRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateJavaLicenseAcceptanceRecordRequest
         */
        public UpdateJavaLicenseAcceptanceRecordRequest buildWithoutInvocationCallback() {
            UpdateJavaLicenseAcceptanceRecordRequest request =
                    new UpdateJavaLicenseAcceptanceRecordRequest();
            request.javaLicenseAcceptanceRecordId = javaLicenseAcceptanceRecordId;
            request.updateJavaLicenseAcceptanceRecordDetails =
                    updateJavaLicenseAcceptanceRecordDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateJavaLicenseAcceptanceRecordRequest(javaLicenseAcceptanceRecordId,
            // updateJavaLicenseAcceptanceRecordDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .javaLicenseAcceptanceRecordId(javaLicenseAcceptanceRecordId)
                .updateJavaLicenseAcceptanceRecordDetails(updateJavaLicenseAcceptanceRecordDetails)
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
        sb.append(",javaLicenseAcceptanceRecordId=")
                .append(String.valueOf(this.javaLicenseAcceptanceRecordId));
        sb.append(",updateJavaLicenseAcceptanceRecordDetails=")
                .append(String.valueOf(this.updateJavaLicenseAcceptanceRecordDetails));
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
        if (!(o instanceof UpdateJavaLicenseAcceptanceRecordRequest)) {
            return false;
        }

        UpdateJavaLicenseAcceptanceRecordRequest other =
                (UpdateJavaLicenseAcceptanceRecordRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.javaLicenseAcceptanceRecordId, other.javaLicenseAcceptanceRecordId)
                && java.util.Objects.equals(
                        this.updateJavaLicenseAcceptanceRecordDetails,
                        other.updateJavaLicenseAcceptanceRecordDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.javaLicenseAcceptanceRecordId == null
                                ? 43
                                : this.javaLicenseAcceptanceRecordId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateJavaLicenseAcceptanceRecordDetails == null
                                ? 43
                                : this.updateJavaLicenseAcceptanceRecordDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
