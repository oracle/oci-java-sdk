/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.requests;

import com.oracle.bmc.ailanguage.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ailanguage/DetectLanguageEntitiesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * DetectLanguageEntitiesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
public class DetectLanguageEntitiesRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.ailanguage.model.DetectLanguageEntitiesDetails> {

    /** The details to make a Entity detect call. */
    private com.oracle.bmc.ailanguage.model.DetectLanguageEntitiesDetails
            detectLanguageEntitiesDetails;

    /** The details to make a Entity detect call. */
    public com.oracle.bmc.ailanguage.model.DetectLanguageEntitiesDetails
            getDetectLanguageEntitiesDetails() {
        return detectLanguageEntitiesDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Named Entity Recognition model versions. By default user will get output from V2.1
     * implementation.
     */
    private com.oracle.bmc.ailanguage.model.NerModelVersion modelVersion;

    /**
     * Named Entity Recognition model versions. By default user will get output from V2.1
     * implementation.
     */
    public com.oracle.bmc.ailanguage.model.NerModelVersion getModelVersion() {
        return modelVersion;
    }
    /**
     * If this parameter is set to true, you only get PII (Personally identifiable information)
     * entities like PhoneNumber, Email, Person, and so on. Default value is false.
     */
    private Boolean isPii;

    /**
     * If this parameter is set to true, you only get PII (Personally identifiable information)
     * entities like PhoneNumber, Email, Person, and so on. Default value is false.
     */
    public Boolean getIsPii() {
        return isPii;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.ailanguage.model.DetectLanguageEntitiesDetails getBody$() {
        return detectLanguageEntitiesDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DetectLanguageEntitiesRequest,
                    com.oracle.bmc.ailanguage.model.DetectLanguageEntitiesDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The details to make a Entity detect call. */
        private com.oracle.bmc.ailanguage.model.DetectLanguageEntitiesDetails
                detectLanguageEntitiesDetails = null;

        /**
         * The details to make a Entity detect call.
         *
         * @param detectLanguageEntitiesDetails the value to set
         * @return this builder instance
         */
        public Builder detectLanguageEntitiesDetails(
                com.oracle.bmc.ailanguage.model.DetectLanguageEntitiesDetails
                        detectLanguageEntitiesDetails) {
            this.detectLanguageEntitiesDetails = detectLanguageEntitiesDetails;
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
         * Named Entity Recognition model versions. By default user will get output from V2.1
         * implementation.
         */
        private com.oracle.bmc.ailanguage.model.NerModelVersion modelVersion = null;

        /**
         * Named Entity Recognition model versions. By default user will get output from V2.1
         * implementation.
         *
         * @param modelVersion the value to set
         * @return this builder instance
         */
        public Builder modelVersion(com.oracle.bmc.ailanguage.model.NerModelVersion modelVersion) {
            this.modelVersion = modelVersion;
            return this;
        }

        /**
         * If this parameter is set to true, you only get PII (Personally identifiable information)
         * entities like PhoneNumber, Email, Person, and so on. Default value is false.
         */
        private Boolean isPii = null;

        /**
         * If this parameter is set to true, you only get PII (Personally identifiable information)
         * entities like PhoneNumber, Email, Person, and so on. Default value is false.
         *
         * @param isPii the value to set
         * @return this builder instance
         */
        public Builder isPii(Boolean isPii) {
            this.isPii = isPii;
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
        public Builder copy(DetectLanguageEntitiesRequest o) {
            detectLanguageEntitiesDetails(o.getDetectLanguageEntitiesDetails());
            opcRequestId(o.getOpcRequestId());
            modelVersion(o.getModelVersion());
            isPii(o.getIsPii());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DetectLanguageEntitiesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DetectLanguageEntitiesRequest
         */
        public DetectLanguageEntitiesRequest build() {
            DetectLanguageEntitiesRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.ailanguage.model.DetectLanguageEntitiesDetails body) {
            detectLanguageEntitiesDetails(body);
            return this;
        }

        /**
         * Build the instance of DetectLanguageEntitiesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DetectLanguageEntitiesRequest
         */
        public DetectLanguageEntitiesRequest buildWithoutInvocationCallback() {
            DetectLanguageEntitiesRequest request = new DetectLanguageEntitiesRequest();
            request.detectLanguageEntitiesDetails = detectLanguageEntitiesDetails;
            request.opcRequestId = opcRequestId;
            request.modelVersion = modelVersion;
            request.isPii = isPii;
            return request;
            // new DetectLanguageEntitiesRequest(detectLanguageEntitiesDetails, opcRequestId,
            // modelVersion, isPii);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .detectLanguageEntitiesDetails(detectLanguageEntitiesDetails)
                .opcRequestId(opcRequestId)
                .modelVersion(modelVersion)
                .isPii(isPii);
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
        sb.append(",detectLanguageEntitiesDetails=")
                .append(String.valueOf(this.detectLanguageEntitiesDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(",isPii=").append(String.valueOf(this.isPii));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetectLanguageEntitiesRequest)) {
            return false;
        }

        DetectLanguageEntitiesRequest other = (DetectLanguageEntitiesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.detectLanguageEntitiesDetails, other.detectLanguageEntitiesDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.isPii, other.isPii);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.detectLanguageEntitiesDetails == null
                                ? 43
                                : this.detectLanguageEntitiesDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.isPii == null ? 43 : this.isPii.hashCode());
        return result;
    }
}
