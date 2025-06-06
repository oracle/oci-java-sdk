/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.requests;

import com.oracle.bmc.oda.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/ExportDigitalAssistantExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ExportDigitalAssistantRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class ExportDigitalAssistantRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.oda.model.ExportDigitalAssistantDetails> {

    /** Unique Digital Assistant instance identifier. */
    private String odaInstanceId;

    /** Unique Digital Assistant instance identifier. */
    public String getOdaInstanceId() {
        return odaInstanceId;
    }
    /** Unique Digital Assistant identifier. */
    private String digitalAssistantId;

    /** Unique Digital Assistant identifier. */
    public String getDigitalAssistantId() {
        return digitalAssistantId;
    }
    /** Where in Object Storage to export the Digital Assistant to. */
    private com.oracle.bmc.oda.model.ExportDigitalAssistantDetails exportDigitalAssistantDetails;

    /** Where in Object Storage to export the Digital Assistant to. */
    public com.oracle.bmc.oda.model.ExportDigitalAssistantDetails
            getExportDigitalAssistantDetails() {
        return exportDigitalAssistantDetails;
    }
    /**
     * The client request ID for tracing. This value is included in the opc-request-id response
     * header.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing. This value is included in the opc-request-id response
     * header.
     */
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
    public com.oracle.bmc.oda.model.ExportDigitalAssistantDetails getBody$() {
        return exportDigitalAssistantDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ExportDigitalAssistantRequest,
                    com.oracle.bmc.oda.model.ExportDigitalAssistantDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique Digital Assistant instance identifier. */
        private String odaInstanceId = null;

        /**
         * Unique Digital Assistant instance identifier.
         *
         * @param odaInstanceId the value to set
         * @return this builder instance
         */
        public Builder odaInstanceId(String odaInstanceId) {
            this.odaInstanceId = odaInstanceId;
            return this;
        }

        /** Unique Digital Assistant identifier. */
        private String digitalAssistantId = null;

        /**
         * Unique Digital Assistant identifier.
         *
         * @param digitalAssistantId the value to set
         * @return this builder instance
         */
        public Builder digitalAssistantId(String digitalAssistantId) {
            this.digitalAssistantId = digitalAssistantId;
            return this;
        }

        /** Where in Object Storage to export the Digital Assistant to. */
        private com.oracle.bmc.oda.model.ExportDigitalAssistantDetails
                exportDigitalAssistantDetails = null;

        /**
         * Where in Object Storage to export the Digital Assistant to.
         *
         * @param exportDigitalAssistantDetails the value to set
         * @return this builder instance
         */
        public Builder exportDigitalAssistantDetails(
                com.oracle.bmc.oda.model.ExportDigitalAssistantDetails
                        exportDigitalAssistantDetails) {
            this.exportDigitalAssistantDetails = exportDigitalAssistantDetails;
            return this;
        }

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response
         * header.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response
         * header.
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
        public Builder copy(ExportDigitalAssistantRequest o) {
            odaInstanceId(o.getOdaInstanceId());
            digitalAssistantId(o.getDigitalAssistantId());
            exportDigitalAssistantDetails(o.getExportDigitalAssistantDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ExportDigitalAssistantRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ExportDigitalAssistantRequest
         */
        public ExportDigitalAssistantRequest build() {
            ExportDigitalAssistantRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.oda.model.ExportDigitalAssistantDetails body) {
            exportDigitalAssistantDetails(body);
            return this;
        }

        /**
         * Build the instance of ExportDigitalAssistantRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ExportDigitalAssistantRequest
         */
        public ExportDigitalAssistantRequest buildWithoutInvocationCallback() {
            ExportDigitalAssistantRequest request = new ExportDigitalAssistantRequest();
            request.odaInstanceId = odaInstanceId;
            request.digitalAssistantId = digitalAssistantId;
            request.exportDigitalAssistantDetails = exportDigitalAssistantDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new ExportDigitalAssistantRequest(odaInstanceId, digitalAssistantId,
            // exportDigitalAssistantDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .odaInstanceId(odaInstanceId)
                .digitalAssistantId(digitalAssistantId)
                .exportDigitalAssistantDetails(exportDigitalAssistantDetails)
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
        sb.append(",odaInstanceId=").append(String.valueOf(this.odaInstanceId));
        sb.append(",digitalAssistantId=").append(String.valueOf(this.digitalAssistantId));
        sb.append(",exportDigitalAssistantDetails=")
                .append(String.valueOf(this.exportDigitalAssistantDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportDigitalAssistantRequest)) {
            return false;
        }

        ExportDigitalAssistantRequest other = (ExportDigitalAssistantRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.odaInstanceId, other.odaInstanceId)
                && java.util.Objects.equals(this.digitalAssistantId, other.digitalAssistantId)
                && java.util.Objects.equals(
                        this.exportDigitalAssistantDetails, other.exportDigitalAssistantDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.odaInstanceId == null ? 43 : this.odaInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.digitalAssistantId == null
                                ? 43
                                : this.digitalAssistantId.hashCode());
        result =
                (result * PRIME)
                        + (this.exportDigitalAssistantDetails == null
                                ? 43
                                : this.exportDigitalAssistantDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
