/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.responses;

import com.oracle.bmc.resourcemanager.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
public class UpdateConfigurationSourceProviderResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For optimistic concurrency control. See {@code if-match}.
     */
    private String etag;

    public String getEtag() {
        return etag;
    }

    /**
     * The returned ConfigurationSourceProvider instance.
     */
    private com.oracle.bmc.resourcemanager.model.ConfigurationSourceProvider
            configurationSourceProvider;

    public com.oracle.bmc.resourcemanager.model.ConfigurationSourceProvider
            getConfigurationSourceProvider() {
        return configurationSourceProvider;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "etag",
        "configurationSourceProvider"
    })
    private UpdateConfigurationSourceProviderResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String etag,
            com.oracle.bmc.resourcemanager.model.ConfigurationSourceProvider
                    configurationSourceProvider) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.configurationSourceProvider = configurationSourceProvider;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String etag;

        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        private com.oracle.bmc.resourcemanager.model.ConfigurationSourceProvider
                configurationSourceProvider;

        public Builder configurationSourceProvider(
                com.oracle.bmc.resourcemanager.model.ConfigurationSourceProvider
                        configurationSourceProvider) {
            this.configurationSourceProvider = configurationSourceProvider;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateConfigurationSourceProviderResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            configurationSourceProvider(o.getConfigurationSourceProvider());

            return this;
        }

        public UpdateConfigurationSourceProviderResponse build() {
            return new UpdateConfigurationSourceProviderResponse(
                    __httpStatusCode__, opcRequestId, etag, configurationSourceProvider);
        }
    }

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
