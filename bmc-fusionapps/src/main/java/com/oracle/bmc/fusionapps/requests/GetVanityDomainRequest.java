/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.requests;

import com.oracle.bmc.fusionapps.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/GetVanityDomainExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetVanityDomainRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
public class GetVanityDomainRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * unique FusionEnvironment identifier
     */
    private String fusionEnvironmentId;

    /**
     * unique FusionEnvironment identifier
     */
    public String getFusionEnvironmentId() {
        return fusionEnvironmentId;
    }
    /**
     * The unique identifier (OCID) of the VanityDomain
     */
    private String vanityDomainId;

    /**
     * The unique identifier (OCID) of the VanityDomain
     */
    public String getVanityDomainId() {
        return vanityDomainId;
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
     * A parameter indicating whether to download the Origin Csr or not
     */
    private Boolean doesDownloadOriginCsr;

    /**
     * A parameter indicating whether to download the Origin Csr or not
     */
    public Boolean getDoesDownloadOriginCsr() {
        return doesDownloadOriginCsr;
    }
    /**
     * A parameter indicating whether to download the Akamai Csr or not
     */
    private Boolean doesDownloadAkamaiCsr;

    /**
     * A parameter indicating whether to download the Akamai Csr or not
     */
    public Boolean getDoesDownloadAkamaiCsr() {
        return doesDownloadAkamaiCsr;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetVanityDomainRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * unique FusionEnvironment identifier
         */
        private String fusionEnvironmentId = null;

        /**
         * unique FusionEnvironment identifier
         * @param fusionEnvironmentId the value to set
         * @return this builder instance
         */
        public Builder fusionEnvironmentId(String fusionEnvironmentId) {
            this.fusionEnvironmentId = fusionEnvironmentId;
            return this;
        }

        /**
         * The unique identifier (OCID) of the VanityDomain
         */
        private String vanityDomainId = null;

        /**
         * The unique identifier (OCID) of the VanityDomain
         * @param vanityDomainId the value to set
         * @return this builder instance
         */
        public Builder vanityDomainId(String vanityDomainId) {
            this.vanityDomainId = vanityDomainId;
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
         * A parameter indicating whether to download the Origin Csr or not
         */
        private Boolean doesDownloadOriginCsr = null;

        /**
         * A parameter indicating whether to download the Origin Csr or not
         * @param doesDownloadOriginCsr the value to set
         * @return this builder instance
         */
        public Builder doesDownloadOriginCsr(Boolean doesDownloadOriginCsr) {
            this.doesDownloadOriginCsr = doesDownloadOriginCsr;
            return this;
        }

        /**
         * A parameter indicating whether to download the Akamai Csr or not
         */
        private Boolean doesDownloadAkamaiCsr = null;

        /**
         * A parameter indicating whether to download the Akamai Csr or not
         * @param doesDownloadAkamaiCsr the value to set
         * @return this builder instance
         */
        public Builder doesDownloadAkamaiCsr(Boolean doesDownloadAkamaiCsr) {
            this.doesDownloadAkamaiCsr = doesDownloadAkamaiCsr;
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
        public Builder copy(GetVanityDomainRequest o) {
            fusionEnvironmentId(o.getFusionEnvironmentId());
            vanityDomainId(o.getVanityDomainId());
            opcRequestId(o.getOpcRequestId());
            doesDownloadOriginCsr(o.getDoesDownloadOriginCsr());
            doesDownloadAkamaiCsr(o.getDoesDownloadAkamaiCsr());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetVanityDomainRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetVanityDomainRequest
         */
        public GetVanityDomainRequest build() {
            GetVanityDomainRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetVanityDomainRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetVanityDomainRequest
         */
        public GetVanityDomainRequest buildWithoutInvocationCallback() {
            GetVanityDomainRequest request = new GetVanityDomainRequest();
            request.fusionEnvironmentId = fusionEnvironmentId;
            request.vanityDomainId = vanityDomainId;
            request.opcRequestId = opcRequestId;
            request.doesDownloadOriginCsr = doesDownloadOriginCsr;
            request.doesDownloadAkamaiCsr = doesDownloadAkamaiCsr;
            return request;
            // new GetVanityDomainRequest(fusionEnvironmentId, vanityDomainId, opcRequestId, doesDownloadOriginCsr, doesDownloadAkamaiCsr);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .fusionEnvironmentId(fusionEnvironmentId)
                .vanityDomainId(vanityDomainId)
                .opcRequestId(opcRequestId)
                .doesDownloadOriginCsr(doesDownloadOriginCsr)
                .doesDownloadAkamaiCsr(doesDownloadAkamaiCsr);
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
        sb.append(",fusionEnvironmentId=").append(String.valueOf(this.fusionEnvironmentId));
        sb.append(",vanityDomainId=").append(String.valueOf(this.vanityDomainId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",doesDownloadOriginCsr=").append(String.valueOf(this.doesDownloadOriginCsr));
        sb.append(",doesDownloadAkamaiCsr=").append(String.valueOf(this.doesDownloadAkamaiCsr));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetVanityDomainRequest)) {
            return false;
        }

        GetVanityDomainRequest other = (GetVanityDomainRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.fusionEnvironmentId, other.fusionEnvironmentId)
                && java.util.Objects.equals(this.vanityDomainId, other.vanityDomainId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.doesDownloadOriginCsr, other.doesDownloadOriginCsr)
                && java.util.Objects.equals(
                        this.doesDownloadAkamaiCsr, other.doesDownloadAkamaiCsr);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.fusionEnvironmentId == null
                                ? 43
                                : this.fusionEnvironmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.vanityDomainId == null ? 43 : this.vanityDomainId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.doesDownloadOriginCsr == null
                                ? 43
                                : this.doesDownloadOriginCsr.hashCode());
        result =
                (result * PRIME)
                        + (this.doesDownloadAkamaiCsr == null
                                ? 43
                                : this.doesDownloadAkamaiCsr.hashCode());
        return result;
    }
}
