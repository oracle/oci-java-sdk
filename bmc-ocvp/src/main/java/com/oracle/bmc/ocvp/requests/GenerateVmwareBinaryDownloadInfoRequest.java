/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.requests;

import com.oracle.bmc.ocvp.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ocvp/GenerateVmwareBinaryDownloadInfoExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GenerateVmwareBinaryDownloadInfoRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
public class GenerateVmwareBinaryDownloadInfoRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.ocvp.model.GenerateVmwareBinaryDownloadInfoDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the SDDC.
     *
     */
    private String sddcId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the SDDC.
     *
     */
    public String getSddcId() {
        return sddcId;
    }
    /**
     * The details for generating VMware Binary download information.
     */
    private com.oracle.bmc.ocvp.model.GenerateVmwareBinaryDownloadInfoDetails
            generateVmwareBinaryDownloadInfoDetails;

    /**
     * The details for generating VMware Binary download information.
     */
    public com.oracle.bmc.ocvp.model.GenerateVmwareBinaryDownloadInfoDetails
            getGenerateVmwareBinaryDownloadInfoDetails() {
        return generateVmwareBinaryDownloadInfoDetails;
    }
    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular
     * request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular
     * request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.ocvp.model.GenerateVmwareBinaryDownloadInfoDetails getBody$() {
        return generateVmwareBinaryDownloadInfoDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GenerateVmwareBinaryDownloadInfoRequest,
                    com.oracle.bmc.ocvp.model.GenerateVmwareBinaryDownloadInfoDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the SDDC.
         *
         */
        private String sddcId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the SDDC.
         *
         * @param sddcId the value to set
         * @return this builder instance
         */
        public Builder sddcId(String sddcId) {
            this.sddcId = sddcId;
            return this;
        }

        /**
         * The details for generating VMware Binary download information.
         */
        private com.oracle.bmc.ocvp.model.GenerateVmwareBinaryDownloadInfoDetails
                generateVmwareBinaryDownloadInfoDetails = null;

        /**
         * The details for generating VMware Binary download information.
         * @param generateVmwareBinaryDownloadInfoDetails the value to set
         * @return this builder instance
         */
        public Builder generateVmwareBinaryDownloadInfoDetails(
                com.oracle.bmc.ocvp.model.GenerateVmwareBinaryDownloadInfoDetails
                        generateVmwareBinaryDownloadInfoDetails) {
            this.generateVmwareBinaryDownloadInfoDetails = generateVmwareBinaryDownloadInfoDetails;
            return this;
        }

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * may be rejected).
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * may be rejected).
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(GenerateVmwareBinaryDownloadInfoRequest o) {
            sddcId(o.getSddcId());
            generateVmwareBinaryDownloadInfoDetails(o.getGenerateVmwareBinaryDownloadInfoDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GenerateVmwareBinaryDownloadInfoRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GenerateVmwareBinaryDownloadInfoRequest
         */
        public GenerateVmwareBinaryDownloadInfoRequest build() {
            GenerateVmwareBinaryDownloadInfoRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.ocvp.model.GenerateVmwareBinaryDownloadInfoDetails body) {
            generateVmwareBinaryDownloadInfoDetails(body);
            return this;
        }

        /**
         * Build the instance of GenerateVmwareBinaryDownloadInfoRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GenerateVmwareBinaryDownloadInfoRequest
         */
        public GenerateVmwareBinaryDownloadInfoRequest buildWithoutInvocationCallback() {
            GenerateVmwareBinaryDownloadInfoRequest request =
                    new GenerateVmwareBinaryDownloadInfoRequest();
            request.sddcId = sddcId;
            request.generateVmwareBinaryDownloadInfoDetails =
                    generateVmwareBinaryDownloadInfoDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new GenerateVmwareBinaryDownloadInfoRequest(sddcId, generateVmwareBinaryDownloadInfoDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .sddcId(sddcId)
                .generateVmwareBinaryDownloadInfoDetails(generateVmwareBinaryDownloadInfoDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",sddcId=").append(String.valueOf(this.sddcId));
        sb.append(",generateVmwareBinaryDownloadInfoDetails=")
                .append(String.valueOf(this.generateVmwareBinaryDownloadInfoDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenerateVmwareBinaryDownloadInfoRequest)) {
            return false;
        }

        GenerateVmwareBinaryDownloadInfoRequest other = (GenerateVmwareBinaryDownloadInfoRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.sddcId, other.sddcId)
                && java.util.Objects.equals(
                        this.generateVmwareBinaryDownloadInfoDetails,
                        other.generateVmwareBinaryDownloadInfoDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.sddcId == null ? 43 : this.sddcId.hashCode());
        result =
                (result * PRIME)
                        + (this.generateVmwareBinaryDownloadInfoDetails == null
                                ? 43
                                : this.generateVmwareBinaryDownloadInfoDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
