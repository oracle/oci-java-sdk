/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetFastConnectProviderServiceKeyExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetFastConnectProviderServiceKeyRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetFastConnectProviderServiceKeyRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * provider service.
     */
    private String providerServiceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * provider service.
     */
    public String getProviderServiceId() {
        return providerServiceId;
    }
    /**
     * The provider service key that the provider gives you when you set up a virtual circuit
     * connection from the provider to Oracle Cloud Infrastructure. You can set up that connection
     * and get your provider service key at the provider's website or portal. For the portal
     * location, see the {@code description} attribute of the {@link FastConnectProviderService}.
     */
    private String providerServiceKeyName;

    /**
     * The provider service key that the provider gives you when you set up a virtual circuit
     * connection from the provider to Oracle Cloud Infrastructure. You can set up that connection
     * and get your provider service key at the provider's website or portal. For the portal
     * location, see the {@code description} attribute of the {@link FastConnectProviderService}.
     */
    public String getProviderServiceKeyName() {
        return providerServiceKeyName;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetFastConnectProviderServiceKeyRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * provider service.
         */
        private String providerServiceId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * provider service.
         *
         * @param providerServiceId the value to set
         * @return this builder instance
         */
        public Builder providerServiceId(String providerServiceId) {
            this.providerServiceId = providerServiceId;
            return this;
        }

        /**
         * The provider service key that the provider gives you when you set up a virtual circuit
         * connection from the provider to Oracle Cloud Infrastructure. You can set up that
         * connection and get your provider service key at the provider's website or portal. For the
         * portal location, see the {@code description} attribute of the {@link
         * FastConnectProviderService}.
         */
        private String providerServiceKeyName = null;

        /**
         * The provider service key that the provider gives you when you set up a virtual circuit
         * connection from the provider to Oracle Cloud Infrastructure. You can set up that
         * connection and get your provider service key at the provider's website or portal. For the
         * portal location, see the {@code description} attribute of the {@link
         * FastConnectProviderService}.
         *
         * @param providerServiceKeyName the value to set
         * @return this builder instance
         */
        public Builder providerServiceKeyName(String providerServiceKeyName) {
            this.providerServiceKeyName = providerServiceKeyName;
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
        public Builder copy(GetFastConnectProviderServiceKeyRequest o) {
            providerServiceId(o.getProviderServiceId());
            providerServiceKeyName(o.getProviderServiceKeyName());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetFastConnectProviderServiceKeyRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetFastConnectProviderServiceKeyRequest
         */
        public GetFastConnectProviderServiceKeyRequest build() {
            GetFastConnectProviderServiceKeyRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetFastConnectProviderServiceKeyRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetFastConnectProviderServiceKeyRequest
         */
        public GetFastConnectProviderServiceKeyRequest buildWithoutInvocationCallback() {
            GetFastConnectProviderServiceKeyRequest request =
                    new GetFastConnectProviderServiceKeyRequest();
            request.providerServiceId = providerServiceId;
            request.providerServiceKeyName = providerServiceKeyName;
            return request;
            // new GetFastConnectProviderServiceKeyRequest(providerServiceId,
            // providerServiceKeyName);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .providerServiceId(providerServiceId)
                .providerServiceKeyName(providerServiceKeyName);
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
        sb.append(",providerServiceId=").append(String.valueOf(this.providerServiceId));
        sb.append(",providerServiceKeyName=").append(String.valueOf(this.providerServiceKeyName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetFastConnectProviderServiceKeyRequest)) {
            return false;
        }

        GetFastConnectProviderServiceKeyRequest other = (GetFastConnectProviderServiceKeyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.providerServiceId, other.providerServiceId)
                && java.util.Objects.equals(
                        this.providerServiceKeyName, other.providerServiceKeyName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.providerServiceId == null ? 43 : this.providerServiceId.hashCode());
        result =
                (result * PRIME)
                        + (this.providerServiceKeyName == null
                                ? 43
                                : this.providerServiceKeyName.hashCode());
        return result;
    }
}
