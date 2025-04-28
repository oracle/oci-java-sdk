/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.responses;

import com.oracle.bmc.resourcemanager.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
public class UpdateConfigurationSourceProviderResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /** Unique identifier for the request. */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** For optimistic concurrency control. See {@code if-match}. */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /** The returned {@code ConfigurationSourceProvider} instance. */
    private com.oracle.bmc.resourcemanager.model.ConfigurationSourceProvider
            configurationSourceProvider;

    /**
     * The returned {@code ConfigurationSourceProvider} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.resourcemanager.model.ConfigurationSourceProvider
            getConfigurationSourceProvider() {
        return configurationSourceProvider;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "etag",
        "configurationSourceProvider"
    })
    private UpdateConfigurationSourceProviderResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String etag,
            com.oracle.bmc.resourcemanager.model.ConfigurationSourceProvider
                    configurationSourceProvider) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.configurationSourceProvider = configurationSourceProvider;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    UpdateConfigurationSourceProviderResponse> {
        private int __httpStatusCode__;

        @Override
        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private java.util.Map<String, java.util.List<String>> headers;

        @Override
        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId;

        /**
         * Unique identifier for the request.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** For optimistic concurrency control. See {@code if-match}. */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /** The returned {@code ConfigurationSourceProvider} instance. */
        private com.oracle.bmc.resourcemanager.model.ConfigurationSourceProvider
                configurationSourceProvider;

        /**
         * The returned {@code ConfigurationSourceProvider} instance.
         *
         * @param configurationSourceProvider the value to set
         * @return this builder
         */
        public Builder configurationSourceProvider(
                com.oracle.bmc.resourcemanager.model.ConfigurationSourceProvider
                        configurationSourceProvider) {
            this.configurationSourceProvider = configurationSourceProvider;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(UpdateConfigurationSourceProviderResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            configurationSourceProvider(o.getConfigurationSourceProvider());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public UpdateConfigurationSourceProviderResponse build() {
            return new UpdateConfigurationSourceProviderResponse(
                    __httpStatusCode__, headers, opcRequestId, etag, configurationSourceProvider);
        }
    }

    /**
     * Return a new builder for this response object.
     *
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",configurationSourceProvider=")
                .append(String.valueOf(configurationSourceProvider));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateConfigurationSourceProviderResponse)) {
            return false;
        }

        UpdateConfigurationSourceProviderResponse other =
                (UpdateConfigurationSourceProviderResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(
                        this.configurationSourceProvider, other.configurationSourceProvider);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.configurationSourceProvider == null
                                ? 43
                                : this.configurationSourceProvider.hashCode());
        return result;
    }
}
