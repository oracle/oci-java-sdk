/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.requests;

import com.oracle.bmc.oda.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/ConfigureDigitalAssistantParametersExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ConfigureDigitalAssistantParametersRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class ConfigureDigitalAssistantParametersRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.oda.model.ConfigureDigitalAssistantParametersDetails> {

    /**
     * Unique Digital Assistant instance identifier.
     */
    private String odaInstanceId;

    /**
     * Unique Digital Assistant instance identifier.
     */
    public String getOdaInstanceId() {
        return odaInstanceId;
    }
    /**
     * The parameter values to use.
     */
    private com.oracle.bmc.oda.model.ConfigureDigitalAssistantParametersDetails
            configureDigitalAssistantParametersDetails;

    /**
     * The parameter values to use.
     */
    public com.oracle.bmc.oda.model.ConfigureDigitalAssistantParametersDetails
            getConfigureDigitalAssistantParametersDetails() {
        return configureDigitalAssistantParametersDetails;
    }
    /**
     * The client request ID for tracing. This value is included in the opc-request-id response header.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing. This value is included in the opc-request-id response header.
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
    public com.oracle.bmc.oda.model.ConfigureDigitalAssistantParametersDetails getBody$() {
        return configureDigitalAssistantParametersDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ConfigureDigitalAssistantParametersRequest,
                    com.oracle.bmc.oda.model.ConfigureDigitalAssistantParametersDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique Digital Assistant instance identifier.
         */
        private String odaInstanceId = null;

        /**
         * Unique Digital Assistant instance identifier.
         * @param odaInstanceId the value to set
         * @return this builder instance
         */
        public Builder odaInstanceId(String odaInstanceId) {
            this.odaInstanceId = odaInstanceId;
            return this;
        }

        /**
         * The parameter values to use.
         */
        private com.oracle.bmc.oda.model.ConfigureDigitalAssistantParametersDetails
                configureDigitalAssistantParametersDetails = null;

        /**
         * The parameter values to use.
         * @param configureDigitalAssistantParametersDetails the value to set
         * @return this builder instance
         */
        public Builder configureDigitalAssistantParametersDetails(
                com.oracle.bmc.oda.model.ConfigureDigitalAssistantParametersDetails
                        configureDigitalAssistantParametersDetails) {
            this.configureDigitalAssistantParametersDetails =
                    configureDigitalAssistantParametersDetails;
            return this;
        }

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response header.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response header.
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
        public Builder copy(ConfigureDigitalAssistantParametersRequest o) {
            odaInstanceId(o.getOdaInstanceId());
            configureDigitalAssistantParametersDetails(
                    o.getConfigureDigitalAssistantParametersDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ConfigureDigitalAssistantParametersRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ConfigureDigitalAssistantParametersRequest
         */
        public ConfigureDigitalAssistantParametersRequest build() {
            ConfigureDigitalAssistantParametersRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.oda.model.ConfigureDigitalAssistantParametersDetails body) {
            configureDigitalAssistantParametersDetails(body);
            return this;
        }

        /**
         * Build the instance of ConfigureDigitalAssistantParametersRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ConfigureDigitalAssistantParametersRequest
         */
        public ConfigureDigitalAssistantParametersRequest buildWithoutInvocationCallback() {
            ConfigureDigitalAssistantParametersRequest request =
                    new ConfigureDigitalAssistantParametersRequest();
            request.odaInstanceId = odaInstanceId;
            request.configureDigitalAssistantParametersDetails =
                    configureDigitalAssistantParametersDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new ConfigureDigitalAssistantParametersRequest(odaInstanceId, configureDigitalAssistantParametersDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .odaInstanceId(odaInstanceId)
                .configureDigitalAssistantParametersDetails(
                        configureDigitalAssistantParametersDetails)
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
        sb.append(",odaInstanceId=").append(String.valueOf(this.odaInstanceId));
        sb.append(",configureDigitalAssistantParametersDetails=")
                .append(String.valueOf(this.configureDigitalAssistantParametersDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfigureDigitalAssistantParametersRequest)) {
            return false;
        }

        ConfigureDigitalAssistantParametersRequest other =
                (ConfigureDigitalAssistantParametersRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.odaInstanceId, other.odaInstanceId)
                && java.util.Objects.equals(
                        this.configureDigitalAssistantParametersDetails,
                        other.configureDigitalAssistantParametersDetails)
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
                        + (this.configureDigitalAssistantParametersDetails == null
                                ? 43
                                : this.configureDigitalAssistantParametersDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
